import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by iveci on 2017-04-13.
 */

public class GroupData {
    String groupname;
    ArrayList<String> childlist;

    public GroupData(String groupname, ArrayList<String> childlist) {
        this.groupname = groupname;
        this.childlist = new ArrayList<>();
    }
}
