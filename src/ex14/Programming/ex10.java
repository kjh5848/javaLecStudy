package ex14.Programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Country {
    private String name;
    private int population;
    private List<City> cities;

    public Country(String name, int population,  List<City> cities) {
        this.name = name;
        this.population = population;
        this.cities = cities;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }


    public List<City> getCities() {
        return cities;
    }

    @Override
    public String toString() {
        return name;
    }
}

class City {
    private String name;
    private int population;
    private String countryName;

    public City(String name, int population, String countryName) {
        this.name = name;
        this.population = population;
        this.countryName = countryName;
    }




    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public String getCountryName() {
        return countryName;
    }

    @Override
    public String toString() {
        return name;
    }
}
public class ex10 {
    public static void main(String[] args) {


        City busan = new City("부산",1,"한국");
        City seoul = new City("서울",0,"한국");
        City hollywood = new City("할리우드",2,"미국");
        City washington = new City("워싱턴",0,"미국");

        List<City> koreaList = new ArrayList<>(Arrays.asList(busan,seoul));
        List<City> americanList = new ArrayList<>(Arrays.asList(hollywood,washington));


        Country korea = new Country("한국",100 ,koreaList);
        Country american = new Country("미국",200 ,americanList);

        List<Country> country = new ArrayList<>(Arrays.asList(korea,american));

        country.forEach(country1 -> {
            City largestCity = country1.getCities().stream()
                    .max(Comparator.comparing(City::getPopulation))
                    .orElseThrow(() -> new IllegalArgumentException("도시가 없습니다."));
            System.out.println("가장 인구가 많은 도시는 " + country1.getName() + "의 " + largestCity.getName()
                    + "이며, 인구는 " + largestCity.getPopulation() + "만명입니다.");
        });
    }
}
