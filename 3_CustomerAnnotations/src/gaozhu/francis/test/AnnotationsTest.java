package gaozhu.francis.test;

import gaozhu.francis.annotations.MyAnnotation;

/**
 * 自定义注解的使用
 * @author: FrancisGaozhu
 * @date: 2018/9/7 15:04
 * @mail: francisgaozhu@foxmail.com
 */
//在类的上方加上我们的自定义注解，并且针对于没有默认值的属性是必须进行赋值的。
@MyAnnotation(name = "高翥", teacherNo = 007, hobby = {"抽烟", "喝酒", "吃丸"})
public class AnnotationsTest
{



}
