package com.itheima.covertor;

import org.springframework.core.convert.converter.Converter;

public class TrimConvertor implements Converter<String, String> {

	@Override
	public String convert(String resource) {
		String trim = resource.trim();
		if (null != resource.trim() && (!trim.equals(""))) {
			return trim;
		}
		return null;
	}

}
