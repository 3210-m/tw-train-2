package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;

public class PracticeA {
    List<String> collectSameElements(List<String> collection1, List<String> collection2) {
        //选出1集合中与2集合中相同的元素

        //如果是根据size小的来决定谁做循环的比较高效，
        //但测试中要求结果是按collection1的顺序
        return collection1.size()>=collection2.size()?collectSameElement(collection1,collection2):collectSameElement(collection2,collection1);
        //return null;
    }

    /**
     * 选出两个集合中相同的元素
     * @param c2
     * @param c1
     * @return
     */
    List<String> collectSameElement(List<String> c2, List<String> c1) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < c2.size(); i++) {
            if(c1.contains(c2.get(i))){
                result.add(c2.get(i));
            }
        }
        return result;
    }

}
