package rinha.rinha;

import lombok.experimental.UtilityClass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

@UtilityClass
public class DateUtil {

    public static Date parseDate(String text) {
        return parse(text, configureDateFormat("yyyy-MM-dd"));
    }

    public static Date parse(String data, SimpleDateFormat simpleDateFormat) {
        try {
            return simpleDateFormat.parse(data);
        } catch (ParseException e) {
            return null;
        }
    }

    public static SimpleDateFormat configureDateFormat(String pattern) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        dateFormat.setTimeZone(SimpleTimeZone.getTimeZone("GMT-3"));
        dateFormat.setLenient(false);
        return dateFormat;
    }

}
