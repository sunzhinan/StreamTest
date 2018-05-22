package com.sun.myl.util;

public class StringUtils {
	public static boolean isNotEmpty(String str)
	{
		if (str == null || "".equals(str)) {
			return false;
		}
		else
		{
			return true;
		}
	}
}
