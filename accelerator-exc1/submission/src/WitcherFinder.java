public class WitcherFinder {

    private final static String target = "!GERALT!".toLowerCase();
    private final static int targetSum = 10;


    public boolean witcherFinder(String input) {
        return (isInTarget(input) && isCorrectSum(input));
    }

    private boolean isCorrectSum(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isDigit(c)) {
                count += Integer.parseInt(String.valueOf(c));
            }
        }
        return count == targetSum;
    }

    private boolean isInTarget(String input) {
        return input.toLowerCase().contains(target);
    }
}
