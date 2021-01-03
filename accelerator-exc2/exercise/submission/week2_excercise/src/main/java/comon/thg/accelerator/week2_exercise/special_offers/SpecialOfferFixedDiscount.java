package comon.thg.accelerator.week2_exercise.special_offers;

public class SpecialOfferFixedDiscount implements SpecialOffer {
    private final String name;
    private final SpecialOfferAction action;
    private final SpecialOfferTrigger trigger;

    public SpecialOfferFixedDiscount(String name, int discountAmtGBP, int triggerAmtGBP) {
        this.name = name;
        this.action = basket -> discountAmtGBP;
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
