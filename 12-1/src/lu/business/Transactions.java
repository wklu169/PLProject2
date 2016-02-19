package lu.business;

import lu.account.interfaces.Depositable;
import lu.account.interfaces.Withdrawable;

/**
 * Created by Owner on 2/19/2016.
 */
public class Transactions {
    public static void deposit(Depositable account, double amount){
        account.deposit(amount);
    }

    public static void withdraw(Withdrawable account, double amount){
        account.withdraw(amount);
    }
}
