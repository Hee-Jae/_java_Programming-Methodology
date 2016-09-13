import java.util.Scanner;
class E06{ 
    void run(){
        Scanner s = new Scanner(System.in);

        System.out.print("출력하려는 행의 크기와 열의 크기를 입력하시오. : ");
        int r = s.nextInt(); int c = s.nextInt();

        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                System.out.printf("%4d",i*j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) { 
        E06 t = new E06();
        t.run(); 
    }
}
