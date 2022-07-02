/*
 * generated by Xtext 2.27.0
 */
grammar InternalTQL;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package nl.tue.gtl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package nl.tue.gtl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import nl.tue.gtl.services.TQLGrammarAccess;

}

@parser::members {

 	private TQLGrammarAccess grammarAccess;

    public InternalTQLParser(TokenStream input, TQLGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "BinaryOperationExpression";
   	}

   	@Override
   	protected TQLGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleBinaryOperationExpression
entryRuleBinaryOperationExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBinaryOperationExpressionRule()); }
	iv_ruleBinaryOperationExpression=ruleBinaryOperationExpression
	{ $current=$iv_ruleBinaryOperationExpression.current; }
	EOF;

// Rule BinaryOperationExpression
ruleBinaryOperationExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='BinaryOperationExpression'
		{
			newLeafNode(otherlv_0, grammarAccess.getBinaryOperationExpressionAccess().getBinaryOperationExpressionKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getBinaryOperationExpressionAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			otherlv_2='operation'
			{
				newLeafNode(otherlv_2, grammarAccess.getBinaryOperationExpressionAccess().getOperationKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getBinaryOperationExpressionAccess().getOperationBinaryFunctionEnumRuleCall_2_1_0());
					}
					lv_operation_3_0=ruleBinaryFunction
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getBinaryOperationExpressionRule());
						}
						set(
							$current,
							"operation",
							lv_operation_3_0,
							"nl.tue.gtl.TQL.BinaryFunction");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_4='left'
		{
			newLeafNode(otherlv_4, grammarAccess.getBinaryOperationExpressionAccess().getLeftKeyword_3());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBinaryOperationExpressionRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getBinaryOperationExpressionAccess().getLeftExpressionCrossReference_4_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6='right'
		{
			newLeafNode(otherlv_6, grammarAccess.getBinaryOperationExpressionAccess().getRightKeyword_5());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBinaryOperationExpressionRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getBinaryOperationExpressionAccess().getRightExpressionCrossReference_6_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getBinaryOperationExpressionAccess().getRightCurlyBracketKeyword_7());
		}
	)
;

// Entry rule entryRuleparameterExpression
entryRuleparameterExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getParameterExpressionRule()); }
	iv_ruleparameterExpression=ruleparameterExpression
	{ $current=$iv_ruleparameterExpression.current; }
	EOF;

// Rule parameterExpression
ruleparameterExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getParameterExpressionAccess().getParameterExpressionAction_0(),
					$current);
			}
		)
		otherlv_1='parameterExpression'
		{
			newLeafNode(otherlv_1, grammarAccess.getParameterExpressionAccess().getParameterExpressionKeyword_1());
		}
	)
;

// Entry rule entryRuleStringConstantExpression
entryRuleStringConstantExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStringConstantExpressionRule()); }
	iv_ruleStringConstantExpression=ruleStringConstantExpression
	{ $current=$iv_ruleStringConstantExpression.current; }
	EOF;

// Rule StringConstantExpression
ruleStringConstantExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='StringConstantExpression'
		{
			newLeafNode(otherlv_0, grammarAccess.getStringConstantExpressionAccess().getStringConstantExpressionKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getStringConstantExpressionAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='value'
		{
			newLeafNode(otherlv_2, grammarAccess.getStringConstantExpressionAccess().getValueKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getStringConstantExpressionAccess().getValueEStringParserRuleCall_3_0());
				}
				lv_value_3_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStringConstantExpressionRule());
					}
					set(
						$current,
						"value",
						lv_value_3_0,
						"nl.tue.gtl.TQL.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getStringConstantExpressionAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleBooleanConstantExpression
entryRuleBooleanConstantExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBooleanConstantExpressionRule()); }
	iv_ruleBooleanConstantExpression=ruleBooleanConstantExpression
	{ $current=$iv_ruleBooleanConstantExpression.current; }
	EOF;

// Rule BooleanConstantExpression
ruleBooleanConstantExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_value_0_0='value'
				{
					newLeafNode(lv_value_0_0, grammarAccess.getBooleanConstantExpressionAccess().getValueValueKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBooleanConstantExpressionRule());
					}
					setWithLastConsumed($current, "value", lv_value_0_0 != null, "value");
				}
			)
		)
		otherlv_1='BooleanConstantExpression'
		{
			newLeafNode(otherlv_1, grammarAccess.getBooleanConstantExpressionAccess().getBooleanConstantExpressionKeyword_1());
		}
	)
;

// Entry rule entryRuleIntegerConstantExpression
entryRuleIntegerConstantExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIntegerConstantExpressionRule()); }
	iv_ruleIntegerConstantExpression=ruleIntegerConstantExpression
	{ $current=$iv_ruleIntegerConstantExpression.current; }
	EOF;

// Rule IntegerConstantExpression
ruleIntegerConstantExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='IntegerConstantExpression'
		{
			newLeafNode(otherlv_0, grammarAccess.getIntegerConstantExpressionAccess().getIntegerConstantExpressionKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getIntegerConstantExpressionAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='value'
		{
			newLeafNode(otherlv_2, grammarAccess.getIntegerConstantExpressionAccess().getValueKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getIntegerConstantExpressionAccess().getValueEIntParserRuleCall_3_0());
				}
				lv_value_3_0=ruleEInt
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIntegerConstantExpressionRule());
					}
					set(
						$current,
						"value",
						lv_value_3_0,
						"nl.tue.gtl.TQL.EInt");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getIntegerConstantExpressionAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleInExpression
entryRuleInExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInExpressionRule()); }
	iv_ruleInExpression=ruleInExpression
	{ $current=$iv_ruleInExpression.current; }
	EOF;

// Rule InExpression
ruleInExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='InExpression'
		{
			newLeafNode(otherlv_0, grammarAccess.getInExpressionAccess().getInExpressionKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getInExpressionAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			otherlv_2='statement'
			{
				newLeafNode(otherlv_2, grammarAccess.getInExpressionAccess().getStatementKeyword_2_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getInExpressionRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getInExpressionAccess().getStatementExpressionCrossReference_2_1_0());
					}
					ruleEString
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_4='constantSet'
		{
			newLeafNode(otherlv_4, grammarAccess.getInExpressionAccess().getConstantSetKeyword_3());
		}
		otherlv_5='('
		{
			newLeafNode(otherlv_5, grammarAccess.getInExpressionAccess().getLeftParenthesisKeyword_4());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInExpressionRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getInExpressionAccess().getConstantSetConstantExpressionCrossReference_5_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_7=','
			{
				newLeafNode(otherlv_7, grammarAccess.getInExpressionAccess().getCommaKeyword_6_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getInExpressionRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getInExpressionAccess().getConstantSetConstantExpressionCrossReference_6_1_0());
					}
					ruleEString
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_9=')'
		{
			newLeafNode(otherlv_9, grammarAccess.getInExpressionAccess().getRightParenthesisKeyword_7());
		}
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getInExpressionAccess().getRightCurlyBracketKeyword_8());
		}
	)
;

// Entry rule entryRuleParseExpression
entryRuleParseExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getParseExpressionRule()); }
	iv_ruleParseExpression=ruleParseExpression
	{ $current=$iv_ruleParseExpression.current; }
	EOF;

// Rule ParseExpression
ruleParseExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='ParseExpression'
		{
			newLeafNode(otherlv_0, grammarAccess.getParseExpressionAccess().getParseExpressionKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getParseExpressionAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			otherlv_2='outputType'
			{
				newLeafNode(otherlv_2, grammarAccess.getParseExpressionAccess().getOutputTypeKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getParseExpressionAccess().getOutputTypeTypeEnumRuleCall_2_1_0());
					}
					lv_outputType_3_0=ruleType
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getParseExpressionRule());
						}
						set(
							$current,
							"outputType",
							lv_outputType_3_0,
							"nl.tue.gtl.TQL.Type");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_4='expression'
		{
			newLeafNode(otherlv_4, grammarAccess.getParseExpressionAccess().getExpressionKeyword_3());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getParseExpressionRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getParseExpressionAccess().getExpressionExpressionCrossReference_4_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getParseExpressionAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleFloatConstantExpression
entryRuleFloatConstantExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFloatConstantExpressionRule()); }
	iv_ruleFloatConstantExpression=ruleFloatConstantExpression
	{ $current=$iv_ruleFloatConstantExpression.current; }
	EOF;

// Rule FloatConstantExpression
ruleFloatConstantExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='FloatConstantExpression'
		{
			newLeafNode(otherlv_0, grammarAccess.getFloatConstantExpressionAccess().getFloatConstantExpressionKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getFloatConstantExpressionAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='value'
		{
			newLeafNode(otherlv_2, grammarAccess.getFloatConstantExpressionAccess().getValueKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFloatConstantExpressionAccess().getValueEFloatParserRuleCall_3_0());
				}
				lv_value_3_0=ruleEFloat
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFloatConstantExpressionRule());
					}
					set(
						$current,
						"value",
						lv_value_3_0,
						"nl.tue.gtl.TQL.EFloat");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getFloatConstantExpressionAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleEInt
entryRuleEInt returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEIntRule()); }
	iv_ruleEInt=ruleEInt
	{ $current=$iv_ruleEInt.current.getText(); }
	EOF;

// Rule EInt
ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			kw='-'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
			}
		)?
		this_INT_1=RULE_INT
		{
			$current.merge(this_INT_1);
		}
		{
			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleEFloat
entryRuleEFloat returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEFloatRule()); }
	iv_ruleEFloat=ruleEFloat
	{ $current=$iv_ruleEFloat.current.getText(); }
	EOF;

// Rule EFloat
ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			kw='-'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0());
			}
		)?
		(
			this_INT_1=RULE_INT
			{
				$current.merge(this_INT_1);
			}
			{
				newLeafNode(this_INT_1, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1());
			}
		)?
		kw='.'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_2());
		}
		this_INT_3=RULE_INT
		{
			$current.merge(this_INT_3);
		}
		{
			newLeafNode(this_INT_3, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3());
		}
		(
			(
				kw='E'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_0());
				}
				    |
				kw='e'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_1());
				}
			)
			(
				kw='-'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1());
				}
			)?
			this_INT_7=RULE_INT
			{
				$current.merge(this_INT_7);
			}
			{
				newLeafNode(this_INT_7, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2());
			}
		)?
	)
;

// Rule BinaryFunction
ruleBinaryFunction returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='mult'
			{
				$current = grammarAccess.getBinaryFunctionAccess().getMultEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getBinaryFunctionAccess().getMultEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='sum'
			{
				$current = grammarAccess.getBinaryFunctionAccess().getSumEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getBinaryFunctionAccess().getSumEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='divide'
			{
				$current = grammarAccess.getBinaryFunctionAccess().getDivideEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getBinaryFunctionAccess().getDivideEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='concat'
			{
				$current = grammarAccess.getBinaryFunctionAccess().getConcatEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getBinaryFunctionAccess().getConcatEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='equal'
			{
				$current = grammarAccess.getBinaryFunctionAccess().getEqualEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getBinaryFunctionAccess().getEqualEnumLiteralDeclaration_4());
			}
		)
		    |
		(
			enumLiteral_5='notequal'
			{
				$current = grammarAccess.getBinaryFunctionAccess().getNotequalEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_5, grammarAccess.getBinaryFunctionAccess().getNotequalEnumLiteralDeclaration_5());
			}
		)
		    |
		(
			enumLiteral_6='smaller'
			{
				$current = grammarAccess.getBinaryFunctionAccess().getSmallerEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_6, grammarAccess.getBinaryFunctionAccess().getSmallerEnumLiteralDeclaration_6());
			}
		)
		    |
		(
			enumLiteral_7='greater'
			{
				$current = grammarAccess.getBinaryFunctionAccess().getGreaterEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_7, grammarAccess.getBinaryFunctionAccess().getGreaterEnumLiteralDeclaration_7());
			}
		)
		    |
		(
			enumLiteral_8='or'
			{
				$current = grammarAccess.getBinaryFunctionAccess().getOrEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_8, grammarAccess.getBinaryFunctionAccess().getOrEnumLiteralDeclaration_8());
			}
		)
		    |
		(
			enumLiteral_9='and'
			{
				$current = grammarAccess.getBinaryFunctionAccess().getAndEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_9, grammarAccess.getBinaryFunctionAccess().getAndEnumLiteralDeclaration_9());
			}
		)
	)
;

// Rule Type
ruleType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='string'
			{
				$current = grammarAccess.getTypeAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getStringEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='integer'
			{
				$current = grammarAccess.getTypeAccess().getIntegerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getIntegerEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='floats'
			{
				$current = grammarAccess.getTypeAccess().getFloatsEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getTypeAccess().getFloatsEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='sets'
			{
				$current = grammarAccess.getTypeAccess().getSetsEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getTypeAccess().getSetsEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='DateTime'
			{
				$current = grammarAccess.getTypeAccess().getDateTimeEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getTypeAccess().getDateTimeEnumLiteralDeclaration_4());
			}
		)
		    |
		(
			enumLiteral_5='Null'
			{
				$current = grammarAccess.getTypeAccess().getNullEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_5, grammarAccess.getTypeAccess().getNullEnumLiteralDeclaration_5());
			}
		)
		    |
		(
			enumLiteral_6='bool'
			{
				$current = grammarAccess.getTypeAccess().getBoolEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_6, grammarAccess.getTypeAccess().getBoolEnumLiteralDeclaration_6());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
