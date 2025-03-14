
import java.util.Scanner;

public class vowel{
    public static void main(String[] args) {
        System.out.println("enter a alphabet");
        Scanner obj=new Scanner(System.in);
        String m=obj.nextLine();
        int k=0;
        int i=0;
        String n[]={"a","e","i","o","u"};
        while(i<5){
            if(m.equals(n[i])){
                 k=1;
            }
            i++;
            
            
            
        }
        if(k==1){
            System.out.println("this is vowel");

            }
        else{
            System.out.println("This is not vowel");
        }
        }
       
        
        
        
    
        
        
        
        
        
     
       }
    

