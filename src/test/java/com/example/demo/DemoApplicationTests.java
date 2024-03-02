
package com.example.demo;

import com.example.demo.Controller.Controller1;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.Arrays;
import java.util.List;

@WebMvcTest(Controller1.class)
class DemoApplicationTests {

    @Autowired
    MockMvc mockMvc;

	@Test
	public void testGreetingEndPoint() throws Exception {
	    String name = "Rajnish";

	    mockMvc.perform(MockMvcRequestBuilders.get("/api/greeting/{name}",name))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Hello" + name + "Congratulation you have successfully completed Jenkins CI/CD"));
    }
	@Test
	public void findAllUsersEndPoint() throws Exception{
		List<String> name = Arrays.asList("Rajnish", "Shyam," ,"Mangal");
		mockMvc.perform(MockMvcRequestBuilders.get("/api/users"))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content().string(name.get(0)));
	}

}

