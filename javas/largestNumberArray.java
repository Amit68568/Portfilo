public class largestNumberArray {
    public static void main(String[] args) {
        int a[]={3,5,88,32,8,2,9};
        int max=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println("The largest number is "  + max);
    }
    
}
