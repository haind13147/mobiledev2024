package vn.edu.usth.weather;

public class ForecastItem {
    private String day;
    private String description;
    private String tempRange;
    private int weatherIcon;

    public ForecastItem(String day, String description, String tempRange, int weatherIcon) {
        this.day = day;
        this.description = description;
        this.tempRange = tempRange;
        this.weatherIcon = weatherIcon;
    }

    public String getDay() {
        return day;
    }

    public String getDescription() {
        return description;
    }

    public String getTempRange() {
        return tempRange;
    }

    public int getWeatherIcon() {
        return weatherIcon;
    }
}
