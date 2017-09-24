import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите значение до которого нужно считать");
        int X = scanner.nextInt();

        System.out.println(count( X ));
    }

    public static String count (int X) {


        if (X==1)
            return "1";
        return count(X-1) + "\n" + X;
        }


}