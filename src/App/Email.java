package App;

import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String department;
    private int mailBoxCapacity = 500;
    private int defaultPasswordLength = 12;
    private String alternateEmail;
    private String companySuffix = "company.com";

    // Constructor to receive first and last name
    // Ask for department
    // Generate random password
    // Set the mailbox Capacity
    // Set the alternate email
    // Change the password

    public Email(String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;

        System.out.println("Email created: " + this.firstName + " " + this.lastName);

        // Call a method asking for the department - return the department
        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        // Call a method that returns a random password
        this.password = generatePassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);

        // Combine elements to create email
        this.email = this.firstName.toLowerCase() + "." + this.lastName.toLowerCase() + "@" + this.department + "." + this.companySuffix;
        System.out.println("Your email is: " + this.email);
    }

    private String setDepartment() {

        System.out.println("Enter the department:");
        System.out.println(" - 1 : Sales");
        System.out.println(" - 2 : Developer");
        System.out.println(" - 3 : Accounting");
        System.out.println(" - 0 : None");
        System.out.print("> ");
        Scanner in = new Scanner(System.in);
        int departmentChoice = in.nextInt();

        return switch (departmentChoice) {
            case 1 -> "sales";
            case 2 -> "developer";
            case 3 -> "accounting";
            default -> "";
        };
    }

    private String generatePassword(int length) {

        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!@#$&";
        char[] password = new char[length];
        for (int i=0; i<length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());

            password[i] = passwordSet.charAt(rand);
        }

        return new String(password);
    }

    // Set the mailbox capacity
    public void setMailBoxCapacity(int capacity){
        this.mailBoxCapacity = capacity;
    }

    // Set the alternate email
    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    // Change the password
    public void changePassword(String password) {
        this.password = password;
    }

    public int getMailBoxCapacity() { return mailBoxCapacity; }
    public String getAlternateEmail() { return alternateEmail; }
    public String getPassword() { return password; }

    public void showInfo() {

        System.out.println("- Account -");
        System.out.println("First: " + firstName);
        System.out.println("Last: " + lastName);
        System.out.println("Email: " + email);
        System.out.println("Capacity: " + mailBoxCapacity + "mb");
    }
}
