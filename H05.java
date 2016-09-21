import java.util.Scanner;import java.util.Random;
class H05{ 
    void run(){
        Scanner s1 = new Scanner(System.in);
        Random generator = new Random();
        int slot[] = new int[6];
        int sum=0,k=0;
        
        System.out.print("사용하실 코인의 개수를 입력하세요. : ");
        int coin = s1.nextInt();
        while(coin!=0){
            coin--;
            System.out.printf("게임 %d회 Start!!! (아무 숫자나 입력하시면 시작됩니다.) : ",++k);
            int input = s1.nextInt();
            sum=0;
            for(int i=0;i<3;i++){
                slot[i] = (int)(Math.random()*9)+1;
            }
            
            System.out.print("게임결과 : ");
            for(int i=0;i<3;i++){
                System.out.printf("%d ",slot[i]);
            }
            System.out.println("입니다.");

            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    if(slot[i] ==slot[j]){
                        sum++;
                    }
                }
            }
            if(sum==3){System.out.println("꽝!");}
            else if(sum==4){
                System.out.println("숫자가 2개 일치하므로 코인 2개 증정해드립니다!");
                coin+=2;
            }
            else if(sum==9){
                System.out.println("숫자가 3개 일치하므로 코인 3개 증정해드립니다!");
                coin+=3;
            }
            System.out.printf("남아있는 코인은 %d개 입니다.\n",coin);
        }
        System.out.println();
        System.out.println("GAME OVER!!!!!");    
    }

    public static void main(String[] args) { 
        H05 t = new H05();
        t.run(); 
    }
}
