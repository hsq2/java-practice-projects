package comon.thg.accelerator.week2_exercise.special_offers;

import java.util.List;

public class Basket {
  private final List<Product> products;
  private final List<SpecialOffer> specialOffers;
  private int discountTotal;

  public Basket(List<Product> products, List<SpecialOffer> specialOffers) {
    this.products = products;
    this.specialOffers = specialOffers;
  }

  public List<Product> getProducts() {
    return products;
  }

  public List<SpecialOffer> getSpecialOffers() {
    return specialOffers;
  }

  public int getDiscountTotal() {
    return discountTotal;
  }

  public int getTotalGBP() {
    return products.stream().mapToInt(Product::getPriceGBP).sum();
  }

  public int getTotalDuringOffer() {
    return getTotalGBP() - getDiscountTotal();
  }

  public int getTotalAfterDiscountGBP() {
//    int maxDiscount = 0;
//    for (SpecialOffer specialOffer : specialOffers) {
//      if (specialOffer.getTrigger().isTriggered(this)) {
//        if (specialOffer.getAction().calculateDiscountGBP(this) > maxDiscount) {
//          maxDiscount = specialOffer.getAction().calculateDiscountGBP(this);
//        }
//      }
//    }
//    discountTotal += maxDiscount;
    int discount = getSpecialOffers().stream()
            .filter(s -> s.getTrigger().isTriggered(this))
            .mapToInt(s -> s.getAction().calculateDiscountGBP(this))
            .max().orElse(0);
    discountTotal += discount;
    return getTotalDuringOffer();
  }
}
