import com.weatherforcast.restapi.demo.api.*;
import com.weatherforcast.restapi.demo.controller.*;
import com.weatherforcast.restapi.demo.entity.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.*;
import org.junit.runner.*;
import org.mockito.*;
import org.mockito.junit.jupiter.*;
import org.springframework.http.*;

import static org.mockito.Mockito.when;
import static org.assertj.core.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class WeatherControllerTest{
	@InjectMocks
    WeatherController weatherController;
     
    @Mock
    WeatherApi weatherApi;

    @Test
    public void testGetWeatherReport(){

		when(weatherApi.getReport()).thenReturn(new ResponseEntity<>(HttpStatus.OK));

    	ResponseEntity<?> responseEntity = weatherController.getWeatherReport();
    	
    	assertThat(responseEntity.getStatusCodeValue()).isEqualTo(200);
    }
}