package com.knitml.dsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import com.knitml.dsl.services.KnittingExpressionLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalKnittingExpressionLanguageParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_LF", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'round'", "'flat'", "'rows'", "'rounds'", "'Row'", "'Round'", "'Rows'", "'Rounds'", "'even'", "'odd'", "'WS'", "'RS'", "'K'", "'k'", "'Knit'", "'knit'", "'st'", "'sts'", "'tbl'", "'ttl'", "'P'", "'p'", "'Purl'", "'purl'", "'Rev'", "'Reverse'", "'rev'", "'reverse'", "'Sl'", "'sl'", "'Slip'", "'slip'", "'next st'", "'kw'", "'knitwise'", "'pw'", "'purlwise'", "'wyif'", "'wyib'", "'Repeat'", "'repeat'", "'Instruction'", "'('", "')'", "'with'", "','", "'shape'", "'{'", "'}'", "':'", "'and'", "'all'", "'side'", "'count'", "'to'", "'['", "']'", "'-'", "'key'", "'Next'", "'Short'", "'Long'", "'inform'", "'reset'", "'tog'", "'end'", "'marker'", "'before end'", "'before gap'", "'before marker'", "'times'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=5;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int RULE_LF=4;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=7;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__80=80;
    public static final int T__46=46;
    public static final int T__81=81;
    public static final int T__47=47;
    public static final int T__82=82;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
    public static final int T__32=32;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=10;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;

    // delegates
    // delegators


        public InternalKnittingExpressionLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalKnittingExpressionLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalKnittingExpressionLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g"; }


     
     	private KnittingExpressionLanguageGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(KnittingExpressionLanguageGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRulePattern"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:61:1: entryRulePattern : rulePattern EOF ;
    public final void entryRulePattern() throws RecognitionException {
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:62:1: ( rulePattern EOF )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:63:1: rulePattern EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternRule()); 
            }
            pushFollow(FOLLOW_rulePattern_in_entryRulePattern67);
            rulePattern();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePattern74); if (state.failed) return ;

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
    // $ANTLR end "entryRulePattern"


    // $ANTLR start "rulePattern"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:70:1: rulePattern : ( ( rule__Pattern__Group__0 ) ) ;
    public final void rulePattern() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:74:2: ( ( ( rule__Pattern__Group__0 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:75:1: ( ( rule__Pattern__Group__0 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:75:1: ( ( rule__Pattern__Group__0 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:76:1: ( rule__Pattern__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getGroup()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:77:1: ( rule__Pattern__Group__0 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:77:2: rule__Pattern__Group__0
            {
            pushFollow(FOLLOW_rule__Pattern__Group__0_in_rulePattern100);
            rule__Pattern__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePattern"


    // $ANTLR start "entryRuleBlockOperation"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:89:1: entryRuleBlockOperation : ruleBlockOperation EOF ;
    public final void entryRuleBlockOperation() throws RecognitionException {
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:90:1: ( ruleBlockOperation EOF )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:91:1: ruleBlockOperation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockOperationRule()); 
            }
            pushFollow(FOLLOW_ruleBlockOperation_in_entryRuleBlockOperation127);
            ruleBlockOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockOperationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlockOperation134); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBlockOperation"


    // $ANTLR start "ruleBlockOperation"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:98:1: ruleBlockOperation : ( ( rule__BlockOperation__Alternatives ) ) ;
    public final void ruleBlockOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:102:2: ( ( ( rule__BlockOperation__Alternatives ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:103:1: ( ( rule__BlockOperation__Alternatives ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:103:1: ( ( rule__BlockOperation__Alternatives ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:104:1: ( rule__BlockOperation__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockOperationAccess().getAlternatives()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:105:1: ( rule__BlockOperation__Alternatives )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:105:2: rule__BlockOperation__Alternatives
            {
            pushFollow(FOLLOW_rule__BlockOperation__Alternatives_in_ruleBlockOperation160);
            rule__BlockOperation__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockOperationAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBlockOperation"


    // $ANTLR start "entryRuleInstruction"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:117:1: entryRuleInstruction : ruleInstruction EOF ;
    public final void entryRuleInstruction() throws RecognitionException {
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:118:1: ( ruleInstruction EOF )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:119:1: ruleInstruction EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstructionRule()); 
            }
            pushFollow(FOLLOW_ruleInstruction_in_entryRuleInstruction187);
            ruleInstruction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstructionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstruction194); if (state.failed) return ;

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
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:126:1: ruleInstruction : ( ( rule__Instruction__Group__0 ) ) ;
    public final void ruleInstruction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:130:2: ( ( ( rule__Instruction__Group__0 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:131:1: ( ( rule__Instruction__Group__0 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:131:1: ( ( rule__Instruction__Group__0 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:132:1: ( rule__Instruction__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstructionAccess().getGroup()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:133:1: ( rule__Instruction__Group__0 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:133:2: rule__Instruction__Group__0
            {
            pushFollow(FOLLOW_rule__Instruction__Group__0_in_ruleInstruction220);
            rule__Instruction__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstructionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleRow"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:145:1: entryRuleRow : ruleRow EOF ;
    public final void entryRuleRow() throws RecognitionException {
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:146:1: ( ruleRow EOF )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:147:1: ruleRow EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowRule()); 
            }
            pushFollow(FOLLOW_ruleRow_in_entryRuleRow247);
            ruleRow();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRowRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRow254); if (state.failed) return ;

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
    // $ANTLR end "entryRuleRow"


    // $ANTLR start "ruleRow"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:154:1: ruleRow : ( ( rule__Row__Group__0 ) ) ;
    public final void ruleRow() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:158:2: ( ( ( rule__Row__Group__0 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:159:1: ( ( rule__Row__Group__0 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:159:1: ( ( rule__Row__Group__0 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:160:1: ( rule__Row__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getGroup()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:161:1: ( rule__Row__Group__0 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:161:2: rule__Row__Group__0
            {
            pushFollow(FOLLOW_rule__Row__Group__0_in_ruleRow280);
            rule__Row__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRowAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRow"


    // $ANTLR start "entryRuleMessage"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:173:1: entryRuleMessage : ruleMessage EOF ;
    public final void entryRuleMessage() throws RecognitionException {
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:174:1: ( ruleMessage EOF )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:175:1: ruleMessage EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageRule()); 
            }
            pushFollow(FOLLOW_ruleMessage_in_entryRuleMessage307);
            ruleMessage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessage314); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMessage"


    // $ANTLR start "ruleMessage"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:182:1: ruleMessage : ( ( rule__Message__Group__0 ) ) ;
    public final void ruleMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:186:2: ( ( ( rule__Message__Group__0 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:187:1: ( ( rule__Message__Group__0 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:187:1: ( ( rule__Message__Group__0 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:188:1: ( rule__Message__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getGroup()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:189:1: ( rule__Message__Group__0 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:189:2: rule__Message__Group__0
            {
            pushFollow(FOLLOW_rule__Message__Group__0_in_ruleMessage340);
            rule__Message__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMessage"


    // $ANTLR start "entryRuleInlineOperation"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:201:1: entryRuleInlineOperation : ruleInlineOperation EOF ;
    public final void entryRuleInlineOperation() throws RecognitionException {
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:202:1: ( ruleInlineOperation EOF )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:203:1: ruleInlineOperation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInlineOperationRule()); 
            }
            pushFollow(FOLLOW_ruleInlineOperation_in_entryRuleInlineOperation367);
            ruleInlineOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInlineOperationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInlineOperation374); if (state.failed) return ;

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
    // $ANTLR end "entryRuleInlineOperation"


    // $ANTLR start "ruleInlineOperation"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:210:1: ruleInlineOperation : ( ( rule__InlineOperation__Alternatives ) ) ;
    public final void ruleInlineOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:214:2: ( ( ( rule__InlineOperation__Alternatives ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:215:1: ( ( rule__InlineOperation__Alternatives ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:215:1: ( ( rule__InlineOperation__Alternatives ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:216:1: ( rule__InlineOperation__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInlineOperationAccess().getAlternatives()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:217:1: ( rule__InlineOperation__Alternatives )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:217:2: rule__InlineOperation__Alternatives
            {
            pushFollow(FOLLOW_rule__InlineOperation__Alternatives_in_ruleInlineOperation400);
            rule__InlineOperation__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInlineOperationAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInlineOperation"


    // $ANTLR start "entryRuleKnit"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:229:1: entryRuleKnit : ruleKnit EOF ;
    public final void entryRuleKnit() throws RecognitionException {
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:230:1: ( ruleKnit EOF )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:231:1: ruleKnit EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKnitRule()); 
            }
            pushFollow(FOLLOW_ruleKnit_in_entryRuleKnit427);
            ruleKnit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKnitRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleKnit434); if (state.failed) return ;

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
    // $ANTLR end "entryRuleKnit"


    // $ANTLR start "ruleKnit"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:238:1: ruleKnit : ( ( rule__Knit__Group__0 ) ) ;
    public final void ruleKnit() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:242:2: ( ( ( rule__Knit__Group__0 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:243:1: ( ( rule__Knit__Group__0 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:243:1: ( ( rule__Knit__Group__0 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:244:1: ( rule__Knit__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKnitAccess().getGroup()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:245:1: ( rule__Knit__Group__0 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:245:2: rule__Knit__Group__0
            {
            pushFollow(FOLLOW_rule__Knit__Group__0_in_ruleKnit460);
            rule__Knit__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKnitAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKnit"


    // $ANTLR start "entryRulePurl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:257:1: entryRulePurl : rulePurl EOF ;
    public final void entryRulePurl() throws RecognitionException {
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:258:1: ( rulePurl EOF )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:259:1: rulePurl EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPurlRule()); 
            }
            pushFollow(FOLLOW_rulePurl_in_entryRulePurl487);
            rulePurl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPurlRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePurl494); if (state.failed) return ;

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
    // $ANTLR end "entryRulePurl"


    // $ANTLR start "rulePurl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:266:1: rulePurl : ( ( rule__Purl__Group__0 ) ) ;
    public final void rulePurl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:270:2: ( ( ( rule__Purl__Group__0 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:271:1: ( ( rule__Purl__Group__0 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:271:1: ( ( rule__Purl__Group__0 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:272:1: ( rule__Purl__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPurlAccess().getGroup()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:273:1: ( rule__Purl__Group__0 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:273:2: rule__Purl__Group__0
            {
            pushFollow(FOLLOW_rule__Purl__Group__0_in_rulePurl520);
            rule__Purl__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPurlAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePurl"


    // $ANTLR start "entryRuleSlip"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:285:1: entryRuleSlip : ruleSlip EOF ;
    public final void entryRuleSlip() throws RecognitionException {
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:286:1: ( ruleSlip EOF )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:287:1: ruleSlip EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSlipRule()); 
            }
            pushFollow(FOLLOW_ruleSlip_in_entryRuleSlip547);
            ruleSlip();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSlipRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSlip554); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSlip"


    // $ANTLR start "ruleSlip"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:294:1: ruleSlip : ( ( rule__Slip__Group__0 ) ) ;
    public final void ruleSlip() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:298:2: ( ( ( rule__Slip__Group__0 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:299:1: ( ( rule__Slip__Group__0 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:299:1: ( ( rule__Slip__Group__0 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:300:1: ( rule__Slip__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSlipAccess().getGroup()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:301:1: ( rule__Slip__Group__0 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:301:2: rule__Slip__Group__0
            {
            pushFollow(FOLLOW_rule__Slip__Group__0_in_ruleSlip580);
            rule__Slip__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSlipAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSlip"


    // $ANTLR start "entryRuleRepeatSpec"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:313:1: entryRuleRepeatSpec : ruleRepeatSpec EOF ;
    public final void entryRuleRepeatSpec() throws RecognitionException {
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:314:1: ( ruleRepeatSpec EOF )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:315:1: ruleRepeatSpec EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatSpecRule()); 
            }
            pushFollow(FOLLOW_ruleRepeatSpec_in_entryRuleRepeatSpec607);
            ruleRepeatSpec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatSpecRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRepeatSpec614); if (state.failed) return ;

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
    // $ANTLR end "entryRuleRepeatSpec"


    // $ANTLR start "ruleRepeatSpec"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:322:1: ruleRepeatSpec : ( ( rule__RepeatSpec__Alternatives ) ) ;
    public final void ruleRepeatSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:326:2: ( ( ( rule__RepeatSpec__Alternatives ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:327:1: ( ( rule__RepeatSpec__Alternatives ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:327:1: ( ( rule__RepeatSpec__Alternatives ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:328:1: ( rule__RepeatSpec__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatSpecAccess().getAlternatives()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:329:1: ( rule__RepeatSpec__Alternatives )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:329:2: rule__RepeatSpec__Alternatives
            {
            pushFollow(FOLLOW_rule__RepeatSpec__Alternatives_in_ruleRepeatSpec640);
            rule__RepeatSpec__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatSpecAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRepeatSpec"


    // $ANTLR start "entryRuleRepeat"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:341:1: entryRuleRepeat : ruleRepeat EOF ;
    public final void entryRuleRepeat() throws RecognitionException {
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:342:1: ( ruleRepeat EOF )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:343:1: ruleRepeat EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatRule()); 
            }
            pushFollow(FOLLOW_ruleRepeat_in_entryRuleRepeat667);
            ruleRepeat();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRepeat674); if (state.failed) return ;

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
    // $ANTLR end "entryRuleRepeat"


    // $ANTLR start "ruleRepeat"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:350:1: ruleRepeat : ( ( rule__Repeat__Alternatives ) ) ;
    public final void ruleRepeat() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:354:2: ( ( ( rule__Repeat__Alternatives ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:355:1: ( ( rule__Repeat__Alternatives ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:355:1: ( ( rule__Repeat__Alternatives ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:356:1: ( rule__Repeat__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatAccess().getAlternatives()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:357:1: ( rule__Repeat__Alternatives )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:357:2: rule__Repeat__Alternatives
            {
            pushFollow(FOLLOW_rule__Repeat__Alternatives_in_ruleRepeat700);
            rule__Repeat__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRepeat"


    // $ANTLR start "entryRuleRange"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:369:1: entryRuleRange : ruleRange EOF ;
    public final void entryRuleRange() throws RecognitionException {
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:370:1: ( ruleRange EOF )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:371:1: ruleRange EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeRule()); 
            }
            pushFollow(FOLLOW_ruleRange_in_entryRuleRange727);
            ruleRange();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRange734); if (state.failed) return ;

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
    // $ANTLR end "entryRuleRange"


    // $ANTLR start "ruleRange"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:378:1: ruleRange : ( ( rule__Range__Group__0 ) ) ;
    public final void ruleRange() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:382:2: ( ( ( rule__Range__Group__0 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:383:1: ( ( rule__Range__Group__0 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:383:1: ( ( rule__Range__Group__0 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:384:1: ( rule__Range__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getGroup()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:385:1: ( rule__Range__Group__0 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:385:2: rule__Range__Group__0
            {
            pushFollow(FOLLOW_rule__Range__Group__0_in_ruleRange760);
            rule__Range__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRange"


    // $ANTLR start "rule__BlockOperation__Alternatives"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:397:1: rule__BlockOperation__Alternatives : ( ( ruleInstruction ) | ( ruleRow ) | ( ruleMessage ) );
    public final void rule__BlockOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:401:1: ( ( ruleInstruction ) | ( ruleRow ) | ( ruleMessage ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt1=1;
                }
                break;
            case 16:
            case 17:
            case 18:
            case 19:
            case 71:
            case 72:
            case 73:
                {
                alt1=2;
                }
                break;
            case RULE_STRING:
                {
                alt1=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:402:1: ( ruleInstruction )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:402:1: ( ruleInstruction )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:403:1: ruleInstruction
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBlockOperationAccess().getInstructionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleInstruction_in_rule__BlockOperation__Alternatives796);
                    ruleInstruction();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBlockOperationAccess().getInstructionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:408:6: ( ruleRow )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:408:6: ( ruleRow )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:409:1: ruleRow
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBlockOperationAccess().getRowParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleRow_in_rule__BlockOperation__Alternatives813);
                    ruleRow();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBlockOperationAccess().getRowParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:414:6: ( ruleMessage )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:414:6: ( ruleMessage )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:415:1: ruleMessage
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBlockOperationAccess().getMessageParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleMessage_in_rule__BlockOperation__Alternatives830);
                    ruleMessage();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBlockOperationAccess().getMessageParserRuleCall_2()); 
                    }

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
    // $ANTLR end "rule__BlockOperation__Alternatives"


    // $ANTLR start "rule__Instruction__ShapeAlternatives_2_2_1_0"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:425:1: rule__Instruction__ShapeAlternatives_2_2_1_0 : ( ( 'round' ) | ( 'flat' ) );
    public final void rule__Instruction__ShapeAlternatives_2_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:429:1: ( ( 'round' ) | ( 'flat' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            else if ( (LA2_0==13) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:430:1: ( 'round' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:430:1: ( 'round' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:431:1: 'round'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInstructionAccess().getShapeRoundKeyword_2_2_1_0_0()); 
                    }
                    match(input,12,FOLLOW_12_in_rule__Instruction__ShapeAlternatives_2_2_1_0863); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInstructionAccess().getShapeRoundKeyword_2_2_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:438:6: ( 'flat' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:438:6: ( 'flat' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:439:1: 'flat'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInstructionAccess().getShapeFlatKeyword_2_2_1_0_1()); 
                    }
                    match(input,13,FOLLOW_13_in_rule__Instruction__ShapeAlternatives_2_2_1_0883); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInstructionAccess().getShapeFlatKeyword_2_2_1_0_1()); 
                    }

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
    // $ANTLR end "rule__Instruction__ShapeAlternatives_2_2_1_0"


    // $ANTLR start "rule__Instruction__Alternatives_2_3_2"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:451:1: rule__Instruction__Alternatives_2_3_2 : ( ( 'rows' ) | ( 'rounds' ) );
    public final void rule__Instruction__Alternatives_2_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:455:1: ( ( 'rows' ) | ( 'rounds' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            else if ( (LA3_0==15) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:456:1: ( 'rows' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:456:1: ( 'rows' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:457:1: 'rows'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInstructionAccess().getRowsKeyword_2_3_2_0()); 
                    }
                    match(input,14,FOLLOW_14_in_rule__Instruction__Alternatives_2_3_2918); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInstructionAccess().getRowsKeyword_2_3_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:464:6: ( 'rounds' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:464:6: ( 'rounds' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:465:1: 'rounds'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInstructionAccess().getRoundsKeyword_2_3_2_1()); 
                    }
                    match(input,15,FOLLOW_15_in_rule__Instruction__Alternatives_2_3_2938); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInstructionAccess().getRoundsKeyword_2_3_2_1()); 
                    }

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
    // $ANTLR end "rule__Instruction__Alternatives_2_3_2"


    // $ANTLR start "rule__Instruction__Alternatives_3"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:477:1: rule__Instruction__Alternatives_3 : ( ( ( rule__Instruction__Group_3_0__0 ) ) | ( ( rule__Instruction__Group_3_1__0 ) ) );
    public final void rule__Instruction__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:481:1: ( ( ( rule__Instruction__Group_3_0__0 ) ) | ( ( rule__Instruction__Group_3_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==59) ) {
                alt4=1;
            }
            else if ( (LA4_0==61) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:482:1: ( ( rule__Instruction__Group_3_0__0 ) )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:482:1: ( ( rule__Instruction__Group_3_0__0 ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:483:1: ( rule__Instruction__Group_3_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInstructionAccess().getGroup_3_0()); 
                    }
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:484:1: ( rule__Instruction__Group_3_0__0 )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:484:2: rule__Instruction__Group_3_0__0
                    {
                    pushFollow(FOLLOW_rule__Instruction__Group_3_0__0_in_rule__Instruction__Alternatives_3972);
                    rule__Instruction__Group_3_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInstructionAccess().getGroup_3_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:488:6: ( ( rule__Instruction__Group_3_1__0 ) )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:488:6: ( ( rule__Instruction__Group_3_1__0 ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:489:1: ( rule__Instruction__Group_3_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInstructionAccess().getGroup_3_1()); 
                    }
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:490:1: ( rule__Instruction__Group_3_1__0 )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:490:2: rule__Instruction__Group_3_1__0
                    {
                    pushFollow(FOLLOW_rule__Instruction__Group_3_1__0_in_rule__Instruction__Alternatives_3990);
                    rule__Instruction__Group_3_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInstructionAccess().getGroup_3_1()); 
                    }

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
    // $ANTLR end "rule__Instruction__Alternatives_3"


    // $ANTLR start "rule__Row__LabelAlternatives_2_0"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:499:1: rule__Row__LabelAlternatives_2_0 : ( ( 'Row' ) | ( 'Round' ) | ( 'Rows' ) | ( 'Rounds' ) );
    public final void rule__Row__LabelAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:503:1: ( ( 'Row' ) | ( 'Round' ) | ( 'Rows' ) | ( 'Rounds' ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt5=1;
                }
                break;
            case 17:
                {
                alt5=2;
                }
                break;
            case 18:
                {
                alt5=3;
                }
                break;
            case 19:
                {
                alt5=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:504:1: ( 'Row' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:504:1: ( 'Row' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:505:1: 'Row'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRowAccess().getLabelRowKeyword_2_0_0()); 
                    }
                    match(input,16,FOLLOW_16_in_rule__Row__LabelAlternatives_2_01024); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRowAccess().getLabelRowKeyword_2_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:512:6: ( 'Round' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:512:6: ( 'Round' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:513:1: 'Round'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRowAccess().getLabelRoundKeyword_2_0_1()); 
                    }
                    match(input,17,FOLLOW_17_in_rule__Row__LabelAlternatives_2_01044); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRowAccess().getLabelRoundKeyword_2_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:520:6: ( 'Rows' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:520:6: ( 'Rows' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:521:1: 'Rows'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRowAccess().getLabelRowsKeyword_2_0_2()); 
                    }
                    match(input,18,FOLLOW_18_in_rule__Row__LabelAlternatives_2_01064); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRowAccess().getLabelRowsKeyword_2_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:528:6: ( 'Rounds' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:528:6: ( 'Rounds' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:529:1: 'Rounds'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRowAccess().getLabelRoundsKeyword_2_0_3()); 
                    }
                    match(input,19,FOLLOW_19_in_rule__Row__LabelAlternatives_2_01084); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRowAccess().getLabelRoundsKeyword_2_0_3()); 
                    }

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
    // $ANTLR end "rule__Row__LabelAlternatives_2_0"


    // $ANTLR start "rule__Row__Alternatives_3"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:541:1: rule__Row__Alternatives_3 : ( ( ( rule__Row__RangeAssignment_3_0 ) ) | ( ( rule__Row__Group_3_1__0 ) ) );
    public final void rule__Row__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:545:1: ( ( ( rule__Row__RangeAssignment_3_0 ) ) | ( ( rule__Row__Group_3_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==69) ) {
                    alt6=1;
                }
                else if ( (LA6_1==EOF||(LA6_1>=22 && LA6_1<=23)||LA6_1==54||(LA6_1>=56 && LA6_1<=57)||(LA6_1>=61 && LA6_1<=62)) ) {
                    alt6=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:546:1: ( ( rule__Row__RangeAssignment_3_0 ) )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:546:1: ( ( rule__Row__RangeAssignment_3_0 ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:547:1: ( rule__Row__RangeAssignment_3_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRowAccess().getRangeAssignment_3_0()); 
                    }
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:548:1: ( rule__Row__RangeAssignment_3_0 )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:548:2: rule__Row__RangeAssignment_3_0
                    {
                    pushFollow(FOLLOW_rule__Row__RangeAssignment_3_0_in_rule__Row__Alternatives_31118);
                    rule__Row__RangeAssignment_3_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRowAccess().getRangeAssignment_3_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:552:6: ( ( rule__Row__Group_3_1__0 ) )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:552:6: ( ( rule__Row__Group_3_1__0 ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:553:1: ( rule__Row__Group_3_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRowAccess().getGroup_3_1()); 
                    }
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:554:1: ( rule__Row__Group_3_1__0 )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:554:2: rule__Row__Group_3_1__0
                    {
                    pushFollow(FOLLOW_rule__Row__Group_3_1__0_in_rule__Row__Alternatives_31136);
                    rule__Row__Group_3_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRowAccess().getGroup_3_1()); 
                    }

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
    // $ANTLR end "rule__Row__Alternatives_3"


    // $ANTLR start "rule__Row__SubsequentAlternatives_3_1_2_2_0"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:563:1: rule__Row__SubsequentAlternatives_3_1_2_2_0 : ( ( 'even' ) | ( 'odd' ) );
    public final void rule__Row__SubsequentAlternatives_3_1_2_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:567:1: ( ( 'even' ) | ( 'odd' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            else if ( (LA7_0==21) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:568:1: ( 'even' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:568:1: ( 'even' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:569:1: 'even'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRowAccess().getSubsequentEvenKeyword_3_1_2_2_0_0()); 
                    }
                    match(input,20,FOLLOW_20_in_rule__Row__SubsequentAlternatives_3_1_2_2_01170); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRowAccess().getSubsequentEvenKeyword_3_1_2_2_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:576:6: ( 'odd' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:576:6: ( 'odd' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:577:1: 'odd'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRowAccess().getSubsequentOddKeyword_3_1_2_2_0_1()); 
                    }
                    match(input,21,FOLLOW_21_in_rule__Row__SubsequentAlternatives_3_1_2_2_01190); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRowAccess().getSubsequentOddKeyword_3_1_2_2_0_1()); 
                    }

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
    // $ANTLR end "rule__Row__SubsequentAlternatives_3_1_2_2_0"


    // $ANTLR start "rule__Row__Alternatives_3_1_2_3"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:589:1: rule__Row__Alternatives_3_1_2_3 : ( ( 'rows' ) | ( 'rounds' ) );
    public final void rule__Row__Alternatives_3_1_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:593:1: ( ( 'rows' ) | ( 'rounds' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==14) ) {
                alt8=1;
            }
            else if ( (LA8_0==15) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:594:1: ( 'rows' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:594:1: ( 'rows' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:595:1: 'rows'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRowAccess().getRowsKeyword_3_1_2_3_0()); 
                    }
                    match(input,14,FOLLOW_14_in_rule__Row__Alternatives_3_1_2_31225); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRowAccess().getRowsKeyword_3_1_2_3_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:602:6: ( 'rounds' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:602:6: ( 'rounds' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:603:1: 'rounds'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRowAccess().getRoundsKeyword_3_1_2_3_1()); 
                    }
                    match(input,15,FOLLOW_15_in_rule__Row__Alternatives_3_1_2_31245); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRowAccess().getRoundsKeyword_3_1_2_3_1()); 
                    }

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
    // $ANTLR end "rule__Row__Alternatives_3_1_2_3"


    // $ANTLR start "rule__Row__SideAlternatives_4_0_0"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:615:1: rule__Row__SideAlternatives_4_0_0 : ( ( 'WS' ) | ( 'RS' ) );
    public final void rule__Row__SideAlternatives_4_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:619:1: ( ( 'WS' ) | ( 'RS' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            else if ( (LA9_0==23) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:620:1: ( 'WS' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:620:1: ( 'WS' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:621:1: 'WS'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRowAccess().getSideWSKeyword_4_0_0_0()); 
                    }
                    match(input,22,FOLLOW_22_in_rule__Row__SideAlternatives_4_0_01280); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRowAccess().getSideWSKeyword_4_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:628:6: ( 'RS' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:628:6: ( 'RS' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:629:1: 'RS'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRowAccess().getSideRSKeyword_4_0_0_1()); 
                    }
                    match(input,23,FOLLOW_23_in_rule__Row__SideAlternatives_4_0_01300); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRowAccess().getSideRSKeyword_4_0_0_1()); 
                    }

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
    // $ANTLR end "rule__Row__SideAlternatives_4_0_0"


    // $ANTLR start "rule__InlineOperation__Alternatives"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:641:1: rule__InlineOperation__Alternatives : ( ( ruleKnit ) | ( rulePurl ) | ( ruleSlip ) | ( ruleRepeat ) );
    public final void rule__InlineOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:645:1: ( ( ruleKnit ) | ( rulePurl ) | ( ruleSlip ) | ( ruleRepeat ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 24:
            case 25:
            case 26:
            case 27:
                {
                alt10=1;
                }
                break;
            case 32:
            case 33:
            case 34:
            case 35:
                {
                alt10=2;
                }
                break;
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
                {
                alt10=3;
                }
                break;
            case 51:
            case 52:
            case 67:
                {
                alt10=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:646:1: ( ruleKnit )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:646:1: ( ruleKnit )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:647:1: ruleKnit
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInlineOperationAccess().getKnitParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleKnit_in_rule__InlineOperation__Alternatives1334);
                    ruleKnit();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInlineOperationAccess().getKnitParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:652:6: ( rulePurl )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:652:6: ( rulePurl )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:653:1: rulePurl
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInlineOperationAccess().getPurlParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_rulePurl_in_rule__InlineOperation__Alternatives1351);
                    rulePurl();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInlineOperationAccess().getPurlParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:658:6: ( ruleSlip )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:658:6: ( ruleSlip )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:659:1: ruleSlip
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInlineOperationAccess().getSlipParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleSlip_in_rule__InlineOperation__Alternatives1368);
                    ruleSlip();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInlineOperationAccess().getSlipParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:664:6: ( ruleRepeat )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:664:6: ( ruleRepeat )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:665:1: ruleRepeat
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInlineOperationAccess().getRepeatParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleRepeat_in_rule__InlineOperation__Alternatives1385);
                    ruleRepeat();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInlineOperationAccess().getRepeatParserRuleCall_3()); 
                    }

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
    // $ANTLR end "rule__InlineOperation__Alternatives"


    // $ANTLR start "rule__Knit__Alternatives_0"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:675:1: rule__Knit__Alternatives_0 : ( ( 'K' ) | ( 'k' ) | ( 'Knit' ) | ( 'knit' ) );
    public final void rule__Knit__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:679:1: ( ( 'K' ) | ( 'k' ) | ( 'Knit' ) | ( 'knit' ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt11=1;
                }
                break;
            case 25:
                {
                alt11=2;
                }
                break;
            case 26:
                {
                alt11=3;
                }
                break;
            case 27:
                {
                alt11=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:680:1: ( 'K' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:680:1: ( 'K' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:681:1: 'K'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getKnitAccess().getKKeyword_0_0()); 
                    }
                    match(input,24,FOLLOW_24_in_rule__Knit__Alternatives_01418); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getKnitAccess().getKKeyword_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:688:6: ( 'k' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:688:6: ( 'k' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:689:1: 'k'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getKnitAccess().getKKeyword_0_1()); 
                    }
                    match(input,25,FOLLOW_25_in_rule__Knit__Alternatives_01438); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getKnitAccess().getKKeyword_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:696:6: ( 'Knit' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:696:6: ( 'Knit' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:697:1: 'Knit'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getKnitAccess().getKnitKeyword_0_2()); 
                    }
                    match(input,26,FOLLOW_26_in_rule__Knit__Alternatives_01458); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getKnitAccess().getKnitKeyword_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:704:6: ( 'knit' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:704:6: ( 'knit' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:705:1: 'knit'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getKnitAccess().getKnitKeyword_0_3()); 
                    }
                    match(input,27,FOLLOW_27_in_rule__Knit__Alternatives_01478); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getKnitAccess().getKnitKeyword_0_3()); 
                    }

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
    // $ANTLR end "rule__Knit__Alternatives_0"


    // $ANTLR start "rule__Knit__Alternatives_3"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:717:1: rule__Knit__Alternatives_3 : ( ( 'st' ) | ( 'sts' ) );
    public final void rule__Knit__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:721:1: ( ( 'st' ) | ( 'sts' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==28) ) {
                alt12=1;
            }
            else if ( (LA12_0==29) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:722:1: ( 'st' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:722:1: ( 'st' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:723:1: 'st'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getKnitAccess().getStKeyword_3_0()); 
                    }
                    match(input,28,FOLLOW_28_in_rule__Knit__Alternatives_31513); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getKnitAccess().getStKeyword_3_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:730:6: ( 'sts' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:730:6: ( 'sts' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:731:1: 'sts'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getKnitAccess().getStsKeyword_3_1()); 
                    }
                    match(input,29,FOLLOW_29_in_rule__Knit__Alternatives_31533); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getKnitAccess().getStsKeyword_3_1()); 
                    }

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
    // $ANTLR end "rule__Knit__Alternatives_3"


    // $ANTLR start "rule__Knit__ThroughTrailingLoopAlternatives_4_1_0"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:743:1: rule__Knit__ThroughTrailingLoopAlternatives_4_1_0 : ( ( 'tbl' ) | ( 'ttl' ) );
    public final void rule__Knit__ThroughTrailingLoopAlternatives_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:747:1: ( ( 'tbl' ) | ( 'ttl' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==30) ) {
                alt13=1;
            }
            else if ( (LA13_0==31) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:748:1: ( 'tbl' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:748:1: ( 'tbl' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:749:1: 'tbl'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getKnitAccess().getThroughTrailingLoopTblKeyword_4_1_0_0()); 
                    }
                    match(input,30,FOLLOW_30_in_rule__Knit__ThroughTrailingLoopAlternatives_4_1_01568); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getKnitAccess().getThroughTrailingLoopTblKeyword_4_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:756:6: ( 'ttl' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:756:6: ( 'ttl' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:757:1: 'ttl'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getKnitAccess().getThroughTrailingLoopTtlKeyword_4_1_0_1()); 
                    }
                    match(input,31,FOLLOW_31_in_rule__Knit__ThroughTrailingLoopAlternatives_4_1_01588); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getKnitAccess().getThroughTrailingLoopTtlKeyword_4_1_0_1()); 
                    }

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
    // $ANTLR end "rule__Knit__ThroughTrailingLoopAlternatives_4_1_0"


    // $ANTLR start "rule__Purl__Alternatives_0"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:769:1: rule__Purl__Alternatives_0 : ( ( 'P' ) | ( 'p' ) | ( 'Purl' ) | ( 'purl' ) );
    public final void rule__Purl__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:773:1: ( ( 'P' ) | ( 'p' ) | ( 'Purl' ) | ( 'purl' ) )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt14=1;
                }
                break;
            case 33:
                {
                alt14=2;
                }
                break;
            case 34:
                {
                alt14=3;
                }
                break;
            case 35:
                {
                alt14=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:774:1: ( 'P' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:774:1: ( 'P' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:775:1: 'P'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPurlAccess().getPKeyword_0_0()); 
                    }
                    match(input,32,FOLLOW_32_in_rule__Purl__Alternatives_01623); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPurlAccess().getPKeyword_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:782:6: ( 'p' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:782:6: ( 'p' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:783:1: 'p'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPurlAccess().getPKeyword_0_1()); 
                    }
                    match(input,33,FOLLOW_33_in_rule__Purl__Alternatives_01643); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPurlAccess().getPKeyword_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:790:6: ( 'Purl' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:790:6: ( 'Purl' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:791:1: 'Purl'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPurlAccess().getPurlKeyword_0_2()); 
                    }
                    match(input,34,FOLLOW_34_in_rule__Purl__Alternatives_01663); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPurlAccess().getPurlKeyword_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:798:6: ( 'purl' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:798:6: ( 'purl' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:799:1: 'purl'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPurlAccess().getPurlKeyword_0_3()); 
                    }
                    match(input,35,FOLLOW_35_in_rule__Purl__Alternatives_01683); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPurlAccess().getPurlKeyword_0_3()); 
                    }

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
    // $ANTLR end "rule__Purl__Alternatives_0"


    // $ANTLR start "rule__Purl__Alternatives_3"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:811:1: rule__Purl__Alternatives_3 : ( ( 'st' ) | ( 'sts' ) );
    public final void rule__Purl__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:815:1: ( ( 'st' ) | ( 'sts' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==28) ) {
                alt15=1;
            }
            else if ( (LA15_0==29) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:816:1: ( 'st' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:816:1: ( 'st' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:817:1: 'st'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPurlAccess().getStKeyword_3_0()); 
                    }
                    match(input,28,FOLLOW_28_in_rule__Purl__Alternatives_31718); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPurlAccess().getStKeyword_3_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:824:6: ( 'sts' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:824:6: ( 'sts' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:825:1: 'sts'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPurlAccess().getStsKeyword_3_1()); 
                    }
                    match(input,29,FOLLOW_29_in_rule__Purl__Alternatives_31738); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPurlAccess().getStsKeyword_3_1()); 
                    }

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
    // $ANTLR end "rule__Purl__Alternatives_3"


    // $ANTLR start "rule__Purl__ThroughTrailingLoopAlternatives_4_1_0"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:837:1: rule__Purl__ThroughTrailingLoopAlternatives_4_1_0 : ( ( 'tbl' ) | ( 'ttl' ) );
    public final void rule__Purl__ThroughTrailingLoopAlternatives_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:841:1: ( ( 'tbl' ) | ( 'ttl' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==30) ) {
                alt16=1;
            }
            else if ( (LA16_0==31) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:842:1: ( 'tbl' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:842:1: ( 'tbl' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:843:1: 'tbl'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPurlAccess().getThroughTrailingLoopTblKeyword_4_1_0_0()); 
                    }
                    match(input,30,FOLLOW_30_in_rule__Purl__ThroughTrailingLoopAlternatives_4_1_01773); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPurlAccess().getThroughTrailingLoopTblKeyword_4_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:850:6: ( 'ttl' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:850:6: ( 'ttl' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:851:1: 'ttl'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPurlAccess().getThroughTrailingLoopTtlKeyword_4_1_0_1()); 
                    }
                    match(input,31,FOLLOW_31_in_rule__Purl__ThroughTrailingLoopAlternatives_4_1_01793); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPurlAccess().getThroughTrailingLoopTtlKeyword_4_1_0_1()); 
                    }

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
    // $ANTLR end "rule__Purl__ThroughTrailingLoopAlternatives_4_1_0"


    // $ANTLR start "rule__Slip__ReverseAlternatives_1_0"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:863:1: rule__Slip__ReverseAlternatives_1_0 : ( ( 'Rev' ) | ( 'Reverse' ) | ( 'rev' ) | ( 'reverse' ) );
    public final void rule__Slip__ReverseAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:867:1: ( ( 'Rev' ) | ( 'Reverse' ) | ( 'rev' ) | ( 'reverse' ) )
            int alt17=4;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt17=1;
                }
                break;
            case 37:
                {
                alt17=2;
                }
                break;
            case 38:
                {
                alt17=3;
                }
                break;
            case 39:
                {
                alt17=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:868:1: ( 'Rev' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:868:1: ( 'Rev' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:869:1: 'Rev'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSlipAccess().getReverseRevKeyword_1_0_0()); 
                    }
                    match(input,36,FOLLOW_36_in_rule__Slip__ReverseAlternatives_1_01828); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSlipAccess().getReverseRevKeyword_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:876:6: ( 'Reverse' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:876:6: ( 'Reverse' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:877:1: 'Reverse'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSlipAccess().getReverseReverseKeyword_1_0_1()); 
                    }
                    match(input,37,FOLLOW_37_in_rule__Slip__ReverseAlternatives_1_01848); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSlipAccess().getReverseReverseKeyword_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:884:6: ( 'rev' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:884:6: ( 'rev' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:885:1: 'rev'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSlipAccess().getReverseRevKeyword_1_0_2()); 
                    }
                    match(input,38,FOLLOW_38_in_rule__Slip__ReverseAlternatives_1_01868); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSlipAccess().getReverseRevKeyword_1_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:892:6: ( 'reverse' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:892:6: ( 'reverse' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:893:1: 'reverse'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSlipAccess().getReverseReverseKeyword_1_0_3()); 
                    }
                    match(input,39,FOLLOW_39_in_rule__Slip__ReverseAlternatives_1_01888); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSlipAccess().getReverseReverseKeyword_1_0_3()); 
                    }

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
    // $ANTLR end "rule__Slip__ReverseAlternatives_1_0"


    // $ANTLR start "rule__Slip__Alternatives_2"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:905:1: rule__Slip__Alternatives_2 : ( ( 'Sl' ) | ( 'sl' ) | ( 'Slip' ) | ( 'slip' ) );
    public final void rule__Slip__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:909:1: ( ( 'Sl' ) | ( 'sl' ) | ( 'Slip' ) | ( 'slip' ) )
            int alt18=4;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt18=1;
                }
                break;
            case 41:
                {
                alt18=2;
                }
                break;
            case 42:
                {
                alt18=3;
                }
                break;
            case 43:
                {
                alt18=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:910:1: ( 'Sl' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:910:1: ( 'Sl' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:911:1: 'Sl'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSlipAccess().getSlKeyword_2_0()); 
                    }
                    match(input,40,FOLLOW_40_in_rule__Slip__Alternatives_21923); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSlipAccess().getSlKeyword_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:918:6: ( 'sl' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:918:6: ( 'sl' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:919:1: 'sl'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSlipAccess().getSlKeyword_2_1()); 
                    }
                    match(input,41,FOLLOW_41_in_rule__Slip__Alternatives_21943); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSlipAccess().getSlKeyword_2_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:926:6: ( 'Slip' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:926:6: ( 'Slip' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:927:1: 'Slip'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSlipAccess().getSlipKeyword_2_2()); 
                    }
                    match(input,42,FOLLOW_42_in_rule__Slip__Alternatives_21963); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSlipAccess().getSlipKeyword_2_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:934:6: ( 'slip' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:934:6: ( 'slip' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:935:1: 'slip'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSlipAccess().getSlipKeyword_2_3()); 
                    }
                    match(input,43,FOLLOW_43_in_rule__Slip__Alternatives_21983); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSlipAccess().getSlipKeyword_2_3()); 
                    }

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
    // $ANTLR end "rule__Slip__Alternatives_2"


    // $ANTLR start "rule__Slip__Alternatives_3"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:947:1: rule__Slip__Alternatives_3 : ( ( ( rule__Slip__Group_3_0__0 ) ) | ( 'next st' ) );
    public final void rule__Slip__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:951:1: ( ( ( rule__Slip__Group_3_0__0 ) ) | ( 'next st' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_INT) ) {
                alt19=1;
            }
            else if ( (LA19_0==44) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:952:1: ( ( rule__Slip__Group_3_0__0 ) )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:952:1: ( ( rule__Slip__Group_3_0__0 ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:953:1: ( rule__Slip__Group_3_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSlipAccess().getGroup_3_0()); 
                    }
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:954:1: ( rule__Slip__Group_3_0__0 )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:954:2: rule__Slip__Group_3_0__0
                    {
                    pushFollow(FOLLOW_rule__Slip__Group_3_0__0_in_rule__Slip__Alternatives_32017);
                    rule__Slip__Group_3_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSlipAccess().getGroup_3_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:958:6: ( 'next st' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:958:6: ( 'next st' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:959:1: 'next st'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSlipAccess().getNextStKeyword_3_1()); 
                    }
                    match(input,44,FOLLOW_44_in_rule__Slip__Alternatives_32036); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSlipAccess().getNextStKeyword_3_1()); 
                    }

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
    // $ANTLR end "rule__Slip__Alternatives_3"


    // $ANTLR start "rule__Slip__Alternatives_3_0_1"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:971:1: rule__Slip__Alternatives_3_0_1 : ( ( 'st' ) | ( 'sts' ) );
    public final void rule__Slip__Alternatives_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:975:1: ( ( 'st' ) | ( 'sts' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==28) ) {
                alt20=1;
            }
            else if ( (LA20_0==29) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:976:1: ( 'st' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:976:1: ( 'st' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:977:1: 'st'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSlipAccess().getStKeyword_3_0_1_0()); 
                    }
                    match(input,28,FOLLOW_28_in_rule__Slip__Alternatives_3_0_12071); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSlipAccess().getStKeyword_3_0_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:984:6: ( 'sts' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:984:6: ( 'sts' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:985:1: 'sts'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSlipAccess().getStsKeyword_3_0_1_1()); 
                    }
                    match(input,29,FOLLOW_29_in_rule__Slip__Alternatives_3_0_12091); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSlipAccess().getStsKeyword_3_0_1_1()); 
                    }

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
    // $ANTLR end "rule__Slip__Alternatives_3_0_1"


    // $ANTLR start "rule__Slip__Alternatives_4"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:997:1: rule__Slip__Alternatives_4 : ( ( ( rule__Slip__KnitwiseAssignment_4_0 ) ) | ( ( rule__Slip__PurlwiseAssignment_4_1 ) ) );
    public final void rule__Slip__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1001:1: ( ( ( rule__Slip__KnitwiseAssignment_4_0 ) ) | ( ( rule__Slip__PurlwiseAssignment_4_1 ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=45 && LA21_0<=46)) ) {
                alt21=1;
            }
            else if ( ((LA21_0>=47 && LA21_0<=48)) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1002:1: ( ( rule__Slip__KnitwiseAssignment_4_0 ) )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1002:1: ( ( rule__Slip__KnitwiseAssignment_4_0 ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1003:1: ( rule__Slip__KnitwiseAssignment_4_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSlipAccess().getKnitwiseAssignment_4_0()); 
                    }
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1004:1: ( rule__Slip__KnitwiseAssignment_4_0 )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1004:2: rule__Slip__KnitwiseAssignment_4_0
                    {
                    pushFollow(FOLLOW_rule__Slip__KnitwiseAssignment_4_0_in_rule__Slip__Alternatives_42125);
                    rule__Slip__KnitwiseAssignment_4_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSlipAccess().getKnitwiseAssignment_4_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1008:6: ( ( rule__Slip__PurlwiseAssignment_4_1 ) )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1008:6: ( ( rule__Slip__PurlwiseAssignment_4_1 ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1009:1: ( rule__Slip__PurlwiseAssignment_4_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSlipAccess().getPurlwiseAssignment_4_1()); 
                    }
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1010:1: ( rule__Slip__PurlwiseAssignment_4_1 )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1010:2: rule__Slip__PurlwiseAssignment_4_1
                    {
                    pushFollow(FOLLOW_rule__Slip__PurlwiseAssignment_4_1_in_rule__Slip__Alternatives_42143);
                    rule__Slip__PurlwiseAssignment_4_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSlipAccess().getPurlwiseAssignment_4_1()); 
                    }

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
    // $ANTLR end "rule__Slip__Alternatives_4"


    // $ANTLR start "rule__Slip__KnitwiseAlternatives_4_0_0"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1019:1: rule__Slip__KnitwiseAlternatives_4_0_0 : ( ( 'kw' ) | ( 'knitwise' ) );
    public final void rule__Slip__KnitwiseAlternatives_4_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1023:1: ( ( 'kw' ) | ( 'knitwise' ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==45) ) {
                alt22=1;
            }
            else if ( (LA22_0==46) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1024:1: ( 'kw' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1024:1: ( 'kw' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1025:1: 'kw'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSlipAccess().getKnitwiseKwKeyword_4_0_0_0()); 
                    }
                    match(input,45,FOLLOW_45_in_rule__Slip__KnitwiseAlternatives_4_0_02177); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSlipAccess().getKnitwiseKwKeyword_4_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1032:6: ( 'knitwise' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1032:6: ( 'knitwise' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1033:1: 'knitwise'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSlipAccess().getKnitwiseKnitwiseKeyword_4_0_0_1()); 
                    }
                    match(input,46,FOLLOW_46_in_rule__Slip__KnitwiseAlternatives_4_0_02197); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSlipAccess().getKnitwiseKnitwiseKeyword_4_0_0_1()); 
                    }

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
    // $ANTLR end "rule__Slip__KnitwiseAlternatives_4_0_0"


    // $ANTLR start "rule__Slip__PurlwiseAlternatives_4_1_0"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1045:1: rule__Slip__PurlwiseAlternatives_4_1_0 : ( ( 'pw' ) | ( 'purlwise' ) );
    public final void rule__Slip__PurlwiseAlternatives_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1049:1: ( ( 'pw' ) | ( 'purlwise' ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==47) ) {
                alt23=1;
            }
            else if ( (LA23_0==48) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1050:1: ( 'pw' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1050:1: ( 'pw' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1051:1: 'pw'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSlipAccess().getPurlwisePwKeyword_4_1_0_0()); 
                    }
                    match(input,47,FOLLOW_47_in_rule__Slip__PurlwiseAlternatives_4_1_02232); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSlipAccess().getPurlwisePwKeyword_4_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1058:6: ( 'purlwise' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1058:6: ( 'purlwise' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1059:1: 'purlwise'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSlipAccess().getPurlwisePurlwiseKeyword_4_1_0_1()); 
                    }
                    match(input,48,FOLLOW_48_in_rule__Slip__PurlwiseAlternatives_4_1_02252); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSlipAccess().getPurlwisePurlwiseKeyword_4_1_0_1()); 
                    }

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
    // $ANTLR end "rule__Slip__PurlwiseAlternatives_4_1_0"


    // $ANTLR start "rule__Slip__YarnPositionAlternatives_5_0"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1071:1: rule__Slip__YarnPositionAlternatives_5_0 : ( ( 'wyif' ) | ( 'wyib' ) );
    public final void rule__Slip__YarnPositionAlternatives_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1075:1: ( ( 'wyif' ) | ( 'wyib' ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==49) ) {
                alt24=1;
            }
            else if ( (LA24_0==50) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1076:1: ( 'wyif' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1076:1: ( 'wyif' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1077:1: 'wyif'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSlipAccess().getYarnPositionWyifKeyword_5_0_0()); 
                    }
                    match(input,49,FOLLOW_49_in_rule__Slip__YarnPositionAlternatives_5_02287); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSlipAccess().getYarnPositionWyifKeyword_5_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1084:6: ( 'wyib' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1084:6: ( 'wyib' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1085:1: 'wyib'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSlipAccess().getYarnPositionWyibKeyword_5_0_1()); 
                    }
                    match(input,50,FOLLOW_50_in_rule__Slip__YarnPositionAlternatives_5_02307); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSlipAccess().getYarnPositionWyibKeyword_5_0_1()); 
                    }

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
    // $ANTLR end "rule__Slip__YarnPositionAlternatives_5_0"


    // $ANTLR start "rule__RepeatSpec__Alternatives"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1097:1: rule__RepeatSpec__Alternatives : ( ( ( rule__RepeatSpec__ToEndAssignment_0 ) ) | ( ( rule__RepeatSpec__ToMarkerAssignment_1 ) ) | ( ( rule__RepeatSpec__Group_2__0 ) ) | ( ( rule__RepeatSpec__Group_3__0 ) ) | ( ( rule__RepeatSpec__Group_4__0 ) ) | ( ( rule__RepeatSpec__Group_5__0 ) ) );
    public final void rule__RepeatSpec__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1101:1: ( ( ( rule__RepeatSpec__ToEndAssignment_0 ) ) | ( ( rule__RepeatSpec__ToMarkerAssignment_1 ) ) | ( ( rule__RepeatSpec__Group_2__0 ) ) | ( ( rule__RepeatSpec__Group_3__0 ) ) | ( ( rule__RepeatSpec__Group_4__0 ) ) | ( ( rule__RepeatSpec__Group_5__0 ) ) )
            int alt25=6;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1102:1: ( ( rule__RepeatSpec__ToEndAssignment_0 ) )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1102:1: ( ( rule__RepeatSpec__ToEndAssignment_0 ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1103:1: ( rule__RepeatSpec__ToEndAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRepeatSpecAccess().getToEndAssignment_0()); 
                    }
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1104:1: ( rule__RepeatSpec__ToEndAssignment_0 )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1104:2: rule__RepeatSpec__ToEndAssignment_0
                    {
                    pushFollow(FOLLOW_rule__RepeatSpec__ToEndAssignment_0_in_rule__RepeatSpec__Alternatives2341);
                    rule__RepeatSpec__ToEndAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRepeatSpecAccess().getToEndAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1108:6: ( ( rule__RepeatSpec__ToMarkerAssignment_1 ) )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1108:6: ( ( rule__RepeatSpec__ToMarkerAssignment_1 ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1109:1: ( rule__RepeatSpec__ToMarkerAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRepeatSpecAccess().getToMarkerAssignment_1()); 
                    }
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1110:1: ( rule__RepeatSpec__ToMarkerAssignment_1 )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1110:2: rule__RepeatSpec__ToMarkerAssignment_1
                    {
                    pushFollow(FOLLOW_rule__RepeatSpec__ToMarkerAssignment_1_in_rule__RepeatSpec__Alternatives2359);
                    rule__RepeatSpec__ToMarkerAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRepeatSpecAccess().getToMarkerAssignment_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1114:6: ( ( rule__RepeatSpec__Group_2__0 ) )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1114:6: ( ( rule__RepeatSpec__Group_2__0 ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1115:1: ( rule__RepeatSpec__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRepeatSpecAccess().getGroup_2()); 
                    }
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1116:1: ( rule__RepeatSpec__Group_2__0 )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1116:2: rule__RepeatSpec__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__RepeatSpec__Group_2__0_in_rule__RepeatSpec__Alternatives2377);
                    rule__RepeatSpec__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRepeatSpecAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1120:6: ( ( rule__RepeatSpec__Group_3__0 ) )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1120:6: ( ( rule__RepeatSpec__Group_3__0 ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1121:1: ( rule__RepeatSpec__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRepeatSpecAccess().getGroup_3()); 
                    }
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1122:1: ( rule__RepeatSpec__Group_3__0 )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1122:2: rule__RepeatSpec__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__RepeatSpec__Group_3__0_in_rule__RepeatSpec__Alternatives2395);
                    rule__RepeatSpec__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRepeatSpecAccess().getGroup_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1126:6: ( ( rule__RepeatSpec__Group_4__0 ) )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1126:6: ( ( rule__RepeatSpec__Group_4__0 ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1127:1: ( rule__RepeatSpec__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRepeatSpecAccess().getGroup_4()); 
                    }
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1128:1: ( rule__RepeatSpec__Group_4__0 )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1128:2: rule__RepeatSpec__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__RepeatSpec__Group_4__0_in_rule__RepeatSpec__Alternatives2413);
                    rule__RepeatSpec__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRepeatSpecAccess().getGroup_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1132:6: ( ( rule__RepeatSpec__Group_5__0 ) )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1132:6: ( ( rule__RepeatSpec__Group_5__0 ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1133:1: ( rule__RepeatSpec__Group_5__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRepeatSpecAccess().getGroup_5()); 
                    }
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1134:1: ( rule__RepeatSpec__Group_5__0 )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1134:2: rule__RepeatSpec__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__RepeatSpec__Group_5__0_in_rule__RepeatSpec__Alternatives2431);
                    rule__RepeatSpec__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRepeatSpecAccess().getGroup_5()); 
                    }

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
    // $ANTLR end "rule__RepeatSpec__Alternatives"


    // $ANTLR start "rule__RepeatSpec__Alternatives_2_1"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1143:1: rule__RepeatSpec__Alternatives_2_1 : ( ( 'st' ) | ( 'sts' ) );
    public final void rule__RepeatSpec__Alternatives_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1147:1: ( ( 'st' ) | ( 'sts' ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==28) ) {
                alt26=1;
            }
            else if ( (LA26_0==29) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1148:1: ( 'st' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1148:1: ( 'st' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1149:1: 'st'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRepeatSpecAccess().getStKeyword_2_1_0()); 
                    }
                    match(input,28,FOLLOW_28_in_rule__RepeatSpec__Alternatives_2_12465); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRepeatSpecAccess().getStKeyword_2_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1156:6: ( 'sts' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1156:6: ( 'sts' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1157:1: 'sts'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRepeatSpecAccess().getStsKeyword_2_1_1()); 
                    }
                    match(input,29,FOLLOW_29_in_rule__RepeatSpec__Alternatives_2_12485); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRepeatSpecAccess().getStsKeyword_2_1_1()); 
                    }

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
    // $ANTLR end "rule__RepeatSpec__Alternatives_2_1"


    // $ANTLR start "rule__RepeatSpec__Alternatives_3_1"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1169:1: rule__RepeatSpec__Alternatives_3_1 : ( ( 'st' ) | ( 'sts' ) );
    public final void rule__RepeatSpec__Alternatives_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1173:1: ( ( 'st' ) | ( 'sts' ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==28) ) {
                alt27=1;
            }
            else if ( (LA27_0==29) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1174:1: ( 'st' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1174:1: ( 'st' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1175:1: 'st'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRepeatSpecAccess().getStKeyword_3_1_0()); 
                    }
                    match(input,28,FOLLOW_28_in_rule__RepeatSpec__Alternatives_3_12520); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRepeatSpecAccess().getStKeyword_3_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1182:6: ( 'sts' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1182:6: ( 'sts' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1183:1: 'sts'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRepeatSpecAccess().getStsKeyword_3_1_1()); 
                    }
                    match(input,29,FOLLOW_29_in_rule__RepeatSpec__Alternatives_3_12540); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRepeatSpecAccess().getStsKeyword_3_1_1()); 
                    }

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
    // $ANTLR end "rule__RepeatSpec__Alternatives_3_1"


    // $ANTLR start "rule__RepeatSpec__Alternatives_4_1"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1195:1: rule__RepeatSpec__Alternatives_4_1 : ( ( 'st' ) | ( 'sts' ) );
    public final void rule__RepeatSpec__Alternatives_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1199:1: ( ( 'st' ) | ( 'sts' ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==28) ) {
                alt28=1;
            }
            else if ( (LA28_0==29) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1200:1: ( 'st' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1200:1: ( 'st' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1201:1: 'st'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRepeatSpecAccess().getStKeyword_4_1_0()); 
                    }
                    match(input,28,FOLLOW_28_in_rule__RepeatSpec__Alternatives_4_12575); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRepeatSpecAccess().getStKeyword_4_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1208:6: ( 'sts' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1208:6: ( 'sts' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1209:1: 'sts'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRepeatSpecAccess().getStsKeyword_4_1_1()); 
                    }
                    match(input,29,FOLLOW_29_in_rule__RepeatSpec__Alternatives_4_12595); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRepeatSpecAccess().getStsKeyword_4_1_1()); 
                    }

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
    // $ANTLR end "rule__RepeatSpec__Alternatives_4_1"


    // $ANTLR start "rule__Repeat__Alternatives"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1221:1: rule__Repeat__Alternatives : ( ( ( rule__Repeat__Group_0__0 ) ) | ( ( rule__Repeat__Group_1__0 ) ) );
    public final void rule__Repeat__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1225:1: ( ( ( rule__Repeat__Group_0__0 ) ) | ( ( rule__Repeat__Group_1__0 ) ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=51 && LA29_0<=52)) ) {
                alt29=1;
            }
            else if ( (LA29_0==67) ) {
                alt29=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1226:1: ( ( rule__Repeat__Group_0__0 ) )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1226:1: ( ( rule__Repeat__Group_0__0 ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1227:1: ( rule__Repeat__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRepeatAccess().getGroup_0()); 
                    }
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1228:1: ( rule__Repeat__Group_0__0 )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1228:2: rule__Repeat__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Repeat__Group_0__0_in_rule__Repeat__Alternatives2629);
                    rule__Repeat__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRepeatAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1232:6: ( ( rule__Repeat__Group_1__0 ) )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1232:6: ( ( rule__Repeat__Group_1__0 ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1233:1: ( rule__Repeat__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRepeatAccess().getGroup_1()); 
                    }
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1234:1: ( rule__Repeat__Group_1__0 )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1234:2: rule__Repeat__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Repeat__Group_1__0_in_rule__Repeat__Alternatives2647);
                    rule__Repeat__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRepeatAccess().getGroup_1()); 
                    }

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
    // $ANTLR end "rule__Repeat__Alternatives"


    // $ANTLR start "rule__Repeat__Alternatives_0_0"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1243:1: rule__Repeat__Alternatives_0_0 : ( ( 'Repeat' ) | ( 'repeat' ) );
    public final void rule__Repeat__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1247:1: ( ( 'Repeat' ) | ( 'repeat' ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==51) ) {
                alt30=1;
            }
            else if ( (LA30_0==52) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1248:1: ( 'Repeat' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1248:1: ( 'Repeat' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1249:1: 'Repeat'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRepeatAccess().getRepeatKeyword_0_0_0()); 
                    }
                    match(input,51,FOLLOW_51_in_rule__Repeat__Alternatives_0_02681); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRepeatAccess().getRepeatKeyword_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1256:6: ( 'repeat' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1256:6: ( 'repeat' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1257:1: 'repeat'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRepeatAccess().getRepeatKeyword_0_0_1()); 
                    }
                    match(input,52,FOLLOW_52_in_rule__Repeat__Alternatives_0_02701); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRepeatAccess().getRepeatKeyword_0_0_1()); 
                    }

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
    // $ANTLR end "rule__Repeat__Alternatives_0_0"


    // $ANTLR start "rule__Repeat__Alternatives_1_4_1"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1269:1: rule__Repeat__Alternatives_1_4_1 : ( ( 'Repeat' ) | ( 'repeat' ) );
    public final void rule__Repeat__Alternatives_1_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1273:1: ( ( 'Repeat' ) | ( 'repeat' ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==51) ) {
                alt31=1;
            }
            else if ( (LA31_0==52) ) {
                alt31=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1274:1: ( 'Repeat' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1274:1: ( 'Repeat' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1275:1: 'Repeat'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRepeatAccess().getRepeatKeyword_1_4_1_0()); 
                    }
                    match(input,51,FOLLOW_51_in_rule__Repeat__Alternatives_1_4_12736); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRepeatAccess().getRepeatKeyword_1_4_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1282:6: ( 'repeat' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1282:6: ( 'repeat' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1283:1: 'repeat'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRepeatAccess().getRepeatKeyword_1_4_1_1()); 
                    }
                    match(input,52,FOLLOW_52_in_rule__Repeat__Alternatives_1_4_12756); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRepeatAccess().getRepeatKeyword_1_4_1_1()); 
                    }

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
    // $ANTLR end "rule__Repeat__Alternatives_1_4_1"


    // $ANTLR start "rule__Pattern__Group__0"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1297:1: rule__Pattern__Group__0 : rule__Pattern__Group__0__Impl rule__Pattern__Group__1 ;
    public final void rule__Pattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1301:1: ( rule__Pattern__Group__0__Impl rule__Pattern__Group__1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1302:2: rule__Pattern__Group__0__Impl rule__Pattern__Group__1
            {
            pushFollow(FOLLOW_rule__Pattern__Group__0__Impl_in_rule__Pattern__Group__02788);
            rule__Pattern__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Pattern__Group__1_in_rule__Pattern__Group__02791);
            rule__Pattern__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__0"


    // $ANTLR start "rule__Pattern__Group__0__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1309:1: rule__Pattern__Group__0__Impl : ( ( RULE_LF )* ) ;
    public final void rule__Pattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1313:1: ( ( ( RULE_LF )* ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1314:1: ( ( RULE_LF )* )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1314:1: ( ( RULE_LF )* )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1315:1: ( RULE_LF )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getLFTerminalRuleCall_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1316:1: ( RULE_LF )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_LF) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1316:3: RULE_LF
            	    {
            	    match(input,RULE_LF,FOLLOW_RULE_LF_in_rule__Pattern__Group__0__Impl2819); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getLFTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__0__Impl"


    // $ANTLR start "rule__Pattern__Group__1"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1326:1: rule__Pattern__Group__1 : rule__Pattern__Group__1__Impl rule__Pattern__Group__2 ;
    public final void rule__Pattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1330:1: ( rule__Pattern__Group__1__Impl rule__Pattern__Group__2 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1331:2: rule__Pattern__Group__1__Impl rule__Pattern__Group__2
            {
            pushFollow(FOLLOW_rule__Pattern__Group__1__Impl_in_rule__Pattern__Group__12850);
            rule__Pattern__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Pattern__Group__2_in_rule__Pattern__Group__12853);
            rule__Pattern__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__1"


    // $ANTLR start "rule__Pattern__Group__1__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1338:1: rule__Pattern__Group__1__Impl : ( ( ( rule__Pattern__ElementsAssignment_1 ) ) ( ( rule__Pattern__ElementsAssignment_1 )* ) ) ;
    public final void rule__Pattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1342:1: ( ( ( ( rule__Pattern__ElementsAssignment_1 ) ) ( ( rule__Pattern__ElementsAssignment_1 )* ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1343:1: ( ( ( rule__Pattern__ElementsAssignment_1 ) ) ( ( rule__Pattern__ElementsAssignment_1 )* ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1343:1: ( ( ( rule__Pattern__ElementsAssignment_1 ) ) ( ( rule__Pattern__ElementsAssignment_1 )* ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1344:1: ( ( rule__Pattern__ElementsAssignment_1 ) ) ( ( rule__Pattern__ElementsAssignment_1 )* )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1344:1: ( ( rule__Pattern__ElementsAssignment_1 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1345:1: ( rule__Pattern__ElementsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getElementsAssignment_1()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1346:1: ( rule__Pattern__ElementsAssignment_1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1346:2: rule__Pattern__ElementsAssignment_1
            {
            pushFollow(FOLLOW_rule__Pattern__ElementsAssignment_1_in_rule__Pattern__Group__1__Impl2882);
            rule__Pattern__ElementsAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getElementsAssignment_1()); 
            }

            }

            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1349:1: ( ( rule__Pattern__ElementsAssignment_1 )* )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1350:1: ( rule__Pattern__ElementsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getElementsAssignment_1()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1351:1: ( rule__Pattern__ElementsAssignment_1 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_STRING||(LA33_0>=16 && LA33_0<=19)||LA33_0==53||(LA33_0>=71 && LA33_0<=73)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1351:2: rule__Pattern__ElementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Pattern__ElementsAssignment_1_in_rule__Pattern__Group__1__Impl2894);
            	    rule__Pattern__ElementsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getElementsAssignment_1()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__1__Impl"


    // $ANTLR start "rule__Pattern__Group__2"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1362:1: rule__Pattern__Group__2 : rule__Pattern__Group__2__Impl ;
    public final void rule__Pattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1366:1: ( rule__Pattern__Group__2__Impl )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1367:2: rule__Pattern__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Pattern__Group__2__Impl_in_rule__Pattern__Group__22927);
            rule__Pattern__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__2"


    // $ANTLR start "rule__Pattern__Group__2__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1373:1: rule__Pattern__Group__2__Impl : ( ( RULE_LF )* ) ;
    public final void rule__Pattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1377:1: ( ( ( RULE_LF )* ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1378:1: ( ( RULE_LF )* )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1378:1: ( ( RULE_LF )* )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1379:1: ( RULE_LF )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getLFTerminalRuleCall_2()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1380:1: ( RULE_LF )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_LF) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1380:3: RULE_LF
            	    {
            	    match(input,RULE_LF,FOLLOW_RULE_LF_in_rule__Pattern__Group__2__Impl2955); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getLFTerminalRuleCall_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__2__Impl"


    // $ANTLR start "rule__Instruction__Group__0"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1396:1: rule__Instruction__Group__0 : rule__Instruction__Group__0__Impl rule__Instruction__Group__1 ;
    public final void rule__Instruction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1400:1: ( rule__Instruction__Group__0__Impl rule__Instruction__Group__1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1401:2: rule__Instruction__Group__0__Impl rule__Instruction__Group__1
            {
            pushFollow(FOLLOW_rule__Instruction__Group__0__Impl_in_rule__Instruction__Group__02992);
            rule__Instruction__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Instruction__Group__1_in_rule__Instruction__Group__02995);
            rule__Instruction__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group__0"


    // $ANTLR start "rule__Instruction__Group__0__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1408:1: rule__Instruction__Group__0__Impl : ( 'Instruction' ) ;
    public final void rule__Instruction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1412:1: ( ( 'Instruction' ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1413:1: ( 'Instruction' )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1413:1: ( 'Instruction' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1414:1: 'Instruction'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstructionAccess().getInstructionKeyword_0()); 
            }
            match(input,53,FOLLOW_53_in_rule__Instruction__Group__0__Impl3023); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstructionAccess().getInstructionKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group__0__Impl"


    // $ANTLR start "rule__Instruction__Group__1"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1427:1: rule__Instruction__Group__1 : rule__Instruction__Group__1__Impl rule__Instruction__Group__2 ;
    public final void rule__Instruction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1431:1: ( rule__Instruction__Group__1__Impl rule__Instruction__Group__2 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1432:2: rule__Instruction__Group__1__Impl rule__Instruction__Group__2
            {
            pushFollow(FOLLOW_rule__Instruction__Group__1__Impl_in_rule__Instruction__Group__13054);
            rule__Instruction__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Instruction__Group__2_in_rule__Instruction__Group__13057);
            rule__Instruction__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group__1"


    // $ANTLR start "rule__Instruction__Group__1__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1439:1: rule__Instruction__Group__1__Impl : ( ( rule__Instruction__UnorderedGroup_1 ) ) ;
    public final void rule__Instruction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1443:1: ( ( ( rule__Instruction__UnorderedGroup_1 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1444:1: ( ( rule__Instruction__UnorderedGroup_1 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1444:1: ( ( rule__Instruction__UnorderedGroup_1 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1445:1: ( rule__Instruction__UnorderedGroup_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstructionAccess().getUnorderedGroup_1()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1446:1: ( rule__Instruction__UnorderedGroup_1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1446:2: rule__Instruction__UnorderedGroup_1
            {
            pushFollow(FOLLOW_rule__Instruction__UnorderedGroup_1_in_rule__Instruction__Group__1__Impl3084);
            rule__Instruction__UnorderedGroup_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstructionAccess().getUnorderedGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group__1__Impl"


    // $ANTLR start "rule__Instruction__Group__2"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1456:1: rule__Instruction__Group__2 : rule__Instruction__Group__2__Impl rule__Instruction__Group__3 ;
    public final void rule__Instruction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1460:1: ( rule__Instruction__Group__2__Impl rule__Instruction__Group__3 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1461:2: rule__Instruction__Group__2__Impl rule__Instruction__Group__3
            {
            pushFollow(FOLLOW_rule__Instruction__Group__2__Impl_in_rule__Instruction__Group__23114);
            rule__Instruction__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Instruction__Group__3_in_rule__Instruction__Group__23117);
            rule__Instruction__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group__2"


    // $ANTLR start "rule__Instruction__Group__2__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1468:1: rule__Instruction__Group__2__Impl : ( ( rule__Instruction__Group_2__0 )? ) ;
    public final void rule__Instruction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1472:1: ( ( ( rule__Instruction__Group_2__0 )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1473:1: ( ( rule__Instruction__Group_2__0 )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1473:1: ( ( rule__Instruction__Group_2__0 )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1474:1: ( rule__Instruction__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstructionAccess().getGroup_2()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1475:1: ( rule__Instruction__Group_2__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==54) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1475:2: rule__Instruction__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Instruction__Group_2__0_in_rule__Instruction__Group__2__Impl3144);
                    rule__Instruction__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstructionAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group__2__Impl"


    // $ANTLR start "rule__Instruction__Group__3"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1485:1: rule__Instruction__Group__3 : rule__Instruction__Group__3__Impl ;
    public final void rule__Instruction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1489:1: ( rule__Instruction__Group__3__Impl )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1490:2: rule__Instruction__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Instruction__Group__3__Impl_in_rule__Instruction__Group__33175);
            rule__Instruction__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group__3"


    // $ANTLR start "rule__Instruction__Group__3__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1496:1: rule__Instruction__Group__3__Impl : ( ( rule__Instruction__Alternatives_3 ) ) ;
    public final void rule__Instruction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1500:1: ( ( ( rule__Instruction__Alternatives_3 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1501:1: ( ( rule__Instruction__Alternatives_3 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1501:1: ( ( rule__Instruction__Alternatives_3 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1502:1: ( rule__Instruction__Alternatives_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstructionAccess().getAlternatives_3()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1503:1: ( rule__Instruction__Alternatives_3 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1503:2: rule__Instruction__Alternatives_3
            {
            pushFollow(FOLLOW_rule__Instruction__Alternatives_3_in_rule__Instruction__Group__3__Impl3202);
            rule__Instruction__Alternatives_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstructionAccess().getAlternatives_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group__3__Impl"


    // $ANTLR start "rule__Instruction__Group_2__0"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1521:1: rule__Instruction__Group_2__0 : rule__Instruction__Group_2__0__Impl rule__Instruction__Group_2__1 ;
    public final void rule__Instruction__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1525:1: ( rule__Instruction__Group_2__0__Impl rule__Instruction__Group_2__1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1526:2: rule__Instruction__Group_2__0__Impl rule__Instruction__Group_2__1
            {
            pushFollow(FOLLOW_rule__Instruction__Group_2__0__Impl_in_rule__Instruction__Group_2__03240);
            rule__Instruction__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Instruction__Group_2__1_in_rule__Instruction__Group_2__03243);
            rule__Instruction__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group_2__0"


    // $ANTLR start "rule__Instruction__Group_2__0__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1533:1: rule__Instruction__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Instruction__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1537:1: ( ( '(' ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1538:1: ( '(' )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1538:1: ( '(' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1539:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstructionAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,54,FOLLOW_54_in_rule__Instruction__Group_2__0__Impl3271); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstructionAccess().getLeftParenthesisKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group_2__0__Impl"


    // $ANTLR start "rule__Instruction__Group_2__1"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1552:1: rule__Instruction__Group_2__1 : rule__Instruction__Group_2__1__Impl rule__Instruction__Group_2__2 ;
    public final void rule__Instruction__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1556:1: ( rule__Instruction__Group_2__1__Impl rule__Instruction__Group_2__2 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1557:2: rule__Instruction__Group_2__1__Impl rule__Instruction__Group_2__2
            {
            pushFollow(FOLLOW_rule__Instruction__Group_2__1__Impl_in_rule__Instruction__Group_2__13302);
            rule__Instruction__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Instruction__Group_2__2_in_rule__Instruction__Group_2__13305);
            rule__Instruction__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group_2__1"


    // $ANTLR start "rule__Instruction__Group_2__1__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1564:1: rule__Instruction__Group_2__1__Impl : ( ( rule__Instruction__Group_2_1__0 )? ) ;
    public final void rule__Instruction__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1568:1: ( ( ( rule__Instruction__Group_2_1__0 )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1569:1: ( ( rule__Instruction__Group_2_1__0 )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1569:1: ( ( rule__Instruction__Group_2_1__0 )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1570:1: ( rule__Instruction__Group_2_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstructionAccess().getGroup_2_1()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1571:1: ( rule__Instruction__Group_2_1__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==56) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1571:2: rule__Instruction__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__Instruction__Group_2_1__0_in_rule__Instruction__Group_2__1__Impl3332);
                    rule__Instruction__Group_2_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstructionAccess().getGroup_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group_2__1__Impl"


    // $ANTLR start "rule__Instruction__Group_2__2"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1581:1: rule__Instruction__Group_2__2 : rule__Instruction__Group_2__2__Impl rule__Instruction__Group_2__3 ;
    public final void rule__Instruction__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1585:1: ( rule__Instruction__Group_2__2__Impl rule__Instruction__Group_2__3 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1586:2: rule__Instruction__Group_2__2__Impl rule__Instruction__Group_2__3
            {
            pushFollow(FOLLOW_rule__Instruction__Group_2__2__Impl_in_rule__Instruction__Group_2__23363);
            rule__Instruction__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Instruction__Group_2__3_in_rule__Instruction__Group_2__23366);
            rule__Instruction__Group_2__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group_2__2"


    // $ANTLR start "rule__Instruction__Group_2__2__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1593:1: rule__Instruction__Group_2__2__Impl : ( ( rule__Instruction__Group_2_2__0 )? ) ;
    public final void rule__Instruction__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1597:1: ( ( ( rule__Instruction__Group_2_2__0 )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1598:1: ( ( rule__Instruction__Group_2_2__0 )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1598:1: ( ( rule__Instruction__Group_2_2__0 )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1599:1: ( rule__Instruction__Group_2_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstructionAccess().getGroup_2_2()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1600:1: ( rule__Instruction__Group_2_2__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==57) ) {
                int LA37_1 = input.LA(2);

                if ( ((LA37_1>=12 && LA37_1<=13)) ) {
                    alt37=1;
                }
            }
            else if ( ((LA37_0>=12 && LA37_0<=13)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1600:2: rule__Instruction__Group_2_2__0
                    {
                    pushFollow(FOLLOW_rule__Instruction__Group_2_2__0_in_rule__Instruction__Group_2__2__Impl3393);
                    rule__Instruction__Group_2_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstructionAccess().getGroup_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group_2__2__Impl"


    // $ANTLR start "rule__Instruction__Group_2__3"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1610:1: rule__Instruction__Group_2__3 : rule__Instruction__Group_2__3__Impl rule__Instruction__Group_2__4 ;
    public final void rule__Instruction__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1614:1: ( rule__Instruction__Group_2__3__Impl rule__Instruction__Group_2__4 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1615:2: rule__Instruction__Group_2__3__Impl rule__Instruction__Group_2__4
            {
            pushFollow(FOLLOW_rule__Instruction__Group_2__3__Impl_in_rule__Instruction__Group_2__33424);
            rule__Instruction__Group_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Instruction__Group_2__4_in_rule__Instruction__Group_2__33427);
            rule__Instruction__Group_2__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group_2__3"


    // $ANTLR start "rule__Instruction__Group_2__3__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1622:1: rule__Instruction__Group_2__3__Impl : ( ( rule__Instruction__Group_2_3__0 )? ) ;
    public final void rule__Instruction__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1626:1: ( ( ( rule__Instruction__Group_2_3__0 )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1627:1: ( ( rule__Instruction__Group_2_3__0 )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1627:1: ( ( rule__Instruction__Group_2_3__0 )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1628:1: ( rule__Instruction__Group_2_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstructionAccess().getGroup_2_3()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1629:1: ( rule__Instruction__Group_2_3__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_INT||LA38_0==57) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1629:2: rule__Instruction__Group_2_3__0
                    {
                    pushFollow(FOLLOW_rule__Instruction__Group_2_3__0_in_rule__Instruction__Group_2__3__Impl3454);
                    rule__Instruction__Group_2_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstructionAccess().getGroup_2_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group_2__3__Impl"


    // $ANTLR start "rule__Instruction__Group_2__4"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1639:1: rule__Instruction__Group_2__4 : rule__Instruction__Group_2__4__Impl ;
    public final void rule__Instruction__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1643:1: ( rule__Instruction__Group_2__4__Impl )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1644:2: rule__Instruction__Group_2__4__Impl
            {
            pushFollow(FOLLOW_rule__Instruction__Group_2__4__Impl_in_rule__Instruction__Group_2__43485);
            rule__Instruction__Group_2__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group_2__4"


    // $ANTLR start "rule__Instruction__Group_2__4__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1650:1: rule__Instruction__Group_2__4__Impl : ( ')' ) ;
    public final void rule__Instruction__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1654:1: ( ( ')' ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1655:1: ( ')' )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1655:1: ( ')' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1656:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstructionAccess().getRightParenthesisKeyword_2_4()); 
            }
            match(input,55,FOLLOW_55_in_rule__Instruction__Group_2__4__Impl3513); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstructionAccess().getRightParenthesisKeyword_2_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group_2__4__Impl"


    // $ANTLR start "rule__Instruction__Group_2_1__0"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1679:1: rule__Instruction__Group_2_1__0 : rule__Instruction__Group_2_1__0__Impl rule__Instruction__Group_2_1__1 ;
    public final void rule__Instruction__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1683:1: ( rule__Instruction__Group_2_1__0__Impl rule__Instruction__Group_2_1__1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1684:2: rule__Instruction__Group_2_1__0__Impl rule__Instruction__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__Instruction__Group_2_1__0__Impl_in_rule__Instruction__Group_2_1__03554);
            rule__Instruction__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Instruction__Group_2_1__1_in_rule__Instruction__Group_2_1__03557);
            rule__Instruction__Group_2_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group_2_1__0"


    // $ANTLR start "rule__Instruction__Group_2_1__0__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1691:1: rule__Instruction__Group_2_1__0__Impl : ( 'with' ) ;
    public final void rule__Instruction__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1695:1: ( ( 'with' ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1696:1: ( 'with' )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1696:1: ( 'with' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1697:1: 'with'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstructionAccess().getWithKeyword_2_1_0()); 
            }
            match(input,56,FOLLOW_56_in_rule__Instruction__Group_2_1__0__Impl3585); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstructionAccess().getWithKeyword_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group_2_1__0__Impl"


    // $ANTLR start "rule__Instruction__Group_2_1__1"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1710:1: rule__Instruction__Group_2_1__1 : rule__Instruction__Group_2_1__1__Impl rule__Instruction__Group_2_1__2 ;
    public final void rule__Instruction__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1714:1: ( rule__Instruction__Group_2_1__1__Impl rule__Instruction__Group_2_1__2 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1715:2: rule__Instruction__Group_2_1__1__Impl rule__Instruction__Group_2_1__2
            {
            pushFollow(FOLLOW_rule__Instruction__Group_2_1__1__Impl_in_rule__Instruction__Group_2_1__13616);
            rule__Instruction__Group_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Instruction__Group_2_1__2_in_rule__Instruction__Group_2_1__13619);
            rule__Instruction__Group_2_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group_2_1__1"


    // $ANTLR start "rule__Instruction__Group_2_1__1__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1722:1: rule__Instruction__Group_2_1__1__Impl : ( ( rule__Instruction__HasKeyAssignment_2_1_1 ) ) ;
    public final void rule__Instruction__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1726:1: ( ( ( rule__Instruction__HasKeyAssignment_2_1_1 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1727:1: ( ( rule__Instruction__HasKeyAssignment_2_1_1 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1727:1: ( ( rule__Instruction__HasKeyAssignment_2_1_1 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1728:1: ( rule__Instruction__HasKeyAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstructionAccess().getHasKeyAssignment_2_1_1()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1729:1: ( rule__Instruction__HasKeyAssignment_2_1_1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1729:2: rule__Instruction__HasKeyAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__Instruction__HasKeyAssignment_2_1_1_in_rule__Instruction__Group_2_1__1__Impl3646);
            rule__Instruction__HasKeyAssignment_2_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstructionAccess().getHasKeyAssignment_2_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group_2_1__1__Impl"


    // $ANTLR start "rule__Instruction__Group_2_1__2"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1739:1: rule__Instruction__Group_2_1__2 : rule__Instruction__Group_2_1__2__Impl ;
    public final void rule__Instruction__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1743:1: ( rule__Instruction__Group_2_1__2__Impl )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1744:2: rule__Instruction__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Instruction__Group_2_1__2__Impl_in_rule__Instruction__Group_2_1__23676);
            rule__Instruction__Group_2_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group_2_1__2"


    // $ANTLR start "rule__Instruction__Group_2_1__2__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1750:1: rule__Instruction__Group_2_1__2__Impl : ( ( rule__Instruction__MessageKeyAssignment_2_1_2 )? ) ;
    public final void rule__Instruction__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1754:1: ( ( ( rule__Instruction__MessageKeyAssignment_2_1_2 )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1755:1: ( ( rule__Instruction__MessageKeyAssignment_2_1_2 )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1755:1: ( ( rule__Instruction__MessageKeyAssignment_2_1_2 )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1756:1: ( rule__Instruction__MessageKeyAssignment_2_1_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstructionAccess().getMessageKeyAssignment_2_1_2()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1757:1: ( rule__Instruction__MessageKeyAssignment_2_1_2 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_STRING) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1757:2: rule__Instruction__MessageKeyAssignment_2_1_2
                    {
                    pushFollow(FOLLOW_rule__Instruction__MessageKeyAssignment_2_1_2_in_rule__Instruction__Group_2_1__2__Impl3703);
                    rule__Instruction__MessageKeyAssignment_2_1_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstructionAccess().getMessageKeyAssignment_2_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group_2_1__2__Impl"


    // $ANTLR start "rule__Instruction__Group_2_2__0"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1773:1: rule__Instruction__Group_2_2__0 : rule__Instruction__Group_2_2__0__Impl rule__Instruction__Group_2_2__1 ;
    public final void rule__Instruction__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1777:1: ( rule__Instruction__Group_2_2__0__Impl rule__Instruction__Group_2_2__1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1778:2: rule__Instruction__Group_2_2__0__Impl rule__Instruction__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__Instruction__Group_2_2__0__Impl_in_rule__Instruction__Group_2_2__03740);
            rule__Instruction__Group_2_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Instruction__Group_2_2__1_in_rule__Instruction__Group_2_2__03743);
            rule__Instruction__Group_2_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group_2_2__0"


    // $ANTLR start "rule__Instruction__Group_2_2__0__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1785:1: rule__Instruction__Group_2_2__0__Impl : ( ( ',' )? ) ;
    public final void rule__Instruction__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1789:1: ( ( ( ',' )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1790:1: ( ( ',' )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1790:1: ( ( ',' )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1791:1: ( ',' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstructionAccess().getCommaKeyword_2_2_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1792:1: ( ',' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==57) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1793:2: ','
                    {
                    match(input,57,FOLLOW_57_in_rule__Instruction__Group_2_2__0__Impl3772); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstructionAccess().getCommaKeyword_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group_2_2__0__Impl"


    // $ANTLR start "rule__Instruction__Group_2_2__1"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1804:1: rule__Instruction__Group_2_2__1 : rule__Instruction__Group_2_2__1__Impl rule__Instruction__Group_2_2__2 ;
    public final void rule__Instruction__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1808:1: ( rule__Instruction__Group_2_2__1__Impl rule__Instruction__Group_2_2__2 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1809:2: rule__Instruction__Group_2_2__1__Impl rule__Instruction__Group_2_2__2
            {
            pushFollow(FOLLOW_rule__Instruction__Group_2_2__1__Impl_in_rule__Instruction__Group_2_2__13805);
            rule__Instruction__Group_2_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Instruction__Group_2_2__2_in_rule__Instruction__Group_2_2__13808);
            rule__Instruction__Group_2_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group_2_2__1"


    // $ANTLR start "rule__Instruction__Group_2_2__1__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1816:1: rule__Instruction__Group_2_2__1__Impl : ( ( rule__Instruction__ShapeAssignment_2_2_1 ) ) ;
    public final void rule__Instruction__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1820:1: ( ( ( rule__Instruction__ShapeAssignment_2_2_1 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1821:1: ( ( rule__Instruction__ShapeAssignment_2_2_1 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1821:1: ( ( rule__Instruction__ShapeAssignment_2_2_1 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1822:1: ( rule__Instruction__ShapeAssignment_2_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstructionAccess().getShapeAssignment_2_2_1()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1823:1: ( rule__Instruction__ShapeAssignment_2_2_1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1823:2: rule__Instruction__ShapeAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__Instruction__ShapeAssignment_2_2_1_in_rule__Instruction__Group_2_2__1__Impl3835);
            rule__Instruction__ShapeAssignment_2_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstructionAccess().getShapeAssignment_2_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group_2_2__1__Impl"


    // $ANTLR start "rule__Instruction__Group_2_2__2"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1833:1: rule__Instruction__Group_2_2__2 : rule__Instruction__Group_2_2__2__Impl ;
    public final void rule__Instruction__Group_2_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1837:1: ( rule__Instruction__Group_2_2__2__Impl )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1838:2: rule__Instruction__Group_2_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Instruction__Group_2_2__2__Impl_in_rule__Instruction__Group_2_2__23865);
            rule__Instruction__Group_2_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group_2_2__2"


    // $ANTLR start "rule__Instruction__Group_2_2__2__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1844:1: rule__Instruction__Group_2_2__2__Impl : ( ( 'shape' )? ) ;
    public final void rule__Instruction__Group_2_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1848:1: ( ( ( 'shape' )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1849:1: ( ( 'shape' )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1849:1: ( ( 'shape' )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1850:1: ( 'shape' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstructionAccess().getShapeKeyword_2_2_2()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1851:1: ( 'shape' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==58) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1852:2: 'shape'
                    {
                    match(input,58,FOLLOW_58_in_rule__Instruction__Group_2_2__2__Impl3894); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstructionAccess().getShapeKeyword_2_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group_2_2__2__Impl"


    // $ANTLR start "rule__Instruction__Group_2_3__0"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1869:1: rule__Instruction__Group_2_3__0 : rule__Instruction__Group_2_3__0__Impl rule__Instruction__Group_2_3__1 ;
    public final void rule__Instruction__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1873:1: ( rule__Instruction__Group_2_3__0__Impl rule__Instruction__Group_2_3__1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1874:2: rule__Instruction__Group_2_3__0__Impl rule__Instruction__Group_2_3__1
            {
            pushFollow(FOLLOW_rule__Instruction__Group_2_3__0__Impl_in_rule__Instruction__Group_2_3__03933);
            rule__Instruction__Group_2_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Instruction__Group_2_3__1_in_rule__Instruction__Group_2_3__03936);
            rule__Instruction__Group_2_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group_2_3__0"


    // $ANTLR start "rule__Instruction__Group_2_3__0__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1881:1: rule__Instruction__Group_2_3__0__Impl : ( ( ',' )? ) ;
    public final void rule__Instruction__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1885:1: ( ( ( ',' )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1886:1: ( ( ',' )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1886:1: ( ( ',' )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1887:1: ( ',' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstructionAccess().getCommaKeyword_2_3_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1888:1: ( ',' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==57) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1889:2: ','
                    {
                    match(input,57,FOLLOW_57_in_rule__Instruction__Group_2_3__0__Impl3965); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstructionAccess().getCommaKeyword_2_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group_2_3__0__Impl"


    // $ANTLR start "rule__Instruction__Group_2_3__1"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1900:1: rule__Instruction__Group_2_3__1 : rule__Instruction__Group_2_3__1__Impl rule__Instruction__Group_2_3__2 ;
    public final void rule__Instruction__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1904:1: ( rule__Instruction__Group_2_3__1__Impl rule__Instruction__Group_2_3__2 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1905:2: rule__Instruction__Group_2_3__1__Impl rule__Instruction__Group_2_3__2
            {
            pushFollow(FOLLOW_rule__Instruction__Group_2_3__1__Impl_in_rule__Instruction__Group_2_3__13998);
            rule__Instruction__Group_2_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Instruction__Group_2_3__2_in_rule__Instruction__Group_2_3__14001);
            rule__Instruction__Group_2_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group_2_3__1"


    // $ANTLR start "rule__Instruction__Group_2_3__1__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1912:1: rule__Instruction__Group_2_3__1__Impl : ( ( rule__Instruction__RowCountAssignment_2_3_1 ) ) ;
    public final void rule__Instruction__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1916:1: ( ( ( rule__Instruction__RowCountAssignment_2_3_1 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1917:1: ( ( rule__Instruction__RowCountAssignment_2_3_1 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1917:1: ( ( rule__Instruction__RowCountAssignment_2_3_1 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1918:1: ( rule__Instruction__RowCountAssignment_2_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstructionAccess().getRowCountAssignment_2_3_1()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1919:1: ( rule__Instruction__RowCountAssignment_2_3_1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1919:2: rule__Instruction__RowCountAssignment_2_3_1
            {
            pushFollow(FOLLOW_rule__Instruction__RowCountAssignment_2_3_1_in_rule__Instruction__Group_2_3__1__Impl4028);
            rule__Instruction__RowCountAssignment_2_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstructionAccess().getRowCountAssignment_2_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group_2_3__1__Impl"


    // $ANTLR start "rule__Instruction__Group_2_3__2"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1929:1: rule__Instruction__Group_2_3__2 : rule__Instruction__Group_2_3__2__Impl ;
    public final void rule__Instruction__Group_2_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1933:1: ( rule__Instruction__Group_2_3__2__Impl )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1934:2: rule__Instruction__Group_2_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Instruction__Group_2_3__2__Impl_in_rule__Instruction__Group_2_3__24058);
            rule__Instruction__Group_2_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group_2_3__2"


    // $ANTLR start "rule__Instruction__Group_2_3__2__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1940:1: rule__Instruction__Group_2_3__2__Impl : ( ( rule__Instruction__Alternatives_2_3_2 )? ) ;
    public final void rule__Instruction__Group_2_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1944:1: ( ( ( rule__Instruction__Alternatives_2_3_2 )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1945:1: ( ( rule__Instruction__Alternatives_2_3_2 )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1945:1: ( ( rule__Instruction__Alternatives_2_3_2 )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1946:1: ( rule__Instruction__Alternatives_2_3_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstructionAccess().getAlternatives_2_3_2()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1947:1: ( rule__Instruction__Alternatives_2_3_2 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=14 && LA43_0<=15)) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1947:2: rule__Instruction__Alternatives_2_3_2
                    {
                    pushFollow(FOLLOW_rule__Instruction__Alternatives_2_3_2_in_rule__Instruction__Group_2_3__2__Impl4085);
                    rule__Instruction__Alternatives_2_3_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstructionAccess().getAlternatives_2_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group_2_3__2__Impl"


    // $ANTLR start "rule__Instruction__Group_3_0__0"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1963:1: rule__Instruction__Group_3_0__0 : rule__Instruction__Group_3_0__0__Impl rule__Instruction__Group_3_0__1 ;
    public final void rule__Instruction__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1967:1: ( rule__Instruction__Group_3_0__0__Impl rule__Instruction__Group_3_0__1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1968:2: rule__Instruction__Group_3_0__0__Impl rule__Instruction__Group_3_0__1
            {
            pushFollow(FOLLOW_rule__Instruction__Group_3_0__0__Impl_in_rule__Instruction__Group_3_0__04122);
            rule__Instruction__Group_3_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Instruction__Group_3_0__1_in_rule__Instruction__Group_3_0__04125);
            rule__Instruction__Group_3_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group_3_0__0"


    // $ANTLR start "rule__Instruction__Group_3_0__0__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1975:1: rule__Instruction__Group_3_0__0__Impl : ( '{' ) ;
    public final void rule__Instruction__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1979:1: ( ( '{' ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1980:1: ( '{' )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1980:1: ( '{' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1981:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstructionAccess().getLeftCurlyBracketKeyword_3_0_0()); 
            }
            match(input,59,FOLLOW_59_in_rule__Instruction__Group_3_0__0__Impl4153); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstructionAccess().getLeftCurlyBracketKeyword_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group_3_0__0__Impl"


    // $ANTLR start "rule__Instruction__Group_3_0__1"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1994:1: rule__Instruction__Group_3_0__1 : rule__Instruction__Group_3_0__1__Impl rule__Instruction__Group_3_0__2 ;
    public final void rule__Instruction__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1998:1: ( rule__Instruction__Group_3_0__1__Impl rule__Instruction__Group_3_0__2 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1999:2: rule__Instruction__Group_3_0__1__Impl rule__Instruction__Group_3_0__2
            {
            pushFollow(FOLLOW_rule__Instruction__Group_3_0__1__Impl_in_rule__Instruction__Group_3_0__14184);
            rule__Instruction__Group_3_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Instruction__Group_3_0__2_in_rule__Instruction__Group_3_0__14187);
            rule__Instruction__Group_3_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group_3_0__1"


    // $ANTLR start "rule__Instruction__Group_3_0__1__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2006:1: rule__Instruction__Group_3_0__1__Impl : ( ( RULE_LF )* ) ;
    public final void rule__Instruction__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2010:1: ( ( ( RULE_LF )* ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2011:1: ( ( RULE_LF )* )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2011:1: ( ( RULE_LF )* )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2012:1: ( RULE_LF )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstructionAccess().getLFTerminalRuleCall_3_0_1()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2013:1: ( RULE_LF )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==RULE_LF) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2013:3: RULE_LF
            	    {
            	    match(input,RULE_LF,FOLLOW_RULE_LF_in_rule__Instruction__Group_3_0__1__Impl4215); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstructionAccess().getLFTerminalRuleCall_3_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group_3_0__1__Impl"


    // $ANTLR start "rule__Instruction__Group_3_0__2"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2023:1: rule__Instruction__Group_3_0__2 : rule__Instruction__Group_3_0__2__Impl rule__Instruction__Group_3_0__3 ;
    public final void rule__Instruction__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2027:1: ( rule__Instruction__Group_3_0__2__Impl rule__Instruction__Group_3_0__3 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2028:2: rule__Instruction__Group_3_0__2__Impl rule__Instruction__Group_3_0__3
            {
            pushFollow(FOLLOW_rule__Instruction__Group_3_0__2__Impl_in_rule__Instruction__Group_3_0__24246);
            rule__Instruction__Group_3_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Instruction__Group_3_0__3_in_rule__Instruction__Group_3_0__24249);
            rule__Instruction__Group_3_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group_3_0__2"


    // $ANTLR start "rule__Instruction__Group_3_0__2__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2035:1: rule__Instruction__Group_3_0__2__Impl : ( ( ( rule__Instruction__RowsAssignment_3_0_2 ) ) ( ( rule__Instruction__RowsAssignment_3_0_2 )* ) ) ;
    public final void rule__Instruction__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2039:1: ( ( ( ( rule__Instruction__RowsAssignment_3_0_2 ) ) ( ( rule__Instruction__RowsAssignment_3_0_2 )* ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2040:1: ( ( ( rule__Instruction__RowsAssignment_3_0_2 ) ) ( ( rule__Instruction__RowsAssignment_3_0_2 )* ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2040:1: ( ( ( rule__Instruction__RowsAssignment_3_0_2 ) ) ( ( rule__Instruction__RowsAssignment_3_0_2 )* ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2041:1: ( ( rule__Instruction__RowsAssignment_3_0_2 ) ) ( ( rule__Instruction__RowsAssignment_3_0_2 )* )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2041:1: ( ( rule__Instruction__RowsAssignment_3_0_2 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2042:1: ( rule__Instruction__RowsAssignment_3_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstructionAccess().getRowsAssignment_3_0_2()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2043:1: ( rule__Instruction__RowsAssignment_3_0_2 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2043:2: rule__Instruction__RowsAssignment_3_0_2
            {
            pushFollow(FOLLOW_rule__Instruction__RowsAssignment_3_0_2_in_rule__Instruction__Group_3_0__2__Impl4278);
            rule__Instruction__RowsAssignment_3_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstructionAccess().getRowsAssignment_3_0_2()); 
            }

            }

            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2046:1: ( ( rule__Instruction__RowsAssignment_3_0_2 )* )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2047:1: ( rule__Instruction__RowsAssignment_3_0_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstructionAccess().getRowsAssignment_3_0_2()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2048:1: ( rule__Instruction__RowsAssignment_3_0_2 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( ((LA45_0>=16 && LA45_0<=19)||(LA45_0>=71 && LA45_0<=73)) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2048:2: rule__Instruction__RowsAssignment_3_0_2
            	    {
            	    pushFollow(FOLLOW_rule__Instruction__RowsAssignment_3_0_2_in_rule__Instruction__Group_3_0__2__Impl4290);
            	    rule__Instruction__RowsAssignment_3_0_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstructionAccess().getRowsAssignment_3_0_2()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group_3_0__2__Impl"


    // $ANTLR start "rule__Instruction__Group_3_0__3"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2059:1: rule__Instruction__Group_3_0__3 : rule__Instruction__Group_3_0__3__Impl rule__Instruction__Group_3_0__4 ;
    public final void rule__Instruction__Group_3_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2063:1: ( rule__Instruction__Group_3_0__3__Impl rule__Instruction__Group_3_0__4 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2064:2: rule__Instruction__Group_3_0__3__Impl rule__Instruction__Group_3_0__4
            {
            pushFollow(FOLLOW_rule__Instruction__Group_3_0__3__Impl_in_rule__Instruction__Group_3_0__34323);
            rule__Instruction__Group_3_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Instruction__Group_3_0__4_in_rule__Instruction__Group_3_0__34326);
            rule__Instruction__Group_3_0__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group_3_0__3"


    // $ANTLR start "rule__Instruction__Group_3_0__3__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2071:1: rule__Instruction__Group_3_0__3__Impl : ( '}' ) ;
    public final void rule__Instruction__Group_3_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2075:1: ( ( '}' ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2076:1: ( '}' )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2076:1: ( '}' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2077:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstructionAccess().getRightCurlyBracketKeyword_3_0_3()); 
            }
            match(input,60,FOLLOW_60_in_rule__Instruction__Group_3_0__3__Impl4354); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstructionAccess().getRightCurlyBracketKeyword_3_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group_3_0__3__Impl"


    // $ANTLR start "rule__Instruction__Group_3_0__4"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2090:1: rule__Instruction__Group_3_0__4 : rule__Instruction__Group_3_0__4__Impl ;
    public final void rule__Instruction__Group_3_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2094:1: ( rule__Instruction__Group_3_0__4__Impl )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2095:2: rule__Instruction__Group_3_0__4__Impl
            {
            pushFollow(FOLLOW_rule__Instruction__Group_3_0__4__Impl_in_rule__Instruction__Group_3_0__44385);
            rule__Instruction__Group_3_0__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group_3_0__4"


    // $ANTLR start "rule__Instruction__Group_3_0__4__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2101:1: rule__Instruction__Group_3_0__4__Impl : ( ( RULE_LF )? ) ;
    public final void rule__Instruction__Group_3_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2105:1: ( ( ( RULE_LF )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2106:1: ( ( RULE_LF )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2106:1: ( ( RULE_LF )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2107:1: ( RULE_LF )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstructionAccess().getLFTerminalRuleCall_3_0_4()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2108:1: ( RULE_LF )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_LF) ) {
                int LA46_1 = input.LA(2);

                if ( (synpred63_InternalKnittingExpressionLanguage()) ) {
                    alt46=1;
                }
            }
            switch (alt46) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2108:3: RULE_LF
                    {
                    match(input,RULE_LF,FOLLOW_RULE_LF_in_rule__Instruction__Group_3_0__4__Impl4413); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstructionAccess().getLFTerminalRuleCall_3_0_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group_3_0__4__Impl"


    // $ANTLR start "rule__Instruction__Group_3_1__0"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2128:1: rule__Instruction__Group_3_1__0 : rule__Instruction__Group_3_1__0__Impl rule__Instruction__Group_3_1__1 ;
    public final void rule__Instruction__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2132:1: ( rule__Instruction__Group_3_1__0__Impl rule__Instruction__Group_3_1__1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2133:2: rule__Instruction__Group_3_1__0__Impl rule__Instruction__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__Instruction__Group_3_1__0__Impl_in_rule__Instruction__Group_3_1__04454);
            rule__Instruction__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Instruction__Group_3_1__1_in_rule__Instruction__Group_3_1__04457);
            rule__Instruction__Group_3_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group_3_1__0"


    // $ANTLR start "rule__Instruction__Group_3_1__0__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2140:1: rule__Instruction__Group_3_1__0__Impl : ( ':' ) ;
    public final void rule__Instruction__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2144:1: ( ( ':' ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2145:1: ( ':' )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2145:1: ( ':' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2146:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstructionAccess().getColonKeyword_3_1_0()); 
            }
            match(input,61,FOLLOW_61_in_rule__Instruction__Group_3_1__0__Impl4485); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstructionAccess().getColonKeyword_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group_3_1__0__Impl"


    // $ANTLR start "rule__Instruction__Group_3_1__1"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2159:1: rule__Instruction__Group_3_1__1 : rule__Instruction__Group_3_1__1__Impl rule__Instruction__Group_3_1__2 ;
    public final void rule__Instruction__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2163:1: ( rule__Instruction__Group_3_1__1__Impl rule__Instruction__Group_3_1__2 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2164:2: rule__Instruction__Group_3_1__1__Impl rule__Instruction__Group_3_1__2
            {
            pushFollow(FOLLOW_rule__Instruction__Group_3_1__1__Impl_in_rule__Instruction__Group_3_1__14516);
            rule__Instruction__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Instruction__Group_3_1__2_in_rule__Instruction__Group_3_1__14519);
            rule__Instruction__Group_3_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group_3_1__1"


    // $ANTLR start "rule__Instruction__Group_3_1__1__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2171:1: rule__Instruction__Group_3_1__1__Impl : ( RULE_LF ) ;
    public final void rule__Instruction__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2175:1: ( ( RULE_LF ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2176:1: ( RULE_LF )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2176:1: ( RULE_LF )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2177:1: RULE_LF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstructionAccess().getLFTerminalRuleCall_3_1_1()); 
            }
            match(input,RULE_LF,FOLLOW_RULE_LF_in_rule__Instruction__Group_3_1__1__Impl4546); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstructionAccess().getLFTerminalRuleCall_3_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group_3_1__1__Impl"


    // $ANTLR start "rule__Instruction__Group_3_1__2"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2188:1: rule__Instruction__Group_3_1__2 : rule__Instruction__Group_3_1__2__Impl rule__Instruction__Group_3_1__3 ;
    public final void rule__Instruction__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2192:1: ( rule__Instruction__Group_3_1__2__Impl rule__Instruction__Group_3_1__3 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2193:2: rule__Instruction__Group_3_1__2__Impl rule__Instruction__Group_3_1__3
            {
            pushFollow(FOLLOW_rule__Instruction__Group_3_1__2__Impl_in_rule__Instruction__Group_3_1__24575);
            rule__Instruction__Group_3_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Instruction__Group_3_1__3_in_rule__Instruction__Group_3_1__24578);
            rule__Instruction__Group_3_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group_3_1__2"


    // $ANTLR start "rule__Instruction__Group_3_1__2__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2200:1: rule__Instruction__Group_3_1__2__Impl : ( ( ( rule__Instruction__RowsAssignment_3_1_2 ) ) ( ( rule__Instruction__RowsAssignment_3_1_2 )* ) ) ;
    public final void rule__Instruction__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2204:1: ( ( ( ( rule__Instruction__RowsAssignment_3_1_2 ) ) ( ( rule__Instruction__RowsAssignment_3_1_2 )* ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2205:1: ( ( ( rule__Instruction__RowsAssignment_3_1_2 ) ) ( ( rule__Instruction__RowsAssignment_3_1_2 )* ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2205:1: ( ( ( rule__Instruction__RowsAssignment_3_1_2 ) ) ( ( rule__Instruction__RowsAssignment_3_1_2 )* ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2206:1: ( ( rule__Instruction__RowsAssignment_3_1_2 ) ) ( ( rule__Instruction__RowsAssignment_3_1_2 )* )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2206:1: ( ( rule__Instruction__RowsAssignment_3_1_2 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2207:1: ( rule__Instruction__RowsAssignment_3_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstructionAccess().getRowsAssignment_3_1_2()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2208:1: ( rule__Instruction__RowsAssignment_3_1_2 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2208:2: rule__Instruction__RowsAssignment_3_1_2
            {
            pushFollow(FOLLOW_rule__Instruction__RowsAssignment_3_1_2_in_rule__Instruction__Group_3_1__2__Impl4607);
            rule__Instruction__RowsAssignment_3_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstructionAccess().getRowsAssignment_3_1_2()); 
            }

            }

            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2211:1: ( ( rule__Instruction__RowsAssignment_3_1_2 )* )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2212:1: ( rule__Instruction__RowsAssignment_3_1_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstructionAccess().getRowsAssignment_3_1_2()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2213:1: ( rule__Instruction__RowsAssignment_3_1_2 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( ((LA47_0>=16 && LA47_0<=19)||(LA47_0>=71 && LA47_0<=73)) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2213:2: rule__Instruction__RowsAssignment_3_1_2
            	    {
            	    pushFollow(FOLLOW_rule__Instruction__RowsAssignment_3_1_2_in_rule__Instruction__Group_3_1__2__Impl4619);
            	    rule__Instruction__RowsAssignment_3_1_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstructionAccess().getRowsAssignment_3_1_2()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group_3_1__2__Impl"


    // $ANTLR start "rule__Instruction__Group_3_1__3"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2224:1: rule__Instruction__Group_3_1__3 : rule__Instruction__Group_3_1__3__Impl ;
    public final void rule__Instruction__Group_3_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2228:1: ( rule__Instruction__Group_3_1__3__Impl )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2229:2: rule__Instruction__Group_3_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Instruction__Group_3_1__3__Impl_in_rule__Instruction__Group_3_1__34652);
            rule__Instruction__Group_3_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group_3_1__3"


    // $ANTLR start "rule__Instruction__Group_3_1__3__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2235:1: rule__Instruction__Group_3_1__3__Impl : ( RULE_LF ) ;
    public final void rule__Instruction__Group_3_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2239:1: ( ( RULE_LF ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2240:1: ( RULE_LF )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2240:1: ( RULE_LF )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2241:1: RULE_LF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstructionAccess().getLFTerminalRuleCall_3_1_3()); 
            }
            match(input,RULE_LF,FOLLOW_RULE_LF_in_rule__Instruction__Group_3_1__3__Impl4679); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstructionAccess().getLFTerminalRuleCall_3_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group_3_1__3__Impl"


    // $ANTLR start "rule__Row__Group__0"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2260:1: rule__Row__Group__0 : rule__Row__Group__0__Impl rule__Row__Group__1 ;
    public final void rule__Row__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2264:1: ( rule__Row__Group__0__Impl rule__Row__Group__1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2265:2: rule__Row__Group__0__Impl rule__Row__Group__1
            {
            pushFollow(FOLLOW_rule__Row__Group__0__Impl_in_rule__Row__Group__04716);
            rule__Row__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Row__Group__1_in_rule__Row__Group__04719);
            rule__Row__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__0"


    // $ANTLR start "rule__Row__Group__0__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2272:1: rule__Row__Group__0__Impl : ( ( rule__Row__NextRowAssignment_0 )? ) ;
    public final void rule__Row__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2276:1: ( ( ( rule__Row__NextRowAssignment_0 )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2277:1: ( ( rule__Row__NextRowAssignment_0 )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2277:1: ( ( rule__Row__NextRowAssignment_0 )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2278:1: ( rule__Row__NextRowAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getNextRowAssignment_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2279:1: ( rule__Row__NextRowAssignment_0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==71) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2279:2: rule__Row__NextRowAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Row__NextRowAssignment_0_in_rule__Row__Group__0__Impl4746);
                    rule__Row__NextRowAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRowAccess().getNextRowAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__0__Impl"


    // $ANTLR start "rule__Row__Group__1"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2289:1: rule__Row__Group__1 : rule__Row__Group__1__Impl rule__Row__Group__2 ;
    public final void rule__Row__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2293:1: ( rule__Row__Group__1__Impl rule__Row__Group__2 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2294:2: rule__Row__Group__1__Impl rule__Row__Group__2
            {
            pushFollow(FOLLOW_rule__Row__Group__1__Impl_in_rule__Row__Group__14777);
            rule__Row__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Row__Group__2_in_rule__Row__Group__14780);
            rule__Row__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__1"


    // $ANTLR start "rule__Row__Group__1__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2301:1: rule__Row__Group__1__Impl : ( ( rule__Row__UnorderedGroup_1 ) ) ;
    public final void rule__Row__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2305:1: ( ( ( rule__Row__UnorderedGroup_1 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2306:1: ( ( rule__Row__UnorderedGroup_1 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2306:1: ( ( rule__Row__UnorderedGroup_1 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2307:1: ( rule__Row__UnorderedGroup_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getUnorderedGroup_1()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2308:1: ( rule__Row__UnorderedGroup_1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2308:2: rule__Row__UnorderedGroup_1
            {
            pushFollow(FOLLOW_rule__Row__UnorderedGroup_1_in_rule__Row__Group__1__Impl4807);
            rule__Row__UnorderedGroup_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRowAccess().getUnorderedGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__1__Impl"


    // $ANTLR start "rule__Row__Group__2"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2318:1: rule__Row__Group__2 : rule__Row__Group__2__Impl rule__Row__Group__3 ;
    public final void rule__Row__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2322:1: ( rule__Row__Group__2__Impl rule__Row__Group__3 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2323:2: rule__Row__Group__2__Impl rule__Row__Group__3
            {
            pushFollow(FOLLOW_rule__Row__Group__2__Impl_in_rule__Row__Group__24837);
            rule__Row__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Row__Group__3_in_rule__Row__Group__24840);
            rule__Row__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__2"


    // $ANTLR start "rule__Row__Group__2__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2330:1: rule__Row__Group__2__Impl : ( ( rule__Row__LabelAssignment_2 ) ) ;
    public final void rule__Row__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2334:1: ( ( ( rule__Row__LabelAssignment_2 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2335:1: ( ( rule__Row__LabelAssignment_2 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2335:1: ( ( rule__Row__LabelAssignment_2 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2336:1: ( rule__Row__LabelAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getLabelAssignment_2()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2337:1: ( rule__Row__LabelAssignment_2 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2337:2: rule__Row__LabelAssignment_2
            {
            pushFollow(FOLLOW_rule__Row__LabelAssignment_2_in_rule__Row__Group__2__Impl4867);
            rule__Row__LabelAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRowAccess().getLabelAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__2__Impl"


    // $ANTLR start "rule__Row__Group__3"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2347:1: rule__Row__Group__3 : rule__Row__Group__3__Impl rule__Row__Group__4 ;
    public final void rule__Row__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2351:1: ( rule__Row__Group__3__Impl rule__Row__Group__4 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2352:2: rule__Row__Group__3__Impl rule__Row__Group__4
            {
            pushFollow(FOLLOW_rule__Row__Group__3__Impl_in_rule__Row__Group__34897);
            rule__Row__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Row__Group__4_in_rule__Row__Group__34900);
            rule__Row__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__3"


    // $ANTLR start "rule__Row__Group__3__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2359:1: rule__Row__Group__3__Impl : ( ( rule__Row__Alternatives_3 )? ) ;
    public final void rule__Row__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2363:1: ( ( ( rule__Row__Alternatives_3 )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2364:1: ( ( rule__Row__Alternatives_3 )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2364:1: ( ( rule__Row__Alternatives_3 )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2365:1: ( rule__Row__Alternatives_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getAlternatives_3()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2366:1: ( rule__Row__Alternatives_3 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_INT) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2366:2: rule__Row__Alternatives_3
                    {
                    pushFollow(FOLLOW_rule__Row__Alternatives_3_in_rule__Row__Group__3__Impl4927);
                    rule__Row__Alternatives_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRowAccess().getAlternatives_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__3__Impl"


    // $ANTLR start "rule__Row__Group__4"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2376:1: rule__Row__Group__4 : rule__Row__Group__4__Impl rule__Row__Group__5 ;
    public final void rule__Row__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2380:1: ( rule__Row__Group__4__Impl rule__Row__Group__5 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2381:2: rule__Row__Group__4__Impl rule__Row__Group__5
            {
            pushFollow(FOLLOW_rule__Row__Group__4__Impl_in_rule__Row__Group__44958);
            rule__Row__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Row__Group__5_in_rule__Row__Group__44961);
            rule__Row__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__4"


    // $ANTLR start "rule__Row__Group__4__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2388:1: rule__Row__Group__4__Impl : ( ( rule__Row__UnorderedGroup_4 ) ) ;
    public final void rule__Row__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2392:1: ( ( ( rule__Row__UnorderedGroup_4 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2393:1: ( ( rule__Row__UnorderedGroup_4 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2393:1: ( ( rule__Row__UnorderedGroup_4 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2394:1: ( rule__Row__UnorderedGroup_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getUnorderedGroup_4()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2395:1: ( rule__Row__UnorderedGroup_4 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2395:2: rule__Row__UnorderedGroup_4
            {
            pushFollow(FOLLOW_rule__Row__UnorderedGroup_4_in_rule__Row__Group__4__Impl4988);
            rule__Row__UnorderedGroup_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRowAccess().getUnorderedGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__4__Impl"


    // $ANTLR start "rule__Row__Group__5"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2405:1: rule__Row__Group__5 : rule__Row__Group__5__Impl rule__Row__Group__6 ;
    public final void rule__Row__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2409:1: ( rule__Row__Group__5__Impl rule__Row__Group__6 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2410:2: rule__Row__Group__5__Impl rule__Row__Group__6
            {
            pushFollow(FOLLOW_rule__Row__Group__5__Impl_in_rule__Row__Group__55018);
            rule__Row__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Row__Group__6_in_rule__Row__Group__55021);
            rule__Row__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__5"


    // $ANTLR start "rule__Row__Group__5__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2417:1: rule__Row__Group__5__Impl : ( ( rule__Row__Group_5__0 )? ) ;
    public final void rule__Row__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2421:1: ( ( ( rule__Row__Group_5__0 )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2422:1: ( ( rule__Row__Group_5__0 )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2422:1: ( ( rule__Row__Group_5__0 )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2423:1: ( rule__Row__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getGroup_5()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2424:1: ( rule__Row__Group_5__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==54) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2424:2: rule__Row__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Row__Group_5__0_in_rule__Row__Group__5__Impl5048);
                    rule__Row__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRowAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__5__Impl"


    // $ANTLR start "rule__Row__Group__6"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2434:1: rule__Row__Group__6 : rule__Row__Group__6__Impl rule__Row__Group__7 ;
    public final void rule__Row__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2438:1: ( rule__Row__Group__6__Impl rule__Row__Group__7 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2439:2: rule__Row__Group__6__Impl rule__Row__Group__7
            {
            pushFollow(FOLLOW_rule__Row__Group__6__Impl_in_rule__Row__Group__65079);
            rule__Row__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Row__Group__7_in_rule__Row__Group__65082);
            rule__Row__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__6"


    // $ANTLR start "rule__Row__Group__6__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2446:1: rule__Row__Group__6__Impl : ( ':' ) ;
    public final void rule__Row__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2450:1: ( ( ':' ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2451:1: ( ':' )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2451:1: ( ':' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2452:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getColonKeyword_6()); 
            }
            match(input,61,FOLLOW_61_in_rule__Row__Group__6__Impl5110); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRowAccess().getColonKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__6__Impl"


    // $ANTLR start "rule__Row__Group__7"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2465:1: rule__Row__Group__7 : rule__Row__Group__7__Impl rule__Row__Group__8 ;
    public final void rule__Row__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2469:1: ( rule__Row__Group__7__Impl rule__Row__Group__8 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2470:2: rule__Row__Group__7__Impl rule__Row__Group__8
            {
            pushFollow(FOLLOW_rule__Row__Group__7__Impl_in_rule__Row__Group__75141);
            rule__Row__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Row__Group__8_in_rule__Row__Group__75144);
            rule__Row__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__7"


    // $ANTLR start "rule__Row__Group__7__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2477:1: rule__Row__Group__7__Impl : ( ( RULE_LF )? ) ;
    public final void rule__Row__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2481:1: ( ( ( RULE_LF )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2482:1: ( ( RULE_LF )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2482:1: ( ( RULE_LF )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2483:1: ( RULE_LF )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getLFTerminalRuleCall_7()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2484:1: ( RULE_LF )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_LF) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2484:3: RULE_LF
                    {
                    match(input,RULE_LF,FOLLOW_RULE_LF_in_rule__Row__Group__7__Impl5172); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRowAccess().getLFTerminalRuleCall_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__7__Impl"


    // $ANTLR start "rule__Row__Group__8"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2494:1: rule__Row__Group__8 : rule__Row__Group__8__Impl rule__Row__Group__9 ;
    public final void rule__Row__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2498:1: ( rule__Row__Group__8__Impl rule__Row__Group__9 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2499:2: rule__Row__Group__8__Impl rule__Row__Group__9
            {
            pushFollow(FOLLOW_rule__Row__Group__8__Impl_in_rule__Row__Group__85203);
            rule__Row__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Row__Group__9_in_rule__Row__Group__85206);
            rule__Row__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__8"


    // $ANTLR start "rule__Row__Group__8__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2506:1: rule__Row__Group__8__Impl : ( ( rule__Row__OperationsAssignment_8 ) ) ;
    public final void rule__Row__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2510:1: ( ( ( rule__Row__OperationsAssignment_8 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2511:1: ( ( rule__Row__OperationsAssignment_8 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2511:1: ( ( rule__Row__OperationsAssignment_8 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2512:1: ( rule__Row__OperationsAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getOperationsAssignment_8()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2513:1: ( rule__Row__OperationsAssignment_8 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2513:2: rule__Row__OperationsAssignment_8
            {
            pushFollow(FOLLOW_rule__Row__OperationsAssignment_8_in_rule__Row__Group__8__Impl5233);
            rule__Row__OperationsAssignment_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRowAccess().getOperationsAssignment_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__8__Impl"


    // $ANTLR start "rule__Row__Group__9"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2523:1: rule__Row__Group__9 : rule__Row__Group__9__Impl rule__Row__Group__10 ;
    public final void rule__Row__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2527:1: ( rule__Row__Group__9__Impl rule__Row__Group__10 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2528:2: rule__Row__Group__9__Impl rule__Row__Group__10
            {
            pushFollow(FOLLOW_rule__Row__Group__9__Impl_in_rule__Row__Group__95263);
            rule__Row__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Row__Group__10_in_rule__Row__Group__95266);
            rule__Row__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__9"


    // $ANTLR start "rule__Row__Group__9__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2535:1: rule__Row__Group__9__Impl : ( ( rule__Row__Group_9__0 )* ) ;
    public final void rule__Row__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2539:1: ( ( ( rule__Row__Group_9__0 )* ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2540:1: ( ( rule__Row__Group_9__0 )* )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2540:1: ( ( rule__Row__Group_9__0 )* )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2541:1: ( rule__Row__Group_9__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getGroup_9()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2542:1: ( rule__Row__Group_9__0 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==57) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2542:2: rule__Row__Group_9__0
            	    {
            	    pushFollow(FOLLOW_rule__Row__Group_9__0_in_rule__Row__Group__9__Impl5293);
            	    rule__Row__Group_9__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRowAccess().getGroup_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__9__Impl"


    // $ANTLR start "rule__Row__Group__10"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2552:1: rule__Row__Group__10 : rule__Row__Group__10__Impl ;
    public final void rule__Row__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2556:1: ( rule__Row__Group__10__Impl )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2557:2: rule__Row__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__Row__Group__10__Impl_in_rule__Row__Group__105324);
            rule__Row__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__10"


    // $ANTLR start "rule__Row__Group__10__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2563:1: rule__Row__Group__10__Impl : ( ( RULE_LF )? ) ;
    public final void rule__Row__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2567:1: ( ( ( RULE_LF )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2568:1: ( ( RULE_LF )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2568:1: ( ( RULE_LF )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2569:1: ( RULE_LF )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getLFTerminalRuleCall_10()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2570:1: ( RULE_LF )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_LF) ) {
                int LA53_1 = input.LA(2);

                if ( (synpred70_InternalKnittingExpressionLanguage()) ) {
                    alt53=1;
                }
            }
            switch (alt53) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2570:3: RULE_LF
                    {
                    match(input,RULE_LF,FOLLOW_RULE_LF_in_rule__Row__Group__10__Impl5352); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRowAccess().getLFTerminalRuleCall_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__10__Impl"


    // $ANTLR start "rule__Row__Group_3_1__0"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2602:1: rule__Row__Group_3_1__0 : rule__Row__Group_3_1__0__Impl rule__Row__Group_3_1__1 ;
    public final void rule__Row__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2606:1: ( rule__Row__Group_3_1__0__Impl rule__Row__Group_3_1__1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2607:2: rule__Row__Group_3_1__0__Impl rule__Row__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__Row__Group_3_1__0__Impl_in_rule__Row__Group_3_1__05405);
            rule__Row__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Row__Group_3_1__1_in_rule__Row__Group_3_1__05408);
            rule__Row__Group_3_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_3_1__0"


    // $ANTLR start "rule__Row__Group_3_1__0__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2614:1: rule__Row__Group_3_1__0__Impl : ( ( rule__Row__NumberAssignment_3_1_0 ) ) ;
    public final void rule__Row__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2618:1: ( ( ( rule__Row__NumberAssignment_3_1_0 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2619:1: ( ( rule__Row__NumberAssignment_3_1_0 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2619:1: ( ( rule__Row__NumberAssignment_3_1_0 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2620:1: ( rule__Row__NumberAssignment_3_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getNumberAssignment_3_1_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2621:1: ( rule__Row__NumberAssignment_3_1_0 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2621:2: rule__Row__NumberAssignment_3_1_0
            {
            pushFollow(FOLLOW_rule__Row__NumberAssignment_3_1_0_in_rule__Row__Group_3_1__0__Impl5435);
            rule__Row__NumberAssignment_3_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRowAccess().getNumberAssignment_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_3_1__0__Impl"


    // $ANTLR start "rule__Row__Group_3_1__1"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2631:1: rule__Row__Group_3_1__1 : rule__Row__Group_3_1__1__Impl rule__Row__Group_3_1__2 ;
    public final void rule__Row__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2635:1: ( rule__Row__Group_3_1__1__Impl rule__Row__Group_3_1__2 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2636:2: rule__Row__Group_3_1__1__Impl rule__Row__Group_3_1__2
            {
            pushFollow(FOLLOW_rule__Row__Group_3_1__1__Impl_in_rule__Row__Group_3_1__15465);
            rule__Row__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Row__Group_3_1__2_in_rule__Row__Group_3_1__15468);
            rule__Row__Group_3_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_3_1__1"


    // $ANTLR start "rule__Row__Group_3_1__1__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2643:1: rule__Row__Group_3_1__1__Impl : ( ( rule__Row__Group_3_1_1__0 )* ) ;
    public final void rule__Row__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2647:1: ( ( ( rule__Row__Group_3_1_1__0 )* ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2648:1: ( ( rule__Row__Group_3_1_1__0 )* )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2648:1: ( ( rule__Row__Group_3_1_1__0 )* )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2649:1: ( rule__Row__Group_3_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getGroup_3_1_1()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2650:1: ( rule__Row__Group_3_1_1__0 )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==57) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2650:2: rule__Row__Group_3_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Row__Group_3_1_1__0_in_rule__Row__Group_3_1__1__Impl5495);
            	    rule__Row__Group_3_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRowAccess().getGroup_3_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_3_1__1__Impl"


    // $ANTLR start "rule__Row__Group_3_1__2"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2660:1: rule__Row__Group_3_1__2 : rule__Row__Group_3_1__2__Impl ;
    public final void rule__Row__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2664:1: ( rule__Row__Group_3_1__2__Impl )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2665:2: rule__Row__Group_3_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Row__Group_3_1__2__Impl_in_rule__Row__Group_3_1__25526);
            rule__Row__Group_3_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_3_1__2"


    // $ANTLR start "rule__Row__Group_3_1__2__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2671:1: rule__Row__Group_3_1__2__Impl : ( ( rule__Row__Group_3_1_2__0 )? ) ;
    public final void rule__Row__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2675:1: ( ( ( rule__Row__Group_3_1_2__0 )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2676:1: ( ( rule__Row__Group_3_1_2__0 )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2676:1: ( ( rule__Row__Group_3_1_2__0 )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2677:1: ( rule__Row__Group_3_1_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getGroup_3_1_2()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2678:1: ( rule__Row__Group_3_1_2__0 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==62) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2678:2: rule__Row__Group_3_1_2__0
                    {
                    pushFollow(FOLLOW_rule__Row__Group_3_1_2__0_in_rule__Row__Group_3_1__2__Impl5553);
                    rule__Row__Group_3_1_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRowAccess().getGroup_3_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_3_1__2__Impl"


    // $ANTLR start "rule__Row__Group_3_1_1__0"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2694:1: rule__Row__Group_3_1_1__0 : rule__Row__Group_3_1_1__0__Impl rule__Row__Group_3_1_1__1 ;
    public final void rule__Row__Group_3_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2698:1: ( rule__Row__Group_3_1_1__0__Impl rule__Row__Group_3_1_1__1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2699:2: rule__Row__Group_3_1_1__0__Impl rule__Row__Group_3_1_1__1
            {
            pushFollow(FOLLOW_rule__Row__Group_3_1_1__0__Impl_in_rule__Row__Group_3_1_1__05590);
            rule__Row__Group_3_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Row__Group_3_1_1__1_in_rule__Row__Group_3_1_1__05593);
            rule__Row__Group_3_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_3_1_1__0"


    // $ANTLR start "rule__Row__Group_3_1_1__0__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2706:1: rule__Row__Group_3_1_1__0__Impl : ( ',' ) ;
    public final void rule__Row__Group_3_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2710:1: ( ( ',' ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2711:1: ( ',' )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2711:1: ( ',' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2712:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getCommaKeyword_3_1_1_0()); 
            }
            match(input,57,FOLLOW_57_in_rule__Row__Group_3_1_1__0__Impl5621); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRowAccess().getCommaKeyword_3_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_3_1_1__0__Impl"


    // $ANTLR start "rule__Row__Group_3_1_1__1"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2725:1: rule__Row__Group_3_1_1__1 : rule__Row__Group_3_1_1__1__Impl ;
    public final void rule__Row__Group_3_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2729:1: ( rule__Row__Group_3_1_1__1__Impl )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2730:2: rule__Row__Group_3_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Row__Group_3_1_1__1__Impl_in_rule__Row__Group_3_1_1__15652);
            rule__Row__Group_3_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_3_1_1__1"


    // $ANTLR start "rule__Row__Group_3_1_1__1__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2736:1: rule__Row__Group_3_1_1__1__Impl : ( ( rule__Row__NumberAssignment_3_1_1_1 ) ) ;
    public final void rule__Row__Group_3_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2740:1: ( ( ( rule__Row__NumberAssignment_3_1_1_1 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2741:1: ( ( rule__Row__NumberAssignment_3_1_1_1 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2741:1: ( ( rule__Row__NumberAssignment_3_1_1_1 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2742:1: ( rule__Row__NumberAssignment_3_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getNumberAssignment_3_1_1_1()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2743:1: ( rule__Row__NumberAssignment_3_1_1_1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2743:2: rule__Row__NumberAssignment_3_1_1_1
            {
            pushFollow(FOLLOW_rule__Row__NumberAssignment_3_1_1_1_in_rule__Row__Group_3_1_1__1__Impl5679);
            rule__Row__NumberAssignment_3_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRowAccess().getNumberAssignment_3_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_3_1_1__1__Impl"


    // $ANTLR start "rule__Row__Group_3_1_2__0"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2757:1: rule__Row__Group_3_1_2__0 : rule__Row__Group_3_1_2__0__Impl rule__Row__Group_3_1_2__1 ;
    public final void rule__Row__Group_3_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2761:1: ( rule__Row__Group_3_1_2__0__Impl rule__Row__Group_3_1_2__1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2762:2: rule__Row__Group_3_1_2__0__Impl rule__Row__Group_3_1_2__1
            {
            pushFollow(FOLLOW_rule__Row__Group_3_1_2__0__Impl_in_rule__Row__Group_3_1_2__05713);
            rule__Row__Group_3_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Row__Group_3_1_2__1_in_rule__Row__Group_3_1_2__05716);
            rule__Row__Group_3_1_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_3_1_2__0"


    // $ANTLR start "rule__Row__Group_3_1_2__0__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2769:1: rule__Row__Group_3_1_2__0__Impl : ( 'and' ) ;
    public final void rule__Row__Group_3_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2773:1: ( ( 'and' ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2774:1: ( 'and' )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2774:1: ( 'and' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2775:1: 'and'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getAndKeyword_3_1_2_0()); 
            }
            match(input,62,FOLLOW_62_in_rule__Row__Group_3_1_2__0__Impl5744); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRowAccess().getAndKeyword_3_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_3_1_2__0__Impl"


    // $ANTLR start "rule__Row__Group_3_1_2__1"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2788:1: rule__Row__Group_3_1_2__1 : rule__Row__Group_3_1_2__1__Impl rule__Row__Group_3_1_2__2 ;
    public final void rule__Row__Group_3_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2792:1: ( rule__Row__Group_3_1_2__1__Impl rule__Row__Group_3_1_2__2 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2793:2: rule__Row__Group_3_1_2__1__Impl rule__Row__Group_3_1_2__2
            {
            pushFollow(FOLLOW_rule__Row__Group_3_1_2__1__Impl_in_rule__Row__Group_3_1_2__15775);
            rule__Row__Group_3_1_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Row__Group_3_1_2__2_in_rule__Row__Group_3_1_2__15778);
            rule__Row__Group_3_1_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_3_1_2__1"


    // $ANTLR start "rule__Row__Group_3_1_2__1__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2800:1: rule__Row__Group_3_1_2__1__Impl : ( ( 'all' )? ) ;
    public final void rule__Row__Group_3_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2804:1: ( ( ( 'all' )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2805:1: ( ( 'all' )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2805:1: ( ( 'all' )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2806:1: ( 'all' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getAllKeyword_3_1_2_1()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2807:1: ( 'all' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==63) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2808:2: 'all'
                    {
                    match(input,63,FOLLOW_63_in_rule__Row__Group_3_1_2__1__Impl5807); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRowAccess().getAllKeyword_3_1_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_3_1_2__1__Impl"


    // $ANTLR start "rule__Row__Group_3_1_2__2"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2819:1: rule__Row__Group_3_1_2__2 : rule__Row__Group_3_1_2__2__Impl rule__Row__Group_3_1_2__3 ;
    public final void rule__Row__Group_3_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2823:1: ( rule__Row__Group_3_1_2__2__Impl rule__Row__Group_3_1_2__3 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2824:2: rule__Row__Group_3_1_2__2__Impl rule__Row__Group_3_1_2__3
            {
            pushFollow(FOLLOW_rule__Row__Group_3_1_2__2__Impl_in_rule__Row__Group_3_1_2__25840);
            rule__Row__Group_3_1_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Row__Group_3_1_2__3_in_rule__Row__Group_3_1_2__25843);
            rule__Row__Group_3_1_2__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_3_1_2__2"


    // $ANTLR start "rule__Row__Group_3_1_2__2__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2831:1: rule__Row__Group_3_1_2__2__Impl : ( ( rule__Row__SubsequentAssignment_3_1_2_2 ) ) ;
    public final void rule__Row__Group_3_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2835:1: ( ( ( rule__Row__SubsequentAssignment_3_1_2_2 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2836:1: ( ( rule__Row__SubsequentAssignment_3_1_2_2 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2836:1: ( ( rule__Row__SubsequentAssignment_3_1_2_2 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2837:1: ( rule__Row__SubsequentAssignment_3_1_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getSubsequentAssignment_3_1_2_2()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2838:1: ( rule__Row__SubsequentAssignment_3_1_2_2 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2838:2: rule__Row__SubsequentAssignment_3_1_2_2
            {
            pushFollow(FOLLOW_rule__Row__SubsequentAssignment_3_1_2_2_in_rule__Row__Group_3_1_2__2__Impl5870);
            rule__Row__SubsequentAssignment_3_1_2_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRowAccess().getSubsequentAssignment_3_1_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_3_1_2__2__Impl"


    // $ANTLR start "rule__Row__Group_3_1_2__3"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2848:1: rule__Row__Group_3_1_2__3 : rule__Row__Group_3_1_2__3__Impl ;
    public final void rule__Row__Group_3_1_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2852:1: ( rule__Row__Group_3_1_2__3__Impl )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2853:2: rule__Row__Group_3_1_2__3__Impl
            {
            pushFollow(FOLLOW_rule__Row__Group_3_1_2__3__Impl_in_rule__Row__Group_3_1_2__35900);
            rule__Row__Group_3_1_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_3_1_2__3"


    // $ANTLR start "rule__Row__Group_3_1_2__3__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2859:1: rule__Row__Group_3_1_2__3__Impl : ( ( rule__Row__Alternatives_3_1_2_3 )? ) ;
    public final void rule__Row__Group_3_1_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2863:1: ( ( ( rule__Row__Alternatives_3_1_2_3 )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2864:1: ( ( rule__Row__Alternatives_3_1_2_3 )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2864:1: ( ( rule__Row__Alternatives_3_1_2_3 )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2865:1: ( rule__Row__Alternatives_3_1_2_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getAlternatives_3_1_2_3()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2866:1: ( rule__Row__Alternatives_3_1_2_3 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( ((LA57_0>=14 && LA57_0<=15)) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2866:2: rule__Row__Alternatives_3_1_2_3
                    {
                    pushFollow(FOLLOW_rule__Row__Alternatives_3_1_2_3_in_rule__Row__Group_3_1_2__3__Impl5927);
                    rule__Row__Alternatives_3_1_2_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRowAccess().getAlternatives_3_1_2_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_3_1_2__3__Impl"


    // $ANTLR start "rule__Row__Group_4_1__0"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2884:1: rule__Row__Group_4_1__0 : rule__Row__Group_4_1__0__Impl rule__Row__Group_4_1__1 ;
    public final void rule__Row__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2888:1: ( rule__Row__Group_4_1__0__Impl rule__Row__Group_4_1__1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2889:2: rule__Row__Group_4_1__0__Impl rule__Row__Group_4_1__1
            {
            pushFollow(FOLLOW_rule__Row__Group_4_1__0__Impl_in_rule__Row__Group_4_1__05966);
            rule__Row__Group_4_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Row__Group_4_1__1_in_rule__Row__Group_4_1__05969);
            rule__Row__Group_4_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_4_1__0"


    // $ANTLR start "rule__Row__Group_4_1__0__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2896:1: rule__Row__Group_4_1__0__Impl : ( 'with' ) ;
    public final void rule__Row__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2900:1: ( ( 'with' ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2901:1: ( 'with' )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2901:1: ( 'with' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2902:1: 'with'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getWithKeyword_4_1_0()); 
            }
            match(input,56,FOLLOW_56_in_rule__Row__Group_4_1__0__Impl5997); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRowAccess().getWithKeyword_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_4_1__0__Impl"


    // $ANTLR start "rule__Row__Group_4_1__1"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2915:1: rule__Row__Group_4_1__1 : rule__Row__Group_4_1__1__Impl ;
    public final void rule__Row__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2919:1: ( rule__Row__Group_4_1__1__Impl )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2920:2: rule__Row__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Row__Group_4_1__1__Impl_in_rule__Row__Group_4_1__16028);
            rule__Row__Group_4_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_4_1__1"


    // $ANTLR start "rule__Row__Group_4_1__1__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2926:1: rule__Row__Group_4_1__1__Impl : ( ( rule__Row__YarnRefAssignment_4_1_1 ) ) ;
    public final void rule__Row__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2930:1: ( ( ( rule__Row__YarnRefAssignment_4_1_1 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2931:1: ( ( rule__Row__YarnRefAssignment_4_1_1 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2931:1: ( ( rule__Row__YarnRefAssignment_4_1_1 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2932:1: ( rule__Row__YarnRefAssignment_4_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getYarnRefAssignment_4_1_1()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2933:1: ( rule__Row__YarnRefAssignment_4_1_1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2933:2: rule__Row__YarnRefAssignment_4_1_1
            {
            pushFollow(FOLLOW_rule__Row__YarnRefAssignment_4_1_1_in_rule__Row__Group_4_1__1__Impl6055);
            rule__Row__YarnRefAssignment_4_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRowAccess().getYarnRefAssignment_4_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_4_1__1__Impl"


    // $ANTLR start "rule__Row__Group_5__0"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2947:1: rule__Row__Group_5__0 : rule__Row__Group_5__0__Impl rule__Row__Group_5__1 ;
    public final void rule__Row__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2951:1: ( rule__Row__Group_5__0__Impl rule__Row__Group_5__1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2952:2: rule__Row__Group_5__0__Impl rule__Row__Group_5__1
            {
            pushFollow(FOLLOW_rule__Row__Group_5__0__Impl_in_rule__Row__Group_5__06089);
            rule__Row__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Row__Group_5__1_in_rule__Row__Group_5__06092);
            rule__Row__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_5__0"


    // $ANTLR start "rule__Row__Group_5__0__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2959:1: rule__Row__Group_5__0__Impl : ( '(' ) ;
    public final void rule__Row__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2963:1: ( ( '(' ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2964:1: ( '(' )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2964:1: ( '(' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2965:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getLeftParenthesisKeyword_5_0()); 
            }
            match(input,54,FOLLOW_54_in_rule__Row__Group_5__0__Impl6120); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRowAccess().getLeftParenthesisKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_5__0__Impl"


    // $ANTLR start "rule__Row__Group_5__1"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2978:1: rule__Row__Group_5__1 : rule__Row__Group_5__1__Impl rule__Row__Group_5__2 ;
    public final void rule__Row__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2982:1: ( rule__Row__Group_5__1__Impl rule__Row__Group_5__2 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2983:2: rule__Row__Group_5__1__Impl rule__Row__Group_5__2
            {
            pushFollow(FOLLOW_rule__Row__Group_5__1__Impl_in_rule__Row__Group_5__16151);
            rule__Row__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Row__Group_5__2_in_rule__Row__Group_5__16154);
            rule__Row__Group_5__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_5__1"


    // $ANTLR start "rule__Row__Group_5__1__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2990:1: rule__Row__Group_5__1__Impl : ( ( rule__Row__Group_5_1__0 )? ) ;
    public final void rule__Row__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2994:1: ( ( ( rule__Row__Group_5_1__0 )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2995:1: ( ( rule__Row__Group_5_1__0 )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2995:1: ( ( rule__Row__Group_5_1__0 )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2996:1: ( rule__Row__Group_5_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getGroup_5_1()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2997:1: ( rule__Row__Group_5_1__0 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==57) ) {
                int LA58_1 = input.LA(2);

                if ( (LA58_1==74) ) {
                    alt58=1;
                }
            }
            else if ( (LA58_0==74) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2997:2: rule__Row__Group_5_1__0
                    {
                    pushFollow(FOLLOW_rule__Row__Group_5_1__0_in_rule__Row__Group_5__1__Impl6181);
                    rule__Row__Group_5_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRowAccess().getGroup_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_5__1__Impl"


    // $ANTLR start "rule__Row__Group_5__2"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3007:1: rule__Row__Group_5__2 : rule__Row__Group_5__2__Impl rule__Row__Group_5__3 ;
    public final void rule__Row__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3011:1: ( rule__Row__Group_5__2__Impl rule__Row__Group_5__3 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3012:2: rule__Row__Group_5__2__Impl rule__Row__Group_5__3
            {
            pushFollow(FOLLOW_rule__Row__Group_5__2__Impl_in_rule__Row__Group_5__26212);
            rule__Row__Group_5__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Row__Group_5__3_in_rule__Row__Group_5__26215);
            rule__Row__Group_5__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_5__2"


    // $ANTLR start "rule__Row__Group_5__2__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3019:1: rule__Row__Group_5__2__Impl : ( ( rule__Row__Group_5_2__0 )? ) ;
    public final void rule__Row__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3023:1: ( ( ( rule__Row__Group_5_2__0 )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3024:1: ( ( rule__Row__Group_5_2__0 )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3024:1: ( ( rule__Row__Group_5_2__0 )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3025:1: ( rule__Row__Group_5_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getGroup_5_2()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3026:1: ( rule__Row__Group_5_2__0 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==57||LA59_0==75) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3026:2: rule__Row__Group_5_2__0
                    {
                    pushFollow(FOLLOW_rule__Row__Group_5_2__0_in_rule__Row__Group_5__2__Impl6242);
                    rule__Row__Group_5_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRowAccess().getGroup_5_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_5__2__Impl"


    // $ANTLR start "rule__Row__Group_5__3"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3036:1: rule__Row__Group_5__3 : rule__Row__Group_5__3__Impl ;
    public final void rule__Row__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3040:1: ( rule__Row__Group_5__3__Impl )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3041:2: rule__Row__Group_5__3__Impl
            {
            pushFollow(FOLLOW_rule__Row__Group_5__3__Impl_in_rule__Row__Group_5__36273);
            rule__Row__Group_5__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_5__3"


    // $ANTLR start "rule__Row__Group_5__3__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3047:1: rule__Row__Group_5__3__Impl : ( ')' ) ;
    public final void rule__Row__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3051:1: ( ( ')' ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3052:1: ( ')' )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3052:1: ( ')' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3053:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getRightParenthesisKeyword_5_3()); 
            }
            match(input,55,FOLLOW_55_in_rule__Row__Group_5__3__Impl6301); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRowAccess().getRightParenthesisKeyword_5_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_5__3__Impl"


    // $ANTLR start "rule__Row__Group_5_1__0"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3074:1: rule__Row__Group_5_1__0 : rule__Row__Group_5_1__0__Impl rule__Row__Group_5_1__1 ;
    public final void rule__Row__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3078:1: ( rule__Row__Group_5_1__0__Impl rule__Row__Group_5_1__1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3079:2: rule__Row__Group_5_1__0__Impl rule__Row__Group_5_1__1
            {
            pushFollow(FOLLOW_rule__Row__Group_5_1__0__Impl_in_rule__Row__Group_5_1__06340);
            rule__Row__Group_5_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Row__Group_5_1__1_in_rule__Row__Group_5_1__06343);
            rule__Row__Group_5_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_5_1__0"


    // $ANTLR start "rule__Row__Group_5_1__0__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3086:1: rule__Row__Group_5_1__0__Impl : ( ( ',' )? ) ;
    public final void rule__Row__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3090:1: ( ( ( ',' )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3091:1: ( ( ',' )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3091:1: ( ( ',' )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3092:1: ( ',' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getCommaKeyword_5_1_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3093:1: ( ',' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==57) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3094:2: ','
                    {
                    match(input,57,FOLLOW_57_in_rule__Row__Group_5_1__0__Impl6372); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRowAccess().getCommaKeyword_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_5_1__0__Impl"


    // $ANTLR start "rule__Row__Group_5_1__1"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3105:1: rule__Row__Group_5_1__1 : rule__Row__Group_5_1__1__Impl rule__Row__Group_5_1__2 ;
    public final void rule__Row__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3109:1: ( rule__Row__Group_5_1__1__Impl rule__Row__Group_5_1__2 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3110:2: rule__Row__Group_5_1__1__Impl rule__Row__Group_5_1__2
            {
            pushFollow(FOLLOW_rule__Row__Group_5_1__1__Impl_in_rule__Row__Group_5_1__16405);
            rule__Row__Group_5_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Row__Group_5_1__2_in_rule__Row__Group_5_1__16408);
            rule__Row__Group_5_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_5_1__1"


    // $ANTLR start "rule__Row__Group_5_1__1__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3117:1: rule__Row__Group_5_1__1__Impl : ( ( rule__Row__InformAssignment_5_1_1 ) ) ;
    public final void rule__Row__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3121:1: ( ( ( rule__Row__InformAssignment_5_1_1 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3122:1: ( ( rule__Row__InformAssignment_5_1_1 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3122:1: ( ( rule__Row__InformAssignment_5_1_1 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3123:1: ( rule__Row__InformAssignment_5_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getInformAssignment_5_1_1()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3124:1: ( rule__Row__InformAssignment_5_1_1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3124:2: rule__Row__InformAssignment_5_1_1
            {
            pushFollow(FOLLOW_rule__Row__InformAssignment_5_1_1_in_rule__Row__Group_5_1__1__Impl6435);
            rule__Row__InformAssignment_5_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRowAccess().getInformAssignment_5_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_5_1__1__Impl"


    // $ANTLR start "rule__Row__Group_5_1__2"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3134:1: rule__Row__Group_5_1__2 : rule__Row__Group_5_1__2__Impl ;
    public final void rule__Row__Group_5_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3138:1: ( rule__Row__Group_5_1__2__Impl )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3139:2: rule__Row__Group_5_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Row__Group_5_1__2__Impl_in_rule__Row__Group_5_1__26465);
            rule__Row__Group_5_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_5_1__2"


    // $ANTLR start "rule__Row__Group_5_1__2__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3145:1: rule__Row__Group_5_1__2__Impl : ( ( 'side' )? ) ;
    public final void rule__Row__Group_5_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3149:1: ( ( ( 'side' )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3150:1: ( ( 'side' )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3150:1: ( ( 'side' )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3151:1: ( 'side' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getSideKeyword_5_1_2()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3152:1: ( 'side' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==64) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3153:2: 'side'
                    {
                    match(input,64,FOLLOW_64_in_rule__Row__Group_5_1__2__Impl6494); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRowAccess().getSideKeyword_5_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_5_1__2__Impl"


    // $ANTLR start "rule__Row__Group_5_2__0"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3170:1: rule__Row__Group_5_2__0 : rule__Row__Group_5_2__0__Impl rule__Row__Group_5_2__1 ;
    public final void rule__Row__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3174:1: ( rule__Row__Group_5_2__0__Impl rule__Row__Group_5_2__1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3175:2: rule__Row__Group_5_2__0__Impl rule__Row__Group_5_2__1
            {
            pushFollow(FOLLOW_rule__Row__Group_5_2__0__Impl_in_rule__Row__Group_5_2__06533);
            rule__Row__Group_5_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Row__Group_5_2__1_in_rule__Row__Group_5_2__06536);
            rule__Row__Group_5_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_5_2__0"


    // $ANTLR start "rule__Row__Group_5_2__0__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3182:1: rule__Row__Group_5_2__0__Impl : ( ( ',' )? ) ;
    public final void rule__Row__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3186:1: ( ( ( ',' )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3187:1: ( ( ',' )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3187:1: ( ( ',' )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3188:1: ( ',' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getCommaKeyword_5_2_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3189:1: ( ',' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==57) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3190:2: ','
                    {
                    match(input,57,FOLLOW_57_in_rule__Row__Group_5_2__0__Impl6565); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRowAccess().getCommaKeyword_5_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_5_2__0__Impl"


    // $ANTLR start "rule__Row__Group_5_2__1"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3201:1: rule__Row__Group_5_2__1 : rule__Row__Group_5_2__1__Impl rule__Row__Group_5_2__2 ;
    public final void rule__Row__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3205:1: ( rule__Row__Group_5_2__1__Impl rule__Row__Group_5_2__2 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3206:2: rule__Row__Group_5_2__1__Impl rule__Row__Group_5_2__2
            {
            pushFollow(FOLLOW_rule__Row__Group_5_2__1__Impl_in_rule__Row__Group_5_2__16598);
            rule__Row__Group_5_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Row__Group_5_2__2_in_rule__Row__Group_5_2__16601);
            rule__Row__Group_5_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_5_2__1"


    // $ANTLR start "rule__Row__Group_5_2__1__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3213:1: rule__Row__Group_5_2__1__Impl : ( ( rule__Row__ResetAssignment_5_2_1 ) ) ;
    public final void rule__Row__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3217:1: ( ( ( rule__Row__ResetAssignment_5_2_1 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3218:1: ( ( rule__Row__ResetAssignment_5_2_1 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3218:1: ( ( rule__Row__ResetAssignment_5_2_1 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3219:1: ( rule__Row__ResetAssignment_5_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getResetAssignment_5_2_1()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3220:1: ( rule__Row__ResetAssignment_5_2_1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3220:2: rule__Row__ResetAssignment_5_2_1
            {
            pushFollow(FOLLOW_rule__Row__ResetAssignment_5_2_1_in_rule__Row__Group_5_2__1__Impl6628);
            rule__Row__ResetAssignment_5_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRowAccess().getResetAssignment_5_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_5_2__1__Impl"


    // $ANTLR start "rule__Row__Group_5_2__2"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3230:1: rule__Row__Group_5_2__2 : rule__Row__Group_5_2__2__Impl ;
    public final void rule__Row__Group_5_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3234:1: ( rule__Row__Group_5_2__2__Impl )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3235:2: rule__Row__Group_5_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Row__Group_5_2__2__Impl_in_rule__Row__Group_5_2__26658);
            rule__Row__Group_5_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_5_2__2"


    // $ANTLR start "rule__Row__Group_5_2__2__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3241:1: rule__Row__Group_5_2__2__Impl : ( ( 'count' )? ) ;
    public final void rule__Row__Group_5_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3245:1: ( ( ( 'count' )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3246:1: ( ( 'count' )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3246:1: ( ( 'count' )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3247:1: ( 'count' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getCountKeyword_5_2_2()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3248:1: ( 'count' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==65) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3249:2: 'count'
                    {
                    match(input,65,FOLLOW_65_in_rule__Row__Group_5_2__2__Impl6687); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRowAccess().getCountKeyword_5_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_5_2__2__Impl"


    // $ANTLR start "rule__Row__Group_9__0"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3266:1: rule__Row__Group_9__0 : rule__Row__Group_9__0__Impl rule__Row__Group_9__1 ;
    public final void rule__Row__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3270:1: ( rule__Row__Group_9__0__Impl rule__Row__Group_9__1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3271:2: rule__Row__Group_9__0__Impl rule__Row__Group_9__1
            {
            pushFollow(FOLLOW_rule__Row__Group_9__0__Impl_in_rule__Row__Group_9__06726);
            rule__Row__Group_9__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Row__Group_9__1_in_rule__Row__Group_9__06729);
            rule__Row__Group_9__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_9__0"


    // $ANTLR start "rule__Row__Group_9__0__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3278:1: rule__Row__Group_9__0__Impl : ( ',' ) ;
    public final void rule__Row__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3282:1: ( ( ',' ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3283:1: ( ',' )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3283:1: ( ',' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3284:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getCommaKeyword_9_0()); 
            }
            match(input,57,FOLLOW_57_in_rule__Row__Group_9__0__Impl6757); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRowAccess().getCommaKeyword_9_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_9__0__Impl"


    // $ANTLR start "rule__Row__Group_9__1"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3297:1: rule__Row__Group_9__1 : rule__Row__Group_9__1__Impl ;
    public final void rule__Row__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3301:1: ( rule__Row__Group_9__1__Impl )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3302:2: rule__Row__Group_9__1__Impl
            {
            pushFollow(FOLLOW_rule__Row__Group_9__1__Impl_in_rule__Row__Group_9__16788);
            rule__Row__Group_9__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_9__1"


    // $ANTLR start "rule__Row__Group_9__1__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3308:1: rule__Row__Group_9__1__Impl : ( ( rule__Row__OperationsAssignment_9_1 ) ) ;
    public final void rule__Row__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3312:1: ( ( ( rule__Row__OperationsAssignment_9_1 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3313:1: ( ( rule__Row__OperationsAssignment_9_1 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3313:1: ( ( rule__Row__OperationsAssignment_9_1 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3314:1: ( rule__Row__OperationsAssignment_9_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getOperationsAssignment_9_1()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3315:1: ( rule__Row__OperationsAssignment_9_1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3315:2: rule__Row__OperationsAssignment_9_1
            {
            pushFollow(FOLLOW_rule__Row__OperationsAssignment_9_1_in_rule__Row__Group_9__1__Impl6815);
            rule__Row__OperationsAssignment_9_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRowAccess().getOperationsAssignment_9_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_9__1__Impl"


    // $ANTLR start "rule__Message__Group__0"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3329:1: rule__Message__Group__0 : rule__Message__Group__0__Impl rule__Message__Group__1 ;
    public final void rule__Message__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3333:1: ( rule__Message__Group__0__Impl rule__Message__Group__1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3334:2: rule__Message__Group__0__Impl rule__Message__Group__1
            {
            pushFollow(FOLLOW_rule__Message__Group__0__Impl_in_rule__Message__Group__06849);
            rule__Message__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Message__Group__1_in_rule__Message__Group__06852);
            rule__Message__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__0"


    // $ANTLR start "rule__Message__Group__0__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3341:1: rule__Message__Group__0__Impl : ( ( rule__Message__MessageAssignment_0 ) ) ;
    public final void rule__Message__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3345:1: ( ( ( rule__Message__MessageAssignment_0 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3346:1: ( ( rule__Message__MessageAssignment_0 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3346:1: ( ( rule__Message__MessageAssignment_0 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3347:1: ( rule__Message__MessageAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getMessageAssignment_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3348:1: ( rule__Message__MessageAssignment_0 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3348:2: rule__Message__MessageAssignment_0
            {
            pushFollow(FOLLOW_rule__Message__MessageAssignment_0_in_rule__Message__Group__0__Impl6879);
            rule__Message__MessageAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageAccess().getMessageAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__0__Impl"


    // $ANTLR start "rule__Message__Group__1"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3358:1: rule__Message__Group__1 : rule__Message__Group__1__Impl ;
    public final void rule__Message__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3362:1: ( rule__Message__Group__1__Impl )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3363:2: rule__Message__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Message__Group__1__Impl_in_rule__Message__Group__16909);
            rule__Message__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__1"


    // $ANTLR start "rule__Message__Group__1__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3369:1: rule__Message__Group__1__Impl : ( RULE_LF ) ;
    public final void rule__Message__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3373:1: ( ( RULE_LF ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3374:1: ( RULE_LF )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3374:1: ( RULE_LF )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3375:1: RULE_LF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getLFTerminalRuleCall_1()); 
            }
            match(input,RULE_LF,FOLLOW_RULE_LF_in_rule__Message__Group__1__Impl6936); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageAccess().getLFTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__1__Impl"


    // $ANTLR start "rule__Knit__Group__0"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3390:1: rule__Knit__Group__0 : rule__Knit__Group__0__Impl rule__Knit__Group__1 ;
    public final void rule__Knit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3394:1: ( rule__Knit__Group__0__Impl rule__Knit__Group__1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3395:2: rule__Knit__Group__0__Impl rule__Knit__Group__1
            {
            pushFollow(FOLLOW_rule__Knit__Group__0__Impl_in_rule__Knit__Group__06969);
            rule__Knit__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Knit__Group__1_in_rule__Knit__Group__06972);
            rule__Knit__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knit__Group__0"


    // $ANTLR start "rule__Knit__Group__0__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3402:1: rule__Knit__Group__0__Impl : ( ( rule__Knit__Alternatives_0 ) ) ;
    public final void rule__Knit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3406:1: ( ( ( rule__Knit__Alternatives_0 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3407:1: ( ( rule__Knit__Alternatives_0 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3407:1: ( ( rule__Knit__Alternatives_0 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3408:1: ( rule__Knit__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKnitAccess().getAlternatives_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3409:1: ( rule__Knit__Alternatives_0 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3409:2: rule__Knit__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Knit__Alternatives_0_in_rule__Knit__Group__0__Impl6999);
            rule__Knit__Alternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKnitAccess().getAlternatives_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knit__Group__0__Impl"


    // $ANTLR start "rule__Knit__Group__1"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3419:1: rule__Knit__Group__1 : rule__Knit__Group__1__Impl rule__Knit__Group__2 ;
    public final void rule__Knit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3423:1: ( rule__Knit__Group__1__Impl rule__Knit__Group__2 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3424:2: rule__Knit__Group__1__Impl rule__Knit__Group__2
            {
            pushFollow(FOLLOW_rule__Knit__Group__1__Impl_in_rule__Knit__Group__17029);
            rule__Knit__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Knit__Group__2_in_rule__Knit__Group__17032);
            rule__Knit__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knit__Group__1"


    // $ANTLR start "rule__Knit__Group__1__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3431:1: rule__Knit__Group__1__Impl : ( () ) ;
    public final void rule__Knit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3435:1: ( ( () ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3436:1: ( () )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3436:1: ( () )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3437:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKnitAccess().getKnitAction_1()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3438:1: ()
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3440:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKnitAccess().getKnitAction_1()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knit__Group__1__Impl"


    // $ANTLR start "rule__Knit__Group__2"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3450:1: rule__Knit__Group__2 : rule__Knit__Group__2__Impl rule__Knit__Group__3 ;
    public final void rule__Knit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3454:1: ( rule__Knit__Group__2__Impl rule__Knit__Group__3 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3455:2: rule__Knit__Group__2__Impl rule__Knit__Group__3
            {
            pushFollow(FOLLOW_rule__Knit__Group__2__Impl_in_rule__Knit__Group__27090);
            rule__Knit__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Knit__Group__3_in_rule__Knit__Group__27093);
            rule__Knit__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knit__Group__2"


    // $ANTLR start "rule__Knit__Group__2__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3462:1: rule__Knit__Group__2__Impl : ( ( rule__Knit__NumberAssignment_2 )? ) ;
    public final void rule__Knit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3466:1: ( ( ( rule__Knit__NumberAssignment_2 )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3467:1: ( ( rule__Knit__NumberAssignment_2 )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3467:1: ( ( rule__Knit__NumberAssignment_2 )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3468:1: ( rule__Knit__NumberAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKnitAccess().getNumberAssignment_2()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3469:1: ( rule__Knit__NumberAssignment_2 )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==RULE_INT) ) {
                switch ( input.LA(2) ) {
                    case 28:
                        {
                        int LA64_3 = input.LA(3);

                        if ( (LA64_3==EOF||LA64_3==RULE_LF||(LA64_3>=RULE_STRING && LA64_3<=RULE_INT)||(LA64_3>=16 && LA64_3<=19)||(LA64_3>=30 && LA64_3<=31)||LA64_3==53||(LA64_3>=56 && LA64_3<=57)||LA64_3==60||LA64_3==66||LA64_3==68||(LA64_3>=71 && LA64_3<=73)||(LA64_3>=76 && LA64_3<=78)) ) {
                            alt64=1;
                        }
                        }
                        break;
                    case 29:
                        {
                        int LA64_4 = input.LA(3);

                        if ( (LA64_4==EOF||LA64_4==RULE_LF||(LA64_4>=RULE_STRING && LA64_4<=RULE_INT)||(LA64_4>=16 && LA64_4<=19)||(LA64_4>=30 && LA64_4<=31)||LA64_4==53||(LA64_4>=56 && LA64_4<=57)||LA64_4==60||LA64_4==66||LA64_4==68||(LA64_4>=71 && LA64_4<=73)||(LA64_4>=76 && LA64_4<=78)) ) {
                            alt64=1;
                        }
                        }
                        break;
                    case EOF:
                    case RULE_LF:
                    case RULE_STRING:
                    case RULE_INT:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 30:
                    case 31:
                    case 53:
                    case 56:
                    case 57:
                    case 60:
                    case 66:
                    case 68:
                    case 71:
                    case 72:
                    case 73:
                    case 76:
                    case 77:
                    case 78:
                        {
                        alt64=1;
                        }
                        break;
                }

            }
            switch (alt64) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3469:2: rule__Knit__NumberAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Knit__NumberAssignment_2_in_rule__Knit__Group__2__Impl7120);
                    rule__Knit__NumberAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKnitAccess().getNumberAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knit__Group__2__Impl"


    // $ANTLR start "rule__Knit__Group__3"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3479:1: rule__Knit__Group__3 : rule__Knit__Group__3__Impl rule__Knit__Group__4 ;
    public final void rule__Knit__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3483:1: ( rule__Knit__Group__3__Impl rule__Knit__Group__4 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3484:2: rule__Knit__Group__3__Impl rule__Knit__Group__4
            {
            pushFollow(FOLLOW_rule__Knit__Group__3__Impl_in_rule__Knit__Group__37151);
            rule__Knit__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Knit__Group__4_in_rule__Knit__Group__37154);
            rule__Knit__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knit__Group__3"


    // $ANTLR start "rule__Knit__Group__3__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3491:1: rule__Knit__Group__3__Impl : ( ( rule__Knit__Alternatives_3 )? ) ;
    public final void rule__Knit__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3495:1: ( ( ( rule__Knit__Alternatives_3 )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3496:1: ( ( rule__Knit__Alternatives_3 )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3496:1: ( ( rule__Knit__Alternatives_3 )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3497:1: ( rule__Knit__Alternatives_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKnitAccess().getAlternatives_3()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3498:1: ( rule__Knit__Alternatives_3 )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( ((LA65_0>=28 && LA65_0<=29)) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3498:2: rule__Knit__Alternatives_3
                    {
                    pushFollow(FOLLOW_rule__Knit__Alternatives_3_in_rule__Knit__Group__3__Impl7181);
                    rule__Knit__Alternatives_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKnitAccess().getAlternatives_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knit__Group__3__Impl"


    // $ANTLR start "rule__Knit__Group__4"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3508:1: rule__Knit__Group__4 : rule__Knit__Group__4__Impl rule__Knit__Group__5 ;
    public final void rule__Knit__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3512:1: ( rule__Knit__Group__4__Impl rule__Knit__Group__5 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3513:2: rule__Knit__Group__4__Impl rule__Knit__Group__5
            {
            pushFollow(FOLLOW_rule__Knit__Group__4__Impl_in_rule__Knit__Group__47212);
            rule__Knit__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Knit__Group__5_in_rule__Knit__Group__47215);
            rule__Knit__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knit__Group__4"


    // $ANTLR start "rule__Knit__Group__4__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3520:1: rule__Knit__Group__4__Impl : ( ( rule__Knit__UnorderedGroup_4 ) ) ;
    public final void rule__Knit__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3524:1: ( ( ( rule__Knit__UnorderedGroup_4 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3525:1: ( ( rule__Knit__UnorderedGroup_4 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3525:1: ( ( rule__Knit__UnorderedGroup_4 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3526:1: ( rule__Knit__UnorderedGroup_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKnitAccess().getUnorderedGroup_4()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3527:1: ( rule__Knit__UnorderedGroup_4 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3527:2: rule__Knit__UnorderedGroup_4
            {
            pushFollow(FOLLOW_rule__Knit__UnorderedGroup_4_in_rule__Knit__Group__4__Impl7242);
            rule__Knit__UnorderedGroup_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKnitAccess().getUnorderedGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knit__Group__4__Impl"


    // $ANTLR start "rule__Knit__Group__5"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3537:1: rule__Knit__Group__5 : rule__Knit__Group__5__Impl rule__Knit__Group__6 ;
    public final void rule__Knit__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3541:1: ( rule__Knit__Group__5__Impl rule__Knit__Group__6 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3542:2: rule__Knit__Group__5__Impl rule__Knit__Group__6
            {
            pushFollow(FOLLOW_rule__Knit__Group__5__Impl_in_rule__Knit__Group__57272);
            rule__Knit__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Knit__Group__6_in_rule__Knit__Group__57275);
            rule__Knit__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knit__Group__5"


    // $ANTLR start "rule__Knit__Group__5__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3549:1: rule__Knit__Group__5__Impl : ( ( rule__Knit__Group_5__0 )? ) ;
    public final void rule__Knit__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3553:1: ( ( ( rule__Knit__Group_5__0 )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3554:1: ( ( rule__Knit__Group_5__0 )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3554:1: ( ( rule__Knit__Group_5__0 )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3555:1: ( rule__Knit__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKnitAccess().getGroup_5()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3556:1: ( rule__Knit__Group_5__0 )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==56) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3556:2: rule__Knit__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Knit__Group_5__0_in_rule__Knit__Group__5__Impl7302);
                    rule__Knit__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKnitAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knit__Group__5__Impl"


    // $ANTLR start "rule__Knit__Group__6"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3566:1: rule__Knit__Group__6 : rule__Knit__Group__6__Impl ;
    public final void rule__Knit__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3570:1: ( rule__Knit__Group__6__Impl )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3571:2: rule__Knit__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Knit__Group__6__Impl_in_rule__Knit__Group__67333);
            rule__Knit__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knit__Group__6"


    // $ANTLR start "rule__Knit__Group__6__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3577:1: rule__Knit__Group__6__Impl : ( ( rule__Knit__Group_6__0 )? ) ;
    public final void rule__Knit__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3581:1: ( ( ( rule__Knit__Group_6__0 )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3582:1: ( ( rule__Knit__Group_6__0 )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3582:1: ( ( rule__Knit__Group_6__0 )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3583:1: ( rule__Knit__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKnitAccess().getGroup_6()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3584:1: ( rule__Knit__Group_6__0 )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_INT||LA67_0==66||(LA67_0>=77 && LA67_0<=78)) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3584:2: rule__Knit__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Knit__Group_6__0_in_rule__Knit__Group__6__Impl7360);
                    rule__Knit__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKnitAccess().getGroup_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knit__Group__6__Impl"


    // $ANTLR start "rule__Knit__Group_5__0"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3608:1: rule__Knit__Group_5__0 : rule__Knit__Group_5__0__Impl rule__Knit__Group_5__1 ;
    public final void rule__Knit__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3612:1: ( rule__Knit__Group_5__0__Impl rule__Knit__Group_5__1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3613:2: rule__Knit__Group_5__0__Impl rule__Knit__Group_5__1
            {
            pushFollow(FOLLOW_rule__Knit__Group_5__0__Impl_in_rule__Knit__Group_5__07405);
            rule__Knit__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Knit__Group_5__1_in_rule__Knit__Group_5__07408);
            rule__Knit__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knit__Group_5__0"


    // $ANTLR start "rule__Knit__Group_5__0__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3620:1: rule__Knit__Group_5__0__Impl : ( 'with' ) ;
    public final void rule__Knit__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3624:1: ( ( 'with' ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3625:1: ( 'with' )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3625:1: ( 'with' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3626:1: 'with'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKnitAccess().getWithKeyword_5_0()); 
            }
            match(input,56,FOLLOW_56_in_rule__Knit__Group_5__0__Impl7436); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKnitAccess().getWithKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knit__Group_5__0__Impl"


    // $ANTLR start "rule__Knit__Group_5__1"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3639:1: rule__Knit__Group_5__1 : rule__Knit__Group_5__1__Impl ;
    public final void rule__Knit__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3643:1: ( rule__Knit__Group_5__1__Impl )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3644:2: rule__Knit__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Knit__Group_5__1__Impl_in_rule__Knit__Group_5__17467);
            rule__Knit__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knit__Group_5__1"


    // $ANTLR start "rule__Knit__Group_5__1__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3650:1: rule__Knit__Group_5__1__Impl : ( ( rule__Knit__YarnRefAssignment_5_1 ) ) ;
    public final void rule__Knit__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3654:1: ( ( ( rule__Knit__YarnRefAssignment_5_1 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3655:1: ( ( rule__Knit__YarnRefAssignment_5_1 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3655:1: ( ( rule__Knit__YarnRefAssignment_5_1 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3656:1: ( rule__Knit__YarnRefAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKnitAccess().getYarnRefAssignment_5_1()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3657:1: ( rule__Knit__YarnRefAssignment_5_1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3657:2: rule__Knit__YarnRefAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Knit__YarnRefAssignment_5_1_in_rule__Knit__Group_5__1__Impl7494);
            rule__Knit__YarnRefAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKnitAccess().getYarnRefAssignment_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knit__Group_5__1__Impl"


    // $ANTLR start "rule__Knit__Group_6__0"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3671:1: rule__Knit__Group_6__0 : rule__Knit__Group_6__0__Impl rule__Knit__Group_6__1 ;
    public final void rule__Knit__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3675:1: ( rule__Knit__Group_6__0__Impl rule__Knit__Group_6__1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3676:2: rule__Knit__Group_6__0__Impl rule__Knit__Group_6__1
            {
            pushFollow(FOLLOW_rule__Knit__Group_6__0__Impl_in_rule__Knit__Group_6__07528);
            rule__Knit__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Knit__Group_6__1_in_rule__Knit__Group_6__07531);
            rule__Knit__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knit__Group_6__0"


    // $ANTLR start "rule__Knit__Group_6__0__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3683:1: rule__Knit__Group_6__0__Impl : ( ( 'to' )? ) ;
    public final void rule__Knit__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3687:1: ( ( ( 'to' )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3688:1: ( ( 'to' )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3688:1: ( ( 'to' )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3689:1: ( 'to' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKnitAccess().getToKeyword_6_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3690:1: ( 'to' )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==66) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3691:2: 'to'
                    {
                    match(input,66,FOLLOW_66_in_rule__Knit__Group_6__0__Impl7560); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKnitAccess().getToKeyword_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knit__Group_6__0__Impl"


    // $ANTLR start "rule__Knit__Group_6__1"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3702:1: rule__Knit__Group_6__1 : rule__Knit__Group_6__1__Impl ;
    public final void rule__Knit__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3706:1: ( rule__Knit__Group_6__1__Impl )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3707:2: rule__Knit__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Knit__Group_6__1__Impl_in_rule__Knit__Group_6__17593);
            rule__Knit__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knit__Group_6__1"


    // $ANTLR start "rule__Knit__Group_6__1__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3713:1: rule__Knit__Group_6__1__Impl : ( ( rule__Knit__RepeatAssignment_6_1 ) ) ;
    public final void rule__Knit__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3717:1: ( ( ( rule__Knit__RepeatAssignment_6_1 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3718:1: ( ( rule__Knit__RepeatAssignment_6_1 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3718:1: ( ( rule__Knit__RepeatAssignment_6_1 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3719:1: ( rule__Knit__RepeatAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKnitAccess().getRepeatAssignment_6_1()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3720:1: ( rule__Knit__RepeatAssignment_6_1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3720:2: rule__Knit__RepeatAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Knit__RepeatAssignment_6_1_in_rule__Knit__Group_6__1__Impl7620);
            rule__Knit__RepeatAssignment_6_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKnitAccess().getRepeatAssignment_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knit__Group_6__1__Impl"


    // $ANTLR start "rule__Purl__Group__0"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3734:1: rule__Purl__Group__0 : rule__Purl__Group__0__Impl rule__Purl__Group__1 ;
    public final void rule__Purl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3738:1: ( rule__Purl__Group__0__Impl rule__Purl__Group__1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3739:2: rule__Purl__Group__0__Impl rule__Purl__Group__1
            {
            pushFollow(FOLLOW_rule__Purl__Group__0__Impl_in_rule__Purl__Group__07654);
            rule__Purl__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Purl__Group__1_in_rule__Purl__Group__07657);
            rule__Purl__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Purl__Group__0"


    // $ANTLR start "rule__Purl__Group__0__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3746:1: rule__Purl__Group__0__Impl : ( ( rule__Purl__Alternatives_0 ) ) ;
    public final void rule__Purl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3750:1: ( ( ( rule__Purl__Alternatives_0 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3751:1: ( ( rule__Purl__Alternatives_0 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3751:1: ( ( rule__Purl__Alternatives_0 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3752:1: ( rule__Purl__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPurlAccess().getAlternatives_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3753:1: ( rule__Purl__Alternatives_0 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3753:2: rule__Purl__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Purl__Alternatives_0_in_rule__Purl__Group__0__Impl7684);
            rule__Purl__Alternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPurlAccess().getAlternatives_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Purl__Group__0__Impl"


    // $ANTLR start "rule__Purl__Group__1"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3763:1: rule__Purl__Group__1 : rule__Purl__Group__1__Impl rule__Purl__Group__2 ;
    public final void rule__Purl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3767:1: ( rule__Purl__Group__1__Impl rule__Purl__Group__2 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3768:2: rule__Purl__Group__1__Impl rule__Purl__Group__2
            {
            pushFollow(FOLLOW_rule__Purl__Group__1__Impl_in_rule__Purl__Group__17714);
            rule__Purl__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Purl__Group__2_in_rule__Purl__Group__17717);
            rule__Purl__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Purl__Group__1"


    // $ANTLR start "rule__Purl__Group__1__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3775:1: rule__Purl__Group__1__Impl : ( () ) ;
    public final void rule__Purl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3779:1: ( ( () ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3780:1: ( () )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3780:1: ( () )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3781:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPurlAccess().getPurlAction_1()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3782:1: ()
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3784:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPurlAccess().getPurlAction_1()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Purl__Group__1__Impl"


    // $ANTLR start "rule__Purl__Group__2"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3794:1: rule__Purl__Group__2 : rule__Purl__Group__2__Impl rule__Purl__Group__3 ;
    public final void rule__Purl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3798:1: ( rule__Purl__Group__2__Impl rule__Purl__Group__3 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3799:2: rule__Purl__Group__2__Impl rule__Purl__Group__3
            {
            pushFollow(FOLLOW_rule__Purl__Group__2__Impl_in_rule__Purl__Group__27775);
            rule__Purl__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Purl__Group__3_in_rule__Purl__Group__27778);
            rule__Purl__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Purl__Group__2"


    // $ANTLR start "rule__Purl__Group__2__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3806:1: rule__Purl__Group__2__Impl : ( ( rule__Purl__NumberAssignment_2 )? ) ;
    public final void rule__Purl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3810:1: ( ( ( rule__Purl__NumberAssignment_2 )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3811:1: ( ( rule__Purl__NumberAssignment_2 )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3811:1: ( ( rule__Purl__NumberAssignment_2 )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3812:1: ( rule__Purl__NumberAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPurlAccess().getNumberAssignment_2()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3813:1: ( rule__Purl__NumberAssignment_2 )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==RULE_INT) ) {
                switch ( input.LA(2) ) {
                    case 28:
                        {
                        int LA69_3 = input.LA(3);

                        if ( (LA69_3==EOF||LA69_3==RULE_LF||(LA69_3>=RULE_STRING && LA69_3<=RULE_INT)||(LA69_3>=16 && LA69_3<=19)||(LA69_3>=30 && LA69_3<=31)||LA69_3==53||(LA69_3>=56 && LA69_3<=57)||LA69_3==60||LA69_3==66||LA69_3==68||(LA69_3>=71 && LA69_3<=73)||(LA69_3>=76 && LA69_3<=78)) ) {
                            alt69=1;
                        }
                        }
                        break;
                    case 29:
                        {
                        int LA69_4 = input.LA(3);

                        if ( (LA69_4==EOF||LA69_4==RULE_LF||(LA69_4>=RULE_STRING && LA69_4<=RULE_INT)||(LA69_4>=16 && LA69_4<=19)||(LA69_4>=30 && LA69_4<=31)||LA69_4==53||(LA69_4>=56 && LA69_4<=57)||LA69_4==60||LA69_4==66||LA69_4==68||(LA69_4>=71 && LA69_4<=73)||(LA69_4>=76 && LA69_4<=78)) ) {
                            alt69=1;
                        }
                        }
                        break;
                    case EOF:
                    case RULE_LF:
                    case RULE_STRING:
                    case RULE_INT:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 30:
                    case 31:
                    case 53:
                    case 56:
                    case 57:
                    case 60:
                    case 66:
                    case 68:
                    case 71:
                    case 72:
                    case 73:
                    case 76:
                    case 77:
                    case 78:
                        {
                        alt69=1;
                        }
                        break;
                }

            }
            switch (alt69) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3813:2: rule__Purl__NumberAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Purl__NumberAssignment_2_in_rule__Purl__Group__2__Impl7805);
                    rule__Purl__NumberAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPurlAccess().getNumberAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Purl__Group__2__Impl"


    // $ANTLR start "rule__Purl__Group__3"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3823:1: rule__Purl__Group__3 : rule__Purl__Group__3__Impl rule__Purl__Group__4 ;
    public final void rule__Purl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3827:1: ( rule__Purl__Group__3__Impl rule__Purl__Group__4 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3828:2: rule__Purl__Group__3__Impl rule__Purl__Group__4
            {
            pushFollow(FOLLOW_rule__Purl__Group__3__Impl_in_rule__Purl__Group__37836);
            rule__Purl__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Purl__Group__4_in_rule__Purl__Group__37839);
            rule__Purl__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Purl__Group__3"


    // $ANTLR start "rule__Purl__Group__3__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3835:1: rule__Purl__Group__3__Impl : ( ( rule__Purl__Alternatives_3 )? ) ;
    public final void rule__Purl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3839:1: ( ( ( rule__Purl__Alternatives_3 )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3840:1: ( ( rule__Purl__Alternatives_3 )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3840:1: ( ( rule__Purl__Alternatives_3 )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3841:1: ( rule__Purl__Alternatives_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPurlAccess().getAlternatives_3()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3842:1: ( rule__Purl__Alternatives_3 )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( ((LA70_0>=28 && LA70_0<=29)) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3842:2: rule__Purl__Alternatives_3
                    {
                    pushFollow(FOLLOW_rule__Purl__Alternatives_3_in_rule__Purl__Group__3__Impl7866);
                    rule__Purl__Alternatives_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPurlAccess().getAlternatives_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Purl__Group__3__Impl"


    // $ANTLR start "rule__Purl__Group__4"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3852:1: rule__Purl__Group__4 : rule__Purl__Group__4__Impl rule__Purl__Group__5 ;
    public final void rule__Purl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3856:1: ( rule__Purl__Group__4__Impl rule__Purl__Group__5 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3857:2: rule__Purl__Group__4__Impl rule__Purl__Group__5
            {
            pushFollow(FOLLOW_rule__Purl__Group__4__Impl_in_rule__Purl__Group__47897);
            rule__Purl__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Purl__Group__5_in_rule__Purl__Group__47900);
            rule__Purl__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Purl__Group__4"


    // $ANTLR start "rule__Purl__Group__4__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3864:1: rule__Purl__Group__4__Impl : ( ( rule__Purl__UnorderedGroup_4 ) ) ;
    public final void rule__Purl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3868:1: ( ( ( rule__Purl__UnorderedGroup_4 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3869:1: ( ( rule__Purl__UnorderedGroup_4 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3869:1: ( ( rule__Purl__UnorderedGroup_4 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3870:1: ( rule__Purl__UnorderedGroup_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPurlAccess().getUnorderedGroup_4()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3871:1: ( rule__Purl__UnorderedGroup_4 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3871:2: rule__Purl__UnorderedGroup_4
            {
            pushFollow(FOLLOW_rule__Purl__UnorderedGroup_4_in_rule__Purl__Group__4__Impl7927);
            rule__Purl__UnorderedGroup_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPurlAccess().getUnorderedGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Purl__Group__4__Impl"


    // $ANTLR start "rule__Purl__Group__5"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3881:1: rule__Purl__Group__5 : rule__Purl__Group__5__Impl rule__Purl__Group__6 ;
    public final void rule__Purl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3885:1: ( rule__Purl__Group__5__Impl rule__Purl__Group__6 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3886:2: rule__Purl__Group__5__Impl rule__Purl__Group__6
            {
            pushFollow(FOLLOW_rule__Purl__Group__5__Impl_in_rule__Purl__Group__57957);
            rule__Purl__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Purl__Group__6_in_rule__Purl__Group__57960);
            rule__Purl__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Purl__Group__5"


    // $ANTLR start "rule__Purl__Group__5__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3893:1: rule__Purl__Group__5__Impl : ( ( rule__Purl__Group_5__0 )? ) ;
    public final void rule__Purl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3897:1: ( ( ( rule__Purl__Group_5__0 )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3898:1: ( ( rule__Purl__Group_5__0 )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3898:1: ( ( rule__Purl__Group_5__0 )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3899:1: ( rule__Purl__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPurlAccess().getGroup_5()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3900:1: ( rule__Purl__Group_5__0 )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==56) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3900:2: rule__Purl__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Purl__Group_5__0_in_rule__Purl__Group__5__Impl7987);
                    rule__Purl__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPurlAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Purl__Group__5__Impl"


    // $ANTLR start "rule__Purl__Group__6"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3910:1: rule__Purl__Group__6 : rule__Purl__Group__6__Impl ;
    public final void rule__Purl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3914:1: ( rule__Purl__Group__6__Impl )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3915:2: rule__Purl__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Purl__Group__6__Impl_in_rule__Purl__Group__68018);
            rule__Purl__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Purl__Group__6"


    // $ANTLR start "rule__Purl__Group__6__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3921:1: rule__Purl__Group__6__Impl : ( ( rule__Purl__Group_6__0 )? ) ;
    public final void rule__Purl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3925:1: ( ( ( rule__Purl__Group_6__0 )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3926:1: ( ( rule__Purl__Group_6__0 )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3926:1: ( ( rule__Purl__Group_6__0 )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3927:1: ( rule__Purl__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPurlAccess().getGroup_6()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3928:1: ( rule__Purl__Group_6__0 )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==RULE_INT||LA72_0==66||(LA72_0>=77 && LA72_0<=78)) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3928:2: rule__Purl__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Purl__Group_6__0_in_rule__Purl__Group__6__Impl8045);
                    rule__Purl__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPurlAccess().getGroup_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Purl__Group__6__Impl"


    // $ANTLR start "rule__Purl__Group_5__0"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3952:1: rule__Purl__Group_5__0 : rule__Purl__Group_5__0__Impl rule__Purl__Group_5__1 ;
    public final void rule__Purl__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3956:1: ( rule__Purl__Group_5__0__Impl rule__Purl__Group_5__1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3957:2: rule__Purl__Group_5__0__Impl rule__Purl__Group_5__1
            {
            pushFollow(FOLLOW_rule__Purl__Group_5__0__Impl_in_rule__Purl__Group_5__08090);
            rule__Purl__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Purl__Group_5__1_in_rule__Purl__Group_5__08093);
            rule__Purl__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Purl__Group_5__0"


    // $ANTLR start "rule__Purl__Group_5__0__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3964:1: rule__Purl__Group_5__0__Impl : ( 'with' ) ;
    public final void rule__Purl__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3968:1: ( ( 'with' ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3969:1: ( 'with' )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3969:1: ( 'with' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3970:1: 'with'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPurlAccess().getWithKeyword_5_0()); 
            }
            match(input,56,FOLLOW_56_in_rule__Purl__Group_5__0__Impl8121); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPurlAccess().getWithKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Purl__Group_5__0__Impl"


    // $ANTLR start "rule__Purl__Group_5__1"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3983:1: rule__Purl__Group_5__1 : rule__Purl__Group_5__1__Impl ;
    public final void rule__Purl__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3987:1: ( rule__Purl__Group_5__1__Impl )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3988:2: rule__Purl__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Purl__Group_5__1__Impl_in_rule__Purl__Group_5__18152);
            rule__Purl__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Purl__Group_5__1"


    // $ANTLR start "rule__Purl__Group_5__1__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3994:1: rule__Purl__Group_5__1__Impl : ( ( rule__Purl__YarnRefAssignment_5_1 ) ) ;
    public final void rule__Purl__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3998:1: ( ( ( rule__Purl__YarnRefAssignment_5_1 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3999:1: ( ( rule__Purl__YarnRefAssignment_5_1 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3999:1: ( ( rule__Purl__YarnRefAssignment_5_1 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4000:1: ( rule__Purl__YarnRefAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPurlAccess().getYarnRefAssignment_5_1()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4001:1: ( rule__Purl__YarnRefAssignment_5_1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4001:2: rule__Purl__YarnRefAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Purl__YarnRefAssignment_5_1_in_rule__Purl__Group_5__1__Impl8179);
            rule__Purl__YarnRefAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPurlAccess().getYarnRefAssignment_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Purl__Group_5__1__Impl"


    // $ANTLR start "rule__Purl__Group_6__0"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4015:1: rule__Purl__Group_6__0 : rule__Purl__Group_6__0__Impl rule__Purl__Group_6__1 ;
    public final void rule__Purl__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4019:1: ( rule__Purl__Group_6__0__Impl rule__Purl__Group_6__1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4020:2: rule__Purl__Group_6__0__Impl rule__Purl__Group_6__1
            {
            pushFollow(FOLLOW_rule__Purl__Group_6__0__Impl_in_rule__Purl__Group_6__08213);
            rule__Purl__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Purl__Group_6__1_in_rule__Purl__Group_6__08216);
            rule__Purl__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Purl__Group_6__0"


    // $ANTLR start "rule__Purl__Group_6__0__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4027:1: rule__Purl__Group_6__0__Impl : ( ( 'to' )? ) ;
    public final void rule__Purl__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4031:1: ( ( ( 'to' )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4032:1: ( ( 'to' )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4032:1: ( ( 'to' )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4033:1: ( 'to' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPurlAccess().getToKeyword_6_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4034:1: ( 'to' )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==66) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4035:2: 'to'
                    {
                    match(input,66,FOLLOW_66_in_rule__Purl__Group_6__0__Impl8245); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPurlAccess().getToKeyword_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Purl__Group_6__0__Impl"


    // $ANTLR start "rule__Purl__Group_6__1"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4046:1: rule__Purl__Group_6__1 : rule__Purl__Group_6__1__Impl ;
    public final void rule__Purl__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4050:1: ( rule__Purl__Group_6__1__Impl )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4051:2: rule__Purl__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Purl__Group_6__1__Impl_in_rule__Purl__Group_6__18278);
            rule__Purl__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Purl__Group_6__1"


    // $ANTLR start "rule__Purl__Group_6__1__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4057:1: rule__Purl__Group_6__1__Impl : ( ( rule__Purl__RepeatAssignment_6_1 ) ) ;
    public final void rule__Purl__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4061:1: ( ( ( rule__Purl__RepeatAssignment_6_1 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4062:1: ( ( rule__Purl__RepeatAssignment_6_1 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4062:1: ( ( rule__Purl__RepeatAssignment_6_1 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4063:1: ( rule__Purl__RepeatAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPurlAccess().getRepeatAssignment_6_1()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4064:1: ( rule__Purl__RepeatAssignment_6_1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4064:2: rule__Purl__RepeatAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Purl__RepeatAssignment_6_1_in_rule__Purl__Group_6__1__Impl8305);
            rule__Purl__RepeatAssignment_6_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPurlAccess().getRepeatAssignment_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Purl__Group_6__1__Impl"


    // $ANTLR start "rule__Slip__Group__0"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4078:1: rule__Slip__Group__0 : rule__Slip__Group__0__Impl rule__Slip__Group__1 ;
    public final void rule__Slip__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4082:1: ( rule__Slip__Group__0__Impl rule__Slip__Group__1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4083:2: rule__Slip__Group__0__Impl rule__Slip__Group__1
            {
            pushFollow(FOLLOW_rule__Slip__Group__0__Impl_in_rule__Slip__Group__08339);
            rule__Slip__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Slip__Group__1_in_rule__Slip__Group__08342);
            rule__Slip__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slip__Group__0"


    // $ANTLR start "rule__Slip__Group__0__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4090:1: rule__Slip__Group__0__Impl : ( () ) ;
    public final void rule__Slip__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4094:1: ( ( () ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4095:1: ( () )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4095:1: ( () )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4096:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSlipAccess().getSlipAction_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4097:1: ()
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4099:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSlipAccess().getSlipAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slip__Group__0__Impl"


    // $ANTLR start "rule__Slip__Group__1"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4109:1: rule__Slip__Group__1 : rule__Slip__Group__1__Impl rule__Slip__Group__2 ;
    public final void rule__Slip__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4113:1: ( rule__Slip__Group__1__Impl rule__Slip__Group__2 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4114:2: rule__Slip__Group__1__Impl rule__Slip__Group__2
            {
            pushFollow(FOLLOW_rule__Slip__Group__1__Impl_in_rule__Slip__Group__18400);
            rule__Slip__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Slip__Group__2_in_rule__Slip__Group__18403);
            rule__Slip__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slip__Group__1"


    // $ANTLR start "rule__Slip__Group__1__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4121:1: rule__Slip__Group__1__Impl : ( ( rule__Slip__ReverseAssignment_1 )? ) ;
    public final void rule__Slip__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4125:1: ( ( ( rule__Slip__ReverseAssignment_1 )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4126:1: ( ( rule__Slip__ReverseAssignment_1 )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4126:1: ( ( rule__Slip__ReverseAssignment_1 )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4127:1: ( rule__Slip__ReverseAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSlipAccess().getReverseAssignment_1()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4128:1: ( rule__Slip__ReverseAssignment_1 )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( ((LA74_0>=36 && LA74_0<=39)) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4128:2: rule__Slip__ReverseAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Slip__ReverseAssignment_1_in_rule__Slip__Group__1__Impl8430);
                    rule__Slip__ReverseAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSlipAccess().getReverseAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slip__Group__1__Impl"


    // $ANTLR start "rule__Slip__Group__2"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4138:1: rule__Slip__Group__2 : rule__Slip__Group__2__Impl rule__Slip__Group__3 ;
    public final void rule__Slip__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4142:1: ( rule__Slip__Group__2__Impl rule__Slip__Group__3 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4143:2: rule__Slip__Group__2__Impl rule__Slip__Group__3
            {
            pushFollow(FOLLOW_rule__Slip__Group__2__Impl_in_rule__Slip__Group__28461);
            rule__Slip__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Slip__Group__3_in_rule__Slip__Group__28464);
            rule__Slip__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slip__Group__2"


    // $ANTLR start "rule__Slip__Group__2__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4150:1: rule__Slip__Group__2__Impl : ( ( rule__Slip__Alternatives_2 ) ) ;
    public final void rule__Slip__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4154:1: ( ( ( rule__Slip__Alternatives_2 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4155:1: ( ( rule__Slip__Alternatives_2 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4155:1: ( ( rule__Slip__Alternatives_2 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4156:1: ( rule__Slip__Alternatives_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSlipAccess().getAlternatives_2()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4157:1: ( rule__Slip__Alternatives_2 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4157:2: rule__Slip__Alternatives_2
            {
            pushFollow(FOLLOW_rule__Slip__Alternatives_2_in_rule__Slip__Group__2__Impl8491);
            rule__Slip__Alternatives_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSlipAccess().getAlternatives_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slip__Group__2__Impl"


    // $ANTLR start "rule__Slip__Group__3"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4167:1: rule__Slip__Group__3 : rule__Slip__Group__3__Impl rule__Slip__Group__4 ;
    public final void rule__Slip__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4171:1: ( rule__Slip__Group__3__Impl rule__Slip__Group__4 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4172:2: rule__Slip__Group__3__Impl rule__Slip__Group__4
            {
            pushFollow(FOLLOW_rule__Slip__Group__3__Impl_in_rule__Slip__Group__38521);
            rule__Slip__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Slip__Group__4_in_rule__Slip__Group__38524);
            rule__Slip__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slip__Group__3"


    // $ANTLR start "rule__Slip__Group__3__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4179:1: rule__Slip__Group__3__Impl : ( ( rule__Slip__Alternatives_3 )? ) ;
    public final void rule__Slip__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4183:1: ( ( ( rule__Slip__Alternatives_3 )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4184:1: ( ( rule__Slip__Alternatives_3 )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4184:1: ( ( rule__Slip__Alternatives_3 )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4185:1: ( rule__Slip__Alternatives_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSlipAccess().getAlternatives_3()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4186:1: ( rule__Slip__Alternatives_3 )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==RULE_INT||LA75_0==44) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4186:2: rule__Slip__Alternatives_3
                    {
                    pushFollow(FOLLOW_rule__Slip__Alternatives_3_in_rule__Slip__Group__3__Impl8551);
                    rule__Slip__Alternatives_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSlipAccess().getAlternatives_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slip__Group__3__Impl"


    // $ANTLR start "rule__Slip__Group__4"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4196:1: rule__Slip__Group__4 : rule__Slip__Group__4__Impl rule__Slip__Group__5 ;
    public final void rule__Slip__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4200:1: ( rule__Slip__Group__4__Impl rule__Slip__Group__5 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4201:2: rule__Slip__Group__4__Impl rule__Slip__Group__5
            {
            pushFollow(FOLLOW_rule__Slip__Group__4__Impl_in_rule__Slip__Group__48582);
            rule__Slip__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Slip__Group__5_in_rule__Slip__Group__48585);
            rule__Slip__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slip__Group__4"


    // $ANTLR start "rule__Slip__Group__4__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4208:1: rule__Slip__Group__4__Impl : ( ( rule__Slip__Alternatives_4 )? ) ;
    public final void rule__Slip__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4212:1: ( ( ( rule__Slip__Alternatives_4 )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4213:1: ( ( rule__Slip__Alternatives_4 )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4213:1: ( ( rule__Slip__Alternatives_4 )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4214:1: ( rule__Slip__Alternatives_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSlipAccess().getAlternatives_4()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4215:1: ( rule__Slip__Alternatives_4 )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( ((LA76_0>=45 && LA76_0<=48)) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4215:2: rule__Slip__Alternatives_4
                    {
                    pushFollow(FOLLOW_rule__Slip__Alternatives_4_in_rule__Slip__Group__4__Impl8612);
                    rule__Slip__Alternatives_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSlipAccess().getAlternatives_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slip__Group__4__Impl"


    // $ANTLR start "rule__Slip__Group__5"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4225:1: rule__Slip__Group__5 : rule__Slip__Group__5__Impl ;
    public final void rule__Slip__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4229:1: ( rule__Slip__Group__5__Impl )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4230:2: rule__Slip__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Slip__Group__5__Impl_in_rule__Slip__Group__58643);
            rule__Slip__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slip__Group__5"


    // $ANTLR start "rule__Slip__Group__5__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4236:1: rule__Slip__Group__5__Impl : ( ( rule__Slip__YarnPositionAssignment_5 )? ) ;
    public final void rule__Slip__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4240:1: ( ( ( rule__Slip__YarnPositionAssignment_5 )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4241:1: ( ( rule__Slip__YarnPositionAssignment_5 )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4241:1: ( ( rule__Slip__YarnPositionAssignment_5 )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4242:1: ( rule__Slip__YarnPositionAssignment_5 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSlipAccess().getYarnPositionAssignment_5()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4243:1: ( rule__Slip__YarnPositionAssignment_5 )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( ((LA77_0>=49 && LA77_0<=50)) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4243:2: rule__Slip__YarnPositionAssignment_5
                    {
                    pushFollow(FOLLOW_rule__Slip__YarnPositionAssignment_5_in_rule__Slip__Group__5__Impl8670);
                    rule__Slip__YarnPositionAssignment_5();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSlipAccess().getYarnPositionAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slip__Group__5__Impl"


    // $ANTLR start "rule__Slip__Group_3_0__0"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4265:1: rule__Slip__Group_3_0__0 : rule__Slip__Group_3_0__0__Impl rule__Slip__Group_3_0__1 ;
    public final void rule__Slip__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4269:1: ( rule__Slip__Group_3_0__0__Impl rule__Slip__Group_3_0__1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4270:2: rule__Slip__Group_3_0__0__Impl rule__Slip__Group_3_0__1
            {
            pushFollow(FOLLOW_rule__Slip__Group_3_0__0__Impl_in_rule__Slip__Group_3_0__08713);
            rule__Slip__Group_3_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Slip__Group_3_0__1_in_rule__Slip__Group_3_0__08716);
            rule__Slip__Group_3_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slip__Group_3_0__0"


    // $ANTLR start "rule__Slip__Group_3_0__0__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4277:1: rule__Slip__Group_3_0__0__Impl : ( ( rule__Slip__NumberAssignment_3_0_0 ) ) ;
    public final void rule__Slip__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4281:1: ( ( ( rule__Slip__NumberAssignment_3_0_0 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4282:1: ( ( rule__Slip__NumberAssignment_3_0_0 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4282:1: ( ( rule__Slip__NumberAssignment_3_0_0 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4283:1: ( rule__Slip__NumberAssignment_3_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSlipAccess().getNumberAssignment_3_0_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4284:1: ( rule__Slip__NumberAssignment_3_0_0 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4284:2: rule__Slip__NumberAssignment_3_0_0
            {
            pushFollow(FOLLOW_rule__Slip__NumberAssignment_3_0_0_in_rule__Slip__Group_3_0__0__Impl8743);
            rule__Slip__NumberAssignment_3_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSlipAccess().getNumberAssignment_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slip__Group_3_0__0__Impl"


    // $ANTLR start "rule__Slip__Group_3_0__1"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4294:1: rule__Slip__Group_3_0__1 : rule__Slip__Group_3_0__1__Impl ;
    public final void rule__Slip__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4298:1: ( rule__Slip__Group_3_0__1__Impl )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4299:2: rule__Slip__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Slip__Group_3_0__1__Impl_in_rule__Slip__Group_3_0__18773);
            rule__Slip__Group_3_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slip__Group_3_0__1"


    // $ANTLR start "rule__Slip__Group_3_0__1__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4305:1: rule__Slip__Group_3_0__1__Impl : ( ( rule__Slip__Alternatives_3_0_1 )? ) ;
    public final void rule__Slip__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4309:1: ( ( ( rule__Slip__Alternatives_3_0_1 )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4310:1: ( ( rule__Slip__Alternatives_3_0_1 )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4310:1: ( ( rule__Slip__Alternatives_3_0_1 )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4311:1: ( rule__Slip__Alternatives_3_0_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSlipAccess().getAlternatives_3_0_1()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4312:1: ( rule__Slip__Alternatives_3_0_1 )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( ((LA78_0>=28 && LA78_0<=29)) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4312:2: rule__Slip__Alternatives_3_0_1
                    {
                    pushFollow(FOLLOW_rule__Slip__Alternatives_3_0_1_in_rule__Slip__Group_3_0__1__Impl8800);
                    rule__Slip__Alternatives_3_0_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSlipAccess().getAlternatives_3_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slip__Group_3_0__1__Impl"


    // $ANTLR start "rule__RepeatSpec__Group_2__0"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4326:1: rule__RepeatSpec__Group_2__0 : rule__RepeatSpec__Group_2__0__Impl rule__RepeatSpec__Group_2__1 ;
    public final void rule__RepeatSpec__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4330:1: ( rule__RepeatSpec__Group_2__0__Impl rule__RepeatSpec__Group_2__1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4331:2: rule__RepeatSpec__Group_2__0__Impl rule__RepeatSpec__Group_2__1
            {
            pushFollow(FOLLOW_rule__RepeatSpec__Group_2__0__Impl_in_rule__RepeatSpec__Group_2__08835);
            rule__RepeatSpec__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RepeatSpec__Group_2__1_in_rule__RepeatSpec__Group_2__08838);
            rule__RepeatSpec__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatSpec__Group_2__0"


    // $ANTLR start "rule__RepeatSpec__Group_2__0__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4338:1: rule__RepeatSpec__Group_2__0__Impl : ( ( rule__RepeatSpec__ValueAssignment_2_0 ) ) ;
    public final void rule__RepeatSpec__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4342:1: ( ( ( rule__RepeatSpec__ValueAssignment_2_0 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4343:1: ( ( rule__RepeatSpec__ValueAssignment_2_0 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4343:1: ( ( rule__RepeatSpec__ValueAssignment_2_0 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4344:1: ( rule__RepeatSpec__ValueAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatSpecAccess().getValueAssignment_2_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4345:1: ( rule__RepeatSpec__ValueAssignment_2_0 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4345:2: rule__RepeatSpec__ValueAssignment_2_0
            {
            pushFollow(FOLLOW_rule__RepeatSpec__ValueAssignment_2_0_in_rule__RepeatSpec__Group_2__0__Impl8865);
            rule__RepeatSpec__ValueAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatSpecAccess().getValueAssignment_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatSpec__Group_2__0__Impl"


    // $ANTLR start "rule__RepeatSpec__Group_2__1"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4355:1: rule__RepeatSpec__Group_2__1 : rule__RepeatSpec__Group_2__1__Impl rule__RepeatSpec__Group_2__2 ;
    public final void rule__RepeatSpec__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4359:1: ( rule__RepeatSpec__Group_2__1__Impl rule__RepeatSpec__Group_2__2 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4360:2: rule__RepeatSpec__Group_2__1__Impl rule__RepeatSpec__Group_2__2
            {
            pushFollow(FOLLOW_rule__RepeatSpec__Group_2__1__Impl_in_rule__RepeatSpec__Group_2__18895);
            rule__RepeatSpec__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RepeatSpec__Group_2__2_in_rule__RepeatSpec__Group_2__18898);
            rule__RepeatSpec__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatSpec__Group_2__1"


    // $ANTLR start "rule__RepeatSpec__Group_2__1__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4367:1: rule__RepeatSpec__Group_2__1__Impl : ( ( rule__RepeatSpec__Alternatives_2_1 )? ) ;
    public final void rule__RepeatSpec__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4371:1: ( ( ( rule__RepeatSpec__Alternatives_2_1 )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4372:1: ( ( rule__RepeatSpec__Alternatives_2_1 )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4372:1: ( ( rule__RepeatSpec__Alternatives_2_1 )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4373:1: ( rule__RepeatSpec__Alternatives_2_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatSpecAccess().getAlternatives_2_1()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4374:1: ( rule__RepeatSpec__Alternatives_2_1 )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( ((LA79_0>=28 && LA79_0<=29)) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4374:2: rule__RepeatSpec__Alternatives_2_1
                    {
                    pushFollow(FOLLOW_rule__RepeatSpec__Alternatives_2_1_in_rule__RepeatSpec__Group_2__1__Impl8925);
                    rule__RepeatSpec__Alternatives_2_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatSpecAccess().getAlternatives_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatSpec__Group_2__1__Impl"


    // $ANTLR start "rule__RepeatSpec__Group_2__2"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4384:1: rule__RepeatSpec__Group_2__2 : rule__RepeatSpec__Group_2__2__Impl ;
    public final void rule__RepeatSpec__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4388:1: ( rule__RepeatSpec__Group_2__2__Impl )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4389:2: rule__RepeatSpec__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__RepeatSpec__Group_2__2__Impl_in_rule__RepeatSpec__Group_2__28956);
            rule__RepeatSpec__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatSpec__Group_2__2"


    // $ANTLR start "rule__RepeatSpec__Group_2__2__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4395:1: rule__RepeatSpec__Group_2__2__Impl : ( ( rule__RepeatSpec__BeforeEndAssignment_2_2 ) ) ;
    public final void rule__RepeatSpec__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4399:1: ( ( ( rule__RepeatSpec__BeforeEndAssignment_2_2 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4400:1: ( ( rule__RepeatSpec__BeforeEndAssignment_2_2 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4400:1: ( ( rule__RepeatSpec__BeforeEndAssignment_2_2 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4401:1: ( rule__RepeatSpec__BeforeEndAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatSpecAccess().getBeforeEndAssignment_2_2()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4402:1: ( rule__RepeatSpec__BeforeEndAssignment_2_2 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4402:2: rule__RepeatSpec__BeforeEndAssignment_2_2
            {
            pushFollow(FOLLOW_rule__RepeatSpec__BeforeEndAssignment_2_2_in_rule__RepeatSpec__Group_2__2__Impl8983);
            rule__RepeatSpec__BeforeEndAssignment_2_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatSpecAccess().getBeforeEndAssignment_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatSpec__Group_2__2__Impl"


    // $ANTLR start "rule__RepeatSpec__Group_3__0"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4418:1: rule__RepeatSpec__Group_3__0 : rule__RepeatSpec__Group_3__0__Impl rule__RepeatSpec__Group_3__1 ;
    public final void rule__RepeatSpec__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4422:1: ( rule__RepeatSpec__Group_3__0__Impl rule__RepeatSpec__Group_3__1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4423:2: rule__RepeatSpec__Group_3__0__Impl rule__RepeatSpec__Group_3__1
            {
            pushFollow(FOLLOW_rule__RepeatSpec__Group_3__0__Impl_in_rule__RepeatSpec__Group_3__09019);
            rule__RepeatSpec__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RepeatSpec__Group_3__1_in_rule__RepeatSpec__Group_3__09022);
            rule__RepeatSpec__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatSpec__Group_3__0"


    // $ANTLR start "rule__RepeatSpec__Group_3__0__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4430:1: rule__RepeatSpec__Group_3__0__Impl : ( ( rule__RepeatSpec__ValueAssignment_3_0 ) ) ;
    public final void rule__RepeatSpec__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4434:1: ( ( ( rule__RepeatSpec__ValueAssignment_3_0 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4435:1: ( ( rule__RepeatSpec__ValueAssignment_3_0 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4435:1: ( ( rule__RepeatSpec__ValueAssignment_3_0 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4436:1: ( rule__RepeatSpec__ValueAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatSpecAccess().getValueAssignment_3_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4437:1: ( rule__RepeatSpec__ValueAssignment_3_0 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4437:2: rule__RepeatSpec__ValueAssignment_3_0
            {
            pushFollow(FOLLOW_rule__RepeatSpec__ValueAssignment_3_0_in_rule__RepeatSpec__Group_3__0__Impl9049);
            rule__RepeatSpec__ValueAssignment_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatSpecAccess().getValueAssignment_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatSpec__Group_3__0__Impl"


    // $ANTLR start "rule__RepeatSpec__Group_3__1"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4447:1: rule__RepeatSpec__Group_3__1 : rule__RepeatSpec__Group_3__1__Impl rule__RepeatSpec__Group_3__2 ;
    public final void rule__RepeatSpec__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4451:1: ( rule__RepeatSpec__Group_3__1__Impl rule__RepeatSpec__Group_3__2 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4452:2: rule__RepeatSpec__Group_3__1__Impl rule__RepeatSpec__Group_3__2
            {
            pushFollow(FOLLOW_rule__RepeatSpec__Group_3__1__Impl_in_rule__RepeatSpec__Group_3__19079);
            rule__RepeatSpec__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RepeatSpec__Group_3__2_in_rule__RepeatSpec__Group_3__19082);
            rule__RepeatSpec__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatSpec__Group_3__1"


    // $ANTLR start "rule__RepeatSpec__Group_3__1__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4459:1: rule__RepeatSpec__Group_3__1__Impl : ( ( rule__RepeatSpec__Alternatives_3_1 )? ) ;
    public final void rule__RepeatSpec__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4463:1: ( ( ( rule__RepeatSpec__Alternatives_3_1 )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4464:1: ( ( rule__RepeatSpec__Alternatives_3_1 )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4464:1: ( ( rule__RepeatSpec__Alternatives_3_1 )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4465:1: ( rule__RepeatSpec__Alternatives_3_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatSpecAccess().getAlternatives_3_1()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4466:1: ( rule__RepeatSpec__Alternatives_3_1 )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( ((LA80_0>=28 && LA80_0<=29)) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4466:2: rule__RepeatSpec__Alternatives_3_1
                    {
                    pushFollow(FOLLOW_rule__RepeatSpec__Alternatives_3_1_in_rule__RepeatSpec__Group_3__1__Impl9109);
                    rule__RepeatSpec__Alternatives_3_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatSpecAccess().getAlternatives_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatSpec__Group_3__1__Impl"


    // $ANTLR start "rule__RepeatSpec__Group_3__2"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4476:1: rule__RepeatSpec__Group_3__2 : rule__RepeatSpec__Group_3__2__Impl ;
    public final void rule__RepeatSpec__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4480:1: ( rule__RepeatSpec__Group_3__2__Impl )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4481:2: rule__RepeatSpec__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__RepeatSpec__Group_3__2__Impl_in_rule__RepeatSpec__Group_3__29140);
            rule__RepeatSpec__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatSpec__Group_3__2"


    // $ANTLR start "rule__RepeatSpec__Group_3__2__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4487:1: rule__RepeatSpec__Group_3__2__Impl : ( ( rule__RepeatSpec__BeforeGapAssignment_3_2 ) ) ;
    public final void rule__RepeatSpec__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4491:1: ( ( ( rule__RepeatSpec__BeforeGapAssignment_3_2 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4492:1: ( ( rule__RepeatSpec__BeforeGapAssignment_3_2 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4492:1: ( ( rule__RepeatSpec__BeforeGapAssignment_3_2 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4493:1: ( rule__RepeatSpec__BeforeGapAssignment_3_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatSpecAccess().getBeforeGapAssignment_3_2()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4494:1: ( rule__RepeatSpec__BeforeGapAssignment_3_2 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4494:2: rule__RepeatSpec__BeforeGapAssignment_3_2
            {
            pushFollow(FOLLOW_rule__RepeatSpec__BeforeGapAssignment_3_2_in_rule__RepeatSpec__Group_3__2__Impl9167);
            rule__RepeatSpec__BeforeGapAssignment_3_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatSpecAccess().getBeforeGapAssignment_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatSpec__Group_3__2__Impl"


    // $ANTLR start "rule__RepeatSpec__Group_4__0"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4510:1: rule__RepeatSpec__Group_4__0 : rule__RepeatSpec__Group_4__0__Impl rule__RepeatSpec__Group_4__1 ;
    public final void rule__RepeatSpec__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4514:1: ( rule__RepeatSpec__Group_4__0__Impl rule__RepeatSpec__Group_4__1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4515:2: rule__RepeatSpec__Group_4__0__Impl rule__RepeatSpec__Group_4__1
            {
            pushFollow(FOLLOW_rule__RepeatSpec__Group_4__0__Impl_in_rule__RepeatSpec__Group_4__09203);
            rule__RepeatSpec__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RepeatSpec__Group_4__1_in_rule__RepeatSpec__Group_4__09206);
            rule__RepeatSpec__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatSpec__Group_4__0"


    // $ANTLR start "rule__RepeatSpec__Group_4__0__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4522:1: rule__RepeatSpec__Group_4__0__Impl : ( ( rule__RepeatSpec__ValueAssignment_4_0 ) ) ;
    public final void rule__RepeatSpec__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4526:1: ( ( ( rule__RepeatSpec__ValueAssignment_4_0 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4527:1: ( ( rule__RepeatSpec__ValueAssignment_4_0 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4527:1: ( ( rule__RepeatSpec__ValueAssignment_4_0 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4528:1: ( rule__RepeatSpec__ValueAssignment_4_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatSpecAccess().getValueAssignment_4_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4529:1: ( rule__RepeatSpec__ValueAssignment_4_0 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4529:2: rule__RepeatSpec__ValueAssignment_4_0
            {
            pushFollow(FOLLOW_rule__RepeatSpec__ValueAssignment_4_0_in_rule__RepeatSpec__Group_4__0__Impl9233);
            rule__RepeatSpec__ValueAssignment_4_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatSpecAccess().getValueAssignment_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatSpec__Group_4__0__Impl"


    // $ANTLR start "rule__RepeatSpec__Group_4__1"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4539:1: rule__RepeatSpec__Group_4__1 : rule__RepeatSpec__Group_4__1__Impl rule__RepeatSpec__Group_4__2 ;
    public final void rule__RepeatSpec__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4543:1: ( rule__RepeatSpec__Group_4__1__Impl rule__RepeatSpec__Group_4__2 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4544:2: rule__RepeatSpec__Group_4__1__Impl rule__RepeatSpec__Group_4__2
            {
            pushFollow(FOLLOW_rule__RepeatSpec__Group_4__1__Impl_in_rule__RepeatSpec__Group_4__19263);
            rule__RepeatSpec__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RepeatSpec__Group_4__2_in_rule__RepeatSpec__Group_4__19266);
            rule__RepeatSpec__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatSpec__Group_4__1"


    // $ANTLR start "rule__RepeatSpec__Group_4__1__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4551:1: rule__RepeatSpec__Group_4__1__Impl : ( ( rule__RepeatSpec__Alternatives_4_1 )? ) ;
    public final void rule__RepeatSpec__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4555:1: ( ( ( rule__RepeatSpec__Alternatives_4_1 )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4556:1: ( ( rule__RepeatSpec__Alternatives_4_1 )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4556:1: ( ( rule__RepeatSpec__Alternatives_4_1 )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4557:1: ( rule__RepeatSpec__Alternatives_4_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatSpecAccess().getAlternatives_4_1()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4558:1: ( rule__RepeatSpec__Alternatives_4_1 )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( ((LA81_0>=28 && LA81_0<=29)) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4558:2: rule__RepeatSpec__Alternatives_4_1
                    {
                    pushFollow(FOLLOW_rule__RepeatSpec__Alternatives_4_1_in_rule__RepeatSpec__Group_4__1__Impl9293);
                    rule__RepeatSpec__Alternatives_4_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatSpecAccess().getAlternatives_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatSpec__Group_4__1__Impl"


    // $ANTLR start "rule__RepeatSpec__Group_4__2"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4568:1: rule__RepeatSpec__Group_4__2 : rule__RepeatSpec__Group_4__2__Impl ;
    public final void rule__RepeatSpec__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4572:1: ( rule__RepeatSpec__Group_4__2__Impl )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4573:2: rule__RepeatSpec__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__RepeatSpec__Group_4__2__Impl_in_rule__RepeatSpec__Group_4__29324);
            rule__RepeatSpec__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatSpec__Group_4__2"


    // $ANTLR start "rule__RepeatSpec__Group_4__2__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4579:1: rule__RepeatSpec__Group_4__2__Impl : ( ( rule__RepeatSpec__BeforeMarkerAssignment_4_2 ) ) ;
    public final void rule__RepeatSpec__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4583:1: ( ( ( rule__RepeatSpec__BeforeMarkerAssignment_4_2 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4584:1: ( ( rule__RepeatSpec__BeforeMarkerAssignment_4_2 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4584:1: ( ( rule__RepeatSpec__BeforeMarkerAssignment_4_2 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4585:1: ( rule__RepeatSpec__BeforeMarkerAssignment_4_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatSpecAccess().getBeforeMarkerAssignment_4_2()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4586:1: ( rule__RepeatSpec__BeforeMarkerAssignment_4_2 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4586:2: rule__RepeatSpec__BeforeMarkerAssignment_4_2
            {
            pushFollow(FOLLOW_rule__RepeatSpec__BeforeMarkerAssignment_4_2_in_rule__RepeatSpec__Group_4__2__Impl9351);
            rule__RepeatSpec__BeforeMarkerAssignment_4_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatSpecAccess().getBeforeMarkerAssignment_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatSpec__Group_4__2__Impl"


    // $ANTLR start "rule__RepeatSpec__Group_5__0"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4602:1: rule__RepeatSpec__Group_5__0 : rule__RepeatSpec__Group_5__0__Impl rule__RepeatSpec__Group_5__1 ;
    public final void rule__RepeatSpec__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4606:1: ( rule__RepeatSpec__Group_5__0__Impl rule__RepeatSpec__Group_5__1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4607:2: rule__RepeatSpec__Group_5__0__Impl rule__RepeatSpec__Group_5__1
            {
            pushFollow(FOLLOW_rule__RepeatSpec__Group_5__0__Impl_in_rule__RepeatSpec__Group_5__09387);
            rule__RepeatSpec__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RepeatSpec__Group_5__1_in_rule__RepeatSpec__Group_5__09390);
            rule__RepeatSpec__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatSpec__Group_5__0"


    // $ANTLR start "rule__RepeatSpec__Group_5__0__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4614:1: rule__RepeatSpec__Group_5__0__Impl : ( ( rule__RepeatSpec__ValueAssignment_5_0 ) ) ;
    public final void rule__RepeatSpec__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4618:1: ( ( ( rule__RepeatSpec__ValueAssignment_5_0 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4619:1: ( ( rule__RepeatSpec__ValueAssignment_5_0 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4619:1: ( ( rule__RepeatSpec__ValueAssignment_5_0 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4620:1: ( rule__RepeatSpec__ValueAssignment_5_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatSpecAccess().getValueAssignment_5_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4621:1: ( rule__RepeatSpec__ValueAssignment_5_0 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4621:2: rule__RepeatSpec__ValueAssignment_5_0
            {
            pushFollow(FOLLOW_rule__RepeatSpec__ValueAssignment_5_0_in_rule__RepeatSpec__Group_5__0__Impl9417);
            rule__RepeatSpec__ValueAssignment_5_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatSpecAccess().getValueAssignment_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatSpec__Group_5__0__Impl"


    // $ANTLR start "rule__RepeatSpec__Group_5__1"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4631:1: rule__RepeatSpec__Group_5__1 : rule__RepeatSpec__Group_5__1__Impl ;
    public final void rule__RepeatSpec__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4635:1: ( rule__RepeatSpec__Group_5__1__Impl )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4636:2: rule__RepeatSpec__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__RepeatSpec__Group_5__1__Impl_in_rule__RepeatSpec__Group_5__19447);
            rule__RepeatSpec__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatSpec__Group_5__1"


    // $ANTLR start "rule__RepeatSpec__Group_5__1__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4642:1: rule__RepeatSpec__Group_5__1__Impl : ( ( rule__RepeatSpec__TimesAssignment_5_1 ) ) ;
    public final void rule__RepeatSpec__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4646:1: ( ( ( rule__RepeatSpec__TimesAssignment_5_1 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4647:1: ( ( rule__RepeatSpec__TimesAssignment_5_1 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4647:1: ( ( rule__RepeatSpec__TimesAssignment_5_1 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4648:1: ( rule__RepeatSpec__TimesAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatSpecAccess().getTimesAssignment_5_1()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4649:1: ( rule__RepeatSpec__TimesAssignment_5_1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4649:2: rule__RepeatSpec__TimesAssignment_5_1
            {
            pushFollow(FOLLOW_rule__RepeatSpec__TimesAssignment_5_1_in_rule__RepeatSpec__Group_5__1__Impl9474);
            rule__RepeatSpec__TimesAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatSpecAccess().getTimesAssignment_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatSpec__Group_5__1__Impl"


    // $ANTLR start "rule__Repeat__Group_0__0"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4663:1: rule__Repeat__Group_0__0 : rule__Repeat__Group_0__0__Impl rule__Repeat__Group_0__1 ;
    public final void rule__Repeat__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4667:1: ( rule__Repeat__Group_0__0__Impl rule__Repeat__Group_0__1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4668:2: rule__Repeat__Group_0__0__Impl rule__Repeat__Group_0__1
            {
            pushFollow(FOLLOW_rule__Repeat__Group_0__0__Impl_in_rule__Repeat__Group_0__09508);
            rule__Repeat__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Repeat__Group_0__1_in_rule__Repeat__Group_0__09511);
            rule__Repeat__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repeat__Group_0__0"


    // $ANTLR start "rule__Repeat__Group_0__0__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4675:1: rule__Repeat__Group_0__0__Impl : ( ( rule__Repeat__Alternatives_0_0 ) ) ;
    public final void rule__Repeat__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4679:1: ( ( ( rule__Repeat__Alternatives_0_0 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4680:1: ( ( rule__Repeat__Alternatives_0_0 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4680:1: ( ( rule__Repeat__Alternatives_0_0 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4681:1: ( rule__Repeat__Alternatives_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatAccess().getAlternatives_0_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4682:1: ( rule__Repeat__Alternatives_0_0 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4682:2: rule__Repeat__Alternatives_0_0
            {
            pushFollow(FOLLOW_rule__Repeat__Alternatives_0_0_in_rule__Repeat__Group_0__0__Impl9538);
            rule__Repeat__Alternatives_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatAccess().getAlternatives_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repeat__Group_0__0__Impl"


    // $ANTLR start "rule__Repeat__Group_0__1"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4692:1: rule__Repeat__Group_0__1 : rule__Repeat__Group_0__1__Impl rule__Repeat__Group_0__2 ;
    public final void rule__Repeat__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4696:1: ( rule__Repeat__Group_0__1__Impl rule__Repeat__Group_0__2 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4697:2: rule__Repeat__Group_0__1__Impl rule__Repeat__Group_0__2
            {
            pushFollow(FOLLOW_rule__Repeat__Group_0__1__Impl_in_rule__Repeat__Group_0__19568);
            rule__Repeat__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Repeat__Group_0__2_in_rule__Repeat__Group_0__19571);
            rule__Repeat__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repeat__Group_0__1"


    // $ANTLR start "rule__Repeat__Group_0__1__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4704:1: rule__Repeat__Group_0__1__Impl : ( '[' ) ;
    public final void rule__Repeat__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4708:1: ( ( '[' ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4709:1: ( '[' )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4709:1: ( '[' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4710:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatAccess().getLeftSquareBracketKeyword_0_1()); 
            }
            match(input,67,FOLLOW_67_in_rule__Repeat__Group_0__1__Impl9599); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatAccess().getLeftSquareBracketKeyword_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repeat__Group_0__1__Impl"


    // $ANTLR start "rule__Repeat__Group_0__2"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4723:1: rule__Repeat__Group_0__2 : rule__Repeat__Group_0__2__Impl rule__Repeat__Group_0__3 ;
    public final void rule__Repeat__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4727:1: ( rule__Repeat__Group_0__2__Impl rule__Repeat__Group_0__3 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4728:2: rule__Repeat__Group_0__2__Impl rule__Repeat__Group_0__3
            {
            pushFollow(FOLLOW_rule__Repeat__Group_0__2__Impl_in_rule__Repeat__Group_0__29630);
            rule__Repeat__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Repeat__Group_0__3_in_rule__Repeat__Group_0__29633);
            rule__Repeat__Group_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repeat__Group_0__2"


    // $ANTLR start "rule__Repeat__Group_0__2__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4735:1: rule__Repeat__Group_0__2__Impl : ( ( rule__Repeat__OperationsAssignment_0_2 ) ) ;
    public final void rule__Repeat__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4739:1: ( ( ( rule__Repeat__OperationsAssignment_0_2 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4740:1: ( ( rule__Repeat__OperationsAssignment_0_2 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4740:1: ( ( rule__Repeat__OperationsAssignment_0_2 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4741:1: ( rule__Repeat__OperationsAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatAccess().getOperationsAssignment_0_2()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4742:1: ( rule__Repeat__OperationsAssignment_0_2 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4742:2: rule__Repeat__OperationsAssignment_0_2
            {
            pushFollow(FOLLOW_rule__Repeat__OperationsAssignment_0_2_in_rule__Repeat__Group_0__2__Impl9660);
            rule__Repeat__OperationsAssignment_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatAccess().getOperationsAssignment_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repeat__Group_0__2__Impl"


    // $ANTLR start "rule__Repeat__Group_0__3"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4752:1: rule__Repeat__Group_0__3 : rule__Repeat__Group_0__3__Impl rule__Repeat__Group_0__4 ;
    public final void rule__Repeat__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4756:1: ( rule__Repeat__Group_0__3__Impl rule__Repeat__Group_0__4 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4757:2: rule__Repeat__Group_0__3__Impl rule__Repeat__Group_0__4
            {
            pushFollow(FOLLOW_rule__Repeat__Group_0__3__Impl_in_rule__Repeat__Group_0__39690);
            rule__Repeat__Group_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Repeat__Group_0__4_in_rule__Repeat__Group_0__39693);
            rule__Repeat__Group_0__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repeat__Group_0__3"


    // $ANTLR start "rule__Repeat__Group_0__3__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4764:1: rule__Repeat__Group_0__3__Impl : ( ( rule__Repeat__Group_0_3__0 )* ) ;
    public final void rule__Repeat__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4768:1: ( ( ( rule__Repeat__Group_0_3__0 )* ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4769:1: ( ( rule__Repeat__Group_0_3__0 )* )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4769:1: ( ( rule__Repeat__Group_0_3__0 )* )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4770:1: ( rule__Repeat__Group_0_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatAccess().getGroup_0_3()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4771:1: ( rule__Repeat__Group_0_3__0 )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==57) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4771:2: rule__Repeat__Group_0_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Repeat__Group_0_3__0_in_rule__Repeat__Group_0__3__Impl9720);
            	    rule__Repeat__Group_0_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop82;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatAccess().getGroup_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repeat__Group_0__3__Impl"


    // $ANTLR start "rule__Repeat__Group_0__4"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4781:1: rule__Repeat__Group_0__4 : rule__Repeat__Group_0__4__Impl rule__Repeat__Group_0__5 ;
    public final void rule__Repeat__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4785:1: ( rule__Repeat__Group_0__4__Impl rule__Repeat__Group_0__5 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4786:2: rule__Repeat__Group_0__4__Impl rule__Repeat__Group_0__5
            {
            pushFollow(FOLLOW_rule__Repeat__Group_0__4__Impl_in_rule__Repeat__Group_0__49751);
            rule__Repeat__Group_0__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Repeat__Group_0__5_in_rule__Repeat__Group_0__49754);
            rule__Repeat__Group_0__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repeat__Group_0__4"


    // $ANTLR start "rule__Repeat__Group_0__4__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4793:1: rule__Repeat__Group_0__4__Impl : ( ']' ) ;
    public final void rule__Repeat__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4797:1: ( ( ']' ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4798:1: ( ']' )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4798:1: ( ']' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4799:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatAccess().getRightSquareBracketKeyword_0_4()); 
            }
            match(input,68,FOLLOW_68_in_rule__Repeat__Group_0__4__Impl9782); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatAccess().getRightSquareBracketKeyword_0_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repeat__Group_0__4__Impl"


    // $ANTLR start "rule__Repeat__Group_0__5"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4812:1: rule__Repeat__Group_0__5 : rule__Repeat__Group_0__5__Impl rule__Repeat__Group_0__6 ;
    public final void rule__Repeat__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4816:1: ( rule__Repeat__Group_0__5__Impl rule__Repeat__Group_0__6 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4817:2: rule__Repeat__Group_0__5__Impl rule__Repeat__Group_0__6
            {
            pushFollow(FOLLOW_rule__Repeat__Group_0__5__Impl_in_rule__Repeat__Group_0__59813);
            rule__Repeat__Group_0__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Repeat__Group_0__6_in_rule__Repeat__Group_0__59816);
            rule__Repeat__Group_0__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repeat__Group_0__5"


    // $ANTLR start "rule__Repeat__Group_0__5__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4824:1: rule__Repeat__Group_0__5__Impl : ( ( 'to' )? ) ;
    public final void rule__Repeat__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4828:1: ( ( ( 'to' )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4829:1: ( ( 'to' )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4829:1: ( ( 'to' )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4830:1: ( 'to' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatAccess().getToKeyword_0_5()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4831:1: ( 'to' )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==66) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4832:2: 'to'
                    {
                    match(input,66,FOLLOW_66_in_rule__Repeat__Group_0__5__Impl9845); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatAccess().getToKeyword_0_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repeat__Group_0__5__Impl"


    // $ANTLR start "rule__Repeat__Group_0__6"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4843:1: rule__Repeat__Group_0__6 : rule__Repeat__Group_0__6__Impl ;
    public final void rule__Repeat__Group_0__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4847:1: ( rule__Repeat__Group_0__6__Impl )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4848:2: rule__Repeat__Group_0__6__Impl
            {
            pushFollow(FOLLOW_rule__Repeat__Group_0__6__Impl_in_rule__Repeat__Group_0__69878);
            rule__Repeat__Group_0__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repeat__Group_0__6"


    // $ANTLR start "rule__Repeat__Group_0__6__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4854:1: rule__Repeat__Group_0__6__Impl : ( ( rule__Repeat__SpecAssignment_0_6 ) ) ;
    public final void rule__Repeat__Group_0__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4858:1: ( ( ( rule__Repeat__SpecAssignment_0_6 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4859:1: ( ( rule__Repeat__SpecAssignment_0_6 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4859:1: ( ( rule__Repeat__SpecAssignment_0_6 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4860:1: ( rule__Repeat__SpecAssignment_0_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatAccess().getSpecAssignment_0_6()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4861:1: ( rule__Repeat__SpecAssignment_0_6 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4861:2: rule__Repeat__SpecAssignment_0_6
            {
            pushFollow(FOLLOW_rule__Repeat__SpecAssignment_0_6_in_rule__Repeat__Group_0__6__Impl9905);
            rule__Repeat__SpecAssignment_0_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatAccess().getSpecAssignment_0_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repeat__Group_0__6__Impl"


    // $ANTLR start "rule__Repeat__Group_0_3__0"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4885:1: rule__Repeat__Group_0_3__0 : rule__Repeat__Group_0_3__0__Impl rule__Repeat__Group_0_3__1 ;
    public final void rule__Repeat__Group_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4889:1: ( rule__Repeat__Group_0_3__0__Impl rule__Repeat__Group_0_3__1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4890:2: rule__Repeat__Group_0_3__0__Impl rule__Repeat__Group_0_3__1
            {
            pushFollow(FOLLOW_rule__Repeat__Group_0_3__0__Impl_in_rule__Repeat__Group_0_3__09949);
            rule__Repeat__Group_0_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Repeat__Group_0_3__1_in_rule__Repeat__Group_0_3__09952);
            rule__Repeat__Group_0_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repeat__Group_0_3__0"


    // $ANTLR start "rule__Repeat__Group_0_3__0__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4897:1: rule__Repeat__Group_0_3__0__Impl : ( ',' ) ;
    public final void rule__Repeat__Group_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4901:1: ( ( ',' ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4902:1: ( ',' )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4902:1: ( ',' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4903:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatAccess().getCommaKeyword_0_3_0()); 
            }
            match(input,57,FOLLOW_57_in_rule__Repeat__Group_0_3__0__Impl9980); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatAccess().getCommaKeyword_0_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repeat__Group_0_3__0__Impl"


    // $ANTLR start "rule__Repeat__Group_0_3__1"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4916:1: rule__Repeat__Group_0_3__1 : rule__Repeat__Group_0_3__1__Impl ;
    public final void rule__Repeat__Group_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4920:1: ( rule__Repeat__Group_0_3__1__Impl )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4921:2: rule__Repeat__Group_0_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Repeat__Group_0_3__1__Impl_in_rule__Repeat__Group_0_3__110011);
            rule__Repeat__Group_0_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repeat__Group_0_3__1"


    // $ANTLR start "rule__Repeat__Group_0_3__1__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4927:1: rule__Repeat__Group_0_3__1__Impl : ( ( rule__Repeat__OperationsAssignment_0_3_1 ) ) ;
    public final void rule__Repeat__Group_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4931:1: ( ( ( rule__Repeat__OperationsAssignment_0_3_1 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4932:1: ( ( rule__Repeat__OperationsAssignment_0_3_1 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4932:1: ( ( rule__Repeat__OperationsAssignment_0_3_1 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4933:1: ( rule__Repeat__OperationsAssignment_0_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatAccess().getOperationsAssignment_0_3_1()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4934:1: ( rule__Repeat__OperationsAssignment_0_3_1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4934:2: rule__Repeat__OperationsAssignment_0_3_1
            {
            pushFollow(FOLLOW_rule__Repeat__OperationsAssignment_0_3_1_in_rule__Repeat__Group_0_3__1__Impl10038);
            rule__Repeat__OperationsAssignment_0_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatAccess().getOperationsAssignment_0_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repeat__Group_0_3__1__Impl"


    // $ANTLR start "rule__Repeat__Group_1__0"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4948:1: rule__Repeat__Group_1__0 : rule__Repeat__Group_1__0__Impl rule__Repeat__Group_1__1 ;
    public final void rule__Repeat__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4952:1: ( rule__Repeat__Group_1__0__Impl rule__Repeat__Group_1__1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4953:2: rule__Repeat__Group_1__0__Impl rule__Repeat__Group_1__1
            {
            pushFollow(FOLLOW_rule__Repeat__Group_1__0__Impl_in_rule__Repeat__Group_1__010072);
            rule__Repeat__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Repeat__Group_1__1_in_rule__Repeat__Group_1__010075);
            rule__Repeat__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repeat__Group_1__0"


    // $ANTLR start "rule__Repeat__Group_1__0__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4960:1: rule__Repeat__Group_1__0__Impl : ( '[' ) ;
    public final void rule__Repeat__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4964:1: ( ( '[' ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4965:1: ( '[' )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4965:1: ( '[' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4966:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatAccess().getLeftSquareBracketKeyword_1_0()); 
            }
            match(input,67,FOLLOW_67_in_rule__Repeat__Group_1__0__Impl10103); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatAccess().getLeftSquareBracketKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repeat__Group_1__0__Impl"


    // $ANTLR start "rule__Repeat__Group_1__1"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4979:1: rule__Repeat__Group_1__1 : rule__Repeat__Group_1__1__Impl rule__Repeat__Group_1__2 ;
    public final void rule__Repeat__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4983:1: ( rule__Repeat__Group_1__1__Impl rule__Repeat__Group_1__2 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4984:2: rule__Repeat__Group_1__1__Impl rule__Repeat__Group_1__2
            {
            pushFollow(FOLLOW_rule__Repeat__Group_1__1__Impl_in_rule__Repeat__Group_1__110134);
            rule__Repeat__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Repeat__Group_1__2_in_rule__Repeat__Group_1__110137);
            rule__Repeat__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repeat__Group_1__1"


    // $ANTLR start "rule__Repeat__Group_1__1__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4991:1: rule__Repeat__Group_1__1__Impl : ( ( rule__Repeat__OperationsAssignment_1_1 ) ) ;
    public final void rule__Repeat__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4995:1: ( ( ( rule__Repeat__OperationsAssignment_1_1 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4996:1: ( ( rule__Repeat__OperationsAssignment_1_1 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4996:1: ( ( rule__Repeat__OperationsAssignment_1_1 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4997:1: ( rule__Repeat__OperationsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatAccess().getOperationsAssignment_1_1()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4998:1: ( rule__Repeat__OperationsAssignment_1_1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4998:2: rule__Repeat__OperationsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Repeat__OperationsAssignment_1_1_in_rule__Repeat__Group_1__1__Impl10164);
            rule__Repeat__OperationsAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatAccess().getOperationsAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repeat__Group_1__1__Impl"


    // $ANTLR start "rule__Repeat__Group_1__2"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5008:1: rule__Repeat__Group_1__2 : rule__Repeat__Group_1__2__Impl rule__Repeat__Group_1__3 ;
    public final void rule__Repeat__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5012:1: ( rule__Repeat__Group_1__2__Impl rule__Repeat__Group_1__3 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5013:2: rule__Repeat__Group_1__2__Impl rule__Repeat__Group_1__3
            {
            pushFollow(FOLLOW_rule__Repeat__Group_1__2__Impl_in_rule__Repeat__Group_1__210194);
            rule__Repeat__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Repeat__Group_1__3_in_rule__Repeat__Group_1__210197);
            rule__Repeat__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repeat__Group_1__2"


    // $ANTLR start "rule__Repeat__Group_1__2__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5020:1: rule__Repeat__Group_1__2__Impl : ( ( rule__Repeat__Group_1_2__0 )* ) ;
    public final void rule__Repeat__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5024:1: ( ( ( rule__Repeat__Group_1_2__0 )* ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5025:1: ( ( rule__Repeat__Group_1_2__0 )* )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5025:1: ( ( rule__Repeat__Group_1_2__0 )* )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5026:1: ( rule__Repeat__Group_1_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatAccess().getGroup_1_2()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5027:1: ( rule__Repeat__Group_1_2__0 )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==57) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5027:2: rule__Repeat__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Repeat__Group_1_2__0_in_rule__Repeat__Group_1__2__Impl10224);
            	    rule__Repeat__Group_1_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop84;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatAccess().getGroup_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repeat__Group_1__2__Impl"


    // $ANTLR start "rule__Repeat__Group_1__3"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5037:1: rule__Repeat__Group_1__3 : rule__Repeat__Group_1__3__Impl rule__Repeat__Group_1__4 ;
    public final void rule__Repeat__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5041:1: ( rule__Repeat__Group_1__3__Impl rule__Repeat__Group_1__4 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5042:2: rule__Repeat__Group_1__3__Impl rule__Repeat__Group_1__4
            {
            pushFollow(FOLLOW_rule__Repeat__Group_1__3__Impl_in_rule__Repeat__Group_1__310255);
            rule__Repeat__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Repeat__Group_1__4_in_rule__Repeat__Group_1__310258);
            rule__Repeat__Group_1__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repeat__Group_1__3"


    // $ANTLR start "rule__Repeat__Group_1__3__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5049:1: rule__Repeat__Group_1__3__Impl : ( ']' ) ;
    public final void rule__Repeat__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5053:1: ( ( ']' ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5054:1: ( ']' )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5054:1: ( ']' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5055:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatAccess().getRightSquareBracketKeyword_1_3()); 
            }
            match(input,68,FOLLOW_68_in_rule__Repeat__Group_1__3__Impl10286); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatAccess().getRightSquareBracketKeyword_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repeat__Group_1__3__Impl"


    // $ANTLR start "rule__Repeat__Group_1__4"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5068:1: rule__Repeat__Group_1__4 : rule__Repeat__Group_1__4__Impl rule__Repeat__Group_1__5 ;
    public final void rule__Repeat__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5072:1: ( rule__Repeat__Group_1__4__Impl rule__Repeat__Group_1__5 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5073:2: rule__Repeat__Group_1__4__Impl rule__Repeat__Group_1__5
            {
            pushFollow(FOLLOW_rule__Repeat__Group_1__4__Impl_in_rule__Repeat__Group_1__410317);
            rule__Repeat__Group_1__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Repeat__Group_1__5_in_rule__Repeat__Group_1__410320);
            rule__Repeat__Group_1__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repeat__Group_1__4"


    // $ANTLR start "rule__Repeat__Group_1__4__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5080:1: rule__Repeat__Group_1__4__Impl : ( ( rule__Repeat__Group_1_4__0 )? ) ;
    public final void rule__Repeat__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5084:1: ( ( ( rule__Repeat__Group_1_4__0 )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5085:1: ( ( rule__Repeat__Group_1_4__0 )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5085:1: ( ( rule__Repeat__Group_1_4__0 )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5086:1: ( rule__Repeat__Group_1_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatAccess().getGroup_1_4()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5087:1: ( rule__Repeat__Group_1_4__0 )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==57) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5087:2: rule__Repeat__Group_1_4__0
                    {
                    pushFollow(FOLLOW_rule__Repeat__Group_1_4__0_in_rule__Repeat__Group_1__4__Impl10347);
                    rule__Repeat__Group_1_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatAccess().getGroup_1_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repeat__Group_1__4__Impl"


    // $ANTLR start "rule__Repeat__Group_1__5"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5097:1: rule__Repeat__Group_1__5 : rule__Repeat__Group_1__5__Impl rule__Repeat__Group_1__6 ;
    public final void rule__Repeat__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5101:1: ( rule__Repeat__Group_1__5__Impl rule__Repeat__Group_1__6 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5102:2: rule__Repeat__Group_1__5__Impl rule__Repeat__Group_1__6
            {
            pushFollow(FOLLOW_rule__Repeat__Group_1__5__Impl_in_rule__Repeat__Group_1__510378);
            rule__Repeat__Group_1__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Repeat__Group_1__6_in_rule__Repeat__Group_1__510381);
            rule__Repeat__Group_1__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repeat__Group_1__5"


    // $ANTLR start "rule__Repeat__Group_1__5__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5109:1: rule__Repeat__Group_1__5__Impl : ( ( 'to' )? ) ;
    public final void rule__Repeat__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5113:1: ( ( ( 'to' )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5114:1: ( ( 'to' )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5114:1: ( ( 'to' )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5115:1: ( 'to' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatAccess().getToKeyword_1_5()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5116:1: ( 'to' )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==66) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5117:2: 'to'
                    {
                    match(input,66,FOLLOW_66_in_rule__Repeat__Group_1__5__Impl10410); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatAccess().getToKeyword_1_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repeat__Group_1__5__Impl"


    // $ANTLR start "rule__Repeat__Group_1__6"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5128:1: rule__Repeat__Group_1__6 : rule__Repeat__Group_1__6__Impl ;
    public final void rule__Repeat__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5132:1: ( rule__Repeat__Group_1__6__Impl )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5133:2: rule__Repeat__Group_1__6__Impl
            {
            pushFollow(FOLLOW_rule__Repeat__Group_1__6__Impl_in_rule__Repeat__Group_1__610443);
            rule__Repeat__Group_1__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repeat__Group_1__6"


    // $ANTLR start "rule__Repeat__Group_1__6__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5139:1: rule__Repeat__Group_1__6__Impl : ( ( rule__Repeat__SpecAssignment_1_6 ) ) ;
    public final void rule__Repeat__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5143:1: ( ( ( rule__Repeat__SpecAssignment_1_6 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5144:1: ( ( rule__Repeat__SpecAssignment_1_6 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5144:1: ( ( rule__Repeat__SpecAssignment_1_6 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5145:1: ( rule__Repeat__SpecAssignment_1_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatAccess().getSpecAssignment_1_6()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5146:1: ( rule__Repeat__SpecAssignment_1_6 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5146:2: rule__Repeat__SpecAssignment_1_6
            {
            pushFollow(FOLLOW_rule__Repeat__SpecAssignment_1_6_in_rule__Repeat__Group_1__6__Impl10470);
            rule__Repeat__SpecAssignment_1_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatAccess().getSpecAssignment_1_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repeat__Group_1__6__Impl"


    // $ANTLR start "rule__Repeat__Group_1_2__0"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5170:1: rule__Repeat__Group_1_2__0 : rule__Repeat__Group_1_2__0__Impl rule__Repeat__Group_1_2__1 ;
    public final void rule__Repeat__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5174:1: ( rule__Repeat__Group_1_2__0__Impl rule__Repeat__Group_1_2__1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5175:2: rule__Repeat__Group_1_2__0__Impl rule__Repeat__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__Repeat__Group_1_2__0__Impl_in_rule__Repeat__Group_1_2__010514);
            rule__Repeat__Group_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Repeat__Group_1_2__1_in_rule__Repeat__Group_1_2__010517);
            rule__Repeat__Group_1_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repeat__Group_1_2__0"


    // $ANTLR start "rule__Repeat__Group_1_2__0__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5182:1: rule__Repeat__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__Repeat__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5186:1: ( ( ',' ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5187:1: ( ',' )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5187:1: ( ',' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5188:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatAccess().getCommaKeyword_1_2_0()); 
            }
            match(input,57,FOLLOW_57_in_rule__Repeat__Group_1_2__0__Impl10545); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatAccess().getCommaKeyword_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repeat__Group_1_2__0__Impl"


    // $ANTLR start "rule__Repeat__Group_1_2__1"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5201:1: rule__Repeat__Group_1_2__1 : rule__Repeat__Group_1_2__1__Impl ;
    public final void rule__Repeat__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5205:1: ( rule__Repeat__Group_1_2__1__Impl )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5206:2: rule__Repeat__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Repeat__Group_1_2__1__Impl_in_rule__Repeat__Group_1_2__110576);
            rule__Repeat__Group_1_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repeat__Group_1_2__1"


    // $ANTLR start "rule__Repeat__Group_1_2__1__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5212:1: rule__Repeat__Group_1_2__1__Impl : ( ( rule__Repeat__OperationsAssignment_1_2_1 ) ) ;
    public final void rule__Repeat__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5216:1: ( ( ( rule__Repeat__OperationsAssignment_1_2_1 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5217:1: ( ( rule__Repeat__OperationsAssignment_1_2_1 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5217:1: ( ( rule__Repeat__OperationsAssignment_1_2_1 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5218:1: ( rule__Repeat__OperationsAssignment_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatAccess().getOperationsAssignment_1_2_1()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5219:1: ( rule__Repeat__OperationsAssignment_1_2_1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5219:2: rule__Repeat__OperationsAssignment_1_2_1
            {
            pushFollow(FOLLOW_rule__Repeat__OperationsAssignment_1_2_1_in_rule__Repeat__Group_1_2__1__Impl10603);
            rule__Repeat__OperationsAssignment_1_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatAccess().getOperationsAssignment_1_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repeat__Group_1_2__1__Impl"


    // $ANTLR start "rule__Repeat__Group_1_4__0"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5233:1: rule__Repeat__Group_1_4__0 : rule__Repeat__Group_1_4__0__Impl rule__Repeat__Group_1_4__1 ;
    public final void rule__Repeat__Group_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5237:1: ( rule__Repeat__Group_1_4__0__Impl rule__Repeat__Group_1_4__1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5238:2: rule__Repeat__Group_1_4__0__Impl rule__Repeat__Group_1_4__1
            {
            pushFollow(FOLLOW_rule__Repeat__Group_1_4__0__Impl_in_rule__Repeat__Group_1_4__010637);
            rule__Repeat__Group_1_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Repeat__Group_1_4__1_in_rule__Repeat__Group_1_4__010640);
            rule__Repeat__Group_1_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repeat__Group_1_4__0"


    // $ANTLR start "rule__Repeat__Group_1_4__0__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5245:1: rule__Repeat__Group_1_4__0__Impl : ( ',' ) ;
    public final void rule__Repeat__Group_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5249:1: ( ( ',' ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5250:1: ( ',' )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5250:1: ( ',' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5251:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatAccess().getCommaKeyword_1_4_0()); 
            }
            match(input,57,FOLLOW_57_in_rule__Repeat__Group_1_4__0__Impl10668); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatAccess().getCommaKeyword_1_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repeat__Group_1_4__0__Impl"


    // $ANTLR start "rule__Repeat__Group_1_4__1"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5264:1: rule__Repeat__Group_1_4__1 : rule__Repeat__Group_1_4__1__Impl ;
    public final void rule__Repeat__Group_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5268:1: ( rule__Repeat__Group_1_4__1__Impl )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5269:2: rule__Repeat__Group_1_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Repeat__Group_1_4__1__Impl_in_rule__Repeat__Group_1_4__110699);
            rule__Repeat__Group_1_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repeat__Group_1_4__1"


    // $ANTLR start "rule__Repeat__Group_1_4__1__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5275:1: rule__Repeat__Group_1_4__1__Impl : ( ( rule__Repeat__Alternatives_1_4_1 ) ) ;
    public final void rule__Repeat__Group_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5279:1: ( ( ( rule__Repeat__Alternatives_1_4_1 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5280:1: ( ( rule__Repeat__Alternatives_1_4_1 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5280:1: ( ( rule__Repeat__Alternatives_1_4_1 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5281:1: ( rule__Repeat__Alternatives_1_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatAccess().getAlternatives_1_4_1()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5282:1: ( rule__Repeat__Alternatives_1_4_1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5282:2: rule__Repeat__Alternatives_1_4_1
            {
            pushFollow(FOLLOW_rule__Repeat__Alternatives_1_4_1_in_rule__Repeat__Group_1_4__1__Impl10726);
            rule__Repeat__Alternatives_1_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatAccess().getAlternatives_1_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repeat__Group_1_4__1__Impl"


    // $ANTLR start "rule__Range__Group__0"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5296:1: rule__Range__Group__0 : rule__Range__Group__0__Impl rule__Range__Group__1 ;
    public final void rule__Range__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5300:1: ( rule__Range__Group__0__Impl rule__Range__Group__1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5301:2: rule__Range__Group__0__Impl rule__Range__Group__1
            {
            pushFollow(FOLLOW_rule__Range__Group__0__Impl_in_rule__Range__Group__010760);
            rule__Range__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Range__Group__1_in_rule__Range__Group__010763);
            rule__Range__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__0"


    // $ANTLR start "rule__Range__Group__0__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5308:1: rule__Range__Group__0__Impl : ( ( rule__Range__MinAssignment_0 ) ) ;
    public final void rule__Range__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5312:1: ( ( ( rule__Range__MinAssignment_0 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5313:1: ( ( rule__Range__MinAssignment_0 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5313:1: ( ( rule__Range__MinAssignment_0 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5314:1: ( rule__Range__MinAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getMinAssignment_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5315:1: ( rule__Range__MinAssignment_0 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5315:2: rule__Range__MinAssignment_0
            {
            pushFollow(FOLLOW_rule__Range__MinAssignment_0_in_rule__Range__Group__0__Impl10790);
            rule__Range__MinAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeAccess().getMinAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__0__Impl"


    // $ANTLR start "rule__Range__Group__1"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5325:1: rule__Range__Group__1 : rule__Range__Group__1__Impl rule__Range__Group__2 ;
    public final void rule__Range__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5329:1: ( rule__Range__Group__1__Impl rule__Range__Group__2 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5330:2: rule__Range__Group__1__Impl rule__Range__Group__2
            {
            pushFollow(FOLLOW_rule__Range__Group__1__Impl_in_rule__Range__Group__110820);
            rule__Range__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Range__Group__2_in_rule__Range__Group__110823);
            rule__Range__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__1"


    // $ANTLR start "rule__Range__Group__1__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5337:1: rule__Range__Group__1__Impl : ( '-' ) ;
    public final void rule__Range__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5341:1: ( ( '-' ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5342:1: ( '-' )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5342:1: ( '-' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5343:1: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getHyphenMinusKeyword_1()); 
            }
            match(input,69,FOLLOW_69_in_rule__Range__Group__1__Impl10851); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeAccess().getHyphenMinusKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__1__Impl"


    // $ANTLR start "rule__Range__Group__2"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5356:1: rule__Range__Group__2 : rule__Range__Group__2__Impl ;
    public final void rule__Range__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5360:1: ( rule__Range__Group__2__Impl )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5361:2: rule__Range__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Range__Group__2__Impl_in_rule__Range__Group__210882);
            rule__Range__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__2"


    // $ANTLR start "rule__Range__Group__2__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5367:1: rule__Range__Group__2__Impl : ( ( rule__Range__MaxAssignment_2 ) ) ;
    public final void rule__Range__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5371:1: ( ( ( rule__Range__MaxAssignment_2 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5372:1: ( ( rule__Range__MaxAssignment_2 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5372:1: ( ( rule__Range__MaxAssignment_2 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5373:1: ( rule__Range__MaxAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getMaxAssignment_2()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5374:1: ( rule__Range__MaxAssignment_2 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5374:2: rule__Range__MaxAssignment_2
            {
            pushFollow(FOLLOW_rule__Range__MaxAssignment_2_in_rule__Range__Group__2__Impl10909);
            rule__Range__MaxAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeAccess().getMaxAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__2__Impl"


    // $ANTLR start "rule__Instruction__UnorderedGroup_1"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5391:1: rule__Instruction__UnorderedGroup_1 : rule__Instruction__UnorderedGroup_1__0 {...}?;
    public final void rule__Instruction__UnorderedGroup_1() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getInstructionAccess().getUnorderedGroup_1());
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5396:1: ( rule__Instruction__UnorderedGroup_1__0 {...}?)
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5397:2: rule__Instruction__UnorderedGroup_1__0 {...}?
            {
            pushFollow(FOLLOW_rule__Instruction__UnorderedGroup_1__0_in_rule__Instruction__UnorderedGroup_110946);
            rule__Instruction__UnorderedGroup_1__0();

            state._fsp--;
            if (state.failed) return ;
            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getInstructionAccess().getUnorderedGroup_1()) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "rule__Instruction__UnorderedGroup_1", "getUnorderedGroupHelper().canLeave(grammarAccess.getInstructionAccess().getUnorderedGroup_1())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getInstructionAccess().getUnorderedGroup_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__UnorderedGroup_1"


    // $ANTLR start "rule__Instruction__UnorderedGroup_1__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5408:1: rule__Instruction__UnorderedGroup_1__Impl : ( ({...}? => ( ( ( rule__Instruction__IdAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__Instruction__LabelAssignment_1_1 ) ) ) ) ) ;
    public final void rule__Instruction__UnorderedGroup_1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5413:1: ( ( ({...}? => ( ( ( rule__Instruction__IdAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__Instruction__LabelAssignment_1_1 ) ) ) ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5414:3: ( ({...}? => ( ( ( rule__Instruction__IdAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__Instruction__LabelAssignment_1_1 ) ) ) ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5414:3: ( ({...}? => ( ( ( rule__Instruction__IdAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__Instruction__LabelAssignment_1_1 ) ) ) ) )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( LA87_0 ==RULE_ID && getUnorderedGroupHelper().canSelect(grammarAccess.getInstructionAccess().getUnorderedGroup_1(), 0) ) {
                alt87=1;
            }
            else if ( LA87_0 ==RULE_STRING && getUnorderedGroupHelper().canSelect(grammarAccess.getInstructionAccess().getUnorderedGroup_1(), 1) ) {
                alt87=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }
            switch (alt87) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5416:4: ({...}? => ( ( ( rule__Instruction__IdAssignment_1_0 ) ) ) )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5416:4: ({...}? => ( ( ( rule__Instruction__IdAssignment_1_0 ) ) ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5417:5: {...}? => ( ( ( rule__Instruction__IdAssignment_1_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInstructionAccess().getUnorderedGroup_1(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Instruction__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getInstructionAccess().getUnorderedGroup_1(), 0)");
                    }
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5417:108: ( ( ( rule__Instruction__IdAssignment_1_0 ) ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5418:6: ( ( rule__Instruction__IdAssignment_1_0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getInstructionAccess().getUnorderedGroup_1(), 0);
                    selected = true;
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5424:6: ( ( rule__Instruction__IdAssignment_1_0 ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5426:7: ( rule__Instruction__IdAssignment_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInstructionAccess().getIdAssignment_1_0()); 
                    }
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5427:7: ( rule__Instruction__IdAssignment_1_0 )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5427:8: rule__Instruction__IdAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__Instruction__IdAssignment_1_0_in_rule__Instruction__UnorderedGroup_1__Impl11035);
                    rule__Instruction__IdAssignment_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInstructionAccess().getIdAssignment_1_0()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5433:4: ({...}? => ( ( ( rule__Instruction__LabelAssignment_1_1 ) ) ) )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5433:4: ({...}? => ( ( ( rule__Instruction__LabelAssignment_1_1 ) ) ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5434:5: {...}? => ( ( ( rule__Instruction__LabelAssignment_1_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInstructionAccess().getUnorderedGroup_1(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Instruction__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getInstructionAccess().getUnorderedGroup_1(), 1)");
                    }
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5434:108: ( ( ( rule__Instruction__LabelAssignment_1_1 ) ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5435:6: ( ( rule__Instruction__LabelAssignment_1_1 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getInstructionAccess().getUnorderedGroup_1(), 1);
                    selected = true;
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5441:6: ( ( rule__Instruction__LabelAssignment_1_1 ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5443:7: ( rule__Instruction__LabelAssignment_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInstructionAccess().getLabelAssignment_1_1()); 
                    }
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5444:7: ( rule__Instruction__LabelAssignment_1_1 )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5444:8: rule__Instruction__LabelAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__Instruction__LabelAssignment_1_1_in_rule__Instruction__UnorderedGroup_1__Impl11126);
                    rule__Instruction__LabelAssignment_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInstructionAccess().getLabelAssignment_1_1()); 
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInstructionAccess().getUnorderedGroup_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__UnorderedGroup_1__Impl"


    // $ANTLR start "rule__Instruction__UnorderedGroup_1__0"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5459:1: rule__Instruction__UnorderedGroup_1__0 : rule__Instruction__UnorderedGroup_1__Impl ( rule__Instruction__UnorderedGroup_1__1 )? ;
    public final void rule__Instruction__UnorderedGroup_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5463:1: ( rule__Instruction__UnorderedGroup_1__Impl ( rule__Instruction__UnorderedGroup_1__1 )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5464:2: rule__Instruction__UnorderedGroup_1__Impl ( rule__Instruction__UnorderedGroup_1__1 )?
            {
            pushFollow(FOLLOW_rule__Instruction__UnorderedGroup_1__Impl_in_rule__Instruction__UnorderedGroup_1__011185);
            rule__Instruction__UnorderedGroup_1__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5465:2: ( rule__Instruction__UnorderedGroup_1__1 )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( LA88_0 ==RULE_ID && getUnorderedGroupHelper().canSelect(grammarAccess.getInstructionAccess().getUnorderedGroup_1(), 0) ) {
                alt88=1;
            }
            else if ( LA88_0 ==RULE_STRING && getUnorderedGroupHelper().canSelect(grammarAccess.getInstructionAccess().getUnorderedGroup_1(), 1) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:0:0: rule__Instruction__UnorderedGroup_1__1
                    {
                    pushFollow(FOLLOW_rule__Instruction__UnorderedGroup_1__1_in_rule__Instruction__UnorderedGroup_1__011188);
                    rule__Instruction__UnorderedGroup_1__1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__UnorderedGroup_1__0"


    // $ANTLR start "rule__Instruction__UnorderedGroup_1__1"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5472:1: rule__Instruction__UnorderedGroup_1__1 : rule__Instruction__UnorderedGroup_1__Impl ;
    public final void rule__Instruction__UnorderedGroup_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5476:1: ( rule__Instruction__UnorderedGroup_1__Impl )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5477:2: rule__Instruction__UnorderedGroup_1__Impl
            {
            pushFollow(FOLLOW_rule__Instruction__UnorderedGroup_1__Impl_in_rule__Instruction__UnorderedGroup_1__111213);
            rule__Instruction__UnorderedGroup_1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__UnorderedGroup_1__1"


    // $ANTLR start "rule__Row__UnorderedGroup_1"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5488:1: rule__Row__UnorderedGroup_1 : ( rule__Row__UnorderedGroup_1__0 )? ;
    public final void rule__Row__UnorderedGroup_1() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getRowAccess().getUnorderedGroup_1());
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5493:1: ( ( rule__Row__UnorderedGroup_1__0 )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5494:2: ( rule__Row__UnorderedGroup_1__0 )?
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5494:2: ( rule__Row__UnorderedGroup_1__0 )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( LA89_0 ==72 && getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_1(), 0) ) {
                alt89=1;
            }
            else if ( LA89_0 ==73 && getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_1(), 1) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:0:0: rule__Row__UnorderedGroup_1__0
                    {
                    pushFollow(FOLLOW_rule__Row__UnorderedGroup_1__0_in_rule__Row__UnorderedGroup_111241);
                    rule__Row__UnorderedGroup_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getRowAccess().getUnorderedGroup_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__UnorderedGroup_1"


    // $ANTLR start "rule__Row__UnorderedGroup_1__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5504:1: rule__Row__UnorderedGroup_1__Impl : ( ({...}? => ( ( ( rule__Row__ShortRowAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__Row__LongRowAssignment_1_1 ) ) ) ) ) ;
    public final void rule__Row__UnorderedGroup_1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5509:1: ( ( ({...}? => ( ( ( rule__Row__ShortRowAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__Row__LongRowAssignment_1_1 ) ) ) ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5510:3: ( ({...}? => ( ( ( rule__Row__ShortRowAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__Row__LongRowAssignment_1_1 ) ) ) ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5510:3: ( ({...}? => ( ( ( rule__Row__ShortRowAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__Row__LongRowAssignment_1_1 ) ) ) ) )
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( LA90_0 ==72 && getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_1(), 0) ) {
                alt90=1;
            }
            else if ( LA90_0 ==73 && getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_1(), 1) ) {
                alt90=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }
            switch (alt90) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5512:4: ({...}? => ( ( ( rule__Row__ShortRowAssignment_1_0 ) ) ) )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5512:4: ({...}? => ( ( ( rule__Row__ShortRowAssignment_1_0 ) ) ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5513:5: {...}? => ( ( ( rule__Row__ShortRowAssignment_1_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_1(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Row__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_1(), 0)");
                    }
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5513:100: ( ( ( rule__Row__ShortRowAssignment_1_0 ) ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5514:6: ( ( rule__Row__ShortRowAssignment_1_0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getRowAccess().getUnorderedGroup_1(), 0);
                    selected = true;
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5520:6: ( ( rule__Row__ShortRowAssignment_1_0 ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5522:7: ( rule__Row__ShortRowAssignment_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRowAccess().getShortRowAssignment_1_0()); 
                    }
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5523:7: ( rule__Row__ShortRowAssignment_1_0 )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5523:8: rule__Row__ShortRowAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__Row__ShortRowAssignment_1_0_in_rule__Row__UnorderedGroup_1__Impl11328);
                    rule__Row__ShortRowAssignment_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRowAccess().getShortRowAssignment_1_0()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5529:4: ({...}? => ( ( ( rule__Row__LongRowAssignment_1_1 ) ) ) )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5529:4: ({...}? => ( ( ( rule__Row__LongRowAssignment_1_1 ) ) ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5530:5: {...}? => ( ( ( rule__Row__LongRowAssignment_1_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_1(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Row__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_1(), 1)");
                    }
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5530:100: ( ( ( rule__Row__LongRowAssignment_1_1 ) ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5531:6: ( ( rule__Row__LongRowAssignment_1_1 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getRowAccess().getUnorderedGroup_1(), 1);
                    selected = true;
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5537:6: ( ( rule__Row__LongRowAssignment_1_1 ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5539:7: ( rule__Row__LongRowAssignment_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRowAccess().getLongRowAssignment_1_1()); 
                    }
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5540:7: ( rule__Row__LongRowAssignment_1_1 )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5540:8: rule__Row__LongRowAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__Row__LongRowAssignment_1_1_in_rule__Row__UnorderedGroup_1__Impl11419);
                    rule__Row__LongRowAssignment_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRowAccess().getLongRowAssignment_1_1()); 
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRowAccess().getUnorderedGroup_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__UnorderedGroup_1__Impl"


    // $ANTLR start "rule__Row__UnorderedGroup_1__0"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5555:1: rule__Row__UnorderedGroup_1__0 : rule__Row__UnorderedGroup_1__Impl ( rule__Row__UnorderedGroup_1__1 )? ;
    public final void rule__Row__UnorderedGroup_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5559:1: ( rule__Row__UnorderedGroup_1__Impl ( rule__Row__UnorderedGroup_1__1 )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5560:2: rule__Row__UnorderedGroup_1__Impl ( rule__Row__UnorderedGroup_1__1 )?
            {
            pushFollow(FOLLOW_rule__Row__UnorderedGroup_1__Impl_in_rule__Row__UnorderedGroup_1__011478);
            rule__Row__UnorderedGroup_1__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5561:2: ( rule__Row__UnorderedGroup_1__1 )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( LA91_0 ==72 && getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_1(), 0) ) {
                alt91=1;
            }
            else if ( LA91_0 ==73 && getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_1(), 1) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:0:0: rule__Row__UnorderedGroup_1__1
                    {
                    pushFollow(FOLLOW_rule__Row__UnorderedGroup_1__1_in_rule__Row__UnorderedGroup_1__011481);
                    rule__Row__UnorderedGroup_1__1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__UnorderedGroup_1__0"


    // $ANTLR start "rule__Row__UnorderedGroup_1__1"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5568:1: rule__Row__UnorderedGroup_1__1 : rule__Row__UnorderedGroup_1__Impl ;
    public final void rule__Row__UnorderedGroup_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5572:1: ( rule__Row__UnorderedGroup_1__Impl )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5573:2: rule__Row__UnorderedGroup_1__Impl
            {
            pushFollow(FOLLOW_rule__Row__UnorderedGroup_1__Impl_in_rule__Row__UnorderedGroup_1__111506);
            rule__Row__UnorderedGroup_1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__UnorderedGroup_1__1"


    // $ANTLR start "rule__Row__UnorderedGroup_4"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5584:1: rule__Row__UnorderedGroup_4 : ( rule__Row__UnorderedGroup_4__0 )? ;
    public final void rule__Row__UnorderedGroup_4() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getRowAccess().getUnorderedGroup_4());
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5589:1: ( ( rule__Row__UnorderedGroup_4__0 )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5590:2: ( rule__Row__UnorderedGroup_4__0 )?
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5590:2: ( rule__Row__UnorderedGroup_4__0 )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( LA92_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_4(), 0) ) {
                alt92=1;
            }
            else if ( LA92_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_4(), 0) ) {
                alt92=1;
            }
            else if ( LA92_0 ==56 && getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_4(), 1) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:0:0: rule__Row__UnorderedGroup_4__0
                    {
                    pushFollow(FOLLOW_rule__Row__UnorderedGroup_4__0_in_rule__Row__UnorderedGroup_411534);
                    rule__Row__UnorderedGroup_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getRowAccess().getUnorderedGroup_4());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__UnorderedGroup_4"


    // $ANTLR start "rule__Row__UnorderedGroup_4__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5600:1: rule__Row__UnorderedGroup_4__Impl : ( ({...}? => ( ( ( rule__Row__SideAssignment_4_0 ) ) ) ) | ({...}? => ( ( ( rule__Row__Group_4_1__0 ) ) ) ) ) ;
    public final void rule__Row__UnorderedGroup_4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5605:1: ( ( ({...}? => ( ( ( rule__Row__SideAssignment_4_0 ) ) ) ) | ({...}? => ( ( ( rule__Row__Group_4_1__0 ) ) ) ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5606:3: ( ({...}? => ( ( ( rule__Row__SideAssignment_4_0 ) ) ) ) | ({...}? => ( ( ( rule__Row__Group_4_1__0 ) ) ) ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5606:3: ( ({...}? => ( ( ( rule__Row__SideAssignment_4_0 ) ) ) ) | ({...}? => ( ( ( rule__Row__Group_4_1__0 ) ) ) ) )
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( LA93_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_4(), 0) ) {
                alt93=1;
            }
            else if ( LA93_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_4(), 0) ) {
                alt93=1;
            }
            else if ( LA93_0 ==56 && getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_4(), 1) ) {
                alt93=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }
            switch (alt93) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5608:4: ({...}? => ( ( ( rule__Row__SideAssignment_4_0 ) ) ) )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5608:4: ({...}? => ( ( ( rule__Row__SideAssignment_4_0 ) ) ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5609:5: {...}? => ( ( ( rule__Row__SideAssignment_4_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_4(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Row__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_4(), 0)");
                    }
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5609:100: ( ( ( rule__Row__SideAssignment_4_0 ) ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5610:6: ( ( rule__Row__SideAssignment_4_0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getRowAccess().getUnorderedGroup_4(), 0);
                    selected = true;
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5616:6: ( ( rule__Row__SideAssignment_4_0 ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5618:7: ( rule__Row__SideAssignment_4_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRowAccess().getSideAssignment_4_0()); 
                    }
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5619:7: ( rule__Row__SideAssignment_4_0 )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5619:8: rule__Row__SideAssignment_4_0
                    {
                    pushFollow(FOLLOW_rule__Row__SideAssignment_4_0_in_rule__Row__UnorderedGroup_4__Impl11621);
                    rule__Row__SideAssignment_4_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRowAccess().getSideAssignment_4_0()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5625:4: ({...}? => ( ( ( rule__Row__Group_4_1__0 ) ) ) )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5625:4: ({...}? => ( ( ( rule__Row__Group_4_1__0 ) ) ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5626:5: {...}? => ( ( ( rule__Row__Group_4_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_4(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Row__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_4(), 1)");
                    }
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5626:100: ( ( ( rule__Row__Group_4_1__0 ) ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5627:6: ( ( rule__Row__Group_4_1__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getRowAccess().getUnorderedGroup_4(), 1);
                    selected = true;
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5633:6: ( ( rule__Row__Group_4_1__0 ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5635:7: ( rule__Row__Group_4_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRowAccess().getGroup_4_1()); 
                    }
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5636:7: ( rule__Row__Group_4_1__0 )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5636:8: rule__Row__Group_4_1__0
                    {
                    pushFollow(FOLLOW_rule__Row__Group_4_1__0_in_rule__Row__UnorderedGroup_4__Impl11712);
                    rule__Row__Group_4_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRowAccess().getGroup_4_1()); 
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRowAccess().getUnorderedGroup_4());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__UnorderedGroup_4__Impl"


    // $ANTLR start "rule__Row__UnorderedGroup_4__0"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5651:1: rule__Row__UnorderedGroup_4__0 : rule__Row__UnorderedGroup_4__Impl ( rule__Row__UnorderedGroup_4__1 )? ;
    public final void rule__Row__UnorderedGroup_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5655:1: ( rule__Row__UnorderedGroup_4__Impl ( rule__Row__UnorderedGroup_4__1 )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5656:2: rule__Row__UnorderedGroup_4__Impl ( rule__Row__UnorderedGroup_4__1 )?
            {
            pushFollow(FOLLOW_rule__Row__UnorderedGroup_4__Impl_in_rule__Row__UnorderedGroup_4__011771);
            rule__Row__UnorderedGroup_4__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5657:2: ( rule__Row__UnorderedGroup_4__1 )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( LA94_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_4(), 0) ) {
                alt94=1;
            }
            else if ( LA94_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_4(), 0) ) {
                alt94=1;
            }
            else if ( LA94_0 ==56 && getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_4(), 1) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:0:0: rule__Row__UnorderedGroup_4__1
                    {
                    pushFollow(FOLLOW_rule__Row__UnorderedGroup_4__1_in_rule__Row__UnorderedGroup_4__011774);
                    rule__Row__UnorderedGroup_4__1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__UnorderedGroup_4__0"


    // $ANTLR start "rule__Row__UnorderedGroup_4__1"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5664:1: rule__Row__UnorderedGroup_4__1 : rule__Row__UnorderedGroup_4__Impl ;
    public final void rule__Row__UnorderedGroup_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5668:1: ( rule__Row__UnorderedGroup_4__Impl )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5669:2: rule__Row__UnorderedGroup_4__Impl
            {
            pushFollow(FOLLOW_rule__Row__UnorderedGroup_4__Impl_in_rule__Row__UnorderedGroup_4__111799);
            rule__Row__UnorderedGroup_4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__UnorderedGroup_4__1"


    // $ANTLR start "rule__Knit__UnorderedGroup_4"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5680:1: rule__Knit__UnorderedGroup_4 : ( rule__Knit__UnorderedGroup_4__0 )? ;
    public final void rule__Knit__UnorderedGroup_4() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getKnitAccess().getUnorderedGroup_4());
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5685:1: ( ( rule__Knit__UnorderedGroup_4__0 )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5686:2: ( rule__Knit__UnorderedGroup_4__0 )?
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5686:2: ( rule__Knit__UnorderedGroup_4__0 )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( LA95_0 ==76 && getUnorderedGroupHelper().canSelect(grammarAccess.getKnitAccess().getUnorderedGroup_4(), 0) ) {
                alt95=1;
            }
            else if ( LA95_0 ==30 && getUnorderedGroupHelper().canSelect(grammarAccess.getKnitAccess().getUnorderedGroup_4(), 1) ) {
                alt95=1;
            }
            else if ( LA95_0 ==31 && getUnorderedGroupHelper().canSelect(grammarAccess.getKnitAccess().getUnorderedGroup_4(), 1) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:0:0: rule__Knit__UnorderedGroup_4__0
                    {
                    pushFollow(FOLLOW_rule__Knit__UnorderedGroup_4__0_in_rule__Knit__UnorderedGroup_411827);
                    rule__Knit__UnorderedGroup_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getKnitAccess().getUnorderedGroup_4());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knit__UnorderedGroup_4"


    // $ANTLR start "rule__Knit__UnorderedGroup_4__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5696:1: rule__Knit__UnorderedGroup_4__Impl : ( ({...}? => ( ( ( rule__Knit__TogetherAssignment_4_0 ) ) ) ) | ({...}? => ( ( ( rule__Knit__ThroughTrailingLoopAssignment_4_1 ) ) ) ) ) ;
    public final void rule__Knit__UnorderedGroup_4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5701:1: ( ( ({...}? => ( ( ( rule__Knit__TogetherAssignment_4_0 ) ) ) ) | ({...}? => ( ( ( rule__Knit__ThroughTrailingLoopAssignment_4_1 ) ) ) ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5702:3: ( ({...}? => ( ( ( rule__Knit__TogetherAssignment_4_0 ) ) ) ) | ({...}? => ( ( ( rule__Knit__ThroughTrailingLoopAssignment_4_1 ) ) ) ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5702:3: ( ({...}? => ( ( ( rule__Knit__TogetherAssignment_4_0 ) ) ) ) | ({...}? => ( ( ( rule__Knit__ThroughTrailingLoopAssignment_4_1 ) ) ) ) )
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( LA96_0 ==76 && getUnorderedGroupHelper().canSelect(grammarAccess.getKnitAccess().getUnorderedGroup_4(), 0) ) {
                alt96=1;
            }
            else if ( LA96_0 >=30 && LA96_0<=31 && getUnorderedGroupHelper().canSelect(grammarAccess.getKnitAccess().getUnorderedGroup_4(), 1) ) {
                alt96=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }
            switch (alt96) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5704:4: ({...}? => ( ( ( rule__Knit__TogetherAssignment_4_0 ) ) ) )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5704:4: ({...}? => ( ( ( rule__Knit__TogetherAssignment_4_0 ) ) ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5705:5: {...}? => ( ( ( rule__Knit__TogetherAssignment_4_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getKnitAccess().getUnorderedGroup_4(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Knit__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getKnitAccess().getUnorderedGroup_4(), 0)");
                    }
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5705:101: ( ( ( rule__Knit__TogetherAssignment_4_0 ) ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5706:6: ( ( rule__Knit__TogetherAssignment_4_0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getKnitAccess().getUnorderedGroup_4(), 0);
                    selected = true;
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5712:6: ( ( rule__Knit__TogetherAssignment_4_0 ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5714:7: ( rule__Knit__TogetherAssignment_4_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getKnitAccess().getTogetherAssignment_4_0()); 
                    }
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5715:7: ( rule__Knit__TogetherAssignment_4_0 )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5715:8: rule__Knit__TogetherAssignment_4_0
                    {
                    pushFollow(FOLLOW_rule__Knit__TogetherAssignment_4_0_in_rule__Knit__UnorderedGroup_4__Impl11914);
                    rule__Knit__TogetherAssignment_4_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getKnitAccess().getTogetherAssignment_4_0()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5721:4: ({...}? => ( ( ( rule__Knit__ThroughTrailingLoopAssignment_4_1 ) ) ) )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5721:4: ({...}? => ( ( ( rule__Knit__ThroughTrailingLoopAssignment_4_1 ) ) ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5722:5: {...}? => ( ( ( rule__Knit__ThroughTrailingLoopAssignment_4_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getKnitAccess().getUnorderedGroup_4(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Knit__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getKnitAccess().getUnorderedGroup_4(), 1)");
                    }
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5722:101: ( ( ( rule__Knit__ThroughTrailingLoopAssignment_4_1 ) ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5723:6: ( ( rule__Knit__ThroughTrailingLoopAssignment_4_1 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getKnitAccess().getUnorderedGroup_4(), 1);
                    selected = true;
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5729:6: ( ( rule__Knit__ThroughTrailingLoopAssignment_4_1 ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5731:7: ( rule__Knit__ThroughTrailingLoopAssignment_4_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getKnitAccess().getThroughTrailingLoopAssignment_4_1()); 
                    }
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5732:7: ( rule__Knit__ThroughTrailingLoopAssignment_4_1 )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5732:8: rule__Knit__ThroughTrailingLoopAssignment_4_1
                    {
                    pushFollow(FOLLOW_rule__Knit__ThroughTrailingLoopAssignment_4_1_in_rule__Knit__UnorderedGroup_4__Impl12005);
                    rule__Knit__ThroughTrailingLoopAssignment_4_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getKnitAccess().getThroughTrailingLoopAssignment_4_1()); 
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getKnitAccess().getUnorderedGroup_4());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knit__UnorderedGroup_4__Impl"


    // $ANTLR start "rule__Knit__UnorderedGroup_4__0"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5747:1: rule__Knit__UnorderedGroup_4__0 : rule__Knit__UnorderedGroup_4__Impl ( rule__Knit__UnorderedGroup_4__1 )? ;
    public final void rule__Knit__UnorderedGroup_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5751:1: ( rule__Knit__UnorderedGroup_4__Impl ( rule__Knit__UnorderedGroup_4__1 )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5752:2: rule__Knit__UnorderedGroup_4__Impl ( rule__Knit__UnorderedGroup_4__1 )?
            {
            pushFollow(FOLLOW_rule__Knit__UnorderedGroup_4__Impl_in_rule__Knit__UnorderedGroup_4__012064);
            rule__Knit__UnorderedGroup_4__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5753:2: ( rule__Knit__UnorderedGroup_4__1 )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( LA97_0 ==76 && getUnorderedGroupHelper().canSelect(grammarAccess.getKnitAccess().getUnorderedGroup_4(), 0) ) {
                alt97=1;
            }
            else if ( LA97_0 ==30 && getUnorderedGroupHelper().canSelect(grammarAccess.getKnitAccess().getUnorderedGroup_4(), 1) ) {
                alt97=1;
            }
            else if ( LA97_0 ==31 && getUnorderedGroupHelper().canSelect(grammarAccess.getKnitAccess().getUnorderedGroup_4(), 1) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:0:0: rule__Knit__UnorderedGroup_4__1
                    {
                    pushFollow(FOLLOW_rule__Knit__UnorderedGroup_4__1_in_rule__Knit__UnorderedGroup_4__012067);
                    rule__Knit__UnorderedGroup_4__1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knit__UnorderedGroup_4__0"


    // $ANTLR start "rule__Knit__UnorderedGroup_4__1"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5760:1: rule__Knit__UnorderedGroup_4__1 : rule__Knit__UnorderedGroup_4__Impl ;
    public final void rule__Knit__UnorderedGroup_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5764:1: ( rule__Knit__UnorderedGroup_4__Impl )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5765:2: rule__Knit__UnorderedGroup_4__Impl
            {
            pushFollow(FOLLOW_rule__Knit__UnorderedGroup_4__Impl_in_rule__Knit__UnorderedGroup_4__112092);
            rule__Knit__UnorderedGroup_4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knit__UnorderedGroup_4__1"


    // $ANTLR start "rule__Purl__UnorderedGroup_4"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5776:1: rule__Purl__UnorderedGroup_4 : ( rule__Purl__UnorderedGroup_4__0 )? ;
    public final void rule__Purl__UnorderedGroup_4() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getPurlAccess().getUnorderedGroup_4());
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5781:1: ( ( rule__Purl__UnorderedGroup_4__0 )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5782:2: ( rule__Purl__UnorderedGroup_4__0 )?
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5782:2: ( rule__Purl__UnorderedGroup_4__0 )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( LA98_0 ==76 && getUnorderedGroupHelper().canSelect(grammarAccess.getPurlAccess().getUnorderedGroup_4(), 0) ) {
                alt98=1;
            }
            else if ( LA98_0 ==30 && getUnorderedGroupHelper().canSelect(grammarAccess.getPurlAccess().getUnorderedGroup_4(), 1) ) {
                alt98=1;
            }
            else if ( LA98_0 ==31 && getUnorderedGroupHelper().canSelect(grammarAccess.getPurlAccess().getUnorderedGroup_4(), 1) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:0:0: rule__Purl__UnorderedGroup_4__0
                    {
                    pushFollow(FOLLOW_rule__Purl__UnorderedGroup_4__0_in_rule__Purl__UnorderedGroup_412120);
                    rule__Purl__UnorderedGroup_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getPurlAccess().getUnorderedGroup_4());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Purl__UnorderedGroup_4"


    // $ANTLR start "rule__Purl__UnorderedGroup_4__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5792:1: rule__Purl__UnorderedGroup_4__Impl : ( ({...}? => ( ( ( rule__Purl__TogetherAssignment_4_0 ) ) ) ) | ({...}? => ( ( ( rule__Purl__ThroughTrailingLoopAssignment_4_1 ) ) ) ) ) ;
    public final void rule__Purl__UnorderedGroup_4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5797:1: ( ( ({...}? => ( ( ( rule__Purl__TogetherAssignment_4_0 ) ) ) ) | ({...}? => ( ( ( rule__Purl__ThroughTrailingLoopAssignment_4_1 ) ) ) ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5798:3: ( ({...}? => ( ( ( rule__Purl__TogetherAssignment_4_0 ) ) ) ) | ({...}? => ( ( ( rule__Purl__ThroughTrailingLoopAssignment_4_1 ) ) ) ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5798:3: ( ({...}? => ( ( ( rule__Purl__TogetherAssignment_4_0 ) ) ) ) | ({...}? => ( ( ( rule__Purl__ThroughTrailingLoopAssignment_4_1 ) ) ) ) )
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( LA99_0 ==76 && getUnorderedGroupHelper().canSelect(grammarAccess.getPurlAccess().getUnorderedGroup_4(), 0) ) {
                alt99=1;
            }
            else if ( LA99_0 >=30 && LA99_0<=31 && getUnorderedGroupHelper().canSelect(grammarAccess.getPurlAccess().getUnorderedGroup_4(), 1) ) {
                alt99=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;
            }
            switch (alt99) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5800:4: ({...}? => ( ( ( rule__Purl__TogetherAssignment_4_0 ) ) ) )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5800:4: ({...}? => ( ( ( rule__Purl__TogetherAssignment_4_0 ) ) ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5801:5: {...}? => ( ( ( rule__Purl__TogetherAssignment_4_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPurlAccess().getUnorderedGroup_4(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Purl__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPurlAccess().getUnorderedGroup_4(), 0)");
                    }
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5801:101: ( ( ( rule__Purl__TogetherAssignment_4_0 ) ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5802:6: ( ( rule__Purl__TogetherAssignment_4_0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getPurlAccess().getUnorderedGroup_4(), 0);
                    selected = true;
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5808:6: ( ( rule__Purl__TogetherAssignment_4_0 ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5810:7: ( rule__Purl__TogetherAssignment_4_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPurlAccess().getTogetherAssignment_4_0()); 
                    }
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5811:7: ( rule__Purl__TogetherAssignment_4_0 )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5811:8: rule__Purl__TogetherAssignment_4_0
                    {
                    pushFollow(FOLLOW_rule__Purl__TogetherAssignment_4_0_in_rule__Purl__UnorderedGroup_4__Impl12207);
                    rule__Purl__TogetherAssignment_4_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPurlAccess().getTogetherAssignment_4_0()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5817:4: ({...}? => ( ( ( rule__Purl__ThroughTrailingLoopAssignment_4_1 ) ) ) )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5817:4: ({...}? => ( ( ( rule__Purl__ThroughTrailingLoopAssignment_4_1 ) ) ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5818:5: {...}? => ( ( ( rule__Purl__ThroughTrailingLoopAssignment_4_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPurlAccess().getUnorderedGroup_4(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Purl__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPurlAccess().getUnorderedGroup_4(), 1)");
                    }
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5818:101: ( ( ( rule__Purl__ThroughTrailingLoopAssignment_4_1 ) ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5819:6: ( ( rule__Purl__ThroughTrailingLoopAssignment_4_1 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getPurlAccess().getUnorderedGroup_4(), 1);
                    selected = true;
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5825:6: ( ( rule__Purl__ThroughTrailingLoopAssignment_4_1 ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5827:7: ( rule__Purl__ThroughTrailingLoopAssignment_4_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPurlAccess().getThroughTrailingLoopAssignment_4_1()); 
                    }
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5828:7: ( rule__Purl__ThroughTrailingLoopAssignment_4_1 )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5828:8: rule__Purl__ThroughTrailingLoopAssignment_4_1
                    {
                    pushFollow(FOLLOW_rule__Purl__ThroughTrailingLoopAssignment_4_1_in_rule__Purl__UnorderedGroup_4__Impl12298);
                    rule__Purl__ThroughTrailingLoopAssignment_4_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPurlAccess().getThroughTrailingLoopAssignment_4_1()); 
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPurlAccess().getUnorderedGroup_4());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Purl__UnorderedGroup_4__Impl"


    // $ANTLR start "rule__Purl__UnorderedGroup_4__0"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5843:1: rule__Purl__UnorderedGroup_4__0 : rule__Purl__UnorderedGroup_4__Impl ( rule__Purl__UnorderedGroup_4__1 )? ;
    public final void rule__Purl__UnorderedGroup_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5847:1: ( rule__Purl__UnorderedGroup_4__Impl ( rule__Purl__UnorderedGroup_4__1 )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5848:2: rule__Purl__UnorderedGroup_4__Impl ( rule__Purl__UnorderedGroup_4__1 )?
            {
            pushFollow(FOLLOW_rule__Purl__UnorderedGroup_4__Impl_in_rule__Purl__UnorderedGroup_4__012357);
            rule__Purl__UnorderedGroup_4__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5849:2: ( rule__Purl__UnorderedGroup_4__1 )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( LA100_0 ==76 && getUnorderedGroupHelper().canSelect(grammarAccess.getPurlAccess().getUnorderedGroup_4(), 0) ) {
                alt100=1;
            }
            else if ( LA100_0 ==30 && getUnorderedGroupHelper().canSelect(grammarAccess.getPurlAccess().getUnorderedGroup_4(), 1) ) {
                alt100=1;
            }
            else if ( LA100_0 ==31 && getUnorderedGroupHelper().canSelect(grammarAccess.getPurlAccess().getUnorderedGroup_4(), 1) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:0:0: rule__Purl__UnorderedGroup_4__1
                    {
                    pushFollow(FOLLOW_rule__Purl__UnorderedGroup_4__1_in_rule__Purl__UnorderedGroup_4__012360);
                    rule__Purl__UnorderedGroup_4__1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Purl__UnorderedGroup_4__0"


    // $ANTLR start "rule__Purl__UnorderedGroup_4__1"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5856:1: rule__Purl__UnorderedGroup_4__1 : rule__Purl__UnorderedGroup_4__Impl ;
    public final void rule__Purl__UnorderedGroup_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5860:1: ( rule__Purl__UnorderedGroup_4__Impl )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5861:2: rule__Purl__UnorderedGroup_4__Impl
            {
            pushFollow(FOLLOW_rule__Purl__UnorderedGroup_4__Impl_in_rule__Purl__UnorderedGroup_4__112385);
            rule__Purl__UnorderedGroup_4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Purl__UnorderedGroup_4__1"


    // $ANTLR start "rule__Pattern__ElementsAssignment_1"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5872:1: rule__Pattern__ElementsAssignment_1 : ( ruleBlockOperation ) ;
    public final void rule__Pattern__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5876:1: ( ( ruleBlockOperation ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5877:1: ( ruleBlockOperation )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5877:1: ( ruleBlockOperation )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5878:1: ruleBlockOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getElementsBlockOperationParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleBlockOperation_in_rule__Pattern__ElementsAssignment_112417);
            ruleBlockOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getElementsBlockOperationParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__ElementsAssignment_1"


    // $ANTLR start "rule__Instruction__IdAssignment_1_0"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5887:1: rule__Instruction__IdAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__Instruction__IdAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5891:1: ( ( RULE_ID ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5892:1: ( RULE_ID )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5892:1: ( RULE_ID )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5893:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstructionAccess().getIdIDTerminalRuleCall_1_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Instruction__IdAssignment_1_012448); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstructionAccess().getIdIDTerminalRuleCall_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__IdAssignment_1_0"


    // $ANTLR start "rule__Instruction__LabelAssignment_1_1"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5902:1: rule__Instruction__LabelAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Instruction__LabelAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5906:1: ( ( RULE_STRING ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5907:1: ( RULE_STRING )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5907:1: ( RULE_STRING )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5908:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstructionAccess().getLabelSTRINGTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Instruction__LabelAssignment_1_112479); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstructionAccess().getLabelSTRINGTerminalRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__LabelAssignment_1_1"


    // $ANTLR start "rule__Instruction__HasKeyAssignment_2_1_1"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5917:1: rule__Instruction__HasKeyAssignment_2_1_1 : ( ( 'key' ) ) ;
    public final void rule__Instruction__HasKeyAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5921:1: ( ( ( 'key' ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5922:1: ( ( 'key' ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5922:1: ( ( 'key' ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5923:1: ( 'key' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstructionAccess().getHasKeyKeyKeyword_2_1_1_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5924:1: ( 'key' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5925:1: 'key'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstructionAccess().getHasKeyKeyKeyword_2_1_1_0()); 
            }
            match(input,70,FOLLOW_70_in_rule__Instruction__HasKeyAssignment_2_1_112515); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstructionAccess().getHasKeyKeyKeyword_2_1_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstructionAccess().getHasKeyKeyKeyword_2_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__HasKeyAssignment_2_1_1"


    // $ANTLR start "rule__Instruction__MessageKeyAssignment_2_1_2"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5940:1: rule__Instruction__MessageKeyAssignment_2_1_2 : ( RULE_STRING ) ;
    public final void rule__Instruction__MessageKeyAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5944:1: ( ( RULE_STRING ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5945:1: ( RULE_STRING )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5945:1: ( RULE_STRING )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5946:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstructionAccess().getMessageKeySTRINGTerminalRuleCall_2_1_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Instruction__MessageKeyAssignment_2_1_212554); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstructionAccess().getMessageKeySTRINGTerminalRuleCall_2_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__MessageKeyAssignment_2_1_2"


    // $ANTLR start "rule__Instruction__ShapeAssignment_2_2_1"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5955:1: rule__Instruction__ShapeAssignment_2_2_1 : ( ( rule__Instruction__ShapeAlternatives_2_2_1_0 ) ) ;
    public final void rule__Instruction__ShapeAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5959:1: ( ( ( rule__Instruction__ShapeAlternatives_2_2_1_0 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5960:1: ( ( rule__Instruction__ShapeAlternatives_2_2_1_0 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5960:1: ( ( rule__Instruction__ShapeAlternatives_2_2_1_0 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5961:1: ( rule__Instruction__ShapeAlternatives_2_2_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstructionAccess().getShapeAlternatives_2_2_1_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5962:1: ( rule__Instruction__ShapeAlternatives_2_2_1_0 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5962:2: rule__Instruction__ShapeAlternatives_2_2_1_0
            {
            pushFollow(FOLLOW_rule__Instruction__ShapeAlternatives_2_2_1_0_in_rule__Instruction__ShapeAssignment_2_2_112585);
            rule__Instruction__ShapeAlternatives_2_2_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstructionAccess().getShapeAlternatives_2_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__ShapeAssignment_2_2_1"


    // $ANTLR start "rule__Instruction__RowCountAssignment_2_3_1"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5971:1: rule__Instruction__RowCountAssignment_2_3_1 : ( RULE_INT ) ;
    public final void rule__Instruction__RowCountAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5975:1: ( ( RULE_INT ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5976:1: ( RULE_INT )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5976:1: ( RULE_INT )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5977:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstructionAccess().getRowCountINTTerminalRuleCall_2_3_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Instruction__RowCountAssignment_2_3_112618); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstructionAccess().getRowCountINTTerminalRuleCall_2_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__RowCountAssignment_2_3_1"


    // $ANTLR start "rule__Instruction__RowsAssignment_3_0_2"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5986:1: rule__Instruction__RowsAssignment_3_0_2 : ( ruleRow ) ;
    public final void rule__Instruction__RowsAssignment_3_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5990:1: ( ( ruleRow ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5991:1: ( ruleRow )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5991:1: ( ruleRow )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5992:1: ruleRow
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstructionAccess().getRowsRowParserRuleCall_3_0_2_0()); 
            }
            pushFollow(FOLLOW_ruleRow_in_rule__Instruction__RowsAssignment_3_0_212649);
            ruleRow();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstructionAccess().getRowsRowParserRuleCall_3_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__RowsAssignment_3_0_2"


    // $ANTLR start "rule__Instruction__RowsAssignment_3_1_2"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6001:1: rule__Instruction__RowsAssignment_3_1_2 : ( ruleRow ) ;
    public final void rule__Instruction__RowsAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6005:1: ( ( ruleRow ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6006:1: ( ruleRow )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6006:1: ( ruleRow )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6007:1: ruleRow
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstructionAccess().getRowsRowParserRuleCall_3_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleRow_in_rule__Instruction__RowsAssignment_3_1_212680);
            ruleRow();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstructionAccess().getRowsRowParserRuleCall_3_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__RowsAssignment_3_1_2"


    // $ANTLR start "rule__Row__NextRowAssignment_0"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6016:1: rule__Row__NextRowAssignment_0 : ( ( 'Next' ) ) ;
    public final void rule__Row__NextRowAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6020:1: ( ( ( 'Next' ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6021:1: ( ( 'Next' ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6021:1: ( ( 'Next' ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6022:1: ( 'Next' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getNextRowNextKeyword_0_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6023:1: ( 'Next' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6024:1: 'Next'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getNextRowNextKeyword_0_0()); 
            }
            match(input,71,FOLLOW_71_in_rule__Row__NextRowAssignment_012716); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRowAccess().getNextRowNextKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRowAccess().getNextRowNextKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__NextRowAssignment_0"


    // $ANTLR start "rule__Row__ShortRowAssignment_1_0"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6039:1: rule__Row__ShortRowAssignment_1_0 : ( ( 'Short' ) ) ;
    public final void rule__Row__ShortRowAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6043:1: ( ( ( 'Short' ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6044:1: ( ( 'Short' ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6044:1: ( ( 'Short' ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6045:1: ( 'Short' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getShortRowShortKeyword_1_0_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6046:1: ( 'Short' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6047:1: 'Short'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getShortRowShortKeyword_1_0_0()); 
            }
            match(input,72,FOLLOW_72_in_rule__Row__ShortRowAssignment_1_012760); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRowAccess().getShortRowShortKeyword_1_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRowAccess().getShortRowShortKeyword_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__ShortRowAssignment_1_0"


    // $ANTLR start "rule__Row__LongRowAssignment_1_1"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6062:1: rule__Row__LongRowAssignment_1_1 : ( ( 'Long' ) ) ;
    public final void rule__Row__LongRowAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6066:1: ( ( ( 'Long' ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6067:1: ( ( 'Long' ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6067:1: ( ( 'Long' ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6068:1: ( 'Long' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getLongRowLongKeyword_1_1_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6069:1: ( 'Long' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6070:1: 'Long'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getLongRowLongKeyword_1_1_0()); 
            }
            match(input,73,FOLLOW_73_in_rule__Row__LongRowAssignment_1_112804); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRowAccess().getLongRowLongKeyword_1_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRowAccess().getLongRowLongKeyword_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__LongRowAssignment_1_1"


    // $ANTLR start "rule__Row__LabelAssignment_2"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6085:1: rule__Row__LabelAssignment_2 : ( ( rule__Row__LabelAlternatives_2_0 ) ) ;
    public final void rule__Row__LabelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6089:1: ( ( ( rule__Row__LabelAlternatives_2_0 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6090:1: ( ( rule__Row__LabelAlternatives_2_0 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6090:1: ( ( rule__Row__LabelAlternatives_2_0 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6091:1: ( rule__Row__LabelAlternatives_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getLabelAlternatives_2_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6092:1: ( rule__Row__LabelAlternatives_2_0 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6092:2: rule__Row__LabelAlternatives_2_0
            {
            pushFollow(FOLLOW_rule__Row__LabelAlternatives_2_0_in_rule__Row__LabelAssignment_212843);
            rule__Row__LabelAlternatives_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRowAccess().getLabelAlternatives_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__LabelAssignment_2"


    // $ANTLR start "rule__Row__RangeAssignment_3_0"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6101:1: rule__Row__RangeAssignment_3_0 : ( ruleRange ) ;
    public final void rule__Row__RangeAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6105:1: ( ( ruleRange ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6106:1: ( ruleRange )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6106:1: ( ruleRange )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6107:1: ruleRange
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getRangeRangeParserRuleCall_3_0_0()); 
            }
            pushFollow(FOLLOW_ruleRange_in_rule__Row__RangeAssignment_3_012876);
            ruleRange();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRowAccess().getRangeRangeParserRuleCall_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__RangeAssignment_3_0"


    // $ANTLR start "rule__Row__NumberAssignment_3_1_0"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6116:1: rule__Row__NumberAssignment_3_1_0 : ( RULE_INT ) ;
    public final void rule__Row__NumberAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6120:1: ( ( RULE_INT ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6121:1: ( RULE_INT )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6121:1: ( RULE_INT )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6122:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getNumberINTTerminalRuleCall_3_1_0_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Row__NumberAssignment_3_1_012907); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRowAccess().getNumberINTTerminalRuleCall_3_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__NumberAssignment_3_1_0"


    // $ANTLR start "rule__Row__NumberAssignment_3_1_1_1"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6131:1: rule__Row__NumberAssignment_3_1_1_1 : ( RULE_INT ) ;
    public final void rule__Row__NumberAssignment_3_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6135:1: ( ( RULE_INT ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6136:1: ( RULE_INT )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6136:1: ( RULE_INT )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6137:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getNumberINTTerminalRuleCall_3_1_1_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Row__NumberAssignment_3_1_1_112938); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRowAccess().getNumberINTTerminalRuleCall_3_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__NumberAssignment_3_1_1_1"


    // $ANTLR start "rule__Row__SubsequentAssignment_3_1_2_2"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6146:1: rule__Row__SubsequentAssignment_3_1_2_2 : ( ( rule__Row__SubsequentAlternatives_3_1_2_2_0 ) ) ;
    public final void rule__Row__SubsequentAssignment_3_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6150:1: ( ( ( rule__Row__SubsequentAlternatives_3_1_2_2_0 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6151:1: ( ( rule__Row__SubsequentAlternatives_3_1_2_2_0 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6151:1: ( ( rule__Row__SubsequentAlternatives_3_1_2_2_0 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6152:1: ( rule__Row__SubsequentAlternatives_3_1_2_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getSubsequentAlternatives_3_1_2_2_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6153:1: ( rule__Row__SubsequentAlternatives_3_1_2_2_0 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6153:2: rule__Row__SubsequentAlternatives_3_1_2_2_0
            {
            pushFollow(FOLLOW_rule__Row__SubsequentAlternatives_3_1_2_2_0_in_rule__Row__SubsequentAssignment_3_1_2_212969);
            rule__Row__SubsequentAlternatives_3_1_2_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRowAccess().getSubsequentAlternatives_3_1_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__SubsequentAssignment_3_1_2_2"


    // $ANTLR start "rule__Row__SideAssignment_4_0"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6162:1: rule__Row__SideAssignment_4_0 : ( ( rule__Row__SideAlternatives_4_0_0 ) ) ;
    public final void rule__Row__SideAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6166:1: ( ( ( rule__Row__SideAlternatives_4_0_0 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6167:1: ( ( rule__Row__SideAlternatives_4_0_0 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6167:1: ( ( rule__Row__SideAlternatives_4_0_0 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6168:1: ( rule__Row__SideAlternatives_4_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getSideAlternatives_4_0_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6169:1: ( rule__Row__SideAlternatives_4_0_0 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6169:2: rule__Row__SideAlternatives_4_0_0
            {
            pushFollow(FOLLOW_rule__Row__SideAlternatives_4_0_0_in_rule__Row__SideAssignment_4_013002);
            rule__Row__SideAlternatives_4_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRowAccess().getSideAlternatives_4_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__SideAssignment_4_0"


    // $ANTLR start "rule__Row__YarnRefAssignment_4_1_1"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6178:1: rule__Row__YarnRefAssignment_4_1_1 : ( RULE_ID ) ;
    public final void rule__Row__YarnRefAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6182:1: ( ( RULE_ID ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6183:1: ( RULE_ID )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6183:1: ( RULE_ID )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6184:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getYarnRefIDTerminalRuleCall_4_1_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Row__YarnRefAssignment_4_1_113035); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRowAccess().getYarnRefIDTerminalRuleCall_4_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__YarnRefAssignment_4_1_1"


    // $ANTLR start "rule__Row__InformAssignment_5_1_1"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6193:1: rule__Row__InformAssignment_5_1_1 : ( ( 'inform' ) ) ;
    public final void rule__Row__InformAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6197:1: ( ( ( 'inform' ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6198:1: ( ( 'inform' ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6198:1: ( ( 'inform' ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6199:1: ( 'inform' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getInformInformKeyword_5_1_1_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6200:1: ( 'inform' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6201:1: 'inform'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getInformInformKeyword_5_1_1_0()); 
            }
            match(input,74,FOLLOW_74_in_rule__Row__InformAssignment_5_1_113071); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRowAccess().getInformInformKeyword_5_1_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRowAccess().getInformInformKeyword_5_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__InformAssignment_5_1_1"


    // $ANTLR start "rule__Row__ResetAssignment_5_2_1"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6216:1: rule__Row__ResetAssignment_5_2_1 : ( ( 'reset' ) ) ;
    public final void rule__Row__ResetAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6220:1: ( ( ( 'reset' ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6221:1: ( ( 'reset' ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6221:1: ( ( 'reset' ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6222:1: ( 'reset' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getResetResetKeyword_5_2_1_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6223:1: ( 'reset' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6224:1: 'reset'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getResetResetKeyword_5_2_1_0()); 
            }
            match(input,75,FOLLOW_75_in_rule__Row__ResetAssignment_5_2_113115); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRowAccess().getResetResetKeyword_5_2_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRowAccess().getResetResetKeyword_5_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__ResetAssignment_5_2_1"


    // $ANTLR start "rule__Row__OperationsAssignment_8"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6239:1: rule__Row__OperationsAssignment_8 : ( ruleInlineOperation ) ;
    public final void rule__Row__OperationsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6243:1: ( ( ruleInlineOperation ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6244:1: ( ruleInlineOperation )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6244:1: ( ruleInlineOperation )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6245:1: ruleInlineOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getOperationsInlineOperationParserRuleCall_8_0()); 
            }
            pushFollow(FOLLOW_ruleInlineOperation_in_rule__Row__OperationsAssignment_813154);
            ruleInlineOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRowAccess().getOperationsInlineOperationParserRuleCall_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__OperationsAssignment_8"


    // $ANTLR start "rule__Row__OperationsAssignment_9_1"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6254:1: rule__Row__OperationsAssignment_9_1 : ( ruleInlineOperation ) ;
    public final void rule__Row__OperationsAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6258:1: ( ( ruleInlineOperation ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6259:1: ( ruleInlineOperation )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6259:1: ( ruleInlineOperation )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6260:1: ruleInlineOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getOperationsInlineOperationParserRuleCall_9_1_0()); 
            }
            pushFollow(FOLLOW_ruleInlineOperation_in_rule__Row__OperationsAssignment_9_113185);
            ruleInlineOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRowAccess().getOperationsInlineOperationParserRuleCall_9_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__OperationsAssignment_9_1"


    // $ANTLR start "rule__Message__MessageAssignment_0"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6269:1: rule__Message__MessageAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Message__MessageAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6273:1: ( ( RULE_STRING ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6274:1: ( RULE_STRING )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6274:1: ( RULE_STRING )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6275:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getMessageSTRINGTerminalRuleCall_0_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Message__MessageAssignment_013216); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageAccess().getMessageSTRINGTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__MessageAssignment_0"


    // $ANTLR start "rule__Knit__NumberAssignment_2"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6284:1: rule__Knit__NumberAssignment_2 : ( RULE_INT ) ;
    public final void rule__Knit__NumberAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6288:1: ( ( RULE_INT ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6289:1: ( RULE_INT )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6289:1: ( RULE_INT )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6290:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKnitAccess().getNumberINTTerminalRuleCall_2_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Knit__NumberAssignment_213247); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKnitAccess().getNumberINTTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knit__NumberAssignment_2"


    // $ANTLR start "rule__Knit__TogetherAssignment_4_0"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6299:1: rule__Knit__TogetherAssignment_4_0 : ( ( 'tog' ) ) ;
    public final void rule__Knit__TogetherAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6303:1: ( ( ( 'tog' ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6304:1: ( ( 'tog' ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6304:1: ( ( 'tog' ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6305:1: ( 'tog' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKnitAccess().getTogetherTogKeyword_4_0_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6306:1: ( 'tog' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6307:1: 'tog'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKnitAccess().getTogetherTogKeyword_4_0_0()); 
            }
            match(input,76,FOLLOW_76_in_rule__Knit__TogetherAssignment_4_013283); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKnitAccess().getTogetherTogKeyword_4_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKnitAccess().getTogetherTogKeyword_4_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knit__TogetherAssignment_4_0"


    // $ANTLR start "rule__Knit__ThroughTrailingLoopAssignment_4_1"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6322:1: rule__Knit__ThroughTrailingLoopAssignment_4_1 : ( ( rule__Knit__ThroughTrailingLoopAlternatives_4_1_0 ) ) ;
    public final void rule__Knit__ThroughTrailingLoopAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6326:1: ( ( ( rule__Knit__ThroughTrailingLoopAlternatives_4_1_0 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6327:1: ( ( rule__Knit__ThroughTrailingLoopAlternatives_4_1_0 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6327:1: ( ( rule__Knit__ThroughTrailingLoopAlternatives_4_1_0 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6328:1: ( rule__Knit__ThroughTrailingLoopAlternatives_4_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKnitAccess().getThroughTrailingLoopAlternatives_4_1_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6329:1: ( rule__Knit__ThroughTrailingLoopAlternatives_4_1_0 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6329:2: rule__Knit__ThroughTrailingLoopAlternatives_4_1_0
            {
            pushFollow(FOLLOW_rule__Knit__ThroughTrailingLoopAlternatives_4_1_0_in_rule__Knit__ThroughTrailingLoopAssignment_4_113322);
            rule__Knit__ThroughTrailingLoopAlternatives_4_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKnitAccess().getThroughTrailingLoopAlternatives_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knit__ThroughTrailingLoopAssignment_4_1"


    // $ANTLR start "rule__Knit__YarnRefAssignment_5_1"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6338:1: rule__Knit__YarnRefAssignment_5_1 : ( RULE_ID ) ;
    public final void rule__Knit__YarnRefAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6342:1: ( ( RULE_ID ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6343:1: ( RULE_ID )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6343:1: ( RULE_ID )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6344:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKnitAccess().getYarnRefIDTerminalRuleCall_5_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Knit__YarnRefAssignment_5_113355); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKnitAccess().getYarnRefIDTerminalRuleCall_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knit__YarnRefAssignment_5_1"


    // $ANTLR start "rule__Knit__RepeatAssignment_6_1"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6353:1: rule__Knit__RepeatAssignment_6_1 : ( ruleRepeatSpec ) ;
    public final void rule__Knit__RepeatAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6357:1: ( ( ruleRepeatSpec ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6358:1: ( ruleRepeatSpec )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6358:1: ( ruleRepeatSpec )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6359:1: ruleRepeatSpec
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKnitAccess().getRepeatRepeatSpecParserRuleCall_6_1_0()); 
            }
            pushFollow(FOLLOW_ruleRepeatSpec_in_rule__Knit__RepeatAssignment_6_113386);
            ruleRepeatSpec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKnitAccess().getRepeatRepeatSpecParserRuleCall_6_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knit__RepeatAssignment_6_1"


    // $ANTLR start "rule__Purl__NumberAssignment_2"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6368:1: rule__Purl__NumberAssignment_2 : ( RULE_INT ) ;
    public final void rule__Purl__NumberAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6372:1: ( ( RULE_INT ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6373:1: ( RULE_INT )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6373:1: ( RULE_INT )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6374:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPurlAccess().getNumberINTTerminalRuleCall_2_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Purl__NumberAssignment_213417); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPurlAccess().getNumberINTTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Purl__NumberAssignment_2"


    // $ANTLR start "rule__Purl__TogetherAssignment_4_0"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6383:1: rule__Purl__TogetherAssignment_4_0 : ( ( 'tog' ) ) ;
    public final void rule__Purl__TogetherAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6387:1: ( ( ( 'tog' ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6388:1: ( ( 'tog' ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6388:1: ( ( 'tog' ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6389:1: ( 'tog' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPurlAccess().getTogetherTogKeyword_4_0_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6390:1: ( 'tog' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6391:1: 'tog'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPurlAccess().getTogetherTogKeyword_4_0_0()); 
            }
            match(input,76,FOLLOW_76_in_rule__Purl__TogetherAssignment_4_013453); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPurlAccess().getTogetherTogKeyword_4_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPurlAccess().getTogetherTogKeyword_4_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Purl__TogetherAssignment_4_0"


    // $ANTLR start "rule__Purl__ThroughTrailingLoopAssignment_4_1"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6406:1: rule__Purl__ThroughTrailingLoopAssignment_4_1 : ( ( rule__Purl__ThroughTrailingLoopAlternatives_4_1_0 ) ) ;
    public final void rule__Purl__ThroughTrailingLoopAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6410:1: ( ( ( rule__Purl__ThroughTrailingLoopAlternatives_4_1_0 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6411:1: ( ( rule__Purl__ThroughTrailingLoopAlternatives_4_1_0 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6411:1: ( ( rule__Purl__ThroughTrailingLoopAlternatives_4_1_0 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6412:1: ( rule__Purl__ThroughTrailingLoopAlternatives_4_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPurlAccess().getThroughTrailingLoopAlternatives_4_1_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6413:1: ( rule__Purl__ThroughTrailingLoopAlternatives_4_1_0 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6413:2: rule__Purl__ThroughTrailingLoopAlternatives_4_1_0
            {
            pushFollow(FOLLOW_rule__Purl__ThroughTrailingLoopAlternatives_4_1_0_in_rule__Purl__ThroughTrailingLoopAssignment_4_113492);
            rule__Purl__ThroughTrailingLoopAlternatives_4_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPurlAccess().getThroughTrailingLoopAlternatives_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Purl__ThroughTrailingLoopAssignment_4_1"


    // $ANTLR start "rule__Purl__YarnRefAssignment_5_1"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6422:1: rule__Purl__YarnRefAssignment_5_1 : ( RULE_ID ) ;
    public final void rule__Purl__YarnRefAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6426:1: ( ( RULE_ID ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6427:1: ( RULE_ID )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6427:1: ( RULE_ID )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6428:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPurlAccess().getYarnRefIDTerminalRuleCall_5_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Purl__YarnRefAssignment_5_113525); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPurlAccess().getYarnRefIDTerminalRuleCall_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Purl__YarnRefAssignment_5_1"


    // $ANTLR start "rule__Purl__RepeatAssignment_6_1"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6437:1: rule__Purl__RepeatAssignment_6_1 : ( ruleRepeatSpec ) ;
    public final void rule__Purl__RepeatAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6441:1: ( ( ruleRepeatSpec ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6442:1: ( ruleRepeatSpec )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6442:1: ( ruleRepeatSpec )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6443:1: ruleRepeatSpec
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPurlAccess().getRepeatRepeatSpecParserRuleCall_6_1_0()); 
            }
            pushFollow(FOLLOW_ruleRepeatSpec_in_rule__Purl__RepeatAssignment_6_113556);
            ruleRepeatSpec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPurlAccess().getRepeatRepeatSpecParserRuleCall_6_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Purl__RepeatAssignment_6_1"


    // $ANTLR start "rule__Slip__ReverseAssignment_1"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6452:1: rule__Slip__ReverseAssignment_1 : ( ( rule__Slip__ReverseAlternatives_1_0 ) ) ;
    public final void rule__Slip__ReverseAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6456:1: ( ( ( rule__Slip__ReverseAlternatives_1_0 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6457:1: ( ( rule__Slip__ReverseAlternatives_1_0 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6457:1: ( ( rule__Slip__ReverseAlternatives_1_0 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6458:1: ( rule__Slip__ReverseAlternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSlipAccess().getReverseAlternatives_1_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6459:1: ( rule__Slip__ReverseAlternatives_1_0 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6459:2: rule__Slip__ReverseAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__Slip__ReverseAlternatives_1_0_in_rule__Slip__ReverseAssignment_113587);
            rule__Slip__ReverseAlternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSlipAccess().getReverseAlternatives_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slip__ReverseAssignment_1"


    // $ANTLR start "rule__Slip__NumberAssignment_3_0_0"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6468:1: rule__Slip__NumberAssignment_3_0_0 : ( RULE_INT ) ;
    public final void rule__Slip__NumberAssignment_3_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6472:1: ( ( RULE_INT ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6473:1: ( RULE_INT )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6473:1: ( RULE_INT )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6474:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSlipAccess().getNumberINTTerminalRuleCall_3_0_0_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Slip__NumberAssignment_3_0_013620); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSlipAccess().getNumberINTTerminalRuleCall_3_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slip__NumberAssignment_3_0_0"


    // $ANTLR start "rule__Slip__KnitwiseAssignment_4_0"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6483:1: rule__Slip__KnitwiseAssignment_4_0 : ( ( rule__Slip__KnitwiseAlternatives_4_0_0 ) ) ;
    public final void rule__Slip__KnitwiseAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6487:1: ( ( ( rule__Slip__KnitwiseAlternatives_4_0_0 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6488:1: ( ( rule__Slip__KnitwiseAlternatives_4_0_0 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6488:1: ( ( rule__Slip__KnitwiseAlternatives_4_0_0 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6489:1: ( rule__Slip__KnitwiseAlternatives_4_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSlipAccess().getKnitwiseAlternatives_4_0_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6490:1: ( rule__Slip__KnitwiseAlternatives_4_0_0 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6490:2: rule__Slip__KnitwiseAlternatives_4_0_0
            {
            pushFollow(FOLLOW_rule__Slip__KnitwiseAlternatives_4_0_0_in_rule__Slip__KnitwiseAssignment_4_013651);
            rule__Slip__KnitwiseAlternatives_4_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSlipAccess().getKnitwiseAlternatives_4_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slip__KnitwiseAssignment_4_0"


    // $ANTLR start "rule__Slip__PurlwiseAssignment_4_1"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6499:1: rule__Slip__PurlwiseAssignment_4_1 : ( ( rule__Slip__PurlwiseAlternatives_4_1_0 ) ) ;
    public final void rule__Slip__PurlwiseAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6503:1: ( ( ( rule__Slip__PurlwiseAlternatives_4_1_0 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6504:1: ( ( rule__Slip__PurlwiseAlternatives_4_1_0 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6504:1: ( ( rule__Slip__PurlwiseAlternatives_4_1_0 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6505:1: ( rule__Slip__PurlwiseAlternatives_4_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSlipAccess().getPurlwiseAlternatives_4_1_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6506:1: ( rule__Slip__PurlwiseAlternatives_4_1_0 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6506:2: rule__Slip__PurlwiseAlternatives_4_1_0
            {
            pushFollow(FOLLOW_rule__Slip__PurlwiseAlternatives_4_1_0_in_rule__Slip__PurlwiseAssignment_4_113684);
            rule__Slip__PurlwiseAlternatives_4_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSlipAccess().getPurlwiseAlternatives_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slip__PurlwiseAssignment_4_1"


    // $ANTLR start "rule__Slip__YarnPositionAssignment_5"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6515:1: rule__Slip__YarnPositionAssignment_5 : ( ( rule__Slip__YarnPositionAlternatives_5_0 ) ) ;
    public final void rule__Slip__YarnPositionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6519:1: ( ( ( rule__Slip__YarnPositionAlternatives_5_0 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6520:1: ( ( rule__Slip__YarnPositionAlternatives_5_0 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6520:1: ( ( rule__Slip__YarnPositionAlternatives_5_0 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6521:1: ( rule__Slip__YarnPositionAlternatives_5_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSlipAccess().getYarnPositionAlternatives_5_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6522:1: ( rule__Slip__YarnPositionAlternatives_5_0 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6522:2: rule__Slip__YarnPositionAlternatives_5_0
            {
            pushFollow(FOLLOW_rule__Slip__YarnPositionAlternatives_5_0_in_rule__Slip__YarnPositionAssignment_513717);
            rule__Slip__YarnPositionAlternatives_5_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSlipAccess().getYarnPositionAlternatives_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slip__YarnPositionAssignment_5"


    // $ANTLR start "rule__RepeatSpec__ToEndAssignment_0"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6531:1: rule__RepeatSpec__ToEndAssignment_0 : ( ( 'end' ) ) ;
    public final void rule__RepeatSpec__ToEndAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6535:1: ( ( ( 'end' ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6536:1: ( ( 'end' ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6536:1: ( ( 'end' ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6537:1: ( 'end' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatSpecAccess().getToEndEndKeyword_0_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6538:1: ( 'end' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6539:1: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatSpecAccess().getToEndEndKeyword_0_0()); 
            }
            match(input,77,FOLLOW_77_in_rule__RepeatSpec__ToEndAssignment_013755); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatSpecAccess().getToEndEndKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatSpecAccess().getToEndEndKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatSpec__ToEndAssignment_0"


    // $ANTLR start "rule__RepeatSpec__ToMarkerAssignment_1"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6554:1: rule__RepeatSpec__ToMarkerAssignment_1 : ( ( 'marker' ) ) ;
    public final void rule__RepeatSpec__ToMarkerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6558:1: ( ( ( 'marker' ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6559:1: ( ( 'marker' ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6559:1: ( ( 'marker' ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6560:1: ( 'marker' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatSpecAccess().getToMarkerMarkerKeyword_1_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6561:1: ( 'marker' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6562:1: 'marker'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatSpecAccess().getToMarkerMarkerKeyword_1_0()); 
            }
            match(input,78,FOLLOW_78_in_rule__RepeatSpec__ToMarkerAssignment_113799); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatSpecAccess().getToMarkerMarkerKeyword_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatSpecAccess().getToMarkerMarkerKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatSpec__ToMarkerAssignment_1"


    // $ANTLR start "rule__RepeatSpec__ValueAssignment_2_0"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6577:1: rule__RepeatSpec__ValueAssignment_2_0 : ( RULE_INT ) ;
    public final void rule__RepeatSpec__ValueAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6581:1: ( ( RULE_INT ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6582:1: ( RULE_INT )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6582:1: ( RULE_INT )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6583:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatSpecAccess().getValueINTTerminalRuleCall_2_0_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__RepeatSpec__ValueAssignment_2_013838); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatSpecAccess().getValueINTTerminalRuleCall_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatSpec__ValueAssignment_2_0"


    // $ANTLR start "rule__RepeatSpec__BeforeEndAssignment_2_2"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6592:1: rule__RepeatSpec__BeforeEndAssignment_2_2 : ( ( 'before end' ) ) ;
    public final void rule__RepeatSpec__BeforeEndAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6596:1: ( ( ( 'before end' ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6597:1: ( ( 'before end' ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6597:1: ( ( 'before end' ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6598:1: ( 'before end' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatSpecAccess().getBeforeEndBeforeEndKeyword_2_2_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6599:1: ( 'before end' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6600:1: 'before end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatSpecAccess().getBeforeEndBeforeEndKeyword_2_2_0()); 
            }
            match(input,79,FOLLOW_79_in_rule__RepeatSpec__BeforeEndAssignment_2_213874); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatSpecAccess().getBeforeEndBeforeEndKeyword_2_2_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatSpecAccess().getBeforeEndBeforeEndKeyword_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatSpec__BeforeEndAssignment_2_2"


    // $ANTLR start "rule__RepeatSpec__ValueAssignment_3_0"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6615:1: rule__RepeatSpec__ValueAssignment_3_0 : ( RULE_INT ) ;
    public final void rule__RepeatSpec__ValueAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6619:1: ( ( RULE_INT ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6620:1: ( RULE_INT )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6620:1: ( RULE_INT )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6621:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatSpecAccess().getValueINTTerminalRuleCall_3_0_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__RepeatSpec__ValueAssignment_3_013913); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatSpecAccess().getValueINTTerminalRuleCall_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatSpec__ValueAssignment_3_0"


    // $ANTLR start "rule__RepeatSpec__BeforeGapAssignment_3_2"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6630:1: rule__RepeatSpec__BeforeGapAssignment_3_2 : ( ( 'before gap' ) ) ;
    public final void rule__RepeatSpec__BeforeGapAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6634:1: ( ( ( 'before gap' ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6635:1: ( ( 'before gap' ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6635:1: ( ( 'before gap' ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6636:1: ( 'before gap' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatSpecAccess().getBeforeGapBeforeGapKeyword_3_2_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6637:1: ( 'before gap' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6638:1: 'before gap'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatSpecAccess().getBeforeGapBeforeGapKeyword_3_2_0()); 
            }
            match(input,80,FOLLOW_80_in_rule__RepeatSpec__BeforeGapAssignment_3_213949); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatSpecAccess().getBeforeGapBeforeGapKeyword_3_2_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatSpecAccess().getBeforeGapBeforeGapKeyword_3_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatSpec__BeforeGapAssignment_3_2"


    // $ANTLR start "rule__RepeatSpec__ValueAssignment_4_0"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6653:1: rule__RepeatSpec__ValueAssignment_4_0 : ( RULE_INT ) ;
    public final void rule__RepeatSpec__ValueAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6657:1: ( ( RULE_INT ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6658:1: ( RULE_INT )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6658:1: ( RULE_INT )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6659:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatSpecAccess().getValueINTTerminalRuleCall_4_0_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__RepeatSpec__ValueAssignment_4_013988); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatSpecAccess().getValueINTTerminalRuleCall_4_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatSpec__ValueAssignment_4_0"


    // $ANTLR start "rule__RepeatSpec__BeforeMarkerAssignment_4_2"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6668:1: rule__RepeatSpec__BeforeMarkerAssignment_4_2 : ( ( 'before marker' ) ) ;
    public final void rule__RepeatSpec__BeforeMarkerAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6672:1: ( ( ( 'before marker' ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6673:1: ( ( 'before marker' ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6673:1: ( ( 'before marker' ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6674:1: ( 'before marker' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatSpecAccess().getBeforeMarkerBeforeMarkerKeyword_4_2_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6675:1: ( 'before marker' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6676:1: 'before marker'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatSpecAccess().getBeforeMarkerBeforeMarkerKeyword_4_2_0()); 
            }
            match(input,81,FOLLOW_81_in_rule__RepeatSpec__BeforeMarkerAssignment_4_214024); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatSpecAccess().getBeforeMarkerBeforeMarkerKeyword_4_2_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatSpecAccess().getBeforeMarkerBeforeMarkerKeyword_4_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatSpec__BeforeMarkerAssignment_4_2"


    // $ANTLR start "rule__RepeatSpec__ValueAssignment_5_0"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6691:1: rule__RepeatSpec__ValueAssignment_5_0 : ( RULE_INT ) ;
    public final void rule__RepeatSpec__ValueAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6695:1: ( ( RULE_INT ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6696:1: ( RULE_INT )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6696:1: ( RULE_INT )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6697:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatSpecAccess().getValueINTTerminalRuleCall_5_0_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__RepeatSpec__ValueAssignment_5_014063); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatSpecAccess().getValueINTTerminalRuleCall_5_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatSpec__ValueAssignment_5_0"


    // $ANTLR start "rule__RepeatSpec__TimesAssignment_5_1"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6706:1: rule__RepeatSpec__TimesAssignment_5_1 : ( ( 'times' ) ) ;
    public final void rule__RepeatSpec__TimesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6710:1: ( ( ( 'times' ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6711:1: ( ( 'times' ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6711:1: ( ( 'times' ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6712:1: ( 'times' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatSpecAccess().getTimesTimesKeyword_5_1_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6713:1: ( 'times' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6714:1: 'times'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatSpecAccess().getTimesTimesKeyword_5_1_0()); 
            }
            match(input,82,FOLLOW_82_in_rule__RepeatSpec__TimesAssignment_5_114099); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatSpecAccess().getTimesTimesKeyword_5_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatSpecAccess().getTimesTimesKeyword_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatSpec__TimesAssignment_5_1"


    // $ANTLR start "rule__Repeat__OperationsAssignment_0_2"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6729:1: rule__Repeat__OperationsAssignment_0_2 : ( ruleInlineOperation ) ;
    public final void rule__Repeat__OperationsAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6733:1: ( ( ruleInlineOperation ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6734:1: ( ruleInlineOperation )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6734:1: ( ruleInlineOperation )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6735:1: ruleInlineOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatAccess().getOperationsInlineOperationParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_ruleInlineOperation_in_rule__Repeat__OperationsAssignment_0_214138);
            ruleInlineOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatAccess().getOperationsInlineOperationParserRuleCall_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repeat__OperationsAssignment_0_2"


    // $ANTLR start "rule__Repeat__OperationsAssignment_0_3_1"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6744:1: rule__Repeat__OperationsAssignment_0_3_1 : ( ruleInlineOperation ) ;
    public final void rule__Repeat__OperationsAssignment_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6748:1: ( ( ruleInlineOperation ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6749:1: ( ruleInlineOperation )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6749:1: ( ruleInlineOperation )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6750:1: ruleInlineOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatAccess().getOperationsInlineOperationParserRuleCall_0_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleInlineOperation_in_rule__Repeat__OperationsAssignment_0_3_114169);
            ruleInlineOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatAccess().getOperationsInlineOperationParserRuleCall_0_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repeat__OperationsAssignment_0_3_1"


    // $ANTLR start "rule__Repeat__SpecAssignment_0_6"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6759:1: rule__Repeat__SpecAssignment_0_6 : ( ruleRepeatSpec ) ;
    public final void rule__Repeat__SpecAssignment_0_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6763:1: ( ( ruleRepeatSpec ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6764:1: ( ruleRepeatSpec )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6764:1: ( ruleRepeatSpec )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6765:1: ruleRepeatSpec
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatAccess().getSpecRepeatSpecParserRuleCall_0_6_0()); 
            }
            pushFollow(FOLLOW_ruleRepeatSpec_in_rule__Repeat__SpecAssignment_0_614200);
            ruleRepeatSpec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatAccess().getSpecRepeatSpecParserRuleCall_0_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repeat__SpecAssignment_0_6"


    // $ANTLR start "rule__Repeat__OperationsAssignment_1_1"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6774:1: rule__Repeat__OperationsAssignment_1_1 : ( ruleInlineOperation ) ;
    public final void rule__Repeat__OperationsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6778:1: ( ( ruleInlineOperation ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6779:1: ( ruleInlineOperation )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6779:1: ( ruleInlineOperation )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6780:1: ruleInlineOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatAccess().getOperationsInlineOperationParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleInlineOperation_in_rule__Repeat__OperationsAssignment_1_114231);
            ruleInlineOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatAccess().getOperationsInlineOperationParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repeat__OperationsAssignment_1_1"


    // $ANTLR start "rule__Repeat__OperationsAssignment_1_2_1"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6789:1: rule__Repeat__OperationsAssignment_1_2_1 : ( ruleInlineOperation ) ;
    public final void rule__Repeat__OperationsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6793:1: ( ( ruleInlineOperation ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6794:1: ( ruleInlineOperation )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6794:1: ( ruleInlineOperation )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6795:1: ruleInlineOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatAccess().getOperationsInlineOperationParserRuleCall_1_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleInlineOperation_in_rule__Repeat__OperationsAssignment_1_2_114262);
            ruleInlineOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatAccess().getOperationsInlineOperationParserRuleCall_1_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repeat__OperationsAssignment_1_2_1"


    // $ANTLR start "rule__Repeat__SpecAssignment_1_6"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6804:1: rule__Repeat__SpecAssignment_1_6 : ( ruleRepeatSpec ) ;
    public final void rule__Repeat__SpecAssignment_1_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6808:1: ( ( ruleRepeatSpec ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6809:1: ( ruleRepeatSpec )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6809:1: ( ruleRepeatSpec )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6810:1: ruleRepeatSpec
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatAccess().getSpecRepeatSpecParserRuleCall_1_6_0()); 
            }
            pushFollow(FOLLOW_ruleRepeatSpec_in_rule__Repeat__SpecAssignment_1_614293);
            ruleRepeatSpec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatAccess().getSpecRepeatSpecParserRuleCall_1_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repeat__SpecAssignment_1_6"


    // $ANTLR start "rule__Range__MinAssignment_0"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6819:1: rule__Range__MinAssignment_0 : ( RULE_INT ) ;
    public final void rule__Range__MinAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6823:1: ( ( RULE_INT ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6824:1: ( RULE_INT )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6824:1: ( RULE_INT )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6825:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getMinINTTerminalRuleCall_0_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Range__MinAssignment_014324); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeAccess().getMinINTTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__MinAssignment_0"


    // $ANTLR start "rule__Range__MaxAssignment_2"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6834:1: rule__Range__MaxAssignment_2 : ( RULE_INT ) ;
    public final void rule__Range__MaxAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6838:1: ( ( RULE_INT ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6839:1: ( RULE_INT )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6839:1: ( RULE_INT )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6840:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getMaxINTTerminalRuleCall_2_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Range__MaxAssignment_214355); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeAccess().getMaxINTTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__MaxAssignment_2"

    // $ANTLR start synpred63_InternalKnittingExpressionLanguage
    public final void synpred63_InternalKnittingExpressionLanguage_fragment() throws RecognitionException {   
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2108:3: ( RULE_LF )
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2108:3: RULE_LF
        {
        match(input,RULE_LF,FOLLOW_RULE_LF_in_synpred63_InternalKnittingExpressionLanguage4413); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred63_InternalKnittingExpressionLanguage

    // $ANTLR start synpred70_InternalKnittingExpressionLanguage
    public final void synpred70_InternalKnittingExpressionLanguage_fragment() throws RecognitionException {   
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2570:3: ( RULE_LF )
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2570:3: RULE_LF
        {
        match(input,RULE_LF,FOLLOW_RULE_LF_in_synpred70_InternalKnittingExpressionLanguage5352); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred70_InternalKnittingExpressionLanguage

    // $ANTLR start synpred104_InternalKnittingExpressionLanguage
    public final void synpred104_InternalKnittingExpressionLanguage_fragment() throws RecognitionException {   
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5416:4: ( ({...}? => ( ( ( rule__Instruction__IdAssignment_1_0 ) ) ) ) )
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5416:4: ({...}? => ( ( ( rule__Instruction__IdAssignment_1_0 ) ) ) )
        {
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5416:4: ({...}? => ( ( ( rule__Instruction__IdAssignment_1_0 ) ) ) )
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5417:5: {...}? => ( ( ( rule__Instruction__IdAssignment_1_0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInstructionAccess().getUnorderedGroup_1(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred104_InternalKnittingExpressionLanguage", "getUnorderedGroupHelper().canSelect(grammarAccess.getInstructionAccess().getUnorderedGroup_1(), 0)");
        }
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5417:108: ( ( ( rule__Instruction__IdAssignment_1_0 ) ) )
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5418:6: ( ( rule__Instruction__IdAssignment_1_0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getInstructionAccess().getUnorderedGroup_1(), 0);
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5424:6: ( ( rule__Instruction__IdAssignment_1_0 ) )
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5426:7: ( rule__Instruction__IdAssignment_1_0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getInstructionAccess().getIdAssignment_1_0()); 
        }
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5427:7: ( rule__Instruction__IdAssignment_1_0 )
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5427:8: rule__Instruction__IdAssignment_1_0
        {
        pushFollow(FOLLOW_rule__Instruction__IdAssignment_1_0_in_synpred104_InternalKnittingExpressionLanguage11035);
        rule__Instruction__IdAssignment_1_0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred104_InternalKnittingExpressionLanguage

    // $ANTLR start synpred105_InternalKnittingExpressionLanguage
    public final void synpred105_InternalKnittingExpressionLanguage_fragment() throws RecognitionException {   
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5465:2: ( rule__Instruction__UnorderedGroup_1__1 )
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5465:2: rule__Instruction__UnorderedGroup_1__1
        {
        pushFollow(FOLLOW_rule__Instruction__UnorderedGroup_1__1_in_synpred105_InternalKnittingExpressionLanguage11188);
        rule__Instruction__UnorderedGroup_1__1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred105_InternalKnittingExpressionLanguage

    // $ANTLR start synpred106_InternalKnittingExpressionLanguage
    public final void synpred106_InternalKnittingExpressionLanguage_fragment() throws RecognitionException {   
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5494:2: ( rule__Row__UnorderedGroup_1__0 )
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5494:2: rule__Row__UnorderedGroup_1__0
        {
        pushFollow(FOLLOW_rule__Row__UnorderedGroup_1__0_in_synpred106_InternalKnittingExpressionLanguage11241);
        rule__Row__UnorderedGroup_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred106_InternalKnittingExpressionLanguage

    // $ANTLR start synpred107_InternalKnittingExpressionLanguage
    public final void synpred107_InternalKnittingExpressionLanguage_fragment() throws RecognitionException {   
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5512:4: ( ({...}? => ( ( ( rule__Row__ShortRowAssignment_1_0 ) ) ) ) )
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5512:4: ({...}? => ( ( ( rule__Row__ShortRowAssignment_1_0 ) ) ) )
        {
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5512:4: ({...}? => ( ( ( rule__Row__ShortRowAssignment_1_0 ) ) ) )
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5513:5: {...}? => ( ( ( rule__Row__ShortRowAssignment_1_0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_1(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred107_InternalKnittingExpressionLanguage", "getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_1(), 0)");
        }
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5513:100: ( ( ( rule__Row__ShortRowAssignment_1_0 ) ) )
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5514:6: ( ( rule__Row__ShortRowAssignment_1_0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getRowAccess().getUnorderedGroup_1(), 0);
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5520:6: ( ( rule__Row__ShortRowAssignment_1_0 ) )
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5522:7: ( rule__Row__ShortRowAssignment_1_0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getRowAccess().getShortRowAssignment_1_0()); 
        }
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5523:7: ( rule__Row__ShortRowAssignment_1_0 )
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5523:8: rule__Row__ShortRowAssignment_1_0
        {
        pushFollow(FOLLOW_rule__Row__ShortRowAssignment_1_0_in_synpred107_InternalKnittingExpressionLanguage11328);
        rule__Row__ShortRowAssignment_1_0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred107_InternalKnittingExpressionLanguage

    // $ANTLR start synpred108_InternalKnittingExpressionLanguage
    public final void synpred108_InternalKnittingExpressionLanguage_fragment() throws RecognitionException {   
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5561:2: ( rule__Row__UnorderedGroup_1__1 )
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5561:2: rule__Row__UnorderedGroup_1__1
        {
        pushFollow(FOLLOW_rule__Row__UnorderedGroup_1__1_in_synpred108_InternalKnittingExpressionLanguage11481);
        rule__Row__UnorderedGroup_1__1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred108_InternalKnittingExpressionLanguage

    // $ANTLR start synpred109_InternalKnittingExpressionLanguage
    public final void synpred109_InternalKnittingExpressionLanguage_fragment() throws RecognitionException {   
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5590:2: ( rule__Row__UnorderedGroup_4__0 )
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5590:2: rule__Row__UnorderedGroup_4__0
        {
        pushFollow(FOLLOW_rule__Row__UnorderedGroup_4__0_in_synpred109_InternalKnittingExpressionLanguage11534);
        rule__Row__UnorderedGroup_4__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred109_InternalKnittingExpressionLanguage

    // $ANTLR start synpred110_InternalKnittingExpressionLanguage
    public final void synpred110_InternalKnittingExpressionLanguage_fragment() throws RecognitionException {   
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5608:4: ( ({...}? => ( ( ( rule__Row__SideAssignment_4_0 ) ) ) ) )
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5608:4: ({...}? => ( ( ( rule__Row__SideAssignment_4_0 ) ) ) )
        {
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5608:4: ({...}? => ( ( ( rule__Row__SideAssignment_4_0 ) ) ) )
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5609:5: {...}? => ( ( ( rule__Row__SideAssignment_4_0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_4(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred110_InternalKnittingExpressionLanguage", "getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_4(), 0)");
        }
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5609:100: ( ( ( rule__Row__SideAssignment_4_0 ) ) )
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5610:6: ( ( rule__Row__SideAssignment_4_0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getRowAccess().getUnorderedGroup_4(), 0);
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5616:6: ( ( rule__Row__SideAssignment_4_0 ) )
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5618:7: ( rule__Row__SideAssignment_4_0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getRowAccess().getSideAssignment_4_0()); 
        }
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5619:7: ( rule__Row__SideAssignment_4_0 )
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5619:8: rule__Row__SideAssignment_4_0
        {
        pushFollow(FOLLOW_rule__Row__SideAssignment_4_0_in_synpred110_InternalKnittingExpressionLanguage11621);
        rule__Row__SideAssignment_4_0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred110_InternalKnittingExpressionLanguage

    // $ANTLR start synpred111_InternalKnittingExpressionLanguage
    public final void synpred111_InternalKnittingExpressionLanguage_fragment() throws RecognitionException {   
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5657:2: ( rule__Row__UnorderedGroup_4__1 )
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5657:2: rule__Row__UnorderedGroup_4__1
        {
        pushFollow(FOLLOW_rule__Row__UnorderedGroup_4__1_in_synpred111_InternalKnittingExpressionLanguage11774);
        rule__Row__UnorderedGroup_4__1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred111_InternalKnittingExpressionLanguage

    // $ANTLR start synpred112_InternalKnittingExpressionLanguage
    public final void synpred112_InternalKnittingExpressionLanguage_fragment() throws RecognitionException {   
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5686:2: ( rule__Knit__UnorderedGroup_4__0 )
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5686:2: rule__Knit__UnorderedGroup_4__0
        {
        pushFollow(FOLLOW_rule__Knit__UnorderedGroup_4__0_in_synpred112_InternalKnittingExpressionLanguage11827);
        rule__Knit__UnorderedGroup_4__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred112_InternalKnittingExpressionLanguage

    // $ANTLR start synpred113_InternalKnittingExpressionLanguage
    public final void synpred113_InternalKnittingExpressionLanguage_fragment() throws RecognitionException {   
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5704:4: ( ({...}? => ( ( ( rule__Knit__TogetherAssignment_4_0 ) ) ) ) )
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5704:4: ({...}? => ( ( ( rule__Knit__TogetherAssignment_4_0 ) ) ) )
        {
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5704:4: ({...}? => ( ( ( rule__Knit__TogetherAssignment_4_0 ) ) ) )
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5705:5: {...}? => ( ( ( rule__Knit__TogetherAssignment_4_0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getKnitAccess().getUnorderedGroup_4(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred113_InternalKnittingExpressionLanguage", "getUnorderedGroupHelper().canSelect(grammarAccess.getKnitAccess().getUnorderedGroup_4(), 0)");
        }
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5705:101: ( ( ( rule__Knit__TogetherAssignment_4_0 ) ) )
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5706:6: ( ( rule__Knit__TogetherAssignment_4_0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getKnitAccess().getUnorderedGroup_4(), 0);
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5712:6: ( ( rule__Knit__TogetherAssignment_4_0 ) )
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5714:7: ( rule__Knit__TogetherAssignment_4_0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getKnitAccess().getTogetherAssignment_4_0()); 
        }
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5715:7: ( rule__Knit__TogetherAssignment_4_0 )
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5715:8: rule__Knit__TogetherAssignment_4_0
        {
        pushFollow(FOLLOW_rule__Knit__TogetherAssignment_4_0_in_synpred113_InternalKnittingExpressionLanguage11914);
        rule__Knit__TogetherAssignment_4_0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred113_InternalKnittingExpressionLanguage

    // $ANTLR start synpred114_InternalKnittingExpressionLanguage
    public final void synpred114_InternalKnittingExpressionLanguage_fragment() throws RecognitionException {   
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5753:2: ( rule__Knit__UnorderedGroup_4__1 )
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5753:2: rule__Knit__UnorderedGroup_4__1
        {
        pushFollow(FOLLOW_rule__Knit__UnorderedGroup_4__1_in_synpred114_InternalKnittingExpressionLanguage12067);
        rule__Knit__UnorderedGroup_4__1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred114_InternalKnittingExpressionLanguage

    // $ANTLR start synpred115_InternalKnittingExpressionLanguage
    public final void synpred115_InternalKnittingExpressionLanguage_fragment() throws RecognitionException {   
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5782:2: ( rule__Purl__UnorderedGroup_4__0 )
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5782:2: rule__Purl__UnorderedGroup_4__0
        {
        pushFollow(FOLLOW_rule__Purl__UnorderedGroup_4__0_in_synpred115_InternalKnittingExpressionLanguage12120);
        rule__Purl__UnorderedGroup_4__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred115_InternalKnittingExpressionLanguage

    // $ANTLR start synpred116_InternalKnittingExpressionLanguage
    public final void synpred116_InternalKnittingExpressionLanguage_fragment() throws RecognitionException {   
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5800:4: ( ({...}? => ( ( ( rule__Purl__TogetherAssignment_4_0 ) ) ) ) )
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5800:4: ({...}? => ( ( ( rule__Purl__TogetherAssignment_4_0 ) ) ) )
        {
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5800:4: ({...}? => ( ( ( rule__Purl__TogetherAssignment_4_0 ) ) ) )
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5801:5: {...}? => ( ( ( rule__Purl__TogetherAssignment_4_0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPurlAccess().getUnorderedGroup_4(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred116_InternalKnittingExpressionLanguage", "getUnorderedGroupHelper().canSelect(grammarAccess.getPurlAccess().getUnorderedGroup_4(), 0)");
        }
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5801:101: ( ( ( rule__Purl__TogetherAssignment_4_0 ) ) )
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5802:6: ( ( rule__Purl__TogetherAssignment_4_0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getPurlAccess().getUnorderedGroup_4(), 0);
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5808:6: ( ( rule__Purl__TogetherAssignment_4_0 ) )
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5810:7: ( rule__Purl__TogetherAssignment_4_0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getPurlAccess().getTogetherAssignment_4_0()); 
        }
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5811:7: ( rule__Purl__TogetherAssignment_4_0 )
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5811:8: rule__Purl__TogetherAssignment_4_0
        {
        pushFollow(FOLLOW_rule__Purl__TogetherAssignment_4_0_in_synpred116_InternalKnittingExpressionLanguage12207);
        rule__Purl__TogetherAssignment_4_0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred116_InternalKnittingExpressionLanguage

    // $ANTLR start synpred117_InternalKnittingExpressionLanguage
    public final void synpred117_InternalKnittingExpressionLanguage_fragment() throws RecognitionException {   
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5849:2: ( rule__Purl__UnorderedGroup_4__1 )
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5849:2: rule__Purl__UnorderedGroup_4__1
        {
        pushFollow(FOLLOW_rule__Purl__UnorderedGroup_4__1_in_synpred117_InternalKnittingExpressionLanguage12360);
        rule__Purl__UnorderedGroup_4__1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred117_InternalKnittingExpressionLanguage

    // Delegated rules

    public final boolean synpred106_InternalKnittingExpressionLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred106_InternalKnittingExpressionLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred114_InternalKnittingExpressionLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred114_InternalKnittingExpressionLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred115_InternalKnittingExpressionLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred115_InternalKnittingExpressionLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred70_InternalKnittingExpressionLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred70_InternalKnittingExpressionLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred113_InternalKnittingExpressionLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred113_InternalKnittingExpressionLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred111_InternalKnittingExpressionLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred111_InternalKnittingExpressionLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred108_InternalKnittingExpressionLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred108_InternalKnittingExpressionLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred63_InternalKnittingExpressionLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred63_InternalKnittingExpressionLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred109_InternalKnittingExpressionLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred109_InternalKnittingExpressionLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred104_InternalKnittingExpressionLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred104_InternalKnittingExpressionLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred107_InternalKnittingExpressionLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred107_InternalKnittingExpressionLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred105_InternalKnittingExpressionLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred105_InternalKnittingExpressionLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred110_InternalKnittingExpressionLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred110_InternalKnittingExpressionLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred112_InternalKnittingExpressionLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred112_InternalKnittingExpressionLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred117_InternalKnittingExpressionLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred117_InternalKnittingExpressionLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred116_InternalKnittingExpressionLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred116_InternalKnittingExpressionLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA25 dfa25 = new DFA25(this);
    static final String DFA25_eotS =
        "\12\uffff";
    static final String DFA25_eofS =
        "\12\uffff";
    static final String DFA25_minS =
        "\1\7\2\uffff\1\34\1\uffff\2\117\3\uffff";
    static final String DFA25_maxS =
        "\1\116\2\uffff\1\122\1\uffff\2\121\3\uffff";
    static final String DFA25_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\6\2\uffff\1\4\1\3\1\5";
    static final String DFA25_specialS =
        "\12\uffff}>";
    static final String[] DFA25_transitionS = {
            "\1\3\105\uffff\1\1\1\2",
            "",
            "",
            "\1\5\1\6\61\uffff\1\10\1\7\1\11\1\4",
            "",
            "\1\10\1\7\1\11",
            "\1\10\1\7\1\11",
            "",
            "",
            ""
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "1097:1: rule__RepeatSpec__Alternatives : ( ( ( rule__RepeatSpec__ToEndAssignment_0 ) ) | ( ( rule__RepeatSpec__ToMarkerAssignment_1 ) ) | ( ( rule__RepeatSpec__Group_2__0 ) ) | ( ( rule__RepeatSpec__Group_3__0 ) ) | ( ( rule__RepeatSpec__Group_4__0 ) ) | ( ( rule__RepeatSpec__Group_5__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_rulePattern_in_entryRulePattern67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePattern74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pattern__Group__0_in_rulePattern100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockOperation_in_entryRuleBlockOperation127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlockOperation134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlockOperation__Alternatives_in_ruleBlockOperation160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_entryRuleInstruction187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstruction194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__Group__0_in_ruleInstruction220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRow_in_entryRuleRow247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRow254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group__0_in_ruleRow280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_entryRuleMessage307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessage314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__0_in_ruleMessage340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInlineOperation_in_entryRuleInlineOperation367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInlineOperation374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InlineOperation__Alternatives_in_ruleInlineOperation400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKnit_in_entryRuleKnit427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKnit434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knit__Group__0_in_ruleKnit460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePurl_in_entryRulePurl487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePurl494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Purl__Group__0_in_rulePurl520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSlip_in_entryRuleSlip547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSlip554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Slip__Group__0_in_ruleSlip580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRepeatSpec_in_entryRuleRepeatSpec607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRepeatSpec614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RepeatSpec__Alternatives_in_ruleRepeatSpec640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRepeat_in_entryRuleRepeat667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRepeat674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repeat__Alternatives_in_ruleRepeat700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRange_in_entryRuleRange727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRange734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__Group__0_in_ruleRange760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_rule__BlockOperation__Alternatives796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRow_in_rule__BlockOperation__Alternatives813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_rule__BlockOperation__Alternatives830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Instruction__ShapeAlternatives_2_2_1_0863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Instruction__ShapeAlternatives_2_2_1_0883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Instruction__Alternatives_2_3_2918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Instruction__Alternatives_2_3_2938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__Group_3_0__0_in_rule__Instruction__Alternatives_3972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__Group_3_1__0_in_rule__Instruction__Alternatives_3990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Row__LabelAlternatives_2_01024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Row__LabelAlternatives_2_01044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Row__LabelAlternatives_2_01064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Row__LabelAlternatives_2_01084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__RangeAssignment_3_0_in_rule__Row__Alternatives_31118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group_3_1__0_in_rule__Row__Alternatives_31136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Row__SubsequentAlternatives_3_1_2_2_01170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Row__SubsequentAlternatives_3_1_2_2_01190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Row__Alternatives_3_1_2_31225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Row__Alternatives_3_1_2_31245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Row__SideAlternatives_4_0_01280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Row__SideAlternatives_4_0_01300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKnit_in_rule__InlineOperation__Alternatives1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePurl_in_rule__InlineOperation__Alternatives1351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSlip_in_rule__InlineOperation__Alternatives1368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRepeat_in_rule__InlineOperation__Alternatives1385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Knit__Alternatives_01418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Knit__Alternatives_01438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Knit__Alternatives_01458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Knit__Alternatives_01478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Knit__Alternatives_31513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Knit__Alternatives_31533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Knit__ThroughTrailingLoopAlternatives_4_1_01568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Knit__ThroughTrailingLoopAlternatives_4_1_01588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Purl__Alternatives_01623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Purl__Alternatives_01643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Purl__Alternatives_01663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Purl__Alternatives_01683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Purl__Alternatives_31718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Purl__Alternatives_31738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Purl__ThroughTrailingLoopAlternatives_4_1_01773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Purl__ThroughTrailingLoopAlternatives_4_1_01793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Slip__ReverseAlternatives_1_01828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Slip__ReverseAlternatives_1_01848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Slip__ReverseAlternatives_1_01868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Slip__ReverseAlternatives_1_01888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Slip__Alternatives_21923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Slip__Alternatives_21943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Slip__Alternatives_21963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Slip__Alternatives_21983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Slip__Group_3_0__0_in_rule__Slip__Alternatives_32017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Slip__Alternatives_32036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Slip__Alternatives_3_0_12071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Slip__Alternatives_3_0_12091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Slip__KnitwiseAssignment_4_0_in_rule__Slip__Alternatives_42125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Slip__PurlwiseAssignment_4_1_in_rule__Slip__Alternatives_42143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Slip__KnitwiseAlternatives_4_0_02177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Slip__KnitwiseAlternatives_4_0_02197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Slip__PurlwiseAlternatives_4_1_02232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Slip__PurlwiseAlternatives_4_1_02252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Slip__YarnPositionAlternatives_5_02287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Slip__YarnPositionAlternatives_5_02307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RepeatSpec__ToEndAssignment_0_in_rule__RepeatSpec__Alternatives2341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RepeatSpec__ToMarkerAssignment_1_in_rule__RepeatSpec__Alternatives2359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RepeatSpec__Group_2__0_in_rule__RepeatSpec__Alternatives2377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RepeatSpec__Group_3__0_in_rule__RepeatSpec__Alternatives2395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RepeatSpec__Group_4__0_in_rule__RepeatSpec__Alternatives2413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RepeatSpec__Group_5__0_in_rule__RepeatSpec__Alternatives2431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__RepeatSpec__Alternatives_2_12465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__RepeatSpec__Alternatives_2_12485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__RepeatSpec__Alternatives_3_12520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__RepeatSpec__Alternatives_3_12540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__RepeatSpec__Alternatives_4_12575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__RepeatSpec__Alternatives_4_12595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repeat__Group_0__0_in_rule__Repeat__Alternatives2629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repeat__Group_1__0_in_rule__Repeat__Alternatives2647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Repeat__Alternatives_0_02681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Repeat__Alternatives_0_02701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Repeat__Alternatives_1_4_12736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Repeat__Alternatives_1_4_12756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pattern__Group__0__Impl_in_rule__Pattern__Group__02788 = new BitSet(new long[]{0x0020000000000040L,0x0000000000000380L});
    public static final BitSet FOLLOW_rule__Pattern__Group__1_in_rule__Pattern__Group__02791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LF_in_rule__Pattern__Group__0__Impl2819 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Pattern__Group__1__Impl_in_rule__Pattern__Group__12850 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Pattern__Group__2_in_rule__Pattern__Group__12853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pattern__ElementsAssignment_1_in_rule__Pattern__Group__1__Impl2882 = new BitSet(new long[]{0x0020000000000042L,0x0000000000000380L});
    public static final BitSet FOLLOW_rule__Pattern__ElementsAssignment_1_in_rule__Pattern__Group__1__Impl2894 = new BitSet(new long[]{0x0020000000000042L,0x0000000000000380L});
    public static final BitSet FOLLOW_rule__Pattern__Group__2__Impl_in_rule__Pattern__Group__22927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LF_in_rule__Pattern__Group__2__Impl2955 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Instruction__Group__0__Impl_in_rule__Instruction__Group__02992 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__Instruction__Group__1_in_rule__Instruction__Group__02995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__Instruction__Group__0__Impl3023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__Group__1__Impl_in_rule__Instruction__Group__13054 = new BitSet(new long[]{0x2840000000000000L});
    public static final BitSet FOLLOW_rule__Instruction__Group__2_in_rule__Instruction__Group__13057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__UnorderedGroup_1_in_rule__Instruction__Group__1__Impl3084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__Group__2__Impl_in_rule__Instruction__Group__23114 = new BitSet(new long[]{0x2840000000000000L});
    public static final BitSet FOLLOW_rule__Instruction__Group__3_in_rule__Instruction__Group__23117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__Group_2__0_in_rule__Instruction__Group__2__Impl3144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__Group__3__Impl_in_rule__Instruction__Group__33175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__Alternatives_3_in_rule__Instruction__Group__3__Impl3202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__Group_2__0__Impl_in_rule__Instruction__Group_2__03240 = new BitSet(new long[]{0x0380000000003080L});
    public static final BitSet FOLLOW_rule__Instruction__Group_2__1_in_rule__Instruction__Group_2__03243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Instruction__Group_2__0__Impl3271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__Group_2__1__Impl_in_rule__Instruction__Group_2__13302 = new BitSet(new long[]{0x0380000000003080L});
    public static final BitSet FOLLOW_rule__Instruction__Group_2__2_in_rule__Instruction__Group_2__13305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__Group_2_1__0_in_rule__Instruction__Group_2__1__Impl3332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__Group_2__2__Impl_in_rule__Instruction__Group_2__23363 = new BitSet(new long[]{0x0380000000003080L});
    public static final BitSet FOLLOW_rule__Instruction__Group_2__3_in_rule__Instruction__Group_2__23366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__Group_2_2__0_in_rule__Instruction__Group_2__2__Impl3393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__Group_2__3__Impl_in_rule__Instruction__Group_2__33424 = new BitSet(new long[]{0x0380000000003080L});
    public static final BitSet FOLLOW_rule__Instruction__Group_2__4_in_rule__Instruction__Group_2__33427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__Group_2_3__0_in_rule__Instruction__Group_2__3__Impl3454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__Group_2__4__Impl_in_rule__Instruction__Group_2__43485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__Instruction__Group_2__4__Impl3513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__Group_2_1__0__Impl_in_rule__Instruction__Group_2_1__03554 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Instruction__Group_2_1__1_in_rule__Instruction__Group_2_1__03557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__Instruction__Group_2_1__0__Impl3585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__Group_2_1__1__Impl_in_rule__Instruction__Group_2_1__13616 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Instruction__Group_2_1__2_in_rule__Instruction__Group_2_1__13619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__HasKeyAssignment_2_1_1_in_rule__Instruction__Group_2_1__1__Impl3646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__Group_2_1__2__Impl_in_rule__Instruction__Group_2_1__23676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__MessageKeyAssignment_2_1_2_in_rule__Instruction__Group_2_1__2__Impl3703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__Group_2_2__0__Impl_in_rule__Instruction__Group_2_2__03740 = new BitSet(new long[]{0x0200000000003000L});
    public static final BitSet FOLLOW_rule__Instruction__Group_2_2__1_in_rule__Instruction__Group_2_2__03743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__Instruction__Group_2_2__0__Impl3772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__Group_2_2__1__Impl_in_rule__Instruction__Group_2_2__13805 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_rule__Instruction__Group_2_2__2_in_rule__Instruction__Group_2_2__13808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__ShapeAssignment_2_2_1_in_rule__Instruction__Group_2_2__1__Impl3835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__Group_2_2__2__Impl_in_rule__Instruction__Group_2_2__23865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__Instruction__Group_2_2__2__Impl3894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__Group_2_3__0__Impl_in_rule__Instruction__Group_2_3__03933 = new BitSet(new long[]{0x0200000000000080L});
    public static final BitSet FOLLOW_rule__Instruction__Group_2_3__1_in_rule__Instruction__Group_2_3__03936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__Instruction__Group_2_3__0__Impl3965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__Group_2_3__1__Impl_in_rule__Instruction__Group_2_3__13998 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__Instruction__Group_2_3__2_in_rule__Instruction__Group_2_3__14001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__RowCountAssignment_2_3_1_in_rule__Instruction__Group_2_3__1__Impl4028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__Group_2_3__2__Impl_in_rule__Instruction__Group_2_3__24058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__Alternatives_2_3_2_in_rule__Instruction__Group_2_3__2__Impl4085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__Group_3_0__0__Impl_in_rule__Instruction__Group_3_0__04122 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000380L});
    public static final BitSet FOLLOW_rule__Instruction__Group_3_0__1_in_rule__Instruction__Group_3_0__04125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__Instruction__Group_3_0__0__Impl4153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__Group_3_0__1__Impl_in_rule__Instruction__Group_3_0__14184 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000380L});
    public static final BitSet FOLLOW_rule__Instruction__Group_3_0__2_in_rule__Instruction__Group_3_0__14187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LF_in_rule__Instruction__Group_3_0__1__Impl4215 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Instruction__Group_3_0__2__Impl_in_rule__Instruction__Group_3_0__24246 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_rule__Instruction__Group_3_0__3_in_rule__Instruction__Group_3_0__24249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__RowsAssignment_3_0_2_in_rule__Instruction__Group_3_0__2__Impl4278 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000380L});
    public static final BitSet FOLLOW_rule__Instruction__RowsAssignment_3_0_2_in_rule__Instruction__Group_3_0__2__Impl4290 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000380L});
    public static final BitSet FOLLOW_rule__Instruction__Group_3_0__3__Impl_in_rule__Instruction__Group_3_0__34323 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Instruction__Group_3_0__4_in_rule__Instruction__Group_3_0__34326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__Instruction__Group_3_0__3__Impl4354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__Group_3_0__4__Impl_in_rule__Instruction__Group_3_0__44385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LF_in_rule__Instruction__Group_3_0__4__Impl4413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__Group_3_1__0__Impl_in_rule__Instruction__Group_3_1__04454 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Instruction__Group_3_1__1_in_rule__Instruction__Group_3_1__04457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__Instruction__Group_3_1__0__Impl4485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__Group_3_1__1__Impl_in_rule__Instruction__Group_3_1__14516 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000380L});
    public static final BitSet FOLLOW_rule__Instruction__Group_3_1__2_in_rule__Instruction__Group_3_1__14519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LF_in_rule__Instruction__Group_3_1__1__Impl4546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__Group_3_1__2__Impl_in_rule__Instruction__Group_3_1__24575 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Instruction__Group_3_1__3_in_rule__Instruction__Group_3_1__24578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__RowsAssignment_3_1_2_in_rule__Instruction__Group_3_1__2__Impl4607 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000380L});
    public static final BitSet FOLLOW_rule__Instruction__RowsAssignment_3_1_2_in_rule__Instruction__Group_3_1__2__Impl4619 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000380L});
    public static final BitSet FOLLOW_rule__Instruction__Group_3_1__3__Impl_in_rule__Instruction__Group_3_1__34652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LF_in_rule__Instruction__Group_3_1__3__Impl4679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group__0__Impl_in_rule__Row__Group__04716 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000380L});
    public static final BitSet FOLLOW_rule__Row__Group__1_in_rule__Row__Group__04719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__NextRowAssignment_0_in_rule__Row__Group__0__Impl4746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group__1__Impl_in_rule__Row__Group__14777 = new BitSet(new long[]{0x00000000000F0000L});
    public static final BitSet FOLLOW_rule__Row__Group__2_in_rule__Row__Group__14780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__UnorderedGroup_1_in_rule__Row__Group__1__Impl4807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group__2__Impl_in_rule__Row__Group__24837 = new BitSet(new long[]{0x0100000000C00080L});
    public static final BitSet FOLLOW_rule__Row__Group__3_in_rule__Row__Group__24840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__LabelAssignment_2_in_rule__Row__Group__2__Impl4867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group__3__Impl_in_rule__Row__Group__34897 = new BitSet(new long[]{0x0100000000C00080L});
    public static final BitSet FOLLOW_rule__Row__Group__4_in_rule__Row__Group__34900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Alternatives_3_in_rule__Row__Group__3__Impl4927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group__4__Impl_in_rule__Row__Group__44958 = new BitSet(new long[]{0x2040000000000000L});
    public static final BitSet FOLLOW_rule__Row__Group__5_in_rule__Row__Group__44961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__UnorderedGroup_4_in_rule__Row__Group__4__Impl4988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group__5__Impl_in_rule__Row__Group__55018 = new BitSet(new long[]{0x2040000000000000L});
    public static final BitSet FOLLOW_rule__Row__Group__6_in_rule__Row__Group__55021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group_5__0_in_rule__Row__Group__5__Impl5048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group__6__Impl_in_rule__Row__Group__65079 = new BitSet(new long[]{0x00180FFF0F000010L,0x0000000000000008L});
    public static final BitSet FOLLOW_rule__Row__Group__7_in_rule__Row__Group__65082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__Row__Group__6__Impl5110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group__7__Impl_in_rule__Row__Group__75141 = new BitSet(new long[]{0x00180FFF0F000010L,0x0000000000000008L});
    public static final BitSet FOLLOW_rule__Row__Group__8_in_rule__Row__Group__75144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LF_in_rule__Row__Group__7__Impl5172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group__8__Impl_in_rule__Row__Group__85203 = new BitSet(new long[]{0x0200000000000010L});
    public static final BitSet FOLLOW_rule__Row__Group__9_in_rule__Row__Group__85206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__OperationsAssignment_8_in_rule__Row__Group__8__Impl5233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group__9__Impl_in_rule__Row__Group__95263 = new BitSet(new long[]{0x0200000000000010L});
    public static final BitSet FOLLOW_rule__Row__Group__10_in_rule__Row__Group__95266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group_9__0_in_rule__Row__Group__9__Impl5293 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group__10__Impl_in_rule__Row__Group__105324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LF_in_rule__Row__Group__10__Impl5352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group_3_1__0__Impl_in_rule__Row__Group_3_1__05405 = new BitSet(new long[]{0x4200000000000000L});
    public static final BitSet FOLLOW_rule__Row__Group_3_1__1_in_rule__Row__Group_3_1__05408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__NumberAssignment_3_1_0_in_rule__Row__Group_3_1__0__Impl5435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group_3_1__1__Impl_in_rule__Row__Group_3_1__15465 = new BitSet(new long[]{0x4200000000000000L});
    public static final BitSet FOLLOW_rule__Row__Group_3_1__2_in_rule__Row__Group_3_1__15468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group_3_1_1__0_in_rule__Row__Group_3_1__1__Impl5495 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group_3_1__2__Impl_in_rule__Row__Group_3_1__25526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group_3_1_2__0_in_rule__Row__Group_3_1__2__Impl5553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group_3_1_1__0__Impl_in_rule__Row__Group_3_1_1__05590 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Row__Group_3_1_1__1_in_rule__Row__Group_3_1_1__05593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__Row__Group_3_1_1__0__Impl5621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group_3_1_1__1__Impl_in_rule__Row__Group_3_1_1__15652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__NumberAssignment_3_1_1_1_in_rule__Row__Group_3_1_1__1__Impl5679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group_3_1_2__0__Impl_in_rule__Row__Group_3_1_2__05713 = new BitSet(new long[]{0x8000000000300000L});
    public static final BitSet FOLLOW_rule__Row__Group_3_1_2__1_in_rule__Row__Group_3_1_2__05716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__Row__Group_3_1_2__0__Impl5744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group_3_1_2__1__Impl_in_rule__Row__Group_3_1_2__15775 = new BitSet(new long[]{0x8000000000300000L});
    public static final BitSet FOLLOW_rule__Row__Group_3_1_2__2_in_rule__Row__Group_3_1_2__15778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__Row__Group_3_1_2__1__Impl5807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group_3_1_2__2__Impl_in_rule__Row__Group_3_1_2__25840 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__Row__Group_3_1_2__3_in_rule__Row__Group_3_1_2__25843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__SubsequentAssignment_3_1_2_2_in_rule__Row__Group_3_1_2__2__Impl5870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group_3_1_2__3__Impl_in_rule__Row__Group_3_1_2__35900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Alternatives_3_1_2_3_in_rule__Row__Group_3_1_2__3__Impl5927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group_4_1__0__Impl_in_rule__Row__Group_4_1__05966 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Row__Group_4_1__1_in_rule__Row__Group_4_1__05969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__Row__Group_4_1__0__Impl5997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group_4_1__1__Impl_in_rule__Row__Group_4_1__16028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__YarnRefAssignment_4_1_1_in_rule__Row__Group_4_1__1__Impl6055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group_5__0__Impl_in_rule__Row__Group_5__06089 = new BitSet(new long[]{0x0280000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_rule__Row__Group_5__1_in_rule__Row__Group_5__06092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Row__Group_5__0__Impl6120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group_5__1__Impl_in_rule__Row__Group_5__16151 = new BitSet(new long[]{0x0280000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_rule__Row__Group_5__2_in_rule__Row__Group_5__16154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group_5_1__0_in_rule__Row__Group_5__1__Impl6181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group_5__2__Impl_in_rule__Row__Group_5__26212 = new BitSet(new long[]{0x0280000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_rule__Row__Group_5__3_in_rule__Row__Group_5__26215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group_5_2__0_in_rule__Row__Group_5__2__Impl6242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group_5__3__Impl_in_rule__Row__Group_5__36273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__Row__Group_5__3__Impl6301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group_5_1__0__Impl_in_rule__Row__Group_5_1__06340 = new BitSet(new long[]{0x0200000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_rule__Row__Group_5_1__1_in_rule__Row__Group_5_1__06343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__Row__Group_5_1__0__Impl6372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group_5_1__1__Impl_in_rule__Row__Group_5_1__16405 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__Row__Group_5_1__2_in_rule__Row__Group_5_1__16408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__InformAssignment_5_1_1_in_rule__Row__Group_5_1__1__Impl6435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group_5_1__2__Impl_in_rule__Row__Group_5_1__26465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__Row__Group_5_1__2__Impl6494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group_5_2__0__Impl_in_rule__Row__Group_5_2__06533 = new BitSet(new long[]{0x0200000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Row__Group_5_2__1_in_rule__Row__Group_5_2__06536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__Row__Group_5_2__0__Impl6565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group_5_2__1__Impl_in_rule__Row__Group_5_2__16598 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group_5_2__2_in_rule__Row__Group_5_2__16601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__ResetAssignment_5_2_1_in_rule__Row__Group_5_2__1__Impl6628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group_5_2__2__Impl_in_rule__Row__Group_5_2__26658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rule__Row__Group_5_2__2__Impl6687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group_9__0__Impl_in_rule__Row__Group_9__06726 = new BitSet(new long[]{0x00180FFF0F000010L,0x0000000000000008L});
    public static final BitSet FOLLOW_rule__Row__Group_9__1_in_rule__Row__Group_9__06729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__Row__Group_9__0__Impl6757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group_9__1__Impl_in_rule__Row__Group_9__16788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__OperationsAssignment_9_1_in_rule__Row__Group_9__1__Impl6815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__0__Impl_in_rule__Message__Group__06849 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Message__Group__1_in_rule__Message__Group__06852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__MessageAssignment_0_in_rule__Message__Group__0__Impl6879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__1__Impl_in_rule__Message__Group__16909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LF_in_rule__Message__Group__1__Impl6936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knit__Group__0__Impl_in_rule__Knit__Group__06969 = new BitSet(new long[]{0x00000000F0000080L,0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Knit__Group__1_in_rule__Knit__Group__06972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knit__Alternatives_0_in_rule__Knit__Group__0__Impl6999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knit__Group__1__Impl_in_rule__Knit__Group__17029 = new BitSet(new long[]{0x00000000F0000080L,0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Knit__Group__2_in_rule__Knit__Group__17032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knit__Group__2__Impl_in_rule__Knit__Group__27090 = new BitSet(new long[]{0x00000000F0000080L,0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Knit__Group__3_in_rule__Knit__Group__27093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knit__NumberAssignment_2_in_rule__Knit__Group__2__Impl7120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knit__Group__3__Impl_in_rule__Knit__Group__37151 = new BitSet(new long[]{0x00000000F0000080L,0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Knit__Group__4_in_rule__Knit__Group__37154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knit__Alternatives_3_in_rule__Knit__Group__3__Impl7181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knit__Group__4__Impl_in_rule__Knit__Group__47212 = new BitSet(new long[]{0x0100000000000080L,0x0000000000006004L});
    public static final BitSet FOLLOW_rule__Knit__Group__5_in_rule__Knit__Group__47215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knit__UnorderedGroup_4_in_rule__Knit__Group__4__Impl7242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knit__Group__5__Impl_in_rule__Knit__Group__57272 = new BitSet(new long[]{0x0100000000000080L,0x0000000000006004L});
    public static final BitSet FOLLOW_rule__Knit__Group__6_in_rule__Knit__Group__57275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knit__Group_5__0_in_rule__Knit__Group__5__Impl7302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knit__Group__6__Impl_in_rule__Knit__Group__67333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knit__Group_6__0_in_rule__Knit__Group__6__Impl7360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knit__Group_5__0__Impl_in_rule__Knit__Group_5__07405 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Knit__Group_5__1_in_rule__Knit__Group_5__07408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__Knit__Group_5__0__Impl7436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knit__Group_5__1__Impl_in_rule__Knit__Group_5__17467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knit__YarnRefAssignment_5_1_in_rule__Knit__Group_5__1__Impl7494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knit__Group_6__0__Impl_in_rule__Knit__Group_6__07528 = new BitSet(new long[]{0x0000000000000080L,0x0000000000006004L});
    public static final BitSet FOLLOW_rule__Knit__Group_6__1_in_rule__Knit__Group_6__07531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rule__Knit__Group_6__0__Impl7560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knit__Group_6__1__Impl_in_rule__Knit__Group_6__17593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knit__RepeatAssignment_6_1_in_rule__Knit__Group_6__1__Impl7620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Purl__Group__0__Impl_in_rule__Purl__Group__07654 = new BitSet(new long[]{0x00000000F0000080L,0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Purl__Group__1_in_rule__Purl__Group__07657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Purl__Alternatives_0_in_rule__Purl__Group__0__Impl7684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Purl__Group__1__Impl_in_rule__Purl__Group__17714 = new BitSet(new long[]{0x00000000F0000080L,0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Purl__Group__2_in_rule__Purl__Group__17717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Purl__Group__2__Impl_in_rule__Purl__Group__27775 = new BitSet(new long[]{0x00000000F0000080L,0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Purl__Group__3_in_rule__Purl__Group__27778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Purl__NumberAssignment_2_in_rule__Purl__Group__2__Impl7805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Purl__Group__3__Impl_in_rule__Purl__Group__37836 = new BitSet(new long[]{0x00000000F0000080L,0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Purl__Group__4_in_rule__Purl__Group__37839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Purl__Alternatives_3_in_rule__Purl__Group__3__Impl7866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Purl__Group__4__Impl_in_rule__Purl__Group__47897 = new BitSet(new long[]{0x0100000000000080L,0x0000000000006004L});
    public static final BitSet FOLLOW_rule__Purl__Group__5_in_rule__Purl__Group__47900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Purl__UnorderedGroup_4_in_rule__Purl__Group__4__Impl7927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Purl__Group__5__Impl_in_rule__Purl__Group__57957 = new BitSet(new long[]{0x0100000000000080L,0x0000000000006004L});
    public static final BitSet FOLLOW_rule__Purl__Group__6_in_rule__Purl__Group__57960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Purl__Group_5__0_in_rule__Purl__Group__5__Impl7987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Purl__Group__6__Impl_in_rule__Purl__Group__68018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Purl__Group_6__0_in_rule__Purl__Group__6__Impl8045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Purl__Group_5__0__Impl_in_rule__Purl__Group_5__08090 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Purl__Group_5__1_in_rule__Purl__Group_5__08093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__Purl__Group_5__0__Impl8121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Purl__Group_5__1__Impl_in_rule__Purl__Group_5__18152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Purl__YarnRefAssignment_5_1_in_rule__Purl__Group_5__1__Impl8179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Purl__Group_6__0__Impl_in_rule__Purl__Group_6__08213 = new BitSet(new long[]{0x0000000000000080L,0x0000000000006004L});
    public static final BitSet FOLLOW_rule__Purl__Group_6__1_in_rule__Purl__Group_6__08216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rule__Purl__Group_6__0__Impl8245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Purl__Group_6__1__Impl_in_rule__Purl__Group_6__18278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Purl__RepeatAssignment_6_1_in_rule__Purl__Group_6__1__Impl8305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Slip__Group__0__Impl_in_rule__Slip__Group__08339 = new BitSet(new long[]{0x00000FF000000000L});
    public static final BitSet FOLLOW_rule__Slip__Group__1_in_rule__Slip__Group__08342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Slip__Group__1__Impl_in_rule__Slip__Group__18400 = new BitSet(new long[]{0x00000FF000000000L});
    public static final BitSet FOLLOW_rule__Slip__Group__2_in_rule__Slip__Group__18403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Slip__ReverseAssignment_1_in_rule__Slip__Group__1__Impl8430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Slip__Group__2__Impl_in_rule__Slip__Group__28461 = new BitSet(new long[]{0x0007F00000000080L});
    public static final BitSet FOLLOW_rule__Slip__Group__3_in_rule__Slip__Group__28464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Slip__Alternatives_2_in_rule__Slip__Group__2__Impl8491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Slip__Group__3__Impl_in_rule__Slip__Group__38521 = new BitSet(new long[]{0x0007F00000000080L});
    public static final BitSet FOLLOW_rule__Slip__Group__4_in_rule__Slip__Group__38524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Slip__Alternatives_3_in_rule__Slip__Group__3__Impl8551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Slip__Group__4__Impl_in_rule__Slip__Group__48582 = new BitSet(new long[]{0x0007F00000000080L});
    public static final BitSet FOLLOW_rule__Slip__Group__5_in_rule__Slip__Group__48585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Slip__Alternatives_4_in_rule__Slip__Group__4__Impl8612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Slip__Group__5__Impl_in_rule__Slip__Group__58643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Slip__YarnPositionAssignment_5_in_rule__Slip__Group__5__Impl8670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Slip__Group_3_0__0__Impl_in_rule__Slip__Group_3_0__08713 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_rule__Slip__Group_3_0__1_in_rule__Slip__Group_3_0__08716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Slip__NumberAssignment_3_0_0_in_rule__Slip__Group_3_0__0__Impl8743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Slip__Group_3_0__1__Impl_in_rule__Slip__Group_3_0__18773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Slip__Alternatives_3_0_1_in_rule__Slip__Group_3_0__1__Impl8800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RepeatSpec__Group_2__0__Impl_in_rule__RepeatSpec__Group_2__08835 = new BitSet(new long[]{0x0000000030000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_rule__RepeatSpec__Group_2__1_in_rule__RepeatSpec__Group_2__08838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RepeatSpec__ValueAssignment_2_0_in_rule__RepeatSpec__Group_2__0__Impl8865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RepeatSpec__Group_2__1__Impl_in_rule__RepeatSpec__Group_2__18895 = new BitSet(new long[]{0x0000000030000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_rule__RepeatSpec__Group_2__2_in_rule__RepeatSpec__Group_2__18898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RepeatSpec__Alternatives_2_1_in_rule__RepeatSpec__Group_2__1__Impl8925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RepeatSpec__Group_2__2__Impl_in_rule__RepeatSpec__Group_2__28956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RepeatSpec__BeforeEndAssignment_2_2_in_rule__RepeatSpec__Group_2__2__Impl8983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RepeatSpec__Group_3__0__Impl_in_rule__RepeatSpec__Group_3__09019 = new BitSet(new long[]{0x0000000030000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_rule__RepeatSpec__Group_3__1_in_rule__RepeatSpec__Group_3__09022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RepeatSpec__ValueAssignment_3_0_in_rule__RepeatSpec__Group_3__0__Impl9049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RepeatSpec__Group_3__1__Impl_in_rule__RepeatSpec__Group_3__19079 = new BitSet(new long[]{0x0000000030000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_rule__RepeatSpec__Group_3__2_in_rule__RepeatSpec__Group_3__19082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RepeatSpec__Alternatives_3_1_in_rule__RepeatSpec__Group_3__1__Impl9109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RepeatSpec__Group_3__2__Impl_in_rule__RepeatSpec__Group_3__29140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RepeatSpec__BeforeGapAssignment_3_2_in_rule__RepeatSpec__Group_3__2__Impl9167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RepeatSpec__Group_4__0__Impl_in_rule__RepeatSpec__Group_4__09203 = new BitSet(new long[]{0x0000000030000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_rule__RepeatSpec__Group_4__1_in_rule__RepeatSpec__Group_4__09206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RepeatSpec__ValueAssignment_4_0_in_rule__RepeatSpec__Group_4__0__Impl9233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RepeatSpec__Group_4__1__Impl_in_rule__RepeatSpec__Group_4__19263 = new BitSet(new long[]{0x0000000030000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_rule__RepeatSpec__Group_4__2_in_rule__RepeatSpec__Group_4__19266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RepeatSpec__Alternatives_4_1_in_rule__RepeatSpec__Group_4__1__Impl9293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RepeatSpec__Group_4__2__Impl_in_rule__RepeatSpec__Group_4__29324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RepeatSpec__BeforeMarkerAssignment_4_2_in_rule__RepeatSpec__Group_4__2__Impl9351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RepeatSpec__Group_5__0__Impl_in_rule__RepeatSpec__Group_5__09387 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_rule__RepeatSpec__Group_5__1_in_rule__RepeatSpec__Group_5__09390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RepeatSpec__ValueAssignment_5_0_in_rule__RepeatSpec__Group_5__0__Impl9417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RepeatSpec__Group_5__1__Impl_in_rule__RepeatSpec__Group_5__19447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RepeatSpec__TimesAssignment_5_1_in_rule__RepeatSpec__Group_5__1__Impl9474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repeat__Group_0__0__Impl_in_rule__Repeat__Group_0__09508 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_rule__Repeat__Group_0__1_in_rule__Repeat__Group_0__09511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repeat__Alternatives_0_0_in_rule__Repeat__Group_0__0__Impl9538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repeat__Group_0__1__Impl_in_rule__Repeat__Group_0__19568 = new BitSet(new long[]{0x00180FFF0F000010L,0x0000000000000008L});
    public static final BitSet FOLLOW_rule__Repeat__Group_0__2_in_rule__Repeat__Group_0__19571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rule__Repeat__Group_0__1__Impl9599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repeat__Group_0__2__Impl_in_rule__Repeat__Group_0__29630 = new BitSet(new long[]{0x0200000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Repeat__Group_0__3_in_rule__Repeat__Group_0__29633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repeat__OperationsAssignment_0_2_in_rule__Repeat__Group_0__2__Impl9660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repeat__Group_0__3__Impl_in_rule__Repeat__Group_0__39690 = new BitSet(new long[]{0x0200000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Repeat__Group_0__4_in_rule__Repeat__Group_0__39693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repeat__Group_0_3__0_in_rule__Repeat__Group_0__3__Impl9720 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_rule__Repeat__Group_0__4__Impl_in_rule__Repeat__Group_0__49751 = new BitSet(new long[]{0x0000000000000080L,0x0000000000006004L});
    public static final BitSet FOLLOW_rule__Repeat__Group_0__5_in_rule__Repeat__Group_0__49754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_rule__Repeat__Group_0__4__Impl9782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repeat__Group_0__5__Impl_in_rule__Repeat__Group_0__59813 = new BitSet(new long[]{0x0000000000000080L,0x0000000000006004L});
    public static final BitSet FOLLOW_rule__Repeat__Group_0__6_in_rule__Repeat__Group_0__59816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rule__Repeat__Group_0__5__Impl9845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repeat__Group_0__6__Impl_in_rule__Repeat__Group_0__69878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repeat__SpecAssignment_0_6_in_rule__Repeat__Group_0__6__Impl9905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repeat__Group_0_3__0__Impl_in_rule__Repeat__Group_0_3__09949 = new BitSet(new long[]{0x00180FFF0F000010L,0x0000000000000008L});
    public static final BitSet FOLLOW_rule__Repeat__Group_0_3__1_in_rule__Repeat__Group_0_3__09952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__Repeat__Group_0_3__0__Impl9980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repeat__Group_0_3__1__Impl_in_rule__Repeat__Group_0_3__110011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repeat__OperationsAssignment_0_3_1_in_rule__Repeat__Group_0_3__1__Impl10038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repeat__Group_1__0__Impl_in_rule__Repeat__Group_1__010072 = new BitSet(new long[]{0x00180FFF0F000010L,0x0000000000000008L});
    public static final BitSet FOLLOW_rule__Repeat__Group_1__1_in_rule__Repeat__Group_1__010075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rule__Repeat__Group_1__0__Impl10103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repeat__Group_1__1__Impl_in_rule__Repeat__Group_1__110134 = new BitSet(new long[]{0x0200000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Repeat__Group_1__2_in_rule__Repeat__Group_1__110137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repeat__OperationsAssignment_1_1_in_rule__Repeat__Group_1__1__Impl10164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repeat__Group_1__2__Impl_in_rule__Repeat__Group_1__210194 = new BitSet(new long[]{0x0200000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Repeat__Group_1__3_in_rule__Repeat__Group_1__210197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repeat__Group_1_2__0_in_rule__Repeat__Group_1__2__Impl10224 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_rule__Repeat__Group_1__3__Impl_in_rule__Repeat__Group_1__310255 = new BitSet(new long[]{0x0200000000000080L,0x0000000000006004L});
    public static final BitSet FOLLOW_rule__Repeat__Group_1__4_in_rule__Repeat__Group_1__310258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_rule__Repeat__Group_1__3__Impl10286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repeat__Group_1__4__Impl_in_rule__Repeat__Group_1__410317 = new BitSet(new long[]{0x0200000000000080L,0x0000000000006004L});
    public static final BitSet FOLLOW_rule__Repeat__Group_1__5_in_rule__Repeat__Group_1__410320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repeat__Group_1_4__0_in_rule__Repeat__Group_1__4__Impl10347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repeat__Group_1__5__Impl_in_rule__Repeat__Group_1__510378 = new BitSet(new long[]{0x0200000000000080L,0x0000000000006004L});
    public static final BitSet FOLLOW_rule__Repeat__Group_1__6_in_rule__Repeat__Group_1__510381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rule__Repeat__Group_1__5__Impl10410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repeat__Group_1__6__Impl_in_rule__Repeat__Group_1__610443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repeat__SpecAssignment_1_6_in_rule__Repeat__Group_1__6__Impl10470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repeat__Group_1_2__0__Impl_in_rule__Repeat__Group_1_2__010514 = new BitSet(new long[]{0x00180FFF0F000010L,0x0000000000000008L});
    public static final BitSet FOLLOW_rule__Repeat__Group_1_2__1_in_rule__Repeat__Group_1_2__010517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__Repeat__Group_1_2__0__Impl10545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repeat__Group_1_2__1__Impl_in_rule__Repeat__Group_1_2__110576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repeat__OperationsAssignment_1_2_1_in_rule__Repeat__Group_1_2__1__Impl10603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repeat__Group_1_4__0__Impl_in_rule__Repeat__Group_1_4__010637 = new BitSet(new long[]{0x0018000000000000L});
    public static final BitSet FOLLOW_rule__Repeat__Group_1_4__1_in_rule__Repeat__Group_1_4__010640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__Repeat__Group_1_4__0__Impl10668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repeat__Group_1_4__1__Impl_in_rule__Repeat__Group_1_4__110699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repeat__Alternatives_1_4_1_in_rule__Repeat__Group_1_4__1__Impl10726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__Group__0__Impl_in_rule__Range__Group__010760 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Range__Group__1_in_rule__Range__Group__010763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__MinAssignment_0_in_rule__Range__Group__0__Impl10790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__Group__1__Impl_in_rule__Range__Group__110820 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Range__Group__2_in_rule__Range__Group__110823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_rule__Range__Group__1__Impl10851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__Group__2__Impl_in_rule__Range__Group__210882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__MaxAssignment_2_in_rule__Range__Group__2__Impl10909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__UnorderedGroup_1__0_in_rule__Instruction__UnorderedGroup_110946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__IdAssignment_1_0_in_rule__Instruction__UnorderedGroup_1__Impl11035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__LabelAssignment_1_1_in_rule__Instruction__UnorderedGroup_1__Impl11126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__UnorderedGroup_1__Impl_in_rule__Instruction__UnorderedGroup_1__011185 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_rule__Instruction__UnorderedGroup_1__1_in_rule__Instruction__UnorderedGroup_1__011188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__UnorderedGroup_1__Impl_in_rule__Instruction__UnorderedGroup_1__111213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__UnorderedGroup_1__0_in_rule__Row__UnorderedGroup_111241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__ShortRowAssignment_1_0_in_rule__Row__UnorderedGroup_1__Impl11328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__LongRowAssignment_1_1_in_rule__Row__UnorderedGroup_1__Impl11419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__UnorderedGroup_1__Impl_in_rule__Row__UnorderedGroup_1__011478 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000300L});
    public static final BitSet FOLLOW_rule__Row__UnorderedGroup_1__1_in_rule__Row__UnorderedGroup_1__011481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__UnorderedGroup_1__Impl_in_rule__Row__UnorderedGroup_1__111506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__UnorderedGroup_4__0_in_rule__Row__UnorderedGroup_411534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__SideAssignment_4_0_in_rule__Row__UnorderedGroup_4__Impl11621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group_4_1__0_in_rule__Row__UnorderedGroup_4__Impl11712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__UnorderedGroup_4__Impl_in_rule__Row__UnorderedGroup_4__011771 = new BitSet(new long[]{0x0100000000C00002L});
    public static final BitSet FOLLOW_rule__Row__UnorderedGroup_4__1_in_rule__Row__UnorderedGroup_4__011774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__UnorderedGroup_4__Impl_in_rule__Row__UnorderedGroup_4__111799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knit__UnorderedGroup_4__0_in_rule__Knit__UnorderedGroup_411827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knit__TogetherAssignment_4_0_in_rule__Knit__UnorderedGroup_4__Impl11914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knit__ThroughTrailingLoopAssignment_4_1_in_rule__Knit__UnorderedGroup_4__Impl12005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knit__UnorderedGroup_4__Impl_in_rule__Knit__UnorderedGroup_4__012064 = new BitSet(new long[]{0x00000000C0000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Knit__UnorderedGroup_4__1_in_rule__Knit__UnorderedGroup_4__012067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knit__UnorderedGroup_4__Impl_in_rule__Knit__UnorderedGroup_4__112092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Purl__UnorderedGroup_4__0_in_rule__Purl__UnorderedGroup_412120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Purl__TogetherAssignment_4_0_in_rule__Purl__UnorderedGroup_4__Impl12207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Purl__ThroughTrailingLoopAssignment_4_1_in_rule__Purl__UnorderedGroup_4__Impl12298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Purl__UnorderedGroup_4__Impl_in_rule__Purl__UnorderedGroup_4__012357 = new BitSet(new long[]{0x00000000C0000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Purl__UnorderedGroup_4__1_in_rule__Purl__UnorderedGroup_4__012360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Purl__UnorderedGroup_4__Impl_in_rule__Purl__UnorderedGroup_4__112385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockOperation_in_rule__Pattern__ElementsAssignment_112417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Instruction__IdAssignment_1_012448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Instruction__LabelAssignment_1_112479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_rule__Instruction__HasKeyAssignment_2_1_112515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Instruction__MessageKeyAssignment_2_1_212554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__ShapeAlternatives_2_2_1_0_in_rule__Instruction__ShapeAssignment_2_2_112585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Instruction__RowCountAssignment_2_3_112618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRow_in_rule__Instruction__RowsAssignment_3_0_212649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRow_in_rule__Instruction__RowsAssignment_3_1_212680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_rule__Row__NextRowAssignment_012716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_rule__Row__ShortRowAssignment_1_012760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_rule__Row__LongRowAssignment_1_112804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__LabelAlternatives_2_0_in_rule__Row__LabelAssignment_212843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRange_in_rule__Row__RangeAssignment_3_012876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Row__NumberAssignment_3_1_012907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Row__NumberAssignment_3_1_1_112938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__SubsequentAlternatives_3_1_2_2_0_in_rule__Row__SubsequentAssignment_3_1_2_212969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__SideAlternatives_4_0_0_in_rule__Row__SideAssignment_4_013002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Row__YarnRefAssignment_4_1_113035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_rule__Row__InformAssignment_5_1_113071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_rule__Row__ResetAssignment_5_2_113115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInlineOperation_in_rule__Row__OperationsAssignment_813154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInlineOperation_in_rule__Row__OperationsAssignment_9_113185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Message__MessageAssignment_013216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Knit__NumberAssignment_213247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_rule__Knit__TogetherAssignment_4_013283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knit__ThroughTrailingLoopAlternatives_4_1_0_in_rule__Knit__ThroughTrailingLoopAssignment_4_113322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Knit__YarnRefAssignment_5_113355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRepeatSpec_in_rule__Knit__RepeatAssignment_6_113386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Purl__NumberAssignment_213417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_rule__Purl__TogetherAssignment_4_013453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Purl__ThroughTrailingLoopAlternatives_4_1_0_in_rule__Purl__ThroughTrailingLoopAssignment_4_113492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Purl__YarnRefAssignment_5_113525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRepeatSpec_in_rule__Purl__RepeatAssignment_6_113556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Slip__ReverseAlternatives_1_0_in_rule__Slip__ReverseAssignment_113587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Slip__NumberAssignment_3_0_013620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Slip__KnitwiseAlternatives_4_0_0_in_rule__Slip__KnitwiseAssignment_4_013651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Slip__PurlwiseAlternatives_4_1_0_in_rule__Slip__PurlwiseAssignment_4_113684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Slip__YarnPositionAlternatives_5_0_in_rule__Slip__YarnPositionAssignment_513717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_rule__RepeatSpec__ToEndAssignment_013755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_rule__RepeatSpec__ToMarkerAssignment_113799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__RepeatSpec__ValueAssignment_2_013838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_rule__RepeatSpec__BeforeEndAssignment_2_213874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__RepeatSpec__ValueAssignment_3_013913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_rule__RepeatSpec__BeforeGapAssignment_3_213949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__RepeatSpec__ValueAssignment_4_013988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_rule__RepeatSpec__BeforeMarkerAssignment_4_214024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__RepeatSpec__ValueAssignment_5_014063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_rule__RepeatSpec__TimesAssignment_5_114099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInlineOperation_in_rule__Repeat__OperationsAssignment_0_214138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInlineOperation_in_rule__Repeat__OperationsAssignment_0_3_114169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRepeatSpec_in_rule__Repeat__SpecAssignment_0_614200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInlineOperation_in_rule__Repeat__OperationsAssignment_1_114231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInlineOperation_in_rule__Repeat__OperationsAssignment_1_2_114262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRepeatSpec_in_rule__Repeat__SpecAssignment_1_614293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Range__MinAssignment_014324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Range__MaxAssignment_214355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LF_in_synpred63_InternalKnittingExpressionLanguage4413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LF_in_synpred70_InternalKnittingExpressionLanguage5352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__IdAssignment_1_0_in_synpred104_InternalKnittingExpressionLanguage11035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__UnorderedGroup_1__1_in_synpred105_InternalKnittingExpressionLanguage11188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__UnorderedGroup_1__0_in_synpred106_InternalKnittingExpressionLanguage11241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__ShortRowAssignment_1_0_in_synpred107_InternalKnittingExpressionLanguage11328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__UnorderedGroup_1__1_in_synpred108_InternalKnittingExpressionLanguage11481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__UnorderedGroup_4__0_in_synpred109_InternalKnittingExpressionLanguage11534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__SideAssignment_4_0_in_synpred110_InternalKnittingExpressionLanguage11621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__UnorderedGroup_4__1_in_synpred111_InternalKnittingExpressionLanguage11774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knit__UnorderedGroup_4__0_in_synpred112_InternalKnittingExpressionLanguage11827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knit__TogetherAssignment_4_0_in_synpred113_InternalKnittingExpressionLanguage11914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knit__UnorderedGroup_4__1_in_synpred114_InternalKnittingExpressionLanguage12067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Purl__UnorderedGroup_4__0_in_synpred115_InternalKnittingExpressionLanguage12120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Purl__TogetherAssignment_4_0_in_synpred116_InternalKnittingExpressionLanguage12207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Purl__UnorderedGroup_4__1_in_synpred117_InternalKnittingExpressionLanguage12360 = new BitSet(new long[]{0x0000000000000002L});

}