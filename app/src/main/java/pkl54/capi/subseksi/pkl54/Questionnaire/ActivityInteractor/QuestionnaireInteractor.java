package pkl54.capi.subseksi.pkl54.Questionnaire.ActivityInteractor;

import android.app.FragmentManager;

import pkl54.capi.subseksi.pkl54.Questionnaire.ActivityPresenter.OnFinishCheckCurrentFragmentQuest;

/**
 * Created by EKI on 17/02/2015.
 */
public interface QuestionnaireInteractor {
    public void checkCurrentFragment(FragmentManager fragmentManager, OnFinishCheckCurrentFragmentQuest onFinishCheckCurrentFragmentQuest);
}
