import java.util.Scanner;import java.util.Random;
class H01{ 
    void run(){
        Scanner s1 = new Scanner(System.in);
        Random generator = new Random();
        int num = generator.nextInt(10) +1;
        int check=1;

        while(true){
            System.out.print("1부터 100까지의 숫자 하나를 맞춰보세요! : ");
            int input = s1.nextInt();
            if(input==num){
                System.out.printf("%d번만에 숫자를 맞추셨습니다.\n",check);
                break;
            }
            check++;
            if(input<num){
                System.out.println("좀 더 큰 수 입니다.");
            }
            else if(input>num){
                System.out.println("좀 더 작은 수 입니다.");
            }
        }
    }

    public static void main(String[] args) { 
        H01 t = new H01();
        t.run(); 
    }
}