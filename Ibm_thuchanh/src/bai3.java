import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vnd = 23000;
        double usd, quydoi ;
        System.out.println("Nhập giá trị muốn đổi ");
        usd = scanner.nextDouble();
        quydoi = usd * vnd;
        System.out.println("Bạn nhận được số tiền là = " + quydoi);
    }
}
