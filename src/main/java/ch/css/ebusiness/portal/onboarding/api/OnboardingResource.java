package ch.css.ebusiness.portal.onboarding.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OnboardingResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(OnboardingResource.class);

    @GetMapping("/{tenant}/kuzu/v1/onboarding")
    public ResponseEntity<Void> doSomething(@PathVariable("tenant") final String tenant) {
        LOGGER.info("called rest endpoint for tenant '{}'", tenant);
        return ResponseEntity.ok().build();
    }
}
