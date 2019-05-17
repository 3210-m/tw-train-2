package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String,List<String>> collection2) {
        //选出1集合中跟2对象中value属性中的元素相同的元素
        List<String> result = new ArrayList<>();
        for (int i = 0; i < collection1.size(); i++) {
            if(collection2.get("value").contains(collection1.get(i))){
                result.add(collection1.get(i));
            }
        }
        return result;
    }
}