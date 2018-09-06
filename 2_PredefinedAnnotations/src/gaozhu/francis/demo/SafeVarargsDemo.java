package gaozhu.francis.demo;

/**
 * 可变长参数注解的使用
 * @author: FrancisGaozhu
 * @date: 2018/9/4 10:45
 */
public class SafeVarargsDemo
{

    @SafeVarargs
    public static <T> void print(T... a)
    {
        for (T param: a)
        {
            System.out.println(param);
        }
    }


    public static void main(String[] args)
    {
        print(1,3,4,5,6,2,3,1,33);
    }

}
