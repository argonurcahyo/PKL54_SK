package pkl54.capi.subseksi.pkl54.Questionnaire.FragmentPresenter;

import pkl54.capi.subseksi.pkl54.Questionnaire.FragmentInteractor.Blok4A1Interactor;
import pkl54.capi.subseksi.pkl54.Questionnaire.FragmentInteractor.Blok4A1InteractorImp;
import pkl54.capi.subseksi.pkl54.Questionnaire.FragmentView.Blok4A1Fragment;

/**
 * Created by EKI on 20/02/2015.
 */
public class Blok4A1PresenterImp implements Blok4A1Presenter, OnFinishValidateBlok4A1 {

    private Blok4A1Fragment blok4A1Fragment;
    private Blok4A1Interactor blok4A1Interactor;

    public Blok4A1PresenterImp(Blok4A1Fragment blok4A1Fragment) {
        this.blok4A1Fragment = blok4A1Fragment;
        blok4A1Interactor = new Blok4A1InteractorImp();
    }

    @Override
    public void validateB4R1(String data) {
        blok4A1Interactor.validateB4R1(data, this);
    }

    @Override
    public void validateB4R2(String data) {

    }

    @Override
    public void validateB4R3(String data) {

    }

    @Override
    public void validateB4R4(String data) {

    }

    @Override
    public void validateB4R5(String data) {

    }

    @Override
    public void validateB4R6(String data) {

    }

    @Override
    public void validateB4R7(String data) {

    }

    @Override
    public void validateB4R8(String data) {

    }

    @Override
    public void validateB4R9(String data) {

    }

    @Override
    public void validateB4R10(String data) {

    }

    @Override
    public void validateB4R11(String data) {

    }

    @Override
    public void validateB4R12(String data) {

    }

    @Override
    public void validateB4R13(String data) {

    }

    @Override
    public void validateB4R14(String data) {

    }

    @Override
    public void setVisibleCheckB4R1() {

    }

    @Override
    public void setVisibleCheckB4R2() {

    }

    @Override
    public void setVisibleCheckB4R3() {

    }

    @Override
    public void setVisibleCheckB4R4() {

    }

    @Override
    public void setVisibleCheckB4R5() {

    }

    @Override
    public void setVisibleCheckB4R6() {

    }

    @Override
    public void setVisibleCheckB4R7() {

    }

    @Override
    public void setVisibleCheckB4R8() {

    }

    @Override
    public void setVisibleCheckB4R9() {

    }

    @Override
    public void setVisibleCheckB4R10() {

    }

    @Override
    public void setVisibleCheckB4R11() {

    }

    @Override
    public void setVisibleCheckB4R12() {

    }

    @Override
    public void setVisibleCheckB4R13() {

    }

    @Override
    public void setVisibleCheckB4R14() {

    }

    @Override
    public void setInvisibleCheckB4R1() {

    }

    @Override
    public void setInvisibleCheckB4R2() {

    }

    @Override
    public void setInvisibleCheckB4R3() {

    }

    @Override
    public void setInvisibleCheckB4R4() {

    }

    @Override
    public void setInvisibleCheckB4R5() {

    }

    @Override
    public void setInvisibleCheckB4R6() {

    }

    @Override
    public void setInvisibleCheckB4R7() {

    }

    @Override
    public void setInvisibleCheckB4R8() {

    }

    @Override
    public void setInvisibleCheckB4R9() {

    }

    @Override
    public void setInvisibleCheckB4R10() {

    }

    @Override
    public void setInvisibleCheckB4R11() {

    }

    @Override
    public void setInvisibleCheckB4R12() {

    }

    @Override
    public void setInvisibleCheckB4R13() {

    }

    @Override
    public void setInvisibleCheckB4R14() {

    }

    @Override
    public void setTextR1(String score) {

    }

    @Override
    public void setTextR2(String score) {

    }

    @Override
    public void setTextR3(String score) {

    }

    @Override
    public void setTextR4(String score) {

    }

    @Override
    public void setTextR5(String score) {

    }

    @Override
    public void setTextR6(String score) {

    }

    @Override
    public void setTextR7(String score) {

    }

    @Override
    public void setTextR8(String score) {

    }

    @Override
    public void setTextR9(String score) {

    }

    @Override
    public void setTextR10(String score) {

    }

    @Override
    public void setTextR11(String score) {

    }

    @Override
    public void setTextR12(String score) {

    }

    @Override
    public void setTextR13(String score) {

    }

    @Override
    public void setTextR14(String score) {

    }

    @Override
    public void clearTextR1() {

    }

    @Override
    public void clearTextR2() {

    }

    @Override
    public void clearTextR3() {

    }

    @Override
    public void clearTextR4() {

    }

    @Override
    public void clearTextR5() {

    }

    @Override
    public void clearTextR6() {

    }

    @Override
    public void clearTextR7() {

    }

    @Override
    public void clearTextR8() {

    }

    @Override
    public void clearTextR9() {

    }

    @Override
    public void clearTextR10() {

    }

    @Override
    public void clearTextR11() {

    }

    @Override
    public void clearTextR12() {

    }

    @Override
    public void clearTextR13() {

    }

    @Override
    public void clearTextR14() {

    }
}
