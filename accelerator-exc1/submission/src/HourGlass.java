public class HourGlass {


    public HourGlass(Symbol symbol) {
    }

    public void createHourGlass(int n) {
        int num = (2 * n) - 1;
        for (int i = 0; i < num; i++) {
            if (isUpperHalf(i, num)) {
                pattern(i, num - (i * 2));
            } else {
                pattern((num - i) - 1, (i * 2) - num + 2);
            }
            System.out.println();
        }
    }

    private boolean isUpperHalf(int i, int num) {
        return i < (num + 1) / 2;
    }

    private void pattern(int whitespaceCondition, int starCondition) {
        printPattern(Symbol.WHITE_SPACE, whitespaceCondition);
        printPattern(Symbol.STAR, starCondition);
    }

    private void printPattern(Symbol symbol, int condition) {
        for (int i = 0; i < condition; i++) {
            printChar(symbol);
        }
    }

    private void printChar(Symbol symbol) {
        System.out.print(symbol.getSymbol());
    }

}
