import javax.swing.*;

public class Lab6 {
    private String accountNumber;
    private float balance;
    private float credits;
    private float debits;
    private float creditLimit;

    public Lab6() {
        accountNumber = "1";
        balance = 100;
        credits = 10;
        debits = 20;
        creditLimit = 50;
    }

    public Lab6(String accountNumber, String balance, String credits, String debits, String creditLimit) {
        this.accountNumber = this.setAccountNumber(accountNumber);
        this.balance = this.setBalance(balance);
        this.credits = this.setCredits(credits);
        this.debits = this.setDebits(debits);
        this.creditLimit = this.setCreditLimit(creditLimit);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public float getCreditLimit() {
        return creditLimit;
    }

    public float getCredits() {
        return credits;
    }

    public float getBalance() {
        return balance;
    }

    public float getDebits() {
        return debits;
    }

    public String setAccountNumber(String accountNumber) {
        return accountNumber;
    }

    public float setCreditLimit(String creditLimit) {
        float intCreditLimit = Float.parseFloat(creditLimit);
        if (intCreditLimit < 0 || intCreditLimit > 500)
            throw new IllegalArgumentException
                    (String.format("%s%s", "Credit limit cannot be less than 0 or more than 500, you entered ",
                            creditLimit));
        this.creditLimit = intCreditLimit;
        return this.creditLimit;
    }

    public float setCredits(String credits) {
        float intCredits = Float.parseFloat(credits);
        if (intCredits < 0 || intCredits > 100)
            throw new IllegalArgumentException
                    (String.format("%s%s", "Credits cannot be less than 0 or more than 100, you entered ",
                            credits));
        this.credits = intCredits;
        return this.credits;
    }

    public float setBalance(String balance) {
        float intBalance = Float.parseFloat(balance);
        if (intBalance > 100000)
            throw new IllegalArgumentException
                    (String.format("%s%s", "Balance cannot be more than 100000, you entered ",
                            balance));
        this.balance = intBalance;
        return this.balance;
    }

    public float setDebits(String debits) {
        float intDebits = Float.parseFloat(debits);
        if (intDebits > 700)
            throw new IllegalArgumentException
                    (String.format("%s%s", "Debits cannot be more than 700, you entered ",
                            debits));
        this.debits = intDebits;
        return this.debits;
    }

    public boolean checkCreditLimits(float balance, float debits, float credits, float creditLimit) {
        float newBalance = balance - debits + credits;
        if (newBalance < -creditLimit) {
            return true;
        }
        return false;

    }

    public void displayResults(String accountNumber, float balance, float debits, float credits, float creditLimit) {
        String text = "Account number " + accountNumber + " with balance " + String.format("%.2f", balance);
        if (this.checkCreditLimits(balance, debits, credits, creditLimit)) {
            text = text.concat(" has been exceeded");
        } else
            text = text.concat(" has not been exceeded");

        JOptionPane.showMessageDialog(null, text);
    }
}
