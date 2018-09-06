package gaozhu.francis.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: FrancisGaozhu
 * @date: 2018/9/3 15:12
 * 针对于注解的语法格式的演示
 */
public class Demo
{

    /*
     * 在这个类中，会通过代码的方式针对于注解的语法和使用格式进行一定的演示。
     * 所以，在看下面的人和代码的时候，不需要关注注解到底起到了什么作用，值是看出普通java类代码和注解的格式即可。
     * 针对于不同注解的不同功能，我们会在后面的内容中做详细的表述和学习。
     */


    /*
     * 在下面的内容中，定义了一个非常普通的方法，没有参数，方法名称为test，非静态方法，无返回值，访问修饰符为“全公开”
     * 但是在这个方法的上方，我们看到有这样的字样：@SuppressWarnings({"unused"})这就是一个注解，而这个注解写在了方法的上方。所以说这个注解用于修饰下方法的方法；
     * 而注解之后的括号中写的是注解的属性值，但是我们没有看到属性名称；如果属性名称为value那么这个注解的属性名称在调用的时候可以被省略。
     */

    @SuppressWarnings({"unused"})
    public void test()
    {
        String a = "你好";
        String b = "我是小明";
        System.out.println(a);

        List lst = new ArrayList();
        lst.add(1);
        lst.add(2);
        for(Object param : lst)
        {
            System.out.println(param);
        }
    }


    /*
     * 下面这个方法同样也被@Override注解修饰了，而这个注解并没有参数；
     *
     */
    @Override
    public String toString()
    {
        return "Demo{}";
    }
}
