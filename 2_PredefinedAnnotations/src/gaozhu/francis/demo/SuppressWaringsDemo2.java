package gaozhu.francis.demo;


import java.util.ArrayList;
import java.util.List;

/**
 * 针对于压制警告注解的使用位置说明
 * @author: FrancisGaozhu
 * @date: 2018/9/4 10:36
 */
@SuppressWarnings("unused")//注解也可以加在类的上方，会压制类中所有的警告信息。
public class SuppressWaringsDemo2
{
    /*
    下面存在一个方法，方法中有些未使用的内容。我们可以把注解加在这个内容上压制警告。

     */
    public void test1()
    {
        @SuppressWarnings("unused")
        int i = 0;
        @SuppressWarnings("unused")
        String s = "";
        @SuppressWarnings("unused")
        double d = 3.15;
    }


    /*
    实际上，我们可以直接将注解加在整个方法上，这样一来可以直接压制方法以及方法中所有的警告信息。
    当然了，如上文中所说，警告信息分为多种；需要用对应的参数值压制对应的警告信息。
     */
    @SuppressWarnings({"unused", "unchecked"})
    public void test2()
    {
        int i = 0;
        String s = "";
        double d = 3.15;
        List lst = new ArrayList();
        lst.add(1);
    }

}
