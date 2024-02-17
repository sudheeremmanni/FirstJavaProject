package practice;

public class Bank {
    public String bankName;
    public String bankBranch;
    public String bankCode;
    public String bankCountry;

    public Bank() {
        this.bankName = "SBI";
        this.bankBranch = "Hyderabad";
        this.bankCode = "ABCD";
        this.bankCountry = "India";
    }

    @Override
    public String toString() {
        return "Bank{" +
                "bankName='" + bankName + '\'' +
                ", bankBranch='" + bankBranch + '\'' +
                ", bankCode='" + bankCode + '\'' +
                ", bankCountry='" + bankCountry + '\'' +
                '}';
    }
}
