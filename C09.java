import java.util.Scanner;
class C09{
    void run(){
        Scanner s = new Scanner(System.in);
        
        System.out.print("연봉(원 단위)을 숫자로 입력하시오. : ");
        int income = s.nextInt();
        
        if(income>=80000000){
            System.out.printf("연봉 금액에 대한 소득세는 %d원 입니다.\n",(int)(income*0.37));
        }
        else if(income>=40000000){
            System.out.printf("연봉 금액에 대한 소득세는 %d원 입니다.\n",(int)(income*0.28));
        }
        else if(income>=10000000){
            System.out.printf("연봉 금액에 대한 소득세는 %d원 입니다.\n",(int)(income*0.19));
        }
        else if(income>=0){
            System.out.printf("연봉 금액에 대한 소득세는 %d원 입니다.\n",(int)(income*0.095));
        }
        else{
            System.out.printf("invalid input!");
        }
    }

    public static void main(String[] args) { 
        C09 t = new C09();
        t.run(); 
    }
}
