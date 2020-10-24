package com.org.interpreter;

import java.util.HashMap;

/**
 *
 * 通过hashMap 价值对  获取变量值
 * @author Administrator
 *
 */
public abstract class Expression {
	// a + b - c
	//解释公式和数值，key 就是公式（表达式） 参数，value 说就是具体的值
	// HashMap {a=10, b=20}
	public abstract int interpreter(HashMap<String, Integer> var);
}
