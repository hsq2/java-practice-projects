package comon.thg.accelerator.week2_exercise.special_offers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SpecialOfferPercentageDiscountTest {

    public List<SpecialOffer> offerList = new ArrayList<>();
    public SpecialOffer CYBER30;
    public SpecialOffer BLACKFRIDAY50;

    public List<Product> productList50 = new ArrayList<>();
    public Basket basket50 = new Basket(productList50, offerList);

    public List<Product> productList80 = new ArrayList<>();
    public Basket basket80 = new Basket(productList80, offerList);

    public List<Product> productList160 = new ArrayList<>();
    public Basket basket160 = new Basket(productList160, offerList);

    @BeforeEach
    public void setup() {
        CYBER30 = new SpecialOfferPercentageDiscount("CYBER30", 30, 75);
        offerList.add(CYBER30);

        BLACKFRIDAY50 = new SpecialOfferPercentageDiscount("BLACKFRIDAY50", 50, 150);
        offerList.add(BLACKFRIDAY50);

        //£50 basket
        productList50.add(new Product("item1", 30));
        productList50.add(new Product("item2", 20));

        //£80 basket
        productList80.add(new Product("item3", 10));
        productList80.add(new Product("item4", 70));

        //£160 basket
        productList160.add(new Product("item5", 100));
        productList160.add(new Product("item6", 40));
        productList160.add(new Product("item7", 20));
    }

    @Test
    public void testProductFetch() {
        assertEquals("[{title='item1', priceGBP=30}, {title='item2', priceGBP=20}]",
                basket50.getProducts().toString());
        assertEquals("[{title='item3', priceGBP=10}, {title='item4', priceGBP=70}]",
                basket80.getProducts().toString());
        assertEquals("[{title='item5', priceGBP=100}, {title='item6', priceGBP=40}, {title='item7', priceGBP=20}]",
                basket160.getProducts().toString());
    }

    @Test
    public void testBasketValue() {
        assertEquals(50, basket50.getTotalGBP());
        assertEquals(80, basket80.getTotalGBP());
        assertEquals(160, basket160.getTotalGBP());
    }

    @Test
    public void testTriggers() {
        //CYBER30 = MINIMUM SPEND £75
        assertFalse(CYBER30.getTrigger().isTriggered(basket50));
        assertTrue(CYBER30.getTrigger().isTriggered(basket80));
        assertTrue(CYBER30.getTrigger().isTriggered(basket160));

        //BLACKFRIDAY50 = MINIMUM SPEND £150
        assertFalse(BLACKFRIDAY50.getTrigger().isTriggered(basket50));
        assertFalse(BLACKFRIDAY50.getTrigger().isTriggered(basket80));
        assertTrue(BLACKFRIDAY50.getTrigger().isTriggered(basket160));
    }

    @Test
    public void testDiscount() {
        //BASKET DOES NOT QUALIFY FOR ANY DISCOUNTS
        assertEquals(50, basket50.getTotalAfterDiscountGBP());

        //CYBER30 = MIN SPEND £75 - 30% DISCOUNT
        assertEquals(56, basket80.getTotalAfterDiscountGBP());

        //BLACKFRIDAY50 = MINIMUM SPEND £75 - 50% DISCOUNT
        assertEquals(80, basket160.getTotalAfterDiscountGBP());
    }
}