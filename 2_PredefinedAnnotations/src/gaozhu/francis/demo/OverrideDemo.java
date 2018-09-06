package gaozhu.francis.demo;

/**
 * 针对于重写标识注解的展示
 * @author: FrancisGaozhu
 * @date: 2018/9/3 15:56
 */
public class OverrideDemo extends Object
{

    /*
     * 下面定义了一个普通方法，如果使用Override注解去标识这个方法会报错，
     * 因为这个方法并不是从父类（Object类）重写的方法。
     * 使用Override注解去标识这个方法则代表这个方法是从父类重写过来的方法，
     * 然而父类中并没有test1方法，所以无法重写。
     * 所以无法通过编译检查，继而报错。
     *
     */
    //@Override
    public void test1()
    {

    }

    /*
     * 下面定义了一个toString方法发，这个方法是从父类重写的方法，所以加上这个注解可以通过编译检查。
     * 如果加上这个注解之后，针对于方法签名的部分进行任何更改都将会报错。
     * 方法定义部分包括：
     *  1.方法访问修饰符
     *  2.方法返回值类型
     *  3.方法名称
     *  4.方法的参数
     *
     */
    @Override
    public String toString()
    {
        return super.toString();
    }
}
