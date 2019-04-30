package ch.css.ebusiness.portal.onboarding.api.model;

public class DocumentCode {
    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "DocumentCode{" +
                "code='" + code + '\'' +
                '}';
    }
}
