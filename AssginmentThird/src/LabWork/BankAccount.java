package LabWork;

import java.util.ArrayList;
import java.util.Random;


public class BankAccount {
    //instance variables
    private int accountNumber;
    private String name;
    private double balance;

    //static properties
    private static double interest = 0.3;
    private static ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();

    //The first constructor receives a name and creates bank account with balance = 0
    public BankAccount (String name) {
        this(name,0);
    }


    //The second constructor receives name and balance, creates a bank amount and updates balance
    public BankAccount (String name, double balance) {
        this.setName(name);
        this.balance = balance;
        Random rn = new Random();
        accountNumber = rn.nextInt(899999)+100000;
    }

    //This method performs deposit operation
    public double deposit(double money) {
        if(money< 0){return -1;}
        else{
            balance+=money;
            return money;
        }
    }

    //This method performs withdraw operation
    public double withdrawMoney(double money) {
        if(money<0){
            return -1;
        }
        else if (this.balance<money)
        {
            return -1;
        }
        else{
            this.balance-=money;
            return money;
        }
    }

    //This method returns account number
    public int getAccountNumber() {
        return accountNumber;
    }

    //This method returns interest rate
    public static double getInterestRate() {
        int s =accounts.size();
        double rate =interest- s/5 *0.02;
        return rate;
    }

    //This method performs a transfer operation to a single bank account
    public double transfer(BankAccount destinationBankAccount, double amount) {
        if(destinationBankAccount == null){return -1;}
        else if(amount >this.balance){return -1;}
        else if(amount<0){return -1;}else
        {
            destinationBankAccount.deposit(amount);
            this.balance -= amount;
            return amount;
        }
    }

    //This method performs a transfer operation to multiple accounts
    public double transfer(BankAccount[] destinationBankAccount, double amount) {
        if(amount * (destinationBankAccount.length+1) < this.balance){return -1;}
        else if(destinationBankAccount==null){return -1;}
        else if(amount<0){return -1;}
        else if(destinationBankAccount.length==0){return -1;}
        else
            for(int i=0;i<destinationBankAccount.length;i++){
                destinationBankAccount [i].deposit(amount);
                this.balance -= amount;
            }
        return amount*(destinationBankAccount.length+1);
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        String str ="";
        str += "Account Number : "+accountNumber+", Name : "+name+" Balance : "+balance+"\n";
        return str;
    }

    public static void main(String args[]) {
        BankAccount ac = new BankAccount("jhon", 100000);
        accounts.add(ac);
        accounts.add(new BankAccount("Mark", 30000));
        accounts.add(new BankAccount("Mark", 5000));
        accounts.add(new BankAccount("Mark", 200000));
        for(int i=0;i<accounts.size();i++){
            BankAccount a = accounts.get(i);
            System.out.println(a);
        }
        System.out.println("Transfer operation\n");
        ac.transfer(accounts.get(1), 6000);

        for(int i=0;i<accounts.size();i++){
            BankAccount a = accounts.get(i);
            System.out.println(a);
        }
    }

}
