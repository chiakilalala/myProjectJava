package Parking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Tester {

    public static void main(String[] args) { //currentTimeMillis 目前時間毫秒職
        LocalDateTime enter =
        //進場時間
        LocalDateTime.of(2020,12,25,12,0,0);

        LocalDateTime leave =
                //進場時間
                LocalDateTime.of(2020,12,25,14,0,0);
        Car car = new Car("AA-0001",enter.atZone(ZoneId.systemDefault()).toEpochSecond();
car.setLeave(System.currentTimeMillis()+1000*60*60*2);//離場時間

        //java8
        Instant instant = Instant.now() ;
        System.out.println(instant);

        //local 處理日期 🏠時間
        LocalDateTime now =LocalDateTime.now();
        System.out.println(now);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(formatter.format(now));
        System.out.println(now.plus(Duration.ofHours(3)));
        LocalDateTime other = LocalDateTime.of(2021,1,14,8,12,0
        );
        System.out.println(other);
        //      java();
    }

    private static void java() {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(sdf.format(date));

        String s = "2018/11/25 08:00:00";
        Date other = null;
        try {
            other =sdf.parse(s);//
            System.out.println(other);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar calendar = Calendar.getInstance();//t傳出目前的時間資料
        System.out.println(calendar.getTime());
        calendar.set(Calendar.MONTH,9);//可以設定時間資訊 9月印出來會變成10月 印為1月份是零
        System.out.println(calendar.getTime());
        calendar.add(Calendar.DAY_OF_YEAR,3);//增加三天
        System.out.println(calendar.getTime());
    }
}
