package ch.css.ebusiness.portal.onboarding.process;

import java.util.Arrays;
import java.util.Optional;

public enum ViewName {
    USER_VALIDATION("user_validation"),//
    REGISTRATION_OPTION("registration_option"),//
    DOCUMENT_CODE("document_code"),//
    ACTIVATION_LETTER("activation_letter");

    private final String viewId;

    ViewName(String viewId) {

        this.viewId = viewId;
    }

    public String getViewId() {
        return viewId;
    }

    public static Optional<ViewName> fromId(final String id) {
        return Arrays.stream(ViewName.values())
                .filter(n -> id.equalsIgnoreCase(n.getViewId()))
                .findFirst();
    }
}
