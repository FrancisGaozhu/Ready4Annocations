package gaozhu.francis.model;

/**
 * 人员信息类
 * @author: FrancisGaozhu
 * @date: 2018/9/3 17:24
 * 配合展示废弃标志注解的使用
 */
@Deprecated//废弃标识注解可以用于标志一个类
public class Person
{

    public String name;

    @Deprecated//废弃标识注解可以用于成员变量
    public int age;

    @SuppressWarnings("unused")
    @Deprecated//废弃标志注解可以用于方法
    public void introduce()
    {
        System.out.println("大家好，我的名字是" + this.name + "，今年" + this.age + "岁");
    }

}
