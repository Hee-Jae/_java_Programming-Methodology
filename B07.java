import java.util.Scanner;
class B07{ //equals 이해하기
    void run(){
        Scanner s = new Scanner(System.in);
        
        System.out.print("파일 용량을 메가바이트 단위로 입력하세요 : ");
        int mega = s.nextInt();
        System.out.print("USB 포트가 2.0이면 Y, 아니면 N을 입력하세요 : ");
        String usb = s.next();
        
        if(!usb.equals('N')){
            if(usb.equals('Y')){
                System.out.println("파일 전송 시간은 " + ((long)mega*1024*1024)/60000000 + " 초입니다.");
            }
            else{
                System.out.println("파일 전송 시간은 " + ((long)mega*1024*1024)/1500000 + " 초입니다.");
            }
        }
        else{
            System.out.println("invalid");
        }
    }

    public static void main(String[] args) { 
        B07 t = new B07();
        t.run(); 
    }
}