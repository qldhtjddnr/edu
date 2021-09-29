package ch02;

public class VariableExample2 {
    public static void main(String[] args){
        float f;
        double d;

        int n1;

        //n1 = 10.1 // 이거안됨
        f = (float)10.1;
        d = 10.1;

        double d2 = f * f ; // 자동형변환
        double d3 = (double)f * f;

        //float f2 = d * d ; // 자동형변환 안해준다.
        float f2 = (float)(d * d);//수동변환 해줘야 한다.
        float f3 = (float)d * (float)d;
    }
}
