public class Member extends Person {
    private boolean isBasicMember;
    private int fullFee = 299;
    private int basicFee = 199;

    public Member(String name, String cpr, boolean isBasicMember) {
        super(name, cpr);
        this.isBasicMember = isBasicMember;
    }

    public boolean isBasicMember() {
        return isBasicMember;
    }

    public void setBasicMember(boolean basicMember) {
        isBasicMember = basicMember;
    }

    public String getMembershipType() {
        if (isBasicMember) {
            return "Basic";
        } else {
            return "Full";
        }
    }

    public int getMonthlyFee() {
        if (isBasicMember) {
            return basicFee;
        } else {
            return fullFee;
        }
    }
}
