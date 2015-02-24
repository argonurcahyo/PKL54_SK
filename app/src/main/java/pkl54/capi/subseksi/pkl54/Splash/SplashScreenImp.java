package pkl54.capi.subseksi.pkl54.Splash;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import pkl54.capi.subseksi.pkl54.Login.LoginActivityImp;
import pkl54.capi.subseksi.pkl54.R;

public class SplashScreenImp extends ActionBarActivity implements SplashScreen, View.OnClickListener {

    private SplashPresenter splashPresenter;
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen_imp);

        splashPresenter = new SplashPresenterImp(this);
        splashPresenter.waitingFirstInterval();

        image = (ImageView) findViewById(R.id.img);
        image.setOnClickListener(this);
    }

    @Override
    public void changeImage() {
        image.setImageResource(R.mipmap.splash_screen_sk);
    }

    @Override
    public void navigateToLogin() {
        Intent i = new Intent(SplashScreenImp.this, LoginActivityImp.class);
        startActivity(i);
        finish();
    }

    @Override
    public void onClick(View v) {
        navigateToLogin();
    }
}
