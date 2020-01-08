package com.hoocontrols.hoodb;


import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class set_net_id extends Fragment {

    EditText e1;
    Button b1;

    public set_net_id() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       /// SharedPreferences pref;
       View view =inflater.inflate(R.layout.fragment_set_net_id, container, false);

        e1=view.findViewById(R.id.edit1);
        b1= view.findViewById(R.id.button16);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                HomeActivity.editor.putString("ip", e1.getText().toString());
                HomeActivity.editor.apply();
                //Log.v("ali", "value " +H);
                String name = HomeActivity.pref.getString("ip", "No ip");
             //   HomeActivity hm = new HomeActivity();
                Log.v("ali", "value " + name);
                e1.setText("");
              //  hm.f1(id);
            }
        });


        return view;
    }

}
