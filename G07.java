import java.util.Scanner;
class G07{ 
    void run(){
        Scanner s1 = new Scanner(System.in);
        int visitor=0,ele=0,teen=0,man=0,old=0,fee=0;
        System.out.print("오늘 방문한 팀 수를 입력하세요. : ");
        int team = s1.nextInt();
        System.out.println();
        for(int i=1;i<=team;i++){
            System.out.print(i+"번 팀 인원수(초등학생, 청소년, 일반,경로대상)를 입력하세요. : ");
            int fivethousand = s1.nextInt(); int tenthousand = s1.nextInt(); int fifteenthousand = s1.nextInt(); int threethousand = s1.nextInt();
            int total=fivethousand*5000 + tenthousand*10000 + fifteenthousand*15000 + threethousand*3000;
            System.out.print(i+"번 팀 할인카드 종류(0:카드없음, 1:일반등급, 2:VIP)를 입력하세요. : ");
            int card = s1.nextInt();
            if(card==0){
                System.out.printf("%d번 팀 입장료는 %d원 입니다.\n\n",i,total);}
            else if(card==1){
                total=(int)((double)total*0.9);
                System.out.printf("%d번 팀 입장료는 %d원 입니다.\n\n",i,total);}
            else if(card==2){
                total=(int)((double)total*0.8);
                System.out.printf("%d번 팀 입장료는 %d원 입니다.\n\n",i,total);}

            visitor+=fivethousand+tenthousand+fifteenthousand+threethousand;
            ele+=fivethousand;
            teen+=tenthousand;
            man+=fifteenthousand;
            old+=threethousand;
            fee+=total;
        }
        System.out.println();
        System.out.printf("오늘 총 방문자 수는 %d명 입니다.\n",visitor);
        System.out.printf("초등학생 수는 %d명 입니다.\n",ele);
        System.out.printf("청소년 수는 %d명 입니다.\n",teen);
        System.out.printf("일반인 수는 %d명 입니다.\n",man);
        System.out.printf("경로대상 수는 %d명 입니다.\n",old);

        System.out.println();
        System.out.printf("총 입장료는 %d원 입니다.\n",fee);
    }

    public static void main(String[] args) { 
        G07 t = new G07();
        t.run(); 
    }
}