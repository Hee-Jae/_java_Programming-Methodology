import java.util.Scanner;
class F02{ 
    void run(){
        Scanner s1 = new Scanner(System.in);

        double num[] = new double[10] ; // 3개의 크기를 갖는 정수 배열을 선언
        int sum=0,i,j;
        double temp;

        for(i = 0; i < 10; i++){ // i가 0부터 2까지 3회 반복하며 실행
            System.out.print((i+1) + " 번째 심사점수를 입력하시오. : ");
            num[i] = s1.nextDouble();
        }
        for(i=0;i<10;i++){
            for(j=i+1;j<10;j++){
                if(num[i]<num[j]){
                    temp=num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        for(i=1;i<9;i++){
            sum+=num[i];
        }
        System.out.printf("가장 큰 점수와 가장 작은 점수를 제외한 8개의 점수에 대한 평균은 %.1f 입니다.\n",sum/8.0);
    }

    public static void main(String[] args) { 
        F02 t = new F02();
        t.run(); 
    }
}
