import java.util.*;
class ElectricBoardManager{
  private Map<String, List<Integer>> boardMap;
  public ElectricBoardManager(){
    boardMap = new HashMap<>();
  }
  public void addReadings(String boardId, List<Integer> readings){
    if(boardMap.containsKey(boardId)){
      boardMap.get(boardId).addAll(readings);
    } else{
      boardMap.put(boardId, new ArrayList<>(readings));
    }
  }
  public double getAveragePowerConsumption(String boardId, int startRange, int endRange){
    if(!boardMap.containsKey(boardId)){
      return 0.0;
    }
    List<Integer> readings = boardMap.get(boardId);
    int sum =0;
    int count =0;

    for(int value: readings){
      if(value>=startRange && value<=endRange){
        sum+=value;
        count++;
      }
    }
    if(count==0) return 0.0;
    return (double) sum/count;
  }
}
public class QsPractice2 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    ElectricBoardManager manager = new ElectricBoardManager();
    int n = sc.nextInt(); //Number of boards

    for(int i=0;i<n;i++){
      String boardId = sc.next();
      int numReadings = sc.nextInt();
      List<Integer> readings = new ArrayList<>();
      for(int j=0;j<numReadings;j++){
        readings.add(sc.nextInt());
      }
      manager.addReadings(boardId, readings);
    }
    String queryBoardId = sc.next();
    int startRange = sc.nextInt();
    int endRange = sc.nextInt();
    double result = manager.getAveragePowerConsumption(queryBoardId, startRange, endRange);
    System.out.println("Avearge power consumption for board "+queryBoardId+" from "+startRange+" to "+endRange+": "+result);
    sc.close();
  }
}
