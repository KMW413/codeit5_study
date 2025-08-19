import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        ArrayPractice arrayPractice = new ArrayPractice();
//        arrayPractice.practice1();
//        arrayPractice.practice2();
//        arrayPractice.practice3();
//        arrayPractice.practice4();
//        arrayPractice.practice5();
//        arrayPractice.practice6();
//        arrayPractice.practice7();
//        arrayPractice.practice8();
//        arrayPractice.practice9();
        arrayPractice.practice10();


    }

    public void practice1() {
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
            System.out.print(a[i] + " ");
        }
    }

    public void practice2() {
        int[] a = new int[10];
        for (int i = a.length - 1; i >= 0; i--) {
            a[i] = i + 1;
            System.out.print(a[i] + " ");
        }
    }

    public void practice3() {
        System.out.print("양의 정수 : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i + 1;
            System.out.print(a[i] + " ");
        }
    }

    public void practice4() {
        String[] str = {"사과", "귤", "포도", "복숭아", "참외"};
        System.out.println(str[1]);
    }

    public void practice5() {
        System.out.print("문자열 : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print("문자 : ");
        char ch = sc.next().charAt(0);
        System.out.print(str + "에 " + ch + "가 존재하는 위치(인덱스): ");

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.println("\n" + ch + " 개수 : " + count);
    }

    public void practice6() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 : ");
        int n = Integer.parseInt(sc.nextLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
            int num = Integer.parseInt(sc.nextLine());
            arr[i] = num;
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
            sum += arr[i];
        }
        System.out.println("\n총합 : " + sum);

    }

    public void practice7() {
        int[] arr = new int[10];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(9) + 1;
            System.out.print(arr[i] + " ");
        }
    }

    public void practice8() {
        int[] arr = new int[10];
        Random rand = new Random();
        int max = 1;
        int min = 10;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10) + 1;
            System.out.print(arr[i] + " ");
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("최대값 : " + max);
        System.out.println("최소값 : " + min);

    }

    private void practice9() {
        int[] nums = new int[10];
        Random random = new Random();

        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(10)+1;
            for (int j = 0; j < i; j++) {
                if (nums[i] == nums[j]) {
                    i--;
                }
            }
        }
        for (int num : nums) {
            System.out.print(num + " ");
        }

    }
    private void practice10() {

        int[] lot = new int[6];
        Random random = new Random();

        for (int i = 0; i < lot.length; i++) {
            lot[i] = random.nextInt(45)+1;
            for (int j = 0; j < i; j++) {
                if (lot[i] == lot[j]) {
                    i--;
                }
            }
        }

        Arrays.sort(lot);
        for (int i : lot) {
            System.out.print(i + " ");
        }

    }
}