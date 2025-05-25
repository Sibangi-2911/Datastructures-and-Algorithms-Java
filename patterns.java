import java.util.*;
public class patterns {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int sqrow = 1;sqrow<=n;sqrow++){
            for(int sqcol = 1; sqcol<=n; sqcol++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println("--------------------------------------");

        //Bottom left triangle
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){
                if(row-col>=0){
                    System.out.print("*");
                }
            }
            System.out.println(" ");
        }
        System.out.println("--------------------------------------");

        //Top right triangle
        for(int r=1;r<=n;r++){
            for(int c=1;c<=n;c++){
                if(r-c<=0){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }

        System.out.println("------------------------");

        //X-pattern
        for(int ro = 1;ro<=n;ro++){
            for(int co=1;co<=n;co++){
                if(ro-co==0 || ro+co==n+1){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }

        
     }
}
