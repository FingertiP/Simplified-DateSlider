package th.in.fingertip.dateslider;

public class TimeObject {
    public final CharSequence text;
    public final long startTime, endTime;
    public TimeObject(final CharSequence text, final long startTime, final long endTime) {
        this.text = text;
        this.startTime = startTime;
        this.endTime = endTime;
    }
}