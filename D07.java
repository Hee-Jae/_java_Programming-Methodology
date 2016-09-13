import java.util.Scanner;
class D07{ 
    void run(){
        Scanner s = new Scanner(System.in);
        int a,b,i,start,finish;
        System.out.print("1차 함수 y=ax+b의 계수 a와 b를 입력하시오. : ");
        a = s.nextInt(); b = s.nextInt();
        System.out.print("x좌표의 시작 값과 끝 값을 입력하시오. : ");
        start = s.nextInt(); finish = s.nextInt();

        for(i=start;i<=finish;i++){
            System.out.printf("좌표 (%d, %d)\n",i,i*a+b);
        }
    }

    public static void main(String[] args) { 
        D07 t = new D07();
        t.run(); 
    }
}