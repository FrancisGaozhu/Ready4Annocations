package gaozhu.francis.demo;

import gaozhu.francis.model.Person;

import java.util.Date;

/**
 * 已废弃注解的示例
 * @author: FrancisGaozhu
 * @date: 2018/9/3 17:20
 */
public class DeprecatedDemo
{

    public static void main(String[] args)
    {

        /*
        下方的代码中，有多处被贯穿线所划出来，这些内容都是被已废弃注解所标致的内容。
        但是代码仍然可以正常使用，废弃标识注解并不会对于程序的正常执行造成影响。
        所以说废弃标识注解是为了方便程序员查看，防止调用了某些已经不建议继续使用的内容。
         */
        Person per = new Person();//Peson类是自定义的，位置在：gaozhu.francis.model.Person
        per.name = "高翥";
        per.age = 26;//针对于标识为“已废弃”的变量进行赋值
        per.introduce();//针对于标识为“已废弃”的方法进行调用


        /*
        上面看到的这些，都是我们自己所定义的过时内容，实际上Java官方也有很多内容被定义为不建议使用的。
        例如下面的内容。
         */
        Date date = new Date();
        int year = date.getYear();
        int minute = date.getMinutes();
        int day = date .getDay();

    }



}

