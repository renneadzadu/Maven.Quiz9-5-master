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
    protected double balance;


    @Override
    public void deposit(Double amountToIncreaseBy) {
       //balance = balance + amountToIncreaseBy;
         if (amountToIncreaseBy<=0){
             balance += amountToIncreaseBy;
         }
        throw new IllegalArgumentException();

    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        if (amountToDecreaseBy>=0&&amountToDecreaseBy<balance) {
            balance = balance - amountToDecreaseBy;
        }
        else {
            throw new IllegalArgumentException();

        }
    }


    public Double getBalance() {

        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
