package th.in.fingertip.dateslider;

/**
 * This interface represents the views that will be placed in the ScrollLayout.
 * Each TimeView represents a visible element in the ScrollLayout, and is
 * displayed as a single point in time (e.g. January), but actually represents a
 * range of times (e.g. 1/1-1/31). The TimeView stores the range as well as
 * a string describing how to display itself.
 */
public interface TimeView {
    /**
     * Sets this TimeView to display the contents of the specified TimeObject.
     *
     * @param to The TimeObject to use to populate this TimeView
     */
    public void setVals(TimeObject to);
    /**
     * Instructs this TimeView to copy its values from the specified TimeView, so
     * it will assume the state of the other TimeView.
     *
     * @param other The TimeView to copy values from
     */
    public void setVals(TimeView other);

    /**
     * Get a string containing the textual representation of this TimeView's time
     * @return
     */
    public String getTimeText();
    /**
     * Get the start time of this TimeView
     * @return
     */
    public long getStartTime();
    /**
     * Get the end time of this TimeView
     * @return
     */
    public long getEndTime();

    public boolean isOutOfBounds();
    public void setOutOfBounds(boolean outOfBounds);
}
