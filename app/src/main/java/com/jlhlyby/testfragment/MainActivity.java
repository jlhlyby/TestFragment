package com.jlhlyby.testfragment;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    FragmentManager fm;
    FragmentTransaction transaction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fm = getFragmentManager();
        transaction = fm.beginTransaction();
        transaction.replace(R.id.content_fragment,new ContentFragment());
        transaction.commit();
        Button b= (Button) findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setDefaultFragment();
            }
        });

    }
    private void setDefaultFragment()
    {
        transaction=fm.beginTransaction();
        Fragment f= new BottomFragment();
        transaction.replace(R.id.content_fragment,f);
        transaction.commit();
    }
}
