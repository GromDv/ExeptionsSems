import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.printf("Введено число: %.3f",getFloat("Введите число: "));
        scan.close();
    }

    /**
     * Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
     * Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
     */
    public  static Float getFloat(String mes) {
        Float res = null;
        String inpt = null;
        System.out.print(mes);
        inpt = scan.nextLine();
        if(inpt.length() == 0)
            throw new RuntimeException("Нельзя вводить пустые строки!");
        else
            try {
                res = Float.parseFloat(inpt);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        return  res;
    }
}
