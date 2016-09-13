import java.util.Scanner;
class D03{ 
    void run(){
        Scanner s = new Scanner(System.in);
        int sum=0,check=0;
        double avg;
        
        while(true){
            System.out.print("0부터 100사이의 숫자를 입력하세요 : ");
            int n = s.nextInt();
            if(n<0 || n>100){
                avg = sum/check;
                System.out.printf("입력된 %d개의 숫자들의 총 합계는 %d이고, 평균값은 %.1f입니다.\n",check,sum,avg);
                break;
            }
            else{
                sum+=n; check++;
            }
        }
    }

    public static void main(String[] args) { 
        D03 t = new D03();
        t.run(); 
    }
}