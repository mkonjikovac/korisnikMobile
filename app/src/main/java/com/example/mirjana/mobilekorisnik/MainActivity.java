package com.example.mirjana.mobilekorisnik;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.os.*;
import android.support.annotation.*;
import android.support.design.widget.*;
import android.support.v7.app.*;
import android.view.*;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment = null;
            switch (item.getItemId()) {
                case R.id.login_tab:
//                    mTextMessage.setText(R.string.title_home);
                    fragment = new LoginFragment();
                    break;
                case R.id.registration_tab:
//                    mTextMessage.setText(R.string.title_dashboard);
                    fragment = new RegistrationFragment();
                    break;
                case R.id.index_search_tab:
//                    mTextMessage.setText(R.string.title_notifications);
                    fragment = new IndexSearchFragment();
            }
            return loadFragment(fragment);
        }
    };

    private boolean loadFragment(Fragment fragment) {
        //switching fragment
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.indexFrameLayout, fragment)
                    .commit();
            return true;
        }
        return false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}