import java.util.Scanner; 

public class Main{
    public static void main(String[] args){
    //스캐너 변수 선언 초기화
    Scanner sc = new Scanner(System.in);
    //a입력
    int a = sc.nextInt();
    //b입력
    int b = sc.nextInt();
    //c입력
    int c = sc.nextInt(); 
    
    System.out.println((a+b)%c);
    System.out.println(((a%c) + (b%c))%c);
    System.out.println((a*b)%c);
    System.out.println(((a%c) * (b%c))%c);

}//main
}//end class

