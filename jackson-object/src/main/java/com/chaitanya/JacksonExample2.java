package com.chaitanya;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonExample2 {

	public static void main(String[] args) {

		ObjectMapper mapper = new ObjectMapper();

		try {

			// Convert JSON string from file to Object
			User user = mapper.readValue(new File("E:\\JacEx\\user.json"), User.class);
			System.out.println(user);

			// Convert JSON string to Object
			String jsonInString = "{\"age\":33,\"messages\":[\"msg 1\",\"msg 2\"],\"name\":\"chaitanya\"}";
			User user1 = mapper.readValue(jsonInString, User.class);
			System.out.println(user1);

		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
