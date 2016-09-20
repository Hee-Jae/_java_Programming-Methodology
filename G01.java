import java.util.Scanner;
class G01{ 
    void run(){
        Scanner s1 = new Scanner(System.in);
        int year[] = new int[110];
        int i,j,n=0,input,old=0,adult=0,young=0,youth=0,child=0,baby=0;
        while(true){
            System.out.print(n+1+"번째 숫자를 입력하시오. : ");
            input = s1.nextInt();
            if(input>=2012){
                break;
            }
            else if(n==100){
                break;
            }
            else{
                year[n]=input;
                if(2013-input>=60){old++;}
                else if(2013-input>=30){adult++;}
                else if(2013-input>=20){young++;}
                else if(2013-input>=13){youth++;}
                else if(2013-input>=7){child++;}
                else if(2013-input>=1){baby++;}
                n++;
            }
        }
        System.out.println();
        for(i=0;i<n;i++){
            System.out.printf("%d번째 사람의 나이는 %d 입니다.\n",i+1,year[i]);
        }
        System.out.println();
        System.out.printf("유아는 %d명 입니다.\n",baby);
        System.out.printf("어린이는 %d명 입니다.\n",child);
        System.out.printf("청소년은 %d명 입니다.\n",youth);
        System.out.printf("청년은 %d명 입니다.\n",young);
        System.out.printf("중년은 %d명 입니다.\n",adult);
        System.out.printf("노년은 %d명 입니다.\n",old);
    }

    public static void main(String[] args) { 
        G01 t = new G01();
        t.run(); 
    }
}