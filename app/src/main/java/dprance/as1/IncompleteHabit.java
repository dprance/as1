package dprance.as1;

/**
 * Created by Duncan on 10/1/2016.
 */
public class IncompleteHabit extends Habit
{
    public IncompleteHabit(String name) {
        super(name);
    }
    @Override
    public Boolean isCompleted()
    {
        return Boolean.FALSE;
    }
    };
