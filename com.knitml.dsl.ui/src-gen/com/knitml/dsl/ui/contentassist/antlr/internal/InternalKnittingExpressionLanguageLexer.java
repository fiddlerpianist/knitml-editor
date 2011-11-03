package com.knitml.dsl.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalKnittingExpressionLanguageLexer extends Lexer {
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=5;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__29=29;
    public static final int T__64=64;
    public static final int T__28=28;
    public static final int T__65=65;
    public static final int T__27=27;
    public static final int T__62=62;
    public static final int T__26=26;
    public static final int T__63=63;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int EOF=-1;
    public static final int T__60=60;
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
    public static final int T__32=32;
    public static final int RULE_STRING=7;
    public static final int T__33=33;
    public static final int T__71=71;
    public static final int T__34=34;
    public static final int T__72=72;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__70=70;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__76=76;
    public static final int RULE_WS=10;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__78=78;
    public static final int T__77=77;

    // delegates
    // delegators

    public InternalKnittingExpressionLanguageLexer() {;} 
    public InternalKnittingExpressionLanguageLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalKnittingExpressionLanguageLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:11:7: ( 'Row' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:11:9: 'Row'
            {
            match("Row"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:12:7: ( 'Round' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:12:9: 'Round'
            {
            match("Round"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:13:7: ( 'Rows' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:13:9: 'Rows'
            {
            match("Rows"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:14:7: ( 'Rounds' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:14:9: 'Rounds'
            {
            match("Rounds"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:15:7: ( 'even' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:15:9: 'even'
            {
            match("even"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:16:7: ( 'odd' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:16:9: 'odd'
            {
            match("odd"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:17:7: ( 'rows' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:17:9: 'rows'
            {
            match("rows"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:18:7: ( 'rounds' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:18:9: 'rounds'
            {
            match("rounds"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:19:7: ( 'WS' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:19:9: 'WS'
            {
            match("WS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:20:7: ( 'RS' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:20:9: 'RS'
            {
            match("RS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:21:7: ( 'K' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:21:9: 'K'
            {
            match('K'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:22:7: ( 'k' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:22:9: 'k'
            {
            match('k'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:23:7: ( 'Knit' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:23:9: 'Knit'
            {
            match("Knit"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:24:7: ( 'knit' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:24:9: 'knit'
            {
            match("knit"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:25:7: ( 'st' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:25:9: 'st'
            {
            match("st"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:26:7: ( 'sts' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:26:9: 'sts'
            {
            match("sts"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:27:7: ( 'tbl' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:27:9: 'tbl'
            {
            match("tbl"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:28:7: ( 'ttl' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:28:9: 'ttl'
            {
            match("ttl"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:29:7: ( 'P' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:29:9: 'P'
            {
            match('P'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:30:7: ( 'p' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:30:9: 'p'
            {
            match('p'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:31:7: ( 'Purl' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:31:9: 'Purl'
            {
            match("Purl"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:32:7: ( 'purl' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:32:9: 'purl'
            {
            match("purl"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:33:7: ( 'Rev' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:33:9: 'Rev'
            {
            match("Rev"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:34:7: ( 'Reverse' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:34:9: 'Reverse'
            {
            match("Reverse"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:35:7: ( 'rev' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:35:9: 'rev'
            {
            match("rev"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:36:7: ( 'reverse' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:36:9: 'reverse'
            {
            match("reverse"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:37:7: ( 'Sl' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:37:9: 'Sl'
            {
            match("Sl"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:38:7: ( 'sl' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:38:9: 'sl'
            {
            match("sl"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:39:7: ( 'Slip' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:39:9: 'Slip'
            {
            match("Slip"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:40:7: ( 'slip' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:40:9: 'slip'
            {
            match("slip"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:41:7: ( 'next st' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:41:9: 'next st'
            {
            match("next st"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:42:7: ( 'kw' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:42:9: 'kw'
            {
            match("kw"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:43:7: ( 'knitwise' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:43:9: 'knitwise'
            {
            match("knitwise"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:44:7: ( 'pw' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:44:9: 'pw'
            {
            match("pw"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:45:7: ( 'purlwise' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:45:9: 'purlwise'
            {
            match("purlwise"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:46:7: ( 'wyif' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:46:9: 'wyif'
            {
            match("wyif"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:47:7: ( 'wyib' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:47:9: 'wyib'
            {
            match("wyib"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:48:7: ( 'Repeat' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:48:9: 'Repeat'
            {
            match("Repeat"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:49:7: ( 'repeat' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:49:9: 'repeat'
            {
            match("repeat"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:50:7: ( 'Instruction' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:50:9: 'Instruction'
            {
            match("Instruction"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:51:7: ( '{' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:51:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:52:7: ( '}' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:52:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:53:7: ( ':' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:53:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:54:7: ( ',' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:54:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:55:7: ( 'and' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:55:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:56:7: ( 'all' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:56:9: 'all'
            {
            match("all"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:57:7: ( 'with' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:57:9: 'with'
            {
            match("with"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:58:7: ( '(' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:58:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:59:7: ( ')' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:59:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:60:7: ( 'side' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:60:9: 'side'
            {
            match("side"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:61:7: ( 'count' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:61:9: 'count'
            {
            match("count"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:62:7: ( 'to' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:62:9: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:63:7: ( '[' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:63:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:64:7: ( ']' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:64:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:65:7: ( '-' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:65:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:66:7: ( 'Next' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:66:9: 'Next'
            {
            match("Next"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:67:7: ( 'Short' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:67:9: 'Short'
            {
            match("Short"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:68:7: ( 'Long' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:68:9: 'Long'
            {
            match("Long"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:69:7: ( 'inform' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:69:9: 'inform'
            {
            match("inform"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:70:7: ( 'reset' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:70:9: 'reset'
            {
            match("reset"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:71:7: ( 'tog' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:71:9: 'tog'
            {
            match("tog"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:72:7: ( 'end' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:72:9: 'end'
            {
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:73:7: ( 'marker' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:73:9: 'marker'
            {
            match("marker"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:74:7: ( 'before end' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:74:9: 'before end'
            {
            match("before end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:75:7: ( 'before gap' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:75:9: 'before gap'
            {
            match("before gap"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:76:7: ( 'before marker' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:76:9: 'before marker'
            {
            match("before marker"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:77:7: ( 'times' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:77:9: 'times'
            {
            match("times"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6144:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' )+ )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6144:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' )+
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6144:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6144:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6144:16: ( 'a' .. 'z' | 'A' .. 'Z' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='A' && LA2_0<='Z')||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:
            	    {
            	    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6146:10: ( ( '0' .. '9' )+ )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6146:12: ( '0' .. '9' )+
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6146:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6146:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6148:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6148:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6148:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6148:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6148:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6148:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6148:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6148:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6148:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6148:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6148:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6150:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6150:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6150:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6150:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6152:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6152:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6152:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6152:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6152:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6152:41: ( '\\r' )? '\\n'
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6152:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6152:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_LF"
    public final void mRULE_LF() throws RecognitionException {
        try {
            int _type = RULE_LF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6154:9: ( ( EOF | ( '\\r' )? '\\n' ) )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6154:11: ( EOF | ( '\\r' )? '\\n' )
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6154:11: ( EOF | ( '\\r' )? '\\n' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=2;
            }
            else {
                alt12=1;}
            switch (alt12) {
                case 1 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6154:12: EOF
                    {
                    match(EOF); 

                    }
                    break;
                case 2 :
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6154:16: ( '\\r' )? '\\n'
                    {
                    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6154:16: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6154:16: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LF"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6156:9: ( ( ' ' | '\\t' )+ )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6156:11: ( ' ' | '\\t' )+
            {
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6156:11: ( ' ' | '\\t' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='\t'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6158:16: ( . )
            // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:6158:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_LF | RULE_WS | RULE_ANY_OTHER )
        int alt14=75;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1:184: T__41
                {
                mT__41(); 

                }
                break;
            case 31 :
                // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1:190: T__42
                {
                mT__42(); 

                }
                break;
            case 32 :
                // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1:196: T__43
                {
                mT__43(); 

                }
                break;
            case 33 :
                // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1:202: T__44
                {
                mT__44(); 

                }
                break;
            case 34 :
                // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1:208: T__45
                {
                mT__45(); 

                }
                break;
            case 35 :
                // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1:214: T__46
                {
                mT__46(); 

                }
                break;
            case 36 :
                // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1:220: T__47
                {
                mT__47(); 

                }
                break;
            case 37 :
                // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1:226: T__48
                {
                mT__48(); 

                }
                break;
            case 38 :
                // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1:232: T__49
                {
                mT__49(); 

                }
                break;
            case 39 :
                // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1:238: T__50
                {
                mT__50(); 

                }
                break;
            case 40 :
                // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1:244: T__51
                {
                mT__51(); 

                }
                break;
            case 41 :
                // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1:250: T__52
                {
                mT__52(); 

                }
                break;
            case 42 :
                // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1:256: T__53
                {
                mT__53(); 

                }
                break;
            case 43 :
                // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1:262: T__54
                {
                mT__54(); 

                }
                break;
            case 44 :
                // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1:268: T__55
                {
                mT__55(); 

                }
                break;
            case 45 :
                // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1:274: T__56
                {
                mT__56(); 

                }
                break;
            case 46 :
                // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1:280: T__57
                {
                mT__57(); 

                }
                break;
            case 47 :
                // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1:286: T__58
                {
                mT__58(); 

                }
                break;
            case 48 :
                // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1:292: T__59
                {
                mT__59(); 

                }
                break;
            case 49 :
                // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1:298: T__60
                {
                mT__60(); 

                }
                break;
            case 50 :
                // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1:304: T__61
                {
                mT__61(); 

                }
                break;
            case 51 :
                // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1:310: T__62
                {
                mT__62(); 

                }
                break;
            case 52 :
                // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1:316: T__63
                {
                mT__63(); 

                }
                break;
            case 53 :
                // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1:322: T__64
                {
                mT__64(); 

                }
                break;
            case 54 :
                // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1:328: T__65
                {
                mT__65(); 

                }
                break;
            case 55 :
                // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1:334: T__66
                {
                mT__66(); 

                }
                break;
            case 56 :
                // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1:340: T__67
                {
                mT__67(); 

                }
                break;
            case 57 :
                // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1:346: T__68
                {
                mT__68(); 

                }
                break;
            case 58 :
                // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1:352: T__69
                {
                mT__69(); 

                }
                break;
            case 59 :
                // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1:358: T__70
                {
                mT__70(); 

                }
                break;
            case 60 :
                // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1:364: T__71
                {
                mT__71(); 

                }
                break;
            case 61 :
                // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1:370: T__72
                {
                mT__72(); 

                }
                break;
            case 62 :
                // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1:376: T__73
                {
                mT__73(); 

                }
                break;
            case 63 :
                // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1:382: T__74
                {
                mT__74(); 

                }
                break;
            case 64 :
                // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1:388: T__75
                {
                mT__75(); 

                }
                break;
            case 65 :
                // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1:394: T__76
                {
                mT__76(); 

                }
                break;
            case 66 :
                // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1:400: T__77
                {
                mT__77(); 

                }
                break;
            case 67 :
                // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1:406: T__78
                {
                mT__78(); 

                }
                break;
            case 68 :
                // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1:412: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 69 :
                // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1:420: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 70 :
                // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1:429: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 71 :
                // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1:441: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 72 :
                // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1:457: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 73 :
                // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1:473: RULE_LF
                {
                mRULE_LF(); 

                }
                break;
            case 74 :
                // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1:481: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 75 :
                // ../com.knitml.dsl.ui/src-gen/com/knitml/dsl/ui/contentassist/antlr/internal/InternalKnittingExpressionLanguage.g:1:489: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\46\5\56\1\66\1\71\2\56\1\102\1\105\4\56\4\uffff\1\56\2\uffff"+
        "\1\56\3\uffff\5\56\1\52\2\uffff\3\52\1\uffff\1\52\3\uffff\1\56\1"+
        "\144\1\56\1\uffff\5\56\1\157\1\56\1\uffff\1\56\1\162\1\uffff\1\164"+
        "\1\166\3\56\1\173\2\56\1\uffff\1\56\1\177\1\uffff\1\u0081\5\56\4"+
        "\uffff\2\56\2\uffff\1\56\3\uffff\5\56\5\uffff\1\u0090\1\56\1\uffff"+
        "\1\u0093\2\56\1\u0096\1\u0097\2\56\1\u009b\2\56\1\uffff\2\56\1\uffff"+
        "\1\u00a0\1\uffff\1\56\1\uffff\1\56\1\u00a3\1\u00a4\1\u00a5\1\uffff"+
        "\3\56\1\uffff\1\56\1\uffff\5\56\1\u00b0\1\u00b1\6\56\1\u00b8\1\uffff"+
        "\2\56\1\uffff\1\56\1\u00bc\2\uffff\1\u00bd\2\56\1\uffff\2\56\1\u00c2"+
        "\1\u00c4\1\uffff\1\u00c5\1\u00c6\3\uffff\1\56\1\u00c8\1\u00ca\1"+
        "\u00cb\2\56\1\u00ce\1\u00cf\1\u00d0\1\56\2\uffff\1\56\1\u00d3\1"+
        "\u00d4\3\56\1\uffff\1\u00d9\2\56\2\uffff\3\56\1\u00df\1\uffff\1"+
        "\56\3\uffff\1\u00e1\1\uffff\1\56\2\uffff\1\u00e3\4\uffff\1\56\1"+
        "\u00e5\2\uffff\3\56\1\u00e9\1\uffff\1\56\1\u00eb\1\u00ec\1\56\1"+
        "\u00ee\1\uffff\1\56\1\uffff\1\56\1\uffff\1\56\1\uffff\1\u00f2\1"+
        "\u00f3\1\56\1\uffff\1\u00f5\2\uffff\1\u00f6\1\uffff\3\56\5\uffff"+
        "\1\u00fd\1\u00fe\1\56\5\uffff\2\56\1\u0102\1\uffff";
    static final String DFA14_eofS =
        "\u0103\uffff";
    static final String DFA14_minS =
        "\1\0\1\123\1\156\1\144\1\145\1\123\2\101\1\151\1\142\2\101\1\150"+
        "\1\145\1\151\1\156\4\uffff\1\154\2\uffff\1\157\3\uffff\1\145\1\157"+
        "\1\156\1\141\1\145\1\101\2\uffff\2\0\1\52\1\uffff\1\12\3\uffff\1"+
        "\165\1\101\1\160\1\uffff\1\145\2\144\1\165\1\160\1\101\1\151\1\uffff"+
        "\1\151\1\101\1\uffff\2\101\1\144\2\154\1\101\1\155\1\162\1\uffff"+
        "\1\162\1\101\1\uffff\1\101\1\157\1\170\1\151\1\164\1\163\4\uffff"+
        "\1\144\1\154\2\uffff\1\165\3\uffff\1\170\1\156\1\146\1\162\1\146"+
        "\5\uffff\1\101\1\156\1\uffff\1\101\1\145\1\156\2\101\1\163\1\156"+
        "\1\101\2\145\1\uffff\2\164\1\uffff\1\101\1\uffff\1\160\1\uffff\1"+
        "\145\3\101\1\uffff\1\145\2\154\1\uffff\1\160\1\uffff\1\162\1\164"+
        "\1\142\1\150\1\164\2\101\1\156\1\164\1\147\1\157\1\153\1\157\1\101"+
        "\1\uffff\1\144\1\162\1\uffff\1\141\1\101\2\uffff\1\101\1\144\1\162"+
        "\1\uffff\1\141\1\164\2\101\1\uffff\2\101\3\uffff\1\163\3\101\1\164"+
        "\1\40\3\101\1\162\2\uffff\1\164\2\101\1\162\1\145\1\162\1\uffff"+
        "\1\101\1\163\1\164\2\uffff\2\163\1\164\1\101\1\uffff\1\151\3\uffff"+
        "\1\101\1\uffff\1\151\2\uffff\1\101\4\uffff\1\165\1\101\2\uffff\1"+
        "\155\1\162\1\145\1\101\1\uffff\1\145\2\101\1\145\1\101\1\uffff\1"+
        "\163\1\uffff\1\163\1\uffff\1\143\1\uffff\2\101\1\40\1\uffff\1\101"+
        "\2\uffff\1\101\1\uffff\2\145\1\164\2\uffff\1\145\2\uffff\2\101\1"+
        "\151\5\uffff\1\157\1\156\1\101\1\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\157\1\166\1\144\1\157\1\123\2\172\2\164\2\172\1\154"+
        "\1\145\1\171\1\156\4\uffff\1\156\2\uffff\1\157\3\uffff\1\145\1\157"+
        "\1\156\1\141\1\145\1\172\2\uffff\2\uffff\1\57\1\uffff\1\12\3\uffff"+
        "\1\167\1\172\1\166\1\uffff\1\145\2\144\1\167\1\166\1\172\1\151\1"+
        "\uffff\1\151\1\172\1\uffff\2\172\1\144\2\154\1\172\1\155\1\162\1"+
        "\uffff\1\162\1\172\1\uffff\1\172\1\157\1\170\1\151\1\164\1\163\4"+
        "\uffff\1\144\1\154\2\uffff\1\165\3\uffff\1\170\1\156\1\146\1\162"+
        "\1\146\5\uffff\1\172\1\156\1\uffff\1\172\1\145\1\156\2\172\1\163"+
        "\1\156\1\172\2\145\1\uffff\2\164\1\uffff\1\172\1\uffff\1\160\1\uffff"+
        "\1\145\3\172\1\uffff\1\145\2\154\1\uffff\1\160\1\uffff\1\162\1\164"+
        "\1\146\1\150\1\164\2\172\1\156\1\164\1\147\1\157\1\153\1\157\1\172"+
        "\1\uffff\1\144\1\162\1\uffff\1\141\1\172\2\uffff\1\172\1\144\1\162"+
        "\1\uffff\1\141\1\164\2\172\1\uffff\2\172\3\uffff\1\163\3\172\1\164"+
        "\1\40\3\172\1\162\2\uffff\1\164\2\172\1\162\1\145\1\162\1\uffff"+
        "\1\172\1\163\1\164\2\uffff\2\163\1\164\1\172\1\uffff\1\151\3\uffff"+
        "\1\172\1\uffff\1\151\2\uffff\1\172\4\uffff\1\165\1\172\2\uffff\1"+
        "\155\1\162\1\145\1\172\1\uffff\1\145\2\172\1\145\1\172\1\uffff\1"+
        "\163\1\uffff\1\163\1\uffff\1\143\1\uffff\2\172\1\40\1\uffff\1\172"+
        "\2\uffff\1\172\1\uffff\2\145\1\164\2\uffff\1\155\2\uffff\2\172\1"+
        "\151\5\uffff\1\157\1\156\1\172\1\uffff";
    static final String DFA14_acceptS =
        "\20\uffff\1\51\1\52\1\53\1\54\1\uffff\1\60\1\61\1\uffff\1\65\1"+
        "\66\1\67\6\uffff\1\104\1\105\3\uffff\1\111\1\uffff\1\111\1\112\1"+
        "\113\3\uffff\1\104\7\uffff\1\13\2\uffff\1\14\10\uffff\1\23\2\uffff"+
        "\1\24\6\uffff\1\51\1\52\1\53\1\54\2\uffff\1\60\1\61\1\uffff\1\65"+
        "\1\66\1\67\5\uffff\1\105\1\106\1\107\1\110\1\112\2\uffff\1\12\12"+
        "\uffff\1\11\2\uffff\1\40\1\uffff\1\17\1\uffff\1\34\4\uffff\1\64"+
        "\3\uffff\1\42\1\uffff\1\33\16\uffff\1\1\2\uffff\1\27\2\uffff\1\76"+
        "\1\6\3\uffff\1\31\4\uffff\1\20\2\uffff\1\21\1\22\1\75\12\uffff\1"+
        "\55\1\56\6\uffff\1\3\3\uffff\1\5\1\7\4\uffff\1\15\1\uffff\1\16\1"+
        "\36\1\62\1\uffff\1\25\1\uffff\1\26\1\35\1\uffff\1\37\1\44\1\45\1"+
        "\57\2\uffff\1\70\1\72\4\uffff\1\2\5\uffff\1\74\1\uffff\1\103\1\uffff"+
        "\1\71\1\uffff\1\63\3\uffff\1\4\1\uffff\1\46\1\10\1\uffff\1\47\3"+
        "\uffff\1\73\1\77\1\uffff\1\30\1\32\3\uffff\1\100\1\101\1\102\1\41"+
        "\1\43\3\uffff\1\50";
    static final String DFA14_specialS =
        "\1\2\42\uffff\1\0\1\1\u00de\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\52\1\51\1\50\2\52\1\47\22\52\1\51\1\52\1\43\4\52\1\44\1"+
            "\25\1\26\2\52\1\23\1\32\1\52\1\45\12\42\1\22\6\52\10\41\1\17"+
            "\1\41\1\6\1\34\1\41\1\33\1\41\1\12\1\41\1\1\1\14\3\41\1\5\3"+
            "\41\1\30\1\52\1\31\1\40\2\52\1\24\1\37\1\27\1\41\1\2\3\41\1"+
            "\35\1\41\1\7\1\41\1\36\1\15\1\3\1\13\1\41\1\4\1\10\1\11\2\41"+
            "\1\16\3\41\1\20\1\52\1\21\uff82\52",
            "\1\54\21\uffff\1\55\11\uffff\1\53",
            "\1\60\7\uffff\1\57",
            "\1\61",
            "\1\63\11\uffff\1\62",
            "\1\64",
            "\32\56\6\uffff\15\56\1\65\14\56",
            "\32\56\6\uffff\15\56\1\67\10\56\1\70\3\56",
            "\1\74\2\uffff\1\73\7\uffff\1\72",
            "\1\75\6\uffff\1\100\5\uffff\1\77\4\uffff\1\76",
            "\32\56\6\uffff\24\56\1\101\5\56",
            "\32\56\6\uffff\24\56\1\103\1\56\1\104\3\56",
            "\1\107\3\uffff\1\106",
            "\1\110",
            "\1\112\17\uffff\1\111",
            "\1\113",
            "",
            "",
            "",
            "",
            "\1\121\1\uffff\1\120",
            "",
            "",
            "\1\124",
            "",
            "",
            "",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\32\56\6\uffff\32\56",
            "",
            "",
            "\0\136",
            "\0\136",
            "\1\137\4\uffff\1\140",
            "",
            "\1\46",
            "",
            "",
            "",
            "\1\143\1\uffff\1\142",
            "\32\56\6\uffff\32\56",
            "\1\146\5\uffff\1\145",
            "",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\153\1\uffff\1\152",
            "\1\155\2\uffff\1\156\2\uffff\1\154",
            "\32\56\6\uffff\32\56",
            "\1\160",
            "",
            "\1\161",
            "\32\56\6\uffff\32\56",
            "",
            "\32\56\6\uffff\22\56\1\163\7\56",
            "\32\56\6\uffff\10\56\1\165\21\56",
            "\1\167",
            "\1\170",
            "\1\171",
            "\32\56\6\uffff\6\56\1\172\23\56",
            "\1\174",
            "\1\175",
            "",
            "\1\176",
            "\32\56\6\uffff\32\56",
            "",
            "\32\56\6\uffff\10\56\1\u0080\21\56",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "",
            "",
            "",
            "",
            "\1\u0087",
            "\1\u0088",
            "",
            "",
            "\1\u0089",
            "",
            "",
            "",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "",
            "",
            "",
            "",
            "",
            "\32\56\6\uffff\22\56\1\u008f\7\56",
            "\1\u0091",
            "",
            "\32\56\6\uffff\4\56\1\u0092\25\56",
            "\1\u0094",
            "\1\u0095",
            "\32\56\6\uffff\32\56",
            "\32\56\6\uffff\32\56",
            "\1\u0098",
            "\1\u0099",
            "\32\56\6\uffff\4\56\1\u009a\25\56",
            "\1\u009c",
            "\1\u009d",
            "",
            "\1\u009e",
            "\1\u009f",
            "",
            "\32\56\6\uffff\32\56",
            "",
            "\1\u00a1",
            "",
            "\1\u00a2",
            "\32\56\6\uffff\32\56",
            "\32\56\6\uffff\32\56",
            "\32\56\6\uffff\32\56",
            "",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "",
            "\1\u00a9",
            "",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ad\3\uffff\1\u00ac",
            "\1\u00ae",
            "\1\u00af",
            "\32\56\6\uffff\32\56",
            "\32\56\6\uffff\32\56",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\32\56\6\uffff\32\56",
            "",
            "\1\u00b9",
            "\1\u00ba",
            "",
            "\1\u00bb",
            "\32\56\6\uffff\32\56",
            "",
            "",
            "\32\56\6\uffff\32\56",
            "\1\u00be",
            "\1\u00bf",
            "",
            "\1\u00c0",
            "\1\u00c1",
            "\32\56\6\uffff\32\56",
            "\32\56\6\uffff\26\56\1\u00c3\3\56",
            "",
            "\32\56\6\uffff\32\56",
            "\32\56\6\uffff\32\56",
            "",
            "",
            "",
            "\1\u00c7",
            "\32\56\6\uffff\32\56",
            "\32\56\6\uffff\26\56\1\u00c9\3\56",
            "\32\56\6\uffff\32\56",
            "\1\u00cc",
            "\1\u00cd",
            "\32\56\6\uffff\32\56",
            "\32\56\6\uffff\32\56",
            "\32\56\6\uffff\32\56",
            "\1\u00d1",
            "",
            "",
            "\1\u00d2",
            "\32\56\6\uffff\32\56",
            "\32\56\6\uffff\32\56",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "",
            "\32\56\6\uffff\22\56\1\u00d8\7\56",
            "\1\u00da",
            "\1\u00db",
            "",
            "",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\32\56\6\uffff\32\56",
            "",
            "\1\u00e0",
            "",
            "",
            "",
            "\32\56\6\uffff\32\56",
            "",
            "\1\u00e2",
            "",
            "",
            "\32\56\6\uffff\32\56",
            "",
            "",
            "",
            "",
            "\1\u00e4",
            "\32\56\6\uffff\32\56",
            "",
            "",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\32\56\6\uffff\32\56",
            "",
            "\1\u00ea",
            "\32\56\6\uffff\32\56",
            "\32\56\6\uffff\32\56",
            "\1\u00ed",
            "\32\56\6\uffff\32\56",
            "",
            "\1\u00ef",
            "",
            "\1\u00f0",
            "",
            "\1\u00f1",
            "",
            "\32\56\6\uffff\32\56",
            "\32\56\6\uffff\32\56",
            "\1\u00f4",
            "",
            "\32\56\6\uffff\32\56",
            "",
            "",
            "\32\56\6\uffff\32\56",
            "",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "",
            "",
            "\1\u00fa\1\uffff\1\u00fb\5\uffff\1\u00fc",
            "",
            "",
            "\32\56\6\uffff\32\56",
            "\32\56\6\uffff\32\56",
            "\1\u00ff",
            "",
            "",
            "",
            "",
            "",
            "\1\u0100",
            "\1\u0101",
            "\32\56\6\uffff\32\56",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_LF | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_35 = input.LA(1);

                        s = -1;
                        if ( ((LA14_35>='\u0000' && LA14_35<='\uFFFF')) ) {s = 94;}

                        else s = 42;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_36 = input.LA(1);

                        s = -1;
                        if ( ((LA14_36>='\u0000' && LA14_36<='\uFFFF')) ) {s = 94;}

                        else s = 42;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='R') ) {s = 1;}

                        else if ( (LA14_0=='e') ) {s = 2;}

                        else if ( (LA14_0=='o') ) {s = 3;}

                        else if ( (LA14_0=='r') ) {s = 4;}

                        else if ( (LA14_0=='W') ) {s = 5;}

                        else if ( (LA14_0=='K') ) {s = 6;}

                        else if ( (LA14_0=='k') ) {s = 7;}

                        else if ( (LA14_0=='s') ) {s = 8;}

                        else if ( (LA14_0=='t') ) {s = 9;}

                        else if ( (LA14_0=='P') ) {s = 10;}

                        else if ( (LA14_0=='p') ) {s = 11;}

                        else if ( (LA14_0=='S') ) {s = 12;}

                        else if ( (LA14_0=='n') ) {s = 13;}

                        else if ( (LA14_0=='w') ) {s = 14;}

                        else if ( (LA14_0=='I') ) {s = 15;}

                        else if ( (LA14_0=='{') ) {s = 16;}

                        else if ( (LA14_0=='}') ) {s = 17;}

                        else if ( (LA14_0==':') ) {s = 18;}

                        else if ( (LA14_0==',') ) {s = 19;}

                        else if ( (LA14_0=='a') ) {s = 20;}

                        else if ( (LA14_0=='(') ) {s = 21;}

                        else if ( (LA14_0==')') ) {s = 22;}

                        else if ( (LA14_0=='c') ) {s = 23;}

                        else if ( (LA14_0=='[') ) {s = 24;}

                        else if ( (LA14_0==']') ) {s = 25;}

                        else if ( (LA14_0=='-') ) {s = 26;}

                        else if ( (LA14_0=='N') ) {s = 27;}

                        else if ( (LA14_0=='L') ) {s = 28;}

                        else if ( (LA14_0=='i') ) {s = 29;}

                        else if ( (LA14_0=='m') ) {s = 30;}

                        else if ( (LA14_0=='b') ) {s = 31;}

                        else if ( (LA14_0=='^') ) {s = 32;}

                        else if ( ((LA14_0>='A' && LA14_0<='H')||LA14_0=='J'||LA14_0=='M'||LA14_0=='O'||LA14_0=='Q'||(LA14_0>='T' && LA14_0<='V')||(LA14_0>='X' && LA14_0<='Z')||LA14_0=='d'||(LA14_0>='f' && LA14_0<='h')||LA14_0=='j'||LA14_0=='l'||LA14_0=='q'||(LA14_0>='u' && LA14_0<='v')||(LA14_0>='x' && LA14_0<='z')) ) {s = 33;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 34;}

                        else if ( (LA14_0=='\"') ) {s = 35;}

                        else if ( (LA14_0=='\'') ) {s = 36;}

                        else if ( (LA14_0=='/') ) {s = 37;}

                        else if ( (LA14_0=='\r') ) {s = 39;}

                        else if ( (LA14_0=='\n') ) {s = 40;}

                        else if ( (LA14_0=='\t'||LA14_0==' ') ) {s = 41;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='#' && LA14_0<='&')||(LA14_0>='*' && LA14_0<='+')||LA14_0=='.'||(LA14_0>=';' && LA14_0<='@')||LA14_0=='\\'||(LA14_0>='_' && LA14_0<='`')||LA14_0=='|'||(LA14_0>='~' && LA14_0<='\uFFFF')) ) {s = 42;}

                        else s = 38;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}