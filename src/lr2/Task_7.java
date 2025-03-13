package lr2;

import java.io.IOException;

public class Task_7 {
    public static void main(String[] args) {
        Person person = new Person();

        person.createBankAccount(100d);
        System.out.println(person.getBalance());
        person.depositBank(100d);
        System.out.println(person.getBalance());
        person.withdrawBank(500d);
        System.out.println(person.getBalance());
        person.withdrawBank(150d);
        System.out.println(person.getBalance());
    }
}

class BankAccount{
    private Double balance;

    BankAccount(Double initialBalance){
        if (initialBalance < 0) {
            System.out.println("Начальный баланс не может быть меньше 0");
            this.balance = 0d;
        }
        this.balance = initialBalance;
    }

    public void withdraw(Double amount){
        if (balance > amount) balance -= amount;
        else System.out.println("На балансе недостаточно средств!");
    }

    public void deposit(Double amount){
        if (amount < 0) System.out.println("Невозможно внести на счёт отрицательную сумму!");
        else balance += amount;
    }

    public Double getBalance() {
        return balance;
    }
}

interface BankUser{
    void createBankAccount(Double initialBalance);
    void depositBank(Double amount);
    void withdrawBank(Double amount);
    Double getBalance();
}

class Person implements BankUser{
    private BankAccount bankAccount;

    @Override
    public void createBankAccount(Double initialBalance){
        this.bankAccount = new BankAccount(initialBalance);
    }

    @Override
    public void depositBank( Double amount) {
        bankAccount.deposit(amount);
    }

    @Override
    public void withdrawBank(Double amount) {
        bankAccount.withdraw(amount);
    }

    @Override
    public Double getBalance() {
        return bankAccount.getBalance();
    }
}