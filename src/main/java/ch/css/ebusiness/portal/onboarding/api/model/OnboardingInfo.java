package ch.css.ebusiness.portal.onboarding.api.model;

import java.util.Map;

public class OnboardingInfo {
    private String id;
    private Map<String, Object> variables;
    private String currentStep;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Map<String, Object> getVariables() {
        return variables;
    }

    public void setVariables(Map<String, Object> variables) {
        this.variables = variables;
    }

    @Override
    public String toString() {
        return "OnboardingInfo{" +
                "id='" + id + '\'' +
                ", variables=" + variables +
                ", currentStep='" + currentStep + '\'' +
                '}';
    }

    public void setCurrentStep(final String currentStep) {
        this.currentStep = currentStep;
    }

    public final String getCurrentStep() {
        return currentStep;
    }
}
