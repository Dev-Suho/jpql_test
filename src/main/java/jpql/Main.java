package jpql;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        String str;

        Scanner sc = new Scanner(System.in);
        count = sc.nextInt();
        str = sc.next();

        char[] ch = str.toCharArray();

        for (char c : ch) {
            sum += c-48;
        }

        System.out.println(sum);
    }
}
