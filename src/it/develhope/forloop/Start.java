package it.develhope.forloop;
public class Start {
    public static void main(String[] args) {
        // you can declare in one line to avoid repeating int 3 times
        int a = 0, b = 1, c = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print(c + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}
