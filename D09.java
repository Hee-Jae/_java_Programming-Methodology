import java.util.Scanner;
class D09{ 
    void run(){
        Scanner s = new Scanner(System.in);
        int n,i;
        while(true){
            System.out.print("출력하고 싶은 구구단의 단 수를 입력하시오(2~9). : ");
            n = s.nextInt();
            if(n>=2&&n<=9){
                for(i=1;i<=9;i++){
                    System.out.printf("%d X %d = %d\n",n,i,n*i);
                }
                break;
            }
            else{
                System.out.printf("Invalid input!\n");
            }
        }
    }

    public static void main(String[] args) { 
        D09 t = new D09();
        t.run(); 
    }
}