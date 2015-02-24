package pkl54.capi.subseksi.pkl54.Questionnaire.FragmentInteractor;

import pkl54.capi.subseksi.pkl54.Questionnaire.FragmentPresenter.OnFinishValidateBlok2;

/**
 * Created by EKI on 18/02/2015.
 */
public interface Blok2Interactor {
    public void validateB2R1(String data, OnFinishValidateBlok2 onFinishValidateBlok2);
    public void validateB2R2(String data, OnFinishValidateBlok2 onFinishValidateBlok2);
    public void validateAll(OnFinishValidateBlok2 onFinishValidateBlok2);
}
