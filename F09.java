import java.util.Scanner;
class F09{ 
    void run(){
        Scanner s1 = new Scanner(System.in);

        int num[] = new int[15];
        int i,sum=0;

        num[1]=31;num[3]=31;num[5]=31;num[7]=31;num[8]=31;num[10]=31;num[12]=31;
        num[4]=30;num[6]=30;num[9]=30;num[11]=30;num[2]=28;

        System.out.print("월을 입력하시오. : ");
        int month = s1.nextInt();
        System.out.print("일을 입력하시오. : ");
        int day = s1.nextInt();

        for(i=1;i<month;i++){
            sum+=num[i];
        }

        System.out.printf("이 날짜는 1년 중 %d번째 날에 해당됩니다.\n",sum+day);
    }

    public static void main(String[] args) { 
        F09 t = new F09();
        t.run(); 
    }
}
