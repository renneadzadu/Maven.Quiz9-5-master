package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee implements Worker, Transactable{
    BankAccount bankAccount;
    Double hourlyWage;
    Double hoursWorked;
    Double balance;

// nullary
   public Employee() {
       this.bankAccount = new BankAccount();
       this.hourlyWage = 35.0;
       this.hoursWorked = 0.0;
       this.balance = 0.0;

   }
// non nullable
    public Employee(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
        this.hourlyWage = 35.0;
        this.hoursWorked = 0.0;
        this.balance = 15.0;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void increaseHoursWorked(Double numberOfHours) {
       hoursWorked += numberOfHours;

    }

    @Override
    public Double getHoursWorked() {
        return hoursWorked;
    }

    @Override
    public Double getHourlyWage() {

       return hourlyWage;
    }

    @Override
    public Double getMoneyEarned() {

       return hourlyWage * hoursWorked;
    }

    @Override
    public void deposit(Double amountToIncreaseBy) {
      bankAccount.deposit(amountToIncreaseBy);

    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {

       bankAccount.withdrawal(amountToDecreaseBy);
    }

    @Override
    public Double getBalance() {

       return bankAccount.getBalance();
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
