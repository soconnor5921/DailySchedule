public class Appointment
{
    public TimeInterval getTime()
    {

    }

    public boolean conflictsWith(Appointment other)
    {
        return this.getTime().overlapsWith(other.getTime());
    }

}
