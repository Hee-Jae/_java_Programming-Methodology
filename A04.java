import java.util.Scanner; 
public class A04{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("아파트의 분양 면적을 입력하시오. ");
        double m2_area=s.nextDouble();
        double ans = m2_area/3.305;
        System.out.printf("아파트의 평형은 %.1f 입니다.\n",ans);
    }
}