package com.jui.ideaslibrary.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import androidx.room.TypeConverter;


public class TimestampConverter {

        static DateFormat df = new SimpleDateFormat(Constants.TIME_STAMP_FORMAT);
        @TypeConverter
        public static Date fromTimestamp(String value) {
            if (value != null) {
                try {
                    return df.parse(value);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                return null;
            } else {
                return null;
            }
        }
}
