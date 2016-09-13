import java.util.Scanner; 
public class A02{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("섭씨 온도를 입력하시오. ");
        double c_degree=s.nextDouble();
        double ans = c_degree * 1.8 + 32;
        System.out.printf("화씨 온도는 %.1f 입니다.\n",ans);
    }
}