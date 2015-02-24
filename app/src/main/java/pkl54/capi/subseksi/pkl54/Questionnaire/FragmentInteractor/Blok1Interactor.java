package pkl54.capi.subseksi.pkl54.Questionnaire.FragmentInteractor;

import pkl54.capi.subseksi.pkl54.Questionnaire.FragmentPresenter.OnDataSavedBlok1;
import pkl54.capi.subseksi.pkl54.Questionnaire.FragmentPresenter.OnFinishCheckSpinnerBlok1;
import pkl54.capi.subseksi.pkl54.Questionnaire.FragmentPresenter.OnFinishValidateBlok1;

/**
 * Created by EKI on 17/02/2015.
 */
public interface Blok1Interactor {
    public void validateB1R1(String data, OnFinishValidateBlok1 onFinishValidateBlok1);

    public void setAdapterB1R2(String data, OnFinishCheckSpinnerBlok1 onFinishCheckSpinnerBlok1);

    public void validateB1R2(String data, OnFinishValidateBlok1 onFinishValidateBlok1);

    public void setAdapterB1R3(String data, OnFinishCheckSpinnerBlok1 onFinishCheckSpinnerBlok1);

    public void validateB1R3(String data, OnFinishValidateBlok1 onFinishValidateBlok1);

    public void validateB1R4(int data, OnFinishValidateBlok1 onFinishValidateBlok1);

    public void validateB1R5(String data, OnFinishValidateBlok1 onFinishValidateBlok1);

    public void validateB1R6(String data, OnFinishValidateBlok1 onFinishValidateBlok1);

    public void validateB1R7(String data, OnFinishValidateBlok1 onFinishValidateBlok1);

    public void validateB1R8(String data, OnFinishValidateBlok1 onFinishValidateBlok1);

    public void validateB1R9(String data, OnFinishValidateBlok1 onFinishValidateBlok1);

    public void validateB1R10(String data, OnFinishValidateBlok1 onFinishValidateBlok1);

    public void validateAll(OnFinishValidateBlok1 onFinishValidateBlok1);

    public void saveData(String nksb1, String nim, String name, String nimKortim, String namaKortim, OnDataSavedBlok1 onDataSavedBlok1);
}
