import java.sql.SQLOutput;
import java.util.Scanner;

public class OperatorPractice {
    public static void main(String[] args) {
        OperatorPractice op = new OperatorPractice();
        op.practice1();
        op.practice2();
        op.practice3();
        op.practice4();


    }

    public void practice1 () {
        //모든 사람이 사탕을 골고루 나눠가지려고 한다.
        //1인당 동일하게 나눠가진 사탕의 개수와 남은 사탕의 개수를 출력
        Scanner sc = new Scanner(System.in);

        System.out.print("인원 수 : ");
        int numperson = Integer.parseInt(sc.nextLine());

        System.out.print("사탕 개수 : ");
        int numcandy = Integer.parseInt(sc.nextLine());

        System.out.println("1인당 사탕 개수 : " + numcandy / numperson);
        System.out.println("남는 사탕 개수 : " + numcandy % numperson);
    }

    public void practice2 () {
        //키보드로 입력받은 정수의 양수여부
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 : ");
        int number = Integer.parseInt(sc.nextLine());

        String result = number > 0 ? "양수다" : "양수가 아니다";
        System.out.println(result);

    }

    public void practice3 () {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 : ");
        int number = Integer.parseInt(sc.nextLine());

        String result = number > 0 ? "양수다" : number < 0 ? "음수다" : "0이다";
        System.out.println(result);
    }

    public void practice4 () {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 : ");
        int number = Integer.parseInt(sc.nextLine());

        String result = number % 2 == 0 ? "짝수다" : "홀수다";
        System.out.println(result);
    }
}
