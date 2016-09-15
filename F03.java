import java.util.Scanner;
class F03{ 
    void run(){
        Scanner s1 = new Scanner(System.in);

        int score[][] = new int[5][3];
        int sum[] = new int[3];
        double avg[] = new double[3];
        int kor=0,eng=0,math=0,i,j;

        for(i=0;i<5;i++){
            System.out.print(i+1 + "번 학생 국어, 영어, 수학 점수를 입력하시오. : ");
            score[i][0] = s1.nextInt(); score[i][1] = s1.nextInt(); score[i][2] = s1.nextInt();
        }
        for(i=0;i<5;i++){
            kor+= score[i][0];
            eng+= score[i][1];
            math+= score[i][2];
        }
        System.out.printf("국어의 총점은 %d 이고, 평균은 %.1f 입니다.\n",kor,(double)kor/5.0);
        System.out.printf("영어의 총점은 %d 이고, 평균은 %.1f 입니다.\n",eng,(double)eng/5.0);
        System.out.printf("수학의 총점은 %d 이고, 평균은 %.1f 입니다.\n",math,(double)math/5.0);
    }

    public static void main(String[] args) { 
        F03 t = new F03();
        t.run(); 
    }
}
