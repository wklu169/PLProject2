package lu.business;

import java.text.NumberFormat;

/**
 * Created by Owner on 2/19/2016.
 */
public class CheckingAccount extends Account {

    private double monthlyFee;

    public CheckingAccount(){
        super();
        monthlyFee = 0;
    }

    public void setMonthlyFee(double monthlyFee){
        this.monthlyFee = monthlyFee;
    }

    public double getMonthlyFee(){
        return monthlyFee;
    }

    public void subtractMonthlyFee(){
        this.setBalance(this.getBalance() - this.getMonthlyFee());
    }

    public String getMonthlyFeeFormatted(){
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String monthlyFeeFormatted = currency.format(this.getMonthlyFee());
        return monthlyFeeFormatted;
    }
}
