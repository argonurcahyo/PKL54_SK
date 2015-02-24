package pkl54.capi.subseksi.pkl54.Questionnaire;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v7.widget.Toolbar;

/**
 * Created by EKI on 17/02/2015.
 */
public interface QuetionnairePresenter {
    public void setToolbar(Toolbar toolbar, String title, int color);
    public void navigateFragment(Fragment fragment, String TAG, String title, int color);
    public void checkCurrentFragment(FragmentManager fragmentManager);
}
