package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //把1集合中相同的元素统计出数量
        return countSameElement(collection1);
    }

    public static Map<String, Integer> countSameElement(List<String> collection1) {
        //把1集合中相同的元素统计出数量
        Map<String, Integer> result = new HashMap<>();
        String s[];
        String key ;
        int count = 1;
        for (int i = 0; i < collection1.size(); i++) {
            key = collection1.get(i);
            if (key.split("").length != 1) {
                s = key.split("");
//                result.put(s[0],Integer.parseInt(s[s.length-1]));
                count = Integer.parseInt(s[s.length - 1]);
                key=s[0];
            }
            if (result.containsKey(key)) {
                result.put(key, result.get(key) + count);
            } else {
                result.put(key, count);
            }
            count = 1;
        }


        return result;
    }
}
