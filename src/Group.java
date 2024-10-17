import java.time.LocalDate;
import java.util.Arrays;

public class Group {
    long id;
    String groupName;
    LocalDate startDate;
    String mentor;
    Person [] people;

    public Group(){

    }

    public Group(long id,String groupName,LocalDate startDate,String mentor,Person[] people){
        this.id = id;
        this.groupName = groupName;
        this.startDate = startDate;
        this.mentor = mentor;
        this.people = people;
    }


    @Override
    public String toString() {
        return "\nGroup{" +
                "groupName='" + groupName + '\'' +
                ", startDate=" + startDate +
                ", mentor='" + mentor + '\'' +
                ", people=" + Arrays.toString(people) +
                '}';
    }
}
