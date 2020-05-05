package com.capgemini.SpringTask;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableTask
public class SpringTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTaskApplication.class, args);
	}

	@Bean
	public HelloWorldCommandLineRunner getRunner() {
		return new HelloWorldCommandLineRunner();
	}

	public static class HelloWorldCommandLineRunner implements CommandLineRunner {

		@Override
		public void run(String... args) throws Exception {
			System.out.println("Hello " + args[1] + " length of array " + args.length);
		}

	}
}