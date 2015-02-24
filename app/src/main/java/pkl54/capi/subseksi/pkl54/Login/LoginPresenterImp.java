package pkl54.capi.subseksi.pkl54.Login;

/**
 * Created by EKI on 14/02/2015.
 */
public class LoginPresenterImp implements LoginPresenter, OnSynced, OnLogin {

    private LoginActivity loginActivity;
    private LoginInteractor loginInteractor;

    public LoginPresenterImp(LoginActivity loginActivity) {
        this.loginActivity = loginActivity;
        this.loginInteractor = new LoginInteractorImp();
    }

    @Override
    public void syncDB() {
        loginInteractor.syncDB(this);
    }

    @Override
    public void login(String nim, String password) {
        loginInteractor.login(nim, password, this);
    }

    @Override
    public void onSyncedStarted() {
        loginActivity.showProgress();
    }

    @Override
    public void onSyncedFinished() {
        loginActivity.hideProgress();
    }

    @Override
    public void syncErrorMessage(int statusCode) {
        loginActivity.syncFailed(statusCode);
    }

    @Override
    public void syncSuccessMessage() {
        loginActivity.syncSuccess();
    }

    @Override
    public void onLoginSuccess(String nim, String name, String nimKortim, String namaKortim) {
        loginActivity.loginSuccess();
        loginActivity.navigateToDashboard(nim, name, nimKortim, namaKortim);
    }

    @Override
    public void onLoginFailed() {
        loginActivity.loginFailed();
    }
}
