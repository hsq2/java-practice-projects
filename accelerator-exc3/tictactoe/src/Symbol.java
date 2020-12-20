public enum Symbol {
    NAUGHTS("O"),
    CROSSES("X"),
    PLACEHOLDER("-");

    private final String symbol;

    Symbol(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}
