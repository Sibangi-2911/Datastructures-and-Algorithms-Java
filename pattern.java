public class pattern {
    public static void main(String args[]){
        for(int i = 1; i<=4; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }
        for(int line=1;line<=4;line++){
            for(int star = 1; star<=4-line+1;star++){
                System.out.print(star);
            }
            System.out.println(" ");
        }
        int n = 4;
        char ch = 'A';
        for(int l=1;l<=n;l++){
            for(int c=1; c<=l;c++){
                System.out.print(ch);
                ch++;
            }
            System.out.println(" ");
        }
    }
}
