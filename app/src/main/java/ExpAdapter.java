import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;

import java.security.acl.Group;
import java.util.ArrayList;

/**
 * Created by iveci on 2017-04-13.
 */

public class ExpAdapter extends BaseExpandableListAdapter {
    ArrayList<GroupData> groupdata;

    @Override
    public int getGroupCount() {
        return groupdata.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return groupdata.get(groupPosition).childlist.size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return groupdata.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return groupdata.get(groupPosition).childlist.get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        return null;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        return null;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }
}
