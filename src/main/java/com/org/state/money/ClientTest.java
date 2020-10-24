package com.org.state.money;

/**������*/
public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建context 对象
		Context context = new Context();
        //将当前对象设置为PublishState
		context.setState(new PublishState());
        System.out.println(context.getCurrentState());
        
//        //publish --> not pay
        context.acceptOrderEvent(context);
//        //not pay --> paid
        context.payOrderEvent(context);
//        //
//        try {
//        	context.checkFailEvent(context);
//        	System.out.println("流程正常");
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println(e.getMessage());
//		}
        
	}

}
