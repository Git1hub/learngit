package com.atguigu.javase.practice;
/**
 * foreach�﷨
 */

import java.util.Random;

public class ForEachfloat {

	public static void main(String[] args) {
		Random rand=new Random(47);
		float f[]=new float[10];
		for(int i=0;i<10;i++)
			f[i]=rand.nextFloat();
		for(float x:f)//����ѭ�������Ҳ�����׵Ķ��ַ������ַ����е���
			System.out.println(x);

	}

}
