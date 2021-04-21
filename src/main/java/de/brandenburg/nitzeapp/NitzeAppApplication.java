package de.brandenburg.nitzeapp;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@SpringBootApplication
@RestController
public class NitzeAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(NitzeAppApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		//return String.format("Hello %s!", name);
		ObjectMapper objectMapper = new ObjectMapper();

		ArrayList<Student> listOfStudents = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			Student stud = new Student(name+" Müller");
			stud.setAge(i);
			listOfStudents.add(stud);
		}

		try {
			return objectMapper.writeValueAsString(listOfStudents);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			return null;
		}
	}

	@PostMapping("/goodbye")
	public String goodbye(@RequestParam(value = "id") String id) {
		return "Goodbye!";
	}
}
