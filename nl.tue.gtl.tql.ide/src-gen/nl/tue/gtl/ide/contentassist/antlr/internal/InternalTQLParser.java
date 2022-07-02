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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'mult'", "'sum'", "'divide'", "'concat'", "'equal'", "'notequal'", "'smaller'", "'greater'", "'or'", "'and'", "'string'", "'integer'", "'floats'", "'sets'", "'DateTime'", "'Null'", "'bool'", "'BinaryOperationExpression'", "'{'", "'left'", "'right'", "'}'", "'operation'", "'parameterExpression'", "'StringConstantExpression'", "'value'", "'BooleanConstantExpression'", "'IntegerConstantExpression'", "'InExpression'", "'constantSet'", "'('", "')'", "'statement'", "','", "'ParseExpression'", "'expression'", "'outputType'", "'FloatConstantExpression'", "'-'", "'.'"
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



    // $ANTLR start "entryRuleBinaryOperationExpression"
    // InternalTQL.g:53:1: entryRuleBinaryOperationExpression : ruleBinaryOperationExpression EOF ;
    public final void entryRuleBinaryOperationExpression() throws RecognitionException {
        try {
            // InternalTQL.g:54:1: ( ruleBinaryOperationExpression EOF )
            // InternalTQL.g:55:1: ruleBinaryOperationExpression EOF
            {
             before(grammarAccess.getBinaryOperationExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleBinaryOperationExpression();

            state._fsp--;

             after(grammarAccess.getBinaryOperationExpressionRule()); 
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
    // $ANTLR end "entryRuleBinaryOperationExpression"


    // $ANTLR start "ruleBinaryOperationExpression"
    // InternalTQL.g:62:1: ruleBinaryOperationExpression : ( ( rule__BinaryOperationExpression__Group__0 ) ) ;
    public final void ruleBinaryOperationExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:66:2: ( ( ( rule__BinaryOperationExpression__Group__0 ) ) )
            // InternalTQL.g:67:2: ( ( rule__BinaryOperationExpression__Group__0 ) )
            {
            // InternalTQL.g:67:2: ( ( rule__BinaryOperationExpression__Group__0 ) )
            // InternalTQL.g:68:3: ( rule__BinaryOperationExpression__Group__0 )
            {
             before(grammarAccess.getBinaryOperationExpressionAccess().getGroup()); 
            // InternalTQL.g:69:3: ( rule__BinaryOperationExpression__Group__0 )
            // InternalTQL.g:69:4: rule__BinaryOperationExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BinaryOperationExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBinaryOperationExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleBinaryOperationExpression"


    // $ANTLR start "entryRuleparameterExpression"
    // InternalTQL.g:78:1: entryRuleparameterExpression : ruleparameterExpression EOF ;
    public final void entryRuleparameterExpression() throws RecognitionException {
        try {
            // InternalTQL.g:79:1: ( ruleparameterExpression EOF )
            // InternalTQL.g:80:1: ruleparameterExpression EOF
            {
             before(grammarAccess.getParameterExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleparameterExpression();

            state._fsp--;

             after(grammarAccess.getParameterExpressionRule()); 
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
    // $ANTLR end "entryRuleparameterExpression"


    // $ANTLR start "ruleparameterExpression"
    // InternalTQL.g:87:1: ruleparameterExpression : ( ( rule__ParameterExpression__Group__0 ) ) ;
    public final void ruleparameterExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:91:2: ( ( ( rule__ParameterExpression__Group__0 ) ) )
            // InternalTQL.g:92:2: ( ( rule__ParameterExpression__Group__0 ) )
            {
            // InternalTQL.g:92:2: ( ( rule__ParameterExpression__Group__0 ) )
            // InternalTQL.g:93:3: ( rule__ParameterExpression__Group__0 )
            {
             before(grammarAccess.getParameterExpressionAccess().getGroup()); 
            // InternalTQL.g:94:3: ( rule__ParameterExpression__Group__0 )
            // InternalTQL.g:94:4: rule__ParameterExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleparameterExpression"


    // $ANTLR start "entryRuleStringConstantExpression"
    // InternalTQL.g:103:1: entryRuleStringConstantExpression : ruleStringConstantExpression EOF ;
    public final void entryRuleStringConstantExpression() throws RecognitionException {
        try {
            // InternalTQL.g:104:1: ( ruleStringConstantExpression EOF )
            // InternalTQL.g:105:1: ruleStringConstantExpression EOF
            {
             before(grammarAccess.getStringConstantExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleStringConstantExpression();

            state._fsp--;

             after(grammarAccess.getStringConstantExpressionRule()); 
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
    // $ANTLR end "entryRuleStringConstantExpression"


    // $ANTLR start "ruleStringConstantExpression"
    // InternalTQL.g:112:1: ruleStringConstantExpression : ( ( rule__StringConstantExpression__Group__0 ) ) ;
    public final void ruleStringConstantExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:116:2: ( ( ( rule__StringConstantExpression__Group__0 ) ) )
            // InternalTQL.g:117:2: ( ( rule__StringConstantExpression__Group__0 ) )
            {
            // InternalTQL.g:117:2: ( ( rule__StringConstantExpression__Group__0 ) )
            // InternalTQL.g:118:3: ( rule__StringConstantExpression__Group__0 )
            {
             before(grammarAccess.getStringConstantExpressionAccess().getGroup()); 
            // InternalTQL.g:119:3: ( rule__StringConstantExpression__Group__0 )
            // InternalTQL.g:119:4: rule__StringConstantExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StringConstantExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringConstantExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleStringConstantExpression"


    // $ANTLR start "entryRuleBooleanConstantExpression"
    // InternalTQL.g:128:1: entryRuleBooleanConstantExpression : ruleBooleanConstantExpression EOF ;
    public final void entryRuleBooleanConstantExpression() throws RecognitionException {
        try {
            // InternalTQL.g:129:1: ( ruleBooleanConstantExpression EOF )
            // InternalTQL.g:130:1: ruleBooleanConstantExpression EOF
            {
             before(grammarAccess.getBooleanConstantExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleBooleanConstantExpression();

            state._fsp--;

             after(grammarAccess.getBooleanConstantExpressionRule()); 
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
    // $ANTLR end "entryRuleBooleanConstantExpression"


    // $ANTLR start "ruleBooleanConstantExpression"
    // InternalTQL.g:137:1: ruleBooleanConstantExpression : ( ( rule__BooleanConstantExpression__Group__0 ) ) ;
    public final void ruleBooleanConstantExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:141:2: ( ( ( rule__BooleanConstantExpression__Group__0 ) ) )
            // InternalTQL.g:142:2: ( ( rule__BooleanConstantExpression__Group__0 ) )
            {
            // InternalTQL.g:142:2: ( ( rule__BooleanConstantExpression__Group__0 ) )
            // InternalTQL.g:143:3: ( rule__BooleanConstantExpression__Group__0 )
            {
             before(grammarAccess.getBooleanConstantExpressionAccess().getGroup()); 
            // InternalTQL.g:144:3: ( rule__BooleanConstantExpression__Group__0 )
            // InternalTQL.g:144:4: rule__BooleanConstantExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BooleanConstantExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanConstantExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleBooleanConstantExpression"


    // $ANTLR start "entryRuleIntegerConstantExpression"
    // InternalTQL.g:153:1: entryRuleIntegerConstantExpression : ruleIntegerConstantExpression EOF ;
    public final void entryRuleIntegerConstantExpression() throws RecognitionException {
        try {
            // InternalTQL.g:154:1: ( ruleIntegerConstantExpression EOF )
            // InternalTQL.g:155:1: ruleIntegerConstantExpression EOF
            {
             before(grammarAccess.getIntegerConstantExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleIntegerConstantExpression();

            state._fsp--;

             after(grammarAccess.getIntegerConstantExpressionRule()); 
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
    // $ANTLR end "entryRuleIntegerConstantExpression"


    // $ANTLR start "ruleIntegerConstantExpression"
    // InternalTQL.g:162:1: ruleIntegerConstantExpression : ( ( rule__IntegerConstantExpression__Group__0 ) ) ;
    public final void ruleIntegerConstantExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:166:2: ( ( ( rule__IntegerConstantExpression__Group__0 ) ) )
            // InternalTQL.g:167:2: ( ( rule__IntegerConstantExpression__Group__0 ) )
            {
            // InternalTQL.g:167:2: ( ( rule__IntegerConstantExpression__Group__0 ) )
            // InternalTQL.g:168:3: ( rule__IntegerConstantExpression__Group__0 )
            {
             before(grammarAccess.getIntegerConstantExpressionAccess().getGroup()); 
            // InternalTQL.g:169:3: ( rule__IntegerConstantExpression__Group__0 )
            // InternalTQL.g:169:4: rule__IntegerConstantExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IntegerConstantExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntegerConstantExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleIntegerConstantExpression"


    // $ANTLR start "entryRuleInExpression"
    // InternalTQL.g:178:1: entryRuleInExpression : ruleInExpression EOF ;
    public final void entryRuleInExpression() throws RecognitionException {
        try {
            // InternalTQL.g:179:1: ( ruleInExpression EOF )
            // InternalTQL.g:180:1: ruleInExpression EOF
            {
             before(grammarAccess.getInExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleInExpression();

            state._fsp--;

             after(grammarAccess.getInExpressionRule()); 
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
    // $ANTLR end "entryRuleInExpression"


    // $ANTLR start "ruleInExpression"
    // InternalTQL.g:187:1: ruleInExpression : ( ( rule__InExpression__Group__0 ) ) ;
    public final void ruleInExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:191:2: ( ( ( rule__InExpression__Group__0 ) ) )
            // InternalTQL.g:192:2: ( ( rule__InExpression__Group__0 ) )
            {
            // InternalTQL.g:192:2: ( ( rule__InExpression__Group__0 ) )
            // InternalTQL.g:193:3: ( rule__InExpression__Group__0 )
            {
             before(grammarAccess.getInExpressionAccess().getGroup()); 
            // InternalTQL.g:194:3: ( rule__InExpression__Group__0 )
            // InternalTQL.g:194:4: rule__InExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleInExpression"


    // $ANTLR start "entryRuleParseExpression"
    // InternalTQL.g:203:1: entryRuleParseExpression : ruleParseExpression EOF ;
    public final void entryRuleParseExpression() throws RecognitionException {
        try {
            // InternalTQL.g:204:1: ( ruleParseExpression EOF )
            // InternalTQL.g:205:1: ruleParseExpression EOF
            {
             before(grammarAccess.getParseExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleParseExpression();

            state._fsp--;

             after(grammarAccess.getParseExpressionRule()); 
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
    // $ANTLR end "entryRuleParseExpression"


    // $ANTLR start "ruleParseExpression"
    // InternalTQL.g:212:1: ruleParseExpression : ( ( rule__ParseExpression__Group__0 ) ) ;
    public final void ruleParseExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:216:2: ( ( ( rule__ParseExpression__Group__0 ) ) )
            // InternalTQL.g:217:2: ( ( rule__ParseExpression__Group__0 ) )
            {
            // InternalTQL.g:217:2: ( ( rule__ParseExpression__Group__0 ) )
            // InternalTQL.g:218:3: ( rule__ParseExpression__Group__0 )
            {
             before(grammarAccess.getParseExpressionAccess().getGroup()); 
            // InternalTQL.g:219:3: ( rule__ParseExpression__Group__0 )
            // InternalTQL.g:219:4: rule__ParseExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParseExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParseExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleParseExpression"


    // $ANTLR start "entryRuleFloatConstantExpression"
    // InternalTQL.g:228:1: entryRuleFloatConstantExpression : ruleFloatConstantExpression EOF ;
    public final void entryRuleFloatConstantExpression() throws RecognitionException {
        try {
            // InternalTQL.g:229:1: ( ruleFloatConstantExpression EOF )
            // InternalTQL.g:230:1: ruleFloatConstantExpression EOF
            {
             before(grammarAccess.getFloatConstantExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleFloatConstantExpression();

            state._fsp--;

             after(grammarAccess.getFloatConstantExpressionRule()); 
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
    // $ANTLR end "entryRuleFloatConstantExpression"


    // $ANTLR start "ruleFloatConstantExpression"
    // InternalTQL.g:237:1: ruleFloatConstantExpression : ( ( rule__FloatConstantExpression__Group__0 ) ) ;
    public final void ruleFloatConstantExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:241:2: ( ( ( rule__FloatConstantExpression__Group__0 ) ) )
            // InternalTQL.g:242:2: ( ( rule__FloatConstantExpression__Group__0 ) )
            {
            // InternalTQL.g:242:2: ( ( rule__FloatConstantExpression__Group__0 ) )
            // InternalTQL.g:243:3: ( rule__FloatConstantExpression__Group__0 )
            {
             before(grammarAccess.getFloatConstantExpressionAccess().getGroup()); 
            // InternalTQL.g:244:3: ( rule__FloatConstantExpression__Group__0 )
            // InternalTQL.g:244:4: rule__FloatConstantExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FloatConstantExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFloatConstantExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleFloatConstantExpression"


    // $ANTLR start "entryRuleEString"
    // InternalTQL.g:253:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalTQL.g:254:1: ( ruleEString EOF )
            // InternalTQL.g:255:1: ruleEString EOF
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
    // InternalTQL.g:262:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:266:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalTQL.g:267:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalTQL.g:267:2: ( ( rule__EString__Alternatives ) )
            // InternalTQL.g:268:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalTQL.g:269:3: ( rule__EString__Alternatives )
            // InternalTQL.g:269:4: rule__EString__Alternatives
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
    // InternalTQL.g:278:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalTQL.g:279:1: ( ruleEInt EOF )
            // InternalTQL.g:280:1: ruleEInt EOF
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
    // InternalTQL.g:287:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:291:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalTQL.g:292:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalTQL.g:292:2: ( ( rule__EInt__Group__0 ) )
            // InternalTQL.g:293:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalTQL.g:294:3: ( rule__EInt__Group__0 )
            // InternalTQL.g:294:4: rule__EInt__Group__0
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
    // InternalTQL.g:303:1: entryRuleEFloat : ruleEFloat EOF ;
    public final void entryRuleEFloat() throws RecognitionException {
        try {
            // InternalTQL.g:304:1: ( ruleEFloat EOF )
            // InternalTQL.g:305:1: ruleEFloat EOF
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
    // InternalTQL.g:312:1: ruleEFloat : ( ( rule__EFloat__Group__0 ) ) ;
    public final void ruleEFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:316:2: ( ( ( rule__EFloat__Group__0 ) ) )
            // InternalTQL.g:317:2: ( ( rule__EFloat__Group__0 ) )
            {
            // InternalTQL.g:317:2: ( ( rule__EFloat__Group__0 ) )
            // InternalTQL.g:318:3: ( rule__EFloat__Group__0 )
            {
             before(grammarAccess.getEFloatAccess().getGroup()); 
            // InternalTQL.g:319:3: ( rule__EFloat__Group__0 )
            // InternalTQL.g:319:4: rule__EFloat__Group__0
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


    // $ANTLR start "ruleBinaryFunction"
    // InternalTQL.g:328:1: ruleBinaryFunction : ( ( rule__BinaryFunction__Alternatives ) ) ;
    public final void ruleBinaryFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:332:1: ( ( ( rule__BinaryFunction__Alternatives ) ) )
            // InternalTQL.g:333:2: ( ( rule__BinaryFunction__Alternatives ) )
            {
            // InternalTQL.g:333:2: ( ( rule__BinaryFunction__Alternatives ) )
            // InternalTQL.g:334:3: ( rule__BinaryFunction__Alternatives )
            {
             before(grammarAccess.getBinaryFunctionAccess().getAlternatives()); 
            // InternalTQL.g:335:3: ( rule__BinaryFunction__Alternatives )
            // InternalTQL.g:335:4: rule__BinaryFunction__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BinaryFunction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBinaryFunctionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleBinaryFunction"


    // $ANTLR start "ruleType"
    // InternalTQL.g:344:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:348:1: ( ( ( rule__Type__Alternatives ) ) )
            // InternalTQL.g:349:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalTQL.g:349:2: ( ( rule__Type__Alternatives ) )
            // InternalTQL.g:350:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalTQL.g:351:3: ( rule__Type__Alternatives )
            // InternalTQL.g:351:4: rule__Type__Alternatives
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


    // $ANTLR start "rule__EString__Alternatives"
    // InternalTQL.g:359:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:363:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalTQL.g:364:2: ( RULE_STRING )
                    {
                    // InternalTQL.g:364:2: ( RULE_STRING )
                    // InternalTQL.g:365:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTQL.g:370:2: ( RULE_ID )
                    {
                    // InternalTQL.g:370:2: ( RULE_ID )
                    // InternalTQL.g:371:3: RULE_ID
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
    // InternalTQL.g:380:1: rule__EFloat__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EFloat__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:384:1: ( ( 'E' ) | ( 'e' ) )
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
                    // InternalTQL.g:385:2: ( 'E' )
                    {
                    // InternalTQL.g:385:2: ( 'E' )
                    // InternalTQL.g:386:3: 'E'
                    {
                     before(grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTQL.g:391:2: ( 'e' )
                    {
                    // InternalTQL.g:391:2: ( 'e' )
                    // InternalTQL.g:392:3: 'e'
                    {
                     before(grammarAccess.getEFloatAccess().getEKeyword_4_0_1()); 
                    match(input,12,FOLLOW_2); 
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


    // $ANTLR start "rule__BinaryFunction__Alternatives"
    // InternalTQL.g:401:1: rule__BinaryFunction__Alternatives : ( ( ( 'mult' ) ) | ( ( 'sum' ) ) | ( ( 'divide' ) ) | ( ( 'concat' ) ) | ( ( 'equal' ) ) | ( ( 'notequal' ) ) | ( ( 'smaller' ) ) | ( ( 'greater' ) ) | ( ( 'or' ) ) | ( ( 'and' ) ) );
    public final void rule__BinaryFunction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:405:1: ( ( ( 'mult' ) ) | ( ( 'sum' ) ) | ( ( 'divide' ) ) | ( ( 'concat' ) ) | ( ( 'equal' ) ) | ( ( 'notequal' ) ) | ( ( 'smaller' ) ) | ( ( 'greater' ) ) | ( ( 'or' ) ) | ( ( 'and' ) ) )
            int alt3=10;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt3=1;
                }
                break;
            case 14:
                {
                alt3=2;
                }
                break;
            case 15:
                {
                alt3=3;
                }
                break;
            case 16:
                {
                alt3=4;
                }
                break;
            case 17:
                {
                alt3=5;
                }
                break;
            case 18:
                {
                alt3=6;
                }
                break;
            case 19:
                {
                alt3=7;
                }
                break;
            case 20:
                {
                alt3=8;
                }
                break;
            case 21:
                {
                alt3=9;
                }
                break;
            case 22:
                {
                alt3=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalTQL.g:406:2: ( ( 'mult' ) )
                    {
                    // InternalTQL.g:406:2: ( ( 'mult' ) )
                    // InternalTQL.g:407:3: ( 'mult' )
                    {
                     before(grammarAccess.getBinaryFunctionAccess().getMultEnumLiteralDeclaration_0()); 
                    // InternalTQL.g:408:3: ( 'mult' )
                    // InternalTQL.g:408:4: 'mult'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryFunctionAccess().getMultEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTQL.g:412:2: ( ( 'sum' ) )
                    {
                    // InternalTQL.g:412:2: ( ( 'sum' ) )
                    // InternalTQL.g:413:3: ( 'sum' )
                    {
                     before(grammarAccess.getBinaryFunctionAccess().getSumEnumLiteralDeclaration_1()); 
                    // InternalTQL.g:414:3: ( 'sum' )
                    // InternalTQL.g:414:4: 'sum'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryFunctionAccess().getSumEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTQL.g:418:2: ( ( 'divide' ) )
                    {
                    // InternalTQL.g:418:2: ( ( 'divide' ) )
                    // InternalTQL.g:419:3: ( 'divide' )
                    {
                     before(grammarAccess.getBinaryFunctionAccess().getDivideEnumLiteralDeclaration_2()); 
                    // InternalTQL.g:420:3: ( 'divide' )
                    // InternalTQL.g:420:4: 'divide'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryFunctionAccess().getDivideEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTQL.g:424:2: ( ( 'concat' ) )
                    {
                    // InternalTQL.g:424:2: ( ( 'concat' ) )
                    // InternalTQL.g:425:3: ( 'concat' )
                    {
                     before(grammarAccess.getBinaryFunctionAccess().getConcatEnumLiteralDeclaration_3()); 
                    // InternalTQL.g:426:3: ( 'concat' )
                    // InternalTQL.g:426:4: 'concat'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryFunctionAccess().getConcatEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalTQL.g:430:2: ( ( 'equal' ) )
                    {
                    // InternalTQL.g:430:2: ( ( 'equal' ) )
                    // InternalTQL.g:431:3: ( 'equal' )
                    {
                     before(grammarAccess.getBinaryFunctionAccess().getEqualEnumLiteralDeclaration_4()); 
                    // InternalTQL.g:432:3: ( 'equal' )
                    // InternalTQL.g:432:4: 'equal'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryFunctionAccess().getEqualEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalTQL.g:436:2: ( ( 'notequal' ) )
                    {
                    // InternalTQL.g:436:2: ( ( 'notequal' ) )
                    // InternalTQL.g:437:3: ( 'notequal' )
                    {
                     before(grammarAccess.getBinaryFunctionAccess().getNotequalEnumLiteralDeclaration_5()); 
                    // InternalTQL.g:438:3: ( 'notequal' )
                    // InternalTQL.g:438:4: 'notequal'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryFunctionAccess().getNotequalEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalTQL.g:442:2: ( ( 'smaller' ) )
                    {
                    // InternalTQL.g:442:2: ( ( 'smaller' ) )
                    // InternalTQL.g:443:3: ( 'smaller' )
                    {
                     before(grammarAccess.getBinaryFunctionAccess().getSmallerEnumLiteralDeclaration_6()); 
                    // InternalTQL.g:444:3: ( 'smaller' )
                    // InternalTQL.g:444:4: 'smaller'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryFunctionAccess().getSmallerEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalTQL.g:448:2: ( ( 'greater' ) )
                    {
                    // InternalTQL.g:448:2: ( ( 'greater' ) )
                    // InternalTQL.g:449:3: ( 'greater' )
                    {
                     before(grammarAccess.getBinaryFunctionAccess().getGreaterEnumLiteralDeclaration_7()); 
                    // InternalTQL.g:450:3: ( 'greater' )
                    // InternalTQL.g:450:4: 'greater'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryFunctionAccess().getGreaterEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalTQL.g:454:2: ( ( 'or' ) )
                    {
                    // InternalTQL.g:454:2: ( ( 'or' ) )
                    // InternalTQL.g:455:3: ( 'or' )
                    {
                     before(grammarAccess.getBinaryFunctionAccess().getOrEnumLiteralDeclaration_8()); 
                    // InternalTQL.g:456:3: ( 'or' )
                    // InternalTQL.g:456:4: 'or'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryFunctionAccess().getOrEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalTQL.g:460:2: ( ( 'and' ) )
                    {
                    // InternalTQL.g:460:2: ( ( 'and' ) )
                    // InternalTQL.g:461:3: ( 'and' )
                    {
                     before(grammarAccess.getBinaryFunctionAccess().getAndEnumLiteralDeclaration_9()); 
                    // InternalTQL.g:462:3: ( 'and' )
                    // InternalTQL.g:462:4: 'and'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryFunctionAccess().getAndEnumLiteralDeclaration_9()); 

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
    // $ANTLR end "rule__BinaryFunction__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalTQL.g:470:1: rule__Type__Alternatives : ( ( ( 'string' ) ) | ( ( 'integer' ) ) | ( ( 'floats' ) ) | ( ( 'sets' ) ) | ( ( 'DateTime' ) ) | ( ( 'Null' ) ) | ( ( 'bool' ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:474:1: ( ( ( 'string' ) ) | ( ( 'integer' ) ) | ( ( 'floats' ) ) | ( ( 'sets' ) ) | ( ( 'DateTime' ) ) | ( ( 'Null' ) ) | ( ( 'bool' ) ) )
            int alt4=7;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt4=1;
                }
                break;
            case 24:
                {
                alt4=2;
                }
                break;
            case 25:
                {
                alt4=3;
                }
                break;
            case 26:
                {
                alt4=4;
                }
                break;
            case 27:
                {
                alt4=5;
                }
                break;
            case 28:
                {
                alt4=6;
                }
                break;
            case 29:
                {
                alt4=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalTQL.g:475:2: ( ( 'string' ) )
                    {
                    // InternalTQL.g:475:2: ( ( 'string' ) )
                    // InternalTQL.g:476:3: ( 'string' )
                    {
                     before(grammarAccess.getTypeAccess().getStringEnumLiteralDeclaration_0()); 
                    // InternalTQL.g:477:3: ( 'string' )
                    // InternalTQL.g:477:4: 'string'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getStringEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTQL.g:481:2: ( ( 'integer' ) )
                    {
                    // InternalTQL.g:481:2: ( ( 'integer' ) )
                    // InternalTQL.g:482:3: ( 'integer' )
                    {
                     before(grammarAccess.getTypeAccess().getIntegerEnumLiteralDeclaration_1()); 
                    // InternalTQL.g:483:3: ( 'integer' )
                    // InternalTQL.g:483:4: 'integer'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getIntegerEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTQL.g:487:2: ( ( 'floats' ) )
                    {
                    // InternalTQL.g:487:2: ( ( 'floats' ) )
                    // InternalTQL.g:488:3: ( 'floats' )
                    {
                     before(grammarAccess.getTypeAccess().getFloatsEnumLiteralDeclaration_2()); 
                    // InternalTQL.g:489:3: ( 'floats' )
                    // InternalTQL.g:489:4: 'floats'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getFloatsEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTQL.g:493:2: ( ( 'sets' ) )
                    {
                    // InternalTQL.g:493:2: ( ( 'sets' ) )
                    // InternalTQL.g:494:3: ( 'sets' )
                    {
                     before(grammarAccess.getTypeAccess().getSetsEnumLiteralDeclaration_3()); 
                    // InternalTQL.g:495:3: ( 'sets' )
                    // InternalTQL.g:495:4: 'sets'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getSetsEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalTQL.g:499:2: ( ( 'DateTime' ) )
                    {
                    // InternalTQL.g:499:2: ( ( 'DateTime' ) )
                    // InternalTQL.g:500:3: ( 'DateTime' )
                    {
                     before(grammarAccess.getTypeAccess().getDateTimeEnumLiteralDeclaration_4()); 
                    // InternalTQL.g:501:3: ( 'DateTime' )
                    // InternalTQL.g:501:4: 'DateTime'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getDateTimeEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalTQL.g:505:2: ( ( 'Null' ) )
                    {
                    // InternalTQL.g:505:2: ( ( 'Null' ) )
                    // InternalTQL.g:506:3: ( 'Null' )
                    {
                     before(grammarAccess.getTypeAccess().getNullEnumLiteralDeclaration_5()); 
                    // InternalTQL.g:507:3: ( 'Null' )
                    // InternalTQL.g:507:4: 'Null'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getNullEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalTQL.g:511:2: ( ( 'bool' ) )
                    {
                    // InternalTQL.g:511:2: ( ( 'bool' ) )
                    // InternalTQL.g:512:3: ( 'bool' )
                    {
                     before(grammarAccess.getTypeAccess().getBoolEnumLiteralDeclaration_6()); 
                    // InternalTQL.g:513:3: ( 'bool' )
                    // InternalTQL.g:513:4: 'bool'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getBoolEnumLiteralDeclaration_6()); 

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


    // $ANTLR start "rule__BinaryOperationExpression__Group__0"
    // InternalTQL.g:521:1: rule__BinaryOperationExpression__Group__0 : rule__BinaryOperationExpression__Group__0__Impl rule__BinaryOperationExpression__Group__1 ;
    public final void rule__BinaryOperationExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:525:1: ( rule__BinaryOperationExpression__Group__0__Impl rule__BinaryOperationExpression__Group__1 )
            // InternalTQL.g:526:2: rule__BinaryOperationExpression__Group__0__Impl rule__BinaryOperationExpression__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__BinaryOperationExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryOperationExpression__Group__1();

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
    // $ANTLR end "rule__BinaryOperationExpression__Group__0"


    // $ANTLR start "rule__BinaryOperationExpression__Group__0__Impl"
    // InternalTQL.g:533:1: rule__BinaryOperationExpression__Group__0__Impl : ( 'BinaryOperationExpression' ) ;
    public final void rule__BinaryOperationExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:537:1: ( ( 'BinaryOperationExpression' ) )
            // InternalTQL.g:538:1: ( 'BinaryOperationExpression' )
            {
            // InternalTQL.g:538:1: ( 'BinaryOperationExpression' )
            // InternalTQL.g:539:2: 'BinaryOperationExpression'
            {
             before(grammarAccess.getBinaryOperationExpressionAccess().getBinaryOperationExpressionKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getBinaryOperationExpressionAccess().getBinaryOperationExpressionKeyword_0()); 

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
    // $ANTLR end "rule__BinaryOperationExpression__Group__0__Impl"


    // $ANTLR start "rule__BinaryOperationExpression__Group__1"
    // InternalTQL.g:548:1: rule__BinaryOperationExpression__Group__1 : rule__BinaryOperationExpression__Group__1__Impl rule__BinaryOperationExpression__Group__2 ;
    public final void rule__BinaryOperationExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:552:1: ( rule__BinaryOperationExpression__Group__1__Impl rule__BinaryOperationExpression__Group__2 )
            // InternalTQL.g:553:2: rule__BinaryOperationExpression__Group__1__Impl rule__BinaryOperationExpression__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__BinaryOperationExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryOperationExpression__Group__2();

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
    // $ANTLR end "rule__BinaryOperationExpression__Group__1"


    // $ANTLR start "rule__BinaryOperationExpression__Group__1__Impl"
    // InternalTQL.g:560:1: rule__BinaryOperationExpression__Group__1__Impl : ( '{' ) ;
    public final void rule__BinaryOperationExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:564:1: ( ( '{' ) )
            // InternalTQL.g:565:1: ( '{' )
            {
            // InternalTQL.g:565:1: ( '{' )
            // InternalTQL.g:566:2: '{'
            {
             before(grammarAccess.getBinaryOperationExpressionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getBinaryOperationExpressionAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__BinaryOperationExpression__Group__1__Impl"


    // $ANTLR start "rule__BinaryOperationExpression__Group__2"
    // InternalTQL.g:575:1: rule__BinaryOperationExpression__Group__2 : rule__BinaryOperationExpression__Group__2__Impl rule__BinaryOperationExpression__Group__3 ;
    public final void rule__BinaryOperationExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:579:1: ( rule__BinaryOperationExpression__Group__2__Impl rule__BinaryOperationExpression__Group__3 )
            // InternalTQL.g:580:2: rule__BinaryOperationExpression__Group__2__Impl rule__BinaryOperationExpression__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__BinaryOperationExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryOperationExpression__Group__3();

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
    // $ANTLR end "rule__BinaryOperationExpression__Group__2"


    // $ANTLR start "rule__BinaryOperationExpression__Group__2__Impl"
    // InternalTQL.g:587:1: rule__BinaryOperationExpression__Group__2__Impl : ( ( rule__BinaryOperationExpression__Group_2__0 )? ) ;
    public final void rule__BinaryOperationExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:591:1: ( ( ( rule__BinaryOperationExpression__Group_2__0 )? ) )
            // InternalTQL.g:592:1: ( ( rule__BinaryOperationExpression__Group_2__0 )? )
            {
            // InternalTQL.g:592:1: ( ( rule__BinaryOperationExpression__Group_2__0 )? )
            // InternalTQL.g:593:2: ( rule__BinaryOperationExpression__Group_2__0 )?
            {
             before(grammarAccess.getBinaryOperationExpressionAccess().getGroup_2()); 
            // InternalTQL.g:594:2: ( rule__BinaryOperationExpression__Group_2__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==35) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalTQL.g:594:3: rule__BinaryOperationExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BinaryOperationExpression__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBinaryOperationExpressionAccess().getGroup_2()); 

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
    // $ANTLR end "rule__BinaryOperationExpression__Group__2__Impl"


    // $ANTLR start "rule__BinaryOperationExpression__Group__3"
    // InternalTQL.g:602:1: rule__BinaryOperationExpression__Group__3 : rule__BinaryOperationExpression__Group__3__Impl rule__BinaryOperationExpression__Group__4 ;
    public final void rule__BinaryOperationExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:606:1: ( rule__BinaryOperationExpression__Group__3__Impl rule__BinaryOperationExpression__Group__4 )
            // InternalTQL.g:607:2: rule__BinaryOperationExpression__Group__3__Impl rule__BinaryOperationExpression__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__BinaryOperationExpression__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryOperationExpression__Group__4();

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
    // $ANTLR end "rule__BinaryOperationExpression__Group__3"


    // $ANTLR start "rule__BinaryOperationExpression__Group__3__Impl"
    // InternalTQL.g:614:1: rule__BinaryOperationExpression__Group__3__Impl : ( 'left' ) ;
    public final void rule__BinaryOperationExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:618:1: ( ( 'left' ) )
            // InternalTQL.g:619:1: ( 'left' )
            {
            // InternalTQL.g:619:1: ( 'left' )
            // InternalTQL.g:620:2: 'left'
            {
             before(grammarAccess.getBinaryOperationExpressionAccess().getLeftKeyword_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getBinaryOperationExpressionAccess().getLeftKeyword_3()); 

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
    // $ANTLR end "rule__BinaryOperationExpression__Group__3__Impl"


    // $ANTLR start "rule__BinaryOperationExpression__Group__4"
    // InternalTQL.g:629:1: rule__BinaryOperationExpression__Group__4 : rule__BinaryOperationExpression__Group__4__Impl rule__BinaryOperationExpression__Group__5 ;
    public final void rule__BinaryOperationExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:633:1: ( rule__BinaryOperationExpression__Group__4__Impl rule__BinaryOperationExpression__Group__5 )
            // InternalTQL.g:634:2: rule__BinaryOperationExpression__Group__4__Impl rule__BinaryOperationExpression__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__BinaryOperationExpression__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryOperationExpression__Group__5();

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
    // $ANTLR end "rule__BinaryOperationExpression__Group__4"


    // $ANTLR start "rule__BinaryOperationExpression__Group__4__Impl"
    // InternalTQL.g:641:1: rule__BinaryOperationExpression__Group__4__Impl : ( ( rule__BinaryOperationExpression__LeftAssignment_4 ) ) ;
    public final void rule__BinaryOperationExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:645:1: ( ( ( rule__BinaryOperationExpression__LeftAssignment_4 ) ) )
            // InternalTQL.g:646:1: ( ( rule__BinaryOperationExpression__LeftAssignment_4 ) )
            {
            // InternalTQL.g:646:1: ( ( rule__BinaryOperationExpression__LeftAssignment_4 ) )
            // InternalTQL.g:647:2: ( rule__BinaryOperationExpression__LeftAssignment_4 )
            {
             before(grammarAccess.getBinaryOperationExpressionAccess().getLeftAssignment_4()); 
            // InternalTQL.g:648:2: ( rule__BinaryOperationExpression__LeftAssignment_4 )
            // InternalTQL.g:648:3: rule__BinaryOperationExpression__LeftAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__BinaryOperationExpression__LeftAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getBinaryOperationExpressionAccess().getLeftAssignment_4()); 

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
    // $ANTLR end "rule__BinaryOperationExpression__Group__4__Impl"


    // $ANTLR start "rule__BinaryOperationExpression__Group__5"
    // InternalTQL.g:656:1: rule__BinaryOperationExpression__Group__5 : rule__BinaryOperationExpression__Group__5__Impl rule__BinaryOperationExpression__Group__6 ;
    public final void rule__BinaryOperationExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:660:1: ( rule__BinaryOperationExpression__Group__5__Impl rule__BinaryOperationExpression__Group__6 )
            // InternalTQL.g:661:2: rule__BinaryOperationExpression__Group__5__Impl rule__BinaryOperationExpression__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__BinaryOperationExpression__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryOperationExpression__Group__6();

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
    // $ANTLR end "rule__BinaryOperationExpression__Group__5"


    // $ANTLR start "rule__BinaryOperationExpression__Group__5__Impl"
    // InternalTQL.g:668:1: rule__BinaryOperationExpression__Group__5__Impl : ( 'right' ) ;
    public final void rule__BinaryOperationExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:672:1: ( ( 'right' ) )
            // InternalTQL.g:673:1: ( 'right' )
            {
            // InternalTQL.g:673:1: ( 'right' )
            // InternalTQL.g:674:2: 'right'
            {
             before(grammarAccess.getBinaryOperationExpressionAccess().getRightKeyword_5()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getBinaryOperationExpressionAccess().getRightKeyword_5()); 

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
    // $ANTLR end "rule__BinaryOperationExpression__Group__5__Impl"


    // $ANTLR start "rule__BinaryOperationExpression__Group__6"
    // InternalTQL.g:683:1: rule__BinaryOperationExpression__Group__6 : rule__BinaryOperationExpression__Group__6__Impl rule__BinaryOperationExpression__Group__7 ;
    public final void rule__BinaryOperationExpression__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:687:1: ( rule__BinaryOperationExpression__Group__6__Impl rule__BinaryOperationExpression__Group__7 )
            // InternalTQL.g:688:2: rule__BinaryOperationExpression__Group__6__Impl rule__BinaryOperationExpression__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__BinaryOperationExpression__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryOperationExpression__Group__7();

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
    // $ANTLR end "rule__BinaryOperationExpression__Group__6"


    // $ANTLR start "rule__BinaryOperationExpression__Group__6__Impl"
    // InternalTQL.g:695:1: rule__BinaryOperationExpression__Group__6__Impl : ( ( rule__BinaryOperationExpression__RightAssignment_6 ) ) ;
    public final void rule__BinaryOperationExpression__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:699:1: ( ( ( rule__BinaryOperationExpression__RightAssignment_6 ) ) )
            // InternalTQL.g:700:1: ( ( rule__BinaryOperationExpression__RightAssignment_6 ) )
            {
            // InternalTQL.g:700:1: ( ( rule__BinaryOperationExpression__RightAssignment_6 ) )
            // InternalTQL.g:701:2: ( rule__BinaryOperationExpression__RightAssignment_6 )
            {
             before(grammarAccess.getBinaryOperationExpressionAccess().getRightAssignment_6()); 
            // InternalTQL.g:702:2: ( rule__BinaryOperationExpression__RightAssignment_6 )
            // InternalTQL.g:702:3: rule__BinaryOperationExpression__RightAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__BinaryOperationExpression__RightAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getBinaryOperationExpressionAccess().getRightAssignment_6()); 

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
    // $ANTLR end "rule__BinaryOperationExpression__Group__6__Impl"


    // $ANTLR start "rule__BinaryOperationExpression__Group__7"
    // InternalTQL.g:710:1: rule__BinaryOperationExpression__Group__7 : rule__BinaryOperationExpression__Group__7__Impl ;
    public final void rule__BinaryOperationExpression__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:714:1: ( rule__BinaryOperationExpression__Group__7__Impl )
            // InternalTQL.g:715:2: rule__BinaryOperationExpression__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BinaryOperationExpression__Group__7__Impl();

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
    // $ANTLR end "rule__BinaryOperationExpression__Group__7"


    // $ANTLR start "rule__BinaryOperationExpression__Group__7__Impl"
    // InternalTQL.g:721:1: rule__BinaryOperationExpression__Group__7__Impl : ( '}' ) ;
    public final void rule__BinaryOperationExpression__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:725:1: ( ( '}' ) )
            // InternalTQL.g:726:1: ( '}' )
            {
            // InternalTQL.g:726:1: ( '}' )
            // InternalTQL.g:727:2: '}'
            {
             before(grammarAccess.getBinaryOperationExpressionAccess().getRightCurlyBracketKeyword_7()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getBinaryOperationExpressionAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__BinaryOperationExpression__Group__7__Impl"


    // $ANTLR start "rule__BinaryOperationExpression__Group_2__0"
    // InternalTQL.g:737:1: rule__BinaryOperationExpression__Group_2__0 : rule__BinaryOperationExpression__Group_2__0__Impl rule__BinaryOperationExpression__Group_2__1 ;
    public final void rule__BinaryOperationExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:741:1: ( rule__BinaryOperationExpression__Group_2__0__Impl rule__BinaryOperationExpression__Group_2__1 )
            // InternalTQL.g:742:2: rule__BinaryOperationExpression__Group_2__0__Impl rule__BinaryOperationExpression__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__BinaryOperationExpression__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryOperationExpression__Group_2__1();

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
    // $ANTLR end "rule__BinaryOperationExpression__Group_2__0"


    // $ANTLR start "rule__BinaryOperationExpression__Group_2__0__Impl"
    // InternalTQL.g:749:1: rule__BinaryOperationExpression__Group_2__0__Impl : ( 'operation' ) ;
    public final void rule__BinaryOperationExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:753:1: ( ( 'operation' ) )
            // InternalTQL.g:754:1: ( 'operation' )
            {
            // InternalTQL.g:754:1: ( 'operation' )
            // InternalTQL.g:755:2: 'operation'
            {
             before(grammarAccess.getBinaryOperationExpressionAccess().getOperationKeyword_2_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getBinaryOperationExpressionAccess().getOperationKeyword_2_0()); 

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
    // $ANTLR end "rule__BinaryOperationExpression__Group_2__0__Impl"


    // $ANTLR start "rule__BinaryOperationExpression__Group_2__1"
    // InternalTQL.g:764:1: rule__BinaryOperationExpression__Group_2__1 : rule__BinaryOperationExpression__Group_2__1__Impl ;
    public final void rule__BinaryOperationExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:768:1: ( rule__BinaryOperationExpression__Group_2__1__Impl )
            // InternalTQL.g:769:2: rule__BinaryOperationExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BinaryOperationExpression__Group_2__1__Impl();

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
    // $ANTLR end "rule__BinaryOperationExpression__Group_2__1"


    // $ANTLR start "rule__BinaryOperationExpression__Group_2__1__Impl"
    // InternalTQL.g:775:1: rule__BinaryOperationExpression__Group_2__1__Impl : ( ( rule__BinaryOperationExpression__OperationAssignment_2_1 ) ) ;
    public final void rule__BinaryOperationExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:779:1: ( ( ( rule__BinaryOperationExpression__OperationAssignment_2_1 ) ) )
            // InternalTQL.g:780:1: ( ( rule__BinaryOperationExpression__OperationAssignment_2_1 ) )
            {
            // InternalTQL.g:780:1: ( ( rule__BinaryOperationExpression__OperationAssignment_2_1 ) )
            // InternalTQL.g:781:2: ( rule__BinaryOperationExpression__OperationAssignment_2_1 )
            {
             before(grammarAccess.getBinaryOperationExpressionAccess().getOperationAssignment_2_1()); 
            // InternalTQL.g:782:2: ( rule__BinaryOperationExpression__OperationAssignment_2_1 )
            // InternalTQL.g:782:3: rule__BinaryOperationExpression__OperationAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__BinaryOperationExpression__OperationAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getBinaryOperationExpressionAccess().getOperationAssignment_2_1()); 

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
    // $ANTLR end "rule__BinaryOperationExpression__Group_2__1__Impl"


    // $ANTLR start "rule__ParameterExpression__Group__0"
    // InternalTQL.g:791:1: rule__ParameterExpression__Group__0 : rule__ParameterExpression__Group__0__Impl rule__ParameterExpression__Group__1 ;
    public final void rule__ParameterExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:795:1: ( rule__ParameterExpression__Group__0__Impl rule__ParameterExpression__Group__1 )
            // InternalTQL.g:796:2: rule__ParameterExpression__Group__0__Impl rule__ParameterExpression__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__ParameterExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterExpression__Group__1();

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
    // $ANTLR end "rule__ParameterExpression__Group__0"


    // $ANTLR start "rule__ParameterExpression__Group__0__Impl"
    // InternalTQL.g:803:1: rule__ParameterExpression__Group__0__Impl : ( () ) ;
    public final void rule__ParameterExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:807:1: ( ( () ) )
            // InternalTQL.g:808:1: ( () )
            {
            // InternalTQL.g:808:1: ( () )
            // InternalTQL.g:809:2: ()
            {
             before(grammarAccess.getParameterExpressionAccess().getParameterExpressionAction_0()); 
            // InternalTQL.g:810:2: ()
            // InternalTQL.g:810:3: 
            {
            }

             after(grammarAccess.getParameterExpressionAccess().getParameterExpressionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterExpression__Group__0__Impl"


    // $ANTLR start "rule__ParameterExpression__Group__1"
    // InternalTQL.g:818:1: rule__ParameterExpression__Group__1 : rule__ParameterExpression__Group__1__Impl ;
    public final void rule__ParameterExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:822:1: ( rule__ParameterExpression__Group__1__Impl )
            // InternalTQL.g:823:2: rule__ParameterExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterExpression__Group__1__Impl();

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
    // $ANTLR end "rule__ParameterExpression__Group__1"


    // $ANTLR start "rule__ParameterExpression__Group__1__Impl"
    // InternalTQL.g:829:1: rule__ParameterExpression__Group__1__Impl : ( 'parameterExpression' ) ;
    public final void rule__ParameterExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:833:1: ( ( 'parameterExpression' ) )
            // InternalTQL.g:834:1: ( 'parameterExpression' )
            {
            // InternalTQL.g:834:1: ( 'parameterExpression' )
            // InternalTQL.g:835:2: 'parameterExpression'
            {
             before(grammarAccess.getParameterExpressionAccess().getParameterExpressionKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getParameterExpressionAccess().getParameterExpressionKeyword_1()); 

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
    // $ANTLR end "rule__ParameterExpression__Group__1__Impl"


    // $ANTLR start "rule__StringConstantExpression__Group__0"
    // InternalTQL.g:845:1: rule__StringConstantExpression__Group__0 : rule__StringConstantExpression__Group__0__Impl rule__StringConstantExpression__Group__1 ;
    public final void rule__StringConstantExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:849:1: ( rule__StringConstantExpression__Group__0__Impl rule__StringConstantExpression__Group__1 )
            // InternalTQL.g:850:2: rule__StringConstantExpression__Group__0__Impl rule__StringConstantExpression__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__StringConstantExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringConstantExpression__Group__1();

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
    // $ANTLR end "rule__StringConstantExpression__Group__0"


    // $ANTLR start "rule__StringConstantExpression__Group__0__Impl"
    // InternalTQL.g:857:1: rule__StringConstantExpression__Group__0__Impl : ( 'StringConstantExpression' ) ;
    public final void rule__StringConstantExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:861:1: ( ( 'StringConstantExpression' ) )
            // InternalTQL.g:862:1: ( 'StringConstantExpression' )
            {
            // InternalTQL.g:862:1: ( 'StringConstantExpression' )
            // InternalTQL.g:863:2: 'StringConstantExpression'
            {
             before(grammarAccess.getStringConstantExpressionAccess().getStringConstantExpressionKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getStringConstantExpressionAccess().getStringConstantExpressionKeyword_0()); 

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
    // $ANTLR end "rule__StringConstantExpression__Group__0__Impl"


    // $ANTLR start "rule__StringConstantExpression__Group__1"
    // InternalTQL.g:872:1: rule__StringConstantExpression__Group__1 : rule__StringConstantExpression__Group__1__Impl rule__StringConstantExpression__Group__2 ;
    public final void rule__StringConstantExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:876:1: ( rule__StringConstantExpression__Group__1__Impl rule__StringConstantExpression__Group__2 )
            // InternalTQL.g:877:2: rule__StringConstantExpression__Group__1__Impl rule__StringConstantExpression__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__StringConstantExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringConstantExpression__Group__2();

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
    // $ANTLR end "rule__StringConstantExpression__Group__1"


    // $ANTLR start "rule__StringConstantExpression__Group__1__Impl"
    // InternalTQL.g:884:1: rule__StringConstantExpression__Group__1__Impl : ( '{' ) ;
    public final void rule__StringConstantExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:888:1: ( ( '{' ) )
            // InternalTQL.g:889:1: ( '{' )
            {
            // InternalTQL.g:889:1: ( '{' )
            // InternalTQL.g:890:2: '{'
            {
             before(grammarAccess.getStringConstantExpressionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getStringConstantExpressionAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__StringConstantExpression__Group__1__Impl"


    // $ANTLR start "rule__StringConstantExpression__Group__2"
    // InternalTQL.g:899:1: rule__StringConstantExpression__Group__2 : rule__StringConstantExpression__Group__2__Impl rule__StringConstantExpression__Group__3 ;
    public final void rule__StringConstantExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:903:1: ( rule__StringConstantExpression__Group__2__Impl rule__StringConstantExpression__Group__3 )
            // InternalTQL.g:904:2: rule__StringConstantExpression__Group__2__Impl rule__StringConstantExpression__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__StringConstantExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringConstantExpression__Group__3();

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
    // $ANTLR end "rule__StringConstantExpression__Group__2"


    // $ANTLR start "rule__StringConstantExpression__Group__2__Impl"
    // InternalTQL.g:911:1: rule__StringConstantExpression__Group__2__Impl : ( 'value' ) ;
    public final void rule__StringConstantExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:915:1: ( ( 'value' ) )
            // InternalTQL.g:916:1: ( 'value' )
            {
            // InternalTQL.g:916:1: ( 'value' )
            // InternalTQL.g:917:2: 'value'
            {
             before(grammarAccess.getStringConstantExpressionAccess().getValueKeyword_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getStringConstantExpressionAccess().getValueKeyword_2()); 

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
    // $ANTLR end "rule__StringConstantExpression__Group__2__Impl"


    // $ANTLR start "rule__StringConstantExpression__Group__3"
    // InternalTQL.g:926:1: rule__StringConstantExpression__Group__3 : rule__StringConstantExpression__Group__3__Impl rule__StringConstantExpression__Group__4 ;
    public final void rule__StringConstantExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:930:1: ( rule__StringConstantExpression__Group__3__Impl rule__StringConstantExpression__Group__4 )
            // InternalTQL.g:931:2: rule__StringConstantExpression__Group__3__Impl rule__StringConstantExpression__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__StringConstantExpression__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringConstantExpression__Group__4();

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
    // $ANTLR end "rule__StringConstantExpression__Group__3"


    // $ANTLR start "rule__StringConstantExpression__Group__3__Impl"
    // InternalTQL.g:938:1: rule__StringConstantExpression__Group__3__Impl : ( ( rule__StringConstantExpression__ValueAssignment_3 ) ) ;
    public final void rule__StringConstantExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:942:1: ( ( ( rule__StringConstantExpression__ValueAssignment_3 ) ) )
            // InternalTQL.g:943:1: ( ( rule__StringConstantExpression__ValueAssignment_3 ) )
            {
            // InternalTQL.g:943:1: ( ( rule__StringConstantExpression__ValueAssignment_3 ) )
            // InternalTQL.g:944:2: ( rule__StringConstantExpression__ValueAssignment_3 )
            {
             before(grammarAccess.getStringConstantExpressionAccess().getValueAssignment_3()); 
            // InternalTQL.g:945:2: ( rule__StringConstantExpression__ValueAssignment_3 )
            // InternalTQL.g:945:3: rule__StringConstantExpression__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__StringConstantExpression__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getStringConstantExpressionAccess().getValueAssignment_3()); 

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
    // $ANTLR end "rule__StringConstantExpression__Group__3__Impl"


    // $ANTLR start "rule__StringConstantExpression__Group__4"
    // InternalTQL.g:953:1: rule__StringConstantExpression__Group__4 : rule__StringConstantExpression__Group__4__Impl ;
    public final void rule__StringConstantExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:957:1: ( rule__StringConstantExpression__Group__4__Impl )
            // InternalTQL.g:958:2: rule__StringConstantExpression__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringConstantExpression__Group__4__Impl();

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
    // $ANTLR end "rule__StringConstantExpression__Group__4"


    // $ANTLR start "rule__StringConstantExpression__Group__4__Impl"
    // InternalTQL.g:964:1: rule__StringConstantExpression__Group__4__Impl : ( '}' ) ;
    public final void rule__StringConstantExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:968:1: ( ( '}' ) )
            // InternalTQL.g:969:1: ( '}' )
            {
            // InternalTQL.g:969:1: ( '}' )
            // InternalTQL.g:970:2: '}'
            {
             before(grammarAccess.getStringConstantExpressionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getStringConstantExpressionAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__StringConstantExpression__Group__4__Impl"


    // $ANTLR start "rule__BooleanConstantExpression__Group__0"
    // InternalTQL.g:980:1: rule__BooleanConstantExpression__Group__0 : rule__BooleanConstantExpression__Group__0__Impl rule__BooleanConstantExpression__Group__1 ;
    public final void rule__BooleanConstantExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:984:1: ( rule__BooleanConstantExpression__Group__0__Impl rule__BooleanConstantExpression__Group__1 )
            // InternalTQL.g:985:2: rule__BooleanConstantExpression__Group__0__Impl rule__BooleanConstantExpression__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__BooleanConstantExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanConstantExpression__Group__1();

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
    // $ANTLR end "rule__BooleanConstantExpression__Group__0"


    // $ANTLR start "rule__BooleanConstantExpression__Group__0__Impl"
    // InternalTQL.g:992:1: rule__BooleanConstantExpression__Group__0__Impl : ( ( rule__BooleanConstantExpression__ValueAssignment_0 ) ) ;
    public final void rule__BooleanConstantExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:996:1: ( ( ( rule__BooleanConstantExpression__ValueAssignment_0 ) ) )
            // InternalTQL.g:997:1: ( ( rule__BooleanConstantExpression__ValueAssignment_0 ) )
            {
            // InternalTQL.g:997:1: ( ( rule__BooleanConstantExpression__ValueAssignment_0 ) )
            // InternalTQL.g:998:2: ( rule__BooleanConstantExpression__ValueAssignment_0 )
            {
             before(grammarAccess.getBooleanConstantExpressionAccess().getValueAssignment_0()); 
            // InternalTQL.g:999:2: ( rule__BooleanConstantExpression__ValueAssignment_0 )
            // InternalTQL.g:999:3: rule__BooleanConstantExpression__ValueAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__BooleanConstantExpression__ValueAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanConstantExpressionAccess().getValueAssignment_0()); 

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
    // $ANTLR end "rule__BooleanConstantExpression__Group__0__Impl"


    // $ANTLR start "rule__BooleanConstantExpression__Group__1"
    // InternalTQL.g:1007:1: rule__BooleanConstantExpression__Group__1 : rule__BooleanConstantExpression__Group__1__Impl ;
    public final void rule__BooleanConstantExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1011:1: ( rule__BooleanConstantExpression__Group__1__Impl )
            // InternalTQL.g:1012:2: rule__BooleanConstantExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanConstantExpression__Group__1__Impl();

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
    // $ANTLR end "rule__BooleanConstantExpression__Group__1"


    // $ANTLR start "rule__BooleanConstantExpression__Group__1__Impl"
    // InternalTQL.g:1018:1: rule__BooleanConstantExpression__Group__1__Impl : ( 'BooleanConstantExpression' ) ;
    public final void rule__BooleanConstantExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1022:1: ( ( 'BooleanConstantExpression' ) )
            // InternalTQL.g:1023:1: ( 'BooleanConstantExpression' )
            {
            // InternalTQL.g:1023:1: ( 'BooleanConstantExpression' )
            // InternalTQL.g:1024:2: 'BooleanConstantExpression'
            {
             before(grammarAccess.getBooleanConstantExpressionAccess().getBooleanConstantExpressionKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getBooleanConstantExpressionAccess().getBooleanConstantExpressionKeyword_1()); 

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
    // $ANTLR end "rule__BooleanConstantExpression__Group__1__Impl"


    // $ANTLR start "rule__IntegerConstantExpression__Group__0"
    // InternalTQL.g:1034:1: rule__IntegerConstantExpression__Group__0 : rule__IntegerConstantExpression__Group__0__Impl rule__IntegerConstantExpression__Group__1 ;
    public final void rule__IntegerConstantExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1038:1: ( rule__IntegerConstantExpression__Group__0__Impl rule__IntegerConstantExpression__Group__1 )
            // InternalTQL.g:1039:2: rule__IntegerConstantExpression__Group__0__Impl rule__IntegerConstantExpression__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__IntegerConstantExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerConstantExpression__Group__1();

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
    // $ANTLR end "rule__IntegerConstantExpression__Group__0"


    // $ANTLR start "rule__IntegerConstantExpression__Group__0__Impl"
    // InternalTQL.g:1046:1: rule__IntegerConstantExpression__Group__0__Impl : ( 'IntegerConstantExpression' ) ;
    public final void rule__IntegerConstantExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1050:1: ( ( 'IntegerConstantExpression' ) )
            // InternalTQL.g:1051:1: ( 'IntegerConstantExpression' )
            {
            // InternalTQL.g:1051:1: ( 'IntegerConstantExpression' )
            // InternalTQL.g:1052:2: 'IntegerConstantExpression'
            {
             before(grammarAccess.getIntegerConstantExpressionAccess().getIntegerConstantExpressionKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getIntegerConstantExpressionAccess().getIntegerConstantExpressionKeyword_0()); 

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
    // $ANTLR end "rule__IntegerConstantExpression__Group__0__Impl"


    // $ANTLR start "rule__IntegerConstantExpression__Group__1"
    // InternalTQL.g:1061:1: rule__IntegerConstantExpression__Group__1 : rule__IntegerConstantExpression__Group__1__Impl rule__IntegerConstantExpression__Group__2 ;
    public final void rule__IntegerConstantExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1065:1: ( rule__IntegerConstantExpression__Group__1__Impl rule__IntegerConstantExpression__Group__2 )
            // InternalTQL.g:1066:2: rule__IntegerConstantExpression__Group__1__Impl rule__IntegerConstantExpression__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__IntegerConstantExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerConstantExpression__Group__2();

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
    // $ANTLR end "rule__IntegerConstantExpression__Group__1"


    // $ANTLR start "rule__IntegerConstantExpression__Group__1__Impl"
    // InternalTQL.g:1073:1: rule__IntegerConstantExpression__Group__1__Impl : ( '{' ) ;
    public final void rule__IntegerConstantExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1077:1: ( ( '{' ) )
            // InternalTQL.g:1078:1: ( '{' )
            {
            // InternalTQL.g:1078:1: ( '{' )
            // InternalTQL.g:1079:2: '{'
            {
             before(grammarAccess.getIntegerConstantExpressionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getIntegerConstantExpressionAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__IntegerConstantExpression__Group__1__Impl"


    // $ANTLR start "rule__IntegerConstantExpression__Group__2"
    // InternalTQL.g:1088:1: rule__IntegerConstantExpression__Group__2 : rule__IntegerConstantExpression__Group__2__Impl rule__IntegerConstantExpression__Group__3 ;
    public final void rule__IntegerConstantExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1092:1: ( rule__IntegerConstantExpression__Group__2__Impl rule__IntegerConstantExpression__Group__3 )
            // InternalTQL.g:1093:2: rule__IntegerConstantExpression__Group__2__Impl rule__IntegerConstantExpression__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__IntegerConstantExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerConstantExpression__Group__3();

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
    // $ANTLR end "rule__IntegerConstantExpression__Group__2"


    // $ANTLR start "rule__IntegerConstantExpression__Group__2__Impl"
    // InternalTQL.g:1100:1: rule__IntegerConstantExpression__Group__2__Impl : ( 'value' ) ;
    public final void rule__IntegerConstantExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1104:1: ( ( 'value' ) )
            // InternalTQL.g:1105:1: ( 'value' )
            {
            // InternalTQL.g:1105:1: ( 'value' )
            // InternalTQL.g:1106:2: 'value'
            {
             before(grammarAccess.getIntegerConstantExpressionAccess().getValueKeyword_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getIntegerConstantExpressionAccess().getValueKeyword_2()); 

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
    // $ANTLR end "rule__IntegerConstantExpression__Group__2__Impl"


    // $ANTLR start "rule__IntegerConstantExpression__Group__3"
    // InternalTQL.g:1115:1: rule__IntegerConstantExpression__Group__3 : rule__IntegerConstantExpression__Group__3__Impl rule__IntegerConstantExpression__Group__4 ;
    public final void rule__IntegerConstantExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1119:1: ( rule__IntegerConstantExpression__Group__3__Impl rule__IntegerConstantExpression__Group__4 )
            // InternalTQL.g:1120:2: rule__IntegerConstantExpression__Group__3__Impl rule__IntegerConstantExpression__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__IntegerConstantExpression__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerConstantExpression__Group__4();

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
    // $ANTLR end "rule__IntegerConstantExpression__Group__3"


    // $ANTLR start "rule__IntegerConstantExpression__Group__3__Impl"
    // InternalTQL.g:1127:1: rule__IntegerConstantExpression__Group__3__Impl : ( ( rule__IntegerConstantExpression__ValueAssignment_3 ) ) ;
    public final void rule__IntegerConstantExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1131:1: ( ( ( rule__IntegerConstantExpression__ValueAssignment_3 ) ) )
            // InternalTQL.g:1132:1: ( ( rule__IntegerConstantExpression__ValueAssignment_3 ) )
            {
            // InternalTQL.g:1132:1: ( ( rule__IntegerConstantExpression__ValueAssignment_3 ) )
            // InternalTQL.g:1133:2: ( rule__IntegerConstantExpression__ValueAssignment_3 )
            {
             before(grammarAccess.getIntegerConstantExpressionAccess().getValueAssignment_3()); 
            // InternalTQL.g:1134:2: ( rule__IntegerConstantExpression__ValueAssignment_3 )
            // InternalTQL.g:1134:3: rule__IntegerConstantExpression__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__IntegerConstantExpression__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getIntegerConstantExpressionAccess().getValueAssignment_3()); 

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
    // $ANTLR end "rule__IntegerConstantExpression__Group__3__Impl"


    // $ANTLR start "rule__IntegerConstantExpression__Group__4"
    // InternalTQL.g:1142:1: rule__IntegerConstantExpression__Group__4 : rule__IntegerConstantExpression__Group__4__Impl ;
    public final void rule__IntegerConstantExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1146:1: ( rule__IntegerConstantExpression__Group__4__Impl )
            // InternalTQL.g:1147:2: rule__IntegerConstantExpression__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntegerConstantExpression__Group__4__Impl();

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
    // $ANTLR end "rule__IntegerConstantExpression__Group__4"


    // $ANTLR start "rule__IntegerConstantExpression__Group__4__Impl"
    // InternalTQL.g:1153:1: rule__IntegerConstantExpression__Group__4__Impl : ( '}' ) ;
    public final void rule__IntegerConstantExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1157:1: ( ( '}' ) )
            // InternalTQL.g:1158:1: ( '}' )
            {
            // InternalTQL.g:1158:1: ( '}' )
            // InternalTQL.g:1159:2: '}'
            {
             before(grammarAccess.getIntegerConstantExpressionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getIntegerConstantExpressionAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__IntegerConstantExpression__Group__4__Impl"


    // $ANTLR start "rule__InExpression__Group__0"
    // InternalTQL.g:1169:1: rule__InExpression__Group__0 : rule__InExpression__Group__0__Impl rule__InExpression__Group__1 ;
    public final void rule__InExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1173:1: ( rule__InExpression__Group__0__Impl rule__InExpression__Group__1 )
            // InternalTQL.g:1174:2: rule__InExpression__Group__0__Impl rule__InExpression__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__InExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InExpression__Group__1();

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
    // $ANTLR end "rule__InExpression__Group__0"


    // $ANTLR start "rule__InExpression__Group__0__Impl"
    // InternalTQL.g:1181:1: rule__InExpression__Group__0__Impl : ( 'InExpression' ) ;
    public final void rule__InExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1185:1: ( ( 'InExpression' ) )
            // InternalTQL.g:1186:1: ( 'InExpression' )
            {
            // InternalTQL.g:1186:1: ( 'InExpression' )
            // InternalTQL.g:1187:2: 'InExpression'
            {
             before(grammarAccess.getInExpressionAccess().getInExpressionKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getInExpressionAccess().getInExpressionKeyword_0()); 

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
    // $ANTLR end "rule__InExpression__Group__0__Impl"


    // $ANTLR start "rule__InExpression__Group__1"
    // InternalTQL.g:1196:1: rule__InExpression__Group__1 : rule__InExpression__Group__1__Impl rule__InExpression__Group__2 ;
    public final void rule__InExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1200:1: ( rule__InExpression__Group__1__Impl rule__InExpression__Group__2 )
            // InternalTQL.g:1201:2: rule__InExpression__Group__1__Impl rule__InExpression__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__InExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InExpression__Group__2();

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
    // $ANTLR end "rule__InExpression__Group__1"


    // $ANTLR start "rule__InExpression__Group__1__Impl"
    // InternalTQL.g:1208:1: rule__InExpression__Group__1__Impl : ( '{' ) ;
    public final void rule__InExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1212:1: ( ( '{' ) )
            // InternalTQL.g:1213:1: ( '{' )
            {
            // InternalTQL.g:1213:1: ( '{' )
            // InternalTQL.g:1214:2: '{'
            {
             before(grammarAccess.getInExpressionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getInExpressionAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__InExpression__Group__1__Impl"


    // $ANTLR start "rule__InExpression__Group__2"
    // InternalTQL.g:1223:1: rule__InExpression__Group__2 : rule__InExpression__Group__2__Impl rule__InExpression__Group__3 ;
    public final void rule__InExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1227:1: ( rule__InExpression__Group__2__Impl rule__InExpression__Group__3 )
            // InternalTQL.g:1228:2: rule__InExpression__Group__2__Impl rule__InExpression__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__InExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InExpression__Group__3();

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
    // $ANTLR end "rule__InExpression__Group__2"


    // $ANTLR start "rule__InExpression__Group__2__Impl"
    // InternalTQL.g:1235:1: rule__InExpression__Group__2__Impl : ( ( rule__InExpression__Group_2__0 )? ) ;
    public final void rule__InExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1239:1: ( ( ( rule__InExpression__Group_2__0 )? ) )
            // InternalTQL.g:1240:1: ( ( rule__InExpression__Group_2__0 )? )
            {
            // InternalTQL.g:1240:1: ( ( rule__InExpression__Group_2__0 )? )
            // InternalTQL.g:1241:2: ( rule__InExpression__Group_2__0 )?
            {
             before(grammarAccess.getInExpressionAccess().getGroup_2()); 
            // InternalTQL.g:1242:2: ( rule__InExpression__Group_2__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==45) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalTQL.g:1242:3: rule__InExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InExpression__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInExpressionAccess().getGroup_2()); 

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
    // $ANTLR end "rule__InExpression__Group__2__Impl"


    // $ANTLR start "rule__InExpression__Group__3"
    // InternalTQL.g:1250:1: rule__InExpression__Group__3 : rule__InExpression__Group__3__Impl rule__InExpression__Group__4 ;
    public final void rule__InExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1254:1: ( rule__InExpression__Group__3__Impl rule__InExpression__Group__4 )
            // InternalTQL.g:1255:2: rule__InExpression__Group__3__Impl rule__InExpression__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__InExpression__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InExpression__Group__4();

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
    // $ANTLR end "rule__InExpression__Group__3"


    // $ANTLR start "rule__InExpression__Group__3__Impl"
    // InternalTQL.g:1262:1: rule__InExpression__Group__3__Impl : ( 'constantSet' ) ;
    public final void rule__InExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1266:1: ( ( 'constantSet' ) )
            // InternalTQL.g:1267:1: ( 'constantSet' )
            {
            // InternalTQL.g:1267:1: ( 'constantSet' )
            // InternalTQL.g:1268:2: 'constantSet'
            {
             before(grammarAccess.getInExpressionAccess().getConstantSetKeyword_3()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getInExpressionAccess().getConstantSetKeyword_3()); 

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
    // $ANTLR end "rule__InExpression__Group__3__Impl"


    // $ANTLR start "rule__InExpression__Group__4"
    // InternalTQL.g:1277:1: rule__InExpression__Group__4 : rule__InExpression__Group__4__Impl rule__InExpression__Group__5 ;
    public final void rule__InExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1281:1: ( rule__InExpression__Group__4__Impl rule__InExpression__Group__5 )
            // InternalTQL.g:1282:2: rule__InExpression__Group__4__Impl rule__InExpression__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__InExpression__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InExpression__Group__5();

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
    // $ANTLR end "rule__InExpression__Group__4"


    // $ANTLR start "rule__InExpression__Group__4__Impl"
    // InternalTQL.g:1289:1: rule__InExpression__Group__4__Impl : ( '(' ) ;
    public final void rule__InExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1293:1: ( ( '(' ) )
            // InternalTQL.g:1294:1: ( '(' )
            {
            // InternalTQL.g:1294:1: ( '(' )
            // InternalTQL.g:1295:2: '('
            {
             before(grammarAccess.getInExpressionAccess().getLeftParenthesisKeyword_4()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getInExpressionAccess().getLeftParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__InExpression__Group__4__Impl"


    // $ANTLR start "rule__InExpression__Group__5"
    // InternalTQL.g:1304:1: rule__InExpression__Group__5 : rule__InExpression__Group__5__Impl rule__InExpression__Group__6 ;
    public final void rule__InExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1308:1: ( rule__InExpression__Group__5__Impl rule__InExpression__Group__6 )
            // InternalTQL.g:1309:2: rule__InExpression__Group__5__Impl rule__InExpression__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__InExpression__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InExpression__Group__6();

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
    // $ANTLR end "rule__InExpression__Group__5"


    // $ANTLR start "rule__InExpression__Group__5__Impl"
    // InternalTQL.g:1316:1: rule__InExpression__Group__5__Impl : ( ( rule__InExpression__ConstantSetAssignment_5 ) ) ;
    public final void rule__InExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1320:1: ( ( ( rule__InExpression__ConstantSetAssignment_5 ) ) )
            // InternalTQL.g:1321:1: ( ( rule__InExpression__ConstantSetAssignment_5 ) )
            {
            // InternalTQL.g:1321:1: ( ( rule__InExpression__ConstantSetAssignment_5 ) )
            // InternalTQL.g:1322:2: ( rule__InExpression__ConstantSetAssignment_5 )
            {
             before(grammarAccess.getInExpressionAccess().getConstantSetAssignment_5()); 
            // InternalTQL.g:1323:2: ( rule__InExpression__ConstantSetAssignment_5 )
            // InternalTQL.g:1323:3: rule__InExpression__ConstantSetAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__InExpression__ConstantSetAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getInExpressionAccess().getConstantSetAssignment_5()); 

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
    // $ANTLR end "rule__InExpression__Group__5__Impl"


    // $ANTLR start "rule__InExpression__Group__6"
    // InternalTQL.g:1331:1: rule__InExpression__Group__6 : rule__InExpression__Group__6__Impl rule__InExpression__Group__7 ;
    public final void rule__InExpression__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1335:1: ( rule__InExpression__Group__6__Impl rule__InExpression__Group__7 )
            // InternalTQL.g:1336:2: rule__InExpression__Group__6__Impl rule__InExpression__Group__7
            {
            pushFollow(FOLLOW_15);
            rule__InExpression__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InExpression__Group__7();

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
    // $ANTLR end "rule__InExpression__Group__6"


    // $ANTLR start "rule__InExpression__Group__6__Impl"
    // InternalTQL.g:1343:1: rule__InExpression__Group__6__Impl : ( ( rule__InExpression__Group_6__0 )* ) ;
    public final void rule__InExpression__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1347:1: ( ( ( rule__InExpression__Group_6__0 )* ) )
            // InternalTQL.g:1348:1: ( ( rule__InExpression__Group_6__0 )* )
            {
            // InternalTQL.g:1348:1: ( ( rule__InExpression__Group_6__0 )* )
            // InternalTQL.g:1349:2: ( rule__InExpression__Group_6__0 )*
            {
             before(grammarAccess.getInExpressionAccess().getGroup_6()); 
            // InternalTQL.g:1350:2: ( rule__InExpression__Group_6__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==46) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalTQL.g:1350:3: rule__InExpression__Group_6__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__InExpression__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getInExpressionAccess().getGroup_6()); 

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
    // $ANTLR end "rule__InExpression__Group__6__Impl"


    // $ANTLR start "rule__InExpression__Group__7"
    // InternalTQL.g:1358:1: rule__InExpression__Group__7 : rule__InExpression__Group__7__Impl rule__InExpression__Group__8 ;
    public final void rule__InExpression__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1362:1: ( rule__InExpression__Group__7__Impl rule__InExpression__Group__8 )
            // InternalTQL.g:1363:2: rule__InExpression__Group__7__Impl rule__InExpression__Group__8
            {
            pushFollow(FOLLOW_7);
            rule__InExpression__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InExpression__Group__8();

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
    // $ANTLR end "rule__InExpression__Group__7"


    // $ANTLR start "rule__InExpression__Group__7__Impl"
    // InternalTQL.g:1370:1: rule__InExpression__Group__7__Impl : ( ')' ) ;
    public final void rule__InExpression__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1374:1: ( ( ')' ) )
            // InternalTQL.g:1375:1: ( ')' )
            {
            // InternalTQL.g:1375:1: ( ')' )
            // InternalTQL.g:1376:2: ')'
            {
             before(grammarAccess.getInExpressionAccess().getRightParenthesisKeyword_7()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getInExpressionAccess().getRightParenthesisKeyword_7()); 

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
    // $ANTLR end "rule__InExpression__Group__7__Impl"


    // $ANTLR start "rule__InExpression__Group__8"
    // InternalTQL.g:1385:1: rule__InExpression__Group__8 : rule__InExpression__Group__8__Impl ;
    public final void rule__InExpression__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1389:1: ( rule__InExpression__Group__8__Impl )
            // InternalTQL.g:1390:2: rule__InExpression__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InExpression__Group__8__Impl();

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
    // $ANTLR end "rule__InExpression__Group__8"


    // $ANTLR start "rule__InExpression__Group__8__Impl"
    // InternalTQL.g:1396:1: rule__InExpression__Group__8__Impl : ( '}' ) ;
    public final void rule__InExpression__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1400:1: ( ( '}' ) )
            // InternalTQL.g:1401:1: ( '}' )
            {
            // InternalTQL.g:1401:1: ( '}' )
            // InternalTQL.g:1402:2: '}'
            {
             before(grammarAccess.getInExpressionAccess().getRightCurlyBracketKeyword_8()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getInExpressionAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__InExpression__Group__8__Impl"


    // $ANTLR start "rule__InExpression__Group_2__0"
    // InternalTQL.g:1412:1: rule__InExpression__Group_2__0 : rule__InExpression__Group_2__0__Impl rule__InExpression__Group_2__1 ;
    public final void rule__InExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1416:1: ( rule__InExpression__Group_2__0__Impl rule__InExpression__Group_2__1 )
            // InternalTQL.g:1417:2: rule__InExpression__Group_2__0__Impl rule__InExpression__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__InExpression__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InExpression__Group_2__1();

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
    // $ANTLR end "rule__InExpression__Group_2__0"


    // $ANTLR start "rule__InExpression__Group_2__0__Impl"
    // InternalTQL.g:1424:1: rule__InExpression__Group_2__0__Impl : ( 'statement' ) ;
    public final void rule__InExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1428:1: ( ( 'statement' ) )
            // InternalTQL.g:1429:1: ( 'statement' )
            {
            // InternalTQL.g:1429:1: ( 'statement' )
            // InternalTQL.g:1430:2: 'statement'
            {
             before(grammarAccess.getInExpressionAccess().getStatementKeyword_2_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getInExpressionAccess().getStatementKeyword_2_0()); 

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
    // $ANTLR end "rule__InExpression__Group_2__0__Impl"


    // $ANTLR start "rule__InExpression__Group_2__1"
    // InternalTQL.g:1439:1: rule__InExpression__Group_2__1 : rule__InExpression__Group_2__1__Impl ;
    public final void rule__InExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1443:1: ( rule__InExpression__Group_2__1__Impl )
            // InternalTQL.g:1444:2: rule__InExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InExpression__Group_2__1__Impl();

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
    // $ANTLR end "rule__InExpression__Group_2__1"


    // $ANTLR start "rule__InExpression__Group_2__1__Impl"
    // InternalTQL.g:1450:1: rule__InExpression__Group_2__1__Impl : ( ( rule__InExpression__StatementAssignment_2_1 ) ) ;
    public final void rule__InExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1454:1: ( ( ( rule__InExpression__StatementAssignment_2_1 ) ) )
            // InternalTQL.g:1455:1: ( ( rule__InExpression__StatementAssignment_2_1 ) )
            {
            // InternalTQL.g:1455:1: ( ( rule__InExpression__StatementAssignment_2_1 ) )
            // InternalTQL.g:1456:2: ( rule__InExpression__StatementAssignment_2_1 )
            {
             before(grammarAccess.getInExpressionAccess().getStatementAssignment_2_1()); 
            // InternalTQL.g:1457:2: ( rule__InExpression__StatementAssignment_2_1 )
            // InternalTQL.g:1457:3: rule__InExpression__StatementAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__InExpression__StatementAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getInExpressionAccess().getStatementAssignment_2_1()); 

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
    // $ANTLR end "rule__InExpression__Group_2__1__Impl"


    // $ANTLR start "rule__InExpression__Group_6__0"
    // InternalTQL.g:1466:1: rule__InExpression__Group_6__0 : rule__InExpression__Group_6__0__Impl rule__InExpression__Group_6__1 ;
    public final void rule__InExpression__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1470:1: ( rule__InExpression__Group_6__0__Impl rule__InExpression__Group_6__1 )
            // InternalTQL.g:1471:2: rule__InExpression__Group_6__0__Impl rule__InExpression__Group_6__1
            {
            pushFollow(FOLLOW_5);
            rule__InExpression__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InExpression__Group_6__1();

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
    // $ANTLR end "rule__InExpression__Group_6__0"


    // $ANTLR start "rule__InExpression__Group_6__0__Impl"
    // InternalTQL.g:1478:1: rule__InExpression__Group_6__0__Impl : ( ',' ) ;
    public final void rule__InExpression__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1482:1: ( ( ',' ) )
            // InternalTQL.g:1483:1: ( ',' )
            {
            // InternalTQL.g:1483:1: ( ',' )
            // InternalTQL.g:1484:2: ','
            {
             before(grammarAccess.getInExpressionAccess().getCommaKeyword_6_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getInExpressionAccess().getCommaKeyword_6_0()); 

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
    // $ANTLR end "rule__InExpression__Group_6__0__Impl"


    // $ANTLR start "rule__InExpression__Group_6__1"
    // InternalTQL.g:1493:1: rule__InExpression__Group_6__1 : rule__InExpression__Group_6__1__Impl ;
    public final void rule__InExpression__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1497:1: ( rule__InExpression__Group_6__1__Impl )
            // InternalTQL.g:1498:2: rule__InExpression__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InExpression__Group_6__1__Impl();

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
    // $ANTLR end "rule__InExpression__Group_6__1"


    // $ANTLR start "rule__InExpression__Group_6__1__Impl"
    // InternalTQL.g:1504:1: rule__InExpression__Group_6__1__Impl : ( ( rule__InExpression__ConstantSetAssignment_6_1 ) ) ;
    public final void rule__InExpression__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1508:1: ( ( ( rule__InExpression__ConstantSetAssignment_6_1 ) ) )
            // InternalTQL.g:1509:1: ( ( rule__InExpression__ConstantSetAssignment_6_1 ) )
            {
            // InternalTQL.g:1509:1: ( ( rule__InExpression__ConstantSetAssignment_6_1 ) )
            // InternalTQL.g:1510:2: ( rule__InExpression__ConstantSetAssignment_6_1 )
            {
             before(grammarAccess.getInExpressionAccess().getConstantSetAssignment_6_1()); 
            // InternalTQL.g:1511:2: ( rule__InExpression__ConstantSetAssignment_6_1 )
            // InternalTQL.g:1511:3: rule__InExpression__ConstantSetAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__InExpression__ConstantSetAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getInExpressionAccess().getConstantSetAssignment_6_1()); 

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
    // $ANTLR end "rule__InExpression__Group_6__1__Impl"


    // $ANTLR start "rule__ParseExpression__Group__0"
    // InternalTQL.g:1520:1: rule__ParseExpression__Group__0 : rule__ParseExpression__Group__0__Impl rule__ParseExpression__Group__1 ;
    public final void rule__ParseExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1524:1: ( rule__ParseExpression__Group__0__Impl rule__ParseExpression__Group__1 )
            // InternalTQL.g:1525:2: rule__ParseExpression__Group__0__Impl rule__ParseExpression__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ParseExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParseExpression__Group__1();

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
    // $ANTLR end "rule__ParseExpression__Group__0"


    // $ANTLR start "rule__ParseExpression__Group__0__Impl"
    // InternalTQL.g:1532:1: rule__ParseExpression__Group__0__Impl : ( 'ParseExpression' ) ;
    public final void rule__ParseExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1536:1: ( ( 'ParseExpression' ) )
            // InternalTQL.g:1537:1: ( 'ParseExpression' )
            {
            // InternalTQL.g:1537:1: ( 'ParseExpression' )
            // InternalTQL.g:1538:2: 'ParseExpression'
            {
             before(grammarAccess.getParseExpressionAccess().getParseExpressionKeyword_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getParseExpressionAccess().getParseExpressionKeyword_0()); 

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
    // $ANTLR end "rule__ParseExpression__Group__0__Impl"


    // $ANTLR start "rule__ParseExpression__Group__1"
    // InternalTQL.g:1547:1: rule__ParseExpression__Group__1 : rule__ParseExpression__Group__1__Impl rule__ParseExpression__Group__2 ;
    public final void rule__ParseExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1551:1: ( rule__ParseExpression__Group__1__Impl rule__ParseExpression__Group__2 )
            // InternalTQL.g:1552:2: rule__ParseExpression__Group__1__Impl rule__ParseExpression__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__ParseExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParseExpression__Group__2();

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
    // $ANTLR end "rule__ParseExpression__Group__1"


    // $ANTLR start "rule__ParseExpression__Group__1__Impl"
    // InternalTQL.g:1559:1: rule__ParseExpression__Group__1__Impl : ( '{' ) ;
    public final void rule__ParseExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1563:1: ( ( '{' ) )
            // InternalTQL.g:1564:1: ( '{' )
            {
            // InternalTQL.g:1564:1: ( '{' )
            // InternalTQL.g:1565:2: '{'
            {
             before(grammarAccess.getParseExpressionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getParseExpressionAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__ParseExpression__Group__1__Impl"


    // $ANTLR start "rule__ParseExpression__Group__2"
    // InternalTQL.g:1574:1: rule__ParseExpression__Group__2 : rule__ParseExpression__Group__2__Impl rule__ParseExpression__Group__3 ;
    public final void rule__ParseExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1578:1: ( rule__ParseExpression__Group__2__Impl rule__ParseExpression__Group__3 )
            // InternalTQL.g:1579:2: rule__ParseExpression__Group__2__Impl rule__ParseExpression__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__ParseExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParseExpression__Group__3();

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
    // $ANTLR end "rule__ParseExpression__Group__2"


    // $ANTLR start "rule__ParseExpression__Group__2__Impl"
    // InternalTQL.g:1586:1: rule__ParseExpression__Group__2__Impl : ( ( rule__ParseExpression__Group_2__0 )? ) ;
    public final void rule__ParseExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1590:1: ( ( ( rule__ParseExpression__Group_2__0 )? ) )
            // InternalTQL.g:1591:1: ( ( rule__ParseExpression__Group_2__0 )? )
            {
            // InternalTQL.g:1591:1: ( ( rule__ParseExpression__Group_2__0 )? )
            // InternalTQL.g:1592:2: ( rule__ParseExpression__Group_2__0 )?
            {
             before(grammarAccess.getParseExpressionAccess().getGroup_2()); 
            // InternalTQL.g:1593:2: ( rule__ParseExpression__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==49) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalTQL.g:1593:3: rule__ParseExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParseExpression__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParseExpressionAccess().getGroup_2()); 

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
    // $ANTLR end "rule__ParseExpression__Group__2__Impl"


    // $ANTLR start "rule__ParseExpression__Group__3"
    // InternalTQL.g:1601:1: rule__ParseExpression__Group__3 : rule__ParseExpression__Group__3__Impl rule__ParseExpression__Group__4 ;
    public final void rule__ParseExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1605:1: ( rule__ParseExpression__Group__3__Impl rule__ParseExpression__Group__4 )
            // InternalTQL.g:1606:2: rule__ParseExpression__Group__3__Impl rule__ParseExpression__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__ParseExpression__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParseExpression__Group__4();

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
    // $ANTLR end "rule__ParseExpression__Group__3"


    // $ANTLR start "rule__ParseExpression__Group__3__Impl"
    // InternalTQL.g:1613:1: rule__ParseExpression__Group__3__Impl : ( 'expression' ) ;
    public final void rule__ParseExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1617:1: ( ( 'expression' ) )
            // InternalTQL.g:1618:1: ( 'expression' )
            {
            // InternalTQL.g:1618:1: ( 'expression' )
            // InternalTQL.g:1619:2: 'expression'
            {
             before(grammarAccess.getParseExpressionAccess().getExpressionKeyword_3()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getParseExpressionAccess().getExpressionKeyword_3()); 

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
    // $ANTLR end "rule__ParseExpression__Group__3__Impl"


    // $ANTLR start "rule__ParseExpression__Group__4"
    // InternalTQL.g:1628:1: rule__ParseExpression__Group__4 : rule__ParseExpression__Group__4__Impl rule__ParseExpression__Group__5 ;
    public final void rule__ParseExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1632:1: ( rule__ParseExpression__Group__4__Impl rule__ParseExpression__Group__5 )
            // InternalTQL.g:1633:2: rule__ParseExpression__Group__4__Impl rule__ParseExpression__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__ParseExpression__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParseExpression__Group__5();

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
    // $ANTLR end "rule__ParseExpression__Group__4"


    // $ANTLR start "rule__ParseExpression__Group__4__Impl"
    // InternalTQL.g:1640:1: rule__ParseExpression__Group__4__Impl : ( ( rule__ParseExpression__ExpressionAssignment_4 ) ) ;
    public final void rule__ParseExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1644:1: ( ( ( rule__ParseExpression__ExpressionAssignment_4 ) ) )
            // InternalTQL.g:1645:1: ( ( rule__ParseExpression__ExpressionAssignment_4 ) )
            {
            // InternalTQL.g:1645:1: ( ( rule__ParseExpression__ExpressionAssignment_4 ) )
            // InternalTQL.g:1646:2: ( rule__ParseExpression__ExpressionAssignment_4 )
            {
             before(grammarAccess.getParseExpressionAccess().getExpressionAssignment_4()); 
            // InternalTQL.g:1647:2: ( rule__ParseExpression__ExpressionAssignment_4 )
            // InternalTQL.g:1647:3: rule__ParseExpression__ExpressionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ParseExpression__ExpressionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getParseExpressionAccess().getExpressionAssignment_4()); 

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
    // $ANTLR end "rule__ParseExpression__Group__4__Impl"


    // $ANTLR start "rule__ParseExpression__Group__5"
    // InternalTQL.g:1655:1: rule__ParseExpression__Group__5 : rule__ParseExpression__Group__5__Impl ;
    public final void rule__ParseExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1659:1: ( rule__ParseExpression__Group__5__Impl )
            // InternalTQL.g:1660:2: rule__ParseExpression__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParseExpression__Group__5__Impl();

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
    // $ANTLR end "rule__ParseExpression__Group__5"


    // $ANTLR start "rule__ParseExpression__Group__5__Impl"
    // InternalTQL.g:1666:1: rule__ParseExpression__Group__5__Impl : ( '}' ) ;
    public final void rule__ParseExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1670:1: ( ( '}' ) )
            // InternalTQL.g:1671:1: ( '}' )
            {
            // InternalTQL.g:1671:1: ( '}' )
            // InternalTQL.g:1672:2: '}'
            {
             before(grammarAccess.getParseExpressionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getParseExpressionAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__ParseExpression__Group__5__Impl"


    // $ANTLR start "rule__ParseExpression__Group_2__0"
    // InternalTQL.g:1682:1: rule__ParseExpression__Group_2__0 : rule__ParseExpression__Group_2__0__Impl rule__ParseExpression__Group_2__1 ;
    public final void rule__ParseExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1686:1: ( rule__ParseExpression__Group_2__0__Impl rule__ParseExpression__Group_2__1 )
            // InternalTQL.g:1687:2: rule__ParseExpression__Group_2__0__Impl rule__ParseExpression__Group_2__1
            {
            pushFollow(FOLLOW_18);
            rule__ParseExpression__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParseExpression__Group_2__1();

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
    // $ANTLR end "rule__ParseExpression__Group_2__0"


    // $ANTLR start "rule__ParseExpression__Group_2__0__Impl"
    // InternalTQL.g:1694:1: rule__ParseExpression__Group_2__0__Impl : ( 'outputType' ) ;
    public final void rule__ParseExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1698:1: ( ( 'outputType' ) )
            // InternalTQL.g:1699:1: ( 'outputType' )
            {
            // InternalTQL.g:1699:1: ( 'outputType' )
            // InternalTQL.g:1700:2: 'outputType'
            {
             before(grammarAccess.getParseExpressionAccess().getOutputTypeKeyword_2_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getParseExpressionAccess().getOutputTypeKeyword_2_0()); 

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
    // $ANTLR end "rule__ParseExpression__Group_2__0__Impl"


    // $ANTLR start "rule__ParseExpression__Group_2__1"
    // InternalTQL.g:1709:1: rule__ParseExpression__Group_2__1 : rule__ParseExpression__Group_2__1__Impl ;
    public final void rule__ParseExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1713:1: ( rule__ParseExpression__Group_2__1__Impl )
            // InternalTQL.g:1714:2: rule__ParseExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParseExpression__Group_2__1__Impl();

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
    // $ANTLR end "rule__ParseExpression__Group_2__1"


    // $ANTLR start "rule__ParseExpression__Group_2__1__Impl"
    // InternalTQL.g:1720:1: rule__ParseExpression__Group_2__1__Impl : ( ( rule__ParseExpression__OutputTypeAssignment_2_1 ) ) ;
    public final void rule__ParseExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1724:1: ( ( ( rule__ParseExpression__OutputTypeAssignment_2_1 ) ) )
            // InternalTQL.g:1725:1: ( ( rule__ParseExpression__OutputTypeAssignment_2_1 ) )
            {
            // InternalTQL.g:1725:1: ( ( rule__ParseExpression__OutputTypeAssignment_2_1 ) )
            // InternalTQL.g:1726:2: ( rule__ParseExpression__OutputTypeAssignment_2_1 )
            {
             before(grammarAccess.getParseExpressionAccess().getOutputTypeAssignment_2_1()); 
            // InternalTQL.g:1727:2: ( rule__ParseExpression__OutputTypeAssignment_2_1 )
            // InternalTQL.g:1727:3: rule__ParseExpression__OutputTypeAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ParseExpression__OutputTypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getParseExpressionAccess().getOutputTypeAssignment_2_1()); 

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
    // $ANTLR end "rule__ParseExpression__Group_2__1__Impl"


    // $ANTLR start "rule__FloatConstantExpression__Group__0"
    // InternalTQL.g:1736:1: rule__FloatConstantExpression__Group__0 : rule__FloatConstantExpression__Group__0__Impl rule__FloatConstantExpression__Group__1 ;
    public final void rule__FloatConstantExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1740:1: ( rule__FloatConstantExpression__Group__0__Impl rule__FloatConstantExpression__Group__1 )
            // InternalTQL.g:1741:2: rule__FloatConstantExpression__Group__0__Impl rule__FloatConstantExpression__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__FloatConstantExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FloatConstantExpression__Group__1();

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
    // $ANTLR end "rule__FloatConstantExpression__Group__0"


    // $ANTLR start "rule__FloatConstantExpression__Group__0__Impl"
    // InternalTQL.g:1748:1: rule__FloatConstantExpression__Group__0__Impl : ( 'FloatConstantExpression' ) ;
    public final void rule__FloatConstantExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1752:1: ( ( 'FloatConstantExpression' ) )
            // InternalTQL.g:1753:1: ( 'FloatConstantExpression' )
            {
            // InternalTQL.g:1753:1: ( 'FloatConstantExpression' )
            // InternalTQL.g:1754:2: 'FloatConstantExpression'
            {
             before(grammarAccess.getFloatConstantExpressionAccess().getFloatConstantExpressionKeyword_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getFloatConstantExpressionAccess().getFloatConstantExpressionKeyword_0()); 

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
    // $ANTLR end "rule__FloatConstantExpression__Group__0__Impl"


    // $ANTLR start "rule__FloatConstantExpression__Group__1"
    // InternalTQL.g:1763:1: rule__FloatConstantExpression__Group__1 : rule__FloatConstantExpression__Group__1__Impl rule__FloatConstantExpression__Group__2 ;
    public final void rule__FloatConstantExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1767:1: ( rule__FloatConstantExpression__Group__1__Impl rule__FloatConstantExpression__Group__2 )
            // InternalTQL.g:1768:2: rule__FloatConstantExpression__Group__1__Impl rule__FloatConstantExpression__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__FloatConstantExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FloatConstantExpression__Group__2();

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
    // $ANTLR end "rule__FloatConstantExpression__Group__1"


    // $ANTLR start "rule__FloatConstantExpression__Group__1__Impl"
    // InternalTQL.g:1775:1: rule__FloatConstantExpression__Group__1__Impl : ( '{' ) ;
    public final void rule__FloatConstantExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1779:1: ( ( '{' ) )
            // InternalTQL.g:1780:1: ( '{' )
            {
            // InternalTQL.g:1780:1: ( '{' )
            // InternalTQL.g:1781:2: '{'
            {
             before(grammarAccess.getFloatConstantExpressionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getFloatConstantExpressionAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__FloatConstantExpression__Group__1__Impl"


    // $ANTLR start "rule__FloatConstantExpression__Group__2"
    // InternalTQL.g:1790:1: rule__FloatConstantExpression__Group__2 : rule__FloatConstantExpression__Group__2__Impl rule__FloatConstantExpression__Group__3 ;
    public final void rule__FloatConstantExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1794:1: ( rule__FloatConstantExpression__Group__2__Impl rule__FloatConstantExpression__Group__3 )
            // InternalTQL.g:1795:2: rule__FloatConstantExpression__Group__2__Impl rule__FloatConstantExpression__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__FloatConstantExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FloatConstantExpression__Group__3();

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
    // $ANTLR end "rule__FloatConstantExpression__Group__2"


    // $ANTLR start "rule__FloatConstantExpression__Group__2__Impl"
    // InternalTQL.g:1802:1: rule__FloatConstantExpression__Group__2__Impl : ( 'value' ) ;
    public final void rule__FloatConstantExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1806:1: ( ( 'value' ) )
            // InternalTQL.g:1807:1: ( 'value' )
            {
            // InternalTQL.g:1807:1: ( 'value' )
            // InternalTQL.g:1808:2: 'value'
            {
             before(grammarAccess.getFloatConstantExpressionAccess().getValueKeyword_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getFloatConstantExpressionAccess().getValueKeyword_2()); 

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
    // $ANTLR end "rule__FloatConstantExpression__Group__2__Impl"


    // $ANTLR start "rule__FloatConstantExpression__Group__3"
    // InternalTQL.g:1817:1: rule__FloatConstantExpression__Group__3 : rule__FloatConstantExpression__Group__3__Impl rule__FloatConstantExpression__Group__4 ;
    public final void rule__FloatConstantExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1821:1: ( rule__FloatConstantExpression__Group__3__Impl rule__FloatConstantExpression__Group__4 )
            // InternalTQL.g:1822:2: rule__FloatConstantExpression__Group__3__Impl rule__FloatConstantExpression__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__FloatConstantExpression__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FloatConstantExpression__Group__4();

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
    // $ANTLR end "rule__FloatConstantExpression__Group__3"


    // $ANTLR start "rule__FloatConstantExpression__Group__3__Impl"
    // InternalTQL.g:1829:1: rule__FloatConstantExpression__Group__3__Impl : ( ( rule__FloatConstantExpression__ValueAssignment_3 ) ) ;
    public final void rule__FloatConstantExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1833:1: ( ( ( rule__FloatConstantExpression__ValueAssignment_3 ) ) )
            // InternalTQL.g:1834:1: ( ( rule__FloatConstantExpression__ValueAssignment_3 ) )
            {
            // InternalTQL.g:1834:1: ( ( rule__FloatConstantExpression__ValueAssignment_3 ) )
            // InternalTQL.g:1835:2: ( rule__FloatConstantExpression__ValueAssignment_3 )
            {
             before(grammarAccess.getFloatConstantExpressionAccess().getValueAssignment_3()); 
            // InternalTQL.g:1836:2: ( rule__FloatConstantExpression__ValueAssignment_3 )
            // InternalTQL.g:1836:3: rule__FloatConstantExpression__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__FloatConstantExpression__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFloatConstantExpressionAccess().getValueAssignment_3()); 

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
    // $ANTLR end "rule__FloatConstantExpression__Group__3__Impl"


    // $ANTLR start "rule__FloatConstantExpression__Group__4"
    // InternalTQL.g:1844:1: rule__FloatConstantExpression__Group__4 : rule__FloatConstantExpression__Group__4__Impl ;
    public final void rule__FloatConstantExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1848:1: ( rule__FloatConstantExpression__Group__4__Impl )
            // InternalTQL.g:1849:2: rule__FloatConstantExpression__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FloatConstantExpression__Group__4__Impl();

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
    // $ANTLR end "rule__FloatConstantExpression__Group__4"


    // $ANTLR start "rule__FloatConstantExpression__Group__4__Impl"
    // InternalTQL.g:1855:1: rule__FloatConstantExpression__Group__4__Impl : ( '}' ) ;
    public final void rule__FloatConstantExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1859:1: ( ( '}' ) )
            // InternalTQL.g:1860:1: ( '}' )
            {
            // InternalTQL.g:1860:1: ( '}' )
            // InternalTQL.g:1861:2: '}'
            {
             before(grammarAccess.getFloatConstantExpressionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getFloatConstantExpressionAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__FloatConstantExpression__Group__4__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalTQL.g:1871:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1875:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalTQL.g:1876:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalTQL.g:1883:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1887:1: ( ( ( '-' )? ) )
            // InternalTQL.g:1888:1: ( ( '-' )? )
            {
            // InternalTQL.g:1888:1: ( ( '-' )? )
            // InternalTQL.g:1889:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalTQL.g:1890:2: ( '-' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==51) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalTQL.g:1890:3: '-'
                    {
                    match(input,51,FOLLOW_2); 

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
    // InternalTQL.g:1898:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1902:1: ( rule__EInt__Group__1__Impl )
            // InternalTQL.g:1903:2: rule__EInt__Group__1__Impl
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
    // InternalTQL.g:1909:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1913:1: ( ( RULE_INT ) )
            // InternalTQL.g:1914:1: ( RULE_INT )
            {
            // InternalTQL.g:1914:1: ( RULE_INT )
            // InternalTQL.g:1915:2: RULE_INT
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
    // InternalTQL.g:1925:1: rule__EFloat__Group__0 : rule__EFloat__Group__0__Impl rule__EFloat__Group__1 ;
    public final void rule__EFloat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1929:1: ( rule__EFloat__Group__0__Impl rule__EFloat__Group__1 )
            // InternalTQL.g:1930:2: rule__EFloat__Group__0__Impl rule__EFloat__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalTQL.g:1937:1: rule__EFloat__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1941:1: ( ( ( '-' )? ) )
            // InternalTQL.g:1942:1: ( ( '-' )? )
            {
            // InternalTQL.g:1942:1: ( ( '-' )? )
            // InternalTQL.g:1943:2: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 
            // InternalTQL.g:1944:2: ( '-' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==51) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalTQL.g:1944:3: '-'
                    {
                    match(input,51,FOLLOW_2); 

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
    // InternalTQL.g:1952:1: rule__EFloat__Group__1 : rule__EFloat__Group__1__Impl rule__EFloat__Group__2 ;
    public final void rule__EFloat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1956:1: ( rule__EFloat__Group__1__Impl rule__EFloat__Group__2 )
            // InternalTQL.g:1957:2: rule__EFloat__Group__1__Impl rule__EFloat__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalTQL.g:1964:1: rule__EFloat__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EFloat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1968:1: ( ( ( RULE_INT )? ) )
            // InternalTQL.g:1969:1: ( ( RULE_INT )? )
            {
            // InternalTQL.g:1969:1: ( ( RULE_INT )? )
            // InternalTQL.g:1970:2: ( RULE_INT )?
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 
            // InternalTQL.g:1971:2: ( RULE_INT )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_INT) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalTQL.g:1971:3: RULE_INT
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
    // InternalTQL.g:1979:1: rule__EFloat__Group__2 : rule__EFloat__Group__2__Impl rule__EFloat__Group__3 ;
    public final void rule__EFloat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1983:1: ( rule__EFloat__Group__2__Impl rule__EFloat__Group__3 )
            // InternalTQL.g:1984:2: rule__EFloat__Group__2__Impl rule__EFloat__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalTQL.g:1991:1: rule__EFloat__Group__2__Impl : ( '.' ) ;
    public final void rule__EFloat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1995:1: ( ( '.' ) )
            // InternalTQL.g:1996:1: ( '.' )
            {
            // InternalTQL.g:1996:1: ( '.' )
            // InternalTQL.g:1997:2: '.'
            {
             before(grammarAccess.getEFloatAccess().getFullStopKeyword_2()); 
            match(input,52,FOLLOW_2); 
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
    // InternalTQL.g:2006:1: rule__EFloat__Group__3 : rule__EFloat__Group__3__Impl rule__EFloat__Group__4 ;
    public final void rule__EFloat__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2010:1: ( rule__EFloat__Group__3__Impl rule__EFloat__Group__4 )
            // InternalTQL.g:2011:2: rule__EFloat__Group__3__Impl rule__EFloat__Group__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalTQL.g:2018:1: rule__EFloat__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2022:1: ( ( RULE_INT ) )
            // InternalTQL.g:2023:1: ( RULE_INT )
            {
            // InternalTQL.g:2023:1: ( RULE_INT )
            // InternalTQL.g:2024:2: RULE_INT
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
    // InternalTQL.g:2033:1: rule__EFloat__Group__4 : rule__EFloat__Group__4__Impl ;
    public final void rule__EFloat__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2037:1: ( rule__EFloat__Group__4__Impl )
            // InternalTQL.g:2038:2: rule__EFloat__Group__4__Impl
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
    // InternalTQL.g:2044:1: rule__EFloat__Group__4__Impl : ( ( rule__EFloat__Group_4__0 )? ) ;
    public final void rule__EFloat__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2048:1: ( ( ( rule__EFloat__Group_4__0 )? ) )
            // InternalTQL.g:2049:1: ( ( rule__EFloat__Group_4__0 )? )
            {
            // InternalTQL.g:2049:1: ( ( rule__EFloat__Group_4__0 )? )
            // InternalTQL.g:2050:2: ( rule__EFloat__Group_4__0 )?
            {
             before(grammarAccess.getEFloatAccess().getGroup_4()); 
            // InternalTQL.g:2051:2: ( rule__EFloat__Group_4__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=11 && LA12_0<=12)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalTQL.g:2051:3: rule__EFloat__Group_4__0
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
    // InternalTQL.g:2060:1: rule__EFloat__Group_4__0 : rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 ;
    public final void rule__EFloat__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2064:1: ( rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 )
            // InternalTQL.g:2065:2: rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalTQL.g:2072:1: rule__EFloat__Group_4__0__Impl : ( ( rule__EFloat__Alternatives_4_0 ) ) ;
    public final void rule__EFloat__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2076:1: ( ( ( rule__EFloat__Alternatives_4_0 ) ) )
            // InternalTQL.g:2077:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            {
            // InternalTQL.g:2077:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            // InternalTQL.g:2078:2: ( rule__EFloat__Alternatives_4_0 )
            {
             before(grammarAccess.getEFloatAccess().getAlternatives_4_0()); 
            // InternalTQL.g:2079:2: ( rule__EFloat__Alternatives_4_0 )
            // InternalTQL.g:2079:3: rule__EFloat__Alternatives_4_0
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
    // InternalTQL.g:2087:1: rule__EFloat__Group_4__1 : rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 ;
    public final void rule__EFloat__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2091:1: ( rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 )
            // InternalTQL.g:2092:2: rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalTQL.g:2099:1: rule__EFloat__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2103:1: ( ( ( '-' )? ) )
            // InternalTQL.g:2104:1: ( ( '-' )? )
            {
            // InternalTQL.g:2104:1: ( ( '-' )? )
            // InternalTQL.g:2105:2: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 
            // InternalTQL.g:2106:2: ( '-' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==51) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalTQL.g:2106:3: '-'
                    {
                    match(input,51,FOLLOW_2); 

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
    // InternalTQL.g:2114:1: rule__EFloat__Group_4__2 : rule__EFloat__Group_4__2__Impl ;
    public final void rule__EFloat__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2118:1: ( rule__EFloat__Group_4__2__Impl )
            // InternalTQL.g:2119:2: rule__EFloat__Group_4__2__Impl
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
    // InternalTQL.g:2125:1: rule__EFloat__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2129:1: ( ( RULE_INT ) )
            // InternalTQL.g:2130:1: ( RULE_INT )
            {
            // InternalTQL.g:2130:1: ( RULE_INT )
            // InternalTQL.g:2131:2: RULE_INT
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


    // $ANTLR start "rule__BinaryOperationExpression__OperationAssignment_2_1"
    // InternalTQL.g:2141:1: rule__BinaryOperationExpression__OperationAssignment_2_1 : ( ruleBinaryFunction ) ;
    public final void rule__BinaryOperationExpression__OperationAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2145:1: ( ( ruleBinaryFunction ) )
            // InternalTQL.g:2146:2: ( ruleBinaryFunction )
            {
            // InternalTQL.g:2146:2: ( ruleBinaryFunction )
            // InternalTQL.g:2147:3: ruleBinaryFunction
            {
             before(grammarAccess.getBinaryOperationExpressionAccess().getOperationBinaryFunctionEnumRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBinaryFunction();

            state._fsp--;

             after(grammarAccess.getBinaryOperationExpressionAccess().getOperationBinaryFunctionEnumRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__BinaryOperationExpression__OperationAssignment_2_1"


    // $ANTLR start "rule__BinaryOperationExpression__LeftAssignment_4"
    // InternalTQL.g:2156:1: rule__BinaryOperationExpression__LeftAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__BinaryOperationExpression__LeftAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2160:1: ( ( ( ruleEString ) ) )
            // InternalTQL.g:2161:2: ( ( ruleEString ) )
            {
            // InternalTQL.g:2161:2: ( ( ruleEString ) )
            // InternalTQL.g:2162:3: ( ruleEString )
            {
             before(grammarAccess.getBinaryOperationExpressionAccess().getLeftExpressionCrossReference_4_0()); 
            // InternalTQL.g:2163:3: ( ruleEString )
            // InternalTQL.g:2164:4: ruleEString
            {
             before(grammarAccess.getBinaryOperationExpressionAccess().getLeftExpressionEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBinaryOperationExpressionAccess().getLeftExpressionEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getBinaryOperationExpressionAccess().getLeftExpressionCrossReference_4_0()); 

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
    // $ANTLR end "rule__BinaryOperationExpression__LeftAssignment_4"


    // $ANTLR start "rule__BinaryOperationExpression__RightAssignment_6"
    // InternalTQL.g:2175:1: rule__BinaryOperationExpression__RightAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__BinaryOperationExpression__RightAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2179:1: ( ( ( ruleEString ) ) )
            // InternalTQL.g:2180:2: ( ( ruleEString ) )
            {
            // InternalTQL.g:2180:2: ( ( ruleEString ) )
            // InternalTQL.g:2181:3: ( ruleEString )
            {
             before(grammarAccess.getBinaryOperationExpressionAccess().getRightExpressionCrossReference_6_0()); 
            // InternalTQL.g:2182:3: ( ruleEString )
            // InternalTQL.g:2183:4: ruleEString
            {
             before(grammarAccess.getBinaryOperationExpressionAccess().getRightExpressionEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBinaryOperationExpressionAccess().getRightExpressionEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getBinaryOperationExpressionAccess().getRightExpressionCrossReference_6_0()); 

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
    // $ANTLR end "rule__BinaryOperationExpression__RightAssignment_6"


    // $ANTLR start "rule__StringConstantExpression__ValueAssignment_3"
    // InternalTQL.g:2194:1: rule__StringConstantExpression__ValueAssignment_3 : ( ruleEString ) ;
    public final void rule__StringConstantExpression__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2198:1: ( ( ruleEString ) )
            // InternalTQL.g:2199:2: ( ruleEString )
            {
            // InternalTQL.g:2199:2: ( ruleEString )
            // InternalTQL.g:2200:3: ruleEString
            {
             before(grammarAccess.getStringConstantExpressionAccess().getValueEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStringConstantExpressionAccess().getValueEStringParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__StringConstantExpression__ValueAssignment_3"


    // $ANTLR start "rule__BooleanConstantExpression__ValueAssignment_0"
    // InternalTQL.g:2209:1: rule__BooleanConstantExpression__ValueAssignment_0 : ( ( 'value' ) ) ;
    public final void rule__BooleanConstantExpression__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2213:1: ( ( ( 'value' ) ) )
            // InternalTQL.g:2214:2: ( ( 'value' ) )
            {
            // InternalTQL.g:2214:2: ( ( 'value' ) )
            // InternalTQL.g:2215:3: ( 'value' )
            {
             before(grammarAccess.getBooleanConstantExpressionAccess().getValueValueKeyword_0_0()); 
            // InternalTQL.g:2216:3: ( 'value' )
            // InternalTQL.g:2217:4: 'value'
            {
             before(grammarAccess.getBooleanConstantExpressionAccess().getValueValueKeyword_0_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getBooleanConstantExpressionAccess().getValueValueKeyword_0_0()); 

            }

             after(grammarAccess.getBooleanConstantExpressionAccess().getValueValueKeyword_0_0()); 

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
    // $ANTLR end "rule__BooleanConstantExpression__ValueAssignment_0"


    // $ANTLR start "rule__IntegerConstantExpression__ValueAssignment_3"
    // InternalTQL.g:2228:1: rule__IntegerConstantExpression__ValueAssignment_3 : ( ruleEInt ) ;
    public final void rule__IntegerConstantExpression__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2232:1: ( ( ruleEInt ) )
            // InternalTQL.g:2233:2: ( ruleEInt )
            {
            // InternalTQL.g:2233:2: ( ruleEInt )
            // InternalTQL.g:2234:3: ruleEInt
            {
             before(grammarAccess.getIntegerConstantExpressionAccess().getValueEIntParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getIntegerConstantExpressionAccess().getValueEIntParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__IntegerConstantExpression__ValueAssignment_3"


    // $ANTLR start "rule__InExpression__StatementAssignment_2_1"
    // InternalTQL.g:2243:1: rule__InExpression__StatementAssignment_2_1 : ( ( ruleEString ) ) ;
    public final void rule__InExpression__StatementAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2247:1: ( ( ( ruleEString ) ) )
            // InternalTQL.g:2248:2: ( ( ruleEString ) )
            {
            // InternalTQL.g:2248:2: ( ( ruleEString ) )
            // InternalTQL.g:2249:3: ( ruleEString )
            {
             before(grammarAccess.getInExpressionAccess().getStatementExpressionCrossReference_2_1_0()); 
            // InternalTQL.g:2250:3: ( ruleEString )
            // InternalTQL.g:2251:4: ruleEString
            {
             before(grammarAccess.getInExpressionAccess().getStatementExpressionEStringParserRuleCall_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInExpressionAccess().getStatementExpressionEStringParserRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getInExpressionAccess().getStatementExpressionCrossReference_2_1_0()); 

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
    // $ANTLR end "rule__InExpression__StatementAssignment_2_1"


    // $ANTLR start "rule__InExpression__ConstantSetAssignment_5"
    // InternalTQL.g:2262:1: rule__InExpression__ConstantSetAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__InExpression__ConstantSetAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2266:1: ( ( ( ruleEString ) ) )
            // InternalTQL.g:2267:2: ( ( ruleEString ) )
            {
            // InternalTQL.g:2267:2: ( ( ruleEString ) )
            // InternalTQL.g:2268:3: ( ruleEString )
            {
             before(grammarAccess.getInExpressionAccess().getConstantSetConstantExpressionCrossReference_5_0()); 
            // InternalTQL.g:2269:3: ( ruleEString )
            // InternalTQL.g:2270:4: ruleEString
            {
             before(grammarAccess.getInExpressionAccess().getConstantSetConstantExpressionEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInExpressionAccess().getConstantSetConstantExpressionEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getInExpressionAccess().getConstantSetConstantExpressionCrossReference_5_0()); 

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
    // $ANTLR end "rule__InExpression__ConstantSetAssignment_5"


    // $ANTLR start "rule__InExpression__ConstantSetAssignment_6_1"
    // InternalTQL.g:2281:1: rule__InExpression__ConstantSetAssignment_6_1 : ( ( ruleEString ) ) ;
    public final void rule__InExpression__ConstantSetAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2285:1: ( ( ( ruleEString ) ) )
            // InternalTQL.g:2286:2: ( ( ruleEString ) )
            {
            // InternalTQL.g:2286:2: ( ( ruleEString ) )
            // InternalTQL.g:2287:3: ( ruleEString )
            {
             before(grammarAccess.getInExpressionAccess().getConstantSetConstantExpressionCrossReference_6_1_0()); 
            // InternalTQL.g:2288:3: ( ruleEString )
            // InternalTQL.g:2289:4: ruleEString
            {
             before(grammarAccess.getInExpressionAccess().getConstantSetConstantExpressionEStringParserRuleCall_6_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInExpressionAccess().getConstantSetConstantExpressionEStringParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getInExpressionAccess().getConstantSetConstantExpressionCrossReference_6_1_0()); 

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
    // $ANTLR end "rule__InExpression__ConstantSetAssignment_6_1"


    // $ANTLR start "rule__ParseExpression__OutputTypeAssignment_2_1"
    // InternalTQL.g:2300:1: rule__ParseExpression__OutputTypeAssignment_2_1 : ( ruleType ) ;
    public final void rule__ParseExpression__OutputTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2304:1: ( ( ruleType ) )
            // InternalTQL.g:2305:2: ( ruleType )
            {
            // InternalTQL.g:2305:2: ( ruleType )
            // InternalTQL.g:2306:3: ruleType
            {
             before(grammarAccess.getParseExpressionAccess().getOutputTypeTypeEnumRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getParseExpressionAccess().getOutputTypeTypeEnumRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__ParseExpression__OutputTypeAssignment_2_1"


    // $ANTLR start "rule__ParseExpression__ExpressionAssignment_4"
    // InternalTQL.g:2315:1: rule__ParseExpression__ExpressionAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__ParseExpression__ExpressionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2319:1: ( ( ( ruleEString ) ) )
            // InternalTQL.g:2320:2: ( ( ruleEString ) )
            {
            // InternalTQL.g:2320:2: ( ( ruleEString ) )
            // InternalTQL.g:2321:3: ( ruleEString )
            {
             before(grammarAccess.getParseExpressionAccess().getExpressionExpressionCrossReference_4_0()); 
            // InternalTQL.g:2322:3: ( ruleEString )
            // InternalTQL.g:2323:4: ruleEString
            {
             before(grammarAccess.getParseExpressionAccess().getExpressionExpressionEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParseExpressionAccess().getExpressionExpressionEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getParseExpressionAccess().getExpressionExpressionCrossReference_4_0()); 

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
    // $ANTLR end "rule__ParseExpression__ExpressionAssignment_4"


    // $ANTLR start "rule__FloatConstantExpression__ValueAssignment_3"
    // InternalTQL.g:2334:1: rule__FloatConstantExpression__ValueAssignment_3 : ( ruleEFloat ) ;
    public final void rule__FloatConstantExpression__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2338:1: ( ( ruleEFloat ) )
            // InternalTQL.g:2339:2: ( ruleEFloat )
            {
            // InternalTQL.g:2339:2: ( ruleEFloat )
            // InternalTQL.g:2340:3: ruleEFloat
            {
             before(grammarAccess.getFloatConstantExpressionAccess().getValueEFloatParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getFloatConstantExpressionAccess().getValueEFloatParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__FloatConstantExpression__ValueAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000900000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000007FE000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0008000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000240000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000500000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000003F800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0018000000000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000001800L});

}