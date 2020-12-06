package hw;

public enum ClothingSizes {
    XXS {
        @Override
        public void getDescription() {
            System.out.println("Super Extra Small Size");
        }
    },
    XS {
        @Override
        public void getDescription() {
            System.out.println("Extra Small Size");
        }
    },
    S {
        @Override
        public void getDescription() {
            System.out.println("Small Size");
        }
    },
    M {
        @Override
        public void getDescription() {
            System.out.println("Medium Size");
        }
    },
    L {
        @Override
        public void getDescription() {
            System.out.println("Large Size");
        }
    };

    int euroSize;



    ClothingSizes(int euroSize) {
        this.euroSize = euroSize;
    }

    ClothingSizes() {

    }

    public abstract void getDescription();
}
