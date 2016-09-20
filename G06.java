import java.util.Scanner;
class G06{ 
    void run(){
        Scanner s1 = new Scanner(System.in);
        int total=0;
        System.out.print("세 종류의 제품이 있습니다.\n(1.가죽장갑 1만원, 2.털장갑 6천원, 3.비닐장갑 3천원)\n");
        while(true){
            System.out.print("1번 제품 구입 개수 : ");
            int fir = s1.nextInt();
            System.out.print("2번 제품 구입 개수 : ");
            int sec = s1.nextInt();
            System.out.print("3번 제품 구입 개수 : ");
            int thi = s1.nextInt();
            if(fir==0&&sec==0&&thi==0){
                System.out.printf("총 매출금액 : %d원\n",total);
                break;
            }
            System.out.printf("판매금액 : %d원\n\n",fir*10000+sec*6000+thi*3000);
            total+=fir*10000+sec*6000+thi*3000;
        }
    }

    public static void main(String[] args) { 
        G06 t = new G06();
        t.run(); 
    }
}