package com.org.state;

/**
 * 抽奖活动
 * 
 * @author Administrator
 *
 */
public class RaffleActivity {

	//当前状态
    State state = null;
    //奖品数量
    int count = 0;
    
    //四个属性表示四种状态
    State noRafflleState = new NoRaffleState(this);
    State canRaffleState = new CanRaffleState(this);
    
    State dispenseState =   new DispenseState(this);
    State dispensOutState = new DispenseOutState(this);

    //构造器
    //初始化当前状态，为noRafflleState 即不能抽奖状态
    //初始刷奖品数量
    public RaffleActivity( int count) {
        this.state = getNoRafflleState();
        this.count = count;
    }

    //扣除积分，调用当前状态 deductMoney
    public void debuctMoney(){
        state.deductMoney();
    }

    //抽奖
    public void raffle(){
    	//如果当前状态为抽奖抽奖成功
        if(state.raffle()){
        	//领取奖品
            state.dispensePrize();
        }

    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    //��������ע�⣬ÿ��ȡһ�ν�Ʒ��count--
    public int getCount() {
    	int curCount = count; 
    	count--;
        return curCount;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public State getNoRafflleState() {
        return noRafflleState;
    }

    public void setNoRafflleState(State noRafflleState) {
        this.noRafflleState = noRafflleState;
    }

    public State getCanRaffleState() {
        return canRaffleState;
    }

    public void setCanRaffleState(State canRaffleState) {
        this.canRaffleState = canRaffleState;
    }

    public State getDispenseState() {
        return dispenseState;
    }

    public void setDispenseState(State dispenseState) {
        this.dispenseState = dispenseState;
    }

    public State getDispensOutState() {
        return dispensOutState;
    }

    public void setDispensOutState(State dispensOutState) {
        this.dispensOutState = dispensOutState;
    }
}
