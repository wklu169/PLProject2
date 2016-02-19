package lu.business;

/**
 * Created by Owner on 2/18/2016.
 */
public abstract class Person {
    private String firstName;
    private String lastName;
    private String email;

    public Person (){}

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }

    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }

    @Override
    public String toString(){
        return "Name: " + this.getFirstName() + " " + this.getLastName() + "\n" + "Email: " + this.getEmail();
    }

    public abstract String getDisplayText();
}
