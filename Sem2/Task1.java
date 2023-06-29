import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.printf("Введено число: %.3f",getFloat("Введите рациональное число: "));
        scan.close();
    }

    /**
     * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает
     * введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого,
     * необходимо повторно запросить у пользователя ввод данных.
     * @return float
     */
    public  static Float getFloat(String mes) {
        Float res = null;
        System.out.print(mes);
        while (res == null) {
            try {
                res = scan.nextFloat();
            } catch (InputMismatchException e) {
                System.out.print("Некорректный ввод, повторите: ");
                if(scan.hasNext())
                    scan.next();
            }
        }
        return  res;
    }
}
