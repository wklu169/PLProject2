package lu.business;

/**
 * Created by Owner on 2/18/2016.
 */
public class Customer extends Person {
    private String customerNumber;

    public Customer() {
        super();
        customerNumber = "N/A";
    }

    public void setCustomerNumber(String customerNumber){
        this.customerNumber = customerNumber;
    }

    public String getCustomerNumber(){
        return customerNumber;
    }

    @Override
    public String getDisplayText(){
        return super.toString() + "\nCustomer number: " + this.getCustomerNumber();
    }
}
