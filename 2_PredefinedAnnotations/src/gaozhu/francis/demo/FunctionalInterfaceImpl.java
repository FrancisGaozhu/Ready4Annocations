package gaozhu.francis.demo;

import gaozhu.francis.inter.FunctionalInter;

/**
 * @author: FrancisGaozhu
 * @date: 2018/9/6 15:29
 * @mail: francisgaozhu@foxmail.com
 */
public class FunctionalInterfaceImpl implements FunctionalInter
{

    @Override
    public void meeting(String name)
    {
        System.out.println("很高兴见到你，" + name + "。");
    }

}
