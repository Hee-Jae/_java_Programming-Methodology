import java.util.Scanner;
class test{ 
    void run(){
        Scanner s1 = new Scanner(System.in);
        int fee=0,total=0;
        while(true){
            System.out.print("사용한 시간을 시간과 분으로 입력하세요. : ");
            int h = s1.nextInt(); int m = s1.nextInt();
            if(h==0&&m==0){
                System.out.printf("total : %d\n",total);
                break;
            }
            if(m==0){fee=h*2*1000;}
            else if(m<=30){fee=(h*2+1)*1000;}
            else if(m<60){fee=(h*2+2)*1000;}

            if(h>=5){fee*=0.8;}
            else if(h>=3){fee*=0.9;}
            else if(h>=2){fee*=0.95;}

            System.out.printf("usage fee : %d\n",fee);
            total+=fee;
        }
    }

    public static void main(String[] args) { 
        test t = new test();
        t.run(); 
    }
}