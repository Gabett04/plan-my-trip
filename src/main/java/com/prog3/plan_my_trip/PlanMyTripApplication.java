package com.prog3.plan_my_trip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PlanMyTripApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlanMyTripApplication.class, args);
		System.out.println("\n✈️  PlanMyTrip Application Started Successfully!");
		System.out.println("🌐 Swagger UI: http://localhost:8080/swagger-ui.html");
		System.out.println("📖 API Docs: http://localhost:8080/v3/api-docs");
		System.out.println("🏠 Frontend: http://localhost:8080\n");
	}
}
