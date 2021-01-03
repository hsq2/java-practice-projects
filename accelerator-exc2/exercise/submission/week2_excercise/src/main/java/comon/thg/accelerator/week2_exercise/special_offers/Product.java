package comon.thg.accelerator.week2_exercise.special_offers;

import java.util.Objects;

public class Product {
  private String title;
  private int priceGBP;

  public Product(String title, int priceGBP) {
    this.title = title;
    this.priceGBP = priceGBP;
  }

  public String getTitle() {
    return title;
  }

  public int getPriceGBP() {
    return priceGBP;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Product product = (Product) o;
    return priceGBP == product.priceGBP
        && Objects.equals(title, product.title);
  }

  @Override
  public String toString() {
    return "{" +
            "title='" + title + '\'' +
            ", priceGBP=" + priceGBP +
            '}';
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, priceGBP);
  }
}


