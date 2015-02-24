package pkl54.capi.subseksi.pkl54.Questionnaire.FragmentPresenter;

import pkl54.capi.subseksi.pkl54.Questionnaire.FragmentInteractor.Blok1Interactor;
import pkl54.capi.subseksi.pkl54.Questionnaire.FragmentInteractor.Blok1InteractorImp;
import pkl54.capi.subseksi.pkl54.Questionnaire.FragmentView.Blok1Fragment;

/**
 * Created by EKI on 17/02/2015.
 */
public class Blok1PresenterImp implements Blok1Presenter, OnFinishValidateBlok1, OnFinishCheckSpinnerBlok1, OnDataSavedBlok1 {

    private Blok1Fragment blok1Fragment;
    private Blok1Interactor blok1Interactor;

    public Blok1PresenterImp(Blok1Fragment blok1Fragment) {
        this.blok1Fragment = blok1Fragment;
        blok1Interactor = new Blok1InteractorImp();
    }

    @Override
    public void validateB1R1(String data) {
        blok1Interactor.validateB1R1(data, this);
        blok1Interactor.setAdapterB1R2(data, this);
    }

    @Override
    public void validateB1R2(String data) {
        blok1Interactor.validateB1R2(data, this);
        blok1Interactor.setAdapterB1R3(data, this);
    }

    @Override
    public void validateB1R3(String data) {
        blok1Interactor.validateB1R3(data, this);
    }

    @Override
    public void validateB1R4(int data) {
        blok1Interactor.validateB1R4(data, this);
    }

    @Override
    public void validateB1R5(String data) {
        blok1Interactor.validateB1R5(data, this);
    }

    @Override
    public void validateB1R6(String data) {
        blok1Interactor.validateB1R6(data, this);
    }

    @Override
    public void validateB1R7(String data) {
        blok1Interactor.validateB1R7(data, this);
    }

    @Override
    public void validateB1R8(String data1) {
        blok1Interactor.validateB1R8(data1, this);
    }

    @Override
    public void validateB1R9(String data) {
        blok1Interactor.validateB1R9(data, this);
    }

    @Override
    public void validateB1R10(String data) {
        blok1Interactor.validateB1R10(data, this);
    }

    @Override
    public void validateAll() {
        blok1Interactor.validateAll(this);
    }

    @Override
    public void saveData(String nksb1, String nim, String name, String nimKortim, String namaKortim) {
        blok1Interactor.saveData(nksb1, nim, name, nimKortim, namaKortim, this);
    }

    @Override
    public void setVisibleCheckB1R1() {
        blok1Fragment.setVisibleCheckB1R1();
    }

    @Override
    public void setInvisibleCheckB1R1() {
        blok1Fragment.setInvisibleCheckB1R1();
    }

    @Override
    public void setVisibleCheckB1R2() {
        blok1Fragment.setVisibleCheckB1R2();
    }

    @Override
    public void setInvisibleCheckB1R2() {
        blok1Fragment.setInvisibleCheckB1R2();
    }

    @Override
    public void setVisibleCheckB1R3() {
        blok1Fragment.setVisibleCheckB1R3();
    }

    @Override
    public void setInvisibleCheckB1R3() {
        blok1Fragment.setInvisibleCheckB1R3();
    }

    @Override
    public void setVisibleCheckB1R4() {
        blok1Fragment.setVisibleCheckB1R4();
    }

    @Override
    public void setInvisibleCheckB1R4() {
        blok1Fragment.setInvisibleCheckB1R4();
    }

    @Override
    public void setVisibleCheckB1R5() {
        blok1Fragment.setVisibleCheckB1R5();
    }

    @Override
    public void setInvisibleCheckB1R5() {
        blok1Fragment.setInvisibleCheckB1R5();
    }

    @Override
    public void setVisibleCheckB1R6() {
        blok1Fragment.setVisibleCheckB1R6();
    }

    @Override
    public void setInvisibleCheckB1R6() {
        blok1Fragment.setInvisibleCheckB1R6();
    }

    @Override
    public void setVisibleCheckB1R7() {
        blok1Fragment.setVisibleCheckB1R7();
    }

    @Override
    public void setInvisibleCheckB1R7() {
        blok1Fragment.setInvisibleCheckB1R7();
    }

    @Override
    public void setVisibleCheckB1R8() {
        blok1Fragment.setVisibleCheckB1R8();
    }

    @Override
    public void setInvisibleCheckB1R8() {
        blok1Fragment.setInvisibleCheckB1R8();
    }

    @Override
    public void setVisibleCheckB1R9() {
        blok1Fragment.setVisibleCheckB1R9();
    }

    @Override
    public void setInvisibleCheckB1R9() {
        blok1Fragment.setInvisibleCheckB1R9();
    }

    @Override
    public void setVisibleCheckB1R10() {
        blok1Fragment.setVisibleCheckB1R10();
    }

    @Override
    public void setInvisibleCheckB1R10() {
        blok1Fragment.setInvisibleCheckB1R10();
    }

    @Override
    public void showNextDialog() {
        blok1Fragment.showNextDialog();
    }

    @Override
    public void finishSurvey() {
        blok1Fragment.finishSurvey();
    }

    @Override
    public void navigateFragment() {
        blok1Fragment.navigateFragment();
    }

    @Override
    public void setSpinnerB1R2(int adapter) {
        blok1Fragment.populateSpinnerB1R2(adapter);
    }

    @Override
    public void unpopulateB1R2() {
        blok1Fragment.unpopulateSpinnerB1R2();
    }

    @Override
    public void setSpinnerB1R3(int adapter) {
        blok1Fragment.populateSpinnerB1R3(adapter);
    }

    @Override
    public void unpopulateB1R3() {
        blok1Fragment.unpopulateSpinnerB1R3();
    }
}
