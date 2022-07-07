package beverages;

public class WithCinnamon extends WithSupplement {

    public WithCinnamon(Priceable beverage) {
        super(beverage);
    }

    @Override
    protected double supplementPrice() {
        return 0.05;
    }
}
