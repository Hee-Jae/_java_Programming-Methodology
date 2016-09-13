import java.util.Scanner;
class C01{ //equals 이해하기
    void run(){
        Scanner s = new Scanner(System.in);
        
        System.out.print("태어난 년도를 입력하세요 : ");
        int birth = s.nextInt();
        System.out.println(1+2016-birth);
        
        if(1+2016-birth<7){
            System.out.println("유아입니다.");
        }
        else if(1+2016-birth<13){
            System.out.println("어린이입니다.");
        }
        else if(1+2016-birth<20){
            System.out.println("청소년입니다.");
        }
        else if(1+2016-birth<30){
            System.out.println("청년입니다.");
        }
        else if(1+2016-birth<60){
            System.out.println("중년입니다.");
        }
        else if(1+2016-birth>=60){
            System.out.println("노년입니다.");
        }

    }

    public static void main(String[] args) { 
        C01 t = new C01();
        t.run(); 
    }
}