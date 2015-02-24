package pkl54.capi.subseksi.pkl54.Dashboard;

import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by EKI on 17/02/2015.
 */
public class DashboardPresenterImp implements DashboardPresenter, OnFinishPopulate{

    private DashboardActivity dashboardActivity;
    private DashboardInteractor dashboardInteractor;

    public DashboardPresenterImp(DashboardActivity dashboardActivity) {
        this.dashboardActivity = dashboardActivity;
        dashboardInteractor = new DashboardInteractorImp();
    }

    @Override
    public void navigateToHome() {
        dashboardActivity.navigateToHome();
    }

    @Override
    public void setToolbar(Toolbar toolbar) {
        dashboardActivity.setToolbar(toolbar);
    }

    @Override
    public void navigateToQuest() {
        dashboardActivity.navigateToQuest();
    }

    @Override
    public void populateListView() {
        dashboardInteractor.populateListView(this);
    }

    @Override
    public void setData(ArrayList<String> adapter) {
        dashboardActivity.populateListView(adapter);
    }
}
