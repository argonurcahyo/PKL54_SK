package pkl54.capi.subseksi.pkl54.Questionnaire.ActivityInteractor;

import android.app.FragmentManager;

import pkl54.capi.subseksi.pkl54.Questionnaire.ActivityPresenter.OnFinishCheckCurrentFragmentQuest;

/**
 * Created by EKI on 17/02/2015.
 */
public class QuestionnaireInteractorImp implements QuestionnaireInteractor {

    private final String BLOK_1_TAG = "BLOK_1";
    private final String BLOK_2_TAG = "BLOK_2";
    private final String BLOK_3_TAG = "BLOK_3";
    private final String BLOK_4A1_TAG = "BLOK_4A1";
    private final String BLOK_4A2_TAG = "BLOK_4A2";
    private final String BLOK_4A3_TAG = "BLOK_4A3";
    private final String BLOK_4B_TAG = "BLOK_4B";
    private final String BLOK_4C_TAG = "BLOK_4C";
    private final String BLOK_4D_TAG = "BLOK_4D";
    private final String BLOK_4E_TAG = "BLOK_4E";

    @Override
    public void checkCurrentFragment(FragmentManager fragmentManager, OnFinishCheckCurrentFragmentQuest onFinishCheckCurrentFragmentQuest) {
        if (fragmentManager.findFragmentByTag(BLOK_1_TAG).isVisible()) {
            onFinishCheckCurrentFragmentQuest.setCurrentFragment(BLOK_1_TAG);
        } else if (fragmentManager.findFragmentByTag(BLOK_3_TAG).isVisible()) {
            onFinishCheckCurrentFragmentQuest.setCurrentFragment(BLOK_3_TAG);
        }else if (fragmentManager.findFragmentByTag(BLOK_4A1_TAG).isVisible()) {
            onFinishCheckCurrentFragmentQuest.setCurrentFragment(BLOK_4A1_TAG);
        }else if (fragmentManager.findFragmentByTag(BLOK_4A2_TAG).isVisible()) {
            onFinishCheckCurrentFragmentQuest.setCurrentFragment(BLOK_4A2_TAG);
        }else if (fragmentManager.findFragmentByTag(BLOK_4A3_TAG).isVisible()) {
            onFinishCheckCurrentFragmentQuest.setCurrentFragment(BLOK_4A3_TAG);
        }else if (fragmentManager.findFragmentByTag(BLOK_4B_TAG).isVisible()) {
            onFinishCheckCurrentFragmentQuest.setCurrentFragment(BLOK_4B_TAG);
        }else if (fragmentManager.findFragmentByTag(BLOK_4C_TAG).isVisible()) {
            onFinishCheckCurrentFragmentQuest.setCurrentFragment(BLOK_4C_TAG);
        }else if (fragmentManager.findFragmentByTag(BLOK_4D_TAG).isVisible()) {
            onFinishCheckCurrentFragmentQuest.setCurrentFragment(BLOK_4D_TAG);
        }else if (fragmentManager.findFragmentByTag(BLOK_4E_TAG).isVisible()) {
            onFinishCheckCurrentFragmentQuest.setCurrentFragment(BLOK_4E_TAG);
        }
    }
}
