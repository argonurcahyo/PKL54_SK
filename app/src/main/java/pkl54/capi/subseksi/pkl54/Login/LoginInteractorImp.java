package pkl54.capi.subseksi.pkl54.Login;


import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import pkl54.capi.subseksi.pkl54.Questionnaire.DBModel.Kabupaten;
import pkl54.capi.subseksi.pkl54.Questionnaire.DBModel.Kecamatan;
import pkl54.capi.subseksi.pkl54.Questionnaire.DBModel.Kelurahan;

/**
 * Created by EKI on 14/02/2015.
 */
public class LoginInteractorImp implements LoginInteractor {

    private HashMap<String, String> queryValues;

    @Override
    public void syncDB(final OnSynced onSynced) {
        onSynced.onSyncedStarted();
        AsyncHttpClient client = new AsyncHttpClient();
        RequestParams params = new RequestParams();
        client.post("http://their.hol.es/PKL54/get_user.php", params, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(String response) {
                updateUser(response);
            }

            @Override
            public void onFailure(int statusCode, Throwable error, String content) {

            }
        });
        client.post("http://their.hol.es/PKL54/get_kortim.php", params, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(String response) {
                updateKortim(response);
            }

            @Override
            public void onFailure(int statusCode, Throwable error, String content) {

            }
        });
        client.post("http://their.hol.es/PKL54/get_kabupaten.php", params, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(String response) {
                updateKabupaten(response);
            }

            @Override
            public void onFailure(int statusCode, Throwable error, String content) {

            }
        });
        client.post("http://their.hol.es/PKL54/get_kecamatan.php", params, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(String response) {
                updateKecamatan(response);
            }

            @Override
            public void onFailure(int statusCode, Throwable error, String content) {

            }
        });
        client.post("http://their.hol.es/PKL54/get_kelurahan.php", params, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(String response) {
                onSynced.onSyncedFinished();
                onSynced.syncSuccessMessage();
                updateKelurahan(response);
            }

            @Override
            public void onFailure(int statusCode, Throwable error, String content) {
                onSynced.onSyncedFinished();
                onSynced.syncErrorMessage(statusCode);
            }
        });
    }

    private void updateUser(String response) {
        try {
            JSONArray arr = new JSONArray(response);
            if (arr.length() != 0) {
                for (int i = 0; i < arr.length(); i++) {
                    JSONObject obj = (JSONObject) arr.get(i);
                    queryValues = new HashMap<String, String>();
                    queryValues.put("nim", obj.get("nim").toString());
                    queryValues.put("password", obj.get("password").toString());
                    queryValues.put("name", obj.get("name").toString());
                    queryValues.put("nimKortim", obj.get("nimKortim").toString());
                    insertUser(queryValues);
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private void updateKortim(String response) {
        try {
            JSONArray arr = new JSONArray(response);
            if (arr.length() != 0) {
                for (int i = 0; i < arr.length(); i++) {
                    JSONObject obj = (JSONObject) arr.get(i);
                    queryValues = new HashMap<String, String>();
                    queryValues.put("nimKortim", obj.get("nimKortim").toString());
                    queryValues.put("namaKortim", obj.get("namaKortim").toString());
                    insertKortim(queryValues);
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private void updateKabupaten(String response) {
        try {
            JSONArray arr = new JSONArray(response);
            if (arr.length() != 0) {
                for (int i = 0; i < arr.length(); i++) {
                    JSONObject obj = (JSONObject) arr.get(i);
                    queryValues = new HashMap<String, String>();
                    queryValues.put("kodeKabupaten", obj.get("kodeKabupaten").toString());
                    queryValues.put("kabupaten", obj.get("kabupaten").toString());
                    insertKabupaten(queryValues);
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private void updateKecamatan(String response) {
        try {
            JSONArray arr = new JSONArray(response);
            if (arr.length() != 0) {
                for (int i = 0; i < arr.length(); i++) {
                    JSONObject obj = (JSONObject) arr.get(i);
                    queryValues = new HashMap<String, String>();
                    queryValues.put("kodeKecamatan", obj.get("kodeKecamatan").toString());
                    queryValues.put("kecamatan", obj.get("kecamatan").toString());
                    queryValues.put("kodeKabupaten", obj.get("kodeKabupaten").toString());
                    insertKecamatan(queryValues);
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void updateKelurahan(String response) {
        try {
            JSONArray arr = new JSONArray(response);
            if (arr.length() != 0) {
                for (int i = 0; i < arr.length(); i++) {
                    JSONObject obj = (JSONObject) arr.get(i);
                    queryValues = new HashMap<String, String>();
                    queryValues.put("kodeKelurahan", obj.get("kodeKelurahan").toString());
                    queryValues.put("kelurahan", obj.get("kelurahan").toString());
                    queryValues.put("kodeKecamatan", obj.get("kodeKecamatan").toString());
                    queryValues.put("kodeKabupaten", obj.get("kodeKabupaten").toString());
                    insertKelurahan(queryValues);
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void insertUser(HashMap<String, String> queryValues) {
        String nim = queryValues.get("nim");
        String password = queryValues.get("password");
        String name = queryValues.get("name");
        String nimKortim = queryValues.get("nimKortim");
        User user = new User(nim, password, name, nimKortim);
        user.save();
    }

    public void insertKortim(HashMap<String, String> queryValues) {
        String nimKortim = queryValues.get("nimKortim");
        String namaKortim = queryValues.get("namaKortim");
        Kortim kortim = new Kortim(nimKortim, namaKortim);
        kortim.save();
    }

    public void insertKabupaten(HashMap<String, String> queryValues) {
        String kodeKabupaten = queryValues.get("kodeKabupaten");
        String kabupaten = queryValues.get("kabupaten");
        Kabupaten kabupatenDB = new Kabupaten(kodeKabupaten, kabupaten);
        kabupatenDB.save();
    }

    public void insertKecamatan(HashMap<String, String> queryValues) {
        String kodeKecamatan = queryValues.get("kodeKecamatan");
        String kecamatan = queryValues.get("kecamatan");
        String kodeKabupaten = queryValues.get("kodeKabupaten");
        Kecamatan kecamatanDB = new Kecamatan(kecamatan, kodeKecamatan, kodeKabupaten);
        kecamatanDB.save();
    }

    public void insertKelurahan(HashMap<String, String> queryValues) {
        String kodeKelurahan = queryValues.get("kodeKelurahan");
        String kelurahan = queryValues.get("kelurahan");
        String kodeKecamatan = queryValues.get("kodeKecamatan");
        String kodeKabupaten = queryValues.get("kodeKabupaten");
        Kelurahan kelurahanDB = new Kelurahan(kelurahan, kodeKelurahan, kodeKecamatan, kodeKabupaten);
        kelurahanDB.save();
    }

    @Override
    public void login(String nim, String password, final OnLogin onLogin) {
        List<User> userSelected = new ArrayList<User>();
        User user = new User();
        userSelected = user.login(nim, password);
        if (userSelected.size() == 1) {
            String nimUser = userSelected.get(0).nim;
            String namaUser = userSelected.get(0).name;
            String nimKortim = userSelected.get(0).nimKortim;
            List<Kortim> kortimSelected = new ArrayList<Kortim>();
            Kortim kortim = new Kortim();
            kortimSelected = kortim.getKortim(nimKortim);
            if(kortimSelected.size() == 1){
                String namaKortim = kortimSelected.get(0).namaKortim;
                onLogin.onLoginSuccess(nimUser, namaUser, nimKortim, namaKortim);
            }
        } else {
            onLogin.onLoginFailed();
        }
    }
}
