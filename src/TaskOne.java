import java.util.Scanner;

public class TaskOne {
    public static void count () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите значение до которого нужно считать");
        int num = scanner.nextInt();
        for (int i = 1; i <= num; i++)
            System.out.println(i);
    }
    public static void main(String[] args) {
        count();
    }
}
