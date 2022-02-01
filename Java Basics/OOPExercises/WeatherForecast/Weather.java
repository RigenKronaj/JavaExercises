public class Weather {
    private double temperature;
    private double humidity;
    private double windSpeed;
    private double precipitation;
    private String name;
    private Location location;


    public Weather(double temperature, double humidity, double windSpeed, double precipitation, String name, Location location) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.windSpeed = windSpeed;
        this.precipitation = precipitation;
        this.name = name;
        this.location = location;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public void setPrecipitation(double precipitation) {
        this.precipitation = precipitation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public double getPrecitation() {
        return precipitation;
    }

    public String getName() {
        return name;
    }

    public Location getLocation() {
        return location;
    }

    public String toString() {
        return "The weather in location: " + location.getName() + " is " + name + ", the temperature is " + temperature + ", the humiditiy is " + humidity + ", the wind speed is " + windSpeed + " and the precipitation is " + precipitation;
    }
}

