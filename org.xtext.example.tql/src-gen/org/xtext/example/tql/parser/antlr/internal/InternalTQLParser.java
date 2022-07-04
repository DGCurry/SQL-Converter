package org.xtext.example.tql.parser.antlr.internal;

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
import org.xtext.example.tql.services.TQLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTQLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'source'", "'target'", "'{'", "','", "'}'", "':'", "'BooleanOperationExpression'", "'operation'", "'right'", "'left'", "'TransformationCall'", "'transformation'", "'parameters'", "'('", "')'", "'parameterExpression'", "'parameter'", "'StringConstantExpression'", "'value'", "'BooleanConstantExpression'", "'IntegerConstantExpression'", "'InExpression'", "'statement'", "'constantSet'", "'ConditionalStatement'", "'condition'", "'booleanoperationexpression'", "'ifBody'", "'elseBody'", "'ParseExpression'", "'outputType'", "'expression'", "'FloatConstantExpression'", "'BinaryOperationExpression'", "'Parameter'", "'label'", "'type'", "'-'", "'.'", "'E'", "'e'", "'string'", "'integer'", "'floats'", "'sets'", "'DateTime'", "'Null'", "'bool'", "'equal'", "'notequal'", "'smaller'", "'greater'", "'or'", "'and'", "'mult'", "'sum'", "'divide'", "'concat'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
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
        	return "TQL";
       	}

       	@Override
       	protected TQLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleTQL"
    // InternalTQL.g:65:1: entryRuleTQL returns [EObject current=null] : iv_ruleTQL= ruleTQL EOF ;
    public final EObject entryRuleTQL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTQL = null;


        try {
            // InternalTQL.g:65:44: (iv_ruleTQL= ruleTQL EOF )
            // InternalTQL.g:66:2: iv_ruleTQL= ruleTQL EOF
            {
             newCompositeNode(grammarAccess.getTQLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTQL=ruleTQL();

            state._fsp--;

             current =iv_ruleTQL; 
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
    // $ANTLR end "entryRuleTQL"


    // $ANTLR start "ruleTQL"
    // InternalTQL.g:72:1: ruleTQL returns [EObject current=null] : ( (lv_blocks_0_0= ruleBlock ) ) ;
    public final EObject ruleTQL() throws RecognitionException {
        EObject current = null;

        EObject lv_blocks_0_0 = null;



        	enterRule();

        try {
            // InternalTQL.g:78:2: ( ( (lv_blocks_0_0= ruleBlock ) ) )
            // InternalTQL.g:79:2: ( (lv_blocks_0_0= ruleBlock ) )
            {
            // InternalTQL.g:79:2: ( (lv_blocks_0_0= ruleBlock ) )
            // InternalTQL.g:80:3: (lv_blocks_0_0= ruleBlock )
            {
            // InternalTQL.g:80:3: (lv_blocks_0_0= ruleBlock )
            // InternalTQL.g:81:4: lv_blocks_0_0= ruleBlock
            {

            				newCompositeNode(grammarAccess.getTQLAccess().getBlocksBlockParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_blocks_0_0=ruleBlock();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getTQLRule());
            				}
            				add(
            					current,
            					"blocks",
            					lv_blocks_0_0,
            					"org.xtext.example.tql.TQL.Block");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleTQL"


    // $ANTLR start "entryRuleBlock"
    // InternalTQL.g:101:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // InternalTQL.g:101:46: (iv_ruleBlock= ruleBlock EOF )
            // InternalTQL.g:102:2: iv_ruleBlock= ruleBlock EOF
            {
             newCompositeNode(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBlock=ruleBlock();

            state._fsp--;

             current =iv_ruleBlock; 
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
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // InternalTQL.g:108:1: ruleBlock returns [EObject current=null] : this_Table_Impl_0= ruleTable_Impl ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        EObject this_Table_Impl_0 = null;



        	enterRule();

        try {
            // InternalTQL.g:114:2: (this_Table_Impl_0= ruleTable_Impl )
            // InternalTQL.g:115:2: this_Table_Impl_0= ruleTable_Impl
            {

            		newCompositeNode(grammarAccess.getBlockAccess().getTable_ImplParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Table_Impl_0=ruleTable_Impl();

            state._fsp--;


            		current = this_Table_Impl_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleTable_Impl"
    // InternalTQL.g:126:1: entryRuleTable_Impl returns [EObject current=null] : iv_ruleTable_Impl= ruleTable_Impl EOF ;
    public final EObject entryRuleTable_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable_Impl = null;


        try {
            // InternalTQL.g:126:51: (iv_ruleTable_Impl= ruleTable_Impl EOF )
            // InternalTQL.g:127:2: iv_ruleTable_Impl= ruleTable_Impl EOF
            {
             newCompositeNode(grammarAccess.getTable_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTable_Impl=ruleTable_Impl();

            state._fsp--;

             current =iv_ruleTable_Impl; 
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
    // $ANTLR end "entryRuleTable_Impl"


    // $ANTLR start "ruleTable_Impl"
    // InternalTQL.g:133:1: ruleTable_Impl returns [EObject current=null] : ( (otherlv_0= 'source' this_Source_Table_1= ruleSource_Table ) | (otherlv_2= 'target' this_Target_Table_3= ruleTarget_Table ) ) ;
    public final EObject ruleTable_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Source_Table_1 = null;

        EObject this_Target_Table_3 = null;



        	enterRule();

        try {
            // InternalTQL.g:139:2: ( ( (otherlv_0= 'source' this_Source_Table_1= ruleSource_Table ) | (otherlv_2= 'target' this_Target_Table_3= ruleTarget_Table ) ) )
            // InternalTQL.g:140:2: ( (otherlv_0= 'source' this_Source_Table_1= ruleSource_Table ) | (otherlv_2= 'target' this_Target_Table_3= ruleTarget_Table ) )
            {
            // InternalTQL.g:140:2: ( (otherlv_0= 'source' this_Source_Table_1= ruleSource_Table ) | (otherlv_2= 'target' this_Target_Table_3= ruleTarget_Table ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==12) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalTQL.g:141:3: (otherlv_0= 'source' this_Source_Table_1= ruleSource_Table )
                    {
                    // InternalTQL.g:141:3: (otherlv_0= 'source' this_Source_Table_1= ruleSource_Table )
                    // InternalTQL.g:142:4: otherlv_0= 'source' this_Source_Table_1= ruleSource_Table
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getTable_ImplAccess().getSourceKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getTable_ImplAccess().getSource_TableParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_Source_Table_1=ruleSource_Table();

                    state._fsp--;


                    				current = this_Source_Table_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTQL.g:156:3: (otherlv_2= 'target' this_Target_Table_3= ruleTarget_Table )
                    {
                    // InternalTQL.g:156:3: (otherlv_2= 'target' this_Target_Table_3= ruleTarget_Table )
                    // InternalTQL.g:157:4: otherlv_2= 'target' this_Target_Table_3= ruleTarget_Table
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getTable_ImplAccess().getTargetKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getTable_ImplAccess().getTarget_TableParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_Target_Table_3=ruleTarget_Table();

                    state._fsp--;


                    				current = this_Target_Table_3;
                    				afterParserOrEnumRuleCall();
                    			

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
    // $ANTLR end "ruleTable_Impl"


    // $ANTLR start "entryRuleSource_Table"
    // InternalTQL.g:174:1: entryRuleSource_Table returns [EObject current=null] : iv_ruleSource_Table= ruleSource_Table EOF ;
    public final EObject entryRuleSource_Table() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSource_Table = null;


        try {
            // InternalTQL.g:174:53: (iv_ruleSource_Table= ruleSource_Table EOF )
            // InternalTQL.g:175:2: iv_ruleSource_Table= ruleSource_Table EOF
            {
             newCompositeNode(grammarAccess.getSource_TableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSource_Table=ruleSource_Table();

            state._fsp--;

             current =iv_ruleSource_Table; 
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
    // $ANTLR end "entryRuleSource_Table"


    // $ANTLR start "ruleSource_Table"
    // InternalTQL.g:181:1: ruleSource_Table returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_columns_2_0= ruleTableField ) ) (otherlv_3= ',' ( (lv_columns_4_0= ruleTableField ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleSource_Table() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_columns_2_0 = null;

        EObject lv_columns_4_0 = null;



        	enterRule();

        try {
            // InternalTQL.g:187:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_columns_2_0= ruleTableField ) ) (otherlv_3= ',' ( (lv_columns_4_0= ruleTableField ) ) )* otherlv_5= '}' ) )
            // InternalTQL.g:188:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_columns_2_0= ruleTableField ) ) (otherlv_3= ',' ( (lv_columns_4_0= ruleTableField ) ) )* otherlv_5= '}' )
            {
            // InternalTQL.g:188:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_columns_2_0= ruleTableField ) ) (otherlv_3= ',' ( (lv_columns_4_0= ruleTableField ) ) )* otherlv_5= '}' )
            // InternalTQL.g:189:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_columns_2_0= ruleTableField ) ) (otherlv_3= ',' ( (lv_columns_4_0= ruleTableField ) ) )* otherlv_5= '}'
            {
            // InternalTQL.g:189:3: ( (lv_name_0_0= ruleEString ) )
            // InternalTQL.g:190:4: (lv_name_0_0= ruleEString )
            {
            // InternalTQL.g:190:4: (lv_name_0_0= ruleEString )
            // InternalTQL.g:191:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSource_TableAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSource_TableRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.example.tql.TQL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSource_TableAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalTQL.g:212:3: ( (lv_columns_2_0= ruleTableField ) )
            // InternalTQL.g:213:4: (lv_columns_2_0= ruleTableField )
            {
            // InternalTQL.g:213:4: (lv_columns_2_0= ruleTableField )
            // InternalTQL.g:214:5: lv_columns_2_0= ruleTableField
            {

            					newCompositeNode(grammarAccess.getSource_TableAccess().getColumnsTableFieldParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_columns_2_0=ruleTableField();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSource_TableRule());
            					}
            					add(
            						current,
            						"columns",
            						lv_columns_2_0,
            						"org.xtext.example.tql.TQL.TableField");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTQL.g:231:3: (otherlv_3= ',' ( (lv_columns_4_0= ruleTableField ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTQL.g:232:4: otherlv_3= ',' ( (lv_columns_4_0= ruleTableField ) )
            	    {
            	    otherlv_3=(Token)match(input,14,FOLLOW_3); 

            	    				newLeafNode(otherlv_3, grammarAccess.getSource_TableAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalTQL.g:236:4: ( (lv_columns_4_0= ruleTableField ) )
            	    // InternalTQL.g:237:5: (lv_columns_4_0= ruleTableField )
            	    {
            	    // InternalTQL.g:237:5: (lv_columns_4_0= ruleTableField )
            	    // InternalTQL.g:238:6: lv_columns_4_0= ruleTableField
            	    {

            	    						newCompositeNode(grammarAccess.getSource_TableAccess().getColumnsTableFieldParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_columns_4_0=ruleTableField();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSource_TableRule());
            	    						}
            	    						add(
            	    							current,
            	    							"columns",
            	    							lv_columns_4_0,
            	    							"org.xtext.example.tql.TQL.TableField");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSource_TableAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleSource_Table"


    // $ANTLR start "entryRuleTarget_Table"
    // InternalTQL.g:264:1: entryRuleTarget_Table returns [EObject current=null] : iv_ruleTarget_Table= ruleTarget_Table EOF ;
    public final EObject entryRuleTarget_Table() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTarget_Table = null;


        try {
            // InternalTQL.g:264:53: (iv_ruleTarget_Table= ruleTarget_Table EOF )
            // InternalTQL.g:265:2: iv_ruleTarget_Table= ruleTarget_Table EOF
            {
             newCompositeNode(grammarAccess.getTarget_TableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTarget_Table=ruleTarget_Table();

            state._fsp--;

             current =iv_ruleTarget_Table; 
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
    // $ANTLR end "entryRuleTarget_Table"


    // $ANTLR start "ruleTarget_Table"
    // InternalTQL.g:271:1: ruleTarget_Table returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_columns_2_0= ruleTableField ) ) (otherlv_3= ',' ( (lv_columns_4_0= ruleTableField ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleTarget_Table() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_columns_2_0 = null;

        EObject lv_columns_4_0 = null;



        	enterRule();

        try {
            // InternalTQL.g:277:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_columns_2_0= ruleTableField ) ) (otherlv_3= ',' ( (lv_columns_4_0= ruleTableField ) ) )* otherlv_5= '}' ) )
            // InternalTQL.g:278:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_columns_2_0= ruleTableField ) ) (otherlv_3= ',' ( (lv_columns_4_0= ruleTableField ) ) )* otherlv_5= '}' )
            {
            // InternalTQL.g:278:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_columns_2_0= ruleTableField ) ) (otherlv_3= ',' ( (lv_columns_4_0= ruleTableField ) ) )* otherlv_5= '}' )
            // InternalTQL.g:279:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_columns_2_0= ruleTableField ) ) (otherlv_3= ',' ( (lv_columns_4_0= ruleTableField ) ) )* otherlv_5= '}'
            {
            // InternalTQL.g:279:3: ( (lv_name_0_0= ruleEString ) )
            // InternalTQL.g:280:4: (lv_name_0_0= ruleEString )
            {
            // InternalTQL.g:280:4: (lv_name_0_0= ruleEString )
            // InternalTQL.g:281:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTarget_TableAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTarget_TableRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.example.tql.TQL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTarget_TableAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalTQL.g:302:3: ( (lv_columns_2_0= ruleTableField ) )
            // InternalTQL.g:303:4: (lv_columns_2_0= ruleTableField )
            {
            // InternalTQL.g:303:4: (lv_columns_2_0= ruleTableField )
            // InternalTQL.g:304:5: lv_columns_2_0= ruleTableField
            {

            					newCompositeNode(grammarAccess.getTarget_TableAccess().getColumnsTableFieldParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_columns_2_0=ruleTableField();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTarget_TableRule());
            					}
            					add(
            						current,
            						"columns",
            						lv_columns_2_0,
            						"org.xtext.example.tql.TQL.TableField");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTQL.g:321:3: (otherlv_3= ',' ( (lv_columns_4_0= ruleTableField ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalTQL.g:322:4: otherlv_3= ',' ( (lv_columns_4_0= ruleTableField ) )
            	    {
            	    otherlv_3=(Token)match(input,14,FOLLOW_3); 

            	    				newLeafNode(otherlv_3, grammarAccess.getTarget_TableAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalTQL.g:326:4: ( (lv_columns_4_0= ruleTableField ) )
            	    // InternalTQL.g:327:5: (lv_columns_4_0= ruleTableField )
            	    {
            	    // InternalTQL.g:327:5: (lv_columns_4_0= ruleTableField )
            	    // InternalTQL.g:328:6: lv_columns_4_0= ruleTableField
            	    {

            	    						newCompositeNode(grammarAccess.getTarget_TableAccess().getColumnsTableFieldParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_columns_4_0=ruleTableField();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTarget_TableRule());
            	    						}
            	    						add(
            	    							current,
            	    							"columns",
            	    							lv_columns_4_0,
            	    							"org.xtext.example.tql.TQL.TableField");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getTarget_TableAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleTarget_Table"


    // $ANTLR start "entryRuleTableField"
    // InternalTQL.g:354:1: entryRuleTableField returns [EObject current=null] : iv_ruleTableField= ruleTableField EOF ;
    public final EObject entryRuleTableField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableField = null;


        try {
            // InternalTQL.g:354:51: (iv_ruleTableField= ruleTableField EOF )
            // InternalTQL.g:355:2: iv_ruleTableField= ruleTableField EOF
            {
             newCompositeNode(grammarAccess.getTableFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTableField=ruleTableField();

            state._fsp--;

             current =iv_ruleTableField; 
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
    // $ANTLR end "entryRuleTableField"


    // $ANTLR start "ruleTableField"
    // InternalTQL.g:361:1: ruleTableField returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) otherlv_3= ',' ) ;
    public final EObject ruleTableField() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        Enumerator lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalTQL.g:367:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) otherlv_3= ',' ) )
            // InternalTQL.g:368:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) otherlv_3= ',' )
            {
            // InternalTQL.g:368:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) otherlv_3= ',' )
            // InternalTQL.g:369:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) otherlv_3= ','
            {
            // InternalTQL.g:369:3: ( (lv_name_0_0= ruleEString ) )
            // InternalTQL.g:370:4: (lv_name_0_0= ruleEString )
            {
            // InternalTQL.g:370:4: (lv_name_0_0= ruleEString )
            // InternalTQL.g:371:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTableFieldAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTableFieldRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.example.tql.TQL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getTableFieldAccess().getColonKeyword_1());
            		
            // InternalTQL.g:392:3: ( (lv_type_2_0= ruleType ) )
            // InternalTQL.g:393:4: (lv_type_2_0= ruleType )
            {
            // InternalTQL.g:393:4: (lv_type_2_0= ruleType )
            // InternalTQL.g:394:5: lv_type_2_0= ruleType
            {

            					newCompositeNode(grammarAccess.getTableFieldAccess().getTypeTypeEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_type_2_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTableFieldRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.xtext.example.tql.TQL.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getTableFieldAccess().getCommaKeyword_3());
            		

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
    // $ANTLR end "ruleTableField"


    // $ANTLR start "entryRuleExpression"
    // InternalTQL.g:419:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalTQL.g:419:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalTQL.g:420:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalTQL.g:426:1: ruleExpression returns [EObject current=null] : (this_parameterExpression_0= ruleparameterExpression | this_StringConstantExpression_1= ruleStringConstantExpression | this_BooleanConstantExpression_2= ruleBooleanConstantExpression | this_IntegerConstantExpression_3= ruleIntegerConstantExpression | this_InExpression_4= ruleInExpression | this_ConditionalStatement_5= ruleConditionalStatement | this_ParseExpression_6= ruleParseExpression | this_FloatConstantExpression_7= ruleFloatConstantExpression | this_BinaryOperationExpression_8= ruleBinaryOperationExpression | this_BooleanOperationExpression_9= ruleBooleanOperationExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_parameterExpression_0 = null;

        EObject this_StringConstantExpression_1 = null;

        EObject this_BooleanConstantExpression_2 = null;

        EObject this_IntegerConstantExpression_3 = null;

        EObject this_InExpression_4 = null;

        EObject this_ConditionalStatement_5 = null;

        EObject this_ParseExpression_6 = null;

        EObject this_FloatConstantExpression_7 = null;

        EObject this_BinaryOperationExpression_8 = null;

        EObject this_BooleanOperationExpression_9 = null;



        	enterRule();

        try {
            // InternalTQL.g:432:2: ( (this_parameterExpression_0= ruleparameterExpression | this_StringConstantExpression_1= ruleStringConstantExpression | this_BooleanConstantExpression_2= ruleBooleanConstantExpression | this_IntegerConstantExpression_3= ruleIntegerConstantExpression | this_InExpression_4= ruleInExpression | this_ConditionalStatement_5= ruleConditionalStatement | this_ParseExpression_6= ruleParseExpression | this_FloatConstantExpression_7= ruleFloatConstantExpression | this_BinaryOperationExpression_8= ruleBinaryOperationExpression | this_BooleanOperationExpression_9= ruleBooleanOperationExpression ) )
            // InternalTQL.g:433:2: (this_parameterExpression_0= ruleparameterExpression | this_StringConstantExpression_1= ruleStringConstantExpression | this_BooleanConstantExpression_2= ruleBooleanConstantExpression | this_IntegerConstantExpression_3= ruleIntegerConstantExpression | this_InExpression_4= ruleInExpression | this_ConditionalStatement_5= ruleConditionalStatement | this_ParseExpression_6= ruleParseExpression | this_FloatConstantExpression_7= ruleFloatConstantExpression | this_BinaryOperationExpression_8= ruleBinaryOperationExpression | this_BooleanOperationExpression_9= ruleBooleanOperationExpression )
            {
            // InternalTQL.g:433:2: (this_parameterExpression_0= ruleparameterExpression | this_StringConstantExpression_1= ruleStringConstantExpression | this_BooleanConstantExpression_2= ruleBooleanConstantExpression | this_IntegerConstantExpression_3= ruleIntegerConstantExpression | this_InExpression_4= ruleInExpression | this_ConditionalStatement_5= ruleConditionalStatement | this_ParseExpression_6= ruleParseExpression | this_FloatConstantExpression_7= ruleFloatConstantExpression | this_BinaryOperationExpression_8= ruleBinaryOperationExpression | this_BooleanOperationExpression_9= ruleBooleanOperationExpression )
            int alt4=10;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt4=1;
                }
                break;
            case 28:
                {
                alt4=2;
                }
                break;
            case 29:
                {
                alt4=3;
                }
                break;
            case 31:
                {
                alt4=4;
                }
                break;
            case 32:
                {
                alt4=5;
                }
                break;
            case 35:
                {
                alt4=6;
                }
                break;
            case 40:
                {
                alt4=7;
                }
                break;
            case 43:
                {
                alt4=8;
                }
                break;
            case 44:
                {
                alt4=9;
                }
                break;
            case 17:
                {
                alt4=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalTQL.g:434:3: this_parameterExpression_0= ruleparameterExpression
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getParameterExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_parameterExpression_0=ruleparameterExpression();

                    state._fsp--;


                    			current = this_parameterExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTQL.g:443:3: this_StringConstantExpression_1= ruleStringConstantExpression
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getStringConstantExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringConstantExpression_1=ruleStringConstantExpression();

                    state._fsp--;


                    			current = this_StringConstantExpression_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTQL.g:452:3: this_BooleanConstantExpression_2= ruleBooleanConstantExpression
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getBooleanConstantExpressionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanConstantExpression_2=ruleBooleanConstantExpression();

                    state._fsp--;


                    			current = this_BooleanConstantExpression_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalTQL.g:461:3: this_IntegerConstantExpression_3= ruleIntegerConstantExpression
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getIntegerConstantExpressionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntegerConstantExpression_3=ruleIntegerConstantExpression();

                    state._fsp--;


                    			current = this_IntegerConstantExpression_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalTQL.g:470:3: this_InExpression_4= ruleInExpression
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getInExpressionParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_InExpression_4=ruleInExpression();

                    state._fsp--;


                    			current = this_InExpression_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalTQL.g:479:3: this_ConditionalStatement_5= ruleConditionalStatement
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getConditionalStatementParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConditionalStatement_5=ruleConditionalStatement();

                    state._fsp--;


                    			current = this_ConditionalStatement_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalTQL.g:488:3: this_ParseExpression_6= ruleParseExpression
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getParseExpressionParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParseExpression_6=ruleParseExpression();

                    state._fsp--;


                    			current = this_ParseExpression_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalTQL.g:497:3: this_FloatConstantExpression_7= ruleFloatConstantExpression
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getFloatConstantExpressionParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_FloatConstantExpression_7=ruleFloatConstantExpression();

                    state._fsp--;


                    			current = this_FloatConstantExpression_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalTQL.g:506:3: this_BinaryOperationExpression_8= ruleBinaryOperationExpression
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getBinaryOperationExpressionParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_BinaryOperationExpression_8=ruleBinaryOperationExpression();

                    state._fsp--;


                    			current = this_BinaryOperationExpression_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalTQL.g:515:3: this_BooleanOperationExpression_9= ruleBooleanOperationExpression
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getBooleanOperationExpressionParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanOperationExpression_9=ruleBooleanOperationExpression();

                    state._fsp--;


                    			current = this_BooleanOperationExpression_9;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleStatement"
    // InternalTQL.g:527:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalTQL.g:527:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalTQL.g:528:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalTQL.g:534:1: ruleStatement returns [EObject current=null] : this_ConditionalStatement_0= ruleConditionalStatement ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_ConditionalStatement_0 = null;



        	enterRule();

        try {
            // InternalTQL.g:540:2: (this_ConditionalStatement_0= ruleConditionalStatement )
            // InternalTQL.g:541:2: this_ConditionalStatement_0= ruleConditionalStatement
            {

            		newCompositeNode(grammarAccess.getStatementAccess().getConditionalStatementParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_ConditionalStatement_0=ruleConditionalStatement();

            state._fsp--;


            		current = this_ConditionalStatement_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleEString"
    // InternalTQL.g:552:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalTQL.g:552:47: (iv_ruleEString= ruleEString EOF )
            // InternalTQL.g:553:2: iv_ruleEString= ruleEString EOF
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
    // InternalTQL.g:559:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalTQL.g:565:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalTQL.g:566:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalTQL.g:566:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalTQL.g:567:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTQL.g:575:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleBooleanOperationExpression"
    // InternalTQL.g:586:1: entryRuleBooleanOperationExpression returns [EObject current=null] : iv_ruleBooleanOperationExpression= ruleBooleanOperationExpression EOF ;
    public final EObject entryRuleBooleanOperationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanOperationExpression = null;


        try {
            // InternalTQL.g:586:67: (iv_ruleBooleanOperationExpression= ruleBooleanOperationExpression EOF )
            // InternalTQL.g:587:2: iv_ruleBooleanOperationExpression= ruleBooleanOperationExpression EOF
            {
             newCompositeNode(grammarAccess.getBooleanOperationExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanOperationExpression=ruleBooleanOperationExpression();

            state._fsp--;

             current =iv_ruleBooleanOperationExpression; 
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
    // $ANTLR end "entryRuleBooleanOperationExpression"


    // $ANTLR start "ruleBooleanOperationExpression"
    // InternalTQL.g:593:1: ruleBooleanOperationExpression returns [EObject current=null] : (otherlv_0= 'BooleanOperationExpression' otherlv_1= '{' (otherlv_2= 'operation' ( (lv_operation_3_0= ruleBooleanFunction ) ) )? otherlv_4= 'right' ( ( ruleEString ) ) otherlv_6= 'left' ( ( ruleEString ) ) otherlv_8= '}' ) ;
    public final EObject ruleBooleanOperationExpression() throws RecognitionException {
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
            // InternalTQL.g:599:2: ( (otherlv_0= 'BooleanOperationExpression' otherlv_1= '{' (otherlv_2= 'operation' ( (lv_operation_3_0= ruleBooleanFunction ) ) )? otherlv_4= 'right' ( ( ruleEString ) ) otherlv_6= 'left' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalTQL.g:600:2: (otherlv_0= 'BooleanOperationExpression' otherlv_1= '{' (otherlv_2= 'operation' ( (lv_operation_3_0= ruleBooleanFunction ) ) )? otherlv_4= 'right' ( ( ruleEString ) ) otherlv_6= 'left' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalTQL.g:600:2: (otherlv_0= 'BooleanOperationExpression' otherlv_1= '{' (otherlv_2= 'operation' ( (lv_operation_3_0= ruleBooleanFunction ) ) )? otherlv_4= 'right' ( ( ruleEString ) ) otherlv_6= 'left' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalTQL.g:601:3: otherlv_0= 'BooleanOperationExpression' otherlv_1= '{' (otherlv_2= 'operation' ( (lv_operation_3_0= ruleBooleanFunction ) ) )? otherlv_4= 'right' ( ( ruleEString ) ) otherlv_6= 'left' ( ( ruleEString ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getBooleanOperationExpressionAccess().getBooleanOperationExpressionKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getBooleanOperationExpressionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalTQL.g:609:3: (otherlv_2= 'operation' ( (lv_operation_3_0= ruleBooleanFunction ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalTQL.g:610:4: otherlv_2= 'operation' ( (lv_operation_3_0= ruleBooleanFunction ) )
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getBooleanOperationExpressionAccess().getOperationKeyword_2_0());
                    			
                    // InternalTQL.g:614:4: ( (lv_operation_3_0= ruleBooleanFunction ) )
                    // InternalTQL.g:615:5: (lv_operation_3_0= ruleBooleanFunction )
                    {
                    // InternalTQL.g:615:5: (lv_operation_3_0= ruleBooleanFunction )
                    // InternalTQL.g:616:6: lv_operation_3_0= ruleBooleanFunction
                    {

                    						newCompositeNode(grammarAccess.getBooleanOperationExpressionAccess().getOperationBooleanFunctionEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_operation_3_0=ruleBooleanFunction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBooleanOperationExpressionRule());
                    						}
                    						set(
                    							current,
                    							"operation",
                    							lv_operation_3_0,
                    							"org.xtext.example.tql.TQL.BooleanFunction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getBooleanOperationExpressionAccess().getRightKeyword_3());
            		
            // InternalTQL.g:638:3: ( ( ruleEString ) )
            // InternalTQL.g:639:4: ( ruleEString )
            {
            // InternalTQL.g:639:4: ( ruleEString )
            // InternalTQL.g:640:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBooleanOperationExpressionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getBooleanOperationExpressionAccess().getRightExpressionCrossReference_4_0());
            				
            pushFollow(FOLLOW_12);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getBooleanOperationExpressionAccess().getLeftKeyword_5());
            		
            // InternalTQL.g:658:3: ( ( ruleEString ) )
            // InternalTQL.g:659:4: ( ruleEString )
            {
            // InternalTQL.g:659:4: ( ruleEString )
            // InternalTQL.g:660:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBooleanOperationExpressionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getBooleanOperationExpressionAccess().getLeftExpressionCrossReference_6_0());
            				
            pushFollow(FOLLOW_13);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getBooleanOperationExpressionAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleBooleanOperationExpression"


    // $ANTLR start "entryRuleTransformationCall"
    // InternalTQL.g:682:1: entryRuleTransformationCall returns [EObject current=null] : iv_ruleTransformationCall= ruleTransformationCall EOF ;
    public final EObject entryRuleTransformationCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransformationCall = null;


        try {
            // InternalTQL.g:682:59: (iv_ruleTransformationCall= ruleTransformationCall EOF )
            // InternalTQL.g:683:2: iv_ruleTransformationCall= ruleTransformationCall EOF
            {
             newCompositeNode(grammarAccess.getTransformationCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransformationCall=ruleTransformationCall();

            state._fsp--;

             current =iv_ruleTransformationCall; 
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
    // $ANTLR end "entryRuleTransformationCall"


    // $ANTLR start "ruleTransformationCall"
    // InternalTQL.g:689:1: ruleTransformationCall returns [EObject current=null] : (otherlv_0= 'TransformationCall' otherlv_1= '{' otherlv_2= 'transformation' ( ( ruleEString ) ) (otherlv_4= 'parameters' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}' ) ;
    public final EObject ruleTransformationCall() throws RecognitionException {
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
            // InternalTQL.g:695:2: ( (otherlv_0= 'TransformationCall' otherlv_1= '{' otherlv_2= 'transformation' ( ( ruleEString ) ) (otherlv_4= 'parameters' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}' ) )
            // InternalTQL.g:696:2: (otherlv_0= 'TransformationCall' otherlv_1= '{' otherlv_2= 'transformation' ( ( ruleEString ) ) (otherlv_4= 'parameters' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}' )
            {
            // InternalTQL.g:696:2: (otherlv_0= 'TransformationCall' otherlv_1= '{' otherlv_2= 'transformation' ( ( ruleEString ) ) (otherlv_4= 'parameters' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}' )
            // InternalTQL.g:697:3: otherlv_0= 'TransformationCall' otherlv_1= '{' otherlv_2= 'transformation' ( ( ruleEString ) ) (otherlv_4= 'parameters' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTransformationCallAccess().getTransformationCallKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getTransformationCallAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getTransformationCallAccess().getTransformationKeyword_2());
            		
            // InternalTQL.g:709:3: ( ( ruleEString ) )
            // InternalTQL.g:710:4: ( ruleEString )
            {
            // InternalTQL.g:710:4: ( ruleEString )
            // InternalTQL.g:711:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransformationCallRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransformationCallAccess().getTransformationTransformationCrossReference_3_0());
            				
            pushFollow(FOLLOW_15);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTQL.g:725:3: (otherlv_4= 'parameters' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalTQL.g:726:4: otherlv_4= 'parameters' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getTransformationCallAccess().getParametersKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getTransformationCallAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalTQL.g:734:4: ( ( ruleEString ) )
                    // InternalTQL.g:735:5: ( ruleEString )
                    {
                    // InternalTQL.g:735:5: ( ruleEString )
                    // InternalTQL.g:736:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransformationCallRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTransformationCallAccess().getParametersTableFieldCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTQL.g:750:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==14) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalTQL.g:751:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getTransformationCallAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalTQL.g:755:5: ( ( ruleEString ) )
                    	    // InternalTQL.g:756:6: ( ruleEString )
                    	    {
                    	    // InternalTQL.g:756:6: ( ruleEString )
                    	    // InternalTQL.g:757:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getTransformationCallRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getTransformationCallAccess().getParametersTableFieldCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,25,FOLLOW_13); 

                    				newLeafNode(otherlv_9, grammarAccess.getTransformationCallAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getTransformationCallAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleTransformationCall"


    // $ANTLR start "entryRuleparameterExpression"
    // InternalTQL.g:785:1: entryRuleparameterExpression returns [EObject current=null] : iv_ruleparameterExpression= ruleparameterExpression EOF ;
    public final EObject entryRuleparameterExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleparameterExpression = null;


        try {
            // InternalTQL.g:785:60: (iv_ruleparameterExpression= ruleparameterExpression EOF )
            // InternalTQL.g:786:2: iv_ruleparameterExpression= ruleparameterExpression EOF
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
    // InternalTQL.g:792:1: ruleparameterExpression returns [EObject current=null] : (otherlv_0= 'parameterExpression' otherlv_1= '{' otherlv_2= 'parameter' ( ( ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleparameterExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalTQL.g:798:2: ( (otherlv_0= 'parameterExpression' otherlv_1= '{' otherlv_2= 'parameter' ( ( ruleEString ) ) otherlv_4= '}' ) )
            // InternalTQL.g:799:2: (otherlv_0= 'parameterExpression' otherlv_1= '{' otherlv_2= 'parameter' ( ( ruleEString ) ) otherlv_4= '}' )
            {
            // InternalTQL.g:799:2: (otherlv_0= 'parameterExpression' otherlv_1= '{' otherlv_2= 'parameter' ( ( ruleEString ) ) otherlv_4= '}' )
            // InternalTQL.g:800:3: otherlv_0= 'parameterExpression' otherlv_1= '{' otherlv_2= 'parameter' ( ( ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterExpressionAccess().getParameterExpressionKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterExpressionAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterExpressionAccess().getParameterKeyword_2());
            		
            // InternalTQL.g:812:3: ( ( ruleEString ) )
            // InternalTQL.g:813:4: ( ruleEString )
            {
            // InternalTQL.g:813:4: ( ruleEString )
            // InternalTQL.g:814:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterExpressionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getParameterExpressionAccess().getParameterParameterCrossReference_3_0());
            				
            pushFollow(FOLLOW_13);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getParameterExpressionAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalTQL.g:836:1: entryRuleStringConstantExpression returns [EObject current=null] : iv_ruleStringConstantExpression= ruleStringConstantExpression EOF ;
    public final EObject entryRuleStringConstantExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringConstantExpression = null;


        try {
            // InternalTQL.g:836:65: (iv_ruleStringConstantExpression= ruleStringConstantExpression EOF )
            // InternalTQL.g:837:2: iv_ruleStringConstantExpression= ruleStringConstantExpression EOF
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
    // InternalTQL.g:843:1: ruleStringConstantExpression returns [EObject current=null] : (otherlv_0= 'StringConstantExpression' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleStringConstantExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalTQL.g:849:2: ( (otherlv_0= 'StringConstantExpression' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}' ) )
            // InternalTQL.g:850:2: (otherlv_0= 'StringConstantExpression' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}' )
            {
            // InternalTQL.g:850:2: (otherlv_0= 'StringConstantExpression' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}' )
            // InternalTQL.g:851:3: otherlv_0= 'StringConstantExpression' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getStringConstantExpressionAccess().getStringConstantExpressionKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getStringConstantExpressionAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getStringConstantExpressionAccess().getValueKeyword_2());
            		
            // InternalTQL.g:863:3: ( (lv_value_3_0= ruleEString ) )
            // InternalTQL.g:864:4: (lv_value_3_0= ruleEString )
            {
            // InternalTQL.g:864:4: (lv_value_3_0= ruleEString )
            // InternalTQL.g:865:5: lv_value_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStringConstantExpressionAccess().getValueEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_value_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStringConstantExpressionRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.xtext.example.tql.TQL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

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
    // InternalTQL.g:890:1: entryRuleBooleanConstantExpression returns [EObject current=null] : iv_ruleBooleanConstantExpression= ruleBooleanConstantExpression EOF ;
    public final EObject entryRuleBooleanConstantExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanConstantExpression = null;


        try {
            // InternalTQL.g:890:66: (iv_ruleBooleanConstantExpression= ruleBooleanConstantExpression EOF )
            // InternalTQL.g:891:2: iv_ruleBooleanConstantExpression= ruleBooleanConstantExpression EOF
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
    // InternalTQL.g:897:1: ruleBooleanConstantExpression returns [EObject current=null] : ( ( (lv_value_0_0= 'value' ) ) otherlv_1= 'BooleanConstantExpression' ) ;
    public final EObject ruleBooleanConstantExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTQL.g:903:2: ( ( ( (lv_value_0_0= 'value' ) ) otherlv_1= 'BooleanConstantExpression' ) )
            // InternalTQL.g:904:2: ( ( (lv_value_0_0= 'value' ) ) otherlv_1= 'BooleanConstantExpression' )
            {
            // InternalTQL.g:904:2: ( ( (lv_value_0_0= 'value' ) ) otherlv_1= 'BooleanConstantExpression' )
            // InternalTQL.g:905:3: ( (lv_value_0_0= 'value' ) ) otherlv_1= 'BooleanConstantExpression'
            {
            // InternalTQL.g:905:3: ( (lv_value_0_0= 'value' ) )
            // InternalTQL.g:906:4: (lv_value_0_0= 'value' )
            {
            // InternalTQL.g:906:4: (lv_value_0_0= 'value' )
            // InternalTQL.g:907:5: lv_value_0_0= 'value'
            {
            lv_value_0_0=(Token)match(input,29,FOLLOW_20); 

            					newLeafNode(lv_value_0_0, grammarAccess.getBooleanConstantExpressionAccess().getValueValueKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBooleanConstantExpressionRule());
            					}
            					setWithLastConsumed(current, "value", lv_value_0_0 != null, "value");
            				

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_2); 

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
    // InternalTQL.g:927:1: entryRuleIntegerConstantExpression returns [EObject current=null] : iv_ruleIntegerConstantExpression= ruleIntegerConstantExpression EOF ;
    public final EObject entryRuleIntegerConstantExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerConstantExpression = null;


        try {
            // InternalTQL.g:927:66: (iv_ruleIntegerConstantExpression= ruleIntegerConstantExpression EOF )
            // InternalTQL.g:928:2: iv_ruleIntegerConstantExpression= ruleIntegerConstantExpression EOF
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
    // InternalTQL.g:934:1: ruleIntegerConstantExpression returns [EObject current=null] : (otherlv_0= 'IntegerConstantExpression' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEInt ) ) otherlv_4= '}' ) ;
    public final EObject ruleIntegerConstantExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalTQL.g:940:2: ( (otherlv_0= 'IntegerConstantExpression' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEInt ) ) otherlv_4= '}' ) )
            // InternalTQL.g:941:2: (otherlv_0= 'IntegerConstantExpression' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEInt ) ) otherlv_4= '}' )
            {
            // InternalTQL.g:941:2: (otherlv_0= 'IntegerConstantExpression' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEInt ) ) otherlv_4= '}' )
            // InternalTQL.g:942:3: otherlv_0= 'IntegerConstantExpression' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEInt ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getIntegerConstantExpressionAccess().getIntegerConstantExpressionKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getIntegerConstantExpressionAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,29,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getIntegerConstantExpressionAccess().getValueKeyword_2());
            		
            // InternalTQL.g:954:3: ( (lv_value_3_0= ruleEInt ) )
            // InternalTQL.g:955:4: (lv_value_3_0= ruleEInt )
            {
            // InternalTQL.g:955:4: (lv_value_3_0= ruleEInt )
            // InternalTQL.g:956:5: lv_value_3_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getIntegerConstantExpressionAccess().getValueEIntParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_value_3_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntegerConstantExpressionRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.xtext.example.tql.TQL.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

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
    // InternalTQL.g:981:1: entryRuleInExpression returns [EObject current=null] : iv_ruleInExpression= ruleInExpression EOF ;
    public final EObject entryRuleInExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInExpression = null;


        try {
            // InternalTQL.g:981:53: (iv_ruleInExpression= ruleInExpression EOF )
            // InternalTQL.g:982:2: iv_ruleInExpression= ruleInExpression EOF
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
    // InternalTQL.g:988:1: ruleInExpression returns [EObject current=null] : (otherlv_0= 'InExpression' otherlv_1= '{' (otherlv_2= 'statement' ( ( ruleEString ) ) )? otherlv_4= 'constantSet' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= '}' ) ;
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
            // InternalTQL.g:994:2: ( (otherlv_0= 'InExpression' otherlv_1= '{' (otherlv_2= 'statement' ( ( ruleEString ) ) )? otherlv_4= 'constantSet' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= '}' ) )
            // InternalTQL.g:995:2: (otherlv_0= 'InExpression' otherlv_1= '{' (otherlv_2= 'statement' ( ( ruleEString ) ) )? otherlv_4= 'constantSet' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= '}' )
            {
            // InternalTQL.g:995:2: (otherlv_0= 'InExpression' otherlv_1= '{' (otherlv_2= 'statement' ( ( ruleEString ) ) )? otherlv_4= 'constantSet' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= '}' )
            // InternalTQL.g:996:3: otherlv_0= 'InExpression' otherlv_1= '{' (otherlv_2= 'statement' ( ( ruleEString ) ) )? otherlv_4= 'constantSet' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getInExpressionAccess().getInExpressionKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getInExpressionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalTQL.g:1004:3: (otherlv_2= 'statement' ( ( ruleEString ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==33) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalTQL.g:1005:4: otherlv_2= 'statement' ( ( ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,33,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getInExpressionAccess().getStatementKeyword_2_0());
                    			
                    // InternalTQL.g:1009:4: ( ( ruleEString ) )
                    // InternalTQL.g:1010:5: ( ruleEString )
                    {
                    // InternalTQL.g:1010:5: ( ruleEString )
                    // InternalTQL.g:1011:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInExpressionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getInExpressionAccess().getStatementExpressionCrossReference_2_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,34,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getInExpressionAccess().getConstantSetKeyword_3());
            		
            otherlv_5=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getInExpressionAccess().getLeftParenthesisKeyword_4());
            		
            // InternalTQL.g:1034:3: ( ( ruleEString ) )
            // InternalTQL.g:1035:4: ( ruleEString )
            {
            // InternalTQL.g:1035:4: ( ruleEString )
            // InternalTQL.g:1036:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInExpressionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getInExpressionAccess().getConstantSetConstantExpressionCrossReference_5_0());
            				
            pushFollow(FOLLOW_17);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTQL.g:1050:3: (otherlv_7= ',' ( ( ruleEString ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==14) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalTQL.g:1051:4: otherlv_7= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_7=(Token)match(input,14,FOLLOW_3); 

            	    				newLeafNode(otherlv_7, grammarAccess.getInExpressionAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalTQL.g:1055:4: ( ( ruleEString ) )
            	    // InternalTQL.g:1056:5: ( ruleEString )
            	    {
            	    // InternalTQL.g:1056:5: ( ruleEString )
            	    // InternalTQL.g:1057:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getInExpressionRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getInExpressionAccess().getConstantSetConstantExpressionCrossReference_6_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_9=(Token)match(input,25,FOLLOW_13); 

            			newLeafNode(otherlv_9, grammarAccess.getInExpressionAccess().getRightParenthesisKeyword_7());
            		
            otherlv_10=(Token)match(input,15,FOLLOW_2); 

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


    // $ANTLR start "entryRuleConditionalStatement"
    // InternalTQL.g:1084:1: entryRuleConditionalStatement returns [EObject current=null] : iv_ruleConditionalStatement= ruleConditionalStatement EOF ;
    public final EObject entryRuleConditionalStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalStatement = null;


        try {
            // InternalTQL.g:1084:61: (iv_ruleConditionalStatement= ruleConditionalStatement EOF )
            // InternalTQL.g:1085:2: iv_ruleConditionalStatement= ruleConditionalStatement EOF
            {
             newCompositeNode(grammarAccess.getConditionalStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionalStatement=ruleConditionalStatement();

            state._fsp--;

             current =iv_ruleConditionalStatement; 
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
    // $ANTLR end "entryRuleConditionalStatement"


    // $ANTLR start "ruleConditionalStatement"
    // InternalTQL.g:1091:1: ruleConditionalStatement returns [EObject current=null] : (otherlv_0= 'ConditionalStatement' otherlv_1= '{' otherlv_2= 'condition' ( ( ruleEString ) ) otherlv_4= 'booleanoperationexpression' ( ( ruleEString ) ) otherlv_6= 'ifBody' otherlv_7= '{' ( (lv_ifBody_8_0= ruleStatement ) ) (otherlv_9= ',' ( (lv_ifBody_10_0= ruleStatement ) ) )* otherlv_11= '}' otherlv_12= 'elseBody' otherlv_13= '{' ( (lv_elseBody_14_0= ruleStatement ) ) (otherlv_15= ',' ( (lv_elseBody_16_0= ruleStatement ) ) )* otherlv_17= '}' otherlv_18= '}' ) ;
    public final EObject ruleConditionalStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        EObject lv_ifBody_8_0 = null;

        EObject lv_ifBody_10_0 = null;

        EObject lv_elseBody_14_0 = null;

        EObject lv_elseBody_16_0 = null;



        	enterRule();

        try {
            // InternalTQL.g:1097:2: ( (otherlv_0= 'ConditionalStatement' otherlv_1= '{' otherlv_2= 'condition' ( ( ruleEString ) ) otherlv_4= 'booleanoperationexpression' ( ( ruleEString ) ) otherlv_6= 'ifBody' otherlv_7= '{' ( (lv_ifBody_8_0= ruleStatement ) ) (otherlv_9= ',' ( (lv_ifBody_10_0= ruleStatement ) ) )* otherlv_11= '}' otherlv_12= 'elseBody' otherlv_13= '{' ( (lv_elseBody_14_0= ruleStatement ) ) (otherlv_15= ',' ( (lv_elseBody_16_0= ruleStatement ) ) )* otherlv_17= '}' otherlv_18= '}' ) )
            // InternalTQL.g:1098:2: (otherlv_0= 'ConditionalStatement' otherlv_1= '{' otherlv_2= 'condition' ( ( ruleEString ) ) otherlv_4= 'booleanoperationexpression' ( ( ruleEString ) ) otherlv_6= 'ifBody' otherlv_7= '{' ( (lv_ifBody_8_0= ruleStatement ) ) (otherlv_9= ',' ( (lv_ifBody_10_0= ruleStatement ) ) )* otherlv_11= '}' otherlv_12= 'elseBody' otherlv_13= '{' ( (lv_elseBody_14_0= ruleStatement ) ) (otherlv_15= ',' ( (lv_elseBody_16_0= ruleStatement ) ) )* otherlv_17= '}' otherlv_18= '}' )
            {
            // InternalTQL.g:1098:2: (otherlv_0= 'ConditionalStatement' otherlv_1= '{' otherlv_2= 'condition' ( ( ruleEString ) ) otherlv_4= 'booleanoperationexpression' ( ( ruleEString ) ) otherlv_6= 'ifBody' otherlv_7= '{' ( (lv_ifBody_8_0= ruleStatement ) ) (otherlv_9= ',' ( (lv_ifBody_10_0= ruleStatement ) ) )* otherlv_11= '}' otherlv_12= 'elseBody' otherlv_13= '{' ( (lv_elseBody_14_0= ruleStatement ) ) (otherlv_15= ',' ( (lv_elseBody_16_0= ruleStatement ) ) )* otherlv_17= '}' otherlv_18= '}' )
            // InternalTQL.g:1099:3: otherlv_0= 'ConditionalStatement' otherlv_1= '{' otherlv_2= 'condition' ( ( ruleEString ) ) otherlv_4= 'booleanoperationexpression' ( ( ruleEString ) ) otherlv_6= 'ifBody' otherlv_7= '{' ( (lv_ifBody_8_0= ruleStatement ) ) (otherlv_9= ',' ( (lv_ifBody_10_0= ruleStatement ) ) )* otherlv_11= '}' otherlv_12= 'elseBody' otherlv_13= '{' ( (lv_elseBody_14_0= ruleStatement ) ) (otherlv_15= ',' ( (lv_elseBody_16_0= ruleStatement ) ) )* otherlv_17= '}' otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionalStatementAccess().getConditionalStatementKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getConditionalStatementAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getConditionalStatementAccess().getConditionKeyword_2());
            		
            // InternalTQL.g:1111:3: ( ( ruleEString ) )
            // InternalTQL.g:1112:4: ( ruleEString )
            {
            // InternalTQL.g:1112:4: ( ruleEString )
            // InternalTQL.g:1113:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionalStatementRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConditionalStatementAccess().getConditionExpressionCrossReference_3_0());
            				
            pushFollow(FOLLOW_25);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getConditionalStatementAccess().getBooleanoperationexpressionKeyword_4());
            		
            // InternalTQL.g:1131:3: ( ( ruleEString ) )
            // InternalTQL.g:1132:4: ( ruleEString )
            {
            // InternalTQL.g:1132:4: ( ruleEString )
            // InternalTQL.g:1133:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionalStatementRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConditionalStatementAccess().getBooleanoperationexpressionBooleanOperationExpressionCrossReference_5_0());
            				
            pushFollow(FOLLOW_26);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,38,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getConditionalStatementAccess().getIfBodyKeyword_6());
            		
            otherlv_7=(Token)match(input,13,FOLLOW_27); 

            			newLeafNode(otherlv_7, grammarAccess.getConditionalStatementAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalTQL.g:1155:3: ( (lv_ifBody_8_0= ruleStatement ) )
            // InternalTQL.g:1156:4: (lv_ifBody_8_0= ruleStatement )
            {
            // InternalTQL.g:1156:4: (lv_ifBody_8_0= ruleStatement )
            // InternalTQL.g:1157:5: lv_ifBody_8_0= ruleStatement
            {

            					newCompositeNode(grammarAccess.getConditionalStatementAccess().getIfBodyStatementParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_5);
            lv_ifBody_8_0=ruleStatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionalStatementRule());
            					}
            					add(
            						current,
            						"ifBody",
            						lv_ifBody_8_0,
            						"org.xtext.example.tql.TQL.Statement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTQL.g:1174:3: (otherlv_9= ',' ( (lv_ifBody_10_0= ruleStatement ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==14) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalTQL.g:1175:4: otherlv_9= ',' ( (lv_ifBody_10_0= ruleStatement ) )
            	    {
            	    otherlv_9=(Token)match(input,14,FOLLOW_27); 

            	    				newLeafNode(otherlv_9, grammarAccess.getConditionalStatementAccess().getCommaKeyword_9_0());
            	    			
            	    // InternalTQL.g:1179:4: ( (lv_ifBody_10_0= ruleStatement ) )
            	    // InternalTQL.g:1180:5: (lv_ifBody_10_0= ruleStatement )
            	    {
            	    // InternalTQL.g:1180:5: (lv_ifBody_10_0= ruleStatement )
            	    // InternalTQL.g:1181:6: lv_ifBody_10_0= ruleStatement
            	    {

            	    						newCompositeNode(grammarAccess.getConditionalStatementAccess().getIfBodyStatementParserRuleCall_9_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_ifBody_10_0=ruleStatement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConditionalStatementRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ifBody",
            	    							lv_ifBody_10_0,
            	    							"org.xtext.example.tql.TQL.Statement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_11=(Token)match(input,15,FOLLOW_28); 

            			newLeafNode(otherlv_11, grammarAccess.getConditionalStatementAccess().getRightCurlyBracketKeyword_10());
            		
            otherlv_12=(Token)match(input,39,FOLLOW_4); 

            			newLeafNode(otherlv_12, grammarAccess.getConditionalStatementAccess().getElseBodyKeyword_11());
            		
            otherlv_13=(Token)match(input,13,FOLLOW_27); 

            			newLeafNode(otherlv_13, grammarAccess.getConditionalStatementAccess().getLeftCurlyBracketKeyword_12());
            		
            // InternalTQL.g:1211:3: ( (lv_elseBody_14_0= ruleStatement ) )
            // InternalTQL.g:1212:4: (lv_elseBody_14_0= ruleStatement )
            {
            // InternalTQL.g:1212:4: (lv_elseBody_14_0= ruleStatement )
            // InternalTQL.g:1213:5: lv_elseBody_14_0= ruleStatement
            {

            					newCompositeNode(grammarAccess.getConditionalStatementAccess().getElseBodyStatementParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_5);
            lv_elseBody_14_0=ruleStatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionalStatementRule());
            					}
            					add(
            						current,
            						"elseBody",
            						lv_elseBody_14_0,
            						"org.xtext.example.tql.TQL.Statement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTQL.g:1230:3: (otherlv_15= ',' ( (lv_elseBody_16_0= ruleStatement ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==14) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalTQL.g:1231:4: otherlv_15= ',' ( (lv_elseBody_16_0= ruleStatement ) )
            	    {
            	    otherlv_15=(Token)match(input,14,FOLLOW_27); 

            	    				newLeafNode(otherlv_15, grammarAccess.getConditionalStatementAccess().getCommaKeyword_14_0());
            	    			
            	    // InternalTQL.g:1235:4: ( (lv_elseBody_16_0= ruleStatement ) )
            	    // InternalTQL.g:1236:5: (lv_elseBody_16_0= ruleStatement )
            	    {
            	    // InternalTQL.g:1236:5: (lv_elseBody_16_0= ruleStatement )
            	    // InternalTQL.g:1237:6: lv_elseBody_16_0= ruleStatement
            	    {

            	    						newCompositeNode(grammarAccess.getConditionalStatementAccess().getElseBodyStatementParserRuleCall_14_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_elseBody_16_0=ruleStatement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConditionalStatementRule());
            	    						}
            	    						add(
            	    							current,
            	    							"elseBody",
            	    							lv_elseBody_16_0,
            	    							"org.xtext.example.tql.TQL.Statement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_17=(Token)match(input,15,FOLLOW_13); 

            			newLeafNode(otherlv_17, grammarAccess.getConditionalStatementAccess().getRightCurlyBracketKeyword_15());
            		
            otherlv_18=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getConditionalStatementAccess().getRightCurlyBracketKeyword_16());
            		

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
    // $ANTLR end "ruleConditionalStatement"


    // $ANTLR start "entryRuleParseExpression"
    // InternalTQL.g:1267:1: entryRuleParseExpression returns [EObject current=null] : iv_ruleParseExpression= ruleParseExpression EOF ;
    public final EObject entryRuleParseExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParseExpression = null;


        try {
            // InternalTQL.g:1267:56: (iv_ruleParseExpression= ruleParseExpression EOF )
            // InternalTQL.g:1268:2: iv_ruleParseExpression= ruleParseExpression EOF
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
    // InternalTQL.g:1274:1: ruleParseExpression returns [EObject current=null] : (otherlv_0= 'ParseExpression' otherlv_1= '{' (otherlv_2= 'outputType' ( (lv_outputType_3_0= ruleType ) ) )? otherlv_4= 'expression' ( ( ruleEString ) ) otherlv_6= '}' ) ;
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
            // InternalTQL.g:1280:2: ( (otherlv_0= 'ParseExpression' otherlv_1= '{' (otherlv_2= 'outputType' ( (lv_outputType_3_0= ruleType ) ) )? otherlv_4= 'expression' ( ( ruleEString ) ) otherlv_6= '}' ) )
            // InternalTQL.g:1281:2: (otherlv_0= 'ParseExpression' otherlv_1= '{' (otherlv_2= 'outputType' ( (lv_outputType_3_0= ruleType ) ) )? otherlv_4= 'expression' ( ( ruleEString ) ) otherlv_6= '}' )
            {
            // InternalTQL.g:1281:2: (otherlv_0= 'ParseExpression' otherlv_1= '{' (otherlv_2= 'outputType' ( (lv_outputType_3_0= ruleType ) ) )? otherlv_4= 'expression' ( ( ruleEString ) ) otherlv_6= '}' )
            // InternalTQL.g:1282:3: otherlv_0= 'ParseExpression' otherlv_1= '{' (otherlv_2= 'outputType' ( (lv_outputType_3_0= ruleType ) ) )? otherlv_4= 'expression' ( ( ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getParseExpressionAccess().getParseExpressionKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getParseExpressionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalTQL.g:1290:3: (otherlv_2= 'outputType' ( (lv_outputType_3_0= ruleType ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==41) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalTQL.g:1291:4: otherlv_2= 'outputType' ( (lv_outputType_3_0= ruleType ) )
                    {
                    otherlv_2=(Token)match(input,41,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getParseExpressionAccess().getOutputTypeKeyword_2_0());
                    			
                    // InternalTQL.g:1295:4: ( (lv_outputType_3_0= ruleType ) )
                    // InternalTQL.g:1296:5: (lv_outputType_3_0= ruleType )
                    {
                    // InternalTQL.g:1296:5: (lv_outputType_3_0= ruleType )
                    // InternalTQL.g:1297:6: lv_outputType_3_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getParseExpressionAccess().getOutputTypeTypeEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_outputType_3_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParseExpressionRule());
                    						}
                    						set(
                    							current,
                    							"outputType",
                    							lv_outputType_3_0,
                    							"org.xtext.example.tql.TQL.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getParseExpressionAccess().getExpressionKeyword_3());
            		
            // InternalTQL.g:1319:3: ( ( ruleEString ) )
            // InternalTQL.g:1320:4: ( ruleEString )
            {
            // InternalTQL.g:1320:4: ( ruleEString )
            // InternalTQL.g:1321:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParseExpressionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getParseExpressionAccess().getExpressionExpressionCrossReference_4_0());
            				
            pushFollow(FOLLOW_13);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

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
    // InternalTQL.g:1343:1: entryRuleFloatConstantExpression returns [EObject current=null] : iv_ruleFloatConstantExpression= ruleFloatConstantExpression EOF ;
    public final EObject entryRuleFloatConstantExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatConstantExpression = null;


        try {
            // InternalTQL.g:1343:64: (iv_ruleFloatConstantExpression= ruleFloatConstantExpression EOF )
            // InternalTQL.g:1344:2: iv_ruleFloatConstantExpression= ruleFloatConstantExpression EOF
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
    // InternalTQL.g:1350:1: ruleFloatConstantExpression returns [EObject current=null] : (otherlv_0= 'FloatConstantExpression' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEFloat ) ) otherlv_4= '}' ) ;
    public final EObject ruleFloatConstantExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalTQL.g:1356:2: ( (otherlv_0= 'FloatConstantExpression' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEFloat ) ) otherlv_4= '}' ) )
            // InternalTQL.g:1357:2: (otherlv_0= 'FloatConstantExpression' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEFloat ) ) otherlv_4= '}' )
            {
            // InternalTQL.g:1357:2: (otherlv_0= 'FloatConstantExpression' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEFloat ) ) otherlv_4= '}' )
            // InternalTQL.g:1358:3: otherlv_0= 'FloatConstantExpression' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEFloat ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFloatConstantExpressionAccess().getFloatConstantExpressionKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getFloatConstantExpressionAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,29,FOLLOW_31); 

            			newLeafNode(otherlv_2, grammarAccess.getFloatConstantExpressionAccess().getValueKeyword_2());
            		
            // InternalTQL.g:1370:3: ( (lv_value_3_0= ruleEFloat ) )
            // InternalTQL.g:1371:4: (lv_value_3_0= ruleEFloat )
            {
            // InternalTQL.g:1371:4: (lv_value_3_0= ruleEFloat )
            // InternalTQL.g:1372:5: lv_value_3_0= ruleEFloat
            {

            					newCompositeNode(grammarAccess.getFloatConstantExpressionAccess().getValueEFloatParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_value_3_0=ruleEFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFloatConstantExpressionRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.xtext.example.tql.TQL.EFloat");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

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


    // $ANTLR start "entryRuleBinaryOperationExpression"
    // InternalTQL.g:1397:1: entryRuleBinaryOperationExpression returns [EObject current=null] : iv_ruleBinaryOperationExpression= ruleBinaryOperationExpression EOF ;
    public final EObject entryRuleBinaryOperationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryOperationExpression = null;


        try {
            // InternalTQL.g:1397:66: (iv_ruleBinaryOperationExpression= ruleBinaryOperationExpression EOF )
            // InternalTQL.g:1398:2: iv_ruleBinaryOperationExpression= ruleBinaryOperationExpression EOF
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
    // InternalTQL.g:1404:1: ruleBinaryOperationExpression returns [EObject current=null] : (otherlv_0= 'BinaryOperationExpression' otherlv_1= '{' (otherlv_2= 'operation' ( (lv_operation_3_0= ruleBinaryFunction ) ) )? otherlv_4= 'right' ( ( ruleEString ) ) otherlv_6= 'left' ( ( ruleEString ) ) otherlv_8= '}' ) ;
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
            // InternalTQL.g:1410:2: ( (otherlv_0= 'BinaryOperationExpression' otherlv_1= '{' (otherlv_2= 'operation' ( (lv_operation_3_0= ruleBinaryFunction ) ) )? otherlv_4= 'right' ( ( ruleEString ) ) otherlv_6= 'left' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalTQL.g:1411:2: (otherlv_0= 'BinaryOperationExpression' otherlv_1= '{' (otherlv_2= 'operation' ( (lv_operation_3_0= ruleBinaryFunction ) ) )? otherlv_4= 'right' ( ( ruleEString ) ) otherlv_6= 'left' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalTQL.g:1411:2: (otherlv_0= 'BinaryOperationExpression' otherlv_1= '{' (otherlv_2= 'operation' ( (lv_operation_3_0= ruleBinaryFunction ) ) )? otherlv_4= 'right' ( ( ruleEString ) ) otherlv_6= 'left' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalTQL.g:1412:3: otherlv_0= 'BinaryOperationExpression' otherlv_1= '{' (otherlv_2= 'operation' ( (lv_operation_3_0= ruleBinaryFunction ) ) )? otherlv_4= 'right' ( ( ruleEString ) ) otherlv_6= 'left' ( ( ruleEString ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getBinaryOperationExpressionAccess().getBinaryOperationExpressionKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getBinaryOperationExpressionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalTQL.g:1420:3: (otherlv_2= 'operation' ( (lv_operation_3_0= ruleBinaryFunction ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==18) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalTQL.g:1421:4: otherlv_2= 'operation' ( (lv_operation_3_0= ruleBinaryFunction ) )
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_32); 

                    				newLeafNode(otherlv_2, grammarAccess.getBinaryOperationExpressionAccess().getOperationKeyword_2_0());
                    			
                    // InternalTQL.g:1425:4: ( (lv_operation_3_0= ruleBinaryFunction ) )
                    // InternalTQL.g:1426:5: (lv_operation_3_0= ruleBinaryFunction )
                    {
                    // InternalTQL.g:1426:5: (lv_operation_3_0= ruleBinaryFunction )
                    // InternalTQL.g:1427:6: lv_operation_3_0= ruleBinaryFunction
                    {

                    						newCompositeNode(grammarAccess.getBinaryOperationExpressionAccess().getOperationBinaryFunctionEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_operation_3_0=ruleBinaryFunction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBinaryOperationExpressionRule());
                    						}
                    						set(
                    							current,
                    							"operation",
                    							lv_operation_3_0,
                    							"org.xtext.example.tql.TQL.BinaryFunction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getBinaryOperationExpressionAccess().getRightKeyword_3());
            		
            // InternalTQL.g:1449:3: ( ( ruleEString ) )
            // InternalTQL.g:1450:4: ( ruleEString )
            {
            // InternalTQL.g:1450:4: ( ruleEString )
            // InternalTQL.g:1451:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBinaryOperationExpressionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getBinaryOperationExpressionAccess().getRightExpressionCrossReference_4_0());
            				
            pushFollow(FOLLOW_12);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getBinaryOperationExpressionAccess().getLeftKeyword_5());
            		
            // InternalTQL.g:1469:3: ( ( ruleEString ) )
            // InternalTQL.g:1470:4: ( ruleEString )
            {
            // InternalTQL.g:1470:4: ( ruleEString )
            // InternalTQL.g:1471:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBinaryOperationExpressionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getBinaryOperationExpressionAccess().getLeftExpressionCrossReference_6_0());
            				
            pushFollow(FOLLOW_13);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

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


    // $ANTLR start "entryRuleParameter"
    // InternalTQL.g:1493:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalTQL.g:1493:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalTQL.g:1494:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalTQL.g:1500:1: ruleParameter returns [EObject current=null] : ( () otherlv_1= 'Parameter' otherlv_2= '{' (otherlv_3= 'label' ( (lv_label_4_0= ruleEString ) ) )? (otherlv_5= 'type' ( (lv_type_6_0= ruleType ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_label_4_0 = null;

        Enumerator lv_type_6_0 = null;



        	enterRule();

        try {
            // InternalTQL.g:1506:2: ( ( () otherlv_1= 'Parameter' otherlv_2= '{' (otherlv_3= 'label' ( (lv_label_4_0= ruleEString ) ) )? (otherlv_5= 'type' ( (lv_type_6_0= ruleType ) ) )? otherlv_7= '}' ) )
            // InternalTQL.g:1507:2: ( () otherlv_1= 'Parameter' otherlv_2= '{' (otherlv_3= 'label' ( (lv_label_4_0= ruleEString ) ) )? (otherlv_5= 'type' ( (lv_type_6_0= ruleType ) ) )? otherlv_7= '}' )
            {
            // InternalTQL.g:1507:2: ( () otherlv_1= 'Parameter' otherlv_2= '{' (otherlv_3= 'label' ( (lv_label_4_0= ruleEString ) ) )? (otherlv_5= 'type' ( (lv_type_6_0= ruleType ) ) )? otherlv_7= '}' )
            // InternalTQL.g:1508:3: () otherlv_1= 'Parameter' otherlv_2= '{' (otherlv_3= 'label' ( (lv_label_4_0= ruleEString ) ) )? (otherlv_5= 'type' ( (lv_type_6_0= ruleType ) ) )? otherlv_7= '}'
            {
            // InternalTQL.g:1508:3: ()
            // InternalTQL.g:1509:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterAccess().getParameterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,45,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getParameterKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTQL.g:1523:3: (otherlv_3= 'label' ( (lv_label_4_0= ruleEString ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==46) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalTQL.g:1524:4: otherlv_3= 'label' ( (lv_label_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,46,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getLabelKeyword_3_0());
                    			
                    // InternalTQL.g:1528:4: ( (lv_label_4_0= ruleEString ) )
                    // InternalTQL.g:1529:5: (lv_label_4_0= ruleEString )
                    {
                    // InternalTQL.g:1529:5: (lv_label_4_0= ruleEString )
                    // InternalTQL.g:1530:6: lv_label_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getParameterAccess().getLabelEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_label_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterRule());
                    						}
                    						set(
                    							current,
                    							"label",
                    							lv_label_4_0,
                    							"org.xtext.example.tql.TQL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTQL.g:1548:3: (otherlv_5= 'type' ( (lv_type_6_0= ruleType ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==47) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalTQL.g:1549:4: otherlv_5= 'type' ( (lv_type_6_0= ruleType ) )
                    {
                    otherlv_5=(Token)match(input,47,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getParameterAccess().getTypeKeyword_4_0());
                    			
                    // InternalTQL.g:1553:4: ( (lv_type_6_0= ruleType ) )
                    // InternalTQL.g:1554:5: (lv_type_6_0= ruleType )
                    {
                    // InternalTQL.g:1554:5: (lv_type_6_0= ruleType )
                    // InternalTQL.g:1555:6: lv_type_6_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getParameterAccess().getTypeTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_type_6_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_6_0,
                    							"org.xtext.example.tql.TQL.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleEInt"
    // InternalTQL.g:1581:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalTQL.g:1581:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalTQL.g:1582:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalTQL.g:1588:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalTQL.g:1594:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalTQL.g:1595:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalTQL.g:1595:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalTQL.g:1596:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalTQL.g:1596:3: (kw= '-' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==48) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalTQL.g:1597:4: kw= '-'
                    {
                    kw=(Token)match(input,48,FOLLOW_35); 

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
    // InternalTQL.g:1614:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // InternalTQL.g:1614:46: (iv_ruleEFloat= ruleEFloat EOF )
            // InternalTQL.g:1615:2: iv_ruleEFloat= ruleEFloat EOF
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
    // InternalTQL.g:1621:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalTQL.g:1627:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalTQL.g:1628:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalTQL.g:1628:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalTQL.g:1629:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalTQL.g:1629:3: (kw= '-' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==48) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalTQL.g:1630:4: kw= '-'
                    {
                    kw=(Token)match(input,48,FOLLOW_36); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalTQL.g:1636:3: (this_INT_1= RULE_INT )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_INT) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalTQL.g:1637:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_37); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,49,FOLLOW_35); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_38); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3());
            		
            // InternalTQL.g:1657:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=50 && LA22_0<=51)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalTQL.g:1658:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalTQL.g:1658:4: (kw= 'E' | kw= 'e' )
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==50) ) {
                        alt20=1;
                    }
                    else if ( (LA20_0==51) ) {
                        alt20=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 0, input);

                        throw nvae;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalTQL.g:1659:5: kw= 'E'
                            {
                            kw=(Token)match(input,50,FOLLOW_21); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalTQL.g:1665:5: kw= 'e'
                            {
                            kw=(Token)match(input,51,FOLLOW_21); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalTQL.g:1671:4: (kw= '-' )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==48) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalTQL.g:1672:5: kw= '-'
                            {
                            kw=(Token)match(input,48,FOLLOW_35); 

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


    // $ANTLR start "ruleType"
    // InternalTQL.g:1690:1: ruleType returns [Enumerator current=null] : ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'floats' ) | (enumLiteral_3= 'sets' ) | (enumLiteral_4= 'DateTime' ) | (enumLiteral_5= 'Null' ) | (enumLiteral_6= 'bool' ) ) ;
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
            // InternalTQL.g:1696:2: ( ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'floats' ) | (enumLiteral_3= 'sets' ) | (enumLiteral_4= 'DateTime' ) | (enumLiteral_5= 'Null' ) | (enumLiteral_6= 'bool' ) ) )
            // InternalTQL.g:1697:2: ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'floats' ) | (enumLiteral_3= 'sets' ) | (enumLiteral_4= 'DateTime' ) | (enumLiteral_5= 'Null' ) | (enumLiteral_6= 'bool' ) )
            {
            // InternalTQL.g:1697:2: ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'floats' ) | (enumLiteral_3= 'sets' ) | (enumLiteral_4= 'DateTime' ) | (enumLiteral_5= 'Null' ) | (enumLiteral_6= 'bool' ) )
            int alt23=7;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt23=1;
                }
                break;
            case 53:
                {
                alt23=2;
                }
                break;
            case 54:
                {
                alt23=3;
                }
                break;
            case 55:
                {
                alt23=4;
                }
                break;
            case 56:
                {
                alt23=5;
                }
                break;
            case 57:
                {
                alt23=6;
                }
                break;
            case 58:
                {
                alt23=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalTQL.g:1698:3: (enumLiteral_0= 'string' )
                    {
                    // InternalTQL.g:1698:3: (enumLiteral_0= 'string' )
                    // InternalTQL.g:1699:4: enumLiteral_0= 'string'
                    {
                    enumLiteral_0=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getStringEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTQL.g:1706:3: (enumLiteral_1= 'integer' )
                    {
                    // InternalTQL.g:1706:3: (enumLiteral_1= 'integer' )
                    // InternalTQL.g:1707:4: enumLiteral_1= 'integer'
                    {
                    enumLiteral_1=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getIntegerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getIntegerEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTQL.g:1714:3: (enumLiteral_2= 'floats' )
                    {
                    // InternalTQL.g:1714:3: (enumLiteral_2= 'floats' )
                    // InternalTQL.g:1715:4: enumLiteral_2= 'floats'
                    {
                    enumLiteral_2=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getFloatsEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTypeAccess().getFloatsEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalTQL.g:1722:3: (enumLiteral_3= 'sets' )
                    {
                    // InternalTQL.g:1722:3: (enumLiteral_3= 'sets' )
                    // InternalTQL.g:1723:4: enumLiteral_3= 'sets'
                    {
                    enumLiteral_3=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getSetsEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTypeAccess().getSetsEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalTQL.g:1730:3: (enumLiteral_4= 'DateTime' )
                    {
                    // InternalTQL.g:1730:3: (enumLiteral_4= 'DateTime' )
                    // InternalTQL.g:1731:4: enumLiteral_4= 'DateTime'
                    {
                    enumLiteral_4=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getDateTimeEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getTypeAccess().getDateTimeEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalTQL.g:1738:3: (enumLiteral_5= 'Null' )
                    {
                    // InternalTQL.g:1738:3: (enumLiteral_5= 'Null' )
                    // InternalTQL.g:1739:4: enumLiteral_5= 'Null'
                    {
                    enumLiteral_5=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getNullEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getTypeAccess().getNullEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalTQL.g:1746:3: (enumLiteral_6= 'bool' )
                    {
                    // InternalTQL.g:1746:3: (enumLiteral_6= 'bool' )
                    // InternalTQL.g:1747:4: enumLiteral_6= 'bool'
                    {
                    enumLiteral_6=(Token)match(input,58,FOLLOW_2); 

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


    // $ANTLR start "ruleBooleanFunction"
    // InternalTQL.g:1757:1: ruleBooleanFunction returns [Enumerator current=null] : ( (enumLiteral_0= 'equal' ) | (enumLiteral_1= 'notequal' ) | (enumLiteral_2= 'smaller' ) | (enumLiteral_3= 'greater' ) | (enumLiteral_4= 'or' ) | (enumLiteral_5= 'and' ) ) ;
    public final Enumerator ruleBooleanFunction() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalTQL.g:1763:2: ( ( (enumLiteral_0= 'equal' ) | (enumLiteral_1= 'notequal' ) | (enumLiteral_2= 'smaller' ) | (enumLiteral_3= 'greater' ) | (enumLiteral_4= 'or' ) | (enumLiteral_5= 'and' ) ) )
            // InternalTQL.g:1764:2: ( (enumLiteral_0= 'equal' ) | (enumLiteral_1= 'notequal' ) | (enumLiteral_2= 'smaller' ) | (enumLiteral_3= 'greater' ) | (enumLiteral_4= 'or' ) | (enumLiteral_5= 'and' ) )
            {
            // InternalTQL.g:1764:2: ( (enumLiteral_0= 'equal' ) | (enumLiteral_1= 'notequal' ) | (enumLiteral_2= 'smaller' ) | (enumLiteral_3= 'greater' ) | (enumLiteral_4= 'or' ) | (enumLiteral_5= 'and' ) )
            int alt24=6;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt24=1;
                }
                break;
            case 60:
                {
                alt24=2;
                }
                break;
            case 61:
                {
                alt24=3;
                }
                break;
            case 62:
                {
                alt24=4;
                }
                break;
            case 63:
                {
                alt24=5;
                }
                break;
            case 64:
                {
                alt24=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalTQL.g:1765:3: (enumLiteral_0= 'equal' )
                    {
                    // InternalTQL.g:1765:3: (enumLiteral_0= 'equal' )
                    // InternalTQL.g:1766:4: enumLiteral_0= 'equal'
                    {
                    enumLiteral_0=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getBooleanFunctionAccess().getEqualEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBooleanFunctionAccess().getEqualEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTQL.g:1773:3: (enumLiteral_1= 'notequal' )
                    {
                    // InternalTQL.g:1773:3: (enumLiteral_1= 'notequal' )
                    // InternalTQL.g:1774:4: enumLiteral_1= 'notequal'
                    {
                    enumLiteral_1=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getBooleanFunctionAccess().getNotequalEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBooleanFunctionAccess().getNotequalEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTQL.g:1781:3: (enumLiteral_2= 'smaller' )
                    {
                    // InternalTQL.g:1781:3: (enumLiteral_2= 'smaller' )
                    // InternalTQL.g:1782:4: enumLiteral_2= 'smaller'
                    {
                    enumLiteral_2=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getBooleanFunctionAccess().getSmallerEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getBooleanFunctionAccess().getSmallerEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalTQL.g:1789:3: (enumLiteral_3= 'greater' )
                    {
                    // InternalTQL.g:1789:3: (enumLiteral_3= 'greater' )
                    // InternalTQL.g:1790:4: enumLiteral_3= 'greater'
                    {
                    enumLiteral_3=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getBooleanFunctionAccess().getGreaterEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getBooleanFunctionAccess().getGreaterEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalTQL.g:1797:3: (enumLiteral_4= 'or' )
                    {
                    // InternalTQL.g:1797:3: (enumLiteral_4= 'or' )
                    // InternalTQL.g:1798:4: enumLiteral_4= 'or'
                    {
                    enumLiteral_4=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getBooleanFunctionAccess().getOrEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getBooleanFunctionAccess().getOrEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalTQL.g:1805:3: (enumLiteral_5= 'and' )
                    {
                    // InternalTQL.g:1805:3: (enumLiteral_5= 'and' )
                    // InternalTQL.g:1806:4: enumLiteral_5= 'and'
                    {
                    enumLiteral_5=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getBooleanFunctionAccess().getAndEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getBooleanFunctionAccess().getAndEnumLiteralDeclaration_5());
                    			

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
    // $ANTLR end "ruleBooleanFunction"


    // $ANTLR start "ruleBinaryFunction"
    // InternalTQL.g:1816:1: ruleBinaryFunction returns [Enumerator current=null] : ( (enumLiteral_0= 'mult' ) | (enumLiteral_1= 'sum' ) | (enumLiteral_2= 'divide' ) | (enumLiteral_3= 'concat' ) ) ;
    public final Enumerator ruleBinaryFunction() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalTQL.g:1822:2: ( ( (enumLiteral_0= 'mult' ) | (enumLiteral_1= 'sum' ) | (enumLiteral_2= 'divide' ) | (enumLiteral_3= 'concat' ) ) )
            // InternalTQL.g:1823:2: ( (enumLiteral_0= 'mult' ) | (enumLiteral_1= 'sum' ) | (enumLiteral_2= 'divide' ) | (enumLiteral_3= 'concat' ) )
            {
            // InternalTQL.g:1823:2: ( (enumLiteral_0= 'mult' ) | (enumLiteral_1= 'sum' ) | (enumLiteral_2= 'divide' ) | (enumLiteral_3= 'concat' ) )
            int alt25=4;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt25=1;
                }
                break;
            case 66:
                {
                alt25=2;
                }
                break;
            case 67:
                {
                alt25=3;
                }
                break;
            case 68:
                {
                alt25=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalTQL.g:1824:3: (enumLiteral_0= 'mult' )
                    {
                    // InternalTQL.g:1824:3: (enumLiteral_0= 'mult' )
                    // InternalTQL.g:1825:4: enumLiteral_0= 'mult'
                    {
                    enumLiteral_0=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getBinaryFunctionAccess().getMultEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBinaryFunctionAccess().getMultEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTQL.g:1832:3: (enumLiteral_1= 'sum' )
                    {
                    // InternalTQL.g:1832:3: (enumLiteral_1= 'sum' )
                    // InternalTQL.g:1833:4: enumLiteral_1= 'sum'
                    {
                    enumLiteral_1=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getBinaryFunctionAccess().getSumEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBinaryFunctionAccess().getSumEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTQL.g:1840:3: (enumLiteral_2= 'divide' )
                    {
                    // InternalTQL.g:1840:3: (enumLiteral_2= 'divide' )
                    // InternalTQL.g:1841:4: enumLiteral_2= 'divide'
                    {
                    enumLiteral_2=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getBinaryFunctionAccess().getDivideEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getBinaryFunctionAccess().getDivideEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalTQL.g:1848:3: (enumLiteral_3= 'concat' )
                    {
                    // InternalTQL.g:1848:3: (enumLiteral_3= 'concat' )
                    // InternalTQL.g:1849:4: enumLiteral_3= 'concat'
                    {
                    enumLiteral_3=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getBinaryFunctionAccess().getConcatEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getBinaryFunctionAccess().getConcatEnumLiteralDeclaration_3());
                    			

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x07F0000000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0xF800000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002004000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0001000000000040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0003000000000040L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000000L,0x000000000000001EL});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000C00000008000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000800000008000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0002000000000040L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x000C000000000002L});

}