import java.util.Scanner;
class D04{ 
    void run(){
        Scanner s = new Scanner(System.in);
        int y,ans=0,i;
        double avg;
        System.out.print("가족이 몇 명인지 입력하세요 : ");
        int n = s.nextInt();
        
        for(i=0;i<n;i++){
            System.out.print("태어난 년도를 입력하세요 : ");
            y = s.nextInt();
            if(y>1997){ans++;}
        }
        System.out.printf("가족들 중에 미성년자는 모두 %d명 입니다.\n",ans);
    }

    public static void main(String[] args) { 
        D04 t = new D04();
        t.run(); 
    }
}