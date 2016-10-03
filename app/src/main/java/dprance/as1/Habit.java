package dprance.as1;

        import java.util.Date;

/**
 * Created by Duncan on 10/1/2016.
 */
public abstract class Habit {
    private String Name;
    protected abstract Boolean isCompleted();
    private Date date;

    public Habit(String Name){
        this.Name = Name;
        this.date = new Date();
    }

    public Habit(String Name, Date date){
        this.Name = Name;
        this.date = date;
    }

    public void setName(String name){
        this.Name = name;
    }
    public String getName(){
        return Name;
    }
}
