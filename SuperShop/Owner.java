package SuperShop;

public class Owner extends Person {
    private double share;

    public Owner(double share) {
        this.share = share;
    }

    public Owner(String name, int age, String gender, double share) {
        super(name, age, gender);
        this.share = share;
    }

    public double getShare() {
        return share;
    }

    public void setShare(double share) {
        this.share = share;
    }

    void displayOwner() {
        displayPerson();
        System.out.println(share + " Persentage of Share in This Business");
    }
}
