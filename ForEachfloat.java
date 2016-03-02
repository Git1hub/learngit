package com.atguigu.javase.practice;
/**
 * foreach语法
 */

import java.util.Random;

public class ForEachfloat {

	public static void main(String[] args) {
		Random rand=new Random(47);
		float f[]=new float[10];
		for(int i=0;i<10;i++)
			f[i]=rand.nextFloat();
		for(float x:f)//进行循环输出，也可容易的对字符串的字符进行迭代
			System.out.println(x);

	}

}
