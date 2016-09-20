import java.util.Scanner;
class G04{ 
    void run(){
        Scanner s1 = new Scanner(System.in);
        double trans=0;
        int total=0;
        while(true){
            System.out.print("부동산 거래종류(1:매매, 2:임대, 0:계산종료)를 입력하세요. : ");
            int input = s1.nextInt();
            if(input==0){
                System.out.printf("지금까지의 중계 수수료 총 액은 %d원 입니다.\n",total);
                break;}
            System.out.print("부동산 거래금액(원)을 입력하세요. : ");
            int won = s1.nextInt();
            if(input==1){
                if(won>=200000000){
                    trans = (won*0.004);
                }
                else if(won>=50000000){
                    trans = (won*0.005);
                    if(trans>800000){trans=800000;}
                }
                else if(won>=0){
                    trans = (won*0.006);
                    if(trans>250000){trans=250000;}
                }
                System.out.printf("이에 대한 중계 수수료는 %d원 입니다.\n\n",(int)trans);
                total+=(int)trans;
            }
            else if(input==2){
                if(won>=100000000){
                    trans = (won*0.003);
                }
                else if(won>=50000000){
                    trans = (won*0.004);
                    if(trans>300000){trans=300000;}
                }
                else if(won>=20000000){
                    trans = (won*0.005);
                    if(trans>200000){trans=200000;}
                }
                else if(won>=0){
                    trans = (won*0.005);
                    if(trans>70000){trans=70000;}
                }
                System.out.printf("이에 대한 중계 수수료는 %d원 입니다.\n\n",(int)trans);
                total+=(int)trans;
            }
        }
    }

    public static void main(String[] args) { 
        G04 t = new G04();
        t.run(); 
    }
}