import java.util.Scanner;

public class TaskSeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       for (int questrepeat = 1 ; questrepeat == 1; questrepeat = scanner.nextInt() ) {
           System.out.println("Какое задание хотите выполнить (от 1 до 6)");
           int tasknumber = scanner.nextInt();
           if (tasknumber <= 6) {               //проверка на вводимое значение
               if (tasknumber == 1) {
                   count();
               }
               if (tasknumber == 2) {
                   System.out.println("введите длину прямоугольника");
                   int l = scanner.nextInt();
                   System.out.println("введите высоту прямоугольника");
                   int h = scanner.nextInt();
                   drawRectangle(l, h);
               }
               if (tasknumber == 3) {
                   System.out.println("введите сторону квадрата");
                   int l = scanner.nextInt();
                   drawRectangle(l);
               }
               if (tasknumber == 4) {
                   System.out.println("Введите 2 значения для опредиления большего. Если вы хотите сравнить дробные числа вводите через запятую, например 5,0");


                   if (scanner.hasNextInt()) {                                          // проверка на тип вводимых данных для того что бы был флоат нужно первое значение обязательно флоат
                       int a = scanner.nextInt();
                       int b = scanner.nextInt();
                       System.out.println("самое большое значение = " + getMax(a, b));
                   } else {
                       float a = scanner.nextFloat();
                       float b = scanner.nextFloat();
                       System.out.println("самое большое значение = " + getMax(a, b));

                   }

               }
               if (tasknumber == 5) {
                   System.out.println("введите значение до которого нужно считать");
                   int X = scanner.nextInt();
                   System.out.println(countRecursion(X));

               }
               if (tasknumber == 6){
                   System.out.println("введите длину прямоугольника");
                    int l = scanner.nextInt();
                   System.out.println("введите высотупрямоугольника");
                    int h = scanner.nextInt();
                    int t = l;
                   System.out.println(drawRectangle1(l, h, t));
               }
           } else {
               System.out.println("вы ввели не правильное значение");

           }
           System.out.println("вы хотите выполнить ещё 1 задание ? (type 1 to repeat)");


       }
        }
    public static void count ()
    {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("введите значение до которого нужно считать");
        int num = scanner1.nextInt();
        for (int i = 1; i <= num; i++)
            System.out.println(i);
    }
    public static void drawRectangle (int l, int h) {
        for (int j = 0; j < h; j++) {
            for (int i = 0; i < l; i++)
                System.out.print("+");
            System.out.println();
        }
    }
    static void  drawRectangle(int l ) {           //overload square
        for (int j = 0; j < l; j++) {
            for (int i = 0; i < l; i++)
                System.out.print("+");
            System.out.println();
        }
    }
    static int getMax (int a, int b){                   // выполнение для инта
        int max = a > b ? a : b;
        return max;
    }
    static float getMax (float a, float b) {             // выполнение для флоата

        float max = a > b ? a : b;
        return max;
    }

    public static String countRecursion (int X) {


        if (X==1)
            return "1";
        return countRecursion(X-1) + "\n" + X;
    }

    public static String drawRectangle1(int l, int h, int t) {

        if (l > 0) {
            return drawRectangle1(l - 1, h,t) + "+";
        } else {
            if (h > 1) {
                return drawRectangle1(t, h - 1,t) + "\n";
            }
        }
        return "ваш прямогульник: \n";
    }
}
