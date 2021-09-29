package ch03;

public class OperatorExample {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 10;

        int result = n1 + n2;
        System.out.println(n1 + " + " + n2 + " = " + result);
        System.out.printf("%d + %d = %d\n", n1, n2, result);

        //10 + 3 =13

        result = n1 + (-n2);
        System.out.printf("%d + -%d = %d\n", n1, n2, result);

        boolean result2 = n1 >n2;
        System.out.printf("%d > %d = %b\n", n1, n2, result2);//boolean 값 찍을때는 %b를 써야됨
        System.out.printf("%d < %d = %b\n", n1, n2, n1 < n2);
        System.out.println();
        System.out.printf("%d >= %d = %b\n", n1, n2, n1 >= n2);
        System.out.printf("%d <= %d = %b\n", n1, n2, n1 <= n2);
        System.out.println();
        System.out.printf("%d == %d = %b\n", n1, n2, n1 == n2); // == 은 같다
        System.out.printf("%d != %d = %b\n", n1, n2, n1 != n2); // !는 == 반대 (즉, 두값이 달라야 true)
    }
}
