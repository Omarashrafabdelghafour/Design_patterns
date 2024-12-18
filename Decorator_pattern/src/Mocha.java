public class Mocha extends  CondimentDecorator {
Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage=beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "Mocka";
    }

    @Override
    public double Cost() {
        return 0.2 + beverage.Cost();
    }
}
