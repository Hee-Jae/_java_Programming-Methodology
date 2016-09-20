import java.util.Scanner;
class G03{ 
    void run(){
        Scanner s1 = new Scanner(System.in);
        int score[][] = new int[10][10];
        int i,j,kor=0,eng=0,math=0;
        for(i=0;i<5;i++){
            System.out.printf("%d번 학생의 국어, 영어, 수학 점수는? : ",i+1);
            score[i][0] = s1.nextInt(); score[i][1] = s1.nextInt(); score[i][2] = s1.nextInt();
            kor+=score[i][0]; eng+=score[i][1]; math+=score[i][2];
        }
        System.out.println();
        System.out.println("1) 각 과목별 총점과 평균 점수");
        System.out.printf("국어과목 총점은 %d, 평균은 %.1f점 입니다.\n",kor,(double)kor/5.0);
        System.out.printf("영어과목 총점은 %d, 평균은 %.1f점 입니다.\n",eng,(double)eng/5.0);
        System.out.printf("수학과목 총점은 %d, 평균은 %.1f점 입니다.\n",math,(double)math/5.0);

        System.out.println();
        System.out.println("2) 각 학생별 총점과 평균 점수");
        for(i=0;i<5;i++){
            int total = score[i][0]+score[i][1]+score[i][2];
            double avg = (double)total/3.0;
            if(avg>=90){System.out.printf("%d번 학생 점수 : 총점 %d, 평균 %.1f, 등급 A\n",i+1,total,avg);}
            else if(avg>=80){System.out.printf("%d번 학생 점수 : 총점 %d, 평균 %.1f, 등급 B\n",i+1,total,avg);}
            else if(avg>=70){System.out.printf("%d번 학생 점수 : 총점 %d, 평균 %.1f, 등급 C\n",i+1,total,avg);}
            else if(avg>=60){System.out.printf("%d번 학생 점수 : 총점 %d, 평균 %.1f, 등급 D\n",i+1,total,avg);}
            else if(avg>=0){System.out.printf("%d번 학생 점수 : 총점 %d, 평균 %.1f, 등급 F\n",i+1,total,avg);}
        }
    }

    public static void main(String[] args) { 
        G03 t = new G03();
        t.run(); 
    }
}