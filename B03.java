import java.util.Scanner;
class B03{
    void run(){
        Scanner s = new Scanner(System.in);
        
        System.out.print("직사각형의 가로 크기를 입력하시오. : ");
        int width = s.nextInt();
        System.out.print("직사각형의 세로 크기를 입력하시오. : ");
        int height = s.nextInt();
        
        //if(!check.equals('C'))
        if(width==height){
            System.out.println("직사각형의 넓이는" + width*height + " 이고");
            System.out.println("정사각형입니다.");
        }

        else{
            System.out.println("직사각형의 넓이는" + width*height + " 이고");
            System.out.println("정사각형이 아닙니다.");
        } 
    }

    public static void main(String[] args) { 
        B03 t = new B03();
        t.run(); 
    }
}