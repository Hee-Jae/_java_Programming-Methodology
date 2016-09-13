import java.util.Scanner;
class C08{
    void run(){
        Scanner s = new Scanner(System.in);
        
        System.out.print("첫 번째 숫자를 입력하시오. : ");
        int n1 = s.nextInt();
        System.out.print("두 번째 숫자를 입력하시오. : ");
        int n2 = s.nextInt();
        System.out.print("세 번째 숫자를 입력하시오. : ");
        int n3 = s.nextInt();
        
        if(n1>=n2){ //123 132 312
            if(n2>=n3){
                System.out.println("가장 큰 수는 "+n1+" 이고, 가장 작은 수는 "+n3+"입니다.");
            }
            else{
                if(n1>=n3){
                    System.out.println("가장 큰 수는 "+n1+" 이고, 가장 작은 수는 "+n2+"입니다.");
                }
                else{
                    System.out.println("가장 큰 수는 "+n3+" 이고, 가장 작은 수는 "+n2+"입니다.");
                }
            }
        }
        else if(n2>=n1){ //213 231 321
            if(n1>=n3){
                System.out.println("가장 큰 수는 "+n2+" 이고, 가장 작은 수는 "+n3+"입니다.");
            }
            else{
                if(n2>=n3){
                    System.out.println("가장 큰 수는 "+n2+" 이고, 가장 작은 수는 "+n1+"입니다.");
                }
                else{
                    System.out.println("가장 큰 수는 "+n3+" 이고, 가장 작은 수는 "+n1+"입니다.");
                }
            }
        }
        else if(n3>=n1){ //313 331 331
            if(n1>=n2){
                System.out.println("가장 큰 수는 "+n3+" 이고, 가장 작은 수는 "+n2+"입니다.");
            }
            else{
                if(n3>=n2){
                    System.out.println("가장 큰 수는 "+n3+" 이고, 가장 작은 수는 "+n1+"입니다.");
                }
                else{
                    System.out.println("가장 큰 수는 "+n2+" 이고, 가장 작은 수는 "+n1+"입니다.");
                }
            }
        }
    }

    public static void main(String[] args) { 
        C08 t = new C08();
        t.run(); 
    }
}

/*
import java.util.Scanner;
class max{
    public static void main(String[] args){
        int num1,num2,num3,max,min;
        Scanner in = new Scanner(System.in);
        num1 = in.nextInt();
        num2 = in.nextInt();
        num3 = in.nextInt();
        max = Math.max(Math.max(num1,num2),num3);
        min = Math.min(Math.min(num1,num2),num3);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
*/