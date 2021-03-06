package catHouse.entities.cat;

import static catHouse.common.ExceptionMessages.*;

public abstract class BaseCat implements Cat{
    private String name;
    private String breed;
    private int kilograms;
    private double price;

    protected BaseCat(String name, String breed, double price) {
        this.setName(name);
        this.setBreed(breed);
        this.setPrice(price);
    }

    public void setBreed(String breed) {
        if (breed == null || breed.trim().isEmpty()) {
            throw new NullPointerException(CAT_BREED_CANNOT_BE_NULL_OR_EMPTY);
        }
        this.breed = breed;
    }

    public void setKilograms(int kilograms) {
        this.kilograms = kilograms;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException(CAT_PRICE_CANNOT_BE_BELOW_OR_EQUAL_TO_ZERO);
        }
        this.price = price;
    }

    //    • name - String
    //        ◦ If the name is null or whitespace, throw a NullPointerException with a message:
    //"Cat name cannot be null or empty."
    //        ◦ All names are unique.
    //    • breed -  String
    //        ◦ If the breed is null or whitespace, throw a NullPointerException with a message:
    //"Cat breed cannot be null or empty."
    //    • kilograms -  int
    //        ◦ The kilograms of the Cat.
    //    • price - double
    //        ◦ The price of the Cat.
    //        ◦ If the price is below or equal to 0, throw an IllegalArgumentException with a message:
    // "Cat price cannot be below or equal to 0."

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new NullPointerException(CAT_NAME_NULL_OR_EMPTY);
        }
        this.name = name;
    }

    @Override
    public int getKilograms() {
        return kilograms;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public abstract void eating();
}
