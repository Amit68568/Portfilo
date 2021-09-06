import java.io.*;
import java.util.*;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
       if(a>b){
           System.out.println("Largest number is "+a);
       }else{
           System.out.println("largest number is "+b);
       }
    }
}
