package com.rhine.studySSM.util;



import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author lwep
 * @dareTime 2019/7/2 10:18
 */
public class DataConverter implements Converter<String,Date> {
    @Override
    public Date convert(String source) {
        source=source.replace('T',' ');
        // 将日期串转换成日期格式（格式是yyyy-MM-dd HH:mm:ss）
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        try {
            //返回上述格式的Date类型对象
            return simpleDateFormat.parse(source);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }


}
