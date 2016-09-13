import java.util.Scanner;
class B09{
    void run(){
        Scanner s = new Scanner(System.in);
        
        System.out.print("신장(cm단위)을 입력하세요 : ");
        int cm = s.nextInt();
        System.out.print("체중(kg단위)을 입력하세요 : ");
        int kg = s.nextInt();
        
        if((kg*100*100)/(cm*cm) >= 25){
            System.out.println("당신은 비만이십니다.");
        }

        else{
            System.out.println("당신은 비만이 아니군요!");
        } 
    }

    public static void main(String[] args) { 
        B09 t = new B09();
        t.run(); 
    }
}