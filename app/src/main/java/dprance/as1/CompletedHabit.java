package dprance.as1;

/**
 * Created by Duncan on 10/1/2016.
 */
public class CompletedHabit extends Habit
{

    public CompletedHabit(String name) {
        super(name);
    }
    @Override
    public Boolean isCompleted()
    {
        return Boolean.TRUE;
    }
}
