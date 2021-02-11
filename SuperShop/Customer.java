package SuperShop;

public class Customer extends Person {

    private String Number;
    private String Address;

    public Customer(String number, String address) {
        Number = number;
        Address = address;
    }

    public Customer(String name, int age, String gender, String number, String address) {
        super(name, age, gender);
        Number = number;
        Address = address;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    void displayCustomer() {
        displayPerson();
        System.out.println("Phone Number: " + Number);
        System.out.println("Address: " + Address);
    }

}
