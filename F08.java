import java.util.Scanner;
class test{ 
    void run(){
        Scanner s1 = new Scanner(System.in);

        int num[] = new int[15];
        int i,j,check=0,input,broken=0;

        System.out.print("1부터 100까지의 숫자를 입력하시오.\n");
        while(true){
            if(check==10){
                break;
            }
            else{
                System.out.print(check+1+"번째 숫자를 입력하시오. : ");
                input = s1.nextInt();
                for(i=0;i<check;i++){
                    if(num[i]==input){
                        System.out.printf("Invalid input!\n");
                        broken=100;
                        break;
                    }
                }
                if(broken!=100){
                    num[check]=input;
                    check++;
                }
                if(check==0){num[0]=input;check++;}
                broken=0;
            }
        }
        System.out.println();
        for(i=0;i<10;i++){
            System.out.printf("%d번째 숫자는 %d입니다.\n",i+1,num[i]);
        }
    }

    public static void main(String[] args) { 
        test t = new test();
        t.run(); 
    }
}