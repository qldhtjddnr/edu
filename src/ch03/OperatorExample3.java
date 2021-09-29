package ch03;

public class OperatorExample3 {
    public static void main(String[] args){
        int n1 = 10;
        int n2 = 10;
        int n3 = 20;
        int n4 = 20;

        boolean result1 = n1 <= n2; //true
        boolean result2 = n3 > n4; //false

        System.out.println(result1 && result2); // AND연산자(전부 다 true여야지만 true, 하나라도 false이면 false)
        System.out.println(result1 || result2); // OR연산자(전부 다 false여야지만 false, 하나라도 true이면 true
        // true가 나올 확률을 앞에 놓는것이 좋음)


    }
}
