package sh.roadmap.weatherapiredis.model;

import java.util.List;

public class WeatherResponse {
    private String resolvedAddress;
    private List<Day> days;
    private String timezone;

    public static class Day {
        private String datetime;
        private double temp;
        private int humidity;
        private String conditions;

        public String getDateTime(){ return datetime; }
        public void setDateTime(String datetime){ this.datetime = datetime; }
        public double getTemp(){ return temp; }
        public void setTemp(double temp){ this.temp = temp; }
        public int getHumidity(){ return humidity; }
        public void setHumidity(int humidity){ this.humidity = humidity; }
        public String getConditions(){ return conditions; }
        public void setConditions(String conditions){ this.conditions = conditions; }
    }

    public String getResolvedAddress() {    return resolvedAddress; }
    public void setResolvedAddress(String resolvedAddress) { this.resolvedAddress = resolvedAddress; }

    public List<Day> getDay() { return days; }
    public void setDays(List<Day> days) { this.days = days;}

    public String getTimezone() { return timezone; }
    public void setTimeZone(String timezone) { this.timezone = timezone; }


}
