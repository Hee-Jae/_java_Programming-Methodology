import java.util.Scanner;
class D02{ 
    void run(){
        Scanner s = new Scanner(System.in);
        int top=0,bottom=1000;
        
        while(true){
            System.out.print("0부터 100사이의 숫자를 입력하세요 : ");
            int n = s.nextInt();
            if(n<0 || n>100){
                if(top==0 && bottom==1000){
                    System.out.println("Invalid Input!");
                    break;
                }
                else{
                    System.out.printf("입력된 숫자들 중 가장 큰 수는 %d이고, 가장 작은 수는 %d입니다.\n",top,bottom);
                    break;
                }
            }
            else{
                if(n>top){top=n;}
                if(n<bottom){bottom=n;}
            }
        }
    }

    public static void main(String[] args) { 
        D02 t = new D02();
        t.run(); 
    }
}