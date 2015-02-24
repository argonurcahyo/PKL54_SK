package pkl54.capi.subseksi.pkl54.Questionnaire.ActivityInteractor;

import android.app.FragmentManager;

import pkl54.capi.subseksi.pkl54.Questionnaire.OnFinishCheckCurrentFragmentQuest;

/**
 * Created by EKI on 19/02/2015.
 */
public interface HouseholdInteractor {
    public void checkCurrentFragment(FragmentManager fragmentManager, OnFinishCheckCurrentFragmentQuest onFinishCheckCurrentFragmentQuest);
}
