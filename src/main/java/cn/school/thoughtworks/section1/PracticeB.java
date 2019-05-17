package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        //选出1集合中与2集合中子数组的元素相同的元素
        List<String> result = new ArrayList<>();
        for (int i = 0; i < collection1.size(); i++) {
            if(collection2.get(0).contains(collection1.get(i))){
                result.add(collection1.get(i));
            }
        }
        return result;
    }
}
