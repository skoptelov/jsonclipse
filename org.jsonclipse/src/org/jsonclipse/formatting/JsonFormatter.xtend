/*
 * generated by Xtext
 */
package org.jsonclipse.formatting

import com.google.inject.Inject
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter
import org.eclipse.xtext.formatting.impl.FormattingConfig
import org.jsonclipse.services.JsonGrammarAccess

// import com.google.inject.Inject;
// import org.jsonclipse.services.JsonGrammarAccess

/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#formatting
 * on how and when to use it 
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an example
 */
class JsonFormatter extends AbstractDeclarativeFormatter {

	@Inject extension JsonGrammarAccess
	
	override protected void configureFormatting(FormattingConfig c) {
	    c.setAutoLinewrap(120);
        c.setSpace("  ");

        c.setIndentationIncrement().after(OBJECT_STARTRule);
        c.setIndentationDecrement().before(OBJECT_ENDRule);

        c.setIndentationIncrement().after(ARRAY_STARTRule);
        c.setIndentationDecrement().before(ARRAY_ENDRule);
        
        c.setNoSpace().before(VALUE_SEPRule);
        c.setNoSpace().before(NAME_SEPRule);

        c.setLinewrap().after(OBJECT_STARTRule);
        c.setLinewrap().before(OBJECT_ENDRule);
	    c.setLinewrap().after(ARRAY_STARTRule);
        c.setLinewrap().before(ARRAY_ENDRule);
        c.setLinewrap().after(VALUE_SEPRule);
// It's usually a good idea to activate the following three statements.
// They will add and preserve newlines around comments
//		c.setLinewrap(0, 1, 2).before(SL_COMMENTRule)
//		c.setLinewrap(0, 1, 2).before(ML_COMMENTRule)
//		c.setLinewrap(0, 1, 1).after(ML_COMMENTRule)
	}
}
