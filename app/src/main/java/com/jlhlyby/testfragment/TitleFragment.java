package com.jlhlyby.testfragment;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class TitleFragment extends Fragment {

    Button button;

    public TitleFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment_title, container, false);
        initview(view);
        initClick();

        return view;

    }

    private void initClick() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"点击按钮",Toast.LENGTH_SHORT)
                        .show();
            }
        });
    }

    private void initview( View view) {
        button= (Button) view.findViewById(R.id.button);
    }

}
