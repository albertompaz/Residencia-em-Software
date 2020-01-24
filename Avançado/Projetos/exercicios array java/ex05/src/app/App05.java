package app;

public class App05 {
    public static void main(String[] args) throws Exception {

        int x = 2;
        int[] a = new int[5];
        a[0] = 2;
        a[1] = 3;
        a[2] = 10;
        a[3] = 2;
        a[4] = 2;

        System.out.println("A quantidade de vezes que o numero "+x+" aparece e: "+repete(a));
    }
}