package qaautomation.tugas5;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import com.github.javafaker.Faker;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class APITest extends BaseApiTest {

	Faker faker = new Faker();
	String username = faker.name().username();
	String password = faker.internet().password(true);
	String email = faker.internet().emailAddress();
	String phoneNumber = faker.phoneNumber().phoneNumber();

	
	String payload = "{\"username\": \"%s\", \"password\": \"%s\", \"email\": \"%s\", \"phoneNumber\": \"%s\"}";
	String registerPayload = String.format(payload, username, password, email, phoneNumber);
	

    @Test
	public void registerTest() {
		Response response = RestAssured.given().spec(commonJsonSpec).body(registerPayload).when()
				.post("register");
		int statusCode = response.getStatusCode();
		String message = response.jsonPath().get("Message");
		String status = response.jsonPath().get("Status");
		assertEquals(201, statusCode);
		assertEquals("New User Registered", message);
		assertEquals("Created", status);
	}
    
	
}
