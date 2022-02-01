public class Location {
    private String name;
    private double latitude;
    private double longitude;
    private String province;
    private String country;

    public Location(String name, double latitude, double longitude, String province, String country) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.province = province;
        this.country = country;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public String getProvince() {
        return province;
    }

    public String getCountry() {
        return country;
    }
}
