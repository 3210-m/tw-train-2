package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> countSameElements(List<String> collection1) {
        //把1集合中相同的元素统计出数量
        return countSameElement(collection1);
    }

    public static Map<String,Integer> countSameElement(List<String> collection1) {
        //把1集合中相同的元素统计出数量
        Map<String,Integer> result = new HashMap<>();
        for (int i = 0; i < collection1.size(); i++) {
            if(result.containsKey(collection1.get(i))){
                result.put(collection1.get(i),result.get(collection1.get(i))+1);
            }else {
                result.put(collection1.get(i),1);
            }
        }
        return result;
    }
}
