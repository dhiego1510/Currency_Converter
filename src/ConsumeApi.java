import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumeApi {
  private String baseUrl = "https://v6.exchangerate-api.com/v6/dd7af3797abc62ae6adefaba/latest/USD";

  private String apiData() throws IOException, InterruptedException {
    try {
      HttpClient client = HttpClient.newHttpClient();
      HttpRequest request = HttpRequest.newBuilder()
              .uri(URI.create(baseUrl))
              .build();

      HttpResponse<String> response = client
              .send(request, HttpResponse.BodyHandlers.ofString());
      return response.body();
    } catch (NumberFormatException e) {
      System.out.println("Ocurrió un error: ");
      System.out.println(e.getMessage());
    } catch (IllegalArgumentException e) {
      System.out.println("Error en la URI, verifique la dirección");
    }
    return null;
  }

  public ExchangeRates getExchangeRates() throws IOException, InterruptedException {
    String json = apiData();
    if (json != null) {
      Gson gson = new Gson();
      return gson.fromJson(json, ExchangeRates.class);
    }
    return null;
  }
}
