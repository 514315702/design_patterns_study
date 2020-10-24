package com.org.state;

/**
 * 发放奖品的状态
 * @author Administrator
 *
 */
public class DispenseState extends State {

	 // 初始化时传入活动引用，发放奖品后改变其状态
    RaffleActivity activity;

    public DispenseState(RaffleActivity activity) {
        this.activity = activity;
    }
    
    //

    @Override
    public void deductMoney() {
        System.out.println("���ܿ۳�����");
    }

    @Override
    public boolean raffle() {
        System.out.println("不能扣除积分");
        return false;
    }

    //���Ž�Ʒ
    @Override
    public void dispensePrize() {
        if(activity.getCount() > 0){
            System.out.println("恭喜中奖");
            //改变状态
            activity.setState(activity.getNoRafflleState());
        }else{
            System.out.println("很遗憾，奖品发送完毕了");
            //改变状态  为奖品发送完毕，后面我们就不可以再抽奖
            activity.setState(activity.getDispensOutState());
            //System.out.println("�齱�����");
            //System.exit(0);
        }

    }
}