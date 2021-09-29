package ch03;

public class OperatorExample5 {
    public static void main(String[] args) {
        // 삼항식

        int n1 = 10;
        int n2 = 11;
        String result = n1 >= n2 ? "n1이 n2랑 같거나 크다" : "n2가 n1보다 크다";
        System.out.println(result);
        System.out.println(n1 >= n2 ? "n1이 n2랑 같거나 크다" : "n2가 n1보다 크다");//(true : false 고정이다.)
                         //(1.식(true or false) ? )

        //mod (나머지)
        System.out.println(10 % 2);
        System.out.println(11 % 2);// 나머지 구할 때는 % 쓰면 된다
        System.out.println(12 % 2);
        System.out.println(13 % 2);//홀짝 구할 때 쓸수 있음

        String str1 = Integer.toString(n2);
        String str2 = String. valueOf(n2);
    }
}
