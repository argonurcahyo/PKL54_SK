package pkl54.capi.subseksi.pkl54.Login;

/**
 * Created by EKI on 14/02/2015.
 */
public interface LoginActivity {
    public void showProgress();

    public void hideProgress();

    public void syncFailed(int statusCode);

    public void syncSuccess();

    public void loginFailed();

    public void loginSuccess();

    public void navigateToDashboard(String nim, String name, String nimKortim, String namaKortim);
}
