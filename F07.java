import java.util.Scanner;
class test{ 
    void run(){
        Scanner s1 = new Scanner(System.in);

        int num[][] = new int[5][4];
        int i,j,one=0,two=0,three=0,total=0;

        for(i=0;i<5;i++){
            int floor=0;
            for(j=0;j<3;j++){
                System.out.print((i+1) +"0"+ (j+1) +"호에 살고 있는 사람의 숫자를 입력하시오. : ");
                num[i][j] = s1.nextInt();
                
                total+= num[i][j];
                num[i][3]+=num[i][j];
                if(j==0){one+=num[i][j];}
                else if(j==1){two+=num[i][j];}
                else if(j==2){three+=num[i][j];}
            }
        }
        for(i=0;i<5;i++){
            System.out.printf("%d층에 사는 거주자는 총 %d명 입니다.\n",i+1,num[i][3]);
        }
        System.out.println();
        System.out.printf("1호 라인에 사는 거주자는 총 %d명 입니다.\n",one);
        System.out.printf("2호 라인에 사는 거주자는 총 %d명 입니다.\n",two);
        System.out.printf("3호 라인에 사는 거주자는 총 %d명 입니다.\n",three);

        System.out.println();
        System.out.printf("이 아파트에 사는 거주자는 총 %d명 입니다.\n",total);
    }

    public static void main(String[] args) { 
        test t = new test();
        t.run(); 
    }
}
