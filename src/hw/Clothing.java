package hw;

public abstract class Clothing {

    private ClothingSizes clothingSizes;
    int price;
    String color;

    public Clothing(ClothingSizes clothingSizes, int price, String color) {
        this.clothingSizes = clothingSizes;
        this.price = price;
        this.color = color;
    }

    public ClothingSizes getSize() {
        return clothingSizes;
    }

    public void setSize(ClothingSizes size) {
        this.clothingSizes = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Clothing{" +
                "size=" + clothingSizes +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
