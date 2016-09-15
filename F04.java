import java.util.Scanner;
class F04{ 
    void run(){
        Scanner s1 = new Scanner(System.in);

        double score[][] = new double[5][2];
        int kor=0,eng=0,math=0,i,j;

        for(i=0;i<5;i++){
            System.out.print(i+1 + "번 학생 국어, 영어, 수학 점수를 입력하시오. : ");
            kor = s1.nextInt(); eng = s1.nextInt(); math = s1.nextInt();
            score[i][0] = kor+eng+math;
            score[i][1] = (double)(kor+eng+math)/3.0;
        }
        for(i=0;i<5;i++){
            System.out.printf("%d번 학생의 총점은 %d 이고, 평균은 %.1f 입니다.\n",i+1,(int)(score[i][0]),score[i][1]);
        }
    }

    public static void main(String[] args) { 
        F04 t = new F04();
        t.run(); 
    }
}
