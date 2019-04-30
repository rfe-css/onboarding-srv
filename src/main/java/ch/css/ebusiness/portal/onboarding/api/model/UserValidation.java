package ch.css.ebusiness.portal.onboarding.api.model;

public class UserValidation {
    private String partnerNo;
    private String birthdate;

    public String getPartnerNo() {
        return partnerNo;
    }

    public void setPartnerNo(String partnerNo) {
        this.partnerNo = partnerNo;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return "UserValidation{" +
                "partnerNo='" + partnerNo + '\'' +
                ", birthdate='" + birthdate + '\'' +
                '}';
    }
}
