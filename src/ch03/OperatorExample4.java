package ch03;

public class OperatorExample4 {
    public static void main(String[] args) {
        int n1 = 10;
        ++n1;
        n1++;
        System.out.println(n1);

        n1--;
        System.out.println(n1);
        System.out.println("-------");

        int n2 = 40;
        System.out.println(n2++);// 읽어야하는 상황에는 기존값을 먼저 읽고 1을 올린다.
        System.out.println(n2);

        System.out.println("-------");
        int n3 = 50;
        n3 = n3 + 3;//50 + 3
        n3 = n3 + 3;//53 + 3
        System.out.println("n3 : " + n3);

        System.out.println("-------");
        int n4 = 50;
        n4 += 3;
        n4 += 3;
        System.out.println("n4 : " + n4);

        System.out.println("-------");
        int n5 = 50;
        n5 *= 3;
        n5 *= 3;
        System.out.println("n5 : " + n5);
        //(+= -= *= /= 이거 다 똑같이 반응함 됨)
    }
}
