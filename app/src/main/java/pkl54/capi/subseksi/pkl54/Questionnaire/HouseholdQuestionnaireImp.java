package pkl54.capi.subseksi.pkl54.Questionnaire;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;

import pkl54.capi.subseksi.pkl54.Questionnaire.ActivityPresenter.HouseholdPresenter;
import pkl54.capi.subseksi.pkl54.Questionnaire.ActivityPresenter.HouseholdPresenterImp;
import pkl54.capi.subseksi.pkl54.R;

public class HouseholdQuestionnaireImp extends ActionBarActivity implements HouseholdQuestionnaire {

    private HouseholdPresenter householdPresenter;

    private Toolbar toolbar;

    private Blok3Fragment blok3Fragment;
    private Blok4A1Fragment blok4A1Fragment;
    private Blok4A2Fragment blok4A2Fragment;
    private Blok4A3Fragment blok4A3Fragment;
    private Blok4BFragment blok4BFragment;
    private Blok4CFragment blok4CFragment;
    private Blok4DFragment blok4DFragment;
    private Blok4EFragment blok4EFragment;

    private String currentTag;

    private final String BLOK_3_TAG = "BLOK_3";
    private final String BLOK_3_NAME = "BLOK 3";
    private final String BLOK_4A1_TAG = "BLOK_4A1";
    private final String BLOK_4A1_NAME = "BLOK 4A1";
    private final String BLOK_4A2_TAG = "BLOK_4A2";
    private final String BLOK_4A2_NAME = "BLOK 4A2";
    private final String BLOK_4A3_TAG = "BLOK_4A3";
    private final String BLOK_4A3_NAME = "BLOK 4A3";
    private final String BLOK_4B_TAG = "BLOK_4B";
    private final String BLOK_4B_NAME = "BLOK 4B";
    private final String BLOK_4C_TAG = "BLOK_4C";
    private final String BLOK_4C_NAME = "BLOK 4C";
    private final String BLOK_4D_TAG = "BLOK_4D";
    private final String BLOK_4D_NAME = "BLOK 4D";
    private final String BLOK_4E_TAG = "BLOK_4E";
    private final String BLOK_4E_NAME = "BLOK 4E";

    private final int BLOK_3_COLOR = R.color.primaryColor;
    private final int BLOK_4_COLOR = R.color.primaryColorBlok2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_household_questionnaire);

        householdPresenter = new HouseholdPresenterImp(this);

        toolbar = (Toolbar) findViewById(R.id.app_bar);
    }

    @Override
    public void setCurrentTag(String currentTag) {
        this.currentTag = currentTag;
    }

    public void checkCurrentFragment() {
        householdPresenter.checkCurrentFragment(getFragmentManager());
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

    public void navigateFragmentToBlok4() {
        FragmentManager fragmentManager = getFragmentManager();
        android.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        checkCurrentFragment();
        fragmentTransaction.addToBackStack(currentTag);
        setToolbar(toolbar, BLOK_4A1_NAME, R.color.primaryColorBlok2);
        fragmentTransaction.replace(R.id.questionnaireFragment, blok4A1Fragment, BLOK_4A1_TAG);
        fragmentTransaction.commit();
    }

    public void initiateFragment() {
        FragmentManager fragmentManager = getFragmentManager();
        android.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.add(R.id.questionnaireFragment, blok3Fragment, BLOK_3_TAG);
        householdPresenter.setToolbar(toolbar, BLOK_3_NAME, R.color.primaryColor);
        fragmentTransaction.commit();
    }

}
