package mayur2;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiAraylist {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // Initialize rows
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        // Input elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }

        // Print the 2D ArrayList
        System.out.println(list);

        in.close();
    }
}