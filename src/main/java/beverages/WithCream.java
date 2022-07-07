package beverages;

public class WithCream extends WithSupplement {
    public WithCream(Priceable beverage) {
        super(beverage);
    }

    @Override
    protected double supplementPrice() {
        return 0.15;
    }
}
