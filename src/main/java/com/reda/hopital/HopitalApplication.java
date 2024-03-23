package com.reda.hopital;

import com.reda.hopital.entities.Patient;
import com.reda.hopital.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.nio.file.Paths;
import java.util.Date;

@SpringBootApplication
public class HopitalApplication implements CommandLineRunner {
    @Autowired
    private PatientRepository patientRepository;

    public static void main(String[] args) {
        SpringApplication.run(HopitalApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Patient reda = Patient.builder()
                .fn("Reda")
                .ln("Elmarrakchy")
                .sick(false)
                .score(10)
                .birthday(new Date())
                .build();

        Patient mouad = Patient.builder()
                .fn("Mouad")
                .ln("Boufenzi")
                .sick(false)
                .score(14)
                .birthday(new Date())
                .build();

        patientRepository.save(mouad);
        patientRepository.save(reda);
    }
}
