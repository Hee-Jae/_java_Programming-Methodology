import java.util.Scanner;import java.util.Random;
class H02{ 
    void run(){
        Scanner s1 = new Scanner(System.in);
        Random generator = new Random();
        int Lotto[] = new int[6];

        while(true){
            for(int i=0;i<Lotto.length;i++){
                Lotto[i] = (int)(Math.random()*45)+1;
                for(int j=0; j<i; j++){
                    if(Lotto[i] ==Lotto[j]){
                    i--;
                    break;
                    }
                }
            }
            System.out.print("생성된 로또 번호는 ");
            for(int i=0;i<Lotto.length;i++){
                System.out.printf("%d ",Lotto[i]);
            }
            System.out.print("입니다.");
            System.out.print("\n더 만드시겠습니까?(Y/N) ");
            String check = s1.next();
            if(check.equals("N")){
                break;
            }
        }
    }

    public static void main(String[] args) { 
        H02 t = new H02();
        t.run(); 
    }
}