import java.util.Scanner;
class C04{
    void run(){
        Scanner s = new Scanner(System.in);
        
        System.out.print("아파트의 분양 면적(제곱미터)를 입력하시오. : ");
        double m2_area = s.nextDouble();
        
        if(m2_area/3.305<15){
            System.out.printf("아파트의 평형은 %.1f 이고\n", m2_area/3.305);
            System.out.println("소형 아파트입니다.");
        } 
        else if(m2_area/3.305<30){
            System.out.printf("아파트의 평형은 %.1f 이고\n", m2_area/3.305);
            System.out.println("중소형 아파트입니다.");
        }
        else if(m2_area/3.305<50){
            System.out.printf("아파트의 평형은 %.1f 이고\n", m2_area/3.305);
            System.out.println("중형 아파트입니다.");
        } 
        else{
            System.out.printf("아파트의 평형은 %.1f 이고\n", m2_area/3.305);
            System.out.println("대형 아파트입니다.");
        }
    }

    public static void main(String[] args) { 
        C04 t = new C04();
        t.run(); 
    }
}