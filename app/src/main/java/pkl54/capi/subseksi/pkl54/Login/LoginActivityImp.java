package pkl54.capi.subseksi.pkl54.Login;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import pkl54.capi.subseksi.pkl54.Dashboard.DashboardActivityImp;
import pkl54.capi.subseksi.pkl54.R;

public class LoginActivityImp extends ActionBarActivity implements LoginActivity, View.OnClickListener {

    private EditText nimField;
    private EditText passField;
    private Button loginButton, exitButton;
    private ProgressDialog progressDialog;

    private LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        nimField = (EditText) findViewById(R.id.nimfield);
        passField = (EditText) findViewById(R.id.passfield);
        loginButton = (Button) findViewById(R.id.login_button);
        loginButton.setOnClickListener(this);
        exitButton = (Button) findViewById(R.id.exit_button);
        exitButton.setOnClickListener(this);

        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Transferring data from server");
        progressDialog.setCancelable(false);

        loginPresenter = new LoginPresenterImp(this);
        loginPresenter.syncDB();
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.login_button) {
            loginPresenter.login(nimField.getText().toString(), passField.getText().toString());
        } else if (v.getId() == R.id.exit_button) {
            quitApp();
        }
    }

    public void quitApp() {
        finish();
    }

    @Override
    public void showProgress() {
        progressDialog.show();
    }

    @Override
    public void hideProgress() {
        progressDialog.dismiss();
    }

    @Override
    public void syncFailed(int statusCode) {
        String message = statusCode + " : Sync failed!";
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void syncSuccess() {
        Toast.makeText(this, "Sync success!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginFailed() {
        Toast.makeText(this, "Failed!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginSuccess() {
        Toast.makeText(this, "Success!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void navigateToDashboard(String nim, String name, String nimKortim, String namaKortim) {
        Intent i = new Intent(LoginActivityImp.this, DashboardActivityImp.class);
        i.putExtra("nim", nim);
        i.putExtra("name", name);
        i.putExtra("nimKortim", nimKortim);
        i.putExtra("namaKortim", namaKortim);
        startActivity(i);
        finish();
    }

}
