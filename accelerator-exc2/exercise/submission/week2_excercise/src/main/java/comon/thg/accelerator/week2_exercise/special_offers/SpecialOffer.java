package comon.thg.accelerator.week2_exercise.special_offers;

public interface SpecialOffer {

  String getName();

  SpecialOfferAction getAction();

  SpecialOfferTrigger getTrigger();
}
