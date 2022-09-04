package pl.s23319.nbp.application;

import java.text.SimpleDateFormat;
import java.util.Date;

class ActualDate {
    static String getDate(){
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        return formatter.format(date);
    }
}
