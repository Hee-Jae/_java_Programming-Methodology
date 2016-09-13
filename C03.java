import java.util.Scanner;
class C03{
    void run(){
        Scanner s = new Scanner(System.in);
        
        System.out.print("직사각형의 가로 크기를 입력하세요 : ");
        int hori = s.nextInt();
        System.out.print("직사각형의 세로 크기를 입력하세요 : ");
        int vert = s.nextInt();
        
        if(hori==vert){
            System.out.println("정사각형입니다.");
        }
        else if(vert*2<=hori){
            System.out.println("좌우로 길쭉한 직사각형입니다.");
        }
        else if(hori*2<=vert){
            System.out.println("위아래로 길쭉한 직사각형입니다.");
        }
        else if(hori<vert){
            System.out.println("일반적인 세로형 직사각형입니다.");
        }
        else{
            System.out.println("일반적인 가로형 직사각형입니다.");
        }
    }

    public static void main(String[] args) { 
        C03 t = new C03();
        t.run(); 
    }
}