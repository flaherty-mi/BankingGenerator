// Meghan Flaherty
// CS145
// object
// creates the user object 



package Assignment III.src;

public class UserObject {

    
    private String firstName;
    private String lastName;
    private int numberID;
    private int balance;
    private int zipCode;
    private String city;

    public UserObject(String firstName, String lastName, int numberID, int balance, int zipCode, String city) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.numberID = numberID;
        this.balance = balance;
        this.zipCode = zipCode;
        this.city = city;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getNumberID() {
        return numberID;
    }

    public int getBalance() {
        return balance;
    }

    public int getZipCode() {
        return zipCode;
    }

    public String getCity(){
        return city;
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

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public void setCity(String city) {
        this.city = city; 
    }

    public String toString() {
        return ("Name: " + lastName + ", " + firstName + "\n" +
                "ID: " + numberID + "\n" + 
                "Account Balance: " + balance + "\n" +
                "Zip: " + zipCode + "\n" +
                "City: " + city + "\n");
    }

}
