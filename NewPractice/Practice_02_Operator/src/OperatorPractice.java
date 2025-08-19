import java.util.Scanner;

public class OperatorPractice {
    public static void main(String[] args) {
        OperatorPractice op = new OperatorPractice();
        op.practice1();
        op.practice2();
        op.practice3();
        op.practice4();
    }

    public void practice1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("인원 수 : ");
        int num1 = Integer.parseInt(sc.nextLine());
        System.out.print("사탕 개수 : ");
        int num2 = Integer.parseInt(sc.nextLine());

        System.out.println("1인당 사탕 개수 " + num2 / num1);
        System.out.println("남는 사탕 개수" + num2 % num1);
    }

    public void  practice2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 : ");
        int num1 = Integer.parseInt(sc.nextLine());

        System.out.println( num1 > 0 ? "양수다" : "양수가 아니다");
    }

    public void practice3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 : ");
        int num1 = Integer.parseInt(sc.nextLine());

        System.out.println( num1 > 0 ? "양수다" : (num1 == 0 ? "0이다." : "음수다"));
    }

    public void practice4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 : ");
        int num1 = Integer.parseInt(sc.nextLine());

        System.out.println((num1 % 2 == 0) ? "짝수다" : "홀수다");
    }
}
