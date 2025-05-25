public class arrlinear {
    public static int food(String[] menu, String key){
        for(int i =0;i<menu.length;i++){
            if(menu[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        String menu[] ={"Dosa","Sandwich","Idli","Samosa","Vada","Chaat"};
        String key = "Poha";
        int index =food(menu, key);
        if(index==-1){
            System.out.println("Not found");
        }
        else{
            System.out.println("Key found at index "+index);
        }
    }
}
