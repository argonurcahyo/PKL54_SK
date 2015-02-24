package pkl54.capi.subseksi.pkl54.Dashboard;

import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

/**
 * Created by EKI on 17/02/2015.
 */
public interface DashboardActivity {
    public void setToolbar(Toolbar toolbar);

    public void navigateToHome();

    public void navigateToQuest();

    public void populateListView(ArrayList<String>list);
}
