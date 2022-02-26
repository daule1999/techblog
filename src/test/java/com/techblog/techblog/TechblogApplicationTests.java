package com.techblog.techblog;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

// @SpringBootTest
@RunWith(SpringRunner.class)
@SpringBootTest(classes = TechblogApplicationTests.class,
  webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@ActiveProfiles("fixedport")
class TechblogApplicationTests {

	@Test
	void contextLoads() {
	}

}
