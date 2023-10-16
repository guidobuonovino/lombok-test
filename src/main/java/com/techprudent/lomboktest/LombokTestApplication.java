package com.techprudent.lomboktest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.DependsOn;

import com.techprudent.lomboktest.model.TestLombok;
import com.techprudent.lomboktest.model.WithLombok;
import com.techprudent.lomboktest.model.WithoutLombok;

@SpringBootApplication
public class LombokTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(LombokTestApplication.class, args);

		System.out.println("\n\n\n LOMBOK TEST \n");
	}

	@Bean("withLombok")
	public WithLombok withLombok() {
		return new WithLombok("India", "26", "techprudent91@gmail.com", "withLombok");
	}

	@Bean("withoutLombok")
	public WithoutLombok withoutLombok() {
		return new WithoutLombok("withOUTLombok", "26", "India", "techprudent91@gmail.com");
	}

	@Bean
	@DependsOn(value = { "withLombok", "withoutLombok" })
	public TestLombok testLombok(WithLombok wl, WithoutLombok wol) {
		return new TestLombok(wl, wol);
	}
}
