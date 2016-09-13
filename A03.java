import java.util.Scanner; 
public class A03{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("직사각형의 가로 크기를 입력하시오. ");
        int width=s.nextInt();
        System.out.print("직사각형의 세로 크기를 입력하시오. ");
        int height=s.nextInt();
        int ans = width*height;
        System.out.println("직사각형의 넓이는 "+ ans + " 입니다.");
    }
}