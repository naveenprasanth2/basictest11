package org.example.practise1;

public class JumpSearch {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int root = (int) Math.sqrt(a.length);
        int num = 80;
        int position = -1;

        for (int i = 0; i < a.length; i += root) {
            if (a[i] == num) {
                position = i;
            } else if (a[i] < num) {
                int numEnd = i + root;
                for (int j = i; j <= numEnd && j<a.length; j++) {
                    if (a[j] == num) {
                        position = j;
                        break;
                    }
                }
                if (position != -1) {
                    break;
                }
            }
            if (position != -1) {
                break;
            }
        }

        System.out.println(position);
    }
}
