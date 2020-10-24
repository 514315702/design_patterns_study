package com.org.interpreter;

import java.util.HashMap;

public class SubExpression extends SymbolExpression {

	public SubExpression(Expression left, Expression right) {
		super(left, right);
	}

	//相减后的值
	public int interpreter(HashMap<String, Integer> var) {
		return super.left.interpreter(var) - super.right.interpreter(var);
	}
}
