package pkl54.capi.subseksi.pkl54.Questionnaire.FragmentInteractor;

import pkl54.capi.subseksi.pkl54.Questionnaire.FragmentPresenter.OnFinishValidateBlok2;

/**
 * Created by EKI on 18/02/2015.
 */
public class Blok2InteractorImp implements Blok2Interactor {

    private boolean[] valid = new boolean[2];

    @Override
    public void validateB2R1(String data, OnFinishValidateBlok2 onFinishValidateBlok2) {
        if (data.length() > 0) {
            onFinishValidateBlok2.setVisibleCheckB2R1();
            valid[0] = true;
        } else {
            onFinishValidateBlok2.setInvisibleCheckB2R1();
            valid[0] = false;
        }
    }

    @Override
    public void validateB2R2(String data, OnFinishValidateBlok2 onFinishValidateBlok2) {
        if (data.length() > 0) {
            onFinishValidateBlok2.setVisibleCheckB2R2();
            valid[1] = true;
        } else {
            onFinishValidateBlok2.setInvisibleCheckB2R2();
            valid[1] = false;
        }
    }

    @Override
    public void validateAll(OnFinishValidateBlok2 onFinishValidateBlok2) {
        if (valid[0] && valid[1]) {
            onFinishValidateBlok2.navigateFragment();
        }
    }
}
