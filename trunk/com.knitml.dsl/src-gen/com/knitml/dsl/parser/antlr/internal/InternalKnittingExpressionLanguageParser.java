package com.knitml.dsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.knitml.dsl.services.KnittingExpressionLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalKnittingExpressionLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_LF", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Instruction'", "'{'", "'}'", "':'", "'Next'", "'Short'", "'Long'", "'Row'", "'Round'", "'Rows'", "'Rounds'", "','", "'and'", "'all'", "'even'", "'odd'", "'rows'", "'rounds'", "'WS'", "'RS'", "'with'", "'('", "'inform'", "'side'", "'reset'", "'count'", "')'", "'K'", "'k'", "'Knit'", "'knit'", "'st'", "'sts'", "'tog'", "'tbl'", "'ttl'", "'to'", "'P'", "'p'", "'Purl'", "'purl'", "'Rev'", "'Reverse'", "'rev'", "'reverse'", "'Sl'", "'sl'", "'Slip'", "'slip'", "'next st'", "'kw'", "'knitwise'", "'pw'", "'purlwise'", "'wyif'", "'wyib'", "'end'", "'marker'", "'before end'", "'before gap'", "'before marker'", "'times'", "'Repeat'", "'repeat'", "'['", "']'", "'-'"
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
    public String getGrammarFileName() { return "../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g"; }



     	private KnittingExpressionLanguageGrammarAccess grammarAccess;
     	
        public InternalKnittingExpressionLanguageParser(TokenStream input, KnittingExpressionLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Pattern";	
       	}
       	
       	@Override
       	protected KnittingExpressionLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRulePattern"
    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:67:1: entryRulePattern returns [EObject current=null] : iv_rulePattern= rulePattern EOF ;
    public final EObject entryRulePattern() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePattern = null;


        try {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:68:2: (iv_rulePattern= rulePattern EOF )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:69:2: iv_rulePattern= rulePattern EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPatternRule()); 
            }
            pushFollow(FOLLOW_rulePattern_in_entryRulePattern75);
            iv_rulePattern=rulePattern();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePattern; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePattern85); if (state.failed) return current;

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
    // $ANTLR end "entryRulePattern"


    // $ANTLR start "rulePattern"
    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:76:1: rulePattern returns [EObject current=null] : ( (this_LF_0= RULE_LF )* ( (lv_elements_1_0= ruleBlockOperation ) )+ (this_LF_2= RULE_LF )* ) ;
    public final EObject rulePattern() throws RecognitionException {
        EObject current = null;

        Token this_LF_0=null;
        Token this_LF_2=null;
        EObject lv_elements_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:79:28: ( ( (this_LF_0= RULE_LF )* ( (lv_elements_1_0= ruleBlockOperation ) )+ (this_LF_2= RULE_LF )* ) )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:80:1: ( (this_LF_0= RULE_LF )* ( (lv_elements_1_0= ruleBlockOperation ) )+ (this_LF_2= RULE_LF )* )
            {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:80:1: ( (this_LF_0= RULE_LF )* ( (lv_elements_1_0= ruleBlockOperation ) )+ (this_LF_2= RULE_LF )* )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:80:2: (this_LF_0= RULE_LF )* ( (lv_elements_1_0= ruleBlockOperation ) )+ (this_LF_2= RULE_LF )*
            {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:80:2: (this_LF_0= RULE_LF )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_LF) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:80:3: this_LF_0= RULE_LF
            	    {
            	    this_LF_0=(Token)match(input,RULE_LF,FOLLOW_RULE_LF_in_rulePattern122); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_LF_0, grammarAccess.getPatternAccess().getLFTerminalRuleCall_0()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:84:3: ( (lv_elements_1_0= ruleBlockOperation ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_STRING||LA2_0==12||(LA2_0>=16 && LA2_0<=22)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:85:1: (lv_elements_1_0= ruleBlockOperation )
            	    {
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:85:1: (lv_elements_1_0= ruleBlockOperation )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:86:3: lv_elements_1_0= ruleBlockOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPatternAccess().getElementsBlockOperationParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBlockOperation_in_rulePattern144);
            	    lv_elements_1_0=ruleBlockOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPatternRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"elements",
            	              		lv_elements_1_0, 
            	              		"BlockOperation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:102:3: (this_LF_2= RULE_LF )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_LF) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:102:4: this_LF_2= RULE_LF
            	    {
            	    this_LF_2=(Token)match(input,RULE_LF,FOLLOW_RULE_LF_in_rulePattern157); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_LF_2, grammarAccess.getPatternAccess().getLFTerminalRuleCall_2()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePattern"


    // $ANTLR start "entryRuleBlockOperation"
    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:114:1: entryRuleBlockOperation returns [EObject current=null] : iv_ruleBlockOperation= ruleBlockOperation EOF ;
    public final EObject entryRuleBlockOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockOperation = null;


        try {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:115:2: (iv_ruleBlockOperation= ruleBlockOperation EOF )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:116:2: iv_ruleBlockOperation= ruleBlockOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBlockOperationRule()); 
            }
            pushFollow(FOLLOW_ruleBlockOperation_in_entryRuleBlockOperation194);
            iv_ruleBlockOperation=ruleBlockOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBlockOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlockOperation204); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBlockOperation"


    // $ANTLR start "ruleBlockOperation"
    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:123:1: ruleBlockOperation returns [EObject current=null] : (this_Instruction_0= ruleInstruction | this_Row_1= ruleRow | this_Message_2= ruleMessage ) ;
    public final EObject ruleBlockOperation() throws RecognitionException {
        EObject current = null;

        EObject this_Instruction_0 = null;

        EObject this_Row_1 = null;

        EObject this_Message_2 = null;


         enterRule(); 
            
        try {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:126:28: ( (this_Instruction_0= ruleInstruction | this_Row_1= ruleRow | this_Message_2= ruleMessage ) )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:127:1: (this_Instruction_0= ruleInstruction | this_Row_1= ruleRow | this_Message_2= ruleMessage )
            {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:127:1: (this_Instruction_0= ruleInstruction | this_Row_1= ruleRow | this_Message_2= ruleMessage )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt4=1;
                }
                break;
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
                {
                alt4=2;
                }
                break;
            case RULE_STRING:
                {
                alt4=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:128:5: this_Instruction_0= ruleInstruction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBlockOperationAccess().getInstructionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInstruction_in_ruleBlockOperation251);
                    this_Instruction_0=ruleInstruction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Instruction_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:138:5: this_Row_1= ruleRow
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBlockOperationAccess().getRowParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRow_in_ruleBlockOperation278);
                    this_Row_1=ruleRow();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Row_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:148:5: this_Message_2= ruleMessage
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBlockOperationAccess().getMessageParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMessage_in_ruleBlockOperation305);
                    this_Message_2=ruleMessage();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Message_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBlockOperation"


    // $ANTLR start "entryRuleInstruction"
    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:164:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:165:2: (iv_ruleInstruction= ruleInstruction EOF )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:166:2: iv_ruleInstruction= ruleInstruction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInstructionRule()); 
            }
            pushFollow(FOLLOW_ruleInstruction_in_entryRuleInstruction340);
            iv_ruleInstruction=ruleInstruction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInstruction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstruction350); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:173:1: ruleInstruction returns [EObject current=null] : (otherlv_0= 'Instruction' ( (lv_label_1_0= RULE_ID ) )? ( (otherlv_2= '{' (this_LF_3= RULE_LF )* ( (lv_rows_4_0= ruleRow ) )+ otherlv_5= '}' this_LF_6= RULE_LF ) | (otherlv_7= ':' this_LF_8= RULE_LF ( (lv_rows_9_0= ruleRow ) )+ this_LF_10= RULE_LF ) ) ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_label_1_0=null;
        Token otherlv_2=null;
        Token this_LF_3=null;
        Token otherlv_5=null;
        Token this_LF_6=null;
        Token otherlv_7=null;
        Token this_LF_8=null;
        Token this_LF_10=null;
        EObject lv_rows_4_0 = null;

        EObject lv_rows_9_0 = null;


         enterRule(); 
            
        try {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:176:28: ( (otherlv_0= 'Instruction' ( (lv_label_1_0= RULE_ID ) )? ( (otherlv_2= '{' (this_LF_3= RULE_LF )* ( (lv_rows_4_0= ruleRow ) )+ otherlv_5= '}' this_LF_6= RULE_LF ) | (otherlv_7= ':' this_LF_8= RULE_LF ( (lv_rows_9_0= ruleRow ) )+ this_LF_10= RULE_LF ) ) ) )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:177:1: (otherlv_0= 'Instruction' ( (lv_label_1_0= RULE_ID ) )? ( (otherlv_2= '{' (this_LF_3= RULE_LF )* ( (lv_rows_4_0= ruleRow ) )+ otherlv_5= '}' this_LF_6= RULE_LF ) | (otherlv_7= ':' this_LF_8= RULE_LF ( (lv_rows_9_0= ruleRow ) )+ this_LF_10= RULE_LF ) ) )
            {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:177:1: (otherlv_0= 'Instruction' ( (lv_label_1_0= RULE_ID ) )? ( (otherlv_2= '{' (this_LF_3= RULE_LF )* ( (lv_rows_4_0= ruleRow ) )+ otherlv_5= '}' this_LF_6= RULE_LF ) | (otherlv_7= ':' this_LF_8= RULE_LF ( (lv_rows_9_0= ruleRow ) )+ this_LF_10= RULE_LF ) ) )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:177:3: otherlv_0= 'Instruction' ( (lv_label_1_0= RULE_ID ) )? ( (otherlv_2= '{' (this_LF_3= RULE_LF )* ( (lv_rows_4_0= ruleRow ) )+ otherlv_5= '}' this_LF_6= RULE_LF ) | (otherlv_7= ':' this_LF_8= RULE_LF ( (lv_rows_9_0= ruleRow ) )+ this_LF_10= RULE_LF ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleInstruction387); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getInstructionAccess().getInstructionKeyword_0());
                  
            }
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:181:1: ( (lv_label_1_0= RULE_ID ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:182:1: (lv_label_1_0= RULE_ID )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:182:1: (lv_label_1_0= RULE_ID )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:183:3: lv_label_1_0= RULE_ID
                    {
                    lv_label_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInstruction404); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_label_1_0, grammarAccess.getInstructionAccess().getLabelIDTerminalRuleCall_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getInstructionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"label",
                              		lv_label_1_0, 
                              		"ID");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:199:3: ( (otherlv_2= '{' (this_LF_3= RULE_LF )* ( (lv_rows_4_0= ruleRow ) )+ otherlv_5= '}' this_LF_6= RULE_LF ) | (otherlv_7= ':' this_LF_8= RULE_LF ( (lv_rows_9_0= ruleRow ) )+ this_LF_10= RULE_LF ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==13) ) {
                alt9=1;
            }
            else if ( (LA9_0==15) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:199:4: (otherlv_2= '{' (this_LF_3= RULE_LF )* ( (lv_rows_4_0= ruleRow ) )+ otherlv_5= '}' this_LF_6= RULE_LF )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:199:4: (otherlv_2= '{' (this_LF_3= RULE_LF )* ( (lv_rows_4_0= ruleRow ) )+ otherlv_5= '}' this_LF_6= RULE_LF )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:199:6: otherlv_2= '{' (this_LF_3= RULE_LF )* ( (lv_rows_4_0= ruleRow ) )+ otherlv_5= '}' this_LF_6= RULE_LF
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleInstruction424); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getInstructionAccess().getLeftCurlyBracketKeyword_2_0_0());
                          
                    }
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:203:1: (this_LF_3= RULE_LF )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_LF) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:203:2: this_LF_3= RULE_LF
                    	    {
                    	    this_LF_3=(Token)match(input,RULE_LF,FOLLOW_RULE_LF_in_ruleInstruction436); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_LF_3, grammarAccess.getInstructionAccess().getLFTerminalRuleCall_2_0_1()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:207:3: ( (lv_rows_4_0= ruleRow ) )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>=16 && LA7_0<=22)) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:208:1: (lv_rows_4_0= ruleRow )
                    	    {
                    	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:208:1: (lv_rows_4_0= ruleRow )
                    	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:209:3: lv_rows_4_0= ruleRow
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getInstructionAccess().getRowsRowParserRuleCall_2_0_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleRow_in_ruleInstruction458);
                    	    lv_rows_4_0=ruleRow();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getInstructionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"rows",
                    	              		lv_rows_4_0, 
                    	              		"Row");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);

                    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleInstruction471); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getInstructionAccess().getRightCurlyBracketKeyword_2_0_3());
                          
                    }
                    this_LF_6=(Token)match(input,RULE_LF,FOLLOW_RULE_LF_in_ruleInstruction482); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LF_6, grammarAccess.getInstructionAccess().getLFTerminalRuleCall_2_0_4()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:234:6: (otherlv_7= ':' this_LF_8= RULE_LF ( (lv_rows_9_0= ruleRow ) )+ this_LF_10= RULE_LF )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:234:6: (otherlv_7= ':' this_LF_8= RULE_LF ( (lv_rows_9_0= ruleRow ) )+ this_LF_10= RULE_LF )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:234:8: otherlv_7= ':' this_LF_8= RULE_LF ( (lv_rows_9_0= ruleRow ) )+ this_LF_10= RULE_LF
                    {
                    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleInstruction501); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getInstructionAccess().getColonKeyword_2_1_0());
                          
                    }
                    this_LF_8=(Token)match(input,RULE_LF,FOLLOW_RULE_LF_in_ruleInstruction512); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LF_8, grammarAccess.getInstructionAccess().getLFTerminalRuleCall_2_1_1()); 
                          
                    }
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:242:1: ( (lv_rows_9_0= ruleRow ) )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>=16 && LA8_0<=22)) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:243:1: (lv_rows_9_0= ruleRow )
                    	    {
                    	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:243:1: (lv_rows_9_0= ruleRow )
                    	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:244:3: lv_rows_9_0= ruleRow
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getInstructionAccess().getRowsRowParserRuleCall_2_1_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleRow_in_ruleInstruction532);
                    	    lv_rows_9_0=ruleRow();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getInstructionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"rows",
                    	              		lv_rows_9_0, 
                    	              		"Row");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);

                    this_LF_10=(Token)match(input,RULE_LF,FOLLOW_RULE_LF_in_ruleInstruction544); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LF_10, grammarAccess.getInstructionAccess().getLFTerminalRuleCall_2_1_3()); 
                          
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleRow"
    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:272:1: entryRuleRow returns [EObject current=null] : iv_ruleRow= ruleRow EOF ;
    public final EObject entryRuleRow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRow = null;


        try {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:273:2: (iv_ruleRow= ruleRow EOF )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:274:2: iv_ruleRow= ruleRow EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRowRule()); 
            }
            pushFollow(FOLLOW_ruleRow_in_entryRuleRow581);
            iv_ruleRow=ruleRow();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRow; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRow591); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRow"


    // $ANTLR start "ruleRow"
    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:281:1: ruleRow returns [EObject current=null] : ( ( (lv_nextRow_0_0= 'Next' ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_shortRow_2_0= 'Short' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_longRow_3_0= 'Long' ) ) ) ) ) )* ) ) ) ( ( (lv_label_4_1= 'Row' | lv_label_4_2= 'Round' | lv_label_4_3= 'Rows' | lv_label_4_4= 'Rounds' ) ) ) ( ( (lv_range_5_0= ruleRange ) ) | ( ( (lv_number_6_0= RULE_INT ) ) (otherlv_7= ',' ( (lv_number_8_0= RULE_INT ) ) )* (otherlv_9= 'and' (otherlv_10= 'all' )? ( ( (lv_subsequent_11_1= 'even' | lv_subsequent_11_2= 'odd' ) ) ) (otherlv_12= 'rows' | otherlv_13= 'rounds' )? )? ) )? ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_side_15_1= 'WS' | lv_side_15_2= 'RS' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'with' ( (lv_yarnRef_17_0= RULE_ID ) ) ) ) ) ) )* ) ) ) (otherlv_18= '(' ( (otherlv_19= ',' )? ( (lv_inform_20_0= 'inform' ) ) (otherlv_21= 'side' )? )? ( (otherlv_22= ',' )? ( (lv_reset_23_0= 'reset' ) ) (otherlv_24= 'count' )? )? otherlv_25= ')' )? otherlv_26= ':' (this_LF_27= RULE_LF )? ( (lv_operations_28_0= ruleInlineOperation ) ) (otherlv_29= ',' ( (lv_operations_30_0= ruleInlineOperation ) ) )* ( ( RULE_LF )=>this_LF_31= RULE_LF )? ) ;
    public final EObject ruleRow() throws RecognitionException {
        EObject current = null;

        Token lv_nextRow_0_0=null;
        Token lv_shortRow_2_0=null;
        Token lv_longRow_3_0=null;
        Token lv_label_4_1=null;
        Token lv_label_4_2=null;
        Token lv_label_4_3=null;
        Token lv_label_4_4=null;
        Token lv_number_6_0=null;
        Token otherlv_7=null;
        Token lv_number_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_subsequent_11_1=null;
        Token lv_subsequent_11_2=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_side_15_1=null;
        Token lv_side_15_2=null;
        Token otherlv_16=null;
        Token lv_yarnRef_17_0=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token lv_inform_20_0=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token lv_reset_23_0=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token this_LF_27=null;
        Token otherlv_29=null;
        Token this_LF_31=null;
        EObject lv_range_5_0 = null;

        EObject lv_operations_28_0 = null;

        EObject lv_operations_30_0 = null;


         enterRule(); 
            
        try {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:284:28: ( ( ( (lv_nextRow_0_0= 'Next' ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_shortRow_2_0= 'Short' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_longRow_3_0= 'Long' ) ) ) ) ) )* ) ) ) ( ( (lv_label_4_1= 'Row' | lv_label_4_2= 'Round' | lv_label_4_3= 'Rows' | lv_label_4_4= 'Rounds' ) ) ) ( ( (lv_range_5_0= ruleRange ) ) | ( ( (lv_number_6_0= RULE_INT ) ) (otherlv_7= ',' ( (lv_number_8_0= RULE_INT ) ) )* (otherlv_9= 'and' (otherlv_10= 'all' )? ( ( (lv_subsequent_11_1= 'even' | lv_subsequent_11_2= 'odd' ) ) ) (otherlv_12= 'rows' | otherlv_13= 'rounds' )? )? ) )? ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_side_15_1= 'WS' | lv_side_15_2= 'RS' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'with' ( (lv_yarnRef_17_0= RULE_ID ) ) ) ) ) ) )* ) ) ) (otherlv_18= '(' ( (otherlv_19= ',' )? ( (lv_inform_20_0= 'inform' ) ) (otherlv_21= 'side' )? )? ( (otherlv_22= ',' )? ( (lv_reset_23_0= 'reset' ) ) (otherlv_24= 'count' )? )? otherlv_25= ')' )? otherlv_26= ':' (this_LF_27= RULE_LF )? ( (lv_operations_28_0= ruleInlineOperation ) ) (otherlv_29= ',' ( (lv_operations_30_0= ruleInlineOperation ) ) )* ( ( RULE_LF )=>this_LF_31= RULE_LF )? ) )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:285:1: ( ( (lv_nextRow_0_0= 'Next' ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_shortRow_2_0= 'Short' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_longRow_3_0= 'Long' ) ) ) ) ) )* ) ) ) ( ( (lv_label_4_1= 'Row' | lv_label_4_2= 'Round' | lv_label_4_3= 'Rows' | lv_label_4_4= 'Rounds' ) ) ) ( ( (lv_range_5_0= ruleRange ) ) | ( ( (lv_number_6_0= RULE_INT ) ) (otherlv_7= ',' ( (lv_number_8_0= RULE_INT ) ) )* (otherlv_9= 'and' (otherlv_10= 'all' )? ( ( (lv_subsequent_11_1= 'even' | lv_subsequent_11_2= 'odd' ) ) ) (otherlv_12= 'rows' | otherlv_13= 'rounds' )? )? ) )? ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_side_15_1= 'WS' | lv_side_15_2= 'RS' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'with' ( (lv_yarnRef_17_0= RULE_ID ) ) ) ) ) ) )* ) ) ) (otherlv_18= '(' ( (otherlv_19= ',' )? ( (lv_inform_20_0= 'inform' ) ) (otherlv_21= 'side' )? )? ( (otherlv_22= ',' )? ( (lv_reset_23_0= 'reset' ) ) (otherlv_24= 'count' )? )? otherlv_25= ')' )? otherlv_26= ':' (this_LF_27= RULE_LF )? ( (lv_operations_28_0= ruleInlineOperation ) ) (otherlv_29= ',' ( (lv_operations_30_0= ruleInlineOperation ) ) )* ( ( RULE_LF )=>this_LF_31= RULE_LF )? )
            {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:285:1: ( ( (lv_nextRow_0_0= 'Next' ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_shortRow_2_0= 'Short' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_longRow_3_0= 'Long' ) ) ) ) ) )* ) ) ) ( ( (lv_label_4_1= 'Row' | lv_label_4_2= 'Round' | lv_label_4_3= 'Rows' | lv_label_4_4= 'Rounds' ) ) ) ( ( (lv_range_5_0= ruleRange ) ) | ( ( (lv_number_6_0= RULE_INT ) ) (otherlv_7= ',' ( (lv_number_8_0= RULE_INT ) ) )* (otherlv_9= 'and' (otherlv_10= 'all' )? ( ( (lv_subsequent_11_1= 'even' | lv_subsequent_11_2= 'odd' ) ) ) (otherlv_12= 'rows' | otherlv_13= 'rounds' )? )? ) )? ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_side_15_1= 'WS' | lv_side_15_2= 'RS' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'with' ( (lv_yarnRef_17_0= RULE_ID ) ) ) ) ) ) )* ) ) ) (otherlv_18= '(' ( (otherlv_19= ',' )? ( (lv_inform_20_0= 'inform' ) ) (otherlv_21= 'side' )? )? ( (otherlv_22= ',' )? ( (lv_reset_23_0= 'reset' ) ) (otherlv_24= 'count' )? )? otherlv_25= ')' )? otherlv_26= ':' (this_LF_27= RULE_LF )? ( (lv_operations_28_0= ruleInlineOperation ) ) (otherlv_29= ',' ( (lv_operations_30_0= ruleInlineOperation ) ) )* ( ( RULE_LF )=>this_LF_31= RULE_LF )? )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:285:2: ( (lv_nextRow_0_0= 'Next' ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_shortRow_2_0= 'Short' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_longRow_3_0= 'Long' ) ) ) ) ) )* ) ) ) ( ( (lv_label_4_1= 'Row' | lv_label_4_2= 'Round' | lv_label_4_3= 'Rows' | lv_label_4_4= 'Rounds' ) ) ) ( ( (lv_range_5_0= ruleRange ) ) | ( ( (lv_number_6_0= RULE_INT ) ) (otherlv_7= ',' ( (lv_number_8_0= RULE_INT ) ) )* (otherlv_9= 'and' (otherlv_10= 'all' )? ( ( (lv_subsequent_11_1= 'even' | lv_subsequent_11_2= 'odd' ) ) ) (otherlv_12= 'rows' | otherlv_13= 'rounds' )? )? ) )? ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_side_15_1= 'WS' | lv_side_15_2= 'RS' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'with' ( (lv_yarnRef_17_0= RULE_ID ) ) ) ) ) ) )* ) ) ) (otherlv_18= '(' ( (otherlv_19= ',' )? ( (lv_inform_20_0= 'inform' ) ) (otherlv_21= 'side' )? )? ( (otherlv_22= ',' )? ( (lv_reset_23_0= 'reset' ) ) (otherlv_24= 'count' )? )? otherlv_25= ')' )? otherlv_26= ':' (this_LF_27= RULE_LF )? ( (lv_operations_28_0= ruleInlineOperation ) ) (otherlv_29= ',' ( (lv_operations_30_0= ruleInlineOperation ) ) )* ( ( RULE_LF )=>this_LF_31= RULE_LF )?
            {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:285:2: ( (lv_nextRow_0_0= 'Next' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==16) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:286:1: (lv_nextRow_0_0= 'Next' )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:286:1: (lv_nextRow_0_0= 'Next' )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:287:3: lv_nextRow_0_0= 'Next'
                    {
                    lv_nextRow_0_0=(Token)match(input,16,FOLLOW_16_in_ruleRow634); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_nextRow_0_0, grammarAccess.getRowAccess().getNextRowNextKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getRowRule());
                      	        }
                             		setWithLastConsumed(current, "nextRow", true, "Next");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:300:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_shortRow_2_0= 'Short' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_longRow_3_0= 'Long' ) ) ) ) ) )* ) ) )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:302:1: ( ( ( ({...}? => ( ({...}? => ( (lv_shortRow_2_0= 'Short' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_longRow_3_0= 'Long' ) ) ) ) ) )* ) )
            {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:302:1: ( ( ( ({...}? => ( ({...}? => ( (lv_shortRow_2_0= 'Short' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_longRow_3_0= 'Long' ) ) ) ) ) )* ) )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:303:2: ( ( ({...}? => ( ({...}? => ( (lv_shortRow_2_0= 'Short' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_longRow_3_0= 'Long' ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getRowAccess().getUnorderedGroup_1());
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:306:2: ( ( ({...}? => ( ({...}? => ( (lv_shortRow_2_0= 'Short' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_longRow_3_0= 'Long' ) ) ) ) ) )* )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:307:3: ( ({...}? => ( ({...}? => ( (lv_shortRow_2_0= 'Short' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_longRow_3_0= 'Long' ) ) ) ) ) )*
            {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:307:3: ( ({...}? => ( ({...}? => ( (lv_shortRow_2_0= 'Short' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_longRow_3_0= 'Long' ) ) ) ) ) )*
            loop11:
            do {
                int alt11=3;
                int LA11_0 = input.LA(1);

                if ( LA11_0 ==17 && getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_1(), 0) ) {
                    alt11=1;
                }
                else if ( LA11_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_1(), 1) ) {
                    alt11=2;
                }


                switch (alt11) {
            	case 1 :
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:309:4: ({...}? => ( ({...}? => ( (lv_shortRow_2_0= 'Short' ) ) ) ) )
            	    {
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:309:4: ({...}? => ( ({...}? => ( (lv_shortRow_2_0= 'Short' ) ) ) ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:310:5: {...}? => ( ({...}? => ( (lv_shortRow_2_0= 'Short' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_1(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRow", "getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:310:100: ( ({...}? => ( (lv_shortRow_2_0= 'Short' ) ) ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:311:6: ({...}? => ( (lv_shortRow_2_0= 'Short' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getRowAccess().getUnorderedGroup_1(), 0);
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:314:6: ({...}? => ( (lv_shortRow_2_0= 'Short' ) ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:314:7: {...}? => ( (lv_shortRow_2_0= 'Short' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRow", "true");
            	    }
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:314:16: ( (lv_shortRow_2_0= 'Short' ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:315:1: (lv_shortRow_2_0= 'Short' )
            	    {
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:315:1: (lv_shortRow_2_0= 'Short' )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:316:3: lv_shortRow_2_0= 'Short'
            	    {
            	    lv_shortRow_2_0=(Token)match(input,17,FOLLOW_17_in_ruleRow711); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              newLeafNode(lv_shortRow_2_0, grammarAccess.getRowAccess().getShortRowShortKeyword_1_0_0());
            	          
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getRowRule());
            	      	        }
            	             		setWithLastConsumed(current, "shortRow", true, "Short");
            	      	    
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRowAccess().getUnorderedGroup_1());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:336:4: ({...}? => ( ({...}? => ( (lv_longRow_3_0= 'Long' ) ) ) ) )
            	    {
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:336:4: ({...}? => ( ({...}? => ( (lv_longRow_3_0= 'Long' ) ) ) ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:337:5: {...}? => ( ({...}? => ( (lv_longRow_3_0= 'Long' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_1(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRow", "getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:337:100: ( ({...}? => ( (lv_longRow_3_0= 'Long' ) ) ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:338:6: ({...}? => ( (lv_longRow_3_0= 'Long' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getRowAccess().getUnorderedGroup_1(), 1);
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:341:6: ({...}? => ( (lv_longRow_3_0= 'Long' ) ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:341:7: {...}? => ( (lv_longRow_3_0= 'Long' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRow", "true");
            	    }
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:341:16: ( (lv_longRow_3_0= 'Long' ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:342:1: (lv_longRow_3_0= 'Long' )
            	    {
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:342:1: (lv_longRow_3_0= 'Long' )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:343:3: lv_longRow_3_0= 'Long'
            	    {
            	    lv_longRow_3_0=(Token)match(input,18,FOLLOW_18_in_ruleRow796); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              newLeafNode(lv_longRow_3_0, grammarAccess.getRowAccess().getLongRowLongKeyword_1_1_0());
            	          
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getRowRule());
            	      	        }
            	             		setWithLastConsumed(current, "longRow", true, "Long");
            	      	    
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRowAccess().getUnorderedGroup_1());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getRowAccess().getUnorderedGroup_1());

            }

            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:370:2: ( ( (lv_label_4_1= 'Row' | lv_label_4_2= 'Round' | lv_label_4_3= 'Rows' | lv_label_4_4= 'Rounds' ) ) )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:371:1: ( (lv_label_4_1= 'Row' | lv_label_4_2= 'Round' | lv_label_4_3= 'Rows' | lv_label_4_4= 'Rounds' ) )
            {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:371:1: ( (lv_label_4_1= 'Row' | lv_label_4_2= 'Round' | lv_label_4_3= 'Rows' | lv_label_4_4= 'Rounds' ) )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:372:1: (lv_label_4_1= 'Row' | lv_label_4_2= 'Round' | lv_label_4_3= 'Rows' | lv_label_4_4= 'Rounds' )
            {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:372:1: (lv_label_4_1= 'Row' | lv_label_4_2= 'Round' | lv_label_4_3= 'Rows' | lv_label_4_4= 'Rounds' )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt12=1;
                }
                break;
            case 20:
                {
                alt12=2;
                }
                break;
            case 21:
                {
                alt12=3;
                }
                break;
            case 22:
                {
                alt12=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:373:3: lv_label_4_1= 'Row'
                    {
                    lv_label_4_1=(Token)match(input,19,FOLLOW_19_in_ruleRow869); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_label_4_1, grammarAccess.getRowAccess().getLabelRowKeyword_2_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getRowRule());
                      	        }
                             		setWithLastConsumed(current, "label", lv_label_4_1, null);
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:385:8: lv_label_4_2= 'Round'
                    {
                    lv_label_4_2=(Token)match(input,20,FOLLOW_20_in_ruleRow898); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_label_4_2, grammarAccess.getRowAccess().getLabelRoundKeyword_2_0_1());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getRowRule());
                      	        }
                             		setWithLastConsumed(current, "label", lv_label_4_2, null);
                      	    
                    }

                    }
                    break;
                case 3 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:397:8: lv_label_4_3= 'Rows'
                    {
                    lv_label_4_3=(Token)match(input,21,FOLLOW_21_in_ruleRow927); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_label_4_3, grammarAccess.getRowAccess().getLabelRowsKeyword_2_0_2());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getRowRule());
                      	        }
                             		setWithLastConsumed(current, "label", lv_label_4_3, null);
                      	    
                    }

                    }
                    break;
                case 4 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:409:8: lv_label_4_4= 'Rounds'
                    {
                    lv_label_4_4=(Token)match(input,22,FOLLOW_22_in_ruleRow956); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_label_4_4, grammarAccess.getRowAccess().getLabelRoundsKeyword_2_0_3());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getRowRule());
                      	        }
                             		setWithLastConsumed(current, "label", lv_label_4_4, null);
                      	    
                    }

                    }
                    break;

            }


            }


            }

            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:424:2: ( ( (lv_range_5_0= ruleRange ) ) | ( ( (lv_number_6_0= RULE_INT ) ) (otherlv_7= ',' ( (lv_number_8_0= RULE_INT ) ) )* (otherlv_9= 'and' (otherlv_10= 'all' )? ( ( (lv_subsequent_11_1= 'even' | lv_subsequent_11_2= 'odd' ) ) ) (otherlv_12= 'rows' | otherlv_13= 'rounds' )? )? ) )?
            int alt18=3;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_INT) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==78) ) {
                    alt18=1;
                }
                else if ( (LA18_1==15||(LA18_1>=23 && LA18_1<=24)||(LA18_1>=30 && LA18_1<=33)) ) {
                    alt18=2;
                }
            }
            switch (alt18) {
                case 1 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:424:3: ( (lv_range_5_0= ruleRange ) )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:424:3: ( (lv_range_5_0= ruleRange ) )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:425:1: (lv_range_5_0= ruleRange )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:425:1: (lv_range_5_0= ruleRange )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:426:3: lv_range_5_0= ruleRange
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRowAccess().getRangeRangeParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRange_in_ruleRow994);
                    lv_range_5_0=ruleRange();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRowRule());
                      	        }
                             		set(
                             			current, 
                             			"range",
                              		lv_range_5_0, 
                              		"Range");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:443:6: ( ( (lv_number_6_0= RULE_INT ) ) (otherlv_7= ',' ( (lv_number_8_0= RULE_INT ) ) )* (otherlv_9= 'and' (otherlv_10= 'all' )? ( ( (lv_subsequent_11_1= 'even' | lv_subsequent_11_2= 'odd' ) ) ) (otherlv_12= 'rows' | otherlv_13= 'rounds' )? )? )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:443:6: ( ( (lv_number_6_0= RULE_INT ) ) (otherlv_7= ',' ( (lv_number_8_0= RULE_INT ) ) )* (otherlv_9= 'and' (otherlv_10= 'all' )? ( ( (lv_subsequent_11_1= 'even' | lv_subsequent_11_2= 'odd' ) ) ) (otherlv_12= 'rows' | otherlv_13= 'rounds' )? )? )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:443:7: ( (lv_number_6_0= RULE_INT ) ) (otherlv_7= ',' ( (lv_number_8_0= RULE_INT ) ) )* (otherlv_9= 'and' (otherlv_10= 'all' )? ( ( (lv_subsequent_11_1= 'even' | lv_subsequent_11_2= 'odd' ) ) ) (otherlv_12= 'rows' | otherlv_13= 'rounds' )? )?
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:443:7: ( (lv_number_6_0= RULE_INT ) )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:444:1: (lv_number_6_0= RULE_INT )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:444:1: (lv_number_6_0= RULE_INT )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:445:3: lv_number_6_0= RULE_INT
                    {
                    lv_number_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRow1018); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_number_6_0, grammarAccess.getRowAccess().getNumberINTTerminalRuleCall_3_1_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getRowRule());
                      	        }
                             		addWithLastConsumed(
                             			current, 
                             			"number",
                              		lv_number_6_0, 
                              		"INT");
                      	    
                    }

                    }


                    }

                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:461:2: (otherlv_7= ',' ( (lv_number_8_0= RULE_INT ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==23) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:461:4: otherlv_7= ',' ( (lv_number_8_0= RULE_INT ) )
                    	    {
                    	    otherlv_7=(Token)match(input,23,FOLLOW_23_in_ruleRow1036); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_7, grammarAccess.getRowAccess().getCommaKeyword_3_1_1_0());
                    	          
                    	    }
                    	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:465:1: ( (lv_number_8_0= RULE_INT ) )
                    	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:466:1: (lv_number_8_0= RULE_INT )
                    	    {
                    	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:466:1: (lv_number_8_0= RULE_INT )
                    	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:467:3: lv_number_8_0= RULE_INT
                    	    {
                    	    lv_number_8_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRow1053); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      			newLeafNode(lv_number_8_0, grammarAccess.getRowAccess().getNumberINTTerminalRuleCall_3_1_1_1_0()); 
                    	      		
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getRowRule());
                    	      	        }
                    	             		addWithLastConsumed(
                    	             			current, 
                    	             			"number",
                    	              		lv_number_8_0, 
                    	              		"INT");
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:483:4: (otherlv_9= 'and' (otherlv_10= 'all' )? ( ( (lv_subsequent_11_1= 'even' | lv_subsequent_11_2= 'odd' ) ) ) (otherlv_12= 'rows' | otherlv_13= 'rounds' )? )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==24) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:483:6: otherlv_9= 'and' (otherlv_10= 'all' )? ( ( (lv_subsequent_11_1= 'even' | lv_subsequent_11_2= 'odd' ) ) ) (otherlv_12= 'rows' | otherlv_13= 'rounds' )?
                            {
                            otherlv_9=(Token)match(input,24,FOLLOW_24_in_ruleRow1073); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_9, grammarAccess.getRowAccess().getAndKeyword_3_1_2_0());
                                  
                            }
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:487:1: (otherlv_10= 'all' )?
                            int alt14=2;
                            int LA14_0 = input.LA(1);

                            if ( (LA14_0==25) ) {
                                alt14=1;
                            }
                            switch (alt14) {
                                case 1 :
                                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:487:3: otherlv_10= 'all'
                                    {
                                    otherlv_10=(Token)match(input,25,FOLLOW_25_in_ruleRow1086); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_10, grammarAccess.getRowAccess().getAllKeyword_3_1_2_1());
                                          
                                    }

                                    }
                                    break;

                            }

                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:491:3: ( ( (lv_subsequent_11_1= 'even' | lv_subsequent_11_2= 'odd' ) ) )
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:492:1: ( (lv_subsequent_11_1= 'even' | lv_subsequent_11_2= 'odd' ) )
                            {
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:492:1: ( (lv_subsequent_11_1= 'even' | lv_subsequent_11_2= 'odd' ) )
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:493:1: (lv_subsequent_11_1= 'even' | lv_subsequent_11_2= 'odd' )
                            {
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:493:1: (lv_subsequent_11_1= 'even' | lv_subsequent_11_2= 'odd' )
                            int alt15=2;
                            int LA15_0 = input.LA(1);

                            if ( (LA15_0==26) ) {
                                alt15=1;
                            }
                            else if ( (LA15_0==27) ) {
                                alt15=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 15, 0, input);

                                throw nvae;
                            }
                            switch (alt15) {
                                case 1 :
                                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:494:3: lv_subsequent_11_1= 'even'
                                    {
                                    lv_subsequent_11_1=(Token)match(input,26,FOLLOW_26_in_ruleRow1108); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                              newLeafNode(lv_subsequent_11_1, grammarAccess.getRowAccess().getSubsequentEvenKeyword_3_1_2_2_0_0());
                                          
                                    }
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElement(grammarAccess.getRowRule());
                                      	        }
                                             		setWithLastConsumed(current, "subsequent", lv_subsequent_11_1, null);
                                      	    
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:506:8: lv_subsequent_11_2= 'odd'
                                    {
                                    lv_subsequent_11_2=(Token)match(input,27,FOLLOW_27_in_ruleRow1137); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                              newLeafNode(lv_subsequent_11_2, grammarAccess.getRowAccess().getSubsequentOddKeyword_3_1_2_2_0_1());
                                          
                                    }
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElement(grammarAccess.getRowRule());
                                      	        }
                                             		setWithLastConsumed(current, "subsequent", lv_subsequent_11_2, null);
                                      	    
                                    }

                                    }
                                    break;

                            }


                            }


                            }

                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:521:2: (otherlv_12= 'rows' | otherlv_13= 'rounds' )?
                            int alt16=3;
                            int LA16_0 = input.LA(1);

                            if ( (LA16_0==28) ) {
                                alt16=1;
                            }
                            else if ( (LA16_0==29) ) {
                                alt16=2;
                            }
                            switch (alt16) {
                                case 1 :
                                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:521:4: otherlv_12= 'rows'
                                    {
                                    otherlv_12=(Token)match(input,28,FOLLOW_28_in_ruleRow1166); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_12, grammarAccess.getRowAccess().getRowsKeyword_3_1_2_3_0());
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:526:7: otherlv_13= 'rounds'
                                    {
                                    otherlv_13=(Token)match(input,29,FOLLOW_29_in_ruleRow1184); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_13, grammarAccess.getRowAccess().getRoundsKeyword_3_1_2_3_1());
                                          
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:530:8: ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_side_15_1= 'WS' | lv_side_15_2= 'RS' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'with' ( (lv_yarnRef_17_0= RULE_ID ) ) ) ) ) ) )* ) ) )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:532:1: ( ( ( ({...}? => ( ({...}? => ( ( (lv_side_15_1= 'WS' | lv_side_15_2= 'RS' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'with' ( (lv_yarnRef_17_0= RULE_ID ) ) ) ) ) ) )* ) )
            {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:532:1: ( ( ( ({...}? => ( ({...}? => ( ( (lv_side_15_1= 'WS' | lv_side_15_2= 'RS' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'with' ( (lv_yarnRef_17_0= RULE_ID ) ) ) ) ) ) )* ) )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:533:2: ( ( ({...}? => ( ({...}? => ( ( (lv_side_15_1= 'WS' | lv_side_15_2= 'RS' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'with' ( (lv_yarnRef_17_0= RULE_ID ) ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getRowAccess().getUnorderedGroup_4());
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:536:2: ( ( ({...}? => ( ({...}? => ( ( (lv_side_15_1= 'WS' | lv_side_15_2= 'RS' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'with' ( (lv_yarnRef_17_0= RULE_ID ) ) ) ) ) ) )* )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:537:3: ( ({...}? => ( ({...}? => ( ( (lv_side_15_1= 'WS' | lv_side_15_2= 'RS' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'with' ( (lv_yarnRef_17_0= RULE_ID ) ) ) ) ) ) )*
            {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:537:3: ( ({...}? => ( ({...}? => ( ( (lv_side_15_1= 'WS' | lv_side_15_2= 'RS' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'with' ( (lv_yarnRef_17_0= RULE_ID ) ) ) ) ) ) )*
            loop20:
            do {
                int alt20=3;
                int LA20_0 = input.LA(1);

                if ( LA20_0 >=30 && LA20_0<=31 && getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_4(), 0) ) {
                    alt20=1;
                }
                else if ( LA20_0 ==32 && getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_4(), 1) ) {
                    alt20=2;
                }


                switch (alt20) {
            	case 1 :
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:539:4: ({...}? => ( ({...}? => ( ( (lv_side_15_1= 'WS' | lv_side_15_2= 'RS' ) ) ) ) ) )
            	    {
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:539:4: ({...}? => ( ({...}? => ( ( (lv_side_15_1= 'WS' | lv_side_15_2= 'RS' ) ) ) ) ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:540:5: {...}? => ( ({...}? => ( ( (lv_side_15_1= 'WS' | lv_side_15_2= 'RS' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_4(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRow", "getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:540:100: ( ({...}? => ( ( (lv_side_15_1= 'WS' | lv_side_15_2= 'RS' ) ) ) ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:541:6: ({...}? => ( ( (lv_side_15_1= 'WS' | lv_side_15_2= 'RS' ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getRowAccess().getUnorderedGroup_4(), 0);
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:544:6: ({...}? => ( ( (lv_side_15_1= 'WS' | lv_side_15_2= 'RS' ) ) ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:544:7: {...}? => ( ( (lv_side_15_1= 'WS' | lv_side_15_2= 'RS' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRow", "true");
            	    }
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:544:16: ( ( (lv_side_15_1= 'WS' | lv_side_15_2= 'RS' ) ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:545:1: ( (lv_side_15_1= 'WS' | lv_side_15_2= 'RS' ) )
            	    {
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:545:1: ( (lv_side_15_1= 'WS' | lv_side_15_2= 'RS' ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:546:1: (lv_side_15_1= 'WS' | lv_side_15_2= 'RS' )
            	    {
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:546:1: (lv_side_15_1= 'WS' | lv_side_15_2= 'RS' )
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0==30) ) {
            	        alt19=1;
            	    }
            	    else if ( (LA19_0==31) ) {
            	        alt19=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:547:3: lv_side_15_1= 'WS'
            	            {
            	            lv_side_15_1=(Token)match(input,30,FOLLOW_30_in_ruleRow1256); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_side_15_1, grammarAccess.getRowAccess().getSideWSKeyword_4_0_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getRowRule());
            	              	        }
            	                     		setWithLastConsumed(current, "side", lv_side_15_1, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:559:8: lv_side_15_2= 'RS'
            	            {
            	            lv_side_15_2=(Token)match(input,31,FOLLOW_31_in_ruleRow1285); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_side_15_2, grammarAccess.getRowAccess().getSideRSKeyword_4_0_0_1());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getRowRule());
            	              	        }
            	                     		setWithLastConsumed(current, "side", lv_side_15_2, null);
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRowAccess().getUnorderedGroup_4());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:581:4: ({...}? => ( ({...}? => (otherlv_16= 'with' ( (lv_yarnRef_17_0= RULE_ID ) ) ) ) ) )
            	    {
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:581:4: ({...}? => ( ({...}? => (otherlv_16= 'with' ( (lv_yarnRef_17_0= RULE_ID ) ) ) ) ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:582:5: {...}? => ( ({...}? => (otherlv_16= 'with' ( (lv_yarnRef_17_0= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_4(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRow", "getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:582:100: ( ({...}? => (otherlv_16= 'with' ( (lv_yarnRef_17_0= RULE_ID ) ) ) ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:583:6: ({...}? => (otherlv_16= 'with' ( (lv_yarnRef_17_0= RULE_ID ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getRowAccess().getUnorderedGroup_4(), 1);
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:586:6: ({...}? => (otherlv_16= 'with' ( (lv_yarnRef_17_0= RULE_ID ) ) ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:586:7: {...}? => (otherlv_16= 'with' ( (lv_yarnRef_17_0= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRow", "true");
            	    }
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:586:16: (otherlv_16= 'with' ( (lv_yarnRef_17_0= RULE_ID ) ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:586:18: otherlv_16= 'with' ( (lv_yarnRef_17_0= RULE_ID ) )
            	    {
            	    otherlv_16=(Token)match(input,32,FOLLOW_32_in_ruleRow1368); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_16, grammarAccess.getRowAccess().getWithKeyword_4_1_0());
            	          
            	    }
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:590:1: ( (lv_yarnRef_17_0= RULE_ID ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:591:1: (lv_yarnRef_17_0= RULE_ID )
            	    {
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:591:1: (lv_yarnRef_17_0= RULE_ID )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:592:3: lv_yarnRef_17_0= RULE_ID
            	    {
            	    lv_yarnRef_17_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRow1385); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_yarnRef_17_0, grammarAccess.getRowAccess().getYarnRefIDTerminalRuleCall_4_1_1_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getRowRule());
            	      	        }
            	             		setWithLastConsumed(
            	             			current, 
            	             			"yarnRef",
            	              		lv_yarnRef_17_0, 
            	              		"ID");
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRowAccess().getUnorderedGroup_4());

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

            getUnorderedGroupHelper().leave(grammarAccess.getRowAccess().getUnorderedGroup_4());

            }

            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:622:2: (otherlv_18= '(' ( (otherlv_19= ',' )? ( (lv_inform_20_0= 'inform' ) ) (otherlv_21= 'side' )? )? ( (otherlv_22= ',' )? ( (lv_reset_23_0= 'reset' ) ) (otherlv_24= 'count' )? )? otherlv_25= ')' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==33) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:622:4: otherlv_18= '(' ( (otherlv_19= ',' )? ( (lv_inform_20_0= 'inform' ) ) (otherlv_21= 'side' )? )? ( (otherlv_22= ',' )? ( (lv_reset_23_0= 'reset' ) ) (otherlv_24= 'count' )? )? otherlv_25= ')'
                    {
                    otherlv_18=(Token)match(input,33,FOLLOW_33_in_ruleRow1444); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_18, grammarAccess.getRowAccess().getLeftParenthesisKeyword_5_0());
                          
                    }
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:626:1: ( (otherlv_19= ',' )? ( (lv_inform_20_0= 'inform' ) ) (otherlv_21= 'side' )? )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==23) ) {
                        int LA23_1 = input.LA(2);

                        if ( (LA23_1==34) ) {
                            alt23=1;
                        }
                    }
                    else if ( (LA23_0==34) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:626:2: (otherlv_19= ',' )? ( (lv_inform_20_0= 'inform' ) ) (otherlv_21= 'side' )?
                            {
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:626:2: (otherlv_19= ',' )?
                            int alt21=2;
                            int LA21_0 = input.LA(1);

                            if ( (LA21_0==23) ) {
                                alt21=1;
                            }
                            switch (alt21) {
                                case 1 :
                                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:626:4: otherlv_19= ','
                                    {
                                    otherlv_19=(Token)match(input,23,FOLLOW_23_in_ruleRow1458); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_19, grammarAccess.getRowAccess().getCommaKeyword_5_1_0());
                                          
                                    }

                                    }
                                    break;

                            }

                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:630:3: ( (lv_inform_20_0= 'inform' ) )
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:631:1: (lv_inform_20_0= 'inform' )
                            {
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:631:1: (lv_inform_20_0= 'inform' )
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:632:3: lv_inform_20_0= 'inform'
                            {
                            lv_inform_20_0=(Token)match(input,34,FOLLOW_34_in_ruleRow1478); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_inform_20_0, grammarAccess.getRowAccess().getInformInformKeyword_5_1_1_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getRowRule());
                              	        }
                                     		setWithLastConsumed(current, "inform", true, "inform");
                              	    
                            }

                            }


                            }

                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:645:2: (otherlv_21= 'side' )?
                            int alt22=2;
                            int LA22_0 = input.LA(1);

                            if ( (LA22_0==35) ) {
                                alt22=1;
                            }
                            switch (alt22) {
                                case 1 :
                                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:645:4: otherlv_21= 'side'
                                    {
                                    otherlv_21=(Token)match(input,35,FOLLOW_35_in_ruleRow1504); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_21, grammarAccess.getRowAccess().getSideKeyword_5_1_2());
                                          
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:649:5: ( (otherlv_22= ',' )? ( (lv_reset_23_0= 'reset' ) ) (otherlv_24= 'count' )? )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==23||LA26_0==36) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:649:6: (otherlv_22= ',' )? ( (lv_reset_23_0= 'reset' ) ) (otherlv_24= 'count' )?
                            {
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:649:6: (otherlv_22= ',' )?
                            int alt24=2;
                            int LA24_0 = input.LA(1);

                            if ( (LA24_0==23) ) {
                                alt24=1;
                            }
                            switch (alt24) {
                                case 1 :
                                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:649:8: otherlv_22= ','
                                    {
                                    otherlv_22=(Token)match(input,23,FOLLOW_23_in_ruleRow1522); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_22, grammarAccess.getRowAccess().getCommaKeyword_5_2_0());
                                          
                                    }

                                    }
                                    break;

                            }

                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:653:3: ( (lv_reset_23_0= 'reset' ) )
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:654:1: (lv_reset_23_0= 'reset' )
                            {
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:654:1: (lv_reset_23_0= 'reset' )
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:655:3: lv_reset_23_0= 'reset'
                            {
                            lv_reset_23_0=(Token)match(input,36,FOLLOW_36_in_ruleRow1542); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_reset_23_0, grammarAccess.getRowAccess().getResetResetKeyword_5_2_1_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getRowRule());
                              	        }
                                     		setWithLastConsumed(current, "reset", true, "reset");
                              	    
                            }

                            }


                            }

                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:668:2: (otherlv_24= 'count' )?
                            int alt25=2;
                            int LA25_0 = input.LA(1);

                            if ( (LA25_0==37) ) {
                                alt25=1;
                            }
                            switch (alt25) {
                                case 1 :
                                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:668:4: otherlv_24= 'count'
                                    {
                                    otherlv_24=(Token)match(input,37,FOLLOW_37_in_ruleRow1568); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_24, grammarAccess.getRowAccess().getCountKeyword_5_2_2());
                                          
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    otherlv_25=(Token)match(input,38,FOLLOW_38_in_ruleRow1584); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_25, grammarAccess.getRowAccess().getRightParenthesisKeyword_5_3());
                          
                    }

                    }
                    break;

            }

            otherlv_26=(Token)match(input,15,FOLLOW_15_in_ruleRow1598); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_26, grammarAccess.getRowAccess().getColonKeyword_6());
                  
            }
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:680:1: (this_LF_27= RULE_LF )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_LF) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:680:2: this_LF_27= RULE_LF
                    {
                    this_LF_27=(Token)match(input,RULE_LF,FOLLOW_RULE_LF_in_ruleRow1610); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LF_27, grammarAccess.getRowAccess().getLFTerminalRuleCall_7()); 
                          
                    }

                    }
                    break;

            }

            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:684:3: ( (lv_operations_28_0= ruleInlineOperation ) )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:685:1: (lv_operations_28_0= ruleInlineOperation )
            {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:685:1: (lv_operations_28_0= ruleInlineOperation )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:686:3: lv_operations_28_0= ruleInlineOperation
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRowAccess().getOperationsInlineOperationParserRuleCall_8_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleInlineOperation_in_ruleRow1632);
            lv_operations_28_0=ruleInlineOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRowRule());
              	        }
                     		add(
                     			current, 
                     			"operations",
                      		lv_operations_28_0, 
                      		"InlineOperation");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:702:2: (otherlv_29= ',' ( (lv_operations_30_0= ruleInlineOperation ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==23) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:702:4: otherlv_29= ',' ( (lv_operations_30_0= ruleInlineOperation ) )
            	    {
            	    otherlv_29=(Token)match(input,23,FOLLOW_23_in_ruleRow1645); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_29, grammarAccess.getRowAccess().getCommaKeyword_9_0());
            	          
            	    }
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:706:1: ( (lv_operations_30_0= ruleInlineOperation ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:707:1: (lv_operations_30_0= ruleInlineOperation )
            	    {
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:707:1: (lv_operations_30_0= ruleInlineOperation )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:708:3: lv_operations_30_0= ruleInlineOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRowAccess().getOperationsInlineOperationParserRuleCall_9_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleInlineOperation_in_ruleRow1666);
            	    lv_operations_30_0=ruleInlineOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRowRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"operations",
            	              		lv_operations_30_0, 
            	              		"InlineOperation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:724:4: ( ( RULE_LF )=>this_LF_31= RULE_LF )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_LF) ) {
                int LA30_1 = input.LA(2);

                if ( (synpred1_InternalKnittingExpressionLanguage()) ) {
                    alt30=1;
                }
            }
            switch (alt30) {
                case 1 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:724:5: ( RULE_LF )=>this_LF_31= RULE_LF
                    {
                    this_LF_31=(Token)match(input,RULE_LF,FOLLOW_RULE_LF_in_ruleRow1685); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LF_31, grammarAccess.getRowAccess().getLFTerminalRuleCall_10()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleRow"


    // $ANTLR start "entryRuleMessage"
    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:736:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:737:2: (iv_ruleMessage= ruleMessage EOF )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:738:2: iv_ruleMessage= ruleMessage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMessageRule()); 
            }
            pushFollow(FOLLOW_ruleMessage_in_entryRuleMessage1722);
            iv_ruleMessage=ruleMessage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMessage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessage1732); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMessage"


    // $ANTLR start "ruleMessage"
    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:745:1: ruleMessage returns [EObject current=null] : ( ( (lv_message_0_0= RULE_STRING ) ) this_LF_1= RULE_LF ) ;
    public final EObject ruleMessage() throws RecognitionException {
        EObject current = null;

        Token lv_message_0_0=null;
        Token this_LF_1=null;

         enterRule(); 
            
        try {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:748:28: ( ( ( (lv_message_0_0= RULE_STRING ) ) this_LF_1= RULE_LF ) )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:749:1: ( ( (lv_message_0_0= RULE_STRING ) ) this_LF_1= RULE_LF )
            {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:749:1: ( ( (lv_message_0_0= RULE_STRING ) ) this_LF_1= RULE_LF )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:749:2: ( (lv_message_0_0= RULE_STRING ) ) this_LF_1= RULE_LF
            {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:749:2: ( (lv_message_0_0= RULE_STRING ) )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:750:1: (lv_message_0_0= RULE_STRING )
            {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:750:1: (lv_message_0_0= RULE_STRING )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:751:3: lv_message_0_0= RULE_STRING
            {
            lv_message_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMessage1774); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_message_0_0, grammarAccess.getMessageAccess().getMessageSTRINGTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMessageRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"message",
                      		lv_message_0_0, 
                      		"STRING");
              	    
            }

            }


            }

            this_LF_1=(Token)match(input,RULE_LF,FOLLOW_RULE_LF_in_ruleMessage1790); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LF_1, grammarAccess.getMessageAccess().getLFTerminalRuleCall_1()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleMessage"


    // $ANTLR start "entryRuleInlineOperation"
    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:779:1: entryRuleInlineOperation returns [EObject current=null] : iv_ruleInlineOperation= ruleInlineOperation EOF ;
    public final EObject entryRuleInlineOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInlineOperation = null;


        try {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:780:2: (iv_ruleInlineOperation= ruleInlineOperation EOF )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:781:2: iv_ruleInlineOperation= ruleInlineOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInlineOperationRule()); 
            }
            pushFollow(FOLLOW_ruleInlineOperation_in_entryRuleInlineOperation1825);
            iv_ruleInlineOperation=ruleInlineOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInlineOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInlineOperation1835); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInlineOperation"


    // $ANTLR start "ruleInlineOperation"
    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:788:1: ruleInlineOperation returns [EObject current=null] : (this_Knit_0= ruleKnit | this_Purl_1= rulePurl | this_Slip_2= ruleSlip | this_Repeat_3= ruleRepeat ) ;
    public final EObject ruleInlineOperation() throws RecognitionException {
        EObject current = null;

        EObject this_Knit_0 = null;

        EObject this_Purl_1 = null;

        EObject this_Slip_2 = null;

        EObject this_Repeat_3 = null;


         enterRule(); 
            
        try {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:791:28: ( (this_Knit_0= ruleKnit | this_Purl_1= rulePurl | this_Slip_2= ruleSlip | this_Repeat_3= ruleRepeat ) )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:792:1: (this_Knit_0= ruleKnit | this_Purl_1= rulePurl | this_Slip_2= ruleSlip | this_Repeat_3= ruleRepeat )
            {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:792:1: (this_Knit_0= ruleKnit | this_Purl_1= rulePurl | this_Slip_2= ruleSlip | this_Repeat_3= ruleRepeat )
            int alt31=4;
            switch ( input.LA(1) ) {
            case 39:
            case 40:
            case 41:
            case 42:
                {
                alt31=1;
                }
                break;
            case 49:
            case 50:
            case 51:
            case 52:
                {
                alt31=2;
                }
                break;
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
                {
                alt31=3;
                }
                break;
            case 74:
            case 75:
            case 76:
                {
                alt31=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:793:5: this_Knit_0= ruleKnit
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInlineOperationAccess().getKnitParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleKnit_in_ruleInlineOperation1882);
                    this_Knit_0=ruleKnit();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Knit_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:803:5: this_Purl_1= rulePurl
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInlineOperationAccess().getPurlParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulePurl_in_ruleInlineOperation1909);
                    this_Purl_1=rulePurl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Purl_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:813:5: this_Slip_2= ruleSlip
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInlineOperationAccess().getSlipParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSlip_in_ruleInlineOperation1936);
                    this_Slip_2=ruleSlip();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Slip_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:823:5: this_Repeat_3= ruleRepeat
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInlineOperationAccess().getRepeatParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRepeat_in_ruleInlineOperation1963);
                    this_Repeat_3=ruleRepeat();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Repeat_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleInlineOperation"


    // $ANTLR start "entryRuleKnit"
    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:839:1: entryRuleKnit returns [EObject current=null] : iv_ruleKnit= ruleKnit EOF ;
    public final EObject entryRuleKnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKnit = null;


        try {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:840:2: (iv_ruleKnit= ruleKnit EOF )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:841:2: iv_ruleKnit= ruleKnit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKnitRule()); 
            }
            pushFollow(FOLLOW_ruleKnit_in_entryRuleKnit1998);
            iv_ruleKnit=ruleKnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKnit; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleKnit2008); if (state.failed) return current;

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
    // $ANTLR end "entryRuleKnit"


    // $ANTLR start "ruleKnit"
    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:848:1: ruleKnit returns [EObject current=null] : ( (otherlv_0= 'K' | otherlv_1= 'k' | otherlv_2= 'Knit' | otherlv_3= 'knit' ) () ( (lv_number_5_0= RULE_INT ) )? (otherlv_6= 'st' | otherlv_7= 'sts' )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_together_9_0= 'tog' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) ) ) ) ) )* ) ) ) (otherlv_11= 'with' ( (lv_yarnRef_12_0= RULE_ID ) ) )? ( (otherlv_13= 'to' )? ( (lv_repeat_14_0= ruleRepeatSpec ) ) )? ) ;
    public final EObject ruleKnit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_number_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_together_9_0=null;
        Token lv_throughTrailingLoop_10_1=null;
        Token lv_throughTrailingLoop_10_2=null;
        Token otherlv_11=null;
        Token lv_yarnRef_12_0=null;
        Token otherlv_13=null;
        EObject lv_repeat_14_0 = null;


         enterRule(); 
            
        try {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:851:28: ( ( (otherlv_0= 'K' | otherlv_1= 'k' | otherlv_2= 'Knit' | otherlv_3= 'knit' ) () ( (lv_number_5_0= RULE_INT ) )? (otherlv_6= 'st' | otherlv_7= 'sts' )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_together_9_0= 'tog' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) ) ) ) ) )* ) ) ) (otherlv_11= 'with' ( (lv_yarnRef_12_0= RULE_ID ) ) )? ( (otherlv_13= 'to' )? ( (lv_repeat_14_0= ruleRepeatSpec ) ) )? ) )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:852:1: ( (otherlv_0= 'K' | otherlv_1= 'k' | otherlv_2= 'Knit' | otherlv_3= 'knit' ) () ( (lv_number_5_0= RULE_INT ) )? (otherlv_6= 'st' | otherlv_7= 'sts' )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_together_9_0= 'tog' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) ) ) ) ) )* ) ) ) (otherlv_11= 'with' ( (lv_yarnRef_12_0= RULE_ID ) ) )? ( (otherlv_13= 'to' )? ( (lv_repeat_14_0= ruleRepeatSpec ) ) )? )
            {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:852:1: ( (otherlv_0= 'K' | otherlv_1= 'k' | otherlv_2= 'Knit' | otherlv_3= 'knit' ) () ( (lv_number_5_0= RULE_INT ) )? (otherlv_6= 'st' | otherlv_7= 'sts' )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_together_9_0= 'tog' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) ) ) ) ) )* ) ) ) (otherlv_11= 'with' ( (lv_yarnRef_12_0= RULE_ID ) ) )? ( (otherlv_13= 'to' )? ( (lv_repeat_14_0= ruleRepeatSpec ) ) )? )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:852:2: (otherlv_0= 'K' | otherlv_1= 'k' | otherlv_2= 'Knit' | otherlv_3= 'knit' ) () ( (lv_number_5_0= RULE_INT ) )? (otherlv_6= 'st' | otherlv_7= 'sts' )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_together_9_0= 'tog' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) ) ) ) ) )* ) ) ) (otherlv_11= 'with' ( (lv_yarnRef_12_0= RULE_ID ) ) )? ( (otherlv_13= 'to' )? ( (lv_repeat_14_0= ruleRepeatSpec ) ) )?
            {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:852:2: (otherlv_0= 'K' | otherlv_1= 'k' | otherlv_2= 'Knit' | otherlv_3= 'knit' )
            int alt32=4;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt32=1;
                }
                break;
            case 40:
                {
                alt32=2;
                }
                break;
            case 41:
                {
                alt32=3;
                }
                break;
            case 42:
                {
                alt32=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:852:4: otherlv_0= 'K'
                    {
                    otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleKnit2046); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getKnitAccess().getKKeyword_0_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:857:7: otherlv_1= 'k'
                    {
                    otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleKnit2064); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getKnitAccess().getKKeyword_0_1());
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:862:7: otherlv_2= 'Knit'
                    {
                    otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleKnit2082); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getKnitAccess().getKnitKeyword_0_2());
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:867:7: otherlv_3= 'knit'
                    {
                    otherlv_3=(Token)match(input,42,FOLLOW_42_in_ruleKnit2100); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getKnitAccess().getKnitKeyword_0_3());
                          
                    }

                    }
                    break;

            }

            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:871:2: ()
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:872:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getKnitAccess().getKnitAction_1(),
                          current);
                  
            }

            }

            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:877:2: ( (lv_number_5_0= RULE_INT ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_INT) ) {
                switch ( input.LA(2) ) {
                    case 43:
                        {
                        int LA33_3 = input.LA(3);

                        if ( (LA33_3==EOF||LA33_3==RULE_LF||(LA33_3>=RULE_INT && LA33_3<=RULE_STRING)||LA33_3==12||LA33_3==14||(LA33_3>=16 && LA33_3<=23)||LA33_3==32||(LA33_3>=45 && LA33_3<=48)||(LA33_3>=68 && LA33_3<=69)||LA33_3==77) ) {
                            alt33=1;
                        }
                        }
                        break;
                    case 44:
                        {
                        int LA33_4 = input.LA(3);

                        if ( (LA33_4==EOF||LA33_4==RULE_LF||(LA33_4>=RULE_INT && LA33_4<=RULE_STRING)||LA33_4==12||LA33_4==14||(LA33_4>=16 && LA33_4<=23)||LA33_4==32||(LA33_4>=45 && LA33_4<=48)||(LA33_4>=68 && LA33_4<=69)||LA33_4==77) ) {
                            alt33=1;
                        }
                        }
                        break;
                    case EOF:
                    case RULE_LF:
                    case RULE_INT:
                    case RULE_STRING:
                    case 12:
                    case 14:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 32:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 68:
                    case 69:
                    case 77:
                        {
                        alt33=1;
                        }
                        break;
                }

            }
            switch (alt33) {
                case 1 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:878:1: (lv_number_5_0= RULE_INT )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:878:1: (lv_number_5_0= RULE_INT )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:879:3: lv_number_5_0= RULE_INT
                    {
                    lv_number_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleKnit2127); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_number_5_0, grammarAccess.getKnitAccess().getNumberINTTerminalRuleCall_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getKnitRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"number",
                              		lv_number_5_0, 
                              		"INT");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:895:3: (otherlv_6= 'st' | otherlv_7= 'sts' )?
            int alt34=3;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==43) ) {
                alt34=1;
            }
            else if ( (LA34_0==44) ) {
                alt34=2;
            }
            switch (alt34) {
                case 1 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:895:5: otherlv_6= 'st'
                    {
                    otherlv_6=(Token)match(input,43,FOLLOW_43_in_ruleKnit2146); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getKnitAccess().getStKeyword_3_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:900:7: otherlv_7= 'sts'
                    {
                    otherlv_7=(Token)match(input,44,FOLLOW_44_in_ruleKnit2164); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getKnitAccess().getStsKeyword_3_1());
                          
                    }

                    }
                    break;

            }

            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:904:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_together_9_0= 'tog' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) ) ) ) ) )* ) ) )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:906:1: ( ( ( ({...}? => ( ({...}? => ( (lv_together_9_0= 'tog' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) ) ) ) ) )* ) )
            {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:906:1: ( ( ( ({...}? => ( ({...}? => ( (lv_together_9_0= 'tog' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) ) ) ) ) )* ) )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:907:2: ( ( ({...}? => ( ({...}? => ( (lv_together_9_0= 'tog' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getKnitAccess().getUnorderedGroup_4());
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:910:2: ( ( ({...}? => ( ({...}? => ( (lv_together_9_0= 'tog' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) ) ) ) ) )* )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:911:3: ( ({...}? => ( ({...}? => ( (lv_together_9_0= 'tog' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) ) ) ) ) )*
            {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:911:3: ( ({...}? => ( ({...}? => ( (lv_together_9_0= 'tog' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) ) ) ) ) )*
            loop36:
            do {
                int alt36=3;
                int LA36_0 = input.LA(1);

                if ( LA36_0 ==45 && getUnorderedGroupHelper().canSelect(grammarAccess.getKnitAccess().getUnorderedGroup_4(), 0) ) {
                    alt36=1;
                }
                else if ( LA36_0 >=46 && LA36_0<=47 && getUnorderedGroupHelper().canSelect(grammarAccess.getKnitAccess().getUnorderedGroup_4(), 1) ) {
                    alt36=2;
                }


                switch (alt36) {
            	case 1 :
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:913:4: ({...}? => ( ({...}? => ( (lv_together_9_0= 'tog' ) ) ) ) )
            	    {
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:913:4: ({...}? => ( ({...}? => ( (lv_together_9_0= 'tog' ) ) ) ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:914:5: {...}? => ( ({...}? => ( (lv_together_9_0= 'tog' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getKnitAccess().getUnorderedGroup_4(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleKnit", "getUnorderedGroupHelper().canSelect(grammarAccess.getKnitAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:914:101: ( ({...}? => ( (lv_together_9_0= 'tog' ) ) ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:915:6: ({...}? => ( (lv_together_9_0= 'tog' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getKnitAccess().getUnorderedGroup_4(), 0);
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:918:6: ({...}? => ( (lv_together_9_0= 'tog' ) ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:918:7: {...}? => ( (lv_together_9_0= 'tog' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleKnit", "true");
            	    }
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:918:16: ( (lv_together_9_0= 'tog' ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:919:1: (lv_together_9_0= 'tog' )
            	    {
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:919:1: (lv_together_9_0= 'tog' )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:920:3: lv_together_9_0= 'tog'
            	    {
            	    lv_together_9_0=(Token)match(input,45,FOLLOW_45_in_ruleKnit2229); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              newLeafNode(lv_together_9_0, grammarAccess.getKnitAccess().getTogetherTogKeyword_4_0_0());
            	          
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getKnitRule());
            	      	        }
            	             		setWithLastConsumed(current, "together", true, "tog");
            	      	    
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getKnitAccess().getUnorderedGroup_4());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:940:4: ({...}? => ( ({...}? => ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) ) ) ) )
            	    {
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:940:4: ({...}? => ( ({...}? => ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) ) ) ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:941:5: {...}? => ( ({...}? => ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getKnitAccess().getUnorderedGroup_4(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleKnit", "getUnorderedGroupHelper().canSelect(grammarAccess.getKnitAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:941:101: ( ({...}? => ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) ) ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:942:6: ({...}? => ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getKnitAccess().getUnorderedGroup_4(), 1);
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:945:6: ({...}? => ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:945:7: {...}? => ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleKnit", "true");
            	    }
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:945:16: ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:946:1: ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) )
            	    {
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:946:1: ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:947:1: (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' )
            	    {
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:947:1: (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' )
            	    int alt35=2;
            	    int LA35_0 = input.LA(1);

            	    if ( (LA35_0==46) ) {
            	        alt35=1;
            	    }
            	    else if ( (LA35_0==47) ) {
            	        alt35=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 35, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt35) {
            	        case 1 :
            	            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:948:3: lv_throughTrailingLoop_10_1= 'tbl'
            	            {
            	            lv_throughTrailingLoop_10_1=(Token)match(input,46,FOLLOW_46_in_ruleKnit2316); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_throughTrailingLoop_10_1, grammarAccess.getKnitAccess().getThroughTrailingLoopTblKeyword_4_1_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getKnitRule());
            	              	        }
            	                     		setWithLastConsumed(current, "throughTrailingLoop", true, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:960:8: lv_throughTrailingLoop_10_2= 'ttl'
            	            {
            	            lv_throughTrailingLoop_10_2=(Token)match(input,47,FOLLOW_47_in_ruleKnit2345); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_throughTrailingLoop_10_2, grammarAccess.getKnitAccess().getThroughTrailingLoopTtlKeyword_4_1_0_1());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getKnitRule());
            	              	        }
            	                     		setWithLastConsumed(current, "throughTrailingLoop", true, null);
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getKnitAccess().getUnorderedGroup_4());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getKnitAccess().getUnorderedGroup_4());

            }

            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:989:2: (otherlv_11= 'with' ( (lv_yarnRef_12_0= RULE_ID ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==32) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:989:4: otherlv_11= 'with' ( (lv_yarnRef_12_0= RULE_ID ) )
                    {
                    otherlv_11=(Token)match(input,32,FOLLOW_32_in_ruleKnit2414); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getKnitAccess().getWithKeyword_5_0());
                          
                    }
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:993:1: ( (lv_yarnRef_12_0= RULE_ID ) )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:994:1: (lv_yarnRef_12_0= RULE_ID )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:994:1: (lv_yarnRef_12_0= RULE_ID )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:995:3: lv_yarnRef_12_0= RULE_ID
                    {
                    lv_yarnRef_12_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleKnit2431); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_yarnRef_12_0, grammarAccess.getKnitAccess().getYarnRefIDTerminalRuleCall_5_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getKnitRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"yarnRef",
                              		lv_yarnRef_12_0, 
                              		"ID");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1011:4: ( (otherlv_13= 'to' )? ( (lv_repeat_14_0= ruleRepeatSpec ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_INT||LA39_0==48||(LA39_0>=68 && LA39_0<=69)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1011:5: (otherlv_13= 'to' )? ( (lv_repeat_14_0= ruleRepeatSpec ) )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1011:5: (otherlv_13= 'to' )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==48) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1011:7: otherlv_13= 'to'
                            {
                            otherlv_13=(Token)match(input,48,FOLLOW_48_in_ruleKnit2452); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_13, grammarAccess.getKnitAccess().getToKeyword_6_0());
                                  
                            }

                            }
                            break;

                    }

                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1015:3: ( (lv_repeat_14_0= ruleRepeatSpec ) )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1016:1: (lv_repeat_14_0= ruleRepeatSpec )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1016:1: (lv_repeat_14_0= ruleRepeatSpec )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1017:3: lv_repeat_14_0= ruleRepeatSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getKnitAccess().getRepeatRepeatSpecParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRepeatSpec_in_ruleKnit2475);
                    lv_repeat_14_0=ruleRepeatSpec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getKnitRule());
                      	        }
                             		set(
                             			current, 
                             			"repeat",
                              		lv_repeat_14_0, 
                              		"RepeatSpec");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleKnit"


    // $ANTLR start "entryRulePurl"
    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1041:1: entryRulePurl returns [EObject current=null] : iv_rulePurl= rulePurl EOF ;
    public final EObject entryRulePurl() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePurl = null;


        try {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1042:2: (iv_rulePurl= rulePurl EOF )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1043:2: iv_rulePurl= rulePurl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPurlRule()); 
            }
            pushFollow(FOLLOW_rulePurl_in_entryRulePurl2513);
            iv_rulePurl=rulePurl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePurl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePurl2523); if (state.failed) return current;

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
    // $ANTLR end "entryRulePurl"


    // $ANTLR start "rulePurl"
    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1050:1: rulePurl returns [EObject current=null] : ( (otherlv_0= 'P' | otherlv_1= 'p' | otherlv_2= 'Purl' | otherlv_3= 'purl' ) () ( (lv_number_5_0= RULE_INT ) )? (otherlv_6= 'st' | otherlv_7= 'sts' )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_together_9_0= 'tog' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) ) ) ) ) )* ) ) ) (otherlv_11= 'with' ( (lv_yarnRef_12_0= RULE_ID ) ) )? ( (otherlv_13= 'to' )? ( (lv_repeat_14_0= ruleRepeatSpec ) ) )? ) ;
    public final EObject rulePurl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_number_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_together_9_0=null;
        Token lv_throughTrailingLoop_10_1=null;
        Token lv_throughTrailingLoop_10_2=null;
        Token otherlv_11=null;
        Token lv_yarnRef_12_0=null;
        Token otherlv_13=null;
        EObject lv_repeat_14_0 = null;


         enterRule(); 
            
        try {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1053:28: ( ( (otherlv_0= 'P' | otherlv_1= 'p' | otherlv_2= 'Purl' | otherlv_3= 'purl' ) () ( (lv_number_5_0= RULE_INT ) )? (otherlv_6= 'st' | otherlv_7= 'sts' )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_together_9_0= 'tog' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) ) ) ) ) )* ) ) ) (otherlv_11= 'with' ( (lv_yarnRef_12_0= RULE_ID ) ) )? ( (otherlv_13= 'to' )? ( (lv_repeat_14_0= ruleRepeatSpec ) ) )? ) )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1054:1: ( (otherlv_0= 'P' | otherlv_1= 'p' | otherlv_2= 'Purl' | otherlv_3= 'purl' ) () ( (lv_number_5_0= RULE_INT ) )? (otherlv_6= 'st' | otherlv_7= 'sts' )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_together_9_0= 'tog' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) ) ) ) ) )* ) ) ) (otherlv_11= 'with' ( (lv_yarnRef_12_0= RULE_ID ) ) )? ( (otherlv_13= 'to' )? ( (lv_repeat_14_0= ruleRepeatSpec ) ) )? )
            {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1054:1: ( (otherlv_0= 'P' | otherlv_1= 'p' | otherlv_2= 'Purl' | otherlv_3= 'purl' ) () ( (lv_number_5_0= RULE_INT ) )? (otherlv_6= 'st' | otherlv_7= 'sts' )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_together_9_0= 'tog' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) ) ) ) ) )* ) ) ) (otherlv_11= 'with' ( (lv_yarnRef_12_0= RULE_ID ) ) )? ( (otherlv_13= 'to' )? ( (lv_repeat_14_0= ruleRepeatSpec ) ) )? )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1054:2: (otherlv_0= 'P' | otherlv_1= 'p' | otherlv_2= 'Purl' | otherlv_3= 'purl' ) () ( (lv_number_5_0= RULE_INT ) )? (otherlv_6= 'st' | otherlv_7= 'sts' )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_together_9_0= 'tog' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) ) ) ) ) )* ) ) ) (otherlv_11= 'with' ( (lv_yarnRef_12_0= RULE_ID ) ) )? ( (otherlv_13= 'to' )? ( (lv_repeat_14_0= ruleRepeatSpec ) ) )?
            {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1054:2: (otherlv_0= 'P' | otherlv_1= 'p' | otherlv_2= 'Purl' | otherlv_3= 'purl' )
            int alt40=4;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt40=1;
                }
                break;
            case 50:
                {
                alt40=2;
                }
                break;
            case 51:
                {
                alt40=3;
                }
                break;
            case 52:
                {
                alt40=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1054:4: otherlv_0= 'P'
                    {
                    otherlv_0=(Token)match(input,49,FOLLOW_49_in_rulePurl2561); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getPurlAccess().getPKeyword_0_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1059:7: otherlv_1= 'p'
                    {
                    otherlv_1=(Token)match(input,50,FOLLOW_50_in_rulePurl2579); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getPurlAccess().getPKeyword_0_1());
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1064:7: otherlv_2= 'Purl'
                    {
                    otherlv_2=(Token)match(input,51,FOLLOW_51_in_rulePurl2597); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getPurlAccess().getPurlKeyword_0_2());
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1069:7: otherlv_3= 'purl'
                    {
                    otherlv_3=(Token)match(input,52,FOLLOW_52_in_rulePurl2615); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getPurlAccess().getPurlKeyword_0_3());
                          
                    }

                    }
                    break;

            }

            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1073:2: ()
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1074:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getPurlAccess().getPurlAction_1(),
                          current);
                  
            }

            }

            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1079:2: ( (lv_number_5_0= RULE_INT ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_INT) ) {
                switch ( input.LA(2) ) {
                    case 43:
                        {
                        int LA41_3 = input.LA(3);

                        if ( (LA41_3==EOF||LA41_3==RULE_LF||(LA41_3>=RULE_INT && LA41_3<=RULE_STRING)||LA41_3==12||LA41_3==14||(LA41_3>=16 && LA41_3<=23)||LA41_3==32||(LA41_3>=45 && LA41_3<=48)||(LA41_3>=68 && LA41_3<=69)||LA41_3==77) ) {
                            alt41=1;
                        }
                        }
                        break;
                    case 44:
                        {
                        int LA41_4 = input.LA(3);

                        if ( (LA41_4==EOF||LA41_4==RULE_LF||(LA41_4>=RULE_INT && LA41_4<=RULE_STRING)||LA41_4==12||LA41_4==14||(LA41_4>=16 && LA41_4<=23)||LA41_4==32||(LA41_4>=45 && LA41_4<=48)||(LA41_4>=68 && LA41_4<=69)||LA41_4==77) ) {
                            alt41=1;
                        }
                        }
                        break;
                    case EOF:
                    case RULE_LF:
                    case RULE_INT:
                    case RULE_STRING:
                    case 12:
                    case 14:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 32:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 68:
                    case 69:
                    case 77:
                        {
                        alt41=1;
                        }
                        break;
                }

            }
            switch (alt41) {
                case 1 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1080:1: (lv_number_5_0= RULE_INT )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1080:1: (lv_number_5_0= RULE_INT )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1081:3: lv_number_5_0= RULE_INT
                    {
                    lv_number_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePurl2642); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_number_5_0, grammarAccess.getPurlAccess().getNumberINTTerminalRuleCall_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPurlRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"number",
                              		lv_number_5_0, 
                              		"INT");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1097:3: (otherlv_6= 'st' | otherlv_7= 'sts' )?
            int alt42=3;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==43) ) {
                alt42=1;
            }
            else if ( (LA42_0==44) ) {
                alt42=2;
            }
            switch (alt42) {
                case 1 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1097:5: otherlv_6= 'st'
                    {
                    otherlv_6=(Token)match(input,43,FOLLOW_43_in_rulePurl2661); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getPurlAccess().getStKeyword_3_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1102:7: otherlv_7= 'sts'
                    {
                    otherlv_7=(Token)match(input,44,FOLLOW_44_in_rulePurl2679); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getPurlAccess().getStsKeyword_3_1());
                          
                    }

                    }
                    break;

            }

            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1106:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_together_9_0= 'tog' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) ) ) ) ) )* ) ) )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1108:1: ( ( ( ({...}? => ( ({...}? => ( (lv_together_9_0= 'tog' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) ) ) ) ) )* ) )
            {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1108:1: ( ( ( ({...}? => ( ({...}? => ( (lv_together_9_0= 'tog' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) ) ) ) ) )* ) )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1109:2: ( ( ({...}? => ( ({...}? => ( (lv_together_9_0= 'tog' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getPurlAccess().getUnorderedGroup_4());
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1112:2: ( ( ({...}? => ( ({...}? => ( (lv_together_9_0= 'tog' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) ) ) ) ) )* )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1113:3: ( ({...}? => ( ({...}? => ( (lv_together_9_0= 'tog' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) ) ) ) ) )*
            {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1113:3: ( ({...}? => ( ({...}? => ( (lv_together_9_0= 'tog' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) ) ) ) ) )*
            loop44:
            do {
                int alt44=3;
                int LA44_0 = input.LA(1);

                if ( LA44_0 ==45 && getUnorderedGroupHelper().canSelect(grammarAccess.getPurlAccess().getUnorderedGroup_4(), 0) ) {
                    alt44=1;
                }
                else if ( LA44_0 >=46 && LA44_0<=47 && getUnorderedGroupHelper().canSelect(grammarAccess.getPurlAccess().getUnorderedGroup_4(), 1) ) {
                    alt44=2;
                }


                switch (alt44) {
            	case 1 :
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1115:4: ({...}? => ( ({...}? => ( (lv_together_9_0= 'tog' ) ) ) ) )
            	    {
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1115:4: ({...}? => ( ({...}? => ( (lv_together_9_0= 'tog' ) ) ) ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1116:5: {...}? => ( ({...}? => ( (lv_together_9_0= 'tog' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPurlAccess().getUnorderedGroup_4(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "rulePurl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPurlAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1116:101: ( ({...}? => ( (lv_together_9_0= 'tog' ) ) ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1117:6: ({...}? => ( (lv_together_9_0= 'tog' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getPurlAccess().getUnorderedGroup_4(), 0);
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1120:6: ({...}? => ( (lv_together_9_0= 'tog' ) ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1120:7: {...}? => ( (lv_together_9_0= 'tog' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "rulePurl", "true");
            	    }
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1120:16: ( (lv_together_9_0= 'tog' ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1121:1: (lv_together_9_0= 'tog' )
            	    {
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1121:1: (lv_together_9_0= 'tog' )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1122:3: lv_together_9_0= 'tog'
            	    {
            	    lv_together_9_0=(Token)match(input,45,FOLLOW_45_in_rulePurl2744); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              newLeafNode(lv_together_9_0, grammarAccess.getPurlAccess().getTogetherTogKeyword_4_0_0());
            	          
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getPurlRule());
            	      	        }
            	             		setWithLastConsumed(current, "together", true, "tog");
            	      	    
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPurlAccess().getUnorderedGroup_4());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1142:4: ({...}? => ( ({...}? => ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) ) ) ) )
            	    {
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1142:4: ({...}? => ( ({...}? => ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) ) ) ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1143:5: {...}? => ( ({...}? => ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPurlAccess().getUnorderedGroup_4(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "rulePurl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPurlAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1143:101: ( ({...}? => ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) ) ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1144:6: ({...}? => ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getPurlAccess().getUnorderedGroup_4(), 1);
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1147:6: ({...}? => ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1147:7: {...}? => ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "rulePurl", "true");
            	    }
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1147:16: ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1148:1: ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) )
            	    {
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1148:1: ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1149:1: (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' )
            	    {
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1149:1: (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' )
            	    int alt43=2;
            	    int LA43_0 = input.LA(1);

            	    if ( (LA43_0==46) ) {
            	        alt43=1;
            	    }
            	    else if ( (LA43_0==47) ) {
            	        alt43=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 43, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt43) {
            	        case 1 :
            	            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1150:3: lv_throughTrailingLoop_10_1= 'tbl'
            	            {
            	            lv_throughTrailingLoop_10_1=(Token)match(input,46,FOLLOW_46_in_rulePurl2831); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_throughTrailingLoop_10_1, grammarAccess.getPurlAccess().getThroughTrailingLoopTblKeyword_4_1_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getPurlRule());
            	              	        }
            	                     		setWithLastConsumed(current, "throughTrailingLoop", true, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1162:8: lv_throughTrailingLoop_10_2= 'ttl'
            	            {
            	            lv_throughTrailingLoop_10_2=(Token)match(input,47,FOLLOW_47_in_rulePurl2860); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_throughTrailingLoop_10_2, grammarAccess.getPurlAccess().getThroughTrailingLoopTtlKeyword_4_1_0_1());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getPurlRule());
            	              	        }
            	                     		setWithLastConsumed(current, "throughTrailingLoop", true, null);
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPurlAccess().getUnorderedGroup_4());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getPurlAccess().getUnorderedGroup_4());

            }

            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1191:2: (otherlv_11= 'with' ( (lv_yarnRef_12_0= RULE_ID ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==32) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1191:4: otherlv_11= 'with' ( (lv_yarnRef_12_0= RULE_ID ) )
                    {
                    otherlv_11=(Token)match(input,32,FOLLOW_32_in_rulePurl2929); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getPurlAccess().getWithKeyword_5_0());
                          
                    }
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1195:1: ( (lv_yarnRef_12_0= RULE_ID ) )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1196:1: (lv_yarnRef_12_0= RULE_ID )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1196:1: (lv_yarnRef_12_0= RULE_ID )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1197:3: lv_yarnRef_12_0= RULE_ID
                    {
                    lv_yarnRef_12_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePurl2946); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_yarnRef_12_0, grammarAccess.getPurlAccess().getYarnRefIDTerminalRuleCall_5_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPurlRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"yarnRef",
                              		lv_yarnRef_12_0, 
                              		"ID");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1213:4: ( (otherlv_13= 'to' )? ( (lv_repeat_14_0= ruleRepeatSpec ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_INT||LA47_0==48||(LA47_0>=68 && LA47_0<=69)) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1213:5: (otherlv_13= 'to' )? ( (lv_repeat_14_0= ruleRepeatSpec ) )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1213:5: (otherlv_13= 'to' )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==48) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1213:7: otherlv_13= 'to'
                            {
                            otherlv_13=(Token)match(input,48,FOLLOW_48_in_rulePurl2967); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_13, grammarAccess.getPurlAccess().getToKeyword_6_0());
                                  
                            }

                            }
                            break;

                    }

                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1217:3: ( (lv_repeat_14_0= ruleRepeatSpec ) )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1218:1: (lv_repeat_14_0= ruleRepeatSpec )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1218:1: (lv_repeat_14_0= ruleRepeatSpec )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1219:3: lv_repeat_14_0= ruleRepeatSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPurlAccess().getRepeatRepeatSpecParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRepeatSpec_in_rulePurl2990);
                    lv_repeat_14_0=ruleRepeatSpec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPurlRule());
                      	        }
                             		set(
                             			current, 
                             			"repeat",
                              		lv_repeat_14_0, 
                              		"RepeatSpec");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePurl"


    // $ANTLR start "entryRuleSlip"
    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1243:1: entryRuleSlip returns [EObject current=null] : iv_ruleSlip= ruleSlip EOF ;
    public final EObject entryRuleSlip() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlip = null;


        try {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1244:2: (iv_ruleSlip= ruleSlip EOF )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1245:2: iv_ruleSlip= ruleSlip EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSlipRule()); 
            }
            pushFollow(FOLLOW_ruleSlip_in_entryRuleSlip3028);
            iv_ruleSlip=ruleSlip();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSlip; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSlip3038); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSlip"


    // $ANTLR start "ruleSlip"
    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1252:1: ruleSlip returns [EObject current=null] : ( () ( ( (lv_reverse_1_1= 'Rev' | lv_reverse_1_2= 'Reverse' | lv_reverse_1_3= 'rev' | lv_reverse_1_4= 'reverse' ) ) )? (otherlv_2= 'Sl' | otherlv_3= 'sl' | otherlv_4= 'Slip' | otherlv_5= 'slip' ) ( ( ( (lv_number_6_0= RULE_INT ) ) (otherlv_7= 'st' | otherlv_8= 'sts' )? ) | otherlv_9= 'next st' )? ( ( ( (lv_knitwise_10_1= 'kw' | lv_knitwise_10_2= 'knitwise' ) ) ) | ( ( (lv_purlwise_11_1= 'pw' | lv_purlwise_11_2= 'purlwise' ) ) ) )? ( ( (lv_yarnPosition_12_1= 'wyif' | lv_yarnPosition_12_2= 'wyib' ) ) )? ) ;
    public final EObject ruleSlip() throws RecognitionException {
        EObject current = null;

        Token lv_reverse_1_1=null;
        Token lv_reverse_1_2=null;
        Token lv_reverse_1_3=null;
        Token lv_reverse_1_4=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_number_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_knitwise_10_1=null;
        Token lv_knitwise_10_2=null;
        Token lv_purlwise_11_1=null;
        Token lv_purlwise_11_2=null;
        Token lv_yarnPosition_12_1=null;
        Token lv_yarnPosition_12_2=null;

         enterRule(); 
            
        try {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1255:28: ( ( () ( ( (lv_reverse_1_1= 'Rev' | lv_reverse_1_2= 'Reverse' | lv_reverse_1_3= 'rev' | lv_reverse_1_4= 'reverse' ) ) )? (otherlv_2= 'Sl' | otherlv_3= 'sl' | otherlv_4= 'Slip' | otherlv_5= 'slip' ) ( ( ( (lv_number_6_0= RULE_INT ) ) (otherlv_7= 'st' | otherlv_8= 'sts' )? ) | otherlv_9= 'next st' )? ( ( ( (lv_knitwise_10_1= 'kw' | lv_knitwise_10_2= 'knitwise' ) ) ) | ( ( (lv_purlwise_11_1= 'pw' | lv_purlwise_11_2= 'purlwise' ) ) ) )? ( ( (lv_yarnPosition_12_1= 'wyif' | lv_yarnPosition_12_2= 'wyib' ) ) )? ) )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1256:1: ( () ( ( (lv_reverse_1_1= 'Rev' | lv_reverse_1_2= 'Reverse' | lv_reverse_1_3= 'rev' | lv_reverse_1_4= 'reverse' ) ) )? (otherlv_2= 'Sl' | otherlv_3= 'sl' | otherlv_4= 'Slip' | otherlv_5= 'slip' ) ( ( ( (lv_number_6_0= RULE_INT ) ) (otherlv_7= 'st' | otherlv_8= 'sts' )? ) | otherlv_9= 'next st' )? ( ( ( (lv_knitwise_10_1= 'kw' | lv_knitwise_10_2= 'knitwise' ) ) ) | ( ( (lv_purlwise_11_1= 'pw' | lv_purlwise_11_2= 'purlwise' ) ) ) )? ( ( (lv_yarnPosition_12_1= 'wyif' | lv_yarnPosition_12_2= 'wyib' ) ) )? )
            {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1256:1: ( () ( ( (lv_reverse_1_1= 'Rev' | lv_reverse_1_2= 'Reverse' | lv_reverse_1_3= 'rev' | lv_reverse_1_4= 'reverse' ) ) )? (otherlv_2= 'Sl' | otherlv_3= 'sl' | otherlv_4= 'Slip' | otherlv_5= 'slip' ) ( ( ( (lv_number_6_0= RULE_INT ) ) (otherlv_7= 'st' | otherlv_8= 'sts' )? ) | otherlv_9= 'next st' )? ( ( ( (lv_knitwise_10_1= 'kw' | lv_knitwise_10_2= 'knitwise' ) ) ) | ( ( (lv_purlwise_11_1= 'pw' | lv_purlwise_11_2= 'purlwise' ) ) ) )? ( ( (lv_yarnPosition_12_1= 'wyif' | lv_yarnPosition_12_2= 'wyib' ) ) )? )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1256:2: () ( ( (lv_reverse_1_1= 'Rev' | lv_reverse_1_2= 'Reverse' | lv_reverse_1_3= 'rev' | lv_reverse_1_4= 'reverse' ) ) )? (otherlv_2= 'Sl' | otherlv_3= 'sl' | otherlv_4= 'Slip' | otherlv_5= 'slip' ) ( ( ( (lv_number_6_0= RULE_INT ) ) (otherlv_7= 'st' | otherlv_8= 'sts' )? ) | otherlv_9= 'next st' )? ( ( ( (lv_knitwise_10_1= 'kw' | lv_knitwise_10_2= 'knitwise' ) ) ) | ( ( (lv_purlwise_11_1= 'pw' | lv_purlwise_11_2= 'purlwise' ) ) ) )? ( ( (lv_yarnPosition_12_1= 'wyif' | lv_yarnPosition_12_2= 'wyib' ) ) )?
            {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1256:2: ()
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1257:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSlipAccess().getSlipAction_0(),
                          current);
                  
            }

            }

            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1262:2: ( ( (lv_reverse_1_1= 'Rev' | lv_reverse_1_2= 'Reverse' | lv_reverse_1_3= 'rev' | lv_reverse_1_4= 'reverse' ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=53 && LA49_0<=56)) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1263:1: ( (lv_reverse_1_1= 'Rev' | lv_reverse_1_2= 'Reverse' | lv_reverse_1_3= 'rev' | lv_reverse_1_4= 'reverse' ) )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1263:1: ( (lv_reverse_1_1= 'Rev' | lv_reverse_1_2= 'Reverse' | lv_reverse_1_3= 'rev' | lv_reverse_1_4= 'reverse' ) )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1264:1: (lv_reverse_1_1= 'Rev' | lv_reverse_1_2= 'Reverse' | lv_reverse_1_3= 'rev' | lv_reverse_1_4= 'reverse' )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1264:1: (lv_reverse_1_1= 'Rev' | lv_reverse_1_2= 'Reverse' | lv_reverse_1_3= 'rev' | lv_reverse_1_4= 'reverse' )
                    int alt48=4;
                    switch ( input.LA(1) ) {
                    case 53:
                        {
                        alt48=1;
                        }
                        break;
                    case 54:
                        {
                        alt48=2;
                        }
                        break;
                    case 55:
                        {
                        alt48=3;
                        }
                        break;
                    case 56:
                        {
                        alt48=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 48, 0, input);

                        throw nvae;
                    }

                    switch (alt48) {
                        case 1 :
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1265:3: lv_reverse_1_1= 'Rev'
                            {
                            lv_reverse_1_1=(Token)match(input,53,FOLLOW_53_in_ruleSlip3092); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_reverse_1_1, grammarAccess.getSlipAccess().getReverseRevKeyword_1_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getSlipRule());
                              	        }
                                     		setWithLastConsumed(current, "reverse", true, null);
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1277:8: lv_reverse_1_2= 'Reverse'
                            {
                            lv_reverse_1_2=(Token)match(input,54,FOLLOW_54_in_ruleSlip3121); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_reverse_1_2, grammarAccess.getSlipAccess().getReverseReverseKeyword_1_0_1());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getSlipRule());
                              	        }
                                     		setWithLastConsumed(current, "reverse", true, null);
                              	    
                            }

                            }
                            break;
                        case 3 :
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1289:8: lv_reverse_1_3= 'rev'
                            {
                            lv_reverse_1_3=(Token)match(input,55,FOLLOW_55_in_ruleSlip3150); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_reverse_1_3, grammarAccess.getSlipAccess().getReverseRevKeyword_1_0_2());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getSlipRule());
                              	        }
                                     		setWithLastConsumed(current, "reverse", true, null);
                              	    
                            }

                            }
                            break;
                        case 4 :
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1301:8: lv_reverse_1_4= 'reverse'
                            {
                            lv_reverse_1_4=(Token)match(input,56,FOLLOW_56_in_ruleSlip3179); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_reverse_1_4, grammarAccess.getSlipAccess().getReverseReverseKeyword_1_0_3());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getSlipRule());
                              	        }
                                     		setWithLastConsumed(current, "reverse", true, null);
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1316:3: (otherlv_2= 'Sl' | otherlv_3= 'sl' | otherlv_4= 'Slip' | otherlv_5= 'slip' )
            int alt50=4;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt50=1;
                }
                break;
            case 58:
                {
                alt50=2;
                }
                break;
            case 59:
                {
                alt50=3;
                }
                break;
            case 60:
                {
                alt50=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1316:5: otherlv_2= 'Sl'
                    {
                    otherlv_2=(Token)match(input,57,FOLLOW_57_in_ruleSlip3209); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getSlipAccess().getSlKeyword_2_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1321:7: otherlv_3= 'sl'
                    {
                    otherlv_3=(Token)match(input,58,FOLLOW_58_in_ruleSlip3227); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getSlipAccess().getSlKeyword_2_1());
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1326:7: otherlv_4= 'Slip'
                    {
                    otherlv_4=(Token)match(input,59,FOLLOW_59_in_ruleSlip3245); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getSlipAccess().getSlipKeyword_2_2());
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1331:7: otherlv_5= 'slip'
                    {
                    otherlv_5=(Token)match(input,60,FOLLOW_60_in_ruleSlip3263); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getSlipAccess().getSlipKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1335:2: ( ( ( (lv_number_6_0= RULE_INT ) ) (otherlv_7= 'st' | otherlv_8= 'sts' )? ) | otherlv_9= 'next st' )?
            int alt52=3;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_INT) ) {
                alt52=1;
            }
            else if ( (LA52_0==61) ) {
                alt52=2;
            }
            switch (alt52) {
                case 1 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1335:3: ( ( (lv_number_6_0= RULE_INT ) ) (otherlv_7= 'st' | otherlv_8= 'sts' )? )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1335:3: ( ( (lv_number_6_0= RULE_INT ) ) (otherlv_7= 'st' | otherlv_8= 'sts' )? )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1335:4: ( (lv_number_6_0= RULE_INT ) ) (otherlv_7= 'st' | otherlv_8= 'sts' )?
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1335:4: ( (lv_number_6_0= RULE_INT ) )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1336:1: (lv_number_6_0= RULE_INT )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1336:1: (lv_number_6_0= RULE_INT )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1337:3: lv_number_6_0= RULE_INT
                    {
                    lv_number_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSlip3283); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_number_6_0, grammarAccess.getSlipAccess().getNumberINTTerminalRuleCall_3_0_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSlipRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"number",
                              		lv_number_6_0, 
                              		"INT");
                      	    
                    }

                    }


                    }

                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1353:2: (otherlv_7= 'st' | otherlv_8= 'sts' )?
                    int alt51=3;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==43) ) {
                        alt51=1;
                    }
                    else if ( (LA51_0==44) ) {
                        alt51=2;
                    }
                    switch (alt51) {
                        case 1 :
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1353:4: otherlv_7= 'st'
                            {
                            otherlv_7=(Token)match(input,43,FOLLOW_43_in_ruleSlip3301); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_7, grammarAccess.getSlipAccess().getStKeyword_3_0_1_0());
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1358:7: otherlv_8= 'sts'
                            {
                            otherlv_8=(Token)match(input,44,FOLLOW_44_in_ruleSlip3319); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_8, grammarAccess.getSlipAccess().getStsKeyword_3_0_1_1());
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1363:7: otherlv_9= 'next st'
                    {
                    otherlv_9=(Token)match(input,61,FOLLOW_61_in_ruleSlip3340); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getSlipAccess().getNextStKeyword_3_1());
                          
                    }

                    }
                    break;

            }

            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1367:3: ( ( ( (lv_knitwise_10_1= 'kw' | lv_knitwise_10_2= 'knitwise' ) ) ) | ( ( (lv_purlwise_11_1= 'pw' | lv_purlwise_11_2= 'purlwise' ) ) ) )?
            int alt55=3;
            int LA55_0 = input.LA(1);

            if ( ((LA55_0>=62 && LA55_0<=63)) ) {
                alt55=1;
            }
            else if ( ((LA55_0>=64 && LA55_0<=65)) ) {
                alt55=2;
            }
            switch (alt55) {
                case 1 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1367:4: ( ( (lv_knitwise_10_1= 'kw' | lv_knitwise_10_2= 'knitwise' ) ) )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1367:4: ( ( (lv_knitwise_10_1= 'kw' | lv_knitwise_10_2= 'knitwise' ) ) )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1368:1: ( (lv_knitwise_10_1= 'kw' | lv_knitwise_10_2= 'knitwise' ) )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1368:1: ( (lv_knitwise_10_1= 'kw' | lv_knitwise_10_2= 'knitwise' ) )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1369:1: (lv_knitwise_10_1= 'kw' | lv_knitwise_10_2= 'knitwise' )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1369:1: (lv_knitwise_10_1= 'kw' | lv_knitwise_10_2= 'knitwise' )
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==62) ) {
                        alt53=1;
                    }
                    else if ( (LA53_0==63) ) {
                        alt53=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 53, 0, input);

                        throw nvae;
                    }
                    switch (alt53) {
                        case 1 :
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1370:3: lv_knitwise_10_1= 'kw'
                            {
                            lv_knitwise_10_1=(Token)match(input,62,FOLLOW_62_in_ruleSlip3363); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_knitwise_10_1, grammarAccess.getSlipAccess().getKnitwiseKwKeyword_4_0_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getSlipRule());
                              	        }
                                     		setWithLastConsumed(current, "knitwise", true, null);
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1382:8: lv_knitwise_10_2= 'knitwise'
                            {
                            lv_knitwise_10_2=(Token)match(input,63,FOLLOW_63_in_ruleSlip3392); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_knitwise_10_2, grammarAccess.getSlipAccess().getKnitwiseKnitwiseKeyword_4_0_0_1());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getSlipRule());
                              	        }
                                     		setWithLastConsumed(current, "knitwise", true, null);
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1398:6: ( ( (lv_purlwise_11_1= 'pw' | lv_purlwise_11_2= 'purlwise' ) ) )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1398:6: ( ( (lv_purlwise_11_1= 'pw' | lv_purlwise_11_2= 'purlwise' ) ) )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1399:1: ( (lv_purlwise_11_1= 'pw' | lv_purlwise_11_2= 'purlwise' ) )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1399:1: ( (lv_purlwise_11_1= 'pw' | lv_purlwise_11_2= 'purlwise' ) )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1400:1: (lv_purlwise_11_1= 'pw' | lv_purlwise_11_2= 'purlwise' )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1400:1: (lv_purlwise_11_1= 'pw' | lv_purlwise_11_2= 'purlwise' )
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==64) ) {
                        alt54=1;
                    }
                    else if ( (LA54_0==65) ) {
                        alt54=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 54, 0, input);

                        throw nvae;
                    }
                    switch (alt54) {
                        case 1 :
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1401:3: lv_purlwise_11_1= 'pw'
                            {
                            lv_purlwise_11_1=(Token)match(input,64,FOLLOW_64_in_ruleSlip3434); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_purlwise_11_1, grammarAccess.getSlipAccess().getPurlwisePwKeyword_4_1_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getSlipRule());
                              	        }
                                     		setWithLastConsumed(current, "purlwise", true, null);
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1413:8: lv_purlwise_11_2= 'purlwise'
                            {
                            lv_purlwise_11_2=(Token)match(input,65,FOLLOW_65_in_ruleSlip3463); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_purlwise_11_2, grammarAccess.getSlipAccess().getPurlwisePurlwiseKeyword_4_1_0_1());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getSlipRule());
                              	        }
                                     		setWithLastConsumed(current, "purlwise", true, null);
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;

            }

            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1428:4: ( ( (lv_yarnPosition_12_1= 'wyif' | lv_yarnPosition_12_2= 'wyib' ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( ((LA57_0>=66 && LA57_0<=67)) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1429:1: ( (lv_yarnPosition_12_1= 'wyif' | lv_yarnPosition_12_2= 'wyib' ) )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1429:1: ( (lv_yarnPosition_12_1= 'wyif' | lv_yarnPosition_12_2= 'wyib' ) )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1430:1: (lv_yarnPosition_12_1= 'wyif' | lv_yarnPosition_12_2= 'wyib' )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1430:1: (lv_yarnPosition_12_1= 'wyif' | lv_yarnPosition_12_2= 'wyib' )
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==66) ) {
                        alt56=1;
                    }
                    else if ( (LA56_0==67) ) {
                        alt56=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 56, 0, input);

                        throw nvae;
                    }
                    switch (alt56) {
                        case 1 :
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1431:3: lv_yarnPosition_12_1= 'wyif'
                            {
                            lv_yarnPosition_12_1=(Token)match(input,66,FOLLOW_66_in_ruleSlip3501); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_yarnPosition_12_1, grammarAccess.getSlipAccess().getYarnPositionWyifKeyword_5_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getSlipRule());
                              	        }
                                     		setWithLastConsumed(current, "yarnPosition", lv_yarnPosition_12_1, null);
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1443:8: lv_yarnPosition_12_2= 'wyib'
                            {
                            lv_yarnPosition_12_2=(Token)match(input,67,FOLLOW_67_in_ruleSlip3530); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_yarnPosition_12_2, grammarAccess.getSlipAccess().getYarnPositionWyibKeyword_5_0_1());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getSlipRule());
                              	        }
                                     		setWithLastConsumed(current, "yarnPosition", lv_yarnPosition_12_2, null);
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSlip"


    // $ANTLR start "entryRuleRepeatSpec"
    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1466:1: entryRuleRepeatSpec returns [EObject current=null] : iv_ruleRepeatSpec= ruleRepeatSpec EOF ;
    public final EObject entryRuleRepeatSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepeatSpec = null;


        try {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1467:2: (iv_ruleRepeatSpec= ruleRepeatSpec EOF )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1468:2: iv_ruleRepeatSpec= ruleRepeatSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRepeatSpecRule()); 
            }
            pushFollow(FOLLOW_ruleRepeatSpec_in_entryRuleRepeatSpec3583);
            iv_ruleRepeatSpec=ruleRepeatSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRepeatSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRepeatSpec3593); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRepeatSpec"


    // $ANTLR start "ruleRepeatSpec"
    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1475:1: ruleRepeatSpec returns [EObject current=null] : ( ( (lv_toEnd_0_0= 'end' ) ) | ( (lv_toMarker_1_0= 'marker' ) ) | ( ( (lv_value_2_0= RULE_INT ) ) (otherlv_3= 'st' | otherlv_4= 'sts' )? ( (lv_beforeEnd_5_0= 'before end' ) ) ) | ( ( (lv_value_6_0= RULE_INT ) ) (otherlv_7= 'st' | otherlv_8= 'sts' )? ( (lv_beforeGap_9_0= 'before gap' ) ) ) | ( ( (lv_value_10_0= RULE_INT ) ) (otherlv_11= 'st' | otherlv_12= 'sts' )? ( (lv_beforeMarker_13_0= 'before marker' ) ) ) | ( ( (lv_value_14_0= RULE_INT ) ) ( (lv_times_15_0= 'times' ) ) ) ) ;
    public final EObject ruleRepeatSpec() throws RecognitionException {
        EObject current = null;

        Token lv_toEnd_0_0=null;
        Token lv_toMarker_1_0=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_beforeEnd_5_0=null;
        Token lv_value_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_beforeGap_9_0=null;
        Token lv_value_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_beforeMarker_13_0=null;
        Token lv_value_14_0=null;
        Token lv_times_15_0=null;

         enterRule(); 
            
        try {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1478:28: ( ( ( (lv_toEnd_0_0= 'end' ) ) | ( (lv_toMarker_1_0= 'marker' ) ) | ( ( (lv_value_2_0= RULE_INT ) ) (otherlv_3= 'st' | otherlv_4= 'sts' )? ( (lv_beforeEnd_5_0= 'before end' ) ) ) | ( ( (lv_value_6_0= RULE_INT ) ) (otherlv_7= 'st' | otherlv_8= 'sts' )? ( (lv_beforeGap_9_0= 'before gap' ) ) ) | ( ( (lv_value_10_0= RULE_INT ) ) (otherlv_11= 'st' | otherlv_12= 'sts' )? ( (lv_beforeMarker_13_0= 'before marker' ) ) ) | ( ( (lv_value_14_0= RULE_INT ) ) ( (lv_times_15_0= 'times' ) ) ) ) )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1479:1: ( ( (lv_toEnd_0_0= 'end' ) ) | ( (lv_toMarker_1_0= 'marker' ) ) | ( ( (lv_value_2_0= RULE_INT ) ) (otherlv_3= 'st' | otherlv_4= 'sts' )? ( (lv_beforeEnd_5_0= 'before end' ) ) ) | ( ( (lv_value_6_0= RULE_INT ) ) (otherlv_7= 'st' | otherlv_8= 'sts' )? ( (lv_beforeGap_9_0= 'before gap' ) ) ) | ( ( (lv_value_10_0= RULE_INT ) ) (otherlv_11= 'st' | otherlv_12= 'sts' )? ( (lv_beforeMarker_13_0= 'before marker' ) ) ) | ( ( (lv_value_14_0= RULE_INT ) ) ( (lv_times_15_0= 'times' ) ) ) )
            {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1479:1: ( ( (lv_toEnd_0_0= 'end' ) ) | ( (lv_toMarker_1_0= 'marker' ) ) | ( ( (lv_value_2_0= RULE_INT ) ) (otherlv_3= 'st' | otherlv_4= 'sts' )? ( (lv_beforeEnd_5_0= 'before end' ) ) ) | ( ( (lv_value_6_0= RULE_INT ) ) (otherlv_7= 'st' | otherlv_8= 'sts' )? ( (lv_beforeGap_9_0= 'before gap' ) ) ) | ( ( (lv_value_10_0= RULE_INT ) ) (otherlv_11= 'st' | otherlv_12= 'sts' )? ( (lv_beforeMarker_13_0= 'before marker' ) ) ) | ( ( (lv_value_14_0= RULE_INT ) ) ( (lv_times_15_0= 'times' ) ) ) )
            int alt61=6;
            alt61 = dfa61.predict(input);
            switch (alt61) {
                case 1 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1479:2: ( (lv_toEnd_0_0= 'end' ) )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1479:2: ( (lv_toEnd_0_0= 'end' ) )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1480:1: (lv_toEnd_0_0= 'end' )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1480:1: (lv_toEnd_0_0= 'end' )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1481:3: lv_toEnd_0_0= 'end'
                    {
                    lv_toEnd_0_0=(Token)match(input,68,FOLLOW_68_in_ruleRepeatSpec3636); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_toEnd_0_0, grammarAccess.getRepeatSpecAccess().getToEndEndKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getRepeatSpecRule());
                      	        }
                             		setWithLastConsumed(current, "toEnd", true, "end");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1495:6: ( (lv_toMarker_1_0= 'marker' ) )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1495:6: ( (lv_toMarker_1_0= 'marker' ) )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1496:1: (lv_toMarker_1_0= 'marker' )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1496:1: (lv_toMarker_1_0= 'marker' )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1497:3: lv_toMarker_1_0= 'marker'
                    {
                    lv_toMarker_1_0=(Token)match(input,69,FOLLOW_69_in_ruleRepeatSpec3673); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_toMarker_1_0, grammarAccess.getRepeatSpecAccess().getToMarkerMarkerKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getRepeatSpecRule());
                      	        }
                             		setWithLastConsumed(current, "toMarker", true, "marker");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1511:6: ( ( (lv_value_2_0= RULE_INT ) ) (otherlv_3= 'st' | otherlv_4= 'sts' )? ( (lv_beforeEnd_5_0= 'before end' ) ) )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1511:6: ( ( (lv_value_2_0= RULE_INT ) ) (otherlv_3= 'st' | otherlv_4= 'sts' )? ( (lv_beforeEnd_5_0= 'before end' ) ) )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1511:7: ( (lv_value_2_0= RULE_INT ) ) (otherlv_3= 'st' | otherlv_4= 'sts' )? ( (lv_beforeEnd_5_0= 'before end' ) )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1511:7: ( (lv_value_2_0= RULE_INT ) )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1512:1: (lv_value_2_0= RULE_INT )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1512:1: (lv_value_2_0= RULE_INT )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1513:3: lv_value_2_0= RULE_INT
                    {
                    lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRepeatSpec3710); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_2_0, grammarAccess.getRepeatSpecAccess().getValueINTTerminalRuleCall_2_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getRepeatSpecRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_2_0, 
                              		"INT");
                      	    
                    }

                    }


                    }

                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1529:2: (otherlv_3= 'st' | otherlv_4= 'sts' )?
                    int alt58=3;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==43) ) {
                        alt58=1;
                    }
                    else if ( (LA58_0==44) ) {
                        alt58=2;
                    }
                    switch (alt58) {
                        case 1 :
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1529:4: otherlv_3= 'st'
                            {
                            otherlv_3=(Token)match(input,43,FOLLOW_43_in_ruleRepeatSpec3728); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getRepeatSpecAccess().getStKeyword_2_1_0());
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1534:7: otherlv_4= 'sts'
                            {
                            otherlv_4=(Token)match(input,44,FOLLOW_44_in_ruleRepeatSpec3746); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getRepeatSpecAccess().getStsKeyword_2_1_1());
                                  
                            }

                            }
                            break;

                    }

                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1538:3: ( (lv_beforeEnd_5_0= 'before end' ) )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1539:1: (lv_beforeEnd_5_0= 'before end' )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1539:1: (lv_beforeEnd_5_0= 'before end' )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1540:3: lv_beforeEnd_5_0= 'before end'
                    {
                    lv_beforeEnd_5_0=(Token)match(input,70,FOLLOW_70_in_ruleRepeatSpec3766); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_beforeEnd_5_0, grammarAccess.getRepeatSpecAccess().getBeforeEndBeforeEndKeyword_2_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getRepeatSpecRule());
                      	        }
                             		setWithLastConsumed(current, "beforeEnd", true, "before end");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1554:6: ( ( (lv_value_6_0= RULE_INT ) ) (otherlv_7= 'st' | otherlv_8= 'sts' )? ( (lv_beforeGap_9_0= 'before gap' ) ) )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1554:6: ( ( (lv_value_6_0= RULE_INT ) ) (otherlv_7= 'st' | otherlv_8= 'sts' )? ( (lv_beforeGap_9_0= 'before gap' ) ) )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1554:7: ( (lv_value_6_0= RULE_INT ) ) (otherlv_7= 'st' | otherlv_8= 'sts' )? ( (lv_beforeGap_9_0= 'before gap' ) )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1554:7: ( (lv_value_6_0= RULE_INT ) )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1555:1: (lv_value_6_0= RULE_INT )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1555:1: (lv_value_6_0= RULE_INT )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1556:3: lv_value_6_0= RULE_INT
                    {
                    lv_value_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRepeatSpec3804); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_6_0, grammarAccess.getRepeatSpecAccess().getValueINTTerminalRuleCall_3_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getRepeatSpecRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_6_0, 
                              		"INT");
                      	    
                    }

                    }


                    }

                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1572:2: (otherlv_7= 'st' | otherlv_8= 'sts' )?
                    int alt59=3;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==43) ) {
                        alt59=1;
                    }
                    else if ( (LA59_0==44) ) {
                        alt59=2;
                    }
                    switch (alt59) {
                        case 1 :
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1572:4: otherlv_7= 'st'
                            {
                            otherlv_7=(Token)match(input,43,FOLLOW_43_in_ruleRepeatSpec3822); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_7, grammarAccess.getRepeatSpecAccess().getStKeyword_3_1_0());
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1577:7: otherlv_8= 'sts'
                            {
                            otherlv_8=(Token)match(input,44,FOLLOW_44_in_ruleRepeatSpec3840); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_8, grammarAccess.getRepeatSpecAccess().getStsKeyword_3_1_1());
                                  
                            }

                            }
                            break;

                    }

                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1581:3: ( (lv_beforeGap_9_0= 'before gap' ) )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1582:1: (lv_beforeGap_9_0= 'before gap' )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1582:1: (lv_beforeGap_9_0= 'before gap' )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1583:3: lv_beforeGap_9_0= 'before gap'
                    {
                    lv_beforeGap_9_0=(Token)match(input,71,FOLLOW_71_in_ruleRepeatSpec3860); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_beforeGap_9_0, grammarAccess.getRepeatSpecAccess().getBeforeGapBeforeGapKeyword_3_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getRepeatSpecRule());
                      	        }
                             		setWithLastConsumed(current, "beforeGap", true, "before gap");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1597:6: ( ( (lv_value_10_0= RULE_INT ) ) (otherlv_11= 'st' | otherlv_12= 'sts' )? ( (lv_beforeMarker_13_0= 'before marker' ) ) )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1597:6: ( ( (lv_value_10_0= RULE_INT ) ) (otherlv_11= 'st' | otherlv_12= 'sts' )? ( (lv_beforeMarker_13_0= 'before marker' ) ) )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1597:7: ( (lv_value_10_0= RULE_INT ) ) (otherlv_11= 'st' | otherlv_12= 'sts' )? ( (lv_beforeMarker_13_0= 'before marker' ) )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1597:7: ( (lv_value_10_0= RULE_INT ) )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1598:1: (lv_value_10_0= RULE_INT )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1598:1: (lv_value_10_0= RULE_INT )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1599:3: lv_value_10_0= RULE_INT
                    {
                    lv_value_10_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRepeatSpec3898); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_10_0, grammarAccess.getRepeatSpecAccess().getValueINTTerminalRuleCall_4_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getRepeatSpecRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_10_0, 
                              		"INT");
                      	    
                    }

                    }


                    }

                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1615:2: (otherlv_11= 'st' | otherlv_12= 'sts' )?
                    int alt60=3;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==43) ) {
                        alt60=1;
                    }
                    else if ( (LA60_0==44) ) {
                        alt60=2;
                    }
                    switch (alt60) {
                        case 1 :
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1615:4: otherlv_11= 'st'
                            {
                            otherlv_11=(Token)match(input,43,FOLLOW_43_in_ruleRepeatSpec3916); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_11, grammarAccess.getRepeatSpecAccess().getStKeyword_4_1_0());
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1620:7: otherlv_12= 'sts'
                            {
                            otherlv_12=(Token)match(input,44,FOLLOW_44_in_ruleRepeatSpec3934); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_12, grammarAccess.getRepeatSpecAccess().getStsKeyword_4_1_1());
                                  
                            }

                            }
                            break;

                    }

                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1624:3: ( (lv_beforeMarker_13_0= 'before marker' ) )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1625:1: (lv_beforeMarker_13_0= 'before marker' )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1625:1: (lv_beforeMarker_13_0= 'before marker' )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1626:3: lv_beforeMarker_13_0= 'before marker'
                    {
                    lv_beforeMarker_13_0=(Token)match(input,72,FOLLOW_72_in_ruleRepeatSpec3954); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_beforeMarker_13_0, grammarAccess.getRepeatSpecAccess().getBeforeMarkerBeforeMarkerKeyword_4_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getRepeatSpecRule());
                      	        }
                             		setWithLastConsumed(current, "beforeMarker", true, "before marker");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1640:6: ( ( (lv_value_14_0= RULE_INT ) ) ( (lv_times_15_0= 'times' ) ) )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1640:6: ( ( (lv_value_14_0= RULE_INT ) ) ( (lv_times_15_0= 'times' ) ) )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1640:7: ( (lv_value_14_0= RULE_INT ) ) ( (lv_times_15_0= 'times' ) )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1640:7: ( (lv_value_14_0= RULE_INT ) )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1641:1: (lv_value_14_0= RULE_INT )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1641:1: (lv_value_14_0= RULE_INT )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1642:3: lv_value_14_0= RULE_INT
                    {
                    lv_value_14_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRepeatSpec3992); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_14_0, grammarAccess.getRepeatSpecAccess().getValueINTTerminalRuleCall_5_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getRepeatSpecRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_14_0, 
                              		"INT");
                      	    
                    }

                    }


                    }

                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1658:2: ( (lv_times_15_0= 'times' ) )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1659:1: (lv_times_15_0= 'times' )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1659:1: (lv_times_15_0= 'times' )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1660:3: lv_times_15_0= 'times'
                    {
                    lv_times_15_0=(Token)match(input,73,FOLLOW_73_in_ruleRepeatSpec4015); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_times_15_0, grammarAccess.getRepeatSpecAccess().getTimesTimesKeyword_5_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getRepeatSpecRule());
                      	        }
                             		setWithLastConsumed(current, "times", true, "times");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleRepeatSpec"


    // $ANTLR start "entryRuleRepeat"
    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1681:1: entryRuleRepeat returns [EObject current=null] : iv_ruleRepeat= ruleRepeat EOF ;
    public final EObject entryRuleRepeat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepeat = null;


        try {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1682:2: (iv_ruleRepeat= ruleRepeat EOF )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1683:2: iv_ruleRepeat= ruleRepeat EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRepeatRule()); 
            }
            pushFollow(FOLLOW_ruleRepeat_in_entryRuleRepeat4065);
            iv_ruleRepeat=ruleRepeat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRepeat; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRepeat4075); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRepeat"


    // $ANTLR start "ruleRepeat"
    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1690:1: ruleRepeat returns [EObject current=null] : ( ( (otherlv_0= 'Repeat' | otherlv_1= 'repeat' ) otherlv_2= '[' ( (lv_operations_3_0= ruleInlineOperation ) ) (otherlv_4= ',' ( (lv_operations_5_0= ruleInlineOperation ) ) )* otherlv_6= ']' (otherlv_7= 'to' )? ( (lv_spec_8_0= ruleRepeatSpec ) ) ) | (otherlv_9= '[' ( (lv_operations_10_0= ruleInlineOperation ) ) (otherlv_11= ',' ( (lv_operations_12_0= ruleInlineOperation ) ) )* otherlv_13= ']' (otherlv_14= ',' (otherlv_15= 'Repeat' | otherlv_16= 'repeat' ) )? (otherlv_17= 'to' )? ( (lv_spec_18_0= ruleRepeatSpec ) ) ) ) ;
    public final EObject ruleRepeat() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        EObject lv_operations_3_0 = null;

        EObject lv_operations_5_0 = null;

        EObject lv_spec_8_0 = null;

        EObject lv_operations_10_0 = null;

        EObject lv_operations_12_0 = null;

        EObject lv_spec_18_0 = null;


         enterRule(); 
            
        try {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1693:28: ( ( ( (otherlv_0= 'Repeat' | otherlv_1= 'repeat' ) otherlv_2= '[' ( (lv_operations_3_0= ruleInlineOperation ) ) (otherlv_4= ',' ( (lv_operations_5_0= ruleInlineOperation ) ) )* otherlv_6= ']' (otherlv_7= 'to' )? ( (lv_spec_8_0= ruleRepeatSpec ) ) ) | (otherlv_9= '[' ( (lv_operations_10_0= ruleInlineOperation ) ) (otherlv_11= ',' ( (lv_operations_12_0= ruleInlineOperation ) ) )* otherlv_13= ']' (otherlv_14= ',' (otherlv_15= 'Repeat' | otherlv_16= 'repeat' ) )? (otherlv_17= 'to' )? ( (lv_spec_18_0= ruleRepeatSpec ) ) ) ) )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1694:1: ( ( (otherlv_0= 'Repeat' | otherlv_1= 'repeat' ) otherlv_2= '[' ( (lv_operations_3_0= ruleInlineOperation ) ) (otherlv_4= ',' ( (lv_operations_5_0= ruleInlineOperation ) ) )* otherlv_6= ']' (otherlv_7= 'to' )? ( (lv_spec_8_0= ruleRepeatSpec ) ) ) | (otherlv_9= '[' ( (lv_operations_10_0= ruleInlineOperation ) ) (otherlv_11= ',' ( (lv_operations_12_0= ruleInlineOperation ) ) )* otherlv_13= ']' (otherlv_14= ',' (otherlv_15= 'Repeat' | otherlv_16= 'repeat' ) )? (otherlv_17= 'to' )? ( (lv_spec_18_0= ruleRepeatSpec ) ) ) )
            {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1694:1: ( ( (otherlv_0= 'Repeat' | otherlv_1= 'repeat' ) otherlv_2= '[' ( (lv_operations_3_0= ruleInlineOperation ) ) (otherlv_4= ',' ( (lv_operations_5_0= ruleInlineOperation ) ) )* otherlv_6= ']' (otherlv_7= 'to' )? ( (lv_spec_8_0= ruleRepeatSpec ) ) ) | (otherlv_9= '[' ( (lv_operations_10_0= ruleInlineOperation ) ) (otherlv_11= ',' ( (lv_operations_12_0= ruleInlineOperation ) ) )* otherlv_13= ']' (otherlv_14= ',' (otherlv_15= 'Repeat' | otherlv_16= 'repeat' ) )? (otherlv_17= 'to' )? ( (lv_spec_18_0= ruleRepeatSpec ) ) ) )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( ((LA69_0>=74 && LA69_0<=75)) ) {
                alt69=1;
            }
            else if ( (LA69_0==76) ) {
                alt69=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1694:2: ( (otherlv_0= 'Repeat' | otherlv_1= 'repeat' ) otherlv_2= '[' ( (lv_operations_3_0= ruleInlineOperation ) ) (otherlv_4= ',' ( (lv_operations_5_0= ruleInlineOperation ) ) )* otherlv_6= ']' (otherlv_7= 'to' )? ( (lv_spec_8_0= ruleRepeatSpec ) ) )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1694:2: ( (otherlv_0= 'Repeat' | otherlv_1= 'repeat' ) otherlv_2= '[' ( (lv_operations_3_0= ruleInlineOperation ) ) (otherlv_4= ',' ( (lv_operations_5_0= ruleInlineOperation ) ) )* otherlv_6= ']' (otherlv_7= 'to' )? ( (lv_spec_8_0= ruleRepeatSpec ) ) )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1694:3: (otherlv_0= 'Repeat' | otherlv_1= 'repeat' ) otherlv_2= '[' ( (lv_operations_3_0= ruleInlineOperation ) ) (otherlv_4= ',' ( (lv_operations_5_0= ruleInlineOperation ) ) )* otherlv_6= ']' (otherlv_7= 'to' )? ( (lv_spec_8_0= ruleRepeatSpec ) )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1694:3: (otherlv_0= 'Repeat' | otherlv_1= 'repeat' )
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==74) ) {
                        alt62=1;
                    }
                    else if ( (LA62_0==75) ) {
                        alt62=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 62, 0, input);

                        throw nvae;
                    }
                    switch (alt62) {
                        case 1 :
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1694:5: otherlv_0= 'Repeat'
                            {
                            otherlv_0=(Token)match(input,74,FOLLOW_74_in_ruleRepeat4114); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_0, grammarAccess.getRepeatAccess().getRepeatKeyword_0_0_0());
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1699:7: otherlv_1= 'repeat'
                            {
                            otherlv_1=(Token)match(input,75,FOLLOW_75_in_ruleRepeat4132); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_1, grammarAccess.getRepeatAccess().getRepeatKeyword_0_0_1());
                                  
                            }

                            }
                            break;

                    }

                    otherlv_2=(Token)match(input,76,FOLLOW_76_in_ruleRepeat4145); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getRepeatAccess().getLeftSquareBracketKeyword_0_1());
                          
                    }
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1707:1: ( (lv_operations_3_0= ruleInlineOperation ) )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1708:1: (lv_operations_3_0= ruleInlineOperation )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1708:1: (lv_operations_3_0= ruleInlineOperation )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1709:3: lv_operations_3_0= ruleInlineOperation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRepeatAccess().getOperationsInlineOperationParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInlineOperation_in_ruleRepeat4166);
                    lv_operations_3_0=ruleInlineOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRepeatRule());
                      	        }
                             		add(
                             			current, 
                             			"operations",
                              		lv_operations_3_0, 
                              		"InlineOperation");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1725:2: (otherlv_4= ',' ( (lv_operations_5_0= ruleInlineOperation ) ) )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==23) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1725:4: otherlv_4= ',' ( (lv_operations_5_0= ruleInlineOperation ) )
                    	    {
                    	    otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleRepeat4179); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getRepeatAccess().getCommaKeyword_0_3_0());
                    	          
                    	    }
                    	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1729:1: ( (lv_operations_5_0= ruleInlineOperation ) )
                    	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1730:1: (lv_operations_5_0= ruleInlineOperation )
                    	    {
                    	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1730:1: (lv_operations_5_0= ruleInlineOperation )
                    	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1731:3: lv_operations_5_0= ruleInlineOperation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getRepeatAccess().getOperationsInlineOperationParserRuleCall_0_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleInlineOperation_in_ruleRepeat4200);
                    	    lv_operations_5_0=ruleInlineOperation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getRepeatRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"operations",
                    	              		lv_operations_5_0, 
                    	              		"InlineOperation");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop63;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,77,FOLLOW_77_in_ruleRepeat4214); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getRepeatAccess().getRightSquareBracketKeyword_0_4());
                          
                    }
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1751:1: (otherlv_7= 'to' )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==48) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1751:3: otherlv_7= 'to'
                            {
                            otherlv_7=(Token)match(input,48,FOLLOW_48_in_ruleRepeat4227); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_7, grammarAccess.getRepeatAccess().getToKeyword_0_5());
                                  
                            }

                            }
                            break;

                    }

                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1755:3: ( (lv_spec_8_0= ruleRepeatSpec ) )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1756:1: (lv_spec_8_0= ruleRepeatSpec )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1756:1: (lv_spec_8_0= ruleRepeatSpec )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1757:3: lv_spec_8_0= ruleRepeatSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRepeatAccess().getSpecRepeatSpecParserRuleCall_0_6_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRepeatSpec_in_ruleRepeat4250);
                    lv_spec_8_0=ruleRepeatSpec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRepeatRule());
                      	        }
                             		set(
                             			current, 
                             			"spec",
                              		lv_spec_8_0, 
                              		"RepeatSpec");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1774:6: (otherlv_9= '[' ( (lv_operations_10_0= ruleInlineOperation ) ) (otherlv_11= ',' ( (lv_operations_12_0= ruleInlineOperation ) ) )* otherlv_13= ']' (otherlv_14= ',' (otherlv_15= 'Repeat' | otherlv_16= 'repeat' ) )? (otherlv_17= 'to' )? ( (lv_spec_18_0= ruleRepeatSpec ) ) )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1774:6: (otherlv_9= '[' ( (lv_operations_10_0= ruleInlineOperation ) ) (otherlv_11= ',' ( (lv_operations_12_0= ruleInlineOperation ) ) )* otherlv_13= ']' (otherlv_14= ',' (otherlv_15= 'Repeat' | otherlv_16= 'repeat' ) )? (otherlv_17= 'to' )? ( (lv_spec_18_0= ruleRepeatSpec ) ) )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1774:8: otherlv_9= '[' ( (lv_operations_10_0= ruleInlineOperation ) ) (otherlv_11= ',' ( (lv_operations_12_0= ruleInlineOperation ) ) )* otherlv_13= ']' (otherlv_14= ',' (otherlv_15= 'Repeat' | otherlv_16= 'repeat' ) )? (otherlv_17= 'to' )? ( (lv_spec_18_0= ruleRepeatSpec ) )
                    {
                    otherlv_9=(Token)match(input,76,FOLLOW_76_in_ruleRepeat4270); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getRepeatAccess().getLeftSquareBracketKeyword_1_0());
                          
                    }
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1778:1: ( (lv_operations_10_0= ruleInlineOperation ) )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1779:1: (lv_operations_10_0= ruleInlineOperation )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1779:1: (lv_operations_10_0= ruleInlineOperation )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1780:3: lv_operations_10_0= ruleInlineOperation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRepeatAccess().getOperationsInlineOperationParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInlineOperation_in_ruleRepeat4291);
                    lv_operations_10_0=ruleInlineOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRepeatRule());
                      	        }
                             		add(
                             			current, 
                             			"operations",
                              		lv_operations_10_0, 
                              		"InlineOperation");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1796:2: (otherlv_11= ',' ( (lv_operations_12_0= ruleInlineOperation ) ) )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==23) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1796:4: otherlv_11= ',' ( (lv_operations_12_0= ruleInlineOperation ) )
                    	    {
                    	    otherlv_11=(Token)match(input,23,FOLLOW_23_in_ruleRepeat4304); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_11, grammarAccess.getRepeatAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1800:1: ( (lv_operations_12_0= ruleInlineOperation ) )
                    	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1801:1: (lv_operations_12_0= ruleInlineOperation )
                    	    {
                    	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1801:1: (lv_operations_12_0= ruleInlineOperation )
                    	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1802:3: lv_operations_12_0= ruleInlineOperation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getRepeatAccess().getOperationsInlineOperationParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleInlineOperation_in_ruleRepeat4325);
                    	    lv_operations_12_0=ruleInlineOperation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getRepeatRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"operations",
                    	              		lv_operations_12_0, 
                    	              		"InlineOperation");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop65;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,77,FOLLOW_77_in_ruleRepeat4339); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getRepeatAccess().getRightSquareBracketKeyword_1_3());
                          
                    }
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1822:1: (otherlv_14= ',' (otherlv_15= 'Repeat' | otherlv_16= 'repeat' ) )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==23) ) {
                        alt67=1;
                    }
                    switch (alt67) {
                        case 1 :
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1822:3: otherlv_14= ',' (otherlv_15= 'Repeat' | otherlv_16= 'repeat' )
                            {
                            otherlv_14=(Token)match(input,23,FOLLOW_23_in_ruleRepeat4352); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_14, grammarAccess.getRepeatAccess().getCommaKeyword_1_4_0());
                                  
                            }
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1826:1: (otherlv_15= 'Repeat' | otherlv_16= 'repeat' )
                            int alt66=2;
                            int LA66_0 = input.LA(1);

                            if ( (LA66_0==74) ) {
                                alt66=1;
                            }
                            else if ( (LA66_0==75) ) {
                                alt66=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 66, 0, input);

                                throw nvae;
                            }
                            switch (alt66) {
                                case 1 :
                                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1826:3: otherlv_15= 'Repeat'
                                    {
                                    otherlv_15=(Token)match(input,74,FOLLOW_74_in_ruleRepeat4365); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_15, grammarAccess.getRepeatAccess().getRepeatKeyword_1_4_1_0());
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1831:7: otherlv_16= 'repeat'
                                    {
                                    otherlv_16=(Token)match(input,75,FOLLOW_75_in_ruleRepeat4383); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_16, grammarAccess.getRepeatAccess().getRepeatKeyword_1_4_1_1());
                                          
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1835:4: (otherlv_17= 'to' )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==48) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1835:6: otherlv_17= 'to'
                            {
                            otherlv_17=(Token)match(input,48,FOLLOW_48_in_ruleRepeat4399); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_17, grammarAccess.getRepeatAccess().getToKeyword_1_5());
                                  
                            }

                            }
                            break;

                    }

                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1839:3: ( (lv_spec_18_0= ruleRepeatSpec ) )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1840:1: (lv_spec_18_0= ruleRepeatSpec )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1840:1: (lv_spec_18_0= ruleRepeatSpec )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1841:3: lv_spec_18_0= ruleRepeatSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRepeatAccess().getSpecRepeatSpecParserRuleCall_1_6_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRepeatSpec_in_ruleRepeat4422);
                    lv_spec_18_0=ruleRepeatSpec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRepeatRule());
                      	        }
                             		set(
                             			current, 
                             			"spec",
                              		lv_spec_18_0, 
                              		"RepeatSpec");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleRepeat"


    // $ANTLR start "entryRuleRange"
    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1865:1: entryRuleRange returns [EObject current=null] : iv_ruleRange= ruleRange EOF ;
    public final EObject entryRuleRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRange = null;


        try {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1866:2: (iv_ruleRange= ruleRange EOF )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1867:2: iv_ruleRange= ruleRange EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRangeRule()); 
            }
            pushFollow(FOLLOW_ruleRange_in_entryRuleRange4459);
            iv_ruleRange=ruleRange();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRange; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRange4469); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRange"


    // $ANTLR start "ruleRange"
    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1874:1: ruleRange returns [EObject current=null] : ( ( (lv_min_0_0= RULE_INT ) ) otherlv_1= '-' ( (lv_max_2_0= RULE_INT ) ) ) ;
    public final EObject ruleRange() throws RecognitionException {
        EObject current = null;

        Token lv_min_0_0=null;
        Token otherlv_1=null;
        Token lv_max_2_0=null;

         enterRule(); 
            
        try {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1877:28: ( ( ( (lv_min_0_0= RULE_INT ) ) otherlv_1= '-' ( (lv_max_2_0= RULE_INT ) ) ) )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1878:1: ( ( (lv_min_0_0= RULE_INT ) ) otherlv_1= '-' ( (lv_max_2_0= RULE_INT ) ) )
            {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1878:1: ( ( (lv_min_0_0= RULE_INT ) ) otherlv_1= '-' ( (lv_max_2_0= RULE_INT ) ) )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1878:2: ( (lv_min_0_0= RULE_INT ) ) otherlv_1= '-' ( (lv_max_2_0= RULE_INT ) )
            {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1878:2: ( (lv_min_0_0= RULE_INT ) )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1879:1: (lv_min_0_0= RULE_INT )
            {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1879:1: (lv_min_0_0= RULE_INT )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1880:3: lv_min_0_0= RULE_INT
            {
            lv_min_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRange4511); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_min_0_0, grammarAccess.getRangeAccess().getMinINTTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getRangeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"min",
                      		lv_min_0_0, 
                      		"INT");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,78,FOLLOW_78_in_ruleRange4528); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getRangeAccess().getHyphenMinusKeyword_1());
                  
            }
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1900:1: ( (lv_max_2_0= RULE_INT ) )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1901:1: (lv_max_2_0= RULE_INT )
            {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1901:1: (lv_max_2_0= RULE_INT )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1902:3: lv_max_2_0= RULE_INT
            {
            lv_max_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRange4545); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_max_2_0, grammarAccess.getRangeAccess().getMaxINTTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getRangeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"max",
                      		lv_max_2_0, 
                      		"INT");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleRange"

    // $ANTLR start synpred1_InternalKnittingExpressionLanguage
    public final void synpred1_InternalKnittingExpressionLanguage_fragment() throws RecognitionException {   
        // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:724:5: ( RULE_LF )
        // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:724:7: RULE_LF
        {
        match(input,RULE_LF,FOLLOW_RULE_LF_in_synpred1_InternalKnittingExpressionLanguage1680); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalKnittingExpressionLanguage

    // Delegated rules

    public final boolean synpred1_InternalKnittingExpressionLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalKnittingExpressionLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA61 dfa61 = new DFA61(this);
    static final String DFA61_eotS =
        "\12\uffff";
    static final String DFA61_eofS =
        "\12\uffff";
    static final String DFA61_minS =
        "\1\6\2\uffff\1\53\1\uffff\2\106\3\uffff";
    static final String DFA61_maxS =
        "\1\105\2\uffff\1\111\1\uffff\2\110\3\uffff";
    static final String DFA61_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\6\2\uffff\1\5\1\3\1\4";
    static final String DFA61_specialS =
        "\12\uffff}>";
    static final String[] DFA61_transitionS = {
            "\1\3\75\uffff\1\1\1\2",
            "",
            "",
            "\1\5\1\6\31\uffff\1\10\1\11\1\7\1\4",
            "",
            "\1\10\1\11\1\7",
            "\1\10\1\11\1\7",
            "",
            "",
            ""
    };

    static final short[] DFA61_eot = DFA.unpackEncodedString(DFA61_eotS);
    static final short[] DFA61_eof = DFA.unpackEncodedString(DFA61_eofS);
    static final char[] DFA61_min = DFA.unpackEncodedStringToUnsignedChars(DFA61_minS);
    static final char[] DFA61_max = DFA.unpackEncodedStringToUnsignedChars(DFA61_maxS);
    static final short[] DFA61_accept = DFA.unpackEncodedString(DFA61_acceptS);
    static final short[] DFA61_special = DFA.unpackEncodedString(DFA61_specialS);
    static final short[][] DFA61_transition;

    static {
        int numStates = DFA61_transitionS.length;
        DFA61_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA61_transition[i] = DFA.unpackEncodedString(DFA61_transitionS[i]);
        }
    }

    class DFA61 extends DFA {

        public DFA61(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 61;
            this.eot = DFA61_eot;
            this.eof = DFA61_eof;
            this.min = DFA61_min;
            this.max = DFA61_max;
            this.accept = DFA61_accept;
            this.special = DFA61_special;
            this.transition = DFA61_transition;
        }
        public String getDescription() {
            return "1479:1: ( ( (lv_toEnd_0_0= 'end' ) ) | ( (lv_toMarker_1_0= 'marker' ) ) | ( ( (lv_value_2_0= RULE_INT ) ) (otherlv_3= 'st' | otherlv_4= 'sts' )? ( (lv_beforeEnd_5_0= 'before end' ) ) ) | ( ( (lv_value_6_0= RULE_INT ) ) (otherlv_7= 'st' | otherlv_8= 'sts' )? ( (lv_beforeGap_9_0= 'before gap' ) ) ) | ( ( (lv_value_10_0= RULE_INT ) ) (otherlv_11= 'st' | otherlv_12= 'sts' )? ( (lv_beforeMarker_13_0= 'before marker' ) ) ) | ( ( (lv_value_14_0= RULE_INT ) ) ( (lv_times_15_0= 'times' ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_rulePattern_in_entryRulePattern75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePattern85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LF_in_rulePattern122 = new BitSet(new long[]{0x00000000007F1090L});
    public static final BitSet FOLLOW_ruleBlockOperation_in_rulePattern144 = new BitSet(new long[]{0x00000000007F1092L});
    public static final BitSet FOLLOW_RULE_LF_in_rulePattern157 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleBlockOperation_in_entryRuleBlockOperation194 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlockOperation204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleBlockOperation251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRow_in_ruleBlockOperation278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_ruleBlockOperation305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_entryRuleInstruction340 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstruction350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleInstruction387 = new BitSet(new long[]{0x000000000000A020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInstruction404 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_13_in_ruleInstruction424 = new BitSet(new long[]{0x00000000007F0010L});
    public static final BitSet FOLLOW_RULE_LF_in_ruleInstruction436 = new BitSet(new long[]{0x00000000007F0010L});
    public static final BitSet FOLLOW_ruleRow_in_ruleInstruction458 = new BitSet(new long[]{0x00000000007F4000L});
    public static final BitSet FOLLOW_14_in_ruleInstruction471 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LF_in_ruleInstruction482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleInstruction501 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LF_in_ruleInstruction512 = new BitSet(new long[]{0x00000000007F0000L});
    public static final BitSet FOLLOW_ruleRow_in_ruleInstruction532 = new BitSet(new long[]{0x00000000007F0010L});
    public static final BitSet FOLLOW_RULE_LF_in_ruleInstruction544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRow_in_entryRuleRow581 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRow591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleRow634 = new BitSet(new long[]{0x00000000007E0000L});
    public static final BitSet FOLLOW_17_in_ruleRow711 = new BitSet(new long[]{0x00000000007E0000L});
    public static final BitSet FOLLOW_18_in_ruleRow796 = new BitSet(new long[]{0x00000000007E0000L});
    public static final BitSet FOLLOW_19_in_ruleRow869 = new BitSet(new long[]{0x00000003C0008040L});
    public static final BitSet FOLLOW_20_in_ruleRow898 = new BitSet(new long[]{0x00000003C0008040L});
    public static final BitSet FOLLOW_21_in_ruleRow927 = new BitSet(new long[]{0x00000003C0008040L});
    public static final BitSet FOLLOW_22_in_ruleRow956 = new BitSet(new long[]{0x00000003C0008040L});
    public static final BitSet FOLLOW_ruleRange_in_ruleRow994 = new BitSet(new long[]{0x00000003C0008000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRow1018 = new BitSet(new long[]{0x00000003C1808000L});
    public static final BitSet FOLLOW_23_in_ruleRow1036 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRow1053 = new BitSet(new long[]{0x00000003C1808000L});
    public static final BitSet FOLLOW_24_in_ruleRow1073 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_25_in_ruleRow1086 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_26_in_ruleRow1108 = new BitSet(new long[]{0x00000003F0008000L});
    public static final BitSet FOLLOW_27_in_ruleRow1137 = new BitSet(new long[]{0x00000003F0008000L});
    public static final BitSet FOLLOW_28_in_ruleRow1166 = new BitSet(new long[]{0x00000003C0008000L});
    public static final BitSet FOLLOW_29_in_ruleRow1184 = new BitSet(new long[]{0x00000003C0008000L});
    public static final BitSet FOLLOW_30_in_ruleRow1256 = new BitSet(new long[]{0x00000003C0008000L});
    public static final BitSet FOLLOW_31_in_ruleRow1285 = new BitSet(new long[]{0x00000003C0008000L});
    public static final BitSet FOLLOW_32_in_ruleRow1368 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRow1385 = new BitSet(new long[]{0x00000003C0008000L});
    public static final BitSet FOLLOW_33_in_ruleRow1444 = new BitSet(new long[]{0x0000005400800000L});
    public static final BitSet FOLLOW_23_in_ruleRow1458 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleRow1478 = new BitSet(new long[]{0x0000005800800000L});
    public static final BitSet FOLLOW_35_in_ruleRow1504 = new BitSet(new long[]{0x0000005000800000L});
    public static final BitSet FOLLOW_23_in_ruleRow1522 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleRow1542 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_37_in_ruleRow1568 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleRow1584 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRow1598 = new BitSet(new long[]{0x1FFE078000000010L,0x0000000000001C00L});
    public static final BitSet FOLLOW_RULE_LF_in_ruleRow1610 = new BitSet(new long[]{0x1FFE078000000010L,0x0000000000001C00L});
    public static final BitSet FOLLOW_ruleInlineOperation_in_ruleRow1632 = new BitSet(new long[]{0x0000000000800012L});
    public static final BitSet FOLLOW_23_in_ruleRow1645 = new BitSet(new long[]{0x1FFE078000000010L,0x0000000000001C00L});
    public static final BitSet FOLLOW_ruleInlineOperation_in_ruleRow1666 = new BitSet(new long[]{0x0000000000800012L});
    public static final BitSet FOLLOW_RULE_LF_in_ruleRow1685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_entryRuleMessage1722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessage1732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMessage1774 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LF_in_ruleMessage1790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInlineOperation_in_entryRuleInlineOperation1825 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInlineOperation1835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKnit_in_ruleInlineOperation1882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePurl_in_ruleInlineOperation1909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSlip_in_ruleInlineOperation1936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRepeat_in_ruleInlineOperation1963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKnit_in_entryRuleKnit1998 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKnit2008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleKnit2046 = new BitSet(new long[]{0x0001F80100000042L,0x0000000000000030L});
    public static final BitSet FOLLOW_40_in_ruleKnit2064 = new BitSet(new long[]{0x0001F80100000042L,0x0000000000000030L});
    public static final BitSet FOLLOW_41_in_ruleKnit2082 = new BitSet(new long[]{0x0001F80100000042L,0x0000000000000030L});
    public static final BitSet FOLLOW_42_in_ruleKnit2100 = new BitSet(new long[]{0x0001F80100000042L,0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleKnit2127 = new BitSet(new long[]{0x0001F80100000042L,0x0000000000000030L});
    public static final BitSet FOLLOW_43_in_ruleKnit2146 = new BitSet(new long[]{0x0001E00100000042L,0x0000000000000030L});
    public static final BitSet FOLLOW_44_in_ruleKnit2164 = new BitSet(new long[]{0x0001E00100000042L,0x0000000000000030L});
    public static final BitSet FOLLOW_45_in_ruleKnit2229 = new BitSet(new long[]{0x0001E00100000042L,0x0000000000000030L});
    public static final BitSet FOLLOW_46_in_ruleKnit2316 = new BitSet(new long[]{0x0001E00100000042L,0x0000000000000030L});
    public static final BitSet FOLLOW_47_in_ruleKnit2345 = new BitSet(new long[]{0x0001E00100000042L,0x0000000000000030L});
    public static final BitSet FOLLOW_32_in_ruleKnit2414 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleKnit2431 = new BitSet(new long[]{0x0001000000000042L,0x0000000000000030L});
    public static final BitSet FOLLOW_48_in_ruleKnit2452 = new BitSet(new long[]{0x0001000000000040L,0x0000000000000030L});
    public static final BitSet FOLLOW_ruleRepeatSpec_in_ruleKnit2475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePurl_in_entryRulePurl2513 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePurl2523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rulePurl2561 = new BitSet(new long[]{0x0001F80100000042L,0x0000000000000030L});
    public static final BitSet FOLLOW_50_in_rulePurl2579 = new BitSet(new long[]{0x0001F80100000042L,0x0000000000000030L});
    public static final BitSet FOLLOW_51_in_rulePurl2597 = new BitSet(new long[]{0x0001F80100000042L,0x0000000000000030L});
    public static final BitSet FOLLOW_52_in_rulePurl2615 = new BitSet(new long[]{0x0001F80100000042L,0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePurl2642 = new BitSet(new long[]{0x0001F80100000042L,0x0000000000000030L});
    public static final BitSet FOLLOW_43_in_rulePurl2661 = new BitSet(new long[]{0x0001E00100000042L,0x0000000000000030L});
    public static final BitSet FOLLOW_44_in_rulePurl2679 = new BitSet(new long[]{0x0001E00100000042L,0x0000000000000030L});
    public static final BitSet FOLLOW_45_in_rulePurl2744 = new BitSet(new long[]{0x0001E00100000042L,0x0000000000000030L});
    public static final BitSet FOLLOW_46_in_rulePurl2831 = new BitSet(new long[]{0x0001E00100000042L,0x0000000000000030L});
    public static final BitSet FOLLOW_47_in_rulePurl2860 = new BitSet(new long[]{0x0001E00100000042L,0x0000000000000030L});
    public static final BitSet FOLLOW_32_in_rulePurl2929 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePurl2946 = new BitSet(new long[]{0x0001000000000042L,0x0000000000000030L});
    public static final BitSet FOLLOW_48_in_rulePurl2967 = new BitSet(new long[]{0x0001000000000040L,0x0000000000000030L});
    public static final BitSet FOLLOW_ruleRepeatSpec_in_rulePurl2990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSlip_in_entryRuleSlip3028 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSlip3038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleSlip3092 = new BitSet(new long[]{0x1E00000000000000L});
    public static final BitSet FOLLOW_54_in_ruleSlip3121 = new BitSet(new long[]{0x1E00000000000000L});
    public static final BitSet FOLLOW_55_in_ruleSlip3150 = new BitSet(new long[]{0x1E00000000000000L});
    public static final BitSet FOLLOW_56_in_ruleSlip3179 = new BitSet(new long[]{0x1E00000000000000L});
    public static final BitSet FOLLOW_57_in_ruleSlip3209 = new BitSet(new long[]{0xE000000000000042L,0x000000000000000FL});
    public static final BitSet FOLLOW_58_in_ruleSlip3227 = new BitSet(new long[]{0xE000000000000042L,0x000000000000000FL});
    public static final BitSet FOLLOW_59_in_ruleSlip3245 = new BitSet(new long[]{0xE000000000000042L,0x000000000000000FL});
    public static final BitSet FOLLOW_60_in_ruleSlip3263 = new BitSet(new long[]{0xE000000000000042L,0x000000000000000FL});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSlip3283 = new BitSet(new long[]{0xC000180000000002L,0x000000000000000FL});
    public static final BitSet FOLLOW_43_in_ruleSlip3301 = new BitSet(new long[]{0xC000000000000002L,0x000000000000000FL});
    public static final BitSet FOLLOW_44_in_ruleSlip3319 = new BitSet(new long[]{0xC000000000000002L,0x000000000000000FL});
    public static final BitSet FOLLOW_61_in_ruleSlip3340 = new BitSet(new long[]{0xC000000000000002L,0x000000000000000FL});
    public static final BitSet FOLLOW_62_in_ruleSlip3363 = new BitSet(new long[]{0x0000000000000002L,0x000000000000000CL});
    public static final BitSet FOLLOW_63_in_ruleSlip3392 = new BitSet(new long[]{0x0000000000000002L,0x000000000000000CL});
    public static final BitSet FOLLOW_64_in_ruleSlip3434 = new BitSet(new long[]{0x0000000000000002L,0x000000000000000CL});
    public static final BitSet FOLLOW_65_in_ruleSlip3463 = new BitSet(new long[]{0x0000000000000002L,0x000000000000000CL});
    public static final BitSet FOLLOW_66_in_ruleSlip3501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleSlip3530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRepeatSpec_in_entryRuleRepeatSpec3583 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRepeatSpec3593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleRepeatSpec3636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleRepeatSpec3673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRepeatSpec3710 = new BitSet(new long[]{0x0000180000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_43_in_ruleRepeatSpec3728 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_44_in_ruleRepeatSpec3746 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_ruleRepeatSpec3766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRepeatSpec3804 = new BitSet(new long[]{0x0000180000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_43_in_ruleRepeatSpec3822 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_44_in_ruleRepeatSpec3840 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleRepeatSpec3860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRepeatSpec3898 = new BitSet(new long[]{0x0000180000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_43_in_ruleRepeatSpec3916 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_44_in_ruleRepeatSpec3934 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_ruleRepeatSpec3954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRepeatSpec3992 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_ruleRepeatSpec4015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRepeat_in_entryRuleRepeat4065 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRepeat4075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleRepeat4114 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_75_in_ruleRepeat4132 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_ruleRepeat4145 = new BitSet(new long[]{0x1FFE078000000010L,0x0000000000001C00L});
    public static final BitSet FOLLOW_ruleInlineOperation_in_ruleRepeat4166 = new BitSet(new long[]{0x0000000000800000L,0x0000000000002000L});
    public static final BitSet FOLLOW_23_in_ruleRepeat4179 = new BitSet(new long[]{0x1FFE078000000010L,0x0000000000001C00L});
    public static final BitSet FOLLOW_ruleInlineOperation_in_ruleRepeat4200 = new BitSet(new long[]{0x0000000000800000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleRepeat4214 = new BitSet(new long[]{0x0001000000000040L,0x0000000000000030L});
    public static final BitSet FOLLOW_48_in_ruleRepeat4227 = new BitSet(new long[]{0x0001000000000040L,0x0000000000000030L});
    public static final BitSet FOLLOW_ruleRepeatSpec_in_ruleRepeat4250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleRepeat4270 = new BitSet(new long[]{0x1FFE078000000010L,0x0000000000001C00L});
    public static final BitSet FOLLOW_ruleInlineOperation_in_ruleRepeat4291 = new BitSet(new long[]{0x0000000000800000L,0x0000000000002000L});
    public static final BitSet FOLLOW_23_in_ruleRepeat4304 = new BitSet(new long[]{0x1FFE078000000010L,0x0000000000001C00L});
    public static final BitSet FOLLOW_ruleInlineOperation_in_ruleRepeat4325 = new BitSet(new long[]{0x0000000000800000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleRepeat4339 = new BitSet(new long[]{0x0001000000800040L,0x0000000000000030L});
    public static final BitSet FOLLOW_23_in_ruleRepeat4352 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_74_in_ruleRepeat4365 = new BitSet(new long[]{0x0001000000000040L,0x0000000000000030L});
    public static final BitSet FOLLOW_75_in_ruleRepeat4383 = new BitSet(new long[]{0x0001000000000040L,0x0000000000000030L});
    public static final BitSet FOLLOW_48_in_ruleRepeat4399 = new BitSet(new long[]{0x0001000000000040L,0x0000000000000030L});
    public static final BitSet FOLLOW_ruleRepeatSpec_in_ruleRepeat4422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRange_in_entryRuleRange4459 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRange4469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRange4511 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_ruleRange4528 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRange4545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LF_in_synpred1_InternalKnittingExpressionLanguage1680 = new BitSet(new long[]{0x0000000000000002L});

}
