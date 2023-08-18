package sg.edu.rp.c346.id22000028.demoweather;

public class Weather {
    String area;
    String forecast;

    @Override
    public String toString() {
        return "Weather{" +
                "area='" + area + '\'' +
                ", forecast='" + forecast + '\'' +
                '}';
    }

    public Weather(String area, String forecast) {
        this.area = area;
        this.forecast = forecast;
    }

    public String getForecast() {
        return forecast;
    }

    public void setForecast(String forecast) {
        this.forecast = forecast;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
