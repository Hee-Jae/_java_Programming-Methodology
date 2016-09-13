import java.util.Scanner;
class B01{ //파일이름 : Test3.java
    void run(){
        Scanner s = new Scanner(System.in);
        
        System.out.print("태어난 년도를 입력하세요 : ");
        int birth_y = s.nextInt();
        
        if(2015-birth_y < 20){
            System.out.println("미성년자입니다.");
        }
        else{
            System.out.println("미성년자가 아닙니다.");
        } 
    }

    public static void main(String[] args) { 
        B01 t = new B01();
        t.run(); 
    }
}