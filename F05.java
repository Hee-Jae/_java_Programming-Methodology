import java.util.Scanner;
class F05{ 
    void run(){
        Scanner s1 = new Scanner(System.in);

        double score[][] = new double[10][2];
        int i,j,total=0;

        for(i=0;i<10;i++){
            System.out.print(i+1 + "번째 사람의 신장(cm)과 체중(kg)을 입력하시오. : ");
            score[i][0] = s1.nextDouble(); score[i][1] = s1.nextDouble();
        }
        for(i=0;i<10;i++){
            if((score[i][1]*10000)/(score[i][0]*score[i][0]) >=25){
                total++;
                System.out.printf("%d번째 사람은 비만입니다.\n",i+1);
            }
        }
        System.out.println();
        System.out.printf("총 %d명의 사람이 비만입니다.\n",total);
    }

    public static void main(String[] args) { 
        F05 t = new F05();
        t.run(); 
    }
}
