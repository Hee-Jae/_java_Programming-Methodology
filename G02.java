import java.util.Scanner;
class G02{ 
    void run(){
        Scanner s1 = new Scanner(System.in);
        double tem[] = new double[15];
        int i,j,n=0,cold=0,cool=0,warm=0,hot=0;
        double input;
        for(i=0;i<10;i++){
            System.out.printf("%d번 물의 온도를 입력하시오. : ",i+1);
            input = s1.nextDouble();
            tem[i]=input;
            if(input>=80){hot++;}
            else if(input>=40){warm++;}
            else if(input>=25){cool++;}
            else if(input>=0){cold++;}
        }
        System.out.println();
        for(i=0;i<10;i++){
            System.out.printf("%d번 물의 온도는 %.1f도 입니다.\n",i+1,tem[i]);
        }
        System.out.println();
        System.out.printf("냉수 입력 횟수 : %d\n",cold);
        System.out.printf("냉온수 입력 횟수 : %d\n",cool);
        System.out.printf("온수 입력 횟수 : %d\n",warm);
        System.out.printf("끓는물 입력 횟수 : %d\n",hot);
    }

    public static void main(String[] args) { 
        G02 t = new G02();
        t.run(); 
    }
}