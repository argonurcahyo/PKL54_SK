package pkl54.capi.subseksi.pkl54.Splash;

import android.os.Handler;

/**
 * Created by EKI on 13/02/2015.
 */
public class SplashInteractorImp implements SplashInteractor{

    @Override
    public void waitingFirstInterval(final OnFinishInterval onFinishInterval) {
        final int SPLASH_TIME_OUT = 2500;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                onFinishInterval.changeImage();
            }
        }, SPLASH_TIME_OUT);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                onFinishInterval.navigateToLogin();
            }
        }, SPLASH_TIME_OUT);
    }
}
