package com.jiangcheng.theory.designpattern.factory.straightfactory;

/**
 * 类名称：Implements1Factory<br>
 * 类描述：<br>
 * 创建时间：2018年08月17日<br>
 *
 * @author jiangcheng
 * @version 1.0.0
 */

public class Implements1Factory implements ServiceFactory {
    @Override
    public Service getService() {
        return new Implements1();
    }
}
