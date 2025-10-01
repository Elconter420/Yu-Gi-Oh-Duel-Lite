import netscape.javascript.JSObject;

import org.json.JSONObject;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;

public class YgoAPiClient {

    private static final String API_URL = "https://db.ygoprodeck.com/api/v7/randomcard.php";

    public Card getRandomMonsterCard(){
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new java.net.URI(API_URL))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            JSONObject json = new JSONObject(response.body());

            // Validar que la carta Sea de tipo Monster
            if (!"Monster".equals(json.optString("type"))){
                return getRandomMonsterCard();
            }

            return new Card(
                    json.getString("name"),
                    json.optString("atk", "0"),
                    json.optString("def", "0"),
                    json.getJSONArray("card_images").getJSONObject(0).getString("image_url")
            );

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
}
