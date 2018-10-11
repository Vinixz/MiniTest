package android.example.com.minitest.view.activity;

import android.example.com.minitest.R;
import android.example.com.minitest.model.Item;
import android.example.com.minitest.view.fragment.AboutUsFragment;
import android.example.com.minitest.view.fragment.BoxOfficeFragment;
import android.example.com.minitest.view.fragment.HomeFragment;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.nav_home:
                    setTitle("MiniTest");
                    getSupportFragmentManager().beginTransaction().replace(R.id.main_container, new HomeFragment()).commit();
                    return true;
                case R.id.nav_box_office:
                    setTitle("Box Office");
                    getSupportFragmentManager().beginTransaction().replace(R.id.main_container, new BoxOfficeFragment()).commit();
                    return true;
                case R.id.nav_about_us:
                    setTitle("About Us");
                    getSupportFragmentManager().beginTransaction().replace(R.id.main_container, new AboutUsFragment()).commit();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        insert();

        getSupportFragmentManager().beginTransaction().replace(R.id.main_container, new HomeFragment()).commit();
    }

    public void insert(){
        Item.items = new ArrayList<>();
        Item.items.add(new Item("Venom", "5 October 2018", R.drawable.venom_2018_cover));
        Item.items.add(new Item("A Star Is Born", "5 October 2018", R.drawable.a_star_is_born_2018_cover));
        Item.items.add(new Item("Smallfoot", "28 September 2018", R.drawable.small_foot_2018_cover));
        Item.items.add(new Item("Night School", "28 September 2018", R.drawable.night_school_2018_cover));
    }

}
