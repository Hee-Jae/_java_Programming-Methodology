import java.util.Scanner;import java.util.Random;
class test{ 
    void run(){
        Scanner s1 = new Scanner(System.in);
        Random generator = new Random();
        int Lotto[] = new int[6];
        int Input[] = new int[6];
        int sum=0;
        for(int i=0;i<6;i++){
            int ii = i+1;
            System.out.print("원하는 "+ii+"번째 로또 숫자를 입력하세요. : ");
            Input[i] = s1.nextInt();
            for(int j=0; j<i; j++){
                if(Input[i] ==Input[j]){
                    i--;
                    System.out.println("Invalid Input!");
                    break;
                }
            }
        }
        for(int i=0;i<Lotto.length;i++){
            Lotto[i] = (int)(Math.random()*45)+1;
            for(int j=0; j<i; j++){
                if(Lotto[i] ==Lotto[j]){
                    i--;
                    break;
                }
            }
        }
        System.out.println();
        System.out.print("이번 주의 로또 당첨 번호는 ");
        for(int i=0;i<Lotto.length;i++){
            System.out.printf("%d ",Lotto[i]);
        }
        System.out.println("입니다.\n");

        for(int i=0;i<6;i++){
            for(int j=0; j<6; j++){
                if(Input[i] ==Lotto[j]){
                    sum++;
                    break;
                }
            }
        }
        System.out.printf("일치하는 로또 번호는 %d개 입니다.\n",sum);        
    }

    public static void main(String[] args) { 
        test t = new test();
        t.run(); 
    }
}