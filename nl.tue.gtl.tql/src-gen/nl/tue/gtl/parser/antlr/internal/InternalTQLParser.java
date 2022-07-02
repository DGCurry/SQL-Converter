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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTQLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'BinaryOperationExpression'", "'{'", "'operation'", "'left'", "'right'", "'}'", "'parameterExpression'", "'StringConstantExpression'", "'value'", "'BooleanConstantExpression'", "'IntegerConstantExpression'", "'InExpression'", "'statement'", "'constantSet'", "'('", "','", "')'", "'ParseExpression'", "'outputType'", "'expression'", "'FloatConstantExpression'", "'-'", "'.'", "'E'", "'e'", "'mult'", "'sum'", "'divide'", "'concat'", "'equal'", "'notequal'", "'smaller'", "'greater'", "'or'", "'and'", "'string'", "'integer'", "'floats'", "'sets'", "'DateTime'", "'Null'", "'bool'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalTQLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTQLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTQLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTQL.g"; }



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




    // $ANTLR start "entryRuleBinaryOperationExpression"
    // InternalTQL.g:65:1: entryRuleBinaryOperationExpression returns [EObject current=null] : iv_ruleBinaryOperationExpression= ruleBinaryOperationExpression EOF ;
    public final EObject entryRuleBinaryOperationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryOperationExpression = null;


        try {
            // InternalTQL.g:65:66: (iv_ruleBinaryOperationExpression= ruleBinaryOperationExpression EOF )
            // InternalTQL.g:66:2: iv_ruleBinaryOperationExpression= ruleBinaryOperationExpression EOF
            {
             newCompositeNode(grammarAccess.getBinaryOperationExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinaryOperationExpression=ruleBinaryOperationExpression();

            state._fsp--;

             current =iv_ruleBinaryOperationExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBinaryOperationExpression"


    // $ANTLR start "ruleBinaryOperationExpression"
    // InternalTQL.g:72:1: ruleBinaryOperationExpression returns [EObject current=null] : (otherlv_0= 'BinaryOperationExpression' otherlv_1= '{' (otherlv_2= 'operation' ( (lv_operation_3_0= ruleBinaryFunction ) ) )? otherlv_4= 'left' ( ( ruleEString ) ) otherlv_6= 'right' ( ( ruleEString ) ) otherlv_8= '}' ) ;
    public final EObject ruleBinaryOperationExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Enumerator lv_operation_3_0 = null;



        	enterRule();

        try {
            // InternalTQL.g:78:2: ( (otherlv_0= 'BinaryOperationExpression' otherlv_1= '{' (otherlv_2= 'operation' ( (lv_operation_3_0= ruleBinaryFunction ) ) )? otherlv_4= 'left' ( ( ruleEString ) ) otherlv_6= 'right' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalTQL.g:79:2: (otherlv_0= 'BinaryOperationExpression' otherlv_1= '{' (otherlv_2= 'operation' ( (lv_operation_3_0= ruleBinaryFunction ) ) )? otherlv_4= 'left' ( ( ruleEString ) ) otherlv_6= 'right' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalTQL.g:79:2: (otherlv_0= 'BinaryOperationExpression' otherlv_1= '{' (otherlv_2= 'operation' ( (lv_operation_3_0= ruleBinaryFunction ) ) )? otherlv_4= 'left' ( ( ruleEString ) ) otherlv_6= 'right' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalTQL.g:80:3: otherlv_0= 'BinaryOperationExpression' otherlv_1= '{' (otherlv_2= 'operation' ( (lv_operation_3_0= ruleBinaryFunction ) ) )? otherlv_4= 'left' ( ( ruleEString ) ) otherlv_6= 'right' ( ( ruleEString ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBinaryOperationExpressionAccess().getBinaryOperationExpressionKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getBinaryOperationExpressionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalTQL.g:88:3: (otherlv_2= 'operation' ( (lv_operation_3_0= ruleBinaryFunction ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalTQL.g:89:4: otherlv_2= 'operation' ( (lv_operation_3_0= ruleBinaryFunction ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getBinaryOperationExpressionAccess().getOperationKeyword_2_0());
                    			
                    // InternalTQL.g:93:4: ( (lv_operation_3_0= ruleBinaryFunction ) )
                    // InternalTQL.g:94:5: (lv_operation_3_0= ruleBinaryFunction )
                    {
                    // InternalTQL.g:94:5: (lv_operation_3_0= ruleBinaryFunction )
                    // InternalTQL.g:95:6: lv_operation_3_0= ruleBinaryFunction
                    {

                    						newCompositeNode(grammarAccess.getBinaryOperationExpressionAccess().getOperationBinaryFunctionEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_operation_3_0=ruleBinaryFunction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBinaryOperationExpressionRule());
                    						}
                    						set(
                    							current,
                    							"operation",
                    							lv_operation_3_0,
                    							"nl.tue.gtl.TQL.BinaryFunction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getBinaryOperationExpressionAccess().getLeftKeyword_3());
            		
            // InternalTQL.g:117:3: ( ( ruleEString ) )
            // InternalTQL.g:118:4: ( ruleEString )
            {
            // InternalTQL.g:118:4: ( ruleEString )
            // InternalTQL.g:119:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBinaryOperationExpressionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getBinaryOperationExpressionAccess().getLeftExpressionCrossReference_4_0());
            				
            pushFollow(FOLLOW_8);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getBinaryOperationExpressionAccess().getRightKeyword_5());
            		
            // InternalTQL.g:137:3: ( ( ruleEString ) )
            // InternalTQL.g:138:4: ( ruleEString )
            {
            // InternalTQL.g:138:4: ( ruleEString )
            // InternalTQL.g:139:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBinaryOperationExpressionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getBinaryOperationExpressionAccess().getRightExpressionCrossReference_6_0());
            				
            pushFollow(FOLLOW_9);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getBinaryOperationExpressionAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinaryOperationExpression"


    // $ANTLR start "entryRuleparameterExpression"
    // InternalTQL.g:161:1: entryRuleparameterExpression returns [EObject current=null] : iv_ruleparameterExpression= ruleparameterExpression EOF ;
    public final EObject entryRuleparameterExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleparameterExpression = null;


        try {
            // InternalTQL.g:161:60: (iv_ruleparameterExpression= ruleparameterExpression EOF )
            // InternalTQL.g:162:2: iv_ruleparameterExpression= ruleparameterExpression EOF
            {
             newCompositeNode(grammarAccess.getParameterExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleparameterExpression=ruleparameterExpression();

            state._fsp--;

             current =iv_ruleparameterExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleparameterExpression"


    // $ANTLR start "ruleparameterExpression"
    // InternalTQL.g:168:1: ruleparameterExpression returns [EObject current=null] : ( () otherlv_1= 'parameterExpression' ) ;
    public final EObject ruleparameterExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTQL.g:174:2: ( ( () otherlv_1= 'parameterExpression' ) )
            // InternalTQL.g:175:2: ( () otherlv_1= 'parameterExpression' )
            {
            // InternalTQL.g:175:2: ( () otherlv_1= 'parameterExpression' )
            // InternalTQL.g:176:3: () otherlv_1= 'parameterExpression'
            {
            // InternalTQL.g:176:3: ()
            // InternalTQL.g:177:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterExpressionAccess().getParameterExpressionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterExpressionAccess().getParameterExpressionKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleparameterExpression"


    // $ANTLR start "entryRuleStringConstantExpression"
    // InternalTQL.g:191:1: entryRuleStringConstantExpression returns [EObject current=null] : iv_ruleStringConstantExpression= ruleStringConstantExpression EOF ;
    public final EObject entryRuleStringConstantExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringConstantExpression = null;


        try {
            // InternalTQL.g:191:65: (iv_ruleStringConstantExpression= ruleStringConstantExpression EOF )
            // InternalTQL.g:192:2: iv_ruleStringConstantExpression= ruleStringConstantExpression EOF
            {
             newCompositeNode(grammarAccess.getStringConstantExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringConstantExpression=ruleStringConstantExpression();

            state._fsp--;

             current =iv_ruleStringConstantExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringConstantExpression"


    // $ANTLR start "ruleStringConstantExpression"
    // InternalTQL.g:198:1: ruleStringConstantExpression returns [EObject current=null] : (otherlv_0= 'StringConstantExpression' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleStringConstantExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalTQL.g:204:2: ( (otherlv_0= 'StringConstantExpression' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}' ) )
            // InternalTQL.g:205:2: (otherlv_0= 'StringConstantExpression' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}' )
            {
            // InternalTQL.g:205:2: (otherlv_0= 'StringConstantExpression' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}' )
            // InternalTQL.g:206:3: otherlv_0= 'StringConstantExpression' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStringConstantExpressionAccess().getStringConstantExpressionKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getStringConstantExpressionAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getStringConstantExpressionAccess().getValueKeyword_2());
            		
            // InternalTQL.g:218:3: ( (lv_value_3_0= ruleEString ) )
            // InternalTQL.g:219:4: (lv_value_3_0= ruleEString )
            {
            // InternalTQL.g:219:4: (lv_value_3_0= ruleEString )
            // InternalTQL.g:220:5: lv_value_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStringConstantExpressionAccess().getValueEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
            lv_value_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStringConstantExpressionRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"nl.tue.gtl.TQL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getStringConstantExpressionAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringConstantExpression"


    // $ANTLR start "entryRuleBooleanConstantExpression"
    // InternalTQL.g:245:1: entryRuleBooleanConstantExpression returns [EObject current=null] : iv_ruleBooleanConstantExpression= ruleBooleanConstantExpression EOF ;
    public final EObject entryRuleBooleanConstantExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanConstantExpression = null;


        try {
            // InternalTQL.g:245:66: (iv_ruleBooleanConstantExpression= ruleBooleanConstantExpression EOF )
            // InternalTQL.g:246:2: iv_ruleBooleanConstantExpression= ruleBooleanConstantExpression EOF
            {
             newCompositeNode(grammarAccess.getBooleanConstantExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanConstantExpression=ruleBooleanConstantExpression();

            state._fsp--;

             current =iv_ruleBooleanConstantExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanConstantExpression"


    // $ANTLR start "ruleBooleanConstantExpression"
    // InternalTQL.g:252:1: ruleBooleanConstantExpression returns [EObject current=null] : ( ( (lv_value_0_0= 'value' ) ) otherlv_1= 'BooleanConstantExpression' ) ;
    public final EObject ruleBooleanConstantExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTQL.g:258:2: ( ( ( (lv_value_0_0= 'value' ) ) otherlv_1= 'BooleanConstantExpression' ) )
            // InternalTQL.g:259:2: ( ( (lv_value_0_0= 'value' ) ) otherlv_1= 'BooleanConstantExpression' )
            {
            // InternalTQL.g:259:2: ( ( (lv_value_0_0= 'value' ) ) otherlv_1= 'BooleanConstantExpression' )
            // InternalTQL.g:260:3: ( (lv_value_0_0= 'value' ) ) otherlv_1= 'BooleanConstantExpression'
            {
            // InternalTQL.g:260:3: ( (lv_value_0_0= 'value' ) )
            // InternalTQL.g:261:4: (lv_value_0_0= 'value' )
            {
            // InternalTQL.g:261:4: (lv_value_0_0= 'value' )
            // InternalTQL.g:262:5: lv_value_0_0= 'value'
            {
            lv_value_0_0=(Token)match(input,19,FOLLOW_11); 

            					newLeafNode(lv_value_0_0, grammarAccess.getBooleanConstantExpressionAccess().getValueValueKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBooleanConstantExpressionRule());
            					}
            					setWithLastConsumed(current, "value", lv_value_0_0 != null, "value");
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getBooleanConstantExpressionAccess().getBooleanConstantExpressionKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanConstantExpression"


    // $ANTLR start "entryRuleIntegerConstantExpression"
    // InternalTQL.g:282:1: entryRuleIntegerConstantExpression returns [EObject current=null] : iv_ruleIntegerConstantExpression= ruleIntegerConstantExpression EOF ;
    public final EObject entryRuleIntegerConstantExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerConstantExpression = null;


        try {
            // InternalTQL.g:282:66: (iv_ruleIntegerConstantExpression= ruleIntegerConstantExpression EOF )
            // InternalTQL.g:283:2: iv_ruleIntegerConstantExpression= ruleIntegerConstantExpression EOF
            {
             newCompositeNode(grammarAccess.getIntegerConstantExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntegerConstantExpression=ruleIntegerConstantExpression();

            state._fsp--;

             current =iv_ruleIntegerConstantExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntegerConstantExpression"


    // $ANTLR start "ruleIntegerConstantExpression"
    // InternalTQL.g:289:1: ruleIntegerConstantExpression returns [EObject current=null] : (otherlv_0= 'IntegerConstantExpression' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEInt ) ) otherlv_4= '}' ) ;
    public final EObject ruleIntegerConstantExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalTQL.g:295:2: ( (otherlv_0= 'IntegerConstantExpression' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEInt ) ) otherlv_4= '}' ) )
            // InternalTQL.g:296:2: (otherlv_0= 'IntegerConstantExpression' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEInt ) ) otherlv_4= '}' )
            {
            // InternalTQL.g:296:2: (otherlv_0= 'IntegerConstantExpression' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEInt ) ) otherlv_4= '}' )
            // InternalTQL.g:297:3: otherlv_0= 'IntegerConstantExpression' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEInt ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getIntegerConstantExpressionAccess().getIntegerConstantExpressionKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getIntegerConstantExpressionAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getIntegerConstantExpressionAccess().getValueKeyword_2());
            		
            // InternalTQL.g:309:3: ( (lv_value_3_0= ruleEInt ) )
            // InternalTQL.g:310:4: (lv_value_3_0= ruleEInt )
            {
            // InternalTQL.g:310:4: (lv_value_3_0= ruleEInt )
            // InternalTQL.g:311:5: lv_value_3_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getIntegerConstantExpressionAccess().getValueEIntParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
            lv_value_3_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntegerConstantExpressionRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"nl.tue.gtl.TQL.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getIntegerConstantExpressionAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntegerConstantExpression"


    // $ANTLR start "entryRuleInExpression"
    // InternalTQL.g:336:1: entryRuleInExpression returns [EObject current=null] : iv_ruleInExpression= ruleInExpression EOF ;
    public final EObject entryRuleInExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInExpression = null;


        try {
            // InternalTQL.g:336:53: (iv_ruleInExpression= ruleInExpression EOF )
            // InternalTQL.g:337:2: iv_ruleInExpression= ruleInExpression EOF
            {
             newCompositeNode(grammarAccess.getInExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInExpression=ruleInExpression();

            state._fsp--;

             current =iv_ruleInExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInExpression"


    // $ANTLR start "ruleInExpression"
    // InternalTQL.g:343:1: ruleInExpression returns [EObject current=null] : (otherlv_0= 'InExpression' otherlv_1= '{' (otherlv_2= 'statement' ( ( ruleEString ) ) )? otherlv_4= 'constantSet' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= '}' ) ;
    public final EObject ruleInExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;


        	enterRule();

        try {
            // InternalTQL.g:349:2: ( (otherlv_0= 'InExpression' otherlv_1= '{' (otherlv_2= 'statement' ( ( ruleEString ) ) )? otherlv_4= 'constantSet' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= '}' ) )
            // InternalTQL.g:350:2: (otherlv_0= 'InExpression' otherlv_1= '{' (otherlv_2= 'statement' ( ( ruleEString ) ) )? otherlv_4= 'constantSet' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= '}' )
            {
            // InternalTQL.g:350:2: (otherlv_0= 'InExpression' otherlv_1= '{' (otherlv_2= 'statement' ( ( ruleEString ) ) )? otherlv_4= 'constantSet' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= '}' )
            // InternalTQL.g:351:3: otherlv_0= 'InExpression' otherlv_1= '{' (otherlv_2= 'statement' ( ( ruleEString ) ) )? otherlv_4= 'constantSet' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInExpressionAccess().getInExpressionKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getInExpressionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalTQL.g:359:3: (otherlv_2= 'statement' ( ( ruleEString ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==23) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalTQL.g:360:4: otherlv_2= 'statement' ( ( ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getInExpressionAccess().getStatementKeyword_2_0());
                    			
                    // InternalTQL.g:364:4: ( ( ruleEString ) )
                    // InternalTQL.g:365:5: ( ruleEString )
                    {
                    // InternalTQL.g:365:5: ( ruleEString )
                    // InternalTQL.g:366:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInExpressionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getInExpressionAccess().getStatementExpressionCrossReference_2_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,24,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getInExpressionAccess().getConstantSetKeyword_3());
            		
            otherlv_5=(Token)match(input,25,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getInExpressionAccess().getLeftParenthesisKeyword_4());
            		
            // InternalTQL.g:389:3: ( ( ruleEString ) )
            // InternalTQL.g:390:4: ( ruleEString )
            {
            // InternalTQL.g:390:4: ( ruleEString )
            // InternalTQL.g:391:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInExpressionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getInExpressionAccess().getConstantSetConstantExpressionCrossReference_5_0());
            				
            pushFollow(FOLLOW_16);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTQL.g:405:3: (otherlv_7= ',' ( ( ruleEString ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==26) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalTQL.g:406:4: otherlv_7= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_7=(Token)match(input,26,FOLLOW_7); 

            	    				newLeafNode(otherlv_7, grammarAccess.getInExpressionAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalTQL.g:410:4: ( ( ruleEString ) )
            	    // InternalTQL.g:411:5: ( ruleEString )
            	    {
            	    // InternalTQL.g:411:5: ( ruleEString )
            	    // InternalTQL.g:412:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getInExpressionRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getInExpressionAccess().getConstantSetConstantExpressionCrossReference_6_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_9=(Token)match(input,27,FOLLOW_9); 

            			newLeafNode(otherlv_9, grammarAccess.getInExpressionAccess().getRightParenthesisKeyword_7());
            		
            otherlv_10=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getInExpressionAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInExpression"


    // $ANTLR start "entryRuleParseExpression"
    // InternalTQL.g:439:1: entryRuleParseExpression returns [EObject current=null] : iv_ruleParseExpression= ruleParseExpression EOF ;
    public final EObject entryRuleParseExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParseExpression = null;


        try {
            // InternalTQL.g:439:56: (iv_ruleParseExpression= ruleParseExpression EOF )
            // InternalTQL.g:440:2: iv_ruleParseExpression= ruleParseExpression EOF
            {
             newCompositeNode(grammarAccess.getParseExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParseExpression=ruleParseExpression();

            state._fsp--;

             current =iv_ruleParseExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParseExpression"


    // $ANTLR start "ruleParseExpression"
    // InternalTQL.g:446:1: ruleParseExpression returns [EObject current=null] : (otherlv_0= 'ParseExpression' otherlv_1= '{' (otherlv_2= 'outputType' ( (lv_outputType_3_0= ruleType ) ) )? otherlv_4= 'expression' ( ( ruleEString ) ) otherlv_6= '}' ) ;
    public final EObject ruleParseExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_outputType_3_0 = null;



        	enterRule();

        try {
            // InternalTQL.g:452:2: ( (otherlv_0= 'ParseExpression' otherlv_1= '{' (otherlv_2= 'outputType' ( (lv_outputType_3_0= ruleType ) ) )? otherlv_4= 'expression' ( ( ruleEString ) ) otherlv_6= '}' ) )
            // InternalTQL.g:453:2: (otherlv_0= 'ParseExpression' otherlv_1= '{' (otherlv_2= 'outputType' ( (lv_outputType_3_0= ruleType ) ) )? otherlv_4= 'expression' ( ( ruleEString ) ) otherlv_6= '}' )
            {
            // InternalTQL.g:453:2: (otherlv_0= 'ParseExpression' otherlv_1= '{' (otherlv_2= 'outputType' ( (lv_outputType_3_0= ruleType ) ) )? otherlv_4= 'expression' ( ( ruleEString ) ) otherlv_6= '}' )
            // InternalTQL.g:454:3: otherlv_0= 'ParseExpression' otherlv_1= '{' (otherlv_2= 'outputType' ( (lv_outputType_3_0= ruleType ) ) )? otherlv_4= 'expression' ( ( ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getParseExpressionAccess().getParseExpressionKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getParseExpressionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalTQL.g:462:3: (otherlv_2= 'outputType' ( (lv_outputType_3_0= ruleType ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==29) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalTQL.g:463:4: otherlv_2= 'outputType' ( (lv_outputType_3_0= ruleType ) )
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_18); 

                    				newLeafNode(otherlv_2, grammarAccess.getParseExpressionAccess().getOutputTypeKeyword_2_0());
                    			
                    // InternalTQL.g:467:4: ( (lv_outputType_3_0= ruleType ) )
                    // InternalTQL.g:468:5: (lv_outputType_3_0= ruleType )
                    {
                    // InternalTQL.g:468:5: (lv_outputType_3_0= ruleType )
                    // InternalTQL.g:469:6: lv_outputType_3_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getParseExpressionAccess().getOutputTypeTypeEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_outputType_3_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParseExpressionRule());
                    						}
                    						set(
                    							current,
                    							"outputType",
                    							lv_outputType_3_0,
                    							"nl.tue.gtl.TQL.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,30,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getParseExpressionAccess().getExpressionKeyword_3());
            		
            // InternalTQL.g:491:3: ( ( ruleEString ) )
            // InternalTQL.g:492:4: ( ruleEString )
            {
            // InternalTQL.g:492:4: ( ruleEString )
            // InternalTQL.g:493:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParseExpressionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getParseExpressionAccess().getExpressionExpressionCrossReference_4_0());
            				
            pushFollow(FOLLOW_9);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getParseExpressionAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParseExpression"


    // $ANTLR start "entryRuleFloatConstantExpression"
    // InternalTQL.g:515:1: entryRuleFloatConstantExpression returns [EObject current=null] : iv_ruleFloatConstantExpression= ruleFloatConstantExpression EOF ;
    public final EObject entryRuleFloatConstantExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatConstantExpression = null;


        try {
            // InternalTQL.g:515:64: (iv_ruleFloatConstantExpression= ruleFloatConstantExpression EOF )
            // InternalTQL.g:516:2: iv_ruleFloatConstantExpression= ruleFloatConstantExpression EOF
            {
             newCompositeNode(grammarAccess.getFloatConstantExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFloatConstantExpression=ruleFloatConstantExpression();

            state._fsp--;

             current =iv_ruleFloatConstantExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFloatConstantExpression"


    // $ANTLR start "ruleFloatConstantExpression"
    // InternalTQL.g:522:1: ruleFloatConstantExpression returns [EObject current=null] : (otherlv_0= 'FloatConstantExpression' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEFloat ) ) otherlv_4= '}' ) ;
    public final EObject ruleFloatConstantExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalTQL.g:528:2: ( (otherlv_0= 'FloatConstantExpression' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEFloat ) ) otherlv_4= '}' ) )
            // InternalTQL.g:529:2: (otherlv_0= 'FloatConstantExpression' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEFloat ) ) otherlv_4= '}' )
            {
            // InternalTQL.g:529:2: (otherlv_0= 'FloatConstantExpression' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEFloat ) ) otherlv_4= '}' )
            // InternalTQL.g:530:3: otherlv_0= 'FloatConstantExpression' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEFloat ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFloatConstantExpressionAccess().getFloatConstantExpressionKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getFloatConstantExpressionAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getFloatConstantExpressionAccess().getValueKeyword_2());
            		
            // InternalTQL.g:542:3: ( (lv_value_3_0= ruleEFloat ) )
            // InternalTQL.g:543:4: (lv_value_3_0= ruleEFloat )
            {
            // InternalTQL.g:543:4: (lv_value_3_0= ruleEFloat )
            // InternalTQL.g:544:5: lv_value_3_0= ruleEFloat
            {

            					newCompositeNode(grammarAccess.getFloatConstantExpressionAccess().getValueEFloatParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
            lv_value_3_0=ruleEFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFloatConstantExpressionRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"nl.tue.gtl.TQL.EFloat");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getFloatConstantExpressionAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFloatConstantExpression"


    // $ANTLR start "entryRuleEString"
    // InternalTQL.g:569:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalTQL.g:569:47: (iv_ruleEString= ruleEString EOF )
            // InternalTQL.g:570:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalTQL.g:576:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalTQL.g:582:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalTQL.g:583:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalTQL.g:583:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalTQL.g:584:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTQL.g:592:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // InternalTQL.g:603:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalTQL.g:603:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalTQL.g:604:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalTQL.g:610:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalTQL.g:616:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalTQL.g:617:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalTQL.g:617:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalTQL.g:618:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalTQL.g:618:3: (kw= '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==32) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalTQL.g:619:4: kw= '-'
                    {
                    kw=(Token)match(input,32,FOLLOW_21); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEFloat"
    // InternalTQL.g:636:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // InternalTQL.g:636:46: (iv_ruleEFloat= ruleEFloat EOF )
            // InternalTQL.g:637:2: iv_ruleEFloat= ruleEFloat EOF
            {
             newCompositeNode(grammarAccess.getEFloatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEFloat=ruleEFloat();

            state._fsp--;

             current =iv_ruleEFloat.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEFloat"


    // $ANTLR start "ruleEFloat"
    // InternalTQL.g:643:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalTQL.g:649:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalTQL.g:650:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalTQL.g:650:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalTQL.g:651:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalTQL.g:651:3: (kw= '-' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==32) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalTQL.g:652:4: kw= '-'
                    {
                    kw=(Token)match(input,32,FOLLOW_22); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalTQL.g:658:3: (this_INT_1= RULE_INT )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalTQL.g:659:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_23); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,33,FOLLOW_21); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_24); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3());
            		
            // InternalTQL.g:679:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=34 && LA11_0<=35)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalTQL.g:680:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalTQL.g:680:4: (kw= 'E' | kw= 'e' )
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==34) ) {
                        alt9=1;
                    }
                    else if ( (LA9_0==35) ) {
                        alt9=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalTQL.g:681:5: kw= 'E'
                            {
                            kw=(Token)match(input,34,FOLLOW_12); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalTQL.g:687:5: kw= 'e'
                            {
                            kw=(Token)match(input,35,FOLLOW_12); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalTQL.g:693:4: (kw= '-' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==32) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalTQL.g:694:5: kw= '-'
                            {
                            kw=(Token)match(input,32,FOLLOW_21); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEFloat"


    // $ANTLR start "ruleBinaryFunction"
    // InternalTQL.g:712:1: ruleBinaryFunction returns [Enumerator current=null] : ( (enumLiteral_0= 'mult' ) | (enumLiteral_1= 'sum' ) | (enumLiteral_2= 'divide' ) | (enumLiteral_3= 'concat' ) | (enumLiteral_4= 'equal' ) | (enumLiteral_5= 'notequal' ) | (enumLiteral_6= 'smaller' ) | (enumLiteral_7= 'greater' ) | (enumLiteral_8= 'or' ) | (enumLiteral_9= 'and' ) ) ;
    public final Enumerator ruleBinaryFunction() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;


        	enterRule();

        try {
            // InternalTQL.g:718:2: ( ( (enumLiteral_0= 'mult' ) | (enumLiteral_1= 'sum' ) | (enumLiteral_2= 'divide' ) | (enumLiteral_3= 'concat' ) | (enumLiteral_4= 'equal' ) | (enumLiteral_5= 'notequal' ) | (enumLiteral_6= 'smaller' ) | (enumLiteral_7= 'greater' ) | (enumLiteral_8= 'or' ) | (enumLiteral_9= 'and' ) ) )
            // InternalTQL.g:719:2: ( (enumLiteral_0= 'mult' ) | (enumLiteral_1= 'sum' ) | (enumLiteral_2= 'divide' ) | (enumLiteral_3= 'concat' ) | (enumLiteral_4= 'equal' ) | (enumLiteral_5= 'notequal' ) | (enumLiteral_6= 'smaller' ) | (enumLiteral_7= 'greater' ) | (enumLiteral_8= 'or' ) | (enumLiteral_9= 'and' ) )
            {
            // InternalTQL.g:719:2: ( (enumLiteral_0= 'mult' ) | (enumLiteral_1= 'sum' ) | (enumLiteral_2= 'divide' ) | (enumLiteral_3= 'concat' ) | (enumLiteral_4= 'equal' ) | (enumLiteral_5= 'notequal' ) | (enumLiteral_6= 'smaller' ) | (enumLiteral_7= 'greater' ) | (enumLiteral_8= 'or' ) | (enumLiteral_9= 'and' ) )
            int alt12=10;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt12=1;
                }
                break;
            case 37:
                {
                alt12=2;
                }
                break;
            case 38:
                {
                alt12=3;
                }
                break;
            case 39:
                {
                alt12=4;
                }
                break;
            case 40:
                {
                alt12=5;
                }
                break;
            case 41:
                {
                alt12=6;
                }
                break;
            case 42:
                {
                alt12=7;
                }
                break;
            case 43:
                {
                alt12=8;
                }
                break;
            case 44:
                {
                alt12=9;
                }
                break;
            case 45:
                {
                alt12=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalTQL.g:720:3: (enumLiteral_0= 'mult' )
                    {
                    // InternalTQL.g:720:3: (enumLiteral_0= 'mult' )
                    // InternalTQL.g:721:4: enumLiteral_0= 'mult'
                    {
                    enumLiteral_0=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getBinaryFunctionAccess().getMultEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBinaryFunctionAccess().getMultEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTQL.g:728:3: (enumLiteral_1= 'sum' )
                    {
                    // InternalTQL.g:728:3: (enumLiteral_1= 'sum' )
                    // InternalTQL.g:729:4: enumLiteral_1= 'sum'
                    {
                    enumLiteral_1=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getBinaryFunctionAccess().getSumEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBinaryFunctionAccess().getSumEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTQL.g:736:3: (enumLiteral_2= 'divide' )
                    {
                    // InternalTQL.g:736:3: (enumLiteral_2= 'divide' )
                    // InternalTQL.g:737:4: enumLiteral_2= 'divide'
                    {
                    enumLiteral_2=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getBinaryFunctionAccess().getDivideEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getBinaryFunctionAccess().getDivideEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalTQL.g:744:3: (enumLiteral_3= 'concat' )
                    {
                    // InternalTQL.g:744:3: (enumLiteral_3= 'concat' )
                    // InternalTQL.g:745:4: enumLiteral_3= 'concat'
                    {
                    enumLiteral_3=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getBinaryFunctionAccess().getConcatEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getBinaryFunctionAccess().getConcatEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalTQL.g:752:3: (enumLiteral_4= 'equal' )
                    {
                    // InternalTQL.g:752:3: (enumLiteral_4= 'equal' )
                    // InternalTQL.g:753:4: enumLiteral_4= 'equal'
                    {
                    enumLiteral_4=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getBinaryFunctionAccess().getEqualEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getBinaryFunctionAccess().getEqualEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalTQL.g:760:3: (enumLiteral_5= 'notequal' )
                    {
                    // InternalTQL.g:760:3: (enumLiteral_5= 'notequal' )
                    // InternalTQL.g:761:4: enumLiteral_5= 'notequal'
                    {
                    enumLiteral_5=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getBinaryFunctionAccess().getNotequalEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getBinaryFunctionAccess().getNotequalEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalTQL.g:768:3: (enumLiteral_6= 'smaller' )
                    {
                    // InternalTQL.g:768:3: (enumLiteral_6= 'smaller' )
                    // InternalTQL.g:769:4: enumLiteral_6= 'smaller'
                    {
                    enumLiteral_6=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getBinaryFunctionAccess().getSmallerEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getBinaryFunctionAccess().getSmallerEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalTQL.g:776:3: (enumLiteral_7= 'greater' )
                    {
                    // InternalTQL.g:776:3: (enumLiteral_7= 'greater' )
                    // InternalTQL.g:777:4: enumLiteral_7= 'greater'
                    {
                    enumLiteral_7=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getBinaryFunctionAccess().getGreaterEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getBinaryFunctionAccess().getGreaterEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalTQL.g:784:3: (enumLiteral_8= 'or' )
                    {
                    // InternalTQL.g:784:3: (enumLiteral_8= 'or' )
                    // InternalTQL.g:785:4: enumLiteral_8= 'or'
                    {
                    enumLiteral_8=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getBinaryFunctionAccess().getOrEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getBinaryFunctionAccess().getOrEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalTQL.g:792:3: (enumLiteral_9= 'and' )
                    {
                    // InternalTQL.g:792:3: (enumLiteral_9= 'and' )
                    // InternalTQL.g:793:4: enumLiteral_9= 'and'
                    {
                    enumLiteral_9=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getBinaryFunctionAccess().getAndEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getBinaryFunctionAccess().getAndEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinaryFunction"


    // $ANTLR start "ruleType"
    // InternalTQL.g:803:1: ruleType returns [Enumerator current=null] : ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'floats' ) | (enumLiteral_3= 'sets' ) | (enumLiteral_4= 'DateTime' ) | (enumLiteral_5= 'Null' ) | (enumLiteral_6= 'bool' ) ) ;
    public final Enumerator ruleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalTQL.g:809:2: ( ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'floats' ) | (enumLiteral_3= 'sets' ) | (enumLiteral_4= 'DateTime' ) | (enumLiteral_5= 'Null' ) | (enumLiteral_6= 'bool' ) ) )
            // InternalTQL.g:810:2: ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'floats' ) | (enumLiteral_3= 'sets' ) | (enumLiteral_4= 'DateTime' ) | (enumLiteral_5= 'Null' ) | (enumLiteral_6= 'bool' ) )
            {
            // InternalTQL.g:810:2: ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'floats' ) | (enumLiteral_3= 'sets' ) | (enumLiteral_4= 'DateTime' ) | (enumLiteral_5= 'Null' ) | (enumLiteral_6= 'bool' ) )
            int alt13=7;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt13=1;
                }
                break;
            case 47:
                {
                alt13=2;
                }
                break;
            case 48:
                {
                alt13=3;
                }
                break;
            case 49:
                {
                alt13=4;
                }
                break;
            case 50:
                {
                alt13=5;
                }
                break;
            case 51:
                {
                alt13=6;
                }
                break;
            case 52:
                {
                alt13=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalTQL.g:811:3: (enumLiteral_0= 'string' )
                    {
                    // InternalTQL.g:811:3: (enumLiteral_0= 'string' )
                    // InternalTQL.g:812:4: enumLiteral_0= 'string'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getStringEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTQL.g:819:3: (enumLiteral_1= 'integer' )
                    {
                    // InternalTQL.g:819:3: (enumLiteral_1= 'integer' )
                    // InternalTQL.g:820:4: enumLiteral_1= 'integer'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getIntegerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getIntegerEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTQL.g:827:3: (enumLiteral_2= 'floats' )
                    {
                    // InternalTQL.g:827:3: (enumLiteral_2= 'floats' )
                    // InternalTQL.g:828:4: enumLiteral_2= 'floats'
                    {
                    enumLiteral_2=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getFloatsEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTypeAccess().getFloatsEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalTQL.g:835:3: (enumLiteral_3= 'sets' )
                    {
                    // InternalTQL.g:835:3: (enumLiteral_3= 'sets' )
                    // InternalTQL.g:836:4: enumLiteral_3= 'sets'
                    {
                    enumLiteral_3=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getSetsEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTypeAccess().getSetsEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalTQL.g:843:3: (enumLiteral_4= 'DateTime' )
                    {
                    // InternalTQL.g:843:3: (enumLiteral_4= 'DateTime' )
                    // InternalTQL.g:844:4: enumLiteral_4= 'DateTime'
                    {
                    enumLiteral_4=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getDateTimeEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getTypeAccess().getDateTimeEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalTQL.g:851:3: (enumLiteral_5= 'Null' )
                    {
                    // InternalTQL.g:851:3: (enumLiteral_5= 'Null' )
                    // InternalTQL.g:852:4: enumLiteral_5= 'Null'
                    {
                    enumLiteral_5=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getNullEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getTypeAccess().getNullEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalTQL.g:859:3: (enumLiteral_6= 'bool' )
                    {
                    // InternalTQL.g:859:3: (enumLiteral_6= 'bool' )
                    // InternalTQL.g:860:4: enumLiteral_6= 'bool'
                    {
                    enumLiteral_6=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getBoolEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getTypeAccess().getBoolEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00003FF000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000100000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x001FC00000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000300000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000200000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000C00000002L});

}