import java.util.Scanner;
class C02{ //equals 이해하기
    void run(){
        Scanner s = new Scanner(System.in);
        
        System.out.print("물의 온도를 입력하세요 : ");
        int tem = s.nextInt();
        
        if(tem<0){
            System.out.println("invalid input");
        }
        else if(tem<25){
            System.out.println("냉수입니다.");
        }
        else if(tem<40){
            System.out.println("미온수입니다.");
        }
        else if(tem<80){
            System.out.println("온수입니다.");
        }
        else{
            System.out.println("끓는 물 입니다.");
        }
    }

    public static void main(String[] args) { 
        C02 t = new C02();
        t.run(); 
    }
}