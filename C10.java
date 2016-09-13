import java.util.Scanner;
class C10{
    void run(){
        Scanner s = new Scanner(System.in);
        
        System.out.print("첫 번째 숫자를 입력하시오. : ");
        int n1 = s.nextInt();
        System.out.print("두 번째 숫자를 입력하시오. : ");
        int n2 = s.nextInt();
        System.out.print("연산기호문자('+', '-', '*', '/' 중 1개)를 입력하시오. : ");
        String operator = s.next();

        if(operator.equals("+")){
            System.out.printf("계산식의 결과 값은 %d 입니다.\n",(int)(n1+n2));
        }
        else if(operator.equals("-")){
            System.out.printf("계산식의 결과 값은 %d 입니다.\n",(int)(n1-n2));
        }
        else if(operator.equals("*")){
            System.out.printf("계산식의 결과 값은 %d 입니다.\n",(int)(n1*n2));
        }
        else if(operator.equals("/")){
            System.out.printf("계산식의 결과 값은 %d 입니다.\n",(int)(n1/n2));
        }
        else{
            System.out.printf("invalid input!\n");
        }
    }

    public static void main(String[] args) { 
        C10 t = new C10();
        t.run(); 
    }
