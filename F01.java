import java.util.Scanner;
class F01{ 
    void run(){
        Scanner s1 = new Scanner(System.in);

        int num[] = new int[10] ; // 3개의 크기를 갖는 정수 배열을 선언
        int copy[] = new int[10] ;
        int sum=0,top=0,sec=0,ans=0,i,j,temp;

        for(i = 0; i < 10; i++){ // i가 0부터 2까지 3회 반복하며 실행
            System.out.print((i+1) + " 번째 숫자를 입력하시오. : ");
            num[i] = s1.nextInt();
            copy[i] = num[i];
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
        sec=num[1];
        for(i=0;i<10;i++){
            if(sec==copy[i]){
                ans=i+1;
                break;
            }
        }
        System.out.printf("두 번째로 큰 수는 %d번째 수 %d입니다.\n",ans,sec);
    }

    public static void main(String[] args) { 
        F01 t = new F01();
        t.run(); 
    }
}
