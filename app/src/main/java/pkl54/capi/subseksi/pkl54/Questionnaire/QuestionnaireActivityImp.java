package pkl54.capi.subseksi.pkl54.Questionnaire;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;

import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.SecondaryDrawerItem;
import com.mikepenz.materialdrawer.model.SectionDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;

import pkl54.capi.subseksi.pkl54.Questionnaire.ActivityPresenter.QuestionnairePresenterImp;
import pkl54.capi.subseksi.pkl54.Questionnaire.ActivityPresenter.QuetionnairePresenter;
import pkl54.capi.subseksi.pkl54.R;

public class QuestionnaireActivityImp extends ActionBarActivity implements QuestionnaireActivity {

    private QuetionnairePresenter quetionnairePresenter;
    private Toolbar toolbar;
    private Blok1FragmentImp blok1FragmentImp;
    private Blok2FragmentImp blok2FragmentImp;

    private String currentTag;

    private final String BLOK_1_TAG = "BLOK_1";
    private final String BLOK_1_NAME = "BLOK 1";
    private final String BLOK_2_TAG = "BLOK_2";
    private final String BLOK_2_NAME = "BLOK 2";

    private final int BLOK_1_COLOR = R.color.primaryColor;
    private final int BLOK_2_COLOR = R.color.primaryColorBlok2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionnaire);

        quetionnairePresenter = new QuestionnairePresenterImp(this);

        toolbar = (Toolbar) findViewById(R.id.app_bar);

        blok1FragmentImp = new Blok1FragmentImp();
        blok2FragmentImp = new Blok2FragmentImp();

        new Drawer()
                .withActivity(this)
                .withToolbar(toolbar)
                .withActionBarDrawerToggle(true)
                .withHeader(R.layout.header)
                .addDrawerItems(
                        new PrimaryDrawerItem().withName("Blok 1"),
                        new PrimaryDrawerItem().withName("Blok 2"),
                        new SectionDrawerItem(),
                        new SecondaryDrawerItem().withName("Keluar")
                )
                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id, IDrawerItem drawerItem) {
                        if (position == 1) {
                            quetionnairePresenter.navigateFragment(blok1FragmentImp, BLOK_1_TAG, BLOK_1_NAME, BLOK_1_COLOR);
                        } else if (position == 2) {
                            quetionnairePresenter.navigateFragment(blok2FragmentImp, BLOK_2_TAG, BLOK_2_NAME, BLOK_2_COLOR);
                        } else if (position == 3) {

                        }
                    }
                })
                .build();

        initiateFragment();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
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

    public void navigateFragmentToBlok2() {
        FragmentManager fragmentManager = getFragmentManager();
        android.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        checkCurrentFragment();
        fragmentTransaction.addToBackStack(currentTag);
        setToolbar(toolbar, BLOK_2_NAME, R.color.primaryColorBlok2);
        fragmentTransaction.replace(R.id.questionnaireFragment, blok2FragmentImp, BLOK_2_TAG);
        fragmentTransaction.commit();
    }

    public void navigateToHouseholdActivity(){
        Intent intent = new Intent(QuestionnaireActivityImp.this, HouseholdActivityImp.class);
        startActivity(intent);
    }

    public void initiateFragment() {
        FragmentManager fragmentManager = getFragmentManager();
        android.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.add(R.id.questionnaireFragment, blok1FragmentImp, BLOK_1_TAG);
        quetionnairePresenter.setToolbar(toolbar, BLOK_1_NAME, R.color.primaryColor);
        fragmentTransaction.commit();
    }

}
