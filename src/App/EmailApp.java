package App;

public class EmailApp {

    public static void main(String[] args) {

        Email em1 = new Email("John", "Smith");

        em1.changePassword("Hello");
        em1.showInfo();
    }

}
