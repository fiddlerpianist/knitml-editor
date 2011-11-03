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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_LF", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Row'", "'Round'", "'Rows'", "'Rounds'", "'even'", "'odd'", "'rows'", "'rounds'", "'WS'", "'RS'", "'K'", "'k'", "'Knit'", "'knit'", "'st'", "'sts'", "'tbl'", "'ttl'", "'P'", "'p'", "'Purl'", "'purl'", "'Rev'", "'Reverse'", "'rev'", "'reverse'", "'Sl'", "'sl'", "'Slip'", "'slip'", "'next st'", "'kw'", "'knitwise'", "'pw'", "'purlwise'", "'wyif'", "'wyib'", "'Repeat'", "'repeat'", "'Instruction'", "'{'", "'}'", "':'", "','", "'and'", "'all'", "'with'", "'('", "')'", "'side'", "'count'", "'to'", "'['", "']'", "'-'", "'Next'", "'Short'", "'Long'", "'inform'", "'reset'", "'tog'", "'end'", "'marker'", "'before end'", "'before gap'", "'before marker'", "'times'"
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
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=7;
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
            case 51:
                {
                alt1=1;
                }
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 67:
            case 68:
            case 69:
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


    // $ANTLR start "rule__Instruction__Alternatives_2"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:425:1: rule__Instruction__Alternatives_2 : ( ( ( rule__Instruction__Group_2_0__0 ) ) | ( ( rule__Instruction__Group_2_1__0 ) ) );
    public final void rule__Instruction__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:429:1: ( ( ( rule__Instruction__Group_2_0__0 ) ) | ( ( rule__Instruction__Group_2_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==52) ) {
                alt2=1;
            }
            else if ( (LA2_0==54) ) {
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
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:430:1: ( ( rule__Instruction__Group_2_0__0 ) )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:430:1: ( ( rule__Instruction__Group_2_0__0 ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:431:1: ( rule__Instruction__Group_2_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInstructionAccess().getGroup_2_0()); 
                    }
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:432:1: ( rule__Instruction__Group_2_0__0 )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:432:2: rule__Instruction__Group_2_0__0
                    {
                    pushFollow(FOLLOW_rule__Instruction__Group_2_0__0_in_rule__Instruction__Alternatives_2862);
                    rule__Instruction__Group_2_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInstructionAccess().getGroup_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:436:6: ( ( rule__Instruction__Group_2_1__0 ) )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:436:6: ( ( rule__Instruction__Group_2_1__0 ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:437:1: ( rule__Instruction__Group_2_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInstructionAccess().getGroup_2_1()); 
                    }
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:438:1: ( rule__Instruction__Group_2_1__0 )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:438:2: rule__Instruction__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__Instruction__Group_2_1__0_in_rule__Instruction__Alternatives_2880);
                    rule__Instruction__Group_2_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInstructionAccess().getGroup_2_1()); 
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
    // $ANTLR end "rule__Instruction__Alternatives_2"


    // $ANTLR start "rule__Row__LabelAlternatives_2_0"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:447:1: rule__Row__LabelAlternatives_2_0 : ( ( 'Row' ) | ( 'Round' ) | ( 'Rows' ) | ( 'Rounds' ) );
    public final void rule__Row__LabelAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:451:1: ( ( 'Row' ) | ( 'Round' ) | ( 'Rows' ) | ( 'Rounds' ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt3=1;
                }
                break;
            case 13:
                {
                alt3=2;
                }
                break;
            case 14:
                {
                alt3=3;
                }
                break;
            case 15:
                {
                alt3=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:452:1: ( 'Row' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:452:1: ( 'Row' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:453:1: 'Row'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRowAccess().getLabelRowKeyword_2_0_0()); 
                    }
                    match(input,12,FOLLOW_12_in_rule__Row__LabelAlternatives_2_0914); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRowAccess().getLabelRowKeyword_2_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:460:6: ( 'Round' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:460:6: ( 'Round' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:461:1: 'Round'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRowAccess().getLabelRoundKeyword_2_0_1()); 
                    }
                    match(input,13,FOLLOW_13_in_rule__Row__LabelAlternatives_2_0934); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRowAccess().getLabelRoundKeyword_2_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:468:6: ( 'Rows' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:468:6: ( 'Rows' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:469:1: 'Rows'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRowAccess().getLabelRowsKeyword_2_0_2()); 
                    }
                    match(input,14,FOLLOW_14_in_rule__Row__LabelAlternatives_2_0954); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRowAccess().getLabelRowsKeyword_2_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:476:6: ( 'Rounds' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:476:6: ( 'Rounds' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:477:1: 'Rounds'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRowAccess().getLabelRoundsKeyword_2_0_3()); 
                    }
                    match(input,15,FOLLOW_15_in_rule__Row__LabelAlternatives_2_0974); if (state.failed) return ;
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:489:1: rule__Row__Alternatives_3 : ( ( ( rule__Row__RangeAssignment_3_0 ) ) | ( ( rule__Row__Group_3_1__0 ) ) );
    public final void rule__Row__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:493:1: ( ( ( rule__Row__RangeAssignment_3_0 ) ) | ( ( rule__Row__Group_3_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==EOF||(LA4_1>=20 && LA4_1<=21)||(LA4_1>=54 && LA4_1<=56)||(LA4_1>=58 && LA4_1<=59)) ) {
                    alt4=2;
                }
                else if ( (LA4_1==66) ) {
                    alt4=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:494:1: ( ( rule__Row__RangeAssignment_3_0 ) )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:494:1: ( ( rule__Row__RangeAssignment_3_0 ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:495:1: ( rule__Row__RangeAssignment_3_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRowAccess().getRangeAssignment_3_0()); 
                    }
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:496:1: ( rule__Row__RangeAssignment_3_0 )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:496:2: rule__Row__RangeAssignment_3_0
                    {
                    pushFollow(FOLLOW_rule__Row__RangeAssignment_3_0_in_rule__Row__Alternatives_31008);
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
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:500:6: ( ( rule__Row__Group_3_1__0 ) )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:500:6: ( ( rule__Row__Group_3_1__0 ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:501:1: ( rule__Row__Group_3_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRowAccess().getGroup_3_1()); 
                    }
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:502:1: ( rule__Row__Group_3_1__0 )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:502:2: rule__Row__Group_3_1__0
                    {
                    pushFollow(FOLLOW_rule__Row__Group_3_1__0_in_rule__Row__Alternatives_31026);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:511:1: rule__Row__SubsequentAlternatives_3_1_2_2_0 : ( ( 'even' ) | ( 'odd' ) );
    public final void rule__Row__SubsequentAlternatives_3_1_2_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:515:1: ( ( 'even' ) | ( 'odd' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            else if ( (LA5_0==17) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:516:1: ( 'even' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:516:1: ( 'even' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:517:1: 'even'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRowAccess().getSubsequentEvenKeyword_3_1_2_2_0_0()); 
                    }
                    match(input,16,FOLLOW_16_in_rule__Row__SubsequentAlternatives_3_1_2_2_01060); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRowAccess().getSubsequentEvenKeyword_3_1_2_2_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:524:6: ( 'odd' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:524:6: ( 'odd' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:525:1: 'odd'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRowAccess().getSubsequentOddKeyword_3_1_2_2_0_1()); 
                    }
                    match(input,17,FOLLOW_17_in_rule__Row__SubsequentAlternatives_3_1_2_2_01080); if (state.failed) return ;
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:537:1: rule__Row__Alternatives_3_1_2_3 : ( ( 'rows' ) | ( 'rounds' ) );
    public final void rule__Row__Alternatives_3_1_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:541:1: ( ( 'rows' ) | ( 'rounds' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            else if ( (LA6_0==19) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:542:1: ( 'rows' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:542:1: ( 'rows' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:543:1: 'rows'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRowAccess().getRowsKeyword_3_1_2_3_0()); 
                    }
                    match(input,18,FOLLOW_18_in_rule__Row__Alternatives_3_1_2_31115); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRowAccess().getRowsKeyword_3_1_2_3_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:550:6: ( 'rounds' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:550:6: ( 'rounds' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:551:1: 'rounds'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRowAccess().getRoundsKeyword_3_1_2_3_1()); 
                    }
                    match(input,19,FOLLOW_19_in_rule__Row__Alternatives_3_1_2_31135); if (state.failed) return ;
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:563:1: rule__Row__SideAlternatives_4_0_0 : ( ( 'WS' ) | ( 'RS' ) );
    public final void rule__Row__SideAlternatives_4_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:567:1: ( ( 'WS' ) | ( 'RS' ) )
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
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:568:1: ( 'WS' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:568:1: ( 'WS' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:569:1: 'WS'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRowAccess().getSideWSKeyword_4_0_0_0()); 
                    }
                    match(input,20,FOLLOW_20_in_rule__Row__SideAlternatives_4_0_01170); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRowAccess().getSideWSKeyword_4_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:576:6: ( 'RS' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:576:6: ( 'RS' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:577:1: 'RS'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRowAccess().getSideRSKeyword_4_0_0_1()); 
                    }
                    match(input,21,FOLLOW_21_in_rule__Row__SideAlternatives_4_0_01190); if (state.failed) return ;
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:589:1: rule__InlineOperation__Alternatives : ( ( ruleKnit ) | ( rulePurl ) | ( ruleSlip ) | ( ruleRepeat ) );
    public final void rule__InlineOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:593:1: ( ( ruleKnit ) | ( rulePurl ) | ( ruleSlip ) | ( ruleRepeat ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 22:
            case 23:
            case 24:
            case 25:
                {
                alt8=1;
                }
                break;
            case 30:
            case 31:
            case 32:
            case 33:
                {
                alt8=2;
                }
                break;
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
                {
                alt8=3;
                }
                break;
            case 49:
            case 50:
            case 64:
                {
                alt8=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:594:1: ( ruleKnit )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:594:1: ( ruleKnit )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:595:1: ruleKnit
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInlineOperationAccess().getKnitParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleKnit_in_rule__InlineOperation__Alternatives1224);
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
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:600:6: ( rulePurl )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:600:6: ( rulePurl )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:601:1: rulePurl
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInlineOperationAccess().getPurlParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_rulePurl_in_rule__InlineOperation__Alternatives1241);
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
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:606:6: ( ruleSlip )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:606:6: ( ruleSlip )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:607:1: ruleSlip
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInlineOperationAccess().getSlipParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleSlip_in_rule__InlineOperation__Alternatives1258);
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
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:612:6: ( ruleRepeat )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:612:6: ( ruleRepeat )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:613:1: ruleRepeat
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInlineOperationAccess().getRepeatParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleRepeat_in_rule__InlineOperation__Alternatives1275);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:623:1: rule__Knit__Alternatives_0 : ( ( 'K' ) | ( 'k' ) | ( 'Knit' ) | ( 'knit' ) );
    public final void rule__Knit__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:627:1: ( ( 'K' ) | ( 'k' ) | ( 'Knit' ) | ( 'knit' ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt9=1;
                }
                break;
            case 23:
                {
                alt9=2;
                }
                break;
            case 24:
                {
                alt9=3;
                }
                break;
            case 25:
                {
                alt9=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:628:1: ( 'K' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:628:1: ( 'K' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:629:1: 'K'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getKnitAccess().getKKeyword_0_0()); 
                    }
                    match(input,22,FOLLOW_22_in_rule__Knit__Alternatives_01308); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getKnitAccess().getKKeyword_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:636:6: ( 'k' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:636:6: ( 'k' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:637:1: 'k'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getKnitAccess().getKKeyword_0_1()); 
                    }
                    match(input,23,FOLLOW_23_in_rule__Knit__Alternatives_01328); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getKnitAccess().getKKeyword_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:644:6: ( 'Knit' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:644:6: ( 'Knit' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:645:1: 'Knit'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getKnitAccess().getKnitKeyword_0_2()); 
                    }
                    match(input,24,FOLLOW_24_in_rule__Knit__Alternatives_01348); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getKnitAccess().getKnitKeyword_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:652:6: ( 'knit' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:652:6: ( 'knit' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:653:1: 'knit'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getKnitAccess().getKnitKeyword_0_3()); 
                    }
                    match(input,25,FOLLOW_25_in_rule__Knit__Alternatives_01368); if (state.failed) return ;
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:665:1: rule__Knit__Alternatives_3 : ( ( 'st' ) | ( 'sts' ) );
    public final void rule__Knit__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:669:1: ( ( 'st' ) | ( 'sts' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            else if ( (LA10_0==27) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:670:1: ( 'st' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:670:1: ( 'st' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:671:1: 'st'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getKnitAccess().getStKeyword_3_0()); 
                    }
                    match(input,26,FOLLOW_26_in_rule__Knit__Alternatives_31403); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getKnitAccess().getStKeyword_3_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:678:6: ( 'sts' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:678:6: ( 'sts' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:679:1: 'sts'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getKnitAccess().getStsKeyword_3_1()); 
                    }
                    match(input,27,FOLLOW_27_in_rule__Knit__Alternatives_31423); if (state.failed) return ;
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:691:1: rule__Knit__ThroughTrailingLoopAlternatives_4_1_0 : ( ( 'tbl' ) | ( 'ttl' ) );
    public final void rule__Knit__ThroughTrailingLoopAlternatives_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:695:1: ( ( 'tbl' ) | ( 'ttl' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==28) ) {
                alt11=1;
            }
            else if ( (LA11_0==29) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:696:1: ( 'tbl' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:696:1: ( 'tbl' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:697:1: 'tbl'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getKnitAccess().getThroughTrailingLoopTblKeyword_4_1_0_0()); 
                    }
                    match(input,28,FOLLOW_28_in_rule__Knit__ThroughTrailingLoopAlternatives_4_1_01458); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getKnitAccess().getThroughTrailingLoopTblKeyword_4_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:704:6: ( 'ttl' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:704:6: ( 'ttl' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:705:1: 'ttl'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getKnitAccess().getThroughTrailingLoopTtlKeyword_4_1_0_1()); 
                    }
                    match(input,29,FOLLOW_29_in_rule__Knit__ThroughTrailingLoopAlternatives_4_1_01478); if (state.failed) return ;
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:717:1: rule__Purl__Alternatives_0 : ( ( 'P' ) | ( 'p' ) | ( 'Purl' ) | ( 'purl' ) );
    public final void rule__Purl__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:721:1: ( ( 'P' ) | ( 'p' ) | ( 'Purl' ) | ( 'purl' ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt12=1;
                }
                break;
            case 31:
                {
                alt12=2;
                }
                break;
            case 32:
                {
                alt12=3;
                }
                break;
            case 33:
                {
                alt12=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:722:1: ( 'P' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:722:1: ( 'P' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:723:1: 'P'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPurlAccess().getPKeyword_0_0()); 
                    }
                    match(input,30,FOLLOW_30_in_rule__Purl__Alternatives_01513); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPurlAccess().getPKeyword_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:730:6: ( 'p' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:730:6: ( 'p' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:731:1: 'p'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPurlAccess().getPKeyword_0_1()); 
                    }
                    match(input,31,FOLLOW_31_in_rule__Purl__Alternatives_01533); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPurlAccess().getPKeyword_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:738:6: ( 'Purl' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:738:6: ( 'Purl' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:739:1: 'Purl'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPurlAccess().getPurlKeyword_0_2()); 
                    }
                    match(input,32,FOLLOW_32_in_rule__Purl__Alternatives_01553); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPurlAccess().getPurlKeyword_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:746:6: ( 'purl' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:746:6: ( 'purl' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:747:1: 'purl'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPurlAccess().getPurlKeyword_0_3()); 
                    }
                    match(input,33,FOLLOW_33_in_rule__Purl__Alternatives_01573); if (state.failed) return ;
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:759:1: rule__Purl__Alternatives_3 : ( ( 'st' ) | ( 'sts' ) );
    public final void rule__Purl__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:763:1: ( ( 'st' ) | ( 'sts' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            else if ( (LA13_0==27) ) {
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
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:764:1: ( 'st' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:764:1: ( 'st' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:765:1: 'st'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPurlAccess().getStKeyword_3_0()); 
                    }
                    match(input,26,FOLLOW_26_in_rule__Purl__Alternatives_31608); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPurlAccess().getStKeyword_3_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:772:6: ( 'sts' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:772:6: ( 'sts' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:773:1: 'sts'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPurlAccess().getStsKeyword_3_1()); 
                    }
                    match(input,27,FOLLOW_27_in_rule__Purl__Alternatives_31628); if (state.failed) return ;
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:785:1: rule__Purl__ThroughTrailingLoopAlternatives_4_1_0 : ( ( 'tbl' ) | ( 'ttl' ) );
    public final void rule__Purl__ThroughTrailingLoopAlternatives_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:789:1: ( ( 'tbl' ) | ( 'ttl' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            else if ( (LA14_0==29) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:790:1: ( 'tbl' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:790:1: ( 'tbl' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:791:1: 'tbl'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPurlAccess().getThroughTrailingLoopTblKeyword_4_1_0_0()); 
                    }
                    match(input,28,FOLLOW_28_in_rule__Purl__ThroughTrailingLoopAlternatives_4_1_01663); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPurlAccess().getThroughTrailingLoopTblKeyword_4_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:798:6: ( 'ttl' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:798:6: ( 'ttl' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:799:1: 'ttl'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPurlAccess().getThroughTrailingLoopTtlKeyword_4_1_0_1()); 
                    }
                    match(input,29,FOLLOW_29_in_rule__Purl__ThroughTrailingLoopAlternatives_4_1_01683); if (state.failed) return ;
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:811:1: rule__Slip__ReverseAlternatives_1_0 : ( ( 'Rev' ) | ( 'Reverse' ) | ( 'rev' ) | ( 'reverse' ) );
    public final void rule__Slip__ReverseAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:815:1: ( ( 'Rev' ) | ( 'Reverse' ) | ( 'rev' ) | ( 'reverse' ) )
            int alt15=4;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt15=1;
                }
                break;
            case 35:
                {
                alt15=2;
                }
                break;
            case 36:
                {
                alt15=3;
                }
                break;
            case 37:
                {
                alt15=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:816:1: ( 'Rev' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:816:1: ( 'Rev' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:817:1: 'Rev'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSlipAccess().getReverseRevKeyword_1_0_0()); 
                    }
                    match(input,34,FOLLOW_34_in_rule__Slip__ReverseAlternatives_1_01718); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSlipAccess().getReverseRevKeyword_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:824:6: ( 'Reverse' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:824:6: ( 'Reverse' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:825:1: 'Reverse'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSlipAccess().getReverseReverseKeyword_1_0_1()); 
                    }
                    match(input,35,FOLLOW_35_in_rule__Slip__ReverseAlternatives_1_01738); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSlipAccess().getReverseReverseKeyword_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:832:6: ( 'rev' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:832:6: ( 'rev' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:833:1: 'rev'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSlipAccess().getReverseRevKeyword_1_0_2()); 
                    }
                    match(input,36,FOLLOW_36_in_rule__Slip__ReverseAlternatives_1_01758); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSlipAccess().getReverseRevKeyword_1_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:840:6: ( 'reverse' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:840:6: ( 'reverse' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:841:1: 'reverse'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSlipAccess().getReverseReverseKeyword_1_0_3()); 
                    }
                    match(input,37,FOLLOW_37_in_rule__Slip__ReverseAlternatives_1_01778); if (state.failed) return ;
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:853:1: rule__Slip__Alternatives_2 : ( ( 'Sl' ) | ( 'sl' ) | ( 'Slip' ) | ( 'slip' ) );
    public final void rule__Slip__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:857:1: ( ( 'Sl' ) | ( 'sl' ) | ( 'Slip' ) | ( 'slip' ) )
            int alt16=4;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt16=1;
                }
                break;
            case 39:
                {
                alt16=2;
                }
                break;
            case 40:
                {
                alt16=3;
                }
                break;
            case 41:
                {
                alt16=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:858:1: ( 'Sl' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:858:1: ( 'Sl' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:859:1: 'Sl'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSlipAccess().getSlKeyword_2_0()); 
                    }
                    match(input,38,FOLLOW_38_in_rule__Slip__Alternatives_21813); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSlipAccess().getSlKeyword_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:866:6: ( 'sl' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:866:6: ( 'sl' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:867:1: 'sl'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSlipAccess().getSlKeyword_2_1()); 
                    }
                    match(input,39,FOLLOW_39_in_rule__Slip__Alternatives_21833); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSlipAccess().getSlKeyword_2_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:874:6: ( 'Slip' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:874:6: ( 'Slip' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:875:1: 'Slip'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSlipAccess().getSlipKeyword_2_2()); 
                    }
                    match(input,40,FOLLOW_40_in_rule__Slip__Alternatives_21853); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSlipAccess().getSlipKeyword_2_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:882:6: ( 'slip' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:882:6: ( 'slip' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:883:1: 'slip'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSlipAccess().getSlipKeyword_2_3()); 
                    }
                    match(input,41,FOLLOW_41_in_rule__Slip__Alternatives_21873); if (state.failed) return ;
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:895:1: rule__Slip__Alternatives_3 : ( ( ( rule__Slip__Group_3_0__0 ) ) | ( 'next st' ) );
    public final void rule__Slip__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:899:1: ( ( ( rule__Slip__Group_3_0__0 ) ) | ( 'next st' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_INT) ) {
                alt17=1;
            }
            else if ( (LA17_0==42) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:900:1: ( ( rule__Slip__Group_3_0__0 ) )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:900:1: ( ( rule__Slip__Group_3_0__0 ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:901:1: ( rule__Slip__Group_3_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSlipAccess().getGroup_3_0()); 
                    }
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:902:1: ( rule__Slip__Group_3_0__0 )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:902:2: rule__Slip__Group_3_0__0
                    {
                    pushFollow(FOLLOW_rule__Slip__Group_3_0__0_in_rule__Slip__Alternatives_31907);
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
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:906:6: ( 'next st' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:906:6: ( 'next st' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:907:1: 'next st'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSlipAccess().getNextStKeyword_3_1()); 
                    }
                    match(input,42,FOLLOW_42_in_rule__Slip__Alternatives_31926); if (state.failed) return ;
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:919:1: rule__Slip__Alternatives_3_0_1 : ( ( 'st' ) | ( 'sts' ) );
    public final void rule__Slip__Alternatives_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:923:1: ( ( 'st' ) | ( 'sts' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==26) ) {
                alt18=1;
            }
            else if ( (LA18_0==27) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:924:1: ( 'st' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:924:1: ( 'st' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:925:1: 'st'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSlipAccess().getStKeyword_3_0_1_0()); 
                    }
                    match(input,26,FOLLOW_26_in_rule__Slip__Alternatives_3_0_11961); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSlipAccess().getStKeyword_3_0_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:932:6: ( 'sts' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:932:6: ( 'sts' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:933:1: 'sts'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSlipAccess().getStsKeyword_3_0_1_1()); 
                    }
                    match(input,27,FOLLOW_27_in_rule__Slip__Alternatives_3_0_11981); if (state.failed) return ;
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:945:1: rule__Slip__Alternatives_4 : ( ( ( rule__Slip__KnitwiseAssignment_4_0 ) ) | ( ( rule__Slip__PurlwiseAssignment_4_1 ) ) );
    public final void rule__Slip__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:949:1: ( ( ( rule__Slip__KnitwiseAssignment_4_0 ) ) | ( ( rule__Slip__PurlwiseAssignment_4_1 ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=43 && LA19_0<=44)) ) {
                alt19=1;
            }
            else if ( ((LA19_0>=45 && LA19_0<=46)) ) {
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
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:950:1: ( ( rule__Slip__KnitwiseAssignment_4_0 ) )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:950:1: ( ( rule__Slip__KnitwiseAssignment_4_0 ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:951:1: ( rule__Slip__KnitwiseAssignment_4_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSlipAccess().getKnitwiseAssignment_4_0()); 
                    }
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:952:1: ( rule__Slip__KnitwiseAssignment_4_0 )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:952:2: rule__Slip__KnitwiseAssignment_4_0
                    {
                    pushFollow(FOLLOW_rule__Slip__KnitwiseAssignment_4_0_in_rule__Slip__Alternatives_42015);
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
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:956:6: ( ( rule__Slip__PurlwiseAssignment_4_1 ) )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:956:6: ( ( rule__Slip__PurlwiseAssignment_4_1 ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:957:1: ( rule__Slip__PurlwiseAssignment_4_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSlipAccess().getPurlwiseAssignment_4_1()); 
                    }
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:958:1: ( rule__Slip__PurlwiseAssignment_4_1 )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:958:2: rule__Slip__PurlwiseAssignment_4_1
                    {
                    pushFollow(FOLLOW_rule__Slip__PurlwiseAssignment_4_1_in_rule__Slip__Alternatives_42033);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:967:1: rule__Slip__KnitwiseAlternatives_4_0_0 : ( ( 'kw' ) | ( 'knitwise' ) );
    public final void rule__Slip__KnitwiseAlternatives_4_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:971:1: ( ( 'kw' ) | ( 'knitwise' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==43) ) {
                alt20=1;
            }
            else if ( (LA20_0==44) ) {
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
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:972:1: ( 'kw' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:972:1: ( 'kw' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:973:1: 'kw'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSlipAccess().getKnitwiseKwKeyword_4_0_0_0()); 
                    }
                    match(input,43,FOLLOW_43_in_rule__Slip__KnitwiseAlternatives_4_0_02067); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSlipAccess().getKnitwiseKwKeyword_4_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:980:6: ( 'knitwise' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:980:6: ( 'knitwise' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:981:1: 'knitwise'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSlipAccess().getKnitwiseKnitwiseKeyword_4_0_0_1()); 
                    }
                    match(input,44,FOLLOW_44_in_rule__Slip__KnitwiseAlternatives_4_0_02087); if (state.failed) return ;
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:993:1: rule__Slip__PurlwiseAlternatives_4_1_0 : ( ( 'pw' ) | ( 'purlwise' ) );
    public final void rule__Slip__PurlwiseAlternatives_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:997:1: ( ( 'pw' ) | ( 'purlwise' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==45) ) {
                alt21=1;
            }
            else if ( (LA21_0==46) ) {
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
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:998:1: ( 'pw' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:998:1: ( 'pw' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:999:1: 'pw'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSlipAccess().getPurlwisePwKeyword_4_1_0_0()); 
                    }
                    match(input,45,FOLLOW_45_in_rule__Slip__PurlwiseAlternatives_4_1_02122); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSlipAccess().getPurlwisePwKeyword_4_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1006:6: ( 'purlwise' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1006:6: ( 'purlwise' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1007:1: 'purlwise'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSlipAccess().getPurlwisePurlwiseKeyword_4_1_0_1()); 
                    }
                    match(input,46,FOLLOW_46_in_rule__Slip__PurlwiseAlternatives_4_1_02142); if (state.failed) return ;
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1019:1: rule__Slip__YarnPositionAlternatives_5_0 : ( ( 'wyif' ) | ( 'wyib' ) );
    public final void rule__Slip__YarnPositionAlternatives_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1023:1: ( ( 'wyif' ) | ( 'wyib' ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==47) ) {
                alt22=1;
            }
            else if ( (LA22_0==48) ) {
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
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1024:1: ( 'wyif' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1024:1: ( 'wyif' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1025:1: 'wyif'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSlipAccess().getYarnPositionWyifKeyword_5_0_0()); 
                    }
                    match(input,47,FOLLOW_47_in_rule__Slip__YarnPositionAlternatives_5_02177); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSlipAccess().getYarnPositionWyifKeyword_5_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1032:6: ( 'wyib' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1032:6: ( 'wyib' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1033:1: 'wyib'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSlipAccess().getYarnPositionWyibKeyword_5_0_1()); 
                    }
                    match(input,48,FOLLOW_48_in_rule__Slip__YarnPositionAlternatives_5_02197); if (state.failed) return ;
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1045:1: rule__RepeatSpec__Alternatives : ( ( ( rule__RepeatSpec__ToEndAssignment_0 ) ) | ( ( rule__RepeatSpec__ToMarkerAssignment_1 ) ) | ( ( rule__RepeatSpec__Group_2__0 ) ) | ( ( rule__RepeatSpec__Group_3__0 ) ) | ( ( rule__RepeatSpec__Group_4__0 ) ) | ( ( rule__RepeatSpec__Group_5__0 ) ) );
    public final void rule__RepeatSpec__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1049:1: ( ( ( rule__RepeatSpec__ToEndAssignment_0 ) ) | ( ( rule__RepeatSpec__ToMarkerAssignment_1 ) ) | ( ( rule__RepeatSpec__Group_2__0 ) ) | ( ( rule__RepeatSpec__Group_3__0 ) ) | ( ( rule__RepeatSpec__Group_4__0 ) ) | ( ( rule__RepeatSpec__Group_5__0 ) ) )
            int alt23=6;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1050:1: ( ( rule__RepeatSpec__ToEndAssignment_0 ) )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1050:1: ( ( rule__RepeatSpec__ToEndAssignment_0 ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1051:1: ( rule__RepeatSpec__ToEndAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRepeatSpecAccess().getToEndAssignment_0()); 
                    }
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1052:1: ( rule__RepeatSpec__ToEndAssignment_0 )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1052:2: rule__RepeatSpec__ToEndAssignment_0
                    {
                    pushFollow(FOLLOW_rule__RepeatSpec__ToEndAssignment_0_in_rule__RepeatSpec__Alternatives2231);
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
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1056:6: ( ( rule__RepeatSpec__ToMarkerAssignment_1 ) )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1056:6: ( ( rule__RepeatSpec__ToMarkerAssignment_1 ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1057:1: ( rule__RepeatSpec__ToMarkerAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRepeatSpecAccess().getToMarkerAssignment_1()); 
                    }
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1058:1: ( rule__RepeatSpec__ToMarkerAssignment_1 )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1058:2: rule__RepeatSpec__ToMarkerAssignment_1
                    {
                    pushFollow(FOLLOW_rule__RepeatSpec__ToMarkerAssignment_1_in_rule__RepeatSpec__Alternatives2249);
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
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1062:6: ( ( rule__RepeatSpec__Group_2__0 ) )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1062:6: ( ( rule__RepeatSpec__Group_2__0 ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1063:1: ( rule__RepeatSpec__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRepeatSpecAccess().getGroup_2()); 
                    }
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1064:1: ( rule__RepeatSpec__Group_2__0 )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1064:2: rule__RepeatSpec__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__RepeatSpec__Group_2__0_in_rule__RepeatSpec__Alternatives2267);
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
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1068:6: ( ( rule__RepeatSpec__Group_3__0 ) )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1068:6: ( ( rule__RepeatSpec__Group_3__0 ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1069:1: ( rule__RepeatSpec__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRepeatSpecAccess().getGroup_3()); 
                    }
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1070:1: ( rule__RepeatSpec__Group_3__0 )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1070:2: rule__RepeatSpec__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__RepeatSpec__Group_3__0_in_rule__RepeatSpec__Alternatives2285);
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
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1074:6: ( ( rule__RepeatSpec__Group_4__0 ) )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1074:6: ( ( rule__RepeatSpec__Group_4__0 ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1075:1: ( rule__RepeatSpec__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRepeatSpecAccess().getGroup_4()); 
                    }
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1076:1: ( rule__RepeatSpec__Group_4__0 )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1076:2: rule__RepeatSpec__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__RepeatSpec__Group_4__0_in_rule__RepeatSpec__Alternatives2303);
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
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1080:6: ( ( rule__RepeatSpec__Group_5__0 ) )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1080:6: ( ( rule__RepeatSpec__Group_5__0 ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1081:1: ( rule__RepeatSpec__Group_5__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRepeatSpecAccess().getGroup_5()); 
                    }
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1082:1: ( rule__RepeatSpec__Group_5__0 )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1082:2: rule__RepeatSpec__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__RepeatSpec__Group_5__0_in_rule__RepeatSpec__Alternatives2321);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1091:1: rule__RepeatSpec__Alternatives_2_1 : ( ( 'st' ) | ( 'sts' ) );
    public final void rule__RepeatSpec__Alternatives_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1095:1: ( ( 'st' ) | ( 'sts' ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==26) ) {
                alt24=1;
            }
            else if ( (LA24_0==27) ) {
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
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1096:1: ( 'st' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1096:1: ( 'st' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1097:1: 'st'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRepeatSpecAccess().getStKeyword_2_1_0()); 
                    }
                    match(input,26,FOLLOW_26_in_rule__RepeatSpec__Alternatives_2_12355); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRepeatSpecAccess().getStKeyword_2_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1104:6: ( 'sts' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1104:6: ( 'sts' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1105:1: 'sts'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRepeatSpecAccess().getStsKeyword_2_1_1()); 
                    }
                    match(input,27,FOLLOW_27_in_rule__RepeatSpec__Alternatives_2_12375); if (state.failed) return ;
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1117:1: rule__RepeatSpec__Alternatives_3_1 : ( ( 'st' ) | ( 'sts' ) );
    public final void rule__RepeatSpec__Alternatives_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1121:1: ( ( 'st' ) | ( 'sts' ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==26) ) {
                alt25=1;
            }
            else if ( (LA25_0==27) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1122:1: ( 'st' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1122:1: ( 'st' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1123:1: 'st'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRepeatSpecAccess().getStKeyword_3_1_0()); 
                    }
                    match(input,26,FOLLOW_26_in_rule__RepeatSpec__Alternatives_3_12410); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRepeatSpecAccess().getStKeyword_3_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1130:6: ( 'sts' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1130:6: ( 'sts' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1131:1: 'sts'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRepeatSpecAccess().getStsKeyword_3_1_1()); 
                    }
                    match(input,27,FOLLOW_27_in_rule__RepeatSpec__Alternatives_3_12430); if (state.failed) return ;
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1143:1: rule__RepeatSpec__Alternatives_4_1 : ( ( 'st' ) | ( 'sts' ) );
    public final void rule__RepeatSpec__Alternatives_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1147:1: ( ( 'st' ) | ( 'sts' ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==26) ) {
                alt26=1;
            }
            else if ( (LA26_0==27) ) {
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
                       before(grammarAccess.getRepeatSpecAccess().getStKeyword_4_1_0()); 
                    }
                    match(input,26,FOLLOW_26_in_rule__RepeatSpec__Alternatives_4_12465); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRepeatSpecAccess().getStKeyword_4_1_0()); 
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
                       before(grammarAccess.getRepeatSpecAccess().getStsKeyword_4_1_1()); 
                    }
                    match(input,27,FOLLOW_27_in_rule__RepeatSpec__Alternatives_4_12485); if (state.failed) return ;
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1169:1: rule__Repeat__Alternatives : ( ( ( rule__Repeat__Group_0__0 ) ) | ( ( rule__Repeat__Group_1__0 ) ) );
    public final void rule__Repeat__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1173:1: ( ( ( rule__Repeat__Group_0__0 ) ) | ( ( rule__Repeat__Group_1__0 ) ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=49 && LA27_0<=50)) ) {
                alt27=1;
            }
            else if ( (LA27_0==64) ) {
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
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1174:1: ( ( rule__Repeat__Group_0__0 ) )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1174:1: ( ( rule__Repeat__Group_0__0 ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1175:1: ( rule__Repeat__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRepeatAccess().getGroup_0()); 
                    }
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1176:1: ( rule__Repeat__Group_0__0 )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1176:2: rule__Repeat__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Repeat__Group_0__0_in_rule__Repeat__Alternatives2519);
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
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1180:6: ( ( rule__Repeat__Group_1__0 ) )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1180:6: ( ( rule__Repeat__Group_1__0 ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1181:1: ( rule__Repeat__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRepeatAccess().getGroup_1()); 
                    }
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1182:1: ( rule__Repeat__Group_1__0 )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1182:2: rule__Repeat__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Repeat__Group_1__0_in_rule__Repeat__Alternatives2537);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1191:1: rule__Repeat__Alternatives_0_0 : ( ( 'Repeat' ) | ( 'repeat' ) );
    public final void rule__Repeat__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1195:1: ( ( 'Repeat' ) | ( 'repeat' ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==49) ) {
                alt28=1;
            }
            else if ( (LA28_0==50) ) {
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
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1196:1: ( 'Repeat' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1196:1: ( 'Repeat' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1197:1: 'Repeat'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRepeatAccess().getRepeatKeyword_0_0_0()); 
                    }
                    match(input,49,FOLLOW_49_in_rule__Repeat__Alternatives_0_02571); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRepeatAccess().getRepeatKeyword_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1204:6: ( 'repeat' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1204:6: ( 'repeat' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1205:1: 'repeat'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRepeatAccess().getRepeatKeyword_0_0_1()); 
                    }
                    match(input,50,FOLLOW_50_in_rule__Repeat__Alternatives_0_02591); if (state.failed) return ;
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1217:1: rule__Repeat__Alternatives_1_4_1 : ( ( 'Repeat' ) | ( 'repeat' ) );
    public final void rule__Repeat__Alternatives_1_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1221:1: ( ( 'Repeat' ) | ( 'repeat' ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==49) ) {
                alt29=1;
            }
            else if ( (LA29_0==50) ) {
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
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1222:1: ( 'Repeat' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1222:1: ( 'Repeat' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1223:1: 'Repeat'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRepeatAccess().getRepeatKeyword_1_4_1_0()); 
                    }
                    match(input,49,FOLLOW_49_in_rule__Repeat__Alternatives_1_4_12626); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRepeatAccess().getRepeatKeyword_1_4_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1230:6: ( 'repeat' )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1230:6: ( 'repeat' )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1231:1: 'repeat'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRepeatAccess().getRepeatKeyword_1_4_1_1()); 
                    }
                    match(input,50,FOLLOW_50_in_rule__Repeat__Alternatives_1_4_12646); if (state.failed) return ;
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1245:1: rule__Pattern__Group__0 : rule__Pattern__Group__0__Impl rule__Pattern__Group__1 ;
    public final void rule__Pattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1249:1: ( rule__Pattern__Group__0__Impl rule__Pattern__Group__1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1250:2: rule__Pattern__Group__0__Impl rule__Pattern__Group__1
            {
            pushFollow(FOLLOW_rule__Pattern__Group__0__Impl_in_rule__Pattern__Group__02678);
            rule__Pattern__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Pattern__Group__1_in_rule__Pattern__Group__02681);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1257:1: rule__Pattern__Group__0__Impl : ( ( RULE_LF )* ) ;
    public final void rule__Pattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1261:1: ( ( ( RULE_LF )* ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1262:1: ( ( RULE_LF )* )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1262:1: ( ( RULE_LF )* )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1263:1: ( RULE_LF )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getLFTerminalRuleCall_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1264:1: ( RULE_LF )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_LF) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1264:3: RULE_LF
            	    {
            	    match(input,RULE_LF,FOLLOW_RULE_LF_in_rule__Pattern__Group__0__Impl2709); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1274:1: rule__Pattern__Group__1 : rule__Pattern__Group__1__Impl rule__Pattern__Group__2 ;
    public final void rule__Pattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1278:1: ( rule__Pattern__Group__1__Impl rule__Pattern__Group__2 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1279:2: rule__Pattern__Group__1__Impl rule__Pattern__Group__2
            {
            pushFollow(FOLLOW_rule__Pattern__Group__1__Impl_in_rule__Pattern__Group__12740);
            rule__Pattern__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Pattern__Group__2_in_rule__Pattern__Group__12743);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1286:1: rule__Pattern__Group__1__Impl : ( ( ( rule__Pattern__ElementsAssignment_1 ) ) ( ( rule__Pattern__ElementsAssignment_1 )* ) ) ;
    public final void rule__Pattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1290:1: ( ( ( ( rule__Pattern__ElementsAssignment_1 ) ) ( ( rule__Pattern__ElementsAssignment_1 )* ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1291:1: ( ( ( rule__Pattern__ElementsAssignment_1 ) ) ( ( rule__Pattern__ElementsAssignment_1 )* ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1291:1: ( ( ( rule__Pattern__ElementsAssignment_1 ) ) ( ( rule__Pattern__ElementsAssignment_1 )* ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1292:1: ( ( rule__Pattern__ElementsAssignment_1 ) ) ( ( rule__Pattern__ElementsAssignment_1 )* )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1292:1: ( ( rule__Pattern__ElementsAssignment_1 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1293:1: ( rule__Pattern__ElementsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getElementsAssignment_1()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1294:1: ( rule__Pattern__ElementsAssignment_1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1294:2: rule__Pattern__ElementsAssignment_1
            {
            pushFollow(FOLLOW_rule__Pattern__ElementsAssignment_1_in_rule__Pattern__Group__1__Impl2772);
            rule__Pattern__ElementsAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getElementsAssignment_1()); 
            }

            }

            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1297:1: ( ( rule__Pattern__ElementsAssignment_1 )* )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1298:1: ( rule__Pattern__ElementsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getElementsAssignment_1()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1299:1: ( rule__Pattern__ElementsAssignment_1 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_STRING||(LA31_0>=12 && LA31_0<=15)||LA31_0==51||(LA31_0>=67 && LA31_0<=69)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1299:2: rule__Pattern__ElementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Pattern__ElementsAssignment_1_in_rule__Pattern__Group__1__Impl2784);
            	    rule__Pattern__ElementsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1310:1: rule__Pattern__Group__2 : rule__Pattern__Group__2__Impl ;
    public final void rule__Pattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1314:1: ( rule__Pattern__Group__2__Impl )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1315:2: rule__Pattern__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Pattern__Group__2__Impl_in_rule__Pattern__Group__22817);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1321:1: rule__Pattern__Group__2__Impl : ( ( RULE_LF )* ) ;
    public final void rule__Pattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1325:1: ( ( ( RULE_LF )* ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1326:1: ( ( RULE_LF )* )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1326:1: ( ( RULE_LF )* )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1327:1: ( RULE_LF )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getLFTerminalRuleCall_2()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1328:1: ( RULE_LF )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_LF) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1328:3: RULE_LF
            	    {
            	    match(input,RULE_LF,FOLLOW_RULE_LF_in_rule__Pattern__Group__2__Impl2845); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1344:1: rule__Instruction__Group__0 : rule__Instruction__Group__0__Impl rule__Instruction__Group__1 ;
    public final void rule__Instruction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1348:1: ( rule__Instruction__Group__0__Impl rule__Instruction__Group__1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1349:2: rule__Instruction__Group__0__Impl rule__Instruction__Group__1
            {
            pushFollow(FOLLOW_rule__Instruction__Group__0__Impl_in_rule__Instruction__Group__02882);
            rule__Instruction__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Instruction__Group__1_in_rule__Instruction__Group__02885);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1356:1: rule__Instruction__Group__0__Impl : ( 'Instruction' ) ;
    public final void rule__Instruction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1360:1: ( ( 'Instruction' ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1361:1: ( 'Instruction' )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1361:1: ( 'Instruction' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1362:1: 'Instruction'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstructionAccess().getInstructionKeyword_0()); 
            }
            match(input,51,FOLLOW_51_in_rule__Instruction__Group__0__Impl2913); if (state.failed) return ;
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1375:1: rule__Instruction__Group__1 : rule__Instruction__Group__1__Impl rule__Instruction__Group__2 ;
    public final void rule__Instruction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1379:1: ( rule__Instruction__Group__1__Impl rule__Instruction__Group__2 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1380:2: rule__Instruction__Group__1__Impl rule__Instruction__Group__2
            {
            pushFollow(FOLLOW_rule__Instruction__Group__1__Impl_in_rule__Instruction__Group__12944);
            rule__Instruction__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Instruction__Group__2_in_rule__Instruction__Group__12947);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1387:1: rule__Instruction__Group__1__Impl : ( ( rule__Instruction__LabelAssignment_1 )? ) ;
    public final void rule__Instruction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1391:1: ( ( ( rule__Instruction__LabelAssignment_1 )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1392:1: ( ( rule__Instruction__LabelAssignment_1 )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1392:1: ( ( rule__Instruction__LabelAssignment_1 )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1393:1: ( rule__Instruction__LabelAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstructionAccess().getLabelAssignment_1()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1394:1: ( rule__Instruction__LabelAssignment_1 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ID) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1394:2: rule__Instruction__LabelAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Instruction__LabelAssignment_1_in_rule__Instruction__Group__1__Impl2974);
                    rule__Instruction__LabelAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstructionAccess().getLabelAssignment_1()); 
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1404:1: rule__Instruction__Group__2 : rule__Instruction__Group__2__Impl ;
    public final void rule__Instruction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1408:1: ( rule__Instruction__Group__2__Impl )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1409:2: rule__Instruction__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Instruction__Group__2__Impl_in_rule__Instruction__Group__23005);
            rule__Instruction__Group__2__Impl();

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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1415:1: rule__Instruction__Group__2__Impl : ( ( rule__Instruction__Alternatives_2 ) ) ;
    public final void rule__Instruction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1419:1: ( ( ( rule__Instruction__Alternatives_2 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1420:1: ( ( rule__Instruction__Alternatives_2 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1420:1: ( ( rule__Instruction__Alternatives_2 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1421:1: ( rule__Instruction__Alternatives_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstructionAccess().getAlternatives_2()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1422:1: ( rule__Instruction__Alternatives_2 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1422:2: rule__Instruction__Alternatives_2
            {
            pushFollow(FOLLOW_rule__Instruction__Alternatives_2_in_rule__Instruction__Group__2__Impl3032);
            rule__Instruction__Alternatives_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstructionAccess().getAlternatives_2()); 
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


    // $ANTLR start "rule__Instruction__Group_2_0__0"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1438:1: rule__Instruction__Group_2_0__0 : rule__Instruction__Group_2_0__0__Impl rule__Instruction__Group_2_0__1 ;
    public final void rule__Instruction__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1442:1: ( rule__Instruction__Group_2_0__0__Impl rule__Instruction__Group_2_0__1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1443:2: rule__Instruction__Group_2_0__0__Impl rule__Instruction__Group_2_0__1
            {
            pushFollow(FOLLOW_rule__Instruction__Group_2_0__0__Impl_in_rule__Instruction__Group_2_0__03068);
            rule__Instruction__Group_2_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Instruction__Group_2_0__1_in_rule__Instruction__Group_2_0__03071);
            rule__Instruction__Group_2_0__1();

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
    // $ANTLR end "rule__Instruction__Group_2_0__0"


    // $ANTLR start "rule__Instruction__Group_2_0__0__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1450:1: rule__Instruction__Group_2_0__0__Impl : ( '{' ) ;
    public final void rule__Instruction__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1454:1: ( ( '{' ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1455:1: ( '{' )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1455:1: ( '{' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1456:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstructionAccess().getLeftCurlyBracketKeyword_2_0_0()); 
            }
            match(input,52,FOLLOW_52_in_rule__Instruction__Group_2_0__0__Impl3099); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstructionAccess().getLeftCurlyBracketKeyword_2_0_0()); 
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
    // $ANTLR end "rule__Instruction__Group_2_0__0__Impl"


    // $ANTLR start "rule__Instruction__Group_2_0__1"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1469:1: rule__Instruction__Group_2_0__1 : rule__Instruction__Group_2_0__1__Impl rule__Instruction__Group_2_0__2 ;
    public final void rule__Instruction__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1473:1: ( rule__Instruction__Group_2_0__1__Impl rule__Instruction__Group_2_0__2 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1474:2: rule__Instruction__Group_2_0__1__Impl rule__Instruction__Group_2_0__2
            {
            pushFollow(FOLLOW_rule__Instruction__Group_2_0__1__Impl_in_rule__Instruction__Group_2_0__13130);
            rule__Instruction__Group_2_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Instruction__Group_2_0__2_in_rule__Instruction__Group_2_0__13133);
            rule__Instruction__Group_2_0__2();

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
    // $ANTLR end "rule__Instruction__Group_2_0__1"


    // $ANTLR start "rule__Instruction__Group_2_0__1__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1481:1: rule__Instruction__Group_2_0__1__Impl : ( ( RULE_LF )* ) ;
    public final void rule__Instruction__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1485:1: ( ( ( RULE_LF )* ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1486:1: ( ( RULE_LF )* )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1486:1: ( ( RULE_LF )* )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1487:1: ( RULE_LF )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstructionAccess().getLFTerminalRuleCall_2_0_1()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1488:1: ( RULE_LF )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_LF) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1488:3: RULE_LF
            	    {
            	    match(input,RULE_LF,FOLLOW_RULE_LF_in_rule__Instruction__Group_2_0__1__Impl3161); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstructionAccess().getLFTerminalRuleCall_2_0_1()); 
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
    // $ANTLR end "rule__Instruction__Group_2_0__1__Impl"


    // $ANTLR start "rule__Instruction__Group_2_0__2"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1498:1: rule__Instruction__Group_2_0__2 : rule__Instruction__Group_2_0__2__Impl rule__Instruction__Group_2_0__3 ;
    public final void rule__Instruction__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1502:1: ( rule__Instruction__Group_2_0__2__Impl rule__Instruction__Group_2_0__3 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1503:2: rule__Instruction__Group_2_0__2__Impl rule__Instruction__Group_2_0__3
            {
            pushFollow(FOLLOW_rule__Instruction__Group_2_0__2__Impl_in_rule__Instruction__Group_2_0__23192);
            rule__Instruction__Group_2_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Instruction__Group_2_0__3_in_rule__Instruction__Group_2_0__23195);
            rule__Instruction__Group_2_0__3();

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
    // $ANTLR end "rule__Instruction__Group_2_0__2"


    // $ANTLR start "rule__Instruction__Group_2_0__2__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1510:1: rule__Instruction__Group_2_0__2__Impl : ( ( ( rule__Instruction__RowsAssignment_2_0_2 ) ) ( ( rule__Instruction__RowsAssignment_2_0_2 )* ) ) ;
    public final void rule__Instruction__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1514:1: ( ( ( ( rule__Instruction__RowsAssignment_2_0_2 ) ) ( ( rule__Instruction__RowsAssignment_2_0_2 )* ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1515:1: ( ( ( rule__Instruction__RowsAssignment_2_0_2 ) ) ( ( rule__Instruction__RowsAssignment_2_0_2 )* ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1515:1: ( ( ( rule__Instruction__RowsAssignment_2_0_2 ) ) ( ( rule__Instruction__RowsAssignment_2_0_2 )* ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1516:1: ( ( rule__Instruction__RowsAssignment_2_0_2 ) ) ( ( rule__Instruction__RowsAssignment_2_0_2 )* )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1516:1: ( ( rule__Instruction__RowsAssignment_2_0_2 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1517:1: ( rule__Instruction__RowsAssignment_2_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstructionAccess().getRowsAssignment_2_0_2()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1518:1: ( rule__Instruction__RowsAssignment_2_0_2 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1518:2: rule__Instruction__RowsAssignment_2_0_2
            {
            pushFollow(FOLLOW_rule__Instruction__RowsAssignment_2_0_2_in_rule__Instruction__Group_2_0__2__Impl3224);
            rule__Instruction__RowsAssignment_2_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstructionAccess().getRowsAssignment_2_0_2()); 
            }

            }

            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1521:1: ( ( rule__Instruction__RowsAssignment_2_0_2 )* )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1522:1: ( rule__Instruction__RowsAssignment_2_0_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstructionAccess().getRowsAssignment_2_0_2()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1523:1: ( rule__Instruction__RowsAssignment_2_0_2 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=12 && LA35_0<=15)||(LA35_0>=67 && LA35_0<=69)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1523:2: rule__Instruction__RowsAssignment_2_0_2
            	    {
            	    pushFollow(FOLLOW_rule__Instruction__RowsAssignment_2_0_2_in_rule__Instruction__Group_2_0__2__Impl3236);
            	    rule__Instruction__RowsAssignment_2_0_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstructionAccess().getRowsAssignment_2_0_2()); 
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
    // $ANTLR end "rule__Instruction__Group_2_0__2__Impl"


    // $ANTLR start "rule__Instruction__Group_2_0__3"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1534:1: rule__Instruction__Group_2_0__3 : rule__Instruction__Group_2_0__3__Impl rule__Instruction__Group_2_0__4 ;
    public final void rule__Instruction__Group_2_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1538:1: ( rule__Instruction__Group_2_0__3__Impl rule__Instruction__Group_2_0__4 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1539:2: rule__Instruction__Group_2_0__3__Impl rule__Instruction__Group_2_0__4
            {
            pushFollow(FOLLOW_rule__Instruction__Group_2_0__3__Impl_in_rule__Instruction__Group_2_0__33269);
            rule__Instruction__Group_2_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Instruction__Group_2_0__4_in_rule__Instruction__Group_2_0__33272);
            rule__Instruction__Group_2_0__4();

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
    // $ANTLR end "rule__Instruction__Group_2_0__3"


    // $ANTLR start "rule__Instruction__Group_2_0__3__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1546:1: rule__Instruction__Group_2_0__3__Impl : ( '}' ) ;
    public final void rule__Instruction__Group_2_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1550:1: ( ( '}' ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1551:1: ( '}' )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1551:1: ( '}' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1552:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstructionAccess().getRightCurlyBracketKeyword_2_0_3()); 
            }
            match(input,53,FOLLOW_53_in_rule__Instruction__Group_2_0__3__Impl3300); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstructionAccess().getRightCurlyBracketKeyword_2_0_3()); 
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
    // $ANTLR end "rule__Instruction__Group_2_0__3__Impl"


    // $ANTLR start "rule__Instruction__Group_2_0__4"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1565:1: rule__Instruction__Group_2_0__4 : rule__Instruction__Group_2_0__4__Impl ;
    public final void rule__Instruction__Group_2_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1569:1: ( rule__Instruction__Group_2_0__4__Impl )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1570:2: rule__Instruction__Group_2_0__4__Impl
            {
            pushFollow(FOLLOW_rule__Instruction__Group_2_0__4__Impl_in_rule__Instruction__Group_2_0__43331);
            rule__Instruction__Group_2_0__4__Impl();

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
    // $ANTLR end "rule__Instruction__Group_2_0__4"


    // $ANTLR start "rule__Instruction__Group_2_0__4__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1576:1: rule__Instruction__Group_2_0__4__Impl : ( RULE_LF ) ;
    public final void rule__Instruction__Group_2_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1580:1: ( ( RULE_LF ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1581:1: ( RULE_LF )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1581:1: ( RULE_LF )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1582:1: RULE_LF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstructionAccess().getLFTerminalRuleCall_2_0_4()); 
            }
            match(input,RULE_LF,FOLLOW_RULE_LF_in_rule__Instruction__Group_2_0__4__Impl3358); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstructionAccess().getLFTerminalRuleCall_2_0_4()); 
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
    // $ANTLR end "rule__Instruction__Group_2_0__4__Impl"


    // $ANTLR start "rule__Instruction__Group_2_1__0"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1603:1: rule__Instruction__Group_2_1__0 : rule__Instruction__Group_2_1__0__Impl rule__Instruction__Group_2_1__1 ;
    public final void rule__Instruction__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1607:1: ( rule__Instruction__Group_2_1__0__Impl rule__Instruction__Group_2_1__1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1608:2: rule__Instruction__Group_2_1__0__Impl rule__Instruction__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__Instruction__Group_2_1__0__Impl_in_rule__Instruction__Group_2_1__03397);
            rule__Instruction__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Instruction__Group_2_1__1_in_rule__Instruction__Group_2_1__03400);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1615:1: rule__Instruction__Group_2_1__0__Impl : ( ':' ) ;
    public final void rule__Instruction__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1619:1: ( ( ':' ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1620:1: ( ':' )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1620:1: ( ':' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1621:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstructionAccess().getColonKeyword_2_1_0()); 
            }
            match(input,54,FOLLOW_54_in_rule__Instruction__Group_2_1__0__Impl3428); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstructionAccess().getColonKeyword_2_1_0()); 
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1634:1: rule__Instruction__Group_2_1__1 : rule__Instruction__Group_2_1__1__Impl rule__Instruction__Group_2_1__2 ;
    public final void rule__Instruction__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1638:1: ( rule__Instruction__Group_2_1__1__Impl rule__Instruction__Group_2_1__2 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1639:2: rule__Instruction__Group_2_1__1__Impl rule__Instruction__Group_2_1__2
            {
            pushFollow(FOLLOW_rule__Instruction__Group_2_1__1__Impl_in_rule__Instruction__Group_2_1__13459);
            rule__Instruction__Group_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Instruction__Group_2_1__2_in_rule__Instruction__Group_2_1__13462);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1646:1: rule__Instruction__Group_2_1__1__Impl : ( RULE_LF ) ;
    public final void rule__Instruction__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1650:1: ( ( RULE_LF ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1651:1: ( RULE_LF )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1651:1: ( RULE_LF )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1652:1: RULE_LF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstructionAccess().getLFTerminalRuleCall_2_1_1()); 
            }
            match(input,RULE_LF,FOLLOW_RULE_LF_in_rule__Instruction__Group_2_1__1__Impl3489); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstructionAccess().getLFTerminalRuleCall_2_1_1()); 
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1663:1: rule__Instruction__Group_2_1__2 : rule__Instruction__Group_2_1__2__Impl rule__Instruction__Group_2_1__3 ;
    public final void rule__Instruction__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1667:1: ( rule__Instruction__Group_2_1__2__Impl rule__Instruction__Group_2_1__3 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1668:2: rule__Instruction__Group_2_1__2__Impl rule__Instruction__Group_2_1__3
            {
            pushFollow(FOLLOW_rule__Instruction__Group_2_1__2__Impl_in_rule__Instruction__Group_2_1__23518);
            rule__Instruction__Group_2_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Instruction__Group_2_1__3_in_rule__Instruction__Group_2_1__23521);
            rule__Instruction__Group_2_1__3();

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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1675:1: rule__Instruction__Group_2_1__2__Impl : ( ( ( rule__Instruction__RowsAssignment_2_1_2 ) ) ( ( rule__Instruction__RowsAssignment_2_1_2 )* ) ) ;
    public final void rule__Instruction__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1679:1: ( ( ( ( rule__Instruction__RowsAssignment_2_1_2 ) ) ( ( rule__Instruction__RowsAssignment_2_1_2 )* ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1680:1: ( ( ( rule__Instruction__RowsAssignment_2_1_2 ) ) ( ( rule__Instruction__RowsAssignment_2_1_2 )* ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1680:1: ( ( ( rule__Instruction__RowsAssignment_2_1_2 ) ) ( ( rule__Instruction__RowsAssignment_2_1_2 )* ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1681:1: ( ( rule__Instruction__RowsAssignment_2_1_2 ) ) ( ( rule__Instruction__RowsAssignment_2_1_2 )* )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1681:1: ( ( rule__Instruction__RowsAssignment_2_1_2 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1682:1: ( rule__Instruction__RowsAssignment_2_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstructionAccess().getRowsAssignment_2_1_2()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1683:1: ( rule__Instruction__RowsAssignment_2_1_2 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1683:2: rule__Instruction__RowsAssignment_2_1_2
            {
            pushFollow(FOLLOW_rule__Instruction__RowsAssignment_2_1_2_in_rule__Instruction__Group_2_1__2__Impl3550);
            rule__Instruction__RowsAssignment_2_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstructionAccess().getRowsAssignment_2_1_2()); 
            }

            }

            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1686:1: ( ( rule__Instruction__RowsAssignment_2_1_2 )* )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1687:1: ( rule__Instruction__RowsAssignment_2_1_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstructionAccess().getRowsAssignment_2_1_2()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1688:1: ( rule__Instruction__RowsAssignment_2_1_2 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=12 && LA36_0<=15)||(LA36_0>=67 && LA36_0<=69)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1688:2: rule__Instruction__RowsAssignment_2_1_2
            	    {
            	    pushFollow(FOLLOW_rule__Instruction__RowsAssignment_2_1_2_in_rule__Instruction__Group_2_1__2__Impl3562);
            	    rule__Instruction__RowsAssignment_2_1_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstructionAccess().getRowsAssignment_2_1_2()); 
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
    // $ANTLR end "rule__Instruction__Group_2_1__2__Impl"


    // $ANTLR start "rule__Instruction__Group_2_1__3"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1699:1: rule__Instruction__Group_2_1__3 : rule__Instruction__Group_2_1__3__Impl ;
    public final void rule__Instruction__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1703:1: ( rule__Instruction__Group_2_1__3__Impl )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1704:2: rule__Instruction__Group_2_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Instruction__Group_2_1__3__Impl_in_rule__Instruction__Group_2_1__33595);
            rule__Instruction__Group_2_1__3__Impl();

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
    // $ANTLR end "rule__Instruction__Group_2_1__3"


    // $ANTLR start "rule__Instruction__Group_2_1__3__Impl"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1710:1: rule__Instruction__Group_2_1__3__Impl : ( RULE_LF ) ;
    public final void rule__Instruction__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1714:1: ( ( RULE_LF ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1715:1: ( RULE_LF )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1715:1: ( RULE_LF )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1716:1: RULE_LF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstructionAccess().getLFTerminalRuleCall_2_1_3()); 
            }
            match(input,RULE_LF,FOLLOW_RULE_LF_in_rule__Instruction__Group_2_1__3__Impl3622); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstructionAccess().getLFTerminalRuleCall_2_1_3()); 
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
    // $ANTLR end "rule__Instruction__Group_2_1__3__Impl"


    // $ANTLR start "rule__Row__Group__0"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1735:1: rule__Row__Group__0 : rule__Row__Group__0__Impl rule__Row__Group__1 ;
    public final void rule__Row__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1739:1: ( rule__Row__Group__0__Impl rule__Row__Group__1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1740:2: rule__Row__Group__0__Impl rule__Row__Group__1
            {
            pushFollow(FOLLOW_rule__Row__Group__0__Impl_in_rule__Row__Group__03659);
            rule__Row__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Row__Group__1_in_rule__Row__Group__03662);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1747:1: rule__Row__Group__0__Impl : ( ( rule__Row__NextRowAssignment_0 )? ) ;
    public final void rule__Row__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1751:1: ( ( ( rule__Row__NextRowAssignment_0 )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1752:1: ( ( rule__Row__NextRowAssignment_0 )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1752:1: ( ( rule__Row__NextRowAssignment_0 )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1753:1: ( rule__Row__NextRowAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getNextRowAssignment_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1754:1: ( rule__Row__NextRowAssignment_0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==67) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1754:2: rule__Row__NextRowAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Row__NextRowAssignment_0_in_rule__Row__Group__0__Impl3689);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1764:1: rule__Row__Group__1 : rule__Row__Group__1__Impl rule__Row__Group__2 ;
    public final void rule__Row__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1768:1: ( rule__Row__Group__1__Impl rule__Row__Group__2 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1769:2: rule__Row__Group__1__Impl rule__Row__Group__2
            {
            pushFollow(FOLLOW_rule__Row__Group__1__Impl_in_rule__Row__Group__13720);
            rule__Row__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Row__Group__2_in_rule__Row__Group__13723);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1776:1: rule__Row__Group__1__Impl : ( ( rule__Row__UnorderedGroup_1 ) ) ;
    public final void rule__Row__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1780:1: ( ( ( rule__Row__UnorderedGroup_1 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1781:1: ( ( rule__Row__UnorderedGroup_1 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1781:1: ( ( rule__Row__UnorderedGroup_1 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1782:1: ( rule__Row__UnorderedGroup_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getUnorderedGroup_1()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1783:1: ( rule__Row__UnorderedGroup_1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1783:2: rule__Row__UnorderedGroup_1
            {
            pushFollow(FOLLOW_rule__Row__UnorderedGroup_1_in_rule__Row__Group__1__Impl3750);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1793:1: rule__Row__Group__2 : rule__Row__Group__2__Impl rule__Row__Group__3 ;
    public final void rule__Row__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1797:1: ( rule__Row__Group__2__Impl rule__Row__Group__3 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1798:2: rule__Row__Group__2__Impl rule__Row__Group__3
            {
            pushFollow(FOLLOW_rule__Row__Group__2__Impl_in_rule__Row__Group__23780);
            rule__Row__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Row__Group__3_in_rule__Row__Group__23783);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1805:1: rule__Row__Group__2__Impl : ( ( rule__Row__LabelAssignment_2 ) ) ;
    public final void rule__Row__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1809:1: ( ( ( rule__Row__LabelAssignment_2 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1810:1: ( ( rule__Row__LabelAssignment_2 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1810:1: ( ( rule__Row__LabelAssignment_2 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1811:1: ( rule__Row__LabelAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getLabelAssignment_2()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1812:1: ( rule__Row__LabelAssignment_2 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1812:2: rule__Row__LabelAssignment_2
            {
            pushFollow(FOLLOW_rule__Row__LabelAssignment_2_in_rule__Row__Group__2__Impl3810);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1822:1: rule__Row__Group__3 : rule__Row__Group__3__Impl rule__Row__Group__4 ;
    public final void rule__Row__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1826:1: ( rule__Row__Group__3__Impl rule__Row__Group__4 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1827:2: rule__Row__Group__3__Impl rule__Row__Group__4
            {
            pushFollow(FOLLOW_rule__Row__Group__3__Impl_in_rule__Row__Group__33840);
            rule__Row__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Row__Group__4_in_rule__Row__Group__33843);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1834:1: rule__Row__Group__3__Impl : ( ( rule__Row__Alternatives_3 )? ) ;
    public final void rule__Row__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1838:1: ( ( ( rule__Row__Alternatives_3 )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1839:1: ( ( rule__Row__Alternatives_3 )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1839:1: ( ( rule__Row__Alternatives_3 )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1840:1: ( rule__Row__Alternatives_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getAlternatives_3()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1841:1: ( rule__Row__Alternatives_3 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_INT) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1841:2: rule__Row__Alternatives_3
                    {
                    pushFollow(FOLLOW_rule__Row__Alternatives_3_in_rule__Row__Group__3__Impl3870);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1851:1: rule__Row__Group__4 : rule__Row__Group__4__Impl rule__Row__Group__5 ;
    public final void rule__Row__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1855:1: ( rule__Row__Group__4__Impl rule__Row__Group__5 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1856:2: rule__Row__Group__4__Impl rule__Row__Group__5
            {
            pushFollow(FOLLOW_rule__Row__Group__4__Impl_in_rule__Row__Group__43901);
            rule__Row__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Row__Group__5_in_rule__Row__Group__43904);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1863:1: rule__Row__Group__4__Impl : ( ( rule__Row__UnorderedGroup_4 ) ) ;
    public final void rule__Row__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1867:1: ( ( ( rule__Row__UnorderedGroup_4 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1868:1: ( ( rule__Row__UnorderedGroup_4 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1868:1: ( ( rule__Row__UnorderedGroup_4 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1869:1: ( rule__Row__UnorderedGroup_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getUnorderedGroup_4()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1870:1: ( rule__Row__UnorderedGroup_4 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1870:2: rule__Row__UnorderedGroup_4
            {
            pushFollow(FOLLOW_rule__Row__UnorderedGroup_4_in_rule__Row__Group__4__Impl3931);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1880:1: rule__Row__Group__5 : rule__Row__Group__5__Impl rule__Row__Group__6 ;
    public final void rule__Row__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1884:1: ( rule__Row__Group__5__Impl rule__Row__Group__6 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1885:2: rule__Row__Group__5__Impl rule__Row__Group__6
            {
            pushFollow(FOLLOW_rule__Row__Group__5__Impl_in_rule__Row__Group__53961);
            rule__Row__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Row__Group__6_in_rule__Row__Group__53964);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1892:1: rule__Row__Group__5__Impl : ( ( rule__Row__Group_5__0 )? ) ;
    public final void rule__Row__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1896:1: ( ( ( rule__Row__Group_5__0 )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1897:1: ( ( rule__Row__Group_5__0 )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1897:1: ( ( rule__Row__Group_5__0 )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1898:1: ( rule__Row__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getGroup_5()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1899:1: ( rule__Row__Group_5__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==59) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1899:2: rule__Row__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Row__Group_5__0_in_rule__Row__Group__5__Impl3991);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1909:1: rule__Row__Group__6 : rule__Row__Group__6__Impl rule__Row__Group__7 ;
    public final void rule__Row__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1913:1: ( rule__Row__Group__6__Impl rule__Row__Group__7 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1914:2: rule__Row__Group__6__Impl rule__Row__Group__7
            {
            pushFollow(FOLLOW_rule__Row__Group__6__Impl_in_rule__Row__Group__64022);
            rule__Row__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Row__Group__7_in_rule__Row__Group__64025);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1921:1: rule__Row__Group__6__Impl : ( ':' ) ;
    public final void rule__Row__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1925:1: ( ( ':' ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1926:1: ( ':' )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1926:1: ( ':' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1927:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getColonKeyword_6()); 
            }
            match(input,54,FOLLOW_54_in_rule__Row__Group__6__Impl4053); if (state.failed) return ;
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1940:1: rule__Row__Group__7 : rule__Row__Group__7__Impl rule__Row__Group__8 ;
    public final void rule__Row__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1944:1: ( rule__Row__Group__7__Impl rule__Row__Group__8 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1945:2: rule__Row__Group__7__Impl rule__Row__Group__8
            {
            pushFollow(FOLLOW_rule__Row__Group__7__Impl_in_rule__Row__Group__74084);
            rule__Row__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Row__Group__8_in_rule__Row__Group__74087);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1952:1: rule__Row__Group__7__Impl : ( ( RULE_LF )? ) ;
    public final void rule__Row__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1956:1: ( ( ( RULE_LF )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1957:1: ( ( RULE_LF )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1957:1: ( ( RULE_LF )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1958:1: ( RULE_LF )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getLFTerminalRuleCall_7()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1959:1: ( RULE_LF )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_LF) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1959:3: RULE_LF
                    {
                    match(input,RULE_LF,FOLLOW_RULE_LF_in_rule__Row__Group__7__Impl4115); if (state.failed) return ;

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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1969:1: rule__Row__Group__8 : rule__Row__Group__8__Impl rule__Row__Group__9 ;
    public final void rule__Row__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1973:1: ( rule__Row__Group__8__Impl rule__Row__Group__9 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1974:2: rule__Row__Group__8__Impl rule__Row__Group__9
            {
            pushFollow(FOLLOW_rule__Row__Group__8__Impl_in_rule__Row__Group__84146);
            rule__Row__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Row__Group__9_in_rule__Row__Group__84149);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1981:1: rule__Row__Group__8__Impl : ( ( rule__Row__OperationsAssignment_8 ) ) ;
    public final void rule__Row__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1985:1: ( ( ( rule__Row__OperationsAssignment_8 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1986:1: ( ( rule__Row__OperationsAssignment_8 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1986:1: ( ( rule__Row__OperationsAssignment_8 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1987:1: ( rule__Row__OperationsAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getOperationsAssignment_8()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1988:1: ( rule__Row__OperationsAssignment_8 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1988:2: rule__Row__OperationsAssignment_8
            {
            pushFollow(FOLLOW_rule__Row__OperationsAssignment_8_in_rule__Row__Group__8__Impl4176);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1998:1: rule__Row__Group__9 : rule__Row__Group__9__Impl rule__Row__Group__10 ;
    public final void rule__Row__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2002:1: ( rule__Row__Group__9__Impl rule__Row__Group__10 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2003:2: rule__Row__Group__9__Impl rule__Row__Group__10
            {
            pushFollow(FOLLOW_rule__Row__Group__9__Impl_in_rule__Row__Group__94206);
            rule__Row__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Row__Group__10_in_rule__Row__Group__94209);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2010:1: rule__Row__Group__9__Impl : ( ( rule__Row__Group_9__0 )* ) ;
    public final void rule__Row__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2014:1: ( ( ( rule__Row__Group_9__0 )* ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2015:1: ( ( rule__Row__Group_9__0 )* )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2015:1: ( ( rule__Row__Group_9__0 )* )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2016:1: ( rule__Row__Group_9__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getGroup_9()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2017:1: ( rule__Row__Group_9__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==55) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2017:2: rule__Row__Group_9__0
            	    {
            	    pushFollow(FOLLOW_rule__Row__Group_9__0_in_rule__Row__Group__9__Impl4236);
            	    rule__Row__Group_9__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop41;
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2027:1: rule__Row__Group__10 : rule__Row__Group__10__Impl ;
    public final void rule__Row__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2031:1: ( rule__Row__Group__10__Impl )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2032:2: rule__Row__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__Row__Group__10__Impl_in_rule__Row__Group__104267);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2038:1: rule__Row__Group__10__Impl : ( ( RULE_LF )? ) ;
    public final void rule__Row__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2042:1: ( ( ( RULE_LF )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2043:1: ( ( RULE_LF )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2043:1: ( ( RULE_LF )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2044:1: ( RULE_LF )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getLFTerminalRuleCall_10()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2045:1: ( RULE_LF )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_LF) ) {
                int LA42_1 = input.LA(2);

                if ( (synpred59_InternalKnittingExpressionLanguage()) ) {
                    alt42=1;
                }
            }
            switch (alt42) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2045:3: RULE_LF
                    {
                    match(input,RULE_LF,FOLLOW_RULE_LF_in_rule__Row__Group__10__Impl4295); if (state.failed) return ;

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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2077:1: rule__Row__Group_3_1__0 : rule__Row__Group_3_1__0__Impl rule__Row__Group_3_1__1 ;
    public final void rule__Row__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2081:1: ( rule__Row__Group_3_1__0__Impl rule__Row__Group_3_1__1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2082:2: rule__Row__Group_3_1__0__Impl rule__Row__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__Row__Group_3_1__0__Impl_in_rule__Row__Group_3_1__04348);
            rule__Row__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Row__Group_3_1__1_in_rule__Row__Group_3_1__04351);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2089:1: rule__Row__Group_3_1__0__Impl : ( ( rule__Row__NumberAssignment_3_1_0 ) ) ;
    public final void rule__Row__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2093:1: ( ( ( rule__Row__NumberAssignment_3_1_0 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2094:1: ( ( rule__Row__NumberAssignment_3_1_0 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2094:1: ( ( rule__Row__NumberAssignment_3_1_0 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2095:1: ( rule__Row__NumberAssignment_3_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getNumberAssignment_3_1_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2096:1: ( rule__Row__NumberAssignment_3_1_0 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2096:2: rule__Row__NumberAssignment_3_1_0
            {
            pushFollow(FOLLOW_rule__Row__NumberAssignment_3_1_0_in_rule__Row__Group_3_1__0__Impl4378);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2106:1: rule__Row__Group_3_1__1 : rule__Row__Group_3_1__1__Impl rule__Row__Group_3_1__2 ;
    public final void rule__Row__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2110:1: ( rule__Row__Group_3_1__1__Impl rule__Row__Group_3_1__2 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2111:2: rule__Row__Group_3_1__1__Impl rule__Row__Group_3_1__2
            {
            pushFollow(FOLLOW_rule__Row__Group_3_1__1__Impl_in_rule__Row__Group_3_1__14408);
            rule__Row__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Row__Group_3_1__2_in_rule__Row__Group_3_1__14411);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2118:1: rule__Row__Group_3_1__1__Impl : ( ( rule__Row__Group_3_1_1__0 )* ) ;
    public final void rule__Row__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2122:1: ( ( ( rule__Row__Group_3_1_1__0 )* ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2123:1: ( ( rule__Row__Group_3_1_1__0 )* )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2123:1: ( ( rule__Row__Group_3_1_1__0 )* )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2124:1: ( rule__Row__Group_3_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getGroup_3_1_1()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2125:1: ( rule__Row__Group_3_1_1__0 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==55) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2125:2: rule__Row__Group_3_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Row__Group_3_1_1__0_in_rule__Row__Group_3_1__1__Impl4438);
            	    rule__Row__Group_3_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop43;
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2135:1: rule__Row__Group_3_1__2 : rule__Row__Group_3_1__2__Impl ;
    public final void rule__Row__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2139:1: ( rule__Row__Group_3_1__2__Impl )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2140:2: rule__Row__Group_3_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Row__Group_3_1__2__Impl_in_rule__Row__Group_3_1__24469);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2146:1: rule__Row__Group_3_1__2__Impl : ( ( rule__Row__Group_3_1_2__0 )? ) ;
    public final void rule__Row__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2150:1: ( ( ( rule__Row__Group_3_1_2__0 )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2151:1: ( ( rule__Row__Group_3_1_2__0 )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2151:1: ( ( rule__Row__Group_3_1_2__0 )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2152:1: ( rule__Row__Group_3_1_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getGroup_3_1_2()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2153:1: ( rule__Row__Group_3_1_2__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==56) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2153:2: rule__Row__Group_3_1_2__0
                    {
                    pushFollow(FOLLOW_rule__Row__Group_3_1_2__0_in_rule__Row__Group_3_1__2__Impl4496);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2169:1: rule__Row__Group_3_1_1__0 : rule__Row__Group_3_1_1__0__Impl rule__Row__Group_3_1_1__1 ;
    public final void rule__Row__Group_3_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2173:1: ( rule__Row__Group_3_1_1__0__Impl rule__Row__Group_3_1_1__1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2174:2: rule__Row__Group_3_1_1__0__Impl rule__Row__Group_3_1_1__1
            {
            pushFollow(FOLLOW_rule__Row__Group_3_1_1__0__Impl_in_rule__Row__Group_3_1_1__04533);
            rule__Row__Group_3_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Row__Group_3_1_1__1_in_rule__Row__Group_3_1_1__04536);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2181:1: rule__Row__Group_3_1_1__0__Impl : ( ',' ) ;
    public final void rule__Row__Group_3_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2185:1: ( ( ',' ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2186:1: ( ',' )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2186:1: ( ',' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2187:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getCommaKeyword_3_1_1_0()); 
            }
            match(input,55,FOLLOW_55_in_rule__Row__Group_3_1_1__0__Impl4564); if (state.failed) return ;
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2200:1: rule__Row__Group_3_1_1__1 : rule__Row__Group_3_1_1__1__Impl ;
    public final void rule__Row__Group_3_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2204:1: ( rule__Row__Group_3_1_1__1__Impl )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2205:2: rule__Row__Group_3_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Row__Group_3_1_1__1__Impl_in_rule__Row__Group_3_1_1__14595);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2211:1: rule__Row__Group_3_1_1__1__Impl : ( ( rule__Row__NumberAssignment_3_1_1_1 ) ) ;
    public final void rule__Row__Group_3_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2215:1: ( ( ( rule__Row__NumberAssignment_3_1_1_1 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2216:1: ( ( rule__Row__NumberAssignment_3_1_1_1 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2216:1: ( ( rule__Row__NumberAssignment_3_1_1_1 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2217:1: ( rule__Row__NumberAssignment_3_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getNumberAssignment_3_1_1_1()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2218:1: ( rule__Row__NumberAssignment_3_1_1_1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2218:2: rule__Row__NumberAssignment_3_1_1_1
            {
            pushFollow(FOLLOW_rule__Row__NumberAssignment_3_1_1_1_in_rule__Row__Group_3_1_1__1__Impl4622);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2232:1: rule__Row__Group_3_1_2__0 : rule__Row__Group_3_1_2__0__Impl rule__Row__Group_3_1_2__1 ;
    public final void rule__Row__Group_3_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2236:1: ( rule__Row__Group_3_1_2__0__Impl rule__Row__Group_3_1_2__1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2237:2: rule__Row__Group_3_1_2__0__Impl rule__Row__Group_3_1_2__1
            {
            pushFollow(FOLLOW_rule__Row__Group_3_1_2__0__Impl_in_rule__Row__Group_3_1_2__04656);
            rule__Row__Group_3_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Row__Group_3_1_2__1_in_rule__Row__Group_3_1_2__04659);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2244:1: rule__Row__Group_3_1_2__0__Impl : ( 'and' ) ;
    public final void rule__Row__Group_3_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2248:1: ( ( 'and' ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2249:1: ( 'and' )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2249:1: ( 'and' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2250:1: 'and'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getAndKeyword_3_1_2_0()); 
            }
            match(input,56,FOLLOW_56_in_rule__Row__Group_3_1_2__0__Impl4687); if (state.failed) return ;
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2263:1: rule__Row__Group_3_1_2__1 : rule__Row__Group_3_1_2__1__Impl rule__Row__Group_3_1_2__2 ;
    public final void rule__Row__Group_3_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2267:1: ( rule__Row__Group_3_1_2__1__Impl rule__Row__Group_3_1_2__2 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2268:2: rule__Row__Group_3_1_2__1__Impl rule__Row__Group_3_1_2__2
            {
            pushFollow(FOLLOW_rule__Row__Group_3_1_2__1__Impl_in_rule__Row__Group_3_1_2__14718);
            rule__Row__Group_3_1_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Row__Group_3_1_2__2_in_rule__Row__Group_3_1_2__14721);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2275:1: rule__Row__Group_3_1_2__1__Impl : ( ( 'all' )? ) ;
    public final void rule__Row__Group_3_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2279:1: ( ( ( 'all' )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2280:1: ( ( 'all' )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2280:1: ( ( 'all' )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2281:1: ( 'all' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getAllKeyword_3_1_2_1()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2282:1: ( 'all' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==57) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2283:2: 'all'
                    {
                    match(input,57,FOLLOW_57_in_rule__Row__Group_3_1_2__1__Impl4750); if (state.failed) return ;

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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2294:1: rule__Row__Group_3_1_2__2 : rule__Row__Group_3_1_2__2__Impl rule__Row__Group_3_1_2__3 ;
    public final void rule__Row__Group_3_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2298:1: ( rule__Row__Group_3_1_2__2__Impl rule__Row__Group_3_1_2__3 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2299:2: rule__Row__Group_3_1_2__2__Impl rule__Row__Group_3_1_2__3
            {
            pushFollow(FOLLOW_rule__Row__Group_3_1_2__2__Impl_in_rule__Row__Group_3_1_2__24783);
            rule__Row__Group_3_1_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Row__Group_3_1_2__3_in_rule__Row__Group_3_1_2__24786);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2306:1: rule__Row__Group_3_1_2__2__Impl : ( ( rule__Row__SubsequentAssignment_3_1_2_2 ) ) ;
    public final void rule__Row__Group_3_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2310:1: ( ( ( rule__Row__SubsequentAssignment_3_1_2_2 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2311:1: ( ( rule__Row__SubsequentAssignment_3_1_2_2 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2311:1: ( ( rule__Row__SubsequentAssignment_3_1_2_2 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2312:1: ( rule__Row__SubsequentAssignment_3_1_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getSubsequentAssignment_3_1_2_2()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2313:1: ( rule__Row__SubsequentAssignment_3_1_2_2 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2313:2: rule__Row__SubsequentAssignment_3_1_2_2
            {
            pushFollow(FOLLOW_rule__Row__SubsequentAssignment_3_1_2_2_in_rule__Row__Group_3_1_2__2__Impl4813);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2323:1: rule__Row__Group_3_1_2__3 : rule__Row__Group_3_1_2__3__Impl ;
    public final void rule__Row__Group_3_1_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2327:1: ( rule__Row__Group_3_1_2__3__Impl )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2328:2: rule__Row__Group_3_1_2__3__Impl
            {
            pushFollow(FOLLOW_rule__Row__Group_3_1_2__3__Impl_in_rule__Row__Group_3_1_2__34843);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2334:1: rule__Row__Group_3_1_2__3__Impl : ( ( rule__Row__Alternatives_3_1_2_3 )? ) ;
    public final void rule__Row__Group_3_1_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2338:1: ( ( ( rule__Row__Alternatives_3_1_2_3 )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2339:1: ( ( rule__Row__Alternatives_3_1_2_3 )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2339:1: ( ( rule__Row__Alternatives_3_1_2_3 )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2340:1: ( rule__Row__Alternatives_3_1_2_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getAlternatives_3_1_2_3()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2341:1: ( rule__Row__Alternatives_3_1_2_3 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=18 && LA46_0<=19)) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2341:2: rule__Row__Alternatives_3_1_2_3
                    {
                    pushFollow(FOLLOW_rule__Row__Alternatives_3_1_2_3_in_rule__Row__Group_3_1_2__3__Impl4870);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2359:1: rule__Row__Group_4_1__0 : rule__Row__Group_4_1__0__Impl rule__Row__Group_4_1__1 ;
    public final void rule__Row__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2363:1: ( rule__Row__Group_4_1__0__Impl rule__Row__Group_4_1__1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2364:2: rule__Row__Group_4_1__0__Impl rule__Row__Group_4_1__1
            {
            pushFollow(FOLLOW_rule__Row__Group_4_1__0__Impl_in_rule__Row__Group_4_1__04909);
            rule__Row__Group_4_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Row__Group_4_1__1_in_rule__Row__Group_4_1__04912);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2371:1: rule__Row__Group_4_1__0__Impl : ( 'with' ) ;
    public final void rule__Row__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2375:1: ( ( 'with' ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2376:1: ( 'with' )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2376:1: ( 'with' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2377:1: 'with'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getWithKeyword_4_1_0()); 
            }
            match(input,58,FOLLOW_58_in_rule__Row__Group_4_1__0__Impl4940); if (state.failed) return ;
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2390:1: rule__Row__Group_4_1__1 : rule__Row__Group_4_1__1__Impl ;
    public final void rule__Row__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2394:1: ( rule__Row__Group_4_1__1__Impl )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2395:2: rule__Row__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Row__Group_4_1__1__Impl_in_rule__Row__Group_4_1__14971);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2401:1: rule__Row__Group_4_1__1__Impl : ( ( rule__Row__YarnRefAssignment_4_1_1 ) ) ;
    public final void rule__Row__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2405:1: ( ( ( rule__Row__YarnRefAssignment_4_1_1 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2406:1: ( ( rule__Row__YarnRefAssignment_4_1_1 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2406:1: ( ( rule__Row__YarnRefAssignment_4_1_1 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2407:1: ( rule__Row__YarnRefAssignment_4_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getYarnRefAssignment_4_1_1()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2408:1: ( rule__Row__YarnRefAssignment_4_1_1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2408:2: rule__Row__YarnRefAssignment_4_1_1
            {
            pushFollow(FOLLOW_rule__Row__YarnRefAssignment_4_1_1_in_rule__Row__Group_4_1__1__Impl4998);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2422:1: rule__Row__Group_5__0 : rule__Row__Group_5__0__Impl rule__Row__Group_5__1 ;
    public final void rule__Row__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2426:1: ( rule__Row__Group_5__0__Impl rule__Row__Group_5__1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2427:2: rule__Row__Group_5__0__Impl rule__Row__Group_5__1
            {
            pushFollow(FOLLOW_rule__Row__Group_5__0__Impl_in_rule__Row__Group_5__05032);
            rule__Row__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Row__Group_5__1_in_rule__Row__Group_5__05035);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2434:1: rule__Row__Group_5__0__Impl : ( '(' ) ;
    public final void rule__Row__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2438:1: ( ( '(' ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2439:1: ( '(' )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2439:1: ( '(' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2440:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getLeftParenthesisKeyword_5_0()); 
            }
            match(input,59,FOLLOW_59_in_rule__Row__Group_5__0__Impl5063); if (state.failed) return ;
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2453:1: rule__Row__Group_5__1 : rule__Row__Group_5__1__Impl rule__Row__Group_5__2 ;
    public final void rule__Row__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2457:1: ( rule__Row__Group_5__1__Impl rule__Row__Group_5__2 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2458:2: rule__Row__Group_5__1__Impl rule__Row__Group_5__2
            {
            pushFollow(FOLLOW_rule__Row__Group_5__1__Impl_in_rule__Row__Group_5__15094);
            rule__Row__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Row__Group_5__2_in_rule__Row__Group_5__15097);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2465:1: rule__Row__Group_5__1__Impl : ( ( rule__Row__Group_5_1__0 )? ) ;
    public final void rule__Row__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2469:1: ( ( ( rule__Row__Group_5_1__0 )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2470:1: ( ( rule__Row__Group_5_1__0 )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2470:1: ( ( rule__Row__Group_5_1__0 )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2471:1: ( rule__Row__Group_5_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getGroup_5_1()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2472:1: ( rule__Row__Group_5_1__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==55) ) {
                int LA47_1 = input.LA(2);

                if ( (LA47_1==70) ) {
                    alt47=1;
                }
            }
            else if ( (LA47_0==70) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2472:2: rule__Row__Group_5_1__0
                    {
                    pushFollow(FOLLOW_rule__Row__Group_5_1__0_in_rule__Row__Group_5__1__Impl5124);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2482:1: rule__Row__Group_5__2 : rule__Row__Group_5__2__Impl rule__Row__Group_5__3 ;
    public final void rule__Row__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2486:1: ( rule__Row__Group_5__2__Impl rule__Row__Group_5__3 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2487:2: rule__Row__Group_5__2__Impl rule__Row__Group_5__3
            {
            pushFollow(FOLLOW_rule__Row__Group_5__2__Impl_in_rule__Row__Group_5__25155);
            rule__Row__Group_5__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Row__Group_5__3_in_rule__Row__Group_5__25158);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2494:1: rule__Row__Group_5__2__Impl : ( ( rule__Row__Group_5_2__0 )? ) ;
    public final void rule__Row__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2498:1: ( ( ( rule__Row__Group_5_2__0 )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2499:1: ( ( rule__Row__Group_5_2__0 )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2499:1: ( ( rule__Row__Group_5_2__0 )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2500:1: ( rule__Row__Group_5_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getGroup_5_2()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2501:1: ( rule__Row__Group_5_2__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==55||LA48_0==71) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2501:2: rule__Row__Group_5_2__0
                    {
                    pushFollow(FOLLOW_rule__Row__Group_5_2__0_in_rule__Row__Group_5__2__Impl5185);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2511:1: rule__Row__Group_5__3 : rule__Row__Group_5__3__Impl ;
    public final void rule__Row__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2515:1: ( rule__Row__Group_5__3__Impl )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2516:2: rule__Row__Group_5__3__Impl
            {
            pushFollow(FOLLOW_rule__Row__Group_5__3__Impl_in_rule__Row__Group_5__35216);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2522:1: rule__Row__Group_5__3__Impl : ( ')' ) ;
    public final void rule__Row__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2526:1: ( ( ')' ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2527:1: ( ')' )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2527:1: ( ')' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2528:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getRightParenthesisKeyword_5_3()); 
            }
            match(input,60,FOLLOW_60_in_rule__Row__Group_5__3__Impl5244); if (state.failed) return ;
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2549:1: rule__Row__Group_5_1__0 : rule__Row__Group_5_1__0__Impl rule__Row__Group_5_1__1 ;
    public final void rule__Row__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2553:1: ( rule__Row__Group_5_1__0__Impl rule__Row__Group_5_1__1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2554:2: rule__Row__Group_5_1__0__Impl rule__Row__Group_5_1__1
            {
            pushFollow(FOLLOW_rule__Row__Group_5_1__0__Impl_in_rule__Row__Group_5_1__05283);
            rule__Row__Group_5_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Row__Group_5_1__1_in_rule__Row__Group_5_1__05286);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2561:1: rule__Row__Group_5_1__0__Impl : ( ( ',' )? ) ;
    public final void rule__Row__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2565:1: ( ( ( ',' )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2566:1: ( ( ',' )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2566:1: ( ( ',' )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2567:1: ( ',' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getCommaKeyword_5_1_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2568:1: ( ',' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==55) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2569:2: ','
                    {
                    match(input,55,FOLLOW_55_in_rule__Row__Group_5_1__0__Impl5315); if (state.failed) return ;

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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2580:1: rule__Row__Group_5_1__1 : rule__Row__Group_5_1__1__Impl rule__Row__Group_5_1__2 ;
    public final void rule__Row__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2584:1: ( rule__Row__Group_5_1__1__Impl rule__Row__Group_5_1__2 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2585:2: rule__Row__Group_5_1__1__Impl rule__Row__Group_5_1__2
            {
            pushFollow(FOLLOW_rule__Row__Group_5_1__1__Impl_in_rule__Row__Group_5_1__15348);
            rule__Row__Group_5_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Row__Group_5_1__2_in_rule__Row__Group_5_1__15351);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2592:1: rule__Row__Group_5_1__1__Impl : ( ( rule__Row__InformAssignment_5_1_1 ) ) ;
    public final void rule__Row__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2596:1: ( ( ( rule__Row__InformAssignment_5_1_1 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2597:1: ( ( rule__Row__InformAssignment_5_1_1 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2597:1: ( ( rule__Row__InformAssignment_5_1_1 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2598:1: ( rule__Row__InformAssignment_5_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getInformAssignment_5_1_1()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2599:1: ( rule__Row__InformAssignment_5_1_1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2599:2: rule__Row__InformAssignment_5_1_1
            {
            pushFollow(FOLLOW_rule__Row__InformAssignment_5_1_1_in_rule__Row__Group_5_1__1__Impl5378);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2609:1: rule__Row__Group_5_1__2 : rule__Row__Group_5_1__2__Impl ;
    public final void rule__Row__Group_5_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2613:1: ( rule__Row__Group_5_1__2__Impl )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2614:2: rule__Row__Group_5_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Row__Group_5_1__2__Impl_in_rule__Row__Group_5_1__25408);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2620:1: rule__Row__Group_5_1__2__Impl : ( ( 'side' )? ) ;
    public final void rule__Row__Group_5_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2624:1: ( ( ( 'side' )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2625:1: ( ( 'side' )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2625:1: ( ( 'side' )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2626:1: ( 'side' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getSideKeyword_5_1_2()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2627:1: ( 'side' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==61) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2628:2: 'side'
                    {
                    match(input,61,FOLLOW_61_in_rule__Row__Group_5_1__2__Impl5437); if (state.failed) return ;

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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2645:1: rule__Row__Group_5_2__0 : rule__Row__Group_5_2__0__Impl rule__Row__Group_5_2__1 ;
    public final void rule__Row__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2649:1: ( rule__Row__Group_5_2__0__Impl rule__Row__Group_5_2__1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2650:2: rule__Row__Group_5_2__0__Impl rule__Row__Group_5_2__1
            {
            pushFollow(FOLLOW_rule__Row__Group_5_2__0__Impl_in_rule__Row__Group_5_2__05476);
            rule__Row__Group_5_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Row__Group_5_2__1_in_rule__Row__Group_5_2__05479);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2657:1: rule__Row__Group_5_2__0__Impl : ( ( ',' )? ) ;
    public final void rule__Row__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2661:1: ( ( ( ',' )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2662:1: ( ( ',' )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2662:1: ( ( ',' )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2663:1: ( ',' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getCommaKeyword_5_2_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2664:1: ( ',' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==55) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2665:2: ','
                    {
                    match(input,55,FOLLOW_55_in_rule__Row__Group_5_2__0__Impl5508); if (state.failed) return ;

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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2676:1: rule__Row__Group_5_2__1 : rule__Row__Group_5_2__1__Impl rule__Row__Group_5_2__2 ;
    public final void rule__Row__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2680:1: ( rule__Row__Group_5_2__1__Impl rule__Row__Group_5_2__2 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2681:2: rule__Row__Group_5_2__1__Impl rule__Row__Group_5_2__2
            {
            pushFollow(FOLLOW_rule__Row__Group_5_2__1__Impl_in_rule__Row__Group_5_2__15541);
            rule__Row__Group_5_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Row__Group_5_2__2_in_rule__Row__Group_5_2__15544);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2688:1: rule__Row__Group_5_2__1__Impl : ( ( rule__Row__ResetAssignment_5_2_1 ) ) ;
    public final void rule__Row__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2692:1: ( ( ( rule__Row__ResetAssignment_5_2_1 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2693:1: ( ( rule__Row__ResetAssignment_5_2_1 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2693:1: ( ( rule__Row__ResetAssignment_5_2_1 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2694:1: ( rule__Row__ResetAssignment_5_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getResetAssignment_5_2_1()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2695:1: ( rule__Row__ResetAssignment_5_2_1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2695:2: rule__Row__ResetAssignment_5_2_1
            {
            pushFollow(FOLLOW_rule__Row__ResetAssignment_5_2_1_in_rule__Row__Group_5_2__1__Impl5571);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2705:1: rule__Row__Group_5_2__2 : rule__Row__Group_5_2__2__Impl ;
    public final void rule__Row__Group_5_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2709:1: ( rule__Row__Group_5_2__2__Impl )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2710:2: rule__Row__Group_5_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Row__Group_5_2__2__Impl_in_rule__Row__Group_5_2__25601);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2716:1: rule__Row__Group_5_2__2__Impl : ( ( 'count' )? ) ;
    public final void rule__Row__Group_5_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2720:1: ( ( ( 'count' )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2721:1: ( ( 'count' )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2721:1: ( ( 'count' )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2722:1: ( 'count' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getCountKeyword_5_2_2()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2723:1: ( 'count' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==62) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2724:2: 'count'
                    {
                    match(input,62,FOLLOW_62_in_rule__Row__Group_5_2__2__Impl5630); if (state.failed) return ;

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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2741:1: rule__Row__Group_9__0 : rule__Row__Group_9__0__Impl rule__Row__Group_9__1 ;
    public final void rule__Row__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2745:1: ( rule__Row__Group_9__0__Impl rule__Row__Group_9__1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2746:2: rule__Row__Group_9__0__Impl rule__Row__Group_9__1
            {
            pushFollow(FOLLOW_rule__Row__Group_9__0__Impl_in_rule__Row__Group_9__05669);
            rule__Row__Group_9__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Row__Group_9__1_in_rule__Row__Group_9__05672);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2753:1: rule__Row__Group_9__0__Impl : ( ',' ) ;
    public final void rule__Row__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2757:1: ( ( ',' ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2758:1: ( ',' )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2758:1: ( ',' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2759:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getCommaKeyword_9_0()); 
            }
            match(input,55,FOLLOW_55_in_rule__Row__Group_9__0__Impl5700); if (state.failed) return ;
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2772:1: rule__Row__Group_9__1 : rule__Row__Group_9__1__Impl ;
    public final void rule__Row__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2776:1: ( rule__Row__Group_9__1__Impl )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2777:2: rule__Row__Group_9__1__Impl
            {
            pushFollow(FOLLOW_rule__Row__Group_9__1__Impl_in_rule__Row__Group_9__15731);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2783:1: rule__Row__Group_9__1__Impl : ( ( rule__Row__OperationsAssignment_9_1 ) ) ;
    public final void rule__Row__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2787:1: ( ( ( rule__Row__OperationsAssignment_9_1 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2788:1: ( ( rule__Row__OperationsAssignment_9_1 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2788:1: ( ( rule__Row__OperationsAssignment_9_1 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2789:1: ( rule__Row__OperationsAssignment_9_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getOperationsAssignment_9_1()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2790:1: ( rule__Row__OperationsAssignment_9_1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2790:2: rule__Row__OperationsAssignment_9_1
            {
            pushFollow(FOLLOW_rule__Row__OperationsAssignment_9_1_in_rule__Row__Group_9__1__Impl5758);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2804:1: rule__Message__Group__0 : rule__Message__Group__0__Impl rule__Message__Group__1 ;
    public final void rule__Message__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2808:1: ( rule__Message__Group__0__Impl rule__Message__Group__1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2809:2: rule__Message__Group__0__Impl rule__Message__Group__1
            {
            pushFollow(FOLLOW_rule__Message__Group__0__Impl_in_rule__Message__Group__05792);
            rule__Message__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Message__Group__1_in_rule__Message__Group__05795);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2816:1: rule__Message__Group__0__Impl : ( ( rule__Message__MessageAssignment_0 ) ) ;
    public final void rule__Message__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2820:1: ( ( ( rule__Message__MessageAssignment_0 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2821:1: ( ( rule__Message__MessageAssignment_0 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2821:1: ( ( rule__Message__MessageAssignment_0 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2822:1: ( rule__Message__MessageAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getMessageAssignment_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2823:1: ( rule__Message__MessageAssignment_0 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2823:2: rule__Message__MessageAssignment_0
            {
            pushFollow(FOLLOW_rule__Message__MessageAssignment_0_in_rule__Message__Group__0__Impl5822);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2833:1: rule__Message__Group__1 : rule__Message__Group__1__Impl ;
    public final void rule__Message__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2837:1: ( rule__Message__Group__1__Impl )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2838:2: rule__Message__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Message__Group__1__Impl_in_rule__Message__Group__15852);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2844:1: rule__Message__Group__1__Impl : ( RULE_LF ) ;
    public final void rule__Message__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2848:1: ( ( RULE_LF ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2849:1: ( RULE_LF )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2849:1: ( RULE_LF )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2850:1: RULE_LF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getLFTerminalRuleCall_1()); 
            }
            match(input,RULE_LF,FOLLOW_RULE_LF_in_rule__Message__Group__1__Impl5879); if (state.failed) return ;
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2865:1: rule__Knit__Group__0 : rule__Knit__Group__0__Impl rule__Knit__Group__1 ;
    public final void rule__Knit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2869:1: ( rule__Knit__Group__0__Impl rule__Knit__Group__1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2870:2: rule__Knit__Group__0__Impl rule__Knit__Group__1
            {
            pushFollow(FOLLOW_rule__Knit__Group__0__Impl_in_rule__Knit__Group__05912);
            rule__Knit__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Knit__Group__1_in_rule__Knit__Group__05915);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2877:1: rule__Knit__Group__0__Impl : ( ( rule__Knit__Alternatives_0 ) ) ;
    public final void rule__Knit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2881:1: ( ( ( rule__Knit__Alternatives_0 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2882:1: ( ( rule__Knit__Alternatives_0 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2882:1: ( ( rule__Knit__Alternatives_0 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2883:1: ( rule__Knit__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKnitAccess().getAlternatives_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2884:1: ( rule__Knit__Alternatives_0 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2884:2: rule__Knit__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Knit__Alternatives_0_in_rule__Knit__Group__0__Impl5942);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2894:1: rule__Knit__Group__1 : rule__Knit__Group__1__Impl rule__Knit__Group__2 ;
    public final void rule__Knit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2898:1: ( rule__Knit__Group__1__Impl rule__Knit__Group__2 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2899:2: rule__Knit__Group__1__Impl rule__Knit__Group__2
            {
            pushFollow(FOLLOW_rule__Knit__Group__1__Impl_in_rule__Knit__Group__15972);
            rule__Knit__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Knit__Group__2_in_rule__Knit__Group__15975);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2906:1: rule__Knit__Group__1__Impl : ( () ) ;
    public final void rule__Knit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2910:1: ( ( () ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2911:1: ( () )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2911:1: ( () )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2912:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKnitAccess().getKnitAction_1()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2913:1: ()
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2915:1: 
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2925:1: rule__Knit__Group__2 : rule__Knit__Group__2__Impl rule__Knit__Group__3 ;
    public final void rule__Knit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2929:1: ( rule__Knit__Group__2__Impl rule__Knit__Group__3 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2930:2: rule__Knit__Group__2__Impl rule__Knit__Group__3
            {
            pushFollow(FOLLOW_rule__Knit__Group__2__Impl_in_rule__Knit__Group__26033);
            rule__Knit__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Knit__Group__3_in_rule__Knit__Group__26036);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2937:1: rule__Knit__Group__2__Impl : ( ( rule__Knit__NumberAssignment_2 )? ) ;
    public final void rule__Knit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2941:1: ( ( ( rule__Knit__NumberAssignment_2 )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2942:1: ( ( rule__Knit__NumberAssignment_2 )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2942:1: ( ( rule__Knit__NumberAssignment_2 )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2943:1: ( rule__Knit__NumberAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKnitAccess().getNumberAssignment_2()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2944:1: ( rule__Knit__NumberAssignment_2 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_INT) ) {
                switch ( input.LA(2) ) {
                    case 26:
                        {
                        int LA53_3 = input.LA(3);

                        if ( (LA53_3==EOF||LA53_3==RULE_LF||(LA53_3>=RULE_INT && LA53_3<=RULE_STRING)||(LA53_3>=12 && LA53_3<=15)||(LA53_3>=28 && LA53_3<=29)||LA53_3==51||LA53_3==53||LA53_3==55||LA53_3==58||LA53_3==63||LA53_3==65||(LA53_3>=67 && LA53_3<=69)||(LA53_3>=72 && LA53_3<=74)) ) {
                            alt53=1;
                        }
                        }
                        break;
                    case 27:
                        {
                        int LA53_4 = input.LA(3);

                        if ( (LA53_4==EOF||LA53_4==RULE_LF||(LA53_4>=RULE_INT && LA53_4<=RULE_STRING)||(LA53_4>=12 && LA53_4<=15)||(LA53_4>=28 && LA53_4<=29)||LA53_4==51||LA53_4==53||LA53_4==55||LA53_4==58||LA53_4==63||LA53_4==65||(LA53_4>=67 && LA53_4<=69)||(LA53_4>=72 && LA53_4<=74)) ) {
                            alt53=1;
                        }
                        }
                        break;
                    case EOF:
                    case RULE_LF:
                    case RULE_INT:
                    case RULE_STRING:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 28:
                    case 29:
                    case 51:
                    case 53:
                    case 55:
                    case 58:
                    case 63:
                    case 65:
                    case 67:
                    case 68:
                    case 69:
                    case 72:
                    case 73:
                    case 74:
                        {
                        alt53=1;
                        }
                        break;
                }

            }
            switch (alt53) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2944:2: rule__Knit__NumberAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Knit__NumberAssignment_2_in_rule__Knit__Group__2__Impl6063);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2954:1: rule__Knit__Group__3 : rule__Knit__Group__3__Impl rule__Knit__Group__4 ;
    public final void rule__Knit__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2958:1: ( rule__Knit__Group__3__Impl rule__Knit__Group__4 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2959:2: rule__Knit__Group__3__Impl rule__Knit__Group__4
            {
            pushFollow(FOLLOW_rule__Knit__Group__3__Impl_in_rule__Knit__Group__36094);
            rule__Knit__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Knit__Group__4_in_rule__Knit__Group__36097);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2966:1: rule__Knit__Group__3__Impl : ( ( rule__Knit__Alternatives_3 )? ) ;
    public final void rule__Knit__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2970:1: ( ( ( rule__Knit__Alternatives_3 )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2971:1: ( ( rule__Knit__Alternatives_3 )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2971:1: ( ( rule__Knit__Alternatives_3 )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2972:1: ( rule__Knit__Alternatives_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKnitAccess().getAlternatives_3()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2973:1: ( rule__Knit__Alternatives_3 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( ((LA54_0>=26 && LA54_0<=27)) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2973:2: rule__Knit__Alternatives_3
                    {
                    pushFollow(FOLLOW_rule__Knit__Alternatives_3_in_rule__Knit__Group__3__Impl6124);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2983:1: rule__Knit__Group__4 : rule__Knit__Group__4__Impl rule__Knit__Group__5 ;
    public final void rule__Knit__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2987:1: ( rule__Knit__Group__4__Impl rule__Knit__Group__5 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2988:2: rule__Knit__Group__4__Impl rule__Knit__Group__5
            {
            pushFollow(FOLLOW_rule__Knit__Group__4__Impl_in_rule__Knit__Group__46155);
            rule__Knit__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Knit__Group__5_in_rule__Knit__Group__46158);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2995:1: rule__Knit__Group__4__Impl : ( ( rule__Knit__UnorderedGroup_4 ) ) ;
    public final void rule__Knit__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2999:1: ( ( ( rule__Knit__UnorderedGroup_4 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3000:1: ( ( rule__Knit__UnorderedGroup_4 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3000:1: ( ( rule__Knit__UnorderedGroup_4 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3001:1: ( rule__Knit__UnorderedGroup_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKnitAccess().getUnorderedGroup_4()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3002:1: ( rule__Knit__UnorderedGroup_4 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3002:2: rule__Knit__UnorderedGroup_4
            {
            pushFollow(FOLLOW_rule__Knit__UnorderedGroup_4_in_rule__Knit__Group__4__Impl6185);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3012:1: rule__Knit__Group__5 : rule__Knit__Group__5__Impl rule__Knit__Group__6 ;
    public final void rule__Knit__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3016:1: ( rule__Knit__Group__5__Impl rule__Knit__Group__6 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3017:2: rule__Knit__Group__5__Impl rule__Knit__Group__6
            {
            pushFollow(FOLLOW_rule__Knit__Group__5__Impl_in_rule__Knit__Group__56215);
            rule__Knit__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Knit__Group__6_in_rule__Knit__Group__56218);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3024:1: rule__Knit__Group__5__Impl : ( ( rule__Knit__Group_5__0 )? ) ;
    public final void rule__Knit__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3028:1: ( ( ( rule__Knit__Group_5__0 )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3029:1: ( ( rule__Knit__Group_5__0 )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3029:1: ( ( rule__Knit__Group_5__0 )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3030:1: ( rule__Knit__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKnitAccess().getGroup_5()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3031:1: ( rule__Knit__Group_5__0 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==58) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3031:2: rule__Knit__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Knit__Group_5__0_in_rule__Knit__Group__5__Impl6245);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3041:1: rule__Knit__Group__6 : rule__Knit__Group__6__Impl ;
    public final void rule__Knit__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3045:1: ( rule__Knit__Group__6__Impl )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3046:2: rule__Knit__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Knit__Group__6__Impl_in_rule__Knit__Group__66276);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3052:1: rule__Knit__Group__6__Impl : ( ( rule__Knit__Group_6__0 )? ) ;
    public final void rule__Knit__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3056:1: ( ( ( rule__Knit__Group_6__0 )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3057:1: ( ( rule__Knit__Group_6__0 )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3057:1: ( ( rule__Knit__Group_6__0 )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3058:1: ( rule__Knit__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKnitAccess().getGroup_6()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3059:1: ( rule__Knit__Group_6__0 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_INT||LA56_0==63||(LA56_0>=73 && LA56_0<=74)) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3059:2: rule__Knit__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Knit__Group_6__0_in_rule__Knit__Group__6__Impl6303);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3083:1: rule__Knit__Group_5__0 : rule__Knit__Group_5__0__Impl rule__Knit__Group_5__1 ;
    public final void rule__Knit__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3087:1: ( rule__Knit__Group_5__0__Impl rule__Knit__Group_5__1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3088:2: rule__Knit__Group_5__0__Impl rule__Knit__Group_5__1
            {
            pushFollow(FOLLOW_rule__Knit__Group_5__0__Impl_in_rule__Knit__Group_5__06348);
            rule__Knit__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Knit__Group_5__1_in_rule__Knit__Group_5__06351);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3095:1: rule__Knit__Group_5__0__Impl : ( 'with' ) ;
    public final void rule__Knit__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3099:1: ( ( 'with' ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3100:1: ( 'with' )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3100:1: ( 'with' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3101:1: 'with'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKnitAccess().getWithKeyword_5_0()); 
            }
            match(input,58,FOLLOW_58_in_rule__Knit__Group_5__0__Impl6379); if (state.failed) return ;
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3114:1: rule__Knit__Group_5__1 : rule__Knit__Group_5__1__Impl ;
    public final void rule__Knit__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3118:1: ( rule__Knit__Group_5__1__Impl )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3119:2: rule__Knit__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Knit__Group_5__1__Impl_in_rule__Knit__Group_5__16410);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3125:1: rule__Knit__Group_5__1__Impl : ( ( rule__Knit__YarnRefAssignment_5_1 ) ) ;
    public final void rule__Knit__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3129:1: ( ( ( rule__Knit__YarnRefAssignment_5_1 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3130:1: ( ( rule__Knit__YarnRefAssignment_5_1 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3130:1: ( ( rule__Knit__YarnRefAssignment_5_1 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3131:1: ( rule__Knit__YarnRefAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKnitAccess().getYarnRefAssignment_5_1()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3132:1: ( rule__Knit__YarnRefAssignment_5_1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3132:2: rule__Knit__YarnRefAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Knit__YarnRefAssignment_5_1_in_rule__Knit__Group_5__1__Impl6437);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3146:1: rule__Knit__Group_6__0 : rule__Knit__Group_6__0__Impl rule__Knit__Group_6__1 ;
    public final void rule__Knit__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3150:1: ( rule__Knit__Group_6__0__Impl rule__Knit__Group_6__1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3151:2: rule__Knit__Group_6__0__Impl rule__Knit__Group_6__1
            {
            pushFollow(FOLLOW_rule__Knit__Group_6__0__Impl_in_rule__Knit__Group_6__06471);
            rule__Knit__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Knit__Group_6__1_in_rule__Knit__Group_6__06474);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3158:1: rule__Knit__Group_6__0__Impl : ( ( 'to' )? ) ;
    public final void rule__Knit__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3162:1: ( ( ( 'to' )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3163:1: ( ( 'to' )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3163:1: ( ( 'to' )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3164:1: ( 'to' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKnitAccess().getToKeyword_6_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3165:1: ( 'to' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==63) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3166:2: 'to'
                    {
                    match(input,63,FOLLOW_63_in_rule__Knit__Group_6__0__Impl6503); if (state.failed) return ;

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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3177:1: rule__Knit__Group_6__1 : rule__Knit__Group_6__1__Impl ;
    public final void rule__Knit__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3181:1: ( rule__Knit__Group_6__1__Impl )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3182:2: rule__Knit__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Knit__Group_6__1__Impl_in_rule__Knit__Group_6__16536);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3188:1: rule__Knit__Group_6__1__Impl : ( ( rule__Knit__RepeatAssignment_6_1 ) ) ;
    public final void rule__Knit__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3192:1: ( ( ( rule__Knit__RepeatAssignment_6_1 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3193:1: ( ( rule__Knit__RepeatAssignment_6_1 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3193:1: ( ( rule__Knit__RepeatAssignment_6_1 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3194:1: ( rule__Knit__RepeatAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKnitAccess().getRepeatAssignment_6_1()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3195:1: ( rule__Knit__RepeatAssignment_6_1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3195:2: rule__Knit__RepeatAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Knit__RepeatAssignment_6_1_in_rule__Knit__Group_6__1__Impl6563);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3209:1: rule__Purl__Group__0 : rule__Purl__Group__0__Impl rule__Purl__Group__1 ;
    public final void rule__Purl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3213:1: ( rule__Purl__Group__0__Impl rule__Purl__Group__1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3214:2: rule__Purl__Group__0__Impl rule__Purl__Group__1
            {
            pushFollow(FOLLOW_rule__Purl__Group__0__Impl_in_rule__Purl__Group__06597);
            rule__Purl__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Purl__Group__1_in_rule__Purl__Group__06600);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3221:1: rule__Purl__Group__0__Impl : ( ( rule__Purl__Alternatives_0 ) ) ;
    public final void rule__Purl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3225:1: ( ( ( rule__Purl__Alternatives_0 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3226:1: ( ( rule__Purl__Alternatives_0 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3226:1: ( ( rule__Purl__Alternatives_0 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3227:1: ( rule__Purl__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPurlAccess().getAlternatives_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3228:1: ( rule__Purl__Alternatives_0 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3228:2: rule__Purl__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Purl__Alternatives_0_in_rule__Purl__Group__0__Impl6627);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3238:1: rule__Purl__Group__1 : rule__Purl__Group__1__Impl rule__Purl__Group__2 ;
    public final void rule__Purl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3242:1: ( rule__Purl__Group__1__Impl rule__Purl__Group__2 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3243:2: rule__Purl__Group__1__Impl rule__Purl__Group__2
            {
            pushFollow(FOLLOW_rule__Purl__Group__1__Impl_in_rule__Purl__Group__16657);
            rule__Purl__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Purl__Group__2_in_rule__Purl__Group__16660);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3250:1: rule__Purl__Group__1__Impl : ( () ) ;
    public final void rule__Purl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3254:1: ( ( () ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3255:1: ( () )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3255:1: ( () )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3256:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPurlAccess().getPurlAction_1()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3257:1: ()
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3259:1: 
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3269:1: rule__Purl__Group__2 : rule__Purl__Group__2__Impl rule__Purl__Group__3 ;
    public final void rule__Purl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3273:1: ( rule__Purl__Group__2__Impl rule__Purl__Group__3 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3274:2: rule__Purl__Group__2__Impl rule__Purl__Group__3
            {
            pushFollow(FOLLOW_rule__Purl__Group__2__Impl_in_rule__Purl__Group__26718);
            rule__Purl__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Purl__Group__3_in_rule__Purl__Group__26721);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3281:1: rule__Purl__Group__2__Impl : ( ( rule__Purl__NumberAssignment_2 )? ) ;
    public final void rule__Purl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3285:1: ( ( ( rule__Purl__NumberAssignment_2 )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3286:1: ( ( rule__Purl__NumberAssignment_2 )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3286:1: ( ( rule__Purl__NumberAssignment_2 )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3287:1: ( rule__Purl__NumberAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPurlAccess().getNumberAssignment_2()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3288:1: ( rule__Purl__NumberAssignment_2 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_INT) ) {
                switch ( input.LA(2) ) {
                    case 26:
                        {
                        int LA58_3 = input.LA(3);

                        if ( (LA58_3==EOF||LA58_3==RULE_LF||(LA58_3>=RULE_INT && LA58_3<=RULE_STRING)||(LA58_3>=12 && LA58_3<=15)||(LA58_3>=28 && LA58_3<=29)||LA58_3==51||LA58_3==53||LA58_3==55||LA58_3==58||LA58_3==63||LA58_3==65||(LA58_3>=67 && LA58_3<=69)||(LA58_3>=72 && LA58_3<=74)) ) {
                            alt58=1;
                        }
                        }
                        break;
                    case 27:
                        {
                        int LA58_4 = input.LA(3);

                        if ( (LA58_4==EOF||LA58_4==RULE_LF||(LA58_4>=RULE_INT && LA58_4<=RULE_STRING)||(LA58_4>=12 && LA58_4<=15)||(LA58_4>=28 && LA58_4<=29)||LA58_4==51||LA58_4==53||LA58_4==55||LA58_4==58||LA58_4==63||LA58_4==65||(LA58_4>=67 && LA58_4<=69)||(LA58_4>=72 && LA58_4<=74)) ) {
                            alt58=1;
                        }
                        }
                        break;
                    case EOF:
                    case RULE_LF:
                    case RULE_INT:
                    case RULE_STRING:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 28:
                    case 29:
                    case 51:
                    case 53:
                    case 55:
                    case 58:
                    case 63:
                    case 65:
                    case 67:
                    case 68:
                    case 69:
                    case 72:
                    case 73:
                    case 74:
                        {
                        alt58=1;
                        }
                        break;
                }

            }
            switch (alt58) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3288:2: rule__Purl__NumberAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Purl__NumberAssignment_2_in_rule__Purl__Group__2__Impl6748);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3298:1: rule__Purl__Group__3 : rule__Purl__Group__3__Impl rule__Purl__Group__4 ;
    public final void rule__Purl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3302:1: ( rule__Purl__Group__3__Impl rule__Purl__Group__4 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3303:2: rule__Purl__Group__3__Impl rule__Purl__Group__4
            {
            pushFollow(FOLLOW_rule__Purl__Group__3__Impl_in_rule__Purl__Group__36779);
            rule__Purl__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Purl__Group__4_in_rule__Purl__Group__36782);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3310:1: rule__Purl__Group__3__Impl : ( ( rule__Purl__Alternatives_3 )? ) ;
    public final void rule__Purl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3314:1: ( ( ( rule__Purl__Alternatives_3 )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3315:1: ( ( rule__Purl__Alternatives_3 )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3315:1: ( ( rule__Purl__Alternatives_3 )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3316:1: ( rule__Purl__Alternatives_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPurlAccess().getAlternatives_3()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3317:1: ( rule__Purl__Alternatives_3 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( ((LA59_0>=26 && LA59_0<=27)) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3317:2: rule__Purl__Alternatives_3
                    {
                    pushFollow(FOLLOW_rule__Purl__Alternatives_3_in_rule__Purl__Group__3__Impl6809);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3327:1: rule__Purl__Group__4 : rule__Purl__Group__4__Impl rule__Purl__Group__5 ;
    public final void rule__Purl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3331:1: ( rule__Purl__Group__4__Impl rule__Purl__Group__5 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3332:2: rule__Purl__Group__4__Impl rule__Purl__Group__5
            {
            pushFollow(FOLLOW_rule__Purl__Group__4__Impl_in_rule__Purl__Group__46840);
            rule__Purl__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Purl__Group__5_in_rule__Purl__Group__46843);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3339:1: rule__Purl__Group__4__Impl : ( ( rule__Purl__UnorderedGroup_4 ) ) ;
    public final void rule__Purl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3343:1: ( ( ( rule__Purl__UnorderedGroup_4 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3344:1: ( ( rule__Purl__UnorderedGroup_4 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3344:1: ( ( rule__Purl__UnorderedGroup_4 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3345:1: ( rule__Purl__UnorderedGroup_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPurlAccess().getUnorderedGroup_4()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3346:1: ( rule__Purl__UnorderedGroup_4 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3346:2: rule__Purl__UnorderedGroup_4
            {
            pushFollow(FOLLOW_rule__Purl__UnorderedGroup_4_in_rule__Purl__Group__4__Impl6870);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3356:1: rule__Purl__Group__5 : rule__Purl__Group__5__Impl rule__Purl__Group__6 ;
    public final void rule__Purl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3360:1: ( rule__Purl__Group__5__Impl rule__Purl__Group__6 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3361:2: rule__Purl__Group__5__Impl rule__Purl__Group__6
            {
            pushFollow(FOLLOW_rule__Purl__Group__5__Impl_in_rule__Purl__Group__56900);
            rule__Purl__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Purl__Group__6_in_rule__Purl__Group__56903);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3368:1: rule__Purl__Group__5__Impl : ( ( rule__Purl__Group_5__0 )? ) ;
    public final void rule__Purl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3372:1: ( ( ( rule__Purl__Group_5__0 )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3373:1: ( ( rule__Purl__Group_5__0 )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3373:1: ( ( rule__Purl__Group_5__0 )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3374:1: ( rule__Purl__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPurlAccess().getGroup_5()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3375:1: ( rule__Purl__Group_5__0 )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==58) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3375:2: rule__Purl__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Purl__Group_5__0_in_rule__Purl__Group__5__Impl6930);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3385:1: rule__Purl__Group__6 : rule__Purl__Group__6__Impl ;
    public final void rule__Purl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3389:1: ( rule__Purl__Group__6__Impl )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3390:2: rule__Purl__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Purl__Group__6__Impl_in_rule__Purl__Group__66961);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3396:1: rule__Purl__Group__6__Impl : ( ( rule__Purl__Group_6__0 )? ) ;
    public final void rule__Purl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3400:1: ( ( ( rule__Purl__Group_6__0 )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3401:1: ( ( rule__Purl__Group_6__0 )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3401:1: ( ( rule__Purl__Group_6__0 )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3402:1: ( rule__Purl__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPurlAccess().getGroup_6()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3403:1: ( rule__Purl__Group_6__0 )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_INT||LA61_0==63||(LA61_0>=73 && LA61_0<=74)) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3403:2: rule__Purl__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Purl__Group_6__0_in_rule__Purl__Group__6__Impl6988);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3427:1: rule__Purl__Group_5__0 : rule__Purl__Group_5__0__Impl rule__Purl__Group_5__1 ;
    public final void rule__Purl__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3431:1: ( rule__Purl__Group_5__0__Impl rule__Purl__Group_5__1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3432:2: rule__Purl__Group_5__0__Impl rule__Purl__Group_5__1
            {
            pushFollow(FOLLOW_rule__Purl__Group_5__0__Impl_in_rule__Purl__Group_5__07033);
            rule__Purl__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Purl__Group_5__1_in_rule__Purl__Group_5__07036);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3439:1: rule__Purl__Group_5__0__Impl : ( 'with' ) ;
    public final void rule__Purl__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3443:1: ( ( 'with' ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3444:1: ( 'with' )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3444:1: ( 'with' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3445:1: 'with'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPurlAccess().getWithKeyword_5_0()); 
            }
            match(input,58,FOLLOW_58_in_rule__Purl__Group_5__0__Impl7064); if (state.failed) return ;
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3458:1: rule__Purl__Group_5__1 : rule__Purl__Group_5__1__Impl ;
    public final void rule__Purl__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3462:1: ( rule__Purl__Group_5__1__Impl )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3463:2: rule__Purl__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Purl__Group_5__1__Impl_in_rule__Purl__Group_5__17095);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3469:1: rule__Purl__Group_5__1__Impl : ( ( rule__Purl__YarnRefAssignment_5_1 ) ) ;
    public final void rule__Purl__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3473:1: ( ( ( rule__Purl__YarnRefAssignment_5_1 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3474:1: ( ( rule__Purl__YarnRefAssignment_5_1 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3474:1: ( ( rule__Purl__YarnRefAssignment_5_1 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3475:1: ( rule__Purl__YarnRefAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPurlAccess().getYarnRefAssignment_5_1()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3476:1: ( rule__Purl__YarnRefAssignment_5_1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3476:2: rule__Purl__YarnRefAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Purl__YarnRefAssignment_5_1_in_rule__Purl__Group_5__1__Impl7122);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3490:1: rule__Purl__Group_6__0 : rule__Purl__Group_6__0__Impl rule__Purl__Group_6__1 ;
    public final void rule__Purl__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3494:1: ( rule__Purl__Group_6__0__Impl rule__Purl__Group_6__1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3495:2: rule__Purl__Group_6__0__Impl rule__Purl__Group_6__1
            {
            pushFollow(FOLLOW_rule__Purl__Group_6__0__Impl_in_rule__Purl__Group_6__07156);
            rule__Purl__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Purl__Group_6__1_in_rule__Purl__Group_6__07159);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3502:1: rule__Purl__Group_6__0__Impl : ( ( 'to' )? ) ;
    public final void rule__Purl__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3506:1: ( ( ( 'to' )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3507:1: ( ( 'to' )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3507:1: ( ( 'to' )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3508:1: ( 'to' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPurlAccess().getToKeyword_6_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3509:1: ( 'to' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==63) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3510:2: 'to'
                    {
                    match(input,63,FOLLOW_63_in_rule__Purl__Group_6__0__Impl7188); if (state.failed) return ;

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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3521:1: rule__Purl__Group_6__1 : rule__Purl__Group_6__1__Impl ;
    public final void rule__Purl__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3525:1: ( rule__Purl__Group_6__1__Impl )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3526:2: rule__Purl__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Purl__Group_6__1__Impl_in_rule__Purl__Group_6__17221);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3532:1: rule__Purl__Group_6__1__Impl : ( ( rule__Purl__RepeatAssignment_6_1 ) ) ;
    public final void rule__Purl__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3536:1: ( ( ( rule__Purl__RepeatAssignment_6_1 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3537:1: ( ( rule__Purl__RepeatAssignment_6_1 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3537:1: ( ( rule__Purl__RepeatAssignment_6_1 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3538:1: ( rule__Purl__RepeatAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPurlAccess().getRepeatAssignment_6_1()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3539:1: ( rule__Purl__RepeatAssignment_6_1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3539:2: rule__Purl__RepeatAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Purl__RepeatAssignment_6_1_in_rule__Purl__Group_6__1__Impl7248);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3553:1: rule__Slip__Group__0 : rule__Slip__Group__0__Impl rule__Slip__Group__1 ;
    public final void rule__Slip__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3557:1: ( rule__Slip__Group__0__Impl rule__Slip__Group__1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3558:2: rule__Slip__Group__0__Impl rule__Slip__Group__1
            {
            pushFollow(FOLLOW_rule__Slip__Group__0__Impl_in_rule__Slip__Group__07282);
            rule__Slip__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Slip__Group__1_in_rule__Slip__Group__07285);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3565:1: rule__Slip__Group__0__Impl : ( () ) ;
    public final void rule__Slip__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3569:1: ( ( () ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3570:1: ( () )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3570:1: ( () )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3571:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSlipAccess().getSlipAction_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3572:1: ()
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3574:1: 
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3584:1: rule__Slip__Group__1 : rule__Slip__Group__1__Impl rule__Slip__Group__2 ;
    public final void rule__Slip__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3588:1: ( rule__Slip__Group__1__Impl rule__Slip__Group__2 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3589:2: rule__Slip__Group__1__Impl rule__Slip__Group__2
            {
            pushFollow(FOLLOW_rule__Slip__Group__1__Impl_in_rule__Slip__Group__17343);
            rule__Slip__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Slip__Group__2_in_rule__Slip__Group__17346);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3596:1: rule__Slip__Group__1__Impl : ( ( rule__Slip__ReverseAssignment_1 )? ) ;
    public final void rule__Slip__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3600:1: ( ( ( rule__Slip__ReverseAssignment_1 )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3601:1: ( ( rule__Slip__ReverseAssignment_1 )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3601:1: ( ( rule__Slip__ReverseAssignment_1 )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3602:1: ( rule__Slip__ReverseAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSlipAccess().getReverseAssignment_1()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3603:1: ( rule__Slip__ReverseAssignment_1 )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( ((LA63_0>=34 && LA63_0<=37)) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3603:2: rule__Slip__ReverseAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Slip__ReverseAssignment_1_in_rule__Slip__Group__1__Impl7373);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3613:1: rule__Slip__Group__2 : rule__Slip__Group__2__Impl rule__Slip__Group__3 ;
    public final void rule__Slip__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3617:1: ( rule__Slip__Group__2__Impl rule__Slip__Group__3 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3618:2: rule__Slip__Group__2__Impl rule__Slip__Group__3
            {
            pushFollow(FOLLOW_rule__Slip__Group__2__Impl_in_rule__Slip__Group__27404);
            rule__Slip__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Slip__Group__3_in_rule__Slip__Group__27407);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3625:1: rule__Slip__Group__2__Impl : ( ( rule__Slip__Alternatives_2 ) ) ;
    public final void rule__Slip__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3629:1: ( ( ( rule__Slip__Alternatives_2 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3630:1: ( ( rule__Slip__Alternatives_2 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3630:1: ( ( rule__Slip__Alternatives_2 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3631:1: ( rule__Slip__Alternatives_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSlipAccess().getAlternatives_2()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3632:1: ( rule__Slip__Alternatives_2 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3632:2: rule__Slip__Alternatives_2
            {
            pushFollow(FOLLOW_rule__Slip__Alternatives_2_in_rule__Slip__Group__2__Impl7434);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3642:1: rule__Slip__Group__3 : rule__Slip__Group__3__Impl rule__Slip__Group__4 ;
    public final void rule__Slip__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3646:1: ( rule__Slip__Group__3__Impl rule__Slip__Group__4 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3647:2: rule__Slip__Group__3__Impl rule__Slip__Group__4
            {
            pushFollow(FOLLOW_rule__Slip__Group__3__Impl_in_rule__Slip__Group__37464);
            rule__Slip__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Slip__Group__4_in_rule__Slip__Group__37467);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3654:1: rule__Slip__Group__3__Impl : ( ( rule__Slip__Alternatives_3 )? ) ;
    public final void rule__Slip__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3658:1: ( ( ( rule__Slip__Alternatives_3 )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3659:1: ( ( rule__Slip__Alternatives_3 )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3659:1: ( ( rule__Slip__Alternatives_3 )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3660:1: ( rule__Slip__Alternatives_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSlipAccess().getAlternatives_3()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3661:1: ( rule__Slip__Alternatives_3 )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==RULE_INT||LA64_0==42) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3661:2: rule__Slip__Alternatives_3
                    {
                    pushFollow(FOLLOW_rule__Slip__Alternatives_3_in_rule__Slip__Group__3__Impl7494);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3671:1: rule__Slip__Group__4 : rule__Slip__Group__4__Impl rule__Slip__Group__5 ;
    public final void rule__Slip__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3675:1: ( rule__Slip__Group__4__Impl rule__Slip__Group__5 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3676:2: rule__Slip__Group__4__Impl rule__Slip__Group__5
            {
            pushFollow(FOLLOW_rule__Slip__Group__4__Impl_in_rule__Slip__Group__47525);
            rule__Slip__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Slip__Group__5_in_rule__Slip__Group__47528);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3683:1: rule__Slip__Group__4__Impl : ( ( rule__Slip__Alternatives_4 )? ) ;
    public final void rule__Slip__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3687:1: ( ( ( rule__Slip__Alternatives_4 )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3688:1: ( ( rule__Slip__Alternatives_4 )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3688:1: ( ( rule__Slip__Alternatives_4 )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3689:1: ( rule__Slip__Alternatives_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSlipAccess().getAlternatives_4()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3690:1: ( rule__Slip__Alternatives_4 )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( ((LA65_0>=43 && LA65_0<=46)) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3690:2: rule__Slip__Alternatives_4
                    {
                    pushFollow(FOLLOW_rule__Slip__Alternatives_4_in_rule__Slip__Group__4__Impl7555);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3700:1: rule__Slip__Group__5 : rule__Slip__Group__5__Impl ;
    public final void rule__Slip__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3704:1: ( rule__Slip__Group__5__Impl )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3705:2: rule__Slip__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Slip__Group__5__Impl_in_rule__Slip__Group__57586);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3711:1: rule__Slip__Group__5__Impl : ( ( rule__Slip__YarnPositionAssignment_5 )? ) ;
    public final void rule__Slip__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3715:1: ( ( ( rule__Slip__YarnPositionAssignment_5 )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3716:1: ( ( rule__Slip__YarnPositionAssignment_5 )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3716:1: ( ( rule__Slip__YarnPositionAssignment_5 )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3717:1: ( rule__Slip__YarnPositionAssignment_5 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSlipAccess().getYarnPositionAssignment_5()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3718:1: ( rule__Slip__YarnPositionAssignment_5 )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( ((LA66_0>=47 && LA66_0<=48)) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3718:2: rule__Slip__YarnPositionAssignment_5
                    {
                    pushFollow(FOLLOW_rule__Slip__YarnPositionAssignment_5_in_rule__Slip__Group__5__Impl7613);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3740:1: rule__Slip__Group_3_0__0 : rule__Slip__Group_3_0__0__Impl rule__Slip__Group_3_0__1 ;
    public final void rule__Slip__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3744:1: ( rule__Slip__Group_3_0__0__Impl rule__Slip__Group_3_0__1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3745:2: rule__Slip__Group_3_0__0__Impl rule__Slip__Group_3_0__1
            {
            pushFollow(FOLLOW_rule__Slip__Group_3_0__0__Impl_in_rule__Slip__Group_3_0__07656);
            rule__Slip__Group_3_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Slip__Group_3_0__1_in_rule__Slip__Group_3_0__07659);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3752:1: rule__Slip__Group_3_0__0__Impl : ( ( rule__Slip__NumberAssignment_3_0_0 ) ) ;
    public final void rule__Slip__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3756:1: ( ( ( rule__Slip__NumberAssignment_3_0_0 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3757:1: ( ( rule__Slip__NumberAssignment_3_0_0 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3757:1: ( ( rule__Slip__NumberAssignment_3_0_0 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3758:1: ( rule__Slip__NumberAssignment_3_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSlipAccess().getNumberAssignment_3_0_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3759:1: ( rule__Slip__NumberAssignment_3_0_0 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3759:2: rule__Slip__NumberAssignment_3_0_0
            {
            pushFollow(FOLLOW_rule__Slip__NumberAssignment_3_0_0_in_rule__Slip__Group_3_0__0__Impl7686);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3769:1: rule__Slip__Group_3_0__1 : rule__Slip__Group_3_0__1__Impl ;
    public final void rule__Slip__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3773:1: ( rule__Slip__Group_3_0__1__Impl )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3774:2: rule__Slip__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Slip__Group_3_0__1__Impl_in_rule__Slip__Group_3_0__17716);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3780:1: rule__Slip__Group_3_0__1__Impl : ( ( rule__Slip__Alternatives_3_0_1 )? ) ;
    public final void rule__Slip__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3784:1: ( ( ( rule__Slip__Alternatives_3_0_1 )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3785:1: ( ( rule__Slip__Alternatives_3_0_1 )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3785:1: ( ( rule__Slip__Alternatives_3_0_1 )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3786:1: ( rule__Slip__Alternatives_3_0_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSlipAccess().getAlternatives_3_0_1()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3787:1: ( rule__Slip__Alternatives_3_0_1 )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( ((LA67_0>=26 && LA67_0<=27)) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3787:2: rule__Slip__Alternatives_3_0_1
                    {
                    pushFollow(FOLLOW_rule__Slip__Alternatives_3_0_1_in_rule__Slip__Group_3_0__1__Impl7743);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3801:1: rule__RepeatSpec__Group_2__0 : rule__RepeatSpec__Group_2__0__Impl rule__RepeatSpec__Group_2__1 ;
    public final void rule__RepeatSpec__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3805:1: ( rule__RepeatSpec__Group_2__0__Impl rule__RepeatSpec__Group_2__1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3806:2: rule__RepeatSpec__Group_2__0__Impl rule__RepeatSpec__Group_2__1
            {
            pushFollow(FOLLOW_rule__RepeatSpec__Group_2__0__Impl_in_rule__RepeatSpec__Group_2__07778);
            rule__RepeatSpec__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RepeatSpec__Group_2__1_in_rule__RepeatSpec__Group_2__07781);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3813:1: rule__RepeatSpec__Group_2__0__Impl : ( ( rule__RepeatSpec__ValueAssignment_2_0 ) ) ;
    public final void rule__RepeatSpec__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3817:1: ( ( ( rule__RepeatSpec__ValueAssignment_2_0 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3818:1: ( ( rule__RepeatSpec__ValueAssignment_2_0 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3818:1: ( ( rule__RepeatSpec__ValueAssignment_2_0 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3819:1: ( rule__RepeatSpec__ValueAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatSpecAccess().getValueAssignment_2_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3820:1: ( rule__RepeatSpec__ValueAssignment_2_0 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3820:2: rule__RepeatSpec__ValueAssignment_2_0
            {
            pushFollow(FOLLOW_rule__RepeatSpec__ValueAssignment_2_0_in_rule__RepeatSpec__Group_2__0__Impl7808);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3830:1: rule__RepeatSpec__Group_2__1 : rule__RepeatSpec__Group_2__1__Impl rule__RepeatSpec__Group_2__2 ;
    public final void rule__RepeatSpec__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3834:1: ( rule__RepeatSpec__Group_2__1__Impl rule__RepeatSpec__Group_2__2 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3835:2: rule__RepeatSpec__Group_2__1__Impl rule__RepeatSpec__Group_2__2
            {
            pushFollow(FOLLOW_rule__RepeatSpec__Group_2__1__Impl_in_rule__RepeatSpec__Group_2__17838);
            rule__RepeatSpec__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RepeatSpec__Group_2__2_in_rule__RepeatSpec__Group_2__17841);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3842:1: rule__RepeatSpec__Group_2__1__Impl : ( ( rule__RepeatSpec__Alternatives_2_1 )? ) ;
    public final void rule__RepeatSpec__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3846:1: ( ( ( rule__RepeatSpec__Alternatives_2_1 )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3847:1: ( ( rule__RepeatSpec__Alternatives_2_1 )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3847:1: ( ( rule__RepeatSpec__Alternatives_2_1 )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3848:1: ( rule__RepeatSpec__Alternatives_2_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatSpecAccess().getAlternatives_2_1()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3849:1: ( rule__RepeatSpec__Alternatives_2_1 )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( ((LA68_0>=26 && LA68_0<=27)) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3849:2: rule__RepeatSpec__Alternatives_2_1
                    {
                    pushFollow(FOLLOW_rule__RepeatSpec__Alternatives_2_1_in_rule__RepeatSpec__Group_2__1__Impl7868);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3859:1: rule__RepeatSpec__Group_2__2 : rule__RepeatSpec__Group_2__2__Impl ;
    public final void rule__RepeatSpec__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3863:1: ( rule__RepeatSpec__Group_2__2__Impl )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3864:2: rule__RepeatSpec__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__RepeatSpec__Group_2__2__Impl_in_rule__RepeatSpec__Group_2__27899);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3870:1: rule__RepeatSpec__Group_2__2__Impl : ( ( rule__RepeatSpec__BeforeEndAssignment_2_2 ) ) ;
    public final void rule__RepeatSpec__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3874:1: ( ( ( rule__RepeatSpec__BeforeEndAssignment_2_2 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3875:1: ( ( rule__RepeatSpec__BeforeEndAssignment_2_2 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3875:1: ( ( rule__RepeatSpec__BeforeEndAssignment_2_2 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3876:1: ( rule__RepeatSpec__BeforeEndAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatSpecAccess().getBeforeEndAssignment_2_2()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3877:1: ( rule__RepeatSpec__BeforeEndAssignment_2_2 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3877:2: rule__RepeatSpec__BeforeEndAssignment_2_2
            {
            pushFollow(FOLLOW_rule__RepeatSpec__BeforeEndAssignment_2_2_in_rule__RepeatSpec__Group_2__2__Impl7926);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3893:1: rule__RepeatSpec__Group_3__0 : rule__RepeatSpec__Group_3__0__Impl rule__RepeatSpec__Group_3__1 ;
    public final void rule__RepeatSpec__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3897:1: ( rule__RepeatSpec__Group_3__0__Impl rule__RepeatSpec__Group_3__1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3898:2: rule__RepeatSpec__Group_3__0__Impl rule__RepeatSpec__Group_3__1
            {
            pushFollow(FOLLOW_rule__RepeatSpec__Group_3__0__Impl_in_rule__RepeatSpec__Group_3__07962);
            rule__RepeatSpec__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RepeatSpec__Group_3__1_in_rule__RepeatSpec__Group_3__07965);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3905:1: rule__RepeatSpec__Group_3__0__Impl : ( ( rule__RepeatSpec__ValueAssignment_3_0 ) ) ;
    public final void rule__RepeatSpec__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3909:1: ( ( ( rule__RepeatSpec__ValueAssignment_3_0 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3910:1: ( ( rule__RepeatSpec__ValueAssignment_3_0 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3910:1: ( ( rule__RepeatSpec__ValueAssignment_3_0 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3911:1: ( rule__RepeatSpec__ValueAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatSpecAccess().getValueAssignment_3_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3912:1: ( rule__RepeatSpec__ValueAssignment_3_0 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3912:2: rule__RepeatSpec__ValueAssignment_3_0
            {
            pushFollow(FOLLOW_rule__RepeatSpec__ValueAssignment_3_0_in_rule__RepeatSpec__Group_3__0__Impl7992);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3922:1: rule__RepeatSpec__Group_3__1 : rule__RepeatSpec__Group_3__1__Impl rule__RepeatSpec__Group_3__2 ;
    public final void rule__RepeatSpec__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3926:1: ( rule__RepeatSpec__Group_3__1__Impl rule__RepeatSpec__Group_3__2 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3927:2: rule__RepeatSpec__Group_3__1__Impl rule__RepeatSpec__Group_3__2
            {
            pushFollow(FOLLOW_rule__RepeatSpec__Group_3__1__Impl_in_rule__RepeatSpec__Group_3__18022);
            rule__RepeatSpec__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RepeatSpec__Group_3__2_in_rule__RepeatSpec__Group_3__18025);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3934:1: rule__RepeatSpec__Group_3__1__Impl : ( ( rule__RepeatSpec__Alternatives_3_1 )? ) ;
    public final void rule__RepeatSpec__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3938:1: ( ( ( rule__RepeatSpec__Alternatives_3_1 )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3939:1: ( ( rule__RepeatSpec__Alternatives_3_1 )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3939:1: ( ( rule__RepeatSpec__Alternatives_3_1 )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3940:1: ( rule__RepeatSpec__Alternatives_3_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatSpecAccess().getAlternatives_3_1()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3941:1: ( rule__RepeatSpec__Alternatives_3_1 )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( ((LA69_0>=26 && LA69_0<=27)) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3941:2: rule__RepeatSpec__Alternatives_3_1
                    {
                    pushFollow(FOLLOW_rule__RepeatSpec__Alternatives_3_1_in_rule__RepeatSpec__Group_3__1__Impl8052);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3951:1: rule__RepeatSpec__Group_3__2 : rule__RepeatSpec__Group_3__2__Impl ;
    public final void rule__RepeatSpec__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3955:1: ( rule__RepeatSpec__Group_3__2__Impl )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3956:2: rule__RepeatSpec__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__RepeatSpec__Group_3__2__Impl_in_rule__RepeatSpec__Group_3__28083);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3962:1: rule__RepeatSpec__Group_3__2__Impl : ( ( rule__RepeatSpec__BeforeGapAssignment_3_2 ) ) ;
    public final void rule__RepeatSpec__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3966:1: ( ( ( rule__RepeatSpec__BeforeGapAssignment_3_2 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3967:1: ( ( rule__RepeatSpec__BeforeGapAssignment_3_2 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3967:1: ( ( rule__RepeatSpec__BeforeGapAssignment_3_2 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3968:1: ( rule__RepeatSpec__BeforeGapAssignment_3_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatSpecAccess().getBeforeGapAssignment_3_2()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3969:1: ( rule__RepeatSpec__BeforeGapAssignment_3_2 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3969:2: rule__RepeatSpec__BeforeGapAssignment_3_2
            {
            pushFollow(FOLLOW_rule__RepeatSpec__BeforeGapAssignment_3_2_in_rule__RepeatSpec__Group_3__2__Impl8110);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3985:1: rule__RepeatSpec__Group_4__0 : rule__RepeatSpec__Group_4__0__Impl rule__RepeatSpec__Group_4__1 ;
    public final void rule__RepeatSpec__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3989:1: ( rule__RepeatSpec__Group_4__0__Impl rule__RepeatSpec__Group_4__1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3990:2: rule__RepeatSpec__Group_4__0__Impl rule__RepeatSpec__Group_4__1
            {
            pushFollow(FOLLOW_rule__RepeatSpec__Group_4__0__Impl_in_rule__RepeatSpec__Group_4__08146);
            rule__RepeatSpec__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RepeatSpec__Group_4__1_in_rule__RepeatSpec__Group_4__08149);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:3997:1: rule__RepeatSpec__Group_4__0__Impl : ( ( rule__RepeatSpec__ValueAssignment_4_0 ) ) ;
    public final void rule__RepeatSpec__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4001:1: ( ( ( rule__RepeatSpec__ValueAssignment_4_0 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4002:1: ( ( rule__RepeatSpec__ValueAssignment_4_0 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4002:1: ( ( rule__RepeatSpec__ValueAssignment_4_0 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4003:1: ( rule__RepeatSpec__ValueAssignment_4_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatSpecAccess().getValueAssignment_4_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4004:1: ( rule__RepeatSpec__ValueAssignment_4_0 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4004:2: rule__RepeatSpec__ValueAssignment_4_0
            {
            pushFollow(FOLLOW_rule__RepeatSpec__ValueAssignment_4_0_in_rule__RepeatSpec__Group_4__0__Impl8176);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4014:1: rule__RepeatSpec__Group_4__1 : rule__RepeatSpec__Group_4__1__Impl rule__RepeatSpec__Group_4__2 ;
    public final void rule__RepeatSpec__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4018:1: ( rule__RepeatSpec__Group_4__1__Impl rule__RepeatSpec__Group_4__2 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4019:2: rule__RepeatSpec__Group_4__1__Impl rule__RepeatSpec__Group_4__2
            {
            pushFollow(FOLLOW_rule__RepeatSpec__Group_4__1__Impl_in_rule__RepeatSpec__Group_4__18206);
            rule__RepeatSpec__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RepeatSpec__Group_4__2_in_rule__RepeatSpec__Group_4__18209);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4026:1: rule__RepeatSpec__Group_4__1__Impl : ( ( rule__RepeatSpec__Alternatives_4_1 )? ) ;
    public final void rule__RepeatSpec__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4030:1: ( ( ( rule__RepeatSpec__Alternatives_4_1 )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4031:1: ( ( rule__RepeatSpec__Alternatives_4_1 )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4031:1: ( ( rule__RepeatSpec__Alternatives_4_1 )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4032:1: ( rule__RepeatSpec__Alternatives_4_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatSpecAccess().getAlternatives_4_1()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4033:1: ( rule__RepeatSpec__Alternatives_4_1 )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( ((LA70_0>=26 && LA70_0<=27)) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4033:2: rule__RepeatSpec__Alternatives_4_1
                    {
                    pushFollow(FOLLOW_rule__RepeatSpec__Alternatives_4_1_in_rule__RepeatSpec__Group_4__1__Impl8236);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4043:1: rule__RepeatSpec__Group_4__2 : rule__RepeatSpec__Group_4__2__Impl ;
    public final void rule__RepeatSpec__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4047:1: ( rule__RepeatSpec__Group_4__2__Impl )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4048:2: rule__RepeatSpec__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__RepeatSpec__Group_4__2__Impl_in_rule__RepeatSpec__Group_4__28267);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4054:1: rule__RepeatSpec__Group_4__2__Impl : ( ( rule__RepeatSpec__BeforeMarkerAssignment_4_2 ) ) ;
    public final void rule__RepeatSpec__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4058:1: ( ( ( rule__RepeatSpec__BeforeMarkerAssignment_4_2 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4059:1: ( ( rule__RepeatSpec__BeforeMarkerAssignment_4_2 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4059:1: ( ( rule__RepeatSpec__BeforeMarkerAssignment_4_2 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4060:1: ( rule__RepeatSpec__BeforeMarkerAssignment_4_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatSpecAccess().getBeforeMarkerAssignment_4_2()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4061:1: ( rule__RepeatSpec__BeforeMarkerAssignment_4_2 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4061:2: rule__RepeatSpec__BeforeMarkerAssignment_4_2
            {
            pushFollow(FOLLOW_rule__RepeatSpec__BeforeMarkerAssignment_4_2_in_rule__RepeatSpec__Group_4__2__Impl8294);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4077:1: rule__RepeatSpec__Group_5__0 : rule__RepeatSpec__Group_5__0__Impl rule__RepeatSpec__Group_5__1 ;
    public final void rule__RepeatSpec__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4081:1: ( rule__RepeatSpec__Group_5__0__Impl rule__RepeatSpec__Group_5__1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4082:2: rule__RepeatSpec__Group_5__0__Impl rule__RepeatSpec__Group_5__1
            {
            pushFollow(FOLLOW_rule__RepeatSpec__Group_5__0__Impl_in_rule__RepeatSpec__Group_5__08330);
            rule__RepeatSpec__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RepeatSpec__Group_5__1_in_rule__RepeatSpec__Group_5__08333);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4089:1: rule__RepeatSpec__Group_5__0__Impl : ( ( rule__RepeatSpec__ValueAssignment_5_0 ) ) ;
    public final void rule__RepeatSpec__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4093:1: ( ( ( rule__RepeatSpec__ValueAssignment_5_0 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4094:1: ( ( rule__RepeatSpec__ValueAssignment_5_0 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4094:1: ( ( rule__RepeatSpec__ValueAssignment_5_0 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4095:1: ( rule__RepeatSpec__ValueAssignment_5_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatSpecAccess().getValueAssignment_5_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4096:1: ( rule__RepeatSpec__ValueAssignment_5_0 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4096:2: rule__RepeatSpec__ValueAssignment_5_0
            {
            pushFollow(FOLLOW_rule__RepeatSpec__ValueAssignment_5_0_in_rule__RepeatSpec__Group_5__0__Impl8360);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4106:1: rule__RepeatSpec__Group_5__1 : rule__RepeatSpec__Group_5__1__Impl ;
    public final void rule__RepeatSpec__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4110:1: ( rule__RepeatSpec__Group_5__1__Impl )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4111:2: rule__RepeatSpec__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__RepeatSpec__Group_5__1__Impl_in_rule__RepeatSpec__Group_5__18390);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4117:1: rule__RepeatSpec__Group_5__1__Impl : ( ( rule__RepeatSpec__TimesAssignment_5_1 ) ) ;
    public final void rule__RepeatSpec__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4121:1: ( ( ( rule__RepeatSpec__TimesAssignment_5_1 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4122:1: ( ( rule__RepeatSpec__TimesAssignment_5_1 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4122:1: ( ( rule__RepeatSpec__TimesAssignment_5_1 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4123:1: ( rule__RepeatSpec__TimesAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatSpecAccess().getTimesAssignment_5_1()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4124:1: ( rule__RepeatSpec__TimesAssignment_5_1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4124:2: rule__RepeatSpec__TimesAssignment_5_1
            {
            pushFollow(FOLLOW_rule__RepeatSpec__TimesAssignment_5_1_in_rule__RepeatSpec__Group_5__1__Impl8417);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4138:1: rule__Repeat__Group_0__0 : rule__Repeat__Group_0__0__Impl rule__Repeat__Group_0__1 ;
    public final void rule__Repeat__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4142:1: ( rule__Repeat__Group_0__0__Impl rule__Repeat__Group_0__1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4143:2: rule__Repeat__Group_0__0__Impl rule__Repeat__Group_0__1
            {
            pushFollow(FOLLOW_rule__Repeat__Group_0__0__Impl_in_rule__Repeat__Group_0__08451);
            rule__Repeat__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Repeat__Group_0__1_in_rule__Repeat__Group_0__08454);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4150:1: rule__Repeat__Group_0__0__Impl : ( ( rule__Repeat__Alternatives_0_0 ) ) ;
    public final void rule__Repeat__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4154:1: ( ( ( rule__Repeat__Alternatives_0_0 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4155:1: ( ( rule__Repeat__Alternatives_0_0 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4155:1: ( ( rule__Repeat__Alternatives_0_0 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4156:1: ( rule__Repeat__Alternatives_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatAccess().getAlternatives_0_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4157:1: ( rule__Repeat__Alternatives_0_0 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4157:2: rule__Repeat__Alternatives_0_0
            {
            pushFollow(FOLLOW_rule__Repeat__Alternatives_0_0_in_rule__Repeat__Group_0__0__Impl8481);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4167:1: rule__Repeat__Group_0__1 : rule__Repeat__Group_0__1__Impl rule__Repeat__Group_0__2 ;
    public final void rule__Repeat__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4171:1: ( rule__Repeat__Group_0__1__Impl rule__Repeat__Group_0__2 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4172:2: rule__Repeat__Group_0__1__Impl rule__Repeat__Group_0__2
            {
            pushFollow(FOLLOW_rule__Repeat__Group_0__1__Impl_in_rule__Repeat__Group_0__18511);
            rule__Repeat__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Repeat__Group_0__2_in_rule__Repeat__Group_0__18514);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4179:1: rule__Repeat__Group_0__1__Impl : ( '[' ) ;
    public final void rule__Repeat__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4183:1: ( ( '[' ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4184:1: ( '[' )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4184:1: ( '[' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4185:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatAccess().getLeftSquareBracketKeyword_0_1()); 
            }
            match(input,64,FOLLOW_64_in_rule__Repeat__Group_0__1__Impl8542); if (state.failed) return ;
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4198:1: rule__Repeat__Group_0__2 : rule__Repeat__Group_0__2__Impl rule__Repeat__Group_0__3 ;
    public final void rule__Repeat__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4202:1: ( rule__Repeat__Group_0__2__Impl rule__Repeat__Group_0__3 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4203:2: rule__Repeat__Group_0__2__Impl rule__Repeat__Group_0__3
            {
            pushFollow(FOLLOW_rule__Repeat__Group_0__2__Impl_in_rule__Repeat__Group_0__28573);
            rule__Repeat__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Repeat__Group_0__3_in_rule__Repeat__Group_0__28576);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4210:1: rule__Repeat__Group_0__2__Impl : ( ( rule__Repeat__OperationsAssignment_0_2 ) ) ;
    public final void rule__Repeat__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4214:1: ( ( ( rule__Repeat__OperationsAssignment_0_2 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4215:1: ( ( rule__Repeat__OperationsAssignment_0_2 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4215:1: ( ( rule__Repeat__OperationsAssignment_0_2 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4216:1: ( rule__Repeat__OperationsAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatAccess().getOperationsAssignment_0_2()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4217:1: ( rule__Repeat__OperationsAssignment_0_2 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4217:2: rule__Repeat__OperationsAssignment_0_2
            {
            pushFollow(FOLLOW_rule__Repeat__OperationsAssignment_0_2_in_rule__Repeat__Group_0__2__Impl8603);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4227:1: rule__Repeat__Group_0__3 : rule__Repeat__Group_0__3__Impl rule__Repeat__Group_0__4 ;
    public final void rule__Repeat__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4231:1: ( rule__Repeat__Group_0__3__Impl rule__Repeat__Group_0__4 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4232:2: rule__Repeat__Group_0__3__Impl rule__Repeat__Group_0__4
            {
            pushFollow(FOLLOW_rule__Repeat__Group_0__3__Impl_in_rule__Repeat__Group_0__38633);
            rule__Repeat__Group_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Repeat__Group_0__4_in_rule__Repeat__Group_0__38636);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4239:1: rule__Repeat__Group_0__3__Impl : ( ( rule__Repeat__Group_0_3__0 )* ) ;
    public final void rule__Repeat__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4243:1: ( ( ( rule__Repeat__Group_0_3__0 )* ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4244:1: ( ( rule__Repeat__Group_0_3__0 )* )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4244:1: ( ( rule__Repeat__Group_0_3__0 )* )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4245:1: ( rule__Repeat__Group_0_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatAccess().getGroup_0_3()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4246:1: ( rule__Repeat__Group_0_3__0 )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==55) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4246:2: rule__Repeat__Group_0_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Repeat__Group_0_3__0_in_rule__Repeat__Group_0__3__Impl8663);
            	    rule__Repeat__Group_0_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop71;
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4256:1: rule__Repeat__Group_0__4 : rule__Repeat__Group_0__4__Impl rule__Repeat__Group_0__5 ;
    public final void rule__Repeat__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4260:1: ( rule__Repeat__Group_0__4__Impl rule__Repeat__Group_0__5 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4261:2: rule__Repeat__Group_0__4__Impl rule__Repeat__Group_0__5
            {
            pushFollow(FOLLOW_rule__Repeat__Group_0__4__Impl_in_rule__Repeat__Group_0__48694);
            rule__Repeat__Group_0__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Repeat__Group_0__5_in_rule__Repeat__Group_0__48697);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4268:1: rule__Repeat__Group_0__4__Impl : ( ']' ) ;
    public final void rule__Repeat__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4272:1: ( ( ']' ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4273:1: ( ']' )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4273:1: ( ']' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4274:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatAccess().getRightSquareBracketKeyword_0_4()); 
            }
            match(input,65,FOLLOW_65_in_rule__Repeat__Group_0__4__Impl8725); if (state.failed) return ;
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4287:1: rule__Repeat__Group_0__5 : rule__Repeat__Group_0__5__Impl rule__Repeat__Group_0__6 ;
    public final void rule__Repeat__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4291:1: ( rule__Repeat__Group_0__5__Impl rule__Repeat__Group_0__6 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4292:2: rule__Repeat__Group_0__5__Impl rule__Repeat__Group_0__6
            {
            pushFollow(FOLLOW_rule__Repeat__Group_0__5__Impl_in_rule__Repeat__Group_0__58756);
            rule__Repeat__Group_0__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Repeat__Group_0__6_in_rule__Repeat__Group_0__58759);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4299:1: rule__Repeat__Group_0__5__Impl : ( ( 'to' )? ) ;
    public final void rule__Repeat__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4303:1: ( ( ( 'to' )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4304:1: ( ( 'to' )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4304:1: ( ( 'to' )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4305:1: ( 'to' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatAccess().getToKeyword_0_5()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4306:1: ( 'to' )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==63) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4307:2: 'to'
                    {
                    match(input,63,FOLLOW_63_in_rule__Repeat__Group_0__5__Impl8788); if (state.failed) return ;

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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4318:1: rule__Repeat__Group_0__6 : rule__Repeat__Group_0__6__Impl ;
    public final void rule__Repeat__Group_0__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4322:1: ( rule__Repeat__Group_0__6__Impl )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4323:2: rule__Repeat__Group_0__6__Impl
            {
            pushFollow(FOLLOW_rule__Repeat__Group_0__6__Impl_in_rule__Repeat__Group_0__68821);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4329:1: rule__Repeat__Group_0__6__Impl : ( ( rule__Repeat__SpecAssignment_0_6 ) ) ;
    public final void rule__Repeat__Group_0__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4333:1: ( ( ( rule__Repeat__SpecAssignment_0_6 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4334:1: ( ( rule__Repeat__SpecAssignment_0_6 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4334:1: ( ( rule__Repeat__SpecAssignment_0_6 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4335:1: ( rule__Repeat__SpecAssignment_0_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatAccess().getSpecAssignment_0_6()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4336:1: ( rule__Repeat__SpecAssignment_0_6 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4336:2: rule__Repeat__SpecAssignment_0_6
            {
            pushFollow(FOLLOW_rule__Repeat__SpecAssignment_0_6_in_rule__Repeat__Group_0__6__Impl8848);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4360:1: rule__Repeat__Group_0_3__0 : rule__Repeat__Group_0_3__0__Impl rule__Repeat__Group_0_3__1 ;
    public final void rule__Repeat__Group_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4364:1: ( rule__Repeat__Group_0_3__0__Impl rule__Repeat__Group_0_3__1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4365:2: rule__Repeat__Group_0_3__0__Impl rule__Repeat__Group_0_3__1
            {
            pushFollow(FOLLOW_rule__Repeat__Group_0_3__0__Impl_in_rule__Repeat__Group_0_3__08892);
            rule__Repeat__Group_0_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Repeat__Group_0_3__1_in_rule__Repeat__Group_0_3__08895);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4372:1: rule__Repeat__Group_0_3__0__Impl : ( ',' ) ;
    public final void rule__Repeat__Group_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4376:1: ( ( ',' ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4377:1: ( ',' )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4377:1: ( ',' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4378:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatAccess().getCommaKeyword_0_3_0()); 
            }
            match(input,55,FOLLOW_55_in_rule__Repeat__Group_0_3__0__Impl8923); if (state.failed) return ;
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4391:1: rule__Repeat__Group_0_3__1 : rule__Repeat__Group_0_3__1__Impl ;
    public final void rule__Repeat__Group_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4395:1: ( rule__Repeat__Group_0_3__1__Impl )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4396:2: rule__Repeat__Group_0_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Repeat__Group_0_3__1__Impl_in_rule__Repeat__Group_0_3__18954);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4402:1: rule__Repeat__Group_0_3__1__Impl : ( ( rule__Repeat__OperationsAssignment_0_3_1 ) ) ;
    public final void rule__Repeat__Group_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4406:1: ( ( ( rule__Repeat__OperationsAssignment_0_3_1 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4407:1: ( ( rule__Repeat__OperationsAssignment_0_3_1 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4407:1: ( ( rule__Repeat__OperationsAssignment_0_3_1 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4408:1: ( rule__Repeat__OperationsAssignment_0_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatAccess().getOperationsAssignment_0_3_1()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4409:1: ( rule__Repeat__OperationsAssignment_0_3_1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4409:2: rule__Repeat__OperationsAssignment_0_3_1
            {
            pushFollow(FOLLOW_rule__Repeat__OperationsAssignment_0_3_1_in_rule__Repeat__Group_0_3__1__Impl8981);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4423:1: rule__Repeat__Group_1__0 : rule__Repeat__Group_1__0__Impl rule__Repeat__Group_1__1 ;
    public final void rule__Repeat__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4427:1: ( rule__Repeat__Group_1__0__Impl rule__Repeat__Group_1__1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4428:2: rule__Repeat__Group_1__0__Impl rule__Repeat__Group_1__1
            {
            pushFollow(FOLLOW_rule__Repeat__Group_1__0__Impl_in_rule__Repeat__Group_1__09015);
            rule__Repeat__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Repeat__Group_1__1_in_rule__Repeat__Group_1__09018);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4435:1: rule__Repeat__Group_1__0__Impl : ( '[' ) ;
    public final void rule__Repeat__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4439:1: ( ( '[' ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4440:1: ( '[' )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4440:1: ( '[' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4441:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatAccess().getLeftSquareBracketKeyword_1_0()); 
            }
            match(input,64,FOLLOW_64_in_rule__Repeat__Group_1__0__Impl9046); if (state.failed) return ;
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4454:1: rule__Repeat__Group_1__1 : rule__Repeat__Group_1__1__Impl rule__Repeat__Group_1__2 ;
    public final void rule__Repeat__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4458:1: ( rule__Repeat__Group_1__1__Impl rule__Repeat__Group_1__2 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4459:2: rule__Repeat__Group_1__1__Impl rule__Repeat__Group_1__2
            {
            pushFollow(FOLLOW_rule__Repeat__Group_1__1__Impl_in_rule__Repeat__Group_1__19077);
            rule__Repeat__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Repeat__Group_1__2_in_rule__Repeat__Group_1__19080);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4466:1: rule__Repeat__Group_1__1__Impl : ( ( rule__Repeat__OperationsAssignment_1_1 ) ) ;
    public final void rule__Repeat__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4470:1: ( ( ( rule__Repeat__OperationsAssignment_1_1 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4471:1: ( ( rule__Repeat__OperationsAssignment_1_1 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4471:1: ( ( rule__Repeat__OperationsAssignment_1_1 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4472:1: ( rule__Repeat__OperationsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatAccess().getOperationsAssignment_1_1()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4473:1: ( rule__Repeat__OperationsAssignment_1_1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4473:2: rule__Repeat__OperationsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Repeat__OperationsAssignment_1_1_in_rule__Repeat__Group_1__1__Impl9107);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4483:1: rule__Repeat__Group_1__2 : rule__Repeat__Group_1__2__Impl rule__Repeat__Group_1__3 ;
    public final void rule__Repeat__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4487:1: ( rule__Repeat__Group_1__2__Impl rule__Repeat__Group_1__3 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4488:2: rule__Repeat__Group_1__2__Impl rule__Repeat__Group_1__3
            {
            pushFollow(FOLLOW_rule__Repeat__Group_1__2__Impl_in_rule__Repeat__Group_1__29137);
            rule__Repeat__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Repeat__Group_1__3_in_rule__Repeat__Group_1__29140);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4495:1: rule__Repeat__Group_1__2__Impl : ( ( rule__Repeat__Group_1_2__0 )* ) ;
    public final void rule__Repeat__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4499:1: ( ( ( rule__Repeat__Group_1_2__0 )* ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4500:1: ( ( rule__Repeat__Group_1_2__0 )* )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4500:1: ( ( rule__Repeat__Group_1_2__0 )* )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4501:1: ( rule__Repeat__Group_1_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatAccess().getGroup_1_2()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4502:1: ( rule__Repeat__Group_1_2__0 )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==55) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4502:2: rule__Repeat__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Repeat__Group_1_2__0_in_rule__Repeat__Group_1__2__Impl9167);
            	    rule__Repeat__Group_1_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop73;
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4512:1: rule__Repeat__Group_1__3 : rule__Repeat__Group_1__3__Impl rule__Repeat__Group_1__4 ;
    public final void rule__Repeat__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4516:1: ( rule__Repeat__Group_1__3__Impl rule__Repeat__Group_1__4 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4517:2: rule__Repeat__Group_1__3__Impl rule__Repeat__Group_1__4
            {
            pushFollow(FOLLOW_rule__Repeat__Group_1__3__Impl_in_rule__Repeat__Group_1__39198);
            rule__Repeat__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Repeat__Group_1__4_in_rule__Repeat__Group_1__39201);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4524:1: rule__Repeat__Group_1__3__Impl : ( ']' ) ;
    public final void rule__Repeat__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4528:1: ( ( ']' ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4529:1: ( ']' )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4529:1: ( ']' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4530:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatAccess().getRightSquareBracketKeyword_1_3()); 
            }
            match(input,65,FOLLOW_65_in_rule__Repeat__Group_1__3__Impl9229); if (state.failed) return ;
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4543:1: rule__Repeat__Group_1__4 : rule__Repeat__Group_1__4__Impl rule__Repeat__Group_1__5 ;
    public final void rule__Repeat__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4547:1: ( rule__Repeat__Group_1__4__Impl rule__Repeat__Group_1__5 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4548:2: rule__Repeat__Group_1__4__Impl rule__Repeat__Group_1__5
            {
            pushFollow(FOLLOW_rule__Repeat__Group_1__4__Impl_in_rule__Repeat__Group_1__49260);
            rule__Repeat__Group_1__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Repeat__Group_1__5_in_rule__Repeat__Group_1__49263);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4555:1: rule__Repeat__Group_1__4__Impl : ( ( rule__Repeat__Group_1_4__0 )? ) ;
    public final void rule__Repeat__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4559:1: ( ( ( rule__Repeat__Group_1_4__0 )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4560:1: ( ( rule__Repeat__Group_1_4__0 )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4560:1: ( ( rule__Repeat__Group_1_4__0 )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4561:1: ( rule__Repeat__Group_1_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatAccess().getGroup_1_4()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4562:1: ( rule__Repeat__Group_1_4__0 )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==55) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4562:2: rule__Repeat__Group_1_4__0
                    {
                    pushFollow(FOLLOW_rule__Repeat__Group_1_4__0_in_rule__Repeat__Group_1__4__Impl9290);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4572:1: rule__Repeat__Group_1__5 : rule__Repeat__Group_1__5__Impl rule__Repeat__Group_1__6 ;
    public final void rule__Repeat__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4576:1: ( rule__Repeat__Group_1__5__Impl rule__Repeat__Group_1__6 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4577:2: rule__Repeat__Group_1__5__Impl rule__Repeat__Group_1__6
            {
            pushFollow(FOLLOW_rule__Repeat__Group_1__5__Impl_in_rule__Repeat__Group_1__59321);
            rule__Repeat__Group_1__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Repeat__Group_1__6_in_rule__Repeat__Group_1__59324);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4584:1: rule__Repeat__Group_1__5__Impl : ( ( 'to' )? ) ;
    public final void rule__Repeat__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4588:1: ( ( ( 'to' )? ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4589:1: ( ( 'to' )? )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4589:1: ( ( 'to' )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4590:1: ( 'to' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatAccess().getToKeyword_1_5()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4591:1: ( 'to' )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==63) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4592:2: 'to'
                    {
                    match(input,63,FOLLOW_63_in_rule__Repeat__Group_1__5__Impl9353); if (state.failed) return ;

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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4603:1: rule__Repeat__Group_1__6 : rule__Repeat__Group_1__6__Impl ;
    public final void rule__Repeat__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4607:1: ( rule__Repeat__Group_1__6__Impl )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4608:2: rule__Repeat__Group_1__6__Impl
            {
            pushFollow(FOLLOW_rule__Repeat__Group_1__6__Impl_in_rule__Repeat__Group_1__69386);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4614:1: rule__Repeat__Group_1__6__Impl : ( ( rule__Repeat__SpecAssignment_1_6 ) ) ;
    public final void rule__Repeat__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4618:1: ( ( ( rule__Repeat__SpecAssignment_1_6 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4619:1: ( ( rule__Repeat__SpecAssignment_1_6 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4619:1: ( ( rule__Repeat__SpecAssignment_1_6 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4620:1: ( rule__Repeat__SpecAssignment_1_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatAccess().getSpecAssignment_1_6()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4621:1: ( rule__Repeat__SpecAssignment_1_6 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4621:2: rule__Repeat__SpecAssignment_1_6
            {
            pushFollow(FOLLOW_rule__Repeat__SpecAssignment_1_6_in_rule__Repeat__Group_1__6__Impl9413);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4645:1: rule__Repeat__Group_1_2__0 : rule__Repeat__Group_1_2__0__Impl rule__Repeat__Group_1_2__1 ;
    public final void rule__Repeat__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4649:1: ( rule__Repeat__Group_1_2__0__Impl rule__Repeat__Group_1_2__1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4650:2: rule__Repeat__Group_1_2__0__Impl rule__Repeat__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__Repeat__Group_1_2__0__Impl_in_rule__Repeat__Group_1_2__09457);
            rule__Repeat__Group_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Repeat__Group_1_2__1_in_rule__Repeat__Group_1_2__09460);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4657:1: rule__Repeat__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__Repeat__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4661:1: ( ( ',' ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4662:1: ( ',' )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4662:1: ( ',' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4663:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatAccess().getCommaKeyword_1_2_0()); 
            }
            match(input,55,FOLLOW_55_in_rule__Repeat__Group_1_2__0__Impl9488); if (state.failed) return ;
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4676:1: rule__Repeat__Group_1_2__1 : rule__Repeat__Group_1_2__1__Impl ;
    public final void rule__Repeat__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4680:1: ( rule__Repeat__Group_1_2__1__Impl )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4681:2: rule__Repeat__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Repeat__Group_1_2__1__Impl_in_rule__Repeat__Group_1_2__19519);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4687:1: rule__Repeat__Group_1_2__1__Impl : ( ( rule__Repeat__OperationsAssignment_1_2_1 ) ) ;
    public final void rule__Repeat__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4691:1: ( ( ( rule__Repeat__OperationsAssignment_1_2_1 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4692:1: ( ( rule__Repeat__OperationsAssignment_1_2_1 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4692:1: ( ( rule__Repeat__OperationsAssignment_1_2_1 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4693:1: ( rule__Repeat__OperationsAssignment_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatAccess().getOperationsAssignment_1_2_1()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4694:1: ( rule__Repeat__OperationsAssignment_1_2_1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4694:2: rule__Repeat__OperationsAssignment_1_2_1
            {
            pushFollow(FOLLOW_rule__Repeat__OperationsAssignment_1_2_1_in_rule__Repeat__Group_1_2__1__Impl9546);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4708:1: rule__Repeat__Group_1_4__0 : rule__Repeat__Group_1_4__0__Impl rule__Repeat__Group_1_4__1 ;
    public final void rule__Repeat__Group_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4712:1: ( rule__Repeat__Group_1_4__0__Impl rule__Repeat__Group_1_4__1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4713:2: rule__Repeat__Group_1_4__0__Impl rule__Repeat__Group_1_4__1
            {
            pushFollow(FOLLOW_rule__Repeat__Group_1_4__0__Impl_in_rule__Repeat__Group_1_4__09580);
            rule__Repeat__Group_1_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Repeat__Group_1_4__1_in_rule__Repeat__Group_1_4__09583);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4720:1: rule__Repeat__Group_1_4__0__Impl : ( ',' ) ;
    public final void rule__Repeat__Group_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4724:1: ( ( ',' ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4725:1: ( ',' )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4725:1: ( ',' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4726:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatAccess().getCommaKeyword_1_4_0()); 
            }
            match(input,55,FOLLOW_55_in_rule__Repeat__Group_1_4__0__Impl9611); if (state.failed) return ;
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4739:1: rule__Repeat__Group_1_4__1 : rule__Repeat__Group_1_4__1__Impl ;
    public final void rule__Repeat__Group_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4743:1: ( rule__Repeat__Group_1_4__1__Impl )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4744:2: rule__Repeat__Group_1_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Repeat__Group_1_4__1__Impl_in_rule__Repeat__Group_1_4__19642);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4750:1: rule__Repeat__Group_1_4__1__Impl : ( ( rule__Repeat__Alternatives_1_4_1 ) ) ;
    public final void rule__Repeat__Group_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4754:1: ( ( ( rule__Repeat__Alternatives_1_4_1 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4755:1: ( ( rule__Repeat__Alternatives_1_4_1 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4755:1: ( ( rule__Repeat__Alternatives_1_4_1 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4756:1: ( rule__Repeat__Alternatives_1_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatAccess().getAlternatives_1_4_1()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4757:1: ( rule__Repeat__Alternatives_1_4_1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4757:2: rule__Repeat__Alternatives_1_4_1
            {
            pushFollow(FOLLOW_rule__Repeat__Alternatives_1_4_1_in_rule__Repeat__Group_1_4__1__Impl9669);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4771:1: rule__Range__Group__0 : rule__Range__Group__0__Impl rule__Range__Group__1 ;
    public final void rule__Range__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4775:1: ( rule__Range__Group__0__Impl rule__Range__Group__1 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4776:2: rule__Range__Group__0__Impl rule__Range__Group__1
            {
            pushFollow(FOLLOW_rule__Range__Group__0__Impl_in_rule__Range__Group__09703);
            rule__Range__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Range__Group__1_in_rule__Range__Group__09706);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4783:1: rule__Range__Group__0__Impl : ( ( rule__Range__MinAssignment_0 ) ) ;
    public final void rule__Range__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4787:1: ( ( ( rule__Range__MinAssignment_0 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4788:1: ( ( rule__Range__MinAssignment_0 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4788:1: ( ( rule__Range__MinAssignment_0 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4789:1: ( rule__Range__MinAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getMinAssignment_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4790:1: ( rule__Range__MinAssignment_0 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4790:2: rule__Range__MinAssignment_0
            {
            pushFollow(FOLLOW_rule__Range__MinAssignment_0_in_rule__Range__Group__0__Impl9733);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4800:1: rule__Range__Group__1 : rule__Range__Group__1__Impl rule__Range__Group__2 ;
    public final void rule__Range__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4804:1: ( rule__Range__Group__1__Impl rule__Range__Group__2 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4805:2: rule__Range__Group__1__Impl rule__Range__Group__2
            {
            pushFollow(FOLLOW_rule__Range__Group__1__Impl_in_rule__Range__Group__19763);
            rule__Range__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Range__Group__2_in_rule__Range__Group__19766);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4812:1: rule__Range__Group__1__Impl : ( '-' ) ;
    public final void rule__Range__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4816:1: ( ( '-' ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4817:1: ( '-' )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4817:1: ( '-' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4818:1: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getHyphenMinusKeyword_1()); 
            }
            match(input,66,FOLLOW_66_in_rule__Range__Group__1__Impl9794); if (state.failed) return ;
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4831:1: rule__Range__Group__2 : rule__Range__Group__2__Impl ;
    public final void rule__Range__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4835:1: ( rule__Range__Group__2__Impl )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4836:2: rule__Range__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Range__Group__2__Impl_in_rule__Range__Group__29825);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4842:1: rule__Range__Group__2__Impl : ( ( rule__Range__MaxAssignment_2 ) ) ;
    public final void rule__Range__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4846:1: ( ( ( rule__Range__MaxAssignment_2 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4847:1: ( ( rule__Range__MaxAssignment_2 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4847:1: ( ( rule__Range__MaxAssignment_2 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4848:1: ( rule__Range__MaxAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getMaxAssignment_2()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4849:1: ( rule__Range__MaxAssignment_2 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4849:2: rule__Range__MaxAssignment_2
            {
            pushFollow(FOLLOW_rule__Range__MaxAssignment_2_in_rule__Range__Group__2__Impl9852);
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


    // $ANTLR start "rule__Row__UnorderedGroup_1"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4866:1: rule__Row__UnorderedGroup_1 : ( rule__Row__UnorderedGroup_1__0 )? ;
    public final void rule__Row__UnorderedGroup_1() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getRowAccess().getUnorderedGroup_1());
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4871:1: ( ( rule__Row__UnorderedGroup_1__0 )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4872:2: ( rule__Row__UnorderedGroup_1__0 )?
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4872:2: ( rule__Row__UnorderedGroup_1__0 )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( LA76_0 ==68 && getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_1(), 0) ) {
                alt76=1;
            }
            else if ( LA76_0 ==69 && getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_1(), 1) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:0:0: rule__Row__UnorderedGroup_1__0
                    {
                    pushFollow(FOLLOW_rule__Row__UnorderedGroup_1__0_in_rule__Row__UnorderedGroup_19889);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4882:1: rule__Row__UnorderedGroup_1__Impl : ( ({...}? => ( ( ( rule__Row__ShortRowAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__Row__LongRowAssignment_1_1 ) ) ) ) ) ;
    public final void rule__Row__UnorderedGroup_1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4887:1: ( ( ({...}? => ( ( ( rule__Row__ShortRowAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__Row__LongRowAssignment_1_1 ) ) ) ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4888:3: ( ({...}? => ( ( ( rule__Row__ShortRowAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__Row__LongRowAssignment_1_1 ) ) ) ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4888:3: ( ({...}? => ( ( ( rule__Row__ShortRowAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__Row__LongRowAssignment_1_1 ) ) ) ) )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( LA77_0 ==68 && getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_1(), 0) ) {
                alt77=1;
            }
            else if ( LA77_0 ==69 && getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_1(), 1) ) {
                alt77=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4890:4: ({...}? => ( ( ( rule__Row__ShortRowAssignment_1_0 ) ) ) )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4890:4: ({...}? => ( ( ( rule__Row__ShortRowAssignment_1_0 ) ) ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4891:5: {...}? => ( ( ( rule__Row__ShortRowAssignment_1_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_1(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Row__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_1(), 0)");
                    }
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4891:100: ( ( ( rule__Row__ShortRowAssignment_1_0 ) ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4892:6: ( ( rule__Row__ShortRowAssignment_1_0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getRowAccess().getUnorderedGroup_1(), 0);
                    selected = true;
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4898:6: ( ( rule__Row__ShortRowAssignment_1_0 ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4900:7: ( rule__Row__ShortRowAssignment_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRowAccess().getShortRowAssignment_1_0()); 
                    }
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4901:7: ( rule__Row__ShortRowAssignment_1_0 )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4901:8: rule__Row__ShortRowAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__Row__ShortRowAssignment_1_0_in_rule__Row__UnorderedGroup_1__Impl9976);
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
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4907:4: ({...}? => ( ( ( rule__Row__LongRowAssignment_1_1 ) ) ) )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4907:4: ({...}? => ( ( ( rule__Row__LongRowAssignment_1_1 ) ) ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4908:5: {...}? => ( ( ( rule__Row__LongRowAssignment_1_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_1(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Row__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_1(), 1)");
                    }
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4908:100: ( ( ( rule__Row__LongRowAssignment_1_1 ) ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4909:6: ( ( rule__Row__LongRowAssignment_1_1 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getRowAccess().getUnorderedGroup_1(), 1);
                    selected = true;
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4915:6: ( ( rule__Row__LongRowAssignment_1_1 ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4917:7: ( rule__Row__LongRowAssignment_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRowAccess().getLongRowAssignment_1_1()); 
                    }
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4918:7: ( rule__Row__LongRowAssignment_1_1 )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4918:8: rule__Row__LongRowAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__Row__LongRowAssignment_1_1_in_rule__Row__UnorderedGroup_1__Impl10067);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4933:1: rule__Row__UnorderedGroup_1__0 : rule__Row__UnorderedGroup_1__Impl ( rule__Row__UnorderedGroup_1__1 )? ;
    public final void rule__Row__UnorderedGroup_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4937:1: ( rule__Row__UnorderedGroup_1__Impl ( rule__Row__UnorderedGroup_1__1 )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4938:2: rule__Row__UnorderedGroup_1__Impl ( rule__Row__UnorderedGroup_1__1 )?
            {
            pushFollow(FOLLOW_rule__Row__UnorderedGroup_1__Impl_in_rule__Row__UnorderedGroup_1__010126);
            rule__Row__UnorderedGroup_1__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4939:2: ( rule__Row__UnorderedGroup_1__1 )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( LA78_0 ==68 && getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_1(), 0) ) {
                alt78=1;
            }
            else if ( LA78_0 ==69 && getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_1(), 1) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:0:0: rule__Row__UnorderedGroup_1__1
                    {
                    pushFollow(FOLLOW_rule__Row__UnorderedGroup_1__1_in_rule__Row__UnorderedGroup_1__010129);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4946:1: rule__Row__UnorderedGroup_1__1 : rule__Row__UnorderedGroup_1__Impl ;
    public final void rule__Row__UnorderedGroup_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4950:1: ( rule__Row__UnorderedGroup_1__Impl )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4951:2: rule__Row__UnorderedGroup_1__Impl
            {
            pushFollow(FOLLOW_rule__Row__UnorderedGroup_1__Impl_in_rule__Row__UnorderedGroup_1__110154);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4962:1: rule__Row__UnorderedGroup_4 : ( rule__Row__UnorderedGroup_4__0 )? ;
    public final void rule__Row__UnorderedGroup_4() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getRowAccess().getUnorderedGroup_4());
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4967:1: ( ( rule__Row__UnorderedGroup_4__0 )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4968:2: ( rule__Row__UnorderedGroup_4__0 )?
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4968:2: ( rule__Row__UnorderedGroup_4__0 )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( LA79_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_4(), 0) ) {
                alt79=1;
            }
            else if ( LA79_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_4(), 0) ) {
                alt79=1;
            }
            else if ( LA79_0 ==58 && getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_4(), 1) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:0:0: rule__Row__UnorderedGroup_4__0
                    {
                    pushFollow(FOLLOW_rule__Row__UnorderedGroup_4__0_in_rule__Row__UnorderedGroup_410182);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4978:1: rule__Row__UnorderedGroup_4__Impl : ( ({...}? => ( ( ( rule__Row__SideAssignment_4_0 ) ) ) ) | ({...}? => ( ( ( rule__Row__Group_4_1__0 ) ) ) ) ) ;
    public final void rule__Row__UnorderedGroup_4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4983:1: ( ( ({...}? => ( ( ( rule__Row__SideAssignment_4_0 ) ) ) ) | ({...}? => ( ( ( rule__Row__Group_4_1__0 ) ) ) ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4984:3: ( ({...}? => ( ( ( rule__Row__SideAssignment_4_0 ) ) ) ) | ({...}? => ( ( ( rule__Row__Group_4_1__0 ) ) ) ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4984:3: ( ({...}? => ( ( ( rule__Row__SideAssignment_4_0 ) ) ) ) | ({...}? => ( ( ( rule__Row__Group_4_1__0 ) ) ) ) )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( LA80_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_4(), 0) ) {
                alt80=1;
            }
            else if ( LA80_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_4(), 0) ) {
                alt80=1;
            }
            else if ( LA80_0 ==58 && getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_4(), 1) ) {
                alt80=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }
            switch (alt80) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4986:4: ({...}? => ( ( ( rule__Row__SideAssignment_4_0 ) ) ) )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4986:4: ({...}? => ( ( ( rule__Row__SideAssignment_4_0 ) ) ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4987:5: {...}? => ( ( ( rule__Row__SideAssignment_4_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_4(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Row__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_4(), 0)");
                    }
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4987:100: ( ( ( rule__Row__SideAssignment_4_0 ) ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4988:6: ( ( rule__Row__SideAssignment_4_0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getRowAccess().getUnorderedGroup_4(), 0);
                    selected = true;
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4994:6: ( ( rule__Row__SideAssignment_4_0 ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4996:7: ( rule__Row__SideAssignment_4_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRowAccess().getSideAssignment_4_0()); 
                    }
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4997:7: ( rule__Row__SideAssignment_4_0 )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4997:8: rule__Row__SideAssignment_4_0
                    {
                    pushFollow(FOLLOW_rule__Row__SideAssignment_4_0_in_rule__Row__UnorderedGroup_4__Impl10269);
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
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5003:4: ({...}? => ( ( ( rule__Row__Group_4_1__0 ) ) ) )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5003:4: ({...}? => ( ( ( rule__Row__Group_4_1__0 ) ) ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5004:5: {...}? => ( ( ( rule__Row__Group_4_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_4(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Row__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_4(), 1)");
                    }
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5004:100: ( ( ( rule__Row__Group_4_1__0 ) ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5005:6: ( ( rule__Row__Group_4_1__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getRowAccess().getUnorderedGroup_4(), 1);
                    selected = true;
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5011:6: ( ( rule__Row__Group_4_1__0 ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5013:7: ( rule__Row__Group_4_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRowAccess().getGroup_4_1()); 
                    }
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5014:7: ( rule__Row__Group_4_1__0 )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5014:8: rule__Row__Group_4_1__0
                    {
                    pushFollow(FOLLOW_rule__Row__Group_4_1__0_in_rule__Row__UnorderedGroup_4__Impl10360);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5029:1: rule__Row__UnorderedGroup_4__0 : rule__Row__UnorderedGroup_4__Impl ( rule__Row__UnorderedGroup_4__1 )? ;
    public final void rule__Row__UnorderedGroup_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5033:1: ( rule__Row__UnorderedGroup_4__Impl ( rule__Row__UnorderedGroup_4__1 )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5034:2: rule__Row__UnorderedGroup_4__Impl ( rule__Row__UnorderedGroup_4__1 )?
            {
            pushFollow(FOLLOW_rule__Row__UnorderedGroup_4__Impl_in_rule__Row__UnorderedGroup_4__010419);
            rule__Row__UnorderedGroup_4__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5035:2: ( rule__Row__UnorderedGroup_4__1 )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( LA81_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_4(), 0) ) {
                alt81=1;
            }
            else if ( LA81_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_4(), 0) ) {
                alt81=1;
            }
            else if ( LA81_0 ==58 && getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_4(), 1) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:0:0: rule__Row__UnorderedGroup_4__1
                    {
                    pushFollow(FOLLOW_rule__Row__UnorderedGroup_4__1_in_rule__Row__UnorderedGroup_4__010422);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5042:1: rule__Row__UnorderedGroup_4__1 : rule__Row__UnorderedGroup_4__Impl ;
    public final void rule__Row__UnorderedGroup_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5046:1: ( rule__Row__UnorderedGroup_4__Impl )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5047:2: rule__Row__UnorderedGroup_4__Impl
            {
            pushFollow(FOLLOW_rule__Row__UnorderedGroup_4__Impl_in_rule__Row__UnorderedGroup_4__110447);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5058:1: rule__Knit__UnorderedGroup_4 : ( rule__Knit__UnorderedGroup_4__0 )? ;
    public final void rule__Knit__UnorderedGroup_4() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getKnitAccess().getUnorderedGroup_4());
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5063:1: ( ( rule__Knit__UnorderedGroup_4__0 )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5064:2: ( rule__Knit__UnorderedGroup_4__0 )?
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5064:2: ( rule__Knit__UnorderedGroup_4__0 )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( LA82_0 ==72 && getUnorderedGroupHelper().canSelect(grammarAccess.getKnitAccess().getUnorderedGroup_4(), 0) ) {
                alt82=1;
            }
            else if ( LA82_0 ==28 && getUnorderedGroupHelper().canSelect(grammarAccess.getKnitAccess().getUnorderedGroup_4(), 1) ) {
                alt82=1;
            }
            else if ( LA82_0 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getKnitAccess().getUnorderedGroup_4(), 1) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:0:0: rule__Knit__UnorderedGroup_4__0
                    {
                    pushFollow(FOLLOW_rule__Knit__UnorderedGroup_4__0_in_rule__Knit__UnorderedGroup_410475);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5074:1: rule__Knit__UnorderedGroup_4__Impl : ( ({...}? => ( ( ( rule__Knit__TogetherAssignment_4_0 ) ) ) ) | ({...}? => ( ( ( rule__Knit__ThroughTrailingLoopAssignment_4_1 ) ) ) ) ) ;
    public final void rule__Knit__UnorderedGroup_4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5079:1: ( ( ({...}? => ( ( ( rule__Knit__TogetherAssignment_4_0 ) ) ) ) | ({...}? => ( ( ( rule__Knit__ThroughTrailingLoopAssignment_4_1 ) ) ) ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5080:3: ( ({...}? => ( ( ( rule__Knit__TogetherAssignment_4_0 ) ) ) ) | ({...}? => ( ( ( rule__Knit__ThroughTrailingLoopAssignment_4_1 ) ) ) ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5080:3: ( ({...}? => ( ( ( rule__Knit__TogetherAssignment_4_0 ) ) ) ) | ({...}? => ( ( ( rule__Knit__ThroughTrailingLoopAssignment_4_1 ) ) ) ) )
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( LA83_0 ==72 && getUnorderedGroupHelper().canSelect(grammarAccess.getKnitAccess().getUnorderedGroup_4(), 0) ) {
                alt83=1;
            }
            else if ( LA83_0 >=28 && LA83_0<=29 && getUnorderedGroupHelper().canSelect(grammarAccess.getKnitAccess().getUnorderedGroup_4(), 1) ) {
                alt83=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }
            switch (alt83) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5082:4: ({...}? => ( ( ( rule__Knit__TogetherAssignment_4_0 ) ) ) )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5082:4: ({...}? => ( ( ( rule__Knit__TogetherAssignment_4_0 ) ) ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5083:5: {...}? => ( ( ( rule__Knit__TogetherAssignment_4_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getKnitAccess().getUnorderedGroup_4(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Knit__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getKnitAccess().getUnorderedGroup_4(), 0)");
                    }
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5083:101: ( ( ( rule__Knit__TogetherAssignment_4_0 ) ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5084:6: ( ( rule__Knit__TogetherAssignment_4_0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getKnitAccess().getUnorderedGroup_4(), 0);
                    selected = true;
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5090:6: ( ( rule__Knit__TogetherAssignment_4_0 ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5092:7: ( rule__Knit__TogetherAssignment_4_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getKnitAccess().getTogetherAssignment_4_0()); 
                    }
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5093:7: ( rule__Knit__TogetherAssignment_4_0 )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5093:8: rule__Knit__TogetherAssignment_4_0
                    {
                    pushFollow(FOLLOW_rule__Knit__TogetherAssignment_4_0_in_rule__Knit__UnorderedGroup_4__Impl10562);
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
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5099:4: ({...}? => ( ( ( rule__Knit__ThroughTrailingLoopAssignment_4_1 ) ) ) )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5099:4: ({...}? => ( ( ( rule__Knit__ThroughTrailingLoopAssignment_4_1 ) ) ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5100:5: {...}? => ( ( ( rule__Knit__ThroughTrailingLoopAssignment_4_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getKnitAccess().getUnorderedGroup_4(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Knit__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getKnitAccess().getUnorderedGroup_4(), 1)");
                    }
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5100:101: ( ( ( rule__Knit__ThroughTrailingLoopAssignment_4_1 ) ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5101:6: ( ( rule__Knit__ThroughTrailingLoopAssignment_4_1 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getKnitAccess().getUnorderedGroup_4(), 1);
                    selected = true;
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5107:6: ( ( rule__Knit__ThroughTrailingLoopAssignment_4_1 ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5109:7: ( rule__Knit__ThroughTrailingLoopAssignment_4_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getKnitAccess().getThroughTrailingLoopAssignment_4_1()); 
                    }
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5110:7: ( rule__Knit__ThroughTrailingLoopAssignment_4_1 )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5110:8: rule__Knit__ThroughTrailingLoopAssignment_4_1
                    {
                    pushFollow(FOLLOW_rule__Knit__ThroughTrailingLoopAssignment_4_1_in_rule__Knit__UnorderedGroup_4__Impl10653);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5125:1: rule__Knit__UnorderedGroup_4__0 : rule__Knit__UnorderedGroup_4__Impl ( rule__Knit__UnorderedGroup_4__1 )? ;
    public final void rule__Knit__UnorderedGroup_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5129:1: ( rule__Knit__UnorderedGroup_4__Impl ( rule__Knit__UnorderedGroup_4__1 )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5130:2: rule__Knit__UnorderedGroup_4__Impl ( rule__Knit__UnorderedGroup_4__1 )?
            {
            pushFollow(FOLLOW_rule__Knit__UnorderedGroup_4__Impl_in_rule__Knit__UnorderedGroup_4__010712);
            rule__Knit__UnorderedGroup_4__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5131:2: ( rule__Knit__UnorderedGroup_4__1 )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( LA84_0 ==72 && getUnorderedGroupHelper().canSelect(grammarAccess.getKnitAccess().getUnorderedGroup_4(), 0) ) {
                alt84=1;
            }
            else if ( LA84_0 ==28 && getUnorderedGroupHelper().canSelect(grammarAccess.getKnitAccess().getUnorderedGroup_4(), 1) ) {
                alt84=1;
            }
            else if ( LA84_0 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getKnitAccess().getUnorderedGroup_4(), 1) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:0:0: rule__Knit__UnorderedGroup_4__1
                    {
                    pushFollow(FOLLOW_rule__Knit__UnorderedGroup_4__1_in_rule__Knit__UnorderedGroup_4__010715);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5138:1: rule__Knit__UnorderedGroup_4__1 : rule__Knit__UnorderedGroup_4__Impl ;
    public final void rule__Knit__UnorderedGroup_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5142:1: ( rule__Knit__UnorderedGroup_4__Impl )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5143:2: rule__Knit__UnorderedGroup_4__Impl
            {
            pushFollow(FOLLOW_rule__Knit__UnorderedGroup_4__Impl_in_rule__Knit__UnorderedGroup_4__110740);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5154:1: rule__Purl__UnorderedGroup_4 : ( rule__Purl__UnorderedGroup_4__0 )? ;
    public final void rule__Purl__UnorderedGroup_4() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getPurlAccess().getUnorderedGroup_4());
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5159:1: ( ( rule__Purl__UnorderedGroup_4__0 )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5160:2: ( rule__Purl__UnorderedGroup_4__0 )?
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5160:2: ( rule__Purl__UnorderedGroup_4__0 )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( LA85_0 ==72 && getUnorderedGroupHelper().canSelect(grammarAccess.getPurlAccess().getUnorderedGroup_4(), 0) ) {
                alt85=1;
            }
            else if ( LA85_0 ==28 && getUnorderedGroupHelper().canSelect(grammarAccess.getPurlAccess().getUnorderedGroup_4(), 1) ) {
                alt85=1;
            }
            else if ( LA85_0 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getPurlAccess().getUnorderedGroup_4(), 1) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:0:0: rule__Purl__UnorderedGroup_4__0
                    {
                    pushFollow(FOLLOW_rule__Purl__UnorderedGroup_4__0_in_rule__Purl__UnorderedGroup_410768);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5170:1: rule__Purl__UnorderedGroup_4__Impl : ( ({...}? => ( ( ( rule__Purl__TogetherAssignment_4_0 ) ) ) ) | ({...}? => ( ( ( rule__Purl__ThroughTrailingLoopAssignment_4_1 ) ) ) ) ) ;
    public final void rule__Purl__UnorderedGroup_4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5175:1: ( ( ({...}? => ( ( ( rule__Purl__TogetherAssignment_4_0 ) ) ) ) | ({...}? => ( ( ( rule__Purl__ThroughTrailingLoopAssignment_4_1 ) ) ) ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5176:3: ( ({...}? => ( ( ( rule__Purl__TogetherAssignment_4_0 ) ) ) ) | ({...}? => ( ( ( rule__Purl__ThroughTrailingLoopAssignment_4_1 ) ) ) ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5176:3: ( ({...}? => ( ( ( rule__Purl__TogetherAssignment_4_0 ) ) ) ) | ({...}? => ( ( ( rule__Purl__ThroughTrailingLoopAssignment_4_1 ) ) ) ) )
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( LA86_0 ==72 && getUnorderedGroupHelper().canSelect(grammarAccess.getPurlAccess().getUnorderedGroup_4(), 0) ) {
                alt86=1;
            }
            else if ( LA86_0 >=28 && LA86_0<=29 && getUnorderedGroupHelper().canSelect(grammarAccess.getPurlAccess().getUnorderedGroup_4(), 1) ) {
                alt86=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }
            switch (alt86) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5178:4: ({...}? => ( ( ( rule__Purl__TogetherAssignment_4_0 ) ) ) )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5178:4: ({...}? => ( ( ( rule__Purl__TogetherAssignment_4_0 ) ) ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5179:5: {...}? => ( ( ( rule__Purl__TogetherAssignment_4_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPurlAccess().getUnorderedGroup_4(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Purl__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPurlAccess().getUnorderedGroup_4(), 0)");
                    }
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5179:101: ( ( ( rule__Purl__TogetherAssignment_4_0 ) ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5180:6: ( ( rule__Purl__TogetherAssignment_4_0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getPurlAccess().getUnorderedGroup_4(), 0);
                    selected = true;
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5186:6: ( ( rule__Purl__TogetherAssignment_4_0 ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5188:7: ( rule__Purl__TogetherAssignment_4_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPurlAccess().getTogetherAssignment_4_0()); 
                    }
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5189:7: ( rule__Purl__TogetherAssignment_4_0 )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5189:8: rule__Purl__TogetherAssignment_4_0
                    {
                    pushFollow(FOLLOW_rule__Purl__TogetherAssignment_4_0_in_rule__Purl__UnorderedGroup_4__Impl10855);
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
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5195:4: ({...}? => ( ( ( rule__Purl__ThroughTrailingLoopAssignment_4_1 ) ) ) )
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5195:4: ({...}? => ( ( ( rule__Purl__ThroughTrailingLoopAssignment_4_1 ) ) ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5196:5: {...}? => ( ( ( rule__Purl__ThroughTrailingLoopAssignment_4_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPurlAccess().getUnorderedGroup_4(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Purl__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPurlAccess().getUnorderedGroup_4(), 1)");
                    }
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5196:101: ( ( ( rule__Purl__ThroughTrailingLoopAssignment_4_1 ) ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5197:6: ( ( rule__Purl__ThroughTrailingLoopAssignment_4_1 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getPurlAccess().getUnorderedGroup_4(), 1);
                    selected = true;
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5203:6: ( ( rule__Purl__ThroughTrailingLoopAssignment_4_1 ) )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5205:7: ( rule__Purl__ThroughTrailingLoopAssignment_4_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPurlAccess().getThroughTrailingLoopAssignment_4_1()); 
                    }
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5206:7: ( rule__Purl__ThroughTrailingLoopAssignment_4_1 )
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5206:8: rule__Purl__ThroughTrailingLoopAssignment_4_1
                    {
                    pushFollow(FOLLOW_rule__Purl__ThroughTrailingLoopAssignment_4_1_in_rule__Purl__UnorderedGroup_4__Impl10946);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5221:1: rule__Purl__UnorderedGroup_4__0 : rule__Purl__UnorderedGroup_4__Impl ( rule__Purl__UnorderedGroup_4__1 )? ;
    public final void rule__Purl__UnorderedGroup_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5225:1: ( rule__Purl__UnorderedGroup_4__Impl ( rule__Purl__UnorderedGroup_4__1 )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5226:2: rule__Purl__UnorderedGroup_4__Impl ( rule__Purl__UnorderedGroup_4__1 )?
            {
            pushFollow(FOLLOW_rule__Purl__UnorderedGroup_4__Impl_in_rule__Purl__UnorderedGroup_4__011005);
            rule__Purl__UnorderedGroup_4__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5227:2: ( rule__Purl__UnorderedGroup_4__1 )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( LA87_0 ==72 && getUnorderedGroupHelper().canSelect(grammarAccess.getPurlAccess().getUnorderedGroup_4(), 0) ) {
                alt87=1;
            }
            else if ( LA87_0 ==28 && getUnorderedGroupHelper().canSelect(grammarAccess.getPurlAccess().getUnorderedGroup_4(), 1) ) {
                alt87=1;
            }
            else if ( LA87_0 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getPurlAccess().getUnorderedGroup_4(), 1) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:0:0: rule__Purl__UnorderedGroup_4__1
                    {
                    pushFollow(FOLLOW_rule__Purl__UnorderedGroup_4__1_in_rule__Purl__UnorderedGroup_4__011008);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5234:1: rule__Purl__UnorderedGroup_4__1 : rule__Purl__UnorderedGroup_4__Impl ;
    public final void rule__Purl__UnorderedGroup_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5238:1: ( rule__Purl__UnorderedGroup_4__Impl )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5239:2: rule__Purl__UnorderedGroup_4__Impl
            {
            pushFollow(FOLLOW_rule__Purl__UnorderedGroup_4__Impl_in_rule__Purl__UnorderedGroup_4__111033);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5250:1: rule__Pattern__ElementsAssignment_1 : ( ruleBlockOperation ) ;
    public final void rule__Pattern__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5254:1: ( ( ruleBlockOperation ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5255:1: ( ruleBlockOperation )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5255:1: ( ruleBlockOperation )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5256:1: ruleBlockOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getElementsBlockOperationParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleBlockOperation_in_rule__Pattern__ElementsAssignment_111065);
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


    // $ANTLR start "rule__Instruction__LabelAssignment_1"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5265:1: rule__Instruction__LabelAssignment_1 : ( RULE_ID ) ;
    public final void rule__Instruction__LabelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5269:1: ( ( RULE_ID ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5270:1: ( RULE_ID )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5270:1: ( RULE_ID )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5271:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstructionAccess().getLabelIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Instruction__LabelAssignment_111096); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstructionAccess().getLabelIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Instruction__LabelAssignment_1"


    // $ANTLR start "rule__Instruction__RowsAssignment_2_0_2"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5280:1: rule__Instruction__RowsAssignment_2_0_2 : ( ruleRow ) ;
    public final void rule__Instruction__RowsAssignment_2_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5284:1: ( ( ruleRow ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5285:1: ( ruleRow )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5285:1: ( ruleRow )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5286:1: ruleRow
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstructionAccess().getRowsRowParserRuleCall_2_0_2_0()); 
            }
            pushFollow(FOLLOW_ruleRow_in_rule__Instruction__RowsAssignment_2_0_211127);
            ruleRow();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstructionAccess().getRowsRowParserRuleCall_2_0_2_0()); 
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
    // $ANTLR end "rule__Instruction__RowsAssignment_2_0_2"


    // $ANTLR start "rule__Instruction__RowsAssignment_2_1_2"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5295:1: rule__Instruction__RowsAssignment_2_1_2 : ( ruleRow ) ;
    public final void rule__Instruction__RowsAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5299:1: ( ( ruleRow ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5300:1: ( ruleRow )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5300:1: ( ruleRow )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5301:1: ruleRow
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstructionAccess().getRowsRowParserRuleCall_2_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleRow_in_rule__Instruction__RowsAssignment_2_1_211158);
            ruleRow();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstructionAccess().getRowsRowParserRuleCall_2_1_2_0()); 
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
    // $ANTLR end "rule__Instruction__RowsAssignment_2_1_2"


    // $ANTLR start "rule__Row__NextRowAssignment_0"
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5310:1: rule__Row__NextRowAssignment_0 : ( ( 'Next' ) ) ;
    public final void rule__Row__NextRowAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5314:1: ( ( ( 'Next' ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5315:1: ( ( 'Next' ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5315:1: ( ( 'Next' ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5316:1: ( 'Next' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getNextRowNextKeyword_0_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5317:1: ( 'Next' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5318:1: 'Next'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getNextRowNextKeyword_0_0()); 
            }
            match(input,67,FOLLOW_67_in_rule__Row__NextRowAssignment_011194); if (state.failed) return ;
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5333:1: rule__Row__ShortRowAssignment_1_0 : ( ( 'Short' ) ) ;
    public final void rule__Row__ShortRowAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5337:1: ( ( ( 'Short' ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5338:1: ( ( 'Short' ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5338:1: ( ( 'Short' ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5339:1: ( 'Short' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getShortRowShortKeyword_1_0_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5340:1: ( 'Short' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5341:1: 'Short'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getShortRowShortKeyword_1_0_0()); 
            }
            match(input,68,FOLLOW_68_in_rule__Row__ShortRowAssignment_1_011238); if (state.failed) return ;
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5356:1: rule__Row__LongRowAssignment_1_1 : ( ( 'Long' ) ) ;
    public final void rule__Row__LongRowAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5360:1: ( ( ( 'Long' ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5361:1: ( ( 'Long' ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5361:1: ( ( 'Long' ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5362:1: ( 'Long' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getLongRowLongKeyword_1_1_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5363:1: ( 'Long' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5364:1: 'Long'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getLongRowLongKeyword_1_1_0()); 
            }
            match(input,69,FOLLOW_69_in_rule__Row__LongRowAssignment_1_111282); if (state.failed) return ;
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5379:1: rule__Row__LabelAssignment_2 : ( ( rule__Row__LabelAlternatives_2_0 ) ) ;
    public final void rule__Row__LabelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5383:1: ( ( ( rule__Row__LabelAlternatives_2_0 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5384:1: ( ( rule__Row__LabelAlternatives_2_0 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5384:1: ( ( rule__Row__LabelAlternatives_2_0 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5385:1: ( rule__Row__LabelAlternatives_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getLabelAlternatives_2_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5386:1: ( rule__Row__LabelAlternatives_2_0 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5386:2: rule__Row__LabelAlternatives_2_0
            {
            pushFollow(FOLLOW_rule__Row__LabelAlternatives_2_0_in_rule__Row__LabelAssignment_211321);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5395:1: rule__Row__RangeAssignment_3_0 : ( ruleRange ) ;
    public final void rule__Row__RangeAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5399:1: ( ( ruleRange ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5400:1: ( ruleRange )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5400:1: ( ruleRange )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5401:1: ruleRange
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getRangeRangeParserRuleCall_3_0_0()); 
            }
            pushFollow(FOLLOW_ruleRange_in_rule__Row__RangeAssignment_3_011354);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5410:1: rule__Row__NumberAssignment_3_1_0 : ( RULE_INT ) ;
    public final void rule__Row__NumberAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5414:1: ( ( RULE_INT ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5415:1: ( RULE_INT )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5415:1: ( RULE_INT )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5416:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getNumberINTTerminalRuleCall_3_1_0_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Row__NumberAssignment_3_1_011385); if (state.failed) return ;
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5425:1: rule__Row__NumberAssignment_3_1_1_1 : ( RULE_INT ) ;
    public final void rule__Row__NumberAssignment_3_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5429:1: ( ( RULE_INT ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5430:1: ( RULE_INT )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5430:1: ( RULE_INT )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5431:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getNumberINTTerminalRuleCall_3_1_1_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Row__NumberAssignment_3_1_1_111416); if (state.failed) return ;
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5440:1: rule__Row__SubsequentAssignment_3_1_2_2 : ( ( rule__Row__SubsequentAlternatives_3_1_2_2_0 ) ) ;
    public final void rule__Row__SubsequentAssignment_3_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5444:1: ( ( ( rule__Row__SubsequentAlternatives_3_1_2_2_0 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5445:1: ( ( rule__Row__SubsequentAlternatives_3_1_2_2_0 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5445:1: ( ( rule__Row__SubsequentAlternatives_3_1_2_2_0 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5446:1: ( rule__Row__SubsequentAlternatives_3_1_2_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getSubsequentAlternatives_3_1_2_2_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5447:1: ( rule__Row__SubsequentAlternatives_3_1_2_2_0 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5447:2: rule__Row__SubsequentAlternatives_3_1_2_2_0
            {
            pushFollow(FOLLOW_rule__Row__SubsequentAlternatives_3_1_2_2_0_in_rule__Row__SubsequentAssignment_3_1_2_211447);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5456:1: rule__Row__SideAssignment_4_0 : ( ( rule__Row__SideAlternatives_4_0_0 ) ) ;
    public final void rule__Row__SideAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5460:1: ( ( ( rule__Row__SideAlternatives_4_0_0 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5461:1: ( ( rule__Row__SideAlternatives_4_0_0 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5461:1: ( ( rule__Row__SideAlternatives_4_0_0 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5462:1: ( rule__Row__SideAlternatives_4_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getSideAlternatives_4_0_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5463:1: ( rule__Row__SideAlternatives_4_0_0 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5463:2: rule__Row__SideAlternatives_4_0_0
            {
            pushFollow(FOLLOW_rule__Row__SideAlternatives_4_0_0_in_rule__Row__SideAssignment_4_011480);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5472:1: rule__Row__YarnRefAssignment_4_1_1 : ( RULE_ID ) ;
    public final void rule__Row__YarnRefAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5476:1: ( ( RULE_ID ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5477:1: ( RULE_ID )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5477:1: ( RULE_ID )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5478:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getYarnRefIDTerminalRuleCall_4_1_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Row__YarnRefAssignment_4_1_111513); if (state.failed) return ;
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5487:1: rule__Row__InformAssignment_5_1_1 : ( ( 'inform' ) ) ;
    public final void rule__Row__InformAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5491:1: ( ( ( 'inform' ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5492:1: ( ( 'inform' ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5492:1: ( ( 'inform' ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5493:1: ( 'inform' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getInformInformKeyword_5_1_1_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5494:1: ( 'inform' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5495:1: 'inform'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getInformInformKeyword_5_1_1_0()); 
            }
            match(input,70,FOLLOW_70_in_rule__Row__InformAssignment_5_1_111549); if (state.failed) return ;
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5510:1: rule__Row__ResetAssignment_5_2_1 : ( ( 'reset' ) ) ;
    public final void rule__Row__ResetAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5514:1: ( ( ( 'reset' ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5515:1: ( ( 'reset' ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5515:1: ( ( 'reset' ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5516:1: ( 'reset' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getResetResetKeyword_5_2_1_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5517:1: ( 'reset' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5518:1: 'reset'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getResetResetKeyword_5_2_1_0()); 
            }
            match(input,71,FOLLOW_71_in_rule__Row__ResetAssignment_5_2_111593); if (state.failed) return ;
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5533:1: rule__Row__OperationsAssignment_8 : ( ruleInlineOperation ) ;
    public final void rule__Row__OperationsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5537:1: ( ( ruleInlineOperation ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5538:1: ( ruleInlineOperation )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5538:1: ( ruleInlineOperation )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5539:1: ruleInlineOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getOperationsInlineOperationParserRuleCall_8_0()); 
            }
            pushFollow(FOLLOW_ruleInlineOperation_in_rule__Row__OperationsAssignment_811632);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5548:1: rule__Row__OperationsAssignment_9_1 : ( ruleInlineOperation ) ;
    public final void rule__Row__OperationsAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5552:1: ( ( ruleInlineOperation ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5553:1: ( ruleInlineOperation )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5553:1: ( ruleInlineOperation )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5554:1: ruleInlineOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getOperationsInlineOperationParserRuleCall_9_1_0()); 
            }
            pushFollow(FOLLOW_ruleInlineOperation_in_rule__Row__OperationsAssignment_9_111663);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5563:1: rule__Message__MessageAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Message__MessageAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5567:1: ( ( RULE_STRING ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5568:1: ( RULE_STRING )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5568:1: ( RULE_STRING )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5569:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getMessageSTRINGTerminalRuleCall_0_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Message__MessageAssignment_011694); if (state.failed) return ;
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5578:1: rule__Knit__NumberAssignment_2 : ( RULE_INT ) ;
    public final void rule__Knit__NumberAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5582:1: ( ( RULE_INT ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5583:1: ( RULE_INT )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5583:1: ( RULE_INT )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5584:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKnitAccess().getNumberINTTerminalRuleCall_2_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Knit__NumberAssignment_211725); if (state.failed) return ;
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5593:1: rule__Knit__TogetherAssignment_4_0 : ( ( 'tog' ) ) ;
    public final void rule__Knit__TogetherAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5597:1: ( ( ( 'tog' ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5598:1: ( ( 'tog' ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5598:1: ( ( 'tog' ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5599:1: ( 'tog' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKnitAccess().getTogetherTogKeyword_4_0_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5600:1: ( 'tog' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5601:1: 'tog'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKnitAccess().getTogetherTogKeyword_4_0_0()); 
            }
            match(input,72,FOLLOW_72_in_rule__Knit__TogetherAssignment_4_011761); if (state.failed) return ;
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5616:1: rule__Knit__ThroughTrailingLoopAssignment_4_1 : ( ( rule__Knit__ThroughTrailingLoopAlternatives_4_1_0 ) ) ;
    public final void rule__Knit__ThroughTrailingLoopAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5620:1: ( ( ( rule__Knit__ThroughTrailingLoopAlternatives_4_1_0 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5621:1: ( ( rule__Knit__ThroughTrailingLoopAlternatives_4_1_0 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5621:1: ( ( rule__Knit__ThroughTrailingLoopAlternatives_4_1_0 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5622:1: ( rule__Knit__ThroughTrailingLoopAlternatives_4_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKnitAccess().getThroughTrailingLoopAlternatives_4_1_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5623:1: ( rule__Knit__ThroughTrailingLoopAlternatives_4_1_0 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5623:2: rule__Knit__ThroughTrailingLoopAlternatives_4_1_0
            {
            pushFollow(FOLLOW_rule__Knit__ThroughTrailingLoopAlternatives_4_1_0_in_rule__Knit__ThroughTrailingLoopAssignment_4_111800);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5632:1: rule__Knit__YarnRefAssignment_5_1 : ( RULE_ID ) ;
    public final void rule__Knit__YarnRefAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5636:1: ( ( RULE_ID ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5637:1: ( RULE_ID )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5637:1: ( RULE_ID )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5638:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKnitAccess().getYarnRefIDTerminalRuleCall_5_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Knit__YarnRefAssignment_5_111833); if (state.failed) return ;
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5647:1: rule__Knit__RepeatAssignment_6_1 : ( ruleRepeatSpec ) ;
    public final void rule__Knit__RepeatAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5651:1: ( ( ruleRepeatSpec ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5652:1: ( ruleRepeatSpec )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5652:1: ( ruleRepeatSpec )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5653:1: ruleRepeatSpec
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKnitAccess().getRepeatRepeatSpecParserRuleCall_6_1_0()); 
            }
            pushFollow(FOLLOW_ruleRepeatSpec_in_rule__Knit__RepeatAssignment_6_111864);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5662:1: rule__Purl__NumberAssignment_2 : ( RULE_INT ) ;
    public final void rule__Purl__NumberAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5666:1: ( ( RULE_INT ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5667:1: ( RULE_INT )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5667:1: ( RULE_INT )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5668:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPurlAccess().getNumberINTTerminalRuleCall_2_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Purl__NumberAssignment_211895); if (state.failed) return ;
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5677:1: rule__Purl__TogetherAssignment_4_0 : ( ( 'tog' ) ) ;
    public final void rule__Purl__TogetherAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5681:1: ( ( ( 'tog' ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5682:1: ( ( 'tog' ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5682:1: ( ( 'tog' ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5683:1: ( 'tog' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPurlAccess().getTogetherTogKeyword_4_0_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5684:1: ( 'tog' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5685:1: 'tog'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPurlAccess().getTogetherTogKeyword_4_0_0()); 
            }
            match(input,72,FOLLOW_72_in_rule__Purl__TogetherAssignment_4_011931); if (state.failed) return ;
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5700:1: rule__Purl__ThroughTrailingLoopAssignment_4_1 : ( ( rule__Purl__ThroughTrailingLoopAlternatives_4_1_0 ) ) ;
    public final void rule__Purl__ThroughTrailingLoopAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5704:1: ( ( ( rule__Purl__ThroughTrailingLoopAlternatives_4_1_0 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5705:1: ( ( rule__Purl__ThroughTrailingLoopAlternatives_4_1_0 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5705:1: ( ( rule__Purl__ThroughTrailingLoopAlternatives_4_1_0 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5706:1: ( rule__Purl__ThroughTrailingLoopAlternatives_4_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPurlAccess().getThroughTrailingLoopAlternatives_4_1_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5707:1: ( rule__Purl__ThroughTrailingLoopAlternatives_4_1_0 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5707:2: rule__Purl__ThroughTrailingLoopAlternatives_4_1_0
            {
            pushFollow(FOLLOW_rule__Purl__ThroughTrailingLoopAlternatives_4_1_0_in_rule__Purl__ThroughTrailingLoopAssignment_4_111970);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5716:1: rule__Purl__YarnRefAssignment_5_1 : ( RULE_ID ) ;
    public final void rule__Purl__YarnRefAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5720:1: ( ( RULE_ID ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5721:1: ( RULE_ID )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5721:1: ( RULE_ID )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5722:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPurlAccess().getYarnRefIDTerminalRuleCall_5_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Purl__YarnRefAssignment_5_112003); if (state.failed) return ;
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5731:1: rule__Purl__RepeatAssignment_6_1 : ( ruleRepeatSpec ) ;
    public final void rule__Purl__RepeatAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5735:1: ( ( ruleRepeatSpec ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5736:1: ( ruleRepeatSpec )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5736:1: ( ruleRepeatSpec )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5737:1: ruleRepeatSpec
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPurlAccess().getRepeatRepeatSpecParserRuleCall_6_1_0()); 
            }
            pushFollow(FOLLOW_ruleRepeatSpec_in_rule__Purl__RepeatAssignment_6_112034);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5746:1: rule__Slip__ReverseAssignment_1 : ( ( rule__Slip__ReverseAlternatives_1_0 ) ) ;
    public final void rule__Slip__ReverseAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5750:1: ( ( ( rule__Slip__ReverseAlternatives_1_0 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5751:1: ( ( rule__Slip__ReverseAlternatives_1_0 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5751:1: ( ( rule__Slip__ReverseAlternatives_1_0 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5752:1: ( rule__Slip__ReverseAlternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSlipAccess().getReverseAlternatives_1_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5753:1: ( rule__Slip__ReverseAlternatives_1_0 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5753:2: rule__Slip__ReverseAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__Slip__ReverseAlternatives_1_0_in_rule__Slip__ReverseAssignment_112065);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5762:1: rule__Slip__NumberAssignment_3_0_0 : ( RULE_INT ) ;
    public final void rule__Slip__NumberAssignment_3_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5766:1: ( ( RULE_INT ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5767:1: ( RULE_INT )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5767:1: ( RULE_INT )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5768:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSlipAccess().getNumberINTTerminalRuleCall_3_0_0_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Slip__NumberAssignment_3_0_012098); if (state.failed) return ;
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5777:1: rule__Slip__KnitwiseAssignment_4_0 : ( ( rule__Slip__KnitwiseAlternatives_4_0_0 ) ) ;
    public final void rule__Slip__KnitwiseAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5781:1: ( ( ( rule__Slip__KnitwiseAlternatives_4_0_0 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5782:1: ( ( rule__Slip__KnitwiseAlternatives_4_0_0 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5782:1: ( ( rule__Slip__KnitwiseAlternatives_4_0_0 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5783:1: ( rule__Slip__KnitwiseAlternatives_4_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSlipAccess().getKnitwiseAlternatives_4_0_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5784:1: ( rule__Slip__KnitwiseAlternatives_4_0_0 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5784:2: rule__Slip__KnitwiseAlternatives_4_0_0
            {
            pushFollow(FOLLOW_rule__Slip__KnitwiseAlternatives_4_0_0_in_rule__Slip__KnitwiseAssignment_4_012129);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5793:1: rule__Slip__PurlwiseAssignment_4_1 : ( ( rule__Slip__PurlwiseAlternatives_4_1_0 ) ) ;
    public final void rule__Slip__PurlwiseAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5797:1: ( ( ( rule__Slip__PurlwiseAlternatives_4_1_0 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5798:1: ( ( rule__Slip__PurlwiseAlternatives_4_1_0 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5798:1: ( ( rule__Slip__PurlwiseAlternatives_4_1_0 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5799:1: ( rule__Slip__PurlwiseAlternatives_4_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSlipAccess().getPurlwiseAlternatives_4_1_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5800:1: ( rule__Slip__PurlwiseAlternatives_4_1_0 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5800:2: rule__Slip__PurlwiseAlternatives_4_1_0
            {
            pushFollow(FOLLOW_rule__Slip__PurlwiseAlternatives_4_1_0_in_rule__Slip__PurlwiseAssignment_4_112162);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5809:1: rule__Slip__YarnPositionAssignment_5 : ( ( rule__Slip__YarnPositionAlternatives_5_0 ) ) ;
    public final void rule__Slip__YarnPositionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5813:1: ( ( ( rule__Slip__YarnPositionAlternatives_5_0 ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5814:1: ( ( rule__Slip__YarnPositionAlternatives_5_0 ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5814:1: ( ( rule__Slip__YarnPositionAlternatives_5_0 ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5815:1: ( rule__Slip__YarnPositionAlternatives_5_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSlipAccess().getYarnPositionAlternatives_5_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5816:1: ( rule__Slip__YarnPositionAlternatives_5_0 )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5816:2: rule__Slip__YarnPositionAlternatives_5_0
            {
            pushFollow(FOLLOW_rule__Slip__YarnPositionAlternatives_5_0_in_rule__Slip__YarnPositionAssignment_512195);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5825:1: rule__RepeatSpec__ToEndAssignment_0 : ( ( 'end' ) ) ;
    public final void rule__RepeatSpec__ToEndAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5829:1: ( ( ( 'end' ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5830:1: ( ( 'end' ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5830:1: ( ( 'end' ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5831:1: ( 'end' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatSpecAccess().getToEndEndKeyword_0_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5832:1: ( 'end' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5833:1: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatSpecAccess().getToEndEndKeyword_0_0()); 
            }
            match(input,73,FOLLOW_73_in_rule__RepeatSpec__ToEndAssignment_012233); if (state.failed) return ;
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5848:1: rule__RepeatSpec__ToMarkerAssignment_1 : ( ( 'marker' ) ) ;
    public final void rule__RepeatSpec__ToMarkerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5852:1: ( ( ( 'marker' ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5853:1: ( ( 'marker' ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5853:1: ( ( 'marker' ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5854:1: ( 'marker' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatSpecAccess().getToMarkerMarkerKeyword_1_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5855:1: ( 'marker' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5856:1: 'marker'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatSpecAccess().getToMarkerMarkerKeyword_1_0()); 
            }
            match(input,74,FOLLOW_74_in_rule__RepeatSpec__ToMarkerAssignment_112277); if (state.failed) return ;
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5871:1: rule__RepeatSpec__ValueAssignment_2_0 : ( RULE_INT ) ;
    public final void rule__RepeatSpec__ValueAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5875:1: ( ( RULE_INT ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5876:1: ( RULE_INT )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5876:1: ( RULE_INT )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5877:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatSpecAccess().getValueINTTerminalRuleCall_2_0_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__RepeatSpec__ValueAssignment_2_012316); if (state.failed) return ;
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5886:1: rule__RepeatSpec__BeforeEndAssignment_2_2 : ( ( 'before end' ) ) ;
    public final void rule__RepeatSpec__BeforeEndAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5890:1: ( ( ( 'before end' ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5891:1: ( ( 'before end' ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5891:1: ( ( 'before end' ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5892:1: ( 'before end' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatSpecAccess().getBeforeEndBeforeEndKeyword_2_2_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5893:1: ( 'before end' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5894:1: 'before end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatSpecAccess().getBeforeEndBeforeEndKeyword_2_2_0()); 
            }
            match(input,75,FOLLOW_75_in_rule__RepeatSpec__BeforeEndAssignment_2_212352); if (state.failed) return ;
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5909:1: rule__RepeatSpec__ValueAssignment_3_0 : ( RULE_INT ) ;
    public final void rule__RepeatSpec__ValueAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5913:1: ( ( RULE_INT ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5914:1: ( RULE_INT )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5914:1: ( RULE_INT )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5915:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatSpecAccess().getValueINTTerminalRuleCall_3_0_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__RepeatSpec__ValueAssignment_3_012391); if (state.failed) return ;
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5924:1: rule__RepeatSpec__BeforeGapAssignment_3_2 : ( ( 'before gap' ) ) ;
    public final void rule__RepeatSpec__BeforeGapAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5928:1: ( ( ( 'before gap' ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5929:1: ( ( 'before gap' ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5929:1: ( ( 'before gap' ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5930:1: ( 'before gap' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatSpecAccess().getBeforeGapBeforeGapKeyword_3_2_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5931:1: ( 'before gap' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5932:1: 'before gap'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatSpecAccess().getBeforeGapBeforeGapKeyword_3_2_0()); 
            }
            match(input,76,FOLLOW_76_in_rule__RepeatSpec__BeforeGapAssignment_3_212427); if (state.failed) return ;
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5947:1: rule__RepeatSpec__ValueAssignment_4_0 : ( RULE_INT ) ;
    public final void rule__RepeatSpec__ValueAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5951:1: ( ( RULE_INT ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5952:1: ( RULE_INT )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5952:1: ( RULE_INT )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5953:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatSpecAccess().getValueINTTerminalRuleCall_4_0_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__RepeatSpec__ValueAssignment_4_012466); if (state.failed) return ;
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5962:1: rule__RepeatSpec__BeforeMarkerAssignment_4_2 : ( ( 'before marker' ) ) ;
    public final void rule__RepeatSpec__BeforeMarkerAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5966:1: ( ( ( 'before marker' ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5967:1: ( ( 'before marker' ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5967:1: ( ( 'before marker' ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5968:1: ( 'before marker' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatSpecAccess().getBeforeMarkerBeforeMarkerKeyword_4_2_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5969:1: ( 'before marker' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5970:1: 'before marker'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatSpecAccess().getBeforeMarkerBeforeMarkerKeyword_4_2_0()); 
            }
            match(input,77,FOLLOW_77_in_rule__RepeatSpec__BeforeMarkerAssignment_4_212502); if (state.failed) return ;
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5985:1: rule__RepeatSpec__ValueAssignment_5_0 : ( RULE_INT ) ;
    public final void rule__RepeatSpec__ValueAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5989:1: ( ( RULE_INT ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5990:1: ( RULE_INT )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5990:1: ( RULE_INT )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5991:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatSpecAccess().getValueINTTerminalRuleCall_5_0_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__RepeatSpec__ValueAssignment_5_012541); if (state.failed) return ;
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6000:1: rule__RepeatSpec__TimesAssignment_5_1 : ( ( 'times' ) ) ;
    public final void rule__RepeatSpec__TimesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6004:1: ( ( ( 'times' ) ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6005:1: ( ( 'times' ) )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6005:1: ( ( 'times' ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6006:1: ( 'times' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatSpecAccess().getTimesTimesKeyword_5_1_0()); 
            }
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6007:1: ( 'times' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6008:1: 'times'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatSpecAccess().getTimesTimesKeyword_5_1_0()); 
            }
            match(input,78,FOLLOW_78_in_rule__RepeatSpec__TimesAssignment_5_112577); if (state.failed) return ;
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6023:1: rule__Repeat__OperationsAssignment_0_2 : ( ruleInlineOperation ) ;
    public final void rule__Repeat__OperationsAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6027:1: ( ( ruleInlineOperation ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6028:1: ( ruleInlineOperation )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6028:1: ( ruleInlineOperation )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6029:1: ruleInlineOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatAccess().getOperationsInlineOperationParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_ruleInlineOperation_in_rule__Repeat__OperationsAssignment_0_212616);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6038:1: rule__Repeat__OperationsAssignment_0_3_1 : ( ruleInlineOperation ) ;
    public final void rule__Repeat__OperationsAssignment_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6042:1: ( ( ruleInlineOperation ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6043:1: ( ruleInlineOperation )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6043:1: ( ruleInlineOperation )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6044:1: ruleInlineOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatAccess().getOperationsInlineOperationParserRuleCall_0_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleInlineOperation_in_rule__Repeat__OperationsAssignment_0_3_112647);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6053:1: rule__Repeat__SpecAssignment_0_6 : ( ruleRepeatSpec ) ;
    public final void rule__Repeat__SpecAssignment_0_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6057:1: ( ( ruleRepeatSpec ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6058:1: ( ruleRepeatSpec )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6058:1: ( ruleRepeatSpec )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6059:1: ruleRepeatSpec
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatAccess().getSpecRepeatSpecParserRuleCall_0_6_0()); 
            }
            pushFollow(FOLLOW_ruleRepeatSpec_in_rule__Repeat__SpecAssignment_0_612678);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6068:1: rule__Repeat__OperationsAssignment_1_1 : ( ruleInlineOperation ) ;
    public final void rule__Repeat__OperationsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6072:1: ( ( ruleInlineOperation ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6073:1: ( ruleInlineOperation )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6073:1: ( ruleInlineOperation )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6074:1: ruleInlineOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatAccess().getOperationsInlineOperationParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleInlineOperation_in_rule__Repeat__OperationsAssignment_1_112709);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6083:1: rule__Repeat__OperationsAssignment_1_2_1 : ( ruleInlineOperation ) ;
    public final void rule__Repeat__OperationsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6087:1: ( ( ruleInlineOperation ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6088:1: ( ruleInlineOperation )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6088:1: ( ruleInlineOperation )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6089:1: ruleInlineOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatAccess().getOperationsInlineOperationParserRuleCall_1_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleInlineOperation_in_rule__Repeat__OperationsAssignment_1_2_112740);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6098:1: rule__Repeat__SpecAssignment_1_6 : ( ruleRepeatSpec ) ;
    public final void rule__Repeat__SpecAssignment_1_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6102:1: ( ( ruleRepeatSpec ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6103:1: ( ruleRepeatSpec )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6103:1: ( ruleRepeatSpec )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6104:1: ruleRepeatSpec
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatAccess().getSpecRepeatSpecParserRuleCall_1_6_0()); 
            }
            pushFollow(FOLLOW_ruleRepeatSpec_in_rule__Repeat__SpecAssignment_1_612771);
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6113:1: rule__Range__MinAssignment_0 : ( RULE_INT ) ;
    public final void rule__Range__MinAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6117:1: ( ( RULE_INT ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6118:1: ( RULE_INT )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6118:1: ( RULE_INT )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6119:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getMinINTTerminalRuleCall_0_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Range__MinAssignment_012802); if (state.failed) return ;
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
    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6128:1: rule__Range__MaxAssignment_2 : ( RULE_INT ) ;
    public final void rule__Range__MaxAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6132:1: ( ( RULE_INT ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6133:1: ( RULE_INT )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6133:1: ( RULE_INT )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6134:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getMaxINTTerminalRuleCall_2_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Range__MaxAssignment_212833); if (state.failed) return ;
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

    // $ANTLR start synpred59_InternalKnittingExpressionLanguage
    public final void synpred59_InternalKnittingExpressionLanguage_fragment() throws RecognitionException {   
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2045:3: ( RULE_LF )
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:2045:3: RULE_LF
        {
        match(input,RULE_LF,FOLLOW_RULE_LF_in_synpred59_InternalKnittingExpressionLanguage4295); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred59_InternalKnittingExpressionLanguage

    // $ANTLR start synpred93_InternalKnittingExpressionLanguage
    public final void synpred93_InternalKnittingExpressionLanguage_fragment() throws RecognitionException {   
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4872:2: ( rule__Row__UnorderedGroup_1__0 )
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4872:2: rule__Row__UnorderedGroup_1__0
        {
        pushFollow(FOLLOW_rule__Row__UnorderedGroup_1__0_in_synpred93_InternalKnittingExpressionLanguage9889);
        rule__Row__UnorderedGroup_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred93_InternalKnittingExpressionLanguage

    // $ANTLR start synpred94_InternalKnittingExpressionLanguage
    public final void synpred94_InternalKnittingExpressionLanguage_fragment() throws RecognitionException {   
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4890:4: ( ({...}? => ( ( ( rule__Row__ShortRowAssignment_1_0 ) ) ) ) )
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4890:4: ({...}? => ( ( ( rule__Row__ShortRowAssignment_1_0 ) ) ) )
        {
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4890:4: ({...}? => ( ( ( rule__Row__ShortRowAssignment_1_0 ) ) ) )
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4891:5: {...}? => ( ( ( rule__Row__ShortRowAssignment_1_0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_1(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred94_InternalKnittingExpressionLanguage", "getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_1(), 0)");
        }
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4891:100: ( ( ( rule__Row__ShortRowAssignment_1_0 ) ) )
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4892:6: ( ( rule__Row__ShortRowAssignment_1_0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getRowAccess().getUnorderedGroup_1(), 0);
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4898:6: ( ( rule__Row__ShortRowAssignment_1_0 ) )
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4900:7: ( rule__Row__ShortRowAssignment_1_0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getRowAccess().getShortRowAssignment_1_0()); 
        }
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4901:7: ( rule__Row__ShortRowAssignment_1_0 )
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4901:8: rule__Row__ShortRowAssignment_1_0
        {
        pushFollow(FOLLOW_rule__Row__ShortRowAssignment_1_0_in_synpred94_InternalKnittingExpressionLanguage9976);
        rule__Row__ShortRowAssignment_1_0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred94_InternalKnittingExpressionLanguage

    // $ANTLR start synpred95_InternalKnittingExpressionLanguage
    public final void synpred95_InternalKnittingExpressionLanguage_fragment() throws RecognitionException {   
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4939:2: ( rule__Row__UnorderedGroup_1__1 )
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4939:2: rule__Row__UnorderedGroup_1__1
        {
        pushFollow(FOLLOW_rule__Row__UnorderedGroup_1__1_in_synpred95_InternalKnittingExpressionLanguage10129);
        rule__Row__UnorderedGroup_1__1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred95_InternalKnittingExpressionLanguage

    // $ANTLR start synpred96_InternalKnittingExpressionLanguage
    public final void synpred96_InternalKnittingExpressionLanguage_fragment() throws RecognitionException {   
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4968:2: ( rule__Row__UnorderedGroup_4__0 )
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4968:2: rule__Row__UnorderedGroup_4__0
        {
        pushFollow(FOLLOW_rule__Row__UnorderedGroup_4__0_in_synpred96_InternalKnittingExpressionLanguage10182);
        rule__Row__UnorderedGroup_4__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred96_InternalKnittingExpressionLanguage

    // $ANTLR start synpred97_InternalKnittingExpressionLanguage
    public final void synpred97_InternalKnittingExpressionLanguage_fragment() throws RecognitionException {   
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4986:4: ( ({...}? => ( ( ( rule__Row__SideAssignment_4_0 ) ) ) ) )
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4986:4: ({...}? => ( ( ( rule__Row__SideAssignment_4_0 ) ) ) )
        {
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4986:4: ({...}? => ( ( ( rule__Row__SideAssignment_4_0 ) ) ) )
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4987:5: {...}? => ( ( ( rule__Row__SideAssignment_4_0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_4(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred97_InternalKnittingExpressionLanguage", "getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_4(), 0)");
        }
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4987:100: ( ( ( rule__Row__SideAssignment_4_0 ) ) )
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4988:6: ( ( rule__Row__SideAssignment_4_0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getRowAccess().getUnorderedGroup_4(), 0);
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4994:6: ( ( rule__Row__SideAssignment_4_0 ) )
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4996:7: ( rule__Row__SideAssignment_4_0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getRowAccess().getSideAssignment_4_0()); 
        }
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4997:7: ( rule__Row__SideAssignment_4_0 )
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:4997:8: rule__Row__SideAssignment_4_0
        {
        pushFollow(FOLLOW_rule__Row__SideAssignment_4_0_in_synpred97_InternalKnittingExpressionLanguage10269);
        rule__Row__SideAssignment_4_0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred97_InternalKnittingExpressionLanguage

    // $ANTLR start synpred98_InternalKnittingExpressionLanguage
    public final void synpred98_InternalKnittingExpressionLanguage_fragment() throws RecognitionException {   
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5035:2: ( rule__Row__UnorderedGroup_4__1 )
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5035:2: rule__Row__UnorderedGroup_4__1
        {
        pushFollow(FOLLOW_rule__Row__UnorderedGroup_4__1_in_synpred98_InternalKnittingExpressionLanguage10422);
        rule__Row__UnorderedGroup_4__1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred98_InternalKnittingExpressionLanguage

    // $ANTLR start synpred99_InternalKnittingExpressionLanguage
    public final void synpred99_InternalKnittingExpressionLanguage_fragment() throws RecognitionException {   
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5064:2: ( rule__Knit__UnorderedGroup_4__0 )
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5064:2: rule__Knit__UnorderedGroup_4__0
        {
        pushFollow(FOLLOW_rule__Knit__UnorderedGroup_4__0_in_synpred99_InternalKnittingExpressionLanguage10475);
        rule__Knit__UnorderedGroup_4__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred99_InternalKnittingExpressionLanguage

    // $ANTLR start synpred100_InternalKnittingExpressionLanguage
    public final void synpred100_InternalKnittingExpressionLanguage_fragment() throws RecognitionException {   
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5082:4: ( ({...}? => ( ( ( rule__Knit__TogetherAssignment_4_0 ) ) ) ) )
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5082:4: ({...}? => ( ( ( rule__Knit__TogetherAssignment_4_0 ) ) ) )
        {
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5082:4: ({...}? => ( ( ( rule__Knit__TogetherAssignment_4_0 ) ) ) )
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5083:5: {...}? => ( ( ( rule__Knit__TogetherAssignment_4_0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getKnitAccess().getUnorderedGroup_4(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred100_InternalKnittingExpressionLanguage", "getUnorderedGroupHelper().canSelect(grammarAccess.getKnitAccess().getUnorderedGroup_4(), 0)");
        }
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5083:101: ( ( ( rule__Knit__TogetherAssignment_4_0 ) ) )
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5084:6: ( ( rule__Knit__TogetherAssignment_4_0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getKnitAccess().getUnorderedGroup_4(), 0);
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5090:6: ( ( rule__Knit__TogetherAssignment_4_0 ) )
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5092:7: ( rule__Knit__TogetherAssignment_4_0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getKnitAccess().getTogetherAssignment_4_0()); 
        }
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5093:7: ( rule__Knit__TogetherAssignment_4_0 )
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5093:8: rule__Knit__TogetherAssignment_4_0
        {
        pushFollow(FOLLOW_rule__Knit__TogetherAssignment_4_0_in_synpred100_InternalKnittingExpressionLanguage10562);
        rule__Knit__TogetherAssignment_4_0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred100_InternalKnittingExpressionLanguage

    // $ANTLR start synpred101_InternalKnittingExpressionLanguage
    public final void synpred101_InternalKnittingExpressionLanguage_fragment() throws RecognitionException {   
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5131:2: ( rule__Knit__UnorderedGroup_4__1 )
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5131:2: rule__Knit__UnorderedGroup_4__1
        {
        pushFollow(FOLLOW_rule__Knit__UnorderedGroup_4__1_in_synpred101_InternalKnittingExpressionLanguage10715);
        rule__Knit__UnorderedGroup_4__1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred101_InternalKnittingExpressionLanguage

    // $ANTLR start synpred102_InternalKnittingExpressionLanguage
    public final void synpred102_InternalKnittingExpressionLanguage_fragment() throws RecognitionException {   
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5160:2: ( rule__Purl__UnorderedGroup_4__0 )
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5160:2: rule__Purl__UnorderedGroup_4__0
        {
        pushFollow(FOLLOW_rule__Purl__UnorderedGroup_4__0_in_synpred102_InternalKnittingExpressionLanguage10768);
        rule__Purl__UnorderedGroup_4__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred102_InternalKnittingExpressionLanguage

    // $ANTLR start synpred103_InternalKnittingExpressionLanguage
    public final void synpred103_InternalKnittingExpressionLanguage_fragment() throws RecognitionException {   
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5178:4: ( ({...}? => ( ( ( rule__Purl__TogetherAssignment_4_0 ) ) ) ) )
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5178:4: ({...}? => ( ( ( rule__Purl__TogetherAssignment_4_0 ) ) ) )
        {
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5178:4: ({...}? => ( ( ( rule__Purl__TogetherAssignment_4_0 ) ) ) )
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5179:5: {...}? => ( ( ( rule__Purl__TogetherAssignment_4_0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPurlAccess().getUnorderedGroup_4(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred103_InternalKnittingExpressionLanguage", "getUnorderedGroupHelper().canSelect(grammarAccess.getPurlAccess().getUnorderedGroup_4(), 0)");
        }
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5179:101: ( ( ( rule__Purl__TogetherAssignment_4_0 ) ) )
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5180:6: ( ( rule__Purl__TogetherAssignment_4_0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getPurlAccess().getUnorderedGroup_4(), 0);
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5186:6: ( ( rule__Purl__TogetherAssignment_4_0 ) )
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5188:7: ( rule__Purl__TogetherAssignment_4_0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getPurlAccess().getTogetherAssignment_4_0()); 
        }
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5189:7: ( rule__Purl__TogetherAssignment_4_0 )
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5189:8: rule__Purl__TogetherAssignment_4_0
        {
        pushFollow(FOLLOW_rule__Purl__TogetherAssignment_4_0_in_synpred103_InternalKnittingExpressionLanguage10855);
        rule__Purl__TogetherAssignment_4_0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred103_InternalKnittingExpressionLanguage

    // $ANTLR start synpred104_InternalKnittingExpressionLanguage
    public final void synpred104_InternalKnittingExpressionLanguage_fragment() throws RecognitionException {   
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5227:2: ( rule__Purl__UnorderedGroup_4__1 )
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:5227:2: rule__Purl__UnorderedGroup_4__1
        {
        pushFollow(FOLLOW_rule__Purl__UnorderedGroup_4__1_in_synpred104_InternalKnittingExpressionLanguage11008);
        rule__Purl__UnorderedGroup_4__1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred104_InternalKnittingExpressionLanguage

    // Delegated rules

    public final boolean synpred95_InternalKnittingExpressionLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred95_InternalKnittingExpressionLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred97_InternalKnittingExpressionLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred97_InternalKnittingExpressionLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred59_InternalKnittingExpressionLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred59_InternalKnittingExpressionLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred102_InternalKnittingExpressionLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred102_InternalKnittingExpressionLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred94_InternalKnittingExpressionLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred94_InternalKnittingExpressionLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred93_InternalKnittingExpressionLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred93_InternalKnittingExpressionLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred99_InternalKnittingExpressionLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred99_InternalKnittingExpressionLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred103_InternalKnittingExpressionLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred103_InternalKnittingExpressionLanguage_fragment(); // can never throw exception
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
    public final boolean synpred96_InternalKnittingExpressionLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred96_InternalKnittingExpressionLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred101_InternalKnittingExpressionLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred101_InternalKnittingExpressionLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred98_InternalKnittingExpressionLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred98_InternalKnittingExpressionLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred100_InternalKnittingExpressionLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred100_InternalKnittingExpressionLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA23 dfa23 = new DFA23(this);
    static final String DFA23_eotS =
        "\12\uffff";
    static final String DFA23_eofS =
        "\12\uffff";
    static final String DFA23_minS =
        "\1\6\2\uffff\1\32\1\uffff\2\113\3\uffff";
    static final String DFA23_maxS =
        "\1\112\2\uffff\1\116\1\uffff\2\115\3\uffff";
    static final String DFA23_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\6\2\uffff\1\5\1\4\1\3";
    static final String DFA23_specialS =
        "\12\uffff}>";
    static final String[] DFA23_transitionS = {
            "\1\3\102\uffff\1\1\1\2",
            "",
            "",
            "\1\5\1\6\57\uffff\1\11\1\10\1\7\1\4",
            "",
            "\1\11\1\10\1\7",
            "\1\11\1\10\1\7",
            "",
            "",
            ""
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "1045:1: rule__RepeatSpec__Alternatives : ( ( ( rule__RepeatSpec__ToEndAssignment_0 ) ) | ( ( rule__RepeatSpec__ToMarkerAssignment_1 ) ) | ( ( rule__RepeatSpec__Group_2__0 ) ) | ( ( rule__RepeatSpec__Group_3__0 ) ) | ( ( rule__RepeatSpec__Group_4__0 ) ) | ( ( rule__RepeatSpec__Group_5__0 ) ) );";
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
    public static final BitSet FOLLOW_rule__Instruction__Group_2_0__0_in_rule__Instruction__Alternatives_2862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__Group_2_1__0_in_rule__Instruction__Alternatives_2880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Row__LabelAlternatives_2_0914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Row__LabelAlternatives_2_0934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Row__LabelAlternatives_2_0954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Row__LabelAlternatives_2_0974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__RangeAssignment_3_0_in_rule__Row__Alternatives_31008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group_3_1__0_in_rule__Row__Alternatives_31026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Row__SubsequentAlternatives_3_1_2_2_01060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Row__SubsequentAlternatives_3_1_2_2_01080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Row__Alternatives_3_1_2_31115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Row__Alternatives_3_1_2_31135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Row__SideAlternatives_4_0_01170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Row__SideAlternatives_4_0_01190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKnit_in_rule__InlineOperation__Alternatives1224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePurl_in_rule__InlineOperation__Alternatives1241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSlip_in_rule__InlineOperation__Alternatives1258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRepeat_in_rule__InlineOperation__Alternatives1275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Knit__Alternatives_01308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Knit__Alternatives_01328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Knit__Alternatives_01348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Knit__Alternatives_01368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Knit__Alternatives_31403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Knit__Alternatives_31423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Knit__ThroughTrailingLoopAlternatives_4_1_01458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Knit__ThroughTrailingLoopAlternatives_4_1_01478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Purl__Alternatives_01513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Purl__Alternatives_01533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Purl__Alternatives_01553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Purl__Alternatives_01573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Purl__Alternatives_31608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Purl__Alternatives_31628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Purl__ThroughTrailingLoopAlternatives_4_1_01663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Purl__ThroughTrailingLoopAlternatives_4_1_01683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Slip__ReverseAlternatives_1_01718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Slip__ReverseAlternatives_1_01738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Slip__ReverseAlternatives_1_01758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Slip__ReverseAlternatives_1_01778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Slip__Alternatives_21813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Slip__Alternatives_21833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Slip__Alternatives_21853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Slip__Alternatives_21873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Slip__Group_3_0__0_in_rule__Slip__Alternatives_31907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Slip__Alternatives_31926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Slip__Alternatives_3_0_11961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Slip__Alternatives_3_0_11981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Slip__KnitwiseAssignment_4_0_in_rule__Slip__Alternatives_42015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Slip__PurlwiseAssignment_4_1_in_rule__Slip__Alternatives_42033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Slip__KnitwiseAlternatives_4_0_02067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Slip__KnitwiseAlternatives_4_0_02087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Slip__PurlwiseAlternatives_4_1_02122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Slip__PurlwiseAlternatives_4_1_02142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Slip__YarnPositionAlternatives_5_02177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Slip__YarnPositionAlternatives_5_02197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RepeatSpec__ToEndAssignment_0_in_rule__RepeatSpec__Alternatives2231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RepeatSpec__ToMarkerAssignment_1_in_rule__RepeatSpec__Alternatives2249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RepeatSpec__Group_2__0_in_rule__RepeatSpec__Alternatives2267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RepeatSpec__Group_3__0_in_rule__RepeatSpec__Alternatives2285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RepeatSpec__Group_4__0_in_rule__RepeatSpec__Alternatives2303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RepeatSpec__Group_5__0_in_rule__RepeatSpec__Alternatives2321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__RepeatSpec__Alternatives_2_12355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__RepeatSpec__Alternatives_2_12375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__RepeatSpec__Alternatives_3_12410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__RepeatSpec__Alternatives_3_12430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__RepeatSpec__Alternatives_4_12465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__RepeatSpec__Alternatives_4_12485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repeat__Group_0__0_in_rule__Repeat__Alternatives2519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repeat__Group_1__0_in_rule__Repeat__Alternatives2537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Repeat__Alternatives_0_02571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Repeat__Alternatives_0_02591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Repeat__Alternatives_1_4_12626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Repeat__Alternatives_1_4_12646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pattern__Group__0__Impl_in_rule__Pattern__Group__02678 = new BitSet(new long[]{0x0008000000000080L,0x0000000000000038L});
    public static final BitSet FOLLOW_rule__Pattern__Group__1_in_rule__Pattern__Group__02681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LF_in_rule__Pattern__Group__0__Impl2709 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Pattern__Group__1__Impl_in_rule__Pattern__Group__12740 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Pattern__Group__2_in_rule__Pattern__Group__12743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pattern__ElementsAssignment_1_in_rule__Pattern__Group__1__Impl2772 = new BitSet(new long[]{0x0008000000000082L,0x0000000000000038L});
    public static final BitSet FOLLOW_rule__Pattern__ElementsAssignment_1_in_rule__Pattern__Group__1__Impl2784 = new BitSet(new long[]{0x0008000000000082L,0x0000000000000038L});
    public static final BitSet FOLLOW_rule__Pattern__Group__2__Impl_in_rule__Pattern__Group__22817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LF_in_rule__Pattern__Group__2__Impl2845 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Instruction__Group__0__Impl_in_rule__Instruction__Group__02882 = new BitSet(new long[]{0x0050000000000020L});
    public static final BitSet FOLLOW_rule__Instruction__Group__1_in_rule__Instruction__Group__02885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Instruction__Group__0__Impl2913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__Group__1__Impl_in_rule__Instruction__Group__12944 = new BitSet(new long[]{0x0050000000000020L});
    public static final BitSet FOLLOW_rule__Instruction__Group__2_in_rule__Instruction__Group__12947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__LabelAssignment_1_in_rule__Instruction__Group__1__Impl2974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__Group__2__Impl_in_rule__Instruction__Group__23005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__Alternatives_2_in_rule__Instruction__Group__2__Impl3032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__Group_2_0__0__Impl_in_rule__Instruction__Group_2_0__03068 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000038L});
    public static final BitSet FOLLOW_rule__Instruction__Group_2_0__1_in_rule__Instruction__Group_2_0__03071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Instruction__Group_2_0__0__Impl3099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__Group_2_0__1__Impl_in_rule__Instruction__Group_2_0__13130 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000038L});
    public static final BitSet FOLLOW_rule__Instruction__Group_2_0__2_in_rule__Instruction__Group_2_0__13133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LF_in_rule__Instruction__Group_2_0__1__Impl3161 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Instruction__Group_2_0__2__Impl_in_rule__Instruction__Group_2_0__23192 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rule__Instruction__Group_2_0__3_in_rule__Instruction__Group_2_0__23195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__RowsAssignment_2_0_2_in_rule__Instruction__Group_2_0__2__Impl3224 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000038L});
    public static final BitSet FOLLOW_rule__Instruction__RowsAssignment_2_0_2_in_rule__Instruction__Group_2_0__2__Impl3236 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000038L});
    public static final BitSet FOLLOW_rule__Instruction__Group_2_0__3__Impl_in_rule__Instruction__Group_2_0__33269 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Instruction__Group_2_0__4_in_rule__Instruction__Group_2_0__33272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__Instruction__Group_2_0__3__Impl3300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__Group_2_0__4__Impl_in_rule__Instruction__Group_2_0__43331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LF_in_rule__Instruction__Group_2_0__4__Impl3358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__Group_2_1__0__Impl_in_rule__Instruction__Group_2_1__03397 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Instruction__Group_2_1__1_in_rule__Instruction__Group_2_1__03400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Instruction__Group_2_1__0__Impl3428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__Group_2_1__1__Impl_in_rule__Instruction__Group_2_1__13459 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000038L});
    public static final BitSet FOLLOW_rule__Instruction__Group_2_1__2_in_rule__Instruction__Group_2_1__13462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LF_in_rule__Instruction__Group_2_1__1__Impl3489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__Group_2_1__2__Impl_in_rule__Instruction__Group_2_1__23518 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Instruction__Group_2_1__3_in_rule__Instruction__Group_2_1__23521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__RowsAssignment_2_1_2_in_rule__Instruction__Group_2_1__2__Impl3550 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000038L});
    public static final BitSet FOLLOW_rule__Instruction__RowsAssignment_2_1_2_in_rule__Instruction__Group_2_1__2__Impl3562 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000038L});
    public static final BitSet FOLLOW_rule__Instruction__Group_2_1__3__Impl_in_rule__Instruction__Group_2_1__33595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LF_in_rule__Instruction__Group_2_1__3__Impl3622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group__0__Impl_in_rule__Row__Group__03659 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000038L});
    public static final BitSet FOLLOW_rule__Row__Group__1_in_rule__Row__Group__03662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__NextRowAssignment_0_in_rule__Row__Group__0__Impl3689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group__1__Impl_in_rule__Row__Group__13720 = new BitSet(new long[]{0x000000000000F000L});
    public static final BitSet FOLLOW_rule__Row__Group__2_in_rule__Row__Group__13723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__UnorderedGroup_1_in_rule__Row__Group__1__Impl3750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group__2__Impl_in_rule__Row__Group__23780 = new BitSet(new long[]{0x0400000000300040L});
    public static final BitSet FOLLOW_rule__Row__Group__3_in_rule__Row__Group__23783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__LabelAssignment_2_in_rule__Row__Group__2__Impl3810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group__3__Impl_in_rule__Row__Group__33840 = new BitSet(new long[]{0x0400000000300040L});
    public static final BitSet FOLLOW_rule__Row__Group__4_in_rule__Row__Group__33843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Alternatives_3_in_rule__Row__Group__3__Impl3870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group__4__Impl_in_rule__Row__Group__43901 = new BitSet(new long[]{0x0840000000000000L});
    public static final BitSet FOLLOW_rule__Row__Group__5_in_rule__Row__Group__43904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__UnorderedGroup_4_in_rule__Row__Group__4__Impl3931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group__5__Impl_in_rule__Row__Group__53961 = new BitSet(new long[]{0x0840000000000000L});
    public static final BitSet FOLLOW_rule__Row__Group__6_in_rule__Row__Group__53964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group_5__0_in_rule__Row__Group__5__Impl3991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group__6__Impl_in_rule__Row__Group__64022 = new BitSet(new long[]{0x000603FFC3C00010L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__Row__Group__7_in_rule__Row__Group__64025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Row__Group__6__Impl4053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group__7__Impl_in_rule__Row__Group__74084 = new BitSet(new long[]{0x000603FFC3C00010L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__Row__Group__8_in_rule__Row__Group__74087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LF_in_rule__Row__Group__7__Impl4115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group__8__Impl_in_rule__Row__Group__84146 = new BitSet(new long[]{0x0080000000000010L});
    public static final BitSet FOLLOW_rule__Row__Group__9_in_rule__Row__Group__84149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__OperationsAssignment_8_in_rule__Row__Group__8__Impl4176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group__9__Impl_in_rule__Row__Group__94206 = new BitSet(new long[]{0x0080000000000010L});
    public static final BitSet FOLLOW_rule__Row__Group__10_in_rule__Row__Group__94209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group_9__0_in_rule__Row__Group__9__Impl4236 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group__10__Impl_in_rule__Row__Group__104267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LF_in_rule__Row__Group__10__Impl4295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group_3_1__0__Impl_in_rule__Row__Group_3_1__04348 = new BitSet(new long[]{0x0180000000000000L});
    public static final BitSet FOLLOW_rule__Row__Group_3_1__1_in_rule__Row__Group_3_1__04351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__NumberAssignment_3_1_0_in_rule__Row__Group_3_1__0__Impl4378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group_3_1__1__Impl_in_rule__Row__Group_3_1__14408 = new BitSet(new long[]{0x0180000000000000L});
    public static final BitSet FOLLOW_rule__Row__Group_3_1__2_in_rule__Row__Group_3_1__14411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group_3_1_1__0_in_rule__Row__Group_3_1__1__Impl4438 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group_3_1__2__Impl_in_rule__Row__Group_3_1__24469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group_3_1_2__0_in_rule__Row__Group_3_1__2__Impl4496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group_3_1_1__0__Impl_in_rule__Row__Group_3_1_1__04533 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Row__Group_3_1_1__1_in_rule__Row__Group_3_1_1__04536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__Row__Group_3_1_1__0__Impl4564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group_3_1_1__1__Impl_in_rule__Row__Group_3_1_1__14595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__NumberAssignment_3_1_1_1_in_rule__Row__Group_3_1_1__1__Impl4622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group_3_1_2__0__Impl_in_rule__Row__Group_3_1_2__04656 = new BitSet(new long[]{0x0200000000030000L});
    public static final BitSet FOLLOW_rule__Row__Group_3_1_2__1_in_rule__Row__Group_3_1_2__04659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__Row__Group_3_1_2__0__Impl4687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group_3_1_2__1__Impl_in_rule__Row__Group_3_1_2__14718 = new BitSet(new long[]{0x0200000000030000L});
    public static final BitSet FOLLOW_rule__Row__Group_3_1_2__2_in_rule__Row__Group_3_1_2__14721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__Row__Group_3_1_2__1__Impl4750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group_3_1_2__2__Impl_in_rule__Row__Group_3_1_2__24783 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__Row__Group_3_1_2__3_in_rule__Row__Group_3_1_2__24786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__SubsequentAssignment_3_1_2_2_in_rule__Row__Group_3_1_2__2__Impl4813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group_3_1_2__3__Impl_in_rule__Row__Group_3_1_2__34843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Alternatives_3_1_2_3_in_rule__Row__Group_3_1_2__3__Impl4870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group_4_1__0__Impl_in_rule__Row__Group_4_1__04909 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Row__Group_4_1__1_in_rule__Row__Group_4_1__04912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__Row__Group_4_1__0__Impl4940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group_4_1__1__Impl_in_rule__Row__Group_4_1__14971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__YarnRefAssignment_4_1_1_in_rule__Row__Group_4_1__1__Impl4998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group_5__0__Impl_in_rule__Row__Group_5__05032 = new BitSet(new long[]{0x1080000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__Row__Group_5__1_in_rule__Row__Group_5__05035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__Row__Group_5__0__Impl5063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group_5__1__Impl_in_rule__Row__Group_5__15094 = new BitSet(new long[]{0x1080000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__Row__Group_5__2_in_rule__Row__Group_5__15097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group_5_1__0_in_rule__Row__Group_5__1__Impl5124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group_5__2__Impl_in_rule__Row__Group_5__25155 = new BitSet(new long[]{0x1080000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__Row__Group_5__3_in_rule__Row__Group_5__25158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group_5_2__0_in_rule__Row__Group_5__2__Impl5185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group_5__3__Impl_in_rule__Row__Group_5__35216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__Row__Group_5__3__Impl5244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group_5_1__0__Impl_in_rule__Row__Group_5_1__05283 = new BitSet(new long[]{0x0080000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Row__Group_5_1__1_in_rule__Row__Group_5_1__05286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__Row__Group_5_1__0__Impl5315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group_5_1__1__Impl_in_rule__Row__Group_5_1__15348 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__Row__Group_5_1__2_in_rule__Row__Group_5_1__15351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__InformAssignment_5_1_1_in_rule__Row__Group_5_1__1__Impl5378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group_5_1__2__Impl_in_rule__Row__Group_5_1__25408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__Row__Group_5_1__2__Impl5437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group_5_2__0__Impl_in_rule__Row__Group_5_2__05476 = new BitSet(new long[]{0x0080000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Row__Group_5_2__1_in_rule__Row__Group_5_2__05479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__Row__Group_5_2__0__Impl5508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group_5_2__1__Impl_in_rule__Row__Group_5_2__15541 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_rule__Row__Group_5_2__2_in_rule__Row__Group_5_2__15544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__ResetAssignment_5_2_1_in_rule__Row__Group_5_2__1__Impl5571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group_5_2__2__Impl_in_rule__Row__Group_5_2__25601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__Row__Group_5_2__2__Impl5630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group_9__0__Impl_in_rule__Row__Group_9__05669 = new BitSet(new long[]{0x000603FFC3C00010L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__Row__Group_9__1_in_rule__Row__Group_9__05672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__Row__Group_9__0__Impl5700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group_9__1__Impl_in_rule__Row__Group_9__15731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__OperationsAssignment_9_1_in_rule__Row__Group_9__1__Impl5758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__0__Impl_in_rule__Message__Group__05792 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Message__Group__1_in_rule__Message__Group__05795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__MessageAssignment_0_in_rule__Message__Group__0__Impl5822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__1__Impl_in_rule__Message__Group__15852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LF_in_rule__Message__Group__1__Impl5879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knit__Group__0__Impl_in_rule__Knit__Group__05912 = new BitSet(new long[]{0x000000003C000040L,0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Knit__Group__1_in_rule__Knit__Group__05915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knit__Alternatives_0_in_rule__Knit__Group__0__Impl5942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knit__Group__1__Impl_in_rule__Knit__Group__15972 = new BitSet(new long[]{0x000000003C000040L,0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Knit__Group__2_in_rule__Knit__Group__15975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knit__Group__2__Impl_in_rule__Knit__Group__26033 = new BitSet(new long[]{0x000000003C000040L,0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Knit__Group__3_in_rule__Knit__Group__26036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knit__NumberAssignment_2_in_rule__Knit__Group__2__Impl6063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knit__Group__3__Impl_in_rule__Knit__Group__36094 = new BitSet(new long[]{0x000000003C000040L,0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Knit__Group__4_in_rule__Knit__Group__36097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knit__Alternatives_3_in_rule__Knit__Group__3__Impl6124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knit__Group__4__Impl_in_rule__Knit__Group__46155 = new BitSet(new long[]{0x8400000000000040L,0x0000000000000600L});
    public static final BitSet FOLLOW_rule__Knit__Group__5_in_rule__Knit__Group__46158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knit__UnorderedGroup_4_in_rule__Knit__Group__4__Impl6185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knit__Group__5__Impl_in_rule__Knit__Group__56215 = new BitSet(new long[]{0x8400000000000040L,0x0000000000000600L});
    public static final BitSet FOLLOW_rule__Knit__Group__6_in_rule__Knit__Group__56218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knit__Group_5__0_in_rule__Knit__Group__5__Impl6245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knit__Group__6__Impl_in_rule__Knit__Group__66276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knit__Group_6__0_in_rule__Knit__Group__6__Impl6303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knit__Group_5__0__Impl_in_rule__Knit__Group_5__06348 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Knit__Group_5__1_in_rule__Knit__Group_5__06351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__Knit__Group_5__0__Impl6379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knit__Group_5__1__Impl_in_rule__Knit__Group_5__16410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knit__YarnRefAssignment_5_1_in_rule__Knit__Group_5__1__Impl6437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knit__Group_6__0__Impl_in_rule__Knit__Group_6__06471 = new BitSet(new long[]{0x8000000000000040L,0x0000000000000600L});
    public static final BitSet FOLLOW_rule__Knit__Group_6__1_in_rule__Knit__Group_6__06474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__Knit__Group_6__0__Impl6503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knit__Group_6__1__Impl_in_rule__Knit__Group_6__16536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knit__RepeatAssignment_6_1_in_rule__Knit__Group_6__1__Impl6563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Purl__Group__0__Impl_in_rule__Purl__Group__06597 = new BitSet(new long[]{0x000000003C000040L,0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Purl__Group__1_in_rule__Purl__Group__06600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Purl__Alternatives_0_in_rule__Purl__Group__0__Impl6627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Purl__Group__1__Impl_in_rule__Purl__Group__16657 = new BitSet(new long[]{0x000000003C000040L,0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Purl__Group__2_in_rule__Purl__Group__16660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Purl__Group__2__Impl_in_rule__Purl__Group__26718 = new BitSet(new long[]{0x000000003C000040L,0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Purl__Group__3_in_rule__Purl__Group__26721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Purl__NumberAssignment_2_in_rule__Purl__Group__2__Impl6748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Purl__Group__3__Impl_in_rule__Purl__Group__36779 = new BitSet(new long[]{0x000000003C000040L,0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Purl__Group__4_in_rule__Purl__Group__36782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Purl__Alternatives_3_in_rule__Purl__Group__3__Impl6809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Purl__Group__4__Impl_in_rule__Purl__Group__46840 = new BitSet(new long[]{0x8400000000000040L,0x0000000000000600L});
    public static final BitSet FOLLOW_rule__Purl__Group__5_in_rule__Purl__Group__46843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Purl__UnorderedGroup_4_in_rule__Purl__Group__4__Impl6870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Purl__Group__5__Impl_in_rule__Purl__Group__56900 = new BitSet(new long[]{0x8400000000000040L,0x0000000000000600L});
    public static final BitSet FOLLOW_rule__Purl__Group__6_in_rule__Purl__Group__56903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Purl__Group_5__0_in_rule__Purl__Group__5__Impl6930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Purl__Group__6__Impl_in_rule__Purl__Group__66961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Purl__Group_6__0_in_rule__Purl__Group__6__Impl6988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Purl__Group_5__0__Impl_in_rule__Purl__Group_5__07033 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Purl__Group_5__1_in_rule__Purl__Group_5__07036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__Purl__Group_5__0__Impl7064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Purl__Group_5__1__Impl_in_rule__Purl__Group_5__17095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Purl__YarnRefAssignment_5_1_in_rule__Purl__Group_5__1__Impl7122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Purl__Group_6__0__Impl_in_rule__Purl__Group_6__07156 = new BitSet(new long[]{0x8000000000000040L,0x0000000000000600L});
    public static final BitSet FOLLOW_rule__Purl__Group_6__1_in_rule__Purl__Group_6__07159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__Purl__Group_6__0__Impl7188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Purl__Group_6__1__Impl_in_rule__Purl__Group_6__17221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Purl__RepeatAssignment_6_1_in_rule__Purl__Group_6__1__Impl7248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Slip__Group__0__Impl_in_rule__Slip__Group__07282 = new BitSet(new long[]{0x000003FC00000000L});
    public static final BitSet FOLLOW_rule__Slip__Group__1_in_rule__Slip__Group__07285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Slip__Group__1__Impl_in_rule__Slip__Group__17343 = new BitSet(new long[]{0x000003FC00000000L});
    public static final BitSet FOLLOW_rule__Slip__Group__2_in_rule__Slip__Group__17346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Slip__ReverseAssignment_1_in_rule__Slip__Group__1__Impl7373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Slip__Group__2__Impl_in_rule__Slip__Group__27404 = new BitSet(new long[]{0x0001FC0000000040L});
    public static final BitSet FOLLOW_rule__Slip__Group__3_in_rule__Slip__Group__27407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Slip__Alternatives_2_in_rule__Slip__Group__2__Impl7434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Slip__Group__3__Impl_in_rule__Slip__Group__37464 = new BitSet(new long[]{0x0001FC0000000040L});
    public static final BitSet FOLLOW_rule__Slip__Group__4_in_rule__Slip__Group__37467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Slip__Alternatives_3_in_rule__Slip__Group__3__Impl7494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Slip__Group__4__Impl_in_rule__Slip__Group__47525 = new BitSet(new long[]{0x0001FC0000000040L});
    public static final BitSet FOLLOW_rule__Slip__Group__5_in_rule__Slip__Group__47528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Slip__Alternatives_4_in_rule__Slip__Group__4__Impl7555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Slip__Group__5__Impl_in_rule__Slip__Group__57586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Slip__YarnPositionAssignment_5_in_rule__Slip__Group__5__Impl7613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Slip__Group_3_0__0__Impl_in_rule__Slip__Group_3_0__07656 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_rule__Slip__Group_3_0__1_in_rule__Slip__Group_3_0__07659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Slip__NumberAssignment_3_0_0_in_rule__Slip__Group_3_0__0__Impl7686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Slip__Group_3_0__1__Impl_in_rule__Slip__Group_3_0__17716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Slip__Alternatives_3_0_1_in_rule__Slip__Group_3_0__1__Impl7743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RepeatSpec__Group_2__0__Impl_in_rule__RepeatSpec__Group_2__07778 = new BitSet(new long[]{0x000000000C000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_rule__RepeatSpec__Group_2__1_in_rule__RepeatSpec__Group_2__07781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RepeatSpec__ValueAssignment_2_0_in_rule__RepeatSpec__Group_2__0__Impl7808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RepeatSpec__Group_2__1__Impl_in_rule__RepeatSpec__Group_2__17838 = new BitSet(new long[]{0x000000000C000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_rule__RepeatSpec__Group_2__2_in_rule__RepeatSpec__Group_2__17841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RepeatSpec__Alternatives_2_1_in_rule__RepeatSpec__Group_2__1__Impl7868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RepeatSpec__Group_2__2__Impl_in_rule__RepeatSpec__Group_2__27899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RepeatSpec__BeforeEndAssignment_2_2_in_rule__RepeatSpec__Group_2__2__Impl7926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RepeatSpec__Group_3__0__Impl_in_rule__RepeatSpec__Group_3__07962 = new BitSet(new long[]{0x000000000C000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_rule__RepeatSpec__Group_3__1_in_rule__RepeatSpec__Group_3__07965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RepeatSpec__ValueAssignment_3_0_in_rule__RepeatSpec__Group_3__0__Impl7992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RepeatSpec__Group_3__1__Impl_in_rule__RepeatSpec__Group_3__18022 = new BitSet(new long[]{0x000000000C000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_rule__RepeatSpec__Group_3__2_in_rule__RepeatSpec__Group_3__18025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RepeatSpec__Alternatives_3_1_in_rule__RepeatSpec__Group_3__1__Impl8052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RepeatSpec__Group_3__2__Impl_in_rule__RepeatSpec__Group_3__28083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RepeatSpec__BeforeGapAssignment_3_2_in_rule__RepeatSpec__Group_3__2__Impl8110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RepeatSpec__Group_4__0__Impl_in_rule__RepeatSpec__Group_4__08146 = new BitSet(new long[]{0x000000000C000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_rule__RepeatSpec__Group_4__1_in_rule__RepeatSpec__Group_4__08149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RepeatSpec__ValueAssignment_4_0_in_rule__RepeatSpec__Group_4__0__Impl8176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RepeatSpec__Group_4__1__Impl_in_rule__RepeatSpec__Group_4__18206 = new BitSet(new long[]{0x000000000C000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_rule__RepeatSpec__Group_4__2_in_rule__RepeatSpec__Group_4__18209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RepeatSpec__Alternatives_4_1_in_rule__RepeatSpec__Group_4__1__Impl8236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RepeatSpec__Group_4__2__Impl_in_rule__RepeatSpec__Group_4__28267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RepeatSpec__BeforeMarkerAssignment_4_2_in_rule__RepeatSpec__Group_4__2__Impl8294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RepeatSpec__Group_5__0__Impl_in_rule__RepeatSpec__Group_5__08330 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_rule__RepeatSpec__Group_5__1_in_rule__RepeatSpec__Group_5__08333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RepeatSpec__ValueAssignment_5_0_in_rule__RepeatSpec__Group_5__0__Impl8360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RepeatSpec__Group_5__1__Impl_in_rule__RepeatSpec__Group_5__18390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RepeatSpec__TimesAssignment_5_1_in_rule__RepeatSpec__Group_5__1__Impl8417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repeat__Group_0__0__Impl_in_rule__Repeat__Group_0__08451 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__Repeat__Group_0__1_in_rule__Repeat__Group_0__08454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repeat__Alternatives_0_0_in_rule__Repeat__Group_0__0__Impl8481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repeat__Group_0__1__Impl_in_rule__Repeat__Group_0__18511 = new BitSet(new long[]{0x000603FFC3C00010L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__Repeat__Group_0__2_in_rule__Repeat__Group_0__18514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__Repeat__Group_0__1__Impl8542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repeat__Group_0__2__Impl_in_rule__Repeat__Group_0__28573 = new BitSet(new long[]{0x0080000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repeat__Group_0__3_in_rule__Repeat__Group_0__28576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repeat__OperationsAssignment_0_2_in_rule__Repeat__Group_0__2__Impl8603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repeat__Group_0__3__Impl_in_rule__Repeat__Group_0__38633 = new BitSet(new long[]{0x0080000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repeat__Group_0__4_in_rule__Repeat__Group_0__38636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repeat__Group_0_3__0_in_rule__Repeat__Group_0__3__Impl8663 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_rule__Repeat__Group_0__4__Impl_in_rule__Repeat__Group_0__48694 = new BitSet(new long[]{0x8000000000000040L,0x0000000000000600L});
    public static final BitSet FOLLOW_rule__Repeat__Group_0__5_in_rule__Repeat__Group_0__48697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rule__Repeat__Group_0__4__Impl8725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repeat__Group_0__5__Impl_in_rule__Repeat__Group_0__58756 = new BitSet(new long[]{0x8000000000000040L,0x0000000000000600L});
    public static final BitSet FOLLOW_rule__Repeat__Group_0__6_in_rule__Repeat__Group_0__58759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__Repeat__Group_0__5__Impl8788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repeat__Group_0__6__Impl_in_rule__Repeat__Group_0__68821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repeat__SpecAssignment_0_6_in_rule__Repeat__Group_0__6__Impl8848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repeat__Group_0_3__0__Impl_in_rule__Repeat__Group_0_3__08892 = new BitSet(new long[]{0x000603FFC3C00010L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__Repeat__Group_0_3__1_in_rule__Repeat__Group_0_3__08895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__Repeat__Group_0_3__0__Impl8923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repeat__Group_0_3__1__Impl_in_rule__Repeat__Group_0_3__18954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repeat__OperationsAssignment_0_3_1_in_rule__Repeat__Group_0_3__1__Impl8981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repeat__Group_1__0__Impl_in_rule__Repeat__Group_1__09015 = new BitSet(new long[]{0x000603FFC3C00010L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__Repeat__Group_1__1_in_rule__Repeat__Group_1__09018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__Repeat__Group_1__0__Impl9046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repeat__Group_1__1__Impl_in_rule__Repeat__Group_1__19077 = new BitSet(new long[]{0x0080000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repeat__Group_1__2_in_rule__Repeat__Group_1__19080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repeat__OperationsAssignment_1_1_in_rule__Repeat__Group_1__1__Impl9107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repeat__Group_1__2__Impl_in_rule__Repeat__Group_1__29137 = new BitSet(new long[]{0x0080000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repeat__Group_1__3_in_rule__Repeat__Group_1__29140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repeat__Group_1_2__0_in_rule__Repeat__Group_1__2__Impl9167 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_rule__Repeat__Group_1__3__Impl_in_rule__Repeat__Group_1__39198 = new BitSet(new long[]{0x8080000000000040L,0x0000000000000600L});
    public static final BitSet FOLLOW_rule__Repeat__Group_1__4_in_rule__Repeat__Group_1__39201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rule__Repeat__Group_1__3__Impl9229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repeat__Group_1__4__Impl_in_rule__Repeat__Group_1__49260 = new BitSet(new long[]{0x8080000000000040L,0x0000000000000600L});
    public static final BitSet FOLLOW_rule__Repeat__Group_1__5_in_rule__Repeat__Group_1__49263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repeat__Group_1_4__0_in_rule__Repeat__Group_1__4__Impl9290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repeat__Group_1__5__Impl_in_rule__Repeat__Group_1__59321 = new BitSet(new long[]{0x8080000000000040L,0x0000000000000600L});
    public static final BitSet FOLLOW_rule__Repeat__Group_1__6_in_rule__Repeat__Group_1__59324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__Repeat__Group_1__5__Impl9353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repeat__Group_1__6__Impl_in_rule__Repeat__Group_1__69386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repeat__SpecAssignment_1_6_in_rule__Repeat__Group_1__6__Impl9413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repeat__Group_1_2__0__Impl_in_rule__Repeat__Group_1_2__09457 = new BitSet(new long[]{0x000603FFC3C00010L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__Repeat__Group_1_2__1_in_rule__Repeat__Group_1_2__09460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__Repeat__Group_1_2__0__Impl9488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repeat__Group_1_2__1__Impl_in_rule__Repeat__Group_1_2__19519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repeat__OperationsAssignment_1_2_1_in_rule__Repeat__Group_1_2__1__Impl9546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repeat__Group_1_4__0__Impl_in_rule__Repeat__Group_1_4__09580 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_rule__Repeat__Group_1_4__1_in_rule__Repeat__Group_1_4__09583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__Repeat__Group_1_4__0__Impl9611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repeat__Group_1_4__1__Impl_in_rule__Repeat__Group_1_4__19642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repeat__Alternatives_1_4_1_in_rule__Repeat__Group_1_4__1__Impl9669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__Group__0__Impl_in_rule__Range__Group__09703 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rule__Range__Group__1_in_rule__Range__Group__09706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__MinAssignment_0_in_rule__Range__Group__0__Impl9733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__Group__1__Impl_in_rule__Range__Group__19763 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Range__Group__2_in_rule__Range__Group__19766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rule__Range__Group__1__Impl9794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__Group__2__Impl_in_rule__Range__Group__29825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__MaxAssignment_2_in_rule__Range__Group__2__Impl9852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__UnorderedGroup_1__0_in_rule__Row__UnorderedGroup_19889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__ShortRowAssignment_1_0_in_rule__Row__UnorderedGroup_1__Impl9976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__LongRowAssignment_1_1_in_rule__Row__UnorderedGroup_1__Impl10067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__UnorderedGroup_1__Impl_in_rule__Row__UnorderedGroup_1__010126 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Row__UnorderedGroup_1__1_in_rule__Row__UnorderedGroup_1__010129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__UnorderedGroup_1__Impl_in_rule__Row__UnorderedGroup_1__110154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__UnorderedGroup_4__0_in_rule__Row__UnorderedGroup_410182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__SideAssignment_4_0_in_rule__Row__UnorderedGroup_4__Impl10269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__Group_4_1__0_in_rule__Row__UnorderedGroup_4__Impl10360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__UnorderedGroup_4__Impl_in_rule__Row__UnorderedGroup_4__010419 = new BitSet(new long[]{0x0400000000300002L});
    public static final BitSet FOLLOW_rule__Row__UnorderedGroup_4__1_in_rule__Row__UnorderedGroup_4__010422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__UnorderedGroup_4__Impl_in_rule__Row__UnorderedGroup_4__110447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knit__UnorderedGroup_4__0_in_rule__Knit__UnorderedGroup_410475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knit__TogetherAssignment_4_0_in_rule__Knit__UnorderedGroup_4__Impl10562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knit__ThroughTrailingLoopAssignment_4_1_in_rule__Knit__UnorderedGroup_4__Impl10653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knit__UnorderedGroup_4__Impl_in_rule__Knit__UnorderedGroup_4__010712 = new BitSet(new long[]{0x0000000030000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Knit__UnorderedGroup_4__1_in_rule__Knit__UnorderedGroup_4__010715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knit__UnorderedGroup_4__Impl_in_rule__Knit__UnorderedGroup_4__110740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Purl__UnorderedGroup_4__0_in_rule__Purl__UnorderedGroup_410768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Purl__TogetherAssignment_4_0_in_rule__Purl__UnorderedGroup_4__Impl10855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Purl__ThroughTrailingLoopAssignment_4_1_in_rule__Purl__UnorderedGroup_4__Impl10946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Purl__UnorderedGroup_4__Impl_in_rule__Purl__UnorderedGroup_4__011005 = new BitSet(new long[]{0x0000000030000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Purl__UnorderedGroup_4__1_in_rule__Purl__UnorderedGroup_4__011008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Purl__UnorderedGroup_4__Impl_in_rule__Purl__UnorderedGroup_4__111033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockOperation_in_rule__Pattern__ElementsAssignment_111065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Instruction__LabelAssignment_111096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRow_in_rule__Instruction__RowsAssignment_2_0_211127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRow_in_rule__Instruction__RowsAssignment_2_1_211158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rule__Row__NextRowAssignment_011194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_rule__Row__ShortRowAssignment_1_011238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_rule__Row__LongRowAssignment_1_111282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__LabelAlternatives_2_0_in_rule__Row__LabelAssignment_211321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRange_in_rule__Row__RangeAssignment_3_011354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Row__NumberAssignment_3_1_011385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Row__NumberAssignment_3_1_1_111416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__SubsequentAlternatives_3_1_2_2_0_in_rule__Row__SubsequentAssignment_3_1_2_211447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__SideAlternatives_4_0_0_in_rule__Row__SideAssignment_4_011480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Row__YarnRefAssignment_4_1_111513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_rule__Row__InformAssignment_5_1_111549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_rule__Row__ResetAssignment_5_2_111593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInlineOperation_in_rule__Row__OperationsAssignment_811632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInlineOperation_in_rule__Row__OperationsAssignment_9_111663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Message__MessageAssignment_011694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Knit__NumberAssignment_211725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_rule__Knit__TogetherAssignment_4_011761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knit__ThroughTrailingLoopAlternatives_4_1_0_in_rule__Knit__ThroughTrailingLoopAssignment_4_111800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Knit__YarnRefAssignment_5_111833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRepeatSpec_in_rule__Knit__RepeatAssignment_6_111864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Purl__NumberAssignment_211895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_rule__Purl__TogetherAssignment_4_011931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Purl__ThroughTrailingLoopAlternatives_4_1_0_in_rule__Purl__ThroughTrailingLoopAssignment_4_111970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Purl__YarnRefAssignment_5_112003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRepeatSpec_in_rule__Purl__RepeatAssignment_6_112034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Slip__ReverseAlternatives_1_0_in_rule__Slip__ReverseAssignment_112065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Slip__NumberAssignment_3_0_012098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Slip__KnitwiseAlternatives_4_0_0_in_rule__Slip__KnitwiseAssignment_4_012129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Slip__PurlwiseAlternatives_4_1_0_in_rule__Slip__PurlwiseAssignment_4_112162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Slip__YarnPositionAlternatives_5_0_in_rule__Slip__YarnPositionAssignment_512195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_rule__RepeatSpec__ToEndAssignment_012233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_rule__RepeatSpec__ToMarkerAssignment_112277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__RepeatSpec__ValueAssignment_2_012316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_rule__RepeatSpec__BeforeEndAssignment_2_212352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__RepeatSpec__ValueAssignment_3_012391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_rule__RepeatSpec__BeforeGapAssignment_3_212427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__RepeatSpec__ValueAssignment_4_012466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_rule__RepeatSpec__BeforeMarkerAssignment_4_212502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__RepeatSpec__ValueAssignment_5_012541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_rule__RepeatSpec__TimesAssignment_5_112577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInlineOperation_in_rule__Repeat__OperationsAssignment_0_212616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInlineOperation_in_rule__Repeat__OperationsAssignment_0_3_112647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRepeatSpec_in_rule__Repeat__SpecAssignment_0_612678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInlineOperation_in_rule__Repeat__OperationsAssignment_1_112709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInlineOperation_in_rule__Repeat__OperationsAssignment_1_2_112740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRepeatSpec_in_rule__Repeat__SpecAssignment_1_612771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Range__MinAssignment_012802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Range__MaxAssignment_212833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LF_in_synpred59_InternalKnittingExpressionLanguage4295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__UnorderedGroup_1__0_in_synpred93_InternalKnittingExpressionLanguage9889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__ShortRowAssignment_1_0_in_synpred94_InternalKnittingExpressionLanguage9976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__UnorderedGroup_1__1_in_synpred95_InternalKnittingExpressionLanguage10129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__UnorderedGroup_4__0_in_synpred96_InternalKnittingExpressionLanguage10182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__SideAssignment_4_0_in_synpred97_InternalKnittingExpressionLanguage10269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Row__UnorderedGroup_4__1_in_synpred98_InternalKnittingExpressionLanguage10422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knit__UnorderedGroup_4__0_in_synpred99_InternalKnittingExpressionLanguage10475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knit__TogetherAssignment_4_0_in_synpred100_InternalKnittingExpressionLanguage10562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knit__UnorderedGroup_4__1_in_synpred101_InternalKnittingExpressionLanguage10715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Purl__UnorderedGroup_4__0_in_synpred102_InternalKnittingExpressionLanguage10768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Purl__TogetherAssignment_4_0_in_synpred103_InternalKnittingExpressionLanguage10855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Purl__UnorderedGroup_4__1_in_synpred104_InternalKnittingExpressionLanguage11008 = new BitSet(new long[]{0x0000000000000002L});

}
