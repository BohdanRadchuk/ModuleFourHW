public class TaskTwo {
    public static void drawRectangle (int l, int h) {
         for (int j = 0; j < h; j++) {
            for (int i = 0; i < l; i++)
                System.out.print("+");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        drawRectangle(6,5);
    }
}

