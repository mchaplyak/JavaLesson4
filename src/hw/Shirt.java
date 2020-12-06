package hw;

public class Shirt extends Clothing implements MensClothing, WomenClothing{

    public Shirt(ClothingSizes clothingSizes, int price, String color) {
        super(clothingSizes, price, color);
    }

    @Override
    public void dressAMan() {

    }

    @Override
    public void dressAWoman() {

    }
}
