import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author zhoumo
 * @datetime 2018/7/11 14:08
 * @desc
 */
public class TestJdk {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
//        Collections.sort(list, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2-o1;
//            }
//        });
//        Collections.sort(list, (o1, o2) -> {
//            return o2 - o1;
//        });
        //lambda表达式,是匿名函数的缩写形式,只能对定义了一个方法的接口类型使用,
        //()中直接写参数列表,参数类型可省略,->表示方法体内内容,在只有一条语句时{}可省略,并且return也可以省略
        Collections.sort(list,(o1,o2)->o2-o1);
        list.forEach(i-> System.out.println("i = " + i));

    }


}
