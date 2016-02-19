package lu.business;

import java.text.NumberFormat;
import lu.account.interfaces.*;

/**
 * Created by Owner on 2/19/2016.
 */
public class Account implements Depositable, Withdrawable, Balanceable{

    private double balance;

    public Account(){}

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }

    @Override
    public void setBalance(double amount){
        balance = amount;
    }

    @Override
    public double getBalance(){
        return balance;
    }

    public String getBalanceFormatted(){
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String balanceFormatted = currency.format(this.getBalance());
        return balanceFormatted;
    }
}
