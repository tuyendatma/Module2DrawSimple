import java.util.Scanner;

public class DrawSimple {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("1.Print the rectangle");
        System.out.println("2.Print the square triangle");
        System.out.println("3.Print isosceles triangle");
        System.out.println("4.Exit");
        System.out.println("Input your choice:");
        int select = scanner.nextInt();
        int squareTriangle;
        switch (select){
            case 1:
                drawRectangle();
                break;
            case 2:
                System.out.println("1.top_left");
                System.out.println("2.top_right");
                System.out.println("3.bot_left");
                System.out.println("4.bot_right");
                System.out.print("Input your choice:");
                squareTriangle = scanner.nextInt();
                switch (squareTriangle){
                    case 1:
                        drawSquareTriangle1();
                        break;
                    case 2:
                        drawSquareTriangle2();
                        break;
                    case 3:
                        drawSquareTriangle3();
                        break;
                    case 4:
                        drawSquareTriangle4();
                        break;
                }

            case 3:
                drawIsoscelesTriangle();
                break;
        }
    }
    public static void drawRectangle(){
        String a="*";
        String data="";
        for(int i=0; i<5 ;i++){
            for(int j=0;j<10;j++){
                data += a;
            }
            System.out.println(data);
            data="";
        }
    }
    public static void drawSquareTriangle1(){
        String a="*";
        String data="";
        for(int i=1; i<=5 ;i++){
            for(int j=0;j<i;j++){
                data += a;
            }
            System.out.println(data);
            data="";
        }
    }
    public static void drawSquareTriangle2(){
        String a="*";
        String data="";
        for(int i=5;i>0;i--){
            for(int j=0;j<i;j++){
                data += a;
            }
            System.out.println(data);
            data="";
        }
    }
    public static void drawSquareTriangle3(){
        String a="*";
        String data="";
        for (int i=1;i<=5;i++){
            for (int j=0;j<=i;j++){
                data += " ";
            }
            for (int k=0;k<=5-i;k++){
                data +="*";
            }
            System.out.println(data);
            data="";
        }

    }
    public static void drawSquareTriangle4(){
        String a="*";
        String data="";
        for (int i=1;i<=5;i++){
            for (int j=0;j<=5-i;j++){
                data += " ";
            }
            for (int k=0;k<i;k++){
                data +="*";
            }
            System.out.println(data);
            data="";
        }

    }
    public static void drawIsoscelesTriangle(){
        String a="*";
        String data="";
        for (int i=1;i<=5;i++){
            for(int j=0; j<=5-i;j++){
                data+= " ";
            }
            for (int k =0;k<i;k++){
                data+=a;
            }
            for(int l=0;l<i-1;l++){
                data+=a;
            }
            System.out.println(data);
            data="";
        }
    }

    }
