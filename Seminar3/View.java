package seminar3;

import java.util.Scanner;

public class View {
    public static String[] getInput(Scanner sc, String mess) {
        String[] result = null;
        String inpt = null;
        Boolean isCorrect = true;
        do {
            isCorrect = true;
            System.out.print(mess);
            inpt = sc.nextLine();
            if (inpt.length() == 0) {
                System.out.println("Нельзя вводить пустые строки. Повторите!");
                isCorrect = false;
            } else {
                result = inpt.split(" ");
                if(result.length != 4) {
                    System.out.println("Введено не верное количество данных. Повторите!");
                    isCorrect = false;
                } else {
                    try {
                        Long a = Long.parseLong(result[3]);
                    } catch (NumberFormatException e) {
                        System.out.println("Введен не верный номер телефона. Повторите!");
                        isCorrect = false;
                    }
                }
            }
        } while (!isCorrect);
        return result;
    }
}
