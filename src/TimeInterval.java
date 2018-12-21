public class TimeInterval
{
    private int start;
    private int end;

    public TimeInterval(int start, int end)
    {
        this.start = start;
        this.end = end;
    }

    public boolean overlapsWith(TimeInterval interval)
    {
        if((start > interval.start && start < interval.end) || end < interval.end && end > interval.start)
        {
            return true;
        }
        return false;
    }
}
