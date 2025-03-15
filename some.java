import java.util.Scanner;

public class demo {
    public static void main(String[] args)
    {
        int i=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the number of digit");
        int n=obj.nextInt();
        int a[]=new int[n];
        int sum=0;
        while(i<n){
            System.out.println("enter the number ");
             a[i]=obj.nextInt();
             sum =sum+a[i];
            i++;
        }
       
        
        System.out.println("the addition is" +sum);    
    
    }
}
            
            
            
            
            
            
            
            
            
            
            