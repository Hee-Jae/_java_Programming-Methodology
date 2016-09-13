import java.util.Scanner;
class B05{
    void run(){
        Scanner s = new Scanner(System.in);
        
        System.out.print("날수를 입력하세요 : ");
        int days = s.nextInt();
        int seconds = days*24*60*60;
        
        if(seconds>=1000000){
            System.out.println("날수에 해당되는 기간은 모두 " + seconds + " 초입니다.");
            System.out.println("100만 초가 모두 " + seconds/1000000 + " 번이나 포함됩니다.");
        }

        else{
            System.out.println("날수에 해당되는 기간은 모두 " + seconds + " 초입니다.");
        } 
    }

    public static void main(String[] args) { 
        B05 t = new B05();
        t.run(); 
    }
}