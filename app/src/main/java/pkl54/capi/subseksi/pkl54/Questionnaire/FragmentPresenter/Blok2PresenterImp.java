package pkl54.capi.subseksi.pkl54.Questionnaire.FragmentPresenter;

import pkl54.capi.subseksi.pkl54.Questionnaire.FragmentView.Blok2Fragment;
import pkl54.capi.subseksi.pkl54.Questionnaire.FragmentInteractor.Blok2Interactor;
import pkl54.capi.subseksi.pkl54.Questionnaire.FragmentInteractor.Blok2InteractorImp;

/**
 * Created by EKI on 18/02/2015.
 */
public class Blok2PresenterImp implements Blok2Presenter, OnFinishValidateBlok2 {

    private Blok2Fragment blok2Fragment;
    private Blok2Interactor blok2Interactor;

    public Blok2PresenterImp(Blok2Fragment blok2Fragment) {
        this.blok2Fragment = blok2Fragment;
        blok2Interactor = new Blok2InteractorImp();
    }

    @Override
    public void validateB2R1(String data) {
        blok2Interactor.validateB2R1(data, this);
    }

    @Override
    public void validateB2R2(String data) {
        blok2Interactor.validateB2R2(data, this);
    }

    @Override
    public void validateAll() {
        blok2Interactor.validateAll(this);
    }

    @Override
    public void setVisibleCheckB2R1() {
        blok2Fragment.setVisibleCheckB2R1();
    }

    @Override
    public void setInvisibleCheckB2R1() {
        blok2Fragment.setInvisibleCheckB2R1();
    }

    @Override
    public void setVisibleCheckB2R2() {
        blok2Fragment.setVisibleCheckB2R2();
    }

    @Override
    public void setInvisibleCheckB2R2() {
        blok2Fragment.setInvisibleCheckB2R2();
    }

    @Override
    public void navigateFragment() {
        blok2Fragment.navigateFragment();
    }
}
