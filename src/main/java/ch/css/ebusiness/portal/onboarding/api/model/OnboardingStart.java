package ch.css.ebusiness.portal.onboarding.api.model;

import javax.validation.constraints.NotNull;

public class OnboardingStart {
    @NotNull
    private String id;

    public OnboardingStart() {
        //
    }

    public OnboardingStart(@NotNull String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "OnboardingStart{" +
                "id='" + id + '\'' +
                '}';
    }
}
