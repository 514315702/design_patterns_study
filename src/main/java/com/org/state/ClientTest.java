package com.org.state;

/**
 * ״̬ģʽ������
 * @author Administrator
 *
 */
public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建活动休想 ，奖品由一个奖品
        RaffleActivity activity = new RaffleActivity(1);

        // 抽30次
        for (int i = 0; i < 30; i++) {
            activity.debuctMoney();
            activity.raffle();
        }
	}

}
