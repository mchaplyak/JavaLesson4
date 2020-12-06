package hw;

public class Pants extends Clothing implements MensClothing, WomenClothing {
    public Pants(ClothingSizes clothingSizes, int price, String color) {
        super(clothingSizes, price, color);
    }

    @Override
    public void dressAMan() {

    }

    @Override
    public void dressAWoman() {

    }
}
