import java.util.Scanner;
class B04{
    void run(){
        Scanner s = new Scanner(System.in);
        
        System.out.print("아파트의 분양 면적(제곱미터)를 입력하시오. : ");
        double m2_area = s.nextDouble();
        
        //if(!check.equals('C'))
        if(m2_area/3.305>=30){
            System.out.printf("아파트의 평형은 %.1f 이고\n", m2_area/3.305);
            System.out.println("30평 이상이므로 큰 아파트입니다.");
        }

        else{
            System.out.printf("아파트의 평형은 %.1f 이고\n", m2_area/3.305);
            System.out.println("30평 미만이므로 작은 아파트입니다.");
        } 
    }

    public static void main(String[] args) { 
        B04 t = new B04();
        t.run(); 
    }
}