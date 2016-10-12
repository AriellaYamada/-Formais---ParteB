/* Generated By:JavaCC: Do not edit this line. BCAnalisadorSintaticoConstants.java */

/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface BCAnalisadorSintaticoConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int LINE_BREAK = 9;
  /** RegularExpression Id. */
  int PLUS = 10;
  /** RegularExpression Id. */
  int MINUS = 11;
  /** RegularExpression Id. */
  int DIV = 12;
  /** RegularExpression Id. */
  int MUL = 13;
  /** RegularExpression Id. */
  int MOD = 14;
  /** RegularExpression Id. */
  int POWER = 15;
  /** RegularExpression Id. */
  int PLUSPLUS = 16;
  /** RegularExpression Id. */
  int MINUSMINUS = 17;
  /** RegularExpression Id. */
  int OR = 18;
  /** RegularExpression Id. */
  int AND = 19;
  /** RegularExpression Id. */
  int NOT = 20;
  /** RegularExpression Id. */
  int MINUS_ASSIGN = 21;
  /** RegularExpression Id. */
  int PLUS_ASSIGN = 22;
  /** RegularExpression Id. */
  int DIV_ASSIGN = 23;
  /** RegularExpression Id. */
  int MUL_ASSIGN = 24;
  /** RegularExpression Id. */
  int MOD_ASSIGN = 25;
  /** RegularExpression Id. */
  int POWER_ASSIGN = 26;
  /** RegularExpression Id. */
  int BIGGER_THAN = 27;
  /** RegularExpression Id. */
  int SMALLER_THAN = 28;
  /** RegularExpression Id. */
  int BIGGER_EQUAL_THAN = 29;
  /** RegularExpression Id. */
  int SMALLER_EQUAL_THAN = 30;
  /** RegularExpression Id. */
  int EQUAL = 31;
  /** RegularExpression Id. */
  int NOT_EQUAL = 32;
  /** RegularExpression Id. */
  int OPEN_PAR = 33;
  /** RegularExpression Id. */
  int CLOSE_PAR = 34;
  /** RegularExpression Id. */
  int OPEN_BRACE = 35;
  /** RegularExpression Id. */
  int CLOSE_BRACE = 36;
  /** RegularExpression Id. */
  int COMMA = 37;
  /** RegularExpression Id. */
  int SEMICOLON = 38;
  /** RegularExpression Id. */
  int QUOT = 39;
  /** RegularExpression Id. */
  int OPEN_BRACK = 40;
  /** RegularExpression Id. */
  int CLOSE_BRACK = 41;
  /** RegularExpression Id. */
  int DOT = 42;
  /** RegularExpression Id. */
  int ASSIGN_SYMBOL = 43;
  /** RegularExpression Id. */
  int SEPARADOR = 44;
  /** RegularExpression Id. */
  int IBASE = 45;
  /** RegularExpression Id. */
  int SCALE = 46;
  /** RegularExpression Id. */
  int LAST = 47;
  /** RegularExpression Id. */
  int OBASE = 48;
  /** RegularExpression Id. */
  int SQRT = 49;
  /** RegularExpression Id. */
  int LENGTH = 50;
  /** RegularExpression Id. */
  int FUNC_S = 51;
  /** RegularExpression Id. */
  int FUNC_C = 52;
  /** RegularExpression Id. */
  int FUNC_E = 53;
  /** RegularExpression Id. */
  int FUNC_L = 54;
  /** RegularExpression Id. */
  int FUNC_A = 55;
  /** RegularExpression Id. */
  int FUNC_J = 56;
  /** RegularExpression Id. */
  int IF = 57;
  /** RegularExpression Id. */
  int ELSE = 58;
  /** RegularExpression Id. */
  int WHILE = 59;
  /** RegularExpression Id. */
  int FOR = 60;
  /** RegularExpression Id. */
  int PRINT = 61;
  /** RegularExpression Id. */
  int DEFINE = 62;
  /** RegularExpression Id. */
  int AUTO = 63;
  /** RegularExpression Id. */
  int BREAK = 64;
  /** RegularExpression Id. */
  int CONTINUE = 65;
  /** RegularExpression Id. */
  int QUIT = 66;
  /** RegularExpression Id. */
  int RETURN = 67;
  /** RegularExpression Id. */
  int DIGIT = 68;
  /** RegularExpression Id. */
  int LETTER = 69;
  /** RegularExpression Id. */
  int SYMBOL = 70;
  /** RegularExpression Id. */
  int INTEGER = 71;
  /** RegularExpression Id. */
  int REAL = 72;
  /** RegularExpression Id. */
  int NUM = 73;
  /** RegularExpression Id. */
  int ALPHANUMERIC = 74;
  /** RegularExpression Id. */
  int ID = 75;
  /** RegularExpression Id. */
  int STRING = 76;

  /** Lexical state. */
  int DEFAULT = 0;
  /** Lexical state. */
  int multilinecomment = 1;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\r\"",
    "<token of kind 5>",
    "\"/*\"",
    "\"*/\"",
    "<token of kind 8>",
    "<LINE_BREAK>",
    "<PLUS>",
    "<MINUS>",
    "<DIV>",
    "<MUL>",
    "<MOD>",
    "<POWER>",
    "<PLUSPLUS>",
    "<MINUSMINUS>",
    "<OR>",
    "<AND>",
    "<NOT>",
    "<MINUS_ASSIGN>",
    "<PLUS_ASSIGN>",
    "<DIV_ASSIGN>",
    "<MUL_ASSIGN>",
    "<MOD_ASSIGN>",
    "<POWER_ASSIGN>",
    "<BIGGER_THAN>",
    "<SMALLER_THAN>",
    "<BIGGER_EQUAL_THAN>",
    "<SMALLER_EQUAL_THAN>",
    "<EQUAL>",
    "<NOT_EQUAL>",
    "<OPEN_PAR>",
    "<CLOSE_PAR>",
    "<OPEN_BRACE>",
    "<CLOSE_BRACE>",
    "<COMMA>",
    "<SEMICOLON>",
    "<QUOT>",
    "<OPEN_BRACK>",
    "<CLOSE_BRACK>",
    "<DOT>",
    "<ASSIGN_SYMBOL>",
    "<SEPARADOR>",
    "<IBASE>",
    "<SCALE>",
    "<LAST>",
    "<OBASE>",
    "<SQRT>",
    "<LENGTH>",
    "\"s\"",
    "\"c\"",
    "\"e\"",
    "\"l\"",
    "\"a\"",
    "\"j\"",
    "<IF>",
    "<ELSE>",
    "<WHILE>",
    "<FOR>",
    "<PRINT>",
    "<DEFINE>",
    "<AUTO>",
    "<BREAK>",
    "<CONTINUE>",
    "<QUIT>",
    "<RETURN>",
    "<DIGIT>",
    "<LETTER>",
    "<SYMBOL>",
    "<INTEGER>",
    "<REAL>",
    "<NUM>",
    "<ALPHANUMERIC>",
    "<ID>",
    "<STRING>",
  };

}
