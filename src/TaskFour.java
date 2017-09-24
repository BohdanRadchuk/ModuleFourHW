import java.util.Scanner;

public class TaskFour {


    static int getMax (int a, int b){                   // выполнение для инта
        int max = a > b ? a : b;
       return max;
    }
    static float getMax (float a, float b) {             // выполнение для флоата

        float max = a > b ? a : b;
        return max;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 2 значения для опредиления большего. Если вы хотите сравнить дробные числа вводите через запятую, например 5,0");


        if (scanner.hasNextInt()){                                          // проверка на тип вводимых данных для того что бы был флоат нужно первое значение обязательно флоат
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println("самое большое значение = " + getMax(a,b));
        }
        else {
            float a = scanner.nextFloat();
            float b = scanner.nextFloat();
            System.out.println("самое большое значение = " + getMax(a,b));

        }
    }
}
