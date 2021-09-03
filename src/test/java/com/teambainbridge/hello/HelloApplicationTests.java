package com.teambainbridge.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloApplicationTests {

	@Test
	void HelloApplicationTest() {
		HelloApplication app = new HelloApplication();
		assertEquals(app.GetMessage(), "hello world");
		
	}

}
