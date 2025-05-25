public class pattren1 {
    public static void hollow_rectangle(int totrows, int totcols){
        for(int i=1;i<=totrows;i++){
            for(int j=1;j<=totcols;j++){
                if(i==1 || i==totrows || j==1 || j==totcols){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void invertpyramidhalf(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void halfnumpyramid(int num){
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num-i+1;j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
    public static void floydTriangle(int n){
        int counter=1;
        for(int i = 1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void triangle01(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print(1+" ");
                } else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }
    public static void butterly(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n; i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void solidRhombus(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void hollowRhombus(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void diamond(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        hollow_rectangle(4, 5);
        invertpyramidhalf(4);
        halfnumpyramid(5);
        floydTriangle(5);
        triangle01(5);
        butterly(4);
        solidRhombus(5);
        hollowRhombus(5);
        diamond(4);
    }
}
