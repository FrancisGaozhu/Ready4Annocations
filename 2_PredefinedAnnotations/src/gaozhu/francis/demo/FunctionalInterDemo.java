package gaozhu.francis.demo;

import gaozhu.francis.inter.FunctionalInter;

/**
 *
 * @author: FrancisGaozhu
 * @date: 2018/9/6 15:32
 * @mail: francisgaozhu@foxmail.com
 */
public class FunctionalInterDemo
{
    public FunctionalInterDemo(FunctionalInter inter)
    {
        this.inter = inter;
    }
    private FunctionalInter inter;

    public static void main(String[] args)
    {

        FunctionalInterDemo test = new FunctionalInterDemo
                (
                    (String name)->
                    {
                        System.out.println("很高兴见到你：" + name + "。");
                    }
                );
        test.inter.meeting("小丽");
    }

}
