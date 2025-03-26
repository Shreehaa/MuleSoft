package com.weather;

public class WeatherAlertService {
    public static String generateAlert(double temperature, double windSpeed) {
        if (temperature > 40) {
            return "Heatwave Alert! Stay indoors and stay hydrated.";
        } else if (windSpeed > 50) {
            return "Storm Alert! Avoid traveling and take precautions.";
        }
        return "Weather is normal.";
    }
}

