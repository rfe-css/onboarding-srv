package ch.css.ebusiness.portal.onboarding;

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableProcessApplication("onboarding")
public class OnboardingApplication {
    public static void main(String... args) {
        SpringApplication.run(OnboardingApplication.class, args);
    }

}
