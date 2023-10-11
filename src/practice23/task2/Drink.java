package practice23.task2;

final class Drink implements Item {
    private static final int DEFAULT_COST = 0;
    private static final String DEFAULT_NAME = "Unknown";
    private static final String DEFAULT_DESCRIPTION = "No description available";

    private final int cost;
    private final String name;
    private final String description;

    public Drink(String name, String description) {
        this(DEFAULT_COST, name, description);
    }

    public Drink(int cost, String name, String description) {
        this.cost = cost;
        this.name = name;
        this.description = description;
    }

    public double getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
