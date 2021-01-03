package comon.thg.accelerator.week2_exercise.special_offers;

public class SpecialOfferPercentageDiscount implements SpecialOffer {
    private final String name;
    private final SpecialOfferAction action;
    private final SpecialOfferTrigger trigger;

    public SpecialOfferPercentageDiscount(String name, int percentageDiscount, int triggerAmtGBP) {
        this.name = name;
        this.action = basket -> (int) (Math.floor(basket.getTotalGBP()) * ((float) percentageDiscount / 100));
        this.trigger = basket -> basket.getTotalGBP() > triggerAmtGBP;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public SpecialOfferAction getAction() {
        return action;
    }

    @Override
    public SpecialOfferTrigger getTrigger() {
        return trigger;
    }
}
