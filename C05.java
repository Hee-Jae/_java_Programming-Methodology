import java.util.Scanner;
class test{
    void run(){
        Scanner s = new Scanner(System.in);
        
        int sum=0,i,check=0;
        System.out.print("월을 입력하시오. : ");
        int month = s.nextInt();
        System.out.print("일을 입력하시오. : ");
        int day = s.nextInt();
        
        if(month>=13 ||month<=0){
            System.out.println("Invalid input!");
        }
        else{
            for(i=1;i<month;i++){
                if(check==1){}
                else if(i==1||i==3||i==5||i==7||i==8||i==10||i==12){
                    if(day>31){
                        System.out.println("Invalid input!");
                        check=1;
                    }
                    else{
                        sum+=31;
                    }
                }
                else if(i==2){
                    if(day>28){
                        System.out.println("Invalid input!");
                        check=1;
                    }
                    else{
                        sum+=28;
                    }
                }
                else{
                    if(day>30){
                        System.out.println("Invalid input!");
                        check=1;
                    }
                    else{
                        sum+=30;
                    }
                }
            }
            sum+=day;
            if(check==1){}
            else{
                System.out.println("이 날짜는 1년 중 "+sum+"번째 날에 해당됩니다.");
            }
        }
    }
    public static void main(String[] args) { 
        test t = new test();
        t.run(); 
    }
}