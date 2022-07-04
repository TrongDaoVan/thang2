import java.util.Scanner;

public class thuchanh2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Float width, height,aria;
        System.out.println("Nhập chiều rộng");
        width = scanner.nextFloat();
        System.out.println("Nhập chiều dài");
        height = scanner.nextFloat();
        aria = width * height;
        System.out.println("Diện tích = " + aria);
    }
}
