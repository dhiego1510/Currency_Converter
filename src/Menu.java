import java.io.IOException;
import java.util.Scanner;

public class Menu {
  Scanner scanner = new Scanner(System.in);
  ConsumeApi api = new ConsumeApi();

  public void displayMenu() {
    Integer num = -1;
    while (num != 0) {
      var menu = """
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

                    """;
      System.out.println(menu);
      num = scanner.nextInt();
      scanner.nextLine();

      try {
        ExchangeRates rates = api.getExchangeRates();
        if (rates != null) {
          double amount;
          switch (num) {
            case 1:
              System.out.println("Ingrese la cantidad en USD:");
              amount = scanner.nextDouble();
              System.out.println(amount + " USD -> " + (amount * rates.getConversionRates().get("ARS")) + " ARS");
              break;
            case 2:
              System.out.println("Ingrese la cantidad en Pesos Argentinos:");
              amount = scanner.nextDouble();
              System.out.println(amount + " ARS -> " + (amount / rates.getConversionRates().get("ARS")) + " USD");
              break;
            case 3:
              System.out.println("Ingrese la cantidad en USD:");
              amount = scanner.nextDouble();
              System.out.println(amount + " USD -> " + (amount * rates.getConversionRates().get("BRL")) + " BRL");
              break;
            case 4:
              System.out.println("Ingrese la cantidad en Reales Brasileños:");
              amount = scanner.nextDouble();
              System.out.println(amount + " BRL -> " + (amount / rates.getConversionRates().get("BRL")) + " USD");
              break;
            case 5:
              System.out.println("Ingrese la cantidad en USD:");
              amount = scanner.nextDouble();
              System.out.println(amount + " USD -> " + (amount * rates.getConversionRates().get("COP")) + " COP");
              break;
            case 6:
              System.out.println("Ingrese la cantidad en Pesos Colombianos:");
              amount = scanner.nextDouble();
              System.out.println(amount + " COP -> " + (amount / rates.getConversionRates().get("COP")) + " USD");
              break;
            case 0:
              System.out.println("Cerrando");
              break;
            default:
              System.out.println("Opción inválida");
          }
        } else {
          System.out.println("No se pudo obtener las tasas de cambio. Intente de nuevo más tarde.");
        }
      } catch (IOException | InterruptedException e) {
        System.out.println("Ocurrió un error al obtener las tasas de cambio: " + e.getMessage());
      }
    }
  }

  public static void main(String[] args) {
    Menu menu = new Menu();
    menu.displayMenu();
  }
}
