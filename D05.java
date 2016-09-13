import java.util.Scanner;
class D05{ 
    void run(){
        Scanner s = new Scanner(System.in);
        int h,v,square=0,wide=0,longg=0,side=0,updown=0;
        
        while(true){
            System.out.print("직사각형의 가로크기와 세로크기를 입력하시오. : ");
            h = s.nextInt(); v = s.nextInt();
            if(h<=0 || v<=0){
                System.out.printf("정사각형의 개수는 %d개 입니다.\n",square);
                System.out.printf("좌우로 길쭉한 직사각형의 개수는 %d개 입니다.\n",wide);
                System.out.printf("위아래로 길쭉한 직사각형의 개수는 %d개 입니다.\n",longg);
                System.out.printf("일반적인 가로형 직사각형의 개수는 %d개 입니다.\n",side);
                System.out.printf("일반적인 세로형 직사각형의 개수는 %d개 입니다.\n",updown);
                break;
            }
            else if(h>=2*v){wide++;}
            else if(h*2<=v){longg++;}
            else if(h>v){side++;}
            else if(h<v){updown++;}
            else if(h==v){square++;}
        }
    }

    public static void main(String[] args) { 
        D05 t = new D05();
        t.run(); 
    }
}