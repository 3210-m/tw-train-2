package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //把1集合中相同的元素统计出数量
        Map<String, Integer> result = new HashMap<>();
        Object s[];
        String key ;
        int count = 1;
        for (int i = 0; i < collection1.size(); i++) {
            key = collection1.get(i);
            if (key.split("").length != 1) {
                count = Integer.parseInt(key.replaceAll("[^\\d]", ""));
                 key = key.replaceAll("[^a-z^A-Z]", "");
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
