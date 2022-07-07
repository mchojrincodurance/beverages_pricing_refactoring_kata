package beverages;

public class WithMilk extends WithSupplement {
    public WithMilk(Priceable beverage) {
        super(beverage);
    }

    @Override
    protected double supplementPrice() {
        return 0.1;
    }
}
