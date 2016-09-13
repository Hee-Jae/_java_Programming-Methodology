import java.util.Scanner;
class C07{
    void run(){
        Scanner s = new Scanner(System.in);
        
        System.out.print("파일 용량을 메가바이트 단위로 입력하시오. : ");
        int mega = s.nextInt();
        System.out.print("전송방식을 1:Wi-fi, 2:BlueTooth, 3:LTE, 4:USB 에서 선택하여 입력하세요 : ");
        int choose = s.nextInt();

        long bytes = mega*1024*1024L;

        if(choose==1){
            System.out.printf("파일전송시간은 %.1f초 입니다.\n",bytes/1500000.); //왜.인지이해하기
        }
        else if(choose==2){
            System.out.printf("파일전송시간은 %.1f초 입니다.\n",bytes/300000.);
        } 
        else if(choose==3){
            System.out.printf("파일전송시간은 %.1f초 입니다.\n",bytes/1000000.);
        } 
        else if(choose==4){
            System.out.printf("파일전송시간은 %.1f초 입니다.\n",bytes/60000000.);
        } 
        else{
            System.out.println("Invalid Input!");
        } 
        
    }

    public static void main(String[] args) { 
        C07 t = new C07();
        t.run(); 
    }
}