public class Item {

    private final String name;

    private final double value;

    private final boolean healthy;

    public Item(String name, double value, boolean healthy) {
        this.name = name;
        this.value = value;
        this.healthy = healthy;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", value=" + value +
                ", healthy=" + healthy +
                '}';
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }

    public boolean isHealthy() {
        return healthy;
    }

    public boolean isUnhealthy() {
        return !healthy;
    }
}