package org.roderick.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.roderick.source.util.HashMap;

public class HashMapTest {
	private HashMap<String, String> hashMap = null;

	@Before
	public void setUp() throws Exception {
		hashMap = new HashMap<>(20);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPut() {
		hashMap.put("123", "test");
		
		Assert.assertEquals("test", hashMap.get("123"));
	}

}
