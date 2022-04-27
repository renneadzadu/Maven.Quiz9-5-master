package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee implements Worker, Transactable{
    private BankAccount bankAccount;



   public Employee() {
   }

    public Employee(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }
    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void increaseHoursWorked(Double numberOfHours) {
//       int hourworked = 1;
//        for (int i = 0; i < hourworked; i++) {
//
//        }

    }

    @Override
    public Double getHoursWorked() {
        return getHoursWorked();
    }

    @Override
    public Double getHourlyWage() {
        return getHourlyWage();
    }

    @Override
    public Double getMoneyEarned() {
        return getMoneyEarned();
    }

    @Override
    public void deposit(Double amountToIncreaseBy) {
        System.out.println(getBalance() + amountToIncreaseBy);

    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        System.out.println(getBalance()-amountToDecreaseBy);
    }

    @Override
    public Double getBalance() {
        return getBalance();
    }
}
