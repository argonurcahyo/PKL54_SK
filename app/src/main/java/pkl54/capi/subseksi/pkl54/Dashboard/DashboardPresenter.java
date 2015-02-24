package pkl54.capi.subseksi.pkl54.Dashboard;

import android.support.v7.widget.Toolbar;

/**
 * Created by EKI on 17/02/2015.
 */
public interface DashboardPresenter {
    public void navigateToHome();

    public void setToolbar(Toolbar toolbar);

    public void navigateToQuest();

    public void populateListView();
}
