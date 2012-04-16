package th.in.fingertip.dateslider;

import java.util.Calendar;

import android.content.Context;

public class DefaultDateSlider extends DateSlider {

	public DefaultDateSlider(Context context, OnDateSetListener l, Calendar calendar,
			Calendar minTime, Calendar maxTime) {
        super(context, R.layout.defaultdateslider, l, calendar, minTime, maxTime);
    }

    public DefaultDateSlider(Context context, OnDateSetListener l, Calendar calendar) {
        super(context, R.layout.defaultdateslider, l, calendar);
    }
}
