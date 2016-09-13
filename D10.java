import java.util.Scanner;
class D10{ 
    void run(){
        Scanner s = new Scanner(System.in);
        int a,b,i;
        System.out.print("2개의 숫자를 입력하시오. : ");
        a = s.nextInt(); b = s.nextInt();
        if(a==b){System.out.println("None");}
        else if(a<=b){
            System.out.printf("%d",a);
            for(i=a+1;i<=100;i++){
                if(i%a==0){
                    if(i%b!=0){
                        System.out.printf(", %d",i);
                    }
                }
                else{
                    if(i%b==0){
                        System.out.printf(", %d",i);
                    }
                }
            }
            System.out.println();
        }
        else{
            System.out.printf("%d",b);
            for(i=b+1;i<=100;i++){
                if(i%a==0){
                    if(i%b!=0){
                        System.out.printf(", %d",i);
                    }
                }
                else{
                    if(i%b==0){
                        System.out.printf(", %d",i);
                    }
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) { 
        D10 t = new D10();
        t.run(); 
    }
}