import java.util.Scanner;
class C06{
    void run(){
        Scanner s = new Scanner(System.in);
        
        System.out.print("국어 점수를 입력하시오. : ");
        int kor = s.nextInt();
        System.out.print("영어 점수를 입력하시오. : ");
        int eng = s.nextInt();
        System.out.print("수학 점수를 입력하시오. : ");
        int math = s.nextInt();

        int total =kor+eng+math;
        System.out.println("입력하신 점수의 총점은 "+ total +" 이고,");        
        double avg = (int)(kor+eng+math)/3;
        System.out.printf("평균은 %.1f 입니다.\n", avg);

        if(avg<60){
            System.out.println("가 입니다.");
        }
        else if(avg<70){
            System.out.println("양 입니다.");
        } 
        else if(avg<80){
            System.out.println("미 입니다.");
        } 
        else if(avg<90){
            System.out.println("우 입니다.");
        } 
        else{
            System.out.println("수 입니다.");
        } 
        
    }

    public static void main(String[] args) { 
        C06 t = new C06();
        t.run(); 
    }
}