package com.mytest.util;


import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 自定义转换 前后台时间格式问题
 */
public class StringDateFormatConverter implements Converter<String, Date> {
    //由外部提供转换格式（易于配置）
    private SimpleDateFormat[] formats;

    public StringDateFormatConverter(SimpleDateFormat[] formats) {
        this.formats = formats;
    }

    @Override
    public Date convert(String dateStr) {
        for (SimpleDateFormat format : formats) {
            try {
                return format.parse(dateStr);
            } catch (ParseException e) {
            }
        }
        return null;
    }


}