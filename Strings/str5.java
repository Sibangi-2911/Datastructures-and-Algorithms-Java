//get the shortest path
public class str5 { 
  public static float getShortestPath(String path){
    int x=0;
    int y=0;
    for(int i=0;i<path.length();i++){
      char dir = path.charAt(i);
      //South
      if(dir=='S'){
        y-=1;
      }
      //North
      else if(dir=='N'){
        y+=1;
      }
      //West
      else if(dir=='W'){
        x-=1;
      }
      //East
      else if(dir=='E'){
        x+=1;
      }
    }
    int X2 = x*x;
    int Y2 = y*y;
    return (float)Math.sqrt(X2+Y2);
  }
  public static void main(String args[]){
    String path = "WNEENESENNN";
    System.out.println(getShortestPath(path));
  }
}
