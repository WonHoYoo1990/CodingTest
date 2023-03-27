import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int sum = 0;
        
        if(a>0 && b<10){
            sum = a+b;
            System.out.println(sum);
        }
    }
}