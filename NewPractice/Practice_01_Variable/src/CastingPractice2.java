import java.util.Scanner;

public class CastingPractice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("국어 : ");
        double a = sc.nextDouble();
        System.out.print("영어 : ");
        double b = sc.nextDouble();
        System.out.print("수학 : ");
        double c = sc.nextDouble();

        double sum = a + b + c;
        System.out.println("총점 : " + (int)sum );
        System.out.print("평균 : " + (int)(sum / 3));
    }
}
