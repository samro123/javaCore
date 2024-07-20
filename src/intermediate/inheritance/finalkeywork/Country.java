package intermediate.inheritance.finalkeywork;

public class Country {

    private final String NAME;
    private int population;
    private String capital;

    public Country(String NAME, int population, String capital) {
        this.NAME = NAME;
        this.population = population;
        this.capital = capital;
    }

    public final void populationChange(int change){
        population += change;
    }
}
