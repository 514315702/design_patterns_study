package com.org.interpreter;

import java.util.HashMap;

/**
 *
 * 抽象的运算符解析器，每个运算符号都只有和自己左右数据有关
 * 但左右两个数字有可能也只是个解析结果，无论何种类型，都是Expression 类的实现类
 * @author Administrator
 *
 */
public class SymbolExpression extends Expression {

	protected Expression left;
	protected Expression right;

	public SymbolExpression(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	//��Ϊ SymbolExpression 是让其子类来实现，所以默认为空实现
	@Override
	public int interpreter(HashMap<String, Integer> var) {
		// TODO Auto-generated method stub
		return 0;
	}
}
