package org.jsonclipse.ui.outline;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider;
import org.eclipse.xtext.ui.editor.outline.impl.DocumentRootNode;
import org.jsonclipse.json.Model;
import org.jsonclipse.json.ObjectProperty;
import org.jsonclipse.json.Value;

public class JsonOutlineTreeProvider extends DefaultOutlineTreeProvider {

    @Override
    protected void _createChildren(DocumentRootNode parentNode, EObject modelElement) {
        if (modelElement instanceof Model) {
            Value rootValue = ((Model) modelElement).getRoot();
            if (rootValue != null) {
                createNode(parentNode, rootValue);
            }
        } else {
            super._createChildren(parentNode, modelElement);
        }
    }

    @Override
    protected void _createChildren(IOutlineNode parentNode, EObject modelElement) {
        if (modelElement instanceof Value) {
            Value value = (Value) modelElement;
            createChildren(parentNode, value);
        } else if (modelElement instanceof ObjectProperty) {
            ObjectProperty prop = (ObjectProperty) modelElement;
            createChildren(parentNode, prop.getPropValue());
        } else {
            super._createChildren(parentNode, modelElement);
        }
    }

    private void createChildren(IOutlineNode parentNode, Value propValue) {
        if (propValue.getObjectValue() != null) {
            for (ObjectProperty child : propValue.getObjectValue().getProperties()) {
                if (hasOutline(child.getPropValue())) {
                    createNode(parentNode, child);
                }
            }
        } else if (propValue.getArrayValue() != null) {
            for (Value val : propValue.getArrayValue().getElements()) {
                if (val.getObjectValue() != null) {
                    createNode(parentNode, val);
                }
            }
        }
    }

    private boolean hasOutline(Value childValue) {
        return childValue != null && (childValue.getObjectValue() != null || childValue.getArrayValue() != null);
    }

    @Override
    protected boolean _isLeaf(EObject modelElement) {
        if (modelElement instanceof Value) {
            Value value = (Value) modelElement;

            if (value.getObjectValue() != null) {
                for (ObjectProperty child : value.getObjectValue().getProperties()) {
                    if (hasOutline(child.getPropValue())) {
                        return false;
                    }
                }
                return true;
            } else if (value.getArrayValue() != null) {
                return value.getArrayValue().getElements().isEmpty();
            } else {
                return true;
            }
        } else if (modelElement instanceof ObjectProperty) {
            ObjectProperty prop = (ObjectProperty) modelElement;
            return _isLeaf(prop.getPropValue());
        } else {
            return super._isLeaf(modelElement);
        }
    }
}
