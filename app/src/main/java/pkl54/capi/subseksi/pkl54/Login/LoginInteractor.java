package pkl54.capi.subseksi.pkl54.Login;

/**
 * Created by EKI on 14/02/2015.
 */
public interface LoginInteractor {
    public void syncDB(final OnSynced onSynced);

    public void login(String nim, String password, final OnLogin onLogin);
}
