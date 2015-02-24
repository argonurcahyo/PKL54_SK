package pkl54.capi.subseksi.pkl54.Questionnaire.ActivityPresenter;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v7.widget.Toolbar;

import pkl54.capi.subseksi.pkl54.Questionnaire.ActivityView.QuestionnaireActivity;
import pkl54.capi.subseksi.pkl54.Questionnaire.ActivityInteractor.QuestionnaireInteractor;
import pkl54.capi.subseksi.pkl54.Questionnaire.ActivityInteractor.QuestionnaireInteractorImp;

/**
 * Created by EKI on 17/02/2015.
 */
public class QuestionnairePresenterImp implements QuetionnairePresenter, OnFinishCheckCurrentFragmentQuest {

    private QuestionnaireActivity questionnaireActivity;
    private QuestionnaireInteractor questionnaireInteractor;

    public QuestionnairePresenterImp(QuestionnaireActivity questionnaireActivity) {
        this.questionnaireActivity = questionnaireActivity;
        this.questionnaireInteractor = new QuestionnaireInteractorImp();
    }

    @Override
    public void setToolbar(Toolbar toolbar, String title, int color) {
        questionnaireActivity.setToolbar(toolbar, title, color);
    }

    @Override
    public void navigateFragment(Fragment fragment, String TAG, String title, int color) {
        questionnaireActivity.navigateFragment(fragment, TAG, title, color);
    }

    @Override
    public void checkCurrentFragment(FragmentManager fragmentManager) {
        questionnaireInteractor.checkCurrentFragment(fragmentManager, this);
    }

    @Override
    public void setCurrentFragment(String TAG) {
        questionnaireActivity.setCurrentTag(TAG);
    }
}
