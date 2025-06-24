package com.example.backend;
import com.example.backend.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}
	@Bean
	CommandLineRunner init(EmployeeRepository repo) {
		return args -> {
			repo.save(new Employee(1L, "John"));
			repo.save(new Employee(2L, "Sarah"));
		};
	}

}
