public class Main {

    public static void main(String[] args) {
        WitcherFinder wf = new WitcherFinder();
        runWitcherFinder(wf);

        HourGlass hg = new HourGlass(Symbol.STAR);
        runHourGlass(hg);
    }

    private static void runWitcherFinder(WitcherFinder wf) {
        boolean isValid = wf.witcherFinder("!Geralt!721");
        System.out.println(isValid);
    }

    private static void runHourGlass(HourGlass hg) {
        hg.createHourGlass(5);
    }
}

