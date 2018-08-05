import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
   
        Scanner in = new Scanner(System.in);
        System.out.print("provide width: ");
        int width = in.nextInt();    
        System.out.print("provide height: ");
        int height = in.nextInt();    
        depictor(width,height);
    }
    
    
    public static void depictor(int x , int y){
        System.out.print("  ");
        for (int i = 0; i < x ; i++){
            System.out.print(i+1+" ");
        }
        System.out.print('\n');
        System.out.print(" ");

        for (int i = 0; i < x ; i++){
            System.out.print("__");
        }
        System.out.print('\n');


        for (int i = 0; i < y ; i++){
            System.out.print("| ");    

            for (int j = 0; j < x; j++){

                if(((i%2)^(j%2))==0){
                    System.out.print("X ");    
                }else{
                    System.out.print("  ");
                }
                
            }
            System.out.println("|"+(i+1));
        }
        System.out.print(" ");

        for (int i = 0; i < x ; i++){
            System.out.print("__");
        }
    }
}

