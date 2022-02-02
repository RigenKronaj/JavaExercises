import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Location> locations = new ArrayList<Location>();

        Location locationOne = new Location("Shkoder", 45.36, 26.25, "Shkoder County", "Albania");
        Location locationTwo = new Location("Shkoder", 74.24, 85.11, "Shkoder County", "Albania");

        locations.add(locationOne);
        locations.add(locationTwo);

        ArrayList<Weather> weather = new ArrayList<Weather>();

            Weather weatherOne = new Weather(25, 6, 7, 0, "Sunny", locations.get(0));
            Weather weatherTwo = new Weather(11, 34, 3, 25, "Overcast", locations.get(1));

        weather.add(weatherOne);
        weather.add(weatherTwo);

        System.out.println(weather.get(0).toString());
        System.out.println(weather.get(1).toString());
    }
}
