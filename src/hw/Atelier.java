package hw;

public class Atelier {

    Shirt shirt1 = new Shirt(ClothingSizes.XXS, 20, "white");
    Shirt shirt2 = new Shirt(ClothingSizes.L, 5, "black");
    Shirt shirt3 = new Shirt(ClothingSizes.M, 25, "green");
    Pants pants1 = new Pants(ClothingSizes.XXS, 50, "black");
    Pants pants2 = new Pants(ClothingSizes.S, 100, "brown");
    Pants pants3 = new Pants(ClothingSizes.M, 20, "red");
    Dress dress1 = new Dress(ClothingSizes.XXS, 250, "white");
    Dress dress2 = new Dress(ClothingSizes.M, 500, "black");
    Dress dress3 = new Dress(ClothingSizes.S, 100, "purple");
    Tie tie1 = new Tie(ClothingSizes.M, 15, "silver");
    Tie tie2 = new Tie(ClothingSizes.M, 10, "brown");
    Tie tie3 = new Tie(ClothingSizes.M, 7, "magenta");
    Clothing[] clothing = new Clothing[] {
            shirt1, shirt2, shirt3, pants1, pants2, pants3,
            dress1, dress2, dress3, tie1, tie2, tie3
    };

    public void mensChoose() {
        for (Clothing clothing1 : clothing) {
            if (clothing1 instanceof MensClothing) {
                System.out.println(clothing1);
            }
        }
    }

    public void womenChoose() {
        for (Clothing clothing1 : clothing) {
            if (clothing1 instanceof WomenClothing) {
                System.out.println(clothing1);
            }
        }
    }
    
}
