package nl.tue.gtl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import nl.tue.gtl.services.TQLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTQLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'&&'", "'||'", "'=='", "'!='", "'<'", "'>'", "'*'", "'/'", "'+'", "'-'", "'true'", "'false'", "'E'", "'e'", "'string'", "'int'", "'float'", "'date'", "'null'", "'bool'", "'source'", "'target'", "':'", "'{'", "'}'", "','", "'mapping'", "'->'", "'|'", "'('", "')'", "'transformation'", "'::'", "'\"'", "'['", "']'", "'.'"
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

    	public void setGrammarAccess(TQLGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleTQL"
    // InternalTQL.g:53:1: entryRuleTQL : ruleTQL EOF ;
    public final void entryRuleTQL() throws RecognitionException {
        try {
            // InternalTQL.g:54:1: ( ruleTQL EOF )
            // InternalTQL.g:55:1: ruleTQL EOF
            {
             before(grammarAccess.getTQLRule()); 
            pushFollow(FOLLOW_1);
            ruleTQL();

            state._fsp--;

             after(grammarAccess.getTQLRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTQL"


    // $ANTLR start "ruleTQL"
    // InternalTQL.g:62:1: ruleTQL : ( ( rule__TQL__BlocksAssignment )* ) ;
    public final void ruleTQL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:66:2: ( ( ( rule__TQL__BlocksAssignment )* ) )
            // InternalTQL.g:67:2: ( ( rule__TQL__BlocksAssignment )* )
            {
            // InternalTQL.g:67:2: ( ( rule__TQL__BlocksAssignment )* )
            // InternalTQL.g:68:3: ( rule__TQL__BlocksAssignment )*
            {
             before(grammarAccess.getTQLAccess().getBlocksAssignment()); 
            // InternalTQL.g:69:3: ( rule__TQL__BlocksAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=31 && LA1_0<=32)||LA1_0==37||LA1_0==42) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTQL.g:69:4: rule__TQL__BlocksAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__TQL__BlocksAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getTQLAccess().getBlocksAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTQL"


    // $ANTLR start "entryRuleBlock"
    // InternalTQL.g:78:1: entryRuleBlock : ruleBlock EOF ;
    public final void entryRuleBlock() throws RecognitionException {
        try {
            // InternalTQL.g:79:1: ( ruleBlock EOF )
            // InternalTQL.g:80:1: ruleBlock EOF
            {
             before(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_1);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getBlockRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // InternalTQL.g:87:1: ruleBlock : ( ( rule__Block__Alternatives ) ) ;
    public final void ruleBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:91:2: ( ( ( rule__Block__Alternatives ) ) )
            // InternalTQL.g:92:2: ( ( rule__Block__Alternatives ) )
            {
            // InternalTQL.g:92:2: ( ( rule__Block__Alternatives ) )
            // InternalTQL.g:93:3: ( rule__Block__Alternatives )
            {
             before(grammarAccess.getBlockAccess().getAlternatives()); 
            // InternalTQL.g:94:3: ( rule__Block__Alternatives )
            // InternalTQL.g:94:4: rule__Block__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Block__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBlockAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleTable_Impl"
    // InternalTQL.g:103:1: entryRuleTable_Impl : ruleTable_Impl EOF ;
    public final void entryRuleTable_Impl() throws RecognitionException {
        try {
            // InternalTQL.g:104:1: ( ruleTable_Impl EOF )
            // InternalTQL.g:105:1: ruleTable_Impl EOF
            {
             before(grammarAccess.getTable_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleTable_Impl();

            state._fsp--;

             after(grammarAccess.getTable_ImplRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTable_Impl"


    // $ANTLR start "ruleTable_Impl"
    // InternalTQL.g:112:1: ruleTable_Impl : ( ( rule__Table_Impl__Alternatives ) ) ;
    public final void ruleTable_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:116:2: ( ( ( rule__Table_Impl__Alternatives ) ) )
            // InternalTQL.g:117:2: ( ( rule__Table_Impl__Alternatives ) )
            {
            // InternalTQL.g:117:2: ( ( rule__Table_Impl__Alternatives ) )
            // InternalTQL.g:118:3: ( rule__Table_Impl__Alternatives )
            {
             before(grammarAccess.getTable_ImplAccess().getAlternatives()); 
            // InternalTQL.g:119:3: ( rule__Table_Impl__Alternatives )
            // InternalTQL.g:119:4: rule__Table_Impl__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Table_Impl__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTable_ImplAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTable_Impl"


    // $ANTLR start "entryRuleColumn"
    // InternalTQL.g:128:1: entryRuleColumn : ruleColumn EOF ;
    public final void entryRuleColumn() throws RecognitionException {
        try {
            // InternalTQL.g:129:1: ( ruleColumn EOF )
            // InternalTQL.g:130:1: ruleColumn EOF
            {
             before(grammarAccess.getColumnRule()); 
            pushFollow(FOLLOW_1);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getColumnRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleColumn"


    // $ANTLR start "ruleColumn"
    // InternalTQL.g:137:1: ruleColumn : ( ( rule__Column__Group__0 ) ) ;
    public final void ruleColumn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:141:2: ( ( ( rule__Column__Group__0 ) ) )
            // InternalTQL.g:142:2: ( ( rule__Column__Group__0 ) )
            {
            // InternalTQL.g:142:2: ( ( rule__Column__Group__0 ) )
            // InternalTQL.g:143:3: ( rule__Column__Group__0 )
            {
             before(grammarAccess.getColumnAccess().getGroup()); 
            // InternalTQL.g:144:3: ( rule__Column__Group__0 )
            // InternalTQL.g:144:4: rule__Column__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Column__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColumn"


    // $ANTLR start "entryRuleSource_Table"
    // InternalTQL.g:153:1: entryRuleSource_Table : ruleSource_Table EOF ;
    public final void entryRuleSource_Table() throws RecognitionException {
        try {
            // InternalTQL.g:154:1: ( ruleSource_Table EOF )
            // InternalTQL.g:155:1: ruleSource_Table EOF
            {
             before(grammarAccess.getSource_TableRule()); 
            pushFollow(FOLLOW_1);
            ruleSource_Table();

            state._fsp--;

             after(grammarAccess.getSource_TableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSource_Table"


    // $ANTLR start "ruleSource_Table"
    // InternalTQL.g:162:1: ruleSource_Table : ( ( rule__Source_Table__Group__0 ) ) ;
    public final void ruleSource_Table() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:166:2: ( ( ( rule__Source_Table__Group__0 ) ) )
            // InternalTQL.g:167:2: ( ( rule__Source_Table__Group__0 ) )
            {
            // InternalTQL.g:167:2: ( ( rule__Source_Table__Group__0 ) )
            // InternalTQL.g:168:3: ( rule__Source_Table__Group__0 )
            {
             before(grammarAccess.getSource_TableAccess().getGroup()); 
            // InternalTQL.g:169:3: ( rule__Source_Table__Group__0 )
            // InternalTQL.g:169:4: rule__Source_Table__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Source_Table__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSource_TableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSource_Table"


    // $ANTLR start "entryRuleTarget_Table"
    // InternalTQL.g:178:1: entryRuleTarget_Table : ruleTarget_Table EOF ;
    public final void entryRuleTarget_Table() throws RecognitionException {
        try {
            // InternalTQL.g:179:1: ( ruleTarget_Table EOF )
            // InternalTQL.g:180:1: ruleTarget_Table EOF
            {
             before(grammarAccess.getTarget_TableRule()); 
            pushFollow(FOLLOW_1);
            ruleTarget_Table();

            state._fsp--;

             after(grammarAccess.getTarget_TableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTarget_Table"


    // $ANTLR start "ruleTarget_Table"
    // InternalTQL.g:187:1: ruleTarget_Table : ( ( rule__Target_Table__Group__0 ) ) ;
    public final void ruleTarget_Table() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:191:2: ( ( ( rule__Target_Table__Group__0 ) ) )
            // InternalTQL.g:192:2: ( ( rule__Target_Table__Group__0 ) )
            {
            // InternalTQL.g:192:2: ( ( rule__Target_Table__Group__0 ) )
            // InternalTQL.g:193:3: ( rule__Target_Table__Group__0 )
            {
             before(grammarAccess.getTarget_TableAccess().getGroup()); 
            // InternalTQL.g:194:3: ( rule__Target_Table__Group__0 )
            // InternalTQL.g:194:4: rule__Target_Table__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Target_Table__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTarget_TableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTarget_Table"


    // $ANTLR start "entryRuleMapping"
    // InternalTQL.g:203:1: entryRuleMapping : ruleMapping EOF ;
    public final void entryRuleMapping() throws RecognitionException {
        try {
            // InternalTQL.g:204:1: ( ruleMapping EOF )
            // InternalTQL.g:205:1: ruleMapping EOF
            {
             before(grammarAccess.getMappingRule()); 
            pushFollow(FOLLOW_1);
            ruleMapping();

            state._fsp--;

             after(grammarAccess.getMappingRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMapping"


    // $ANTLR start "ruleMapping"
    // InternalTQL.g:212:1: ruleMapping : ( ( rule__Mapping__Group__0 ) ) ;
    public final void ruleMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:216:2: ( ( ( rule__Mapping__Group__0 ) ) )
            // InternalTQL.g:217:2: ( ( rule__Mapping__Group__0 ) )
            {
            // InternalTQL.g:217:2: ( ( rule__Mapping__Group__0 ) )
            // InternalTQL.g:218:3: ( rule__Mapping__Group__0 )
            {
             before(grammarAccess.getMappingAccess().getGroup()); 
            // InternalTQL.g:219:3: ( rule__Mapping__Group__0 )
            // InternalTQL.g:219:4: rule__Mapping__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Mapping__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMappingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMapping"


    // $ANTLR start "entryRuleMapped_Column"
    // InternalTQL.g:228:1: entryRuleMapped_Column : ruleMapped_Column EOF ;
    public final void entryRuleMapped_Column() throws RecognitionException {
        try {
            // InternalTQL.g:229:1: ( ruleMapped_Column EOF )
            // InternalTQL.g:230:1: ruleMapped_Column EOF
            {
             before(grammarAccess.getMapped_ColumnRule()); 
            pushFollow(FOLLOW_1);
            ruleMapped_Column();

            state._fsp--;

             after(grammarAccess.getMapped_ColumnRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMapped_Column"


    // $ANTLR start "ruleMapped_Column"
    // InternalTQL.g:237:1: ruleMapped_Column : ( ( rule__Mapped_Column__Group__0 ) ) ;
    public final void ruleMapped_Column() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:241:2: ( ( ( rule__Mapped_Column__Group__0 ) ) )
            // InternalTQL.g:242:2: ( ( rule__Mapped_Column__Group__0 ) )
            {
            // InternalTQL.g:242:2: ( ( rule__Mapped_Column__Group__0 ) )
            // InternalTQL.g:243:3: ( rule__Mapped_Column__Group__0 )
            {
             before(grammarAccess.getMapped_ColumnAccess().getGroup()); 
            // InternalTQL.g:244:3: ( rule__Mapped_Column__Group__0 )
            // InternalTQL.g:244:4: rule__Mapped_Column__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Mapped_Column__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMapped_ColumnAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMapped_Column"


    // $ANTLR start "entryRuleTransformation_Call"
    // InternalTQL.g:253:1: entryRuleTransformation_Call : ruleTransformation_Call EOF ;
    public final void entryRuleTransformation_Call() throws RecognitionException {
        try {
            // InternalTQL.g:254:1: ( ruleTransformation_Call EOF )
            // InternalTQL.g:255:1: ruleTransformation_Call EOF
            {
             before(grammarAccess.getTransformation_CallRule()); 
            pushFollow(FOLLOW_1);
            ruleTransformation_Call();

            state._fsp--;

             after(grammarAccess.getTransformation_CallRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTransformation_Call"


    // $ANTLR start "ruleTransformation_Call"
    // InternalTQL.g:262:1: ruleTransformation_Call : ( ( rule__Transformation_Call__Group__0 ) ) ;
    public final void ruleTransformation_Call() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:266:2: ( ( ( rule__Transformation_Call__Group__0 ) ) )
            // InternalTQL.g:267:2: ( ( rule__Transformation_Call__Group__0 ) )
            {
            // InternalTQL.g:267:2: ( ( rule__Transformation_Call__Group__0 ) )
            // InternalTQL.g:268:3: ( rule__Transformation_Call__Group__0 )
            {
             before(grammarAccess.getTransformation_CallAccess().getGroup()); 
            // InternalTQL.g:269:3: ( rule__Transformation_Call__Group__0 )
            // InternalTQL.g:269:4: rule__Transformation_Call__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Transformation_Call__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransformation_CallAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransformation_Call"


    // $ANTLR start "entryRuleTransformation"
    // InternalTQL.g:278:1: entryRuleTransformation : ruleTransformation EOF ;
    public final void entryRuleTransformation() throws RecognitionException {
        try {
            // InternalTQL.g:279:1: ( ruleTransformation EOF )
            // InternalTQL.g:280:1: ruleTransformation EOF
            {
             before(grammarAccess.getTransformationRule()); 
            pushFollow(FOLLOW_1);
            ruleTransformation();

            state._fsp--;

             after(grammarAccess.getTransformationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTransformation"


    // $ANTLR start "ruleTransformation"
    // InternalTQL.g:287:1: ruleTransformation : ( ( rule__Transformation__Group__0 ) ) ;
    public final void ruleTransformation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:291:2: ( ( ( rule__Transformation__Group__0 ) ) )
            // InternalTQL.g:292:2: ( ( rule__Transformation__Group__0 ) )
            {
            // InternalTQL.g:292:2: ( ( rule__Transformation__Group__0 ) )
            // InternalTQL.g:293:3: ( rule__Transformation__Group__0 )
            {
             before(grammarAccess.getTransformationAccess().getGroup()); 
            // InternalTQL.g:294:3: ( rule__Transformation__Group__0 )
            // InternalTQL.g:294:4: rule__Transformation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Transformation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransformationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransformation"


    // $ANTLR start "entryRuleParameter"
    // InternalTQL.g:303:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalTQL.g:304:1: ( ruleParameter EOF )
            // InternalTQL.g:305:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalTQL.g:312:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:316:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalTQL.g:317:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalTQL.g:317:2: ( ( rule__Parameter__Group__0 ) )
            // InternalTQL.g:318:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalTQL.g:319:3: ( rule__Parameter__Group__0 )
            // InternalTQL.g:319:4: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleCall_Parameter"
    // InternalTQL.g:328:1: entryRuleCall_Parameter : ruleCall_Parameter EOF ;
    public final void entryRuleCall_Parameter() throws RecognitionException {
        try {
            // InternalTQL.g:329:1: ( ruleCall_Parameter EOF )
            // InternalTQL.g:330:1: ruleCall_Parameter EOF
            {
             before(grammarAccess.getCall_ParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleCall_Parameter();

            state._fsp--;

             after(grammarAccess.getCall_ParameterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCall_Parameter"


    // $ANTLR start "ruleCall_Parameter"
    // InternalTQL.g:337:1: ruleCall_Parameter : ( ( rule__Call_Parameter__Alternatives ) ) ;
    public final void ruleCall_Parameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:341:2: ( ( ( rule__Call_Parameter__Alternatives ) ) )
            // InternalTQL.g:342:2: ( ( rule__Call_Parameter__Alternatives ) )
            {
            // InternalTQL.g:342:2: ( ( rule__Call_Parameter__Alternatives ) )
            // InternalTQL.g:343:3: ( rule__Call_Parameter__Alternatives )
            {
             before(grammarAccess.getCall_ParameterAccess().getAlternatives()); 
            // InternalTQL.g:344:3: ( rule__Call_Parameter__Alternatives )
            // InternalTQL.g:344:4: rule__Call_Parameter__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Call_Parameter__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCall_ParameterAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCall_Parameter"


    // $ANTLR start "entryRuleConstant_Call_Parameter"
    // InternalTQL.g:353:1: entryRuleConstant_Call_Parameter : ruleConstant_Call_Parameter EOF ;
    public final void entryRuleConstant_Call_Parameter() throws RecognitionException {
        try {
            // InternalTQL.g:354:1: ( ruleConstant_Call_Parameter EOF )
            // InternalTQL.g:355:1: ruleConstant_Call_Parameter EOF
            {
             before(grammarAccess.getConstant_Call_ParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleConstant_Call_Parameter();

            state._fsp--;

             after(grammarAccess.getConstant_Call_ParameterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstant_Call_Parameter"


    // $ANTLR start "ruleConstant_Call_Parameter"
    // InternalTQL.g:362:1: ruleConstant_Call_Parameter : ( ( rule__Constant_Call_Parameter__ParameterAssignment ) ) ;
    public final void ruleConstant_Call_Parameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:366:2: ( ( ( rule__Constant_Call_Parameter__ParameterAssignment ) ) )
            // InternalTQL.g:367:2: ( ( rule__Constant_Call_Parameter__ParameterAssignment ) )
            {
            // InternalTQL.g:367:2: ( ( rule__Constant_Call_Parameter__ParameterAssignment ) )
            // InternalTQL.g:368:3: ( rule__Constant_Call_Parameter__ParameterAssignment )
            {
             before(grammarAccess.getConstant_Call_ParameterAccess().getParameterAssignment()); 
            // InternalTQL.g:369:3: ( rule__Constant_Call_Parameter__ParameterAssignment )
            // InternalTQL.g:369:4: rule__Constant_Call_Parameter__ParameterAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Constant_Call_Parameter__ParameterAssignment();

            state._fsp--;


            }

             after(grammarAccess.getConstant_Call_ParameterAccess().getParameterAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstant_Call_Parameter"


    // $ANTLR start "entryRuleReference_Call_Parameter"
    // InternalTQL.g:378:1: entryRuleReference_Call_Parameter : ruleReference_Call_Parameter EOF ;
    public final void entryRuleReference_Call_Parameter() throws RecognitionException {
        try {
            // InternalTQL.g:379:1: ( ruleReference_Call_Parameter EOF )
            // InternalTQL.g:380:1: ruleReference_Call_Parameter EOF
            {
             before(grammarAccess.getReference_Call_ParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleReference_Call_Parameter();

            state._fsp--;

             after(grammarAccess.getReference_Call_ParameterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReference_Call_Parameter"


    // $ANTLR start "ruleReference_Call_Parameter"
    // InternalTQL.g:387:1: ruleReference_Call_Parameter : ( ( rule__Reference_Call_Parameter__ReferenceAssignment ) ) ;
    public final void ruleReference_Call_Parameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:391:2: ( ( ( rule__Reference_Call_Parameter__ReferenceAssignment ) ) )
            // InternalTQL.g:392:2: ( ( rule__Reference_Call_Parameter__ReferenceAssignment ) )
            {
            // InternalTQL.g:392:2: ( ( rule__Reference_Call_Parameter__ReferenceAssignment ) )
            // InternalTQL.g:393:3: ( rule__Reference_Call_Parameter__ReferenceAssignment )
            {
             before(grammarAccess.getReference_Call_ParameterAccess().getReferenceAssignment()); 
            // InternalTQL.g:394:3: ( rule__Reference_Call_Parameter__ReferenceAssignment )
            // InternalTQL.g:394:4: rule__Reference_Call_Parameter__ReferenceAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Reference_Call_Parameter__ReferenceAssignment();

            state._fsp--;


            }

             after(grammarAccess.getReference_Call_ParameterAccess().getReferenceAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReference_Call_Parameter"


    // $ANTLR start "entryRuleExpression"
    // InternalTQL.g:403:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalTQL.g:404:1: ( ruleExpression EOF )
            // InternalTQL.g:405:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalTQL.g:412:1: ruleExpression : ( ruleAnd ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:416:2: ( ( ruleAnd ) )
            // InternalTQL.g:417:2: ( ruleAnd )
            {
            // InternalTQL.g:417:2: ( ruleAnd )
            // InternalTQL.g:418:3: ruleAnd
            {
             before(grammarAccess.getExpressionAccess().getAndParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleAnd();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getAndParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleAnd"
    // InternalTQL.g:428:1: entryRuleAnd : ruleAnd EOF ;
    public final void entryRuleAnd() throws RecognitionException {
        try {
            // InternalTQL.g:429:1: ( ruleAnd EOF )
            // InternalTQL.g:430:1: ruleAnd EOF
            {
             before(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_1);
            ruleAnd();

            state._fsp--;

             after(grammarAccess.getAndRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalTQL.g:437:1: ruleAnd : ( ( rule__And__Group__0 ) ) ;
    public final void ruleAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:441:2: ( ( ( rule__And__Group__0 ) ) )
            // InternalTQL.g:442:2: ( ( rule__And__Group__0 ) )
            {
            // InternalTQL.g:442:2: ( ( rule__And__Group__0 ) )
            // InternalTQL.g:443:3: ( rule__And__Group__0 )
            {
             before(grammarAccess.getAndAccess().getGroup()); 
            // InternalTQL.g:444:3: ( rule__And__Group__0 )
            // InternalTQL.g:444:4: rule__And__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__And__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleOr"
    // InternalTQL.g:453:1: entryRuleOr : ruleOr EOF ;
    public final void entryRuleOr() throws RecognitionException {
        try {
            // InternalTQL.g:454:1: ( ruleOr EOF )
            // InternalTQL.g:455:1: ruleOr EOF
            {
             before(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_1);
            ruleOr();

            state._fsp--;

             after(grammarAccess.getOrRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // InternalTQL.g:462:1: ruleOr : ( ( rule__Or__Group__0 ) ) ;
    public final void ruleOr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:466:2: ( ( ( rule__Or__Group__0 ) ) )
            // InternalTQL.g:467:2: ( ( rule__Or__Group__0 ) )
            {
            // InternalTQL.g:467:2: ( ( rule__Or__Group__0 ) )
            // InternalTQL.g:468:3: ( rule__Or__Group__0 )
            {
             before(grammarAccess.getOrAccess().getGroup()); 
            // InternalTQL.g:469:3: ( rule__Or__Group__0 )
            // InternalTQL.g:469:4: rule__Or__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleEquals"
    // InternalTQL.g:478:1: entryRuleEquals : ruleEquals EOF ;
    public final void entryRuleEquals() throws RecognitionException {
        try {
            // InternalTQL.g:479:1: ( ruleEquals EOF )
            // InternalTQL.g:480:1: ruleEquals EOF
            {
             before(grammarAccess.getEqualsRule()); 
            pushFollow(FOLLOW_1);
            ruleEquals();

            state._fsp--;

             after(grammarAccess.getEqualsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEquals"


    // $ANTLR start "ruleEquals"
    // InternalTQL.g:487:1: ruleEquals : ( ( rule__Equals__Group__0 ) ) ;
    public final void ruleEquals() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:491:2: ( ( ( rule__Equals__Group__0 ) ) )
            // InternalTQL.g:492:2: ( ( rule__Equals__Group__0 ) )
            {
            // InternalTQL.g:492:2: ( ( rule__Equals__Group__0 ) )
            // InternalTQL.g:493:3: ( rule__Equals__Group__0 )
            {
             before(grammarAccess.getEqualsAccess().getGroup()); 
            // InternalTQL.g:494:3: ( rule__Equals__Group__0 )
            // InternalTQL.g:494:4: rule__Equals__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Equals__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEqualsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEquals"


    // $ANTLR start "entryRuleNotEquals"
    // InternalTQL.g:503:1: entryRuleNotEquals : ruleNotEquals EOF ;
    public final void entryRuleNotEquals() throws RecognitionException {
        try {
            // InternalTQL.g:504:1: ( ruleNotEquals EOF )
            // InternalTQL.g:505:1: ruleNotEquals EOF
            {
             before(grammarAccess.getNotEqualsRule()); 
            pushFollow(FOLLOW_1);
            ruleNotEquals();

            state._fsp--;

             after(grammarAccess.getNotEqualsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNotEquals"


    // $ANTLR start "ruleNotEquals"
    // InternalTQL.g:512:1: ruleNotEquals : ( ( rule__NotEquals__Group__0 ) ) ;
    public final void ruleNotEquals() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:516:2: ( ( ( rule__NotEquals__Group__0 ) ) )
            // InternalTQL.g:517:2: ( ( rule__NotEquals__Group__0 ) )
            {
            // InternalTQL.g:517:2: ( ( rule__NotEquals__Group__0 ) )
            // InternalTQL.g:518:3: ( rule__NotEquals__Group__0 )
            {
             before(grammarAccess.getNotEqualsAccess().getGroup()); 
            // InternalTQL.g:519:3: ( rule__NotEquals__Group__0 )
            // InternalTQL.g:519:4: rule__NotEquals__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NotEquals__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNotEqualsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNotEquals"


    // $ANTLR start "entryRuleLess"
    // InternalTQL.g:528:1: entryRuleLess : ruleLess EOF ;
    public final void entryRuleLess() throws RecognitionException {
        try {
            // InternalTQL.g:529:1: ( ruleLess EOF )
            // InternalTQL.g:530:1: ruleLess EOF
            {
             before(grammarAccess.getLessRule()); 
            pushFollow(FOLLOW_1);
            ruleLess();

            state._fsp--;

             after(grammarAccess.getLessRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLess"


    // $ANTLR start "ruleLess"
    // InternalTQL.g:537:1: ruleLess : ( ( rule__Less__Group__0 ) ) ;
    public final void ruleLess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:541:2: ( ( ( rule__Less__Group__0 ) ) )
            // InternalTQL.g:542:2: ( ( rule__Less__Group__0 ) )
            {
            // InternalTQL.g:542:2: ( ( rule__Less__Group__0 ) )
            // InternalTQL.g:543:3: ( rule__Less__Group__0 )
            {
             before(grammarAccess.getLessAccess().getGroup()); 
            // InternalTQL.g:544:3: ( rule__Less__Group__0 )
            // InternalTQL.g:544:4: rule__Less__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Less__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLessAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLess"


    // $ANTLR start "entryRuleGreater"
    // InternalTQL.g:553:1: entryRuleGreater : ruleGreater EOF ;
    public final void entryRuleGreater() throws RecognitionException {
        try {
            // InternalTQL.g:554:1: ( ruleGreater EOF )
            // InternalTQL.g:555:1: ruleGreater EOF
            {
             before(grammarAccess.getGreaterRule()); 
            pushFollow(FOLLOW_1);
            ruleGreater();

            state._fsp--;

             after(grammarAccess.getGreaterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGreater"


    // $ANTLR start "ruleGreater"
    // InternalTQL.g:562:1: ruleGreater : ( ( rule__Greater__Group__0 ) ) ;
    public final void ruleGreater() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:566:2: ( ( ( rule__Greater__Group__0 ) ) )
            // InternalTQL.g:567:2: ( ( rule__Greater__Group__0 ) )
            {
            // InternalTQL.g:567:2: ( ( rule__Greater__Group__0 ) )
            // InternalTQL.g:568:3: ( rule__Greater__Group__0 )
            {
             before(grammarAccess.getGreaterAccess().getGroup()); 
            // InternalTQL.g:569:3: ( rule__Greater__Group__0 )
            // InternalTQL.g:569:4: rule__Greater__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Greater__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGreaterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGreater"


    // $ANTLR start "entryRuleMultiply"
    // InternalTQL.g:578:1: entryRuleMultiply : ruleMultiply EOF ;
    public final void entryRuleMultiply() throws RecognitionException {
        try {
            // InternalTQL.g:579:1: ( ruleMultiply EOF )
            // InternalTQL.g:580:1: ruleMultiply EOF
            {
             before(grammarAccess.getMultiplyRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiply();

            state._fsp--;

             after(grammarAccess.getMultiplyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultiply"


    // $ANTLR start "ruleMultiply"
    // InternalTQL.g:587:1: ruleMultiply : ( ( rule__Multiply__Group__0 ) ) ;
    public final void ruleMultiply() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:591:2: ( ( ( rule__Multiply__Group__0 ) ) )
            // InternalTQL.g:592:2: ( ( rule__Multiply__Group__0 ) )
            {
            // InternalTQL.g:592:2: ( ( rule__Multiply__Group__0 ) )
            // InternalTQL.g:593:3: ( rule__Multiply__Group__0 )
            {
             before(grammarAccess.getMultiplyAccess().getGroup()); 
            // InternalTQL.g:594:3: ( rule__Multiply__Group__0 )
            // InternalTQL.g:594:4: rule__Multiply__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Multiply__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiply"


    // $ANTLR start "entryRuleDivide"
    // InternalTQL.g:603:1: entryRuleDivide : ruleDivide EOF ;
    public final void entryRuleDivide() throws RecognitionException {
        try {
            // InternalTQL.g:604:1: ( ruleDivide EOF )
            // InternalTQL.g:605:1: ruleDivide EOF
            {
             before(grammarAccess.getDivideRule()); 
            pushFollow(FOLLOW_1);
            ruleDivide();

            state._fsp--;

             after(grammarAccess.getDivideRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDivide"


    // $ANTLR start "ruleDivide"
    // InternalTQL.g:612:1: ruleDivide : ( ( rule__Divide__Group__0 ) ) ;
    public final void ruleDivide() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:616:2: ( ( ( rule__Divide__Group__0 ) ) )
            // InternalTQL.g:617:2: ( ( rule__Divide__Group__0 ) )
            {
            // InternalTQL.g:617:2: ( ( rule__Divide__Group__0 ) )
            // InternalTQL.g:618:3: ( rule__Divide__Group__0 )
            {
             before(grammarAccess.getDivideAccess().getGroup()); 
            // InternalTQL.g:619:3: ( rule__Divide__Group__0 )
            // InternalTQL.g:619:4: rule__Divide__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Divide__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDivideAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDivide"


    // $ANTLR start "entryRuleAdd"
    // InternalTQL.g:628:1: entryRuleAdd : ruleAdd EOF ;
    public final void entryRuleAdd() throws RecognitionException {
        try {
            // InternalTQL.g:629:1: ( ruleAdd EOF )
            // InternalTQL.g:630:1: ruleAdd EOF
            {
             before(grammarAccess.getAddRule()); 
            pushFollow(FOLLOW_1);
            ruleAdd();

            state._fsp--;

             after(grammarAccess.getAddRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAdd"


    // $ANTLR start "ruleAdd"
    // InternalTQL.g:637:1: ruleAdd : ( ( rule__Add__Group__0 ) ) ;
    public final void ruleAdd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:641:2: ( ( ( rule__Add__Group__0 ) ) )
            // InternalTQL.g:642:2: ( ( rule__Add__Group__0 ) )
            {
            // InternalTQL.g:642:2: ( ( rule__Add__Group__0 ) )
            // InternalTQL.g:643:3: ( rule__Add__Group__0 )
            {
             before(grammarAccess.getAddAccess().getGroup()); 
            // InternalTQL.g:644:3: ( rule__Add__Group__0 )
            // InternalTQL.g:644:4: rule__Add__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Add__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAddAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAdd"


    // $ANTLR start "entryRuleSubtract"
    // InternalTQL.g:653:1: entryRuleSubtract : ruleSubtract EOF ;
    public final void entryRuleSubtract() throws RecognitionException {
        try {
            // InternalTQL.g:654:1: ( ruleSubtract EOF )
            // InternalTQL.g:655:1: ruleSubtract EOF
            {
             before(grammarAccess.getSubtractRule()); 
            pushFollow(FOLLOW_1);
            ruleSubtract();

            state._fsp--;

             after(grammarAccess.getSubtractRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSubtract"


    // $ANTLR start "ruleSubtract"
    // InternalTQL.g:662:1: ruleSubtract : ( ( rule__Subtract__Group__0 ) ) ;
    public final void ruleSubtract() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:666:2: ( ( ( rule__Subtract__Group__0 ) ) )
            // InternalTQL.g:667:2: ( ( rule__Subtract__Group__0 ) )
            {
            // InternalTQL.g:667:2: ( ( rule__Subtract__Group__0 ) )
            // InternalTQL.g:668:3: ( rule__Subtract__Group__0 )
            {
             before(grammarAccess.getSubtractAccess().getGroup()); 
            // InternalTQL.g:669:3: ( rule__Subtract__Group__0 )
            // InternalTQL.g:669:4: rule__Subtract__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Subtract__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubtractAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubtract"


    // $ANTLR start "entryRuleLiterals"
    // InternalTQL.g:678:1: entryRuleLiterals : ruleLiterals EOF ;
    public final void entryRuleLiterals() throws RecognitionException {
        try {
            // InternalTQL.g:679:1: ( ruleLiterals EOF )
            // InternalTQL.g:680:1: ruleLiterals EOF
            {
             before(grammarAccess.getLiteralsRule()); 
            pushFollow(FOLLOW_1);
            ruleLiterals();

            state._fsp--;

             after(grammarAccess.getLiteralsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLiterals"


    // $ANTLR start "ruleLiterals"
    // InternalTQL.g:687:1: ruleLiterals : ( ( rule__Literals__Alternatives ) ) ;
    public final void ruleLiterals() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:691:2: ( ( ( rule__Literals__Alternatives ) ) )
            // InternalTQL.g:692:2: ( ( rule__Literals__Alternatives ) )
            {
            // InternalTQL.g:692:2: ( ( rule__Literals__Alternatives ) )
            // InternalTQL.g:693:3: ( rule__Literals__Alternatives )
            {
             before(grammarAccess.getLiteralsAccess().getAlternatives()); 
            // InternalTQL.g:694:3: ( rule__Literals__Alternatives )
            // InternalTQL.g:694:4: rule__Literals__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Literals__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLiteralsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiterals"


    // $ANTLR start "entryRuleParameter_Expression"
    // InternalTQL.g:703:1: entryRuleParameter_Expression : ruleParameter_Expression EOF ;
    public final void entryRuleParameter_Expression() throws RecognitionException {
        try {
            // InternalTQL.g:704:1: ( ruleParameter_Expression EOF )
            // InternalTQL.g:705:1: ruleParameter_Expression EOF
            {
             before(grammarAccess.getParameter_ExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleParameter_Expression();

            state._fsp--;

             after(grammarAccess.getParameter_ExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameter_Expression"


    // $ANTLR start "ruleParameter_Expression"
    // InternalTQL.g:712:1: ruleParameter_Expression : ( ( rule__Parameter_Expression__ParameterAssignment ) ) ;
    public final void ruleParameter_Expression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:716:2: ( ( ( rule__Parameter_Expression__ParameterAssignment ) ) )
            // InternalTQL.g:717:2: ( ( rule__Parameter_Expression__ParameterAssignment ) )
            {
            // InternalTQL.g:717:2: ( ( rule__Parameter_Expression__ParameterAssignment ) )
            // InternalTQL.g:718:3: ( rule__Parameter_Expression__ParameterAssignment )
            {
             before(grammarAccess.getParameter_ExpressionAccess().getParameterAssignment()); 
            // InternalTQL.g:719:3: ( rule__Parameter_Expression__ParameterAssignment )
            // InternalTQL.g:719:4: rule__Parameter_Expression__ParameterAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Parameter_Expression__ParameterAssignment();

            state._fsp--;


            }

             after(grammarAccess.getParameter_ExpressionAccess().getParameterAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter_Expression"


    // $ANTLR start "entryRuleConstant"
    // InternalTQL.g:728:1: entryRuleConstant : ruleConstant EOF ;
    public final void entryRuleConstant() throws RecognitionException {
        try {
            // InternalTQL.g:729:1: ( ruleConstant EOF )
            // InternalTQL.g:730:1: ruleConstant EOF
            {
             before(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_1);
            ruleConstant();

            state._fsp--;

             after(grammarAccess.getConstantRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // InternalTQL.g:737:1: ruleConstant : ( ( rule__Constant__Alternatives ) ) ;
    public final void ruleConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:741:2: ( ( ( rule__Constant__Alternatives ) ) )
            // InternalTQL.g:742:2: ( ( rule__Constant__Alternatives ) )
            {
            // InternalTQL.g:742:2: ( ( rule__Constant__Alternatives ) )
            // InternalTQL.g:743:3: ( rule__Constant__Alternatives )
            {
             before(grammarAccess.getConstantAccess().getAlternatives()); 
            // InternalTQL.g:744:3: ( rule__Constant__Alternatives )
            // InternalTQL.g:744:4: rule__Constant__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Constant__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConstantAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleSingle_Constant"
    // InternalTQL.g:753:1: entryRuleSingle_Constant : ruleSingle_Constant EOF ;
    public final void entryRuleSingle_Constant() throws RecognitionException {
        try {
            // InternalTQL.g:754:1: ( ruleSingle_Constant EOF )
            // InternalTQL.g:755:1: ruleSingle_Constant EOF
            {
             before(grammarAccess.getSingle_ConstantRule()); 
            pushFollow(FOLLOW_1);
            ruleSingle_Constant();

            state._fsp--;

             after(grammarAccess.getSingle_ConstantRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSingle_Constant"


    // $ANTLR start "ruleSingle_Constant"
    // InternalTQL.g:762:1: ruleSingle_Constant : ( ( rule__Single_Constant__Alternatives ) ) ;
    public final void ruleSingle_Constant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:766:2: ( ( ( rule__Single_Constant__Alternatives ) ) )
            // InternalTQL.g:767:2: ( ( rule__Single_Constant__Alternatives ) )
            {
            // InternalTQL.g:767:2: ( ( rule__Single_Constant__Alternatives ) )
            // InternalTQL.g:768:3: ( rule__Single_Constant__Alternatives )
            {
             before(grammarAccess.getSingle_ConstantAccess().getAlternatives()); 
            // InternalTQL.g:769:3: ( rule__Single_Constant__Alternatives )
            // InternalTQL.g:769:4: rule__Single_Constant__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Single_Constant__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSingle_ConstantAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSingle_Constant"


    // $ANTLR start "entryRuleBoolean_Constant"
    // InternalTQL.g:778:1: entryRuleBoolean_Constant : ruleBoolean_Constant EOF ;
    public final void entryRuleBoolean_Constant() throws RecognitionException {
        try {
            // InternalTQL.g:779:1: ( ruleBoolean_Constant EOF )
            // InternalTQL.g:780:1: ruleBoolean_Constant EOF
            {
             before(grammarAccess.getBoolean_ConstantRule()); 
            pushFollow(FOLLOW_1);
            ruleBoolean_Constant();

            state._fsp--;

             after(grammarAccess.getBoolean_ConstantRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBoolean_Constant"


    // $ANTLR start "ruleBoolean_Constant"
    // InternalTQL.g:787:1: ruleBoolean_Constant : ( ( rule__Boolean_Constant__ValueAssignment ) ) ;
    public final void ruleBoolean_Constant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:791:2: ( ( ( rule__Boolean_Constant__ValueAssignment ) ) )
            // InternalTQL.g:792:2: ( ( rule__Boolean_Constant__ValueAssignment ) )
            {
            // InternalTQL.g:792:2: ( ( rule__Boolean_Constant__ValueAssignment ) )
            // InternalTQL.g:793:3: ( rule__Boolean_Constant__ValueAssignment )
            {
             before(grammarAccess.getBoolean_ConstantAccess().getValueAssignment()); 
            // InternalTQL.g:794:3: ( rule__Boolean_Constant__ValueAssignment )
            // InternalTQL.g:794:4: rule__Boolean_Constant__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Boolean_Constant__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBoolean_ConstantAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoolean_Constant"


    // $ANTLR start "entryRuleFloat_Constant"
    // InternalTQL.g:803:1: entryRuleFloat_Constant : ruleFloat_Constant EOF ;
    public final void entryRuleFloat_Constant() throws RecognitionException {
        try {
            // InternalTQL.g:804:1: ( ruleFloat_Constant EOF )
            // InternalTQL.g:805:1: ruleFloat_Constant EOF
            {
             before(grammarAccess.getFloat_ConstantRule()); 
            pushFollow(FOLLOW_1);
            ruleFloat_Constant();

            state._fsp--;

             after(grammarAccess.getFloat_ConstantRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFloat_Constant"


    // $ANTLR start "ruleFloat_Constant"
    // InternalTQL.g:812:1: ruleFloat_Constant : ( ( rule__Float_Constant__ValueAssignment ) ) ;
    public final void ruleFloat_Constant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:816:2: ( ( ( rule__Float_Constant__ValueAssignment ) ) )
            // InternalTQL.g:817:2: ( ( rule__Float_Constant__ValueAssignment ) )
            {
            // InternalTQL.g:817:2: ( ( rule__Float_Constant__ValueAssignment ) )
            // InternalTQL.g:818:3: ( rule__Float_Constant__ValueAssignment )
            {
             before(grammarAccess.getFloat_ConstantAccess().getValueAssignment()); 
            // InternalTQL.g:819:3: ( rule__Float_Constant__ValueAssignment )
            // InternalTQL.g:819:4: rule__Float_Constant__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Float_Constant__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getFloat_ConstantAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFloat_Constant"


    // $ANTLR start "entryRuleInteger_Constant"
    // InternalTQL.g:828:1: entryRuleInteger_Constant : ruleInteger_Constant EOF ;
    public final void entryRuleInteger_Constant() throws RecognitionException {
        try {
            // InternalTQL.g:829:1: ( ruleInteger_Constant EOF )
            // InternalTQL.g:830:1: ruleInteger_Constant EOF
            {
             before(grammarAccess.getInteger_ConstantRule()); 
            pushFollow(FOLLOW_1);
            ruleInteger_Constant();

            state._fsp--;

             after(grammarAccess.getInteger_ConstantRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInteger_Constant"


    // $ANTLR start "ruleInteger_Constant"
    // InternalTQL.g:837:1: ruleInteger_Constant : ( ( rule__Integer_Constant__ValueAssignment ) ) ;
    public final void ruleInteger_Constant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:841:2: ( ( ( rule__Integer_Constant__ValueAssignment ) ) )
            // InternalTQL.g:842:2: ( ( rule__Integer_Constant__ValueAssignment ) )
            {
            // InternalTQL.g:842:2: ( ( rule__Integer_Constant__ValueAssignment ) )
            // InternalTQL.g:843:3: ( rule__Integer_Constant__ValueAssignment )
            {
             before(grammarAccess.getInteger_ConstantAccess().getValueAssignment()); 
            // InternalTQL.g:844:3: ( rule__Integer_Constant__ValueAssignment )
            // InternalTQL.g:844:4: rule__Integer_Constant__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Integer_Constant__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getInteger_ConstantAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInteger_Constant"


    // $ANTLR start "entryRuleString_Constant"
    // InternalTQL.g:853:1: entryRuleString_Constant : ruleString_Constant EOF ;
    public final void entryRuleString_Constant() throws RecognitionException {
        try {
            // InternalTQL.g:854:1: ( ruleString_Constant EOF )
            // InternalTQL.g:855:1: ruleString_Constant EOF
            {
             before(grammarAccess.getString_ConstantRule()); 
            pushFollow(FOLLOW_1);
            ruleString_Constant();

            state._fsp--;

             after(grammarAccess.getString_ConstantRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleString_Constant"


    // $ANTLR start "ruleString_Constant"
    // InternalTQL.g:862:1: ruleString_Constant : ( ( rule__String_Constant__Group__0 ) ) ;
    public final void ruleString_Constant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:866:2: ( ( ( rule__String_Constant__Group__0 ) ) )
            // InternalTQL.g:867:2: ( ( rule__String_Constant__Group__0 ) )
            {
            // InternalTQL.g:867:2: ( ( rule__String_Constant__Group__0 ) )
            // InternalTQL.g:868:3: ( rule__String_Constant__Group__0 )
            {
             before(grammarAccess.getString_ConstantAccess().getGroup()); 
            // InternalTQL.g:869:3: ( rule__String_Constant__Group__0 )
            // InternalTQL.g:869:4: rule__String_Constant__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__String_Constant__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getString_ConstantAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleString_Constant"


    // $ANTLR start "entryRuleNull_Constant"
    // InternalTQL.g:878:1: entryRuleNull_Constant : ruleNull_Constant EOF ;
    public final void entryRuleNull_Constant() throws RecognitionException {
        try {
            // InternalTQL.g:879:1: ( ruleNull_Constant EOF )
            // InternalTQL.g:880:1: ruleNull_Constant EOF
            {
             before(grammarAccess.getNull_ConstantRule()); 
            pushFollow(FOLLOW_1);
            ruleNull_Constant();

            state._fsp--;

             after(grammarAccess.getNull_ConstantRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNull_Constant"


    // $ANTLR start "ruleNull_Constant"
    // InternalTQL.g:887:1: ruleNull_Constant : ( ( rule__Null_Constant__Group__0 ) ) ;
    public final void ruleNull_Constant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:891:2: ( ( ( rule__Null_Constant__Group__0 ) ) )
            // InternalTQL.g:892:2: ( ( rule__Null_Constant__Group__0 ) )
            {
            // InternalTQL.g:892:2: ( ( rule__Null_Constant__Group__0 ) )
            // InternalTQL.g:893:3: ( rule__Null_Constant__Group__0 )
            {
             before(grammarAccess.getNull_ConstantAccess().getGroup()); 
            // InternalTQL.g:894:3: ( rule__Null_Constant__Group__0 )
            // InternalTQL.g:894:4: rule__Null_Constant__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Null_Constant__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNull_ConstantAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNull_Constant"


    // $ANTLR start "entryRuleSet_Constant"
    // InternalTQL.g:903:1: entryRuleSet_Constant : ruleSet_Constant EOF ;
    public final void entryRuleSet_Constant() throws RecognitionException {
        try {
            // InternalTQL.g:904:1: ( ruleSet_Constant EOF )
            // InternalTQL.g:905:1: ruleSet_Constant EOF
            {
             before(grammarAccess.getSet_ConstantRule()); 
            pushFollow(FOLLOW_1);
            ruleSet_Constant();

            state._fsp--;

             after(grammarAccess.getSet_ConstantRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSet_Constant"


    // $ANTLR start "ruleSet_Constant"
    // InternalTQL.g:912:1: ruleSet_Constant : ( ( rule__Set_Constant__Group__0 ) ) ;
    public final void ruleSet_Constant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:916:2: ( ( ( rule__Set_Constant__Group__0 ) ) )
            // InternalTQL.g:917:2: ( ( rule__Set_Constant__Group__0 ) )
            {
            // InternalTQL.g:917:2: ( ( rule__Set_Constant__Group__0 ) )
            // InternalTQL.g:918:3: ( rule__Set_Constant__Group__0 )
            {
             before(grammarAccess.getSet_ConstantAccess().getGroup()); 
            // InternalTQL.g:919:3: ( rule__Set_Constant__Group__0 )
            // InternalTQL.g:919:4: rule__Set_Constant__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Set_Constant__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSet_ConstantAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSet_Constant"


    // $ANTLR start "entryRuleEBoolean"
    // InternalTQL.g:928:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalTQL.g:929:1: ( ruleEBoolean EOF )
            // InternalTQL.g:930:1: ruleEBoolean EOF
            {
             before(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getEBooleanRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalTQL.g:937:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:941:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalTQL.g:942:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalTQL.g:942:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalTQL.g:943:3: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // InternalTQL.g:944:3: ( rule__EBoolean__Alternatives )
            // InternalTQL.g:944:4: rule__EBoolean__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EBoolean__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEBooleanAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleEString"
    // InternalTQL.g:953:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalTQL.g:954:1: ( ruleEString EOF )
            // InternalTQL.g:955:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalTQL.g:962:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:966:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalTQL.g:967:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalTQL.g:967:2: ( ( rule__EString__Alternatives ) )
            // InternalTQL.g:968:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalTQL.g:969:3: ( rule__EString__Alternatives )
            // InternalTQL.g:969:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // InternalTQL.g:978:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalTQL.g:979:1: ( ruleEInt EOF )
            // InternalTQL.g:980:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalTQL.g:987:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:991:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalTQL.g:992:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalTQL.g:992:2: ( ( rule__EInt__Group__0 ) )
            // InternalTQL.g:993:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalTQL.g:994:3: ( rule__EInt__Group__0 )
            // InternalTQL.g:994:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEFloat"
    // InternalTQL.g:1003:1: entryRuleEFloat : ruleEFloat EOF ;
    public final void entryRuleEFloat() throws RecognitionException {
        try {
            // InternalTQL.g:1004:1: ( ruleEFloat EOF )
            // InternalTQL.g:1005:1: ruleEFloat EOF
            {
             before(grammarAccess.getEFloatRule()); 
            pushFollow(FOLLOW_1);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getEFloatRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEFloat"


    // $ANTLR start "ruleEFloat"
    // InternalTQL.g:1012:1: ruleEFloat : ( ( rule__EFloat__Group__0 ) ) ;
    public final void ruleEFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1016:2: ( ( ( rule__EFloat__Group__0 ) ) )
            // InternalTQL.g:1017:2: ( ( rule__EFloat__Group__0 ) )
            {
            // InternalTQL.g:1017:2: ( ( rule__EFloat__Group__0 ) )
            // InternalTQL.g:1018:3: ( rule__EFloat__Group__0 )
            {
             before(grammarAccess.getEFloatAccess().getGroup()); 
            // InternalTQL.g:1019:3: ( rule__EFloat__Group__0 )
            // InternalTQL.g:1019:4: rule__EFloat__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEFloatAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEFloat"


    // $ANTLR start "ruleType"
    // InternalTQL.g:1028:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1032:1: ( ( ( rule__Type__Alternatives ) ) )
            // InternalTQL.g:1033:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalTQL.g:1033:2: ( ( rule__Type__Alternatives ) )
            // InternalTQL.g:1034:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalTQL.g:1035:3: ( rule__Type__Alternatives )
            // InternalTQL.g:1035:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "ruleAndOperator"
    // InternalTQL.g:1044:1: ruleAndOperator : ( ( '&&' ) ) ;
    public final void ruleAndOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1048:1: ( ( ( '&&' ) ) )
            // InternalTQL.g:1049:2: ( ( '&&' ) )
            {
            // InternalTQL.g:1049:2: ( ( '&&' ) )
            // InternalTQL.g:1050:3: ( '&&' )
            {
             before(grammarAccess.getAndOperatorAccess().getAndEnumLiteralDeclaration()); 
            // InternalTQL.g:1051:3: ( '&&' )
            // InternalTQL.g:1051:4: '&&'
            {
            match(input,11,FOLLOW_2); 

            }

             after(grammarAccess.getAndOperatorAccess().getAndEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAndOperator"


    // $ANTLR start "ruleOrOperator"
    // InternalTQL.g:1060:1: ruleOrOperator : ( ( '||' ) ) ;
    public final void ruleOrOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1064:1: ( ( ( '||' ) ) )
            // InternalTQL.g:1065:2: ( ( '||' ) )
            {
            // InternalTQL.g:1065:2: ( ( '||' ) )
            // InternalTQL.g:1066:3: ( '||' )
            {
             before(grammarAccess.getOrOperatorAccess().getOrEnumLiteralDeclaration()); 
            // InternalTQL.g:1067:3: ( '||' )
            // InternalTQL.g:1067:4: '||'
            {
            match(input,12,FOLLOW_2); 

            }

             after(grammarAccess.getOrOperatorAccess().getOrEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrOperator"


    // $ANTLR start "ruleEqualsOperator"
    // InternalTQL.g:1076:1: ruleEqualsOperator : ( ( '==' ) ) ;
    public final void ruleEqualsOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1080:1: ( ( ( '==' ) ) )
            // InternalTQL.g:1081:2: ( ( '==' ) )
            {
            // InternalTQL.g:1081:2: ( ( '==' ) )
            // InternalTQL.g:1082:3: ( '==' )
            {
             before(grammarAccess.getEqualsOperatorAccess().getEqualsEnumLiteralDeclaration()); 
            // InternalTQL.g:1083:3: ( '==' )
            // InternalTQL.g:1083:4: '=='
            {
            match(input,13,FOLLOW_2); 

            }

             after(grammarAccess.getEqualsOperatorAccess().getEqualsEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEqualsOperator"


    // $ANTLR start "ruleNotEqualsOperator"
    // InternalTQL.g:1092:1: ruleNotEqualsOperator : ( ( '!=' ) ) ;
    public final void ruleNotEqualsOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1096:1: ( ( ( '!=' ) ) )
            // InternalTQL.g:1097:2: ( ( '!=' ) )
            {
            // InternalTQL.g:1097:2: ( ( '!=' ) )
            // InternalTQL.g:1098:3: ( '!=' )
            {
             before(grammarAccess.getNotEqualsOperatorAccess().getNotEqualsEnumLiteralDeclaration()); 
            // InternalTQL.g:1099:3: ( '!=' )
            // InternalTQL.g:1099:4: '!='
            {
            match(input,14,FOLLOW_2); 

            }

             after(grammarAccess.getNotEqualsOperatorAccess().getNotEqualsEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNotEqualsOperator"


    // $ANTLR start "ruleLessOperator"
    // InternalTQL.g:1108:1: ruleLessOperator : ( ( '<' ) ) ;
    public final void ruleLessOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1112:1: ( ( ( '<' ) ) )
            // InternalTQL.g:1113:2: ( ( '<' ) )
            {
            // InternalTQL.g:1113:2: ( ( '<' ) )
            // InternalTQL.g:1114:3: ( '<' )
            {
             before(grammarAccess.getLessOperatorAccess().getLessEnumLiteralDeclaration()); 
            // InternalTQL.g:1115:3: ( '<' )
            // InternalTQL.g:1115:4: '<'
            {
            match(input,15,FOLLOW_2); 

            }

             after(grammarAccess.getLessOperatorAccess().getLessEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLessOperator"


    // $ANTLR start "ruleGreaterOperator"
    // InternalTQL.g:1124:1: ruleGreaterOperator : ( ( '>' ) ) ;
    public final void ruleGreaterOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1128:1: ( ( ( '>' ) ) )
            // InternalTQL.g:1129:2: ( ( '>' ) )
            {
            // InternalTQL.g:1129:2: ( ( '>' ) )
            // InternalTQL.g:1130:3: ( '>' )
            {
             before(grammarAccess.getGreaterOperatorAccess().getGreaterEnumLiteralDeclaration()); 
            // InternalTQL.g:1131:3: ( '>' )
            // InternalTQL.g:1131:4: '>'
            {
            match(input,16,FOLLOW_2); 

            }

             after(grammarAccess.getGreaterOperatorAccess().getGreaterEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGreaterOperator"


    // $ANTLR start "ruleMultiplyOperator"
    // InternalTQL.g:1140:1: ruleMultiplyOperator : ( ( '*' ) ) ;
    public final void ruleMultiplyOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1144:1: ( ( ( '*' ) ) )
            // InternalTQL.g:1145:2: ( ( '*' ) )
            {
            // InternalTQL.g:1145:2: ( ( '*' ) )
            // InternalTQL.g:1146:3: ( '*' )
            {
             before(grammarAccess.getMultiplyOperatorAccess().getMultiplyEnumLiteralDeclaration()); 
            // InternalTQL.g:1147:3: ( '*' )
            // InternalTQL.g:1147:4: '*'
            {
            match(input,17,FOLLOW_2); 

            }

             after(grammarAccess.getMultiplyOperatorAccess().getMultiplyEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplyOperator"


    // $ANTLR start "ruleDivideOperator"
    // InternalTQL.g:1156:1: ruleDivideOperator : ( ( '/' ) ) ;
    public final void ruleDivideOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1160:1: ( ( ( '/' ) ) )
            // InternalTQL.g:1161:2: ( ( '/' ) )
            {
            // InternalTQL.g:1161:2: ( ( '/' ) )
            // InternalTQL.g:1162:3: ( '/' )
            {
             before(grammarAccess.getDivideOperatorAccess().getDivideEnumLiteralDeclaration()); 
            // InternalTQL.g:1163:3: ( '/' )
            // InternalTQL.g:1163:4: '/'
            {
            match(input,18,FOLLOW_2); 

            }

             after(grammarAccess.getDivideOperatorAccess().getDivideEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDivideOperator"


    // $ANTLR start "ruleAddOperator"
    // InternalTQL.g:1172:1: ruleAddOperator : ( ( '+' ) ) ;
    public final void ruleAddOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1176:1: ( ( ( '+' ) ) )
            // InternalTQL.g:1177:2: ( ( '+' ) )
            {
            // InternalTQL.g:1177:2: ( ( '+' ) )
            // InternalTQL.g:1178:3: ( '+' )
            {
             before(grammarAccess.getAddOperatorAccess().getAddEnumLiteralDeclaration()); 
            // InternalTQL.g:1179:3: ( '+' )
            // InternalTQL.g:1179:4: '+'
            {
            match(input,19,FOLLOW_2); 

            }

             after(grammarAccess.getAddOperatorAccess().getAddEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddOperator"


    // $ANTLR start "ruleSubtractOperator"
    // InternalTQL.g:1188:1: ruleSubtractOperator : ( ( '-' ) ) ;
    public final void ruleSubtractOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1192:1: ( ( ( '-' ) ) )
            // InternalTQL.g:1193:2: ( ( '-' ) )
            {
            // InternalTQL.g:1193:2: ( ( '-' ) )
            // InternalTQL.g:1194:3: ( '-' )
            {
             before(grammarAccess.getSubtractOperatorAccess().getSubtractEnumLiteralDeclaration()); 
            // InternalTQL.g:1195:3: ( '-' )
            // InternalTQL.g:1195:4: '-'
            {
            match(input,20,FOLLOW_2); 

            }

             after(grammarAccess.getSubtractOperatorAccess().getSubtractEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubtractOperator"


    // $ANTLR start "rule__Block__Alternatives"
    // InternalTQL.g:1203:1: rule__Block__Alternatives : ( ( ruleTable_Impl ) | ( ruleMapping ) | ( ruleTransformation ) );
    public final void rule__Block__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1207:1: ( ( ruleTable_Impl ) | ( ruleMapping ) | ( ruleTransformation ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 31:
            case 32:
                {
                alt2=1;
                }
                break;
            case 37:
                {
                alt2=2;
                }
                break;
            case 42:
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
                    // InternalTQL.g:1208:2: ( ruleTable_Impl )
                    {
                    // InternalTQL.g:1208:2: ( ruleTable_Impl )
                    // InternalTQL.g:1209:3: ruleTable_Impl
                    {
                     before(grammarAccess.getBlockAccess().getTable_ImplParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTable_Impl();

                    state._fsp--;

                     after(grammarAccess.getBlockAccess().getTable_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTQL.g:1214:2: ( ruleMapping )
                    {
                    // InternalTQL.g:1214:2: ( ruleMapping )
                    // InternalTQL.g:1215:3: ruleMapping
                    {
                     before(grammarAccess.getBlockAccess().getMappingParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMapping();

                    state._fsp--;

                     after(grammarAccess.getBlockAccess().getMappingParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTQL.g:1220:2: ( ruleTransformation )
                    {
                    // InternalTQL.g:1220:2: ( ruleTransformation )
                    // InternalTQL.g:1221:3: ruleTransformation
                    {
                     before(grammarAccess.getBlockAccess().getTransformationParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleTransformation();

                    state._fsp--;

                     after(grammarAccess.getBlockAccess().getTransformationParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Alternatives"


    // $ANTLR start "rule__Table_Impl__Alternatives"
    // InternalTQL.g:1230:1: rule__Table_Impl__Alternatives : ( ( ( rule__Table_Impl__Group_0__0 ) ) | ( ( rule__Table_Impl__Group_1__0 ) ) );
    public final void rule__Table_Impl__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1234:1: ( ( ( rule__Table_Impl__Group_0__0 ) ) | ( ( rule__Table_Impl__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==31) ) {
                alt3=1;
            }
            else if ( (LA3_0==32) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalTQL.g:1235:2: ( ( rule__Table_Impl__Group_0__0 ) )
                    {
                    // InternalTQL.g:1235:2: ( ( rule__Table_Impl__Group_0__0 ) )
                    // InternalTQL.g:1236:3: ( rule__Table_Impl__Group_0__0 )
                    {
                     before(grammarAccess.getTable_ImplAccess().getGroup_0()); 
                    // InternalTQL.g:1237:3: ( rule__Table_Impl__Group_0__0 )
                    // InternalTQL.g:1237:4: rule__Table_Impl__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Table_Impl__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTable_ImplAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTQL.g:1241:2: ( ( rule__Table_Impl__Group_1__0 ) )
                    {
                    // InternalTQL.g:1241:2: ( ( rule__Table_Impl__Group_1__0 ) )
                    // InternalTQL.g:1242:3: ( rule__Table_Impl__Group_1__0 )
                    {
                     before(grammarAccess.getTable_ImplAccess().getGroup_1()); 
                    // InternalTQL.g:1243:3: ( rule__Table_Impl__Group_1__0 )
                    // InternalTQL.g:1243:4: rule__Table_Impl__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Table_Impl__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTable_ImplAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table_Impl__Alternatives"


    // $ANTLR start "rule__Call_Parameter__Alternatives"
    // InternalTQL.g:1251:1: rule__Call_Parameter__Alternatives : ( ( ruleConstant_Call_Parameter ) | ( ruleReference_Call_Parameter ) );
    public final void rule__Call_Parameter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1255:1: ( ( ruleConstant_Call_Parameter ) | ( ruleReference_Call_Parameter ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT||(LA4_0>=20 && LA4_0<=22)||LA4_0==29||(LA4_0>=44 && LA4_0<=45)||LA4_0==47) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=RULE_STRING && LA4_0<=RULE_ID)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalTQL.g:1256:2: ( ruleConstant_Call_Parameter )
                    {
                    // InternalTQL.g:1256:2: ( ruleConstant_Call_Parameter )
                    // InternalTQL.g:1257:3: ruleConstant_Call_Parameter
                    {
                     before(grammarAccess.getCall_ParameterAccess().getConstant_Call_ParameterParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleConstant_Call_Parameter();

                    state._fsp--;

                     after(grammarAccess.getCall_ParameterAccess().getConstant_Call_ParameterParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTQL.g:1262:2: ( ruleReference_Call_Parameter )
                    {
                    // InternalTQL.g:1262:2: ( ruleReference_Call_Parameter )
                    // InternalTQL.g:1263:3: ruleReference_Call_Parameter
                    {
                     before(grammarAccess.getCall_ParameterAccess().getReference_Call_ParameterParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleReference_Call_Parameter();

                    state._fsp--;

                     after(grammarAccess.getCall_ParameterAccess().getReference_Call_ParameterParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call_Parameter__Alternatives"


    // $ANTLR start "rule__Literals__Alternatives"
    // InternalTQL.g:1272:1: rule__Literals__Alternatives : ( ( ruleConstant ) | ( ruleParameter_Expression ) );
    public final void rule__Literals__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1276:1: ( ( ruleConstant ) | ( ruleParameter_Expression ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT||(LA5_0>=20 && LA5_0<=22)||LA5_0==29||(LA5_0>=44 && LA5_0<=45)||LA5_0==47) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_ID)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalTQL.g:1277:2: ( ruleConstant )
                    {
                    // InternalTQL.g:1277:2: ( ruleConstant )
                    // InternalTQL.g:1278:3: ruleConstant
                    {
                     before(grammarAccess.getLiteralsAccess().getConstantParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleConstant();

                    state._fsp--;

                     after(grammarAccess.getLiteralsAccess().getConstantParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTQL.g:1283:2: ( ruleParameter_Expression )
                    {
                    // InternalTQL.g:1283:2: ( ruleParameter_Expression )
                    // InternalTQL.g:1284:3: ruleParameter_Expression
                    {
                     before(grammarAccess.getLiteralsAccess().getParameter_ExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleParameter_Expression();

                    state._fsp--;

                     after(grammarAccess.getLiteralsAccess().getParameter_ExpressionParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literals__Alternatives"


    // $ANTLR start "rule__Constant__Alternatives"
    // InternalTQL.g:1293:1: rule__Constant__Alternatives : ( ( ruleSingle_Constant ) | ( ruleSet_Constant ) );
    public final void rule__Constant__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1297:1: ( ( ruleSingle_Constant ) | ( ruleSet_Constant ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT||(LA6_0>=20 && LA6_0<=22)||LA6_0==29||LA6_0==44||LA6_0==47) ) {
                alt6=1;
            }
            else if ( (LA6_0==45) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalTQL.g:1298:2: ( ruleSingle_Constant )
                    {
                    // InternalTQL.g:1298:2: ( ruleSingle_Constant )
                    // InternalTQL.g:1299:3: ruleSingle_Constant
                    {
                     before(grammarAccess.getConstantAccess().getSingle_ConstantParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSingle_Constant();

                    state._fsp--;

                     after(grammarAccess.getConstantAccess().getSingle_ConstantParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTQL.g:1304:2: ( ruleSet_Constant )
                    {
                    // InternalTQL.g:1304:2: ( ruleSet_Constant )
                    // InternalTQL.g:1305:3: ruleSet_Constant
                    {
                     before(grammarAccess.getConstantAccess().getSet_ConstantParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSet_Constant();

                    state._fsp--;

                     after(grammarAccess.getConstantAccess().getSet_ConstantParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Alternatives"


    // $ANTLR start "rule__Single_Constant__Alternatives"
    // InternalTQL.g:1314:1: rule__Single_Constant__Alternatives : ( ( ruleBoolean_Constant ) | ( ruleFloat_Constant ) | ( ruleInteger_Constant ) | ( ruleString_Constant ) | ( ruleNull_Constant ) );
    public final void rule__Single_Constant__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1318:1: ( ( ruleBoolean_Constant ) | ( ruleFloat_Constant ) | ( ruleInteger_Constant ) | ( ruleString_Constant ) | ( ruleNull_Constant ) )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 21:
            case 22:
                {
                alt7=1;
                }
                break;
            case 20:
                {
                int LA7_2 = input.LA(2);

                if ( (LA7_2==RULE_INT) ) {
                    int LA7_3 = input.LA(3);

                    if ( (LA7_3==EOF||(LA7_3>=11 && LA7_3<=20)||(LA7_3>=35 && LA7_3<=36)||LA7_3==41||LA7_3==46) ) {
                        alt7=3;
                    }
                    else if ( (LA7_3==47) ) {
                        alt7=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA7_2==47) ) {
                    alt7=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA7_3 = input.LA(2);

                if ( (LA7_3==EOF||(LA7_3>=11 && LA7_3<=20)||(LA7_3>=35 && LA7_3<=36)||LA7_3==41||LA7_3==46) ) {
                    alt7=3;
                }
                else if ( (LA7_3==47) ) {
                    alt7=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 3, input);

                    throw nvae;
                }
                }
                break;
            case 47:
                {
                alt7=2;
                }
                break;
            case 44:
                {
                alt7=4;
                }
                break;
            case 29:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalTQL.g:1319:2: ( ruleBoolean_Constant )
                    {
                    // InternalTQL.g:1319:2: ( ruleBoolean_Constant )
                    // InternalTQL.g:1320:3: ruleBoolean_Constant
                    {
                     before(grammarAccess.getSingle_ConstantAccess().getBoolean_ConstantParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBoolean_Constant();

                    state._fsp--;

                     after(grammarAccess.getSingle_ConstantAccess().getBoolean_ConstantParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTQL.g:1325:2: ( ruleFloat_Constant )
                    {
                    // InternalTQL.g:1325:2: ( ruleFloat_Constant )
                    // InternalTQL.g:1326:3: ruleFloat_Constant
                    {
                     before(grammarAccess.getSingle_ConstantAccess().getFloat_ConstantParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFloat_Constant();

                    state._fsp--;

                     after(grammarAccess.getSingle_ConstantAccess().getFloat_ConstantParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTQL.g:1331:2: ( ruleInteger_Constant )
                    {
                    // InternalTQL.g:1331:2: ( ruleInteger_Constant )
                    // InternalTQL.g:1332:3: ruleInteger_Constant
                    {
                     before(grammarAccess.getSingle_ConstantAccess().getInteger_ConstantParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleInteger_Constant();

                    state._fsp--;

                     after(grammarAccess.getSingle_ConstantAccess().getInteger_ConstantParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTQL.g:1337:2: ( ruleString_Constant )
                    {
                    // InternalTQL.g:1337:2: ( ruleString_Constant )
                    // InternalTQL.g:1338:3: ruleString_Constant
                    {
                     before(grammarAccess.getSingle_ConstantAccess().getString_ConstantParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleString_Constant();

                    state._fsp--;

                     after(grammarAccess.getSingle_ConstantAccess().getString_ConstantParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalTQL.g:1343:2: ( ruleNull_Constant )
                    {
                    // InternalTQL.g:1343:2: ( ruleNull_Constant )
                    // InternalTQL.g:1344:3: ruleNull_Constant
                    {
                     before(grammarAccess.getSingle_ConstantAccess().getNull_ConstantParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleNull_Constant();

                    state._fsp--;

                     after(grammarAccess.getSingle_ConstantAccess().getNull_ConstantParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Single_Constant__Alternatives"


    // $ANTLR start "rule__EBoolean__Alternatives"
    // InternalTQL.g:1353:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1357:1: ( ( 'true' ) | ( 'false' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            else if ( (LA8_0==22) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalTQL.g:1358:2: ( 'true' )
                    {
                    // InternalTQL.g:1358:2: ( 'true' )
                    // InternalTQL.g:1359:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTQL.g:1364:2: ( 'false' )
                    {
                    // InternalTQL.g:1364:2: ( 'false' )
                    // InternalTQL.g:1365:3: 'false'
                    {
                     before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBoolean__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalTQL.g:1374:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1378:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalTQL.g:1379:2: ( RULE_STRING )
                    {
                    // InternalTQL.g:1379:2: ( RULE_STRING )
                    // InternalTQL.g:1380:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTQL.g:1385:2: ( RULE_ID )
                    {
                    // InternalTQL.g:1385:2: ( RULE_ID )
                    // InternalTQL.g:1386:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__EFloat__Alternatives_4_0"
    // InternalTQL.g:1395:1: rule__EFloat__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EFloat__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1399:1: ( ( 'E' ) | ( 'e' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            else if ( (LA10_0==24) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalTQL.g:1400:2: ( 'E' )
                    {
                    // InternalTQL.g:1400:2: ( 'E' )
                    // InternalTQL.g:1401:3: 'E'
                    {
                     before(grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTQL.g:1406:2: ( 'e' )
                    {
                    // InternalTQL.g:1406:2: ( 'e' )
                    // InternalTQL.g:1407:3: 'e'
                    {
                     before(grammarAccess.getEFloatAccess().getEKeyword_4_0_1()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getEFloatAccess().getEKeyword_4_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Alternatives_4_0"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalTQL.g:1416:1: rule__Type__Alternatives : ( ( ( 'string' ) ) | ( ( 'int' ) ) | ( ( 'float' ) ) | ( ( 'date' ) ) | ( ( 'null' ) ) | ( ( 'bool' ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1420:1: ( ( ( 'string' ) ) | ( ( 'int' ) ) | ( ( 'float' ) ) | ( ( 'date' ) ) | ( ( 'null' ) ) | ( ( 'bool' ) ) )
            int alt11=6;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt11=1;
                }
                break;
            case 26:
                {
                alt11=2;
                }
                break;
            case 27:
                {
                alt11=3;
                }
                break;
            case 28:
                {
                alt11=4;
                }
                break;
            case 29:
                {
                alt11=5;
                }
                break;
            case 30:
                {
                alt11=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalTQL.g:1421:2: ( ( 'string' ) )
                    {
                    // InternalTQL.g:1421:2: ( ( 'string' ) )
                    // InternalTQL.g:1422:3: ( 'string' )
                    {
                     before(grammarAccess.getTypeAccess().getStringEnumLiteralDeclaration_0()); 
                    // InternalTQL.g:1423:3: ( 'string' )
                    // InternalTQL.g:1423:4: 'string'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getStringEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTQL.g:1427:2: ( ( 'int' ) )
                    {
                    // InternalTQL.g:1427:2: ( ( 'int' ) )
                    // InternalTQL.g:1428:3: ( 'int' )
                    {
                     before(grammarAccess.getTypeAccess().getIntegerEnumLiteralDeclaration_1()); 
                    // InternalTQL.g:1429:3: ( 'int' )
                    // InternalTQL.g:1429:4: 'int'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getIntegerEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTQL.g:1433:2: ( ( 'float' ) )
                    {
                    // InternalTQL.g:1433:2: ( ( 'float' ) )
                    // InternalTQL.g:1434:3: ( 'float' )
                    {
                     before(grammarAccess.getTypeAccess().getFloatEnumLiteralDeclaration_2()); 
                    // InternalTQL.g:1435:3: ( 'float' )
                    // InternalTQL.g:1435:4: 'float'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getFloatEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTQL.g:1439:2: ( ( 'date' ) )
                    {
                    // InternalTQL.g:1439:2: ( ( 'date' ) )
                    // InternalTQL.g:1440:3: ( 'date' )
                    {
                     before(grammarAccess.getTypeAccess().getDateEnumLiteralDeclaration_3()); 
                    // InternalTQL.g:1441:3: ( 'date' )
                    // InternalTQL.g:1441:4: 'date'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getDateEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalTQL.g:1445:2: ( ( 'null' ) )
                    {
                    // InternalTQL.g:1445:2: ( ( 'null' ) )
                    // InternalTQL.g:1446:3: ( 'null' )
                    {
                     before(grammarAccess.getTypeAccess().getNullEnumLiteralDeclaration_4()); 
                    // InternalTQL.g:1447:3: ( 'null' )
                    // InternalTQL.g:1447:4: 'null'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getNullEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalTQL.g:1451:2: ( ( 'bool' ) )
                    {
                    // InternalTQL.g:1451:2: ( ( 'bool' ) )
                    // InternalTQL.g:1452:3: ( 'bool' )
                    {
                     before(grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_5()); 
                    // InternalTQL.g:1453:3: ( 'bool' )
                    // InternalTQL.g:1453:4: 'bool'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Table_Impl__Group_0__0"
    // InternalTQL.g:1461:1: rule__Table_Impl__Group_0__0 : rule__Table_Impl__Group_0__0__Impl rule__Table_Impl__Group_0__1 ;
    public final void rule__Table_Impl__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1465:1: ( rule__Table_Impl__Group_0__0__Impl rule__Table_Impl__Group_0__1 )
            // InternalTQL.g:1466:2: rule__Table_Impl__Group_0__0__Impl rule__Table_Impl__Group_0__1
            {
            pushFollow(FOLLOW_4);
            rule__Table_Impl__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table_Impl__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table_Impl__Group_0__0"


    // $ANTLR start "rule__Table_Impl__Group_0__0__Impl"
    // InternalTQL.g:1473:1: rule__Table_Impl__Group_0__0__Impl : ( 'source' ) ;
    public final void rule__Table_Impl__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1477:1: ( ( 'source' ) )
            // InternalTQL.g:1478:1: ( 'source' )
            {
            // InternalTQL.g:1478:1: ( 'source' )
            // InternalTQL.g:1479:2: 'source'
            {
             before(grammarAccess.getTable_ImplAccess().getSourceKeyword_0_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getTable_ImplAccess().getSourceKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table_Impl__Group_0__0__Impl"


    // $ANTLR start "rule__Table_Impl__Group_0__1"
    // InternalTQL.g:1488:1: rule__Table_Impl__Group_0__1 : rule__Table_Impl__Group_0__1__Impl ;
    public final void rule__Table_Impl__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1492:1: ( rule__Table_Impl__Group_0__1__Impl )
            // InternalTQL.g:1493:2: rule__Table_Impl__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Table_Impl__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table_Impl__Group_0__1"


    // $ANTLR start "rule__Table_Impl__Group_0__1__Impl"
    // InternalTQL.g:1499:1: rule__Table_Impl__Group_0__1__Impl : ( ruleSource_Table ) ;
    public final void rule__Table_Impl__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1503:1: ( ( ruleSource_Table ) )
            // InternalTQL.g:1504:1: ( ruleSource_Table )
            {
            // InternalTQL.g:1504:1: ( ruleSource_Table )
            // InternalTQL.g:1505:2: ruleSource_Table
            {
             before(grammarAccess.getTable_ImplAccess().getSource_TableParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleSource_Table();

            state._fsp--;

             after(grammarAccess.getTable_ImplAccess().getSource_TableParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table_Impl__Group_0__1__Impl"


    // $ANTLR start "rule__Table_Impl__Group_1__0"
    // InternalTQL.g:1515:1: rule__Table_Impl__Group_1__0 : rule__Table_Impl__Group_1__0__Impl rule__Table_Impl__Group_1__1 ;
    public final void rule__Table_Impl__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1519:1: ( rule__Table_Impl__Group_1__0__Impl rule__Table_Impl__Group_1__1 )
            // InternalTQL.g:1520:2: rule__Table_Impl__Group_1__0__Impl rule__Table_Impl__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Table_Impl__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table_Impl__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table_Impl__Group_1__0"


    // $ANTLR start "rule__Table_Impl__Group_1__0__Impl"
    // InternalTQL.g:1527:1: rule__Table_Impl__Group_1__0__Impl : ( 'target' ) ;
    public final void rule__Table_Impl__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1531:1: ( ( 'target' ) )
            // InternalTQL.g:1532:1: ( 'target' )
            {
            // InternalTQL.g:1532:1: ( 'target' )
            // InternalTQL.g:1533:2: 'target'
            {
             before(grammarAccess.getTable_ImplAccess().getTargetKeyword_1_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getTable_ImplAccess().getTargetKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table_Impl__Group_1__0__Impl"


    // $ANTLR start "rule__Table_Impl__Group_1__1"
    // InternalTQL.g:1542:1: rule__Table_Impl__Group_1__1 : rule__Table_Impl__Group_1__1__Impl ;
    public final void rule__Table_Impl__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1546:1: ( rule__Table_Impl__Group_1__1__Impl )
            // InternalTQL.g:1547:2: rule__Table_Impl__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Table_Impl__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table_Impl__Group_1__1"


    // $ANTLR start "rule__Table_Impl__Group_1__1__Impl"
    // InternalTQL.g:1553:1: rule__Table_Impl__Group_1__1__Impl : ( ruleTarget_Table ) ;
    public final void rule__Table_Impl__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1557:1: ( ( ruleTarget_Table ) )
            // InternalTQL.g:1558:1: ( ruleTarget_Table )
            {
            // InternalTQL.g:1558:1: ( ruleTarget_Table )
            // InternalTQL.g:1559:2: ruleTarget_Table
            {
             before(grammarAccess.getTable_ImplAccess().getTarget_TableParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleTarget_Table();

            state._fsp--;

             after(grammarAccess.getTable_ImplAccess().getTarget_TableParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table_Impl__Group_1__1__Impl"


    // $ANTLR start "rule__Column__Group__0"
    // InternalTQL.g:1569:1: rule__Column__Group__0 : rule__Column__Group__0__Impl rule__Column__Group__1 ;
    public final void rule__Column__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1573:1: ( rule__Column__Group__0__Impl rule__Column__Group__1 )
            // InternalTQL.g:1574:2: rule__Column__Group__0__Impl rule__Column__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Column__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__0"


    // $ANTLR start "rule__Column__Group__0__Impl"
    // InternalTQL.g:1581:1: rule__Column__Group__0__Impl : ( ( rule__Column__NameAssignment_0 ) ) ;
    public final void rule__Column__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1585:1: ( ( ( rule__Column__NameAssignment_0 ) ) )
            // InternalTQL.g:1586:1: ( ( rule__Column__NameAssignment_0 ) )
            {
            // InternalTQL.g:1586:1: ( ( rule__Column__NameAssignment_0 ) )
            // InternalTQL.g:1587:2: ( rule__Column__NameAssignment_0 )
            {
             before(grammarAccess.getColumnAccess().getNameAssignment_0()); 
            // InternalTQL.g:1588:2: ( rule__Column__NameAssignment_0 )
            // InternalTQL.g:1588:3: rule__Column__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Column__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__0__Impl"


    // $ANTLR start "rule__Column__Group__1"
    // InternalTQL.g:1596:1: rule__Column__Group__1 : rule__Column__Group__1__Impl rule__Column__Group__2 ;
    public final void rule__Column__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1600:1: ( rule__Column__Group__1__Impl rule__Column__Group__2 )
            // InternalTQL.g:1601:2: rule__Column__Group__1__Impl rule__Column__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Column__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__1"


    // $ANTLR start "rule__Column__Group__1__Impl"
    // InternalTQL.g:1608:1: rule__Column__Group__1__Impl : ( ':' ) ;
    public final void rule__Column__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1612:1: ( ( ':' ) )
            // InternalTQL.g:1613:1: ( ':' )
            {
            // InternalTQL.g:1613:1: ( ':' )
            // InternalTQL.g:1614:2: ':'
            {
             before(grammarAccess.getColumnAccess().getColonKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__1__Impl"


    // $ANTLR start "rule__Column__Group__2"
    // InternalTQL.g:1623:1: rule__Column__Group__2 : rule__Column__Group__2__Impl ;
    public final void rule__Column__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1627:1: ( rule__Column__Group__2__Impl )
            // InternalTQL.g:1628:2: rule__Column__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Column__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__2"


    // $ANTLR start "rule__Column__Group__2__Impl"
    // InternalTQL.g:1634:1: rule__Column__Group__2__Impl : ( ( rule__Column__TypeAssignment_2 ) ) ;
    public final void rule__Column__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1638:1: ( ( ( rule__Column__TypeAssignment_2 ) ) )
            // InternalTQL.g:1639:1: ( ( rule__Column__TypeAssignment_2 ) )
            {
            // InternalTQL.g:1639:1: ( ( rule__Column__TypeAssignment_2 ) )
            // InternalTQL.g:1640:2: ( rule__Column__TypeAssignment_2 )
            {
             before(grammarAccess.getColumnAccess().getTypeAssignment_2()); 
            // InternalTQL.g:1641:2: ( rule__Column__TypeAssignment_2 )
            // InternalTQL.g:1641:3: rule__Column__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Column__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__2__Impl"


    // $ANTLR start "rule__Source_Table__Group__0"
    // InternalTQL.g:1650:1: rule__Source_Table__Group__0 : rule__Source_Table__Group__0__Impl rule__Source_Table__Group__1 ;
    public final void rule__Source_Table__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1654:1: ( rule__Source_Table__Group__0__Impl rule__Source_Table__Group__1 )
            // InternalTQL.g:1655:2: rule__Source_Table__Group__0__Impl rule__Source_Table__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Source_Table__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Source_Table__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source_Table__Group__0"


    // $ANTLR start "rule__Source_Table__Group__0__Impl"
    // InternalTQL.g:1662:1: rule__Source_Table__Group__0__Impl : ( ( rule__Source_Table__NameAssignment_0 ) ) ;
    public final void rule__Source_Table__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1666:1: ( ( ( rule__Source_Table__NameAssignment_0 ) ) )
            // InternalTQL.g:1667:1: ( ( rule__Source_Table__NameAssignment_0 ) )
            {
            // InternalTQL.g:1667:1: ( ( rule__Source_Table__NameAssignment_0 ) )
            // InternalTQL.g:1668:2: ( rule__Source_Table__NameAssignment_0 )
            {
             before(grammarAccess.getSource_TableAccess().getNameAssignment_0()); 
            // InternalTQL.g:1669:2: ( rule__Source_Table__NameAssignment_0 )
            // InternalTQL.g:1669:3: rule__Source_Table__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Source_Table__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSource_TableAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source_Table__Group__0__Impl"


    // $ANTLR start "rule__Source_Table__Group__1"
    // InternalTQL.g:1677:1: rule__Source_Table__Group__1 : rule__Source_Table__Group__1__Impl rule__Source_Table__Group__2 ;
    public final void rule__Source_Table__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1681:1: ( rule__Source_Table__Group__1__Impl rule__Source_Table__Group__2 )
            // InternalTQL.g:1682:2: rule__Source_Table__Group__1__Impl rule__Source_Table__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Source_Table__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Source_Table__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source_Table__Group__1"


    // $ANTLR start "rule__Source_Table__Group__1__Impl"
    // InternalTQL.g:1689:1: rule__Source_Table__Group__1__Impl : ( '{' ) ;
    public final void rule__Source_Table__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1693:1: ( ( '{' ) )
            // InternalTQL.g:1694:1: ( '{' )
            {
            // InternalTQL.g:1694:1: ( '{' )
            // InternalTQL.g:1695:2: '{'
            {
             before(grammarAccess.getSource_TableAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getSource_TableAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source_Table__Group__1__Impl"


    // $ANTLR start "rule__Source_Table__Group__2"
    // InternalTQL.g:1704:1: rule__Source_Table__Group__2 : rule__Source_Table__Group__2__Impl rule__Source_Table__Group__3 ;
    public final void rule__Source_Table__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1708:1: ( rule__Source_Table__Group__2__Impl rule__Source_Table__Group__3 )
            // InternalTQL.g:1709:2: rule__Source_Table__Group__2__Impl rule__Source_Table__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Source_Table__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Source_Table__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source_Table__Group__2"


    // $ANTLR start "rule__Source_Table__Group__2__Impl"
    // InternalTQL.g:1716:1: rule__Source_Table__Group__2__Impl : ( ( rule__Source_Table__ColumnsAssignment_2 ) ) ;
    public final void rule__Source_Table__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1720:1: ( ( ( rule__Source_Table__ColumnsAssignment_2 ) ) )
            // InternalTQL.g:1721:1: ( ( rule__Source_Table__ColumnsAssignment_2 ) )
            {
            // InternalTQL.g:1721:1: ( ( rule__Source_Table__ColumnsAssignment_2 ) )
            // InternalTQL.g:1722:2: ( rule__Source_Table__ColumnsAssignment_2 )
            {
             before(grammarAccess.getSource_TableAccess().getColumnsAssignment_2()); 
            // InternalTQL.g:1723:2: ( rule__Source_Table__ColumnsAssignment_2 )
            // InternalTQL.g:1723:3: rule__Source_Table__ColumnsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Source_Table__ColumnsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSource_TableAccess().getColumnsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source_Table__Group__2__Impl"


    // $ANTLR start "rule__Source_Table__Group__3"
    // InternalTQL.g:1731:1: rule__Source_Table__Group__3 : rule__Source_Table__Group__3__Impl rule__Source_Table__Group__4 ;
    public final void rule__Source_Table__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1735:1: ( rule__Source_Table__Group__3__Impl rule__Source_Table__Group__4 )
            // InternalTQL.g:1736:2: rule__Source_Table__Group__3__Impl rule__Source_Table__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Source_Table__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Source_Table__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source_Table__Group__3"


    // $ANTLR start "rule__Source_Table__Group__3__Impl"
    // InternalTQL.g:1743:1: rule__Source_Table__Group__3__Impl : ( ( rule__Source_Table__Group_3__0 )* ) ;
    public final void rule__Source_Table__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1747:1: ( ( ( rule__Source_Table__Group_3__0 )* ) )
            // InternalTQL.g:1748:1: ( ( rule__Source_Table__Group_3__0 )* )
            {
            // InternalTQL.g:1748:1: ( ( rule__Source_Table__Group_3__0 )* )
            // InternalTQL.g:1749:2: ( rule__Source_Table__Group_3__0 )*
            {
             before(grammarAccess.getSource_TableAccess().getGroup_3()); 
            // InternalTQL.g:1750:2: ( rule__Source_Table__Group_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==36) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalTQL.g:1750:3: rule__Source_Table__Group_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Source_Table__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getSource_TableAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source_Table__Group__3__Impl"


    // $ANTLR start "rule__Source_Table__Group__4"
    // InternalTQL.g:1758:1: rule__Source_Table__Group__4 : rule__Source_Table__Group__4__Impl ;
    public final void rule__Source_Table__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1762:1: ( rule__Source_Table__Group__4__Impl )
            // InternalTQL.g:1763:2: rule__Source_Table__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Source_Table__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source_Table__Group__4"


    // $ANTLR start "rule__Source_Table__Group__4__Impl"
    // InternalTQL.g:1769:1: rule__Source_Table__Group__4__Impl : ( '}' ) ;
    public final void rule__Source_Table__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1773:1: ( ( '}' ) )
            // InternalTQL.g:1774:1: ( '}' )
            {
            // InternalTQL.g:1774:1: ( '}' )
            // InternalTQL.g:1775:2: '}'
            {
             before(grammarAccess.getSource_TableAccess().getRightCurlyBracketKeyword_4()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getSource_TableAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source_Table__Group__4__Impl"


    // $ANTLR start "rule__Source_Table__Group_3__0"
    // InternalTQL.g:1785:1: rule__Source_Table__Group_3__0 : rule__Source_Table__Group_3__0__Impl rule__Source_Table__Group_3__1 ;
    public final void rule__Source_Table__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1789:1: ( rule__Source_Table__Group_3__0__Impl rule__Source_Table__Group_3__1 )
            // InternalTQL.g:1790:2: rule__Source_Table__Group_3__0__Impl rule__Source_Table__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Source_Table__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Source_Table__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source_Table__Group_3__0"


    // $ANTLR start "rule__Source_Table__Group_3__0__Impl"
    // InternalTQL.g:1797:1: rule__Source_Table__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Source_Table__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1801:1: ( ( ',' ) )
            // InternalTQL.g:1802:1: ( ',' )
            {
            // InternalTQL.g:1802:1: ( ',' )
            // InternalTQL.g:1803:2: ','
            {
             before(grammarAccess.getSource_TableAccess().getCommaKeyword_3_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getSource_TableAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source_Table__Group_3__0__Impl"


    // $ANTLR start "rule__Source_Table__Group_3__1"
    // InternalTQL.g:1812:1: rule__Source_Table__Group_3__1 : rule__Source_Table__Group_3__1__Impl ;
    public final void rule__Source_Table__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1816:1: ( rule__Source_Table__Group_3__1__Impl )
            // InternalTQL.g:1817:2: rule__Source_Table__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Source_Table__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source_Table__Group_3__1"


    // $ANTLR start "rule__Source_Table__Group_3__1__Impl"
    // InternalTQL.g:1823:1: rule__Source_Table__Group_3__1__Impl : ( ( rule__Source_Table__ColumnsAssignment_3_1 ) ) ;
    public final void rule__Source_Table__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1827:1: ( ( ( rule__Source_Table__ColumnsAssignment_3_1 ) ) )
            // InternalTQL.g:1828:1: ( ( rule__Source_Table__ColumnsAssignment_3_1 ) )
            {
            // InternalTQL.g:1828:1: ( ( rule__Source_Table__ColumnsAssignment_3_1 ) )
            // InternalTQL.g:1829:2: ( rule__Source_Table__ColumnsAssignment_3_1 )
            {
             before(grammarAccess.getSource_TableAccess().getColumnsAssignment_3_1()); 
            // InternalTQL.g:1830:2: ( rule__Source_Table__ColumnsAssignment_3_1 )
            // InternalTQL.g:1830:3: rule__Source_Table__ColumnsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Source_Table__ColumnsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSource_TableAccess().getColumnsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source_Table__Group_3__1__Impl"


    // $ANTLR start "rule__Target_Table__Group__0"
    // InternalTQL.g:1839:1: rule__Target_Table__Group__0 : rule__Target_Table__Group__0__Impl rule__Target_Table__Group__1 ;
    public final void rule__Target_Table__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1843:1: ( rule__Target_Table__Group__0__Impl rule__Target_Table__Group__1 )
            // InternalTQL.g:1844:2: rule__Target_Table__Group__0__Impl rule__Target_Table__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Target_Table__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Target_Table__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target_Table__Group__0"


    // $ANTLR start "rule__Target_Table__Group__0__Impl"
    // InternalTQL.g:1851:1: rule__Target_Table__Group__0__Impl : ( ( rule__Target_Table__NameAssignment_0 ) ) ;
    public final void rule__Target_Table__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1855:1: ( ( ( rule__Target_Table__NameAssignment_0 ) ) )
            // InternalTQL.g:1856:1: ( ( rule__Target_Table__NameAssignment_0 ) )
            {
            // InternalTQL.g:1856:1: ( ( rule__Target_Table__NameAssignment_0 ) )
            // InternalTQL.g:1857:2: ( rule__Target_Table__NameAssignment_0 )
            {
             before(grammarAccess.getTarget_TableAccess().getNameAssignment_0()); 
            // InternalTQL.g:1858:2: ( rule__Target_Table__NameAssignment_0 )
            // InternalTQL.g:1858:3: rule__Target_Table__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Target_Table__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTarget_TableAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target_Table__Group__0__Impl"


    // $ANTLR start "rule__Target_Table__Group__1"
    // InternalTQL.g:1866:1: rule__Target_Table__Group__1 : rule__Target_Table__Group__1__Impl rule__Target_Table__Group__2 ;
    public final void rule__Target_Table__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1870:1: ( rule__Target_Table__Group__1__Impl rule__Target_Table__Group__2 )
            // InternalTQL.g:1871:2: rule__Target_Table__Group__1__Impl rule__Target_Table__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Target_Table__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Target_Table__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target_Table__Group__1"


    // $ANTLR start "rule__Target_Table__Group__1__Impl"
    // InternalTQL.g:1878:1: rule__Target_Table__Group__1__Impl : ( '{' ) ;
    public final void rule__Target_Table__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1882:1: ( ( '{' ) )
            // InternalTQL.g:1883:1: ( '{' )
            {
            // InternalTQL.g:1883:1: ( '{' )
            // InternalTQL.g:1884:2: '{'
            {
             before(grammarAccess.getTarget_TableAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getTarget_TableAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target_Table__Group__1__Impl"


    // $ANTLR start "rule__Target_Table__Group__2"
    // InternalTQL.g:1893:1: rule__Target_Table__Group__2 : rule__Target_Table__Group__2__Impl rule__Target_Table__Group__3 ;
    public final void rule__Target_Table__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1897:1: ( rule__Target_Table__Group__2__Impl rule__Target_Table__Group__3 )
            // InternalTQL.g:1898:2: rule__Target_Table__Group__2__Impl rule__Target_Table__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Target_Table__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Target_Table__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target_Table__Group__2"


    // $ANTLR start "rule__Target_Table__Group__2__Impl"
    // InternalTQL.g:1905:1: rule__Target_Table__Group__2__Impl : ( ( rule__Target_Table__ColumnsAssignment_2 ) ) ;
    public final void rule__Target_Table__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1909:1: ( ( ( rule__Target_Table__ColumnsAssignment_2 ) ) )
            // InternalTQL.g:1910:1: ( ( rule__Target_Table__ColumnsAssignment_2 ) )
            {
            // InternalTQL.g:1910:1: ( ( rule__Target_Table__ColumnsAssignment_2 ) )
            // InternalTQL.g:1911:2: ( rule__Target_Table__ColumnsAssignment_2 )
            {
             before(grammarAccess.getTarget_TableAccess().getColumnsAssignment_2()); 
            // InternalTQL.g:1912:2: ( rule__Target_Table__ColumnsAssignment_2 )
            // InternalTQL.g:1912:3: rule__Target_Table__ColumnsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Target_Table__ColumnsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTarget_TableAccess().getColumnsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target_Table__Group__2__Impl"


    // $ANTLR start "rule__Target_Table__Group__3"
    // InternalTQL.g:1920:1: rule__Target_Table__Group__3 : rule__Target_Table__Group__3__Impl rule__Target_Table__Group__4 ;
    public final void rule__Target_Table__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1924:1: ( rule__Target_Table__Group__3__Impl rule__Target_Table__Group__4 )
            // InternalTQL.g:1925:2: rule__Target_Table__Group__3__Impl rule__Target_Table__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Target_Table__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Target_Table__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target_Table__Group__3"


    // $ANTLR start "rule__Target_Table__Group__3__Impl"
    // InternalTQL.g:1932:1: rule__Target_Table__Group__3__Impl : ( ( rule__Target_Table__Group_3__0 )* ) ;
    public final void rule__Target_Table__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1936:1: ( ( ( rule__Target_Table__Group_3__0 )* ) )
            // InternalTQL.g:1937:1: ( ( rule__Target_Table__Group_3__0 )* )
            {
            // InternalTQL.g:1937:1: ( ( rule__Target_Table__Group_3__0 )* )
            // InternalTQL.g:1938:2: ( rule__Target_Table__Group_3__0 )*
            {
             before(grammarAccess.getTarget_TableAccess().getGroup_3()); 
            // InternalTQL.g:1939:2: ( rule__Target_Table__Group_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==36) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalTQL.g:1939:3: rule__Target_Table__Group_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Target_Table__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getTarget_TableAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target_Table__Group__3__Impl"


    // $ANTLR start "rule__Target_Table__Group__4"
    // InternalTQL.g:1947:1: rule__Target_Table__Group__4 : rule__Target_Table__Group__4__Impl ;
    public final void rule__Target_Table__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1951:1: ( rule__Target_Table__Group__4__Impl )
            // InternalTQL.g:1952:2: rule__Target_Table__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Target_Table__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target_Table__Group__4"


    // $ANTLR start "rule__Target_Table__Group__4__Impl"
    // InternalTQL.g:1958:1: rule__Target_Table__Group__4__Impl : ( '}' ) ;
    public final void rule__Target_Table__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1962:1: ( ( '}' ) )
            // InternalTQL.g:1963:1: ( '}' )
            {
            // InternalTQL.g:1963:1: ( '}' )
            // InternalTQL.g:1964:2: '}'
            {
             before(grammarAccess.getTarget_TableAccess().getRightCurlyBracketKeyword_4()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getTarget_TableAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target_Table__Group__4__Impl"


    // $ANTLR start "rule__Target_Table__Group_3__0"
    // InternalTQL.g:1974:1: rule__Target_Table__Group_3__0 : rule__Target_Table__Group_3__0__Impl rule__Target_Table__Group_3__1 ;
    public final void rule__Target_Table__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1978:1: ( rule__Target_Table__Group_3__0__Impl rule__Target_Table__Group_3__1 )
            // InternalTQL.g:1979:2: rule__Target_Table__Group_3__0__Impl rule__Target_Table__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Target_Table__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Target_Table__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target_Table__Group_3__0"


    // $ANTLR start "rule__Target_Table__Group_3__0__Impl"
    // InternalTQL.g:1986:1: rule__Target_Table__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Target_Table__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1990:1: ( ( ',' ) )
            // InternalTQL.g:1991:1: ( ',' )
            {
            // InternalTQL.g:1991:1: ( ',' )
            // InternalTQL.g:1992:2: ','
            {
             before(grammarAccess.getTarget_TableAccess().getCommaKeyword_3_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getTarget_TableAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target_Table__Group_3__0__Impl"


    // $ANTLR start "rule__Target_Table__Group_3__1"
    // InternalTQL.g:2001:1: rule__Target_Table__Group_3__1 : rule__Target_Table__Group_3__1__Impl ;
    public final void rule__Target_Table__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2005:1: ( rule__Target_Table__Group_3__1__Impl )
            // InternalTQL.g:2006:2: rule__Target_Table__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Target_Table__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target_Table__Group_3__1"


    // $ANTLR start "rule__Target_Table__Group_3__1__Impl"
    // InternalTQL.g:2012:1: rule__Target_Table__Group_3__1__Impl : ( ( rule__Target_Table__ColumnsAssignment_3_1 ) ) ;
    public final void rule__Target_Table__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2016:1: ( ( ( rule__Target_Table__ColumnsAssignment_3_1 ) ) )
            // InternalTQL.g:2017:1: ( ( rule__Target_Table__ColumnsAssignment_3_1 ) )
            {
            // InternalTQL.g:2017:1: ( ( rule__Target_Table__ColumnsAssignment_3_1 ) )
            // InternalTQL.g:2018:2: ( rule__Target_Table__ColumnsAssignment_3_1 )
            {
             before(grammarAccess.getTarget_TableAccess().getColumnsAssignment_3_1()); 
            // InternalTQL.g:2019:2: ( rule__Target_Table__ColumnsAssignment_3_1 )
            // InternalTQL.g:2019:3: rule__Target_Table__ColumnsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Target_Table__ColumnsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTarget_TableAccess().getColumnsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target_Table__Group_3__1__Impl"


    // $ANTLR start "rule__Mapping__Group__0"
    // InternalTQL.g:2028:1: rule__Mapping__Group__0 : rule__Mapping__Group__0__Impl rule__Mapping__Group__1 ;
    public final void rule__Mapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2032:1: ( rule__Mapping__Group__0__Impl rule__Mapping__Group__1 )
            // InternalTQL.g:2033:2: rule__Mapping__Group__0__Impl rule__Mapping__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Mapping__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapping__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__0"


    // $ANTLR start "rule__Mapping__Group__0__Impl"
    // InternalTQL.g:2040:1: rule__Mapping__Group__0__Impl : ( 'mapping' ) ;
    public final void rule__Mapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2044:1: ( ( 'mapping' ) )
            // InternalTQL.g:2045:1: ( 'mapping' )
            {
            // InternalTQL.g:2045:1: ( 'mapping' )
            // InternalTQL.g:2046:2: 'mapping'
            {
             before(grammarAccess.getMappingAccess().getMappingKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getMappingAccess().getMappingKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__0__Impl"


    // $ANTLR start "rule__Mapping__Group__1"
    // InternalTQL.g:2055:1: rule__Mapping__Group__1 : rule__Mapping__Group__1__Impl rule__Mapping__Group__2 ;
    public final void rule__Mapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2059:1: ( rule__Mapping__Group__1__Impl rule__Mapping__Group__2 )
            // InternalTQL.g:2060:2: rule__Mapping__Group__1__Impl rule__Mapping__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Mapping__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapping__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__1"


    // $ANTLR start "rule__Mapping__Group__1__Impl"
    // InternalTQL.g:2067:1: rule__Mapping__Group__1__Impl : ( ( rule__Mapping__SourceAssignment_1 ) ) ;
    public final void rule__Mapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2071:1: ( ( ( rule__Mapping__SourceAssignment_1 ) ) )
            // InternalTQL.g:2072:1: ( ( rule__Mapping__SourceAssignment_1 ) )
            {
            // InternalTQL.g:2072:1: ( ( rule__Mapping__SourceAssignment_1 ) )
            // InternalTQL.g:2073:2: ( rule__Mapping__SourceAssignment_1 )
            {
             before(grammarAccess.getMappingAccess().getSourceAssignment_1()); 
            // InternalTQL.g:2074:2: ( rule__Mapping__SourceAssignment_1 )
            // InternalTQL.g:2074:3: rule__Mapping__SourceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Mapping__SourceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMappingAccess().getSourceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__1__Impl"


    // $ANTLR start "rule__Mapping__Group__2"
    // InternalTQL.g:2082:1: rule__Mapping__Group__2 : rule__Mapping__Group__2__Impl rule__Mapping__Group__3 ;
    public final void rule__Mapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2086:1: ( rule__Mapping__Group__2__Impl rule__Mapping__Group__3 )
            // InternalTQL.g:2087:2: rule__Mapping__Group__2__Impl rule__Mapping__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Mapping__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapping__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__2"


    // $ANTLR start "rule__Mapping__Group__2__Impl"
    // InternalTQL.g:2094:1: rule__Mapping__Group__2__Impl : ( '->' ) ;
    public final void rule__Mapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2098:1: ( ( '->' ) )
            // InternalTQL.g:2099:1: ( '->' )
            {
            // InternalTQL.g:2099:1: ( '->' )
            // InternalTQL.g:2100:2: '->'
            {
             before(grammarAccess.getMappingAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getMappingAccess().getHyphenMinusGreaterThanSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__2__Impl"


    // $ANTLR start "rule__Mapping__Group__3"
    // InternalTQL.g:2109:1: rule__Mapping__Group__3 : rule__Mapping__Group__3__Impl rule__Mapping__Group__4 ;
    public final void rule__Mapping__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2113:1: ( rule__Mapping__Group__3__Impl rule__Mapping__Group__4 )
            // InternalTQL.g:2114:2: rule__Mapping__Group__3__Impl rule__Mapping__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Mapping__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapping__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__3"


    // $ANTLR start "rule__Mapping__Group__3__Impl"
    // InternalTQL.g:2121:1: rule__Mapping__Group__3__Impl : ( ( rule__Mapping__TargetAssignment_3 ) ) ;
    public final void rule__Mapping__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2125:1: ( ( ( rule__Mapping__TargetAssignment_3 ) ) )
            // InternalTQL.g:2126:1: ( ( rule__Mapping__TargetAssignment_3 ) )
            {
            // InternalTQL.g:2126:1: ( ( rule__Mapping__TargetAssignment_3 ) )
            // InternalTQL.g:2127:2: ( rule__Mapping__TargetAssignment_3 )
            {
             before(grammarAccess.getMappingAccess().getTargetAssignment_3()); 
            // InternalTQL.g:2128:2: ( rule__Mapping__TargetAssignment_3 )
            // InternalTQL.g:2128:3: rule__Mapping__TargetAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Mapping__TargetAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMappingAccess().getTargetAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__3__Impl"


    // $ANTLR start "rule__Mapping__Group__4"
    // InternalTQL.g:2136:1: rule__Mapping__Group__4 : rule__Mapping__Group__4__Impl rule__Mapping__Group__5 ;
    public final void rule__Mapping__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2140:1: ( rule__Mapping__Group__4__Impl rule__Mapping__Group__5 )
            // InternalTQL.g:2141:2: rule__Mapping__Group__4__Impl rule__Mapping__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__Mapping__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapping__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__4"


    // $ANTLR start "rule__Mapping__Group__4__Impl"
    // InternalTQL.g:2148:1: rule__Mapping__Group__4__Impl : ( '{' ) ;
    public final void rule__Mapping__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2152:1: ( ( '{' ) )
            // InternalTQL.g:2153:1: ( '{' )
            {
            // InternalTQL.g:2153:1: ( '{' )
            // InternalTQL.g:2154:2: '{'
            {
             before(grammarAccess.getMappingAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getMappingAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__4__Impl"


    // $ANTLR start "rule__Mapping__Group__5"
    // InternalTQL.g:2163:1: rule__Mapping__Group__5 : rule__Mapping__Group__5__Impl rule__Mapping__Group__6 ;
    public final void rule__Mapping__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2167:1: ( rule__Mapping__Group__5__Impl rule__Mapping__Group__6 )
            // InternalTQL.g:2168:2: rule__Mapping__Group__5__Impl rule__Mapping__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Mapping__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapping__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__5"


    // $ANTLR start "rule__Mapping__Group__5__Impl"
    // InternalTQL.g:2175:1: rule__Mapping__Group__5__Impl : ( ( rule__Mapping__MappedColumnsAssignment_5 ) ) ;
    public final void rule__Mapping__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2179:1: ( ( ( rule__Mapping__MappedColumnsAssignment_5 ) ) )
            // InternalTQL.g:2180:1: ( ( rule__Mapping__MappedColumnsAssignment_5 ) )
            {
            // InternalTQL.g:2180:1: ( ( rule__Mapping__MappedColumnsAssignment_5 ) )
            // InternalTQL.g:2181:2: ( rule__Mapping__MappedColumnsAssignment_5 )
            {
             before(grammarAccess.getMappingAccess().getMappedColumnsAssignment_5()); 
            // InternalTQL.g:2182:2: ( rule__Mapping__MappedColumnsAssignment_5 )
            // InternalTQL.g:2182:3: rule__Mapping__MappedColumnsAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Mapping__MappedColumnsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getMappingAccess().getMappedColumnsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__5__Impl"


    // $ANTLR start "rule__Mapping__Group__6"
    // InternalTQL.g:2190:1: rule__Mapping__Group__6 : rule__Mapping__Group__6__Impl rule__Mapping__Group__7 ;
    public final void rule__Mapping__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2194:1: ( rule__Mapping__Group__6__Impl rule__Mapping__Group__7 )
            // InternalTQL.g:2195:2: rule__Mapping__Group__6__Impl rule__Mapping__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Mapping__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapping__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__6"


    // $ANTLR start "rule__Mapping__Group__6__Impl"
    // InternalTQL.g:2202:1: rule__Mapping__Group__6__Impl : ( ( rule__Mapping__Group_6__0 )* ) ;
    public final void rule__Mapping__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2206:1: ( ( ( rule__Mapping__Group_6__0 )* ) )
            // InternalTQL.g:2207:1: ( ( rule__Mapping__Group_6__0 )* )
            {
            // InternalTQL.g:2207:1: ( ( rule__Mapping__Group_6__0 )* )
            // InternalTQL.g:2208:2: ( rule__Mapping__Group_6__0 )*
            {
             before(grammarAccess.getMappingAccess().getGroup_6()); 
            // InternalTQL.g:2209:2: ( rule__Mapping__Group_6__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==36) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalTQL.g:2209:3: rule__Mapping__Group_6__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Mapping__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getMappingAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__6__Impl"


    // $ANTLR start "rule__Mapping__Group__7"
    // InternalTQL.g:2217:1: rule__Mapping__Group__7 : rule__Mapping__Group__7__Impl ;
    public final void rule__Mapping__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2221:1: ( rule__Mapping__Group__7__Impl )
            // InternalTQL.g:2222:2: rule__Mapping__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mapping__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__7"


    // $ANTLR start "rule__Mapping__Group__7__Impl"
    // InternalTQL.g:2228:1: rule__Mapping__Group__7__Impl : ( '}' ) ;
    public final void rule__Mapping__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2232:1: ( ( '}' ) )
            // InternalTQL.g:2233:1: ( '}' )
            {
            // InternalTQL.g:2233:1: ( '}' )
            // InternalTQL.g:2234:2: '}'
            {
             before(grammarAccess.getMappingAccess().getRightCurlyBracketKeyword_7()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getMappingAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__7__Impl"


    // $ANTLR start "rule__Mapping__Group_6__0"
    // InternalTQL.g:2244:1: rule__Mapping__Group_6__0 : rule__Mapping__Group_6__0__Impl rule__Mapping__Group_6__1 ;
    public final void rule__Mapping__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2248:1: ( rule__Mapping__Group_6__0__Impl rule__Mapping__Group_6__1 )
            // InternalTQL.g:2249:2: rule__Mapping__Group_6__0__Impl rule__Mapping__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__Mapping__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapping__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group_6__0"


    // $ANTLR start "rule__Mapping__Group_6__0__Impl"
    // InternalTQL.g:2256:1: rule__Mapping__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Mapping__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2260:1: ( ( ',' ) )
            // InternalTQL.g:2261:1: ( ',' )
            {
            // InternalTQL.g:2261:1: ( ',' )
            // InternalTQL.g:2262:2: ','
            {
             before(grammarAccess.getMappingAccess().getCommaKeyword_6_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getMappingAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group_6__0__Impl"


    // $ANTLR start "rule__Mapping__Group_6__1"
    // InternalTQL.g:2271:1: rule__Mapping__Group_6__1 : rule__Mapping__Group_6__1__Impl ;
    public final void rule__Mapping__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2275:1: ( rule__Mapping__Group_6__1__Impl )
            // InternalTQL.g:2276:2: rule__Mapping__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mapping__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group_6__1"


    // $ANTLR start "rule__Mapping__Group_6__1__Impl"
    // InternalTQL.g:2282:1: rule__Mapping__Group_6__1__Impl : ( ( rule__Mapping__MappedColumnsAssignment_6_1 ) ) ;
    public final void rule__Mapping__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2286:1: ( ( ( rule__Mapping__MappedColumnsAssignment_6_1 ) ) )
            // InternalTQL.g:2287:1: ( ( rule__Mapping__MappedColumnsAssignment_6_1 ) )
            {
            // InternalTQL.g:2287:1: ( ( rule__Mapping__MappedColumnsAssignment_6_1 ) )
            // InternalTQL.g:2288:2: ( rule__Mapping__MappedColumnsAssignment_6_1 )
            {
             before(grammarAccess.getMappingAccess().getMappedColumnsAssignment_6_1()); 
            // InternalTQL.g:2289:2: ( rule__Mapping__MappedColumnsAssignment_6_1 )
            // InternalTQL.g:2289:3: rule__Mapping__MappedColumnsAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Mapping__MappedColumnsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getMappingAccess().getMappedColumnsAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group_6__1__Impl"


    // $ANTLR start "rule__Mapped_Column__Group__0"
    // InternalTQL.g:2298:1: rule__Mapped_Column__Group__0 : rule__Mapped_Column__Group__0__Impl rule__Mapped_Column__Group__1 ;
    public final void rule__Mapped_Column__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2302:1: ( rule__Mapped_Column__Group__0__Impl rule__Mapped_Column__Group__1 )
            // InternalTQL.g:2303:2: rule__Mapped_Column__Group__0__Impl rule__Mapped_Column__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Mapped_Column__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapped_Column__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapped_Column__Group__0"


    // $ANTLR start "rule__Mapped_Column__Group__0__Impl"
    // InternalTQL.g:2310:1: rule__Mapped_Column__Group__0__Impl : ( ( rule__Mapped_Column__SourceAssignment_0 ) ) ;
    public final void rule__Mapped_Column__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2314:1: ( ( ( rule__Mapped_Column__SourceAssignment_0 ) ) )
            // InternalTQL.g:2315:1: ( ( rule__Mapped_Column__SourceAssignment_0 ) )
            {
            // InternalTQL.g:2315:1: ( ( rule__Mapped_Column__SourceAssignment_0 ) )
            // InternalTQL.g:2316:2: ( rule__Mapped_Column__SourceAssignment_0 )
            {
             before(grammarAccess.getMapped_ColumnAccess().getSourceAssignment_0()); 
            // InternalTQL.g:2317:2: ( rule__Mapped_Column__SourceAssignment_0 )
            // InternalTQL.g:2317:3: rule__Mapped_Column__SourceAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Mapped_Column__SourceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMapped_ColumnAccess().getSourceAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapped_Column__Group__0__Impl"


    // $ANTLR start "rule__Mapped_Column__Group__1"
    // InternalTQL.g:2325:1: rule__Mapped_Column__Group__1 : rule__Mapped_Column__Group__1__Impl rule__Mapped_Column__Group__2 ;
    public final void rule__Mapped_Column__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2329:1: ( rule__Mapped_Column__Group__1__Impl rule__Mapped_Column__Group__2 )
            // InternalTQL.g:2330:2: rule__Mapped_Column__Group__1__Impl rule__Mapped_Column__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Mapped_Column__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapped_Column__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapped_Column__Group__1"


    // $ANTLR start "rule__Mapped_Column__Group__1__Impl"
    // InternalTQL.g:2337:1: rule__Mapped_Column__Group__1__Impl : ( ':' ) ;
    public final void rule__Mapped_Column__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2341:1: ( ( ':' ) )
            // InternalTQL.g:2342:1: ( ':' )
            {
            // InternalTQL.g:2342:1: ( ':' )
            // InternalTQL.g:2343:2: ':'
            {
             before(grammarAccess.getMapped_ColumnAccess().getColonKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getMapped_ColumnAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapped_Column__Group__1__Impl"


    // $ANTLR start "rule__Mapped_Column__Group__2"
    // InternalTQL.g:2352:1: rule__Mapped_Column__Group__2 : rule__Mapped_Column__Group__2__Impl rule__Mapped_Column__Group__3 ;
    public final void rule__Mapped_Column__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2356:1: ( rule__Mapped_Column__Group__2__Impl rule__Mapped_Column__Group__3 )
            // InternalTQL.g:2357:2: rule__Mapped_Column__Group__2__Impl rule__Mapped_Column__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Mapped_Column__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapped_Column__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapped_Column__Group__2"


    // $ANTLR start "rule__Mapped_Column__Group__2__Impl"
    // InternalTQL.g:2364:1: rule__Mapped_Column__Group__2__Impl : ( ( rule__Mapped_Column__TargetAssignment_2 ) ) ;
    public final void rule__Mapped_Column__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2368:1: ( ( ( rule__Mapped_Column__TargetAssignment_2 ) ) )
            // InternalTQL.g:2369:1: ( ( rule__Mapped_Column__TargetAssignment_2 ) )
            {
            // InternalTQL.g:2369:1: ( ( rule__Mapped_Column__TargetAssignment_2 ) )
            // InternalTQL.g:2370:2: ( rule__Mapped_Column__TargetAssignment_2 )
            {
             before(grammarAccess.getMapped_ColumnAccess().getTargetAssignment_2()); 
            // InternalTQL.g:2371:2: ( rule__Mapped_Column__TargetAssignment_2 )
            // InternalTQL.g:2371:3: rule__Mapped_Column__TargetAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Mapped_Column__TargetAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMapped_ColumnAccess().getTargetAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapped_Column__Group__2__Impl"


    // $ANTLR start "rule__Mapped_Column__Group__3"
    // InternalTQL.g:2379:1: rule__Mapped_Column__Group__3 : rule__Mapped_Column__Group__3__Impl ;
    public final void rule__Mapped_Column__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2383:1: ( rule__Mapped_Column__Group__3__Impl )
            // InternalTQL.g:2384:2: rule__Mapped_Column__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mapped_Column__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapped_Column__Group__3"


    // $ANTLR start "rule__Mapped_Column__Group__3__Impl"
    // InternalTQL.g:2390:1: rule__Mapped_Column__Group__3__Impl : ( ( rule__Mapped_Column__Group_3__0 )* ) ;
    public final void rule__Mapped_Column__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2394:1: ( ( ( rule__Mapped_Column__Group_3__0 )* ) )
            // InternalTQL.g:2395:1: ( ( rule__Mapped_Column__Group_3__0 )* )
            {
            // InternalTQL.g:2395:1: ( ( rule__Mapped_Column__Group_3__0 )* )
            // InternalTQL.g:2396:2: ( rule__Mapped_Column__Group_3__0 )*
            {
             before(grammarAccess.getMapped_ColumnAccess().getGroup_3()); 
            // InternalTQL.g:2397:2: ( rule__Mapped_Column__Group_3__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==39) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalTQL.g:2397:3: rule__Mapped_Column__Group_3__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Mapped_Column__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getMapped_ColumnAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapped_Column__Group__3__Impl"


    // $ANTLR start "rule__Mapped_Column__Group_3__0"
    // InternalTQL.g:2406:1: rule__Mapped_Column__Group_3__0 : rule__Mapped_Column__Group_3__0__Impl rule__Mapped_Column__Group_3__1 ;
    public final void rule__Mapped_Column__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2410:1: ( rule__Mapped_Column__Group_3__0__Impl rule__Mapped_Column__Group_3__1 )
            // InternalTQL.g:2411:2: rule__Mapped_Column__Group_3__0__Impl rule__Mapped_Column__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Mapped_Column__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapped_Column__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapped_Column__Group_3__0"


    // $ANTLR start "rule__Mapped_Column__Group_3__0__Impl"
    // InternalTQL.g:2418:1: rule__Mapped_Column__Group_3__0__Impl : ( '|' ) ;
    public final void rule__Mapped_Column__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2422:1: ( ( '|' ) )
            // InternalTQL.g:2423:1: ( '|' )
            {
            // InternalTQL.g:2423:1: ( '|' )
            // InternalTQL.g:2424:2: '|'
            {
             before(grammarAccess.getMapped_ColumnAccess().getVerticalLineKeyword_3_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getMapped_ColumnAccess().getVerticalLineKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapped_Column__Group_3__0__Impl"


    // $ANTLR start "rule__Mapped_Column__Group_3__1"
    // InternalTQL.g:2433:1: rule__Mapped_Column__Group_3__1 : rule__Mapped_Column__Group_3__1__Impl ;
    public final void rule__Mapped_Column__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2437:1: ( rule__Mapped_Column__Group_3__1__Impl )
            // InternalTQL.g:2438:2: rule__Mapped_Column__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mapped_Column__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapped_Column__Group_3__1"


    // $ANTLR start "rule__Mapped_Column__Group_3__1__Impl"
    // InternalTQL.g:2444:1: rule__Mapped_Column__Group_3__1__Impl : ( ( rule__Mapped_Column__TransformationCallsAssignment_3_1 ) ) ;
    public final void rule__Mapped_Column__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2448:1: ( ( ( rule__Mapped_Column__TransformationCallsAssignment_3_1 ) ) )
            // InternalTQL.g:2449:1: ( ( rule__Mapped_Column__TransformationCallsAssignment_3_1 ) )
            {
            // InternalTQL.g:2449:1: ( ( rule__Mapped_Column__TransformationCallsAssignment_3_1 ) )
            // InternalTQL.g:2450:2: ( rule__Mapped_Column__TransformationCallsAssignment_3_1 )
            {
             before(grammarAccess.getMapped_ColumnAccess().getTransformationCallsAssignment_3_1()); 
            // InternalTQL.g:2451:2: ( rule__Mapped_Column__TransformationCallsAssignment_3_1 )
            // InternalTQL.g:2451:3: rule__Mapped_Column__TransformationCallsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Mapped_Column__TransformationCallsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMapped_ColumnAccess().getTransformationCallsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapped_Column__Group_3__1__Impl"


    // $ANTLR start "rule__Transformation_Call__Group__0"
    // InternalTQL.g:2460:1: rule__Transformation_Call__Group__0 : rule__Transformation_Call__Group__0__Impl rule__Transformation_Call__Group__1 ;
    public final void rule__Transformation_Call__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2464:1: ( rule__Transformation_Call__Group__0__Impl rule__Transformation_Call__Group__1 )
            // InternalTQL.g:2465:2: rule__Transformation_Call__Group__0__Impl rule__Transformation_Call__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Transformation_Call__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transformation_Call__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation_Call__Group__0"


    // $ANTLR start "rule__Transformation_Call__Group__0__Impl"
    // InternalTQL.g:2472:1: rule__Transformation_Call__Group__0__Impl : ( ( rule__Transformation_Call__TransformationAssignment_0 ) ) ;
    public final void rule__Transformation_Call__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2476:1: ( ( ( rule__Transformation_Call__TransformationAssignment_0 ) ) )
            // InternalTQL.g:2477:1: ( ( rule__Transformation_Call__TransformationAssignment_0 ) )
            {
            // InternalTQL.g:2477:1: ( ( rule__Transformation_Call__TransformationAssignment_0 ) )
            // InternalTQL.g:2478:2: ( rule__Transformation_Call__TransformationAssignment_0 )
            {
             before(grammarAccess.getTransformation_CallAccess().getTransformationAssignment_0()); 
            // InternalTQL.g:2479:2: ( rule__Transformation_Call__TransformationAssignment_0 )
            // InternalTQL.g:2479:3: rule__Transformation_Call__TransformationAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Transformation_Call__TransformationAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTransformation_CallAccess().getTransformationAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation_Call__Group__0__Impl"


    // $ANTLR start "rule__Transformation_Call__Group__1"
    // InternalTQL.g:2487:1: rule__Transformation_Call__Group__1 : rule__Transformation_Call__Group__1__Impl rule__Transformation_Call__Group__2 ;
    public final void rule__Transformation_Call__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2491:1: ( rule__Transformation_Call__Group__1__Impl rule__Transformation_Call__Group__2 )
            // InternalTQL.g:2492:2: rule__Transformation_Call__Group__1__Impl rule__Transformation_Call__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Transformation_Call__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transformation_Call__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation_Call__Group__1"


    // $ANTLR start "rule__Transformation_Call__Group__1__Impl"
    // InternalTQL.g:2499:1: rule__Transformation_Call__Group__1__Impl : ( '(' ) ;
    public final void rule__Transformation_Call__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2503:1: ( ( '(' ) )
            // InternalTQL.g:2504:1: ( '(' )
            {
            // InternalTQL.g:2504:1: ( '(' )
            // InternalTQL.g:2505:2: '('
            {
             before(grammarAccess.getTransformation_CallAccess().getLeftParenthesisKeyword_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getTransformation_CallAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation_Call__Group__1__Impl"


    // $ANTLR start "rule__Transformation_Call__Group__2"
    // InternalTQL.g:2514:1: rule__Transformation_Call__Group__2 : rule__Transformation_Call__Group__2__Impl rule__Transformation_Call__Group__3 ;
    public final void rule__Transformation_Call__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2518:1: ( rule__Transformation_Call__Group__2__Impl rule__Transformation_Call__Group__3 )
            // InternalTQL.g:2519:2: rule__Transformation_Call__Group__2__Impl rule__Transformation_Call__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Transformation_Call__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transformation_Call__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation_Call__Group__2"


    // $ANTLR start "rule__Transformation_Call__Group__2__Impl"
    // InternalTQL.g:2526:1: rule__Transformation_Call__Group__2__Impl : ( ( rule__Transformation_Call__Group_2__0 )? ) ;
    public final void rule__Transformation_Call__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2530:1: ( ( ( rule__Transformation_Call__Group_2__0 )? ) )
            // InternalTQL.g:2531:1: ( ( rule__Transformation_Call__Group_2__0 )? )
            {
            // InternalTQL.g:2531:1: ( ( rule__Transformation_Call__Group_2__0 )? )
            // InternalTQL.g:2532:2: ( rule__Transformation_Call__Group_2__0 )?
            {
             before(grammarAccess.getTransformation_CallAccess().getGroup_2()); 
            // InternalTQL.g:2533:2: ( rule__Transformation_Call__Group_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_INT)||(LA16_0>=20 && LA16_0<=22)||LA16_0==29||(LA16_0>=44 && LA16_0<=45)||LA16_0==47) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalTQL.g:2533:3: rule__Transformation_Call__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transformation_Call__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransformation_CallAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation_Call__Group__2__Impl"


    // $ANTLR start "rule__Transformation_Call__Group__3"
    // InternalTQL.g:2541:1: rule__Transformation_Call__Group__3 : rule__Transformation_Call__Group__3__Impl ;
    public final void rule__Transformation_Call__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2545:1: ( rule__Transformation_Call__Group__3__Impl )
            // InternalTQL.g:2546:2: rule__Transformation_Call__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transformation_Call__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation_Call__Group__3"


    // $ANTLR start "rule__Transformation_Call__Group__3__Impl"
    // InternalTQL.g:2552:1: rule__Transformation_Call__Group__3__Impl : ( ')' ) ;
    public final void rule__Transformation_Call__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2556:1: ( ( ')' ) )
            // InternalTQL.g:2557:1: ( ')' )
            {
            // InternalTQL.g:2557:1: ( ')' )
            // InternalTQL.g:2558:2: ')'
            {
             before(grammarAccess.getTransformation_CallAccess().getRightParenthesisKeyword_3()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getTransformation_CallAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation_Call__Group__3__Impl"


    // $ANTLR start "rule__Transformation_Call__Group_2__0"
    // InternalTQL.g:2568:1: rule__Transformation_Call__Group_2__0 : rule__Transformation_Call__Group_2__0__Impl rule__Transformation_Call__Group_2__1 ;
    public final void rule__Transformation_Call__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2572:1: ( rule__Transformation_Call__Group_2__0__Impl rule__Transformation_Call__Group_2__1 )
            // InternalTQL.g:2573:2: rule__Transformation_Call__Group_2__0__Impl rule__Transformation_Call__Group_2__1
            {
            pushFollow(FOLLOW_15);
            rule__Transformation_Call__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transformation_Call__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation_Call__Group_2__0"


    // $ANTLR start "rule__Transformation_Call__Group_2__0__Impl"
    // InternalTQL.g:2580:1: rule__Transformation_Call__Group_2__0__Impl : ( ( rule__Transformation_Call__CallParametersAssignment_2_0 ) ) ;
    public final void rule__Transformation_Call__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2584:1: ( ( ( rule__Transformation_Call__CallParametersAssignment_2_0 ) ) )
            // InternalTQL.g:2585:1: ( ( rule__Transformation_Call__CallParametersAssignment_2_0 ) )
            {
            // InternalTQL.g:2585:1: ( ( rule__Transformation_Call__CallParametersAssignment_2_0 ) )
            // InternalTQL.g:2586:2: ( rule__Transformation_Call__CallParametersAssignment_2_0 )
            {
             before(grammarAccess.getTransformation_CallAccess().getCallParametersAssignment_2_0()); 
            // InternalTQL.g:2587:2: ( rule__Transformation_Call__CallParametersAssignment_2_0 )
            // InternalTQL.g:2587:3: rule__Transformation_Call__CallParametersAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Transformation_Call__CallParametersAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getTransformation_CallAccess().getCallParametersAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation_Call__Group_2__0__Impl"


    // $ANTLR start "rule__Transformation_Call__Group_2__1"
    // InternalTQL.g:2595:1: rule__Transformation_Call__Group_2__1 : rule__Transformation_Call__Group_2__1__Impl ;
    public final void rule__Transformation_Call__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2599:1: ( rule__Transformation_Call__Group_2__1__Impl )
            // InternalTQL.g:2600:2: rule__Transformation_Call__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transformation_Call__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation_Call__Group_2__1"


    // $ANTLR start "rule__Transformation_Call__Group_2__1__Impl"
    // InternalTQL.g:2606:1: rule__Transformation_Call__Group_2__1__Impl : ( ( rule__Transformation_Call__Group_2_1__0 )* ) ;
    public final void rule__Transformation_Call__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2610:1: ( ( ( rule__Transformation_Call__Group_2_1__0 )* ) )
            // InternalTQL.g:2611:1: ( ( rule__Transformation_Call__Group_2_1__0 )* )
            {
            // InternalTQL.g:2611:1: ( ( rule__Transformation_Call__Group_2_1__0 )* )
            // InternalTQL.g:2612:2: ( rule__Transformation_Call__Group_2_1__0 )*
            {
             before(grammarAccess.getTransformation_CallAccess().getGroup_2_1()); 
            // InternalTQL.g:2613:2: ( rule__Transformation_Call__Group_2_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==36) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalTQL.g:2613:3: rule__Transformation_Call__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Transformation_Call__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getTransformation_CallAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation_Call__Group_2__1__Impl"


    // $ANTLR start "rule__Transformation_Call__Group_2_1__0"
    // InternalTQL.g:2622:1: rule__Transformation_Call__Group_2_1__0 : rule__Transformation_Call__Group_2_1__0__Impl rule__Transformation_Call__Group_2_1__1 ;
    public final void rule__Transformation_Call__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2626:1: ( rule__Transformation_Call__Group_2_1__0__Impl rule__Transformation_Call__Group_2_1__1 )
            // InternalTQL.g:2627:2: rule__Transformation_Call__Group_2_1__0__Impl rule__Transformation_Call__Group_2_1__1
            {
            pushFollow(FOLLOW_16);
            rule__Transformation_Call__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transformation_Call__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation_Call__Group_2_1__0"


    // $ANTLR start "rule__Transformation_Call__Group_2_1__0__Impl"
    // InternalTQL.g:2634:1: rule__Transformation_Call__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__Transformation_Call__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2638:1: ( ( ',' ) )
            // InternalTQL.g:2639:1: ( ',' )
            {
            // InternalTQL.g:2639:1: ( ',' )
            // InternalTQL.g:2640:2: ','
            {
             before(grammarAccess.getTransformation_CallAccess().getCommaKeyword_2_1_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getTransformation_CallAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation_Call__Group_2_1__0__Impl"


    // $ANTLR start "rule__Transformation_Call__Group_2_1__1"
    // InternalTQL.g:2649:1: rule__Transformation_Call__Group_2_1__1 : rule__Transformation_Call__Group_2_1__1__Impl ;
    public final void rule__Transformation_Call__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2653:1: ( rule__Transformation_Call__Group_2_1__1__Impl )
            // InternalTQL.g:2654:2: rule__Transformation_Call__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transformation_Call__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation_Call__Group_2_1__1"


    // $ANTLR start "rule__Transformation_Call__Group_2_1__1__Impl"
    // InternalTQL.g:2660:1: rule__Transformation_Call__Group_2_1__1__Impl : ( ( rule__Transformation_Call__CallParametersAssignment_2_1_1 ) ) ;
    public final void rule__Transformation_Call__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2664:1: ( ( ( rule__Transformation_Call__CallParametersAssignment_2_1_1 ) ) )
            // InternalTQL.g:2665:1: ( ( rule__Transformation_Call__CallParametersAssignment_2_1_1 ) )
            {
            // InternalTQL.g:2665:1: ( ( rule__Transformation_Call__CallParametersAssignment_2_1_1 ) )
            // InternalTQL.g:2666:2: ( rule__Transformation_Call__CallParametersAssignment_2_1_1 )
            {
             before(grammarAccess.getTransformation_CallAccess().getCallParametersAssignment_2_1_1()); 
            // InternalTQL.g:2667:2: ( rule__Transformation_Call__CallParametersAssignment_2_1_1 )
            // InternalTQL.g:2667:3: rule__Transformation_Call__CallParametersAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Transformation_Call__CallParametersAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTransformation_CallAccess().getCallParametersAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation_Call__Group_2_1__1__Impl"


    // $ANTLR start "rule__Transformation__Group__0"
    // InternalTQL.g:2676:1: rule__Transformation__Group__0 : rule__Transformation__Group__0__Impl rule__Transformation__Group__1 ;
    public final void rule__Transformation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2680:1: ( rule__Transformation__Group__0__Impl rule__Transformation__Group__1 )
            // InternalTQL.g:2681:2: rule__Transformation__Group__0__Impl rule__Transformation__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Transformation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transformation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__0"


    // $ANTLR start "rule__Transformation__Group__0__Impl"
    // InternalTQL.g:2688:1: rule__Transformation__Group__0__Impl : ( 'transformation' ) ;
    public final void rule__Transformation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2692:1: ( ( 'transformation' ) )
            // InternalTQL.g:2693:1: ( 'transformation' )
            {
            // InternalTQL.g:2693:1: ( 'transformation' )
            // InternalTQL.g:2694:2: 'transformation'
            {
             before(grammarAccess.getTransformationAccess().getTransformationKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getTransformationAccess().getTransformationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__0__Impl"


    // $ANTLR start "rule__Transformation__Group__1"
    // InternalTQL.g:2703:1: rule__Transformation__Group__1 : rule__Transformation__Group__1__Impl rule__Transformation__Group__2 ;
    public final void rule__Transformation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2707:1: ( rule__Transformation__Group__1__Impl rule__Transformation__Group__2 )
            // InternalTQL.g:2708:2: rule__Transformation__Group__1__Impl rule__Transformation__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Transformation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transformation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__1"


    // $ANTLR start "rule__Transformation__Group__1__Impl"
    // InternalTQL.g:2715:1: rule__Transformation__Group__1__Impl : ( ( rule__Transformation__InTypeAssignment_1 ) ) ;
    public final void rule__Transformation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2719:1: ( ( ( rule__Transformation__InTypeAssignment_1 ) ) )
            // InternalTQL.g:2720:1: ( ( rule__Transformation__InTypeAssignment_1 ) )
            {
            // InternalTQL.g:2720:1: ( ( rule__Transformation__InTypeAssignment_1 ) )
            // InternalTQL.g:2721:2: ( rule__Transformation__InTypeAssignment_1 )
            {
             before(grammarAccess.getTransformationAccess().getInTypeAssignment_1()); 
            // InternalTQL.g:2722:2: ( rule__Transformation__InTypeAssignment_1 )
            // InternalTQL.g:2722:3: rule__Transformation__InTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Transformation__InTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTransformationAccess().getInTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__1__Impl"


    // $ANTLR start "rule__Transformation__Group__2"
    // InternalTQL.g:2730:1: rule__Transformation__Group__2 : rule__Transformation__Group__2__Impl rule__Transformation__Group__3 ;
    public final void rule__Transformation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2734:1: ( rule__Transformation__Group__2__Impl rule__Transformation__Group__3 )
            // InternalTQL.g:2735:2: rule__Transformation__Group__2__Impl rule__Transformation__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Transformation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transformation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__2"


    // $ANTLR start "rule__Transformation__Group__2__Impl"
    // InternalTQL.g:2742:1: rule__Transformation__Group__2__Impl : ( '::' ) ;
    public final void rule__Transformation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2746:1: ( ( '::' ) )
            // InternalTQL.g:2747:1: ( '::' )
            {
            // InternalTQL.g:2747:1: ( '::' )
            // InternalTQL.g:2748:2: '::'
            {
             before(grammarAccess.getTransformationAccess().getColonColonKeyword_2()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getTransformationAccess().getColonColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__2__Impl"


    // $ANTLR start "rule__Transformation__Group__3"
    // InternalTQL.g:2757:1: rule__Transformation__Group__3 : rule__Transformation__Group__3__Impl rule__Transformation__Group__4 ;
    public final void rule__Transformation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2761:1: ( rule__Transformation__Group__3__Impl rule__Transformation__Group__4 )
            // InternalTQL.g:2762:2: rule__Transformation__Group__3__Impl rule__Transformation__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Transformation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transformation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__3"


    // $ANTLR start "rule__Transformation__Group__3__Impl"
    // InternalTQL.g:2769:1: rule__Transformation__Group__3__Impl : ( ( rule__Transformation__NameAssignment_3 ) ) ;
    public final void rule__Transformation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2773:1: ( ( ( rule__Transformation__NameAssignment_3 ) ) )
            // InternalTQL.g:2774:1: ( ( rule__Transformation__NameAssignment_3 ) )
            {
            // InternalTQL.g:2774:1: ( ( rule__Transformation__NameAssignment_3 ) )
            // InternalTQL.g:2775:2: ( rule__Transformation__NameAssignment_3 )
            {
             before(grammarAccess.getTransformationAccess().getNameAssignment_3()); 
            // InternalTQL.g:2776:2: ( rule__Transformation__NameAssignment_3 )
            // InternalTQL.g:2776:3: rule__Transformation__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Transformation__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTransformationAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__3__Impl"


    // $ANTLR start "rule__Transformation__Group__4"
    // InternalTQL.g:2784:1: rule__Transformation__Group__4 : rule__Transformation__Group__4__Impl rule__Transformation__Group__5 ;
    public final void rule__Transformation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2788:1: ( rule__Transformation__Group__4__Impl rule__Transformation__Group__5 )
            // InternalTQL.g:2789:2: rule__Transformation__Group__4__Impl rule__Transformation__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__Transformation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transformation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__4"


    // $ANTLR start "rule__Transformation__Group__4__Impl"
    // InternalTQL.g:2796:1: rule__Transformation__Group__4__Impl : ( '(' ) ;
    public final void rule__Transformation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2800:1: ( ( '(' ) )
            // InternalTQL.g:2801:1: ( '(' )
            {
            // InternalTQL.g:2801:1: ( '(' )
            // InternalTQL.g:2802:2: '('
            {
             before(grammarAccess.getTransformationAccess().getLeftParenthesisKeyword_4()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getTransformationAccess().getLeftParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__4__Impl"


    // $ANTLR start "rule__Transformation__Group__5"
    // InternalTQL.g:2811:1: rule__Transformation__Group__5 : rule__Transformation__Group__5__Impl rule__Transformation__Group__6 ;
    public final void rule__Transformation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2815:1: ( rule__Transformation__Group__5__Impl rule__Transformation__Group__6 )
            // InternalTQL.g:2816:2: rule__Transformation__Group__5__Impl rule__Transformation__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__Transformation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transformation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__5"


    // $ANTLR start "rule__Transformation__Group__5__Impl"
    // InternalTQL.g:2823:1: rule__Transformation__Group__5__Impl : ( ( rule__Transformation__Group_5__0 )? ) ;
    public final void rule__Transformation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2827:1: ( ( ( rule__Transformation__Group_5__0 )? ) )
            // InternalTQL.g:2828:1: ( ( rule__Transformation__Group_5__0 )? )
            {
            // InternalTQL.g:2828:1: ( ( rule__Transformation__Group_5__0 )? )
            // InternalTQL.g:2829:2: ( rule__Transformation__Group_5__0 )?
            {
             before(grammarAccess.getTransformationAccess().getGroup_5()); 
            // InternalTQL.g:2830:2: ( rule__Transformation__Group_5__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_STRING && LA18_0<=RULE_ID)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalTQL.g:2830:3: rule__Transformation__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transformation__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransformationAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__5__Impl"


    // $ANTLR start "rule__Transformation__Group__6"
    // InternalTQL.g:2838:1: rule__Transformation__Group__6 : rule__Transformation__Group__6__Impl rule__Transformation__Group__7 ;
    public final void rule__Transformation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2842:1: ( rule__Transformation__Group__6__Impl rule__Transformation__Group__7 )
            // InternalTQL.g:2843:2: rule__Transformation__Group__6__Impl rule__Transformation__Group__7
            {
            pushFollow(FOLLOW_5);
            rule__Transformation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transformation__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__6"


    // $ANTLR start "rule__Transformation__Group__6__Impl"
    // InternalTQL.g:2850:1: rule__Transformation__Group__6__Impl : ( ')' ) ;
    public final void rule__Transformation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2854:1: ( ( ')' ) )
            // InternalTQL.g:2855:1: ( ')' )
            {
            // InternalTQL.g:2855:1: ( ')' )
            // InternalTQL.g:2856:2: ')'
            {
             before(grammarAccess.getTransformationAccess().getRightParenthesisKeyword_6()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getTransformationAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__6__Impl"


    // $ANTLR start "rule__Transformation__Group__7"
    // InternalTQL.g:2865:1: rule__Transformation__Group__7 : rule__Transformation__Group__7__Impl rule__Transformation__Group__8 ;
    public final void rule__Transformation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2869:1: ( rule__Transformation__Group__7__Impl rule__Transformation__Group__8 )
            // InternalTQL.g:2870:2: rule__Transformation__Group__7__Impl rule__Transformation__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__Transformation__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transformation__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__7"


    // $ANTLR start "rule__Transformation__Group__7__Impl"
    // InternalTQL.g:2877:1: rule__Transformation__Group__7__Impl : ( ':' ) ;
    public final void rule__Transformation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2881:1: ( ( ':' ) )
            // InternalTQL.g:2882:1: ( ':' )
            {
            // InternalTQL.g:2882:1: ( ':' )
            // InternalTQL.g:2883:2: ':'
            {
             before(grammarAccess.getTransformationAccess().getColonKeyword_7()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getTransformationAccess().getColonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__7__Impl"


    // $ANTLR start "rule__Transformation__Group__8"
    // InternalTQL.g:2892:1: rule__Transformation__Group__8 : rule__Transformation__Group__8__Impl rule__Transformation__Group__9 ;
    public final void rule__Transformation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2896:1: ( rule__Transformation__Group__8__Impl rule__Transformation__Group__9 )
            // InternalTQL.g:2897:2: rule__Transformation__Group__8__Impl rule__Transformation__Group__9
            {
            pushFollow(FOLLOW_7);
            rule__Transformation__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transformation__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__8"


    // $ANTLR start "rule__Transformation__Group__8__Impl"
    // InternalTQL.g:2904:1: rule__Transformation__Group__8__Impl : ( ( rule__Transformation__OutTypeAssignment_8 ) ) ;
    public final void rule__Transformation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2908:1: ( ( ( rule__Transformation__OutTypeAssignment_8 ) ) )
            // InternalTQL.g:2909:1: ( ( rule__Transformation__OutTypeAssignment_8 ) )
            {
            // InternalTQL.g:2909:1: ( ( rule__Transformation__OutTypeAssignment_8 ) )
            // InternalTQL.g:2910:2: ( rule__Transformation__OutTypeAssignment_8 )
            {
             before(grammarAccess.getTransformationAccess().getOutTypeAssignment_8()); 
            // InternalTQL.g:2911:2: ( rule__Transformation__OutTypeAssignment_8 )
            // InternalTQL.g:2911:3: rule__Transformation__OutTypeAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Transformation__OutTypeAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getTransformationAccess().getOutTypeAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__8__Impl"


    // $ANTLR start "rule__Transformation__Group__9"
    // InternalTQL.g:2919:1: rule__Transformation__Group__9 : rule__Transformation__Group__9__Impl rule__Transformation__Group__10 ;
    public final void rule__Transformation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2923:1: ( rule__Transformation__Group__9__Impl rule__Transformation__Group__10 )
            // InternalTQL.g:2924:2: rule__Transformation__Group__9__Impl rule__Transformation__Group__10
            {
            pushFollow(FOLLOW_16);
            rule__Transformation__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transformation__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__9"


    // $ANTLR start "rule__Transformation__Group__9__Impl"
    // InternalTQL.g:2931:1: rule__Transformation__Group__9__Impl : ( '{' ) ;
    public final void rule__Transformation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2935:1: ( ( '{' ) )
            // InternalTQL.g:2936:1: ( '{' )
            {
            // InternalTQL.g:2936:1: ( '{' )
            // InternalTQL.g:2937:2: '{'
            {
             before(grammarAccess.getTransformationAccess().getLeftCurlyBracketKeyword_9()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getTransformationAccess().getLeftCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__9__Impl"


    // $ANTLR start "rule__Transformation__Group__10"
    // InternalTQL.g:2946:1: rule__Transformation__Group__10 : rule__Transformation__Group__10__Impl rule__Transformation__Group__11 ;
    public final void rule__Transformation__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2950:1: ( rule__Transformation__Group__10__Impl rule__Transformation__Group__11 )
            // InternalTQL.g:2951:2: rule__Transformation__Group__10__Impl rule__Transformation__Group__11
            {
            pushFollow(FOLLOW_19);
            rule__Transformation__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transformation__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__10"


    // $ANTLR start "rule__Transformation__Group__10__Impl"
    // InternalTQL.g:2958:1: rule__Transformation__Group__10__Impl : ( ( rule__Transformation__BodyAssignment_10 ) ) ;
    public final void rule__Transformation__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2962:1: ( ( ( rule__Transformation__BodyAssignment_10 ) ) )
            // InternalTQL.g:2963:1: ( ( rule__Transformation__BodyAssignment_10 ) )
            {
            // InternalTQL.g:2963:1: ( ( rule__Transformation__BodyAssignment_10 ) )
            // InternalTQL.g:2964:2: ( rule__Transformation__BodyAssignment_10 )
            {
             before(grammarAccess.getTransformationAccess().getBodyAssignment_10()); 
            // InternalTQL.g:2965:2: ( rule__Transformation__BodyAssignment_10 )
            // InternalTQL.g:2965:3: rule__Transformation__BodyAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Transformation__BodyAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getTransformationAccess().getBodyAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__10__Impl"


    // $ANTLR start "rule__Transformation__Group__11"
    // InternalTQL.g:2973:1: rule__Transformation__Group__11 : rule__Transformation__Group__11__Impl ;
    public final void rule__Transformation__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2977:1: ( rule__Transformation__Group__11__Impl )
            // InternalTQL.g:2978:2: rule__Transformation__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transformation__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__11"


    // $ANTLR start "rule__Transformation__Group__11__Impl"
    // InternalTQL.g:2984:1: rule__Transformation__Group__11__Impl : ( '}' ) ;
    public final void rule__Transformation__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2988:1: ( ( '}' ) )
            // InternalTQL.g:2989:1: ( '}' )
            {
            // InternalTQL.g:2989:1: ( '}' )
            // InternalTQL.g:2990:2: '}'
            {
             before(grammarAccess.getTransformationAccess().getRightCurlyBracketKeyword_11()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getTransformationAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__11__Impl"


    // $ANTLR start "rule__Transformation__Group_5__0"
    // InternalTQL.g:3000:1: rule__Transformation__Group_5__0 : rule__Transformation__Group_5__0__Impl rule__Transformation__Group_5__1 ;
    public final void rule__Transformation__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:3004:1: ( rule__Transformation__Group_5__0__Impl rule__Transformation__Group_5__1 )
            // InternalTQL.g:3005:2: rule__Transformation__Group_5__0__Impl rule__Transformation__Group_5__1
            {
            pushFollow(FOLLOW_15);
            rule__Transformation__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transformation__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group_5__0"


    // $ANTLR start "rule__Transformation__Group_5__0__Impl"
    // InternalTQL.g:3012:1: rule__Transformation__Group_5__0__Impl : ( ( rule__Transformation__ParametersAssignment_5_0 ) ) ;
    public final void rule__Transformation__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:3016:1: ( ( ( rule__Transformation__ParametersAssignment_5_0 ) ) )
            // InternalTQL.g:3017:1: ( ( rule__Transformation__ParametersAssignment_5_0 ) )
            {
            // InternalTQL.g:3017:1: ( ( rule__Transformation__ParametersAssignment_5_0 ) )
            // InternalTQL.g:3018:2: ( rule__Transformation__ParametersAssignment_5_0 )
            {
             before(grammarAccess.getTransformationAccess().getParametersAssignment_5_0()); 
            // InternalTQL.g:3019:2: ( rule__Transformation__ParametersAssignment_5_0 )
            // InternalTQL.g:3019:3: rule__Transformation__ParametersAssignment_5_0
            {
            pushFollow(FOLLOW_2);
            rule__Transformation__ParametersAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getTransformationAccess().getParametersAssignment_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group_5__0__Impl"


    // $ANTLR start "rule__Transformation__Group_5__1"
    // InternalTQL.g:3027:1: rule__Transformation__Group_5__1 : rule__Transformation__Group_5__1__Impl ;
    public final void rule__Transformation__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:3031:1: ( rule__Transformation__Group_5__1__Impl )
            // InternalTQL.g:3032:2: rule__Transformation__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transformation__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group_5__1"


    // $ANTLR start "rule__Transformation__Group_5__1__Impl"
    // InternalTQL.g:3038:1: rule__Transformation__Group_5__1__Impl : ( ( rule__Transformation__Group_5_1__0 )* ) ;
    public final void rule__Transformation__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:3042:1: ( ( ( rule__Transformation__Group_5_1__0 )* ) )
            // InternalTQL.g:3043:1: ( ( rule__Transformation__Group_5_1__0 )* )
            {
            // InternalTQL.g:3043:1: ( ( rule__Transformation__Group_5_1__0 )* )
            // InternalTQL.g:3044:2: ( rule__Transformation__Group_5_1__0 )*
            {
             before(grammarAccess.getTransformationAccess().getGroup_5_1()); 
            // InternalTQL.g:3045:2: ( rule__Transformation__Group_5_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==36) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalTQL.g:3045:3: rule__Transformation__Group_5_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Transformation__Group_5_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getTransformationAccess().getGroup_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group_5__1__Impl"


    // $ANTLR start "rule__Transformation__Group_5_1__0"
    // InternalTQL.g:3054:1: rule__Transformation__Group_5_1__0 : rule__Transformation__Group_5_1__0__Impl rule__Transformation__Group_5_1__1 ;
    public final void rule__Transformation__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:3058:1: ( rule__Transformation__Group_5_1__0__Impl rule__Transformation__Group_5_1__1 )
            // InternalTQL.g:3059:2: rule__Transformation__Group_5_1__0__Impl rule__Transformation__Group_5_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Transformation__Group_5_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transformation__Group_5_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group_5_1__0"


    // $ANTLR start "rule__Transformation__Group_5_1__0__Impl"
    // InternalTQL.g:3066:1: rule__Transformation__Group_5_1__0__Impl : ( ',' ) ;
    public final void rule__Transformation__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:3070:1: ( ( ',' ) )
            // InternalTQL.g:3071:1: ( ',' )
            {
            // InternalTQL.g:3071:1: ( ',' )
            // InternalTQL.g:3072:2: ','
            {
             before(grammarAccess.getTransformationAccess().getCommaKeyword_5_1_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getTransformationAccess().getCommaKeyword_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group_5_1__0__Impl"


    // $ANTLR start "rule__Transformation__Group_5_1__1"
    // InternalTQL.g:3081:1: rule__Transformation__Group_5_1__1 : rule__Transformation__Group_5_1__1__Impl ;
    public final void rule__Transformation__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:3085:1: ( rule__Transformation__Group_5_1__1__Impl )
            // InternalTQL.g:3086:2: rule__Transformation__Group_5_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transformation__Group_5_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group_5_1__1"


    // $ANTLR start "rule__Transformation__Group_5_1__1__Impl"
    // InternalTQL.g:3092:1: rule__Transformation__Group_5_1__1__Impl : ( ( rule__Transformation__ParametersAssignment_5_1_1 ) ) ;
    public final void rule__Transformation__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:3096:1: ( ( ( rule__Transformation__ParametersAssignment_5_1_1 ) ) )
            // InternalTQL.g:3097:1: ( ( rule__Transformation__ParametersAssignment_5_1_1 ) )
            {
            // InternalTQL.g:3097:1: ( ( rule__Transformation__ParametersAssignment_5_1_1 ) )
            // InternalTQL.g:3098:2: ( rule__Transformation__ParametersAssignment_5_1_1 )
            {
             before(grammarAccess.getTransformationAccess().getParametersAssignment_5_1_1()); 
            // InternalTQL.g:3099:2: ( rule__Transformation__ParametersAssignment_5_1_1 )
            // InternalTQL.g:3099:3: rule__Transformation__ParametersAssignment_5_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Transformation__ParametersAssignment_5_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTransformationAccess().getParametersAssignment_5_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group_5_1__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalTQL.g:3108:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:3112:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalTQL.g:3113:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // InternalTQL.g:3120:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__NameAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:3124:1: ( ( ( rule__Parameter__NameAssignment_0 ) ) )
            // InternalTQL.g:3125:1: ( ( rule__Parameter__NameAssignment_0 ) )
            {
            // InternalTQL.g:3125:1: ( ( rule__Parameter__NameAssignment_0 ) )
            // InternalTQL.g:3126:2: ( rule__Parameter__NameAssignment_0 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_0()); 
            // InternalTQL.g:3127:2: ( rule__Parameter__NameAssignment_0 )
            // InternalTQL.g:3127:3: rule__Parameter__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // InternalTQL.g:3135:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:3139:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalTQL.g:3140:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // InternalTQL.g:3147:1: rule__Parameter__Group__1__Impl : ( ':' ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:3151:1: ( ( ':' ) )
            // InternalTQL.g:3152:1: ( ':' )
            {
            // InternalTQL.g:3152:1: ( ':' )
            // InternalTQL.g:3153:2: ':'
            {
             before(grammarAccess.getParameterAccess().getColonKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__2"
    // InternalTQL.g:3162:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:3166:1: ( rule__Parameter__Group__2__Impl )
            // InternalTQL.g:3167:2: rule__Parameter__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2"


    // $ANTLR start "rule__Parameter__Group__2__Impl"
    // InternalTQL.g:3173:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__TypeAssignment_2 ) ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:3177:1: ( ( ( rule__Parameter__TypeAssignment_2 ) ) )
            // InternalTQL.g:3178:1: ( ( rule__Parameter__TypeAssignment_2 ) )
            {
            // InternalTQL.g:3178:1: ( ( rule__Parameter__TypeAssignment_2 ) )
            // InternalTQL.g:3179:2: ( rule__Parameter__TypeAssignment_2 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_2()); 
            // InternalTQL.g:3180:2: ( rule__Parameter__TypeAssignment_2 )
            // InternalTQL.g:3180:3: rule__Parameter__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2__Impl"


    // $ANTLR start "rule__And__Group__0"
    // InternalTQL.g:3189:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:3193:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // InternalTQL.g:3194:2: rule__And__Group__0__Impl rule__And__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__And__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__0"


    // $ANTLR start "rule__And__Group__0__Impl"
    // InternalTQL.g:3201:1: rule__And__Group__0__Impl : ( ruleOr ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:3205:1: ( ( ruleOr ) )
            // InternalTQL.g:3206:1: ( ruleOr )
            {
            // InternalTQL.g:3206:1: ( ruleOr )
            // InternalTQL.g:3207:2: ruleOr
            {
             before(grammarAccess.getAndAccess().getOrParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleOr();

            state._fsp--;

             after(grammarAccess.getAndAccess().getOrParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__0__Impl"


    // $ANTLR start "rule__And__Group__1"
    // InternalTQL.g:3216:1: rule__And__Group__1 : rule__And__Group__1__Impl ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:3220:1: ( rule__And__Group__1__Impl )
            // InternalTQL.g:3221:2: rule__And__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__And__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__1"


    // $ANTLR start "rule__And__Group__1__Impl"
    // InternalTQL.g:3227:1: rule__And__Group__1__Impl : ( ( rule__And__Group_1__0 )* ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:3231:1: ( ( ( rule__And__Group_1__0 )* ) )
            // InternalTQL.g:3232:1: ( ( rule__And__Group_1__0 )* )
            {
            // InternalTQL.g:3232:1: ( ( rule__And__Group_1__0 )* )
            // InternalTQL.g:3233:2: ( rule__And__Group_1__0 )*
            {
             before(grammarAccess.getAndAccess().getGroup_1()); 
            // InternalTQL.g:3234:2: ( rule__And__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==11) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalTQL.g:3234:3: rule__And__Group_1__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__And__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getAndAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__1__Impl"


    // $ANTLR start "rule__And__Group_1__0"
    // InternalTQL.g:3243:1: rule__And__Group_1__0 : rule__And__Group_1__0__Impl rule__And__Group_1__1 ;
    public final void rule__And__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:3247:1: ( rule__And__Group_1__0__Impl rule__And__Group_1__1 )
            // InternalTQL.g:3248:2: rule__And__Group_1__0__Impl rule__And__Group_1__1
            {
            pushFollow(FOLLOW_20);
            rule__And__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__0"


    // $ANTLR start "rule__And__Group_1__0__Impl"
    // InternalTQL.g:3255:1: rule__And__Group_1__0__Impl : ( () ) ;
    public final void rule__And__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:3259:1: ( ( () ) )
            // InternalTQL.g:3260:1: ( () )
            {
            // InternalTQL.g:3260:1: ( () )
            // InternalTQL.g:3261:2: ()
            {
             before(grammarAccess.getAndAccess().getAndLeftAction_1_0()); 
            // InternalTQL.g:3262:2: ()
            // InternalTQL.g:3262:3: 
            {
            }

             after(grammarAccess.getAndAccess().getAndLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__0__Impl"


    // $ANTLR start "rule__And__Group_1__1"
    // InternalTQL.g:3270:1: rule__And__Group_1__1 : rule__And__Group_1__1__Impl rule__And__Group_1__2 ;
    public final void rule__And__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:3274:1: ( rule__And__Group_1__1__Impl rule__And__Group_1__2 )
            // InternalTQL.g:3275:2: rule__And__Group_1__1__Impl rule__And__Group_1__2
            {
            pushFollow(FOLLOW_16);
            rule__And__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__1"


    // $ANTLR start "rule__And__Group_1__1__Impl"
    // InternalTQL.g:3282:1: rule__And__Group_1__1__Impl : ( ( rule__And__OperatorAssignment_1_1 ) ) ;
    public final void rule__And__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:3286:1: ( ( ( rule__And__OperatorAssignment_1_1 ) ) )
            // InternalTQL.g:3287:1: ( ( rule__And__OperatorAssignment_1_1 ) )
            {
            // InternalTQL.g:3287:1: ( ( rule__And__OperatorAssignment_1_1 ) )
            // InternalTQL.g:3288:2: ( rule__And__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAndAccess().getOperatorAssignment_1_1()); 
            // InternalTQL.g:3289:2: ( rule__And__OperatorAssignment_1_1 )
            // InternalTQL.g:3289:3: rule__And__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__And__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAndAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__1__Impl"


    // $ANTLR start "rule__And__Group_1__2"
    // InternalTQL.g:3297:1: rule__And__Group_1__2 : rule__And__Group_1__2__Impl ;
    public final void rule__And__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:3301:1: ( rule__And__Group_1__2__Impl )
            // InternalTQL.g:3302:2: rule__And__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__And__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__2"


    // $ANTLR start "rule__And__Group_1__2__Impl"
    // InternalTQL.g:3308:1: rule__And__Group_1__2__Impl : ( ( rule__And__RightAssignment_1_2 ) ) ;
    public final void rule__And__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:3312:1: ( ( ( rule__And__RightAssignment_1_2 ) ) )
            // InternalTQL.g:3313:1: ( ( rule__And__RightAssignment_1_2 ) )
            {
            // InternalTQL.g:3313:1: ( ( rule__And__RightAssignment_1_2 ) )
            // InternalTQL.g:3314:2: ( rule__And__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndAccess().getRightAssignment_1_2()); 
            // InternalTQL.g:3315:2: ( rule__And__RightAssignment_1_2 )
            // InternalTQL.g:3315:3: rule__And__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__And__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAndAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__2__Impl"


    // $ANTLR start "rule__Or__Group__0"
    // InternalTQL.g:3324:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:3328:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // InternalTQL.g:3329:2: rule__Or__Group__0__Impl rule__Or__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__Or__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Or__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__0"


    // $ANTLR start "rule__Or__Group__0__Impl"
    // InternalTQL.g:3336:1: rule__Or__Group__0__Impl : ( ruleEquals ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:3340:1: ( ( ruleEquals ) )
            // InternalTQL.g:3341:1: ( ruleEquals )
            {
            // InternalTQL.g:3341:1: ( ruleEquals )
            // InternalTQL.g:3342:2: ruleEquals
            {
             before(grammarAccess.getOrAccess().getEqualsParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEquals();

            state._fsp--;

             after(grammarAccess.getOrAccess().getEqualsParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__0__Impl"


    // $ANTLR start "rule__Or__Group__1"
    // InternalTQL.g:3351:1: rule__Or__Group__1 : rule__Or__Group__1__Impl ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:3355:1: ( rule__Or__Group__1__Impl )
            // InternalTQL.g:3356:2: rule__Or__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__1"


    // $ANTLR start "rule__Or__Group__1__Impl"
    // InternalTQL.g:3362:1: rule__Or__Group__1__Impl : ( ( rule__Or__Group_1__0 )* ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:3366:1: ( ( ( rule__Or__Group_1__0 )* ) )
            // InternalTQL.g:3367:1: ( ( rule__Or__Group_1__0 )* )
            {
            // InternalTQL.g:3367:1: ( ( rule__Or__Group_1__0 )* )
            // InternalTQL.g:3368:2: ( rule__Or__Group_1__0 )*
            {
             before(grammarAccess.getOrAccess().getGroup_1()); 
            // InternalTQL.g:3369:2: ( rule__Or__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==12) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalTQL.g:3369:3: rule__Or__Group_1__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Or__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getOrAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__1__Impl"


    // $ANTLR start "rule__Or__Group_1__0"
    // InternalTQL.g:3378:1: rule__Or__Group_1__0 : rule__Or__Group_1__0__Impl rule__Or__Group_1__1 ;
    public final void rule__Or__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:3382:1: ( rule__Or__Group_1__0__Impl rule__Or__Group_1__1 )
            // InternalTQL.g:3383:2: rule__Or__Group_1__0__Impl rule__Or__Group_1__1
            {
            pushFollow(FOLLOW_22);
            rule__Or__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Or__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__0"


    // $ANTLR start "rule__Or__Group_1__0__Impl"
    // InternalTQL.g:3390:1: rule__Or__Group_1__0__Impl : ( () ) ;
    public final void rule__Or__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:3394:1: ( ( () ) )
            // InternalTQL.g:3395:1: ( () )
            {
            // InternalTQL.g:3395:1: ( () )
            // InternalTQL.g:3396:2: ()
            {
             before(grammarAccess.getOrAccess().getOrLeftAction_1_0()); 
            // InternalTQL.g:3397:2: ()
            // InternalTQL.g:3397:3: 
            {
            }

             after(grammarAccess.getOrAccess().getOrLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__0__Impl"


    // $ANTLR start "rule__Or__Group_1__1"
    // InternalTQL.g:3405:1: rule__Or__Group_1__1 : rule__Or__Group_1__1__Impl rule__Or__Group_1__2 ;
    public final void rule__Or__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:3409:1: ( rule__Or__Group_1__1__Impl rule__Or__Group_1__2 )
            // InternalTQL.g:3410:2: rule__Or__Group_1__1__Impl rule__Or__Group_1__2
            {
            pushFollow(FOLLOW_16);
            rule__Or__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Or__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__1"


    // $ANTLR start "rule__Or__Group_1__1__Impl"
    // InternalTQL.g:3417:1: rule__Or__Group_1__1__Impl : ( ( rule__Or__OperatorAssignment_1_1 ) ) ;
    public final void rule__Or__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:3421:1: ( ( ( rule__Or__OperatorAssignment_1_1 ) ) )
            // InternalTQL.g:3422:1: ( ( rule__Or__OperatorAssignment_1_1 ) )
            {
            // InternalTQL.g:3422:1: ( ( rule__Or__OperatorAssignment_1_1 ) )
            // InternalTQL.g:3423:2: ( rule__Or__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getOrAccess().getOperatorAssignment_1_1()); 
            // InternalTQL.g:3424:2: ( rule__Or__OperatorAssignment_1_1 )
            // InternalTQL.g:3424:3: rule__Or__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Or__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getOrAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__1__Impl"


    // $ANTLR start "rule__Or__Group_1__2"
    // InternalTQL.g:3432:1: rule__Or__Group_1__2 : rule__Or__Group_1__2__Impl ;
    public final void rule__Or__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:3436:1: ( rule__Or__Group_1__2__Impl )
            // InternalTQL.g:3437:2: rule__Or__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__2"


    // $ANTLR start "rule__Or__Group_1__2__Impl"
    // InternalTQL.g:3443:1: rule__Or__Group_1__2__Impl : ( ( rule__Or__RightAssignment_1_2 ) ) ;
    public final void rule__Or__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:3447:1: ( ( ( rule__Or__RightAssignment_1_2 ) ) )
            // InternalTQL.g:3448:1: ( ( rule__Or__RightAssignment_1_2 ) )
            {
            // InternalTQL.g:3448:1: ( ( rule__Or__RightAssignment_1_2 ) )
            // InternalTQL.g:3449:2: ( rule__Or__RightAssignment_1_2 )
            {
             before(grammarAccess.getOrAccess().getRightAssignment_1_2()); 
            // InternalTQL.g:3450:2: ( rule__Or__RightAssignment_1_2 )
            // InternalTQL.g:3450:3: rule__Or__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Or__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getOrAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__2__Impl"


    // $ANTLR start "rule__Equals__Group__0"
    // InternalTQL.g:3459:1: rule__Equals__Group__0 : rule__Equals__Group__0__Impl rule__Equals__Group__1 ;
    public final void rule__Equals__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:3463:1: ( rule__Equals__Group__0__Impl rule__Equals__Group__1 )
            // InternalTQL.g:3464:2: rule__Equals__Group__0__Impl rule__Equals__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Equals__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equals__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equals__Group__0"


    // $ANTLR start "rule__Equals__Group__0__Impl"
    // InternalTQL.g:3471:1: rule__Equals__Group__0__Impl : ( ruleNotEquals ) ;
    public final void rule__Equals__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:3475:1: ( ( ruleNotEquals ) )
            // InternalTQL.g:3476:1: ( ruleNotEquals )
            {
            // InternalTQL.g:3476:1: ( ruleNotEquals )
            // InternalTQL.g:3477:2: ruleNotEquals
            {
             before(grammarAccess.getEqualsAccess().getNotEqualsParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleNotEquals();

            state._fsp--;

             after(grammarAccess.getEqualsAccess().getNotEqualsParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equals__Group__0__Impl"


    // $ANTLR start "rule__Equals__Group__1"
    // InternalTQL.g:3486:1: rule__Equals__Group__1 : rule__Equals__Group__1__Impl ;
    public final void rule__Equals__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:3490:1: ( rule__Equals__Group__1__Impl )
            // InternalTQL.g:3491:2: rule__Equals__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Equals__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equals__Group__1"


    // $ANTLR start "rule__Equals__Group__1__Impl"
    // InternalTQL.g:3497:1: rule__Equals__Group__1__Impl : ( ( rule__Equals__Group_1__0 )* ) ;
    public final void rule__Equals__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:3501:1: ( ( ( rule__Equals__Group_1__0 )* ) )
            // InternalTQL.g:3502:1: ( ( rule__Equals__Group_1__0 )* )
            {
            // InternalTQL.g:3502:1: ( ( rule__Equals__Group_1__0 )* )
            // InternalTQL.g:3503:2: ( rule__Equals__Group_1__0 )*
            {
             before(grammarAccess.getEqualsAccess().getGroup_1()); 
            // InternalTQL.g:3504:2: ( rule__Equals__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==13) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalTQL.g:3504:3: rule__Equals__Group_1__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Equals__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getEqualsAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equals__Group__1__Impl"


    // $ANTLR start "rule__Equals__Group_1__0"
    // InternalTQL.g:3513:1: rule__Equals__Group_1__0 : rule__Equals__Group_1__0__Impl rule__Equals__Group_1__1 ;
    public final void rule__Equals__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:3517:1: ( rule__Equals__Group_1__0__Impl rule__Equals__Group_1__1 )
            // InternalTQL.g:3518:2: rule__Equals__Group_1__0__Impl rule__Equals__Group_1__1
            {
            pushFollow(FOLLOW_24);
            rule__Equals__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equals__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equals__Group_1__0"


    // $ANTLR start "rule__Equals__Group_1__0__Impl"
    // InternalTQL.g:3525:1: rule__Equals__Group_1__0__Impl : ( () ) ;
    public final void rule__Equals__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:3529:1: ( ( () ) )
            // InternalTQL.g:3530:1: ( () )
            {
            // InternalTQL.g:3530:1: ( () )
            // InternalTQL.g:3531:2: ()
            {
             before(grammarAccess.getEqualsAccess().getEqualsLeftAction_1_0()); 
            // InternalTQL.g:3532:2: ()
            // InternalTQL.g:3532:3: 
            {
            }

             after(grammarAccess.getEqualsAccess().getEqualsLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equals__Group_1__0__Impl"


    // $ANTLR start "rule__Equals__Group_1__1"
    // InternalTQL.g:3540:1: rule__Equals__Group_1__1 : rule__Equals__Group_1__1__Impl rule__Equals__Group_1__2 ;
    public final void rule__Equals__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:3544:1: ( rule__Equals__Group_1__1__Impl rule__Equals__Group_1__2 )
            // InternalTQL.g:3545:2: rule__Equals__Group_1__1__Impl rule__Equals__Group_1__2
            {
            pushFollow(FOLLOW_16);
            rule__Equals__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equals__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equals__Group_1__1"


    // $ANTLR start "rule__Equals__Group_1__1__Impl"
    // InternalTQL.g:3552:1: rule__Equals__Group_1__1__Impl : ( ( rule__Equals__OperatorAssignment_1_1 ) ) ;
    public final void rule__Equals__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:3556:1: ( ( ( rule__Equals__OperatorAssignment_1_1 ) ) )
            // InternalTQL.g:3557:1: ( ( rule__Equals__OperatorAssignment_1_1 ) )
            {
            // InternalTQL.g:3557:1: ( ( rule__Equals__OperatorAssignment_1_1 ) )
            // InternalTQL.g:3558:2: ( rule__Equals__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getEqualsAccess().getOperatorAssignment_1_1()); 
            // InternalTQL.g:3559:2: ( rule__Equals__OperatorAssignment_1_1 )
            // InternalTQL.g:3559:3: rule__Equals__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Equals__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEqualsAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equals__Group_1__1__Impl"


    // $ANTLR start "rule__Equals__Group_1__2"
    // InternalTQL.g:3567:1: rule__Equals__Group_1__2 : rule__Equals__Group_1__2__Impl ;
    public final void rule__Equals__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:3571:1: ( rule__Equals__Group_1__2__Impl )
            // InternalTQL.g:3572:2: rule__Equals__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Equals__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equals__Group_1__2"


    // $ANTLR start "rule__Equals__Group_1__2__Impl"
    // InternalTQL.g:3578:1: rule__Equals__Group_1__2__Impl : ( ( rule__Equals__RightAssignment_1_2 ) ) ;
    public final void rule__Equals__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:3582:1: ( ( ( rule__Equals__RightAssignment_1_2 ) ) )
            // InternalTQL.g:3583:1: ( ( rule__Equals__RightAssignment_1_2 ) )
            {
            // InternalTQL.g:3583:1: ( ( rule__Equals__RightAssignment_1_2 ) )
            // InternalTQL.g:3584:2: ( rule__Equals__RightAssignment_1_2 )
            {
             before(grammarAccess.getEqualsAccess().getRightAssignment_1_2()); 
            // InternalTQL.g:3585:2: ( rule__Equals__RightAssignment_1_2 )
            // InternalTQL.g:3585:3: rule__Equals__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Equals__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getEqualsAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equals__Group_1__2__Impl"


    // $ANTLR start "rule__NotEquals__Group__0"
    // InternalTQL.g:3594:1: rule__NotEquals__Group__0 : rule__NotEquals__Group__0__Impl rule__NotEquals__Group__1 ;
    public final void rule__NotEquals__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:3598:1: ( rule__NotEquals__Group__0__Impl rule__NotEquals__Group__1 )
            // InternalTQL.g:3599:2: rule__NotEquals__Group__0__Impl rule__NotEquals__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__NotEquals__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NotEquals__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotEquals__Group__0"


    // $ANTLR start "rule__NotEquals__Group__0__Impl"
    // InternalTQL.g:3606:1: rule__NotEquals__Group__0__Impl : ( ruleLess ) ;
    public final void rule__NotEquals__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:3610:1: ( ( ruleLess ) )
            // InternalTQL.g:3611:1: ( ruleLess )
            {
            // InternalTQL.g:3611:1: ( ruleLess )
            // InternalTQL.g:3612:2: ruleLess
            {
             before(grammarAccess.getNotEqualsAccess().getLessParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleLess();

            state._fsp--;

             after(grammarAccess.getNotEqualsAccess().getLessParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotEquals__Group__0__Impl"


    // $ANTLR start "rule__NotEquals__Group__1"
    // InternalTQL.g:3621:1: rule__NotEquals__Group__1 : rule__NotEquals__Group__1__Impl ;
    public final void rule__NotEquals__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:3625:1: ( rule__NotEquals__Group__1__Impl )
            // InternalTQL.g:3626:2: rule__NotEquals__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NotEquals__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotEquals__Group__1"


    // $ANTLR start "rule__NotEquals__Group__1__Impl"
    // InternalTQL.g:3632:1: rule__NotEquals__Group__1__Impl : ( ( rule__NotEquals__Group_1__0 )* ) ;
    public final void rule__NotEquals__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:3636:1: ( ( ( rule__NotEquals__Group_1__0 )* ) )
            // InternalTQL.g:3637:1: ( ( rule__NotEquals__Group_1__0 )* )
            {
            // InternalTQL.g:3637:1: ( ( rule__NotEquals__Group_1__0 )* )
            // InternalTQL.g:3638:2: ( rule__NotEquals__Group_1__0 )*
            {
             before(grammarAccess.getNotEqualsAccess().getGroup_1()); 
            // InternalTQL.g:3639:2: ( rule__NotEquals__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==14) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalTQL.g:3639:3: rule__NotEquals__Group_1__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__NotEquals__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getNotEqualsAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotEquals__Group__1__Impl"


    // $ANTLR start "rule__NotEquals__Group_1__0"
    // InternalTQL.g:3648:1: rule__NotEquals__Group_1__0 : rule__NotEquals__Group_1__0__Impl rule__NotEquals__Group_1__1 ;
    public final void rule__NotEquals__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:3652:1: ( rule__NotEquals__Group_1__0__Impl rule__NotEquals__Group_1__1 )
            // InternalTQL.g:3653:2: rule__NotEquals__Group_1__0__Impl rule__NotEquals__Group_1__1
            {
            pushFollow(FOLLOW_26);
            rule__NotEquals__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NotEquals__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotEquals__Group_1__0"


    // $ANTLR start "rule__NotEquals__Group_1__0__Impl"
    // InternalTQL.g:3660:1: rule__NotEquals__Group_1__0__Impl : ( () ) ;
    public final void rule__NotEquals__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:3664:1: ( ( () ) )
            // InternalTQL.g:3665:1: ( () )
            {
            // InternalTQL.g:3665:1: ( () )
            // InternalTQL.g:3666:2: ()
            {
             before(grammarAccess.getNotEqualsAccess().getNotEqualsLeftAction_1_0()); 
            // InternalTQL.g:3667:2: ()
            // InternalTQL.g:3667:3: 
            {
            }

             after(grammarAccess.getNotEqualsAccess().getNotEqualsLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotEquals__Group_1__0__Impl"


    // $ANTLR start "rule__NotEquals__Group_1__1"
    // InternalTQL.g:3675:1: rule__NotEquals__Group_1__1 : rule__NotEquals__Group_1__1__Impl rule__NotEquals__Group_1__2 ;
    public final void rule__NotEquals__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:3679:1: ( rule__NotEquals__Group_1__1__Impl rule__NotEquals__Group_1__2 )
            // InternalTQL.g:3680:2: rule__NotEquals__Group_1__1__Impl rule__NotEquals__Group_1__2
            {
            pushFollow(FOLLOW_16);
            rule__NotEquals__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NotEquals__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotEquals__Group_1__1"


    // $ANTLR start "rule__NotEquals__Group_1__1__Impl"
    // InternalTQL.g:3687:1: rule__NotEquals__Group_1__1__Impl : ( ( rule__NotEquals__OperatorAssignment_1_1 ) ) ;
    public final void rule__NotEquals__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:3691:1: ( ( ( rule__NotEquals__OperatorAssignment_1_1 ) ) )
            // InternalTQL.g:3692:1: ( ( rule__NotEquals__OperatorAssignment_1_1 ) )
            {
            // InternalTQL.g:3692:1: ( ( rule__NotEquals__OperatorAssignment_1_1 ) )
            // InternalTQL.g:3693:2: ( rule__NotEquals__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getNotEqualsAccess().getOperatorAssignment_1_1()); 
            // InternalTQL.g:3694:2: ( rule__NotEquals__OperatorAssignment_1_1 )
            // InternalTQL.g:3694:3: rule__NotEquals__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__NotEquals__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getNotEqualsAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotEquals__Group_1__1__Impl"


    // $ANTLR start "rule__NotEquals__Group_1__2"
    // InternalTQL.g:3702:1: rule__NotEquals__Group_1__2 : rule__NotEquals__Group_1__2__Impl ;
    public final void rule__NotEquals__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:3706:1: ( rule__NotEquals__Group_1__2__Impl )
            // InternalTQL.g:3707:2: rule__NotEquals__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NotEquals__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotEquals__Group_1__2"


    // $ANTLR start "rule__NotEquals__Group_1__2__Impl"
    // InternalTQL.g:3713:1: rule__NotEquals__Group_1__2__Impl : ( ( rule__NotEquals__RightAssignment_1_2 ) ) ;
    public final void rule__NotEquals__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:3717:1: ( ( ( rule__NotEquals__RightAssignment_1_2 ) ) )
            // InternalTQL.g:3718:1: ( ( rule__NotEquals__RightAssignment_1_2 ) )
            {
            // InternalTQL.g:3718:1: ( ( rule__NotEquals__RightAssignment_1_2 ) )
            // InternalTQL.g:3719:2: ( rule__NotEquals__RightAssignment_1_2 )
            {
             before(grammarAccess.getNotEqualsAccess().getRightAssignment_1_2()); 
            // InternalTQL.g:3720:2: ( rule__NotEquals__RightAssignment_1_2 )
            // InternalTQL.g:3720:3: rule__NotEquals__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__NotEquals__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getNotEqualsAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotEquals__Group_1__2__Impl"


    // $ANTLR start "rule__Less__Group__0"
    // InternalTQL.g:3729:1: rule__Less__Group__0 : rule__Less__Group__0__Impl rule__Less__Group__1 ;
    public final void rule__Less__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:3733:1: ( rule__Less__Group__0__Impl rule__Less__Group__1 )
            // InternalTQL.g:3734:2: rule__Less__Group__0__Impl rule__Less__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__Less__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Less__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Less__Group__0"


    // $ANTLR start "rule__Less__Group__0__Impl"
    // InternalTQL.g:3741:1: rule__Less__Group__0__Impl : ( ruleGreater ) ;
    public final void rule__Less__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:3745:1: ( ( ruleGreater ) )
            // InternalTQL.g:3746:1: ( ruleGreater )
            {
            // InternalTQL.g:3746:1: ( ruleGreater )
            // InternalTQL.g:3747:2: ruleGreater
            {
             before(grammarAccess.getLessAccess().getGreaterParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleGreater();

            state._fsp--;

             after(grammarAccess.getLessAccess().getGreaterParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Less__Group__0__Impl"


    // $ANTLR start "rule__Less__Group__1"
    // InternalTQL.g:3756:1: rule__Less__Group__1 : rule__Less__Group__1__Impl ;
    public final void rule__Less__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:3760:1: ( rule__Less__Group__1__Impl )
            // InternalTQL.g:3761:2: rule__Less__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Less__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Less__Group__1"


    // $ANTLR start "rule__Less__Group__1__Impl"
    // InternalTQL.g:3767:1: rule__Less__Group__1__Impl : ( ( rule__Less__Group_1__0 )* ) ;
    public final void rule__Less__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:3771:1: ( ( ( rule__Less__Group_1__0 )* ) )
            // InternalTQL.g:3772:1: ( ( rule__Less__Group_1__0 )* )
            {
            // InternalTQL.g:3772:1: ( ( rule__Less__Group_1__0 )* )
            // InternalTQL.g:3773:2: ( rule__Less__Group_1__0 )*
            {
             before(grammarAccess.getLessAccess().getGroup_1()); 
            // InternalTQL.g:3774:2: ( rule__Less__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==15) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalTQL.g:3774:3: rule__Less__Group_1__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__Less__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getLessAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Less__Group__1__Impl"


    // $ANTLR start "rule__Less__Group_1__0"
    // InternalTQL.g:3783:1: rule__Less__Group_1__0 : rule__Less__Group_1__0__Impl rule__Less__Group_1__1 ;
    public final void rule__Less__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:3787:1: ( rule__Less__Group_1__0__Impl rule__Less__Group_1__1 )
            // InternalTQL.g:3788:2: rule__Less__Group_1__0__Impl rule__Less__Group_1__1
            {
            pushFollow(FOLLOW_28);
            rule__Less__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Less__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Less__Group_1__0"


    // $ANTLR start "rule__Less__Group_1__0__Impl"
    // InternalTQL.g:3795:1: rule__Less__Group_1__0__Impl : ( () ) ;
    public final void rule__Less__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:3799:1: ( ( () ) )
            // InternalTQL.g:3800:1: ( () )
            {
            // InternalTQL.g:3800:1: ( () )
            // InternalTQL.g:3801:2: ()
            {
             before(grammarAccess.getLessAccess().getLessLeftAction_1_0()); 
            // InternalTQL.g:3802:2: ()
            // InternalTQL.g:3802:3: 
            {
            }

             after(grammarAccess.getLessAccess().getLessLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Less__Group_1__0__Impl"


    // $ANTLR start "rule__Less__Group_1__1"
    // InternalTQL.g:3810:1: rule__Less__Group_1__1 : rule__Less__Group_1__1__Impl rule__Less__Group_1__2 ;
    public final void rule__Less__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:3814:1: ( rule__Less__Group_1__1__Impl rule__Less__Group_1__2 )
            // InternalTQL.g:3815:2: rule__Less__Group_1__1__Impl rule__Less__Group_1__2
            {
            pushFollow(FOLLOW_16);
            rule__Less__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Less__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Less__Group_1__1"


    // $ANTLR start "rule__Less__Group_1__1__Impl"
    // InternalTQL.g:3822:1: rule__Less__Group_1__1__Impl : ( ( rule__Less__OperatorAssignment_1_1 ) ) ;
    public final void rule__Less__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:3826:1: ( ( ( rule__Less__OperatorAssignment_1_1 ) ) )
            // InternalTQL.g:3827:1: ( ( rule__Less__OperatorAssignment_1_1 ) )
            {
            // InternalTQL.g:3827:1: ( ( rule__Less__OperatorAssignment_1_1 ) )
            // InternalTQL.g:3828:2: ( rule__Less__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getLessAccess().getOperatorAssignment_1_1()); 
            // InternalTQL.g:3829:2: ( rule__Less__OperatorAssignment_1_1 )
            // InternalTQL.g:3829:3: rule__Less__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Less__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getLessAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Less__Group_1__1__Impl"


    // $ANTLR start "rule__Less__Group_1__2"
    // InternalTQL.g:3837:1: rule__Less__Group_1__2 : rule__Less__Group_1__2__Impl ;
    public final void rule__Less__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:3841:1: ( rule__Less__Group_1__2__Impl )
            // InternalTQL.g:3842:2: rule__Less__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Less__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Less__Group_1__2"


    // $ANTLR start "rule__Less__Group_1__2__Impl"
    // InternalTQL.g:3848:1: rule__Less__Group_1__2__Impl : ( ( rule__Less__RightAssignment_1_2 ) ) ;
    public final void rule__Less__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:3852:1: ( ( ( rule__Less__RightAssignment_1_2 ) ) )
            // InternalTQL.g:3853:1: ( ( rule__Less__RightAssignment_1_2 ) )
            {
            // InternalTQL.g:3853:1: ( ( rule__Less__RightAssignment_1_2 ) )
            // InternalTQL.g:3854:2: ( rule__Less__RightAssignment_1_2 )
            {
             before(grammarAccess.getLessAccess().getRightAssignment_1_2()); 
            // InternalTQL.g:3855:2: ( rule__Less__RightAssignment_1_2 )
            // InternalTQL.g:3855:3: rule__Less__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Less__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getLessAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Less__Group_1__2__Impl"


    // $ANTLR start "rule__Greater__Group__0"
    // InternalTQL.g:3864:1: rule__Greater__Group__0 : rule__Greater__Group__0__Impl rule__Greater__Group__1 ;
    public final void rule__Greater__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:3868:1: ( rule__Greater__Group__0__Impl rule__Greater__Group__1 )
            // InternalTQL.g:3869:2: rule__Greater__Group__0__Impl rule__Greater__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__Greater__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Greater__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greater__Group__0"


    // $ANTLR start "rule__Greater__Group__0__Impl"
    // InternalTQL.g:3876:1: rule__Greater__Group__0__Impl : ( ruleMultiply ) ;
    public final void rule__Greater__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:3880:1: ( ( ruleMultiply ) )
            // InternalTQL.g:3881:1: ( ruleMultiply )
            {
            // InternalTQL.g:3881:1: ( ruleMultiply )
            // InternalTQL.g:3882:2: ruleMultiply
            {
             before(grammarAccess.getGreaterAccess().getMultiplyParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiply();

            state._fsp--;

             after(grammarAccess.getGreaterAccess().getMultiplyParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greater__Group__0__Impl"


    // $ANTLR start "rule__Greater__Group__1"
    // InternalTQL.g:3891:1: rule__Greater__Group__1 : rule__Greater__Group__1__Impl ;
    public final void rule__Greater__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:3895:1: ( rule__Greater__Group__1__Impl )
            // InternalTQL.g:3896:2: rule__Greater__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Greater__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greater__Group__1"


    // $ANTLR start "rule__Greater__Group__1__Impl"
    // InternalTQL.g:3902:1: rule__Greater__Group__1__Impl : ( ( rule__Greater__Group_1__0 )* ) ;
    public final void rule__Greater__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:3906:1: ( ( ( rule__Greater__Group_1__0 )* ) )
            // InternalTQL.g:3907:1: ( ( rule__Greater__Group_1__0 )* )
            {
            // InternalTQL.g:3907:1: ( ( rule__Greater__Group_1__0 )* )
            // InternalTQL.g:3908:2: ( rule__Greater__Group_1__0 )*
            {
             before(grammarAccess.getGreaterAccess().getGroup_1()); 
            // InternalTQL.g:3909:2: ( rule__Greater__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==16) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalTQL.g:3909:3: rule__Greater__Group_1__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__Greater__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getGreaterAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greater__Group__1__Impl"


    // $ANTLR start "rule__Greater__Group_1__0"
    // InternalTQL.g:3918:1: rule__Greater__Group_1__0 : rule__Greater__Group_1__0__Impl rule__Greater__Group_1__1 ;
    public final void rule__Greater__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:3922:1: ( rule__Greater__Group_1__0__Impl rule__Greater__Group_1__1 )
            // InternalTQL.g:3923:2: rule__Greater__Group_1__0__Impl rule__Greater__Group_1__1
            {
            pushFollow(FOLLOW_30);
            rule__Greater__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Greater__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greater__Group_1__0"


    // $ANTLR start "rule__Greater__Group_1__0__Impl"
    // InternalTQL.g:3930:1: rule__Greater__Group_1__0__Impl : ( () ) ;
    public final void rule__Greater__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:3934:1: ( ( () ) )
            // InternalTQL.g:3935:1: ( () )
            {
            // InternalTQL.g:3935:1: ( () )
            // InternalTQL.g:3936:2: ()
            {
             before(grammarAccess.getGreaterAccess().getGreaterLeftAction_1_0()); 
            // InternalTQL.g:3937:2: ()
            // InternalTQL.g:3937:3: 
            {
            }

             after(grammarAccess.getGreaterAccess().getGreaterLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greater__Group_1__0__Impl"


    // $ANTLR start "rule__Greater__Group_1__1"
    // InternalTQL.g:3945:1: rule__Greater__Group_1__1 : rule__Greater__Group_1__1__Impl rule__Greater__Group_1__2 ;
    public final void rule__Greater__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:3949:1: ( rule__Greater__Group_1__1__Impl rule__Greater__Group_1__2 )
            // InternalTQL.g:3950:2: rule__Greater__Group_1__1__Impl rule__Greater__Group_1__2
            {
            pushFollow(FOLLOW_16);
            rule__Greater__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Greater__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greater__Group_1__1"


    // $ANTLR start "rule__Greater__Group_1__1__Impl"
    // InternalTQL.g:3957:1: rule__Greater__Group_1__1__Impl : ( ( rule__Greater__OperatorAssignment_1_1 ) ) ;
    public final void rule__Greater__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:3961:1: ( ( ( rule__Greater__OperatorAssignment_1_1 ) ) )
            // InternalTQL.g:3962:1: ( ( rule__Greater__OperatorAssignment_1_1 ) )
            {
            // InternalTQL.g:3962:1: ( ( rule__Greater__OperatorAssignment_1_1 ) )
            // InternalTQL.g:3963:2: ( rule__Greater__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getGreaterAccess().getOperatorAssignment_1_1()); 
            // InternalTQL.g:3964:2: ( rule__Greater__OperatorAssignment_1_1 )
            // InternalTQL.g:3964:3: rule__Greater__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Greater__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getGreaterAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greater__Group_1__1__Impl"


    // $ANTLR start "rule__Greater__Group_1__2"
    // InternalTQL.g:3972:1: rule__Greater__Group_1__2 : rule__Greater__Group_1__2__Impl ;
    public final void rule__Greater__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:3976:1: ( rule__Greater__Group_1__2__Impl )
            // InternalTQL.g:3977:2: rule__Greater__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Greater__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greater__Group_1__2"


    // $ANTLR start "rule__Greater__Group_1__2__Impl"
    // InternalTQL.g:3983:1: rule__Greater__Group_1__2__Impl : ( ( rule__Greater__RightAssignment_1_2 ) ) ;
    public final void rule__Greater__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:3987:1: ( ( ( rule__Greater__RightAssignment_1_2 ) ) )
            // InternalTQL.g:3988:1: ( ( rule__Greater__RightAssignment_1_2 ) )
            {
            // InternalTQL.g:3988:1: ( ( rule__Greater__RightAssignment_1_2 ) )
            // InternalTQL.g:3989:2: ( rule__Greater__RightAssignment_1_2 )
            {
             before(grammarAccess.getGreaterAccess().getRightAssignment_1_2()); 
            // InternalTQL.g:3990:2: ( rule__Greater__RightAssignment_1_2 )
            // InternalTQL.g:3990:3: rule__Greater__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Greater__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getGreaterAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greater__Group_1__2__Impl"


    // $ANTLR start "rule__Multiply__Group__0"
    // InternalTQL.g:3999:1: rule__Multiply__Group__0 : rule__Multiply__Group__0__Impl rule__Multiply__Group__1 ;
    public final void rule__Multiply__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:4003:1: ( rule__Multiply__Group__0__Impl rule__Multiply__Group__1 )
            // InternalTQL.g:4004:2: rule__Multiply__Group__0__Impl rule__Multiply__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__Multiply__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiply__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiply__Group__0"


    // $ANTLR start "rule__Multiply__Group__0__Impl"
    // InternalTQL.g:4011:1: rule__Multiply__Group__0__Impl : ( ruleDivide ) ;
    public final void rule__Multiply__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:4015:1: ( ( ruleDivide ) )
            // InternalTQL.g:4016:1: ( ruleDivide )
            {
            // InternalTQL.g:4016:1: ( ruleDivide )
            // InternalTQL.g:4017:2: ruleDivide
            {
             before(grammarAccess.getMultiplyAccess().getDivideParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleDivide();

            state._fsp--;

             after(grammarAccess.getMultiplyAccess().getDivideParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiply__Group__0__Impl"


    // $ANTLR start "rule__Multiply__Group__1"
    // InternalTQL.g:4026:1: rule__Multiply__Group__1 : rule__Multiply__Group__1__Impl ;
    public final void rule__Multiply__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:4030:1: ( rule__Multiply__Group__1__Impl )
            // InternalTQL.g:4031:2: rule__Multiply__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiply__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiply__Group__1"


    // $ANTLR start "rule__Multiply__Group__1__Impl"
    // InternalTQL.g:4037:1: rule__Multiply__Group__1__Impl : ( ( rule__Multiply__Group_1__0 )* ) ;
    public final void rule__Multiply__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:4041:1: ( ( ( rule__Multiply__Group_1__0 )* ) )
            // InternalTQL.g:4042:1: ( ( rule__Multiply__Group_1__0 )* )
            {
            // InternalTQL.g:4042:1: ( ( rule__Multiply__Group_1__0 )* )
            // InternalTQL.g:4043:2: ( rule__Multiply__Group_1__0 )*
            {
             before(grammarAccess.getMultiplyAccess().getGroup_1()); 
            // InternalTQL.g:4044:2: ( rule__Multiply__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==17) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalTQL.g:4044:3: rule__Multiply__Group_1__0
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__Multiply__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getMultiplyAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiply__Group__1__Impl"


    // $ANTLR start "rule__Multiply__Group_1__0"
    // InternalTQL.g:4053:1: rule__Multiply__Group_1__0 : rule__Multiply__Group_1__0__Impl rule__Multiply__Group_1__1 ;
    public final void rule__Multiply__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:4057:1: ( rule__Multiply__Group_1__0__Impl rule__Multiply__Group_1__1 )
            // InternalTQL.g:4058:2: rule__Multiply__Group_1__0__Impl rule__Multiply__Group_1__1
            {
            pushFollow(FOLLOW_32);
            rule__Multiply__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiply__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiply__Group_1__0"


    // $ANTLR start "rule__Multiply__Group_1__0__Impl"
    // InternalTQL.g:4065:1: rule__Multiply__Group_1__0__Impl : ( () ) ;
    public final void rule__Multiply__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:4069:1: ( ( () ) )
            // InternalTQL.g:4070:1: ( () )
            {
            // InternalTQL.g:4070:1: ( () )
            // InternalTQL.g:4071:2: ()
            {
             before(grammarAccess.getMultiplyAccess().getMultiplyLeftAction_1_0()); 
            // InternalTQL.g:4072:2: ()
            // InternalTQL.g:4072:3: 
            {
            }

             after(grammarAccess.getMultiplyAccess().getMultiplyLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiply__Group_1__0__Impl"


    // $ANTLR start "rule__Multiply__Group_1__1"
    // InternalTQL.g:4080:1: rule__Multiply__Group_1__1 : rule__Multiply__Group_1__1__Impl rule__Multiply__Group_1__2 ;
    public final void rule__Multiply__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:4084:1: ( rule__Multiply__Group_1__1__Impl rule__Multiply__Group_1__2 )
            // InternalTQL.g:4085:2: rule__Multiply__Group_1__1__Impl rule__Multiply__Group_1__2
            {
            pushFollow(FOLLOW_16);
            rule__Multiply__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiply__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiply__Group_1__1"


    // $ANTLR start "rule__Multiply__Group_1__1__Impl"
    // InternalTQL.g:4092:1: rule__Multiply__Group_1__1__Impl : ( ( rule__Multiply__OperatorAssignment_1_1 ) ) ;
    public final void rule__Multiply__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:4096:1: ( ( ( rule__Multiply__OperatorAssignment_1_1 ) ) )
            // InternalTQL.g:4097:1: ( ( rule__Multiply__OperatorAssignment_1_1 ) )
            {
            // InternalTQL.g:4097:1: ( ( rule__Multiply__OperatorAssignment_1_1 ) )
            // InternalTQL.g:4098:2: ( rule__Multiply__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getMultiplyAccess().getOperatorAssignment_1_1()); 
            // InternalTQL.g:4099:2: ( rule__Multiply__OperatorAssignment_1_1 )
            // InternalTQL.g:4099:3: rule__Multiply__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Multiply__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiplyAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiply__Group_1__1__Impl"


    // $ANTLR start "rule__Multiply__Group_1__2"
    // InternalTQL.g:4107:1: rule__Multiply__Group_1__2 : rule__Multiply__Group_1__2__Impl ;
    public final void rule__Multiply__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:4111:1: ( rule__Multiply__Group_1__2__Impl )
            // InternalTQL.g:4112:2: rule__Multiply__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiply__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiply__Group_1__2"


    // $ANTLR start "rule__Multiply__Group_1__2__Impl"
    // InternalTQL.g:4118:1: rule__Multiply__Group_1__2__Impl : ( ( rule__Multiply__RightAssignment_1_2 ) ) ;
    public final void rule__Multiply__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:4122:1: ( ( ( rule__Multiply__RightAssignment_1_2 ) ) )
            // InternalTQL.g:4123:1: ( ( rule__Multiply__RightAssignment_1_2 ) )
            {
            // InternalTQL.g:4123:1: ( ( rule__Multiply__RightAssignment_1_2 ) )
            // InternalTQL.g:4124:2: ( rule__Multiply__RightAssignment_1_2 )
            {
             before(grammarAccess.getMultiplyAccess().getRightAssignment_1_2()); 
            // InternalTQL.g:4125:2: ( rule__Multiply__RightAssignment_1_2 )
            // InternalTQL.g:4125:3: rule__Multiply__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Multiply__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMultiplyAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiply__Group_1__2__Impl"


    // $ANTLR start "rule__Divide__Group__0"
    // InternalTQL.g:4134:1: rule__Divide__Group__0 : rule__Divide__Group__0__Impl rule__Divide__Group__1 ;
    public final void rule__Divide__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:4138:1: ( rule__Divide__Group__0__Impl rule__Divide__Group__1 )
            // InternalTQL.g:4139:2: rule__Divide__Group__0__Impl rule__Divide__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__Divide__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Divide__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Divide__Group__0"


    // $ANTLR start "rule__Divide__Group__0__Impl"
    // InternalTQL.g:4146:1: rule__Divide__Group__0__Impl : ( ruleAdd ) ;
    public final void rule__Divide__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:4150:1: ( ( ruleAdd ) )
            // InternalTQL.g:4151:1: ( ruleAdd )
            {
            // InternalTQL.g:4151:1: ( ruleAdd )
            // InternalTQL.g:4152:2: ruleAdd
            {
             before(grammarAccess.getDivideAccess().getAddParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAdd();

            state._fsp--;

             after(grammarAccess.getDivideAccess().getAddParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Divide__Group__0__Impl"


    // $ANTLR start "rule__Divide__Group__1"
    // InternalTQL.g:4161:1: rule__Divide__Group__1 : rule__Divide__Group__1__Impl ;
    public final void rule__Divide__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:4165:1: ( rule__Divide__Group__1__Impl )
            // InternalTQL.g:4166:2: rule__Divide__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Divide__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Divide__Group__1"


    // $ANTLR start "rule__Divide__Group__1__Impl"
    // InternalTQL.g:4172:1: rule__Divide__Group__1__Impl : ( ( rule__Divide__Group_1__0 )* ) ;
    public final void rule__Divide__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:4176:1: ( ( ( rule__Divide__Group_1__0 )* ) )
            // InternalTQL.g:4177:1: ( ( rule__Divide__Group_1__0 )* )
            {
            // InternalTQL.g:4177:1: ( ( rule__Divide__Group_1__0 )* )
            // InternalTQL.g:4178:2: ( rule__Divide__Group_1__0 )*
            {
             before(grammarAccess.getDivideAccess().getGroup_1()); 
            // InternalTQL.g:4179:2: ( rule__Divide__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==18) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalTQL.g:4179:3: rule__Divide__Group_1__0
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__Divide__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getDivideAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Divide__Group__1__Impl"


    // $ANTLR start "rule__Divide__Group_1__0"
    // InternalTQL.g:4188:1: rule__Divide__Group_1__0 : rule__Divide__Group_1__0__Impl rule__Divide__Group_1__1 ;
    public final void rule__Divide__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:4192:1: ( rule__Divide__Group_1__0__Impl rule__Divide__Group_1__1 )
            // InternalTQL.g:4193:2: rule__Divide__Group_1__0__Impl rule__Divide__Group_1__1
            {
            pushFollow(FOLLOW_34);
            rule__Divide__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Divide__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Divide__Group_1__0"


    // $ANTLR start "rule__Divide__Group_1__0__Impl"
    // InternalTQL.g:4200:1: rule__Divide__Group_1__0__Impl : ( () ) ;
    public final void rule__Divide__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:4204:1: ( ( () ) )
            // InternalTQL.g:4205:1: ( () )
            {
            // InternalTQL.g:4205:1: ( () )
            // InternalTQL.g:4206:2: ()
            {
             before(grammarAccess.getDivideAccess().getDivideLeftAction_1_0()); 
            // InternalTQL.g:4207:2: ()
            // InternalTQL.g:4207:3: 
            {
            }

             after(grammarAccess.getDivideAccess().getDivideLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Divide__Group_1__0__Impl"


    // $ANTLR start "rule__Divide__Group_1__1"
    // InternalTQL.g:4215:1: rule__Divide__Group_1__1 : rule__Divide__Group_1__1__Impl rule__Divide__Group_1__2 ;
    public final void rule__Divide__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:4219:1: ( rule__Divide__Group_1__1__Impl rule__Divide__Group_1__2 )
            // InternalTQL.g:4220:2: rule__Divide__Group_1__1__Impl rule__Divide__Group_1__2
            {
            pushFollow(FOLLOW_16);
            rule__Divide__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Divide__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Divide__Group_1__1"


    // $ANTLR start "rule__Divide__Group_1__1__Impl"
    // InternalTQL.g:4227:1: rule__Divide__Group_1__1__Impl : ( ( rule__Divide__OperatorAssignment_1_1 ) ) ;
    public final void rule__Divide__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:4231:1: ( ( ( rule__Divide__OperatorAssignment_1_1 ) ) )
            // InternalTQL.g:4232:1: ( ( rule__Divide__OperatorAssignment_1_1 ) )
            {
            // InternalTQL.g:4232:1: ( ( rule__Divide__OperatorAssignment_1_1 ) )
            // InternalTQL.g:4233:2: ( rule__Divide__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getDivideAccess().getOperatorAssignment_1_1()); 
            // InternalTQL.g:4234:2: ( rule__Divide__OperatorAssignment_1_1 )
            // InternalTQL.g:4234:3: rule__Divide__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Divide__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDivideAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Divide__Group_1__1__Impl"


    // $ANTLR start "rule__Divide__Group_1__2"
    // InternalTQL.g:4242:1: rule__Divide__Group_1__2 : rule__Divide__Group_1__2__Impl ;
    public final void rule__Divide__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:4246:1: ( rule__Divide__Group_1__2__Impl )
            // InternalTQL.g:4247:2: rule__Divide__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Divide__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Divide__Group_1__2"


    // $ANTLR start "rule__Divide__Group_1__2__Impl"
    // InternalTQL.g:4253:1: rule__Divide__Group_1__2__Impl : ( ( rule__Divide__RightAssignment_1_2 ) ) ;
    public final void rule__Divide__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:4257:1: ( ( ( rule__Divide__RightAssignment_1_2 ) ) )
            // InternalTQL.g:4258:1: ( ( rule__Divide__RightAssignment_1_2 ) )
            {
            // InternalTQL.g:4258:1: ( ( rule__Divide__RightAssignment_1_2 ) )
            // InternalTQL.g:4259:2: ( rule__Divide__RightAssignment_1_2 )
            {
             before(grammarAccess.getDivideAccess().getRightAssignment_1_2()); 
            // InternalTQL.g:4260:2: ( rule__Divide__RightAssignment_1_2 )
            // InternalTQL.g:4260:3: rule__Divide__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Divide__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getDivideAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Divide__Group_1__2__Impl"


    // $ANTLR start "rule__Add__Group__0"
    // InternalTQL.g:4269:1: rule__Add__Group__0 : rule__Add__Group__0__Impl rule__Add__Group__1 ;
    public final void rule__Add__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:4273:1: ( rule__Add__Group__0__Impl rule__Add__Group__1 )
            // InternalTQL.g:4274:2: rule__Add__Group__0__Impl rule__Add__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__Add__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Add__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__Group__0"


    // $ANTLR start "rule__Add__Group__0__Impl"
    // InternalTQL.g:4281:1: rule__Add__Group__0__Impl : ( ruleSubtract ) ;
    public final void rule__Add__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:4285:1: ( ( ruleSubtract ) )
            // InternalTQL.g:4286:1: ( ruleSubtract )
            {
            // InternalTQL.g:4286:1: ( ruleSubtract )
            // InternalTQL.g:4287:2: ruleSubtract
            {
             before(grammarAccess.getAddAccess().getSubtractParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleSubtract();

            state._fsp--;

             after(grammarAccess.getAddAccess().getSubtractParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__Group__0__Impl"


    // $ANTLR start "rule__Add__Group__1"
    // InternalTQL.g:4296:1: rule__Add__Group__1 : rule__Add__Group__1__Impl ;
    public final void rule__Add__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:4300:1: ( rule__Add__Group__1__Impl )
            // InternalTQL.g:4301:2: rule__Add__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Add__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__Group__1"


    // $ANTLR start "rule__Add__Group__1__Impl"
    // InternalTQL.g:4307:1: rule__Add__Group__1__Impl : ( ( rule__Add__Group_1__0 )* ) ;
    public final void rule__Add__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:4311:1: ( ( ( rule__Add__Group_1__0 )* ) )
            // InternalTQL.g:4312:1: ( ( rule__Add__Group_1__0 )* )
            {
            // InternalTQL.g:4312:1: ( ( rule__Add__Group_1__0 )* )
            // InternalTQL.g:4313:2: ( rule__Add__Group_1__0 )*
            {
             before(grammarAccess.getAddAccess().getGroup_1()); 
            // InternalTQL.g:4314:2: ( rule__Add__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==19) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalTQL.g:4314:3: rule__Add__Group_1__0
            	    {
            	    pushFollow(FOLLOW_37);
            	    rule__Add__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getAddAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__Group__1__Impl"


    // $ANTLR start "rule__Add__Group_1__0"
    // InternalTQL.g:4323:1: rule__Add__Group_1__0 : rule__Add__Group_1__0__Impl rule__Add__Group_1__1 ;
    public final void rule__Add__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:4327:1: ( rule__Add__Group_1__0__Impl rule__Add__Group_1__1 )
            // InternalTQL.g:4328:2: rule__Add__Group_1__0__Impl rule__Add__Group_1__1
            {
            pushFollow(FOLLOW_36);
            rule__Add__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Add__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__Group_1__0"


    // $ANTLR start "rule__Add__Group_1__0__Impl"
    // InternalTQL.g:4335:1: rule__Add__Group_1__0__Impl : ( () ) ;
    public final void rule__Add__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:4339:1: ( ( () ) )
            // InternalTQL.g:4340:1: ( () )
            {
            // InternalTQL.g:4340:1: ( () )
            // InternalTQL.g:4341:2: ()
            {
             before(grammarAccess.getAddAccess().getAddLeftAction_1_0()); 
            // InternalTQL.g:4342:2: ()
            // InternalTQL.g:4342:3: 
            {
            }

             after(grammarAccess.getAddAccess().getAddLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__Group_1__0__Impl"


    // $ANTLR start "rule__Add__Group_1__1"
    // InternalTQL.g:4350:1: rule__Add__Group_1__1 : rule__Add__Group_1__1__Impl rule__Add__Group_1__2 ;
    public final void rule__Add__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:4354:1: ( rule__Add__Group_1__1__Impl rule__Add__Group_1__2 )
            // InternalTQL.g:4355:2: rule__Add__Group_1__1__Impl rule__Add__Group_1__2
            {
            pushFollow(FOLLOW_16);
            rule__Add__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Add__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__Group_1__1"


    // $ANTLR start "rule__Add__Group_1__1__Impl"
    // InternalTQL.g:4362:1: rule__Add__Group_1__1__Impl : ( ( rule__Add__OperatorAssignment_1_1 ) ) ;
    public final void rule__Add__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:4366:1: ( ( ( rule__Add__OperatorAssignment_1_1 ) ) )
            // InternalTQL.g:4367:1: ( ( rule__Add__OperatorAssignment_1_1 ) )
            {
            // InternalTQL.g:4367:1: ( ( rule__Add__OperatorAssignment_1_1 ) )
            // InternalTQL.g:4368:2: ( rule__Add__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAddAccess().getOperatorAssignment_1_1()); 
            // InternalTQL.g:4369:2: ( rule__Add__OperatorAssignment_1_1 )
            // InternalTQL.g:4369:3: rule__Add__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Add__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAddAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__Group_1__1__Impl"


    // $ANTLR start "rule__Add__Group_1__2"
    // InternalTQL.g:4377:1: rule__Add__Group_1__2 : rule__Add__Group_1__2__Impl ;
    public final void rule__Add__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:4381:1: ( rule__Add__Group_1__2__Impl )
            // InternalTQL.g:4382:2: rule__Add__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Add__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__Group_1__2"


    // $ANTLR start "rule__Add__Group_1__2__Impl"
    // InternalTQL.g:4388:1: rule__Add__Group_1__2__Impl : ( ( rule__Add__RightAssignment_1_2 ) ) ;
    public final void rule__Add__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:4392:1: ( ( ( rule__Add__RightAssignment_1_2 ) ) )
            // InternalTQL.g:4393:1: ( ( rule__Add__RightAssignment_1_2 ) )
            {
            // InternalTQL.g:4393:1: ( ( rule__Add__RightAssignment_1_2 ) )
            // InternalTQL.g:4394:2: ( rule__Add__RightAssignment_1_2 )
            {
             before(grammarAccess.getAddAccess().getRightAssignment_1_2()); 
            // InternalTQL.g:4395:2: ( rule__Add__RightAssignment_1_2 )
            // InternalTQL.g:4395:3: rule__Add__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Add__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAddAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__Group_1__2__Impl"


    // $ANTLR start "rule__Subtract__Group__0"
    // InternalTQL.g:4404:1: rule__Subtract__Group__0 : rule__Subtract__Group__0__Impl rule__Subtract__Group__1 ;
    public final void rule__Subtract__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:4408:1: ( rule__Subtract__Group__0__Impl rule__Subtract__Group__1 )
            // InternalTQL.g:4409:2: rule__Subtract__Group__0__Impl rule__Subtract__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__Subtract__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subtract__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtract__Group__0"


    // $ANTLR start "rule__Subtract__Group__0__Impl"
    // InternalTQL.g:4416:1: rule__Subtract__Group__0__Impl : ( ruleLiterals ) ;
    public final void rule__Subtract__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:4420:1: ( ( ruleLiterals ) )
            // InternalTQL.g:4421:1: ( ruleLiterals )
            {
            // InternalTQL.g:4421:1: ( ruleLiterals )
            // InternalTQL.g:4422:2: ruleLiterals
            {
             before(grammarAccess.getSubtractAccess().getLiteralsParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleLiterals();

            state._fsp--;

             after(grammarAccess.getSubtractAccess().getLiteralsParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtract__Group__0__Impl"


    // $ANTLR start "rule__Subtract__Group__1"
    // InternalTQL.g:4431:1: rule__Subtract__Group__1 : rule__Subtract__Group__1__Impl ;
    public final void rule__Subtract__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:4435:1: ( rule__Subtract__Group__1__Impl )
            // InternalTQL.g:4436:2: rule__Subtract__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Subtract__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtract__Group__1"


    // $ANTLR start "rule__Subtract__Group__1__Impl"
    // InternalTQL.g:4442:1: rule__Subtract__Group__1__Impl : ( ( rule__Subtract__Group_1__0 )* ) ;
    public final void rule__Subtract__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:4446:1: ( ( ( rule__Subtract__Group_1__0 )* ) )
            // InternalTQL.g:4447:1: ( ( rule__Subtract__Group_1__0 )* )
            {
            // InternalTQL.g:4447:1: ( ( rule__Subtract__Group_1__0 )* )
            // InternalTQL.g:4448:2: ( rule__Subtract__Group_1__0 )*
            {
             before(grammarAccess.getSubtractAccess().getGroup_1()); 
            // InternalTQL.g:4449:2: ( rule__Subtract__Group_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==20) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalTQL.g:4449:3: rule__Subtract__Group_1__0
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__Subtract__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getSubtractAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtract__Group__1__Impl"


    // $ANTLR start "rule__Subtract__Group_1__0"
    // InternalTQL.g:4458:1: rule__Subtract__Group_1__0 : rule__Subtract__Group_1__0__Impl rule__Subtract__Group_1__1 ;
    public final void rule__Subtract__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:4462:1: ( rule__Subtract__Group_1__0__Impl rule__Subtract__Group_1__1 )
            // InternalTQL.g:4463:2: rule__Subtract__Group_1__0__Impl rule__Subtract__Group_1__1
            {
            pushFollow(FOLLOW_38);
            rule__Subtract__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subtract__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtract__Group_1__0"


    // $ANTLR start "rule__Subtract__Group_1__0__Impl"
    // InternalTQL.g:4470:1: rule__Subtract__Group_1__0__Impl : ( () ) ;
    public final void rule__Subtract__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:4474:1: ( ( () ) )
            // InternalTQL.g:4475:1: ( () )
            {
            // InternalTQL.g:4475:1: ( () )
            // InternalTQL.g:4476:2: ()
            {
             before(grammarAccess.getSubtractAccess().getSubtractLeftAction_1_0()); 
            // InternalTQL.g:4477:2: ()
            // InternalTQL.g:4477:3: 
            {
            }

             after(grammarAccess.getSubtractAccess().getSubtractLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtract__Group_1__0__Impl"


    // $ANTLR start "rule__Subtract__Group_1__1"
    // InternalTQL.g:4485:1: rule__Subtract__Group_1__1 : rule__Subtract__Group_1__1__Impl rule__Subtract__Group_1__2 ;
    public final void rule__Subtract__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:4489:1: ( rule__Subtract__Group_1__1__Impl rule__Subtract__Group_1__2 )
            // InternalTQL.g:4490:2: rule__Subtract__Group_1__1__Impl rule__Subtract__Group_1__2
            {
            pushFollow(FOLLOW_16);
            rule__Subtract__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subtract__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtract__Group_1__1"


    // $ANTLR start "rule__Subtract__Group_1__1__Impl"
    // InternalTQL.g:4497:1: rule__Subtract__Group_1__1__Impl : ( ( rule__Subtract__OperatorAssignment_1_1 ) ) ;
    public final void rule__Subtract__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:4501:1: ( ( ( rule__Subtract__OperatorAssignment_1_1 ) ) )
            // InternalTQL.g:4502:1: ( ( rule__Subtract__OperatorAssignment_1_1 ) )
            {
            // InternalTQL.g:4502:1: ( ( rule__Subtract__OperatorAssignment_1_1 ) )
            // InternalTQL.g:4503:2: ( rule__Subtract__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getSubtractAccess().getOperatorAssignment_1_1()); 
            // InternalTQL.g:4504:2: ( rule__Subtract__OperatorAssignment_1_1 )
            // InternalTQL.g:4504:3: rule__Subtract__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Subtract__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSubtractAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtract__Group_1__1__Impl"


    // $ANTLR start "rule__Subtract__Group_1__2"
    // InternalTQL.g:4512:1: rule__Subtract__Group_1__2 : rule__Subtract__Group_1__2__Impl ;
    public final void rule__Subtract__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:4516:1: ( rule__Subtract__Group_1__2__Impl )
            // InternalTQL.g:4517:2: rule__Subtract__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Subtract__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtract__Group_1__2"


    // $ANTLR start "rule__Subtract__Group_1__2__Impl"
    // InternalTQL.g:4523:1: rule__Subtract__Group_1__2__Impl : ( ( rule__Subtract__RightAssignment_1_2 ) ) ;
    public final void rule__Subtract__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:4527:1: ( ( ( rule__Subtract__RightAssignment_1_2 ) ) )
            // InternalTQL.g:4528:1: ( ( rule__Subtract__RightAssignment_1_2 ) )
            {
            // InternalTQL.g:4528:1: ( ( rule__Subtract__RightAssignment_1_2 ) )
            // InternalTQL.g:4529:2: ( rule__Subtract__RightAssignment_1_2 )
            {
             before(grammarAccess.getSubtractAccess().getRightAssignment_1_2()); 
            // InternalTQL.g:4530:2: ( rule__Subtract__RightAssignment_1_2 )
            // InternalTQL.g:4530:3: rule__Subtract__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Subtract__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getSubtractAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtract__Group_1__2__Impl"


    // $ANTLR start "rule__String_Constant__Group__0"
    // InternalTQL.g:4539:1: rule__String_Constant__Group__0 : rule__String_Constant__Group__0__Impl rule__String_Constant__Group__1 ;
    public final void rule__String_Constant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:4543:1: ( rule__String_Constant__Group__0__Impl rule__String_Constant__Group__1 )
            // InternalTQL.g:4544:2: rule__String_Constant__Group__0__Impl rule__String_Constant__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__String_Constant__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__String_Constant__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__String_Constant__Group__0"


    // $ANTLR start "rule__String_Constant__Group__0__Impl"
    // InternalTQL.g:4551:1: rule__String_Constant__Group__0__Impl : ( '\"' ) ;
    public final void rule__String_Constant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:4555:1: ( ( '\"' ) )
            // InternalTQL.g:4556:1: ( '\"' )
            {
            // InternalTQL.g:4556:1: ( '\"' )
            // InternalTQL.g:4557:2: '\"'
            {
             before(grammarAccess.getString_ConstantAccess().getQuotationMarkKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getString_ConstantAccess().getQuotationMarkKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__String_Constant__Group__0__Impl"


    // $ANTLR start "rule__String_Constant__Group__1"
    // InternalTQL.g:4566:1: rule__String_Constant__Group__1 : rule__String_Constant__Group__1__Impl rule__String_Constant__Group__2 ;
    public final void rule__String_Constant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:4570:1: ( rule__String_Constant__Group__1__Impl rule__String_Constant__Group__2 )
            // InternalTQL.g:4571:2: rule__String_Constant__Group__1__Impl rule__String_Constant__Group__2
            {
            pushFollow(FOLLOW_40);
            rule__String_Constant__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__String_Constant__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__String_Constant__Group__1"


    // $ANTLR start "rule__String_Constant__Group__1__Impl"
    // InternalTQL.g:4578:1: rule__String_Constant__Group__1__Impl : ( ( rule__String_Constant__ValueAssignment_1 ) ) ;
    public final void rule__String_Constant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:4582:1: ( ( ( rule__String_Constant__ValueAssignment_1 ) ) )
            // InternalTQL.g:4583:1: ( ( rule__String_Constant__ValueAssignment_1 ) )
            {
            // InternalTQL.g:4583:1: ( ( rule__String_Constant__ValueAssignment_1 ) )
            // InternalTQL.g:4584:2: ( rule__String_Constant__ValueAssignment_1 )
            {
             before(grammarAccess.getString_ConstantAccess().getValueAssignment_1()); 
            // InternalTQL.g:4585:2: ( rule__String_Constant__ValueAssignment_1 )
            // InternalTQL.g:4585:3: rule__String_Constant__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__String_Constant__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getString_ConstantAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__String_Constant__Group__1__Impl"


    // $ANTLR start "rule__String_Constant__Group__2"
    // InternalTQL.g:4593:1: rule__String_Constant__Group__2 : rule__String_Constant__Group__2__Impl ;
    public final void rule__String_Constant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:4597:1: ( rule__String_Constant__Group__2__Impl )
            // InternalTQL.g:4598:2: rule__String_Constant__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__String_Constant__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__String_Constant__Group__2"


    // $ANTLR start "rule__String_Constant__Group__2__Impl"
    // InternalTQL.g:4604:1: rule__String_Constant__Group__2__Impl : ( '\"' ) ;
    public final void rule__String_Constant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:4608:1: ( ( '\"' ) )
            // InternalTQL.g:4609:1: ( '\"' )
            {
            // InternalTQL.g:4609:1: ( '\"' )
            // InternalTQL.g:4610:2: '\"'
            {
             before(grammarAccess.getString_ConstantAccess().getQuotationMarkKeyword_2()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getString_ConstantAccess().getQuotationMarkKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__String_Constant__Group__2__Impl"


    // $ANTLR start "rule__Null_Constant__Group__0"
    // InternalTQL.g:4620:1: rule__Null_Constant__Group__0 : rule__Null_Constant__Group__0__Impl rule__Null_Constant__Group__1 ;
    public final void rule__Null_Constant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:4624:1: ( rule__Null_Constant__Group__0__Impl rule__Null_Constant__Group__1 )
            // InternalTQL.g:4625:2: rule__Null_Constant__Group__0__Impl rule__Null_Constant__Group__1
            {
            pushFollow(FOLLOW_41);
            rule__Null_Constant__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Null_Constant__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Null_Constant__Group__0"


    // $ANTLR start "rule__Null_Constant__Group__0__Impl"
    // InternalTQL.g:4632:1: rule__Null_Constant__Group__0__Impl : ( () ) ;
    public final void rule__Null_Constant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:4636:1: ( ( () ) )
            // InternalTQL.g:4637:1: ( () )
            {
            // InternalTQL.g:4637:1: ( () )
            // InternalTQL.g:4638:2: ()
            {
             before(grammarAccess.getNull_ConstantAccess().getNullConstantAction_0()); 
            // InternalTQL.g:4639:2: ()
            // InternalTQL.g:4639:3: 
            {
            }

             after(grammarAccess.getNull_ConstantAccess().getNullConstantAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Null_Constant__Group__0__Impl"


    // $ANTLR start "rule__Null_Constant__Group__1"
    // InternalTQL.g:4647:1: rule__Null_Constant__Group__1 : rule__Null_Constant__Group__1__Impl ;
    public final void rule__Null_Constant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:4651:1: ( rule__Null_Constant__Group__1__Impl )
            // InternalTQL.g:4652:2: rule__Null_Constant__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Null_Constant__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Null_Constant__Group__1"


    // $ANTLR start "rule__Null_Constant__Group__1__Impl"
    // InternalTQL.g:4658:1: rule__Null_Constant__Group__1__Impl : ( 'null' ) ;
    public final void rule__Null_Constant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:4662:1: ( ( 'null' ) )
            // InternalTQL.g:4663:1: ( 'null' )
            {
            // InternalTQL.g:4663:1: ( 'null' )
            // InternalTQL.g:4664:2: 'null'
            {
             before(grammarAccess.getNull_ConstantAccess().getNullKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getNull_ConstantAccess().getNullKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Null_Constant__Group__1__Impl"


    // $ANTLR start "rule__Set_Constant__Group__0"
    // InternalTQL.g:4674:1: rule__Set_Constant__Group__0 : rule__Set_Constant__Group__0__Impl rule__Set_Constant__Group__1 ;
    public final void rule__Set_Constant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:4678:1: ( rule__Set_Constant__Group__0__Impl rule__Set_Constant__Group__1 )
            // InternalTQL.g:4679:2: rule__Set_Constant__Group__0__Impl rule__Set_Constant__Group__1
            {
            pushFollow(FOLLOW_42);
            rule__Set_Constant__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Set_Constant__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set_Constant__Group__0"


    // $ANTLR start "rule__Set_Constant__Group__0__Impl"
    // InternalTQL.g:4686:1: rule__Set_Constant__Group__0__Impl : ( () ) ;
    public final void rule__Set_Constant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:4690:1: ( ( () ) )
            // InternalTQL.g:4691:1: ( () )
            {
            // InternalTQL.g:4691:1: ( () )
            // InternalTQL.g:4692:2: ()
            {
             before(grammarAccess.getSet_ConstantAccess().getSetConstantAction_0()); 
            // InternalTQL.g:4693:2: ()
            // InternalTQL.g:4693:3: 
            {
            }

             after(grammarAccess.getSet_ConstantAccess().getSetConstantAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set_Constant__Group__0__Impl"


    // $ANTLR start "rule__Set_Constant__Group__1"
    // InternalTQL.g:4701:1: rule__Set_Constant__Group__1 : rule__Set_Constant__Group__1__Impl rule__Set_Constant__Group__2 ;
    public final void rule__Set_Constant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:4705:1: ( rule__Set_Constant__Group__1__Impl rule__Set_Constant__Group__2 )
            // InternalTQL.g:4706:2: rule__Set_Constant__Group__1__Impl rule__Set_Constant__Group__2
            {
            pushFollow(FOLLOW_43);
            rule__Set_Constant__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Set_Constant__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set_Constant__Group__1"


    // $ANTLR start "rule__Set_Constant__Group__1__Impl"
    // InternalTQL.g:4713:1: rule__Set_Constant__Group__1__Impl : ( '[' ) ;
    public final void rule__Set_Constant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:4717:1: ( ( '[' ) )
            // InternalTQL.g:4718:1: ( '[' )
            {
            // InternalTQL.g:4718:1: ( '[' )
            // InternalTQL.g:4719:2: '['
            {
             before(grammarAccess.getSet_ConstantAccess().getLeftSquareBracketKeyword_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getSet_ConstantAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set_Constant__Group__1__Impl"


    // $ANTLR start "rule__Set_Constant__Group__2"
    // InternalTQL.g:4728:1: rule__Set_Constant__Group__2 : rule__Set_Constant__Group__2__Impl rule__Set_Constant__Group__3 ;
    public final void rule__Set_Constant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:4732:1: ( rule__Set_Constant__Group__2__Impl rule__Set_Constant__Group__3 )
            // InternalTQL.g:4733:2: rule__Set_Constant__Group__2__Impl rule__Set_Constant__Group__3
            {
            pushFollow(FOLLOW_43);
            rule__Set_Constant__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Set_Constant__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set_Constant__Group__2"


    // $ANTLR start "rule__Set_Constant__Group__2__Impl"
    // InternalTQL.g:4740:1: rule__Set_Constant__Group__2__Impl : ( ( rule__Set_Constant__Group_2__0 )? ) ;
    public final void rule__Set_Constant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:4744:1: ( ( ( rule__Set_Constant__Group_2__0 )? ) )
            // InternalTQL.g:4745:1: ( ( rule__Set_Constant__Group_2__0 )? )
            {
            // InternalTQL.g:4745:1: ( ( rule__Set_Constant__Group_2__0 )? )
            // InternalTQL.g:4746:2: ( rule__Set_Constant__Group_2__0 )?
            {
             before(grammarAccess.getSet_ConstantAccess().getGroup_2()); 
            // InternalTQL.g:4747:2: ( rule__Set_Constant__Group_2__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_INT||(LA30_0>=20 && LA30_0<=22)||LA30_0==29||LA30_0==44||LA30_0==47) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalTQL.g:4747:3: rule__Set_Constant__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Set_Constant__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSet_ConstantAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set_Constant__Group__2__Impl"


    // $ANTLR start "rule__Set_Constant__Group__3"
    // InternalTQL.g:4755:1: rule__Set_Constant__Group__3 : rule__Set_Constant__Group__3__Impl ;
    public final void rule__Set_Constant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:4759:1: ( rule__Set_Constant__Group__3__Impl )
            // InternalTQL.g:4760:2: rule__Set_Constant__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Set_Constant__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set_Constant__Group__3"


    // $ANTLR start "rule__Set_Constant__Group__3__Impl"
    // InternalTQL.g:4766:1: rule__Set_Constant__Group__3__Impl : ( ']' ) ;
    public final void rule__Set_Constant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:4770:1: ( ( ']' ) )
            // InternalTQL.g:4771:1: ( ']' )
            {
            // InternalTQL.g:4771:1: ( ']' )
            // InternalTQL.g:4772:2: ']'
            {
             before(grammarAccess.getSet_ConstantAccess().getRightSquareBracketKeyword_3()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getSet_ConstantAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set_Constant__Group__3__Impl"


    // $ANTLR start "rule__Set_Constant__Group_2__0"
    // InternalTQL.g:4782:1: rule__Set_Constant__Group_2__0 : rule__Set_Constant__Group_2__0__Impl rule__Set_Constant__Group_2__1 ;
    public final void rule__Set_Constant__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:4786:1: ( rule__Set_Constant__Group_2__0__Impl rule__Set_Constant__Group_2__1 )
            // InternalTQL.g:4787:2: rule__Set_Constant__Group_2__0__Impl rule__Set_Constant__Group_2__1
            {
            pushFollow(FOLLOW_15);
            rule__Set_Constant__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Set_Constant__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set_Constant__Group_2__0"


    // $ANTLR start "rule__Set_Constant__Group_2__0__Impl"
    // InternalTQL.g:4794:1: rule__Set_Constant__Group_2__0__Impl : ( ( rule__Set_Constant__ValuesAssignment_2_0 ) ) ;
    public final void rule__Set_Constant__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:4798:1: ( ( ( rule__Set_Constant__ValuesAssignment_2_0 ) ) )
            // InternalTQL.g:4799:1: ( ( rule__Set_Constant__ValuesAssignment_2_0 ) )
            {
            // InternalTQL.g:4799:1: ( ( rule__Set_Constant__ValuesAssignment_2_0 ) )
            // InternalTQL.g:4800:2: ( rule__Set_Constant__ValuesAssignment_2_0 )
            {
             before(grammarAccess.getSet_ConstantAccess().getValuesAssignment_2_0()); 
            // InternalTQL.g:4801:2: ( rule__Set_Constant__ValuesAssignment_2_0 )
            // InternalTQL.g:4801:3: rule__Set_Constant__ValuesAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Set_Constant__ValuesAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getSet_ConstantAccess().getValuesAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set_Constant__Group_2__0__Impl"


    // $ANTLR start "rule__Set_Constant__Group_2__1"
    // InternalTQL.g:4809:1: rule__Set_Constant__Group_2__1 : rule__Set_Constant__Group_2__1__Impl ;
    public final void rule__Set_Constant__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:4813:1: ( rule__Set_Constant__Group_2__1__Impl )
            // InternalTQL.g:4814:2: rule__Set_Constant__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Set_Constant__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set_Constant__Group_2__1"


    // $ANTLR start "rule__Set_Constant__Group_2__1__Impl"
    // InternalTQL.g:4820:1: rule__Set_Constant__Group_2__1__Impl : ( ( rule__Set_Constant__Group_2_1__0 )* ) ;
    public final void rule__Set_Constant__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:4824:1: ( ( ( rule__Set_Constant__Group_2_1__0 )* ) )
            // InternalTQL.g:4825:1: ( ( rule__Set_Constant__Group_2_1__0 )* )
            {
            // InternalTQL.g:4825:1: ( ( rule__Set_Constant__Group_2_1__0 )* )
            // InternalTQL.g:4826:2: ( rule__Set_Constant__Group_2_1__0 )*
            {
             before(grammarAccess.getSet_ConstantAccess().getGroup_2_1()); 
            // InternalTQL.g:4827:2: ( rule__Set_Constant__Group_2_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==36) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalTQL.g:4827:3: rule__Set_Constant__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Set_Constant__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getSet_ConstantAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set_Constant__Group_2__1__Impl"


    // $ANTLR start "rule__Set_Constant__Group_2_1__0"
    // InternalTQL.g:4836:1: rule__Set_Constant__Group_2_1__0 : rule__Set_Constant__Group_2_1__0__Impl rule__Set_Constant__Group_2_1__1 ;
    public final void rule__Set_Constant__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:4840:1: ( rule__Set_Constant__Group_2_1__0__Impl rule__Set_Constant__Group_2_1__1 )
            // InternalTQL.g:4841:2: rule__Set_Constant__Group_2_1__0__Impl rule__Set_Constant__Group_2_1__1
            {
            pushFollow(FOLLOW_41);
            rule__Set_Constant__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Set_Constant__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set_Constant__Group_2_1__0"


    // $ANTLR start "rule__Set_Constant__Group_2_1__0__Impl"
    // InternalTQL.g:4848:1: rule__Set_Constant__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__Set_Constant__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:4852:1: ( ( ',' ) )
            // InternalTQL.g:4853:1: ( ',' )
            {
            // InternalTQL.g:4853:1: ( ',' )
            // InternalTQL.g:4854:2: ','
            {
             before(grammarAccess.getSet_ConstantAccess().getCommaKeyword_2_1_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getSet_ConstantAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set_Constant__Group_2_1__0__Impl"


    // $ANTLR start "rule__Set_Constant__Group_2_1__1"
    // InternalTQL.g:4863:1: rule__Set_Constant__Group_2_1__1 : rule__Set_Constant__Group_2_1__1__Impl ;
    public final void rule__Set_Constant__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:4867:1: ( rule__Set_Constant__Group_2_1__1__Impl )
            // InternalTQL.g:4868:2: rule__Set_Constant__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Set_Constant__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set_Constant__Group_2_1__1"


    // $ANTLR start "rule__Set_Constant__Group_2_1__1__Impl"
    // InternalTQL.g:4874:1: rule__Set_Constant__Group_2_1__1__Impl : ( ( rule__Set_Constant__ValuesAssignment_2_1_1 ) ) ;
    public final void rule__Set_Constant__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:4878:1: ( ( ( rule__Set_Constant__ValuesAssignment_2_1_1 ) ) )
            // InternalTQL.g:4879:1: ( ( rule__Set_Constant__ValuesAssignment_2_1_1 ) )
            {
            // InternalTQL.g:4879:1: ( ( rule__Set_Constant__ValuesAssignment_2_1_1 ) )
            // InternalTQL.g:4880:2: ( rule__Set_Constant__ValuesAssignment_2_1_1 )
            {
             before(grammarAccess.getSet_ConstantAccess().getValuesAssignment_2_1_1()); 
            // InternalTQL.g:4881:2: ( rule__Set_Constant__ValuesAssignment_2_1_1 )
            // InternalTQL.g:4881:3: rule__Set_Constant__ValuesAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Set_Constant__ValuesAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSet_ConstantAccess().getValuesAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set_Constant__Group_2_1__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalTQL.g:4890:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:4894:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalTQL.g:4895:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_44);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalTQL.g:4902:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:4906:1: ( ( ( '-' )? ) )
            // InternalTQL.g:4907:1: ( ( '-' )? )
            {
            // InternalTQL.g:4907:1: ( ( '-' )? )
            // InternalTQL.g:4908:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalTQL.g:4909:2: ( '-' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==20) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalTQL.g:4909:3: '-'
                    {
                    match(input,20,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalTQL.g:4917:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:4921:1: ( rule__EInt__Group__1__Impl )
            // InternalTQL.g:4922:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalTQL.g:4928:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:4932:1: ( ( RULE_INT ) )
            // InternalTQL.g:4933:1: ( RULE_INT )
            {
            // InternalTQL.g:4933:1: ( RULE_INT )
            // InternalTQL.g:4934:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__EFloat__Group__0"
    // InternalTQL.g:4944:1: rule__EFloat__Group__0 : rule__EFloat__Group__0__Impl rule__EFloat__Group__1 ;
    public final void rule__EFloat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:4948:1: ( rule__EFloat__Group__0__Impl rule__EFloat__Group__1 )
            // InternalTQL.g:4949:2: rule__EFloat__Group__0__Impl rule__EFloat__Group__1
            {
            pushFollow(FOLLOW_45);
            rule__EFloat__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__0"


    // $ANTLR start "rule__EFloat__Group__0__Impl"
    // InternalTQL.g:4956:1: rule__EFloat__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:4960:1: ( ( ( '-' )? ) )
            // InternalTQL.g:4961:1: ( ( '-' )? )
            {
            // InternalTQL.g:4961:1: ( ( '-' )? )
            // InternalTQL.g:4962:2: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 
            // InternalTQL.g:4963:2: ( '-' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==20) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalTQL.g:4963:3: '-'
                    {
                    match(input,20,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__0__Impl"


    // $ANTLR start "rule__EFloat__Group__1"
    // InternalTQL.g:4971:1: rule__EFloat__Group__1 : rule__EFloat__Group__1__Impl rule__EFloat__Group__2 ;
    public final void rule__EFloat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:4975:1: ( rule__EFloat__Group__1__Impl rule__EFloat__Group__2 )
            // InternalTQL.g:4976:2: rule__EFloat__Group__1__Impl rule__EFloat__Group__2
            {
            pushFollow(FOLLOW_45);
            rule__EFloat__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__1"


    // $ANTLR start "rule__EFloat__Group__1__Impl"
    // InternalTQL.g:4983:1: rule__EFloat__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EFloat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:4987:1: ( ( ( RULE_INT )? ) )
            // InternalTQL.g:4988:1: ( ( RULE_INT )? )
            {
            // InternalTQL.g:4988:1: ( ( RULE_INT )? )
            // InternalTQL.g:4989:2: ( RULE_INT )?
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 
            // InternalTQL.g:4990:2: ( RULE_INT )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_INT) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalTQL.g:4990:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__1__Impl"


    // $ANTLR start "rule__EFloat__Group__2"
    // InternalTQL.g:4998:1: rule__EFloat__Group__2 : rule__EFloat__Group__2__Impl rule__EFloat__Group__3 ;
    public final void rule__EFloat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:5002:1: ( rule__EFloat__Group__2__Impl rule__EFloat__Group__3 )
            // InternalTQL.g:5003:2: rule__EFloat__Group__2__Impl rule__EFloat__Group__3
            {
            pushFollow(FOLLOW_46);
            rule__EFloat__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__2"


    // $ANTLR start "rule__EFloat__Group__2__Impl"
    // InternalTQL.g:5010:1: rule__EFloat__Group__2__Impl : ( '.' ) ;
    public final void rule__EFloat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:5014:1: ( ( '.' ) )
            // InternalTQL.g:5015:1: ( '.' )
            {
            // InternalTQL.g:5015:1: ( '.' )
            // InternalTQL.g:5016:2: '.'
            {
             before(grammarAccess.getEFloatAccess().getFullStopKeyword_2()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getEFloatAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__2__Impl"


    // $ANTLR start "rule__EFloat__Group__3"
    // InternalTQL.g:5025:1: rule__EFloat__Group__3 : rule__EFloat__Group__3__Impl rule__EFloat__Group__4 ;
    public final void rule__EFloat__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:5029:1: ( rule__EFloat__Group__3__Impl rule__EFloat__Group__4 )
            // InternalTQL.g:5030:2: rule__EFloat__Group__3__Impl rule__EFloat__Group__4
            {
            pushFollow(FOLLOW_47);
            rule__EFloat__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__3"


    // $ANTLR start "rule__EFloat__Group__3__Impl"
    // InternalTQL.g:5037:1: rule__EFloat__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:5041:1: ( ( RULE_INT ) )
            // InternalTQL.g:5042:1: ( RULE_INT )
            {
            // InternalTQL.g:5042:1: ( RULE_INT )
            // InternalTQL.g:5043:2: RULE_INT
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__3__Impl"


    // $ANTLR start "rule__EFloat__Group__4"
    // InternalTQL.g:5052:1: rule__EFloat__Group__4 : rule__EFloat__Group__4__Impl ;
    public final void rule__EFloat__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:5056:1: ( rule__EFloat__Group__4__Impl )
            // InternalTQL.g:5057:2: rule__EFloat__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__4"


    // $ANTLR start "rule__EFloat__Group__4__Impl"
    // InternalTQL.g:5063:1: rule__EFloat__Group__4__Impl : ( ( rule__EFloat__Group_4__0 )? ) ;
    public final void rule__EFloat__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:5067:1: ( ( ( rule__EFloat__Group_4__0 )? ) )
            // InternalTQL.g:5068:1: ( ( rule__EFloat__Group_4__0 )? )
            {
            // InternalTQL.g:5068:1: ( ( rule__EFloat__Group_4__0 )? )
            // InternalTQL.g:5069:2: ( rule__EFloat__Group_4__0 )?
            {
             before(grammarAccess.getEFloatAccess().getGroup_4()); 
            // InternalTQL.g:5070:2: ( rule__EFloat__Group_4__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=23 && LA35_0<=24)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalTQL.g:5070:3: rule__EFloat__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EFloat__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__4__Impl"


    // $ANTLR start "rule__EFloat__Group_4__0"
    // InternalTQL.g:5079:1: rule__EFloat__Group_4__0 : rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 ;
    public final void rule__EFloat__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:5083:1: ( rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 )
            // InternalTQL.g:5084:2: rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1
            {
            pushFollow(FOLLOW_44);
            rule__EFloat__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__0"


    // $ANTLR start "rule__EFloat__Group_4__0__Impl"
    // InternalTQL.g:5091:1: rule__EFloat__Group_4__0__Impl : ( ( rule__EFloat__Alternatives_4_0 ) ) ;
    public final void rule__EFloat__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:5095:1: ( ( ( rule__EFloat__Alternatives_4_0 ) ) )
            // InternalTQL.g:5096:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            {
            // InternalTQL.g:5096:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            // InternalTQL.g:5097:2: ( rule__EFloat__Alternatives_4_0 )
            {
             before(grammarAccess.getEFloatAccess().getAlternatives_4_0()); 
            // InternalTQL.g:5098:2: ( rule__EFloat__Alternatives_4_0 )
            // InternalTQL.g:5098:3: rule__EFloat__Alternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getEFloatAccess().getAlternatives_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__0__Impl"


    // $ANTLR start "rule__EFloat__Group_4__1"
    // InternalTQL.g:5106:1: rule__EFloat__Group_4__1 : rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 ;
    public final void rule__EFloat__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:5110:1: ( rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 )
            // InternalTQL.g:5111:2: rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2
            {
            pushFollow(FOLLOW_44);
            rule__EFloat__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__1"


    // $ANTLR start "rule__EFloat__Group_4__1__Impl"
    // InternalTQL.g:5118:1: rule__EFloat__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:5122:1: ( ( ( '-' )? ) )
            // InternalTQL.g:5123:1: ( ( '-' )? )
            {
            // InternalTQL.g:5123:1: ( ( '-' )? )
            // InternalTQL.g:5124:2: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 
            // InternalTQL.g:5125:2: ( '-' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==20) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalTQL.g:5125:3: '-'
                    {
                    match(input,20,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__1__Impl"


    // $ANTLR start "rule__EFloat__Group_4__2"
    // InternalTQL.g:5133:1: rule__EFloat__Group_4__2 : rule__EFloat__Group_4__2__Impl ;
    public final void rule__EFloat__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:5137:1: ( rule__EFloat__Group_4__2__Impl )
            // InternalTQL.g:5138:2: rule__EFloat__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__2"


    // $ANTLR start "rule__EFloat__Group_4__2__Impl"
    // InternalTQL.g:5144:1: rule__EFloat__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:5148:1: ( ( RULE_INT ) )
            // InternalTQL.g:5149:1: ( RULE_INT )
            {
            // InternalTQL.g:5149:1: ( RULE_INT )
            // InternalTQL.g:5150:2: RULE_INT
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__2__Impl"


    // $ANTLR start "rule__TQL__BlocksAssignment"
    // InternalTQL.g:5160:1: rule__TQL__BlocksAssignment : ( ruleBlock ) ;
    public final void rule__TQL__BlocksAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:5164:1: ( ( ruleBlock ) )
            // InternalTQL.g:5165:2: ( ruleBlock )
            {
            // InternalTQL.g:5165:2: ( ruleBlock )
            // InternalTQL.g:5166:3: ruleBlock
            {
             before(grammarAccess.getTQLAccess().getBlocksBlockParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getTQLAccess().getBlocksBlockParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TQL__BlocksAssignment"


    // $ANTLR start "rule__Column__NameAssignment_0"
    // InternalTQL.g:5175:1: rule__Column__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Column__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:5179:1: ( ( ruleEString ) )
            // InternalTQL.g:5180:2: ( ruleEString )
            {
            // InternalTQL.g:5180:2: ( ruleEString )
            // InternalTQL.g:5181:3: ruleEString
            {
             before(grammarAccess.getColumnAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getColumnAccess().getNameEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__NameAssignment_0"


    // $ANTLR start "rule__Column__TypeAssignment_2"
    // InternalTQL.g:5190:1: rule__Column__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__Column__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:5194:1: ( ( ruleType ) )
            // InternalTQL.g:5195:2: ( ruleType )
            {
            // InternalTQL.g:5195:2: ( ruleType )
            // InternalTQL.g:5196:3: ruleType
            {
             before(grammarAccess.getColumnAccess().getTypeTypeEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getColumnAccess().getTypeTypeEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__TypeAssignment_2"


    // $ANTLR start "rule__Source_Table__NameAssignment_0"
    // InternalTQL.g:5205:1: rule__Source_Table__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Source_Table__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:5209:1: ( ( ruleEString ) )
            // InternalTQL.g:5210:2: ( ruleEString )
            {
            // InternalTQL.g:5210:2: ( ruleEString )
            // InternalTQL.g:5211:3: ruleEString
            {
             before(grammarAccess.getSource_TableAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSource_TableAccess().getNameEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source_Table__NameAssignment_0"


    // $ANTLR start "rule__Source_Table__ColumnsAssignment_2"
    // InternalTQL.g:5220:1: rule__Source_Table__ColumnsAssignment_2 : ( ruleColumn ) ;
    public final void rule__Source_Table__ColumnsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:5224:1: ( ( ruleColumn ) )
            // InternalTQL.g:5225:2: ( ruleColumn )
            {
            // InternalTQL.g:5225:2: ( ruleColumn )
            // InternalTQL.g:5226:3: ruleColumn
            {
             before(grammarAccess.getSource_TableAccess().getColumnsColumnParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getSource_TableAccess().getColumnsColumnParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source_Table__ColumnsAssignment_2"


    // $ANTLR start "rule__Source_Table__ColumnsAssignment_3_1"
    // InternalTQL.g:5235:1: rule__Source_Table__ColumnsAssignment_3_1 : ( ruleColumn ) ;
    public final void rule__Source_Table__ColumnsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:5239:1: ( ( ruleColumn ) )
            // InternalTQL.g:5240:2: ( ruleColumn )
            {
            // InternalTQL.g:5240:2: ( ruleColumn )
            // InternalTQL.g:5241:3: ruleColumn
            {
             before(grammarAccess.getSource_TableAccess().getColumnsColumnParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getSource_TableAccess().getColumnsColumnParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source_Table__ColumnsAssignment_3_1"


    // $ANTLR start "rule__Target_Table__NameAssignment_0"
    // InternalTQL.g:5250:1: rule__Target_Table__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Target_Table__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:5254:1: ( ( ruleEString ) )
            // InternalTQL.g:5255:2: ( ruleEString )
            {
            // InternalTQL.g:5255:2: ( ruleEString )
            // InternalTQL.g:5256:3: ruleEString
            {
             before(grammarAccess.getTarget_TableAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTarget_TableAccess().getNameEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target_Table__NameAssignment_0"


    // $ANTLR start "rule__Target_Table__ColumnsAssignment_2"
    // InternalTQL.g:5265:1: rule__Target_Table__ColumnsAssignment_2 : ( ruleColumn ) ;
    public final void rule__Target_Table__ColumnsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:5269:1: ( ( ruleColumn ) )
            // InternalTQL.g:5270:2: ( ruleColumn )
            {
            // InternalTQL.g:5270:2: ( ruleColumn )
            // InternalTQL.g:5271:3: ruleColumn
            {
             before(grammarAccess.getTarget_TableAccess().getColumnsColumnParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getTarget_TableAccess().getColumnsColumnParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target_Table__ColumnsAssignment_2"


    // $ANTLR start "rule__Target_Table__ColumnsAssignment_3_1"
    // InternalTQL.g:5280:1: rule__Target_Table__ColumnsAssignment_3_1 : ( ruleColumn ) ;
    public final void rule__Target_Table__ColumnsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:5284:1: ( ( ruleColumn ) )
            // InternalTQL.g:5285:2: ( ruleColumn )
            {
            // InternalTQL.g:5285:2: ( ruleColumn )
            // InternalTQL.g:5286:3: ruleColumn
            {
             before(grammarAccess.getTarget_TableAccess().getColumnsColumnParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getTarget_TableAccess().getColumnsColumnParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target_Table__ColumnsAssignment_3_1"


    // $ANTLR start "rule__Mapping__SourceAssignment_1"
    // InternalTQL.g:5295:1: rule__Mapping__SourceAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__Mapping__SourceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:5299:1: ( ( ( ruleEString ) ) )
            // InternalTQL.g:5300:2: ( ( ruleEString ) )
            {
            // InternalTQL.g:5300:2: ( ( ruleEString ) )
            // InternalTQL.g:5301:3: ( ruleEString )
            {
             before(grammarAccess.getMappingAccess().getSourceSourceTableCrossReference_1_0()); 
            // InternalTQL.g:5302:3: ( ruleEString )
            // InternalTQL.g:5303:4: ruleEString
            {
             before(grammarAccess.getMappingAccess().getSourceSourceTableEStringParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMappingAccess().getSourceSourceTableEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getMappingAccess().getSourceSourceTableCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__SourceAssignment_1"


    // $ANTLR start "rule__Mapping__TargetAssignment_3"
    // InternalTQL.g:5314:1: rule__Mapping__TargetAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Mapping__TargetAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:5318:1: ( ( ( ruleEString ) ) )
            // InternalTQL.g:5319:2: ( ( ruleEString ) )
            {
            // InternalTQL.g:5319:2: ( ( ruleEString ) )
            // InternalTQL.g:5320:3: ( ruleEString )
            {
             before(grammarAccess.getMappingAccess().getTargetTargetTableCrossReference_3_0()); 
            // InternalTQL.g:5321:3: ( ruleEString )
            // InternalTQL.g:5322:4: ruleEString
            {
             before(grammarAccess.getMappingAccess().getTargetTargetTableEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMappingAccess().getTargetTargetTableEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getMappingAccess().getTargetTargetTableCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__TargetAssignment_3"


    // $ANTLR start "rule__Mapping__MappedColumnsAssignment_5"
    // InternalTQL.g:5333:1: rule__Mapping__MappedColumnsAssignment_5 : ( ruleMapped_Column ) ;
    public final void rule__Mapping__MappedColumnsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:5337:1: ( ( ruleMapped_Column ) )
            // InternalTQL.g:5338:2: ( ruleMapped_Column )
            {
            // InternalTQL.g:5338:2: ( ruleMapped_Column )
            // InternalTQL.g:5339:3: ruleMapped_Column
            {
             before(grammarAccess.getMappingAccess().getMappedColumnsMapped_ColumnParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleMapped_Column();

            state._fsp--;

             after(grammarAccess.getMappingAccess().getMappedColumnsMapped_ColumnParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__MappedColumnsAssignment_5"


    // $ANTLR start "rule__Mapping__MappedColumnsAssignment_6_1"
    // InternalTQL.g:5348:1: rule__Mapping__MappedColumnsAssignment_6_1 : ( ruleMapped_Column ) ;
    public final void rule__Mapping__MappedColumnsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:5352:1: ( ( ruleMapped_Column ) )
            // InternalTQL.g:5353:2: ( ruleMapped_Column )
            {
            // InternalTQL.g:5353:2: ( ruleMapped_Column )
            // InternalTQL.g:5354:3: ruleMapped_Column
            {
             before(grammarAccess.getMappingAccess().getMappedColumnsMapped_ColumnParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMapped_Column();

            state._fsp--;

             after(grammarAccess.getMappingAccess().getMappedColumnsMapped_ColumnParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__MappedColumnsAssignment_6_1"


    // $ANTLR start "rule__Mapped_Column__SourceAssignment_0"
    // InternalTQL.g:5363:1: rule__Mapped_Column__SourceAssignment_0 : ( ( ruleEString ) ) ;
    public final void rule__Mapped_Column__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:5367:1: ( ( ( ruleEString ) ) )
            // InternalTQL.g:5368:2: ( ( ruleEString ) )
            {
            // InternalTQL.g:5368:2: ( ( ruleEString ) )
            // InternalTQL.g:5369:3: ( ruleEString )
            {
             before(grammarAccess.getMapped_ColumnAccess().getSourceColumnCrossReference_0_0()); 
            // InternalTQL.g:5370:3: ( ruleEString )
            // InternalTQL.g:5371:4: ruleEString
            {
             before(grammarAccess.getMapped_ColumnAccess().getSourceColumnEStringParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMapped_ColumnAccess().getSourceColumnEStringParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getMapped_ColumnAccess().getSourceColumnCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapped_Column__SourceAssignment_0"


    // $ANTLR start "rule__Mapped_Column__TargetAssignment_2"
    // InternalTQL.g:5382:1: rule__Mapped_Column__TargetAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__Mapped_Column__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:5386:1: ( ( ( ruleEString ) ) )
            // InternalTQL.g:5387:2: ( ( ruleEString ) )
            {
            // InternalTQL.g:5387:2: ( ( ruleEString ) )
            // InternalTQL.g:5388:3: ( ruleEString )
            {
             before(grammarAccess.getMapped_ColumnAccess().getTargetColumnCrossReference_2_0()); 
            // InternalTQL.g:5389:3: ( ruleEString )
            // InternalTQL.g:5390:4: ruleEString
            {
             before(grammarAccess.getMapped_ColumnAccess().getTargetColumnEStringParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMapped_ColumnAccess().getTargetColumnEStringParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getMapped_ColumnAccess().getTargetColumnCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapped_Column__TargetAssignment_2"


    // $ANTLR start "rule__Mapped_Column__TransformationCallsAssignment_3_1"
    // InternalTQL.g:5401:1: rule__Mapped_Column__TransformationCallsAssignment_3_1 : ( ruleTransformation_Call ) ;
    public final void rule__Mapped_Column__TransformationCallsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:5405:1: ( ( ruleTransformation_Call ) )
            // InternalTQL.g:5406:2: ( ruleTransformation_Call )
            {
            // InternalTQL.g:5406:2: ( ruleTransformation_Call )
            // InternalTQL.g:5407:3: ruleTransformation_Call
            {
             before(grammarAccess.getMapped_ColumnAccess().getTransformationCallsTransformation_CallParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTransformation_Call();

            state._fsp--;

             after(grammarAccess.getMapped_ColumnAccess().getTransformationCallsTransformation_CallParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapped_Column__TransformationCallsAssignment_3_1"


    // $ANTLR start "rule__Transformation_Call__TransformationAssignment_0"
    // InternalTQL.g:5416:1: rule__Transformation_Call__TransformationAssignment_0 : ( ( ruleEString ) ) ;
    public final void rule__Transformation_Call__TransformationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:5420:1: ( ( ( ruleEString ) ) )
            // InternalTQL.g:5421:2: ( ( ruleEString ) )
            {
            // InternalTQL.g:5421:2: ( ( ruleEString ) )
            // InternalTQL.g:5422:3: ( ruleEString )
            {
             before(grammarAccess.getTransformation_CallAccess().getTransformationTransformationCrossReference_0_0()); 
            // InternalTQL.g:5423:3: ( ruleEString )
            // InternalTQL.g:5424:4: ruleEString
            {
             before(grammarAccess.getTransformation_CallAccess().getTransformationTransformationEStringParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransformation_CallAccess().getTransformationTransformationEStringParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getTransformation_CallAccess().getTransformationTransformationCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation_Call__TransformationAssignment_0"


    // $ANTLR start "rule__Transformation_Call__CallParametersAssignment_2_0"
    // InternalTQL.g:5435:1: rule__Transformation_Call__CallParametersAssignment_2_0 : ( ruleCall_Parameter ) ;
    public final void rule__Transformation_Call__CallParametersAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:5439:1: ( ( ruleCall_Parameter ) )
            // InternalTQL.g:5440:2: ( ruleCall_Parameter )
            {
            // InternalTQL.g:5440:2: ( ruleCall_Parameter )
            // InternalTQL.g:5441:3: ruleCall_Parameter
            {
             before(grammarAccess.getTransformation_CallAccess().getCallParametersCall_ParameterParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCall_Parameter();

            state._fsp--;

             after(grammarAccess.getTransformation_CallAccess().getCallParametersCall_ParameterParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation_Call__CallParametersAssignment_2_0"


    // $ANTLR start "rule__Transformation_Call__CallParametersAssignment_2_1_1"
    // InternalTQL.g:5450:1: rule__Transformation_Call__CallParametersAssignment_2_1_1 : ( ruleCall_Parameter ) ;
    public final void rule__Transformation_Call__CallParametersAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:5454:1: ( ( ruleCall_Parameter ) )
            // InternalTQL.g:5455:2: ( ruleCall_Parameter )
            {
            // InternalTQL.g:5455:2: ( ruleCall_Parameter )
            // InternalTQL.g:5456:3: ruleCall_Parameter
            {
             before(grammarAccess.getTransformation_CallAccess().getCallParametersCall_ParameterParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCall_Parameter();

            state._fsp--;

             after(grammarAccess.getTransformation_CallAccess().getCallParametersCall_ParameterParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation_Call__CallParametersAssignment_2_1_1"


    // $ANTLR start "rule__Transformation__InTypeAssignment_1"
    // InternalTQL.g:5465:1: rule__Transformation__InTypeAssignment_1 : ( ruleType ) ;
    public final void rule__Transformation__InTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:5469:1: ( ( ruleType ) )
            // InternalTQL.g:5470:2: ( ruleType )
            {
            // InternalTQL.g:5470:2: ( ruleType )
            // InternalTQL.g:5471:3: ruleType
            {
             before(grammarAccess.getTransformationAccess().getInTypeTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTransformationAccess().getInTypeTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__InTypeAssignment_1"


    // $ANTLR start "rule__Transformation__NameAssignment_3"
    // InternalTQL.g:5480:1: rule__Transformation__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__Transformation__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:5484:1: ( ( ruleEString ) )
            // InternalTQL.g:5485:2: ( ruleEString )
            {
            // InternalTQL.g:5485:2: ( ruleEString )
            // InternalTQL.g:5486:3: ruleEString
            {
             before(grammarAccess.getTransformationAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransformationAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__NameAssignment_3"


    // $ANTLR start "rule__Transformation__ParametersAssignment_5_0"
    // InternalTQL.g:5495:1: rule__Transformation__ParametersAssignment_5_0 : ( ruleParameter ) ;
    public final void rule__Transformation__ParametersAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:5499:1: ( ( ruleParameter ) )
            // InternalTQL.g:5500:2: ( ruleParameter )
            {
            // InternalTQL.g:5500:2: ( ruleParameter )
            // InternalTQL.g:5501:3: ruleParameter
            {
             before(grammarAccess.getTransformationAccess().getParametersParameterParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getTransformationAccess().getParametersParameterParserRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__ParametersAssignment_5_0"


    // $ANTLR start "rule__Transformation__ParametersAssignment_5_1_1"
    // InternalTQL.g:5510:1: rule__Transformation__ParametersAssignment_5_1_1 : ( ruleParameter ) ;
    public final void rule__Transformation__ParametersAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:5514:1: ( ( ruleParameter ) )
            // InternalTQL.g:5515:2: ( ruleParameter )
            {
            // InternalTQL.g:5515:2: ( ruleParameter )
            // InternalTQL.g:5516:3: ruleParameter
            {
             before(grammarAccess.getTransformationAccess().getParametersParameterParserRuleCall_5_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getTransformationAccess().getParametersParameterParserRuleCall_5_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__ParametersAssignment_5_1_1"


    // $ANTLR start "rule__Transformation__OutTypeAssignment_8"
    // InternalTQL.g:5525:1: rule__Transformation__OutTypeAssignment_8 : ( ruleType ) ;
    public final void rule__Transformation__OutTypeAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:5529:1: ( ( ruleType ) )
            // InternalTQL.g:5530:2: ( ruleType )
            {
            // InternalTQL.g:5530:2: ( ruleType )
            // InternalTQL.g:5531:3: ruleType
            {
             before(grammarAccess.getTransformationAccess().getOutTypeTypeEnumRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTransformationAccess().getOutTypeTypeEnumRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__OutTypeAssignment_8"


    // $ANTLR start "rule__Transformation__BodyAssignment_10"
    // InternalTQL.g:5540:1: rule__Transformation__BodyAssignment_10 : ( ruleExpression ) ;
    public final void rule__Transformation__BodyAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:5544:1: ( ( ruleExpression ) )
            // InternalTQL.g:5545:2: ( ruleExpression )
            {
            // InternalTQL.g:5545:2: ( ruleExpression )
            // InternalTQL.g:5546:3: ruleExpression
            {
             before(grammarAccess.getTransformationAccess().getBodyExpressionParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getTransformationAccess().getBodyExpressionParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__BodyAssignment_10"


    // $ANTLR start "rule__Parameter__NameAssignment_0"
    // InternalTQL.g:5555:1: rule__Parameter__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Parameter__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:5559:1: ( ( ruleEString ) )
            // InternalTQL.g:5560:2: ( ruleEString )
            {
            // InternalTQL.g:5560:2: ( ruleEString )
            // InternalTQL.g:5561:3: ruleEString
            {
             before(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__NameAssignment_0"


    // $ANTLR start "rule__Parameter__TypeAssignment_2"
    // InternalTQL.g:5570:1: rule__Parameter__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__Parameter__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:5574:1: ( ( ruleType ) )
            // InternalTQL.g:5575:2: ( ruleType )
            {
            // InternalTQL.g:5575:2: ( ruleType )
            // InternalTQL.g:5576:3: ruleType
            {
             before(grammarAccess.getParameterAccess().getTypeTypeEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getTypeTypeEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__TypeAssignment_2"


    // $ANTLR start "rule__Constant_Call_Parameter__ParameterAssignment"
    // InternalTQL.g:5585:1: rule__Constant_Call_Parameter__ParameterAssignment : ( ruleConstant ) ;
    public final void rule__Constant_Call_Parameter__ParameterAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:5589:1: ( ( ruleConstant ) )
            // InternalTQL.g:5590:2: ( ruleConstant )
            {
            // InternalTQL.g:5590:2: ( ruleConstant )
            // InternalTQL.g:5591:3: ruleConstant
            {
             before(grammarAccess.getConstant_Call_ParameterAccess().getParameterConstantParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleConstant();

            state._fsp--;

             after(grammarAccess.getConstant_Call_ParameterAccess().getParameterConstantParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant_Call_Parameter__ParameterAssignment"


    // $ANTLR start "rule__Reference_Call_Parameter__ReferenceAssignment"
    // InternalTQL.g:5600:1: rule__Reference_Call_Parameter__ReferenceAssignment : ( ( ruleEString ) ) ;
    public final void rule__Reference_Call_Parameter__ReferenceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:5604:1: ( ( ( ruleEString ) ) )
            // InternalTQL.g:5605:2: ( ( ruleEString ) )
            {
            // InternalTQL.g:5605:2: ( ( ruleEString ) )
            // InternalTQL.g:5606:3: ( ruleEString )
            {
             before(grammarAccess.getReference_Call_ParameterAccess().getReferenceColumnCrossReference_0()); 
            // InternalTQL.g:5607:3: ( ruleEString )
            // InternalTQL.g:5608:4: ruleEString
            {
             before(grammarAccess.getReference_Call_ParameterAccess().getReferenceColumnEStringParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getReference_Call_ParameterAccess().getReferenceColumnEStringParserRuleCall_0_1()); 

            }

             after(grammarAccess.getReference_Call_ParameterAccess().getReferenceColumnCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference_Call_Parameter__ReferenceAssignment"


    // $ANTLR start "rule__And__OperatorAssignment_1_1"
    // InternalTQL.g:5619:1: rule__And__OperatorAssignment_1_1 : ( ruleAndOperator ) ;
    public final void rule__And__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:5623:1: ( ( ruleAndOperator ) )
            // InternalTQL.g:5624:2: ( ruleAndOperator )
            {
            // InternalTQL.g:5624:2: ( ruleAndOperator )
            // InternalTQL.g:5625:3: ruleAndOperator
            {
             before(grammarAccess.getAndAccess().getOperatorAndOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAndOperator();

            state._fsp--;

             after(grammarAccess.getAndAccess().getOperatorAndOperatorEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__OperatorAssignment_1_1"


    // $ANTLR start "rule__And__RightAssignment_1_2"
    // InternalTQL.g:5634:1: rule__And__RightAssignment_1_2 : ( ruleOr ) ;
    public final void rule__And__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:5638:1: ( ( ruleOr ) )
            // InternalTQL.g:5639:2: ( ruleOr )
            {
            // InternalTQL.g:5639:2: ( ruleOr )
            // InternalTQL.g:5640:3: ruleOr
            {
             before(grammarAccess.getAndAccess().getRightOrParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOr();

            state._fsp--;

             after(grammarAccess.getAndAccess().getRightOrParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__RightAssignment_1_2"


    // $ANTLR start "rule__Or__OperatorAssignment_1_1"
    // InternalTQL.g:5649:1: rule__Or__OperatorAssignment_1_1 : ( ruleOrOperator ) ;
    public final void rule__Or__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:5653:1: ( ( ruleOrOperator ) )
            // InternalTQL.g:5654:2: ( ruleOrOperator )
            {
            // InternalTQL.g:5654:2: ( ruleOrOperator )
            // InternalTQL.g:5655:3: ruleOrOperator
            {
             before(grammarAccess.getOrAccess().getOperatorOrOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOrOperator();

            state._fsp--;

             after(grammarAccess.getOrAccess().getOperatorOrOperatorEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__OperatorAssignment_1_1"


    // $ANTLR start "rule__Or__RightAssignment_1_2"
    // InternalTQL.g:5664:1: rule__Or__RightAssignment_1_2 : ( ruleEquals ) ;
    public final void rule__Or__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:5668:1: ( ( ruleEquals ) )
            // InternalTQL.g:5669:2: ( ruleEquals )
            {
            // InternalTQL.g:5669:2: ( ruleEquals )
            // InternalTQL.g:5670:3: ruleEquals
            {
             before(grammarAccess.getOrAccess().getRightEqualsParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEquals();

            state._fsp--;

             after(grammarAccess.getOrAccess().getRightEqualsParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__RightAssignment_1_2"


    // $ANTLR start "rule__Equals__OperatorAssignment_1_1"
    // InternalTQL.g:5679:1: rule__Equals__OperatorAssignment_1_1 : ( ruleEqualsOperator ) ;
    public final void rule__Equals__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:5683:1: ( ( ruleEqualsOperator ) )
            // InternalTQL.g:5684:2: ( ruleEqualsOperator )
            {
            // InternalTQL.g:5684:2: ( ruleEqualsOperator )
            // InternalTQL.g:5685:3: ruleEqualsOperator
            {
             before(grammarAccess.getEqualsAccess().getOperatorEqualsOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEqualsOperator();

            state._fsp--;

             after(grammarAccess.getEqualsAccess().getOperatorEqualsOperatorEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equals__OperatorAssignment_1_1"


    // $ANTLR start "rule__Equals__RightAssignment_1_2"
    // InternalTQL.g:5694:1: rule__Equals__RightAssignment_1_2 : ( ruleNotEquals ) ;
    public final void rule__Equals__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:5698:1: ( ( ruleNotEquals ) )
            // InternalTQL.g:5699:2: ( ruleNotEquals )
            {
            // InternalTQL.g:5699:2: ( ruleNotEquals )
            // InternalTQL.g:5700:3: ruleNotEquals
            {
             before(grammarAccess.getEqualsAccess().getRightNotEqualsParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNotEquals();

            state._fsp--;

             after(grammarAccess.getEqualsAccess().getRightNotEqualsParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equals__RightAssignment_1_2"


    // $ANTLR start "rule__NotEquals__OperatorAssignment_1_1"
    // InternalTQL.g:5709:1: rule__NotEquals__OperatorAssignment_1_1 : ( ruleNotEqualsOperator ) ;
    public final void rule__NotEquals__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:5713:1: ( ( ruleNotEqualsOperator ) )
            // InternalTQL.g:5714:2: ( ruleNotEqualsOperator )
            {
            // InternalTQL.g:5714:2: ( ruleNotEqualsOperator )
            // InternalTQL.g:5715:3: ruleNotEqualsOperator
            {
             before(grammarAccess.getNotEqualsAccess().getOperatorNotEqualsOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNotEqualsOperator();

            state._fsp--;

             after(grammarAccess.getNotEqualsAccess().getOperatorNotEqualsOperatorEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotEquals__OperatorAssignment_1_1"


    // $ANTLR start "rule__NotEquals__RightAssignment_1_2"
    // InternalTQL.g:5724:1: rule__NotEquals__RightAssignment_1_2 : ( ruleLess ) ;
    public final void rule__NotEquals__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:5728:1: ( ( ruleLess ) )
            // InternalTQL.g:5729:2: ( ruleLess )
            {
            // InternalTQL.g:5729:2: ( ruleLess )
            // InternalTQL.g:5730:3: ruleLess
            {
             before(grammarAccess.getNotEqualsAccess().getRightLessParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLess();

            state._fsp--;

             after(grammarAccess.getNotEqualsAccess().getRightLessParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotEquals__RightAssignment_1_2"


    // $ANTLR start "rule__Less__OperatorAssignment_1_1"
    // InternalTQL.g:5739:1: rule__Less__OperatorAssignment_1_1 : ( ruleLessOperator ) ;
    public final void rule__Less__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:5743:1: ( ( ruleLessOperator ) )
            // InternalTQL.g:5744:2: ( ruleLessOperator )
            {
            // InternalTQL.g:5744:2: ( ruleLessOperator )
            // InternalTQL.g:5745:3: ruleLessOperator
            {
             before(grammarAccess.getLessAccess().getOperatorLessOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLessOperator();

            state._fsp--;

             after(grammarAccess.getLessAccess().getOperatorLessOperatorEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Less__OperatorAssignment_1_1"


    // $ANTLR start "rule__Less__RightAssignment_1_2"
    // InternalTQL.g:5754:1: rule__Less__RightAssignment_1_2 : ( ruleGreater ) ;
    public final void rule__Less__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:5758:1: ( ( ruleGreater ) )
            // InternalTQL.g:5759:2: ( ruleGreater )
            {
            // InternalTQL.g:5759:2: ( ruleGreater )
            // InternalTQL.g:5760:3: ruleGreater
            {
             before(grammarAccess.getLessAccess().getRightGreaterParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleGreater();

            state._fsp--;

             after(grammarAccess.getLessAccess().getRightGreaterParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Less__RightAssignment_1_2"


    // $ANTLR start "rule__Greater__OperatorAssignment_1_1"
    // InternalTQL.g:5769:1: rule__Greater__OperatorAssignment_1_1 : ( ruleGreaterOperator ) ;
    public final void rule__Greater__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:5773:1: ( ( ruleGreaterOperator ) )
            // InternalTQL.g:5774:2: ( ruleGreaterOperator )
            {
            // InternalTQL.g:5774:2: ( ruleGreaterOperator )
            // InternalTQL.g:5775:3: ruleGreaterOperator
            {
             before(grammarAccess.getGreaterAccess().getOperatorGreaterOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGreaterOperator();

            state._fsp--;

             after(grammarAccess.getGreaterAccess().getOperatorGreaterOperatorEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greater__OperatorAssignment_1_1"


    // $ANTLR start "rule__Greater__RightAssignment_1_2"
    // InternalTQL.g:5784:1: rule__Greater__RightAssignment_1_2 : ( ruleMultiply ) ;
    public final void rule__Greater__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:5788:1: ( ( ruleMultiply ) )
            // InternalTQL.g:5789:2: ( ruleMultiply )
            {
            // InternalTQL.g:5789:2: ( ruleMultiply )
            // InternalTQL.g:5790:3: ruleMultiply
            {
             before(grammarAccess.getGreaterAccess().getRightMultiplyParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiply();

            state._fsp--;

             after(grammarAccess.getGreaterAccess().getRightMultiplyParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greater__RightAssignment_1_2"


    // $ANTLR start "rule__Multiply__OperatorAssignment_1_1"
    // InternalTQL.g:5799:1: rule__Multiply__OperatorAssignment_1_1 : ( ruleMultiplyOperator ) ;
    public final void rule__Multiply__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:5803:1: ( ( ruleMultiplyOperator ) )
            // InternalTQL.g:5804:2: ( ruleMultiplyOperator )
            {
            // InternalTQL.g:5804:2: ( ruleMultiplyOperator )
            // InternalTQL.g:5805:3: ruleMultiplyOperator
            {
             before(grammarAccess.getMultiplyAccess().getOperatorMultiplyOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplyOperator();

            state._fsp--;

             after(grammarAccess.getMultiplyAccess().getOperatorMultiplyOperatorEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiply__OperatorAssignment_1_1"


    // $ANTLR start "rule__Multiply__RightAssignment_1_2"
    // InternalTQL.g:5814:1: rule__Multiply__RightAssignment_1_2 : ( ruleDivide ) ;
    public final void rule__Multiply__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:5818:1: ( ( ruleDivide ) )
            // InternalTQL.g:5819:2: ( ruleDivide )
            {
            // InternalTQL.g:5819:2: ( ruleDivide )
            // InternalTQL.g:5820:3: ruleDivide
            {
             before(grammarAccess.getMultiplyAccess().getRightDivideParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDivide();

            state._fsp--;

             after(grammarAccess.getMultiplyAccess().getRightDivideParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiply__RightAssignment_1_2"


    // $ANTLR start "rule__Divide__OperatorAssignment_1_1"
    // InternalTQL.g:5829:1: rule__Divide__OperatorAssignment_1_1 : ( ruleDivideOperator ) ;
    public final void rule__Divide__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:5833:1: ( ( ruleDivideOperator ) )
            // InternalTQL.g:5834:2: ( ruleDivideOperator )
            {
            // InternalTQL.g:5834:2: ( ruleDivideOperator )
            // InternalTQL.g:5835:3: ruleDivideOperator
            {
             before(grammarAccess.getDivideAccess().getOperatorDivideOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDivideOperator();

            state._fsp--;

             after(grammarAccess.getDivideAccess().getOperatorDivideOperatorEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Divide__OperatorAssignment_1_1"


    // $ANTLR start "rule__Divide__RightAssignment_1_2"
    // InternalTQL.g:5844:1: rule__Divide__RightAssignment_1_2 : ( ruleAdd ) ;
    public final void rule__Divide__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:5848:1: ( ( ruleAdd ) )
            // InternalTQL.g:5849:2: ( ruleAdd )
            {
            // InternalTQL.g:5849:2: ( ruleAdd )
            // InternalTQL.g:5850:3: ruleAdd
            {
             before(grammarAccess.getDivideAccess().getRightAddParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAdd();

            state._fsp--;

             after(grammarAccess.getDivideAccess().getRightAddParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Divide__RightAssignment_1_2"


    // $ANTLR start "rule__Add__OperatorAssignment_1_1"
    // InternalTQL.g:5859:1: rule__Add__OperatorAssignment_1_1 : ( ruleAddOperator ) ;
    public final void rule__Add__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:5863:1: ( ( ruleAddOperator ) )
            // InternalTQL.g:5864:2: ( ruleAddOperator )
            {
            // InternalTQL.g:5864:2: ( ruleAddOperator )
            // InternalTQL.g:5865:3: ruleAddOperator
            {
             before(grammarAccess.getAddAccess().getOperatorAddOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAddOperator();

            state._fsp--;

             after(grammarAccess.getAddAccess().getOperatorAddOperatorEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__OperatorAssignment_1_1"


    // $ANTLR start "rule__Add__RightAssignment_1_2"
    // InternalTQL.g:5874:1: rule__Add__RightAssignment_1_2 : ( ruleSubtract ) ;
    public final void rule__Add__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:5878:1: ( ( ruleSubtract ) )
            // InternalTQL.g:5879:2: ( ruleSubtract )
            {
            // InternalTQL.g:5879:2: ( ruleSubtract )
            // InternalTQL.g:5880:3: ruleSubtract
            {
             before(grammarAccess.getAddAccess().getRightSubtractParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSubtract();

            state._fsp--;

             after(grammarAccess.getAddAccess().getRightSubtractParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__RightAssignment_1_2"


    // $ANTLR start "rule__Subtract__OperatorAssignment_1_1"
    // InternalTQL.g:5889:1: rule__Subtract__OperatorAssignment_1_1 : ( ruleSubtractOperator ) ;
    public final void rule__Subtract__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:5893:1: ( ( ruleSubtractOperator ) )
            // InternalTQL.g:5894:2: ( ruleSubtractOperator )
            {
            // InternalTQL.g:5894:2: ( ruleSubtractOperator )
            // InternalTQL.g:5895:3: ruleSubtractOperator
            {
             before(grammarAccess.getSubtractAccess().getOperatorSubtractOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSubtractOperator();

            state._fsp--;

             after(grammarAccess.getSubtractAccess().getOperatorSubtractOperatorEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtract__OperatorAssignment_1_1"


    // $ANTLR start "rule__Subtract__RightAssignment_1_2"
    // InternalTQL.g:5904:1: rule__Subtract__RightAssignment_1_2 : ( ruleLiterals ) ;
    public final void rule__Subtract__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:5908:1: ( ( ruleLiterals ) )
            // InternalTQL.g:5909:2: ( ruleLiterals )
            {
            // InternalTQL.g:5909:2: ( ruleLiterals )
            // InternalTQL.g:5910:3: ruleLiterals
            {
             before(grammarAccess.getSubtractAccess().getRightLiteralsParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLiterals();

            state._fsp--;

             after(grammarAccess.getSubtractAccess().getRightLiteralsParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtract__RightAssignment_1_2"


    // $ANTLR start "rule__Parameter_Expression__ParameterAssignment"
    // InternalTQL.g:5919:1: rule__Parameter_Expression__ParameterAssignment : ( ( ruleEString ) ) ;
    public final void rule__Parameter_Expression__ParameterAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:5923:1: ( ( ( ruleEString ) ) )
            // InternalTQL.g:5924:2: ( ( ruleEString ) )
            {
            // InternalTQL.g:5924:2: ( ( ruleEString ) )
            // InternalTQL.g:5925:3: ( ruleEString )
            {
             before(grammarAccess.getParameter_ExpressionAccess().getParameterParameterCrossReference_0()); 
            // InternalTQL.g:5926:3: ( ruleEString )
            // InternalTQL.g:5927:4: ruleEString
            {
             before(grammarAccess.getParameter_ExpressionAccess().getParameterParameterEStringParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameter_ExpressionAccess().getParameterParameterEStringParserRuleCall_0_1()); 

            }

             after(grammarAccess.getParameter_ExpressionAccess().getParameterParameterCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter_Expression__ParameterAssignment"


    // $ANTLR start "rule__Boolean_Constant__ValueAssignment"
    // InternalTQL.g:5938:1: rule__Boolean_Constant__ValueAssignment : ( ruleEBoolean ) ;
    public final void rule__Boolean_Constant__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:5942:1: ( ( ruleEBoolean ) )
            // InternalTQL.g:5943:2: ( ruleEBoolean )
            {
            // InternalTQL.g:5943:2: ( ruleEBoolean )
            // InternalTQL.g:5944:3: ruleEBoolean
            {
             before(grammarAccess.getBoolean_ConstantAccess().getValueEBooleanParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getBoolean_ConstantAccess().getValueEBooleanParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boolean_Constant__ValueAssignment"


    // $ANTLR start "rule__Float_Constant__ValueAssignment"
    // InternalTQL.g:5953:1: rule__Float_Constant__ValueAssignment : ( ruleEFloat ) ;
    public final void rule__Float_Constant__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:5957:1: ( ( ruleEFloat ) )
            // InternalTQL.g:5958:2: ( ruleEFloat )
            {
            // InternalTQL.g:5958:2: ( ruleEFloat )
            // InternalTQL.g:5959:3: ruleEFloat
            {
             before(grammarAccess.getFloat_ConstantAccess().getValueEFloatParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getFloat_ConstantAccess().getValueEFloatParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float_Constant__ValueAssignment"


    // $ANTLR start "rule__Integer_Constant__ValueAssignment"
    // InternalTQL.g:5968:1: rule__Integer_Constant__ValueAssignment : ( ruleEInt ) ;
    public final void rule__Integer_Constant__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:5972:1: ( ( ruleEInt ) )
            // InternalTQL.g:5973:2: ( ruleEInt )
            {
            // InternalTQL.g:5973:2: ( ruleEInt )
            // InternalTQL.g:5974:3: ruleEInt
            {
             before(grammarAccess.getInteger_ConstantAccess().getValueEIntParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getInteger_ConstantAccess().getValueEIntParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Integer_Constant__ValueAssignment"


    // $ANTLR start "rule__String_Constant__ValueAssignment_1"
    // InternalTQL.g:5983:1: rule__String_Constant__ValueAssignment_1 : ( ruleEString ) ;
    public final void rule__String_Constant__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:5987:1: ( ( ruleEString ) )
            // InternalTQL.g:5988:2: ( ruleEString )
            {
            // InternalTQL.g:5988:2: ( ruleEString )
            // InternalTQL.g:5989:3: ruleEString
            {
             before(grammarAccess.getString_ConstantAccess().getValueEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getString_ConstantAccess().getValueEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__String_Constant__ValueAssignment_1"


    // $ANTLR start "rule__Set_Constant__ValuesAssignment_2_0"
    // InternalTQL.g:5998:1: rule__Set_Constant__ValuesAssignment_2_0 : ( ruleSingle_Constant ) ;
    public final void rule__Set_Constant__ValuesAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:6002:1: ( ( ruleSingle_Constant ) )
            // InternalTQL.g:6003:2: ( ruleSingle_Constant )
            {
            // InternalTQL.g:6003:2: ( ruleSingle_Constant )
            // InternalTQL.g:6004:3: ruleSingle_Constant
            {
             before(grammarAccess.getSet_ConstantAccess().getValuesSingle_ConstantParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSingle_Constant();

            state._fsp--;

             after(grammarAccess.getSet_ConstantAccess().getValuesSingle_ConstantParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set_Constant__ValuesAssignment_2_0"


    // $ANTLR start "rule__Set_Constant__ValuesAssignment_2_1_1"
    // InternalTQL.g:6013:1: rule__Set_Constant__ValuesAssignment_2_1_1 : ( ruleSingle_Constant ) ;
    public final void rule__Set_Constant__ValuesAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:6017:1: ( ( ruleSingle_Constant ) )
            // InternalTQL.g:6018:2: ( ruleSingle_Constant )
            {
            // InternalTQL.g:6018:2: ( ruleSingle_Constant )
            // InternalTQL.g:6019:3: ruleSingle_Constant
            {
             before(grammarAccess.getSet_ConstantAccess().getValuesSingle_ConstantParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSingle_Constant();

            state._fsp--;

             after(grammarAccess.getSet_ConstantAccess().getValuesSingle_ConstantParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set_Constant__ValuesAssignment_2_1_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000042180000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000007E000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000B20020700070L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000B00020700070L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000020000000030L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000900020700040L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000B00020700040L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000D00020700040L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000800000100040L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000001800000L});

}