import java.util.Scanner;import java.util.Random;
class H04{ 
    void run(){
        Scanner s1 = new Scanner(System.in);
        Random generator = new Random();
        int win=0,lose=0,again=0;
        while(true){ //1 가위 2 바위 3 보
            int num = generator.nextInt(3) +1;
            System.out.print("가위(1), 바위(2), 보(3)를 입력하세요. : ");
            int input = s1.nextInt();
            if(input==0){
                System.out.printf("Computer : %d번 승, %d번 패, %d번 비겼습니다.\n",win,lose,again);
                break;
            }
            if(num==1){
                System.out.print("컴퓨터가 낸 것은 가위입니다. ---> ");
                if(input==1){
                    System.out.println("비겼습니다!\n");
                    again++;
                }
                else if(input==2){
                    System.out.println("이겼습니다!\n");
                    win++;
                }
                else if(input==3){
                    System.out.println("졌습니다!\n");
                    lose++;
                }
            }
            else if(num==2){
                System.out.print("컴퓨터가 낸 것은 바위입니다. ---> ");
                if(input==2){
                    System.out.println("비겼습니다!\n");
                    again++;
                }
                else if(input==3){
                    System.out.println("이겼습니다!\n");
                    win++;
                }
                else if(input==1){
                    System.out.println("졌습니다!\n");
                    lose++;
                }
            }
            else if(num==3){
                System.out.print("컴퓨터가 낸 것은 보입니다. ---> ");
                if(input==3){
                    System.out.println("비겼습니다!\n");
                    again++;
                }
                else if(input==1){
                    System.out.println("이겼습니다!\n");
                    win++;
                }
                else if(input==2){
                    System.out.println("졌습니다!\n");
                    lose++;
                }
            }
        }    
    }

    public static void main(String[] args) { 
        H04 t = new H04();
        t.run(); 
    }
}