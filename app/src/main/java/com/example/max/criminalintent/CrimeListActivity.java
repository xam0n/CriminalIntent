package com.example.max.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Max on 24.08.2016.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
