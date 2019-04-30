package ch.css.ebusiness.portal.onboarding.api.model;

public class RegistrationOptionWrapper {
    private RegistrationOption option;

    public RegistrationOption getOption() {
        return option;
    }

    public void setOption(RegistrationOption option) {
        this.option = option;
    }

    @Override
    public String toString() {
        return "RegistrationOptionWrapper{" +
                "option=" + option +
                '}';
    }
}
