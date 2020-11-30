import java.io.IOException;

public class PaymentCard {
    private double balance;


    public PaymentCard(double balance) throws IOException {
        this.balance = balance;
    }

    public void eat(String itemName, ItemRepository itemRepository) {
        Item item = itemRepository.getItem(itemName)
                .orElseThrow(() -> new UnsupportedOperationException("Cannot find item " + itemName));

        double value = item.getValue();
        boolean isHealthy = item.isHealthy();
        double newBalance = this.balance - value;

        this.setBalance(newBalance);
        System.out.println(isHealthy ? "You eat the healthy " + itemName : "You eat the unhealthy " + itemName);
        System.out.println(this);
    }


    public double getBalance() {
        return balance;
    }

    public PaymentCard setBalance(double balance) {
        this.balance = balance;
        return this;
    }

    public String toString() {
        return "The card has a balance of " + this.getBalance();
    }


}
