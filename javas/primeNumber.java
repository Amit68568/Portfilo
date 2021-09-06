import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number ");
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        boolean b=true;

        if(a==0 || a==1){
            System.out.println("Number is not prime");
        }else {
            for(int i=2;i<=a/2;i++){
                if(a%i==0){
                   b=false;
                    break;
                }

            }

            if(b){
                System.out.println("Number is prime");
            }else{
                System.out.println("Number is  not prime");
            }

            
        }

    }
}
