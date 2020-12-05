public class HourGlass {

    private final char symbol;

    public HourGlass(char symbol) {
        this.symbol = symbol;
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

    private void printPattern(char c, int condition) {
        for (int i = 0; i < condition; i++) {
            printChar(c);
        }
    }

    private void pattern(int condition1, int condition2) {
        printPattern(getWhiteSpace(), condition1);
        printPattern(getSymbol(), condition2);
    }

    private void printChar(char ch) {
        System.out.print(ch);
    }

    private char getSymbol() {
        return this.symbol;
    }

    private char getWhiteSpace() {
        return ' ';
    }
}
