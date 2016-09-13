import java.util.Scanner;
class E05{ 
    void run(){
        Scanner s = new Scanner(System.in);

        System.out.print("구구단의 출력모드(1: 홀수단, 2: 짝수단)를 입력하시오. : ");
        int n = s.nextInt();
        System.out.print("한 줄에 추력할 갯수를 입력하시오. : ");
        int column = s.nextInt();

        if(n%2==1){
            for(int i=3;i<=9;i+=2){
                for(int j=1;j<10;j++){
                    System.out.printf("%d X %d = %2d  ",i,j,i*j);
                    if(j%column==0){
                        System.out.println();
                    }
                }
                System.out.println();System.out.println();
            }
        }
        else{
            for(int i=2;i<=8;i+=2){
                for(int j=1;j<10;j++){
                    System.out.printf("%d X %d = %2d  ",i,j,i*j);
                    if(j%column==0){
                        System.out.println();
                    }
                }
                System.out.println();System.out.println();
            }
        }
    }

    public static void main(String[] args) { 
        E05 t = new E05();
        t.run(); 
    }
}
