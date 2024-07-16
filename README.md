# Currency Converter

This is a simple currency converter application written in Java. It allows users to convert between various currencies using exchange rates from the [ExchangeRate-API](https://www.exchangerate-api.com/).

## Features

- Convert between multiple currencies.
- Simple menu-based interface.
- Fetches real-time exchange rates from ExchangeRate-API.

## Installation

### Prerequisites

- Java 11 or higher.
- An API key from [ExchangeRate-API](https://www.exchangerate-api.com/).

### Steps

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/currency-converter.git
   cd currency-converter
   
2. Replace the placeholder API key in ConsumeApi.java with your actual API key:

java
Copiar código
private String url = "https://v6.exchangerate-api.com/v6/YOUR_API_KEY/latest/USD";


Entendido, aquí está el README con el título y subtítulos formateados en Markdown como lo solicitaste:

markdown
Copiar código
# Currency Converter

This is a simple currency converter application written in Java. It allows users to convert between various currencies using exchange rates from the [ExchangeRate-API](https://www.exchangerate-api.com/).

## Features

- Convert between multiple currencies.
- Simple menu-based interface.
- Fetches real-time exchange rates from ExchangeRate-API.

## Installation

### Prerequisites

- Java 11 or higher.
- An API key from [ExchangeRate-API](https://www.exchangerate-api.com/).

### Steps

1. Clone the repository:

   git clone https://github.com/your-username/currency-converter.git
   cd currency-converter
   
2. Replace the placeholder API key in ConsumeApi.java with your actual API key:

private String url = "https://v6.exchangerate-api.com/v6/YOUR_API_KEY/latest/USD";
Compile the project:

Run the project:

class Main

## Usage
When you run the application, you will see a menu with several currency conversion options. Simply select an option and follow the prompts to enter the amount you wish to convert.

markdown
***********************************************
Bienvenido/a al Conversor de Moneda

Elija una opción válida:

1) Dólar ->> Peso Argentino
2) Peso Argentino ->> Dólar
3) Dólar ->> Real Brasileño
4) Real Brasileño ->> Dólar
5) Dólar ->> Peso Colombiano
6) Peso Colombiano ->> Dólar
7) Salir

*************************************************
Code Structure

Main.java: The entry point of the application.
Menu.java: Handles user interaction and displays the menu.
ConsumeApi.java: Fetches exchange rates from the ExchangeRate-API.
ExchangeRates.java: Represents the structure of the exchange rates JSON response.

Dependencies
Gson (2.8.6): A Java library to convert Java Objects into their JSON representation and vice versa.
