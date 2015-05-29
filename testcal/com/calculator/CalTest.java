package com.calculator;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class CalTest extends Cal {

	@Test
	public void testAdd() {
		Cal c=new Cal();//ʵ��������
		int result=c.add(3, 4);
		Assert.assertEquals(7, result);
		//fail("��δʵ��");
	}

	@Test
	public void testMinus() {
		Cal c=new Cal();
		int result=c.minus(3, 1);
		Assert.assertEquals(2, result);
		//fail("��δʵ��");
	}

	@Test
	public void testMultiply() {
		Cal c=new Cal();
		int result=c.multiply(2, 3);
		Assert.assertEquals(6, result);
		//fail("��δʵ��");
	}

	@Test
	public void testDivide() {
		Cal c=new Cal();
		int result=c.divide(6,2);
		Assert.assertEquals(3, result);
		//fail("��δʵ��");
	}

}
