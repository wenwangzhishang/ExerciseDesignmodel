package com.xp.design.simplefactory;

/**
 * @类描述：加法
 * @创建人：Wangxiaopan
 * @创建时间：2018/5/16 0016 11:22
 * @修改人：
 * @修改时间：2018/5/16 0016 11:22
 * @修改备注：
 */
public class OperationAdd extends Operation {
    @Override
    public double getResult() {
        return getNumA() + getNumB();
    }
}
