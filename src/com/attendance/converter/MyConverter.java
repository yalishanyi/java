package com.attendance.converter;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.beanutils.Converter;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

public class MyConverter implements Converter {

	@Override
	public Object convert(Class clazz, Object value) {
		//class要转换的类型 object页面传入的值
//		将object转成date
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
			try {
				Date date=sdf.parse((String)value);
				return date;
			} catch (java.text.ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		return null;
	}

}
