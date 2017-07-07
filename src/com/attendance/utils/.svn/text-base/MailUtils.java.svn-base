package com.attendance.utils;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;

public class MailUtils {

	public static void sendMail(String email, String emailMsg)
			throws AddressException, MessagingException {
		// 1.创建�?个程序与邮件服务器会话对�? Session

		Properties props = new Properties();
		//设置发�?�的协议
		props.setProperty("mail.transport.protocol", "SMTP");
		
		//设置发�?�邮件的服务�?
		props.setProperty("mail.host", "smtp.126.com");
		props.setProperty("mail.smtp.auth", "true");// 指定验证为true

		// 创建验证�?
		Authenticator auth = new Authenticator() {
			public PasswordAuthentication getPasswordAuthentication() {
				//设置发�?�人的帐号和密码
				return new PasswordAuthentication("sunquan_itcast", "sunquan@itcast");
			}
		};

		Session session = Session.getInstance(props, auth);

		// 2.创建�?个Message，它相当于是邮件内容
		Message message = new MimeMessage(session);

		//设置发�?��??
		message.setFrom(new InternetAddress("sunquan_itcast@126.com"));

		//设置发�?�方式与接收�?
		message.setRecipient(RecipientType.TO, new InternetAddress(email)); 

		//设置邮件主题
		message.setSubject("用户�?�?");
		// message.setText("这是�?封激活邮件，�?<a href='#'>点击</a>");

		//设置邮件内容
		message.setContent(emailMsg, "text/html;charset=utf-8");

		// 3.创建 Transport用于将邮件发�?
		Transport.send(message);
	}
}
