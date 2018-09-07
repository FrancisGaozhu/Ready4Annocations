package gaozhu.francis.annotations;

/**
 * 自定义注解的格式示例
 * @author: FrancisGaozhu
 * @date: 2018/9/7 14:29
 * @mail: francisgaozhu@foxmail.com
 */
/*
自定义注解的格式创建与接口非常相似
首先是一个访问修饰符，可以为public或者default两种，因为注解不涉及到继承所以不具备protected访问修饰符，如果将自定义注解完全私有，那么
将无法使用也没有定义的必要，因此，自定义注解的访问修饰符只有public和protected两种。

然后是定义注解的关键字：@interface。与接口类似，前面多一个@符号。

最后的标识符就是自定义注解的名称。
 */
public @interface MyAnnotation
{

    /*
    在自定义注解中定义一个所属这个注解的属性，与声明变量的语法类似；
    属性类型 属性名() default 默认值。

    属性类型可以是值类型或者引用数据类型，属性名后必须跟着一组小括号。default和默认值是可选的，如果这个属性你需要上来就有一个默认值的
    话，那么可以在default关键字后直接跟着默认值。

    如果不给默认值的话，那么这个属性的值采取其数据类型本来的默认值。
     */
    String name() default "FrancisGaozhu";//定义了一个名称为name，类型为字符串的属性。默认值是"FrancisGaozhu"
    String[] hobby() default {"", "", "", "", "", ""};
    int teacherNo();

}
