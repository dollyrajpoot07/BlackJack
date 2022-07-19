// blackJack
// Given 2 int values greater than 0, return whichever value is nearest to 21 without going over. Return 0 if they both go over.
// blackjack(19, 21) → 21
// blackjack(21, 19) → 21
// blackjack(19, 22) → 19

import java.util.*;

public class BlackJack {
    public static int blackjack(int a, int b) {
        if (a <= 21 && b <= 21) {
            System.out.print("M hoon Doraemon ");
            return Math.max(a, b);
        } else {
            if (a > 21 && b > 21) {
                System.out.print("M hoon Nobita ");
                return 0;
            } else {
                return Math.min(a, b);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter value of b: ");
        int b = sc.nextInt();
        int jackOfBlack = blackjack(a, b);
        System.out.println("Black Jack is: " + jackOfBlack);
        sc.close();
    }
}
