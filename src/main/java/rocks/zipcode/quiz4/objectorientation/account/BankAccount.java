package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 27/12/2018.
 * The purpose of this class is to create a subclass of an Account which implements Transactable.
 * Methods to Complete
 * void setBalance(Double double)
 */
public class BankAccount extends Account implements Transactable{
    protected Double balance;

    public BankAccount() {

    }

    public BankAccount(Long id,Double balance) {
        super(id);
        this.balance = balance;
    }

    @Override
    public void deposit(Double amountToIncreaseBy) {
        balance = balance + amountToIncreaseBy;

    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        balance = balance - amountToDecreaseBy;
    }


    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
