public enum Symbol {
    STAR('*'),
    WHITE_SPACE(' ');

    private final char symbol;

    Symbol(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }
}
