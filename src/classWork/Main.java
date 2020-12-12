package classWork;

public class Main {
    public static void main(String[] args) {



        for (Seasons season: Seasons.values() ) {
            System.out.println("Зараз: " + season.name() + ". Середня температура " + season.getAverageTemp()
            + " гарудсів за Цельсієм. На вулиці: ");
            season.getDescription();
            System.out.println("");
        }


    }
}
