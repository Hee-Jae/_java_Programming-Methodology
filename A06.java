import java.util.Scanner; 
public class A06{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("국어 점수를 입력하시오. ");
        int kor=s.nextInt();
        System.out.print("영어 점수를 입력하시오. ");
        int eng=s.nextInt();
        System.out.print("수학 점수를 입력하시오. ");
        int math=s.nextInt();
        
        int total = kor+eng+math;
        double ans = (double)(total)/3;
        System.out.println("입력하신 점수의 총점은 "+ total + " 이고,");
        System.out.println("평균은 "+ ans + " 입니다.");//소숫점아래안나와ㅠㅠ
    }
}