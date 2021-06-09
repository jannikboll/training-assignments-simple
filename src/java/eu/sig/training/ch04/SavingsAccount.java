package eu.sig.training.ch04;

// tag::SavingsAccount[]
public class SavingsAccount extends BaseAccount{

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
}
// end::SavingsAccount[]
