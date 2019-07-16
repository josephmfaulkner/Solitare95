import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestFirstTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void firstTest() {
		assertEquals(2+2,4);
	}

}
