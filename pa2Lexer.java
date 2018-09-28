// Generated from pa2.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class pa2Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, DIGIT=2, SELECT=3, PROJECT=4, RENAME=5, PLUS=6, MINUS=7, PRODUCT=8, 
		EQUAL=9, LARROW=10, COMMA=11, SEMICOLON=12, DOUBLEAND=13, DOUBLEOR=14, 
		OPEN=15, CLOSE=16, WRITE=17, EXIT=18, SHOW=19, CREATE=20, TABLE=21, PRIMARY=22, 
		FOREIGN=23, KEY=24, UPDATE=25, SET=26, WHERE=27, INTEGER=28, VARCHAR=29, 
		RELATION=30, INSERT=31, INTO=32, DELETE=33, VALUES=34, FROM=35, LPAR=36, 
		RPAR=37, OPERATION=38, LITERAL=39, IDENTIFIER=40, TYPE=41, OPERAND=42, 
		UPDATEFRAG=43;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WS", "ALPHA", "DIGIT", "SELECT", "PROJECT", "RENAME", "PLUS", "MINUS", 
		"PRODUCT", "EQUAL", "LARROW", "COMMA", "SEMICOLON", "DOUBLEAND", "DOUBLEOR", 
		"OPEN", "CLOSE", "WRITE", "EXIT", "SHOW", "CREATE", "TABLE", "PRIMARY", 
		"FOREIGN", "KEY", "UPDATE", "SET", "WHERE", "INTEGER", "VARCHAR", "RELATION", 
		"INSERT", "INTO", "DELETE", "VALUES", "FROM", "LPAR", "RPAR", "OPERATION", 
		"LITERAL", "IDENTIFIER", "TYPE", "OPERAND", "UPDATEFRAG"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, "'+'", "'-'", "'*'", "'='", "'<-'", 
		"','", "';'", "'&&'", "'||'", "'OPEN'", "'CLOSE'", "'WRITE'", "'EXIT'", 
		"'SHOW'", "'CREATE'", "'TABLE'", "'PRIMARY'", "'FOREIGN'", "'KEY'", "'UPDATE'", 
		"'SET'", "'WHERE'", "'INTEGER'", "'VARCHAR'", "'RELATION'", "'INSERT'", 
		"'INTO'", "'DELETE'", "'VALUES'", "'FROM'", "'('", "')'", null, "'\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "DIGIT", "SELECT", "PROJECT", "RENAME", "PLUS", "MINUS", "PRODUCT", 
		"EQUAL", "LARROW", "COMMA", "SEMICOLON", "DOUBLEAND", "DOUBLEOR", "OPEN", 
		"CLOSE", "WRITE", "EXIT", "SHOW", "CREATE", "TABLE", "PRIMARY", "FOREIGN", 
		"KEY", "UPDATE", "SET", "WHERE", "INTEGER", "VARCHAR", "RELATION", "INSERT", 
		"INTO", "DELETE", "VALUES", "FROM", "LPAR", "RPAR", "OPERATION", "LITERAL", 
		"IDENTIFIER", "TYPE", "OPERAND", "UPDATEFRAG"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public pa2Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "pa2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2-\u015a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\6\2]\n\2\r\2\16\2^\3\2\3\2\3\3\5\3d\n\3\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5t\n\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0084\n\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0092\n\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		"!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$"+
		"\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\5"+
		"(\u013b\n(\3)\3)\3*\3*\3*\7*\u0142\n*\f*\16*\u0145\13*\3+\3+\3+\3+\6+"+
		"\u014b\n+\r+\16+\u014c\3+\3+\5+\u0151\n+\3,\3,\5,\u0155\n,\3-\3-\3-\3"+
		"-\2\2.\3\3\5\2\7\4\t\5\13\6\r\7\17\b\21\t\23\n\25\13\27\f\31\r\33\16\35"+
		"\17\37\20!\21#\22%\23\'\24)\25+\26-\27/\30\61\31\63\32\65\33\67\349\35"+
		";\36=\37? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-\3\2\5\5\2\13\f\17\17\"\"\5\2C\\"+
		"aac|\4\2>>@@\2\u0165\2\3\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\3\\\3\2\2\2\5c\3\2\2\2\7e\3"+
		"\2\2\2\ts\3\2\2\2\13\u0083\3\2\2\2\r\u0091\3\2\2\2\17\u0093\3\2\2\2\21"+
		"\u0095\3\2\2\2\23\u0097\3\2\2\2\25\u0099\3\2\2\2\27\u009b\3\2\2\2\31\u009e"+
		"\3\2\2\2\33\u00a0\3\2\2\2\35\u00a2\3\2\2\2\37\u00a5\3\2\2\2!\u00a8\3\2"+
		"\2\2#\u00ad\3\2\2\2%\u00b3\3\2\2\2\'\u00b9\3\2\2\2)\u00be\3\2\2\2+\u00c3"+
		"\3\2\2\2-\u00ca\3\2\2\2/\u00d0\3\2\2\2\61\u00d8\3\2\2\2\63\u00e0\3\2\2"+
		"\2\65\u00e4\3\2\2\2\67\u00eb\3\2\2\29\u00ef\3\2\2\2;\u00f5\3\2\2\2=\u00fd"+
		"\3\2\2\2?\u0105\3\2\2\2A\u010e\3\2\2\2C\u0115\3\2\2\2E\u011a\3\2\2\2G"+
		"\u0121\3\2\2\2I\u0128\3\2\2\2K\u012d\3\2\2\2M\u012f\3\2\2\2O\u013a\3\2"+
		"\2\2Q\u013c\3\2\2\2S\u013e\3\2\2\2U\u0150\3\2\2\2W\u0154\3\2\2\2Y\u0156"+
		"\3\2\2\2[]\t\2\2\2\\[\3\2\2\2]^\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_`\3\2\2\2"+
		"`a\b\2\2\2a\4\3\2\2\2bd\t\3\2\2cb\3\2\2\2d\6\3\2\2\2ef\4\62;\2f\b\3\2"+
		"\2\2gh\7U\2\2hi\7G\2\2ij\7N\2\2jk\7G\2\2kl\7E\2\2lt\7V\2\2mn\7u\2\2no"+
		"\7g\2\2op\7n\2\2pq\7g\2\2qr\7e\2\2rt\7v\2\2sg\3\2\2\2sm\3\2\2\2t\n\3\2"+
		"\2\2uv\7R\2\2vw\7T\2\2wx\7Q\2\2xy\7L\2\2yz\7G\2\2z{\7E\2\2{\u0084\7V\2"+
		"\2|}\7r\2\2}~\7t\2\2~\177\7q\2\2\177\u0080\7l\2\2\u0080\u0081\7g\2\2\u0081"+
		"\u0082\7e\2\2\u0082\u0084\7v\2\2\u0083u\3\2\2\2\u0083|\3\2\2\2\u0084\f"+
		"\3\2\2\2\u0085\u0086\7T\2\2\u0086\u0087\7G\2\2\u0087\u0088\7P\2\2\u0088"+
		"\u0089\7C\2\2\u0089\u008a\7O\2\2\u008a\u0092\7G\2\2\u008b\u008c\7t\2\2"+
		"\u008c\u008d\7g\2\2\u008d\u008e\7p\2\2\u008e\u008f\7c\2\2\u008f\u0090"+
		"\7o\2\2\u0090\u0092\7g\2\2\u0091\u0085\3\2\2\2\u0091\u008b\3\2\2\2\u0092"+
		"\16\3\2\2\2\u0093\u0094\7-\2\2\u0094\20\3\2\2\2\u0095\u0096\7/\2\2\u0096"+
		"\22\3\2\2\2\u0097\u0098\7,\2\2\u0098\24\3\2\2\2\u0099\u009a\7?\2\2\u009a"+
		"\26\3\2\2\2\u009b\u009c\7>\2\2\u009c\u009d\7/\2\2\u009d\30\3\2\2\2\u009e"+
		"\u009f\7.\2\2\u009f\32\3\2\2\2\u00a0\u00a1\7=\2\2\u00a1\34\3\2\2\2\u00a2"+
		"\u00a3\7(\2\2\u00a3\u00a4\7(\2\2\u00a4\36\3\2\2\2\u00a5\u00a6\7~\2\2\u00a6"+
		"\u00a7\7~\2\2\u00a7 \3\2\2\2\u00a8\u00a9\7Q\2\2\u00a9\u00aa\7R\2\2\u00aa"+
		"\u00ab\7G\2\2\u00ab\u00ac\7P\2\2\u00ac\"\3\2\2\2\u00ad\u00ae\7E\2\2\u00ae"+
		"\u00af\7N\2\2\u00af\u00b0\7Q\2\2\u00b0\u00b1\7U\2\2\u00b1\u00b2\7G\2\2"+
		"\u00b2$\3\2\2\2\u00b3\u00b4\7Y\2\2\u00b4\u00b5\7T\2\2\u00b5\u00b6\7K\2"+
		"\2\u00b6\u00b7\7V\2\2\u00b7\u00b8\7G\2\2\u00b8&\3\2\2\2\u00b9\u00ba\7"+
		"G\2\2\u00ba\u00bb\7Z\2\2\u00bb\u00bc\7K\2\2\u00bc\u00bd\7V\2\2\u00bd("+
		"\3\2\2\2\u00be\u00bf\7U\2\2\u00bf\u00c0\7J\2\2\u00c0\u00c1\7Q\2\2\u00c1"+
		"\u00c2\7Y\2\2\u00c2*\3\2\2\2\u00c3\u00c4\7E\2\2\u00c4\u00c5\7T\2\2\u00c5"+
		"\u00c6\7G\2\2\u00c6\u00c7\7C\2\2\u00c7\u00c8\7V\2\2\u00c8\u00c9\7G\2\2"+
		"\u00c9,\3\2\2\2\u00ca\u00cb\7V\2\2\u00cb\u00cc\7C\2\2\u00cc\u00cd\7D\2"+
		"\2\u00cd\u00ce\7N\2\2\u00ce\u00cf\7G\2\2\u00cf.\3\2\2\2\u00d0\u00d1\7"+
		"R\2\2\u00d1\u00d2\7T\2\2\u00d2\u00d3\7K\2\2\u00d3\u00d4\7O\2\2\u00d4\u00d5"+
		"\7C\2\2\u00d5\u00d6\7T\2\2\u00d6\u00d7\7[\2\2\u00d7\60\3\2\2\2\u00d8\u00d9"+
		"\7H\2\2\u00d9\u00da\7Q\2\2\u00da\u00db\7T\2\2\u00db\u00dc\7G\2\2\u00dc"+
		"\u00dd\7K\2\2\u00dd\u00de\7I\2\2\u00de\u00df\7P\2\2\u00df\62\3\2\2\2\u00e0"+
		"\u00e1\7M\2\2\u00e1\u00e2\7G\2\2\u00e2\u00e3\7[\2\2\u00e3\64\3\2\2\2\u00e4"+
		"\u00e5\7W\2\2\u00e5\u00e6\7R\2\2\u00e6\u00e7\7F\2\2\u00e7\u00e8\7C\2\2"+
		"\u00e8\u00e9\7V\2\2\u00e9\u00ea\7G\2\2\u00ea\66\3\2\2\2\u00eb\u00ec\7"+
		"U\2\2\u00ec\u00ed\7G\2\2\u00ed\u00ee\7V\2\2\u00ee8\3\2\2\2\u00ef\u00f0"+
		"\7Y\2\2\u00f0\u00f1\7J\2\2\u00f1\u00f2\7G\2\2\u00f2\u00f3\7T\2\2\u00f3"+
		"\u00f4\7G\2\2\u00f4:\3\2\2\2\u00f5\u00f6\7K\2\2\u00f6\u00f7\7P\2\2\u00f7"+
		"\u00f8\7V\2\2\u00f8\u00f9\7G\2\2\u00f9\u00fa\7I\2\2\u00fa\u00fb\7G\2\2"+
		"\u00fb\u00fc\7T\2\2\u00fc<\3\2\2\2\u00fd\u00fe\7X\2\2\u00fe\u00ff\7C\2"+
		"\2\u00ff\u0100\7T\2\2\u0100\u0101\7E\2\2\u0101\u0102\7J\2\2\u0102\u0103"+
		"\7C\2\2\u0103\u0104\7T\2\2\u0104>\3\2\2\2\u0105\u0106\7T\2\2\u0106\u0107"+
		"\7G\2\2\u0107\u0108\7N\2\2\u0108\u0109\7C\2\2\u0109\u010a\7V\2\2\u010a"+
		"\u010b\7K\2\2\u010b\u010c\7Q\2\2\u010c\u010d\7P\2\2\u010d@\3\2\2\2\u010e"+
		"\u010f\7K\2\2\u010f\u0110\7P\2\2\u0110\u0111\7U\2\2\u0111\u0112\7G\2\2"+
		"\u0112\u0113\7T\2\2\u0113\u0114\7V\2\2\u0114B\3\2\2\2\u0115\u0116\7K\2"+
		"\2\u0116\u0117\7P\2\2\u0117\u0118\7V\2\2\u0118\u0119\7Q\2\2\u0119D\3\2"+
		"\2\2\u011a\u011b\7F\2\2\u011b\u011c\7G\2\2\u011c\u011d\7N\2\2\u011d\u011e"+
		"\7G\2\2\u011e\u011f\7V\2\2\u011f\u0120\7G\2\2\u0120F\3\2\2\2\u0121\u0122"+
		"\7X\2\2\u0122\u0123\7C\2\2\u0123\u0124\7N\2\2\u0124\u0125\7W\2\2\u0125"+
		"\u0126\7G\2\2\u0126\u0127\7U\2\2\u0127H\3\2\2\2\u0128\u0129\7H\2\2\u0129"+
		"\u012a\7T\2\2\u012a\u012b\7Q\2\2\u012b\u012c\7O\2\2\u012cJ\3\2\2\2\u012d"+
		"\u012e\7*\2\2\u012eL\3\2\2\2\u012f\u0130\7+\2\2\u0130N\3\2\2\2\u0131\u0132"+
		"\7?\2\2\u0132\u013b\7?\2\2\u0133\u0134\7#\2\2\u0134\u013b\7?\2\2\u0135"+
		"\u013b\t\4\2\2\u0136\u0137\7>\2\2\u0137\u013b\7?\2\2\u0138\u0139\7@\2"+
		"\2\u0139\u013b\7?\2\2\u013a\u0131\3\2\2\2\u013a\u0133\3\2\2\2\u013a\u0135"+
		"\3\2\2\2\u013a\u0136\3\2\2\2\u013a\u0138\3\2\2\2\u013bP\3\2\2\2\u013c"+
		"\u013d\7$\2\2\u013dR\3\2\2\2\u013e\u0143\5\5\3\2\u013f\u0142\5\5\3\2\u0140"+
		"\u0142\5\7\4\2\u0141\u013f\3\2\2\2\u0141\u0140\3\2\2\2\u0142\u0145\3\2"+
		"\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144T\3\2\2\2\u0145\u0143"+
		"\3\2\2\2\u0146\u0151\5;\36\2\u0147\u0148\5=\37\2\u0148\u014a\5K&\2\u0149"+
		"\u014b\5\7\4\2\u014a\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014a\3\2"+
		"\2\2\u014c\u014d\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f\5M\'\2\u014f"+
		"\u0151\3\2\2\2\u0150\u0146\3\2\2\2\u0150\u0147\3\2\2\2\u0151V\3\2\2\2"+
		"\u0152\u0155\5\7\4\2\u0153\u0155\5S*\2\u0154\u0152\3\2\2\2\u0154\u0153"+
		"\3\2\2\2\u0155X\3\2\2\2\u0156\u0157\5S*\2\u0157\u0158\5\25\13\2\u0158"+
		"\u0159\5\7\4\2\u0159Z\3\2\2\2\16\2^cs\u0083\u0091\u013a\u0141\u0143\u014c"+
		"\u0150\u0154\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}