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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'source'", "'target'", "'{'", "','", "'}'", "':'", "'mapping'", "'->'", "'MappingField'", "'souceField'", "'targetField'", "'calls'", "'TransformationCall'", "'parameters'", "'('", "')'", "'string'", "'integer'", "'floats'", "'sets'", "'DateTime'", "'Null'", "'bool'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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
        	return "Block";
       	}

       	@Override
       	protected TQLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleBlock"
    // InternalTQL.g:65:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // InternalTQL.g:65:46: (iv_ruleBlock= ruleBlock EOF )
            // InternalTQL.g:66:2: iv_ruleBlock= ruleBlock EOF
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
    // InternalTQL.g:72:1: ruleBlock returns [EObject current=null] : (this_Table_Impl_0= ruleTable_Impl | this_Mapping_1= ruleMapping ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        EObject this_Table_Impl_0 = null;

        EObject this_Mapping_1 = null;



        	enterRule();

        try {
            // InternalTQL.g:78:2: ( (this_Table_Impl_0= ruleTable_Impl | this_Mapping_1= ruleMapping ) )
            // InternalTQL.g:79:2: (this_Table_Impl_0= ruleTable_Impl | this_Mapping_1= ruleMapping )
            {
            // InternalTQL.g:79:2: (this_Table_Impl_0= ruleTable_Impl | this_Mapping_1= ruleMapping )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=11 && LA1_0<=12)) ) {
                alt1=1;
            }
            else if ( (LA1_0==17) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalTQL.g:80:3: this_Table_Impl_0= ruleTable_Impl
                    {

                    			newCompositeNode(grammarAccess.getBlockAccess().getTable_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Table_Impl_0=ruleTable_Impl();

                    state._fsp--;


                    			current = this_Table_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTQL.g:89:3: this_Mapping_1= ruleMapping
                    {

                    			newCompositeNode(grammarAccess.getBlockAccess().getMappingParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Mapping_1=ruleMapping();

                    state._fsp--;


                    			current = this_Mapping_1;
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
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleTable_Impl"
    // InternalTQL.g:101:1: entryRuleTable_Impl returns [EObject current=null] : iv_ruleTable_Impl= ruleTable_Impl EOF ;
    public final EObject entryRuleTable_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable_Impl = null;


        try {
            // InternalTQL.g:101:51: (iv_ruleTable_Impl= ruleTable_Impl EOF )
            // InternalTQL.g:102:2: iv_ruleTable_Impl= ruleTable_Impl EOF
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
    // InternalTQL.g:108:1: ruleTable_Impl returns [EObject current=null] : ( (otherlv_0= 'source' this_Source_Table_1= ruleSource_Table ) | (otherlv_2= 'target' this_Target_Table_3= ruleTarget_Table ) ) ;
    public final EObject ruleTable_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Source_Table_1 = null;

        EObject this_Target_Table_3 = null;



        	enterRule();

        try {
            // InternalTQL.g:114:2: ( ( (otherlv_0= 'source' this_Source_Table_1= ruleSource_Table ) | (otherlv_2= 'target' this_Target_Table_3= ruleTarget_Table ) ) )
            // InternalTQL.g:115:2: ( (otherlv_0= 'source' this_Source_Table_1= ruleSource_Table ) | (otherlv_2= 'target' this_Target_Table_3= ruleTarget_Table ) )
            {
            // InternalTQL.g:115:2: ( (otherlv_0= 'source' this_Source_Table_1= ruleSource_Table ) | (otherlv_2= 'target' this_Target_Table_3= ruleTarget_Table ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalTQL.g:116:3: (otherlv_0= 'source' this_Source_Table_1= ruleSource_Table )
                    {
                    // InternalTQL.g:116:3: (otherlv_0= 'source' this_Source_Table_1= ruleSource_Table )
                    // InternalTQL.g:117:4: otherlv_0= 'source' this_Source_Table_1= ruleSource_Table
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
                    // InternalTQL.g:131:3: (otherlv_2= 'target' this_Target_Table_3= ruleTarget_Table )
                    {
                    // InternalTQL.g:131:3: (otherlv_2= 'target' this_Target_Table_3= ruleTarget_Table )
                    // InternalTQL.g:132:4: otherlv_2= 'target' this_Target_Table_3= ruleTarget_Table
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
    // InternalTQL.g:149:1: entryRuleSource_Table returns [EObject current=null] : iv_ruleSource_Table= ruleSource_Table EOF ;
    public final EObject entryRuleSource_Table() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSource_Table = null;


        try {
            // InternalTQL.g:149:53: (iv_ruleSource_Table= ruleSource_Table EOF )
            // InternalTQL.g:150:2: iv_ruleSource_Table= ruleSource_Table EOF
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
    // InternalTQL.g:156:1: ruleSource_Table returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_columns_2_0= ruleTableField ) ) (otherlv_3= ',' ( (lv_columns_4_0= ruleTableField ) ) )* otherlv_5= '}' ) ;
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
            // InternalTQL.g:162:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_columns_2_0= ruleTableField ) ) (otherlv_3= ',' ( (lv_columns_4_0= ruleTableField ) ) )* otherlv_5= '}' ) )
            // InternalTQL.g:163:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_columns_2_0= ruleTableField ) ) (otherlv_3= ',' ( (lv_columns_4_0= ruleTableField ) ) )* otherlv_5= '}' )
            {
            // InternalTQL.g:163:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_columns_2_0= ruleTableField ) ) (otherlv_3= ',' ( (lv_columns_4_0= ruleTableField ) ) )* otherlv_5= '}' )
            // InternalTQL.g:164:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_columns_2_0= ruleTableField ) ) (otherlv_3= ',' ( (lv_columns_4_0= ruleTableField ) ) )* otherlv_5= '}'
            {
            // InternalTQL.g:164:3: ( (lv_name_0_0= ruleEString ) )
            // InternalTQL.g:165:4: (lv_name_0_0= ruleEString )
            {
            // InternalTQL.g:165:4: (lv_name_0_0= ruleEString )
            // InternalTQL.g:166:5: lv_name_0_0= ruleEString
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
            						"nl.tue.gtl.TQL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSource_TableAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalTQL.g:187:3: ( (lv_columns_2_0= ruleTableField ) )
            // InternalTQL.g:188:4: (lv_columns_2_0= ruleTableField )
            {
            // InternalTQL.g:188:4: (lv_columns_2_0= ruleTableField )
            // InternalTQL.g:189:5: lv_columns_2_0= ruleTableField
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
            						"nl.tue.gtl.TQL.TableField");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTQL.g:206:3: (otherlv_3= ',' ( (lv_columns_4_0= ruleTableField ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalTQL.g:207:4: otherlv_3= ',' ( (lv_columns_4_0= ruleTableField ) )
            	    {
            	    otherlv_3=(Token)match(input,14,FOLLOW_3); 

            	    				newLeafNode(otherlv_3, grammarAccess.getSource_TableAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalTQL.g:211:4: ( (lv_columns_4_0= ruleTableField ) )
            	    // InternalTQL.g:212:5: (lv_columns_4_0= ruleTableField )
            	    {
            	    // InternalTQL.g:212:5: (lv_columns_4_0= ruleTableField )
            	    // InternalTQL.g:213:6: lv_columns_4_0= ruleTableField
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
            	    							"nl.tue.gtl.TQL.TableField");
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
    // InternalTQL.g:239:1: entryRuleTarget_Table returns [EObject current=null] : iv_ruleTarget_Table= ruleTarget_Table EOF ;
    public final EObject entryRuleTarget_Table() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTarget_Table = null;


        try {
            // InternalTQL.g:239:53: (iv_ruleTarget_Table= ruleTarget_Table EOF )
            // InternalTQL.g:240:2: iv_ruleTarget_Table= ruleTarget_Table EOF
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
    // InternalTQL.g:246:1: ruleTarget_Table returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_columns_2_0= ruleTableField ) ) (otherlv_3= ',' ( (lv_columns_4_0= ruleTableField ) ) )* otherlv_5= '}' ) ;
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
            // InternalTQL.g:252:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_columns_2_0= ruleTableField ) ) (otherlv_3= ',' ( (lv_columns_4_0= ruleTableField ) ) )* otherlv_5= '}' ) )
            // InternalTQL.g:253:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_columns_2_0= ruleTableField ) ) (otherlv_3= ',' ( (lv_columns_4_0= ruleTableField ) ) )* otherlv_5= '}' )
            {
            // InternalTQL.g:253:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_columns_2_0= ruleTableField ) ) (otherlv_3= ',' ( (lv_columns_4_0= ruleTableField ) ) )* otherlv_5= '}' )
            // InternalTQL.g:254:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_columns_2_0= ruleTableField ) ) (otherlv_3= ',' ( (lv_columns_4_0= ruleTableField ) ) )* otherlv_5= '}'
            {
            // InternalTQL.g:254:3: ( (lv_name_0_0= ruleEString ) )
            // InternalTQL.g:255:4: (lv_name_0_0= ruleEString )
            {
            // InternalTQL.g:255:4: (lv_name_0_0= ruleEString )
            // InternalTQL.g:256:5: lv_name_0_0= ruleEString
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
            						"nl.tue.gtl.TQL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTarget_TableAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalTQL.g:277:3: ( (lv_columns_2_0= ruleTableField ) )
            // InternalTQL.g:278:4: (lv_columns_2_0= ruleTableField )
            {
            // InternalTQL.g:278:4: (lv_columns_2_0= ruleTableField )
            // InternalTQL.g:279:5: lv_columns_2_0= ruleTableField
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
            						"nl.tue.gtl.TQL.TableField");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTQL.g:296:3: (otherlv_3= ',' ( (lv_columns_4_0= ruleTableField ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalTQL.g:297:4: otherlv_3= ',' ( (lv_columns_4_0= ruleTableField ) )
            	    {
            	    otherlv_3=(Token)match(input,14,FOLLOW_3); 

            	    				newLeafNode(otherlv_3, grammarAccess.getTarget_TableAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalTQL.g:301:4: ( (lv_columns_4_0= ruleTableField ) )
            	    // InternalTQL.g:302:5: (lv_columns_4_0= ruleTableField )
            	    {
            	    // InternalTQL.g:302:5: (lv_columns_4_0= ruleTableField )
            	    // InternalTQL.g:303:6: lv_columns_4_0= ruleTableField
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
            	    							"nl.tue.gtl.TQL.TableField");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // InternalTQL.g:329:1: entryRuleTableField returns [EObject current=null] : iv_ruleTableField= ruleTableField EOF ;
    public final EObject entryRuleTableField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableField = null;


        try {
            // InternalTQL.g:329:51: (iv_ruleTableField= ruleTableField EOF )
            // InternalTQL.g:330:2: iv_ruleTableField= ruleTableField EOF
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
    // InternalTQL.g:336:1: ruleTableField returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) otherlv_3= ',' ) ;
    public final EObject ruleTableField() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        Enumerator lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalTQL.g:342:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) otherlv_3= ',' ) )
            // InternalTQL.g:343:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) otherlv_3= ',' )
            {
            // InternalTQL.g:343:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) otherlv_3= ',' )
            // InternalTQL.g:344:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) otherlv_3= ','
            {
            // InternalTQL.g:344:3: ( (lv_name_0_0= ruleEString ) )
            // InternalTQL.g:345:4: (lv_name_0_0= ruleEString )
            {
            // InternalTQL.g:345:4: (lv_name_0_0= ruleEString )
            // InternalTQL.g:346:5: lv_name_0_0= ruleEString
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
            						"nl.tue.gtl.TQL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getTableFieldAccess().getColonKeyword_1());
            		
            // InternalTQL.g:367:3: ( (lv_type_2_0= ruleType ) )
            // InternalTQL.g:368:4: (lv_type_2_0= ruleType )
            {
            // InternalTQL.g:368:4: (lv_type_2_0= ruleType )
            // InternalTQL.g:369:5: lv_type_2_0= ruleType
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
            						"nl.tue.gtl.TQL.Type");
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


    // $ANTLR start "entryRuleMapping"
    // InternalTQL.g:394:1: entryRuleMapping returns [EObject current=null] : iv_ruleMapping= ruleMapping EOF ;
    public final EObject entryRuleMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapping = null;


        try {
            // InternalTQL.g:394:48: (iv_ruleMapping= ruleMapping EOF )
            // InternalTQL.g:395:2: iv_ruleMapping= ruleMapping EOF
            {
             newCompositeNode(grammarAccess.getMappingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMapping=ruleMapping();

            state._fsp--;

             current =iv_ruleMapping; 
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
    // $ANTLR end "entryRuleMapping"


    // $ANTLR start "ruleMapping"
    // InternalTQL.g:401:1: ruleMapping returns [EObject current=null] : (otherlv_0= 'mapping' ( ( ruleEString ) ) otherlv_2= '->' ( ( ruleEString ) ) otherlv_4= '{' ( (lv_fields_5_0= ruleMappingField ) ) otherlv_6= '}' ) ;
    public final EObject ruleMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_fields_5_0 = null;



        	enterRule();

        try {
            // InternalTQL.g:407:2: ( (otherlv_0= 'mapping' ( ( ruleEString ) ) otherlv_2= '->' ( ( ruleEString ) ) otherlv_4= '{' ( (lv_fields_5_0= ruleMappingField ) ) otherlv_6= '}' ) )
            // InternalTQL.g:408:2: (otherlv_0= 'mapping' ( ( ruleEString ) ) otherlv_2= '->' ( ( ruleEString ) ) otherlv_4= '{' ( (lv_fields_5_0= ruleMappingField ) ) otherlv_6= '}' )
            {
            // InternalTQL.g:408:2: (otherlv_0= 'mapping' ( ( ruleEString ) ) otherlv_2= '->' ( ( ruleEString ) ) otherlv_4= '{' ( (lv_fields_5_0= ruleMappingField ) ) otherlv_6= '}' )
            // InternalTQL.g:409:3: otherlv_0= 'mapping' ( ( ruleEString ) ) otherlv_2= '->' ( ( ruleEString ) ) otherlv_4= '{' ( (lv_fields_5_0= ruleMappingField ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMappingAccess().getMappingKeyword_0());
            		
            // InternalTQL.g:413:3: ( ( ruleEString ) )
            // InternalTQL.g:414:4: ( ruleEString )
            {
            // InternalTQL.g:414:4: ( ruleEString )
            // InternalTQL.g:415:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMappingRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMappingAccess().getSourcetableSourceTableCrossReference_1_0());
            				
            pushFollow(FOLLOW_9);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getMappingAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            // InternalTQL.g:433:3: ( ( ruleEString ) )
            // InternalTQL.g:434:4: ( ruleEString )
            {
            // InternalTQL.g:434:4: ( ruleEString )
            // InternalTQL.g:435:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMappingRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMappingAccess().getTargettableTargetTableCrossReference_3_0());
            				
            pushFollow(FOLLOW_4);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getMappingAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalTQL.g:453:3: ( (lv_fields_5_0= ruleMappingField ) )
            // InternalTQL.g:454:4: (lv_fields_5_0= ruleMappingField )
            {
            // InternalTQL.g:454:4: (lv_fields_5_0= ruleMappingField )
            // InternalTQL.g:455:5: lv_fields_5_0= ruleMappingField
            {

            					newCompositeNode(grammarAccess.getMappingAccess().getFieldsMappingFieldParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_11);
            lv_fields_5_0=ruleMappingField();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMappingRule());
            					}
            					add(
            						current,
            						"fields",
            						lv_fields_5_0,
            						"nl.tue.gtl.TQL.MappingField");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getMappingAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleMapping"


    // $ANTLR start "entryRuleMappingField"
    // InternalTQL.g:480:1: entryRuleMappingField returns [EObject current=null] : iv_ruleMappingField= ruleMappingField EOF ;
    public final EObject entryRuleMappingField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappingField = null;


        try {
            // InternalTQL.g:480:53: (iv_ruleMappingField= ruleMappingField EOF )
            // InternalTQL.g:481:2: iv_ruleMappingField= ruleMappingField EOF
            {
             newCompositeNode(grammarAccess.getMappingFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMappingField=ruleMappingField();

            state._fsp--;

             current =iv_ruleMappingField; 
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
    // $ANTLR end "entryRuleMappingField"


    // $ANTLR start "ruleMappingField"
    // InternalTQL.g:487:1: ruleMappingField returns [EObject current=null] : (otherlv_0= 'MappingField' otherlv_1= '{' otherlv_2= 'souceField' ( ( ruleEString ) ) otherlv_4= 'targetField' ( ( ruleEString ) ) (otherlv_6= 'calls' otherlv_7= '{' ( (lv_calls_8_0= ruleTransformationCall ) ) (otherlv_9= ',' ( (lv_calls_10_0= ruleTransformationCall ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
    public final EObject ruleMappingField() throws RecognitionException {
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
        EObject lv_calls_8_0 = null;

        EObject lv_calls_10_0 = null;



        	enterRule();

        try {
            // InternalTQL.g:493:2: ( (otherlv_0= 'MappingField' otherlv_1= '{' otherlv_2= 'souceField' ( ( ruleEString ) ) otherlv_4= 'targetField' ( ( ruleEString ) ) (otherlv_6= 'calls' otherlv_7= '{' ( (lv_calls_8_0= ruleTransformationCall ) ) (otherlv_9= ',' ( (lv_calls_10_0= ruleTransformationCall ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // InternalTQL.g:494:2: (otherlv_0= 'MappingField' otherlv_1= '{' otherlv_2= 'souceField' ( ( ruleEString ) ) otherlv_4= 'targetField' ( ( ruleEString ) ) (otherlv_6= 'calls' otherlv_7= '{' ( (lv_calls_8_0= ruleTransformationCall ) ) (otherlv_9= ',' ( (lv_calls_10_0= ruleTransformationCall ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // InternalTQL.g:494:2: (otherlv_0= 'MappingField' otherlv_1= '{' otherlv_2= 'souceField' ( ( ruleEString ) ) otherlv_4= 'targetField' ( ( ruleEString ) ) (otherlv_6= 'calls' otherlv_7= '{' ( (lv_calls_8_0= ruleTransformationCall ) ) (otherlv_9= ',' ( (lv_calls_10_0= ruleTransformationCall ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // InternalTQL.g:495:3: otherlv_0= 'MappingField' otherlv_1= '{' otherlv_2= 'souceField' ( ( ruleEString ) ) otherlv_4= 'targetField' ( ( ruleEString ) ) (otherlv_6= 'calls' otherlv_7= '{' ( (lv_calls_8_0= ruleTransformationCall ) ) (otherlv_9= ',' ( (lv_calls_10_0= ruleTransformationCall ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMappingFieldAccess().getMappingFieldKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getMappingFieldAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getMappingFieldAccess().getSouceFieldKeyword_2());
            		
            // InternalTQL.g:507:3: ( ( ruleEString ) )
            // InternalTQL.g:508:4: ( ruleEString )
            {
            // InternalTQL.g:508:4: ( ruleEString )
            // InternalTQL.g:509:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMappingFieldRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMappingFieldAccess().getSouceFieldTableFieldCrossReference_3_0());
            				
            pushFollow(FOLLOW_13);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getMappingFieldAccess().getTargetFieldKeyword_4());
            		
            // InternalTQL.g:527:3: ( ( ruleEString ) )
            // InternalTQL.g:528:4: ( ruleEString )
            {
            // InternalTQL.g:528:4: ( ruleEString )
            // InternalTQL.g:529:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMappingFieldRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMappingFieldAccess().getTargetFieldTableFieldCrossReference_5_0());
            				
            pushFollow(FOLLOW_14);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTQL.g:543:3: (otherlv_6= 'calls' otherlv_7= '{' ( (lv_calls_8_0= ruleTransformationCall ) ) (otherlv_9= ',' ( (lv_calls_10_0= ruleTransformationCall ) ) )* otherlv_11= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalTQL.g:544:4: otherlv_6= 'calls' otherlv_7= '{' ( (lv_calls_8_0= ruleTransformationCall ) ) (otherlv_9= ',' ( (lv_calls_10_0= ruleTransformationCall ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,22,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getMappingFieldAccess().getCallsKeyword_6_0());
                    			
                    otherlv_7=(Token)match(input,13,FOLLOW_15); 

                    				newLeafNode(otherlv_7, grammarAccess.getMappingFieldAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalTQL.g:552:4: ( (lv_calls_8_0= ruleTransformationCall ) )
                    // InternalTQL.g:553:5: (lv_calls_8_0= ruleTransformationCall )
                    {
                    // InternalTQL.g:553:5: (lv_calls_8_0= ruleTransformationCall )
                    // InternalTQL.g:554:6: lv_calls_8_0= ruleTransformationCall
                    {

                    						newCompositeNode(grammarAccess.getMappingFieldAccess().getCallsTransformationCallParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_calls_8_0=ruleTransformationCall();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMappingFieldRule());
                    						}
                    						add(
                    							current,
                    							"calls",
                    							lv_calls_8_0,
                    							"nl.tue.gtl.TQL.TransformationCall");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTQL.g:571:4: (otherlv_9= ',' ( (lv_calls_10_0= ruleTransformationCall ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==14) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalTQL.g:572:5: otherlv_9= ',' ( (lv_calls_10_0= ruleTransformationCall ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_15); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getMappingFieldAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalTQL.g:576:5: ( (lv_calls_10_0= ruleTransformationCall ) )
                    	    // InternalTQL.g:577:6: (lv_calls_10_0= ruleTransformationCall )
                    	    {
                    	    // InternalTQL.g:577:6: (lv_calls_10_0= ruleTransformationCall )
                    	    // InternalTQL.g:578:7: lv_calls_10_0= ruleTransformationCall
                    	    {

                    	    							newCompositeNode(grammarAccess.getMappingFieldAccess().getCallsTransformationCallParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_5);
                    	    lv_calls_10_0=ruleTransformationCall();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMappingFieldRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"calls",
                    	    								lv_calls_10_0,
                    	    								"nl.tue.gtl.TQL.TransformationCall");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,15,FOLLOW_11); 

                    				newLeafNode(otherlv_11, grammarAccess.getMappingFieldAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getMappingFieldAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleMappingField"


    // $ANTLR start "entryRuleTransformationCall"
    // InternalTQL.g:609:1: entryRuleTransformationCall returns [EObject current=null] : iv_ruleTransformationCall= ruleTransformationCall EOF ;
    public final EObject entryRuleTransformationCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransformationCall = null;


        try {
            // InternalTQL.g:609:59: (iv_ruleTransformationCall= ruleTransformationCall EOF )
            // InternalTQL.g:610:2: iv_ruleTransformationCall= ruleTransformationCall EOF
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
    // InternalTQL.g:616:1: ruleTransformationCall returns [EObject current=null] : (otherlv_0= 'TransformationCall' otherlv_1= '{' (otherlv_2= 'parameters' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )? otherlv_8= '}' ) ;
    public final EObject ruleTransformationCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalTQL.g:622:2: ( (otherlv_0= 'TransformationCall' otherlv_1= '{' (otherlv_2= 'parameters' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )? otherlv_8= '}' ) )
            // InternalTQL.g:623:2: (otherlv_0= 'TransformationCall' otherlv_1= '{' (otherlv_2= 'parameters' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )? otherlv_8= '}' )
            {
            // InternalTQL.g:623:2: (otherlv_0= 'TransformationCall' otherlv_1= '{' (otherlv_2= 'parameters' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )? otherlv_8= '}' )
            // InternalTQL.g:624:3: otherlv_0= 'TransformationCall' otherlv_1= '{' (otherlv_2= 'parameters' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTransformationCallAccess().getTransformationCallKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getTransformationCallAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalTQL.g:632:3: (otherlv_2= 'parameters' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalTQL.g:633:4: otherlv_2= 'parameters' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')'
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_17); 

                    				newLeafNode(otherlv_2, grammarAccess.getTransformationCallAccess().getParametersKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getTransformationCallAccess().getLeftParenthesisKeyword_2_1());
                    			
                    // InternalTQL.g:641:4: ( ( ruleEString ) )
                    // InternalTQL.g:642:5: ( ruleEString )
                    {
                    // InternalTQL.g:642:5: ( ruleEString )
                    // InternalTQL.g:643:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransformationCallRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTransformationCallAccess().getParametersTableFieldCrossReference_2_2_0());
                    					
                    pushFollow(FOLLOW_18);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTQL.g:657:4: (otherlv_5= ',' ( ( ruleEString ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==14) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalTQL.g:658:5: otherlv_5= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getTransformationCallAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalTQL.g:662:5: ( ( ruleEString ) )
                    	    // InternalTQL.g:663:6: ( ruleEString )
                    	    {
                    	    // InternalTQL.g:663:6: ( ruleEString )
                    	    // InternalTQL.g:664:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getTransformationCallRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getTransformationCallAccess().getParametersTableFieldCrossReference_2_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
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

                    otherlv_7=(Token)match(input,26,FOLLOW_11); 

                    				newLeafNode(otherlv_7, grammarAccess.getTransformationCallAccess().getRightParenthesisKeyword_2_4());
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getTransformationCallAccess().getRightCurlyBracketKeyword_3());
            		

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


    // $ANTLR start "entryRuleEString"
    // InternalTQL.g:692:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalTQL.g:692:47: (iv_ruleEString= ruleEString EOF )
            // InternalTQL.g:693:2: iv_ruleEString= ruleEString EOF
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
    // InternalTQL.g:699:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalTQL.g:705:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalTQL.g:706:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalTQL.g:706:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalTQL.g:707:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTQL.g:715:3: this_ID_1= RULE_ID
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


    // $ANTLR start "ruleType"
    // InternalTQL.g:726:1: ruleType returns [Enumerator current=null] : ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'floats' ) | (enumLiteral_3= 'sets' ) | (enumLiteral_4= 'DateTime' ) | (enumLiteral_5= 'Null' ) | (enumLiteral_6= 'bool' ) ) ;
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
            // InternalTQL.g:732:2: ( ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'floats' ) | (enumLiteral_3= 'sets' ) | (enumLiteral_4= 'DateTime' ) | (enumLiteral_5= 'Null' ) | (enumLiteral_6= 'bool' ) ) )
            // InternalTQL.g:733:2: ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'floats' ) | (enumLiteral_3= 'sets' ) | (enumLiteral_4= 'DateTime' ) | (enumLiteral_5= 'Null' ) | (enumLiteral_6= 'bool' ) )
            {
            // InternalTQL.g:733:2: ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'floats' ) | (enumLiteral_3= 'sets' ) | (enumLiteral_4= 'DateTime' ) | (enumLiteral_5= 'Null' ) | (enumLiteral_6= 'bool' ) )
            int alt10=7;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt10=1;
                }
                break;
            case 28:
                {
                alt10=2;
                }
                break;
            case 29:
                {
                alt10=3;
                }
                break;
            case 30:
                {
                alt10=4;
                }
                break;
            case 31:
                {
                alt10=5;
                }
                break;
            case 32:
                {
                alt10=6;
                }
                break;
            case 33:
                {
                alt10=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalTQL.g:734:3: (enumLiteral_0= 'string' )
                    {
                    // InternalTQL.g:734:3: (enumLiteral_0= 'string' )
                    // InternalTQL.g:735:4: enumLiteral_0= 'string'
                    {
                    enumLiteral_0=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getStringEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTQL.g:742:3: (enumLiteral_1= 'integer' )
                    {
                    // InternalTQL.g:742:3: (enumLiteral_1= 'integer' )
                    // InternalTQL.g:743:4: enumLiteral_1= 'integer'
                    {
                    enumLiteral_1=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getIntegerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getIntegerEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTQL.g:750:3: (enumLiteral_2= 'floats' )
                    {
                    // InternalTQL.g:750:3: (enumLiteral_2= 'floats' )
                    // InternalTQL.g:751:4: enumLiteral_2= 'floats'
                    {
                    enumLiteral_2=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getFloatsEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTypeAccess().getFloatsEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalTQL.g:758:3: (enumLiteral_3= 'sets' )
                    {
                    // InternalTQL.g:758:3: (enumLiteral_3= 'sets' )
                    // InternalTQL.g:759:4: enumLiteral_3= 'sets'
                    {
                    enumLiteral_3=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getSetsEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTypeAccess().getSetsEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalTQL.g:766:3: (enumLiteral_4= 'DateTime' )
                    {
                    // InternalTQL.g:766:3: (enumLiteral_4= 'DateTime' )
                    // InternalTQL.g:767:4: enumLiteral_4= 'DateTime'
                    {
                    enumLiteral_4=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getDateTimeEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getTypeAccess().getDateTimeEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalTQL.g:774:3: (enumLiteral_5= 'Null' )
                    {
                    // InternalTQL.g:774:3: (enumLiteral_5= 'Null' )
                    // InternalTQL.g:775:4: enumLiteral_5= 'Null'
                    {
                    enumLiteral_5=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getNullEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getTypeAccess().getNullEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalTQL.g:782:3: (enumLiteral_6= 'bool' )
                    {
                    // InternalTQL.g:782:3: (enumLiteral_6= 'bool' )
                    // InternalTQL.g:783:4: enumLiteral_6= 'bool'
                    {
                    enumLiteral_6=(Token)match(input,33,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000003F8000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004004000L});

}