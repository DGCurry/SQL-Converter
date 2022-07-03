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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'mult'", "'sum'", "'divide'", "'concat'", "'string'", "'integer'", "'floats'", "'sets'", "'DateTime'", "'Null'", "'bool'", "'BinaryOperationExpression'", "'{'", "'left'", "'right'", "'}'", "'operation'", "'parameterExpression'", "'StringConstantExpression'", "'value'", "'BooleanConstantExpression'", "'IntegerConstantExpression'", "'InExpression'", "'constantSet'", "'('", "')'", "'statement'", "','", "'ParseExpression'", "'expression'", "'outputType'", "'FloatConstantExpression'", "'-'", "'.'"
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
    // InternalTQL.g:401:1: rule__BinaryFunction__Alternatives : ( ( ( 'mult' ) ) | ( ( 'sum' ) ) | ( ( 'divide' ) ) | ( ( 'concat' ) ) );
    public final void rule__BinaryFunction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:405:1: ( ( ( 'mult' ) ) | ( ( 'sum' ) ) | ( ( 'divide' ) ) | ( ( 'concat' ) ) )
            int alt3=4;
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

            }
        }
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
    // InternalTQL.g:434:1: rule__Type__Alternatives : ( ( ( 'string' ) ) | ( ( 'integer' ) ) | ( ( 'floats' ) ) | ( ( 'sets' ) ) | ( ( 'DateTime' ) ) | ( ( 'Null' ) ) | ( ( 'bool' ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:438:1: ( ( ( 'string' ) ) | ( ( 'integer' ) ) | ( ( 'floats' ) ) | ( ( 'sets' ) ) | ( ( 'DateTime' ) ) | ( ( 'Null' ) ) | ( ( 'bool' ) ) )
            int alt4=7;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt4=1;
                }
                break;
            case 18:
                {
                alt4=2;
                }
                break;
            case 19:
                {
                alt4=3;
                }
                break;
            case 20:
                {
                alt4=4;
                }
                break;
            case 21:
                {
                alt4=5;
                }
                break;
            case 22:
                {
                alt4=6;
                }
                break;
            case 23:
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
                    // InternalTQL.g:439:2: ( ( 'string' ) )
                    {
                    // InternalTQL.g:439:2: ( ( 'string' ) )
                    // InternalTQL.g:440:3: ( 'string' )
                    {
                     before(grammarAccess.getTypeAccess().getStringEnumLiteralDeclaration_0()); 
                    // InternalTQL.g:441:3: ( 'string' )
                    // InternalTQL.g:441:4: 'string'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getStringEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTQL.g:445:2: ( ( 'integer' ) )
                    {
                    // InternalTQL.g:445:2: ( ( 'integer' ) )
                    // InternalTQL.g:446:3: ( 'integer' )
                    {
                     before(grammarAccess.getTypeAccess().getIntegerEnumLiteralDeclaration_1()); 
                    // InternalTQL.g:447:3: ( 'integer' )
                    // InternalTQL.g:447:4: 'integer'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getIntegerEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTQL.g:451:2: ( ( 'floats' ) )
                    {
                    // InternalTQL.g:451:2: ( ( 'floats' ) )
                    // InternalTQL.g:452:3: ( 'floats' )
                    {
                     before(grammarAccess.getTypeAccess().getFloatsEnumLiteralDeclaration_2()); 
                    // InternalTQL.g:453:3: ( 'floats' )
                    // InternalTQL.g:453:4: 'floats'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getFloatsEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTQL.g:457:2: ( ( 'sets' ) )
                    {
                    // InternalTQL.g:457:2: ( ( 'sets' ) )
                    // InternalTQL.g:458:3: ( 'sets' )
                    {
                     before(grammarAccess.getTypeAccess().getSetsEnumLiteralDeclaration_3()); 
                    // InternalTQL.g:459:3: ( 'sets' )
                    // InternalTQL.g:459:4: 'sets'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getSetsEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalTQL.g:463:2: ( ( 'DateTime' ) )
                    {
                    // InternalTQL.g:463:2: ( ( 'DateTime' ) )
                    // InternalTQL.g:464:3: ( 'DateTime' )
                    {
                     before(grammarAccess.getTypeAccess().getDateTimeEnumLiteralDeclaration_4()); 
                    // InternalTQL.g:465:3: ( 'DateTime' )
                    // InternalTQL.g:465:4: 'DateTime'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getDateTimeEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalTQL.g:469:2: ( ( 'Null' ) )
                    {
                    // InternalTQL.g:469:2: ( ( 'Null' ) )
                    // InternalTQL.g:470:3: ( 'Null' )
                    {
                     before(grammarAccess.getTypeAccess().getNullEnumLiteralDeclaration_5()); 
                    // InternalTQL.g:471:3: ( 'Null' )
                    // InternalTQL.g:471:4: 'Null'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getNullEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalTQL.g:475:2: ( ( 'bool' ) )
                    {
                    // InternalTQL.g:475:2: ( ( 'bool' ) )
                    // InternalTQL.g:476:3: ( 'bool' )
                    {
                     before(grammarAccess.getTypeAccess().getBoolEnumLiteralDeclaration_6()); 
                    // InternalTQL.g:477:3: ( 'bool' )
                    // InternalTQL.g:477:4: 'bool'
                    {
                    match(input,23,FOLLOW_2); 

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
    // InternalTQL.g:485:1: rule__BinaryOperationExpression__Group__0 : rule__BinaryOperationExpression__Group__0__Impl rule__BinaryOperationExpression__Group__1 ;
    public final void rule__BinaryOperationExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:489:1: ( rule__BinaryOperationExpression__Group__0__Impl rule__BinaryOperationExpression__Group__1 )
            // InternalTQL.g:490:2: rule__BinaryOperationExpression__Group__0__Impl rule__BinaryOperationExpression__Group__1
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
    // InternalTQL.g:497:1: rule__BinaryOperationExpression__Group__0__Impl : ( 'BinaryOperationExpression' ) ;
    public final void rule__BinaryOperationExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:501:1: ( ( 'BinaryOperationExpression' ) )
            // InternalTQL.g:502:1: ( 'BinaryOperationExpression' )
            {
            // InternalTQL.g:502:1: ( 'BinaryOperationExpression' )
            // InternalTQL.g:503:2: 'BinaryOperationExpression'
            {
             before(grammarAccess.getBinaryOperationExpressionAccess().getBinaryOperationExpressionKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalTQL.g:512:1: rule__BinaryOperationExpression__Group__1 : rule__BinaryOperationExpression__Group__1__Impl rule__BinaryOperationExpression__Group__2 ;
    public final void rule__BinaryOperationExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:516:1: ( rule__BinaryOperationExpression__Group__1__Impl rule__BinaryOperationExpression__Group__2 )
            // InternalTQL.g:517:2: rule__BinaryOperationExpression__Group__1__Impl rule__BinaryOperationExpression__Group__2
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
    // InternalTQL.g:524:1: rule__BinaryOperationExpression__Group__1__Impl : ( '{' ) ;
    public final void rule__BinaryOperationExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:528:1: ( ( '{' ) )
            // InternalTQL.g:529:1: ( '{' )
            {
            // InternalTQL.g:529:1: ( '{' )
            // InternalTQL.g:530:2: '{'
            {
             before(grammarAccess.getBinaryOperationExpressionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalTQL.g:539:1: rule__BinaryOperationExpression__Group__2 : rule__BinaryOperationExpression__Group__2__Impl rule__BinaryOperationExpression__Group__3 ;
    public final void rule__BinaryOperationExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:543:1: ( rule__BinaryOperationExpression__Group__2__Impl rule__BinaryOperationExpression__Group__3 )
            // InternalTQL.g:544:2: rule__BinaryOperationExpression__Group__2__Impl rule__BinaryOperationExpression__Group__3
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
    // InternalTQL.g:551:1: rule__BinaryOperationExpression__Group__2__Impl : ( ( rule__BinaryOperationExpression__Group_2__0 )? ) ;
    public final void rule__BinaryOperationExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:555:1: ( ( ( rule__BinaryOperationExpression__Group_2__0 )? ) )
            // InternalTQL.g:556:1: ( ( rule__BinaryOperationExpression__Group_2__0 )? )
            {
            // InternalTQL.g:556:1: ( ( rule__BinaryOperationExpression__Group_2__0 )? )
            // InternalTQL.g:557:2: ( rule__BinaryOperationExpression__Group_2__0 )?
            {
             before(grammarAccess.getBinaryOperationExpressionAccess().getGroup_2()); 
            // InternalTQL.g:558:2: ( rule__BinaryOperationExpression__Group_2__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==29) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalTQL.g:558:3: rule__BinaryOperationExpression__Group_2__0
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
    // InternalTQL.g:566:1: rule__BinaryOperationExpression__Group__3 : rule__BinaryOperationExpression__Group__3__Impl rule__BinaryOperationExpression__Group__4 ;
    public final void rule__BinaryOperationExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:570:1: ( rule__BinaryOperationExpression__Group__3__Impl rule__BinaryOperationExpression__Group__4 )
            // InternalTQL.g:571:2: rule__BinaryOperationExpression__Group__3__Impl rule__BinaryOperationExpression__Group__4
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
    // InternalTQL.g:578:1: rule__BinaryOperationExpression__Group__3__Impl : ( 'left' ) ;
    public final void rule__BinaryOperationExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:582:1: ( ( 'left' ) )
            // InternalTQL.g:583:1: ( 'left' )
            {
            // InternalTQL.g:583:1: ( 'left' )
            // InternalTQL.g:584:2: 'left'
            {
             before(grammarAccess.getBinaryOperationExpressionAccess().getLeftKeyword_3()); 
            match(input,26,FOLLOW_2); 
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
    // InternalTQL.g:593:1: rule__BinaryOperationExpression__Group__4 : rule__BinaryOperationExpression__Group__4__Impl rule__BinaryOperationExpression__Group__5 ;
    public final void rule__BinaryOperationExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:597:1: ( rule__BinaryOperationExpression__Group__4__Impl rule__BinaryOperationExpression__Group__5 )
            // InternalTQL.g:598:2: rule__BinaryOperationExpression__Group__4__Impl rule__BinaryOperationExpression__Group__5
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
    // InternalTQL.g:605:1: rule__BinaryOperationExpression__Group__4__Impl : ( ( rule__BinaryOperationExpression__LeftAssignment_4 ) ) ;
    public final void rule__BinaryOperationExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:609:1: ( ( ( rule__BinaryOperationExpression__LeftAssignment_4 ) ) )
            // InternalTQL.g:610:1: ( ( rule__BinaryOperationExpression__LeftAssignment_4 ) )
            {
            // InternalTQL.g:610:1: ( ( rule__BinaryOperationExpression__LeftAssignment_4 ) )
            // InternalTQL.g:611:2: ( rule__BinaryOperationExpression__LeftAssignment_4 )
            {
             before(grammarAccess.getBinaryOperationExpressionAccess().getLeftAssignment_4()); 
            // InternalTQL.g:612:2: ( rule__BinaryOperationExpression__LeftAssignment_4 )
            // InternalTQL.g:612:3: rule__BinaryOperationExpression__LeftAssignment_4
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
    // InternalTQL.g:620:1: rule__BinaryOperationExpression__Group__5 : rule__BinaryOperationExpression__Group__5__Impl rule__BinaryOperationExpression__Group__6 ;
    public final void rule__BinaryOperationExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:624:1: ( rule__BinaryOperationExpression__Group__5__Impl rule__BinaryOperationExpression__Group__6 )
            // InternalTQL.g:625:2: rule__BinaryOperationExpression__Group__5__Impl rule__BinaryOperationExpression__Group__6
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
    // InternalTQL.g:632:1: rule__BinaryOperationExpression__Group__5__Impl : ( 'right' ) ;
    public final void rule__BinaryOperationExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:636:1: ( ( 'right' ) )
            // InternalTQL.g:637:1: ( 'right' )
            {
            // InternalTQL.g:637:1: ( 'right' )
            // InternalTQL.g:638:2: 'right'
            {
             before(grammarAccess.getBinaryOperationExpressionAccess().getRightKeyword_5()); 
            match(input,27,FOLLOW_2); 
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
    // InternalTQL.g:647:1: rule__BinaryOperationExpression__Group__6 : rule__BinaryOperationExpression__Group__6__Impl rule__BinaryOperationExpression__Group__7 ;
    public final void rule__BinaryOperationExpression__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:651:1: ( rule__BinaryOperationExpression__Group__6__Impl rule__BinaryOperationExpression__Group__7 )
            // InternalTQL.g:652:2: rule__BinaryOperationExpression__Group__6__Impl rule__BinaryOperationExpression__Group__7
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
    // InternalTQL.g:659:1: rule__BinaryOperationExpression__Group__6__Impl : ( ( rule__BinaryOperationExpression__RightAssignment_6 ) ) ;
    public final void rule__BinaryOperationExpression__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:663:1: ( ( ( rule__BinaryOperationExpression__RightAssignment_6 ) ) )
            // InternalTQL.g:664:1: ( ( rule__BinaryOperationExpression__RightAssignment_6 ) )
            {
            // InternalTQL.g:664:1: ( ( rule__BinaryOperationExpression__RightAssignment_6 ) )
            // InternalTQL.g:665:2: ( rule__BinaryOperationExpression__RightAssignment_6 )
            {
             before(grammarAccess.getBinaryOperationExpressionAccess().getRightAssignment_6()); 
            // InternalTQL.g:666:2: ( rule__BinaryOperationExpression__RightAssignment_6 )
            // InternalTQL.g:666:3: rule__BinaryOperationExpression__RightAssignment_6
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
    // InternalTQL.g:674:1: rule__BinaryOperationExpression__Group__7 : rule__BinaryOperationExpression__Group__7__Impl ;
    public final void rule__BinaryOperationExpression__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:678:1: ( rule__BinaryOperationExpression__Group__7__Impl )
            // InternalTQL.g:679:2: rule__BinaryOperationExpression__Group__7__Impl
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
    // InternalTQL.g:685:1: rule__BinaryOperationExpression__Group__7__Impl : ( '}' ) ;
    public final void rule__BinaryOperationExpression__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:689:1: ( ( '}' ) )
            // InternalTQL.g:690:1: ( '}' )
            {
            // InternalTQL.g:690:1: ( '}' )
            // InternalTQL.g:691:2: '}'
            {
             before(grammarAccess.getBinaryOperationExpressionAccess().getRightCurlyBracketKeyword_7()); 
            match(input,28,FOLLOW_2); 
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
    // InternalTQL.g:701:1: rule__BinaryOperationExpression__Group_2__0 : rule__BinaryOperationExpression__Group_2__0__Impl rule__BinaryOperationExpression__Group_2__1 ;
    public final void rule__BinaryOperationExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:705:1: ( rule__BinaryOperationExpression__Group_2__0__Impl rule__BinaryOperationExpression__Group_2__1 )
            // InternalTQL.g:706:2: rule__BinaryOperationExpression__Group_2__0__Impl rule__BinaryOperationExpression__Group_2__1
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
    // InternalTQL.g:713:1: rule__BinaryOperationExpression__Group_2__0__Impl : ( 'operation' ) ;
    public final void rule__BinaryOperationExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:717:1: ( ( 'operation' ) )
            // InternalTQL.g:718:1: ( 'operation' )
            {
            // InternalTQL.g:718:1: ( 'operation' )
            // InternalTQL.g:719:2: 'operation'
            {
             before(grammarAccess.getBinaryOperationExpressionAccess().getOperationKeyword_2_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalTQL.g:728:1: rule__BinaryOperationExpression__Group_2__1 : rule__BinaryOperationExpression__Group_2__1__Impl ;
    public final void rule__BinaryOperationExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:732:1: ( rule__BinaryOperationExpression__Group_2__1__Impl )
            // InternalTQL.g:733:2: rule__BinaryOperationExpression__Group_2__1__Impl
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
    // InternalTQL.g:739:1: rule__BinaryOperationExpression__Group_2__1__Impl : ( ( rule__BinaryOperationExpression__OperationAssignment_2_1 ) ) ;
    public final void rule__BinaryOperationExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:743:1: ( ( ( rule__BinaryOperationExpression__OperationAssignment_2_1 ) ) )
            // InternalTQL.g:744:1: ( ( rule__BinaryOperationExpression__OperationAssignment_2_1 ) )
            {
            // InternalTQL.g:744:1: ( ( rule__BinaryOperationExpression__OperationAssignment_2_1 ) )
            // InternalTQL.g:745:2: ( rule__BinaryOperationExpression__OperationAssignment_2_1 )
            {
             before(grammarAccess.getBinaryOperationExpressionAccess().getOperationAssignment_2_1()); 
            // InternalTQL.g:746:2: ( rule__BinaryOperationExpression__OperationAssignment_2_1 )
            // InternalTQL.g:746:3: rule__BinaryOperationExpression__OperationAssignment_2_1
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
    // InternalTQL.g:755:1: rule__ParameterExpression__Group__0 : rule__ParameterExpression__Group__0__Impl rule__ParameterExpression__Group__1 ;
    public final void rule__ParameterExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:759:1: ( rule__ParameterExpression__Group__0__Impl rule__ParameterExpression__Group__1 )
            // InternalTQL.g:760:2: rule__ParameterExpression__Group__0__Impl rule__ParameterExpression__Group__1
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
    // InternalTQL.g:767:1: rule__ParameterExpression__Group__0__Impl : ( () ) ;
    public final void rule__ParameterExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:771:1: ( ( () ) )
            // InternalTQL.g:772:1: ( () )
            {
            // InternalTQL.g:772:1: ( () )
            // InternalTQL.g:773:2: ()
            {
             before(grammarAccess.getParameterExpressionAccess().getParameterExpressionAction_0()); 
            // InternalTQL.g:774:2: ()
            // InternalTQL.g:774:3: 
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
    // InternalTQL.g:782:1: rule__ParameterExpression__Group__1 : rule__ParameterExpression__Group__1__Impl ;
    public final void rule__ParameterExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:786:1: ( rule__ParameterExpression__Group__1__Impl )
            // InternalTQL.g:787:2: rule__ParameterExpression__Group__1__Impl
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
    // InternalTQL.g:793:1: rule__ParameterExpression__Group__1__Impl : ( 'parameterExpression' ) ;
    public final void rule__ParameterExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:797:1: ( ( 'parameterExpression' ) )
            // InternalTQL.g:798:1: ( 'parameterExpression' )
            {
            // InternalTQL.g:798:1: ( 'parameterExpression' )
            // InternalTQL.g:799:2: 'parameterExpression'
            {
             before(grammarAccess.getParameterExpressionAccess().getParameterExpressionKeyword_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalTQL.g:809:1: rule__StringConstantExpression__Group__0 : rule__StringConstantExpression__Group__0__Impl rule__StringConstantExpression__Group__1 ;
    public final void rule__StringConstantExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:813:1: ( rule__StringConstantExpression__Group__0__Impl rule__StringConstantExpression__Group__1 )
            // InternalTQL.g:814:2: rule__StringConstantExpression__Group__0__Impl rule__StringConstantExpression__Group__1
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
    // InternalTQL.g:821:1: rule__StringConstantExpression__Group__0__Impl : ( 'StringConstantExpression' ) ;
    public final void rule__StringConstantExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:825:1: ( ( 'StringConstantExpression' ) )
            // InternalTQL.g:826:1: ( 'StringConstantExpression' )
            {
            // InternalTQL.g:826:1: ( 'StringConstantExpression' )
            // InternalTQL.g:827:2: 'StringConstantExpression'
            {
             before(grammarAccess.getStringConstantExpressionAccess().getStringConstantExpressionKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalTQL.g:836:1: rule__StringConstantExpression__Group__1 : rule__StringConstantExpression__Group__1__Impl rule__StringConstantExpression__Group__2 ;
    public final void rule__StringConstantExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:840:1: ( rule__StringConstantExpression__Group__1__Impl rule__StringConstantExpression__Group__2 )
            // InternalTQL.g:841:2: rule__StringConstantExpression__Group__1__Impl rule__StringConstantExpression__Group__2
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
    // InternalTQL.g:848:1: rule__StringConstantExpression__Group__1__Impl : ( '{' ) ;
    public final void rule__StringConstantExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:852:1: ( ( '{' ) )
            // InternalTQL.g:853:1: ( '{' )
            {
            // InternalTQL.g:853:1: ( '{' )
            // InternalTQL.g:854:2: '{'
            {
             before(grammarAccess.getStringConstantExpressionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalTQL.g:863:1: rule__StringConstantExpression__Group__2 : rule__StringConstantExpression__Group__2__Impl rule__StringConstantExpression__Group__3 ;
    public final void rule__StringConstantExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:867:1: ( rule__StringConstantExpression__Group__2__Impl rule__StringConstantExpression__Group__3 )
            // InternalTQL.g:868:2: rule__StringConstantExpression__Group__2__Impl rule__StringConstantExpression__Group__3
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
    // InternalTQL.g:875:1: rule__StringConstantExpression__Group__2__Impl : ( 'value' ) ;
    public final void rule__StringConstantExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:879:1: ( ( 'value' ) )
            // InternalTQL.g:880:1: ( 'value' )
            {
            // InternalTQL.g:880:1: ( 'value' )
            // InternalTQL.g:881:2: 'value'
            {
             before(grammarAccess.getStringConstantExpressionAccess().getValueKeyword_2()); 
            match(input,32,FOLLOW_2); 
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
    // InternalTQL.g:890:1: rule__StringConstantExpression__Group__3 : rule__StringConstantExpression__Group__3__Impl rule__StringConstantExpression__Group__4 ;
    public final void rule__StringConstantExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:894:1: ( rule__StringConstantExpression__Group__3__Impl rule__StringConstantExpression__Group__4 )
            // InternalTQL.g:895:2: rule__StringConstantExpression__Group__3__Impl rule__StringConstantExpression__Group__4
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
    // InternalTQL.g:902:1: rule__StringConstantExpression__Group__3__Impl : ( ( rule__StringConstantExpression__ValueAssignment_3 ) ) ;
    public final void rule__StringConstantExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:906:1: ( ( ( rule__StringConstantExpression__ValueAssignment_3 ) ) )
            // InternalTQL.g:907:1: ( ( rule__StringConstantExpression__ValueAssignment_3 ) )
            {
            // InternalTQL.g:907:1: ( ( rule__StringConstantExpression__ValueAssignment_3 ) )
            // InternalTQL.g:908:2: ( rule__StringConstantExpression__ValueAssignment_3 )
            {
             before(grammarAccess.getStringConstantExpressionAccess().getValueAssignment_3()); 
            // InternalTQL.g:909:2: ( rule__StringConstantExpression__ValueAssignment_3 )
            // InternalTQL.g:909:3: rule__StringConstantExpression__ValueAssignment_3
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
    // InternalTQL.g:917:1: rule__StringConstantExpression__Group__4 : rule__StringConstantExpression__Group__4__Impl ;
    public final void rule__StringConstantExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:921:1: ( rule__StringConstantExpression__Group__4__Impl )
            // InternalTQL.g:922:2: rule__StringConstantExpression__Group__4__Impl
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
    // InternalTQL.g:928:1: rule__StringConstantExpression__Group__4__Impl : ( '}' ) ;
    public final void rule__StringConstantExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:932:1: ( ( '}' ) )
            // InternalTQL.g:933:1: ( '}' )
            {
            // InternalTQL.g:933:1: ( '}' )
            // InternalTQL.g:934:2: '}'
            {
             before(grammarAccess.getStringConstantExpressionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,28,FOLLOW_2); 
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
    // InternalTQL.g:944:1: rule__BooleanConstantExpression__Group__0 : rule__BooleanConstantExpression__Group__0__Impl rule__BooleanConstantExpression__Group__1 ;
    public final void rule__BooleanConstantExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:948:1: ( rule__BooleanConstantExpression__Group__0__Impl rule__BooleanConstantExpression__Group__1 )
            // InternalTQL.g:949:2: rule__BooleanConstantExpression__Group__0__Impl rule__BooleanConstantExpression__Group__1
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
    // InternalTQL.g:956:1: rule__BooleanConstantExpression__Group__0__Impl : ( ( rule__BooleanConstantExpression__ValueAssignment_0 ) ) ;
    public final void rule__BooleanConstantExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:960:1: ( ( ( rule__BooleanConstantExpression__ValueAssignment_0 ) ) )
            // InternalTQL.g:961:1: ( ( rule__BooleanConstantExpression__ValueAssignment_0 ) )
            {
            // InternalTQL.g:961:1: ( ( rule__BooleanConstantExpression__ValueAssignment_0 ) )
            // InternalTQL.g:962:2: ( rule__BooleanConstantExpression__ValueAssignment_0 )
            {
             before(grammarAccess.getBooleanConstantExpressionAccess().getValueAssignment_0()); 
            // InternalTQL.g:963:2: ( rule__BooleanConstantExpression__ValueAssignment_0 )
            // InternalTQL.g:963:3: rule__BooleanConstantExpression__ValueAssignment_0
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
    // InternalTQL.g:971:1: rule__BooleanConstantExpression__Group__1 : rule__BooleanConstantExpression__Group__1__Impl ;
    public final void rule__BooleanConstantExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:975:1: ( rule__BooleanConstantExpression__Group__1__Impl )
            // InternalTQL.g:976:2: rule__BooleanConstantExpression__Group__1__Impl
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
    // InternalTQL.g:982:1: rule__BooleanConstantExpression__Group__1__Impl : ( 'BooleanConstantExpression' ) ;
    public final void rule__BooleanConstantExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:986:1: ( ( 'BooleanConstantExpression' ) )
            // InternalTQL.g:987:1: ( 'BooleanConstantExpression' )
            {
            // InternalTQL.g:987:1: ( 'BooleanConstantExpression' )
            // InternalTQL.g:988:2: 'BooleanConstantExpression'
            {
             before(grammarAccess.getBooleanConstantExpressionAccess().getBooleanConstantExpressionKeyword_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalTQL.g:998:1: rule__IntegerConstantExpression__Group__0 : rule__IntegerConstantExpression__Group__0__Impl rule__IntegerConstantExpression__Group__1 ;
    public final void rule__IntegerConstantExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1002:1: ( rule__IntegerConstantExpression__Group__0__Impl rule__IntegerConstantExpression__Group__1 )
            // InternalTQL.g:1003:2: rule__IntegerConstantExpression__Group__0__Impl rule__IntegerConstantExpression__Group__1
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
    // InternalTQL.g:1010:1: rule__IntegerConstantExpression__Group__0__Impl : ( 'IntegerConstantExpression' ) ;
    public final void rule__IntegerConstantExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1014:1: ( ( 'IntegerConstantExpression' ) )
            // InternalTQL.g:1015:1: ( 'IntegerConstantExpression' )
            {
            // InternalTQL.g:1015:1: ( 'IntegerConstantExpression' )
            // InternalTQL.g:1016:2: 'IntegerConstantExpression'
            {
             before(grammarAccess.getIntegerConstantExpressionAccess().getIntegerConstantExpressionKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalTQL.g:1025:1: rule__IntegerConstantExpression__Group__1 : rule__IntegerConstantExpression__Group__1__Impl rule__IntegerConstantExpression__Group__2 ;
    public final void rule__IntegerConstantExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1029:1: ( rule__IntegerConstantExpression__Group__1__Impl rule__IntegerConstantExpression__Group__2 )
            // InternalTQL.g:1030:2: rule__IntegerConstantExpression__Group__1__Impl rule__IntegerConstantExpression__Group__2
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
    // InternalTQL.g:1037:1: rule__IntegerConstantExpression__Group__1__Impl : ( '{' ) ;
    public final void rule__IntegerConstantExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1041:1: ( ( '{' ) )
            // InternalTQL.g:1042:1: ( '{' )
            {
            // InternalTQL.g:1042:1: ( '{' )
            // InternalTQL.g:1043:2: '{'
            {
             before(grammarAccess.getIntegerConstantExpressionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalTQL.g:1052:1: rule__IntegerConstantExpression__Group__2 : rule__IntegerConstantExpression__Group__2__Impl rule__IntegerConstantExpression__Group__3 ;
    public final void rule__IntegerConstantExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1056:1: ( rule__IntegerConstantExpression__Group__2__Impl rule__IntegerConstantExpression__Group__3 )
            // InternalTQL.g:1057:2: rule__IntegerConstantExpression__Group__2__Impl rule__IntegerConstantExpression__Group__3
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
    // InternalTQL.g:1064:1: rule__IntegerConstantExpression__Group__2__Impl : ( 'value' ) ;
    public final void rule__IntegerConstantExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1068:1: ( ( 'value' ) )
            // InternalTQL.g:1069:1: ( 'value' )
            {
            // InternalTQL.g:1069:1: ( 'value' )
            // InternalTQL.g:1070:2: 'value'
            {
             before(grammarAccess.getIntegerConstantExpressionAccess().getValueKeyword_2()); 
            match(input,32,FOLLOW_2); 
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
    // InternalTQL.g:1079:1: rule__IntegerConstantExpression__Group__3 : rule__IntegerConstantExpression__Group__3__Impl rule__IntegerConstantExpression__Group__4 ;
    public final void rule__IntegerConstantExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1083:1: ( rule__IntegerConstantExpression__Group__3__Impl rule__IntegerConstantExpression__Group__4 )
            // InternalTQL.g:1084:2: rule__IntegerConstantExpression__Group__3__Impl rule__IntegerConstantExpression__Group__4
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
    // InternalTQL.g:1091:1: rule__IntegerConstantExpression__Group__3__Impl : ( ( rule__IntegerConstantExpression__ValueAssignment_3 ) ) ;
    public final void rule__IntegerConstantExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1095:1: ( ( ( rule__IntegerConstantExpression__ValueAssignment_3 ) ) )
            // InternalTQL.g:1096:1: ( ( rule__IntegerConstantExpression__ValueAssignment_3 ) )
            {
            // InternalTQL.g:1096:1: ( ( rule__IntegerConstantExpression__ValueAssignment_3 ) )
            // InternalTQL.g:1097:2: ( rule__IntegerConstantExpression__ValueAssignment_3 )
            {
             before(grammarAccess.getIntegerConstantExpressionAccess().getValueAssignment_3()); 
            // InternalTQL.g:1098:2: ( rule__IntegerConstantExpression__ValueAssignment_3 )
            // InternalTQL.g:1098:3: rule__IntegerConstantExpression__ValueAssignment_3
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
    // InternalTQL.g:1106:1: rule__IntegerConstantExpression__Group__4 : rule__IntegerConstantExpression__Group__4__Impl ;
    public final void rule__IntegerConstantExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1110:1: ( rule__IntegerConstantExpression__Group__4__Impl )
            // InternalTQL.g:1111:2: rule__IntegerConstantExpression__Group__4__Impl
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
    // InternalTQL.g:1117:1: rule__IntegerConstantExpression__Group__4__Impl : ( '}' ) ;
    public final void rule__IntegerConstantExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1121:1: ( ( '}' ) )
            // InternalTQL.g:1122:1: ( '}' )
            {
            // InternalTQL.g:1122:1: ( '}' )
            // InternalTQL.g:1123:2: '}'
            {
             before(grammarAccess.getIntegerConstantExpressionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,28,FOLLOW_2); 
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
    // InternalTQL.g:1133:1: rule__InExpression__Group__0 : rule__InExpression__Group__0__Impl rule__InExpression__Group__1 ;
    public final void rule__InExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1137:1: ( rule__InExpression__Group__0__Impl rule__InExpression__Group__1 )
            // InternalTQL.g:1138:2: rule__InExpression__Group__0__Impl rule__InExpression__Group__1
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
    // InternalTQL.g:1145:1: rule__InExpression__Group__0__Impl : ( 'InExpression' ) ;
    public final void rule__InExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1149:1: ( ( 'InExpression' ) )
            // InternalTQL.g:1150:1: ( 'InExpression' )
            {
            // InternalTQL.g:1150:1: ( 'InExpression' )
            // InternalTQL.g:1151:2: 'InExpression'
            {
             before(grammarAccess.getInExpressionAccess().getInExpressionKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalTQL.g:1160:1: rule__InExpression__Group__1 : rule__InExpression__Group__1__Impl rule__InExpression__Group__2 ;
    public final void rule__InExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1164:1: ( rule__InExpression__Group__1__Impl rule__InExpression__Group__2 )
            // InternalTQL.g:1165:2: rule__InExpression__Group__1__Impl rule__InExpression__Group__2
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
    // InternalTQL.g:1172:1: rule__InExpression__Group__1__Impl : ( '{' ) ;
    public final void rule__InExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1176:1: ( ( '{' ) )
            // InternalTQL.g:1177:1: ( '{' )
            {
            // InternalTQL.g:1177:1: ( '{' )
            // InternalTQL.g:1178:2: '{'
            {
             before(grammarAccess.getInExpressionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalTQL.g:1187:1: rule__InExpression__Group__2 : rule__InExpression__Group__2__Impl rule__InExpression__Group__3 ;
    public final void rule__InExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1191:1: ( rule__InExpression__Group__2__Impl rule__InExpression__Group__3 )
            // InternalTQL.g:1192:2: rule__InExpression__Group__2__Impl rule__InExpression__Group__3
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
    // InternalTQL.g:1199:1: rule__InExpression__Group__2__Impl : ( ( rule__InExpression__Group_2__0 )? ) ;
    public final void rule__InExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1203:1: ( ( ( rule__InExpression__Group_2__0 )? ) )
            // InternalTQL.g:1204:1: ( ( rule__InExpression__Group_2__0 )? )
            {
            // InternalTQL.g:1204:1: ( ( rule__InExpression__Group_2__0 )? )
            // InternalTQL.g:1205:2: ( rule__InExpression__Group_2__0 )?
            {
             before(grammarAccess.getInExpressionAccess().getGroup_2()); 
            // InternalTQL.g:1206:2: ( rule__InExpression__Group_2__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==39) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalTQL.g:1206:3: rule__InExpression__Group_2__0
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
    // InternalTQL.g:1214:1: rule__InExpression__Group__3 : rule__InExpression__Group__3__Impl rule__InExpression__Group__4 ;
    public final void rule__InExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1218:1: ( rule__InExpression__Group__3__Impl rule__InExpression__Group__4 )
            // InternalTQL.g:1219:2: rule__InExpression__Group__3__Impl rule__InExpression__Group__4
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
    // InternalTQL.g:1226:1: rule__InExpression__Group__3__Impl : ( 'constantSet' ) ;
    public final void rule__InExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1230:1: ( ( 'constantSet' ) )
            // InternalTQL.g:1231:1: ( 'constantSet' )
            {
            // InternalTQL.g:1231:1: ( 'constantSet' )
            // InternalTQL.g:1232:2: 'constantSet'
            {
             before(grammarAccess.getInExpressionAccess().getConstantSetKeyword_3()); 
            match(input,36,FOLLOW_2); 
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
    // InternalTQL.g:1241:1: rule__InExpression__Group__4 : rule__InExpression__Group__4__Impl rule__InExpression__Group__5 ;
    public final void rule__InExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1245:1: ( rule__InExpression__Group__4__Impl rule__InExpression__Group__5 )
            // InternalTQL.g:1246:2: rule__InExpression__Group__4__Impl rule__InExpression__Group__5
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
    // InternalTQL.g:1253:1: rule__InExpression__Group__4__Impl : ( '(' ) ;
    public final void rule__InExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1257:1: ( ( '(' ) )
            // InternalTQL.g:1258:1: ( '(' )
            {
            // InternalTQL.g:1258:1: ( '(' )
            // InternalTQL.g:1259:2: '('
            {
             before(grammarAccess.getInExpressionAccess().getLeftParenthesisKeyword_4()); 
            match(input,37,FOLLOW_2); 
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
    // InternalTQL.g:1268:1: rule__InExpression__Group__5 : rule__InExpression__Group__5__Impl rule__InExpression__Group__6 ;
    public final void rule__InExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1272:1: ( rule__InExpression__Group__5__Impl rule__InExpression__Group__6 )
            // InternalTQL.g:1273:2: rule__InExpression__Group__5__Impl rule__InExpression__Group__6
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
    // InternalTQL.g:1280:1: rule__InExpression__Group__5__Impl : ( ( rule__InExpression__ConstantSetAssignment_5 ) ) ;
    public final void rule__InExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1284:1: ( ( ( rule__InExpression__ConstantSetAssignment_5 ) ) )
            // InternalTQL.g:1285:1: ( ( rule__InExpression__ConstantSetAssignment_5 ) )
            {
            // InternalTQL.g:1285:1: ( ( rule__InExpression__ConstantSetAssignment_5 ) )
            // InternalTQL.g:1286:2: ( rule__InExpression__ConstantSetAssignment_5 )
            {
             before(grammarAccess.getInExpressionAccess().getConstantSetAssignment_5()); 
            // InternalTQL.g:1287:2: ( rule__InExpression__ConstantSetAssignment_5 )
            // InternalTQL.g:1287:3: rule__InExpression__ConstantSetAssignment_5
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
    // InternalTQL.g:1295:1: rule__InExpression__Group__6 : rule__InExpression__Group__6__Impl rule__InExpression__Group__7 ;
    public final void rule__InExpression__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1299:1: ( rule__InExpression__Group__6__Impl rule__InExpression__Group__7 )
            // InternalTQL.g:1300:2: rule__InExpression__Group__6__Impl rule__InExpression__Group__7
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
    // InternalTQL.g:1307:1: rule__InExpression__Group__6__Impl : ( ( rule__InExpression__Group_6__0 )* ) ;
    public final void rule__InExpression__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1311:1: ( ( ( rule__InExpression__Group_6__0 )* ) )
            // InternalTQL.g:1312:1: ( ( rule__InExpression__Group_6__0 )* )
            {
            // InternalTQL.g:1312:1: ( ( rule__InExpression__Group_6__0 )* )
            // InternalTQL.g:1313:2: ( rule__InExpression__Group_6__0 )*
            {
             before(grammarAccess.getInExpressionAccess().getGroup_6()); 
            // InternalTQL.g:1314:2: ( rule__InExpression__Group_6__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==40) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalTQL.g:1314:3: rule__InExpression__Group_6__0
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
    // InternalTQL.g:1322:1: rule__InExpression__Group__7 : rule__InExpression__Group__7__Impl rule__InExpression__Group__8 ;
    public final void rule__InExpression__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1326:1: ( rule__InExpression__Group__7__Impl rule__InExpression__Group__8 )
            // InternalTQL.g:1327:2: rule__InExpression__Group__7__Impl rule__InExpression__Group__8
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
    // InternalTQL.g:1334:1: rule__InExpression__Group__7__Impl : ( ')' ) ;
    public final void rule__InExpression__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1338:1: ( ( ')' ) )
            // InternalTQL.g:1339:1: ( ')' )
            {
            // InternalTQL.g:1339:1: ( ')' )
            // InternalTQL.g:1340:2: ')'
            {
             before(grammarAccess.getInExpressionAccess().getRightParenthesisKeyword_7()); 
            match(input,38,FOLLOW_2); 
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
    // InternalTQL.g:1349:1: rule__InExpression__Group__8 : rule__InExpression__Group__8__Impl ;
    public final void rule__InExpression__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1353:1: ( rule__InExpression__Group__8__Impl )
            // InternalTQL.g:1354:2: rule__InExpression__Group__8__Impl
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
    // InternalTQL.g:1360:1: rule__InExpression__Group__8__Impl : ( '}' ) ;
    public final void rule__InExpression__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1364:1: ( ( '}' ) )
            // InternalTQL.g:1365:1: ( '}' )
            {
            // InternalTQL.g:1365:1: ( '}' )
            // InternalTQL.g:1366:2: '}'
            {
             before(grammarAccess.getInExpressionAccess().getRightCurlyBracketKeyword_8()); 
            match(input,28,FOLLOW_2); 
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
    // InternalTQL.g:1376:1: rule__InExpression__Group_2__0 : rule__InExpression__Group_2__0__Impl rule__InExpression__Group_2__1 ;
    public final void rule__InExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1380:1: ( rule__InExpression__Group_2__0__Impl rule__InExpression__Group_2__1 )
            // InternalTQL.g:1381:2: rule__InExpression__Group_2__0__Impl rule__InExpression__Group_2__1
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
    // InternalTQL.g:1388:1: rule__InExpression__Group_2__0__Impl : ( 'statement' ) ;
    public final void rule__InExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1392:1: ( ( 'statement' ) )
            // InternalTQL.g:1393:1: ( 'statement' )
            {
            // InternalTQL.g:1393:1: ( 'statement' )
            // InternalTQL.g:1394:2: 'statement'
            {
             before(grammarAccess.getInExpressionAccess().getStatementKeyword_2_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalTQL.g:1403:1: rule__InExpression__Group_2__1 : rule__InExpression__Group_2__1__Impl ;
    public final void rule__InExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1407:1: ( rule__InExpression__Group_2__1__Impl )
            // InternalTQL.g:1408:2: rule__InExpression__Group_2__1__Impl
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
    // InternalTQL.g:1414:1: rule__InExpression__Group_2__1__Impl : ( ( rule__InExpression__StatementAssignment_2_1 ) ) ;
    public final void rule__InExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1418:1: ( ( ( rule__InExpression__StatementAssignment_2_1 ) ) )
            // InternalTQL.g:1419:1: ( ( rule__InExpression__StatementAssignment_2_1 ) )
            {
            // InternalTQL.g:1419:1: ( ( rule__InExpression__StatementAssignment_2_1 ) )
            // InternalTQL.g:1420:2: ( rule__InExpression__StatementAssignment_2_1 )
            {
             before(grammarAccess.getInExpressionAccess().getStatementAssignment_2_1()); 
            // InternalTQL.g:1421:2: ( rule__InExpression__StatementAssignment_2_1 )
            // InternalTQL.g:1421:3: rule__InExpression__StatementAssignment_2_1
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
    // InternalTQL.g:1430:1: rule__InExpression__Group_6__0 : rule__InExpression__Group_6__0__Impl rule__InExpression__Group_6__1 ;
    public final void rule__InExpression__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1434:1: ( rule__InExpression__Group_6__0__Impl rule__InExpression__Group_6__1 )
            // InternalTQL.g:1435:2: rule__InExpression__Group_6__0__Impl rule__InExpression__Group_6__1
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
    // InternalTQL.g:1442:1: rule__InExpression__Group_6__0__Impl : ( ',' ) ;
    public final void rule__InExpression__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1446:1: ( ( ',' ) )
            // InternalTQL.g:1447:1: ( ',' )
            {
            // InternalTQL.g:1447:1: ( ',' )
            // InternalTQL.g:1448:2: ','
            {
             before(grammarAccess.getInExpressionAccess().getCommaKeyword_6_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalTQL.g:1457:1: rule__InExpression__Group_6__1 : rule__InExpression__Group_6__1__Impl ;
    public final void rule__InExpression__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1461:1: ( rule__InExpression__Group_6__1__Impl )
            // InternalTQL.g:1462:2: rule__InExpression__Group_6__1__Impl
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
    // InternalTQL.g:1468:1: rule__InExpression__Group_6__1__Impl : ( ( rule__InExpression__ConstantSetAssignment_6_1 ) ) ;
    public final void rule__InExpression__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1472:1: ( ( ( rule__InExpression__ConstantSetAssignment_6_1 ) ) )
            // InternalTQL.g:1473:1: ( ( rule__InExpression__ConstantSetAssignment_6_1 ) )
            {
            // InternalTQL.g:1473:1: ( ( rule__InExpression__ConstantSetAssignment_6_1 ) )
            // InternalTQL.g:1474:2: ( rule__InExpression__ConstantSetAssignment_6_1 )
            {
             before(grammarAccess.getInExpressionAccess().getConstantSetAssignment_6_1()); 
            // InternalTQL.g:1475:2: ( rule__InExpression__ConstantSetAssignment_6_1 )
            // InternalTQL.g:1475:3: rule__InExpression__ConstantSetAssignment_6_1
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
    // InternalTQL.g:1484:1: rule__ParseExpression__Group__0 : rule__ParseExpression__Group__0__Impl rule__ParseExpression__Group__1 ;
    public final void rule__ParseExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1488:1: ( rule__ParseExpression__Group__0__Impl rule__ParseExpression__Group__1 )
            // InternalTQL.g:1489:2: rule__ParseExpression__Group__0__Impl rule__ParseExpression__Group__1
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
    // InternalTQL.g:1496:1: rule__ParseExpression__Group__0__Impl : ( 'ParseExpression' ) ;
    public final void rule__ParseExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1500:1: ( ( 'ParseExpression' ) )
            // InternalTQL.g:1501:1: ( 'ParseExpression' )
            {
            // InternalTQL.g:1501:1: ( 'ParseExpression' )
            // InternalTQL.g:1502:2: 'ParseExpression'
            {
             before(grammarAccess.getParseExpressionAccess().getParseExpressionKeyword_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalTQL.g:1511:1: rule__ParseExpression__Group__1 : rule__ParseExpression__Group__1__Impl rule__ParseExpression__Group__2 ;
    public final void rule__ParseExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1515:1: ( rule__ParseExpression__Group__1__Impl rule__ParseExpression__Group__2 )
            // InternalTQL.g:1516:2: rule__ParseExpression__Group__1__Impl rule__ParseExpression__Group__2
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
    // InternalTQL.g:1523:1: rule__ParseExpression__Group__1__Impl : ( '{' ) ;
    public final void rule__ParseExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1527:1: ( ( '{' ) )
            // InternalTQL.g:1528:1: ( '{' )
            {
            // InternalTQL.g:1528:1: ( '{' )
            // InternalTQL.g:1529:2: '{'
            {
             before(grammarAccess.getParseExpressionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalTQL.g:1538:1: rule__ParseExpression__Group__2 : rule__ParseExpression__Group__2__Impl rule__ParseExpression__Group__3 ;
    public final void rule__ParseExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1542:1: ( rule__ParseExpression__Group__2__Impl rule__ParseExpression__Group__3 )
            // InternalTQL.g:1543:2: rule__ParseExpression__Group__2__Impl rule__ParseExpression__Group__3
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
    // InternalTQL.g:1550:1: rule__ParseExpression__Group__2__Impl : ( ( rule__ParseExpression__Group_2__0 )? ) ;
    public final void rule__ParseExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1554:1: ( ( ( rule__ParseExpression__Group_2__0 )? ) )
            // InternalTQL.g:1555:1: ( ( rule__ParseExpression__Group_2__0 )? )
            {
            // InternalTQL.g:1555:1: ( ( rule__ParseExpression__Group_2__0 )? )
            // InternalTQL.g:1556:2: ( rule__ParseExpression__Group_2__0 )?
            {
             before(grammarAccess.getParseExpressionAccess().getGroup_2()); 
            // InternalTQL.g:1557:2: ( rule__ParseExpression__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==43) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalTQL.g:1557:3: rule__ParseExpression__Group_2__0
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
    // InternalTQL.g:1565:1: rule__ParseExpression__Group__3 : rule__ParseExpression__Group__3__Impl rule__ParseExpression__Group__4 ;
    public final void rule__ParseExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1569:1: ( rule__ParseExpression__Group__3__Impl rule__ParseExpression__Group__4 )
            // InternalTQL.g:1570:2: rule__ParseExpression__Group__3__Impl rule__ParseExpression__Group__4
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
    // InternalTQL.g:1577:1: rule__ParseExpression__Group__3__Impl : ( 'expression' ) ;
    public final void rule__ParseExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1581:1: ( ( 'expression' ) )
            // InternalTQL.g:1582:1: ( 'expression' )
            {
            // InternalTQL.g:1582:1: ( 'expression' )
            // InternalTQL.g:1583:2: 'expression'
            {
             before(grammarAccess.getParseExpressionAccess().getExpressionKeyword_3()); 
            match(input,42,FOLLOW_2); 
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
    // InternalTQL.g:1592:1: rule__ParseExpression__Group__4 : rule__ParseExpression__Group__4__Impl rule__ParseExpression__Group__5 ;
    public final void rule__ParseExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1596:1: ( rule__ParseExpression__Group__4__Impl rule__ParseExpression__Group__5 )
            // InternalTQL.g:1597:2: rule__ParseExpression__Group__4__Impl rule__ParseExpression__Group__5
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
    // InternalTQL.g:1604:1: rule__ParseExpression__Group__4__Impl : ( ( rule__ParseExpression__ExpressionAssignment_4 ) ) ;
    public final void rule__ParseExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1608:1: ( ( ( rule__ParseExpression__ExpressionAssignment_4 ) ) )
            // InternalTQL.g:1609:1: ( ( rule__ParseExpression__ExpressionAssignment_4 ) )
            {
            // InternalTQL.g:1609:1: ( ( rule__ParseExpression__ExpressionAssignment_4 ) )
            // InternalTQL.g:1610:2: ( rule__ParseExpression__ExpressionAssignment_4 )
            {
             before(grammarAccess.getParseExpressionAccess().getExpressionAssignment_4()); 
            // InternalTQL.g:1611:2: ( rule__ParseExpression__ExpressionAssignment_4 )
            // InternalTQL.g:1611:3: rule__ParseExpression__ExpressionAssignment_4
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
    // InternalTQL.g:1619:1: rule__ParseExpression__Group__5 : rule__ParseExpression__Group__5__Impl ;
    public final void rule__ParseExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1623:1: ( rule__ParseExpression__Group__5__Impl )
            // InternalTQL.g:1624:2: rule__ParseExpression__Group__5__Impl
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
    // InternalTQL.g:1630:1: rule__ParseExpression__Group__5__Impl : ( '}' ) ;
    public final void rule__ParseExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1634:1: ( ( '}' ) )
            // InternalTQL.g:1635:1: ( '}' )
            {
            // InternalTQL.g:1635:1: ( '}' )
            // InternalTQL.g:1636:2: '}'
            {
             before(grammarAccess.getParseExpressionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,28,FOLLOW_2); 
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
    // InternalTQL.g:1646:1: rule__ParseExpression__Group_2__0 : rule__ParseExpression__Group_2__0__Impl rule__ParseExpression__Group_2__1 ;
    public final void rule__ParseExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1650:1: ( rule__ParseExpression__Group_2__0__Impl rule__ParseExpression__Group_2__1 )
            // InternalTQL.g:1651:2: rule__ParseExpression__Group_2__0__Impl rule__ParseExpression__Group_2__1
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
    // InternalTQL.g:1658:1: rule__ParseExpression__Group_2__0__Impl : ( 'outputType' ) ;
    public final void rule__ParseExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1662:1: ( ( 'outputType' ) )
            // InternalTQL.g:1663:1: ( 'outputType' )
            {
            // InternalTQL.g:1663:1: ( 'outputType' )
            // InternalTQL.g:1664:2: 'outputType'
            {
             before(grammarAccess.getParseExpressionAccess().getOutputTypeKeyword_2_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalTQL.g:1673:1: rule__ParseExpression__Group_2__1 : rule__ParseExpression__Group_2__1__Impl ;
    public final void rule__ParseExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1677:1: ( rule__ParseExpression__Group_2__1__Impl )
            // InternalTQL.g:1678:2: rule__ParseExpression__Group_2__1__Impl
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
    // InternalTQL.g:1684:1: rule__ParseExpression__Group_2__1__Impl : ( ( rule__ParseExpression__OutputTypeAssignment_2_1 ) ) ;
    public final void rule__ParseExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1688:1: ( ( ( rule__ParseExpression__OutputTypeAssignment_2_1 ) ) )
            // InternalTQL.g:1689:1: ( ( rule__ParseExpression__OutputTypeAssignment_2_1 ) )
            {
            // InternalTQL.g:1689:1: ( ( rule__ParseExpression__OutputTypeAssignment_2_1 ) )
            // InternalTQL.g:1690:2: ( rule__ParseExpression__OutputTypeAssignment_2_1 )
            {
             before(grammarAccess.getParseExpressionAccess().getOutputTypeAssignment_2_1()); 
            // InternalTQL.g:1691:2: ( rule__ParseExpression__OutputTypeAssignment_2_1 )
            // InternalTQL.g:1691:3: rule__ParseExpression__OutputTypeAssignment_2_1
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
    // InternalTQL.g:1700:1: rule__FloatConstantExpression__Group__0 : rule__FloatConstantExpression__Group__0__Impl rule__FloatConstantExpression__Group__1 ;
    public final void rule__FloatConstantExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1704:1: ( rule__FloatConstantExpression__Group__0__Impl rule__FloatConstantExpression__Group__1 )
            // InternalTQL.g:1705:2: rule__FloatConstantExpression__Group__0__Impl rule__FloatConstantExpression__Group__1
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
    // InternalTQL.g:1712:1: rule__FloatConstantExpression__Group__0__Impl : ( 'FloatConstantExpression' ) ;
    public final void rule__FloatConstantExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1716:1: ( ( 'FloatConstantExpression' ) )
            // InternalTQL.g:1717:1: ( 'FloatConstantExpression' )
            {
            // InternalTQL.g:1717:1: ( 'FloatConstantExpression' )
            // InternalTQL.g:1718:2: 'FloatConstantExpression'
            {
             before(grammarAccess.getFloatConstantExpressionAccess().getFloatConstantExpressionKeyword_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalTQL.g:1727:1: rule__FloatConstantExpression__Group__1 : rule__FloatConstantExpression__Group__1__Impl rule__FloatConstantExpression__Group__2 ;
    public final void rule__FloatConstantExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1731:1: ( rule__FloatConstantExpression__Group__1__Impl rule__FloatConstantExpression__Group__2 )
            // InternalTQL.g:1732:2: rule__FloatConstantExpression__Group__1__Impl rule__FloatConstantExpression__Group__2
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
    // InternalTQL.g:1739:1: rule__FloatConstantExpression__Group__1__Impl : ( '{' ) ;
    public final void rule__FloatConstantExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1743:1: ( ( '{' ) )
            // InternalTQL.g:1744:1: ( '{' )
            {
            // InternalTQL.g:1744:1: ( '{' )
            // InternalTQL.g:1745:2: '{'
            {
             before(grammarAccess.getFloatConstantExpressionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalTQL.g:1754:1: rule__FloatConstantExpression__Group__2 : rule__FloatConstantExpression__Group__2__Impl rule__FloatConstantExpression__Group__3 ;
    public final void rule__FloatConstantExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1758:1: ( rule__FloatConstantExpression__Group__2__Impl rule__FloatConstantExpression__Group__3 )
            // InternalTQL.g:1759:2: rule__FloatConstantExpression__Group__2__Impl rule__FloatConstantExpression__Group__3
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
    // InternalTQL.g:1766:1: rule__FloatConstantExpression__Group__2__Impl : ( 'value' ) ;
    public final void rule__FloatConstantExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1770:1: ( ( 'value' ) )
            // InternalTQL.g:1771:1: ( 'value' )
            {
            // InternalTQL.g:1771:1: ( 'value' )
            // InternalTQL.g:1772:2: 'value'
            {
             before(grammarAccess.getFloatConstantExpressionAccess().getValueKeyword_2()); 
            match(input,32,FOLLOW_2); 
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
    // InternalTQL.g:1781:1: rule__FloatConstantExpression__Group__3 : rule__FloatConstantExpression__Group__3__Impl rule__FloatConstantExpression__Group__4 ;
    public final void rule__FloatConstantExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1785:1: ( rule__FloatConstantExpression__Group__3__Impl rule__FloatConstantExpression__Group__4 )
            // InternalTQL.g:1786:2: rule__FloatConstantExpression__Group__3__Impl rule__FloatConstantExpression__Group__4
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
    // InternalTQL.g:1793:1: rule__FloatConstantExpression__Group__3__Impl : ( ( rule__FloatConstantExpression__ValueAssignment_3 ) ) ;
    public final void rule__FloatConstantExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1797:1: ( ( ( rule__FloatConstantExpression__ValueAssignment_3 ) ) )
            // InternalTQL.g:1798:1: ( ( rule__FloatConstantExpression__ValueAssignment_3 ) )
            {
            // InternalTQL.g:1798:1: ( ( rule__FloatConstantExpression__ValueAssignment_3 ) )
            // InternalTQL.g:1799:2: ( rule__FloatConstantExpression__ValueAssignment_3 )
            {
             before(grammarAccess.getFloatConstantExpressionAccess().getValueAssignment_3()); 
            // InternalTQL.g:1800:2: ( rule__FloatConstantExpression__ValueAssignment_3 )
            // InternalTQL.g:1800:3: rule__FloatConstantExpression__ValueAssignment_3
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
    // InternalTQL.g:1808:1: rule__FloatConstantExpression__Group__4 : rule__FloatConstantExpression__Group__4__Impl ;
    public final void rule__FloatConstantExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1812:1: ( rule__FloatConstantExpression__Group__4__Impl )
            // InternalTQL.g:1813:2: rule__FloatConstantExpression__Group__4__Impl
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
    // InternalTQL.g:1819:1: rule__FloatConstantExpression__Group__4__Impl : ( '}' ) ;
    public final void rule__FloatConstantExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1823:1: ( ( '}' ) )
            // InternalTQL.g:1824:1: ( '}' )
            {
            // InternalTQL.g:1824:1: ( '}' )
            // InternalTQL.g:1825:2: '}'
            {
             before(grammarAccess.getFloatConstantExpressionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,28,FOLLOW_2); 
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
    // InternalTQL.g:1835:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1839:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalTQL.g:1840:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
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
    // InternalTQL.g:1847:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1851:1: ( ( ( '-' )? ) )
            // InternalTQL.g:1852:1: ( ( '-' )? )
            {
            // InternalTQL.g:1852:1: ( ( '-' )? )
            // InternalTQL.g:1853:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalTQL.g:1854:2: ( '-' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==45) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalTQL.g:1854:3: '-'
                    {
                    match(input,45,FOLLOW_2); 

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
    // InternalTQL.g:1862:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1866:1: ( rule__EInt__Group__1__Impl )
            // InternalTQL.g:1867:2: rule__EInt__Group__1__Impl
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
    // InternalTQL.g:1873:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1877:1: ( ( RULE_INT ) )
            // InternalTQL.g:1878:1: ( RULE_INT )
            {
            // InternalTQL.g:1878:1: ( RULE_INT )
            // InternalTQL.g:1879:2: RULE_INT
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
    // InternalTQL.g:1889:1: rule__EFloat__Group__0 : rule__EFloat__Group__0__Impl rule__EFloat__Group__1 ;
    public final void rule__EFloat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1893:1: ( rule__EFloat__Group__0__Impl rule__EFloat__Group__1 )
            // InternalTQL.g:1894:2: rule__EFloat__Group__0__Impl rule__EFloat__Group__1
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
    // InternalTQL.g:1901:1: rule__EFloat__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1905:1: ( ( ( '-' )? ) )
            // InternalTQL.g:1906:1: ( ( '-' )? )
            {
            // InternalTQL.g:1906:1: ( ( '-' )? )
            // InternalTQL.g:1907:2: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 
            // InternalTQL.g:1908:2: ( '-' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==45) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalTQL.g:1908:3: '-'
                    {
                    match(input,45,FOLLOW_2); 

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
    // InternalTQL.g:1916:1: rule__EFloat__Group__1 : rule__EFloat__Group__1__Impl rule__EFloat__Group__2 ;
    public final void rule__EFloat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1920:1: ( rule__EFloat__Group__1__Impl rule__EFloat__Group__2 )
            // InternalTQL.g:1921:2: rule__EFloat__Group__1__Impl rule__EFloat__Group__2
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
    // InternalTQL.g:1928:1: rule__EFloat__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EFloat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1932:1: ( ( ( RULE_INT )? ) )
            // InternalTQL.g:1933:1: ( ( RULE_INT )? )
            {
            // InternalTQL.g:1933:1: ( ( RULE_INT )? )
            // InternalTQL.g:1934:2: ( RULE_INT )?
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 
            // InternalTQL.g:1935:2: ( RULE_INT )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_INT) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalTQL.g:1935:3: RULE_INT
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
    // InternalTQL.g:1943:1: rule__EFloat__Group__2 : rule__EFloat__Group__2__Impl rule__EFloat__Group__3 ;
    public final void rule__EFloat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1947:1: ( rule__EFloat__Group__2__Impl rule__EFloat__Group__3 )
            // InternalTQL.g:1948:2: rule__EFloat__Group__2__Impl rule__EFloat__Group__3
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
    // InternalTQL.g:1955:1: rule__EFloat__Group__2__Impl : ( '.' ) ;
    public final void rule__EFloat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1959:1: ( ( '.' ) )
            // InternalTQL.g:1960:1: ( '.' )
            {
            // InternalTQL.g:1960:1: ( '.' )
            // InternalTQL.g:1961:2: '.'
            {
             before(grammarAccess.getEFloatAccess().getFullStopKeyword_2()); 
            match(input,46,FOLLOW_2); 
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
    // InternalTQL.g:1970:1: rule__EFloat__Group__3 : rule__EFloat__Group__3__Impl rule__EFloat__Group__4 ;
    public final void rule__EFloat__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1974:1: ( rule__EFloat__Group__3__Impl rule__EFloat__Group__4 )
            // InternalTQL.g:1975:2: rule__EFloat__Group__3__Impl rule__EFloat__Group__4
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
    // InternalTQL.g:1982:1: rule__EFloat__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:1986:1: ( ( RULE_INT ) )
            // InternalTQL.g:1987:1: ( RULE_INT )
            {
            // InternalTQL.g:1987:1: ( RULE_INT )
            // InternalTQL.g:1988:2: RULE_INT
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
    // InternalTQL.g:1997:1: rule__EFloat__Group__4 : rule__EFloat__Group__4__Impl ;
    public final void rule__EFloat__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2001:1: ( rule__EFloat__Group__4__Impl )
            // InternalTQL.g:2002:2: rule__EFloat__Group__4__Impl
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
    // InternalTQL.g:2008:1: rule__EFloat__Group__4__Impl : ( ( rule__EFloat__Group_4__0 )? ) ;
    public final void rule__EFloat__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2012:1: ( ( ( rule__EFloat__Group_4__0 )? ) )
            // InternalTQL.g:2013:1: ( ( rule__EFloat__Group_4__0 )? )
            {
            // InternalTQL.g:2013:1: ( ( rule__EFloat__Group_4__0 )? )
            // InternalTQL.g:2014:2: ( rule__EFloat__Group_4__0 )?
            {
             before(grammarAccess.getEFloatAccess().getGroup_4()); 
            // InternalTQL.g:2015:2: ( rule__EFloat__Group_4__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=11 && LA12_0<=12)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalTQL.g:2015:3: rule__EFloat__Group_4__0
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
    // InternalTQL.g:2024:1: rule__EFloat__Group_4__0 : rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 ;
    public final void rule__EFloat__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2028:1: ( rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 )
            // InternalTQL.g:2029:2: rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1
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
    // InternalTQL.g:2036:1: rule__EFloat__Group_4__0__Impl : ( ( rule__EFloat__Alternatives_4_0 ) ) ;
    public final void rule__EFloat__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2040:1: ( ( ( rule__EFloat__Alternatives_4_0 ) ) )
            // InternalTQL.g:2041:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            {
            // InternalTQL.g:2041:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            // InternalTQL.g:2042:2: ( rule__EFloat__Alternatives_4_0 )
            {
             before(grammarAccess.getEFloatAccess().getAlternatives_4_0()); 
            // InternalTQL.g:2043:2: ( rule__EFloat__Alternatives_4_0 )
            // InternalTQL.g:2043:3: rule__EFloat__Alternatives_4_0
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
    // InternalTQL.g:2051:1: rule__EFloat__Group_4__1 : rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 ;
    public final void rule__EFloat__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2055:1: ( rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 )
            // InternalTQL.g:2056:2: rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2
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
    // InternalTQL.g:2063:1: rule__EFloat__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2067:1: ( ( ( '-' )? ) )
            // InternalTQL.g:2068:1: ( ( '-' )? )
            {
            // InternalTQL.g:2068:1: ( ( '-' )? )
            // InternalTQL.g:2069:2: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 
            // InternalTQL.g:2070:2: ( '-' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==45) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalTQL.g:2070:3: '-'
                    {
                    match(input,45,FOLLOW_2); 

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
    // InternalTQL.g:2078:1: rule__EFloat__Group_4__2 : rule__EFloat__Group_4__2__Impl ;
    public final void rule__EFloat__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2082:1: ( rule__EFloat__Group_4__2__Impl )
            // InternalTQL.g:2083:2: rule__EFloat__Group_4__2__Impl
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
    // InternalTQL.g:2089:1: rule__EFloat__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2093:1: ( ( RULE_INT ) )
            // InternalTQL.g:2094:1: ( RULE_INT )
            {
            // InternalTQL.g:2094:1: ( RULE_INT )
            // InternalTQL.g:2095:2: RULE_INT
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
    // InternalTQL.g:2105:1: rule__BinaryOperationExpression__OperationAssignment_2_1 : ( ruleBinaryFunction ) ;
    public final void rule__BinaryOperationExpression__OperationAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2109:1: ( ( ruleBinaryFunction ) )
            // InternalTQL.g:2110:2: ( ruleBinaryFunction )
            {
            // InternalTQL.g:2110:2: ( ruleBinaryFunction )
            // InternalTQL.g:2111:3: ruleBinaryFunction
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
    // InternalTQL.g:2120:1: rule__BinaryOperationExpression__LeftAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__BinaryOperationExpression__LeftAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2124:1: ( ( ( ruleEString ) ) )
            // InternalTQL.g:2125:2: ( ( ruleEString ) )
            {
            // InternalTQL.g:2125:2: ( ( ruleEString ) )
            // InternalTQL.g:2126:3: ( ruleEString )
            {
             before(grammarAccess.getBinaryOperationExpressionAccess().getLeftExpressionCrossReference_4_0()); 
            // InternalTQL.g:2127:3: ( ruleEString )
            // InternalTQL.g:2128:4: ruleEString
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
    // InternalTQL.g:2139:1: rule__BinaryOperationExpression__RightAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__BinaryOperationExpression__RightAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2143:1: ( ( ( ruleEString ) ) )
            // InternalTQL.g:2144:2: ( ( ruleEString ) )
            {
            // InternalTQL.g:2144:2: ( ( ruleEString ) )
            // InternalTQL.g:2145:3: ( ruleEString )
            {
             before(grammarAccess.getBinaryOperationExpressionAccess().getRightExpressionCrossReference_6_0()); 
            // InternalTQL.g:2146:3: ( ruleEString )
            // InternalTQL.g:2147:4: ruleEString
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
    // InternalTQL.g:2158:1: rule__StringConstantExpression__ValueAssignment_3 : ( ruleEString ) ;
    public final void rule__StringConstantExpression__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2162:1: ( ( ruleEString ) )
            // InternalTQL.g:2163:2: ( ruleEString )
            {
            // InternalTQL.g:2163:2: ( ruleEString )
            // InternalTQL.g:2164:3: ruleEString
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
    // InternalTQL.g:2173:1: rule__BooleanConstantExpression__ValueAssignment_0 : ( ( 'value' ) ) ;
    public final void rule__BooleanConstantExpression__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2177:1: ( ( ( 'value' ) ) )
            // InternalTQL.g:2178:2: ( ( 'value' ) )
            {
            // InternalTQL.g:2178:2: ( ( 'value' ) )
            // InternalTQL.g:2179:3: ( 'value' )
            {
             before(grammarAccess.getBooleanConstantExpressionAccess().getValueValueKeyword_0_0()); 
            // InternalTQL.g:2180:3: ( 'value' )
            // InternalTQL.g:2181:4: 'value'
            {
             before(grammarAccess.getBooleanConstantExpressionAccess().getValueValueKeyword_0_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalTQL.g:2192:1: rule__IntegerConstantExpression__ValueAssignment_3 : ( ruleEInt ) ;
    public final void rule__IntegerConstantExpression__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2196:1: ( ( ruleEInt ) )
            // InternalTQL.g:2197:2: ( ruleEInt )
            {
            // InternalTQL.g:2197:2: ( ruleEInt )
            // InternalTQL.g:2198:3: ruleEInt
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
    // InternalTQL.g:2207:1: rule__InExpression__StatementAssignment_2_1 : ( ( ruleEString ) ) ;
    public final void rule__InExpression__StatementAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2211:1: ( ( ( ruleEString ) ) )
            // InternalTQL.g:2212:2: ( ( ruleEString ) )
            {
            // InternalTQL.g:2212:2: ( ( ruleEString ) )
            // InternalTQL.g:2213:3: ( ruleEString )
            {
             before(grammarAccess.getInExpressionAccess().getStatementExpressionCrossReference_2_1_0()); 
            // InternalTQL.g:2214:3: ( ruleEString )
            // InternalTQL.g:2215:4: ruleEString
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
    // InternalTQL.g:2226:1: rule__InExpression__ConstantSetAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__InExpression__ConstantSetAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2230:1: ( ( ( ruleEString ) ) )
            // InternalTQL.g:2231:2: ( ( ruleEString ) )
            {
            // InternalTQL.g:2231:2: ( ( ruleEString ) )
            // InternalTQL.g:2232:3: ( ruleEString )
            {
             before(grammarAccess.getInExpressionAccess().getConstantSetConstantExpressionCrossReference_5_0()); 
            // InternalTQL.g:2233:3: ( ruleEString )
            // InternalTQL.g:2234:4: ruleEString
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
    // InternalTQL.g:2245:1: rule__InExpression__ConstantSetAssignment_6_1 : ( ( ruleEString ) ) ;
    public final void rule__InExpression__ConstantSetAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2249:1: ( ( ( ruleEString ) ) )
            // InternalTQL.g:2250:2: ( ( ruleEString ) )
            {
            // InternalTQL.g:2250:2: ( ( ruleEString ) )
            // InternalTQL.g:2251:3: ( ruleEString )
            {
             before(grammarAccess.getInExpressionAccess().getConstantSetConstantExpressionCrossReference_6_1_0()); 
            // InternalTQL.g:2252:3: ( ruleEString )
            // InternalTQL.g:2253:4: ruleEString
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
    // InternalTQL.g:2264:1: rule__ParseExpression__OutputTypeAssignment_2_1 : ( ruleType ) ;
    public final void rule__ParseExpression__OutputTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2268:1: ( ( ruleType ) )
            // InternalTQL.g:2269:2: ( ruleType )
            {
            // InternalTQL.g:2269:2: ( ruleType )
            // InternalTQL.g:2270:3: ruleType
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
    // InternalTQL.g:2279:1: rule__ParseExpression__ExpressionAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__ParseExpression__ExpressionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2283:1: ( ( ( ruleEString ) ) )
            // InternalTQL.g:2284:2: ( ( ruleEString ) )
            {
            // InternalTQL.g:2284:2: ( ( ruleEString ) )
            // InternalTQL.g:2285:3: ( ruleEString )
            {
             before(grammarAccess.getParseExpressionAccess().getExpressionExpressionCrossReference_4_0()); 
            // InternalTQL.g:2286:3: ( ruleEString )
            // InternalTQL.g:2287:4: ruleEString
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
    // InternalTQL.g:2298:1: rule__FloatConstantExpression__ValueAssignment_3 : ( ruleEFloat ) ;
    public final void rule__FloatConstantExpression__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTQL.g:2302:1: ( ( ruleEFloat ) )
            // InternalTQL.g:2303:2: ( ruleEFloat )
            {
            // InternalTQL.g:2303:2: ( ruleEFloat )
            // InternalTQL.g:2304:3: ruleEFloat
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000024000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000200000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000009000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000014000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000FE0000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000600000000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000001800L});

}