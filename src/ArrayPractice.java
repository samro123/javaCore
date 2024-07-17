import java.util.Random;
import java.util.Scanner;

public class ArrayPractice {
    float a [];
    int n;

    public ArrayPractice(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao phan tu");
        n = sc.nextInt();
        a =  createArray(n);
        printAt();
    }

    public float[] createArray(int n){
        float[] temp = new float[n];
        Random rd = new Random();
        for(int i = 0 ; i < n ; i++){
            temp[i] = rd.nextFloat();
        }
        return  temp;
    }

    public void printAt(){
        for(int i = 0 ; i < a.length ; i++){
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        ArrayPractice sc =new ArrayPractice();
    }

}
