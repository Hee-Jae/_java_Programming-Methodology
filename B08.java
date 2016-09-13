import java.util.Scanner;
class B08{ //equals 이해하기
    void run(){
        Scanner s = new Scanner(System.in);
        
        System.out.print("첫번째 숫자를 입력하세요 : ");
        int n1 = s.nextInt();
        System.out.print("두번째 숫자를 입력하세요 : ");
        int n2 = s.nextInt();
        System.out.print("세번째 숫자를 입력하세요 : ");
        int n3 = s.nextInt();

        if(n1==n2 || n2==n3|| n3==n1){
            System.out.println("1번 조건 만족 : 3개의 숫자 중 적어도 두 수의 값이 같다.");
        }

        if(n1>50 && n2>50) {
            System.out.println("2번 조건 만족 : 3개의 숫자 중 적어도 두 수의 크기가 모두 50 보다 크다.");
        }
        else if(n2>50 && n3>50) {
            System.out.println("2번 조건 만족 : 3개의 숫자 중 적어도 두 수의 크기가 모두 50 보다 크다.");
        }
        else if(n1>50 && n3>50) {
            System.out.println("2번 조건 만족 : 3개의 숫자 중 적어도 두 수의 크기가 모두 50 보다 크다.");
        }

        if(n1==n2+n3) {
            System.out.println("3번 조건 만족 : 3개의 숫자 중 어떤 두 수의 합이 나머지 하나의 숫자와 같다.");
        }
        else if(n2==n1+n3) {
            System.out.println("3번 조건 만족 : 3개의 숫자 중 어떤 두 수의 합이 나머지 하나의 숫자와 같다.");
        }
        else if(n3==n2+n1) {
            System.out.println("3번 조건 만족 : 3개의 숫자 중 어떤 두 수의 합이 나머지 하나의 숫자와 같다.");
        }

        if(n2/n1==0 && n3/n1==0){
            System.out.println("4번 조건 만족 : 3개의 숫자 중 어떤 하나의 수로 다른 두 수를 나누면 나누어떨어지는 경우가 있다.");
        }
        else if(n3/n2==0 && n3/n2==0){
            System.out.println("4번 조건 만족 : 3개의 숫자 중 어떤 하나의 수로 다른 두 수를 나누면 나누어떨어지는 경우가 있다.");
        }
        else if(n2/n3==0 && n1/n3==0){
            System.out.println("4번 조건 만족 : 3개의 숫자 중 어떤 하나의 수로 다른 두 수를 나누면 나누어떨어지는 경우가 있다.");
        }
    }

    public static void main(String[] args) { 
        B08 t = new B08();
        t.run(); 
    }
}