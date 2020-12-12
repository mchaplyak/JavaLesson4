package classWork;

public enum Seasons {
    SPRING(15)
            {
                @Override
                public void getDescription() {
                    System.out.println("Мокро і прохолодно, цвітуть дерева");
                }
            },
    SUMMER(30)
            {
                @Override
                public void getDescription() {
                    System.out.println("Жарко і сухо, пора у відпустку");
                }
            },
    AUTUMN(15)
            {
                @Override
                public void getDescription() {
                    System.out.println("Мокро і прохолодно, обпадають дерева");
                }
            },
    WINTER(-10)
            {
                @Override
                public void getDescription() {
                    System.out.println("Мокро і холодно, треба сидіти вдома ");
                }
            };

   private int averageTemp;

    Seasons(int averageTemp) {
        this.averageTemp = averageTemp;
    }

   public abstract void getDescription();

    public int getAverageTemp() {
        return averageTemp;
    }

    public void setAverageTemp(int averageTemp) {
        this.averageTemp = averageTemp;
    }



    @Override
    public String toString() {
        return "Seasons{" +
                "averageTemp=" + averageTemp +
                '}';
    }
}
