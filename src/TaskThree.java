public class TaskThree {
    static void drawRectangle(int l, int h) {     //rectangle
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
    public static void main(String[] args) {
        drawRectangle (5);
    }
}



