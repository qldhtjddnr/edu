package ch02;

public class PrintExample {
    public static void main(String[] args){
        System.out.println("안녕하세요");
        System.out.print("안녕하세요\n");
        System.out.print("안녕하세요");
        System.out.print("안녕하세요\n");

        String nm = "홍길동";
        int age = 17;
        float height = 180.8f;
        char bloodType = 'A';

        //홍길동의 키는 180.8cm, 나이는 17세, 혈액형은 B형이다

        System.out.printf("%s의 키는 %.2f cm, 나이는 %,09d세, 혈액형은 %c형이다.", nm, height, age, bloodType);

    }
}
