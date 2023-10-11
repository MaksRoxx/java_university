package practice23.task3;

public class Drink implements Item {
    private double cost;
    private String name;
    private String description;

    public Drink(String name, String description, double cost) {
        this.name = name;
        this.description = description;
        this.cost = cost;
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
