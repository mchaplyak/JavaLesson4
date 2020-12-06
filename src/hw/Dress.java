package hw;

public class Dress extends Clothing implements WomenClothing {
    public Dress(ClothingSizes clothingSizes, int price, String color) {
        super(clothingSizes, price, color);
    }

    @Override
    public void dressAWoman() {

    }
}
