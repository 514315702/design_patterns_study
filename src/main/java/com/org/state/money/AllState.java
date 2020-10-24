package com.org.state.money;

//
class FeedBackState extends AbstractState {

	public String getCurrentState() {
		return StateEnum.FEED_BACKED.getValue();
	}
}

class GenerateState extends AbstractState {

	@Override
	public void checkEvent(Context context) {
		context.setState(new ReviewState());
	}

	@Override
	public void checkFailEvent(Context context) {
		context.setState(new FeedBackState());
	}

	public String getCurrentState() {
		return StateEnum.GENERATE.getValue();
	}
}

class NotPayState extends AbstractState {

	@Override
	public void payOrderEvent(Context context) {
		context.setState(new PaidState());
	}

	@Override
	public void feedBackEvent(Context context) {
		context.setState(new FeedBackState());
	}

	public String getCurrentState() {
		return StateEnum.NOT_PAY.getValue();
	}
}

class PaidState extends AbstractState {

	@Override
	public void feedBackEvent(Context context) {
		context.setState(new FeedBackState());
	}

	public String getCurrentState() {
		return StateEnum.PAID.getValue();
	}
}

class PublishState extends AbstractState {

	@Override
	public void acceptOrderEvent(Context context) {
		context.setState(new NotPayState());
	}

	@Override
	public void notPeopleAcceptEvent(Context context) {
		context.setState(new FeedBackState());
	}

	public String getCurrentState() {
		return StateEnum.PUBLISHED.getValue();
	}
}

class ReviewState extends AbstractState {

	@Override
	public void makePriceEvent(Context context) {
		context.setState(new PublishState());
	}

	public String getCurrentState() {
		return StateEnum.REVIEWED.getValue();
	}

}