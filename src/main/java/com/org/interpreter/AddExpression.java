package com.org.interpreter;

import java.util.HashMap;

/**
 * 加法解析器
 * @author Administrator
 *
 */
public class AddExpression extends SymbolExpression  {

	public AddExpression(Expression left, Expression right) {
		super(left, right);
	}

	//处理相加
	public int interpreter(HashMap<String, Integer> var) {
		//super.left.interpreter(var) 返回left 表达式对应的值
		//super.right.interpreter(var): 返回right 表达式对应的值
		return super.left.interpreter(var) + super.right.interpreter(var);
	}
}
