package com.org.state;

import java.util.Random;

/**
 * 可以抽奖的状态
 * @author Administrator
 *
 */
public class CanRaffleState extends State {

    RaffleActivity activity;

    public CanRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    //已经扣除了积分 ，不能在扣除
    @Override
    public void deductMoney() {
        System.out.println("已经扣除过积分");
    }

    //可以抽奖，抽完后，根据实际情况设置新的状态
    @Override
    public boolean raffle() {
        System.out.println("正在抽奖，请稍后");
        Random r = new Random();
        int num = r.nextInt(10);
        // 10%中将机会
        if(num == 0){
            //改变活动状态发放奖品
            activity.setState(activity.getDispenseState());
            return true;
        }else{
            System.out.println("很遗憾没有抽到奖品");
            //改变活动状态，不能抽奖
            activity.setState(activity.getNoRafflleState());
            return false;
        }
    }

    // 不能发放奖品
    @Override
    public void dispensePrize() {
        System.out.println("没有中将  不能发放奖品");
    }
}
