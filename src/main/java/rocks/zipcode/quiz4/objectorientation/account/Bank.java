package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 27/12/2018.
 */
public class Bank extends BankAccount{
    private BankAccount bankAccount;
    List<BankAccount> accounts = new ArrayList<>();


    public Bank(){

    }

    public Bank(Long id, Double balance,BankAccount bankAccount ) {
        super(id, balance);
        this.bankAccount = bankAccount;
    }


    public BankAccount removeBankAccountByIndex(Integer indexNumber) {

        return null;
    }

    public void addBankAccount(BankAccount bankAccount) {
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
        throw new UnsupportedOperationException("Method not yet implemented");
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
}
