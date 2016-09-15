import java.util.Scanner;
class F06{ 
    void run(){
        Scanner s1 = new Scanner(System.in);

        int num[][] = new int[5][3];
        int i,j,total=0;

        for(i=0;i<5;i++){
            for(j=0;j<3;j++){
                System.out.print((i+1) +"0"+ (j+1) +"호에 살고 있는 사람의 숫자를 입력하시오. : ");
                num[i][j] = s1.nextInt();
                total+=num[i][j];
            }
        }
        System.out.printf("이 아파트에 사는 거주자는 총 %d명 입니다.\n",total);
    }

    public static void main(String[] args) { 
        F06 t = new F06();
        t.run(); 
    }
