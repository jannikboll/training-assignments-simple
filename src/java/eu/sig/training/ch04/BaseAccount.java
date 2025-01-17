package eu.sig.training.ch04;

public class BaseAccount {

    private Money balance = new Money();
    private static final float INTEREST_PERCENTAGE = 0.01f;

    protected boolean isValidAccount(String accountNumber) {
        // 1. Assuming result is 9-digit bank account number, validate 11-test:
        int sum = 0; // <1>
        for (int i = 0; i < accountNumber.length(); i++) {
            char character = accountNumber.charAt(i);
            int characterValue = Character.getNumericValue(character);
            sum = sum + (9 - i) * characterValue;
        }
        return (sum % 11 == 0);
    }

    protected Transfer executeTransfer(String accountNumber, Money amount) throws BusinessException {
        if(isValidAccount(accountNumber)) {
            BaseAccount acct = Accounts.findAcctByNumber(accountNumber);
            return new Transfer(this, acct, amount);
        } else {
            throw new BusinessException("Invalid account number!");
        }
    }

    public void addInterest() {
        Money interest = balance.multiply(INTEREST_PERCENTAGE);
        if (interest.greaterThan(0)) {
            balance.add(interest);
        } else {
            balance.substract(interest);
        }
    }
}
