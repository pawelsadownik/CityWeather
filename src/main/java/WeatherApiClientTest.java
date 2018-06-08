
import model.City;
import org.junit.Before;
import org.junit.Test;
import service.WeatherApiClient;

import static org.assertj.core.api.Java6Assertions.assertThat;


public class WeatherApiClientTest {

    private WeatherApiClient weatherApiClient;

    @Before
    public void before() {
        weatherApiClient = new WeatherApiClient();
    }

    @Test
    public void testCities() {
        // Given
        String name = "London";

        // When
        City city = weatherApiClient.getCityByName(name);

        // Then
        assertThat(name).isNotNull();
    }

}
