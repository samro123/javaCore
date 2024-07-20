package intermediate.inheritance.statickeyword;

public class CountriesApp {
    public static void main(String[] args) {
        Country country = new Country("Brazil", 2000000, "Bro");
        country.getDetails();
        Country countryFirst = new Country("Brazil He", 2000000, "Bro");
        countryFirst.getDetails();
        Country countrySecond= new Country("Brazil Ha", 2000000, "Bro");
        countrySecond.getDetails();
        Country countryThird = new Country("Brazil Ho", 2000000, "Bro");
        countryThird.getDetails();
        System.out.println("Number of countries: " + Country.getNumberOfCountries());

    }
}
