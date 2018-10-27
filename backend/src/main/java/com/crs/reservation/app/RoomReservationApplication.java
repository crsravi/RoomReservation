package com.crs.reservation.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.crs.reservation"})
@EnableJpaRepositories("com.crs.reservation.dao")
@EntityScan("com.crs.reservation.entity")
public class RoomReservationApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoomReservationApplication.class, args);
	}
}
