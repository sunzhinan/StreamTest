package com.sun.myl.util;

import java.util.Random;

import com.sun.myl.exception.SequenceException;

public abstract class SequenceUtils 
{
	public static String getSequence(int length) throws Exception
	{
		String dataPattern = "yyyyMMddHHmmssSSS";
		int randomLength = length - dataPattern.length();
		if (randomLength <=0 )
		{
			throw new SequenceException("序列长度不满足序列生成需求！");
		}
		String id = DateFormatUtil.getDateByString(dataPattern) + getRandomStringByLength(randomLength);
		
		return id;
	}
	
	private static String getRandomStringByLength(int length)
	{
		String base = "0123456789";
		Random random = new Random();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < length; i++) 
		{
			int number =random.nextInt(base.length());
			sb.append(base.charAt(number));
		}
		return sb.toString();
	}
}
