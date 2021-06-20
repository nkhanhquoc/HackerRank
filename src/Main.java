import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {

  public static void main(String[] args) {

    List<Integer> listInt = Arrays.asList(1,2,3,4,5,6,9,8,7,7,1,1,1,2,2,4,4,5);
    Map<Integer, Integer> map = new HashMap<>();
    List<Integer> result = new ArrayList<>();
    for( int val : listInt){
      if(map.containsKey(val)){
        map.put(val, map.get(val)+1);
      } else {
        map.put(val, 1);
      }
    }
    TreeMap<Integer, Integer> treeMap = new TreeMap<>();
    Map<Integer, Integer> newMap = new HashMap<>();
    newMap.putAll(map);

    int iNumber = 0;
    while(newMap.size() > 0){
      treeMap.clear();
      iNumber+=1;
      System.out.println("iNumber: "+ iNumber);
      Set<Integer> setKey = map.keySet();
      for(int mapKey : setKey){
        System.out.println("mapKey: "+mapKey + " value: "+map.get(mapKey));
        if(map.get(mapKey) == iNumber){
            treeMap.put(mapKey, iNumber);
            newMap.remove(mapKey);
        }
      }
      for(int treeMapKey : treeMap.keySet()){
        for(int i = 0; i < iNumber; i+=1){
          result.add(treeMapKey);
        }
      }
    }
    System.out.println("result: "+ result.toString());

  }
}
