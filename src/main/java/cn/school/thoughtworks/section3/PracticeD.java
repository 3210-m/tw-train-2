package cn.school.thoughtworks.section3;

import cn.school.thoughtworks.section2.PracticeB;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeD {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //统计出collection1中相同的元素的个数，有过有-就把-右边的数字也计算入个数，形成collection3，
        // collection3是一个map其中元素key是collection1中的元素value是该元素在collection1中出现次数，
        // 然后选出collection3中的元素的key属性跟collection2中value属性对应的list中的元素相同的元素,
        // 把他们的count，满3减1，输出减过之后的新集合
        Map<String, Integer> result = PracticeB.countSameElement(collectionA);
        return cn.school.thoughtworks.section3.PracticeB.cUC(result,object);
    }
}
