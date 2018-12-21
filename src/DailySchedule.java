import java.util.ArrayList;

public class DailySchedule
{
    private ArrayList apptList;

    public DailySchedule()
    {
        apptList = new ArrayList();
    }

    public void clearConflicts(Appointment appt)
    {
        for(int i = 0; i < apptList.size(); i++)
        {
            if(apptList.get(i).conflictsWith(appt))
            {
                apptList.remove(i);
                i--;
            }
        }
    }

    public boolean addAppt(Appointment appt, boolean emergency)
    {
        if(emergency)
        {
            clearConflicts(appt);
            apptList.add(appt);
            return true;
        }
        else
        {
            for(int i = 0; i < apptList.size(); i++)
            {
                if(apptList.get(i).conflictsWith(appt))
                {
                    return false;
                }
            }
            apptList.add(appt);
            return true;
        }
    }
}
