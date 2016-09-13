import java.util.Scanner;
class E03{ 
    void run(){
        Scanner s = new Scanner(System.in);

        System.out.print("이등변삼각형의 높이를 입력하시오. : ");
        int n = s.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i*2-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) { 
        E03 t = new E03();
        t.run(); 
    }
}
