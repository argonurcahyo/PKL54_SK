package pkl54.capi.subseksi.pkl54.Questionnaire.ActivityPresenter;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v7.widget.Toolbar;

import pkl54.capi.subseksi.pkl54.Questionnaire.ActivityInteractor.HouseholdInteractor;
import pkl54.capi.subseksi.pkl54.Questionnaire.ActivityInteractor.HouseholdInteractorImp;
import pkl54.capi.subseksi.pkl54.Questionnaire.HouseholdQuestionnaire;
import pkl54.capi.subseksi.pkl54.Questionnaire.OnFinishCheckCurrentFragmentHouse;

/**
 * Created by EKI on 19/02/2015.
 */
public class HouseholdPresenterImp implements HouseholdPresenter, OnFinishCheckCurrentFragmentHouse {

    private HouseholdQuestionnaire householdQuestionnaire;
    private HouseholdInteractor householdInteractor;

    public HouseholdPresenterImp(HouseholdQuestionnaire householdQuestionnaire){
        this.householdQuestionnaire = householdQuestionnaire;
        householdInteractor = new HouseholdInteractorImp();
    }

    @Override
    public void setToolbar(Toolbar toolbar, String title, int color) {
        householdQuestionnaire.setToolbar(toolbar, title, color);
    }

    @Override
    public void navigateFragment(Fragment fragment, String TAG, String title, int color) {
        householdQuestionnaire.navigateFragment(fragment, TAG, title, color);
    }

    @Override
    public void checkCurrentFragment(FragmentManager fragmentManager) {
    }

    @Override
    public void setCurrentFragment(String TAG) {
        householdQuestionnaire.setCurrentTag(TAG);
    }
}
