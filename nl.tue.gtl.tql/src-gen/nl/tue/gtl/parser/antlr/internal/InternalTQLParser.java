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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'source'", "'target'", "':'", "'{'", "','", "'}'", "'mapping'", "'->'", "'|'", "'('", "')'", "'transformation'", "'::'", "'self'", "'\"'", "'null'", "'['", "']'", "'true'", "'false'", "'-'", "'.'", "'E'", "'e'", "'string'", "'int'", "'float'", "'date'", "'bool'", "'&&'", "'||'", "'=='", "'!='", "'<'", "'>'", "'*'", "'/'", "'+'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
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
    // InternalTQL.g:72:1: ruleTQL returns [EObject current=null] : ( (lv_blocks_0_0= ruleBlock ) )* ;
    public final EObject ruleTQL() throws RecognitionException {
        EObject current = null;

        EObject lv_blocks_0_0 = null;



        	enterRule();

        try {
            // InternalTQL.g:78:2: ( ( (lv_blocks_0_0= ruleBlock ) )* )
            // InternalTQL.g:79:2: ( (lv_blocks_0_0= ruleBlock ) )*
            {
            // InternalTQL.g:79:2: ( (lv_blocks_0_0= ruleBlock ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=11 && LA1_0<=12)||LA1_0==17||LA1_0==22) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTQL.g:80:3: (lv_blocks_0_0= ruleBlock )
            	    {
            	    // InternalTQL.g:80:3: (lv_blocks_0_0= ruleBlock )
            	    // InternalTQL.g:81:4: lv_blocks_0_0= ruleBlock
            	    {

            	    				newCompositeNode(grammarAccess.getTQLAccess().getBlocksBlockParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_blocks_0_0=ruleBlock();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getTQLRule());
            	    				}
            	    				add(
            	    					current,
            	    					"blocks",
            	    					lv_blocks_0_0,
            	    					"nl.tue.gtl.TQL.Block");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // InternalTQL.g:108:1: ruleBlock returns [EObject current=null] : (this_Table_Impl_0= ruleTable_Impl | this_Mapping_1= ruleMapping | this_Transformation_2= ruleTransformation ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        EObject this_Table_Impl_0 = null;

        EObject this_Mapping_1 = null;

        EObject this_Transformation_2 = null;



        	enterRule();

        try {
            // InternalTQL.g:114:2: ( (this_Table_Impl_0= ruleTable_Impl | this_Mapping_1= ruleMapping | this_Transformation_2= ruleTransformation ) )
            // InternalTQL.g:115:2: (this_Table_Impl_0= ruleTable_Impl | this_Mapping_1= ruleMapping | this_Transformation_2= ruleTransformation )
            {
            // InternalTQL.g:115:2: (this_Table_Impl_0= ruleTable_Impl | this_Mapping_1= ruleMapping | this_Transformation_2= ruleTransformation )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
            case 12:
                {
                alt2=1;
                }
                break;
            case 17:
                {
                alt2=2;
                }
                break;
            case 22:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalTQL.g:116:3: this_Table_Impl_0= ruleTable_Impl
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
                    // InternalTQL.g:125:3: this_Mapping_1= ruleMapping
                    {

                    			newCompositeNode(grammarAccess.getBlockAccess().getMappingParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Mapping_1=ruleMapping();

                    state._fsp--;


                    			current = this_Mapping_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTQL.g:134:3: this_Transformation_2= ruleTransformation
                    {

                    			newCompositeNode(grammarAccess.getBlockAccess().getTransformationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Transformation_2=ruleTransformation();

                    state._fsp--;


                    			current = this_Transformation_2;
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
    // InternalTQL.g:146:1: entryRuleTable_Impl returns [EObject current=null] : iv_ruleTable_Impl= ruleTable_Impl EOF ;
    public final EObject entryRuleTable_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable_Impl = null;


        try {
            // InternalTQL.g:146:51: (iv_ruleTable_Impl= ruleTable_Impl EOF )
            // InternalTQL.g:147:2: iv_ruleTable_Impl= ruleTable_Impl EOF
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
    // InternalTQL.g:153:1: ruleTable_Impl returns [EObject current=null] : ( (otherlv_0= 'source' this_Source_Table_1= ruleSource_Table ) | (otherlv_2= 'target' this_Target_Table_3= ruleTarget_Table ) ) ;
    public final EObject ruleTable_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Source_Table_1 = null;

        EObject this_Target_Table_3 = null;



        	enterRule();

        try {
            // InternalTQL.g:159:2: ( ( (otherlv_0= 'source' this_Source_Table_1= ruleSource_Table ) | (otherlv_2= 'target' this_Target_Table_3= ruleTarget_Table ) ) )
            // InternalTQL.g:160:2: ( (otherlv_0= 'source' this_Source_Table_1= ruleSource_Table ) | (otherlv_2= 'target' this_Target_Table_3= ruleTarget_Table ) )
            {
            // InternalTQL.g:160:2: ( (otherlv_0= 'source' this_Source_Table_1= ruleSource_Table ) | (otherlv_2= 'target' this_Target_Table_3= ruleTarget_Table ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalTQL.g:161:3: (otherlv_0= 'source' this_Source_Table_1= ruleSource_Table )
                    {
                    // InternalTQL.g:161:3: (otherlv_0= 'source' this_Source_Table_1= ruleSource_Table )
                    // InternalTQL.g:162:4: otherlv_0= 'source' this_Source_Table_1= ruleSource_Table
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_4); 

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
                    // InternalTQL.g:176:3: (otherlv_2= 'target' this_Target_Table_3= ruleTarget_Table )
                    {
                    // InternalTQL.g:176:3: (otherlv_2= 'target' this_Target_Table_3= ruleTarget_Table )
                    // InternalTQL.g:177:4: otherlv_2= 'target' this_Target_Table_3= ruleTarget_Table
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_4); 

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


    // $ANTLR start "entryRuleColumn"
    // InternalTQL.g:194:1: entryRuleColumn returns [EObject current=null] : iv_ruleColumn= ruleColumn EOF ;
    public final EObject entryRuleColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumn = null;


        try {
            // InternalTQL.g:194:47: (iv_ruleColumn= ruleColumn EOF )
            // InternalTQL.g:195:2: iv_ruleColumn= ruleColumn EOF
            {
             newCompositeNode(grammarAccess.getColumnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColumn=ruleColumn();

            state._fsp--;

             current =iv_ruleColumn; 
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
    // $ANTLR end "entryRuleColumn"


    // $ANTLR start "ruleColumn"
    // InternalTQL.g:201:1: ruleColumn returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ) ;
    public final EObject ruleColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        Enumerator lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalTQL.g:207:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ) )
            // InternalTQL.g:208:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) )
            {
            // InternalTQL.g:208:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) )
            // InternalTQL.g:209:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) )
            {
            // InternalTQL.g:209:3: ( (lv_name_0_0= ruleEString ) )
            // InternalTQL.g:210:4: (lv_name_0_0= ruleEString )
            {
            // InternalTQL.g:210:4: (lv_name_0_0= ruleEString )
            // InternalTQL.g:211:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getColumnAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColumnRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"nl.tue.gtl.TQL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getColumnAccess().getColonKeyword_1());
            		
            // InternalTQL.g:232:3: ( (lv_type_2_0= ruleType ) )
            // InternalTQL.g:233:4: (lv_type_2_0= ruleType )
            {
            // InternalTQL.g:233:4: (lv_type_2_0= ruleType )
            // InternalTQL.g:234:5: lv_type_2_0= ruleType
            {

            					newCompositeNode(grammarAccess.getColumnAccess().getTypeTypeEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColumnRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"nl.tue.gtl.TQL.Type");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleColumn"


    // $ANTLR start "entryRuleSource_Table"
    // InternalTQL.g:255:1: entryRuleSource_Table returns [EObject current=null] : iv_ruleSource_Table= ruleSource_Table EOF ;
    public final EObject entryRuleSource_Table() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSource_Table = null;


        try {
            // InternalTQL.g:255:53: (iv_ruleSource_Table= ruleSource_Table EOF )
            // InternalTQL.g:256:2: iv_ruleSource_Table= ruleSource_Table EOF
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
    // InternalTQL.g:262:1: ruleSource_Table returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_columns_2_0= ruleColumn ) ) (otherlv_3= ',' ( (lv_columns_4_0= ruleColumn ) ) )* otherlv_5= '}' ) ;
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
            // InternalTQL.g:268:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_columns_2_0= ruleColumn ) ) (otherlv_3= ',' ( (lv_columns_4_0= ruleColumn ) ) )* otherlv_5= '}' ) )
            // InternalTQL.g:269:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_columns_2_0= ruleColumn ) ) (otherlv_3= ',' ( (lv_columns_4_0= ruleColumn ) ) )* otherlv_5= '}' )
            {
            // InternalTQL.g:269:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_columns_2_0= ruleColumn ) ) (otherlv_3= ',' ( (lv_columns_4_0= ruleColumn ) ) )* otherlv_5= '}' )
            // InternalTQL.g:270:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_columns_2_0= ruleColumn ) ) (otherlv_3= ',' ( (lv_columns_4_0= ruleColumn ) ) )* otherlv_5= '}'
            {
            // InternalTQL.g:270:3: ( (lv_name_0_0= ruleEString ) )
            // InternalTQL.g:271:4: (lv_name_0_0= ruleEString )
            {
            // InternalTQL.g:271:4: (lv_name_0_0= ruleEString )
            // InternalTQL.g:272:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSource_TableAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
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

            otherlv_1=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSource_TableAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalTQL.g:293:3: ( (lv_columns_2_0= ruleColumn ) )
            // InternalTQL.g:294:4: (lv_columns_2_0= ruleColumn )
            {
            // InternalTQL.g:294:4: (lv_columns_2_0= ruleColumn )
            // InternalTQL.g:295:5: lv_columns_2_0= ruleColumn
            {

            					newCompositeNode(grammarAccess.getSource_TableAccess().getColumnsColumnParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_columns_2_0=ruleColumn();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSource_TableRule());
            					}
            					add(
            						current,
            						"columns",
            						lv_columns_2_0,
            						"nl.tue.gtl.TQL.Column");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTQL.g:312:3: (otherlv_3= ',' ( (lv_columns_4_0= ruleColumn ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalTQL.g:313:4: otherlv_3= ',' ( (lv_columns_4_0= ruleColumn ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_4); 

            	    				newLeafNode(otherlv_3, grammarAccess.getSource_TableAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalTQL.g:317:4: ( (lv_columns_4_0= ruleColumn ) )
            	    // InternalTQL.g:318:5: (lv_columns_4_0= ruleColumn )
            	    {
            	    // InternalTQL.g:318:5: (lv_columns_4_0= ruleColumn )
            	    // InternalTQL.g:319:6: lv_columns_4_0= ruleColumn
            	    {

            	    						newCompositeNode(grammarAccess.getSource_TableAccess().getColumnsColumnParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_columns_4_0=ruleColumn();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSource_TableRule());
            	    						}
            	    						add(
            	    							current,
            	    							"columns",
            	    							lv_columns_4_0,
            	    							"nl.tue.gtl.TQL.Column");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

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
    // InternalTQL.g:345:1: entryRuleTarget_Table returns [EObject current=null] : iv_ruleTarget_Table= ruleTarget_Table EOF ;
    public final EObject entryRuleTarget_Table() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTarget_Table = null;


        try {
            // InternalTQL.g:345:53: (iv_ruleTarget_Table= ruleTarget_Table EOF )
            // InternalTQL.g:346:2: iv_ruleTarget_Table= ruleTarget_Table EOF
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
    // InternalTQL.g:352:1: ruleTarget_Table returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_columns_2_0= ruleColumn ) ) (otherlv_3= ',' ( (lv_columns_4_0= ruleColumn ) ) )* otherlv_5= '}' ) ;
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
            // InternalTQL.g:358:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_columns_2_0= ruleColumn ) ) (otherlv_3= ',' ( (lv_columns_4_0= ruleColumn ) ) )* otherlv_5= '}' ) )
            // InternalTQL.g:359:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_columns_2_0= ruleColumn ) ) (otherlv_3= ',' ( (lv_columns_4_0= ruleColumn ) ) )* otherlv_5= '}' )
            {
            // InternalTQL.g:359:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_columns_2_0= ruleColumn ) ) (otherlv_3= ',' ( (lv_columns_4_0= ruleColumn ) ) )* otherlv_5= '}' )
            // InternalTQL.g:360:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_columns_2_0= ruleColumn ) ) (otherlv_3= ',' ( (lv_columns_4_0= ruleColumn ) ) )* otherlv_5= '}'
            {
            // InternalTQL.g:360:3: ( (lv_name_0_0= ruleEString ) )
            // InternalTQL.g:361:4: (lv_name_0_0= ruleEString )
            {
            // InternalTQL.g:361:4: (lv_name_0_0= ruleEString )
            // InternalTQL.g:362:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTarget_TableAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
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

            otherlv_1=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTarget_TableAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalTQL.g:383:3: ( (lv_columns_2_0= ruleColumn ) )
            // InternalTQL.g:384:4: (lv_columns_2_0= ruleColumn )
            {
            // InternalTQL.g:384:4: (lv_columns_2_0= ruleColumn )
            // InternalTQL.g:385:5: lv_columns_2_0= ruleColumn
            {

            					newCompositeNode(grammarAccess.getTarget_TableAccess().getColumnsColumnParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_columns_2_0=ruleColumn();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTarget_TableRule());
            					}
            					add(
            						current,
            						"columns",
            						lv_columns_2_0,
            						"nl.tue.gtl.TQL.Column");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTQL.g:402:3: (otherlv_3= ',' ( (lv_columns_4_0= ruleColumn ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalTQL.g:403:4: otherlv_3= ',' ( (lv_columns_4_0= ruleColumn ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_4); 

            	    				newLeafNode(otherlv_3, grammarAccess.getTarget_TableAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalTQL.g:407:4: ( (lv_columns_4_0= ruleColumn ) )
            	    // InternalTQL.g:408:5: (lv_columns_4_0= ruleColumn )
            	    {
            	    // InternalTQL.g:408:5: (lv_columns_4_0= ruleColumn )
            	    // InternalTQL.g:409:6: lv_columns_4_0= ruleColumn
            	    {

            	    						newCompositeNode(grammarAccess.getTarget_TableAccess().getColumnsColumnParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_columns_4_0=ruleColumn();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTarget_TableRule());
            	    						}
            	    						add(
            	    							current,
            	    							"columns",
            	    							lv_columns_4_0,
            	    							"nl.tue.gtl.TQL.Column");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

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


    // $ANTLR start "entryRuleMapping"
    // InternalTQL.g:435:1: entryRuleMapping returns [EObject current=null] : iv_ruleMapping= ruleMapping EOF ;
    public final EObject entryRuleMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapping = null;


        try {
            // InternalTQL.g:435:48: (iv_ruleMapping= ruleMapping EOF )
            // InternalTQL.g:436:2: iv_ruleMapping= ruleMapping EOF
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
    // InternalTQL.g:442:1: ruleMapping returns [EObject current=null] : (otherlv_0= 'mapping' ( ( ruleEString ) ) otherlv_2= '->' ( ( ruleEString ) ) otherlv_4= '{' ( (lv_mappedColumns_5_0= ruleMapped_Column ) ) (otherlv_6= ',' ( (lv_mappedColumns_7_0= ruleMapped_Column ) ) )* otherlv_8= '}' ) ;
    public final EObject ruleMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_mappedColumns_5_0 = null;

        EObject lv_mappedColumns_7_0 = null;



        	enterRule();

        try {
            // InternalTQL.g:448:2: ( (otherlv_0= 'mapping' ( ( ruleEString ) ) otherlv_2= '->' ( ( ruleEString ) ) otherlv_4= '{' ( (lv_mappedColumns_5_0= ruleMapped_Column ) ) (otherlv_6= ',' ( (lv_mappedColumns_7_0= ruleMapped_Column ) ) )* otherlv_8= '}' ) )
            // InternalTQL.g:449:2: (otherlv_0= 'mapping' ( ( ruleEString ) ) otherlv_2= '->' ( ( ruleEString ) ) otherlv_4= '{' ( (lv_mappedColumns_5_0= ruleMapped_Column ) ) (otherlv_6= ',' ( (lv_mappedColumns_7_0= ruleMapped_Column ) ) )* otherlv_8= '}' )
            {
            // InternalTQL.g:449:2: (otherlv_0= 'mapping' ( ( ruleEString ) ) otherlv_2= '->' ( ( ruleEString ) ) otherlv_4= '{' ( (lv_mappedColumns_5_0= ruleMapped_Column ) ) (otherlv_6= ',' ( (lv_mappedColumns_7_0= ruleMapped_Column ) ) )* otherlv_8= '}' )
            // InternalTQL.g:450:3: otherlv_0= 'mapping' ( ( ruleEString ) ) otherlv_2= '->' ( ( ruleEString ) ) otherlv_4= '{' ( (lv_mappedColumns_5_0= ruleMapped_Column ) ) (otherlv_6= ',' ( (lv_mappedColumns_7_0= ruleMapped_Column ) ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMappingAccess().getMappingKeyword_0());
            		
            // InternalTQL.g:454:3: ( ( ruleEString ) )
            // InternalTQL.g:455:4: ( ruleEString )
            {
            // InternalTQL.g:455:4: ( ruleEString )
            // InternalTQL.g:456:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMappingRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMappingAccess().getSourceSourceTableCrossReference_1_0());
            				
            pushFollow(FOLLOW_9);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getMappingAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            // InternalTQL.g:474:3: ( ( ruleEString ) )
            // InternalTQL.g:475:4: ( ruleEString )
            {
            // InternalTQL.g:475:4: ( ruleEString )
            // InternalTQL.g:476:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMappingRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMappingAccess().getTargetTargetTableCrossReference_3_0());
            				
            pushFollow(FOLLOW_7);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getMappingAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalTQL.g:494:3: ( (lv_mappedColumns_5_0= ruleMapped_Column ) )
            // InternalTQL.g:495:4: (lv_mappedColumns_5_0= ruleMapped_Column )
            {
            // InternalTQL.g:495:4: (lv_mappedColumns_5_0= ruleMapped_Column )
            // InternalTQL.g:496:5: lv_mappedColumns_5_0= ruleMapped_Column
            {

            					newCompositeNode(grammarAccess.getMappingAccess().getMappedColumnsMapped_ColumnParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
            lv_mappedColumns_5_0=ruleMapped_Column();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMappingRule());
            					}
            					add(
            						current,
            						"mappedColumns",
            						lv_mappedColumns_5_0,
            						"nl.tue.gtl.TQL.Mapped_Column");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTQL.g:513:3: (otherlv_6= ',' ( (lv_mappedColumns_7_0= ruleMapped_Column ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalTQL.g:514:4: otherlv_6= ',' ( (lv_mappedColumns_7_0= ruleMapped_Column ) )
            	    {
            	    otherlv_6=(Token)match(input,15,FOLLOW_4); 

            	    				newLeafNode(otherlv_6, grammarAccess.getMappingAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalTQL.g:518:4: ( (lv_mappedColumns_7_0= ruleMapped_Column ) )
            	    // InternalTQL.g:519:5: (lv_mappedColumns_7_0= ruleMapped_Column )
            	    {
            	    // InternalTQL.g:519:5: (lv_mappedColumns_7_0= ruleMapped_Column )
            	    // InternalTQL.g:520:6: lv_mappedColumns_7_0= ruleMapped_Column
            	    {

            	    						newCompositeNode(grammarAccess.getMappingAccess().getMappedColumnsMapped_ColumnParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_mappedColumns_7_0=ruleMapped_Column();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMappingRule());
            	    						}
            	    						add(
            	    							current,
            	    							"mappedColumns",
            	    							lv_mappedColumns_7_0,
            	    							"nl.tue.gtl.TQL.Mapped_Column");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_8=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getMappingAccess().getRightCurlyBracketKeyword_7());
            		

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


    // $ANTLR start "entryRuleMapped_Column"
    // InternalTQL.g:546:1: entryRuleMapped_Column returns [EObject current=null] : iv_ruleMapped_Column= ruleMapped_Column EOF ;
    public final EObject entryRuleMapped_Column() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapped_Column = null;


        try {
            // InternalTQL.g:546:54: (iv_ruleMapped_Column= ruleMapped_Column EOF )
            // InternalTQL.g:547:2: iv_ruleMapped_Column= ruleMapped_Column EOF
            {
             newCompositeNode(grammarAccess.getMapped_ColumnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMapped_Column=ruleMapped_Column();

            state._fsp--;

             current =iv_ruleMapped_Column; 
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
    // $ANTLR end "entryRuleMapped_Column"


    // $ANTLR start "ruleMapped_Column"
    // InternalTQL.g:553:1: ruleMapped_Column returns [EObject current=null] : ( ( ( ruleEString ) ) otherlv_1= ':' ( ( ruleEString ) ) (otherlv_3= '|' ( (lv_transformationCalls_4_0= ruleTransformation_Call ) ) )* ) ;
    public final EObject ruleMapped_Column() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_transformationCalls_4_0 = null;



        	enterRule();

        try {
            // InternalTQL.g:559:2: ( ( ( ( ruleEString ) ) otherlv_1= ':' ( ( ruleEString ) ) (otherlv_3= '|' ( (lv_transformationCalls_4_0= ruleTransformation_Call ) ) )* ) )
            // InternalTQL.g:560:2: ( ( ( ruleEString ) ) otherlv_1= ':' ( ( ruleEString ) ) (otherlv_3= '|' ( (lv_transformationCalls_4_0= ruleTransformation_Call ) ) )* )
            {
            // InternalTQL.g:560:2: ( ( ( ruleEString ) ) otherlv_1= ':' ( ( ruleEString ) ) (otherlv_3= '|' ( (lv_transformationCalls_4_0= ruleTransformation_Call ) ) )* )
            // InternalTQL.g:561:3: ( ( ruleEString ) ) otherlv_1= ':' ( ( ruleEString ) ) (otherlv_3= '|' ( (lv_transformationCalls_4_0= ruleTransformation_Call ) ) )*
            {
            // InternalTQL.g:561:3: ( ( ruleEString ) )
            // InternalTQL.g:562:4: ( ruleEString )
            {
            // InternalTQL.g:562:4: ( ruleEString )
            // InternalTQL.g:563:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMapped_ColumnRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMapped_ColumnAccess().getTargetColumnCrossReference_0_0());
            				
            pushFollow(FOLLOW_5);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getMapped_ColumnAccess().getColonKeyword_1());
            		
            // InternalTQL.g:581:3: ( ( ruleEString ) )
            // InternalTQL.g:582:4: ( ruleEString )
            {
            // InternalTQL.g:582:4: ( ruleEString )
            // InternalTQL.g:583:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMapped_ColumnRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMapped_ColumnAccess().getSourceColumnCrossReference_2_0());
            				
            pushFollow(FOLLOW_10);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTQL.g:597:3: (otherlv_3= '|' ( (lv_transformationCalls_4_0= ruleTransformation_Call ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalTQL.g:598:4: otherlv_3= '|' ( (lv_transformationCalls_4_0= ruleTransformation_Call ) )
            	    {
            	    otherlv_3=(Token)match(input,19,FOLLOW_4); 

            	    				newLeafNode(otherlv_3, grammarAccess.getMapped_ColumnAccess().getVerticalLineKeyword_3_0());
            	    			
            	    // InternalTQL.g:602:4: ( (lv_transformationCalls_4_0= ruleTransformation_Call ) )
            	    // InternalTQL.g:603:5: (lv_transformationCalls_4_0= ruleTransformation_Call )
            	    {
            	    // InternalTQL.g:603:5: (lv_transformationCalls_4_0= ruleTransformation_Call )
            	    // InternalTQL.g:604:6: lv_transformationCalls_4_0= ruleTransformation_Call
            	    {

            	    						newCompositeNode(grammarAccess.getMapped_ColumnAccess().getTransformationCallsTransformation_CallParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_transformationCalls_4_0=ruleTransformation_Call();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMapped_ColumnRule());
            	    						}
            	    						add(
            	    							current,
            	    							"transformationCalls",
            	    							lv_transformationCalls_4_0,
            	    							"nl.tue.gtl.TQL.Transformation_Call");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


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
    // $ANTLR end "ruleMapped_Column"


    // $ANTLR start "entryRuleTransformation_Call"
    // InternalTQL.g:626:1: entryRuleTransformation_Call returns [EObject current=null] : iv_ruleTransformation_Call= ruleTransformation_Call EOF ;
    public final EObject entryRuleTransformation_Call() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransformation_Call = null;


        try {
            // InternalTQL.g:626:60: (iv_ruleTransformation_Call= ruleTransformation_Call EOF )
            // InternalTQL.g:627:2: iv_ruleTransformation_Call= ruleTransformation_Call EOF
            {
             newCompositeNode(grammarAccess.getTransformation_CallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransformation_Call=ruleTransformation_Call();

            state._fsp--;

             current =iv_ruleTransformation_Call; 
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
    // $ANTLR end "entryRuleTransformation_Call"


    // $ANTLR start "ruleTransformation_Call"
    // InternalTQL.g:633:1: ruleTransformation_Call returns [EObject current=null] : ( ( ( ruleEString ) ) otherlv_1= '(' ( ( (lv_callParameters_2_0= ruleCall_Parameter ) ) (otherlv_3= ',' ( (lv_callParameters_4_0= ruleCall_Parameter ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleTransformation_Call() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_callParameters_2_0 = null;

        EObject lv_callParameters_4_0 = null;



        	enterRule();

        try {
            // InternalTQL.g:639:2: ( ( ( ( ruleEString ) ) otherlv_1= '(' ( ( (lv_callParameters_2_0= ruleCall_Parameter ) ) (otherlv_3= ',' ( (lv_callParameters_4_0= ruleCall_Parameter ) ) )* )? otherlv_5= ')' ) )
            // InternalTQL.g:640:2: ( ( ( ruleEString ) ) otherlv_1= '(' ( ( (lv_callParameters_2_0= ruleCall_Parameter ) ) (otherlv_3= ',' ( (lv_callParameters_4_0= ruleCall_Parameter ) ) )* )? otherlv_5= ')' )
            {
            // InternalTQL.g:640:2: ( ( ( ruleEString ) ) otherlv_1= '(' ( ( (lv_callParameters_2_0= ruleCall_Parameter ) ) (otherlv_3= ',' ( (lv_callParameters_4_0= ruleCall_Parameter ) ) )* )? otherlv_5= ')' )
            // InternalTQL.g:641:3: ( ( ruleEString ) ) otherlv_1= '(' ( ( (lv_callParameters_2_0= ruleCall_Parameter ) ) (otherlv_3= ',' ( (lv_callParameters_4_0= ruleCall_Parameter ) ) )* )? otherlv_5= ')'
            {
            // InternalTQL.g:641:3: ( ( ruleEString ) )
            // InternalTQL.g:642:4: ( ruleEString )
            {
            // InternalTQL.g:642:4: ( ruleEString )
            // InternalTQL.g:643:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransformation_CallRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransformation_CallAccess().getTransformationTransformationCrossReference_0_0());
            				
            pushFollow(FOLLOW_11);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getTransformation_CallAccess().getLeftParenthesisKeyword_1());
            		
            // InternalTQL.g:661:3: ( ( (lv_callParameters_2_0= ruleCall_Parameter ) ) (otherlv_3= ',' ( (lv_callParameters_4_0= ruleCall_Parameter ) ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_STRING && LA9_0<=RULE_INT)||(LA9_0>=25 && LA9_0<=27)||(LA9_0>=29 && LA9_0<=32)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalTQL.g:662:4: ( (lv_callParameters_2_0= ruleCall_Parameter ) ) (otherlv_3= ',' ( (lv_callParameters_4_0= ruleCall_Parameter ) ) )*
                    {
                    // InternalTQL.g:662:4: ( (lv_callParameters_2_0= ruleCall_Parameter ) )
                    // InternalTQL.g:663:5: (lv_callParameters_2_0= ruleCall_Parameter )
                    {
                    // InternalTQL.g:663:5: (lv_callParameters_2_0= ruleCall_Parameter )
                    // InternalTQL.g:664:6: lv_callParameters_2_0= ruleCall_Parameter
                    {

                    						newCompositeNode(grammarAccess.getTransformation_CallAccess().getCallParametersCall_ParameterParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_callParameters_2_0=ruleCall_Parameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTransformation_CallRule());
                    						}
                    						add(
                    							current,
                    							"callParameters",
                    							lv_callParameters_2_0,
                    							"nl.tue.gtl.TQL.Call_Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTQL.g:681:4: (otherlv_3= ',' ( (lv_callParameters_4_0= ruleCall_Parameter ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==15) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalTQL.g:682:5: otherlv_3= ',' ( (lv_callParameters_4_0= ruleCall_Parameter ) )
                    	    {
                    	    otherlv_3=(Token)match(input,15,FOLLOW_14); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getTransformation_CallAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalTQL.g:686:5: ( (lv_callParameters_4_0= ruleCall_Parameter ) )
                    	    // InternalTQL.g:687:6: (lv_callParameters_4_0= ruleCall_Parameter )
                    	    {
                    	    // InternalTQL.g:687:6: (lv_callParameters_4_0= ruleCall_Parameter )
                    	    // InternalTQL.g:688:7: lv_callParameters_4_0= ruleCall_Parameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getTransformation_CallAccess().getCallParametersCall_ParameterParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_callParameters_4_0=ruleCall_Parameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTransformation_CallRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"callParameters",
                    	    								lv_callParameters_4_0,
                    	    								"nl.tue.gtl.TQL.Call_Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getTransformation_CallAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleTransformation_Call"


    // $ANTLR start "entryRuleTransformation"
    // InternalTQL.g:715:1: entryRuleTransformation returns [EObject current=null] : iv_ruleTransformation= ruleTransformation EOF ;
    public final EObject entryRuleTransformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransformation = null;


        try {
            // InternalTQL.g:715:55: (iv_ruleTransformation= ruleTransformation EOF )
            // InternalTQL.g:716:2: iv_ruleTransformation= ruleTransformation EOF
            {
             newCompositeNode(grammarAccess.getTransformationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransformation=ruleTransformation();

            state._fsp--;

             current =iv_ruleTransformation; 
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
    // $ANTLR end "entryRuleTransformation"


    // $ANTLR start "ruleTransformation"
    // InternalTQL.g:722:1: ruleTransformation returns [EObject current=null] : (otherlv_0= 'transformation' ( (lv_inType_1_0= ruleType ) ) otherlv_2= '::' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )* )? otherlv_8= ')' otherlv_9= ':' ( (lv_outType_10_0= ruleType ) ) otherlv_11= '{' ( (lv_body_12_0= ruleExpression ) ) otherlv_13= '}' ) ;
    public final EObject ruleTransformation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Enumerator lv_inType_1_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_parameters_5_0 = null;

        EObject lv_parameters_7_0 = null;

        Enumerator lv_outType_10_0 = null;

        EObject lv_body_12_0 = null;



        	enterRule();

        try {
            // InternalTQL.g:728:2: ( (otherlv_0= 'transformation' ( (lv_inType_1_0= ruleType ) ) otherlv_2= '::' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )* )? otherlv_8= ')' otherlv_9= ':' ( (lv_outType_10_0= ruleType ) ) otherlv_11= '{' ( (lv_body_12_0= ruleExpression ) ) otherlv_13= '}' ) )
            // InternalTQL.g:729:2: (otherlv_0= 'transformation' ( (lv_inType_1_0= ruleType ) ) otherlv_2= '::' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )* )? otherlv_8= ')' otherlv_9= ':' ( (lv_outType_10_0= ruleType ) ) otherlv_11= '{' ( (lv_body_12_0= ruleExpression ) ) otherlv_13= '}' )
            {
            // InternalTQL.g:729:2: (otherlv_0= 'transformation' ( (lv_inType_1_0= ruleType ) ) otherlv_2= '::' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )* )? otherlv_8= ')' otherlv_9= ':' ( (lv_outType_10_0= ruleType ) ) otherlv_11= '{' ( (lv_body_12_0= ruleExpression ) ) otherlv_13= '}' )
            // InternalTQL.g:730:3: otherlv_0= 'transformation' ( (lv_inType_1_0= ruleType ) ) otherlv_2= '::' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )* )? otherlv_8= ')' otherlv_9= ':' ( (lv_outType_10_0= ruleType ) ) otherlv_11= '{' ( (lv_body_12_0= ruleExpression ) ) otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getTransformationAccess().getTransformationKeyword_0());
            		
            // InternalTQL.g:734:3: ( (lv_inType_1_0= ruleType ) )
            // InternalTQL.g:735:4: (lv_inType_1_0= ruleType )
            {
            // InternalTQL.g:735:4: (lv_inType_1_0= ruleType )
            // InternalTQL.g:736:5: lv_inType_1_0= ruleType
            {

            					newCompositeNode(grammarAccess.getTransformationAccess().getInTypeTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
            lv_inType_1_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransformationRule());
            					}
            					set(
            						current,
            						"inType",
            						lv_inType_1_0,
            						"nl.tue.gtl.TQL.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getTransformationAccess().getColonColonKeyword_2());
            		
            // InternalTQL.g:757:3: ( (lv_name_3_0= ruleEString ) )
            // InternalTQL.g:758:4: (lv_name_3_0= ruleEString )
            {
            // InternalTQL.g:758:4: (lv_name_3_0= ruleEString )
            // InternalTQL.g:759:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTransformationAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransformationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"nl.tue.gtl.TQL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getTransformationAccess().getLeftParenthesisKeyword_4());
            		
            // InternalTQL.g:780:3: ( ( (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RULE_STRING && LA11_0<=RULE_ID)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalTQL.g:781:4: ( (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )*
                    {
                    // InternalTQL.g:781:4: ( (lv_parameters_5_0= ruleParameter ) )
                    // InternalTQL.g:782:5: (lv_parameters_5_0= ruleParameter )
                    {
                    // InternalTQL.g:782:5: (lv_parameters_5_0= ruleParameter )
                    // InternalTQL.g:783:6: lv_parameters_5_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getTransformationAccess().getParametersParameterParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_parameters_5_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTransformationRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_5_0,
                    							"nl.tue.gtl.TQL.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTQL.g:800:4: (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==15) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalTQL.g:801:5: otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) )
                    	    {
                    	    otherlv_6=(Token)match(input,15,FOLLOW_4); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getTransformationAccess().getCommaKeyword_5_1_0());
                    	    				
                    	    // InternalTQL.g:805:5: ( (lv_parameters_7_0= ruleParameter ) )
                    	    // InternalTQL.g:806:6: (lv_parameters_7_0= ruleParameter )
                    	    {
                    	    // InternalTQL.g:806:6: (lv_parameters_7_0= ruleParameter )
                    	    // InternalTQL.g:807:7: lv_parameters_7_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getTransformationAccess().getParametersParameterParserRuleCall_5_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_parameters_7_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTransformationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_7_0,
                    	    								"nl.tue.gtl.TQL.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_8, grammarAccess.getTransformationAccess().getRightParenthesisKeyword_6());
            		
            otherlv_9=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_9, grammarAccess.getTransformationAccess().getColonKeyword_7());
            		
            // InternalTQL.g:834:3: ( (lv_outType_10_0= ruleType ) )
            // InternalTQL.g:835:4: (lv_outType_10_0= ruleType )
            {
            // InternalTQL.g:835:4: (lv_outType_10_0= ruleType )
            // InternalTQL.g:836:5: lv_outType_10_0= ruleType
            {

            					newCompositeNode(grammarAccess.getTransformationAccess().getOutTypeTypeEnumRuleCall_8_0());
            				
            pushFollow(FOLLOW_7);
            lv_outType_10_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransformationRule());
            					}
            					set(
            						current,
            						"outType",
            						lv_outType_10_0,
            						"nl.tue.gtl.TQL.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,14,FOLLOW_17); 

            			newLeafNode(otherlv_11, grammarAccess.getTransformationAccess().getLeftCurlyBracketKeyword_9());
            		
            // InternalTQL.g:857:3: ( (lv_body_12_0= ruleExpression ) )
            // InternalTQL.g:858:4: (lv_body_12_0= ruleExpression )
            {
            // InternalTQL.g:858:4: (lv_body_12_0= ruleExpression )
            // InternalTQL.g:859:5: lv_body_12_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getTransformationAccess().getBodyExpressionParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_18);
            lv_body_12_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransformationRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_12_0,
            						"nl.tue.gtl.TQL.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getTransformationAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleTransformation"


    // $ANTLR start "entryRuleParameter"
    // InternalTQL.g:884:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalTQL.g:884:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalTQL.g:885:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalTQL.g:891:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        Enumerator lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalTQL.g:897:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ) )
            // InternalTQL.g:898:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) )
            {
            // InternalTQL.g:898:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) )
            // InternalTQL.g:899:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) )
            {
            // InternalTQL.g:899:3: ( (lv_name_0_0= ruleEString ) )
            // InternalTQL.g:900:4: (lv_name_0_0= ruleEString )
            {
            // InternalTQL.g:900:4: (lv_name_0_0= ruleEString )
            // InternalTQL.g:901:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"nl.tue.gtl.TQL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1());
            		
            // InternalTQL.g:922:3: ( (lv_type_2_0= ruleType ) )
            // InternalTQL.g:923:4: (lv_type_2_0= ruleType )
            {
            // InternalTQL.g:923:4: (lv_type_2_0= ruleType )
            // InternalTQL.g:924:5: lv_type_2_0= ruleType
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getTypeTypeEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"nl.tue.gtl.TQL.Type");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleCall_Parameter"
    // InternalTQL.g:945:1: entryRuleCall_Parameter returns [EObject current=null] : iv_ruleCall_Parameter= ruleCall_Parameter EOF ;
    public final EObject entryRuleCall_Parameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCall_Parameter = null;


        try {
            // InternalTQL.g:945:55: (iv_ruleCall_Parameter= ruleCall_Parameter EOF )
            // InternalTQL.g:946:2: iv_ruleCall_Parameter= ruleCall_Parameter EOF
            {
             newCompositeNode(grammarAccess.getCall_ParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCall_Parameter=ruleCall_Parameter();

            state._fsp--;

             current =iv_ruleCall_Parameter; 
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
    // $ANTLR end "entryRuleCall_Parameter"


    // $ANTLR start "ruleCall_Parameter"
    // InternalTQL.g:952:1: ruleCall_Parameter returns [EObject current=null] : (this_Constant_Call_Parameter_0= ruleConstant_Call_Parameter | this_Reference_Call_Parameter_1= ruleReference_Call_Parameter ) ;
    public final EObject ruleCall_Parameter() throws RecognitionException {
        EObject current = null;

        EObject this_Constant_Call_Parameter_0 = null;

        EObject this_Reference_Call_Parameter_1 = null;



        	enterRule();

        try {
            // InternalTQL.g:958:2: ( (this_Constant_Call_Parameter_0= ruleConstant_Call_Parameter | this_Reference_Call_Parameter_1= ruleReference_Call_Parameter ) )
            // InternalTQL.g:959:2: (this_Constant_Call_Parameter_0= ruleConstant_Call_Parameter | this_Reference_Call_Parameter_1= ruleReference_Call_Parameter )
            {
            // InternalTQL.g:959:2: (this_Constant_Call_Parameter_0= ruleConstant_Call_Parameter | this_Reference_Call_Parameter_1= ruleReference_Call_Parameter )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INT||(LA12_0>=25 && LA12_0<=27)||(LA12_0>=29 && LA12_0<=32)) ) {
                alt12=1;
            }
            else if ( ((LA12_0>=RULE_STRING && LA12_0<=RULE_ID)) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalTQL.g:960:3: this_Constant_Call_Parameter_0= ruleConstant_Call_Parameter
                    {

                    			newCompositeNode(grammarAccess.getCall_ParameterAccess().getConstant_Call_ParameterParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Constant_Call_Parameter_0=ruleConstant_Call_Parameter();

                    state._fsp--;


                    			current = this_Constant_Call_Parameter_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTQL.g:969:3: this_Reference_Call_Parameter_1= ruleReference_Call_Parameter
                    {

                    			newCompositeNode(grammarAccess.getCall_ParameterAccess().getReference_Call_ParameterParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Reference_Call_Parameter_1=ruleReference_Call_Parameter();

                    state._fsp--;


                    			current = this_Reference_Call_Parameter_1;
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
    // $ANTLR end "ruleCall_Parameter"


    // $ANTLR start "entryRuleConstant_Call_Parameter"
    // InternalTQL.g:981:1: entryRuleConstant_Call_Parameter returns [EObject current=null] : iv_ruleConstant_Call_Parameter= ruleConstant_Call_Parameter EOF ;
    public final EObject entryRuleConstant_Call_Parameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant_Call_Parameter = null;


        try {
            // InternalTQL.g:981:64: (iv_ruleConstant_Call_Parameter= ruleConstant_Call_Parameter EOF )
            // InternalTQL.g:982:2: iv_ruleConstant_Call_Parameter= ruleConstant_Call_Parameter EOF
            {
             newCompositeNode(grammarAccess.getConstant_Call_ParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstant_Call_Parameter=ruleConstant_Call_Parameter();

            state._fsp--;

             current =iv_ruleConstant_Call_Parameter; 
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
    // $ANTLR end "entryRuleConstant_Call_Parameter"


    // $ANTLR start "ruleConstant_Call_Parameter"
    // InternalTQL.g:988:1: ruleConstant_Call_Parameter returns [EObject current=null] : ( (lv_parameter_0_0= ruleConstant ) ) ;
    public final EObject ruleConstant_Call_Parameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameter_0_0 = null;



        	enterRule();

        try {
            // InternalTQL.g:994:2: ( ( (lv_parameter_0_0= ruleConstant ) ) )
            // InternalTQL.g:995:2: ( (lv_parameter_0_0= ruleConstant ) )
            {
            // InternalTQL.g:995:2: ( (lv_parameter_0_0= ruleConstant ) )
            // InternalTQL.g:996:3: (lv_parameter_0_0= ruleConstant )
            {
            // InternalTQL.g:996:3: (lv_parameter_0_0= ruleConstant )
            // InternalTQL.g:997:4: lv_parameter_0_0= ruleConstant
            {

            				newCompositeNode(grammarAccess.getConstant_Call_ParameterAccess().getParameterConstantParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_parameter_0_0=ruleConstant();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getConstant_Call_ParameterRule());
            				}
            				set(
            					current,
            					"parameter",
            					lv_parameter_0_0,
            					"nl.tue.gtl.TQL.Constant");
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
    // $ANTLR end "ruleConstant_Call_Parameter"


    // $ANTLR start "entryRuleReference_Call_Parameter"
    // InternalTQL.g:1017:1: entryRuleReference_Call_Parameter returns [EObject current=null] : iv_ruleReference_Call_Parameter= ruleReference_Call_Parameter EOF ;
    public final EObject entryRuleReference_Call_Parameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference_Call_Parameter = null;


        try {
            // InternalTQL.g:1017:65: (iv_ruleReference_Call_Parameter= ruleReference_Call_Parameter EOF )
            // InternalTQL.g:1018:2: iv_ruleReference_Call_Parameter= ruleReference_Call_Parameter EOF
            {
             newCompositeNode(grammarAccess.getReference_Call_ParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReference_Call_Parameter=ruleReference_Call_Parameter();

            state._fsp--;

             current =iv_ruleReference_Call_Parameter; 
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
    // $ANTLR end "entryRuleReference_Call_Parameter"


    // $ANTLR start "ruleReference_Call_Parameter"
    // InternalTQL.g:1024:1: ruleReference_Call_Parameter returns [EObject current=null] : ( ( ruleEString ) ) ;
    public final EObject ruleReference_Call_Parameter() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalTQL.g:1030:2: ( ( ( ruleEString ) ) )
            // InternalTQL.g:1031:2: ( ( ruleEString ) )
            {
            // InternalTQL.g:1031:2: ( ( ruleEString ) )
            // InternalTQL.g:1032:3: ( ruleEString )
            {
            // InternalTQL.g:1032:3: ( ruleEString )
            // InternalTQL.g:1033:4: ruleEString
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getReference_Call_ParameterRule());
            				}
            			

            				newCompositeNode(grammarAccess.getReference_Call_ParameterAccess().getReferenceColumnCrossReference_0());
            			
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


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
    // $ANTLR end "ruleReference_Call_Parameter"


    // $ANTLR start "entryRuleExpression"
    // InternalTQL.g:1050:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalTQL.g:1050:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalTQL.g:1051:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalTQL.g:1057:1: ruleExpression returns [EObject current=null] : this_And_Expression_0= ruleAnd_Expression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_And_Expression_0 = null;



        	enterRule();

        try {
            // InternalTQL.g:1063:2: (this_And_Expression_0= ruleAnd_Expression )
            // InternalTQL.g:1064:2: this_And_Expression_0= ruleAnd_Expression
            {

            		newCompositeNode(grammarAccess.getExpressionAccess().getAnd_ExpressionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_And_Expression_0=ruleAnd_Expression();

            state._fsp--;


            		current = this_And_Expression_0;
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleAnd_Expression"
    // InternalTQL.g:1075:1: entryRuleAnd_Expression returns [EObject current=null] : iv_ruleAnd_Expression= ruleAnd_Expression EOF ;
    public final EObject entryRuleAnd_Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd_Expression = null;


        try {
            // InternalTQL.g:1075:55: (iv_ruleAnd_Expression= ruleAnd_Expression EOF )
            // InternalTQL.g:1076:2: iv_ruleAnd_Expression= ruleAnd_Expression EOF
            {
             newCompositeNode(grammarAccess.getAnd_ExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnd_Expression=ruleAnd_Expression();

            state._fsp--;

             current =iv_ruleAnd_Expression; 
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
    // $ANTLR end "entryRuleAnd_Expression"


    // $ANTLR start "ruleAnd_Expression"
    // InternalTQL.g:1082:1: ruleAnd_Expression returns [EObject current=null] : (this_Or_Expression_0= ruleOr_Expression ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleOr_Expression ) ) )* ) ;
    public final EObject ruleAnd_Expression() throws RecognitionException {
        EObject current = null;

        EObject this_Or_Expression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTQL.g:1088:2: ( (this_Or_Expression_0= ruleOr_Expression ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleOr_Expression ) ) )* ) )
            // InternalTQL.g:1089:2: (this_Or_Expression_0= ruleOr_Expression ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleOr_Expression ) ) )* )
            {
            // InternalTQL.g:1089:2: (this_Or_Expression_0= ruleOr_Expression ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleOr_Expression ) ) )* )
            // InternalTQL.g:1090:3: this_Or_Expression_0= ruleOr_Expression ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleOr_Expression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAnd_ExpressionAccess().getOr_ExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_19);
            this_Or_Expression_0=ruleOr_Expression();

            state._fsp--;


            			current = this_Or_Expression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalTQL.g:1098:3: ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleOr_Expression ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==40) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalTQL.g:1099:4: () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleOr_Expression ) )
            	    {
            	    // InternalTQL.g:1099:4: ()
            	    // InternalTQL.g:1100:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAnd_ExpressionAccess().getAnd_ExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalTQL.g:1106:4: ( (lv_operator_2_0= ruleAndOperator ) )
            	    // InternalTQL.g:1107:5: (lv_operator_2_0= ruleAndOperator )
            	    {
            	    // InternalTQL.g:1107:5: (lv_operator_2_0= ruleAndOperator )
            	    // InternalTQL.g:1108:6: lv_operator_2_0= ruleAndOperator
            	    {

            	    						newCompositeNode(grammarAccess.getAnd_ExpressionAccess().getOperatorAndOperatorEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_operator_2_0=ruleAndOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAnd_ExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"nl.tue.gtl.TQL.AndOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalTQL.g:1125:4: ( (lv_right_3_0= ruleOr_Expression ) )
            	    // InternalTQL.g:1126:5: (lv_right_3_0= ruleOr_Expression )
            	    {
            	    // InternalTQL.g:1126:5: (lv_right_3_0= ruleOr_Expression )
            	    // InternalTQL.g:1127:6: lv_right_3_0= ruleOr_Expression
            	    {

            	    						newCompositeNode(grammarAccess.getAnd_ExpressionAccess().getRightOr_ExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_right_3_0=ruleOr_Expression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAnd_ExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"nl.tue.gtl.TQL.Or_Expression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


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
    // $ANTLR end "ruleAnd_Expression"


    // $ANTLR start "entryRuleOr_Expression"
    // InternalTQL.g:1149:1: entryRuleOr_Expression returns [EObject current=null] : iv_ruleOr_Expression= ruleOr_Expression EOF ;
    public final EObject entryRuleOr_Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr_Expression = null;


        try {
            // InternalTQL.g:1149:54: (iv_ruleOr_Expression= ruleOr_Expression EOF )
            // InternalTQL.g:1150:2: iv_ruleOr_Expression= ruleOr_Expression EOF
            {
             newCompositeNode(grammarAccess.getOr_ExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOr_Expression=ruleOr_Expression();

            state._fsp--;

             current =iv_ruleOr_Expression; 
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
    // $ANTLR end "entryRuleOr_Expression"


    // $ANTLR start "ruleOr_Expression"
    // InternalTQL.g:1156:1: ruleOr_Expression returns [EObject current=null] : (this_Equals_Expression_0= ruleEquals_Expression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_right_3_0= ruleEquals_Expression ) ) )* ) ;
    public final EObject ruleOr_Expression() throws RecognitionException {
        EObject current = null;

        EObject this_Equals_Expression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTQL.g:1162:2: ( (this_Equals_Expression_0= ruleEquals_Expression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_right_3_0= ruleEquals_Expression ) ) )* ) )
            // InternalTQL.g:1163:2: (this_Equals_Expression_0= ruleEquals_Expression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_right_3_0= ruleEquals_Expression ) ) )* )
            {
            // InternalTQL.g:1163:2: (this_Equals_Expression_0= ruleEquals_Expression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_right_3_0= ruleEquals_Expression ) ) )* )
            // InternalTQL.g:1164:3: this_Equals_Expression_0= ruleEquals_Expression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_right_3_0= ruleEquals_Expression ) ) )*
            {

            			newCompositeNode(grammarAccess.getOr_ExpressionAccess().getEquals_ExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_20);
            this_Equals_Expression_0=ruleEquals_Expression();

            state._fsp--;


            			current = this_Equals_Expression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalTQL.g:1172:3: ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_right_3_0= ruleEquals_Expression ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==41) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalTQL.g:1173:4: () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_right_3_0= ruleEquals_Expression ) )
            	    {
            	    // InternalTQL.g:1173:4: ()
            	    // InternalTQL.g:1174:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOr_ExpressionAccess().getOr_ExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalTQL.g:1180:4: ( (lv_operator_2_0= ruleOrOperator ) )
            	    // InternalTQL.g:1181:5: (lv_operator_2_0= ruleOrOperator )
            	    {
            	    // InternalTQL.g:1181:5: (lv_operator_2_0= ruleOrOperator )
            	    // InternalTQL.g:1182:6: lv_operator_2_0= ruleOrOperator
            	    {

            	    						newCompositeNode(grammarAccess.getOr_ExpressionAccess().getOperatorOrOperatorEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_operator_2_0=ruleOrOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOr_ExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"nl.tue.gtl.TQL.OrOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalTQL.g:1199:4: ( (lv_right_3_0= ruleEquals_Expression ) )
            	    // InternalTQL.g:1200:5: (lv_right_3_0= ruleEquals_Expression )
            	    {
            	    // InternalTQL.g:1200:5: (lv_right_3_0= ruleEquals_Expression )
            	    // InternalTQL.g:1201:6: lv_right_3_0= ruleEquals_Expression
            	    {

            	    						newCompositeNode(grammarAccess.getOr_ExpressionAccess().getRightEquals_ExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_right_3_0=ruleEquals_Expression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOr_ExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"nl.tue.gtl.TQL.Equals_Expression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


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
    // $ANTLR end "ruleOr_Expression"


    // $ANTLR start "entryRuleEquals_Expression"
    // InternalTQL.g:1223:1: entryRuleEquals_Expression returns [EObject current=null] : iv_ruleEquals_Expression= ruleEquals_Expression EOF ;
    public final EObject entryRuleEquals_Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquals_Expression = null;


        try {
            // InternalTQL.g:1223:58: (iv_ruleEquals_Expression= ruleEquals_Expression EOF )
            // InternalTQL.g:1224:2: iv_ruleEquals_Expression= ruleEquals_Expression EOF
            {
             newCompositeNode(grammarAccess.getEquals_ExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEquals_Expression=ruleEquals_Expression();

            state._fsp--;

             current =iv_ruleEquals_Expression; 
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
    // $ANTLR end "entryRuleEquals_Expression"


    // $ANTLR start "ruleEquals_Expression"
    // InternalTQL.g:1230:1: ruleEquals_Expression returns [EObject current=null] : (this_NotEquals_Expression_0= ruleNotEquals_Expression ( () ( (lv_operator_2_0= ruleEqualsOperator ) ) ( (lv_right_3_0= ruleNotEquals_Expression ) ) )* ) ;
    public final EObject ruleEquals_Expression() throws RecognitionException {
        EObject current = null;

        EObject this_NotEquals_Expression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTQL.g:1236:2: ( (this_NotEquals_Expression_0= ruleNotEquals_Expression ( () ( (lv_operator_2_0= ruleEqualsOperator ) ) ( (lv_right_3_0= ruleNotEquals_Expression ) ) )* ) )
            // InternalTQL.g:1237:2: (this_NotEquals_Expression_0= ruleNotEquals_Expression ( () ( (lv_operator_2_0= ruleEqualsOperator ) ) ( (lv_right_3_0= ruleNotEquals_Expression ) ) )* )
            {
            // InternalTQL.g:1237:2: (this_NotEquals_Expression_0= ruleNotEquals_Expression ( () ( (lv_operator_2_0= ruleEqualsOperator ) ) ( (lv_right_3_0= ruleNotEquals_Expression ) ) )* )
            // InternalTQL.g:1238:3: this_NotEquals_Expression_0= ruleNotEquals_Expression ( () ( (lv_operator_2_0= ruleEqualsOperator ) ) ( (lv_right_3_0= ruleNotEquals_Expression ) ) )*
            {

            			newCompositeNode(grammarAccess.getEquals_ExpressionAccess().getNotEquals_ExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_21);
            this_NotEquals_Expression_0=ruleNotEquals_Expression();

            state._fsp--;


            			current = this_NotEquals_Expression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalTQL.g:1246:3: ( () ( (lv_operator_2_0= ruleEqualsOperator ) ) ( (lv_right_3_0= ruleNotEquals_Expression ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==42) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalTQL.g:1247:4: () ( (lv_operator_2_0= ruleEqualsOperator ) ) ( (lv_right_3_0= ruleNotEquals_Expression ) )
            	    {
            	    // InternalTQL.g:1247:4: ()
            	    // InternalTQL.g:1248:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEquals_ExpressionAccess().getEquals_ExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalTQL.g:1254:4: ( (lv_operator_2_0= ruleEqualsOperator ) )
            	    // InternalTQL.g:1255:5: (lv_operator_2_0= ruleEqualsOperator )
            	    {
            	    // InternalTQL.g:1255:5: (lv_operator_2_0= ruleEqualsOperator )
            	    // InternalTQL.g:1256:6: lv_operator_2_0= ruleEqualsOperator
            	    {

            	    						newCompositeNode(grammarAccess.getEquals_ExpressionAccess().getOperatorEqualsOperatorEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_operator_2_0=ruleEqualsOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEquals_ExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"nl.tue.gtl.TQL.EqualsOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalTQL.g:1273:4: ( (lv_right_3_0= ruleNotEquals_Expression ) )
            	    // InternalTQL.g:1274:5: (lv_right_3_0= ruleNotEquals_Expression )
            	    {
            	    // InternalTQL.g:1274:5: (lv_right_3_0= ruleNotEquals_Expression )
            	    // InternalTQL.g:1275:6: lv_right_3_0= ruleNotEquals_Expression
            	    {

            	    						newCompositeNode(grammarAccess.getEquals_ExpressionAccess().getRightNotEquals_ExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    lv_right_3_0=ruleNotEquals_Expression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEquals_ExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"nl.tue.gtl.TQL.NotEquals_Expression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


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
    // $ANTLR end "ruleEquals_Expression"


    // $ANTLR start "entryRuleNotEquals_Expression"
    // InternalTQL.g:1297:1: entryRuleNotEquals_Expression returns [EObject current=null] : iv_ruleNotEquals_Expression= ruleNotEquals_Expression EOF ;
    public final EObject entryRuleNotEquals_Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotEquals_Expression = null;


        try {
            // InternalTQL.g:1297:61: (iv_ruleNotEquals_Expression= ruleNotEquals_Expression EOF )
            // InternalTQL.g:1298:2: iv_ruleNotEquals_Expression= ruleNotEquals_Expression EOF
            {
             newCompositeNode(grammarAccess.getNotEquals_ExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNotEquals_Expression=ruleNotEquals_Expression();

            state._fsp--;

             current =iv_ruleNotEquals_Expression; 
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
    // $ANTLR end "entryRuleNotEquals_Expression"


    // $ANTLR start "ruleNotEquals_Expression"
    // InternalTQL.g:1304:1: ruleNotEquals_Expression returns [EObject current=null] : (this_Less_Expression_0= ruleLess_Expression ( () ( (lv_operator_2_0= ruleNotEqualsOperator ) ) ( (lv_right_3_0= ruleLess_Expression ) ) )* ) ;
    public final EObject ruleNotEquals_Expression() throws RecognitionException {
        EObject current = null;

        EObject this_Less_Expression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTQL.g:1310:2: ( (this_Less_Expression_0= ruleLess_Expression ( () ( (lv_operator_2_0= ruleNotEqualsOperator ) ) ( (lv_right_3_0= ruleLess_Expression ) ) )* ) )
            // InternalTQL.g:1311:2: (this_Less_Expression_0= ruleLess_Expression ( () ( (lv_operator_2_0= ruleNotEqualsOperator ) ) ( (lv_right_3_0= ruleLess_Expression ) ) )* )
            {
            // InternalTQL.g:1311:2: (this_Less_Expression_0= ruleLess_Expression ( () ( (lv_operator_2_0= ruleNotEqualsOperator ) ) ( (lv_right_3_0= ruleLess_Expression ) ) )* )
            // InternalTQL.g:1312:3: this_Less_Expression_0= ruleLess_Expression ( () ( (lv_operator_2_0= ruleNotEqualsOperator ) ) ( (lv_right_3_0= ruleLess_Expression ) ) )*
            {

            			newCompositeNode(grammarAccess.getNotEquals_ExpressionAccess().getLess_ExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_22);
            this_Less_Expression_0=ruleLess_Expression();

            state._fsp--;


            			current = this_Less_Expression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalTQL.g:1320:3: ( () ( (lv_operator_2_0= ruleNotEqualsOperator ) ) ( (lv_right_3_0= ruleLess_Expression ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==43) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalTQL.g:1321:4: () ( (lv_operator_2_0= ruleNotEqualsOperator ) ) ( (lv_right_3_0= ruleLess_Expression ) )
            	    {
            	    // InternalTQL.g:1321:4: ()
            	    // InternalTQL.g:1322:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getNotEquals_ExpressionAccess().getNotEquals_ExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalTQL.g:1328:4: ( (lv_operator_2_0= ruleNotEqualsOperator ) )
            	    // InternalTQL.g:1329:5: (lv_operator_2_0= ruleNotEqualsOperator )
            	    {
            	    // InternalTQL.g:1329:5: (lv_operator_2_0= ruleNotEqualsOperator )
            	    // InternalTQL.g:1330:6: lv_operator_2_0= ruleNotEqualsOperator
            	    {

            	    						newCompositeNode(grammarAccess.getNotEquals_ExpressionAccess().getOperatorNotEqualsOperatorEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_operator_2_0=ruleNotEqualsOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNotEquals_ExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"nl.tue.gtl.TQL.NotEqualsOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalTQL.g:1347:4: ( (lv_right_3_0= ruleLess_Expression ) )
            	    // InternalTQL.g:1348:5: (lv_right_3_0= ruleLess_Expression )
            	    {
            	    // InternalTQL.g:1348:5: (lv_right_3_0= ruleLess_Expression )
            	    // InternalTQL.g:1349:6: lv_right_3_0= ruleLess_Expression
            	    {

            	    						newCompositeNode(grammarAccess.getNotEquals_ExpressionAccess().getRightLess_ExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    lv_right_3_0=ruleLess_Expression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNotEquals_ExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"nl.tue.gtl.TQL.Less_Expression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


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
    // $ANTLR end "ruleNotEquals_Expression"


    // $ANTLR start "entryRuleLess_Expression"
    // InternalTQL.g:1371:1: entryRuleLess_Expression returns [EObject current=null] : iv_ruleLess_Expression= ruleLess_Expression EOF ;
    public final EObject entryRuleLess_Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLess_Expression = null;


        try {
            // InternalTQL.g:1371:56: (iv_ruleLess_Expression= ruleLess_Expression EOF )
            // InternalTQL.g:1372:2: iv_ruleLess_Expression= ruleLess_Expression EOF
            {
             newCompositeNode(grammarAccess.getLess_ExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLess_Expression=ruleLess_Expression();

            state._fsp--;

             current =iv_ruleLess_Expression; 
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
    // $ANTLR end "entryRuleLess_Expression"


    // $ANTLR start "ruleLess_Expression"
    // InternalTQL.g:1378:1: ruleLess_Expression returns [EObject current=null] : (this_Greater_Expression_0= ruleGreater_Expression ( () ( (lv_operator_2_0= ruleLessOperator ) ) ( (lv_right_3_0= ruleGreater_Expression ) ) )* ) ;
    public final EObject ruleLess_Expression() throws RecognitionException {
        EObject current = null;

        EObject this_Greater_Expression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTQL.g:1384:2: ( (this_Greater_Expression_0= ruleGreater_Expression ( () ( (lv_operator_2_0= ruleLessOperator ) ) ( (lv_right_3_0= ruleGreater_Expression ) ) )* ) )
            // InternalTQL.g:1385:2: (this_Greater_Expression_0= ruleGreater_Expression ( () ( (lv_operator_2_0= ruleLessOperator ) ) ( (lv_right_3_0= ruleGreater_Expression ) ) )* )
            {
            // InternalTQL.g:1385:2: (this_Greater_Expression_0= ruleGreater_Expression ( () ( (lv_operator_2_0= ruleLessOperator ) ) ( (lv_right_3_0= ruleGreater_Expression ) ) )* )
            // InternalTQL.g:1386:3: this_Greater_Expression_0= ruleGreater_Expression ( () ( (lv_operator_2_0= ruleLessOperator ) ) ( (lv_right_3_0= ruleGreater_Expression ) ) )*
            {

            			newCompositeNode(grammarAccess.getLess_ExpressionAccess().getGreater_ExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_23);
            this_Greater_Expression_0=ruleGreater_Expression();

            state._fsp--;


            			current = this_Greater_Expression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalTQL.g:1394:3: ( () ( (lv_operator_2_0= ruleLessOperator ) ) ( (lv_right_3_0= ruleGreater_Expression ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==44) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalTQL.g:1395:4: () ( (lv_operator_2_0= ruleLessOperator ) ) ( (lv_right_3_0= ruleGreater_Expression ) )
            	    {
            	    // InternalTQL.g:1395:4: ()
            	    // InternalTQL.g:1396:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getLess_ExpressionAccess().getLess_ExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalTQL.g:1402:4: ( (lv_operator_2_0= ruleLessOperator ) )
            	    // InternalTQL.g:1403:5: (lv_operator_2_0= ruleLessOperator )
            	    {
            	    // InternalTQL.g:1403:5: (lv_operator_2_0= ruleLessOperator )
            	    // InternalTQL.g:1404:6: lv_operator_2_0= ruleLessOperator
            	    {

            	    						newCompositeNode(grammarAccess.getLess_ExpressionAccess().getOperatorLessOperatorEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_operator_2_0=ruleLessOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLess_ExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"nl.tue.gtl.TQL.LessOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalTQL.g:1421:4: ( (lv_right_3_0= ruleGreater_Expression ) )
            	    // InternalTQL.g:1422:5: (lv_right_3_0= ruleGreater_Expression )
            	    {
            	    // InternalTQL.g:1422:5: (lv_right_3_0= ruleGreater_Expression )
            	    // InternalTQL.g:1423:6: lv_right_3_0= ruleGreater_Expression
            	    {

            	    						newCompositeNode(grammarAccess.getLess_ExpressionAccess().getRightGreater_ExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    lv_right_3_0=ruleGreater_Expression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLess_ExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"nl.tue.gtl.TQL.Greater_Expression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


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
    // $ANTLR end "ruleLess_Expression"


    // $ANTLR start "entryRuleGreater_Expression"
    // InternalTQL.g:1445:1: entryRuleGreater_Expression returns [EObject current=null] : iv_ruleGreater_Expression= ruleGreater_Expression EOF ;
    public final EObject entryRuleGreater_Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreater_Expression = null;


        try {
            // InternalTQL.g:1445:59: (iv_ruleGreater_Expression= ruleGreater_Expression EOF )
            // InternalTQL.g:1446:2: iv_ruleGreater_Expression= ruleGreater_Expression EOF
            {
             newCompositeNode(grammarAccess.getGreater_ExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGreater_Expression=ruleGreater_Expression();

            state._fsp--;

             current =iv_ruleGreater_Expression; 
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
    // $ANTLR end "entryRuleGreater_Expression"


    // $ANTLR start "ruleGreater_Expression"
    // InternalTQL.g:1452:1: ruleGreater_Expression returns [EObject current=null] : (this_Multiply_Expression_0= ruleMultiply_Expression ( () ( (lv_operator_2_0= ruleGreaterOperator ) ) ( (lv_right_3_0= ruleMultiply_Expression ) ) )* ) ;
    public final EObject ruleGreater_Expression() throws RecognitionException {
        EObject current = null;

        EObject this_Multiply_Expression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTQL.g:1458:2: ( (this_Multiply_Expression_0= ruleMultiply_Expression ( () ( (lv_operator_2_0= ruleGreaterOperator ) ) ( (lv_right_3_0= ruleMultiply_Expression ) ) )* ) )
            // InternalTQL.g:1459:2: (this_Multiply_Expression_0= ruleMultiply_Expression ( () ( (lv_operator_2_0= ruleGreaterOperator ) ) ( (lv_right_3_0= ruleMultiply_Expression ) ) )* )
            {
            // InternalTQL.g:1459:2: (this_Multiply_Expression_0= ruleMultiply_Expression ( () ( (lv_operator_2_0= ruleGreaterOperator ) ) ( (lv_right_3_0= ruleMultiply_Expression ) ) )* )
            // InternalTQL.g:1460:3: this_Multiply_Expression_0= ruleMultiply_Expression ( () ( (lv_operator_2_0= ruleGreaterOperator ) ) ( (lv_right_3_0= ruleMultiply_Expression ) ) )*
            {

            			newCompositeNode(grammarAccess.getGreater_ExpressionAccess().getMultiply_ExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_24);
            this_Multiply_Expression_0=ruleMultiply_Expression();

            state._fsp--;


            			current = this_Multiply_Expression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalTQL.g:1468:3: ( () ( (lv_operator_2_0= ruleGreaterOperator ) ) ( (lv_right_3_0= ruleMultiply_Expression ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==45) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalTQL.g:1469:4: () ( (lv_operator_2_0= ruleGreaterOperator ) ) ( (lv_right_3_0= ruleMultiply_Expression ) )
            	    {
            	    // InternalTQL.g:1469:4: ()
            	    // InternalTQL.g:1470:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getGreater_ExpressionAccess().getGreater_ExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalTQL.g:1476:4: ( (lv_operator_2_0= ruleGreaterOperator ) )
            	    // InternalTQL.g:1477:5: (lv_operator_2_0= ruleGreaterOperator )
            	    {
            	    // InternalTQL.g:1477:5: (lv_operator_2_0= ruleGreaterOperator )
            	    // InternalTQL.g:1478:6: lv_operator_2_0= ruleGreaterOperator
            	    {

            	    						newCompositeNode(grammarAccess.getGreater_ExpressionAccess().getOperatorGreaterOperatorEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_operator_2_0=ruleGreaterOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGreater_ExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"nl.tue.gtl.TQL.GreaterOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalTQL.g:1495:4: ( (lv_right_3_0= ruleMultiply_Expression ) )
            	    // InternalTQL.g:1496:5: (lv_right_3_0= ruleMultiply_Expression )
            	    {
            	    // InternalTQL.g:1496:5: (lv_right_3_0= ruleMultiply_Expression )
            	    // InternalTQL.g:1497:6: lv_right_3_0= ruleMultiply_Expression
            	    {

            	    						newCompositeNode(grammarAccess.getGreater_ExpressionAccess().getRightMultiply_ExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_24);
            	    lv_right_3_0=ruleMultiply_Expression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGreater_ExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"nl.tue.gtl.TQL.Multiply_Expression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


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
    // $ANTLR end "ruleGreater_Expression"


    // $ANTLR start "entryRuleMultiply_Expression"
    // InternalTQL.g:1519:1: entryRuleMultiply_Expression returns [EObject current=null] : iv_ruleMultiply_Expression= ruleMultiply_Expression EOF ;
    public final EObject entryRuleMultiply_Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiply_Expression = null;


        try {
            // InternalTQL.g:1519:60: (iv_ruleMultiply_Expression= ruleMultiply_Expression EOF )
            // InternalTQL.g:1520:2: iv_ruleMultiply_Expression= ruleMultiply_Expression EOF
            {
             newCompositeNode(grammarAccess.getMultiply_ExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiply_Expression=ruleMultiply_Expression();

            state._fsp--;

             current =iv_ruleMultiply_Expression; 
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
    // $ANTLR end "entryRuleMultiply_Expression"


    // $ANTLR start "ruleMultiply_Expression"
    // InternalTQL.g:1526:1: ruleMultiply_Expression returns [EObject current=null] : (this_Divide_Expression_0= ruleDivide_Expression ( () ( (lv_operator_2_0= ruleMultiplyOperator ) ) ( (lv_right_3_0= ruleDivide_Expression ) ) )* ) ;
    public final EObject ruleMultiply_Expression() throws RecognitionException {
        EObject current = null;

        EObject this_Divide_Expression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTQL.g:1532:2: ( (this_Divide_Expression_0= ruleDivide_Expression ( () ( (lv_operator_2_0= ruleMultiplyOperator ) ) ( (lv_right_3_0= ruleDivide_Expression ) ) )* ) )
            // InternalTQL.g:1533:2: (this_Divide_Expression_0= ruleDivide_Expression ( () ( (lv_operator_2_0= ruleMultiplyOperator ) ) ( (lv_right_3_0= ruleDivide_Expression ) ) )* )
            {
            // InternalTQL.g:1533:2: (this_Divide_Expression_0= ruleDivide_Expression ( () ( (lv_operator_2_0= ruleMultiplyOperator ) ) ( (lv_right_3_0= ruleDivide_Expression ) ) )* )
            // InternalTQL.g:1534:3: this_Divide_Expression_0= ruleDivide_Expression ( () ( (lv_operator_2_0= ruleMultiplyOperator ) ) ( (lv_right_3_0= ruleDivide_Expression ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiply_ExpressionAccess().getDivide_ExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_25);
            this_Divide_Expression_0=ruleDivide_Expression();

            state._fsp--;


            			current = this_Divide_Expression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalTQL.g:1542:3: ( () ( (lv_operator_2_0= ruleMultiplyOperator ) ) ( (lv_right_3_0= ruleDivide_Expression ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==46) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalTQL.g:1543:4: () ( (lv_operator_2_0= ruleMultiplyOperator ) ) ( (lv_right_3_0= ruleDivide_Expression ) )
            	    {
            	    // InternalTQL.g:1543:4: ()
            	    // InternalTQL.g:1544:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultiply_ExpressionAccess().getMultiply_ExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalTQL.g:1550:4: ( (lv_operator_2_0= ruleMultiplyOperator ) )
            	    // InternalTQL.g:1551:5: (lv_operator_2_0= ruleMultiplyOperator )
            	    {
            	    // InternalTQL.g:1551:5: (lv_operator_2_0= ruleMultiplyOperator )
            	    // InternalTQL.g:1552:6: lv_operator_2_0= ruleMultiplyOperator
            	    {

            	    						newCompositeNode(grammarAccess.getMultiply_ExpressionAccess().getOperatorMultiplyOperatorEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_operator_2_0=ruleMultiplyOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultiply_ExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"nl.tue.gtl.TQL.MultiplyOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalTQL.g:1569:4: ( (lv_right_3_0= ruleDivide_Expression ) )
            	    // InternalTQL.g:1570:5: (lv_right_3_0= ruleDivide_Expression )
            	    {
            	    // InternalTQL.g:1570:5: (lv_right_3_0= ruleDivide_Expression )
            	    // InternalTQL.g:1571:6: lv_right_3_0= ruleDivide_Expression
            	    {

            	    						newCompositeNode(grammarAccess.getMultiply_ExpressionAccess().getRightDivide_ExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_25);
            	    lv_right_3_0=ruleDivide_Expression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultiply_ExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"nl.tue.gtl.TQL.Divide_Expression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


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
    // $ANTLR end "ruleMultiply_Expression"


    // $ANTLR start "entryRuleDivide_Expression"
    // InternalTQL.g:1593:1: entryRuleDivide_Expression returns [EObject current=null] : iv_ruleDivide_Expression= ruleDivide_Expression EOF ;
    public final EObject entryRuleDivide_Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivide_Expression = null;


        try {
            // InternalTQL.g:1593:58: (iv_ruleDivide_Expression= ruleDivide_Expression EOF )
            // InternalTQL.g:1594:2: iv_ruleDivide_Expression= ruleDivide_Expression EOF
            {
             newCompositeNode(grammarAccess.getDivide_ExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDivide_Expression=ruleDivide_Expression();

            state._fsp--;

             current =iv_ruleDivide_Expression; 
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
    // $ANTLR end "entryRuleDivide_Expression"


    // $ANTLR start "ruleDivide_Expression"
    // InternalTQL.g:1600:1: ruleDivide_Expression returns [EObject current=null] : (this_Add_Expression_0= ruleAdd_Expression ( () ( (lv_operator_2_0= ruleDivideOperator ) ) ( (lv_right_3_0= ruleAdd_Expression ) ) )* ) ;
    public final EObject ruleDivide_Expression() throws RecognitionException {
        EObject current = null;

        EObject this_Add_Expression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTQL.g:1606:2: ( (this_Add_Expression_0= ruleAdd_Expression ( () ( (lv_operator_2_0= ruleDivideOperator ) ) ( (lv_right_3_0= ruleAdd_Expression ) ) )* ) )
            // InternalTQL.g:1607:2: (this_Add_Expression_0= ruleAdd_Expression ( () ( (lv_operator_2_0= ruleDivideOperator ) ) ( (lv_right_3_0= ruleAdd_Expression ) ) )* )
            {
            // InternalTQL.g:1607:2: (this_Add_Expression_0= ruleAdd_Expression ( () ( (lv_operator_2_0= ruleDivideOperator ) ) ( (lv_right_3_0= ruleAdd_Expression ) ) )* )
            // InternalTQL.g:1608:3: this_Add_Expression_0= ruleAdd_Expression ( () ( (lv_operator_2_0= ruleDivideOperator ) ) ( (lv_right_3_0= ruleAdd_Expression ) ) )*
            {

            			newCompositeNode(grammarAccess.getDivide_ExpressionAccess().getAdd_ExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_26);
            this_Add_Expression_0=ruleAdd_Expression();

            state._fsp--;


            			current = this_Add_Expression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalTQL.g:1616:3: ( () ( (lv_operator_2_0= ruleDivideOperator ) ) ( (lv_right_3_0= ruleAdd_Expression ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==47) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalTQL.g:1617:4: () ( (lv_operator_2_0= ruleDivideOperator ) ) ( (lv_right_3_0= ruleAdd_Expression ) )
            	    {
            	    // InternalTQL.g:1617:4: ()
            	    // InternalTQL.g:1618:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getDivide_ExpressionAccess().getDivide_ExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalTQL.g:1624:4: ( (lv_operator_2_0= ruleDivideOperator ) )
            	    // InternalTQL.g:1625:5: (lv_operator_2_0= ruleDivideOperator )
            	    {
            	    // InternalTQL.g:1625:5: (lv_operator_2_0= ruleDivideOperator )
            	    // InternalTQL.g:1626:6: lv_operator_2_0= ruleDivideOperator
            	    {

            	    						newCompositeNode(grammarAccess.getDivide_ExpressionAccess().getOperatorDivideOperatorEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_operator_2_0=ruleDivideOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDivide_ExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"nl.tue.gtl.TQL.DivideOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalTQL.g:1643:4: ( (lv_right_3_0= ruleAdd_Expression ) )
            	    // InternalTQL.g:1644:5: (lv_right_3_0= ruleAdd_Expression )
            	    {
            	    // InternalTQL.g:1644:5: (lv_right_3_0= ruleAdd_Expression )
            	    // InternalTQL.g:1645:6: lv_right_3_0= ruleAdd_Expression
            	    {

            	    						newCompositeNode(grammarAccess.getDivide_ExpressionAccess().getRightAdd_ExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_26);
            	    lv_right_3_0=ruleAdd_Expression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDivide_ExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"nl.tue.gtl.TQL.Add_Expression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


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
    // $ANTLR end "ruleDivide_Expression"


    // $ANTLR start "entryRuleAdd_Expression"
    // InternalTQL.g:1667:1: entryRuleAdd_Expression returns [EObject current=null] : iv_ruleAdd_Expression= ruleAdd_Expression EOF ;
    public final EObject entryRuleAdd_Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdd_Expression = null;


        try {
            // InternalTQL.g:1667:55: (iv_ruleAdd_Expression= ruleAdd_Expression EOF )
            // InternalTQL.g:1668:2: iv_ruleAdd_Expression= ruleAdd_Expression EOF
            {
             newCompositeNode(grammarAccess.getAdd_ExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdd_Expression=ruleAdd_Expression();

            state._fsp--;

             current =iv_ruleAdd_Expression; 
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
    // $ANTLR end "entryRuleAdd_Expression"


    // $ANTLR start "ruleAdd_Expression"
    // InternalTQL.g:1674:1: ruleAdd_Expression returns [EObject current=null] : (this_Subtract_Expression_0= ruleSubtract_Expression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_right_3_0= ruleSubtract_Expression ) ) )* ) ;
    public final EObject ruleAdd_Expression() throws RecognitionException {
        EObject current = null;

        EObject this_Subtract_Expression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTQL.g:1680:2: ( (this_Subtract_Expression_0= ruleSubtract_Expression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_right_3_0= ruleSubtract_Expression ) ) )* ) )
            // InternalTQL.g:1681:2: (this_Subtract_Expression_0= ruleSubtract_Expression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_right_3_0= ruleSubtract_Expression ) ) )* )
            {
            // InternalTQL.g:1681:2: (this_Subtract_Expression_0= ruleSubtract_Expression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_right_3_0= ruleSubtract_Expression ) ) )* )
            // InternalTQL.g:1682:3: this_Subtract_Expression_0= ruleSubtract_Expression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_right_3_0= ruleSubtract_Expression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAdd_ExpressionAccess().getSubtract_ExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_27);
            this_Subtract_Expression_0=ruleSubtract_Expression();

            state._fsp--;


            			current = this_Subtract_Expression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalTQL.g:1690:3: ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_right_3_0= ruleSubtract_Expression ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==48) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalTQL.g:1691:4: () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_right_3_0= ruleSubtract_Expression ) )
            	    {
            	    // InternalTQL.g:1691:4: ()
            	    // InternalTQL.g:1692:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAdd_ExpressionAccess().getAdd_ExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalTQL.g:1698:4: ( (lv_operator_2_0= ruleAddOperator ) )
            	    // InternalTQL.g:1699:5: (lv_operator_2_0= ruleAddOperator )
            	    {
            	    // InternalTQL.g:1699:5: (lv_operator_2_0= ruleAddOperator )
            	    // InternalTQL.g:1700:6: lv_operator_2_0= ruleAddOperator
            	    {

            	    						newCompositeNode(grammarAccess.getAdd_ExpressionAccess().getOperatorAddOperatorEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_operator_2_0=ruleAddOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAdd_ExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"nl.tue.gtl.TQL.AddOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalTQL.g:1717:4: ( (lv_right_3_0= ruleSubtract_Expression ) )
            	    // InternalTQL.g:1718:5: (lv_right_3_0= ruleSubtract_Expression )
            	    {
            	    // InternalTQL.g:1718:5: (lv_right_3_0= ruleSubtract_Expression )
            	    // InternalTQL.g:1719:6: lv_right_3_0= ruleSubtract_Expression
            	    {

            	    						newCompositeNode(grammarAccess.getAdd_ExpressionAccess().getRightSubtract_ExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_27);
            	    lv_right_3_0=ruleSubtract_Expression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAdd_ExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"nl.tue.gtl.TQL.Subtract_Expression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


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
    // $ANTLR end "ruleAdd_Expression"


    // $ANTLR start "entryRuleSubtract_Expression"
    // InternalTQL.g:1741:1: entryRuleSubtract_Expression returns [EObject current=null] : iv_ruleSubtract_Expression= ruleSubtract_Expression EOF ;
    public final EObject entryRuleSubtract_Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubtract_Expression = null;


        try {
            // InternalTQL.g:1741:60: (iv_ruleSubtract_Expression= ruleSubtract_Expression EOF )
            // InternalTQL.g:1742:2: iv_ruleSubtract_Expression= ruleSubtract_Expression EOF
            {
             newCompositeNode(grammarAccess.getSubtract_ExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubtract_Expression=ruleSubtract_Expression();

            state._fsp--;

             current =iv_ruleSubtract_Expression; 
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
    // $ANTLR end "entryRuleSubtract_Expression"


    // $ANTLR start "ruleSubtract_Expression"
    // InternalTQL.g:1748:1: ruleSubtract_Expression returns [EObject current=null] : (this_Literal_Expression_0= ruleLiteral_Expression ( () ( (lv_operator_2_0= ruleSubtractOperator ) ) ( (lv_right_3_0= ruleLiteral_Expression ) ) )* ) ;
    public final EObject ruleSubtract_Expression() throws RecognitionException {
        EObject current = null;

        EObject this_Literal_Expression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTQL.g:1754:2: ( (this_Literal_Expression_0= ruleLiteral_Expression ( () ( (lv_operator_2_0= ruleSubtractOperator ) ) ( (lv_right_3_0= ruleLiteral_Expression ) ) )* ) )
            // InternalTQL.g:1755:2: (this_Literal_Expression_0= ruleLiteral_Expression ( () ( (lv_operator_2_0= ruleSubtractOperator ) ) ( (lv_right_3_0= ruleLiteral_Expression ) ) )* )
            {
            // InternalTQL.g:1755:2: (this_Literal_Expression_0= ruleLiteral_Expression ( () ( (lv_operator_2_0= ruleSubtractOperator ) ) ( (lv_right_3_0= ruleLiteral_Expression ) ) )* )
            // InternalTQL.g:1756:3: this_Literal_Expression_0= ruleLiteral_Expression ( () ( (lv_operator_2_0= ruleSubtractOperator ) ) ( (lv_right_3_0= ruleLiteral_Expression ) ) )*
            {

            			newCompositeNode(grammarAccess.getSubtract_ExpressionAccess().getLiteral_ExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_28);
            this_Literal_Expression_0=ruleLiteral_Expression();

            state._fsp--;


            			current = this_Literal_Expression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalTQL.g:1764:3: ( () ( (lv_operator_2_0= ruleSubtractOperator ) ) ( (lv_right_3_0= ruleLiteral_Expression ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==31) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalTQL.g:1765:4: () ( (lv_operator_2_0= ruleSubtractOperator ) ) ( (lv_right_3_0= ruleLiteral_Expression ) )
            	    {
            	    // InternalTQL.g:1765:4: ()
            	    // InternalTQL.g:1766:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getSubtract_ExpressionAccess().getSubtract_ExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalTQL.g:1772:4: ( (lv_operator_2_0= ruleSubtractOperator ) )
            	    // InternalTQL.g:1773:5: (lv_operator_2_0= ruleSubtractOperator )
            	    {
            	    // InternalTQL.g:1773:5: (lv_operator_2_0= ruleSubtractOperator )
            	    // InternalTQL.g:1774:6: lv_operator_2_0= ruleSubtractOperator
            	    {

            	    						newCompositeNode(grammarAccess.getSubtract_ExpressionAccess().getOperatorSubtractOperatorEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_operator_2_0=ruleSubtractOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSubtract_ExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"nl.tue.gtl.TQL.SubtractOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalTQL.g:1791:4: ( (lv_right_3_0= ruleLiteral_Expression ) )
            	    // InternalTQL.g:1792:5: (lv_right_3_0= ruleLiteral_Expression )
            	    {
            	    // InternalTQL.g:1792:5: (lv_right_3_0= ruleLiteral_Expression )
            	    // InternalTQL.g:1793:6: lv_right_3_0= ruleLiteral_Expression
            	    {

            	    						newCompositeNode(grammarAccess.getSubtract_ExpressionAccess().getRightLiteral_ExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_28);
            	    lv_right_3_0=ruleLiteral_Expression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSubtract_ExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"nl.tue.gtl.TQL.Literal_Expression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


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
    // $ANTLR end "ruleSubtract_Expression"


    // $ANTLR start "entryRuleLiteral_Expression"
    // InternalTQL.g:1815:1: entryRuleLiteral_Expression returns [EObject current=null] : iv_ruleLiteral_Expression= ruleLiteral_Expression EOF ;
    public final EObject entryRuleLiteral_Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral_Expression = null;


        try {
            // InternalTQL.g:1815:59: (iv_ruleLiteral_Expression= ruleLiteral_Expression EOF )
            // InternalTQL.g:1816:2: iv_ruleLiteral_Expression= ruleLiteral_Expression EOF
            {
             newCompositeNode(grammarAccess.getLiteral_ExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteral_Expression=ruleLiteral_Expression();

            state._fsp--;

             current =iv_ruleLiteral_Expression; 
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
    // $ANTLR end "entryRuleLiteral_Expression"


    // $ANTLR start "ruleLiteral_Expression"
    // InternalTQL.g:1822:1: ruleLiteral_Expression returns [EObject current=null] : (this_Constant_0= ruleConstant | this_Parameter_Expression_1= ruleParameter_Expression | this_Self_Expression_2= ruleSelf_Expression ) ;
    public final EObject ruleLiteral_Expression() throws RecognitionException {
        EObject current = null;

        EObject this_Constant_0 = null;

        EObject this_Parameter_Expression_1 = null;

        EObject this_Self_Expression_2 = null;



        	enterRule();

        try {
            // InternalTQL.g:1828:2: ( (this_Constant_0= ruleConstant | this_Parameter_Expression_1= ruleParameter_Expression | this_Self_Expression_2= ruleSelf_Expression ) )
            // InternalTQL.g:1829:2: (this_Constant_0= ruleConstant | this_Parameter_Expression_1= ruleParameter_Expression | this_Self_Expression_2= ruleSelf_Expression )
            {
            // InternalTQL.g:1829:2: (this_Constant_0= ruleConstant | this_Parameter_Expression_1= ruleParameter_Expression | this_Self_Expression_2= ruleSelf_Expression )
            int alt23=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case 25:
            case 26:
            case 27:
            case 29:
            case 30:
            case 31:
            case 32:
                {
                alt23=1;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
                {
                alt23=2;
                }
                break;
            case 24:
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalTQL.g:1830:3: this_Constant_0= ruleConstant
                    {

                    			newCompositeNode(grammarAccess.getLiteral_ExpressionAccess().getConstantParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Constant_0=ruleConstant();

                    state._fsp--;


                    			current = this_Constant_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTQL.g:1839:3: this_Parameter_Expression_1= ruleParameter_Expression
                    {

                    			newCompositeNode(grammarAccess.getLiteral_ExpressionAccess().getParameter_ExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Parameter_Expression_1=ruleParameter_Expression();

                    state._fsp--;


                    			current = this_Parameter_Expression_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTQL.g:1848:3: this_Self_Expression_2= ruleSelf_Expression
                    {

                    			newCompositeNode(grammarAccess.getLiteral_ExpressionAccess().getSelf_ExpressionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Self_Expression_2=ruleSelf_Expression();

                    state._fsp--;


                    			current = this_Self_Expression_2;
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
    // $ANTLR end "ruleLiteral_Expression"


    // $ANTLR start "entryRuleParameter_Expression"
    // InternalTQL.g:1860:1: entryRuleParameter_Expression returns [EObject current=null] : iv_ruleParameter_Expression= ruleParameter_Expression EOF ;
    public final EObject entryRuleParameter_Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter_Expression = null;


        try {
            // InternalTQL.g:1860:61: (iv_ruleParameter_Expression= ruleParameter_Expression EOF )
            // InternalTQL.g:1861:2: iv_ruleParameter_Expression= ruleParameter_Expression EOF
            {
             newCompositeNode(grammarAccess.getParameter_ExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter_Expression=ruleParameter_Expression();

            state._fsp--;

             current =iv_ruleParameter_Expression; 
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
    // $ANTLR end "entryRuleParameter_Expression"


    // $ANTLR start "ruleParameter_Expression"
    // InternalTQL.g:1867:1: ruleParameter_Expression returns [EObject current=null] : ( ( ruleEString ) ) ;
    public final EObject ruleParameter_Expression() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalTQL.g:1873:2: ( ( ( ruleEString ) ) )
            // InternalTQL.g:1874:2: ( ( ruleEString ) )
            {
            // InternalTQL.g:1874:2: ( ( ruleEString ) )
            // InternalTQL.g:1875:3: ( ruleEString )
            {
            // InternalTQL.g:1875:3: ( ruleEString )
            // InternalTQL.g:1876:4: ruleEString
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getParameter_ExpressionRule());
            				}
            			

            				newCompositeNode(grammarAccess.getParameter_ExpressionAccess().getParameterParameterCrossReference_0());
            			
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


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
    // $ANTLR end "ruleParameter_Expression"


    // $ANTLR start "entryRuleSelf_Expression"
    // InternalTQL.g:1893:1: entryRuleSelf_Expression returns [EObject current=null] : iv_ruleSelf_Expression= ruleSelf_Expression EOF ;
    public final EObject entryRuleSelf_Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelf_Expression = null;


        try {
            // InternalTQL.g:1893:56: (iv_ruleSelf_Expression= ruleSelf_Expression EOF )
            // InternalTQL.g:1894:2: iv_ruleSelf_Expression= ruleSelf_Expression EOF
            {
             newCompositeNode(grammarAccess.getSelf_ExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelf_Expression=ruleSelf_Expression();

            state._fsp--;

             current =iv_ruleSelf_Expression; 
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
    // $ANTLR end "entryRuleSelf_Expression"


    // $ANTLR start "ruleSelf_Expression"
    // InternalTQL.g:1900:1: ruleSelf_Expression returns [EObject current=null] : ( () otherlv_1= 'self' ) ;
    public final EObject ruleSelf_Expression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTQL.g:1906:2: ( ( () otherlv_1= 'self' ) )
            // InternalTQL.g:1907:2: ( () otherlv_1= 'self' )
            {
            // InternalTQL.g:1907:2: ( () otherlv_1= 'self' )
            // InternalTQL.g:1908:3: () otherlv_1= 'self'
            {
            // InternalTQL.g:1908:3: ()
            // InternalTQL.g:1909:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSelf_ExpressionAccess().getSelfExpressionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getSelf_ExpressionAccess().getSelfKeyword_1());
            		

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
    // $ANTLR end "ruleSelf_Expression"


    // $ANTLR start "entryRuleConstant"
    // InternalTQL.g:1923:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // InternalTQL.g:1923:49: (iv_ruleConstant= ruleConstant EOF )
            // InternalTQL.g:1924:2: iv_ruleConstant= ruleConstant EOF
            {
             newCompositeNode(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstant=ruleConstant();

            state._fsp--;

             current =iv_ruleConstant; 
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
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // InternalTQL.g:1930:1: ruleConstant returns [EObject current=null] : (this_Single_Constant_0= ruleSingle_Constant | this_Set_Constant_1= ruleSet_Constant ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        EObject this_Single_Constant_0 = null;

        EObject this_Set_Constant_1 = null;



        	enterRule();

        try {
            // InternalTQL.g:1936:2: ( (this_Single_Constant_0= ruleSingle_Constant | this_Set_Constant_1= ruleSet_Constant ) )
            // InternalTQL.g:1937:2: (this_Single_Constant_0= ruleSingle_Constant | this_Set_Constant_1= ruleSet_Constant )
            {
            // InternalTQL.g:1937:2: (this_Single_Constant_0= ruleSingle_Constant | this_Set_Constant_1= ruleSet_Constant )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_INT||(LA24_0>=25 && LA24_0<=26)||(LA24_0>=29 && LA24_0<=32)) ) {
                alt24=1;
            }
            else if ( (LA24_0==27) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalTQL.g:1938:3: this_Single_Constant_0= ruleSingle_Constant
                    {

                    			newCompositeNode(grammarAccess.getConstantAccess().getSingle_ConstantParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Single_Constant_0=ruleSingle_Constant();

                    state._fsp--;


                    			current = this_Single_Constant_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTQL.g:1947:3: this_Set_Constant_1= ruleSet_Constant
                    {

                    			newCompositeNode(grammarAccess.getConstantAccess().getSet_ConstantParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Set_Constant_1=ruleSet_Constant();

                    state._fsp--;


                    			current = this_Set_Constant_1;
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
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleSingle_Constant"
    // InternalTQL.g:1959:1: entryRuleSingle_Constant returns [EObject current=null] : iv_ruleSingle_Constant= ruleSingle_Constant EOF ;
    public final EObject entryRuleSingle_Constant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingle_Constant = null;


        try {
            // InternalTQL.g:1959:56: (iv_ruleSingle_Constant= ruleSingle_Constant EOF )
            // InternalTQL.g:1960:2: iv_ruleSingle_Constant= ruleSingle_Constant EOF
            {
             newCompositeNode(grammarAccess.getSingle_ConstantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSingle_Constant=ruleSingle_Constant();

            state._fsp--;

             current =iv_ruleSingle_Constant; 
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
    // $ANTLR end "entryRuleSingle_Constant"


    // $ANTLR start "ruleSingle_Constant"
    // InternalTQL.g:1966:1: ruleSingle_Constant returns [EObject current=null] : (this_Boolean_Constant_0= ruleBoolean_Constant | this_Float_Constant_1= ruleFloat_Constant | this_Integer_Constant_2= ruleInteger_Constant | this_String_Constant_3= ruleString_Constant | this_Null_Constant_4= ruleNull_Constant ) ;
    public final EObject ruleSingle_Constant() throws RecognitionException {
        EObject current = null;

        EObject this_Boolean_Constant_0 = null;

        EObject this_Float_Constant_1 = null;

        EObject this_Integer_Constant_2 = null;

        EObject this_String_Constant_3 = null;

        EObject this_Null_Constant_4 = null;



        	enterRule();

        try {
            // InternalTQL.g:1972:2: ( (this_Boolean_Constant_0= ruleBoolean_Constant | this_Float_Constant_1= ruleFloat_Constant | this_Integer_Constant_2= ruleInteger_Constant | this_String_Constant_3= ruleString_Constant | this_Null_Constant_4= ruleNull_Constant ) )
            // InternalTQL.g:1973:2: (this_Boolean_Constant_0= ruleBoolean_Constant | this_Float_Constant_1= ruleFloat_Constant | this_Integer_Constant_2= ruleInteger_Constant | this_String_Constant_3= ruleString_Constant | this_Null_Constant_4= ruleNull_Constant )
            {
            // InternalTQL.g:1973:2: (this_Boolean_Constant_0= ruleBoolean_Constant | this_Float_Constant_1= ruleFloat_Constant | this_Integer_Constant_2= ruleInteger_Constant | this_String_Constant_3= ruleString_Constant | this_Null_Constant_4= ruleNull_Constant )
            int alt25=5;
            switch ( input.LA(1) ) {
            case 29:
            case 30:
                {
                alt25=1;
                }
                break;
            case 31:
                {
                int LA25_2 = input.LA(2);

                if ( (LA25_2==RULE_INT) ) {
                    int LA25_3 = input.LA(3);

                    if ( (LA25_3==32) ) {
                        alt25=2;
                    }
                    else if ( (LA25_3==EOF||(LA25_3>=15 && LA25_3<=16)||LA25_3==21||LA25_3==28||LA25_3==31||(LA25_3>=40 && LA25_3<=48)) ) {
                        alt25=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA25_2==32) ) {
                    alt25=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA25_3 = input.LA(2);

                if ( (LA25_3==32) ) {
                    alt25=2;
                }
                else if ( (LA25_3==EOF||(LA25_3>=15 && LA25_3<=16)||LA25_3==21||LA25_3==28||LA25_3==31||(LA25_3>=40 && LA25_3<=48)) ) {
                    alt25=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 3, input);

                    throw nvae;
                }
                }
                break;
            case 32:
                {
                alt25=2;
                }
                break;
            case 25:
                {
                alt25=4;
                }
                break;
            case 26:
                {
                alt25=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalTQL.g:1974:3: this_Boolean_Constant_0= ruleBoolean_Constant
                    {

                    			newCompositeNode(grammarAccess.getSingle_ConstantAccess().getBoolean_ConstantParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Boolean_Constant_0=ruleBoolean_Constant();

                    state._fsp--;


                    			current = this_Boolean_Constant_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTQL.g:1983:3: this_Float_Constant_1= ruleFloat_Constant
                    {

                    			newCompositeNode(grammarAccess.getSingle_ConstantAccess().getFloat_ConstantParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Float_Constant_1=ruleFloat_Constant();

                    state._fsp--;


                    			current = this_Float_Constant_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTQL.g:1992:3: this_Integer_Constant_2= ruleInteger_Constant
                    {

                    			newCompositeNode(grammarAccess.getSingle_ConstantAccess().getInteger_ConstantParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Integer_Constant_2=ruleInteger_Constant();

                    state._fsp--;


                    			current = this_Integer_Constant_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalTQL.g:2001:3: this_String_Constant_3= ruleString_Constant
                    {

                    			newCompositeNode(grammarAccess.getSingle_ConstantAccess().getString_ConstantParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_String_Constant_3=ruleString_Constant();

                    state._fsp--;


                    			current = this_String_Constant_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalTQL.g:2010:3: this_Null_Constant_4= ruleNull_Constant
                    {

                    			newCompositeNode(grammarAccess.getSingle_ConstantAccess().getNull_ConstantParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Null_Constant_4=ruleNull_Constant();

                    state._fsp--;


                    			current = this_Null_Constant_4;
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
    // $ANTLR end "ruleSingle_Constant"


    // $ANTLR start "entryRuleBoolean_Constant"
    // InternalTQL.g:2022:1: entryRuleBoolean_Constant returns [EObject current=null] : iv_ruleBoolean_Constant= ruleBoolean_Constant EOF ;
    public final EObject entryRuleBoolean_Constant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolean_Constant = null;


        try {
            // InternalTQL.g:2022:57: (iv_ruleBoolean_Constant= ruleBoolean_Constant EOF )
            // InternalTQL.g:2023:2: iv_ruleBoolean_Constant= ruleBoolean_Constant EOF
            {
             newCompositeNode(grammarAccess.getBoolean_ConstantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoolean_Constant=ruleBoolean_Constant();

            state._fsp--;

             current =iv_ruleBoolean_Constant; 
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
    // $ANTLR end "entryRuleBoolean_Constant"


    // $ANTLR start "ruleBoolean_Constant"
    // InternalTQL.g:2029:1: ruleBoolean_Constant returns [EObject current=null] : ( (lv_value_0_0= ruleEBoolean ) ) ;
    public final EObject ruleBoolean_Constant() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalTQL.g:2035:2: ( ( (lv_value_0_0= ruleEBoolean ) ) )
            // InternalTQL.g:2036:2: ( (lv_value_0_0= ruleEBoolean ) )
            {
            // InternalTQL.g:2036:2: ( (lv_value_0_0= ruleEBoolean ) )
            // InternalTQL.g:2037:3: (lv_value_0_0= ruleEBoolean )
            {
            // InternalTQL.g:2037:3: (lv_value_0_0= ruleEBoolean )
            // InternalTQL.g:2038:4: lv_value_0_0= ruleEBoolean
            {

            				newCompositeNode(grammarAccess.getBoolean_ConstantAccess().getValueEBooleanParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleEBoolean();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getBoolean_ConstantRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"nl.tue.gtl.TQL.EBoolean");
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
    // $ANTLR end "ruleBoolean_Constant"


    // $ANTLR start "entryRuleFloat_Constant"
    // InternalTQL.g:2058:1: entryRuleFloat_Constant returns [EObject current=null] : iv_ruleFloat_Constant= ruleFloat_Constant EOF ;
    public final EObject entryRuleFloat_Constant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloat_Constant = null;


        try {
            // InternalTQL.g:2058:55: (iv_ruleFloat_Constant= ruleFloat_Constant EOF )
            // InternalTQL.g:2059:2: iv_ruleFloat_Constant= ruleFloat_Constant EOF
            {
             newCompositeNode(grammarAccess.getFloat_ConstantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFloat_Constant=ruleFloat_Constant();

            state._fsp--;

             current =iv_ruleFloat_Constant; 
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
    // $ANTLR end "entryRuleFloat_Constant"


    // $ANTLR start "ruleFloat_Constant"
    // InternalTQL.g:2065:1: ruleFloat_Constant returns [EObject current=null] : ( (lv_value_0_0= ruleEFloat ) ) ;
    public final EObject ruleFloat_Constant() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalTQL.g:2071:2: ( ( (lv_value_0_0= ruleEFloat ) ) )
            // InternalTQL.g:2072:2: ( (lv_value_0_0= ruleEFloat ) )
            {
            // InternalTQL.g:2072:2: ( (lv_value_0_0= ruleEFloat ) )
            // InternalTQL.g:2073:3: (lv_value_0_0= ruleEFloat )
            {
            // InternalTQL.g:2073:3: (lv_value_0_0= ruleEFloat )
            // InternalTQL.g:2074:4: lv_value_0_0= ruleEFloat
            {

            				newCompositeNode(grammarAccess.getFloat_ConstantAccess().getValueEFloatParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleEFloat();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getFloat_ConstantRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"nl.tue.gtl.TQL.EFloat");
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
    // $ANTLR end "ruleFloat_Constant"


    // $ANTLR start "entryRuleInteger_Constant"
    // InternalTQL.g:2094:1: entryRuleInteger_Constant returns [EObject current=null] : iv_ruleInteger_Constant= ruleInteger_Constant EOF ;
    public final EObject entryRuleInteger_Constant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteger_Constant = null;


        try {
            // InternalTQL.g:2094:57: (iv_ruleInteger_Constant= ruleInteger_Constant EOF )
            // InternalTQL.g:2095:2: iv_ruleInteger_Constant= ruleInteger_Constant EOF
            {
             newCompositeNode(grammarAccess.getInteger_ConstantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInteger_Constant=ruleInteger_Constant();

            state._fsp--;

             current =iv_ruleInteger_Constant; 
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
    // $ANTLR end "entryRuleInteger_Constant"


    // $ANTLR start "ruleInteger_Constant"
    // InternalTQL.g:2101:1: ruleInteger_Constant returns [EObject current=null] : ( (lv_value_0_0= ruleEInt ) ) ;
    public final EObject ruleInteger_Constant() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalTQL.g:2107:2: ( ( (lv_value_0_0= ruleEInt ) ) )
            // InternalTQL.g:2108:2: ( (lv_value_0_0= ruleEInt ) )
            {
            // InternalTQL.g:2108:2: ( (lv_value_0_0= ruleEInt ) )
            // InternalTQL.g:2109:3: (lv_value_0_0= ruleEInt )
            {
            // InternalTQL.g:2109:3: (lv_value_0_0= ruleEInt )
            // InternalTQL.g:2110:4: lv_value_0_0= ruleEInt
            {

            				newCompositeNode(grammarAccess.getInteger_ConstantAccess().getValueEIntParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleEInt();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getInteger_ConstantRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"nl.tue.gtl.TQL.EInt");
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
    // $ANTLR end "ruleInteger_Constant"


    // $ANTLR start "entryRuleString_Constant"
    // InternalTQL.g:2130:1: entryRuleString_Constant returns [EObject current=null] : iv_ruleString_Constant= ruleString_Constant EOF ;
    public final EObject entryRuleString_Constant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleString_Constant = null;


        try {
            // InternalTQL.g:2130:56: (iv_ruleString_Constant= ruleString_Constant EOF )
            // InternalTQL.g:2131:2: iv_ruleString_Constant= ruleString_Constant EOF
            {
             newCompositeNode(grammarAccess.getString_ConstantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleString_Constant=ruleString_Constant();

            state._fsp--;

             current =iv_ruleString_Constant; 
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
    // $ANTLR end "entryRuleString_Constant"


    // $ANTLR start "ruleString_Constant"
    // InternalTQL.g:2137:1: ruleString_Constant returns [EObject current=null] : (otherlv_0= '\"' ( (lv_value_1_0= ruleEString ) ) otherlv_2= '\"' ) ;
    public final EObject ruleString_Constant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalTQL.g:2143:2: ( (otherlv_0= '\"' ( (lv_value_1_0= ruleEString ) ) otherlv_2= '\"' ) )
            // InternalTQL.g:2144:2: (otherlv_0= '\"' ( (lv_value_1_0= ruleEString ) ) otherlv_2= '\"' )
            {
            // InternalTQL.g:2144:2: (otherlv_0= '\"' ( (lv_value_1_0= ruleEString ) ) otherlv_2= '\"' )
            // InternalTQL.g:2145:3: otherlv_0= '\"' ( (lv_value_1_0= ruleEString ) ) otherlv_2= '\"'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getString_ConstantAccess().getQuotationMarkKeyword_0());
            		
            // InternalTQL.g:2149:3: ( (lv_value_1_0= ruleEString ) )
            // InternalTQL.g:2150:4: (lv_value_1_0= ruleEString )
            {
            // InternalTQL.g:2150:4: (lv_value_1_0= ruleEString )
            // InternalTQL.g:2151:5: lv_value_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getString_ConstantAccess().getValueEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_29);
            lv_value_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getString_ConstantRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"nl.tue.gtl.TQL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getString_ConstantAccess().getQuotationMarkKeyword_2());
            		

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
    // $ANTLR end "ruleString_Constant"


    // $ANTLR start "entryRuleNull_Constant"
    // InternalTQL.g:2176:1: entryRuleNull_Constant returns [EObject current=null] : iv_ruleNull_Constant= ruleNull_Constant EOF ;
    public final EObject entryRuleNull_Constant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNull_Constant = null;


        try {
            // InternalTQL.g:2176:54: (iv_ruleNull_Constant= ruleNull_Constant EOF )
            // InternalTQL.g:2177:2: iv_ruleNull_Constant= ruleNull_Constant EOF
            {
             newCompositeNode(grammarAccess.getNull_ConstantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNull_Constant=ruleNull_Constant();

            state._fsp--;

             current =iv_ruleNull_Constant; 
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
    // $ANTLR end "entryRuleNull_Constant"


    // $ANTLR start "ruleNull_Constant"
    // InternalTQL.g:2183:1: ruleNull_Constant returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleNull_Constant() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTQL.g:2189:2: ( ( () otherlv_1= 'null' ) )
            // InternalTQL.g:2190:2: ( () otherlv_1= 'null' )
            {
            // InternalTQL.g:2190:2: ( () otherlv_1= 'null' )
            // InternalTQL.g:2191:3: () otherlv_1= 'null'
            {
            // InternalTQL.g:2191:3: ()
            // InternalTQL.g:2192:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNull_ConstantAccess().getNullConstantAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getNull_ConstantAccess().getNullKeyword_1());
            		

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
    // $ANTLR end "ruleNull_Constant"


    // $ANTLR start "entryRuleSet_Constant"
    // InternalTQL.g:2206:1: entryRuleSet_Constant returns [EObject current=null] : iv_ruleSet_Constant= ruleSet_Constant EOF ;
    public final EObject entryRuleSet_Constant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSet_Constant = null;


        try {
            // InternalTQL.g:2206:53: (iv_ruleSet_Constant= ruleSet_Constant EOF )
            // InternalTQL.g:2207:2: iv_ruleSet_Constant= ruleSet_Constant EOF
            {
             newCompositeNode(grammarAccess.getSet_ConstantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSet_Constant=ruleSet_Constant();

            state._fsp--;

             current =iv_ruleSet_Constant; 
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
    // $ANTLR end "entryRuleSet_Constant"


    // $ANTLR start "ruleSet_Constant"
    // InternalTQL.g:2213:1: ruleSet_Constant returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleSingle_Constant ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleSingle_Constant ) ) )* )? otherlv_5= ']' ) ;
    public final EObject ruleSet_Constant() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_values_2_0 = null;

        EObject lv_values_4_0 = null;



        	enterRule();

        try {
            // InternalTQL.g:2219:2: ( ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleSingle_Constant ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleSingle_Constant ) ) )* )? otherlv_5= ']' ) )
            // InternalTQL.g:2220:2: ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleSingle_Constant ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleSingle_Constant ) ) )* )? otherlv_5= ']' )
            {
            // InternalTQL.g:2220:2: ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleSingle_Constant ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleSingle_Constant ) ) )* )? otherlv_5= ']' )
            // InternalTQL.g:2221:3: () otherlv_1= '[' ( ( (lv_values_2_0= ruleSingle_Constant ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleSingle_Constant ) ) )* )? otherlv_5= ']'
            {
            // InternalTQL.g:2221:3: ()
            // InternalTQL.g:2222:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSet_ConstantAccess().getSetConstantAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getSet_ConstantAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalTQL.g:2232:3: ( ( (lv_values_2_0= ruleSingle_Constant ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleSingle_Constant ) ) )* )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_INT||(LA27_0>=25 && LA27_0<=26)||(LA27_0>=29 && LA27_0<=32)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalTQL.g:2233:4: ( (lv_values_2_0= ruleSingle_Constant ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleSingle_Constant ) ) )*
                    {
                    // InternalTQL.g:2233:4: ( (lv_values_2_0= ruleSingle_Constant ) )
                    // InternalTQL.g:2234:5: (lv_values_2_0= ruleSingle_Constant )
                    {
                    // InternalTQL.g:2234:5: (lv_values_2_0= ruleSingle_Constant )
                    // InternalTQL.g:2235:6: lv_values_2_0= ruleSingle_Constant
                    {

                    						newCompositeNode(grammarAccess.getSet_ConstantAccess().getValuesSingle_ConstantParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_values_2_0=ruleSingle_Constant();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSet_ConstantRule());
                    						}
                    						add(
                    							current,
                    							"values",
                    							lv_values_2_0,
                    							"nl.tue.gtl.TQL.Single_Constant");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTQL.g:2252:4: (otherlv_3= ',' ( (lv_values_4_0= ruleSingle_Constant ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==15) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalTQL.g:2253:5: otherlv_3= ',' ( (lv_values_4_0= ruleSingle_Constant ) )
                    	    {
                    	    otherlv_3=(Token)match(input,15,FOLLOW_32); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getSet_ConstantAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalTQL.g:2257:5: ( (lv_values_4_0= ruleSingle_Constant ) )
                    	    // InternalTQL.g:2258:6: (lv_values_4_0= ruleSingle_Constant )
                    	    {
                    	    // InternalTQL.g:2258:6: (lv_values_4_0= ruleSingle_Constant )
                    	    // InternalTQL.g:2259:7: lv_values_4_0= ruleSingle_Constant
                    	    {

                    	    							newCompositeNode(grammarAccess.getSet_ConstantAccess().getValuesSingle_ConstantParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_31);
                    	    lv_values_4_0=ruleSingle_Constant();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSet_ConstantRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"values",
                    	    								lv_values_4_0,
                    	    								"nl.tue.gtl.TQL.Single_Constant");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSet_ConstantAccess().getRightSquareBracketKeyword_3());
            		

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
    // $ANTLR end "ruleSet_Constant"


    // $ANTLR start "entryRuleEBoolean"
    // InternalTQL.g:2286:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalTQL.g:2286:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalTQL.g:2287:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalTQL.g:2293:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTQL.g:2299:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalTQL.g:2300:2: (kw= 'true' | kw= 'false' )
            {
            // InternalTQL.g:2300:2: (kw= 'true' | kw= 'false' )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==29) ) {
                alt28=1;
            }
            else if ( (LA28_0==30) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalTQL.g:2301:3: kw= 'true'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTQL.g:2307:3: kw= 'false'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1());
                    		

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
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleEString"
    // InternalTQL.g:2316:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalTQL.g:2316:47: (iv_ruleEString= ruleEString EOF )
            // InternalTQL.g:2317:2: iv_ruleEString= ruleEString EOF
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
    // InternalTQL.g:2323:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalTQL.g:2329:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalTQL.g:2330:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalTQL.g:2330:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_STRING) ) {
                alt29=1;
            }
            else if ( (LA29_0==RULE_ID) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalTQL.g:2331:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTQL.g:2339:3: this_ID_1= RULE_ID
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
    // InternalTQL.g:2350:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalTQL.g:2350:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalTQL.g:2351:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalTQL.g:2357:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalTQL.g:2363:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalTQL.g:2364:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalTQL.g:2364:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalTQL.g:2365:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalTQL.g:2365:3: (kw= '-' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==31) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalTQL.g:2366:4: kw= '-'
                    {
                    kw=(Token)match(input,31,FOLLOW_33); 

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
    // InternalTQL.g:2383:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // InternalTQL.g:2383:46: (iv_ruleEFloat= ruleEFloat EOF )
            // InternalTQL.g:2384:2: iv_ruleEFloat= ruleEFloat EOF
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
    // InternalTQL.g:2390:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalTQL.g:2396:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalTQL.g:2397:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalTQL.g:2397:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalTQL.g:2398:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalTQL.g:2398:3: (kw= '-' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==31) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalTQL.g:2399:4: kw= '-'
                    {
                    kw=(Token)match(input,31,FOLLOW_34); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalTQL.g:2405:3: (this_INT_1= RULE_INT )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_INT) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalTQL.g:2406:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_35); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,32,FOLLOW_33); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_36); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3());
            		
            // InternalTQL.g:2426:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=33 && LA35_0<=34)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalTQL.g:2427:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalTQL.g:2427:4: (kw= 'E' | kw= 'e' )
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==33) ) {
                        alt33=1;
                    }
                    else if ( (LA33_0==34) ) {
                        alt33=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 0, input);

                        throw nvae;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalTQL.g:2428:5: kw= 'E'
                            {
                            kw=(Token)match(input,33,FOLLOW_37); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalTQL.g:2434:5: kw= 'e'
                            {
                            kw=(Token)match(input,34,FOLLOW_37); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalTQL.g:2440:4: (kw= '-' )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==31) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalTQL.g:2441:5: kw= '-'
                            {
                            kw=(Token)match(input,31,FOLLOW_33); 

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
    // InternalTQL.g:2459:1: ruleType returns [Enumerator current=null] : ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'float' ) | (enumLiteral_3= 'date' ) | (enumLiteral_4= 'null' ) | (enumLiteral_5= 'bool' ) ) ;
    public final Enumerator ruleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalTQL.g:2465:2: ( ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'float' ) | (enumLiteral_3= 'date' ) | (enumLiteral_4= 'null' ) | (enumLiteral_5= 'bool' ) ) )
            // InternalTQL.g:2466:2: ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'float' ) | (enumLiteral_3= 'date' ) | (enumLiteral_4= 'null' ) | (enumLiteral_5= 'bool' ) )
            {
            // InternalTQL.g:2466:2: ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'float' ) | (enumLiteral_3= 'date' ) | (enumLiteral_4= 'null' ) | (enumLiteral_5= 'bool' ) )
            int alt36=6;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt36=1;
                }
                break;
            case 36:
                {
                alt36=2;
                }
                break;
            case 37:
                {
                alt36=3;
                }
                break;
            case 38:
                {
                alt36=4;
                }
                break;
            case 26:
                {
                alt36=5;
                }
                break;
            case 39:
                {
                alt36=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // InternalTQL.g:2467:3: (enumLiteral_0= 'string' )
                    {
                    // InternalTQL.g:2467:3: (enumLiteral_0= 'string' )
                    // InternalTQL.g:2468:4: enumLiteral_0= 'string'
                    {
                    enumLiteral_0=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getStringEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTQL.g:2475:3: (enumLiteral_1= 'int' )
                    {
                    // InternalTQL.g:2475:3: (enumLiteral_1= 'int' )
                    // InternalTQL.g:2476:4: enumLiteral_1= 'int'
                    {
                    enumLiteral_1=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getIntegerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getIntegerEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTQL.g:2483:3: (enumLiteral_2= 'float' )
                    {
                    // InternalTQL.g:2483:3: (enumLiteral_2= 'float' )
                    // InternalTQL.g:2484:4: enumLiteral_2= 'float'
                    {
                    enumLiteral_2=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getFloatEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTypeAccess().getFloatEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalTQL.g:2491:3: (enumLiteral_3= 'date' )
                    {
                    // InternalTQL.g:2491:3: (enumLiteral_3= 'date' )
                    // InternalTQL.g:2492:4: enumLiteral_3= 'date'
                    {
                    enumLiteral_3=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getDateEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTypeAccess().getDateEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalTQL.g:2499:3: (enumLiteral_4= 'null' )
                    {
                    // InternalTQL.g:2499:3: (enumLiteral_4= 'null' )
                    // InternalTQL.g:2500:4: enumLiteral_4= 'null'
                    {
                    enumLiteral_4=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getNullEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getTypeAccess().getNullEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalTQL.g:2507:3: (enumLiteral_5= 'bool' )
                    {
                    // InternalTQL.g:2507:3: (enumLiteral_5= 'bool' )
                    // InternalTQL.g:2508:4: enumLiteral_5= 'bool'
                    {
                    enumLiteral_5=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_5());
                    			

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


    // $ANTLR start "ruleAndOperator"
    // InternalTQL.g:2518:1: ruleAndOperator returns [Enumerator current=null] : (enumLiteral_0= '&&' ) ;
    public final Enumerator ruleAndOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalTQL.g:2524:2: ( (enumLiteral_0= '&&' ) )
            // InternalTQL.g:2525:2: (enumLiteral_0= '&&' )
            {
            // InternalTQL.g:2525:2: (enumLiteral_0= '&&' )
            // InternalTQL.g:2526:3: enumLiteral_0= '&&'
            {
            enumLiteral_0=(Token)match(input,40,FOLLOW_2); 

            			current = grammarAccess.getAndOperatorAccess().getAndEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getAndOperatorAccess().getAndEnumLiteralDeclaration());
            		

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
    // $ANTLR end "ruleAndOperator"


    // $ANTLR start "ruleOrOperator"
    // InternalTQL.g:2535:1: ruleOrOperator returns [Enumerator current=null] : (enumLiteral_0= '||' ) ;
    public final Enumerator ruleOrOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalTQL.g:2541:2: ( (enumLiteral_0= '||' ) )
            // InternalTQL.g:2542:2: (enumLiteral_0= '||' )
            {
            // InternalTQL.g:2542:2: (enumLiteral_0= '||' )
            // InternalTQL.g:2543:3: enumLiteral_0= '||'
            {
            enumLiteral_0=(Token)match(input,41,FOLLOW_2); 

            			current = grammarAccess.getOrOperatorAccess().getOrEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getOrOperatorAccess().getOrEnumLiteralDeclaration());
            		

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
    // $ANTLR end "ruleOrOperator"


    // $ANTLR start "ruleEqualsOperator"
    // InternalTQL.g:2552:1: ruleEqualsOperator returns [Enumerator current=null] : (enumLiteral_0= '==' ) ;
    public final Enumerator ruleEqualsOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalTQL.g:2558:2: ( (enumLiteral_0= '==' ) )
            // InternalTQL.g:2559:2: (enumLiteral_0= '==' )
            {
            // InternalTQL.g:2559:2: (enumLiteral_0= '==' )
            // InternalTQL.g:2560:3: enumLiteral_0= '=='
            {
            enumLiteral_0=(Token)match(input,42,FOLLOW_2); 

            			current = grammarAccess.getEqualsOperatorAccess().getEqualsEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getEqualsOperatorAccess().getEqualsEnumLiteralDeclaration());
            		

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
    // $ANTLR end "ruleEqualsOperator"


    // $ANTLR start "ruleNotEqualsOperator"
    // InternalTQL.g:2569:1: ruleNotEqualsOperator returns [Enumerator current=null] : (enumLiteral_0= '!=' ) ;
    public final Enumerator ruleNotEqualsOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalTQL.g:2575:2: ( (enumLiteral_0= '!=' ) )
            // InternalTQL.g:2576:2: (enumLiteral_0= '!=' )
            {
            // InternalTQL.g:2576:2: (enumLiteral_0= '!=' )
            // InternalTQL.g:2577:3: enumLiteral_0= '!='
            {
            enumLiteral_0=(Token)match(input,43,FOLLOW_2); 

            			current = grammarAccess.getNotEqualsOperatorAccess().getNotEqualsEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getNotEqualsOperatorAccess().getNotEqualsEnumLiteralDeclaration());
            		

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
    // $ANTLR end "ruleNotEqualsOperator"


    // $ANTLR start "ruleLessOperator"
    // InternalTQL.g:2586:1: ruleLessOperator returns [Enumerator current=null] : (enumLiteral_0= '<' ) ;
    public final Enumerator ruleLessOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalTQL.g:2592:2: ( (enumLiteral_0= '<' ) )
            // InternalTQL.g:2593:2: (enumLiteral_0= '<' )
            {
            // InternalTQL.g:2593:2: (enumLiteral_0= '<' )
            // InternalTQL.g:2594:3: enumLiteral_0= '<'
            {
            enumLiteral_0=(Token)match(input,44,FOLLOW_2); 

            			current = grammarAccess.getLessOperatorAccess().getLessEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getLessOperatorAccess().getLessEnumLiteralDeclaration());
            		

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
    // $ANTLR end "ruleLessOperator"


    // $ANTLR start "ruleGreaterOperator"
    // InternalTQL.g:2603:1: ruleGreaterOperator returns [Enumerator current=null] : (enumLiteral_0= '>' ) ;
    public final Enumerator ruleGreaterOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalTQL.g:2609:2: ( (enumLiteral_0= '>' ) )
            // InternalTQL.g:2610:2: (enumLiteral_0= '>' )
            {
            // InternalTQL.g:2610:2: (enumLiteral_0= '>' )
            // InternalTQL.g:2611:3: enumLiteral_0= '>'
            {
            enumLiteral_0=(Token)match(input,45,FOLLOW_2); 

            			current = grammarAccess.getGreaterOperatorAccess().getGreaterEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getGreaterOperatorAccess().getGreaterEnumLiteralDeclaration());
            		

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
    // $ANTLR end "ruleGreaterOperator"


    // $ANTLR start "ruleMultiplyOperator"
    // InternalTQL.g:2620:1: ruleMultiplyOperator returns [Enumerator current=null] : (enumLiteral_0= '*' ) ;
    public final Enumerator ruleMultiplyOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalTQL.g:2626:2: ( (enumLiteral_0= '*' ) )
            // InternalTQL.g:2627:2: (enumLiteral_0= '*' )
            {
            // InternalTQL.g:2627:2: (enumLiteral_0= '*' )
            // InternalTQL.g:2628:3: enumLiteral_0= '*'
            {
            enumLiteral_0=(Token)match(input,46,FOLLOW_2); 

            			current = grammarAccess.getMultiplyOperatorAccess().getMultiplyEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getMultiplyOperatorAccess().getMultiplyEnumLiteralDeclaration());
            		

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
    // $ANTLR end "ruleMultiplyOperator"


    // $ANTLR start "ruleDivideOperator"
    // InternalTQL.g:2637:1: ruleDivideOperator returns [Enumerator current=null] : (enumLiteral_0= '/' ) ;
    public final Enumerator ruleDivideOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalTQL.g:2643:2: ( (enumLiteral_0= '/' ) )
            // InternalTQL.g:2644:2: (enumLiteral_0= '/' )
            {
            // InternalTQL.g:2644:2: (enumLiteral_0= '/' )
            // InternalTQL.g:2645:3: enumLiteral_0= '/'
            {
            enumLiteral_0=(Token)match(input,47,FOLLOW_2); 

            			current = grammarAccess.getDivideOperatorAccess().getDivideEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getDivideOperatorAccess().getDivideEnumLiteralDeclaration());
            		

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
    // $ANTLR end "ruleDivideOperator"


    // $ANTLR start "ruleAddOperator"
    // InternalTQL.g:2654:1: ruleAddOperator returns [Enumerator current=null] : (enumLiteral_0= '+' ) ;
    public final Enumerator ruleAddOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalTQL.g:2660:2: ( (enumLiteral_0= '+' ) )
            // InternalTQL.g:2661:2: (enumLiteral_0= '+' )
            {
            // InternalTQL.g:2661:2: (enumLiteral_0= '+' )
            // InternalTQL.g:2662:3: enumLiteral_0= '+'
            {
            enumLiteral_0=(Token)match(input,48,FOLLOW_2); 

            			current = grammarAccess.getAddOperatorAccess().getAddEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getAddOperatorAccess().getAddEnumLiteralDeclaration());
            		

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
    // $ANTLR end "ruleAddOperator"


    // $ANTLR start "ruleSubtractOperator"
    // InternalTQL.g:2671:1: ruleSubtractOperator returns [Enumerator current=null] : (enumLiteral_0= '-' ) ;
    public final Enumerator ruleSubtractOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalTQL.g:2677:2: ( (enumLiteral_0= '-' ) )
            // InternalTQL.g:2678:2: (enumLiteral_0= '-' )
            {
            // InternalTQL.g:2678:2: (enumLiteral_0= '-' )
            // InternalTQL.g:2679:3: enumLiteral_0= '-'
            {
            enumLiteral_0=(Token)match(input,31,FOLLOW_2); 

            			current = grammarAccess.getSubtractOperatorAccess().getSubtractEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getSubtractOperatorAccess().getSubtractEnumLiteralDeclaration());
            		

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
    // $ANTLR end "ruleSubtractOperator"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000421802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000F804000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000001EE200070L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000001EE000070L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200030L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000001EF000070L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00000001F6000040L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000010008000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00000001E6000040L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000100000040L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000080000040L});

}