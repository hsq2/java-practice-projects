public enum Symbol {
    COMPUTER("O"),
    HUMAN("X"),
    PLACEHOLDER("-");

    private final String symbol;

    Symbol(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    //    @Override
//    public String toString() {
//        return symbol;
//    }
}

//public class Symbol {
//
//    String symbol;
//
//    public Symbol(String symbol) {
//        this.symbol = symbol;
//    }
//
//    public String getSymbol() {
//        return symbol;
//    }
//
//    public void setSymbol(String symbol) {
//        this.symbol = symbol;
//    }
//
//    @Override
//    public String toString() {
//        return symbol;
//    }
//}
