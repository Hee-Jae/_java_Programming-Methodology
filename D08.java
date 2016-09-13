import java.util.Scanner;
class D08{ 
    void run(){
        Scanner s = new Scanner(System.in);
        int a,b,c,i,start,finish;
        System.out.print("2차 함수 y=ax^2+bx+c의 계수 a와 b,c를 입력하시오. : ");
        a = s.nextInt(); b = s.nextInt(); c = s.nextInt();
        System.out.print("x좌표의 시작 값과 끝 값을 입력하시오. : ");
        start = s.nextInt(); finish = s.nextInt();

        for(i=start;i<=finish;i++){
            System.out.printf("좌표 (%d, %d)\n",i,i*i*a+i*b+c);
        }
    }

    public static void main(String[] args) { 
        D08 t = new D08();
        t.run(); 
    }
}