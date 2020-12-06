package lectionCode;

public enum CarType {

    SEDAN ("Седан"),
    SUV ("Кроссовер"),
    HATCHBACK ("Хетчбек");

    private String ukrainianTranslation;

    CarType(String ukrainianTranslation) {
        this.ukrainianTranslation = ukrainianTranslation;
    }

    public String getUkrainianTranslation() {
        return ukrainianTranslation;
    }

    public void setUkrainianTranslation(String ukrainianTranslation) {
        this.ukrainianTranslation = ukrainianTranslation;
    }
}
