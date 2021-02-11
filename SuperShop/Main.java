package SuperShop;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n\n------------------------------------");
        System.out.println("         Employee List              ");
        System.out.println("------------------------------------\n\n");

        System.out.println("------------- Administrator -----------------\n");
        Administrator ad1 = new Administrator("Hasib", 20, "male", 301, "Formal", "017XXXXXXX", "Administrator",
                "BSc in CSE", 25000, "Day", 8);
        ad1.displayAdministrator();

        System.out.println("\n\n------------- Accontant -----------------\n");
        Accountant a1 = new Accountant("Likhon", 20, "Male", 201, "Formal", "017XXXXXXX", "Accountant",
                "Graduation in ACT", 30000, "Day", 8);
        a1.displayAccountant();

        System.out.println("\n\n------------- Worker -----------------\n");
        Worker w1 = new Worker("Nirob", 21, "Male", 401, "Formal", "017XXXXXXX", 18000, "Day", 12);
        w1.displayWorker();

        System.out.println("\n\n------------- Customers List -------------");
        Customer c1 = new Customer("Jahid Hasan", 20, "Male", "01773393608", "Gazipur, Dhaka, Bangladesh");
        c1.displayCustomer();

    }
}
