package catHouse.entities.cat;

public class ShorthairCat extends BaseCat{
    public static final int INITIAL_KILOGRAMS = 7;

    public ShorthairCat(String name, String breed, double price) {
        super(name, breed, price);
        super.setKilograms(INITIAL_KILOGRAMS);
    }

    @Override
    public void eating() {
        super.setKilograms(super.getKilograms() + 1);
    }
}