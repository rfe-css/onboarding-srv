package ch.css.ebusiness.portal.onboarding.process.service;

public class OnboardingNotFoundException extends RuntimeException {

    OnboardingNotFoundException(final String id){
        super("No onboarding found for id '" + id + "'");
    }
}
