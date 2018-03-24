package com.sun.myl.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 鉴于之前在做辽宁移动SSOC时的惨痛经历，对于集合的大量重复单一的数据操作，显得代码非常冗长
 * 因此决定下来这段代码来给大家展示java8非常好用的Stream，可能接触到有些晚，因为之前一直
 * 都是用的java1.6，所以比较迟，但不会缺席。以后会不定时更新java的好用工具类以及自己对开
 * 发中的一些常用技巧的总结
 * 
 * 注意：这里只是介绍一些简单的，常见的操作。stream很广很实用，需要慢慢探索
 * 
 * @author sunzhinan
 *
 */
public class StreamTest 
{
	public static List<User> list = new ArrayList<User>();
	
	/**
	 * 第一个有关循环的操作，主要展示传统的循环操作和java8新变化（以下都是对比后面省略）
	 */
	public static void test1()
	{
		//java8之前集合循环的代码
		for (int i = 0; i < list.size(); i++) 
		{
			System.out.println(list.get(i).toString());
		}
		System.out.println("------------------------------------");
		//java8之后的集合循环代码,这里需要注意JavaSE要用1.8的不然编译通过不了
		list.stream().forEach(s -> System.out.println(s));
	}
	
	/**
	 * 找出对象的某个属性的最大值
	 */
	public static void test2()
	{
		//java8之前的方法
		int maxAge = 0;
		for (int i = 0; i < list.size(); i++) 
		{
			if (list.get(i).getUserAge() > maxAge) 
			{
				maxAge = list.get(i).getUserAge();
			}
		}
		System.out.println(maxAge);
		System.out.println("-------------------------");
		
		//java8
		int max = list.stream().mapToInt(User :: getUserAge).max().getAsInt(); 
		System.out.println(max);
		//最小值，平均值之类的可以查看javaAPI，这里就不一一列举。
	}
	
	/**
	 * 排序（简直不能在常见）--这里列举根据对象中的某个值排序
	 */
	public static void test3()
	{
		//java8之前--根据年龄排序
		//绝对没有下面方法简单，所以也不写代码
		//罢了说个思想吧--冒泡排序即可
		
		//java8
		List<User> userList = list.stream().sorted(Comparator.comparing(User :: getUserAge))
				.collect(Collectors.toList());
		userList.stream().forEach(s -> System.out.println(s));
	}
	
	/**
	 * 还有其他很多功能，具体的可以翻看API，这里举几个会用到的，如果还有欢迎留言补充
	 */
	public static void test4()
	{
		//java8--匹配
		boolean flag = list.stream().anyMatch(s -> s.getUserAddress().equals("china"));
		System.out.println(flag);
		
		//java8--统计
		List<User> userList =  list.stream()
                .filter(s -> s.getUserAge() > 24).collect(Collectors.toList());
		userList.stream().forEach(s -> System.out.println(s));
		
		//很多新方法就不多介绍了，去看API
	}
	
	public static void main(String[] args)
	{
		User userOne = new User();
		userOne.setUserId("1");
		userOne.setUserName("sunzhinan-1");
		userOne.setUserPassword("sthlh19960121");
		userOne.setUserAddress("china");
		userOne.setUserEmail("1111@qq.com");
		userOne.setUserPhone("12345");
		userOne.setUserAge(20);
		list.add(userOne);
		
		User userTwo = new User();
		userTwo.setUserId("2");
		userTwo.setUserName("sunzhinan-2");
		userTwo.setUserPassword("sthlh19960121");
		userTwo.setUserAddress("china");
		userTwo.setUserEmail("2222@qq.com");
		userTwo.setUserPhone("12345");
		userTwo.setUserAge(24);
		list.add(userTwo);
		
		User userThree = new User();
		userThree.setUserId("3");
		userThree.setUserName("sunzhinan-3");
		userThree.setUserPassword("sthlh19960121");
		userThree.setUserAddress("USA");
		userThree.setUserEmail("3333@163.com");
		userThree.setUserPhone("12345");
		userThree.setUserAge(32);
		list.add(userThree);
		
		User userFour = new User();
		userFour.setUserId("4");
		userFour.setUserName("sunzhinan-4");
		userFour.setUserPassword("sthlh19960121");
		userFour.setUserAddress("UK");
		userFour.setUserEmail("4444@qq.com");
		userFour.setUserPhone("12345");
		userFour.setUserAge(24);
		list.add(userFour);
		
		User userFive = new User();
		userFive.setUserId("5");
		userFive.setUserName("sunzhinan-5");
		userFive.setUserPassword("sthlh19960121");
		userFive.setUserAddress("UK");
		userFive.setUserEmail("5555@qq.com");
		userFive.setUserPhone("12345");
		userFive.setUserAge(28);
		list.add(userFive);
		
		test1();
		test2();
		test3();
		test4();
	}
}
