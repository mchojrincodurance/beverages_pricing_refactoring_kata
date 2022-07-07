package beverages;

abstract public class WithSupplement implements Priceable {
    protected final Priceable beverage;

    public WithSupplement(Priceable beverage) {
        this.beverage = beverage;
    }

    @Override
    public double price() {
        return beverage.price() + this.supplementPrice();
    }

    abstract protected double supplementPrice();
}
