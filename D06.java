import java.util.Scanner;
class D06{ 
    void run(){
        Scanner s = new Scanner(System.in);
        int i,biggest=0,big=0,mid=0,small=0;
        double pyung,m2;

        for(i=0;i<10;i++){
            System.out.print("아파트의 분양 면적(제곱미터)를 입력하시오. : ");
            m2 = s.nextDouble();
            pyung = 219m2/3.305;
            System.out.printf("--> 이 아파트의 평형은 %.1f평 입니다.\n",pyung);

            if(pyung>=50){biggest++;}
            else if(pyung>=30){big++;}
            else if(pyung>=15){mid++;}
            else if(pyung>0){small++;}
        }

        System.out.printf("소형 아파트는 %d개,\n",small);
        System.out.printf("중소형 아파트는 %d개,\n",mid);
        System.out.printf("중형 아파트는 %d개,\n",big);
        System.out.printf("대형 아파트는 %d개 입니다.\n",biggest);
    }

    public static void main(String[] args) { 
        D06 t = new D06();
        t.run(); 
    }
}