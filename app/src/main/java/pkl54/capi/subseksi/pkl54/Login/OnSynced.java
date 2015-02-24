package pkl54.capi.subseksi.pkl54.Login;

/**
 * Created by EKI on 14/02/2015.
 */
public interface OnSynced {
    public void onSyncedStarted();

    public void onSyncedFinished();

    public void syncErrorMessage(int statusCode);

    public void syncSuccessMessage();
}
