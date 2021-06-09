package eu.sig.training.ch04;

// tag::SavingsAccount[]
public class SavingsAccount extends BaseAccount{
    private static final float INTEREST_PERCENTAGE = 0.04f;
    private Money balance = new Money();
    private CheckingAccount registeredCounterAccount;

    public Transfer makeTransfer(String counterAccount, Money amount) 
        throws BusinessException {
        Transfer transferResult = executeTransfer(counterAccount, amount);
        //  Check whether withdrawal is to registered counter account:
        if (transferResult.getCounterAccount().equals(this.registeredCounterAccount))
        {
            return transferResult;
        } else {
            throw new BusinessException("Counter-account not registered!");
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
// end::SavingsAccount[]
