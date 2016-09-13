import java.util.Scanner;
class E01{ 
    void run(){
        Scanner s = new Scanner(System.in);

        System.out.print("정사각형의 크기를 입력하시오. : ");
        int n = s.nextInt();

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) { 
        E01 t = new E01();
        t.run(); 
    }
}