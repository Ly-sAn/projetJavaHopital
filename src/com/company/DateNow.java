package com.company;

import java.text.DateFormat;
import java.util.Date;

class DateNow {

    public String dateNow() {
        Date aujourdhui = new Date();

        DateFormat longDateFormat = DateFormat.getDateTimeInstance(
                DateFormat.LONG,
                DateFormat.LONG);
        return longDateFormat.format(aujourdhui);
    }
}