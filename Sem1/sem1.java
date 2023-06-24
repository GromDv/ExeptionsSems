public class Main {
    public static void main(String[] args) {

        int[] arr1 = new int[]{1,2,3,4,5,6,7,8,9};
        int[] arr2 = new int[]{0,1,2,3,4,5,6,7,8};

        // Задача 1
//        method1();
//        method2();
//        method3();

        // Задача 2
//        int[] arr3 = method4(arr1, arr2);
//        for (int i = 0; i < arr1.length; i++)
//            System.out.print(arr3[i]+", ");

        // Задача 3
        int[] arr3 = method5(arr1, arr2);
        for (int i = 0; i < arr1.length; i++)
            System.out.print(arr3[i]+", ");
    }

    // Метод, генерирующий ArithmeticException
    public static void method1() {
        int result = 10 / 0;
    }

    // Метод, генерирующий NullPointerException
    public static void method2() {
        String str = null;
        int length = str.length();
    }

    // Метод, генерирующий ArrayIndexOutOfBoundsException
    public static void method3() {
        int[] array = new int[5];
        int value = array[10];
    }

    // метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
    // каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке
    public static int[] method4(int[] arr1, int[] arr2) {
        int[] res = new int[arr1.length];
        if(arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++)
                res[i] = arr1[i]-arr2[i];
        } else {
            throw new RuntimeException("Длины массивов не равны!");
        }
        return res;
    }
    // метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, 
    // каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке
    public static int[] method5(int[] arr1, int[] arr2) {
        int[] res = new int[arr1.length];
        if(arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr2[i] == 0)
                    throw new RuntimeException("На 0 делить нельзя!");
                res[i] = arr1[i] / arr2[i];
            }
        } else {
            throw new RuntimeException("Длины массивов не равны!");
        }
        return res;
    }
}
