package gaozhu.francis.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * 压制警告注解的使用示例
 * @author: FrancisGaozhu
 * @date: 2018/9/3 16:18
 */
public class SuppressWaringsDemo
{

    /*
    这里我们定义了一个普通方法，但是这个方法并没有任何地方进行调用，也就是说，这个方法自动被定义了之后并没有被进行任何有效的使用，所以
    这里会出现一个警告信息。
     */
    public void test1()
    {

    }


    /*
    同test1一样，我们定义了一个test2方法，这个方法仍然没有进行任何有效地使用，所以一样会提示一个警告信息。
    但是我们定义了一个注解去标识这个方法，所以不再提示警告信息。其中的unused参数值，用于压制因为未使用而出现的警告信息。
     */
    @SuppressWarnings("unused")
    public void test2()
    {

    }


    /*
    这里定义了一个test3方法，在test3方法中定义了一个临时变量。
    这个时候test3方法没有进行有效地使用，而i变量自从定义了之后也没有进行任何有效的使用，所以两个地方都出现了警告信息。
    如果我们将压制未使用警告的注解加在变量签名，则变量上的警告信息被压制了，方法仍然会提示警告。
    如果我们直接在方法上加上压制警告注解，那么整个方法以及内部的因为未使用而产生的警告信息都会被压制。
    分别解开方法上的两个注解的注释后可以依次看到效果。
     */
    //@SuppressWarnings("unused")
    public void test3()
    {
        //@SuppressWarnings("unused")
        int i = 0;
    }




    /*
    同上面的内容没有什么区别，我们继续定义一个没有任何有效使用的方法。
    但是我们需要明白，代码出现警告，绝对不仅仅没有进行有效地使用着一种情况，实际上代码上导致出现警告的场景还有很多。
    比如没有使用泛型。
    如下的方法，可以同时压制因为泛型和未有效使用导致的警告信息。
     */

    public void test4()
    {
        @SuppressWarnings({"unused","rawtypes"})
        List lst = new ArrayList();
    }


    /*
    顺带一看，注解可以同时使用多个。
     */
    @SuppressWarnings("unused")
    @Override
    public String toString()
    {
        return null;
    }
}
