package com.jlhlyby.testfragment;


import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class ContentFragment extends Fragment {
    Button btn;

    public ContentFragment() {
        super();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_content,container,false);
        initView(view);
        initClick();
        return view;
    }

    private void initClick() {
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToNext();
            }
        });
    }

    private void goToNext() {
      FragmentTransaction fragmentTransaction= getFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.content_fragment,new SecondFragment());
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }


    private void initView(View view) {
        btn= (Button) view.findViewById(R.id.button2);
    }

}
