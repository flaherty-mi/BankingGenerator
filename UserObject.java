// Meghan Flaherty
// CS145
// object
// creates the user object 

import java.util.LinkedList;


public class UserObject extends BankMain{

    public static UserObject next;
    
    private String firstName;
    private String lastName;
    private int numberID;
    private double balance;

    LinkedList<UserObject> user = new LinkedList<>();

    public UserObject(String firstName, String lastName, int numberID, double balance) {

        UserObject.next = null;

        setFirstName(firstName);
        setLastName(lastName);
        setNumberID(numberID);
        setBalance(balance);
        getFirstName();
        getLastName();
        getNumberID();
        getBalance();
    }

    public UserObject head = null;
    public UserObject tail = null;

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getNumberID() {
        return numberID;
    }

    public double getBalance() {
        return balance;
    }


    // setters

    public void setFirstName(String firstName) {
        this.firstName = firstName; 
    } 

    public void setLastName(String lastName) {
        this.lastName = lastName; 
    }

    public void setNumberID(int numberID) {
        this.numberID = numberID;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    

    public String toString() {
        return ("Name: " + lastName + ", " + firstName + "\n" +
                "ID: " + numberID + "\n" + 
                "Account Balance: $" + balance + "\n");
    }

}
