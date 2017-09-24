public class TaskSix {
    public static String drawRectangle(int l, int h) {
        if (l > 0) {
            return drawRectangle(l - 1, h) + "+";
        } else {
            if (h > 1) {
                return drawRectangle(6, h - 1) + "\n";
            }
        }
        return "ваш прямогульник: \n";
    }

    public static void main(String[] args) {
        System.out.println(drawRectangle(6, 5));
    }
}
