package testExersizeInterwie;

import java.util.HashMap;
import java.util.Map;

public class Duplicate {
    public static double[] task(double[] a){
        Map<Double,Integer> indexes = new HashMap<>();
        int countOfDuplicates = 0;
        for(int i = 0; i < a.length; i++){
            if(indexes.containsKey(a[i])){
                indexes.put(a[i],i);
                countOfDuplicates ++;
            }
            if(a[i] < 0){
                throw new RuntimeException();
            }
            indexes.put(a[i],i);
        }
        double[] result = new double[a.length - countOfDuplicates];
        int index =0;
        for (int i = 0; i < a.length; i++){
            if(indexes.get(a[i]) == i){
                result[index++] = a[i];
            }
        }
        return result;
    }
}
