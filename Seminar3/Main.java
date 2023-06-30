package seminar3;

import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String[] newData = View.getInput(scan, "Введите Ф, И, О, телефон (через пробел): ");
        Contact newContact = new Contact(newData);
        System.out.println(newContact);
        newContact.saveContact();
        scan.close();
    }
}
