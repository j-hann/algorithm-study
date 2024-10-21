import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);  
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        sc.close();
        
        if(A>B){    // 1. A가 B보다 크면
            
            System.out.println(">");    // ">" 출력한다.
   
        } else if(A<B) { // 2. A가 B보다 작으면
            
             System.out.println("<");    // "<" 출력한다.
            
        } else if(A==B) {
            
            System.out.println("==");    // "==" 출력한다.
            
        } // if-else if-else if-else
        
    } // main
    
} // end class