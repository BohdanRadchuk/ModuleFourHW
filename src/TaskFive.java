import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите значение до которого нужно считать");
        int a = scanner.nextInt();
        int i = 0;
        Count(a, i);
    }

    public static String Count (int a, int i) {

        i++;
        System.out.println(i);
        if (i < a)
            return Count(a, i);
        return null;
        }


}