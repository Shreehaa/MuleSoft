# MuleSoft
# Weather Alert Generator (MuleSoft)

This MuleSoft project provides a weather alert generator application that fetches current weather data from WeatherAPI and displays alerts based on weather conditions. The application is built using Mule 4 and DataWeave, and it can be deployed as a Mule deployable archive.

## Features

- **Dynamic Weather Data:** Fetch weather information based on a city provided as a query parameter.
- **Custom Alerts:** Displays an alert when the temperature exceeds 40°C (heatwave) or when wind speed exceeds 50 kph (storm), otherwise, it indicates that the weather is normal.
- **Data Transformation:** Uses DataWeave to extract and transform only the required weather details.
- **Deployable Archive:** Package the project using Maven for deployment on a Mule runtime.

## Prerequisites

- [Anypoint Studio](https://www.mulesoft.com/platform/studio) (Mule 4.x)
- Java Development Kit
- Maven (for building the project)
- Active API key from [WeatherAPI](https://www.weatherapi.com/)


