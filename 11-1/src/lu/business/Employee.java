package lu.business;

/**
 * Created by Owner on 2/18/2016.
 */
public class Employee extends Person{
    private String ssn;

    public Employee() {
        super();
        ssn = "N/A";
    }

    public void setSsn(String ssn){
        this.ssn = ssn;
    }

    public String getSsn(){
        return ssn;
    }

    @Override
    public String getDisplayText(){
        return super.toString() + "\nSocial security number: " + this.getSsn();
    }
}
