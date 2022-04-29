package Week3;

import java.util.Scanner;

public class week3bul {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("별 찍을 숫자");
        int bul = scanner.nextInt();

        for(int i = 0; i < bul; ++i) {
            int j;
            for(j = bul; i < j; --j) {
                System.out.print(" ");
            }

            for(j = 0; j <= i; ++j) {
                System.out.print("*");
            }

            for(j = 1; j <= i; ++j) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}