import java.util.Scanner; 
public class A07{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("파일 용량을 기가바이트 단위로 입력하시오. ");
        int giga=s.nextInt();

        System.out.println("입력하신 파일 용량은");
        System.out.println(giga*1024 + " 메가바이트,");
        System.out.println(giga*1024*1024 + " 킬로바이트,");
        System.out.println((long)giga*1024*1024*1024 + " 바이트 입니다.");//범위초과
    }
}