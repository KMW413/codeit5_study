import org.w3c.dom.ls.LSOutput;

import java.net.InterfaceAddress;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
//cheat

public class ArrayPractice {
    public static void main(String[] args) {
        ArrayPractice a = new ArrayPractice();
//        a.practice8();
//        a.practice1();
//        a.practice2();
//        a.practice3();
//        a.practice4();
//        a.practice5();
//        a.practice6();
//        a.practice7();
        a.practice9();


    }

    public void practice1() {
        int[] arr = new int [10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
    }

    public void practice2() {
        int[] arr = new int [10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr.length - i;
            System.out.print(arr[i] + " ");
        }
    }

    public void practice3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("양의 정수 :");
        int n = Integer.parseInt(sc.nextLine());
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
    }

    public void practice4() {
        String[] arr = new String[] {"사과","귤","포도","복숭아","참외"};
        System.out.println(arr[1]);
    }
//수정에 cheat 사용
    public void practice5() {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 :");
        String str = sc.nextLine();
        System.out.print("문자 : ");
        char ch = sc.next().charAt(0);

        System.out.print(str + "에 " + ch + "가 존재하는 위치(인덱스) : ");

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.println(ch + "의 개수 : " + count);
    }

    public void practice6() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 : ");
        int n = Integer.parseInt(sc.nextLine());
        int[] arr = new int[n];

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print("배열 " + i +"번째 인덱스에 넣을 값 : ");
            arr[i] = Integer.parseInt(sc.nextLine());
            sum += arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n총합 : " + sum);
    }

    public void practice7() {
        int[] arr = new int[10];
        Random rand = new Random(System.currentTimeMillis());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10) + 1;  //+1이 있어야 10까지 도달

        }
        System.out.println(Arrays.toString(arr));
        
    }

    public void practice8() {
        int[] arr = new int[10];
        Random rand = new Random(System.currentTimeMillis());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10) + 1;
        }
        System.out.println(Arrays.toString(arr));

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("최대값 : " + max);
        System.out.println("최소값 : " + min);
    }

    public void practice8_2() {
        int[] arr = new int[10];
        Random rand = new Random(System.currentTimeMillis());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10) + 1;
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("최대값 : " + (arr.length -1) );
        System.out.println("최소값 : " + arr[0]);
    }

    public void practice9() {
        int[] arr = new int[10];
        Random rand = new Random(System.currentTimeMillis());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10) + 1;
            System.out.println("현재 뽑은 값 : " + arr[i] + "\t중간 : " + Arrays.toString(Arrays.copyOfRange(arr, 0 , (i + 1))));

            for (int j = 0 ; j < i; j++) {
                
            }

        }
        System.out.println("결과 : " + Arrays.toString(arr));
    }

}


