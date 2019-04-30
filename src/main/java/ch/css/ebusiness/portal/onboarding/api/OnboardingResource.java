package ch.css.ebusiness.portal.onboarding.api;

import ch.css.ebusiness.portal.onboarding.api.model.*;
import ch.css.ebusiness.portal.onboarding.process.service.OnboardingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/{tenant}/kuzu/v1/onboarding")
public class OnboardingResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(OnboardingResource.class);
    private final OnboardingService onboardingService;

    public OnboardingResource(final OnboardingService onboardingService) {

        this.onboardingService = onboardingService;
    }

    @PostMapping
    public ResponseEntity<OnboardingStart> startOnboarding(@PathVariable("tenant") final String tenant) {

        LOGGER.info("Startet onboarding for tenant '{}'", tenant);
        final String onboardingId = onboardingService.start();
        return ResponseEntity.ok(new OnboardingStart(onboardingId));
    }

    @GetMapping("/{id}")
    public ResponseEntity<OnboardingInfo> info(@PathVariable("tenant") final String tenant, @PathVariable("id") final String onboardingId) {

        LOGGER.info("Getting info about onboarding '{}' for tenant '{}'", onboardingId, tenant);
        final Optional<OnboardingInfo> result = onboardingService.info(onboardingId);
        return ResponseEntity.of(result);
    }

    @PostMapping("/{id}/user_validation")
    public ResponseEntity<OnboardingInfo> userValidation(@PathVariable("tenant") final String tenant, @PathVariable("id") final String onboardingId, @RequestBody final UserValidation userValidation) {

        LOGGER.info("User got validated for onboarding '{}' for tenant '{}': {}", onboardingId, tenant, userValidation);
        final Optional<OnboardingInfo> result = onboardingService.userValidationFinished(onboardingId, userValidation);
        return ResponseEntity.of(result);
    }

    @PostMapping("/{id}/registration_option")
    public ResponseEntity<OnboardingInfo> registrationOption(@PathVariable("tenant") final String tenant, @PathVariable("id") final String onboardingId, @RequestBody final RegistrationOptionWrapper registrationOptionWrapper) {

        LOGGER.info("Registration option chosen for onboarding '{}' for tenant '{}': {}", onboardingId, tenant, registrationOptionWrapper);
        final Optional<OnboardingInfo> result = onboardingService.registrationOptionChosen(onboardingId, registrationOptionWrapper);
        return ResponseEntity.of(result);
    }

    @PostMapping("/{id}/document_code")
    public ResponseEntity<OnboardingInfo> documentCode(@PathVariable("tenant") final String tenant, @PathVariable("id") final String onboardingId, @RequestBody final DocumentCode documentCode) {

        LOGGER.info("Document code entered for onboarding '{}' for tenant '{}': {}", onboardingId, tenant, documentCode);
        final Optional<OnboardingInfo> result = onboardingService.documentCodeEntered(onboardingId, documentCode);
        return ResponseEntity.of(result);
    }

    @PostMapping("/{id}/activation_letter")
    public ResponseEntity<OnboardingInfo> activationLetter(@PathVariable("tenant") final String tenant, @PathVariable("id") final String onboardingId, @RequestBody final ActivationLetterCode activationLetterCode) {

        LOGGER.info("Activation letter confirmed for onboarding '{}' for tenant '{}': {}", onboardingId, tenant, activationLetterCode);
        final Optional<OnboardingInfo> result = onboardingService.activationLetterConfirmed(onboardingId, activationLetterCode);
        return ResponseEntity.of(result);
    }

}
