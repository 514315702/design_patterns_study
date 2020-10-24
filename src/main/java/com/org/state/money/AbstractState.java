package com.org.state.money;

public abstract class AbstractState implements State {

	protected static final RuntimeException EXCEPTION = new RuntimeException("");

    /**
     * 抽象类默认实现State 接口所有防范
     * 该方法的子类 由子类是实现
     * @param context
     */
    public void checkEvent(Context context) {
        throw EXCEPTION;
    }

    public void checkFailEvent(Context context) {
        throw EXCEPTION;
    }

    public void makePriceEvent(Context context) {
        throw EXCEPTION;
    }

    public void acceptOrderEvent(Context context) {
        throw EXCEPTION;
    }
    public void notPeopleAcceptEvent(Context context) {
        throw EXCEPTION;
    }
    public void payOrderEvent(Context context) {
        throw EXCEPTION;
    }
    public void orderFailureEvent(Context context) {
        throw EXCEPTION;
    }
    public void feedBackEvent(Context context) {
        throw EXCEPTION;
    }
}
