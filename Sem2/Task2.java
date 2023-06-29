Задание 2
try {
   int d = 0;
   double catchedRes1 = intArray[8] / d;
   System.out.println("catchedRes1 = " + catchedRes1);
} catch (ArithmeticException e) {
   System.out.println("Catching exception: " + e);
}

ПРАВИЛЬНО:
try {
    int d = 0;
    double catchedRes1 = intArray[8] / d;
    System.out.println("catchedRes1 = " + catchedRes1);
} catch (Exception e) {
    System.out.println("Catching exception: " + e.getMessage());
}

ИЛИ

try {
    int d = 0;
    double catchedRes1 = intArray[8] / d;
    System.out.println("catchedRes1 = " + catchedRes1);
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Catching exception: " + e.getMessage());
}
