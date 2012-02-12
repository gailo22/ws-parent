package service;

import static org.hamcrest.core.IsEqual.equalTo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HelloServiceTest {

	private HelloService helloService;
	
	@Before
	public void setup() {
		helloService = new HelloService();
	}
	
	@Test
	public void shouldReturnMessageFromHelloService() {
		// Given
		
		// When
		String message = helloService.sayHello();
		
		// Then
		Assert.assertThat(message, equalTo("Hello World"));
	}
	
}
