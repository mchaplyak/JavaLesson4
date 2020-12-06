package hw;

public class Tie extends Clothing implements MensClothing {
    public Tie(ClothingSizes clothingSizes, int price, String color) {
        super(clothingSizes, price, color);
    }

    @Override
    public void dressAMan() {

    }
}
