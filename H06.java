import java.util.Scanner;import java.util.Random;
class H06{ 
    void run(){
        Scanner s1 = new Scanner(System.in);
        Random generator = new Random();
        int input[] = new int[5];
        int top=0,mid=0,bodymid=0,bodytop=0,headmid=0,headtop=0;
        
        System.out.print("2에서 9 사이의 숫자 5개를 입력하세요. : ");
        for(int i=0;i<5;i++){
             input[i] = s1.nextInt(); 
        }
        for(int i=0;i<5;i++){
            for(int j=i+1;j<5;j++){
                if(input[i]>input[j]){
                    int temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
        }
        System.out.println("입력하신 5개의 수로 제곱수를 만들면,");
        if(Math.pow(input[3],input[4])>Math.pow(input[4],input[3])){
            top = (int)Math.pow(input[3],input[4]);
            bodytop = input[3];
            headtop = input[4];
        }
        else{
            top = (int)Math.pow(input[4],input[3]);
            headtop = input[3];
            bodytop = input[4];
        }
        System.out.printf("가장 큰 수는 %d의 %d승인 %d 입니다.\n",bodytop,headtop,top);

        if(Math.pow(input[0],input[1])>Math.pow(input[1],input[0])){
            mid = (int)Math.pow(input[1],input[0]);
            bodymid = input[1];
            headmid = input[0];
        }
        else{
            mid = (int)Math.pow(input[0],input[1]);
            headmid = input[1];
            bodymid = input[0];
        }
        System.out.printf("가장 작은 수는 %d의 %d승인 %d 입니다.\n",bodymid,headmid,mid);
    }

    public static void main(String[] args) { 
        H06 t = new H06();
        t.run(); 
    }
}