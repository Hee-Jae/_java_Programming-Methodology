import java.util.Scanner;import java.util.Random; import java.util.regex.*;
class test{ 
    void run(){
        Scanner s1 = new Scanner(System.in);
        
        while(true){
            System.out.println("================================================");
            System.out.print("-> 문자열을 입력하세요.(X : 종료) : ");
            String input = s1.nextLine();
            if(input.equals("x")||input.equals("X")){
                System.out.println("* 종료되었습니다.");
                break;}
                
            System.out.print("-> 찾을 문자열을 입력하세요. : ");
            String remove = s1.nextLine();
            System.out.print("-> 바꿀 문자열을 입력하세요. : ");
            String put = s1.nextLine();
            System.out.println();
            
            Pattern p = Pattern.compile(remove);
            Matcher m = p.matcher(input);
            int count =0;
                for(int i=0; m.find(i); i = m.end())
                    count++;

            input = input.replace(remove,put);
            System.out.printf("-> 총 %d번 바뀌었습니다.\n\n",count);
            System.out.println("-> "+input);
        }
    }

    public static void main(String[] args) { 
        test t = new test();
        t.run(); 
    }
}
