import java.util.Scanner;
class C11{
    void run(){
        Scanner s = new Scanner(System.in);
        
        System.out.print("년도를 입력하시오. : ");
        int Y = s.nextInt();

        if(Y%4==0){
            if(Y%100==0){
                if(Y%400==0){
                    System.out.println("윤년입니다.");
                }
                else{
                    System.out.println("윤년이 아닙니다.");
                }
            }
            else{
                System.out.println("윤년입니다.");
            }
        }
        else{
            System.out.println("윤년이 아닙니다.");
        }
    }

    public static void main(String[] args) { 
        C11 t = new C11();
        t.run(); 
    }
}