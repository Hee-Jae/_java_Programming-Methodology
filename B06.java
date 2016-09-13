import java.util.Scanner; 
public class B06{
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
        System.out.printf("평균은 %.1f 입니다.\n",ans);
        if(kor>=90){
            System.out.println("국어점수가 우수합니다.");
        }
        if(eng>=90){
            System.out.println("영어점수가 우수합니다.");
        }
        if(math>=90){
            System.out.println("수학점수가 우수합니다.");
        }
    }
}