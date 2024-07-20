package intermediate.inheritance.statickeyword;

public class Country {
    private  static int numberOfCountries;
    private final String NAME;
    private int population;
    private String capital;

    static {
        // population = 100 // erro , but not static
        numberOfCountries = 5;
    }

    public Country(String NAME, int population, String capital) {
        this.NAME = NAME;
        this.population = population;
        this.capital = capital;
        numberOfCountries ++;
    }

    public final void populationChange(int change){
        population += change;
    }

    public void getDetails(){
        System.out.println("Country name: "+ NAME + "Population: "+ population + "Capital"+ capital);
    }

    public static int getNumberOfCountries(){
        return numberOfCountries;
    }

    static {
        // population = 100 // erro , but not static
        numberOfCountries = 0;
    }
}
