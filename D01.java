import java.util.Scanner;
class D01{ 
    void run(){
        Scanner s = new Scanner(System.in);
        int sum=0;
        
        System.out.print("숫자를 입력하세요 : ");
        int n = s.nextInt();
        
        if(n<0){
            System.out.println("invalid input");
        }
        else{
            for(int i=1;i<=n;i++){
                sum += i;
            }
            System.out.printf("1부터 입력한 숫자까지의 모든 정수를 더한 값은 %d 입니다.\n",sum);
        }
    }

    public static void main(String[] args) { 
        D01 t = new D01();
        t.run(); 
    }
}