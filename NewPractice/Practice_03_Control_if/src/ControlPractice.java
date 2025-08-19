import java.util.Scanner;

public class ControlPractice {
    public static void main(String[] args) {
        ControlPractice controlPractice = new ControlPractice();
        controlPractice.practice1();
        controlPractice.practice2();
        controlPractice.practice3();
        controlPractice.practice4();
        controlPractice.practice5();
        controlPractice.practice6();
        controlPractice.practice7();
        controlPractice.practice8();

    }

    public void practice1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 : ");
        int num = Integer.parseInt(sc.nextLine());

        if (num > 0) {
            System.out.println("양수다");
        }else {
            System.out.println("양수가 아니다.");
        }
    }

    public void practice2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 : ");
        int num = Integer.parseInt(sc.nextLine());
        if (num > 0) {
            System.out.println("양수다");
        }else if (num == 0) {
            System.out.println("0이다");
        }else {
            System.out.println("음수다");
        }
    }

    public void practice3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 : ");
        int num = Integer.parseInt(sc.nextLine());
        if (num % 2 == 0) {
            System.out.println("짝수다.");
        }else {
            System.out.println("홀수다");
        }
    }

    public void practice4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 한 개 입력하세요 : ");
        int num = Integer.parseInt(sc.nextLine());
        if (num > 0 ) {
            if (num % 2 == 0) {
                System.out.println("짝수다");
            }else {
                System.out.println("홀수다");
            }
        }else {
            System.out.println("양수만 입력해주세요.");
        }
    }

    public void practice5() {
        Scanner sc = new Scanner(System.in);
        System.out.print("주민번호를 입력하세요(- 포함) : ");
        String code = sc.nextLine();
        char ch = code.charAt(7);
        if (ch == 2 || ch ==4) {
            System.out.println("여자");
        }else {
            System.out.println("남자");
        }
    }

    public void practice6() {
        Scanner sc = new Scanner(System.in);
        System.out.print("나이 : ");
        int age = Integer.parseInt(sc.nextLine());
        if (age < 14) {
            System.out.println("어린이");
        }else if (age < 20) {
            System.out.println("청소년");
        }else {
            System.out.println("성인");
        }
    }

    public void practice7() {
        Scanner sc = new Scanner(System.in);
        System.out.print("아이디 : ");
        String uid =  sc.nextLine();
        System.out.print("비밀번호 : ");
        String upwd = sc.nextLine();

        String id = "test";
        String pwd = "1212";

        if (uid.equals(id) && upwd.equals(pwd)) {
            System.out.println("로그인 성공");
        }else if  (uid.equals(id) && (!upwd.equals(pwd))) {
            System.out.println("비밀번호가 틀렸습니다");
        }else {
            System.out.println("아이디가 틀렸습니다.");
        }
    }

    public void practice8() {
        Scanner sc = new Scanner(System.in);
        System.out.print("피연산자 1 입력 : ");
        int num1 = Integer.parseInt(sc.nextLine());
        System.out.print("피연산자 2 입력 : ");
        int num2 = Integer.parseInt(sc.nextLine());
        System.out.print("연산자를 입력 (+,-,*,/,%) : ");
        char ch = sc.nextLine().charAt(0);

        switch (ch) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            case '%':
                System.out.println(num1 % num2);
                break;
            default:
                System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
        }
    }
}
