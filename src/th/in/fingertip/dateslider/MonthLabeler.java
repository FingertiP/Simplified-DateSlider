package th.in.fingertip.dateslider;

import java.util.Calendar;

public class MonthLabeler extends Labeler {
    private final String mFormatString;

    public MonthLabeler(String formatString) {
        super(180, 60);
        mFormatString = formatString;
    }

    @Override
    public TimeObject add(long time, int val) {
        return timeObjectfromCalendar(DateSliderUtil.addMonths(time, val));
    }

    @Override
    protected TimeObject timeObjectfromCalendar(Calendar c) {
        return DateSliderUtil.getMonth(c, mFormatString);
    }
}