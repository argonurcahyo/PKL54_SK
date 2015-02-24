package pkl54.capi.subseksi.pkl54.Questionnaire;

import android.app.FragmentManager;

/**
 * Created by EKI on 17/02/2015.
 */
public class QuestionnaireInteractorImp implements QuestionnaireInteractor {

    private final String BLOK_1_TAG = "BLOK_1";
    private final String BLOK_2_TAG = "BLOK_2";

    @Override
    public void checkCurrentFragment(FragmentManager fragmentManager, OnFinishCheckCurrentFragment onFinishCheckCurrentFragment) {
        if(fragmentManager.findFragmentByTag(BLOK_1_TAG).isVisible()){
            onFinishCheckCurrentFragment.setCurrentFragment(BLOK_1_TAG);
        }else if(fragmentManager.findFragmentByTag(BLOK_2_TAG).isVisible()){
            onFinishCheckCurrentFragment.setCurrentFragment(BLOK_2_TAG);
        }else{
            onFinishCheckCurrentFragment.setCurrentFragment(null);
        }
    }
}
