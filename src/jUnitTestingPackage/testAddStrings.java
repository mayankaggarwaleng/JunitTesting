package jUnitTestingPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddStrings {

	@Test
	void test() {
		jUnitFunction junit = new jUnitFunction();
		String result = junit.addStrings("MAYANK ","E19CSE275");
		assertEquals("MAYANK E19CSE275",result);
	}

}
