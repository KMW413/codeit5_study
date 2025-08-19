import java.util.Scanner;

public class ControlPractice {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        ControlPractice cp =new ControlPractice();
        cp.practice1();
        cp.practice2();
        cp.practice3();
        cp.practice4();
        cp.practice5();
        cp.practice6();
        cp.practice7();
        cp.practice8();

    }

    public void practice1() {

        System.out.print("정수 : ");
        int num = Integer.parseInt(sc.nextLine());

        if (num > 0) {
            System.out.println("양수다");
        } else
            System.out.println("양수가 아니다");

    }

    public void practice2() {

        System.out.print("정수 : ");
        int num = Integer.parseInt(sc.nextLine());

        if (num > 0) {
            System.out.println("양수다");
        }else if (num == 0) {
            System.out.println("0이다");
        }else
            System.out.println("음수다");
    }

    public void practice3() {

        System.out.print("정수 : ");
        int num = Integer.parseInt(sc.nextLine());

        if ( num % 2 == 0){
            System.out.println("짝수다.");
        }else
            System.out.println("홀수다.");
    }

    public void practice4() {
        System.out.print("숫자를 한 개 입력하세요 : ");
        int num = Integer.parseInt(sc.nextLine());

        if ( num > 0 && num % 2 == 0){
            System.out.println("짝수다.");
        }else if (num % 2 == 1){
            System.out.println("홀수다.");
        }else
            System.out.println("양수만 입력해주세요.");
    }

    public void practice5() {
        System.out.print("주민번호를 입력하세요 (- 포함) : ");
        String sn = sc.nextLine();

        char code = sn.charAt(7);
        if (code == 2 || code == 4 ){
            System.out.println("여자");
        }else if (code == 1 || code == 3) {
            System.out.println("남자");
        }else
            System.out.println("잘못 입력하셨습니다.");

    }

    public void practice6() {
        System.out.print("나이 : ");
        int age = Integer.parseInt(sc.nextLine());

        if (age <= 13 ) {
            System.out.println("어린이");
        }else if (age <= 19) {
            System.out.println("청소년");
        }else
            System.out.println("성인");
    }

    public void practice7() {
        String id = "test";
        String pw = "1212";

        System.out.print("아이디 : ");
        String id2 = sc.nextLine();
        System.out.print("비밀번호 : ");
        String pw2 = sc.nextLine();

        if (id.equals(id2) && pw.equals(pw2)) {
            System.out.println("로그인 성공");
        }else if ((id != id2) && pw.equals(pw2)) {
            System.out.println("아이디가 틀렸습니다.");
        }else
            System.out.println("비밀번호가 틀렸습니다.");

    }

    public void practice8() {
        System.out.print("피연산자1 입력 : ");
        int num1 =  Integer.parseInt(sc.nextLine());
        System.out.print("피연산자 2 입력 : ");
        int num2 =  Integer.parseInt(sc.nextLine());
        System.out.print("연산자를 입력 (+,-,*,/,%) : ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println(num1 + " + "+ num2 + " = " + (num1 + num2));
                break;
            case '-':
                System.out.println(num1 + " - "+ num2 + " = " + (num1 - num2));
                break;
            case '*':
                System.out.println(num1 + " * "+ num2 + " = " + (num1 * num2));
                break;
            case '/':
                System.out.println(num1 + " / "+ num2 + " = " + (num1 / num2));
                break;
            case '%':
                System.out.println(num1 + " % "+ num2 + " = " + (num1 % num2));
                break;
                default:
                    System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
        }
    }
}
