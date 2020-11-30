import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        PaymentCard acc1 = new PaymentCard(50);
        System.out.println(acc1.getBalance());
        System.out.println(acc1);

        ItemRepository itemRepository = new ItemRepository("items.txt");

        acc1.eat("chocolate", itemRepository);
    }
}
