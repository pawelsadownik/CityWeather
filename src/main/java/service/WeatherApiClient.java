package service;

import model.City;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


public class WeatherApiClient {

    public static final String URL = "http://api.openweathermap.org/data/2.5/weather";

    public static final String API_key = "36ef23a3bc31a70ac637562a2345e629";

    public static final String units = "metric";

    public static final String lang = "pl";

    public static final String country = ", PL";

    public City getCityByName(String name) {

        Response response = ClientBuilder
                .newClient()
                .target(URL)
                .queryParam("q", name)
                .queryParam(country)
                .queryParam("APPID", API_key)
                .queryParam("units", units)
                .queryParam("lang", lang)
                .request(MediaType.APPLICATION_JSON)
                .get();

        System.out.println(response.getStatus());

        if (response.getStatus() == 200) {

            return response.readEntity(City.class);

        }
        return null;

    }

}
