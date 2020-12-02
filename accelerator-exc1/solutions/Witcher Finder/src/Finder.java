public class Finder {

    private final String target = "!GERALT!".toLowerCase();


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
        int targetSum = 10;
        return count == targetSum;
    }

    private boolean isInTarget(String input) {
        return input.toLowerCase().contains(target);
    }
}
