import java.util.Scanner; 
public class A01{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("태어난 년도를 입력하시오. ");
        int birth_year=s.nextInt();
        int ans = 2016-birth_year+1;
        System.out.println("당신의 나이는 "+ ans + "살 입니다.");
    }
}