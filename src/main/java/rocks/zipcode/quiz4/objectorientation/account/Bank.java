package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {
    List<BankAccount> accounts;


    public Bank(){
       this.accounts = new ArrayList<>();

    }

//    public Bank(BankAccount bankAccount, List<BankAccount> accounts) {
//        this.bankAccount = bankAccount;
//        this.accounts = accounts;
//    }

    public void removeBankAccountByIndex(Integer indexNumber) {
        int x = (int) indexNumber;
        accounts.remove(x);
//        accounts.remove((int)indexNumber);

    }

    public void addBankAccount(BankAccount bankAccount) {
        accounts.add(bankAccount);

    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
        return accounts.contains(bankAccount);

    }

}
