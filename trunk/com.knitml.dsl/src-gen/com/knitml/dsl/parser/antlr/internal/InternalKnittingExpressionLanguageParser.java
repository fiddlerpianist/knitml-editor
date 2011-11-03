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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_LF", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Instruction'", "'('", "'with'", "'key'", "','", "'round'", "'flat'", "'shape'", "'rows'", "'rounds'", "')'", "'{'", "'}'", "':'", "'Next'", "'Short'", "'Long'", "'Row'", "'Round'", "'Rows'", "'Rounds'", "'and'", "'all'", "'even'", "'odd'", "'WS'", "'RS'", "'inform'", "'side'", "'reset'", "'count'", "'K'", "'k'", "'Knit'", "'knit'", "'st'", "'sts'", "'tog'", "'tbl'", "'ttl'", "'to'", "'P'", "'p'", "'Purl'", "'purl'", "'Rev'", "'Reverse'", "'rev'", "'reverse'", "'Sl'", "'sl'", "'Slip'", "'slip'", "'next st'", "'kw'", "'knitwise'", "'pw'", "'purlwise'", "'wyif'", "'wyib'", "'end'", "'marker'", "'before end'", "'before gap'", "'before marker'", "'times'", "'Repeat'", "'repeat'", "'['", "']'", "'-'"
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

                if ( (LA2_0==RULE_STRING||LA2_0==12||(LA2_0>=26 && LA2_0<=32)) ) {
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
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
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
    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:173:1: ruleInstruction returns [EObject current=null] : (otherlv_0= 'Instruction' ( ( ( ( ({...}? => ( ({...}? => ( (lv_id_2_0= RULE_ID ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_label_3_0= RULE_STRING ) ) ) ) ) )+ {...}?) ) ) (otherlv_4= '(' (otherlv_5= 'with' ( (lv_hasKey_6_0= 'key' ) ) ( (lv_messageKey_7_0= RULE_STRING ) )? )? ( (otherlv_8= ',' )? ( ( (lv_shape_9_1= 'round' | lv_shape_9_2= 'flat' ) ) ) (otherlv_10= 'shape' )? )? ( (otherlv_11= ',' )? ( (lv_rowCount_12_0= RULE_INT ) ) (otherlv_13= 'rows' | otherlv_14= 'rounds' )? )? otherlv_15= ')' )? ( (otherlv_16= '{' (this_LF_17= RULE_LF )* ( (lv_rows_18_0= ruleRow ) )+ otherlv_19= '}' ( ( RULE_LF )=>this_LF_20= RULE_LF )? ) | (otherlv_21= ':' this_LF_22= RULE_LF ( (lv_rows_23_0= ruleRow ) )+ this_LF_24= RULE_LF ) ) ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_2_0=null;
        Token lv_label_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_hasKey_6_0=null;
        Token lv_messageKey_7_0=null;
        Token otherlv_8=null;
        Token lv_shape_9_1=null;
        Token lv_shape_9_2=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_rowCount_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token this_LF_17=null;
        Token otherlv_19=null;
        Token this_LF_20=null;
        Token otherlv_21=null;
        Token this_LF_22=null;
        Token this_LF_24=null;
        EObject lv_rows_18_0 = null;

        EObject lv_rows_23_0 = null;


         enterRule(); 
            
        try {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:176:28: ( (otherlv_0= 'Instruction' ( ( ( ( ({...}? => ( ({...}? => ( (lv_id_2_0= RULE_ID ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_label_3_0= RULE_STRING ) ) ) ) ) )+ {...}?) ) ) (otherlv_4= '(' (otherlv_5= 'with' ( (lv_hasKey_6_0= 'key' ) ) ( (lv_messageKey_7_0= RULE_STRING ) )? )? ( (otherlv_8= ',' )? ( ( (lv_shape_9_1= 'round' | lv_shape_9_2= 'flat' ) ) ) (otherlv_10= 'shape' )? )? ( (otherlv_11= ',' )? ( (lv_rowCount_12_0= RULE_INT ) ) (otherlv_13= 'rows' | otherlv_14= 'rounds' )? )? otherlv_15= ')' )? ( (otherlv_16= '{' (this_LF_17= RULE_LF )* ( (lv_rows_18_0= ruleRow ) )+ otherlv_19= '}' ( ( RULE_LF )=>this_LF_20= RULE_LF )? ) | (otherlv_21= ':' this_LF_22= RULE_LF ( (lv_rows_23_0= ruleRow ) )+ this_LF_24= RULE_LF ) ) ) )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:177:1: (otherlv_0= 'Instruction' ( ( ( ( ({...}? => ( ({...}? => ( (lv_id_2_0= RULE_ID ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_label_3_0= RULE_STRING ) ) ) ) ) )+ {...}?) ) ) (otherlv_4= '(' (otherlv_5= 'with' ( (lv_hasKey_6_0= 'key' ) ) ( (lv_messageKey_7_0= RULE_STRING ) )? )? ( (otherlv_8= ',' )? ( ( (lv_shape_9_1= 'round' | lv_shape_9_2= 'flat' ) ) ) (otherlv_10= 'shape' )? )? ( (otherlv_11= ',' )? ( (lv_rowCount_12_0= RULE_INT ) ) (otherlv_13= 'rows' | otherlv_14= 'rounds' )? )? otherlv_15= ')' )? ( (otherlv_16= '{' (this_LF_17= RULE_LF )* ( (lv_rows_18_0= ruleRow ) )+ otherlv_19= '}' ( ( RULE_LF )=>this_LF_20= RULE_LF )? ) | (otherlv_21= ':' this_LF_22= RULE_LF ( (lv_rows_23_0= ruleRow ) )+ this_LF_24= RULE_LF ) ) )
            {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:177:1: (otherlv_0= 'Instruction' ( ( ( ( ({...}? => ( ({...}? => ( (lv_id_2_0= RULE_ID ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_label_3_0= RULE_STRING ) ) ) ) ) )+ {...}?) ) ) (otherlv_4= '(' (otherlv_5= 'with' ( (lv_hasKey_6_0= 'key' ) ) ( (lv_messageKey_7_0= RULE_STRING ) )? )? ( (otherlv_8= ',' )? ( ( (lv_shape_9_1= 'round' | lv_shape_9_2= 'flat' ) ) ) (otherlv_10= 'shape' )? )? ( (otherlv_11= ',' )? ( (lv_rowCount_12_0= RULE_INT ) ) (otherlv_13= 'rows' | otherlv_14= 'rounds' )? )? otherlv_15= ')' )? ( (otherlv_16= '{' (this_LF_17= RULE_LF )* ( (lv_rows_18_0= ruleRow ) )+ otherlv_19= '}' ( ( RULE_LF )=>this_LF_20= RULE_LF )? ) | (otherlv_21= ':' this_LF_22= RULE_LF ( (lv_rows_23_0= ruleRow ) )+ this_LF_24= RULE_LF ) ) )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:177:3: otherlv_0= 'Instruction' ( ( ( ( ({...}? => ( ({...}? => ( (lv_id_2_0= RULE_ID ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_label_3_0= RULE_STRING ) ) ) ) ) )+ {...}?) ) ) (otherlv_4= '(' (otherlv_5= 'with' ( (lv_hasKey_6_0= 'key' ) ) ( (lv_messageKey_7_0= RULE_STRING ) )? )? ( (otherlv_8= ',' )? ( ( (lv_shape_9_1= 'round' | lv_shape_9_2= 'flat' ) ) ) (otherlv_10= 'shape' )? )? ( (otherlv_11= ',' )? ( (lv_rowCount_12_0= RULE_INT ) ) (otherlv_13= 'rows' | otherlv_14= 'rounds' )? )? otherlv_15= ')' )? ( (otherlv_16= '{' (this_LF_17= RULE_LF )* ( (lv_rows_18_0= ruleRow ) )+ otherlv_19= '}' ( ( RULE_LF )=>this_LF_20= RULE_LF )? ) | (otherlv_21= ':' this_LF_22= RULE_LF ( (lv_rows_23_0= ruleRow ) )+ this_LF_24= RULE_LF ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleInstruction387); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getInstructionAccess().getInstructionKeyword_0());
                  
            }
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:181:1: ( ( ( ( ({...}? => ( ({...}? => ( (lv_id_2_0= RULE_ID ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_label_3_0= RULE_STRING ) ) ) ) ) )+ {...}?) ) )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:183:1: ( ( ( ({...}? => ( ({...}? => ( (lv_id_2_0= RULE_ID ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_label_3_0= RULE_STRING ) ) ) ) ) )+ {...}?) )
            {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:183:1: ( ( ( ({...}? => ( ({...}? => ( (lv_id_2_0= RULE_ID ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_label_3_0= RULE_STRING ) ) ) ) ) )+ {...}?) )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:184:2: ( ( ({...}? => ( ({...}? => ( (lv_id_2_0= RULE_ID ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_label_3_0= RULE_STRING ) ) ) ) ) )+ {...}?)
            {
            getUnorderedGroupHelper().enter(grammarAccess.getInstructionAccess().getUnorderedGroup_1());
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:187:2: ( ( ({...}? => ( ({...}? => ( (lv_id_2_0= RULE_ID ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_label_3_0= RULE_STRING ) ) ) ) ) )+ {...}?)
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:188:3: ( ({...}? => ( ({...}? => ( (lv_id_2_0= RULE_ID ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_label_3_0= RULE_STRING ) ) ) ) ) )+ {...}?
            {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:188:3: ( ({...}? => ( ({...}? => ( (lv_id_2_0= RULE_ID ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_label_3_0= RULE_STRING ) ) ) ) ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=3;
                int LA5_0 = input.LA(1);

                if ( LA5_0 ==RULE_ID && getUnorderedGroupHelper().canSelect(grammarAccess.getInstructionAccess().getUnorderedGroup_1(), 0) ) {
                    alt5=1;
                }
                else if ( LA5_0 ==RULE_STRING && getUnorderedGroupHelper().canSelect(grammarAccess.getInstructionAccess().getUnorderedGroup_1(), 1) ) {
                    alt5=2;
                }


                switch (alt5) {
            	case 1 :
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:190:4: ({...}? => ( ({...}? => ( (lv_id_2_0= RULE_ID ) ) ) ) )
            	    {
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:190:4: ({...}? => ( ({...}? => ( (lv_id_2_0= RULE_ID ) ) ) ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:191:5: {...}? => ( ({...}? => ( (lv_id_2_0= RULE_ID ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInstructionAccess().getUnorderedGroup_1(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleInstruction", "getUnorderedGroupHelper().canSelect(grammarAccess.getInstructionAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:191:108: ( ({...}? => ( (lv_id_2_0= RULE_ID ) ) ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:192:6: ({...}? => ( (lv_id_2_0= RULE_ID ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getInstructionAccess().getUnorderedGroup_1(), 0);
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:195:6: ({...}? => ( (lv_id_2_0= RULE_ID ) ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:195:7: {...}? => ( (lv_id_2_0= RULE_ID ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleInstruction", "true");
            	    }
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:195:16: ( (lv_id_2_0= RULE_ID ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:196:1: (lv_id_2_0= RULE_ID )
            	    {
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:196:1: (lv_id_2_0= RULE_ID )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:197:3: lv_id_2_0= RULE_ID
            	    {
            	    lv_id_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInstruction449); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_id_2_0, grammarAccess.getInstructionAccess().getIdIDTerminalRuleCall_1_0_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getInstructionRule());
            	      	        }
            	             		setWithLastConsumed(
            	             			current, 
            	             			"id",
            	              		lv_id_2_0, 
            	              		"ID");
            	      	    
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInstructionAccess().getUnorderedGroup_1());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:220:4: ({...}? => ( ({...}? => ( (lv_label_3_0= RULE_STRING ) ) ) ) )
            	    {
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:220:4: ({...}? => ( ({...}? => ( (lv_label_3_0= RULE_STRING ) ) ) ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:221:5: {...}? => ( ({...}? => ( (lv_label_3_0= RULE_STRING ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInstructionAccess().getUnorderedGroup_1(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleInstruction", "getUnorderedGroupHelper().canSelect(grammarAccess.getInstructionAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:221:108: ( ({...}? => ( (lv_label_3_0= RULE_STRING ) ) ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:222:6: ({...}? => ( (lv_label_3_0= RULE_STRING ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getInstructionAccess().getUnorderedGroup_1(), 1);
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:225:6: ({...}? => ( (lv_label_3_0= RULE_STRING ) ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:225:7: {...}? => ( (lv_label_3_0= RULE_STRING ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleInstruction", "true");
            	    }
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:225:16: ( (lv_label_3_0= RULE_STRING ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:226:1: (lv_label_3_0= RULE_STRING )
            	    {
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:226:1: (lv_label_3_0= RULE_STRING )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:227:3: lv_label_3_0= RULE_STRING
            	    {
            	    lv_label_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInstruction525); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_label_3_0, grammarAccess.getInstructionAccess().getLabelSTRINGTerminalRuleCall_1_1_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getInstructionRule());
            	      	        }
            	             		setWithLastConsumed(
            	             			current, 
            	             			"label",
            	              		lv_label_3_0, 
            	              		"STRING");
            	      	    
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInstructionAccess().getUnorderedGroup_1());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getInstructionAccess().getUnorderedGroup_1()) ) {
                if (state.backtracking>0) {state.failed=true; return current;}
                throw new FailedPredicateException(input, "ruleInstruction", "getUnorderedGroupHelper().canLeave(grammarAccess.getInstructionAccess().getUnorderedGroup_1())");
            }

            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getInstructionAccess().getUnorderedGroup_1());

            }

            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:258:2: (otherlv_4= '(' (otherlv_5= 'with' ( (lv_hasKey_6_0= 'key' ) ) ( (lv_messageKey_7_0= RULE_STRING ) )? )? ( (otherlv_8= ',' )? ( ( (lv_shape_9_1= 'round' | lv_shape_9_2= 'flat' ) ) ) (otherlv_10= 'shape' )? )? ( (otherlv_11= ',' )? ( (lv_rowCount_12_0= RULE_INT ) ) (otherlv_13= 'rows' | otherlv_14= 'rounds' )? )? otherlv_15= ')' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==13) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:258:4: otherlv_4= '(' (otherlv_5= 'with' ( (lv_hasKey_6_0= 'key' ) ) ( (lv_messageKey_7_0= RULE_STRING ) )? )? ( (otherlv_8= ',' )? ( ( (lv_shape_9_1= 'round' | lv_shape_9_2= 'flat' ) ) ) (otherlv_10= 'shape' )? )? ( (otherlv_11= ',' )? ( (lv_rowCount_12_0= RULE_INT ) ) (otherlv_13= 'rows' | otherlv_14= 'rounds' )? )? otherlv_15= ')'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleInstruction589); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getInstructionAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:262:1: (otherlv_5= 'with' ( (lv_hasKey_6_0= 'key' ) ) ( (lv_messageKey_7_0= RULE_STRING ) )? )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==14) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:262:3: otherlv_5= 'with' ( (lv_hasKey_6_0= 'key' ) ) ( (lv_messageKey_7_0= RULE_STRING ) )?
                            {
                            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleInstruction602); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_5, grammarAccess.getInstructionAccess().getWithKeyword_2_1_0());
                                  
                            }
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:266:1: ( (lv_hasKey_6_0= 'key' ) )
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:267:1: (lv_hasKey_6_0= 'key' )
                            {
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:267:1: (lv_hasKey_6_0= 'key' )
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:268:3: lv_hasKey_6_0= 'key'
                            {
                            lv_hasKey_6_0=(Token)match(input,15,FOLLOW_15_in_ruleInstruction620); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_hasKey_6_0, grammarAccess.getInstructionAccess().getHasKeyKeyKeyword_2_1_1_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getInstructionRule());
                              	        }
                                     		setWithLastConsumed(current, "hasKey", true, "key");
                              	    
                            }

                            }


                            }

                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:281:2: ( (lv_messageKey_7_0= RULE_STRING ) )?
                            int alt6=2;
                            int LA6_0 = input.LA(1);

                            if ( (LA6_0==RULE_STRING) ) {
                                alt6=1;
                            }
                            switch (alt6) {
                                case 1 :
                                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:282:1: (lv_messageKey_7_0= RULE_STRING )
                                    {
                                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:282:1: (lv_messageKey_7_0= RULE_STRING )
                                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:283:3: lv_messageKey_7_0= RULE_STRING
                                    {
                                    lv_messageKey_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInstruction650); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      			newLeafNode(lv_messageKey_7_0, grammarAccess.getInstructionAccess().getMessageKeySTRINGTerminalRuleCall_2_1_2_0()); 
                                      		
                                    }
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElement(grammarAccess.getInstructionRule());
                                      	        }
                                             		setWithLastConsumed(
                                             			current, 
                                             			"messageKey",
                                              		lv_messageKey_7_0, 
                                              		"STRING");
                                      	    
                                    }

                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:299:5: ( (otherlv_8= ',' )? ( ( (lv_shape_9_1= 'round' | lv_shape_9_2= 'flat' ) ) ) (otherlv_10= 'shape' )? )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==16) ) {
                        int LA11_1 = input.LA(2);

                        if ( ((LA11_1>=17 && LA11_1<=18)) ) {
                            alt11=1;
                        }
                    }
                    else if ( ((LA11_0>=17 && LA11_0<=18)) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:299:6: (otherlv_8= ',' )? ( ( (lv_shape_9_1= 'round' | lv_shape_9_2= 'flat' ) ) ) (otherlv_10= 'shape' )?
                            {
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:299:6: (otherlv_8= ',' )?
                            int alt8=2;
                            int LA8_0 = input.LA(1);

                            if ( (LA8_0==16) ) {
                                alt8=1;
                            }
                            switch (alt8) {
                                case 1 :
                                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:299:8: otherlv_8= ','
                                    {
                                    otherlv_8=(Token)match(input,16,FOLLOW_16_in_ruleInstruction672); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_8, grammarAccess.getInstructionAccess().getCommaKeyword_2_2_0());
                                          
                                    }

                                    }
                                    break;

                            }

                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:303:3: ( ( (lv_shape_9_1= 'round' | lv_shape_9_2= 'flat' ) ) )
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:304:1: ( (lv_shape_9_1= 'round' | lv_shape_9_2= 'flat' ) )
                            {
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:304:1: ( (lv_shape_9_1= 'round' | lv_shape_9_2= 'flat' ) )
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:305:1: (lv_shape_9_1= 'round' | lv_shape_9_2= 'flat' )
                            {
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:305:1: (lv_shape_9_1= 'round' | lv_shape_9_2= 'flat' )
                            int alt9=2;
                            int LA9_0 = input.LA(1);

                            if ( (LA9_0==17) ) {
                                alt9=1;
                            }
                            else if ( (LA9_0==18) ) {
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
                                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:306:3: lv_shape_9_1= 'round'
                                    {
                                    lv_shape_9_1=(Token)match(input,17,FOLLOW_17_in_ruleInstruction694); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                              newLeafNode(lv_shape_9_1, grammarAccess.getInstructionAccess().getShapeRoundKeyword_2_2_1_0_0());
                                          
                                    }
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElement(grammarAccess.getInstructionRule());
                                      	        }
                                             		setWithLastConsumed(current, "shape", lv_shape_9_1, null);
                                      	    
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:318:8: lv_shape_9_2= 'flat'
                                    {
                                    lv_shape_9_2=(Token)match(input,18,FOLLOW_18_in_ruleInstruction723); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                              newLeafNode(lv_shape_9_2, grammarAccess.getInstructionAccess().getShapeFlatKeyword_2_2_1_0_1());
                                          
                                    }
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElement(grammarAccess.getInstructionRule());
                                      	        }
                                             		setWithLastConsumed(current, "shape", lv_shape_9_2, null);
                                      	    
                                    }

                                    }
                                    break;

                            }


                            }


                            }

                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:333:2: (otherlv_10= 'shape' )?
                            int alt10=2;
                            int LA10_0 = input.LA(1);

                            if ( (LA10_0==19) ) {
                                alt10=1;
                            }
                            switch (alt10) {
                                case 1 :
                                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:333:4: otherlv_10= 'shape'
                                    {
                                    otherlv_10=(Token)match(input,19,FOLLOW_19_in_ruleInstruction752); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_10, grammarAccess.getInstructionAccess().getShapeKeyword_2_2_2());
                                          
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:337:5: ( (otherlv_11= ',' )? ( (lv_rowCount_12_0= RULE_INT ) ) (otherlv_13= 'rows' | otherlv_14= 'rounds' )? )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==RULE_INT||LA14_0==16) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:337:6: (otherlv_11= ',' )? ( (lv_rowCount_12_0= RULE_INT ) ) (otherlv_13= 'rows' | otherlv_14= 'rounds' )?
                            {
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:337:6: (otherlv_11= ',' )?
                            int alt12=2;
                            int LA12_0 = input.LA(1);

                            if ( (LA12_0==16) ) {
                                alt12=1;
                            }
                            switch (alt12) {
                                case 1 :
                                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:337:8: otherlv_11= ','
                                    {
                                    otherlv_11=(Token)match(input,16,FOLLOW_16_in_ruleInstruction770); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_11, grammarAccess.getInstructionAccess().getCommaKeyword_2_3_0());
                                          
                                    }

                                    }
                                    break;

                            }

                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:341:3: ( (lv_rowCount_12_0= RULE_INT ) )
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:342:1: (lv_rowCount_12_0= RULE_INT )
                            {
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:342:1: (lv_rowCount_12_0= RULE_INT )
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:343:3: lv_rowCount_12_0= RULE_INT
                            {
                            lv_rowCount_12_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleInstruction789); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_rowCount_12_0, grammarAccess.getInstructionAccess().getRowCountINTTerminalRuleCall_2_3_1_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getInstructionRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"rowCount",
                                      		lv_rowCount_12_0, 
                                      		"INT");
                              	    
                            }

                            }


                            }

                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:359:2: (otherlv_13= 'rows' | otherlv_14= 'rounds' )?
                            int alt13=3;
                            int LA13_0 = input.LA(1);

                            if ( (LA13_0==20) ) {
                                alt13=1;
                            }
                            else if ( (LA13_0==21) ) {
                                alt13=2;
                            }
                            switch (alt13) {
                                case 1 :
                                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:359:4: otherlv_13= 'rows'
                                    {
                                    otherlv_13=(Token)match(input,20,FOLLOW_20_in_ruleInstruction807); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_13, grammarAccess.getInstructionAccess().getRowsKeyword_2_3_2_0());
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:364:7: otherlv_14= 'rounds'
                                    {
                                    otherlv_14=(Token)match(input,21,FOLLOW_21_in_ruleInstruction825); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_14, grammarAccess.getInstructionAccess().getRoundsKeyword_2_3_2_1());
                                          
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    otherlv_15=(Token)match(input,22,FOLLOW_22_in_ruleInstruction841); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getInstructionAccess().getRightParenthesisKeyword_2_4());
                          
                    }

                    }
                    break;

            }

            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:372:3: ( (otherlv_16= '{' (this_LF_17= RULE_LF )* ( (lv_rows_18_0= ruleRow ) )+ otherlv_19= '}' ( ( RULE_LF )=>this_LF_20= RULE_LF )? ) | (otherlv_21= ':' this_LF_22= RULE_LF ( (lv_rows_23_0= ruleRow ) )+ this_LF_24= RULE_LF ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==23) ) {
                alt20=1;
            }
            else if ( (LA20_0==25) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:372:4: (otherlv_16= '{' (this_LF_17= RULE_LF )* ( (lv_rows_18_0= ruleRow ) )+ otherlv_19= '}' ( ( RULE_LF )=>this_LF_20= RULE_LF )? )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:372:4: (otherlv_16= '{' (this_LF_17= RULE_LF )* ( (lv_rows_18_0= ruleRow ) )+ otherlv_19= '}' ( ( RULE_LF )=>this_LF_20= RULE_LF )? )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:372:6: otherlv_16= '{' (this_LF_17= RULE_LF )* ( (lv_rows_18_0= ruleRow ) )+ otherlv_19= '}' ( ( RULE_LF )=>this_LF_20= RULE_LF )?
                    {
                    otherlv_16=(Token)match(input,23,FOLLOW_23_in_ruleInstruction857); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getInstructionAccess().getLeftCurlyBracketKeyword_3_0_0());
                          
                    }
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:376:1: (this_LF_17= RULE_LF )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==RULE_LF) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:376:2: this_LF_17= RULE_LF
                    	    {
                    	    this_LF_17=(Token)match(input,RULE_LF,FOLLOW_RULE_LF_in_ruleInstruction869); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_LF_17, grammarAccess.getInstructionAccess().getLFTerminalRuleCall_3_0_1()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:380:3: ( (lv_rows_18_0= ruleRow ) )+
                    int cnt17=0;
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( ((LA17_0>=26 && LA17_0<=32)) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:381:1: (lv_rows_18_0= ruleRow )
                    	    {
                    	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:381:1: (lv_rows_18_0= ruleRow )
                    	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:382:3: lv_rows_18_0= ruleRow
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getInstructionAccess().getRowsRowParserRuleCall_3_0_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleRow_in_ruleInstruction891);
                    	    lv_rows_18_0=ruleRow();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getInstructionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"rows",
                    	              		lv_rows_18_0, 
                    	              		"Row");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt17 >= 1 ) break loop17;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(17, input);
                                throw eee;
                        }
                        cnt17++;
                    } while (true);

                    otherlv_19=(Token)match(input,24,FOLLOW_24_in_ruleInstruction904); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getInstructionAccess().getRightCurlyBracketKeyword_3_0_3());
                          
                    }
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:402:1: ( ( RULE_LF )=>this_LF_20= RULE_LF )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==RULE_LF) ) {
                        int LA18_1 = input.LA(2);

                        if ( (synpred1_InternalKnittingExpressionLanguage()) ) {
                            alt18=1;
                        }
                    }
                    switch (alt18) {
                        case 1 :
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:402:2: ( RULE_LF )=>this_LF_20= RULE_LF
                            {
                            this_LF_20=(Token)match(input,RULE_LF,FOLLOW_RULE_LF_in_ruleInstruction921); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_LF_20, grammarAccess.getInstructionAccess().getLFTerminalRuleCall_3_0_4()); 
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:407:6: (otherlv_21= ':' this_LF_22= RULE_LF ( (lv_rows_23_0= ruleRow ) )+ this_LF_24= RULE_LF )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:407:6: (otherlv_21= ':' this_LF_22= RULE_LF ( (lv_rows_23_0= ruleRow ) )+ this_LF_24= RULE_LF )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:407:8: otherlv_21= ':' this_LF_22= RULE_LF ( (lv_rows_23_0= ruleRow ) )+ this_LF_24= RULE_LF
                    {
                    otherlv_21=(Token)match(input,25,FOLLOW_25_in_ruleInstruction942); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_21, grammarAccess.getInstructionAccess().getColonKeyword_3_1_0());
                          
                    }
                    this_LF_22=(Token)match(input,RULE_LF,FOLLOW_RULE_LF_in_ruleInstruction953); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LF_22, grammarAccess.getInstructionAccess().getLFTerminalRuleCall_3_1_1()); 
                          
                    }
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:415:1: ( (lv_rows_23_0= ruleRow ) )+
                    int cnt19=0;
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( ((LA19_0>=26 && LA19_0<=32)) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:416:1: (lv_rows_23_0= ruleRow )
                    	    {
                    	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:416:1: (lv_rows_23_0= ruleRow )
                    	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:417:3: lv_rows_23_0= ruleRow
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getInstructionAccess().getRowsRowParserRuleCall_3_1_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleRow_in_ruleInstruction973);
                    	    lv_rows_23_0=ruleRow();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getInstructionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"rows",
                    	              		lv_rows_23_0, 
                    	              		"Row");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt19 >= 1 ) break loop19;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(19, input);
                                throw eee;
                        }
                        cnt19++;
                    } while (true);

                    this_LF_24=(Token)match(input,RULE_LF,FOLLOW_RULE_LF_in_ruleInstruction985); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LF_24, grammarAccess.getInstructionAccess().getLFTerminalRuleCall_3_1_3()); 
                          
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
    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:445:1: entryRuleRow returns [EObject current=null] : iv_ruleRow= ruleRow EOF ;
    public final EObject entryRuleRow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRow = null;


        try {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:446:2: (iv_ruleRow= ruleRow EOF )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:447:2: iv_ruleRow= ruleRow EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRowRule()); 
            }
            pushFollow(FOLLOW_ruleRow_in_entryRuleRow1022);
            iv_ruleRow=ruleRow();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRow; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRow1032); if (state.failed) return current;

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
    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:454:1: ruleRow returns [EObject current=null] : ( ( (lv_nextRow_0_0= 'Next' ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_shortRow_2_0= 'Short' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_longRow_3_0= 'Long' ) ) ) ) ) )* ) ) ) ( ( (lv_label_4_1= 'Row' | lv_label_4_2= 'Round' | lv_label_4_3= 'Rows' | lv_label_4_4= 'Rounds' ) ) ) ( ( (lv_range_5_0= ruleRange ) ) | ( ( (lv_number_6_0= RULE_INT ) ) (otherlv_7= ',' ( (lv_number_8_0= RULE_INT ) ) )* (otherlv_9= 'and' (otherlv_10= 'all' )? ( ( (lv_subsequent_11_1= 'even' | lv_subsequent_11_2= 'odd' ) ) ) (otherlv_12= 'rows' | otherlv_13= 'rounds' )? )? ) )? ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_side_15_1= 'WS' | lv_side_15_2= 'RS' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'with' ( (lv_yarnRef_17_0= RULE_ID ) ) ) ) ) ) )* ) ) ) (otherlv_18= '(' ( (otherlv_19= ',' )? ( (lv_inform_20_0= 'inform' ) ) (otherlv_21= 'side' )? )? ( (otherlv_22= ',' )? ( (lv_reset_23_0= 'reset' ) ) (otherlv_24= 'count' )? )? otherlv_25= ')' )? otherlv_26= ':' (this_LF_27= RULE_LF )? ( (lv_operations_28_0= ruleInlineOperation ) ) (otherlv_29= ',' ( (lv_operations_30_0= ruleInlineOperation ) ) )* ( ( RULE_LF )=>this_LF_31= RULE_LF )? ) ;
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
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:457:28: ( ( ( (lv_nextRow_0_0= 'Next' ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_shortRow_2_0= 'Short' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_longRow_3_0= 'Long' ) ) ) ) ) )* ) ) ) ( ( (lv_label_4_1= 'Row' | lv_label_4_2= 'Round' | lv_label_4_3= 'Rows' | lv_label_4_4= 'Rounds' ) ) ) ( ( (lv_range_5_0= ruleRange ) ) | ( ( (lv_number_6_0= RULE_INT ) ) (otherlv_7= ',' ( (lv_number_8_0= RULE_INT ) ) )* (otherlv_9= 'and' (otherlv_10= 'all' )? ( ( (lv_subsequent_11_1= 'even' | lv_subsequent_11_2= 'odd' ) ) ) (otherlv_12= 'rows' | otherlv_13= 'rounds' )? )? ) )? ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_side_15_1= 'WS' | lv_side_15_2= 'RS' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'with' ( (lv_yarnRef_17_0= RULE_ID ) ) ) ) ) ) )* ) ) ) (otherlv_18= '(' ( (otherlv_19= ',' )? ( (lv_inform_20_0= 'inform' ) ) (otherlv_21= 'side' )? )? ( (otherlv_22= ',' )? ( (lv_reset_23_0= 'reset' ) ) (otherlv_24= 'count' )? )? otherlv_25= ')' )? otherlv_26= ':' (this_LF_27= RULE_LF )? ( (lv_operations_28_0= ruleInlineOperation ) ) (otherlv_29= ',' ( (lv_operations_30_0= ruleInlineOperation ) ) )* ( ( RULE_LF )=>this_LF_31= RULE_LF )? ) )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:458:1: ( ( (lv_nextRow_0_0= 'Next' ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_shortRow_2_0= 'Short' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_longRow_3_0= 'Long' ) ) ) ) ) )* ) ) ) ( ( (lv_label_4_1= 'Row' | lv_label_4_2= 'Round' | lv_label_4_3= 'Rows' | lv_label_4_4= 'Rounds' ) ) ) ( ( (lv_range_5_0= ruleRange ) ) | ( ( (lv_number_6_0= RULE_INT ) ) (otherlv_7= ',' ( (lv_number_8_0= RULE_INT ) ) )* (otherlv_9= 'and' (otherlv_10= 'all' )? ( ( (lv_subsequent_11_1= 'even' | lv_subsequent_11_2= 'odd' ) ) ) (otherlv_12= 'rows' | otherlv_13= 'rounds' )? )? ) )? ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_side_15_1= 'WS' | lv_side_15_2= 'RS' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'with' ( (lv_yarnRef_17_0= RULE_ID ) ) ) ) ) ) )* ) ) ) (otherlv_18= '(' ( (otherlv_19= ',' )? ( (lv_inform_20_0= 'inform' ) ) (otherlv_21= 'side' )? )? ( (otherlv_22= ',' )? ( (lv_reset_23_0= 'reset' ) ) (otherlv_24= 'count' )? )? otherlv_25= ')' )? otherlv_26= ':' (this_LF_27= RULE_LF )? ( (lv_operations_28_0= ruleInlineOperation ) ) (otherlv_29= ',' ( (lv_operations_30_0= ruleInlineOperation ) ) )* ( ( RULE_LF )=>this_LF_31= RULE_LF )? )
            {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:458:1: ( ( (lv_nextRow_0_0= 'Next' ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_shortRow_2_0= 'Short' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_longRow_3_0= 'Long' ) ) ) ) ) )* ) ) ) ( ( (lv_label_4_1= 'Row' | lv_label_4_2= 'Round' | lv_label_4_3= 'Rows' | lv_label_4_4= 'Rounds' ) ) ) ( ( (lv_range_5_0= ruleRange ) ) | ( ( (lv_number_6_0= RULE_INT ) ) (otherlv_7= ',' ( (lv_number_8_0= RULE_INT ) ) )* (otherlv_9= 'and' (otherlv_10= 'all' )? ( ( (lv_subsequent_11_1= 'even' | lv_subsequent_11_2= 'odd' ) ) ) (otherlv_12= 'rows' | otherlv_13= 'rounds' )? )? ) )? ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_side_15_1= 'WS' | lv_side_15_2= 'RS' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'with' ( (lv_yarnRef_17_0= RULE_ID ) ) ) ) ) ) )* ) ) ) (otherlv_18= '(' ( (otherlv_19= ',' )? ( (lv_inform_20_0= 'inform' ) ) (otherlv_21= 'side' )? )? ( (otherlv_22= ',' )? ( (lv_reset_23_0= 'reset' ) ) (otherlv_24= 'count' )? )? otherlv_25= ')' )? otherlv_26= ':' (this_LF_27= RULE_LF )? ( (lv_operations_28_0= ruleInlineOperation ) ) (otherlv_29= ',' ( (lv_operations_30_0= ruleInlineOperation ) ) )* ( ( RULE_LF )=>this_LF_31= RULE_LF )? )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:458:2: ( (lv_nextRow_0_0= 'Next' ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_shortRow_2_0= 'Short' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_longRow_3_0= 'Long' ) ) ) ) ) )* ) ) ) ( ( (lv_label_4_1= 'Row' | lv_label_4_2= 'Round' | lv_label_4_3= 'Rows' | lv_label_4_4= 'Rounds' ) ) ) ( ( (lv_range_5_0= ruleRange ) ) | ( ( (lv_number_6_0= RULE_INT ) ) (otherlv_7= ',' ( (lv_number_8_0= RULE_INT ) ) )* (otherlv_9= 'and' (otherlv_10= 'all' )? ( ( (lv_subsequent_11_1= 'even' | lv_subsequent_11_2= 'odd' ) ) ) (otherlv_12= 'rows' | otherlv_13= 'rounds' )? )? ) )? ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_side_15_1= 'WS' | lv_side_15_2= 'RS' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'with' ( (lv_yarnRef_17_0= RULE_ID ) ) ) ) ) ) )* ) ) ) (otherlv_18= '(' ( (otherlv_19= ',' )? ( (lv_inform_20_0= 'inform' ) ) (otherlv_21= 'side' )? )? ( (otherlv_22= ',' )? ( (lv_reset_23_0= 'reset' ) ) (otherlv_24= 'count' )? )? otherlv_25= ')' )? otherlv_26= ':' (this_LF_27= RULE_LF )? ( (lv_operations_28_0= ruleInlineOperation ) ) (otherlv_29= ',' ( (lv_operations_30_0= ruleInlineOperation ) ) )* ( ( RULE_LF )=>this_LF_31= RULE_LF )?
            {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:458:2: ( (lv_nextRow_0_0= 'Next' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==26) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:459:1: (lv_nextRow_0_0= 'Next' )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:459:1: (lv_nextRow_0_0= 'Next' )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:460:3: lv_nextRow_0_0= 'Next'
                    {
                    lv_nextRow_0_0=(Token)match(input,26,FOLLOW_26_in_ruleRow1075); if (state.failed) return current;
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

            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:473:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_shortRow_2_0= 'Short' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_longRow_3_0= 'Long' ) ) ) ) ) )* ) ) )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:475:1: ( ( ( ({...}? => ( ({...}? => ( (lv_shortRow_2_0= 'Short' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_longRow_3_0= 'Long' ) ) ) ) ) )* ) )
            {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:475:1: ( ( ( ({...}? => ( ({...}? => ( (lv_shortRow_2_0= 'Short' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_longRow_3_0= 'Long' ) ) ) ) ) )* ) )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:476:2: ( ( ({...}? => ( ({...}? => ( (lv_shortRow_2_0= 'Short' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_longRow_3_0= 'Long' ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getRowAccess().getUnorderedGroup_1());
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:479:2: ( ( ({...}? => ( ({...}? => ( (lv_shortRow_2_0= 'Short' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_longRow_3_0= 'Long' ) ) ) ) ) )* )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:480:3: ( ({...}? => ( ({...}? => ( (lv_shortRow_2_0= 'Short' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_longRow_3_0= 'Long' ) ) ) ) ) )*
            {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:480:3: ( ({...}? => ( ({...}? => ( (lv_shortRow_2_0= 'Short' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_longRow_3_0= 'Long' ) ) ) ) ) )*
            loop22:
            do {
                int alt22=3;
                int LA22_0 = input.LA(1);

                if ( LA22_0 ==27 && getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_1(), 0) ) {
                    alt22=1;
                }
                else if ( LA22_0 ==28 && getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_1(), 1) ) {
                    alt22=2;
                }


                switch (alt22) {
            	case 1 :
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:482:4: ({...}? => ( ({...}? => ( (lv_shortRow_2_0= 'Short' ) ) ) ) )
            	    {
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:482:4: ({...}? => ( ({...}? => ( (lv_shortRow_2_0= 'Short' ) ) ) ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:483:5: {...}? => ( ({...}? => ( (lv_shortRow_2_0= 'Short' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_1(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRow", "getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:483:100: ( ({...}? => ( (lv_shortRow_2_0= 'Short' ) ) ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:484:6: ({...}? => ( (lv_shortRow_2_0= 'Short' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getRowAccess().getUnorderedGroup_1(), 0);
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:487:6: ({...}? => ( (lv_shortRow_2_0= 'Short' ) ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:487:7: {...}? => ( (lv_shortRow_2_0= 'Short' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRow", "true");
            	    }
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:487:16: ( (lv_shortRow_2_0= 'Short' ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:488:1: (lv_shortRow_2_0= 'Short' )
            	    {
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:488:1: (lv_shortRow_2_0= 'Short' )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:489:3: lv_shortRow_2_0= 'Short'
            	    {
            	    lv_shortRow_2_0=(Token)match(input,27,FOLLOW_27_in_ruleRow1152); if (state.failed) return current;
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
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:509:4: ({...}? => ( ({...}? => ( (lv_longRow_3_0= 'Long' ) ) ) ) )
            	    {
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:509:4: ({...}? => ( ({...}? => ( (lv_longRow_3_0= 'Long' ) ) ) ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:510:5: {...}? => ( ({...}? => ( (lv_longRow_3_0= 'Long' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_1(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRow", "getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:510:100: ( ({...}? => ( (lv_longRow_3_0= 'Long' ) ) ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:511:6: ({...}? => ( (lv_longRow_3_0= 'Long' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getRowAccess().getUnorderedGroup_1(), 1);
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:514:6: ({...}? => ( (lv_longRow_3_0= 'Long' ) ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:514:7: {...}? => ( (lv_longRow_3_0= 'Long' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRow", "true");
            	    }
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:514:16: ( (lv_longRow_3_0= 'Long' ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:515:1: (lv_longRow_3_0= 'Long' )
            	    {
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:515:1: (lv_longRow_3_0= 'Long' )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:516:3: lv_longRow_3_0= 'Long'
            	    {
            	    lv_longRow_3_0=(Token)match(input,28,FOLLOW_28_in_ruleRow1237); if (state.failed) return current;
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
            	    break loop22;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getRowAccess().getUnorderedGroup_1());

            }

            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:543:2: ( ( (lv_label_4_1= 'Row' | lv_label_4_2= 'Round' | lv_label_4_3= 'Rows' | lv_label_4_4= 'Rounds' ) ) )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:544:1: ( (lv_label_4_1= 'Row' | lv_label_4_2= 'Round' | lv_label_4_3= 'Rows' | lv_label_4_4= 'Rounds' ) )
            {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:544:1: ( (lv_label_4_1= 'Row' | lv_label_4_2= 'Round' | lv_label_4_3= 'Rows' | lv_label_4_4= 'Rounds' ) )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:545:1: (lv_label_4_1= 'Row' | lv_label_4_2= 'Round' | lv_label_4_3= 'Rows' | lv_label_4_4= 'Rounds' )
            {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:545:1: (lv_label_4_1= 'Row' | lv_label_4_2= 'Round' | lv_label_4_3= 'Rows' | lv_label_4_4= 'Rounds' )
            int alt23=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt23=1;
                }
                break;
            case 30:
                {
                alt23=2;
                }
                break;
            case 31:
                {
                alt23=3;
                }
                break;
            case 32:
                {
                alt23=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:546:3: lv_label_4_1= 'Row'
                    {
                    lv_label_4_1=(Token)match(input,29,FOLLOW_29_in_ruleRow1310); if (state.failed) return current;
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
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:558:8: lv_label_4_2= 'Round'
                    {
                    lv_label_4_2=(Token)match(input,30,FOLLOW_30_in_ruleRow1339); if (state.failed) return current;
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
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:570:8: lv_label_4_3= 'Rows'
                    {
                    lv_label_4_3=(Token)match(input,31,FOLLOW_31_in_ruleRow1368); if (state.failed) return current;
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
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:582:8: lv_label_4_4= 'Rounds'
                    {
                    lv_label_4_4=(Token)match(input,32,FOLLOW_32_in_ruleRow1397); if (state.failed) return current;
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

            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:597:2: ( ( (lv_range_5_0= ruleRange ) ) | ( ( (lv_number_6_0= RULE_INT ) ) (otherlv_7= ',' ( (lv_number_8_0= RULE_INT ) ) )* (otherlv_9= 'and' (otherlv_10= 'all' )? ( ( (lv_subsequent_11_1= 'even' | lv_subsequent_11_2= 'odd' ) ) ) (otherlv_12= 'rows' | otherlv_13= 'rounds' )? )? ) )?
            int alt29=3;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_INT) ) {
                int LA29_1 = input.LA(2);

                if ( (LA29_1==82) ) {
                    alt29=1;
                }
                else if ( ((LA29_1>=13 && LA29_1<=14)||LA29_1==16||LA29_1==25||LA29_1==33||(LA29_1>=37 && LA29_1<=38)) ) {
                    alt29=2;
                }
            }
            switch (alt29) {
                case 1 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:597:3: ( (lv_range_5_0= ruleRange ) )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:597:3: ( (lv_range_5_0= ruleRange ) )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:598:1: (lv_range_5_0= ruleRange )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:598:1: (lv_range_5_0= ruleRange )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:599:3: lv_range_5_0= ruleRange
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRowAccess().getRangeRangeParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRange_in_ruleRow1435);
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
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:616:6: ( ( (lv_number_6_0= RULE_INT ) ) (otherlv_7= ',' ( (lv_number_8_0= RULE_INT ) ) )* (otherlv_9= 'and' (otherlv_10= 'all' )? ( ( (lv_subsequent_11_1= 'even' | lv_subsequent_11_2= 'odd' ) ) ) (otherlv_12= 'rows' | otherlv_13= 'rounds' )? )? )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:616:6: ( ( (lv_number_6_0= RULE_INT ) ) (otherlv_7= ',' ( (lv_number_8_0= RULE_INT ) ) )* (otherlv_9= 'and' (otherlv_10= 'all' )? ( ( (lv_subsequent_11_1= 'even' | lv_subsequent_11_2= 'odd' ) ) ) (otherlv_12= 'rows' | otherlv_13= 'rounds' )? )? )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:616:7: ( (lv_number_6_0= RULE_INT ) ) (otherlv_7= ',' ( (lv_number_8_0= RULE_INT ) ) )* (otherlv_9= 'and' (otherlv_10= 'all' )? ( ( (lv_subsequent_11_1= 'even' | lv_subsequent_11_2= 'odd' ) ) ) (otherlv_12= 'rows' | otherlv_13= 'rounds' )? )?
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:616:7: ( (lv_number_6_0= RULE_INT ) )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:617:1: (lv_number_6_0= RULE_INT )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:617:1: (lv_number_6_0= RULE_INT )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:618:3: lv_number_6_0= RULE_INT
                    {
                    lv_number_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRow1459); if (state.failed) return current;
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

                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:634:2: (otherlv_7= ',' ( (lv_number_8_0= RULE_INT ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==16) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:634:4: otherlv_7= ',' ( (lv_number_8_0= RULE_INT ) )
                    	    {
                    	    otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleRow1477); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_7, grammarAccess.getRowAccess().getCommaKeyword_3_1_1_0());
                    	          
                    	    }
                    	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:638:1: ( (lv_number_8_0= RULE_INT ) )
                    	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:639:1: (lv_number_8_0= RULE_INT )
                    	    {
                    	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:639:1: (lv_number_8_0= RULE_INT )
                    	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:640:3: lv_number_8_0= RULE_INT
                    	    {
                    	    lv_number_8_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRow1494); if (state.failed) return current;
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
                    	    break loop24;
                        }
                    } while (true);

                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:656:4: (otherlv_9= 'and' (otherlv_10= 'all' )? ( ( (lv_subsequent_11_1= 'even' | lv_subsequent_11_2= 'odd' ) ) ) (otherlv_12= 'rows' | otherlv_13= 'rounds' )? )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==33) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:656:6: otherlv_9= 'and' (otherlv_10= 'all' )? ( ( (lv_subsequent_11_1= 'even' | lv_subsequent_11_2= 'odd' ) ) ) (otherlv_12= 'rows' | otherlv_13= 'rounds' )?
                            {
                            otherlv_9=(Token)match(input,33,FOLLOW_33_in_ruleRow1514); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_9, grammarAccess.getRowAccess().getAndKeyword_3_1_2_0());
                                  
                            }
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:660:1: (otherlv_10= 'all' )?
                            int alt25=2;
                            int LA25_0 = input.LA(1);

                            if ( (LA25_0==34) ) {
                                alt25=1;
                            }
                            switch (alt25) {
                                case 1 :
                                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:660:3: otherlv_10= 'all'
                                    {
                                    otherlv_10=(Token)match(input,34,FOLLOW_34_in_ruleRow1527); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_10, grammarAccess.getRowAccess().getAllKeyword_3_1_2_1());
                                          
                                    }

                                    }
                                    break;

                            }

                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:664:3: ( ( (lv_subsequent_11_1= 'even' | lv_subsequent_11_2= 'odd' ) ) )
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:665:1: ( (lv_subsequent_11_1= 'even' | lv_subsequent_11_2= 'odd' ) )
                            {
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:665:1: ( (lv_subsequent_11_1= 'even' | lv_subsequent_11_2= 'odd' ) )
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:666:1: (lv_subsequent_11_1= 'even' | lv_subsequent_11_2= 'odd' )
                            {
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:666:1: (lv_subsequent_11_1= 'even' | lv_subsequent_11_2= 'odd' )
                            int alt26=2;
                            int LA26_0 = input.LA(1);

                            if ( (LA26_0==35) ) {
                                alt26=1;
                            }
                            else if ( (LA26_0==36) ) {
                                alt26=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 26, 0, input);

                                throw nvae;
                            }
                            switch (alt26) {
                                case 1 :
                                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:667:3: lv_subsequent_11_1= 'even'
                                    {
                                    lv_subsequent_11_1=(Token)match(input,35,FOLLOW_35_in_ruleRow1549); if (state.failed) return current;
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
                                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:679:8: lv_subsequent_11_2= 'odd'
                                    {
                                    lv_subsequent_11_2=(Token)match(input,36,FOLLOW_36_in_ruleRow1578); if (state.failed) return current;
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

                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:694:2: (otherlv_12= 'rows' | otherlv_13= 'rounds' )?
                            int alt27=3;
                            int LA27_0 = input.LA(1);

                            if ( (LA27_0==20) ) {
                                alt27=1;
                            }
                            else if ( (LA27_0==21) ) {
                                alt27=2;
                            }
                            switch (alt27) {
                                case 1 :
                                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:694:4: otherlv_12= 'rows'
                                    {
                                    otherlv_12=(Token)match(input,20,FOLLOW_20_in_ruleRow1607); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_12, grammarAccess.getRowAccess().getRowsKeyword_3_1_2_3_0());
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:699:7: otherlv_13= 'rounds'
                                    {
                                    otherlv_13=(Token)match(input,21,FOLLOW_21_in_ruleRow1625); if (state.failed) return current;
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

            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:703:8: ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_side_15_1= 'WS' | lv_side_15_2= 'RS' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'with' ( (lv_yarnRef_17_0= RULE_ID ) ) ) ) ) ) )* ) ) )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:705:1: ( ( ( ({...}? => ( ({...}? => ( ( (lv_side_15_1= 'WS' | lv_side_15_2= 'RS' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'with' ( (lv_yarnRef_17_0= RULE_ID ) ) ) ) ) ) )* ) )
            {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:705:1: ( ( ( ({...}? => ( ({...}? => ( ( (lv_side_15_1= 'WS' | lv_side_15_2= 'RS' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'with' ( (lv_yarnRef_17_0= RULE_ID ) ) ) ) ) ) )* ) )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:706:2: ( ( ({...}? => ( ({...}? => ( ( (lv_side_15_1= 'WS' | lv_side_15_2= 'RS' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'with' ( (lv_yarnRef_17_0= RULE_ID ) ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getRowAccess().getUnorderedGroup_4());
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:709:2: ( ( ({...}? => ( ({...}? => ( ( (lv_side_15_1= 'WS' | lv_side_15_2= 'RS' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'with' ( (lv_yarnRef_17_0= RULE_ID ) ) ) ) ) ) )* )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:710:3: ( ({...}? => ( ({...}? => ( ( (lv_side_15_1= 'WS' | lv_side_15_2= 'RS' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'with' ( (lv_yarnRef_17_0= RULE_ID ) ) ) ) ) ) )*
            {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:710:3: ( ({...}? => ( ({...}? => ( ( (lv_side_15_1= 'WS' | lv_side_15_2= 'RS' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'with' ( (lv_yarnRef_17_0= RULE_ID ) ) ) ) ) ) )*
            loop31:
            do {
                int alt31=3;
                int LA31_0 = input.LA(1);

                if ( LA31_0 >=37 && LA31_0<=38 && getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_4(), 0) ) {
                    alt31=1;
                }
                else if ( LA31_0 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_4(), 1) ) {
                    alt31=2;
                }


                switch (alt31) {
            	case 1 :
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:712:4: ({...}? => ( ({...}? => ( ( (lv_side_15_1= 'WS' | lv_side_15_2= 'RS' ) ) ) ) ) )
            	    {
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:712:4: ({...}? => ( ({...}? => ( ( (lv_side_15_1= 'WS' | lv_side_15_2= 'RS' ) ) ) ) ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:713:5: {...}? => ( ({...}? => ( ( (lv_side_15_1= 'WS' | lv_side_15_2= 'RS' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_4(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRow", "getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:713:100: ( ({...}? => ( ( (lv_side_15_1= 'WS' | lv_side_15_2= 'RS' ) ) ) ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:714:6: ({...}? => ( ( (lv_side_15_1= 'WS' | lv_side_15_2= 'RS' ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getRowAccess().getUnorderedGroup_4(), 0);
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:717:6: ({...}? => ( ( (lv_side_15_1= 'WS' | lv_side_15_2= 'RS' ) ) ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:717:7: {...}? => ( ( (lv_side_15_1= 'WS' | lv_side_15_2= 'RS' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRow", "true");
            	    }
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:717:16: ( ( (lv_side_15_1= 'WS' | lv_side_15_2= 'RS' ) ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:718:1: ( (lv_side_15_1= 'WS' | lv_side_15_2= 'RS' ) )
            	    {
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:718:1: ( (lv_side_15_1= 'WS' | lv_side_15_2= 'RS' ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:719:1: (lv_side_15_1= 'WS' | lv_side_15_2= 'RS' )
            	    {
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:719:1: (lv_side_15_1= 'WS' | lv_side_15_2= 'RS' )
            	    int alt30=2;
            	    int LA30_0 = input.LA(1);

            	    if ( (LA30_0==37) ) {
            	        alt30=1;
            	    }
            	    else if ( (LA30_0==38) ) {
            	        alt30=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 30, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt30) {
            	        case 1 :
            	            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:720:3: lv_side_15_1= 'WS'
            	            {
            	            lv_side_15_1=(Token)match(input,37,FOLLOW_37_in_ruleRow1697); if (state.failed) return current;
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
            	            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:732:8: lv_side_15_2= 'RS'
            	            {
            	            lv_side_15_2=(Token)match(input,38,FOLLOW_38_in_ruleRow1726); if (state.failed) return current;
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
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:754:4: ({...}? => ( ({...}? => (otherlv_16= 'with' ( (lv_yarnRef_17_0= RULE_ID ) ) ) ) ) )
            	    {
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:754:4: ({...}? => ( ({...}? => (otherlv_16= 'with' ( (lv_yarnRef_17_0= RULE_ID ) ) ) ) ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:755:5: {...}? => ( ({...}? => (otherlv_16= 'with' ( (lv_yarnRef_17_0= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_4(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRow", "getUnorderedGroupHelper().canSelect(grammarAccess.getRowAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:755:100: ( ({...}? => (otherlv_16= 'with' ( (lv_yarnRef_17_0= RULE_ID ) ) ) ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:756:6: ({...}? => (otherlv_16= 'with' ( (lv_yarnRef_17_0= RULE_ID ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getRowAccess().getUnorderedGroup_4(), 1);
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:759:6: ({...}? => (otherlv_16= 'with' ( (lv_yarnRef_17_0= RULE_ID ) ) ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:759:7: {...}? => (otherlv_16= 'with' ( (lv_yarnRef_17_0= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRow", "true");
            	    }
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:759:16: (otherlv_16= 'with' ( (lv_yarnRef_17_0= RULE_ID ) ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:759:18: otherlv_16= 'with' ( (lv_yarnRef_17_0= RULE_ID ) )
            	    {
            	    otherlv_16=(Token)match(input,14,FOLLOW_14_in_ruleRow1809); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_16, grammarAccess.getRowAccess().getWithKeyword_4_1_0());
            	          
            	    }
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:763:1: ( (lv_yarnRef_17_0= RULE_ID ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:764:1: (lv_yarnRef_17_0= RULE_ID )
            	    {
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:764:1: (lv_yarnRef_17_0= RULE_ID )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:765:3: lv_yarnRef_17_0= RULE_ID
            	    {
            	    lv_yarnRef_17_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRow1826); if (state.failed) return current;
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
            	    break loop31;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getRowAccess().getUnorderedGroup_4());

            }

            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:795:2: (otherlv_18= '(' ( (otherlv_19= ',' )? ( (lv_inform_20_0= 'inform' ) ) (otherlv_21= 'side' )? )? ( (otherlv_22= ',' )? ( (lv_reset_23_0= 'reset' ) ) (otherlv_24= 'count' )? )? otherlv_25= ')' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==13) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:795:4: otherlv_18= '(' ( (otherlv_19= ',' )? ( (lv_inform_20_0= 'inform' ) ) (otherlv_21= 'side' )? )? ( (otherlv_22= ',' )? ( (lv_reset_23_0= 'reset' ) ) (otherlv_24= 'count' )? )? otherlv_25= ')'
                    {
                    otherlv_18=(Token)match(input,13,FOLLOW_13_in_ruleRow1885); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_18, grammarAccess.getRowAccess().getLeftParenthesisKeyword_5_0());
                          
                    }
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:799:1: ( (otherlv_19= ',' )? ( (lv_inform_20_0= 'inform' ) ) (otherlv_21= 'side' )? )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==16) ) {
                        int LA34_1 = input.LA(2);

                        if ( (LA34_1==39) ) {
                            alt34=1;
                        }
                    }
                    else if ( (LA34_0==39) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:799:2: (otherlv_19= ',' )? ( (lv_inform_20_0= 'inform' ) ) (otherlv_21= 'side' )?
                            {
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:799:2: (otherlv_19= ',' )?
                            int alt32=2;
                            int LA32_0 = input.LA(1);

                            if ( (LA32_0==16) ) {
                                alt32=1;
                            }
                            switch (alt32) {
                                case 1 :
                                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:799:4: otherlv_19= ','
                                    {
                                    otherlv_19=(Token)match(input,16,FOLLOW_16_in_ruleRow1899); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_19, grammarAccess.getRowAccess().getCommaKeyword_5_1_0());
                                          
                                    }

                                    }
                                    break;

                            }

                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:803:3: ( (lv_inform_20_0= 'inform' ) )
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:804:1: (lv_inform_20_0= 'inform' )
                            {
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:804:1: (lv_inform_20_0= 'inform' )
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:805:3: lv_inform_20_0= 'inform'
                            {
                            lv_inform_20_0=(Token)match(input,39,FOLLOW_39_in_ruleRow1919); if (state.failed) return current;
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

                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:818:2: (otherlv_21= 'side' )?
                            int alt33=2;
                            int LA33_0 = input.LA(1);

                            if ( (LA33_0==40) ) {
                                alt33=1;
                            }
                            switch (alt33) {
                                case 1 :
                                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:818:4: otherlv_21= 'side'
                                    {
                                    otherlv_21=(Token)match(input,40,FOLLOW_40_in_ruleRow1945); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_21, grammarAccess.getRowAccess().getSideKeyword_5_1_2());
                                          
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:822:5: ( (otherlv_22= ',' )? ( (lv_reset_23_0= 'reset' ) ) (otherlv_24= 'count' )? )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==16||LA37_0==41) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:822:6: (otherlv_22= ',' )? ( (lv_reset_23_0= 'reset' ) ) (otherlv_24= 'count' )?
                            {
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:822:6: (otherlv_22= ',' )?
                            int alt35=2;
                            int LA35_0 = input.LA(1);

                            if ( (LA35_0==16) ) {
                                alt35=1;
                            }
                            switch (alt35) {
                                case 1 :
                                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:822:8: otherlv_22= ','
                                    {
                                    otherlv_22=(Token)match(input,16,FOLLOW_16_in_ruleRow1963); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_22, grammarAccess.getRowAccess().getCommaKeyword_5_2_0());
                                          
                                    }

                                    }
                                    break;

                            }

                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:826:3: ( (lv_reset_23_0= 'reset' ) )
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:827:1: (lv_reset_23_0= 'reset' )
                            {
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:827:1: (lv_reset_23_0= 'reset' )
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:828:3: lv_reset_23_0= 'reset'
                            {
                            lv_reset_23_0=(Token)match(input,41,FOLLOW_41_in_ruleRow1983); if (state.failed) return current;
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

                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:841:2: (otherlv_24= 'count' )?
                            int alt36=2;
                            int LA36_0 = input.LA(1);

                            if ( (LA36_0==42) ) {
                                alt36=1;
                            }
                            switch (alt36) {
                                case 1 :
                                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:841:4: otherlv_24= 'count'
                                    {
                                    otherlv_24=(Token)match(input,42,FOLLOW_42_in_ruleRow2009); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_24, grammarAccess.getRowAccess().getCountKeyword_5_2_2());
                                          
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    otherlv_25=(Token)match(input,22,FOLLOW_22_in_ruleRow2025); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_25, grammarAccess.getRowAccess().getRightParenthesisKeyword_5_3());
                          
                    }

                    }
                    break;

            }

            otherlv_26=(Token)match(input,25,FOLLOW_25_in_ruleRow2039); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_26, grammarAccess.getRowAccess().getColonKeyword_6());
                  
            }
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:853:1: (this_LF_27= RULE_LF )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_LF) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:853:2: this_LF_27= RULE_LF
                    {
                    this_LF_27=(Token)match(input,RULE_LF,FOLLOW_RULE_LF_in_ruleRow2051); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LF_27, grammarAccess.getRowAccess().getLFTerminalRuleCall_7()); 
                          
                    }

                    }
                    break;

            }

            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:857:3: ( (lv_operations_28_0= ruleInlineOperation ) )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:858:1: (lv_operations_28_0= ruleInlineOperation )
            {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:858:1: (lv_operations_28_0= ruleInlineOperation )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:859:3: lv_operations_28_0= ruleInlineOperation
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRowAccess().getOperationsInlineOperationParserRuleCall_8_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleInlineOperation_in_ruleRow2073);
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

            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:875:2: (otherlv_29= ',' ( (lv_operations_30_0= ruleInlineOperation ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==16) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:875:4: otherlv_29= ',' ( (lv_operations_30_0= ruleInlineOperation ) )
            	    {
            	    otherlv_29=(Token)match(input,16,FOLLOW_16_in_ruleRow2086); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_29, grammarAccess.getRowAccess().getCommaKeyword_9_0());
            	          
            	    }
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:879:1: ( (lv_operations_30_0= ruleInlineOperation ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:880:1: (lv_operations_30_0= ruleInlineOperation )
            	    {
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:880:1: (lv_operations_30_0= ruleInlineOperation )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:881:3: lv_operations_30_0= ruleInlineOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRowAccess().getOperationsInlineOperationParserRuleCall_9_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleInlineOperation_in_ruleRow2107);
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
            	    break loop40;
                }
            } while (true);

            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:897:4: ( ( RULE_LF )=>this_LF_31= RULE_LF )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_LF) ) {
                int LA41_1 = input.LA(2);

                if ( (synpred2_InternalKnittingExpressionLanguage()) ) {
                    alt41=1;
                }
            }
            switch (alt41) {
                case 1 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:897:5: ( RULE_LF )=>this_LF_31= RULE_LF
                    {
                    this_LF_31=(Token)match(input,RULE_LF,FOLLOW_RULE_LF_in_ruleRow2126); if (state.failed) return current;
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
    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:909:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:910:2: (iv_ruleMessage= ruleMessage EOF )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:911:2: iv_ruleMessage= ruleMessage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMessageRule()); 
            }
            pushFollow(FOLLOW_ruleMessage_in_entryRuleMessage2163);
            iv_ruleMessage=ruleMessage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMessage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessage2173); if (state.failed) return current;

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
    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:918:1: ruleMessage returns [EObject current=null] : ( ( (lv_message_0_0= RULE_STRING ) ) this_LF_1= RULE_LF ) ;
    public final EObject ruleMessage() throws RecognitionException {
        EObject current = null;

        Token lv_message_0_0=null;
        Token this_LF_1=null;

         enterRule(); 
            
        try {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:921:28: ( ( ( (lv_message_0_0= RULE_STRING ) ) this_LF_1= RULE_LF ) )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:922:1: ( ( (lv_message_0_0= RULE_STRING ) ) this_LF_1= RULE_LF )
            {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:922:1: ( ( (lv_message_0_0= RULE_STRING ) ) this_LF_1= RULE_LF )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:922:2: ( (lv_message_0_0= RULE_STRING ) ) this_LF_1= RULE_LF
            {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:922:2: ( (lv_message_0_0= RULE_STRING ) )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:923:1: (lv_message_0_0= RULE_STRING )
            {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:923:1: (lv_message_0_0= RULE_STRING )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:924:3: lv_message_0_0= RULE_STRING
            {
            lv_message_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMessage2215); if (state.failed) return current;
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

            this_LF_1=(Token)match(input,RULE_LF,FOLLOW_RULE_LF_in_ruleMessage2231); if (state.failed) return current;
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
    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:952:1: entryRuleInlineOperation returns [EObject current=null] : iv_ruleInlineOperation= ruleInlineOperation EOF ;
    public final EObject entryRuleInlineOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInlineOperation = null;


        try {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:953:2: (iv_ruleInlineOperation= ruleInlineOperation EOF )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:954:2: iv_ruleInlineOperation= ruleInlineOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInlineOperationRule()); 
            }
            pushFollow(FOLLOW_ruleInlineOperation_in_entryRuleInlineOperation2266);
            iv_ruleInlineOperation=ruleInlineOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInlineOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInlineOperation2276); if (state.failed) return current;

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
    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:961:1: ruleInlineOperation returns [EObject current=null] : (this_Knit_0= ruleKnit | this_Purl_1= rulePurl | this_Slip_2= ruleSlip | this_Repeat_3= ruleRepeat ) ;
    public final EObject ruleInlineOperation() throws RecognitionException {
        EObject current = null;

        EObject this_Knit_0 = null;

        EObject this_Purl_1 = null;

        EObject this_Slip_2 = null;

        EObject this_Repeat_3 = null;


         enterRule(); 
            
        try {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:964:28: ( (this_Knit_0= ruleKnit | this_Purl_1= rulePurl | this_Slip_2= ruleSlip | this_Repeat_3= ruleRepeat ) )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:965:1: (this_Knit_0= ruleKnit | this_Purl_1= rulePurl | this_Slip_2= ruleSlip | this_Repeat_3= ruleRepeat )
            {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:965:1: (this_Knit_0= ruleKnit | this_Purl_1= rulePurl | this_Slip_2= ruleSlip | this_Repeat_3= ruleRepeat )
            int alt42=4;
            switch ( input.LA(1) ) {
            case 43:
            case 44:
            case 45:
            case 46:
                {
                alt42=1;
                }
                break;
            case 53:
            case 54:
            case 55:
            case 56:
                {
                alt42=2;
                }
                break;
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
                {
                alt42=3;
                }
                break;
            case 78:
            case 79:
            case 80:
                {
                alt42=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:966:5: this_Knit_0= ruleKnit
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInlineOperationAccess().getKnitParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleKnit_in_ruleInlineOperation2323);
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
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:976:5: this_Purl_1= rulePurl
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInlineOperationAccess().getPurlParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulePurl_in_ruleInlineOperation2350);
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
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:986:5: this_Slip_2= ruleSlip
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInlineOperationAccess().getSlipParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSlip_in_ruleInlineOperation2377);
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
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:996:5: this_Repeat_3= ruleRepeat
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInlineOperationAccess().getRepeatParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRepeat_in_ruleInlineOperation2404);
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
    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1012:1: entryRuleKnit returns [EObject current=null] : iv_ruleKnit= ruleKnit EOF ;
    public final EObject entryRuleKnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKnit = null;


        try {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1013:2: (iv_ruleKnit= ruleKnit EOF )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1014:2: iv_ruleKnit= ruleKnit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKnitRule()); 
            }
            pushFollow(FOLLOW_ruleKnit_in_entryRuleKnit2439);
            iv_ruleKnit=ruleKnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKnit; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleKnit2449); if (state.failed) return current;

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
    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1021:1: ruleKnit returns [EObject current=null] : ( (otherlv_0= 'K' | otherlv_1= 'k' | otherlv_2= 'Knit' | otherlv_3= 'knit' ) () ( (lv_number_5_0= RULE_INT ) )? (otherlv_6= 'st' | otherlv_7= 'sts' )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_together_9_0= 'tog' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) ) ) ) ) )* ) ) ) (otherlv_11= 'with' ( (lv_yarnRef_12_0= RULE_ID ) ) )? ( (otherlv_13= 'to' )? ( (lv_repeat_14_0= ruleRepeatSpec ) ) )? ) ;
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
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1024:28: ( ( (otherlv_0= 'K' | otherlv_1= 'k' | otherlv_2= 'Knit' | otherlv_3= 'knit' ) () ( (lv_number_5_0= RULE_INT ) )? (otherlv_6= 'st' | otherlv_7= 'sts' )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_together_9_0= 'tog' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) ) ) ) ) )* ) ) ) (otherlv_11= 'with' ( (lv_yarnRef_12_0= RULE_ID ) ) )? ( (otherlv_13= 'to' )? ( (lv_repeat_14_0= ruleRepeatSpec ) ) )? ) )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1025:1: ( (otherlv_0= 'K' | otherlv_1= 'k' | otherlv_2= 'Knit' | otherlv_3= 'knit' ) () ( (lv_number_5_0= RULE_INT ) )? (otherlv_6= 'st' | otherlv_7= 'sts' )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_together_9_0= 'tog' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) ) ) ) ) )* ) ) ) (otherlv_11= 'with' ( (lv_yarnRef_12_0= RULE_ID ) ) )? ( (otherlv_13= 'to' )? ( (lv_repeat_14_0= ruleRepeatSpec ) ) )? )
            {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1025:1: ( (otherlv_0= 'K' | otherlv_1= 'k' | otherlv_2= 'Knit' | otherlv_3= 'knit' ) () ( (lv_number_5_0= RULE_INT ) )? (otherlv_6= 'st' | otherlv_7= 'sts' )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_together_9_0= 'tog' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) ) ) ) ) )* ) ) ) (otherlv_11= 'with' ( (lv_yarnRef_12_0= RULE_ID ) ) )? ( (otherlv_13= 'to' )? ( (lv_repeat_14_0= ruleRepeatSpec ) ) )? )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1025:2: (otherlv_0= 'K' | otherlv_1= 'k' | otherlv_2= 'Knit' | otherlv_3= 'knit' ) () ( (lv_number_5_0= RULE_INT ) )? (otherlv_6= 'st' | otherlv_7= 'sts' )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_together_9_0= 'tog' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) ) ) ) ) )* ) ) ) (otherlv_11= 'with' ( (lv_yarnRef_12_0= RULE_ID ) ) )? ( (otherlv_13= 'to' )? ( (lv_repeat_14_0= ruleRepeatSpec ) ) )?
            {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1025:2: (otherlv_0= 'K' | otherlv_1= 'k' | otherlv_2= 'Knit' | otherlv_3= 'knit' )
            int alt43=4;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt43=1;
                }
                break;
            case 44:
                {
                alt43=2;
                }
                break;
            case 45:
                {
                alt43=3;
                }
                break;
            case 46:
                {
                alt43=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1025:4: otherlv_0= 'K'
                    {
                    otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleKnit2487); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getKnitAccess().getKKeyword_0_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1030:7: otherlv_1= 'k'
                    {
                    otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleKnit2505); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getKnitAccess().getKKeyword_0_1());
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1035:7: otherlv_2= 'Knit'
                    {
                    otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleKnit2523); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getKnitAccess().getKnitKeyword_0_2());
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1040:7: otherlv_3= 'knit'
                    {
                    otherlv_3=(Token)match(input,46,FOLLOW_46_in_ruleKnit2541); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getKnitAccess().getKnitKeyword_0_3());
                          
                    }

                    }
                    break;

            }

            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1044:2: ()
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1045:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getKnitAccess().getKnitAction_1(),
                          current);
                  
            }

            }

            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1050:2: ( (lv_number_5_0= RULE_INT ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_INT) ) {
                switch ( input.LA(2) ) {
                    case 47:
                        {
                        int LA44_3 = input.LA(3);

                        if ( (LA44_3==EOF||LA44_3==RULE_LF||(LA44_3>=RULE_STRING && LA44_3<=RULE_INT)||LA44_3==12||LA44_3==14||LA44_3==16||LA44_3==24||(LA44_3>=26 && LA44_3<=32)||(LA44_3>=49 && LA44_3<=52)||(LA44_3>=72 && LA44_3<=73)||LA44_3==81) ) {
                            alt44=1;
                        }
                        }
                        break;
                    case 48:
                        {
                        int LA44_4 = input.LA(3);

                        if ( (LA44_4==EOF||LA44_4==RULE_LF||(LA44_4>=RULE_STRING && LA44_4<=RULE_INT)||LA44_4==12||LA44_4==14||LA44_4==16||LA44_4==24||(LA44_4>=26 && LA44_4<=32)||(LA44_4>=49 && LA44_4<=52)||(LA44_4>=72 && LA44_4<=73)||LA44_4==81) ) {
                            alt44=1;
                        }
                        }
                        break;
                    case EOF:
                    case RULE_LF:
                    case RULE_STRING:
                    case RULE_INT:
                    case 12:
                    case 14:
                    case 16:
                    case 24:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 72:
                    case 73:
                    case 81:
                        {
                        alt44=1;
                        }
                        break;
                }

            }
            switch (alt44) {
                case 1 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1051:1: (lv_number_5_0= RULE_INT )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1051:1: (lv_number_5_0= RULE_INT )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1052:3: lv_number_5_0= RULE_INT
                    {
                    lv_number_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleKnit2568); if (state.failed) return current;
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

            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1068:3: (otherlv_6= 'st' | otherlv_7= 'sts' )?
            int alt45=3;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==47) ) {
                alt45=1;
            }
            else if ( (LA45_0==48) ) {
                alt45=2;
            }
            switch (alt45) {
                case 1 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1068:5: otherlv_6= 'st'
                    {
                    otherlv_6=(Token)match(input,47,FOLLOW_47_in_ruleKnit2587); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getKnitAccess().getStKeyword_3_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1073:7: otherlv_7= 'sts'
                    {
                    otherlv_7=(Token)match(input,48,FOLLOW_48_in_ruleKnit2605); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getKnitAccess().getStsKeyword_3_1());
                          
                    }

                    }
                    break;

            }

            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1077:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_together_9_0= 'tog' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) ) ) ) ) )* ) ) )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1079:1: ( ( ( ({...}? => ( ({...}? => ( (lv_together_9_0= 'tog' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) ) ) ) ) )* ) )
            {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1079:1: ( ( ( ({...}? => ( ({...}? => ( (lv_together_9_0= 'tog' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) ) ) ) ) )* ) )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1080:2: ( ( ({...}? => ( ({...}? => ( (lv_together_9_0= 'tog' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getKnitAccess().getUnorderedGroup_4());
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1083:2: ( ( ({...}? => ( ({...}? => ( (lv_together_9_0= 'tog' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) ) ) ) ) )* )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1084:3: ( ({...}? => ( ({...}? => ( (lv_together_9_0= 'tog' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) ) ) ) ) )*
            {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1084:3: ( ({...}? => ( ({...}? => ( (lv_together_9_0= 'tog' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) ) ) ) ) )*
            loop47:
            do {
                int alt47=3;
                int LA47_0 = input.LA(1);

                if ( LA47_0 ==49 && getUnorderedGroupHelper().canSelect(grammarAccess.getKnitAccess().getUnorderedGroup_4(), 0) ) {
                    alt47=1;
                }
                else if ( LA47_0 >=50 && LA47_0<=51 && getUnorderedGroupHelper().canSelect(grammarAccess.getKnitAccess().getUnorderedGroup_4(), 1) ) {
                    alt47=2;
                }


                switch (alt47) {
            	case 1 :
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1086:4: ({...}? => ( ({...}? => ( (lv_together_9_0= 'tog' ) ) ) ) )
            	    {
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1086:4: ({...}? => ( ({...}? => ( (lv_together_9_0= 'tog' ) ) ) ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1087:5: {...}? => ( ({...}? => ( (lv_together_9_0= 'tog' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getKnitAccess().getUnorderedGroup_4(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleKnit", "getUnorderedGroupHelper().canSelect(grammarAccess.getKnitAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1087:101: ( ({...}? => ( (lv_together_9_0= 'tog' ) ) ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1088:6: ({...}? => ( (lv_together_9_0= 'tog' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getKnitAccess().getUnorderedGroup_4(), 0);
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1091:6: ({...}? => ( (lv_together_9_0= 'tog' ) ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1091:7: {...}? => ( (lv_together_9_0= 'tog' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleKnit", "true");
            	    }
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1091:16: ( (lv_together_9_0= 'tog' ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1092:1: (lv_together_9_0= 'tog' )
            	    {
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1092:1: (lv_together_9_0= 'tog' )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1093:3: lv_together_9_0= 'tog'
            	    {
            	    lv_together_9_0=(Token)match(input,49,FOLLOW_49_in_ruleKnit2670); if (state.failed) return current;
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
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1113:4: ({...}? => ( ({...}? => ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) ) ) ) )
            	    {
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1113:4: ({...}? => ( ({...}? => ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) ) ) ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1114:5: {...}? => ( ({...}? => ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getKnitAccess().getUnorderedGroup_4(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleKnit", "getUnorderedGroupHelper().canSelect(grammarAccess.getKnitAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1114:101: ( ({...}? => ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) ) ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1115:6: ({...}? => ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getKnitAccess().getUnorderedGroup_4(), 1);
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1118:6: ({...}? => ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1118:7: {...}? => ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleKnit", "true");
            	    }
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1118:16: ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1119:1: ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) )
            	    {
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1119:1: ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1120:1: (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' )
            	    {
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1120:1: (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' )
            	    int alt46=2;
            	    int LA46_0 = input.LA(1);

            	    if ( (LA46_0==50) ) {
            	        alt46=1;
            	    }
            	    else if ( (LA46_0==51) ) {
            	        alt46=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 46, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt46) {
            	        case 1 :
            	            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1121:3: lv_throughTrailingLoop_10_1= 'tbl'
            	            {
            	            lv_throughTrailingLoop_10_1=(Token)match(input,50,FOLLOW_50_in_ruleKnit2757); if (state.failed) return current;
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
            	            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1133:8: lv_throughTrailingLoop_10_2= 'ttl'
            	            {
            	            lv_throughTrailingLoop_10_2=(Token)match(input,51,FOLLOW_51_in_ruleKnit2786); if (state.failed) return current;
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
            	    break loop47;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getKnitAccess().getUnorderedGroup_4());

            }

            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1162:2: (otherlv_11= 'with' ( (lv_yarnRef_12_0= RULE_ID ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==14) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1162:4: otherlv_11= 'with' ( (lv_yarnRef_12_0= RULE_ID ) )
                    {
                    otherlv_11=(Token)match(input,14,FOLLOW_14_in_ruleKnit2855); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getKnitAccess().getWithKeyword_5_0());
                          
                    }
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1166:1: ( (lv_yarnRef_12_0= RULE_ID ) )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1167:1: (lv_yarnRef_12_0= RULE_ID )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1167:1: (lv_yarnRef_12_0= RULE_ID )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1168:3: lv_yarnRef_12_0= RULE_ID
                    {
                    lv_yarnRef_12_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleKnit2872); if (state.failed) return current;
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

            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1184:4: ( (otherlv_13= 'to' )? ( (lv_repeat_14_0= ruleRepeatSpec ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_INT||LA50_0==52||(LA50_0>=72 && LA50_0<=73)) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1184:5: (otherlv_13= 'to' )? ( (lv_repeat_14_0= ruleRepeatSpec ) )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1184:5: (otherlv_13= 'to' )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==52) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1184:7: otherlv_13= 'to'
                            {
                            otherlv_13=(Token)match(input,52,FOLLOW_52_in_ruleKnit2893); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_13, grammarAccess.getKnitAccess().getToKeyword_6_0());
                                  
                            }

                            }
                            break;

                    }

                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1188:3: ( (lv_repeat_14_0= ruleRepeatSpec ) )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1189:1: (lv_repeat_14_0= ruleRepeatSpec )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1189:1: (lv_repeat_14_0= ruleRepeatSpec )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1190:3: lv_repeat_14_0= ruleRepeatSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getKnitAccess().getRepeatRepeatSpecParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRepeatSpec_in_ruleKnit2916);
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
    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1214:1: entryRulePurl returns [EObject current=null] : iv_rulePurl= rulePurl EOF ;
    public final EObject entryRulePurl() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePurl = null;


        try {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1215:2: (iv_rulePurl= rulePurl EOF )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1216:2: iv_rulePurl= rulePurl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPurlRule()); 
            }
            pushFollow(FOLLOW_rulePurl_in_entryRulePurl2954);
            iv_rulePurl=rulePurl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePurl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePurl2964); if (state.failed) return current;

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
    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1223:1: rulePurl returns [EObject current=null] : ( (otherlv_0= 'P' | otherlv_1= 'p' | otherlv_2= 'Purl' | otherlv_3= 'purl' ) () ( (lv_number_5_0= RULE_INT ) )? (otherlv_6= 'st' | otherlv_7= 'sts' )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_together_9_0= 'tog' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) ) ) ) ) )* ) ) ) (otherlv_11= 'with' ( (lv_yarnRef_12_0= RULE_ID ) ) )? ( (otherlv_13= 'to' )? ( (lv_repeat_14_0= ruleRepeatSpec ) ) )? ) ;
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
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1226:28: ( ( (otherlv_0= 'P' | otherlv_1= 'p' | otherlv_2= 'Purl' | otherlv_3= 'purl' ) () ( (lv_number_5_0= RULE_INT ) )? (otherlv_6= 'st' | otherlv_7= 'sts' )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_together_9_0= 'tog' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) ) ) ) ) )* ) ) ) (otherlv_11= 'with' ( (lv_yarnRef_12_0= RULE_ID ) ) )? ( (otherlv_13= 'to' )? ( (lv_repeat_14_0= ruleRepeatSpec ) ) )? ) )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1227:1: ( (otherlv_0= 'P' | otherlv_1= 'p' | otherlv_2= 'Purl' | otherlv_3= 'purl' ) () ( (lv_number_5_0= RULE_INT ) )? (otherlv_6= 'st' | otherlv_7= 'sts' )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_together_9_0= 'tog' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) ) ) ) ) )* ) ) ) (otherlv_11= 'with' ( (lv_yarnRef_12_0= RULE_ID ) ) )? ( (otherlv_13= 'to' )? ( (lv_repeat_14_0= ruleRepeatSpec ) ) )? )
            {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1227:1: ( (otherlv_0= 'P' | otherlv_1= 'p' | otherlv_2= 'Purl' | otherlv_3= 'purl' ) () ( (lv_number_5_0= RULE_INT ) )? (otherlv_6= 'st' | otherlv_7= 'sts' )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_together_9_0= 'tog' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) ) ) ) ) )* ) ) ) (otherlv_11= 'with' ( (lv_yarnRef_12_0= RULE_ID ) ) )? ( (otherlv_13= 'to' )? ( (lv_repeat_14_0= ruleRepeatSpec ) ) )? )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1227:2: (otherlv_0= 'P' | otherlv_1= 'p' | otherlv_2= 'Purl' | otherlv_3= 'purl' ) () ( (lv_number_5_0= RULE_INT ) )? (otherlv_6= 'st' | otherlv_7= 'sts' )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_together_9_0= 'tog' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) ) ) ) ) )* ) ) ) (otherlv_11= 'with' ( (lv_yarnRef_12_0= RULE_ID ) ) )? ( (otherlv_13= 'to' )? ( (lv_repeat_14_0= ruleRepeatSpec ) ) )?
            {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1227:2: (otherlv_0= 'P' | otherlv_1= 'p' | otherlv_2= 'Purl' | otherlv_3= 'purl' )
            int alt51=4;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt51=1;
                }
                break;
            case 54:
                {
                alt51=2;
                }
                break;
            case 55:
                {
                alt51=3;
                }
                break;
            case 56:
                {
                alt51=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1227:4: otherlv_0= 'P'
                    {
                    otherlv_0=(Token)match(input,53,FOLLOW_53_in_rulePurl3002); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getPurlAccess().getPKeyword_0_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1232:7: otherlv_1= 'p'
                    {
                    otherlv_1=(Token)match(input,54,FOLLOW_54_in_rulePurl3020); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getPurlAccess().getPKeyword_0_1());
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1237:7: otherlv_2= 'Purl'
                    {
                    otherlv_2=(Token)match(input,55,FOLLOW_55_in_rulePurl3038); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getPurlAccess().getPurlKeyword_0_2());
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1242:7: otherlv_3= 'purl'
                    {
                    otherlv_3=(Token)match(input,56,FOLLOW_56_in_rulePurl3056); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getPurlAccess().getPurlKeyword_0_3());
                          
                    }

                    }
                    break;

            }

            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1246:2: ()
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1247:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getPurlAccess().getPurlAction_1(),
                          current);
                  
            }

            }

            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1252:2: ( (lv_number_5_0= RULE_INT ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_INT) ) {
                switch ( input.LA(2) ) {
                    case 47:
                        {
                        int LA52_3 = input.LA(3);

                        if ( (LA52_3==EOF||LA52_3==RULE_LF||(LA52_3>=RULE_STRING && LA52_3<=RULE_INT)||LA52_3==12||LA52_3==14||LA52_3==16||LA52_3==24||(LA52_3>=26 && LA52_3<=32)||(LA52_3>=49 && LA52_3<=52)||(LA52_3>=72 && LA52_3<=73)||LA52_3==81) ) {
                            alt52=1;
                        }
                        }
                        break;
                    case 48:
                        {
                        int LA52_4 = input.LA(3);

                        if ( (LA52_4==EOF||LA52_4==RULE_LF||(LA52_4>=RULE_STRING && LA52_4<=RULE_INT)||LA52_4==12||LA52_4==14||LA52_4==16||LA52_4==24||(LA52_4>=26 && LA52_4<=32)||(LA52_4>=49 && LA52_4<=52)||(LA52_4>=72 && LA52_4<=73)||LA52_4==81) ) {
                            alt52=1;
                        }
                        }
                        break;
                    case EOF:
                    case RULE_LF:
                    case RULE_STRING:
                    case RULE_INT:
                    case 12:
                    case 14:
                    case 16:
                    case 24:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 72:
                    case 73:
                    case 81:
                        {
                        alt52=1;
                        }
                        break;
                }

            }
            switch (alt52) {
                case 1 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1253:1: (lv_number_5_0= RULE_INT )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1253:1: (lv_number_5_0= RULE_INT )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1254:3: lv_number_5_0= RULE_INT
                    {
                    lv_number_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePurl3083); if (state.failed) return current;
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

            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1270:3: (otherlv_6= 'st' | otherlv_7= 'sts' )?
            int alt53=3;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==47) ) {
                alt53=1;
            }
            else if ( (LA53_0==48) ) {
                alt53=2;
            }
            switch (alt53) {
                case 1 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1270:5: otherlv_6= 'st'
                    {
                    otherlv_6=(Token)match(input,47,FOLLOW_47_in_rulePurl3102); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getPurlAccess().getStKeyword_3_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1275:7: otherlv_7= 'sts'
                    {
                    otherlv_7=(Token)match(input,48,FOLLOW_48_in_rulePurl3120); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getPurlAccess().getStsKeyword_3_1());
                          
                    }

                    }
                    break;

            }

            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1279:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_together_9_0= 'tog' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) ) ) ) ) )* ) ) )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1281:1: ( ( ( ({...}? => ( ({...}? => ( (lv_together_9_0= 'tog' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) ) ) ) ) )* ) )
            {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1281:1: ( ( ( ({...}? => ( ({...}? => ( (lv_together_9_0= 'tog' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) ) ) ) ) )* ) )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1282:2: ( ( ({...}? => ( ({...}? => ( (lv_together_9_0= 'tog' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getPurlAccess().getUnorderedGroup_4());
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1285:2: ( ( ({...}? => ( ({...}? => ( (lv_together_9_0= 'tog' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) ) ) ) ) )* )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1286:3: ( ({...}? => ( ({...}? => ( (lv_together_9_0= 'tog' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) ) ) ) ) )*
            {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1286:3: ( ({...}? => ( ({...}? => ( (lv_together_9_0= 'tog' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) ) ) ) ) )*
            loop55:
            do {
                int alt55=3;
                int LA55_0 = input.LA(1);

                if ( LA55_0 ==49 && getUnorderedGroupHelper().canSelect(grammarAccess.getPurlAccess().getUnorderedGroup_4(), 0) ) {
                    alt55=1;
                }
                else if ( LA55_0 >=50 && LA55_0<=51 && getUnorderedGroupHelper().canSelect(grammarAccess.getPurlAccess().getUnorderedGroup_4(), 1) ) {
                    alt55=2;
                }


                switch (alt55) {
            	case 1 :
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1288:4: ({...}? => ( ({...}? => ( (lv_together_9_0= 'tog' ) ) ) ) )
            	    {
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1288:4: ({...}? => ( ({...}? => ( (lv_together_9_0= 'tog' ) ) ) ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1289:5: {...}? => ( ({...}? => ( (lv_together_9_0= 'tog' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPurlAccess().getUnorderedGroup_4(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "rulePurl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPurlAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1289:101: ( ({...}? => ( (lv_together_9_0= 'tog' ) ) ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1290:6: ({...}? => ( (lv_together_9_0= 'tog' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getPurlAccess().getUnorderedGroup_4(), 0);
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1293:6: ({...}? => ( (lv_together_9_0= 'tog' ) ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1293:7: {...}? => ( (lv_together_9_0= 'tog' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "rulePurl", "true");
            	    }
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1293:16: ( (lv_together_9_0= 'tog' ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1294:1: (lv_together_9_0= 'tog' )
            	    {
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1294:1: (lv_together_9_0= 'tog' )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1295:3: lv_together_9_0= 'tog'
            	    {
            	    lv_together_9_0=(Token)match(input,49,FOLLOW_49_in_rulePurl3185); if (state.failed) return current;
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
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1315:4: ({...}? => ( ({...}? => ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) ) ) ) )
            	    {
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1315:4: ({...}? => ( ({...}? => ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) ) ) ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1316:5: {...}? => ( ({...}? => ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPurlAccess().getUnorderedGroup_4(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "rulePurl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPurlAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1316:101: ( ({...}? => ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) ) ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1317:6: ({...}? => ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getPurlAccess().getUnorderedGroup_4(), 1);
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1320:6: ({...}? => ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1320:7: {...}? => ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "rulePurl", "true");
            	    }
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1320:16: ( ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1321:1: ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) )
            	    {
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1321:1: ( (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' ) )
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1322:1: (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' )
            	    {
            	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1322:1: (lv_throughTrailingLoop_10_1= 'tbl' | lv_throughTrailingLoop_10_2= 'ttl' )
            	    int alt54=2;
            	    int LA54_0 = input.LA(1);

            	    if ( (LA54_0==50) ) {
            	        alt54=1;
            	    }
            	    else if ( (LA54_0==51) ) {
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
            	            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1323:3: lv_throughTrailingLoop_10_1= 'tbl'
            	            {
            	            lv_throughTrailingLoop_10_1=(Token)match(input,50,FOLLOW_50_in_rulePurl3272); if (state.failed) return current;
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
            	            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1335:8: lv_throughTrailingLoop_10_2= 'ttl'
            	            {
            	            lv_throughTrailingLoop_10_2=(Token)match(input,51,FOLLOW_51_in_rulePurl3301); if (state.failed) return current;
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
            	    break loop55;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getPurlAccess().getUnorderedGroup_4());

            }

            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1364:2: (otherlv_11= 'with' ( (lv_yarnRef_12_0= RULE_ID ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==14) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1364:4: otherlv_11= 'with' ( (lv_yarnRef_12_0= RULE_ID ) )
                    {
                    otherlv_11=(Token)match(input,14,FOLLOW_14_in_rulePurl3370); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getPurlAccess().getWithKeyword_5_0());
                          
                    }
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1368:1: ( (lv_yarnRef_12_0= RULE_ID ) )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1369:1: (lv_yarnRef_12_0= RULE_ID )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1369:1: (lv_yarnRef_12_0= RULE_ID )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1370:3: lv_yarnRef_12_0= RULE_ID
                    {
                    lv_yarnRef_12_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePurl3387); if (state.failed) return current;
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

            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1386:4: ( (otherlv_13= 'to' )? ( (lv_repeat_14_0= ruleRepeatSpec ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_INT||LA58_0==52||(LA58_0>=72 && LA58_0<=73)) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1386:5: (otherlv_13= 'to' )? ( (lv_repeat_14_0= ruleRepeatSpec ) )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1386:5: (otherlv_13= 'to' )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==52) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1386:7: otherlv_13= 'to'
                            {
                            otherlv_13=(Token)match(input,52,FOLLOW_52_in_rulePurl3408); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_13, grammarAccess.getPurlAccess().getToKeyword_6_0());
                                  
                            }

                            }
                            break;

                    }

                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1390:3: ( (lv_repeat_14_0= ruleRepeatSpec ) )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1391:1: (lv_repeat_14_0= ruleRepeatSpec )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1391:1: (lv_repeat_14_0= ruleRepeatSpec )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1392:3: lv_repeat_14_0= ruleRepeatSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPurlAccess().getRepeatRepeatSpecParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRepeatSpec_in_rulePurl3431);
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
    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1416:1: entryRuleSlip returns [EObject current=null] : iv_ruleSlip= ruleSlip EOF ;
    public final EObject entryRuleSlip() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlip = null;


        try {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1417:2: (iv_ruleSlip= ruleSlip EOF )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1418:2: iv_ruleSlip= ruleSlip EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSlipRule()); 
            }
            pushFollow(FOLLOW_ruleSlip_in_entryRuleSlip3469);
            iv_ruleSlip=ruleSlip();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSlip; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSlip3479); if (state.failed) return current;

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
    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1425:1: ruleSlip returns [EObject current=null] : ( () ( ( (lv_reverse_1_1= 'Rev' | lv_reverse_1_2= 'Reverse' | lv_reverse_1_3= 'rev' | lv_reverse_1_4= 'reverse' ) ) )? (otherlv_2= 'Sl' | otherlv_3= 'sl' | otherlv_4= 'Slip' | otherlv_5= 'slip' ) ( ( ( (lv_number_6_0= RULE_INT ) ) (otherlv_7= 'st' | otherlv_8= 'sts' )? ) | otherlv_9= 'next st' )? ( ( ( (lv_knitwise_10_1= 'kw' | lv_knitwise_10_2= 'knitwise' ) ) ) | ( ( (lv_purlwise_11_1= 'pw' | lv_purlwise_11_2= 'purlwise' ) ) ) )? ( ( (lv_yarnPosition_12_1= 'wyif' | lv_yarnPosition_12_2= 'wyib' ) ) )? ) ;
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
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1428:28: ( ( () ( ( (lv_reverse_1_1= 'Rev' | lv_reverse_1_2= 'Reverse' | lv_reverse_1_3= 'rev' | lv_reverse_1_4= 'reverse' ) ) )? (otherlv_2= 'Sl' | otherlv_3= 'sl' | otherlv_4= 'Slip' | otherlv_5= 'slip' ) ( ( ( (lv_number_6_0= RULE_INT ) ) (otherlv_7= 'st' | otherlv_8= 'sts' )? ) | otherlv_9= 'next st' )? ( ( ( (lv_knitwise_10_1= 'kw' | lv_knitwise_10_2= 'knitwise' ) ) ) | ( ( (lv_purlwise_11_1= 'pw' | lv_purlwise_11_2= 'purlwise' ) ) ) )? ( ( (lv_yarnPosition_12_1= 'wyif' | lv_yarnPosition_12_2= 'wyib' ) ) )? ) )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1429:1: ( () ( ( (lv_reverse_1_1= 'Rev' | lv_reverse_1_2= 'Reverse' | lv_reverse_1_3= 'rev' | lv_reverse_1_4= 'reverse' ) ) )? (otherlv_2= 'Sl' | otherlv_3= 'sl' | otherlv_4= 'Slip' | otherlv_5= 'slip' ) ( ( ( (lv_number_6_0= RULE_INT ) ) (otherlv_7= 'st' | otherlv_8= 'sts' )? ) | otherlv_9= 'next st' )? ( ( ( (lv_knitwise_10_1= 'kw' | lv_knitwise_10_2= 'knitwise' ) ) ) | ( ( (lv_purlwise_11_1= 'pw' | lv_purlwise_11_2= 'purlwise' ) ) ) )? ( ( (lv_yarnPosition_12_1= 'wyif' | lv_yarnPosition_12_2= 'wyib' ) ) )? )
            {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1429:1: ( () ( ( (lv_reverse_1_1= 'Rev' | lv_reverse_1_2= 'Reverse' | lv_reverse_1_3= 'rev' | lv_reverse_1_4= 'reverse' ) ) )? (otherlv_2= 'Sl' | otherlv_3= 'sl' | otherlv_4= 'Slip' | otherlv_5= 'slip' ) ( ( ( (lv_number_6_0= RULE_INT ) ) (otherlv_7= 'st' | otherlv_8= 'sts' )? ) | otherlv_9= 'next st' )? ( ( ( (lv_knitwise_10_1= 'kw' | lv_knitwise_10_2= 'knitwise' ) ) ) | ( ( (lv_purlwise_11_1= 'pw' | lv_purlwise_11_2= 'purlwise' ) ) ) )? ( ( (lv_yarnPosition_12_1= 'wyif' | lv_yarnPosition_12_2= 'wyib' ) ) )? )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1429:2: () ( ( (lv_reverse_1_1= 'Rev' | lv_reverse_1_2= 'Reverse' | lv_reverse_1_3= 'rev' | lv_reverse_1_4= 'reverse' ) ) )? (otherlv_2= 'Sl' | otherlv_3= 'sl' | otherlv_4= 'Slip' | otherlv_5= 'slip' ) ( ( ( (lv_number_6_0= RULE_INT ) ) (otherlv_7= 'st' | otherlv_8= 'sts' )? ) | otherlv_9= 'next st' )? ( ( ( (lv_knitwise_10_1= 'kw' | lv_knitwise_10_2= 'knitwise' ) ) ) | ( ( (lv_purlwise_11_1= 'pw' | lv_purlwise_11_2= 'purlwise' ) ) ) )? ( ( (lv_yarnPosition_12_1= 'wyif' | lv_yarnPosition_12_2= 'wyib' ) ) )?
            {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1429:2: ()
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1430:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSlipAccess().getSlipAction_0(),
                          current);
                  
            }

            }

            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1435:2: ( ( (lv_reverse_1_1= 'Rev' | lv_reverse_1_2= 'Reverse' | lv_reverse_1_3= 'rev' | lv_reverse_1_4= 'reverse' ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( ((LA60_0>=57 && LA60_0<=60)) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1436:1: ( (lv_reverse_1_1= 'Rev' | lv_reverse_1_2= 'Reverse' | lv_reverse_1_3= 'rev' | lv_reverse_1_4= 'reverse' ) )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1436:1: ( (lv_reverse_1_1= 'Rev' | lv_reverse_1_2= 'Reverse' | lv_reverse_1_3= 'rev' | lv_reverse_1_4= 'reverse' ) )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1437:1: (lv_reverse_1_1= 'Rev' | lv_reverse_1_2= 'Reverse' | lv_reverse_1_3= 'rev' | lv_reverse_1_4= 'reverse' )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1437:1: (lv_reverse_1_1= 'Rev' | lv_reverse_1_2= 'Reverse' | lv_reverse_1_3= 'rev' | lv_reverse_1_4= 'reverse' )
                    int alt59=4;
                    switch ( input.LA(1) ) {
                    case 57:
                        {
                        alt59=1;
                        }
                        break;
                    case 58:
                        {
                        alt59=2;
                        }
                        break;
                    case 59:
                        {
                        alt59=3;
                        }
                        break;
                    case 60:
                        {
                        alt59=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 59, 0, input);

                        throw nvae;
                    }

                    switch (alt59) {
                        case 1 :
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1438:3: lv_reverse_1_1= 'Rev'
                            {
                            lv_reverse_1_1=(Token)match(input,57,FOLLOW_57_in_ruleSlip3533); if (state.failed) return current;
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
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1450:8: lv_reverse_1_2= 'Reverse'
                            {
                            lv_reverse_1_2=(Token)match(input,58,FOLLOW_58_in_ruleSlip3562); if (state.failed) return current;
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
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1462:8: lv_reverse_1_3= 'rev'
                            {
                            lv_reverse_1_3=(Token)match(input,59,FOLLOW_59_in_ruleSlip3591); if (state.failed) return current;
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
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1474:8: lv_reverse_1_4= 'reverse'
                            {
                            lv_reverse_1_4=(Token)match(input,60,FOLLOW_60_in_ruleSlip3620); if (state.failed) return current;
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

            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1489:3: (otherlv_2= 'Sl' | otherlv_3= 'sl' | otherlv_4= 'Slip' | otherlv_5= 'slip' )
            int alt61=4;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt61=1;
                }
                break;
            case 62:
                {
                alt61=2;
                }
                break;
            case 63:
                {
                alt61=3;
                }
                break;
            case 64:
                {
                alt61=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1489:5: otherlv_2= 'Sl'
                    {
                    otherlv_2=(Token)match(input,61,FOLLOW_61_in_ruleSlip3650); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getSlipAccess().getSlKeyword_2_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1494:7: otherlv_3= 'sl'
                    {
                    otherlv_3=(Token)match(input,62,FOLLOW_62_in_ruleSlip3668); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getSlipAccess().getSlKeyword_2_1());
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1499:7: otherlv_4= 'Slip'
                    {
                    otherlv_4=(Token)match(input,63,FOLLOW_63_in_ruleSlip3686); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getSlipAccess().getSlipKeyword_2_2());
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1504:7: otherlv_5= 'slip'
                    {
                    otherlv_5=(Token)match(input,64,FOLLOW_64_in_ruleSlip3704); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getSlipAccess().getSlipKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1508:2: ( ( ( (lv_number_6_0= RULE_INT ) ) (otherlv_7= 'st' | otherlv_8= 'sts' )? ) | otherlv_9= 'next st' )?
            int alt63=3;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_INT) ) {
                alt63=1;
            }
            else if ( (LA63_0==65) ) {
                alt63=2;
            }
            switch (alt63) {
                case 1 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1508:3: ( ( (lv_number_6_0= RULE_INT ) ) (otherlv_7= 'st' | otherlv_8= 'sts' )? )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1508:3: ( ( (lv_number_6_0= RULE_INT ) ) (otherlv_7= 'st' | otherlv_8= 'sts' )? )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1508:4: ( (lv_number_6_0= RULE_INT ) ) (otherlv_7= 'st' | otherlv_8= 'sts' )?
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1508:4: ( (lv_number_6_0= RULE_INT ) )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1509:1: (lv_number_6_0= RULE_INT )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1509:1: (lv_number_6_0= RULE_INT )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1510:3: lv_number_6_0= RULE_INT
                    {
                    lv_number_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSlip3724); if (state.failed) return current;
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

                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1526:2: (otherlv_7= 'st' | otherlv_8= 'sts' )?
                    int alt62=3;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==47) ) {
                        alt62=1;
                    }
                    else if ( (LA62_0==48) ) {
                        alt62=2;
                    }
                    switch (alt62) {
                        case 1 :
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1526:4: otherlv_7= 'st'
                            {
                            otherlv_7=(Token)match(input,47,FOLLOW_47_in_ruleSlip3742); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_7, grammarAccess.getSlipAccess().getStKeyword_3_0_1_0());
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1531:7: otherlv_8= 'sts'
                            {
                            otherlv_8=(Token)match(input,48,FOLLOW_48_in_ruleSlip3760); if (state.failed) return current;
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
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1536:7: otherlv_9= 'next st'
                    {
                    otherlv_9=(Token)match(input,65,FOLLOW_65_in_ruleSlip3781); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getSlipAccess().getNextStKeyword_3_1());
                          
                    }

                    }
                    break;

            }

            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1540:3: ( ( ( (lv_knitwise_10_1= 'kw' | lv_knitwise_10_2= 'knitwise' ) ) ) | ( ( (lv_purlwise_11_1= 'pw' | lv_purlwise_11_2= 'purlwise' ) ) ) )?
            int alt66=3;
            int LA66_0 = input.LA(1);

            if ( ((LA66_0>=66 && LA66_0<=67)) ) {
                alt66=1;
            }
            else if ( ((LA66_0>=68 && LA66_0<=69)) ) {
                alt66=2;
            }
            switch (alt66) {
                case 1 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1540:4: ( ( (lv_knitwise_10_1= 'kw' | lv_knitwise_10_2= 'knitwise' ) ) )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1540:4: ( ( (lv_knitwise_10_1= 'kw' | lv_knitwise_10_2= 'knitwise' ) ) )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1541:1: ( (lv_knitwise_10_1= 'kw' | lv_knitwise_10_2= 'knitwise' ) )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1541:1: ( (lv_knitwise_10_1= 'kw' | lv_knitwise_10_2= 'knitwise' ) )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1542:1: (lv_knitwise_10_1= 'kw' | lv_knitwise_10_2= 'knitwise' )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1542:1: (lv_knitwise_10_1= 'kw' | lv_knitwise_10_2= 'knitwise' )
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==66) ) {
                        alt64=1;
                    }
                    else if ( (LA64_0==67) ) {
                        alt64=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 64, 0, input);

                        throw nvae;
                    }
                    switch (alt64) {
                        case 1 :
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1543:3: lv_knitwise_10_1= 'kw'
                            {
                            lv_knitwise_10_1=(Token)match(input,66,FOLLOW_66_in_ruleSlip3804); if (state.failed) return current;
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
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1555:8: lv_knitwise_10_2= 'knitwise'
                            {
                            lv_knitwise_10_2=(Token)match(input,67,FOLLOW_67_in_ruleSlip3833); if (state.failed) return current;
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
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1571:6: ( ( (lv_purlwise_11_1= 'pw' | lv_purlwise_11_2= 'purlwise' ) ) )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1571:6: ( ( (lv_purlwise_11_1= 'pw' | lv_purlwise_11_2= 'purlwise' ) ) )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1572:1: ( (lv_purlwise_11_1= 'pw' | lv_purlwise_11_2= 'purlwise' ) )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1572:1: ( (lv_purlwise_11_1= 'pw' | lv_purlwise_11_2= 'purlwise' ) )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1573:1: (lv_purlwise_11_1= 'pw' | lv_purlwise_11_2= 'purlwise' )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1573:1: (lv_purlwise_11_1= 'pw' | lv_purlwise_11_2= 'purlwise' )
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==68) ) {
                        alt65=1;
                    }
                    else if ( (LA65_0==69) ) {
                        alt65=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 65, 0, input);

                        throw nvae;
                    }
                    switch (alt65) {
                        case 1 :
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1574:3: lv_purlwise_11_1= 'pw'
                            {
                            lv_purlwise_11_1=(Token)match(input,68,FOLLOW_68_in_ruleSlip3875); if (state.failed) return current;
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
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1586:8: lv_purlwise_11_2= 'purlwise'
                            {
                            lv_purlwise_11_2=(Token)match(input,69,FOLLOW_69_in_ruleSlip3904); if (state.failed) return current;
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

            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1601:4: ( ( (lv_yarnPosition_12_1= 'wyif' | lv_yarnPosition_12_2= 'wyib' ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( ((LA68_0>=70 && LA68_0<=71)) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1602:1: ( (lv_yarnPosition_12_1= 'wyif' | lv_yarnPosition_12_2= 'wyib' ) )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1602:1: ( (lv_yarnPosition_12_1= 'wyif' | lv_yarnPosition_12_2= 'wyib' ) )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1603:1: (lv_yarnPosition_12_1= 'wyif' | lv_yarnPosition_12_2= 'wyib' )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1603:1: (lv_yarnPosition_12_1= 'wyif' | lv_yarnPosition_12_2= 'wyib' )
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==70) ) {
                        alt67=1;
                    }
                    else if ( (LA67_0==71) ) {
                        alt67=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 67, 0, input);

                        throw nvae;
                    }
                    switch (alt67) {
                        case 1 :
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1604:3: lv_yarnPosition_12_1= 'wyif'
                            {
                            lv_yarnPosition_12_1=(Token)match(input,70,FOLLOW_70_in_ruleSlip3942); if (state.failed) return current;
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
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1616:8: lv_yarnPosition_12_2= 'wyib'
                            {
                            lv_yarnPosition_12_2=(Token)match(input,71,FOLLOW_71_in_ruleSlip3971); if (state.failed) return current;
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
    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1639:1: entryRuleRepeatSpec returns [EObject current=null] : iv_ruleRepeatSpec= ruleRepeatSpec EOF ;
    public final EObject entryRuleRepeatSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepeatSpec = null;


        try {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1640:2: (iv_ruleRepeatSpec= ruleRepeatSpec EOF )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1641:2: iv_ruleRepeatSpec= ruleRepeatSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRepeatSpecRule()); 
            }
            pushFollow(FOLLOW_ruleRepeatSpec_in_entryRuleRepeatSpec4024);
            iv_ruleRepeatSpec=ruleRepeatSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRepeatSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRepeatSpec4034); if (state.failed) return current;

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
    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1648:1: ruleRepeatSpec returns [EObject current=null] : ( ( (lv_toEnd_0_0= 'end' ) ) | ( (lv_toMarker_1_0= 'marker' ) ) | ( ( (lv_value_2_0= RULE_INT ) ) (otherlv_3= 'st' | otherlv_4= 'sts' )? ( (lv_beforeEnd_5_0= 'before end' ) ) ) | ( ( (lv_value_6_0= RULE_INT ) ) (otherlv_7= 'st' | otherlv_8= 'sts' )? ( (lv_beforeGap_9_0= 'before gap' ) ) ) | ( ( (lv_value_10_0= RULE_INT ) ) (otherlv_11= 'st' | otherlv_12= 'sts' )? ( (lv_beforeMarker_13_0= 'before marker' ) ) ) | ( ( (lv_value_14_0= RULE_INT ) ) ( (lv_times_15_0= 'times' ) ) ) ) ;
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
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1651:28: ( ( ( (lv_toEnd_0_0= 'end' ) ) | ( (lv_toMarker_1_0= 'marker' ) ) | ( ( (lv_value_2_0= RULE_INT ) ) (otherlv_3= 'st' | otherlv_4= 'sts' )? ( (lv_beforeEnd_5_0= 'before end' ) ) ) | ( ( (lv_value_6_0= RULE_INT ) ) (otherlv_7= 'st' | otherlv_8= 'sts' )? ( (lv_beforeGap_9_0= 'before gap' ) ) ) | ( ( (lv_value_10_0= RULE_INT ) ) (otherlv_11= 'st' | otherlv_12= 'sts' )? ( (lv_beforeMarker_13_0= 'before marker' ) ) ) | ( ( (lv_value_14_0= RULE_INT ) ) ( (lv_times_15_0= 'times' ) ) ) ) )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1652:1: ( ( (lv_toEnd_0_0= 'end' ) ) | ( (lv_toMarker_1_0= 'marker' ) ) | ( ( (lv_value_2_0= RULE_INT ) ) (otherlv_3= 'st' | otherlv_4= 'sts' )? ( (lv_beforeEnd_5_0= 'before end' ) ) ) | ( ( (lv_value_6_0= RULE_INT ) ) (otherlv_7= 'st' | otherlv_8= 'sts' )? ( (lv_beforeGap_9_0= 'before gap' ) ) ) | ( ( (lv_value_10_0= RULE_INT ) ) (otherlv_11= 'st' | otherlv_12= 'sts' )? ( (lv_beforeMarker_13_0= 'before marker' ) ) ) | ( ( (lv_value_14_0= RULE_INT ) ) ( (lv_times_15_0= 'times' ) ) ) )
            {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1652:1: ( ( (lv_toEnd_0_0= 'end' ) ) | ( (lv_toMarker_1_0= 'marker' ) ) | ( ( (lv_value_2_0= RULE_INT ) ) (otherlv_3= 'st' | otherlv_4= 'sts' )? ( (lv_beforeEnd_5_0= 'before end' ) ) ) | ( ( (lv_value_6_0= RULE_INT ) ) (otherlv_7= 'st' | otherlv_8= 'sts' )? ( (lv_beforeGap_9_0= 'before gap' ) ) ) | ( ( (lv_value_10_0= RULE_INT ) ) (otherlv_11= 'st' | otherlv_12= 'sts' )? ( (lv_beforeMarker_13_0= 'before marker' ) ) ) | ( ( (lv_value_14_0= RULE_INT ) ) ( (lv_times_15_0= 'times' ) ) ) )
            int alt72=6;
            alt72 = dfa72.predict(input);
            switch (alt72) {
                case 1 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1652:2: ( (lv_toEnd_0_0= 'end' ) )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1652:2: ( (lv_toEnd_0_0= 'end' ) )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1653:1: (lv_toEnd_0_0= 'end' )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1653:1: (lv_toEnd_0_0= 'end' )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1654:3: lv_toEnd_0_0= 'end'
                    {
                    lv_toEnd_0_0=(Token)match(input,72,FOLLOW_72_in_ruleRepeatSpec4077); if (state.failed) return current;
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
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1668:6: ( (lv_toMarker_1_0= 'marker' ) )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1668:6: ( (lv_toMarker_1_0= 'marker' ) )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1669:1: (lv_toMarker_1_0= 'marker' )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1669:1: (lv_toMarker_1_0= 'marker' )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1670:3: lv_toMarker_1_0= 'marker'
                    {
                    lv_toMarker_1_0=(Token)match(input,73,FOLLOW_73_in_ruleRepeatSpec4114); if (state.failed) return current;
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
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1684:6: ( ( (lv_value_2_0= RULE_INT ) ) (otherlv_3= 'st' | otherlv_4= 'sts' )? ( (lv_beforeEnd_5_0= 'before end' ) ) )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1684:6: ( ( (lv_value_2_0= RULE_INT ) ) (otherlv_3= 'st' | otherlv_4= 'sts' )? ( (lv_beforeEnd_5_0= 'before end' ) ) )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1684:7: ( (lv_value_2_0= RULE_INT ) ) (otherlv_3= 'st' | otherlv_4= 'sts' )? ( (lv_beforeEnd_5_0= 'before end' ) )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1684:7: ( (lv_value_2_0= RULE_INT ) )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1685:1: (lv_value_2_0= RULE_INT )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1685:1: (lv_value_2_0= RULE_INT )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1686:3: lv_value_2_0= RULE_INT
                    {
                    lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRepeatSpec4151); if (state.failed) return current;
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

                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1702:2: (otherlv_3= 'st' | otherlv_4= 'sts' )?
                    int alt69=3;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==47) ) {
                        alt69=1;
                    }
                    else if ( (LA69_0==48) ) {
                        alt69=2;
                    }
                    switch (alt69) {
                        case 1 :
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1702:4: otherlv_3= 'st'
                            {
                            otherlv_3=(Token)match(input,47,FOLLOW_47_in_ruleRepeatSpec4169); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getRepeatSpecAccess().getStKeyword_2_1_0());
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1707:7: otherlv_4= 'sts'
                            {
                            otherlv_4=(Token)match(input,48,FOLLOW_48_in_ruleRepeatSpec4187); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getRepeatSpecAccess().getStsKeyword_2_1_1());
                                  
                            }

                            }
                            break;

                    }

                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1711:3: ( (lv_beforeEnd_5_0= 'before end' ) )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1712:1: (lv_beforeEnd_5_0= 'before end' )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1712:1: (lv_beforeEnd_5_0= 'before end' )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1713:3: lv_beforeEnd_5_0= 'before end'
                    {
                    lv_beforeEnd_5_0=(Token)match(input,74,FOLLOW_74_in_ruleRepeatSpec4207); if (state.failed) return current;
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
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1727:6: ( ( (lv_value_6_0= RULE_INT ) ) (otherlv_7= 'st' | otherlv_8= 'sts' )? ( (lv_beforeGap_9_0= 'before gap' ) ) )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1727:6: ( ( (lv_value_6_0= RULE_INT ) ) (otherlv_7= 'st' | otherlv_8= 'sts' )? ( (lv_beforeGap_9_0= 'before gap' ) ) )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1727:7: ( (lv_value_6_0= RULE_INT ) ) (otherlv_7= 'st' | otherlv_8= 'sts' )? ( (lv_beforeGap_9_0= 'before gap' ) )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1727:7: ( (lv_value_6_0= RULE_INT ) )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1728:1: (lv_value_6_0= RULE_INT )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1728:1: (lv_value_6_0= RULE_INT )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1729:3: lv_value_6_0= RULE_INT
                    {
                    lv_value_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRepeatSpec4245); if (state.failed) return current;
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

                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1745:2: (otherlv_7= 'st' | otherlv_8= 'sts' )?
                    int alt70=3;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==47) ) {
                        alt70=1;
                    }
                    else if ( (LA70_0==48) ) {
                        alt70=2;
                    }
                    switch (alt70) {
                        case 1 :
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1745:4: otherlv_7= 'st'
                            {
                            otherlv_7=(Token)match(input,47,FOLLOW_47_in_ruleRepeatSpec4263); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_7, grammarAccess.getRepeatSpecAccess().getStKeyword_3_1_0());
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1750:7: otherlv_8= 'sts'
                            {
                            otherlv_8=(Token)match(input,48,FOLLOW_48_in_ruleRepeatSpec4281); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_8, grammarAccess.getRepeatSpecAccess().getStsKeyword_3_1_1());
                                  
                            }

                            }
                            break;

                    }

                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1754:3: ( (lv_beforeGap_9_0= 'before gap' ) )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1755:1: (lv_beforeGap_9_0= 'before gap' )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1755:1: (lv_beforeGap_9_0= 'before gap' )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1756:3: lv_beforeGap_9_0= 'before gap'
                    {
                    lv_beforeGap_9_0=(Token)match(input,75,FOLLOW_75_in_ruleRepeatSpec4301); if (state.failed) return current;
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
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1770:6: ( ( (lv_value_10_0= RULE_INT ) ) (otherlv_11= 'st' | otherlv_12= 'sts' )? ( (lv_beforeMarker_13_0= 'before marker' ) ) )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1770:6: ( ( (lv_value_10_0= RULE_INT ) ) (otherlv_11= 'st' | otherlv_12= 'sts' )? ( (lv_beforeMarker_13_0= 'before marker' ) ) )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1770:7: ( (lv_value_10_0= RULE_INT ) ) (otherlv_11= 'st' | otherlv_12= 'sts' )? ( (lv_beforeMarker_13_0= 'before marker' ) )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1770:7: ( (lv_value_10_0= RULE_INT ) )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1771:1: (lv_value_10_0= RULE_INT )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1771:1: (lv_value_10_0= RULE_INT )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1772:3: lv_value_10_0= RULE_INT
                    {
                    lv_value_10_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRepeatSpec4339); if (state.failed) return current;
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

                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1788:2: (otherlv_11= 'st' | otherlv_12= 'sts' )?
                    int alt71=3;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==47) ) {
                        alt71=1;
                    }
                    else if ( (LA71_0==48) ) {
                        alt71=2;
                    }
                    switch (alt71) {
                        case 1 :
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1788:4: otherlv_11= 'st'
                            {
                            otherlv_11=(Token)match(input,47,FOLLOW_47_in_ruleRepeatSpec4357); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_11, grammarAccess.getRepeatSpecAccess().getStKeyword_4_1_0());
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1793:7: otherlv_12= 'sts'
                            {
                            otherlv_12=(Token)match(input,48,FOLLOW_48_in_ruleRepeatSpec4375); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_12, grammarAccess.getRepeatSpecAccess().getStsKeyword_4_1_1());
                                  
                            }

                            }
                            break;

                    }

                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1797:3: ( (lv_beforeMarker_13_0= 'before marker' ) )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1798:1: (lv_beforeMarker_13_0= 'before marker' )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1798:1: (lv_beforeMarker_13_0= 'before marker' )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1799:3: lv_beforeMarker_13_0= 'before marker'
                    {
                    lv_beforeMarker_13_0=(Token)match(input,76,FOLLOW_76_in_ruleRepeatSpec4395); if (state.failed) return current;
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
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1813:6: ( ( (lv_value_14_0= RULE_INT ) ) ( (lv_times_15_0= 'times' ) ) )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1813:6: ( ( (lv_value_14_0= RULE_INT ) ) ( (lv_times_15_0= 'times' ) ) )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1813:7: ( (lv_value_14_0= RULE_INT ) ) ( (lv_times_15_0= 'times' ) )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1813:7: ( (lv_value_14_0= RULE_INT ) )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1814:1: (lv_value_14_0= RULE_INT )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1814:1: (lv_value_14_0= RULE_INT )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1815:3: lv_value_14_0= RULE_INT
                    {
                    lv_value_14_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRepeatSpec4433); if (state.failed) return current;
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

                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1831:2: ( (lv_times_15_0= 'times' ) )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1832:1: (lv_times_15_0= 'times' )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1832:1: (lv_times_15_0= 'times' )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1833:3: lv_times_15_0= 'times'
                    {
                    lv_times_15_0=(Token)match(input,77,FOLLOW_77_in_ruleRepeatSpec4456); if (state.failed) return current;
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
    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1854:1: entryRuleRepeat returns [EObject current=null] : iv_ruleRepeat= ruleRepeat EOF ;
    public final EObject entryRuleRepeat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepeat = null;


        try {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1855:2: (iv_ruleRepeat= ruleRepeat EOF )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1856:2: iv_ruleRepeat= ruleRepeat EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRepeatRule()); 
            }
            pushFollow(FOLLOW_ruleRepeat_in_entryRuleRepeat4506);
            iv_ruleRepeat=ruleRepeat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRepeat; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRepeat4516); if (state.failed) return current;

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
    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1863:1: ruleRepeat returns [EObject current=null] : ( ( (otherlv_0= 'Repeat' | otherlv_1= 'repeat' ) otherlv_2= '[' ( (lv_operations_3_0= ruleInlineOperation ) ) (otherlv_4= ',' ( (lv_operations_5_0= ruleInlineOperation ) ) )* otherlv_6= ']' (otherlv_7= 'to' )? ( (lv_spec_8_0= ruleRepeatSpec ) ) ) | (otherlv_9= '[' ( (lv_operations_10_0= ruleInlineOperation ) ) (otherlv_11= ',' ( (lv_operations_12_0= ruleInlineOperation ) ) )* otherlv_13= ']' (otherlv_14= ',' (otherlv_15= 'Repeat' | otherlv_16= 'repeat' ) )? (otherlv_17= 'to' )? ( (lv_spec_18_0= ruleRepeatSpec ) ) ) ) ;
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
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1866:28: ( ( ( (otherlv_0= 'Repeat' | otherlv_1= 'repeat' ) otherlv_2= '[' ( (lv_operations_3_0= ruleInlineOperation ) ) (otherlv_4= ',' ( (lv_operations_5_0= ruleInlineOperation ) ) )* otherlv_6= ']' (otherlv_7= 'to' )? ( (lv_spec_8_0= ruleRepeatSpec ) ) ) | (otherlv_9= '[' ( (lv_operations_10_0= ruleInlineOperation ) ) (otherlv_11= ',' ( (lv_operations_12_0= ruleInlineOperation ) ) )* otherlv_13= ']' (otherlv_14= ',' (otherlv_15= 'Repeat' | otherlv_16= 'repeat' ) )? (otherlv_17= 'to' )? ( (lv_spec_18_0= ruleRepeatSpec ) ) ) ) )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1867:1: ( ( (otherlv_0= 'Repeat' | otherlv_1= 'repeat' ) otherlv_2= '[' ( (lv_operations_3_0= ruleInlineOperation ) ) (otherlv_4= ',' ( (lv_operations_5_0= ruleInlineOperation ) ) )* otherlv_6= ']' (otherlv_7= 'to' )? ( (lv_spec_8_0= ruleRepeatSpec ) ) ) | (otherlv_9= '[' ( (lv_operations_10_0= ruleInlineOperation ) ) (otherlv_11= ',' ( (lv_operations_12_0= ruleInlineOperation ) ) )* otherlv_13= ']' (otherlv_14= ',' (otherlv_15= 'Repeat' | otherlv_16= 'repeat' ) )? (otherlv_17= 'to' )? ( (lv_spec_18_0= ruleRepeatSpec ) ) ) )
            {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1867:1: ( ( (otherlv_0= 'Repeat' | otherlv_1= 'repeat' ) otherlv_2= '[' ( (lv_operations_3_0= ruleInlineOperation ) ) (otherlv_4= ',' ( (lv_operations_5_0= ruleInlineOperation ) ) )* otherlv_6= ']' (otherlv_7= 'to' )? ( (lv_spec_8_0= ruleRepeatSpec ) ) ) | (otherlv_9= '[' ( (lv_operations_10_0= ruleInlineOperation ) ) (otherlv_11= ',' ( (lv_operations_12_0= ruleInlineOperation ) ) )* otherlv_13= ']' (otherlv_14= ',' (otherlv_15= 'Repeat' | otherlv_16= 'repeat' ) )? (otherlv_17= 'to' )? ( (lv_spec_18_0= ruleRepeatSpec ) ) ) )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( ((LA80_0>=78 && LA80_0<=79)) ) {
                alt80=1;
            }
            else if ( (LA80_0==80) ) {
                alt80=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }
            switch (alt80) {
                case 1 :
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1867:2: ( (otherlv_0= 'Repeat' | otherlv_1= 'repeat' ) otherlv_2= '[' ( (lv_operations_3_0= ruleInlineOperation ) ) (otherlv_4= ',' ( (lv_operations_5_0= ruleInlineOperation ) ) )* otherlv_6= ']' (otherlv_7= 'to' )? ( (lv_spec_8_0= ruleRepeatSpec ) ) )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1867:2: ( (otherlv_0= 'Repeat' | otherlv_1= 'repeat' ) otherlv_2= '[' ( (lv_operations_3_0= ruleInlineOperation ) ) (otherlv_4= ',' ( (lv_operations_5_0= ruleInlineOperation ) ) )* otherlv_6= ']' (otherlv_7= 'to' )? ( (lv_spec_8_0= ruleRepeatSpec ) ) )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1867:3: (otherlv_0= 'Repeat' | otherlv_1= 'repeat' ) otherlv_2= '[' ( (lv_operations_3_0= ruleInlineOperation ) ) (otherlv_4= ',' ( (lv_operations_5_0= ruleInlineOperation ) ) )* otherlv_6= ']' (otherlv_7= 'to' )? ( (lv_spec_8_0= ruleRepeatSpec ) )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1867:3: (otherlv_0= 'Repeat' | otherlv_1= 'repeat' )
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==78) ) {
                        alt73=1;
                    }
                    else if ( (LA73_0==79) ) {
                        alt73=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 73, 0, input);

                        throw nvae;
                    }
                    switch (alt73) {
                        case 1 :
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1867:5: otherlv_0= 'Repeat'
                            {
                            otherlv_0=(Token)match(input,78,FOLLOW_78_in_ruleRepeat4555); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_0, grammarAccess.getRepeatAccess().getRepeatKeyword_0_0_0());
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1872:7: otherlv_1= 'repeat'
                            {
                            otherlv_1=(Token)match(input,79,FOLLOW_79_in_ruleRepeat4573); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_1, grammarAccess.getRepeatAccess().getRepeatKeyword_0_0_1());
                                  
                            }

                            }
                            break;

                    }

                    otherlv_2=(Token)match(input,80,FOLLOW_80_in_ruleRepeat4586); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getRepeatAccess().getLeftSquareBracketKeyword_0_1());
                          
                    }
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1880:1: ( (lv_operations_3_0= ruleInlineOperation ) )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1881:1: (lv_operations_3_0= ruleInlineOperation )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1881:1: (lv_operations_3_0= ruleInlineOperation )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1882:3: lv_operations_3_0= ruleInlineOperation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRepeatAccess().getOperationsInlineOperationParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInlineOperation_in_ruleRepeat4607);
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

                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1898:2: (otherlv_4= ',' ( (lv_operations_5_0= ruleInlineOperation ) ) )*
                    loop74:
                    do {
                        int alt74=2;
                        int LA74_0 = input.LA(1);

                        if ( (LA74_0==16) ) {
                            alt74=1;
                        }


                        switch (alt74) {
                    	case 1 :
                    	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1898:4: otherlv_4= ',' ( (lv_operations_5_0= ruleInlineOperation ) )
                    	    {
                    	    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleRepeat4620); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getRepeatAccess().getCommaKeyword_0_3_0());
                    	          
                    	    }
                    	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1902:1: ( (lv_operations_5_0= ruleInlineOperation ) )
                    	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1903:1: (lv_operations_5_0= ruleInlineOperation )
                    	    {
                    	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1903:1: (lv_operations_5_0= ruleInlineOperation )
                    	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1904:3: lv_operations_5_0= ruleInlineOperation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getRepeatAccess().getOperationsInlineOperationParserRuleCall_0_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleInlineOperation_in_ruleRepeat4641);
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
                    	    break loop74;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,81,FOLLOW_81_in_ruleRepeat4655); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getRepeatAccess().getRightSquareBracketKeyword_0_4());
                          
                    }
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1924:1: (otherlv_7= 'to' )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==52) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1924:3: otherlv_7= 'to'
                            {
                            otherlv_7=(Token)match(input,52,FOLLOW_52_in_ruleRepeat4668); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_7, grammarAccess.getRepeatAccess().getToKeyword_0_5());
                                  
                            }

                            }
                            break;

                    }

                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1928:3: ( (lv_spec_8_0= ruleRepeatSpec ) )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1929:1: (lv_spec_8_0= ruleRepeatSpec )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1929:1: (lv_spec_8_0= ruleRepeatSpec )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1930:3: lv_spec_8_0= ruleRepeatSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRepeatAccess().getSpecRepeatSpecParserRuleCall_0_6_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRepeatSpec_in_ruleRepeat4691);
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
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1947:6: (otherlv_9= '[' ( (lv_operations_10_0= ruleInlineOperation ) ) (otherlv_11= ',' ( (lv_operations_12_0= ruleInlineOperation ) ) )* otherlv_13= ']' (otherlv_14= ',' (otherlv_15= 'Repeat' | otherlv_16= 'repeat' ) )? (otherlv_17= 'to' )? ( (lv_spec_18_0= ruleRepeatSpec ) ) )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1947:6: (otherlv_9= '[' ( (lv_operations_10_0= ruleInlineOperation ) ) (otherlv_11= ',' ( (lv_operations_12_0= ruleInlineOperation ) ) )* otherlv_13= ']' (otherlv_14= ',' (otherlv_15= 'Repeat' | otherlv_16= 'repeat' ) )? (otherlv_17= 'to' )? ( (lv_spec_18_0= ruleRepeatSpec ) ) )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1947:8: otherlv_9= '[' ( (lv_operations_10_0= ruleInlineOperation ) ) (otherlv_11= ',' ( (lv_operations_12_0= ruleInlineOperation ) ) )* otherlv_13= ']' (otherlv_14= ',' (otherlv_15= 'Repeat' | otherlv_16= 'repeat' ) )? (otherlv_17= 'to' )? ( (lv_spec_18_0= ruleRepeatSpec ) )
                    {
                    otherlv_9=(Token)match(input,80,FOLLOW_80_in_ruleRepeat4711); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getRepeatAccess().getLeftSquareBracketKeyword_1_0());
                          
                    }
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1951:1: ( (lv_operations_10_0= ruleInlineOperation ) )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1952:1: (lv_operations_10_0= ruleInlineOperation )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1952:1: (lv_operations_10_0= ruleInlineOperation )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1953:3: lv_operations_10_0= ruleInlineOperation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRepeatAccess().getOperationsInlineOperationParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInlineOperation_in_ruleRepeat4732);
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

                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1969:2: (otherlv_11= ',' ( (lv_operations_12_0= ruleInlineOperation ) ) )*
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( (LA76_0==16) ) {
                            alt76=1;
                        }


                        switch (alt76) {
                    	case 1 :
                    	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1969:4: otherlv_11= ',' ( (lv_operations_12_0= ruleInlineOperation ) )
                    	    {
                    	    otherlv_11=(Token)match(input,16,FOLLOW_16_in_ruleRepeat4745); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_11, grammarAccess.getRepeatAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1973:1: ( (lv_operations_12_0= ruleInlineOperation ) )
                    	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1974:1: (lv_operations_12_0= ruleInlineOperation )
                    	    {
                    	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1974:1: (lv_operations_12_0= ruleInlineOperation )
                    	    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1975:3: lv_operations_12_0= ruleInlineOperation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getRepeatAccess().getOperationsInlineOperationParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleInlineOperation_in_ruleRepeat4766);
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
                    	    break loop76;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,81,FOLLOW_81_in_ruleRepeat4780); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getRepeatAccess().getRightSquareBracketKeyword_1_3());
                          
                    }
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1995:1: (otherlv_14= ',' (otherlv_15= 'Repeat' | otherlv_16= 'repeat' ) )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==16) ) {
                        alt78=1;
                    }
                    switch (alt78) {
                        case 1 :
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1995:3: otherlv_14= ',' (otherlv_15= 'Repeat' | otherlv_16= 'repeat' )
                            {
                            otherlv_14=(Token)match(input,16,FOLLOW_16_in_ruleRepeat4793); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_14, grammarAccess.getRepeatAccess().getCommaKeyword_1_4_0());
                                  
                            }
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1999:1: (otherlv_15= 'Repeat' | otherlv_16= 'repeat' )
                            int alt77=2;
                            int LA77_0 = input.LA(1);

                            if ( (LA77_0==78) ) {
                                alt77=1;
                            }
                            else if ( (LA77_0==79) ) {
                                alt77=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 77, 0, input);

                                throw nvae;
                            }
                            switch (alt77) {
                                case 1 :
                                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:1999:3: otherlv_15= 'Repeat'
                                    {
                                    otherlv_15=(Token)match(input,78,FOLLOW_78_in_ruleRepeat4806); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_15, grammarAccess.getRepeatAccess().getRepeatKeyword_1_4_1_0());
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:2004:7: otherlv_16= 'repeat'
                                    {
                                    otherlv_16=(Token)match(input,79,FOLLOW_79_in_ruleRepeat4824); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_16, grammarAccess.getRepeatAccess().getRepeatKeyword_1_4_1_1());
                                          
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:2008:4: (otherlv_17= 'to' )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==52) ) {
                        alt79=1;
                    }
                    switch (alt79) {
                        case 1 :
                            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:2008:6: otherlv_17= 'to'
                            {
                            otherlv_17=(Token)match(input,52,FOLLOW_52_in_ruleRepeat4840); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_17, grammarAccess.getRepeatAccess().getToKeyword_1_5());
                                  
                            }

                            }
                            break;

                    }

                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:2012:3: ( (lv_spec_18_0= ruleRepeatSpec ) )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:2013:1: (lv_spec_18_0= ruleRepeatSpec )
                    {
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:2013:1: (lv_spec_18_0= ruleRepeatSpec )
                    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:2014:3: lv_spec_18_0= ruleRepeatSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRepeatAccess().getSpecRepeatSpecParserRuleCall_1_6_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRepeatSpec_in_ruleRepeat4863);
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
    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:2038:1: entryRuleRange returns [EObject current=null] : iv_ruleRange= ruleRange EOF ;
    public final EObject entryRuleRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRange = null;


        try {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:2039:2: (iv_ruleRange= ruleRange EOF )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:2040:2: iv_ruleRange= ruleRange EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRangeRule()); 
            }
            pushFollow(FOLLOW_ruleRange_in_entryRuleRange4900);
            iv_ruleRange=ruleRange();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRange; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRange4910); if (state.failed) return current;

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
    // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:2047:1: ruleRange returns [EObject current=null] : ( ( (lv_min_0_0= RULE_INT ) ) otherlv_1= '-' ( (lv_max_2_0= RULE_INT ) ) ) ;
    public final EObject ruleRange() throws RecognitionException {
        EObject current = null;

        Token lv_min_0_0=null;
        Token otherlv_1=null;
        Token lv_max_2_0=null;

         enterRule(); 
            
        try {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:2050:28: ( ( ( (lv_min_0_0= RULE_INT ) ) otherlv_1= '-' ( (lv_max_2_0= RULE_INT ) ) ) )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:2051:1: ( ( (lv_min_0_0= RULE_INT ) ) otherlv_1= '-' ( (lv_max_2_0= RULE_INT ) ) )
            {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:2051:1: ( ( (lv_min_0_0= RULE_INT ) ) otherlv_1= '-' ( (lv_max_2_0= RULE_INT ) ) )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:2051:2: ( (lv_min_0_0= RULE_INT ) ) otherlv_1= '-' ( (lv_max_2_0= RULE_INT ) )
            {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:2051:2: ( (lv_min_0_0= RULE_INT ) )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:2052:1: (lv_min_0_0= RULE_INT )
            {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:2052:1: (lv_min_0_0= RULE_INT )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:2053:3: lv_min_0_0= RULE_INT
            {
            lv_min_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRange4952); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,82,FOLLOW_82_in_ruleRange4969); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getRangeAccess().getHyphenMinusKeyword_1());
                  
            }
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:2073:1: ( (lv_max_2_0= RULE_INT ) )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:2074:1: (lv_max_2_0= RULE_INT )
            {
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:2074:1: (lv_max_2_0= RULE_INT )
            // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:2075:3: lv_max_2_0= RULE_INT
            {
            lv_max_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRange4986); if (state.failed) return current;
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
        // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:402:2: ( RULE_LF )
        // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:402:4: RULE_LF
        {
        match(input,RULE_LF,FOLLOW_RULE_LF_in_synpred1_InternalKnittingExpressionLanguage916); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalKnittingExpressionLanguage

    // $ANTLR start synpred2_InternalKnittingExpressionLanguage
    public final void synpred2_InternalKnittingExpressionLanguage_fragment() throws RecognitionException {   
        // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:897:5: ( RULE_LF )
        // ../com.knitml.dsl/src-gen/com/knitml/dsl/parser/antlr/internal/InternalKnittingExpressionLanguage.g:897:7: RULE_LF
        {
        match(input,RULE_LF,FOLLOW_RULE_LF_in_synpred2_InternalKnittingExpressionLanguage2121); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalKnittingExpressionLanguage

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
    public final boolean synpred2_InternalKnittingExpressionLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalKnittingExpressionLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA72 dfa72 = new DFA72(this);
    static final String DFA72_eotS =
        "\12\uffff";
    static final String DFA72_eofS =
        "\12\uffff";
    static final String DFA72_minS =
        "\1\7\2\uffff\1\57\2\112\4\uffff";
    static final String DFA72_maxS =
        "\1\111\2\uffff\1\115\2\114\4\uffff";
    static final String DFA72_acceptS =
        "\1\uffff\1\1\1\2\3\uffff\1\5\1\4\1\6\1\3";
    static final String DFA72_specialS =
        "\12\uffff}>";
    static final String[] DFA72_transitionS = {
            "\1\3\100\uffff\1\1\1\2",
            "",
            "",
            "\1\4\1\5\31\uffff\1\11\1\7\1\6\1\10",
            "\1\11\1\7\1\6",
            "\1\11\1\7\1\6",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA72_eot = DFA.unpackEncodedString(DFA72_eotS);
    static final short[] DFA72_eof = DFA.unpackEncodedString(DFA72_eofS);
    static final char[] DFA72_min = DFA.unpackEncodedStringToUnsignedChars(DFA72_minS);
    static final char[] DFA72_max = DFA.unpackEncodedStringToUnsignedChars(DFA72_maxS);
    static final short[] DFA72_accept = DFA.unpackEncodedString(DFA72_acceptS);
    static final short[] DFA72_special = DFA.unpackEncodedString(DFA72_specialS);
    static final short[][] DFA72_transition;

    static {
        int numStates = DFA72_transitionS.length;
        DFA72_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA72_transition[i] = DFA.unpackEncodedString(DFA72_transitionS[i]);
        }
    }

    class DFA72 extends DFA {

        public DFA72(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 72;
            this.eot = DFA72_eot;
            this.eof = DFA72_eof;
            this.min = DFA72_min;
            this.max = DFA72_max;
            this.accept = DFA72_accept;
            this.special = DFA72_special;
            this.transition = DFA72_transition;
        }
        public String getDescription() {
            return "1652:1: ( ( (lv_toEnd_0_0= 'end' ) ) | ( (lv_toMarker_1_0= 'marker' ) ) | ( ( (lv_value_2_0= RULE_INT ) ) (otherlv_3= 'st' | otherlv_4= 'sts' )? ( (lv_beforeEnd_5_0= 'before end' ) ) ) | ( ( (lv_value_6_0= RULE_INT ) ) (otherlv_7= 'st' | otherlv_8= 'sts' )? ( (lv_beforeGap_9_0= 'before gap' ) ) ) | ( ( (lv_value_10_0= RULE_INT ) ) (otherlv_11= 'st' | otherlv_12= 'sts' )? ( (lv_beforeMarker_13_0= 'before marker' ) ) ) | ( ( (lv_value_14_0= RULE_INT ) ) ( (lv_times_15_0= 'times' ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_rulePattern_in_entryRulePattern75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePattern85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LF_in_rulePattern122 = new BitSet(new long[]{0x00000001FC001050L});
    public static final BitSet FOLLOW_ruleBlockOperation_in_rulePattern144 = new BitSet(new long[]{0x00000001FC001052L});
    public static final BitSet FOLLOW_RULE_LF_in_rulePattern157 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleBlockOperation_in_entryRuleBlockOperation194 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlockOperation204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleBlockOperation251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRow_in_ruleBlockOperation278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_ruleBlockOperation305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_entryRuleInstruction340 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstruction350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleInstruction387 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInstruction449 = new BitSet(new long[]{0x0000000002802060L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInstruction525 = new BitSet(new long[]{0x0000000002802060L});
    public static final BitSet FOLLOW_13_in_ruleInstruction589 = new BitSet(new long[]{0x0000000000474080L});
    public static final BitSet FOLLOW_14_in_ruleInstruction602 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleInstruction620 = new BitSet(new long[]{0x00000000004700C0L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInstruction650 = new BitSet(new long[]{0x0000000000470080L});
    public static final BitSet FOLLOW_16_in_ruleInstruction672 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleInstruction694 = new BitSet(new long[]{0x0000000000490080L});
    public static final BitSet FOLLOW_18_in_ruleInstruction723 = new BitSet(new long[]{0x0000000000490080L});
    public static final BitSet FOLLOW_19_in_ruleInstruction752 = new BitSet(new long[]{0x0000000000410080L});
    public static final BitSet FOLLOW_16_in_ruleInstruction770 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleInstruction789 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_20_in_ruleInstruction807 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_21_in_ruleInstruction825 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleInstruction841 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_23_in_ruleInstruction857 = new BitSet(new long[]{0x00000001FC000010L});
    public static final BitSet FOLLOW_RULE_LF_in_ruleInstruction869 = new BitSet(new long[]{0x00000001FC000010L});
    public static final BitSet FOLLOW_ruleRow_in_ruleInstruction891 = new BitSet(new long[]{0x00000001FD000000L});
    public static final BitSet FOLLOW_24_in_ruleInstruction904 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_LF_in_ruleInstruction921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleInstruction942 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LF_in_ruleInstruction953 = new BitSet(new long[]{0x00000001FC000000L});
    public static final BitSet FOLLOW_ruleRow_in_ruleInstruction973 = new BitSet(new long[]{0x00000001FC000010L});
    public static final BitSet FOLLOW_RULE_LF_in_ruleInstruction985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRow_in_entryRuleRow1022 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRow1032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleRow1075 = new BitSet(new long[]{0x00000001F8000000L});
    public static final BitSet FOLLOW_27_in_ruleRow1152 = new BitSet(new long[]{0x00000001F8000000L});
    public static final BitSet FOLLOW_28_in_ruleRow1237 = new BitSet(new long[]{0x00000001F8000000L});
    public static final BitSet FOLLOW_29_in_ruleRow1310 = new BitSet(new long[]{0x0000006002006080L});
    public static final BitSet FOLLOW_30_in_ruleRow1339 = new BitSet(new long[]{0x0000006002006080L});
    public static final BitSet FOLLOW_31_in_ruleRow1368 = new BitSet(new long[]{0x0000006002006080L});
    public static final BitSet FOLLOW_32_in_ruleRow1397 = new BitSet(new long[]{0x0000006002006080L});
    public static final BitSet FOLLOW_ruleRange_in_ruleRow1435 = new BitSet(new long[]{0x0000006002006000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRow1459 = new BitSet(new long[]{0x0000006202016000L});
    public static final BitSet FOLLOW_16_in_ruleRow1477 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRow1494 = new BitSet(new long[]{0x0000006202016000L});
    public static final BitSet FOLLOW_33_in_ruleRow1514 = new BitSet(new long[]{0x0000001C00000000L});
    public static final BitSet FOLLOW_34_in_ruleRow1527 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_35_in_ruleRow1549 = new BitSet(new long[]{0x0000006002306000L});
    public static final BitSet FOLLOW_36_in_ruleRow1578 = new BitSet(new long[]{0x0000006002306000L});
    public static final BitSet FOLLOW_20_in_ruleRow1607 = new BitSet(new long[]{0x0000006002006000L});
    public static final BitSet FOLLOW_21_in_ruleRow1625 = new BitSet(new long[]{0x0000006002006000L});
    public static final BitSet FOLLOW_37_in_ruleRow1697 = new BitSet(new long[]{0x0000006002006000L});
    public static final BitSet FOLLOW_38_in_ruleRow1726 = new BitSet(new long[]{0x0000006002006000L});
    public static final BitSet FOLLOW_14_in_ruleRow1809 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRow1826 = new BitSet(new long[]{0x0000006002006000L});
    public static final BitSet FOLLOW_13_in_ruleRow1885 = new BitSet(new long[]{0x0000028000410000L});
    public static final BitSet FOLLOW_16_in_ruleRow1899 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleRow1919 = new BitSet(new long[]{0x0000030000410000L});
    public static final BitSet FOLLOW_40_in_ruleRow1945 = new BitSet(new long[]{0x0000020000410000L});
    public static final BitSet FOLLOW_16_in_ruleRow1963 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleRow1983 = new BitSet(new long[]{0x0000040000400000L});
    public static final BitSet FOLLOW_42_in_ruleRow2009 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleRow2025 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleRow2039 = new BitSet(new long[]{0xFFE0780000000010L,0x000000000001C001L});
    public static final BitSet FOLLOW_RULE_LF_in_ruleRow2051 = new BitSet(new long[]{0xFFE0780000000010L,0x000000000001C001L});
    public static final BitSet FOLLOW_ruleInlineOperation_in_ruleRow2073 = new BitSet(new long[]{0x0000000000010012L});
    public static final BitSet FOLLOW_16_in_ruleRow2086 = new BitSet(new long[]{0xFFE0780000000010L,0x000000000001C001L});
    public static final BitSet FOLLOW_ruleInlineOperation_in_ruleRow2107 = new BitSet(new long[]{0x0000000000010012L});
    public static final BitSet FOLLOW_RULE_LF_in_ruleRow2126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_entryRuleMessage2163 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessage2173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMessage2215 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LF_in_ruleMessage2231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInlineOperation_in_entryRuleInlineOperation2266 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInlineOperation2276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKnit_in_ruleInlineOperation2323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePurl_in_ruleInlineOperation2350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSlip_in_ruleInlineOperation2377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRepeat_in_ruleInlineOperation2404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKnit_in_entryRuleKnit2439 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKnit2449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleKnit2487 = new BitSet(new long[]{0x001F800000004082L,0x0000000000000300L});
    public static final BitSet FOLLOW_44_in_ruleKnit2505 = new BitSet(new long[]{0x001F800000004082L,0x0000000000000300L});
    public static final BitSet FOLLOW_45_in_ruleKnit2523 = new BitSet(new long[]{0x001F800000004082L,0x0000000000000300L});
    public static final BitSet FOLLOW_46_in_ruleKnit2541 = new BitSet(new long[]{0x001F800000004082L,0x0000000000000300L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleKnit2568 = new BitSet(new long[]{0x001F800000004082L,0x0000000000000300L});
    public static final BitSet FOLLOW_47_in_ruleKnit2587 = new BitSet(new long[]{0x001E000000004082L,0x0000000000000300L});
    public static final BitSet FOLLOW_48_in_ruleKnit2605 = new BitSet(new long[]{0x001E000000004082L,0x0000000000000300L});
    public static final BitSet FOLLOW_49_in_ruleKnit2670 = new BitSet(new long[]{0x001E000000004082L,0x0000000000000300L});
    public static final BitSet FOLLOW_50_in_ruleKnit2757 = new BitSet(new long[]{0x001E000000004082L,0x0000000000000300L});
    public static final BitSet FOLLOW_51_in_ruleKnit2786 = new BitSet(new long[]{0x001E000000004082L,0x0000000000000300L});
    public static final BitSet FOLLOW_14_in_ruleKnit2855 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleKnit2872 = new BitSet(new long[]{0x0010000000000082L,0x0000000000000300L});
    public static final BitSet FOLLOW_52_in_ruleKnit2893 = new BitSet(new long[]{0x0010000000000080L,0x0000000000000300L});
    public static final BitSet FOLLOW_ruleRepeatSpec_in_ruleKnit2916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePurl_in_entryRulePurl2954 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePurl2964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rulePurl3002 = new BitSet(new long[]{0x001F800000004082L,0x0000000000000300L});
    public static final BitSet FOLLOW_54_in_rulePurl3020 = new BitSet(new long[]{0x001F800000004082L,0x0000000000000300L});
    public static final BitSet FOLLOW_55_in_rulePurl3038 = new BitSet(new long[]{0x001F800000004082L,0x0000000000000300L});
    public static final BitSet FOLLOW_56_in_rulePurl3056 = new BitSet(new long[]{0x001F800000004082L,0x0000000000000300L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePurl3083 = new BitSet(new long[]{0x001F800000004082L,0x0000000000000300L});
    public static final BitSet FOLLOW_47_in_rulePurl3102 = new BitSet(new long[]{0x001E000000004082L,0x0000000000000300L});
    public static final BitSet FOLLOW_48_in_rulePurl3120 = new BitSet(new long[]{0x001E000000004082L,0x0000000000000300L});
    public static final BitSet FOLLOW_49_in_rulePurl3185 = new BitSet(new long[]{0x001E000000004082L,0x0000000000000300L});
    public static final BitSet FOLLOW_50_in_rulePurl3272 = new BitSet(new long[]{0x001E000000004082L,0x0000000000000300L});
    public static final BitSet FOLLOW_51_in_rulePurl3301 = new BitSet(new long[]{0x001E000000004082L,0x0000000000000300L});
    public static final BitSet FOLLOW_14_in_rulePurl3370 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePurl3387 = new BitSet(new long[]{0x0010000000000082L,0x0000000000000300L});
    public static final BitSet FOLLOW_52_in_rulePurl3408 = new BitSet(new long[]{0x0010000000000080L,0x0000000000000300L});
    public static final BitSet FOLLOW_ruleRepeatSpec_in_rulePurl3431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSlip_in_entryRuleSlip3469 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSlip3479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleSlip3533 = new BitSet(new long[]{0xE000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_58_in_ruleSlip3562 = new BitSet(new long[]{0xE000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_59_in_ruleSlip3591 = new BitSet(new long[]{0xE000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_60_in_ruleSlip3620 = new BitSet(new long[]{0xE000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_61_in_ruleSlip3650 = new BitSet(new long[]{0x0000000000000082L,0x00000000000000FEL});
    public static final BitSet FOLLOW_62_in_ruleSlip3668 = new BitSet(new long[]{0x0000000000000082L,0x00000000000000FEL});
    public static final BitSet FOLLOW_63_in_ruleSlip3686 = new BitSet(new long[]{0x0000000000000082L,0x00000000000000FEL});
    public static final BitSet FOLLOW_64_in_ruleSlip3704 = new BitSet(new long[]{0x0000000000000082L,0x00000000000000FEL});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSlip3724 = new BitSet(new long[]{0x0001800000000002L,0x00000000000000FCL});
    public static final BitSet FOLLOW_47_in_ruleSlip3742 = new BitSet(new long[]{0x0000000000000002L,0x00000000000000FCL});
    public static final BitSet FOLLOW_48_in_ruleSlip3760 = new BitSet(new long[]{0x0000000000000002L,0x00000000000000FCL});
    public static final BitSet FOLLOW_65_in_ruleSlip3781 = new BitSet(new long[]{0x0000000000000002L,0x00000000000000FCL});
    public static final BitSet FOLLOW_66_in_ruleSlip3804 = new BitSet(new long[]{0x0000000000000002L,0x00000000000000C0L});
    public static final BitSet FOLLOW_67_in_ruleSlip3833 = new BitSet(new long[]{0x0000000000000002L,0x00000000000000C0L});
    public static final BitSet FOLLOW_68_in_ruleSlip3875 = new BitSet(new long[]{0x0000000000000002L,0x00000000000000C0L});
    public static final BitSet FOLLOW_69_in_ruleSlip3904 = new BitSet(new long[]{0x0000000000000002L,0x00000000000000C0L});
    public static final BitSet FOLLOW_70_in_ruleSlip3942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleSlip3971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRepeatSpec_in_entryRuleRepeatSpec4024 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRepeatSpec4034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleRepeatSpec4077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleRepeatSpec4114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRepeatSpec4151 = new BitSet(new long[]{0x0001800000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_47_in_ruleRepeatSpec4169 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_48_in_ruleRepeatSpec4187 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleRepeatSpec4207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRepeatSpec4245 = new BitSet(new long[]{0x0001800000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_47_in_ruleRepeatSpec4263 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_48_in_ruleRepeatSpec4281 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_ruleRepeatSpec4301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRepeatSpec4339 = new BitSet(new long[]{0x0001800000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_47_in_ruleRepeatSpec4357 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_48_in_ruleRepeatSpec4375 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_ruleRepeatSpec4395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRepeatSpec4433 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleRepeatSpec4456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRepeat_in_entryRuleRepeat4506 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRepeat4516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleRepeat4555 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_79_in_ruleRepeat4573 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleRepeat4586 = new BitSet(new long[]{0xFFE0780000000010L,0x000000000001C001L});
    public static final BitSet FOLLOW_ruleInlineOperation_in_ruleRepeat4607 = new BitSet(new long[]{0x0000000000010000L,0x0000000000020000L});
    public static final BitSet FOLLOW_16_in_ruleRepeat4620 = new BitSet(new long[]{0xFFE0780000000010L,0x000000000001C001L});
    public static final BitSet FOLLOW_ruleInlineOperation_in_ruleRepeat4641 = new BitSet(new long[]{0x0000000000010000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_ruleRepeat4655 = new BitSet(new long[]{0x0010000000000080L,0x0000000000000300L});
    public static final BitSet FOLLOW_52_in_ruleRepeat4668 = new BitSet(new long[]{0x0010000000000080L,0x0000000000000300L});
    public static final BitSet FOLLOW_ruleRepeatSpec_in_ruleRepeat4691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleRepeat4711 = new BitSet(new long[]{0xFFE0780000000010L,0x000000000001C001L});
    public static final BitSet FOLLOW_ruleInlineOperation_in_ruleRepeat4732 = new BitSet(new long[]{0x0000000000010000L,0x0000000000020000L});
    public static final BitSet FOLLOW_16_in_ruleRepeat4745 = new BitSet(new long[]{0xFFE0780000000010L,0x000000000001C001L});
    public static final BitSet FOLLOW_ruleInlineOperation_in_ruleRepeat4766 = new BitSet(new long[]{0x0000000000010000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_ruleRepeat4780 = new BitSet(new long[]{0x0010000000010080L,0x0000000000000300L});
    public static final BitSet FOLLOW_16_in_ruleRepeat4793 = new BitSet(new long[]{0x0000000000000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_78_in_ruleRepeat4806 = new BitSet(new long[]{0x0010000000000080L,0x0000000000000300L});
    public static final BitSet FOLLOW_79_in_ruleRepeat4824 = new BitSet(new long[]{0x0010000000000080L,0x0000000000000300L});
    public static final BitSet FOLLOW_52_in_ruleRepeat4840 = new BitSet(new long[]{0x0010000000000080L,0x0000000000000300L});
    public static final BitSet FOLLOW_ruleRepeatSpec_in_ruleRepeat4863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRange_in_entryRuleRange4900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRange4910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRange4952 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_ruleRange4969 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRange4986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LF_in_synpred1_InternalKnittingExpressionLanguage916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LF_in_synpred2_InternalKnittingExpressionLanguage2121 = new BitSet(new long[]{0x0000000000000002L});

}
