package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        //选出collection1中key跟collection2中value对应的list中的元素相同的元素,把他们的count，满3减1，输出减过之后的新集合
        return cUC(collectionA,object);

    }

    public static Map<String,Integer> cUC(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        //选出collection1中key跟collection2中value对应的list中的元素相同的元素,把他们的count，满3减1，输出减过之后的新集合
        List<String> list = object.get("value");
        int count ;
        for (int i = 0; i < list.size(); i++) {
            if(collectionA.containsKey(list.get(i))){
                count = collectionA.get(list.get(i));
                collectionA.put(list.get(i),count-(count/3));
            }
        }
        return collectionA;

    }
}
