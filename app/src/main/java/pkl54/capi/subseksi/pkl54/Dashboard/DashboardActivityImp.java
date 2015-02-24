package pkl54.capi.subseksi.pkl54.Dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import com.melnykov.fab.FloatingActionButton;
import com.mikepenz.iconics.typeface.FontAwesome;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.SecondaryDrawerItem;
import com.mikepenz.materialdrawer.model.SectionDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;
import com.quentindommerc.superlistview.SuperListview;

import java.util.ArrayList;

import pkl54.capi.subseksi.pkl54.Questionnaire.ActivityView.QuestionnaireActivityImp;
import pkl54.capi.subseksi.pkl54.R;

public class DashboardActivityImp extends ActionBarActivity implements DashboardActivity, View.OnClickListener, SwipeRefreshLayout.OnRefreshListener {

    private DashboardPresenter dashboardPresenter;
    private Toolbar toolbar;
    private SuperListview mList;
    private ArrayAdapter<String> mAdapter;
    private FloatingActionButton actionButton;
    //private ImageView imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        dashboardPresenter = new DashboardPresenterImp(this);

        mList = (SuperListview) findViewById(R.id.list);

        toolbar = (Toolbar) findViewById(R.id.app_bar);
        toolbar.setTitle("PKL54");

        dashboardPresenter.setToolbar(toolbar);

        dashboardPresenter.populateListView();

        new Drawer()
                .withActivity(this)
                .withToolbar(toolbar)
                .withActionBarDrawerToggle(true)
                .withHeader(R.layout.header)
                .addDrawerItems(
                        new PrimaryDrawerItem().withName("Home").withIcon(getResources().getDrawable(R.mipmap.home)),
                        new PrimaryDrawerItem().withName("SMS Gateway").withIcon(getResources().getDrawable(R.mipmap.message)),
                        new SectionDrawerItem(),
                        new SecondaryDrawerItem().withName("Settings").withIcon(FontAwesome.Icon.faw_cog),
                        new SecondaryDrawerItem().withName("About").withIcon(getResources().getDrawable(R.mipmap.group)),
                        new SecondaryDrawerItem().withName("Log out").withIcon(getResources().getDrawable(R.mipmap.close))
                )
                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id, IDrawerItem drawerItem) {
                        if (position == 1) {
                            dashboardPresenter.navigateToHome();
                        }
                    }
                })
                .build();

        mList.setRefreshListener(this);

        actionButton = (FloatingActionButton) findViewById(R.id.fab);
        mList = (SuperListview) findViewById(R.id.list);
        actionButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.fab) {
            dashboardPresenter.navigateToQuest();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        dashboardPresenter.populateListView();
    }

    @Override
    public void setToolbar(Toolbar toolbar) {
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public void navigateToHome() {
        Intent intent = new Intent(DashboardActivityImp.this, DashboardActivityImp.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void navigateToQuest() {
        String nim = getIntent().getStringExtra("nim");
        String name = getIntent().getStringExtra("name");
        String nimKortim = getIntent().getStringExtra("nimKortim");
        String namaKortim = getIntent().getStringExtra("namaKortim");
        Intent intent = new Intent(DashboardActivityImp.this, QuestionnaireActivityImp.class);
        intent.putExtra("nim", nim);
        intent.putExtra("name", name);
        intent.putExtra("nimKortim", nimKortim);
        intent.putExtra("namaKortim", namaKortim);
        startActivity(intent);
    }

    @Override
    public void populateListView(ArrayList<String> list) {
        mAdapter = new ArrayAdapter<>(this, R.layout.listview_layout, R.id.atomPay_name, list);
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        mList.setAdapter(mAdapter);
                    }
                });
            }
        });
        thread.start();
    }

    @Override
    public void onRefresh() {
        // enjoy the beaty of the progressbar
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {

                // demo purpose, adding to the top so you can see it
                dashboardPresenter.populateListView();

            }
        }, 2000);
    }
}
