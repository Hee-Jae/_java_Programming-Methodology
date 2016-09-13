import java.util.Scanner;
class test{ 
    void run(){
        Scanner s = new Scanner(System.in);

        System.out.print("직각삼각형의 높이와 왼쪽 여백의 크기를 입력하시오. : ");
        int n = s.nextInt(); int blank = s.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=0;j<blank+n-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) { 
        test t = new test();
        t.run(); 
    }
}
