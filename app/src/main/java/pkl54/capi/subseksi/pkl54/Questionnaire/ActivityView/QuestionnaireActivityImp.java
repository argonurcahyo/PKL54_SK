package pkl54.capi.subseksi.pkl54.Questionnaire.ActivityView;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;

import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.model.SecondaryDrawerItem;
import com.mikepenz.materialdrawer.model.SectionDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;

import java.util.HashMap;

import pkl54.capi.subseksi.pkl54.Questionnaire.ActivityPresenter.QuestionnairePresenterImp;
import pkl54.capi.subseksi.pkl54.Questionnaire.ActivityPresenter.QuetionnairePresenter;
import pkl54.capi.subseksi.pkl54.Questionnaire.FragmentView.Blok4DFragment;
import pkl54.capi.subseksi.pkl54.Questionnaire.FragmentView.Blok4EFragment;
import pkl54.capi.subseksi.pkl54.Questionnaire.FragmentView.Blok1FragmentImp;
import pkl54.capi.subseksi.pkl54.Questionnaire.FragmentView.Blok2FragmentImp;
import pkl54.capi.subseksi.pkl54.Questionnaire.FragmentView.Blok3Fragment;
import pkl54.capi.subseksi.pkl54.Questionnaire.FragmentView.Blok4A1Fragment;
import pkl54.capi.subseksi.pkl54.Questionnaire.FragmentView.Blok4A2Fragment;
import pkl54.capi.subseksi.pkl54.Questionnaire.FragmentView.Blok4A3Fragment;
import pkl54.capi.subseksi.pkl54.Questionnaire.FragmentView.Blok4BFragment;
import pkl54.capi.subseksi.pkl54.Questionnaire.FragmentView.Blok4CFragment;
import pkl54.capi.subseksi.pkl54.R;

public class QuestionnaireActivityImp extends ActionBarActivity implements QuestionnaireActivity {

    private QuetionnairePresenter quetionnairePresenter;
    private Toolbar toolbar;
    private Blok1FragmentImp blok1FragmentImp;
    private Blok2FragmentImp blok2FragmentImp;
    private Blok3Fragment blok3Fragment;
    private Blok4A1Fragment blok4A1Fragment;
    private Blok4A2Fragment blok4A2Fragment;
    private Blok4A3Fragment blok4A3Fragment;
    private Blok4BFragment blok4BFragment;
    private Blok4CFragment blok4CFragment;
    private Blok4DFragment blok4DFragment;
    private Blok4EFragment blok4EFragment;

    private String currentTag;

    private final String BLOK_1_TAG = "BLOK_1";
    private final String BLOK_1_NAME = "PENGENALAN TEMPAT";
    private final String BLOK_2_TAG = "BLOK_2";
    private final String BLOK_2_NAME = "KETERANGAN PETUGAS";
    private final String BLOK_3_TAG = "BLOK_3";
    private final String BLOK_3_NAME = "KETERANGAN RESPONDEN";
    private final String BLOK_4A1_TAG = "BLOK_4A1";
    private final String BLOK_4A1_NAME = "KETERANGAN DIMENSI";
    private final String BLOK_4A2_TAG = "BLOK_4A2";
    private final String BLOK_4A2_NAME = "KETERANGAN DIMENSI";
    private final String BLOK_4A3_TAG = "BLOK_4A3";
    private final String BLOK_4A3_NAME = "KETERANGAN DIMENSI";
    private final String BLOK_4B_TAG = "BLOK_4B";
    private final String BLOK_4B_NAME = "KETERANGAN DIMENSI";
    private final String BLOK_4C_TAG = "BLOK_4C";
    private final String BLOK_4C_NAME = "KETERANGAN DIMENSI";
    private final String BLOK_4D_TAG = "BLOK_4D";
    private final String BLOK_4D_NAME = "KETERANGAN DIMENSI";
    private final String BLOK_4E_TAG = "BLOK_4E";
    private final String BLOK_4E_NAME = "KETERANGAN DIMENSI";

    private final int BLOK_1_COLOR = R.color.primaryColor;
    private final int BLOK_2_COLOR = R.color.primaryColorBlok2;
    private final int BLOK_3_COLOR = R.color.primaryColorBlok3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionnaire);

        quetionnairePresenter = new QuestionnairePresenterImp(this);

        toolbar = (Toolbar) findViewById(R.id.app_bar);

        blok1FragmentImp = new Blok1FragmentImp();
        blok2FragmentImp = new Blok2FragmentImp();
        blok3Fragment = new Blok3Fragment();
        blok4A1Fragment = new Blok4A1Fragment();
        blok4A2Fragment = new Blok4A2Fragment();
        blok4A3Fragment = new Blok4A3Fragment();
        blok4BFragment = new Blok4BFragment();
        blok4CFragment = new Blok4CFragment();
        blok4DFragment = new Blok4DFragment();
        blok4EFragment = new Blok4EFragment();

        new Drawer()
                .withActivity(this)
                .withToolbar(toolbar)
                .withActionBarDrawerToggle(true)
                .withHeader(R.layout.header)
                .addDrawerItems(
                        new SectionDrawerItem(),
                        new SecondaryDrawerItem().withName("Keluar")
                )
                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id, IDrawerItem drawerItem) {
                        if (position == 1) {

                        }
                    }
                })
                .build();

        initiateFragment();
    }

    @Override
    public void onBackPressed() {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        if(fragmentManager.getBackStackEntryCount() > 0){
            String title = checkBackStackFragmentName(fragmentManager);
            int color = checkBackStackFragmentColor(fragmentManager);
            fragmentManager.popBackStack();
            setToolbar(toolbar, title, color);
        }else{
            super.onBackPressed();
        }
    }

    private String checkBackStackFragmentName(FragmentManager fragmentManager){
        if(fragmentManager.getBackStackEntryAt(fragmentManager.getBackStackEntryCount()-1).getName() == BLOK_1_TAG){
            return BLOK_1_NAME;
        }else if(fragmentManager.getBackStackEntryAt(fragmentManager.getBackStackEntryCount()-1).getName() == BLOK_2_TAG){
            return BLOK_2_NAME;
        }else if(fragmentManager.getBackStackEntryAt(fragmentManager.getBackStackEntryCount()-1).getName() == BLOK_3_TAG){
            return BLOK_3_NAME;
        }else return null;
    }

    private int checkBackStackFragmentColor(FragmentManager fragmentManager){
        if(fragmentManager.getBackStackEntryAt(fragmentManager.getBackStackEntryCount()-1).getName() == BLOK_1_TAG){
            return BLOK_1_COLOR;
        }else if(fragmentManager.getBackStackEntryAt(fragmentManager.getBackStackEntryCount()-1).getName() == BLOK_2_TAG){
            return BLOK_2_COLOR;
        }else if(fragmentManager.getBackStackEntryAt(fragmentManager.getBackStackEntryCount()-1).getName() == BLOK_3_TAG){
            return BLOK_3_COLOR;
        }else return BLOK_1_COLOR;
    }

    @Override
    public void setCurrentTag(String currentTag) {
        this.currentTag = currentTag;
    }

    public void checkCurrentFragment() {
        quetionnairePresenter.checkCurrentFragment(getFragmentManager());
    }

    public void setToolbar(Toolbar toolbar, String title, int color) {
        toolbar.setTitle(title);
        toolbar.setBackgroundColor(getResources().getColor(color));
        setSupportActionBar(toolbar);
    }

    @Override
    public void navigateFragment(Fragment fragment, String TAG, String title, int color) {
        FragmentManager fragmentManager = getFragmentManager();
        android.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        checkCurrentFragment();
        fragmentTransaction.addToBackStack(currentTag);
        setToolbar(toolbar, title, color);
        fragmentTransaction.replace(R.id.questionnaireFragment, fragment, TAG);
        fragmentTransaction.commit();
    }

    @Override
    public void savePrefs(String key, String value) {
        SharedPreferences sharedPreferences = this.getSharedPreferences("MyPreferences", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(key, value);
        editor.commit();
    }

    @Override
    public String loadPrefsString(String key) {
        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("MyPreferences", Context.MODE_PRIVATE);
        return sharedPreferences.getString(key, null);
    }

    public void navigateFragmentToBlok2() {
        FragmentManager fragmentManager = getFragmentManager();
        android.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        checkCurrentFragment();
        fragmentTransaction.addToBackStack(currentTag);
        fragmentTransaction.replace(R.id.questionnaireFragment, blok2FragmentImp, BLOK_2_TAG);
        fragmentTransaction.commit();
        setToolbar(toolbar, BLOK_2_NAME, R.color.primaryColorBlok2);
    }

    public void navigateFragmentToBlok3() {
        FragmentManager fragmentManager = getFragmentManager();
        android.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        checkCurrentFragment();
        fragmentTransaction.addToBackStack(currentTag);
        fragmentTransaction.replace(R.id.questionnaireFragment, blok3Fragment, BLOK_3_TAG);
        fragmentTransaction.commit();
        setToolbar(toolbar, BLOK_3_NAME, R.color.primaryColorBlok3);
    }

    public void navigateFragmentToBlok4A1() {
        FragmentManager fragmentManager = getFragmentManager();
        android.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        checkCurrentFragment();
        fragmentTransaction.addToBackStack(currentTag);
        fragmentTransaction.replace(R.id.questionnaireFragment, blok4A1Fragment, BLOK_4A1_TAG);
        fragmentTransaction.commit();
        setToolbar(toolbar, BLOK_4A1_NAME, R.color.primaryColorBlok3);
    }

    public void navigateFragmentToBlok4A2() {
        FragmentManager fragmentManager = getFragmentManager();
        android.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        checkCurrentFragment();
        fragmentTransaction.addToBackStack(currentTag);
        fragmentTransaction.replace(R.id.questionnaireFragment, blok4A2Fragment, BLOK_4A2_TAG);
        fragmentTransaction.commit();
        setToolbar(toolbar, BLOK_4A2_NAME, R.color.primaryColorBlok3);
    }

    public void navigateFragmentToBlok4A3() {
        FragmentManager fragmentManager = getFragmentManager();
        android.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        checkCurrentFragment();
        fragmentTransaction.addToBackStack(currentTag);
        fragmentTransaction.replace(R.id.questionnaireFragment, blok4A3Fragment, BLOK_4A3_TAG);
        fragmentTransaction.commit();
        setToolbar(toolbar, BLOK_4A3_NAME, R.color.primaryColorBlok3);
    }

    public void navigateFragmentToBlok4B() {
        FragmentManager fragmentManager = getFragmentManager();
        android.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        checkCurrentFragment();
        fragmentTransaction.addToBackStack(currentTag);
        fragmentTransaction.replace(R.id.questionnaireFragment, blok4BFragment, BLOK_4B_TAG);
        fragmentTransaction.commit();
        setToolbar(toolbar, BLOK_4B_NAME, R.color.primaryColorBlok3);
    }

    public void navigateFragmentToBlok4C() {
        FragmentManager fragmentManager = getFragmentManager();
        android.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        checkCurrentFragment();
        fragmentTransaction.addToBackStack(currentTag);
        fragmentTransaction.replace(R.id.questionnaireFragment, blok4CFragment, BLOK_4C_TAG);
        fragmentTransaction.commit();
        setToolbar(toolbar, BLOK_4C_NAME, R.color.primaryColorBlok3);
    }

    public void navigateFragmentToBlok4D() {
        FragmentManager fragmentManager = getFragmentManager();
        android.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        checkCurrentFragment();
        fragmentTransaction.addToBackStack(currentTag);
        fragmentTransaction.replace(R.id.questionnaireFragment, blok4DFragment, BLOK_4D_TAG);
        fragmentTransaction.commit();
        setToolbar(toolbar, BLOK_4D_NAME, R.color.primaryColorBlok3);
    }

    public void navigateFragmentToBlok4E() {
        FragmentManager fragmentManager = getFragmentManager();
        android.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        checkCurrentFragment();
        fragmentTransaction.addToBackStack(currentTag);
        fragmentTransaction.replace(R.id.questionnaireFragment, blok4EFragment, BLOK_4E_TAG);
        fragmentTransaction.commit();
        setToolbar(toolbar, BLOK_4E_NAME, R.color.primaryColorBlok3);
    }

    public void initiateFragment() {
        FragmentManager fragmentManager = getFragmentManager();
        android.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.questionnaireFragment, blok1FragmentImp, BLOK_1_TAG);
        quetionnairePresenter.setToolbar(toolbar, BLOK_1_NAME, R.color.primaryColor);
        fragmentTransaction.commit();
    }

    public HashMap<String, String> getValue() {
        String nim = getIntent().getStringExtra("nim");
        String name = getIntent().getStringExtra("name");
        String nimKortim = getIntent().getStringExtra("nimKortim");
        String namaKortim = getIntent().getStringExtra("namaKortim");
        HashMap<String, String> data = new HashMap<String, String>();
        data.put("nim", nim);
        data.put("name", name);
        data.put("nimKortim", nimKortim);
        data.put("namaKortim", namaKortim);
        return data;
    }

    public void savePrefs(String key, long value){
        SharedPreferences sharedPreferences = this.getSharedPreferences("MyPreferences", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putLong(key, value);
        editor.commit();
    }

    public long loadPrefsLong(String key){
        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("MyPreferences", Context.MODE_PRIVATE);
        return sharedPreferences.getLong(key, 0);
    }
}
