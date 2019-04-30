package ch.css.ebusiness.portal.onboarding.api.model;

public enum RegistrationOption {
    LETTER("activation_letter"), //
    DOCUMENT("document");

    private final String type;

    RegistrationOption(final String type) {

        this.type = type;
    }

    public String getType() {
        return type;
    }
}
