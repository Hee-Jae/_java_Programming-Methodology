import java.util.Scanner;import java.util.Random;
class test{ 
    void run(){
        Scanner s1 = new Scanner(System.in);
        
        while(true){
            System.out.println("================================================");
            System.out.print("-> 문자열을 입력하세요.(X : 종료) : ");
            String input = s1.nextLine();
            System.out.printf("-> 총 문자의 개수는 %d개 입니다.\n\n",input.length());
            if(input.equals("x")||input.equals("X")){
                System.out.println("* 종료되었습니다.");
                break;}
            for(int i=0;i<input.length();i++){
                System.out.print("-> ");
                System.out.println(input.charAt(i));
            }
        }
    }

    public static void main(String[] args) { 
        test t = new test();
        t.run(); 
    }
}
