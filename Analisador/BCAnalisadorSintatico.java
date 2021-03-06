/* Generated By:JavaCC: Do not edit this line. BCAnalisadorSintatico.java */
import java.io.*;

public class BCAnalisadorSintatico implements BCAnalisadorSintaticoConstants {

  public  static void main(String args[])
  {

    String nome_arquivo = args[0];
    BCAnalisadorSintatico analisador;

    try {
        analisador = new BCAnalisadorSintatico(new java.io.FileInputStream(nome_arquivo));
    }
    catch (java.io.FileNotFoundException e) {
        System.out.println("Arquivo " + nome_arquivo + " nao foi encontrado.");
        return;
    }

    try {
      analisador.start();
      System.out.println("Programa analisado com sucesso.");
    } catch(ParseException e) {
      System.out.println(e.getMessage());
    }

  }

  static final public void start() throws ParseException {
    trace_call("start");
    try {
  /*var locais*/
    int value;
      bc();
      jj_consume_token(0);
    } finally {
      trace_return("start");
    }
  }

/* <bc> ::= (<comando> | <definição de função>)+ */
  static final public void bc() throws ParseException {
    trace_call("bc");
    try {
      label_1:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case MINUS:
        case PLUSPLUS:
        case MINUSMINUS:
        case NOT:
        case OPEN_PAR:
        case OPEN_BRACE:
        case SEMICOLON:
        case DOT:
        case IBASE:
        case SCALE:
        case LAST:
        case OBASE:
        case SQRT:
        case LENGTH:
        case FUNC_S:
        case FUNC_C:
        case FUNC_E:
        case FUNC_A:
        case FUNC_J:
        case IF:
        case WHILE:
        case FOR:
        case PRINT:
        case BREAK:
        case CONTINUE:
        case QUIT:
        case RETURN:
        case NUM:
        case ID:
        case STRING:
          comando();
          break;
        case DEFINE:
          def_funcao();
          break;
        default:
          jj_la1[0] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case MINUS:
        case PLUSPLUS:
        case MINUSMINUS:
        case NOT:
        case OPEN_PAR:
        case OPEN_BRACE:
        case SEMICOLON:
        case DOT:
        case IBASE:
        case SCALE:
        case LAST:
        case OBASE:
        case SQRT:
        case LENGTH:
        case FUNC_S:
        case FUNC_C:
        case FUNC_E:
        case FUNC_A:
        case FUNC_J:
        case IF:
        case WHILE:
        case FOR:
        case PRINT:
        case DEFINE:
        case BREAK:
        case CONTINUE:
        case QUIT:
        case RETURN:
        case NUM:
        case ID:
        case STRING:
          ;
          break;
        default:
          jj_la1[1] = jj_gen;
          break label_1;
        }
      }
    } finally {
      trace_return("bc");
    }
  }

  static final public void comando() throws ParseException {
    trace_call("comando");
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case MINUS:
      case PLUSPLUS:
      case MINUSMINUS:
      case NOT:
      case OPEN_PAR:
      case DOT:
      case IBASE:
      case SCALE:
      case LAST:
      case OBASE:
      case SQRT:
      case LENGTH:
      case FUNC_S:
      case FUNC_C:
      case FUNC_E:
      case FUNC_A:
      case FUNC_J:
      case NUM:
      case ID:
        E();
        break;
      case OPEN_BRACE:
        comando_composto();
        break;
      case IF:
        IF_COMMAND();
        break;
      case WHILE:
        WHILE_COMMAND();
        break;
      case FOR:
        FOR_COMMAND();
        break;
      case SEMICOLON:
        NULL_COMMAND();
        break;
      case BREAK:
        BREAK_COMMAND();
        break;
      case CONTINUE:
        CONTINUE_COMMAND();
        break;
      case QUIT:
        QUIT_COMMAND();
        break;
      case PRINT:
        PRINT_COMMAND();
        break;
      case STRING:
        STRING_COMMAND();
        break;
      case RETURN:
        RETURN_COMMAND();
        break;
      default:
        jj_la1[2] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } finally {
      trace_return("comando");
    }
  }

/* <comando_composto> ::= { <ListaComandos> } */
  static final public void comando_composto() throws ParseException {
    trace_call("comando_composto");
    try {
      jj_consume_token(OPEN_BRACE);
      ListaComandos();
      jj_consume_token(CLOSE_BRACE);
    } finally {
      trace_return("comando_composto");
    }
  }

/* <ListaComandos> ::= <comando> (<separador> <comando>)* */
  static final public void ListaComandos() throws ParseException {
    trace_call("ListaComandos");
    try {
      comando();
      label_2:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case SEPARADOR:
          ;
          break;
        default:
          jj_la1[3] = jj_gen;
          break label_2;
        }
        jj_consume_token(SEPARADOR);
        comando();
      }
    } finally {
      trace_return("ListaComandos");
    }
  }

/* <IF> ::= if ( <E> ) <comando> [ else <comando> ] */
  static final public void IF_COMMAND() throws ParseException {
    trace_call("IF_COMMAND");
    try {
      jj_consume_token(IF);
      jj_consume_token(OPEN_PAR);
      E();
      jj_consume_token(CLOSE_PAR);
      comando();
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case ELSE:
        jj_consume_token(ELSE);
        comando();
        break;
      default:
        jj_la1[4] = jj_gen;
        ;
      }
    } finally {
      trace_return("IF_COMMAND");
    }
  }

/* <WHILE> ::= while ( <E> ) <comando> */
  static final public void WHILE_COMMAND() throws ParseException {
    trace_call("WHILE_COMMAND");
    try {
      jj_consume_token(WHILE);
      jj_consume_token(OPEN_PAR);
      E();
      jj_consume_token(CLOSE_PAR);
      comando();
    } finally {
      trace_return("WHILE_COMMAND");
    }
  }

/* <FOR> ::= for ( [<E>] ; [<E>] ; [<E>] ) <comando> */
  static final public void FOR_COMMAND() throws ParseException {
    trace_call("FOR_COMMAND");
    try {
      jj_consume_token(FOR);
      jj_consume_token(OPEN_PAR);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case MINUS:
      case PLUSPLUS:
      case MINUSMINUS:
      case NOT:
      case OPEN_PAR:
      case DOT:
      case IBASE:
      case SCALE:
      case LAST:
      case OBASE:
      case SQRT:
      case LENGTH:
      case FUNC_S:
      case FUNC_C:
      case FUNC_E:
      case FUNC_A:
      case FUNC_J:
      case NUM:
      case ID:
        E();
        break;
      default:
        jj_la1[5] = jj_gen;
        ;
      }
      jj_consume_token(SEMICOLON);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case MINUS:
      case PLUSPLUS:
      case MINUSMINUS:
      case NOT:
      case OPEN_PAR:
      case DOT:
      case IBASE:
      case SCALE:
      case LAST:
      case OBASE:
      case SQRT:
      case LENGTH:
      case FUNC_S:
      case FUNC_C:
      case FUNC_E:
      case FUNC_A:
      case FUNC_J:
      case NUM:
      case ID:
        E();
        break;
      default:
        jj_la1[6] = jj_gen;
        ;
      }
      jj_consume_token(SEMICOLON);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case MINUS:
      case PLUSPLUS:
      case MINUSMINUS:
      case NOT:
      case OPEN_PAR:
      case DOT:
      case IBASE:
      case SCALE:
      case LAST:
      case OBASE:
      case SQRT:
      case LENGTH:
      case FUNC_S:
      case FUNC_C:
      case FUNC_E:
      case FUNC_A:
      case FUNC_J:
      case NUM:
      case ID:
        E();
        break;
      default:
        jj_la1[7] = jj_gen;
        ;
      }
      jj_consume_token(CLOSE_PAR);
      comando();
    } finally {
      trace_return("FOR_COMMAND");
    }
  }

/* <NULL> ::= ; */
  static final public void NULL_COMMAND() throws ParseException {
    trace_call("NULL_COMMAND");
    try {
      jj_consume_token(SEMICOLON);
    } finally {
      trace_return("NULL_COMMAND");
    }
  }

/* <BREAK> ::= break*/
  static final public void BREAK_COMMAND() throws ParseException {
    trace_call("BREAK_COMMAND");
    try {
      jj_consume_token(BREAK);
    } finally {
      trace_return("BREAK_COMMAND");
    }
  }

/* <CONTINUE> ::= continue */
  static final public void CONTINUE_COMMAND() throws ParseException {
    trace_call("CONTINUE_COMMAND");
    try {
      jj_consume_token(CONTINUE);
    } finally {
      trace_return("CONTINUE_COMMAND");
    }
  }

/* <QUIT> ::= quit*/
  static final public void QUIT_COMMAND() throws ParseException {
    trace_call("QUIT_COMMAND");
    try {
      jj_consume_token(QUIT);
    } finally {
      trace_return("QUIT_COMMAND");
    }
  }

/* <PRINT> ::= print <ListaExpressões> */
  static final public void PRINT_COMMAND() throws ParseException {
    trace_call("PRINT_COMMAND");
    try {
      jj_consume_token(PRINT);
      ListaExpressoes();
    } finally {
      trace_return("PRINT_COMMAND");
    }
  }

/* <STRING_COMMAND> ::= <STRING>*/
  static final public void STRING_COMMAND() throws ParseException {
    trace_call("STRING_COMMAND");
    try {
      jj_consume_token(STRING);
    } finally {
      trace_return("STRING_COMMAND");
    }
  }

/* <ListaExpressões> ::= <E> ( , <E>)* */
  static final public void ListaExpressoes() throws ParseException {
    trace_call("ListaExpressoes");
    try {
      E();
      label_3:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case COMMA:
          ;
          break;
        default:
          jj_la1[8] = jj_gen;
          break label_3;
        }
        jj_consume_token(COMMA);
        E();
      }
    } finally {
      trace_return("ListaExpressoes");
    }
  }

/*<RETORNO> ::= return ( [<E>] ) | return [<E>] */
  static final public void RETURN_COMMAND() throws ParseException {
    trace_call("RETURN_COMMAND");
    try {
      jj_consume_token(RETURN);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case OPEN_PAR:
        jj_consume_token(OPEN_PAR);
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case MINUS:
        case PLUSPLUS:
        case MINUSMINUS:
        case NOT:
        case OPEN_PAR:
        case DOT:
        case IBASE:
        case SCALE:
        case LAST:
        case OBASE:
        case SQRT:
        case LENGTH:
        case FUNC_S:
        case FUNC_C:
        case FUNC_E:
        case FUNC_A:
        case FUNC_J:
        case NUM:
        case ID:
          E();
          break;
        default:
          jj_la1[9] = jj_gen;
          ;
        }
        jj_consume_token(CLOSE_PAR);
        break;
      default:
        jj_la1[11] = jj_gen;
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case MINUS:
        case PLUSPLUS:
        case MINUSMINUS:
        case NOT:
        case OPEN_PAR:
        case DOT:
        case IBASE:
        case SCALE:
        case LAST:
        case OBASE:
        case SQRT:
        case LENGTH:
        case FUNC_S:
        case FUNC_C:
        case FUNC_E:
        case FUNC_A:
        case FUNC_J:
        case NUM:
        case ID:
          E();
          break;
        default:
          jj_la1[10] = jj_gen;
          ;
        }
      }
    } finally {
      trace_return("RETURN_COMMAND");
    }
  }

/* <E>::= <E1> ( || <E1> )* */
  static final public void E() throws ParseException {
    trace_call("E");
    try {
 Token t;
      E1();
      label_4:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case OR:
          ;
          break;
        default:
          jj_la1[12] = jj_gen;
          break label_4;
        }
        jj_consume_token(OR);
        E1();
      }
    } finally {
      trace_return("E");
    }
  }

/* <E1>::= <E2> ( && <E2> )* */
  static final public void E1() throws ParseException {
    trace_call("E1");
    try {
      E2();
      label_5:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case AND:
          ;
          break;
        default:
          jj_la1[13] = jj_gen;
          break label_5;
        }
        jj_consume_token(AND);
        E2();
      }
    } finally {
      trace_return("E1");
    }
  }

/* <E2>::= [ ! ] <E3> */
  static final public void E2() throws ParseException {
    trace_call("E2");
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case NOT:
        jj_consume_token(NOT);
        break;
      default:
        jj_la1[14] = jj_gen;
        ;
      }
      E3();
    } finally {
      trace_return("E2");
    }
  }

/* <E3> ::= <E4> [ (== | <= | >= | != | < | > ) <E4> ] */
  static final public void E3() throws ParseException {
    trace_call("E3");
    try {
      E4();
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case BIGGER_THAN:
      case SMALLER_THAN:
      case BIGGER_EQUAL_THAN:
      case SMALLER_EQUAL_THAN:
      case EQUAL:
      case NOT_EQUAL:
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case EQUAL:
          jj_consume_token(EQUAL);
          break;
        case SMALLER_EQUAL_THAN:
          jj_consume_token(SMALLER_EQUAL_THAN);
          break;
        case BIGGER_EQUAL_THAN:
          jj_consume_token(BIGGER_EQUAL_THAN);
          break;
        case NOT_EQUAL:
          jj_consume_token(NOT_EQUAL);
          break;
        case SMALLER_THAN:
          jj_consume_token(SMALLER_THAN);
          break;
        case BIGGER_THAN:
          jj_consume_token(BIGGER_THAN);
          break;
        default:
          jj_la1[15] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        E4();
        break;
      default:
        jj_la1[16] = jj_gen;
        ;
      }
    } finally {
      trace_return("E3");
    }
  }

/* <E4> ::= <ID> [ [<E>] ] ( = | += | -= | *= | /= | %= | ^= ) <E4> | <E5>*/
  static final public void E4() throws ParseException {
    trace_call("E4");
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case ID:
        jj_consume_token(ID);
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case OPEN_BRACK:
          jj_consume_token(OPEN_BRACK);
          E();
          jj_consume_token(CLOSE_BRACK);
          break;
        default:
          jj_la1[17] = jj_gen;
          ;
        }
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case ASSIGN_SYMBOL:
          jj_consume_token(ASSIGN_SYMBOL);
          break;
        case PLUS_ASSIGN:
          jj_consume_token(PLUS_ASSIGN);
          break;
        case MINUS_ASSIGN:
          jj_consume_token(MINUS_ASSIGN);
          break;
        case MUL_ASSIGN:
          jj_consume_token(MUL_ASSIGN);
          break;
        case DIV_ASSIGN:
          jj_consume_token(DIV_ASSIGN);
          break;
        case MOD_ASSIGN:
          jj_consume_token(MOD_ASSIGN);
          break;
        case POWER_ASSIGN:
          jj_consume_token(POWER_ASSIGN);
          break;
        default:
          jj_la1[18] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        E4();
        break;
      case MINUS:
      case PLUSPLUS:
      case MINUSMINUS:
      case OPEN_PAR:
      case DOT:
      case IBASE:
      case SCALE:
      case LAST:
      case OBASE:
      case SQRT:
      case LENGTH:
      case FUNC_S:
      case FUNC_C:
      case FUNC_E:
      case FUNC_A:
      case FUNC_J:
      case NUM:
        E5();
        break;
      default:
        jj_la1[19] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } finally {
      trace_return("E4");
    }
  }

/* <E5>::= <E6> ( ( + | - ) <E6> )* */
  static final public void E5() throws ParseException {
    trace_call("E5");
    try {
      E6();
      label_6:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case PLUS:
        case MINUS:
          ;
          break;
        default:
          jj_la1[20] = jj_gen;
          break label_6;
        }
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case PLUS:
          jj_consume_token(PLUS);
          break;
        case MINUS:
          jj_consume_token(MINUS);
          break;
        default:
          jj_la1[21] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        E6();
      }
    } finally {
      trace_return("E5");
    }
  }

/* <E6>::= <E7> ( ( * | / | % ) <E7> )* */
  static final public void E6() throws ParseException {
    trace_call("E6");
    try {
      E7();
      label_7:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case DIV:
        case MUL:
        case MOD:
          ;
          break;
        default:
          jj_la1[22] = jj_gen;
          break label_7;
        }
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case MUL:
          jj_consume_token(MUL);
          break;
        case DIV:
          jj_consume_token(DIV);
          break;
        case MOD:
          jj_consume_token(MOD);
          break;
        default:
          jj_la1[23] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        E7();
      }
    } finally {
      trace_return("E6");
    }
  }

/* <E7>::= <E8> [ ^ <E7> ] */
  static final public void E7() throws ParseException {
    trace_call("E7");
    try {
      E8();
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case POWER:
        jj_consume_token(POWER);
        E7();
        break;
      default:
        jj_la1[24] = jj_gen;
        ;
      }
    } finally {
      trace_return("E7");
    }
  }

/* <E8> ::= [ - ] <E9> */
  static final public void E8() throws ParseException {
    trace_call("E8");
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case MINUS:
        jj_consume_token(MINUS);
        break;
      default:
        jj_la1[25] = jj_gen;
        ;
      }
      E9();
    } finally {
      trace_return("E8");
    }
  }

/* <E9> ::= (++ | --) <ID> [ [ <E> ] ] | <ID> [ [ <E> ] ] (++ | --) | <E10> */
  static final public void E9() throws ParseException {
    trace_call("E9");
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case PLUSPLUS:
      case MINUSMINUS:
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case PLUSPLUS:
          jj_consume_token(PLUSPLUS);
          break;
        case MINUSMINUS:
          jj_consume_token(MINUSMINUS);
          break;
        default:
          jj_la1[26] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        jj_consume_token(ID);
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case OPEN_BRACK:
          jj_consume_token(OPEN_BRACK);
          E();
          jj_consume_token(CLOSE_BRACK);
          break;
        default:
          jj_la1[27] = jj_gen;
          ;
        }
        break;
      case ID:
        jj_consume_token(ID);
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case OPEN_BRACK:
          jj_consume_token(OPEN_BRACK);
          E();
          jj_consume_token(CLOSE_BRACK);
          break;
        default:
          jj_la1[28] = jj_gen;
          ;
        }
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case PLUSPLUS:
          jj_consume_token(PLUSPLUS);
          break;
        case MINUSMINUS:
          jj_consume_token(MINUSMINUS);
          break;
        default:
          jj_la1[29] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        break;
      case OPEN_PAR:
      case DOT:
      case IBASE:
      case SCALE:
      case LAST:
      case OBASE:
      case SQRT:
      case LENGTH:
      case FUNC_S:
      case FUNC_C:
      case FUNC_E:
      case FUNC_A:
      case FUNC_J:
      case NUM:
        E10();
        break;
      default:
        jj_la1[30] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } finally {
      trace_return("E9");
    }
  }

/* <E10> ::= <INT> | <FLOAT> |( <E> ) | sqrt ( <E> ) | length ( <E> ) | scale ( <E> ) | <chamada_função> | <ID> [ [ <E> ] ]| ibase | obase | scale | last | . | s (<E>) | c (<E>) | e (<E>) | l (<E>) | a (<E>) | j (<E> , <E>) */
//TODO chamada_funcao
  static final public void E10() throws ParseException {
    trace_call("E10");
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case NUM:
        jj_consume_token(NUM);
        break;
      case OPEN_PAR:
        jj_consume_token(OPEN_PAR);
        E();
        jj_consume_token(CLOSE_PAR);
        break;
      case SQRT:
        jj_consume_token(SQRT);
        jj_consume_token(OPEN_PAR);
        E();
        jj_consume_token(CLOSE_PAR);
        break;
      case LENGTH:
        jj_consume_token(LENGTH);
        jj_consume_token(OPEN_PAR);
        E();
        jj_consume_token(CLOSE_PAR);
        break;
      case SCALE:
        jj_consume_token(SCALE);
        jj_consume_token(OPEN_PAR);
        E();
        jj_consume_token(CLOSE_PAR);
        break;
      case ID:
        chamada_funcao();
        break;
      case IBASE:
        jj_consume_token(IBASE);
        break;
      case OBASE:
        jj_consume_token(OBASE);
        break;
      case LAST:
        jj_consume_token(LAST);
        break;
      case DOT:
        jj_consume_token(DOT);
        break;
      case FUNC_S:
        jj_consume_token(FUNC_S);
        jj_consume_token(OPEN_PAR);
        E();
        jj_consume_token(CLOSE_PAR);
        break;
      case FUNC_C:
        jj_consume_token(FUNC_C);
        jj_consume_token(OPEN_PAR);
        E();
        jj_consume_token(CLOSE_PAR);
        break;
      case FUNC_E:
        jj_consume_token(FUNC_E);
        jj_consume_token(OPEN_PAR);
        E();
        jj_consume_token(CLOSE_PAR);
        break;
      case FUNC_A:
        jj_consume_token(FUNC_A);
        jj_consume_token(OPEN_PAR);
        E();
        jj_consume_token(CLOSE_PAR);
        break;
      case FUNC_J:
        jj_consume_token(FUNC_J);
        jj_consume_token(OPEN_PAR);
        E();
        jj_consume_token(COMMA);
        E();
        jj_consume_token(CLOSE_PAR);
        break;
      default:
        jj_la1[31] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } finally {
      trace_return("E10");
    }
  }

/* <chamada_função> ::= <ID> ( [ <ListaExpressões> ] )*/
  static final public void chamada_funcao() throws ParseException {
    trace_call("chamada_funcao");
    try {
      jj_consume_token(ID);
      jj_consume_token(OPEN_PAR);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case MINUS:
      case PLUSPLUS:
      case MINUSMINUS:
      case NOT:
      case OPEN_PAR:
      case DOT:
      case IBASE:
      case SCALE:
      case LAST:
      case OBASE:
      case SQRT:
      case LENGTH:
      case FUNC_S:
      case FUNC_C:
      case FUNC_E:
      case FUNC_A:
      case FUNC_J:
      case NUM:
      case ID:
        ListaExpressoes();
        break;
      default:
        jj_la1[32] = jj_gen;
        ;
      }
      jj_consume_token(CLOSE_PAR);
    } finally {
      trace_return("chamada_funcao");
    }
  }

/* <definição de função> ::= define <ID> ( [ <ListaVar>] ) {
[auto <ListaVar>] <ListaComandos> } */
  static final public void def_funcao() throws ParseException {
    trace_call("def_funcao");
    try {
      jj_consume_token(DEFINE);
      jj_consume_token(ID);
      jj_consume_token(OPEN_PAR);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case ID:
        ListaVar();
        break;
      default:
        jj_la1[33] = jj_gen;
        ;
      }
      jj_consume_token(CLOSE_PAR);
      jj_consume_token(OPEN_BRACE);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case AUTO:
        jj_consume_token(AUTO);
        ListaVar();
        break;
      default:
        jj_la1[34] = jj_gen;
        ;
      }
      ListaComandos();
      jj_consume_token(CLOSE_BRACE);
    } finally {
      trace_return("def_funcao");
    }
  }

 /* <ListaVar> ::= <ID> [ [ ] ] ( , <ID> [ [ ] ])* */
  static final public void ListaVar() throws ParseException {
    trace_call("ListaVar");
    try {
      jj_consume_token(ID);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case OPEN_BRACK:
        jj_consume_token(OPEN_BRACK);
        jj_consume_token(CLOSE_BRACK);
        break;
      default:
        jj_la1[35] = jj_gen;
        ;
      }
      label_8:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case COMMA:
          ;
          break;
        default:
          jj_la1[36] = jj_gen;
          break label_8;
        }
        jj_consume_token(COMMA);
        jj_consume_token(ID);
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case OPEN_BRACK:
          jj_consume_token(OPEN_BRACK);
          jj_consume_token(CLOSE_BRACK);
          break;
        default:
          jj_la1[37] = jj_gen;
          ;
        }
      }
    } finally {
      trace_return("ListaVar");
    }
  }

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public BCAnalisadorSintaticoTokenManager token_source;
  static SimpleCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[38];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static private int[] jj_la1_2;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
      jj_la1_init_2();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x130800,0x130800,0x130800,0x0,0x0,0x130800,0x130800,0x130800,0x0,0x130800,0x130800,0x0,0x40000,0x80000,0x100000,0xf8000000,0xf8000000,0x0,0x7e00000,0x30800,0xc00,0xc00,0x7000,0x7000,0x8000,0x800,0x30000,0x0,0x0,0x30000,0x30000,0x0,0x130800,0x0,0x0,0x0,0x0,0x0,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x7bbfe44a,0x7bbfe44a,0x3bbfe44a,0x1000,0x4000000,0x1bfe402,0x1bfe402,0x1bfe402,0x20,0x1bfe402,0x1bfe402,0x2,0x0,0x0,0x0,0x1,0x1,0x100,0x800,0x1bfe402,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x100,0x100,0x0,0x1bfe402,0x1bfe402,0x1bfe402,0x0,0x80000000,0x100,0x20,0x100,};
   }
   private static void jj_la1_init_2() {
      jj_la1_2 = new int[] {0x1a0f,0x1a0f,0x1a0f,0x0,0x0,0xa00,0xa00,0xa00,0x0,0xa00,0xa00,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0xa00,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0xa00,0xa00,0xa00,0x800,0x0,0x0,0x0,0x0,};
   }

  /** Constructor with InputStream. */
  public BCAnalisadorSintatico(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public BCAnalisadorSintatico(java.io.InputStream stream, String encoding) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser.  ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new BCAnalisadorSintaticoTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 38; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 38; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public BCAnalisadorSintatico(java.io.Reader stream) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new BCAnalisadorSintaticoTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 38; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 38; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public BCAnalisadorSintatico(BCAnalisadorSintaticoTokenManager tm) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 38; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(BCAnalisadorSintaticoTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 38; i++) jj_la1[i] = -1;
  }

  static private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      trace_token(token, "");
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  static final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
      trace_token(token, " (in getNextToken)");
    return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  static private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  static private int[] jj_expentry;
  static private int jj_kind = -1;

  /** Generate ParseException. */
  static public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[77];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 38; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
          if ((jj_la1_2[i] & (1<<j)) != 0) {
            la1tokens[64+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 77; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  static private int trace_indent = 0;
  static private boolean trace_enabled = true;

/** Enable tracing. */
  static final public void enable_tracing() {
    trace_enabled = true;
  }

/** Disable tracing. */
  static final public void disable_tracing() {
    trace_enabled = false;
  }

  static private void trace_call(String s) {
    if (trace_enabled) {
      for (int i = 0; i < trace_indent; i++) { System.out.print(" "); }
      System.out.println("Call:   " + s);
    }
    trace_indent = trace_indent + 2;
  }

  static private void trace_return(String s) {
    trace_indent = trace_indent - 2;
    if (trace_enabled) {
      for (int i = 0; i < trace_indent; i++) { System.out.print(" "); }
      System.out.println("Return: " + s);
    }
  }

  static private void trace_token(Token t, String where) {
    if (trace_enabled) {
      for (int i = 0; i < trace_indent; i++) { System.out.print(" "); }
      System.out.print("Consumed token: <" + tokenImage[t.kind]);
      if (t.kind != 0 && !tokenImage[t.kind].equals("\"" + t.image + "\"")) {
        System.out.print(": \"" + t.image + "\"");
      }
      System.out.println(" at line " + t.beginLine + " column " + t.beginColumn + ">" + where);
    }
  }

  static private void trace_scan(Token t1, int t2) {
    if (trace_enabled) {
      for (int i = 0; i < trace_indent; i++) { System.out.print(" "); }
      System.out.print("Visited token: <" + tokenImage[t1.kind]);
      if (t1.kind != 0 && !tokenImage[t1.kind].equals("\"" + t1.image + "\"")) {
        System.out.print(": \"" + t1.image + "\"");
      }
      System.out.println(" at line " + t1.beginLine + " column " + t1.beginColumn + ">; Expected token: <" + tokenImage[t2] + ">");
    }
  }

}
