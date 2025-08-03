package JavaBasics.Encapsulation;

public class BankClass {

    // Declare the variables - Access Modifiers - Private for security
    private long accNo;
    private String name;
    private String email;
    private float amount;


    // Constructor - Initialize the variables - Parameterized
    public BankClass(float a, long ac, String nm, String em) {
        this.amount = a;
        this.accNo = ac;
        this.name = nm;
        this.email = em;
    }

    // Methods for returning its value
    // Getters
    public long getAccNo(){ return accNo;}

    public float getAmount() {return amount;}

    public String getName() {return name;}

    public String getEmail() { return email; }

    // Setters

    public void setAccNo(long accNo) {this.accNo = accNo;}

    public void setAmount(float amount) {this.amount = amount;}

    public void setName(String name) {this.name = name.trim();}

    public void setEmail(String email) {this.email = email.trim();}


    // Display the information from the following data
    public void displayInfo() {
        System.out.println("Hello " + name + " Your email address is " + email + "The remaining balance:  " + amount +
                " The ending of your account number is: " +  accNo );
    }

    // Display the whole code

    public static void main(String[] args) {
    }
}
