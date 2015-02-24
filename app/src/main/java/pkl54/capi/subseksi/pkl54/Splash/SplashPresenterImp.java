package pkl54.capi.subseksi.pkl54.Splash;

/**
 * Created by EKI on 13/02/2015.
 */
public class SplashPresenterImp implements SplashPresenter, OnFinishInterval{

    SplashScreen splashScreen;
    SplashInteractor splashInteractor;

    public SplashPresenterImp(SplashScreen splashScreen) {
        this.splashScreen = splashScreen;
        this.splashInteractor = new SplashInteractorImp();
    }

    @Override
    public void waitingFirstInterval() {
        splashInteractor.waitingFirstInterval(this);
    }

    @Override
    public void changeImage() {
        splashScreen.changeImage();
    }

    @Override
    public void navigateToLogin() {
        splashScreen.navigateToLogin();
    }
}
