package com.sun.myl.util;

public class TestMail {
	public static void main(String[] args) {
		try {

			Mail mail = new Mail();
			// 设置邮件服务器
			mail.setHost("smtp.qq.com");
			// 发件人邮件地址
			mail.setSender("1418769631@qq.com");
			// 发件人名称
			mail.setName("Java.小学生");
			// 登录账号,一般都是和邮箱名一样吧
			mail.setUsername("1418769631@qq.com");
			// 发件人邮箱的登录密码
			mail.setPassword("rdrkiymexsoqhdgb");
			//mail.setPassword("zndj hdvn jwnj jiif");
			//mail.setPassword("19930306sthlh*");
			
			// 接收人
			mail.setReceiver("15850748693@163.com");
			mail.setReceiverName("我要女票");
			mail.setSubject("万里长征最后一步测试");
			String html = "<!DOCTYPE html>";
			html += "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">";
			html += "<title>Insert title here</title>";
			html += "</head><body>";
			html += "<div style=\"width:600px;height:400px;margin:50px auto;\">";
			html += "<h1>我来看看邮件是否发送成功呢</h1><br/><br/>";
			html += "<p>下面是通过该协议可以创建一个指向电子邮件地址的超级链接，通过该链接可以在Internet中发送电子邮件</p><br/>";
			html += "<a href=\"mailto:huntereagle@foxmail.com?subject=test&cc=huntertochen@163.com&body=use mailto sample\">send mail</a>";
			html += "</div>";
			html += "</body></html>";
			mail.setMessage(html);

			new MailUtil().send(mail);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
