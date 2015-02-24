package pkl54.capi.subseksi.pkl54.Questionnaire;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;

import com.melnykov.fab.FloatingActionButton;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.SecondaryDrawerItem;
import com.mikepenz.materialdrawer.model.SectionDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;

import pkl54.capi.subseksi.pkl54.R;

public class HouseholdActivityImp extends ActionBarActivity implements View.OnClickListener {

    private Toolbar toolbar;

    private FloatingActionButton actionButton;

    private String currentTag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_household);

        toolbar = (Toolbar) findViewById(R.id.app_bar);

        actionButton = (FloatingActionButton) findViewById(R.id.fab);
        actionButton.setOnClickListener(this);

        new Drawer()
                .withActivity(this)
                .withToolbar(toolbar)
                .withActionBarDrawerToggle(true)
                .withHeader(R.layout.header)
                .addDrawerItems(
                        new PrimaryDrawerItem().withName("Blok 3"),
                        new PrimaryDrawerItem().withName("Blok 4"),
                        new SectionDrawerItem(),
                        new SecondaryDrawerItem().withName("Keluar")
                )
                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id, IDrawerItem drawerItem) {

                    }
                })
                .build();
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.fab){

        }
    }
}
