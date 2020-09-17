package to.msn.wings.tabactivityagain;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.appcompat.app.ActionBar;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import to.msn.wings.tabactivityagain.ui.main.SectionsPagerAdapter;


public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private int[] tabIcons = {
            R.drawable.ic_action_todo,
            R.drawable.ic_action_kpt,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //sectionPagerAdapterインスタンス化
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);

        //Tabの中身設定
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);
        FloatingActionButton fab = findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        //Toolbarのアイコン表示
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        if(getSupportActionBar() != null){
            ActionBar actionBar = getSupportActionBar();
            actionBar.setDisplayHomeAsUpEnabled(false);
        }
        getSupportActionBar().setTitle(null);

        tabLayout = (TabLayout)findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        setUpTabIcon();
    }

    private void setUpTabIcon(){
        tabLayout.getTabAt(0).setIcon(tabIcons[0]);
        tabLayout.getTabAt(1).setIcon(tabIcons[1]);
    }
}