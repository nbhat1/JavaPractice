package com.testing.practice.old;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Compare2JsonNodes {
	
	String s1 = "{\r\n" + 
			"    \"employee\":\r\n" + 
			"    {\r\n" + 
			"        \"id\": \"1212\",\r\n" + 
			"        \"fullName\": \"John Miles\",\r\n" + 
			"        \"age\": 34\r\n" + 
			"    }\r\n" + 
			"}";
	
	String s2 = "{   \r\n" + 
			"    \"employee\":\r\n" + 
			"    {\r\n" + 
			"        \"id\": \"1212\",\r\n" + 
			"        \"age\": 34,\r\n" + 
			"        \"fullName\": \"John Miles\"\r\n" + 
			"    }\r\n" + 
			"}";

	ObjectMapper mapper = new ObjectMapper();

	@Test
	public void testCompare() throws IOException {
		
		JsonNode Expected = mapper.readTree(s1);
		JsonNode Actual = mapper.readTree(s2);
		
		assertEquals(Expected ,Actual );
	}
}
