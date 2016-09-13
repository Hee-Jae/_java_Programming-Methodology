import java.util.Scanner;
class B02{
    void run(){
        Scanner s = new Scanner(System.in);
        
        System.out.print("온도를 입력하세요 : ");
        double tem = s.nextDouble();
        System.out.print("입력하신 온도가 섭씨온도이면 C를, 화씨온도이면 F를 입력하세요 : ");
        String check = s.next();
        
        if(check.equals("C")){
            double ans= tem*1.8 + 32;
            System.out.println("변환된 온도는 " + ans + " 입니다.");
        }
        else{
            double ans= (tem-32)/1.8;
            System.out.println("변환된 온도는 " + ans + " 입니다.");
        } 
    }

    public static void main(String[] args) { 
        B02 t = new B02();
        t.run(); 
    }
}