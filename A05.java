import java.util.Scanner; 
public class A05{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("날 수를 입력하시오. ");
        int day=s.nextInt();
        Long ans = day*24*60*60L;
        System.out.println("날 수에 해당되는 시간은 모두 "+ ans + " 초입니다.");
    }
}