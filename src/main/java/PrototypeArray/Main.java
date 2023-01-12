package PrototypeArray;

public class Main {
    public static void main(String[] args) {
    int a[]={2,2,3,4,5};
    int b[]=new int[a.length];
//    b=a;
        b=a.clone();
    a[0]++;
        for (int i:b) {
            System.out.println(i);

        }
    }

}
