package practice24;

public class Drink extends MenuItem implements Alcoholable {
    private double alcoholVol;
    private DrinkTypeEnum type;

    public Drink(int cost, String name, String description, double alcoholVol, DrinkTypeEnum type) {
        super(cost, name, description);
        this.alcoholVol = alcoholVol;
        this.type = type;
    }

    @Override
    public boolean isAlcoholic() {
        return alcoholVol > 0;
    }

    @Override
    public double getAlcoholVol() {
        return alcoholVol;
    }

    public DrinkTypeEnum getTypeEnum() {
        return type;
    }
}