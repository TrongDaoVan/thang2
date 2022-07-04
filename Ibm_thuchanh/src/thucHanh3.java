import java.util.Scanner;

public class thucHanh3 {
    public static void main(String[] args) {
        System.out.println("Giải phương trình bậc 1");
        System.out.println("Phương trình có dạng a*x + b = c");
        Scanner scanner = new Scanner(System.in);
        double a, b, c, answer;
        System.out.println("a = ");
        a = scanner.nextDouble();
        System.out.println("b = ");
        b = scanner.nextDouble();
        System.out.println("b = ");
        c = scanner.nextDouble();
        if (a != 0) {
            answer = (c - b) / a;
            System.out.println("nghiệm của phương trình = " + answer);
        }
        else {
            if (b == c) {
                System.out.println("Phương trình vô số nghiệm");
            }
            else {
                System.out.println("Phương trình vô nghiệm");
            }
        }
    }
}
