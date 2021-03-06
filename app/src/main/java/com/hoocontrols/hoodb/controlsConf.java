package com.hoocontrols.hoodb;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

//import androidx.fragment.app.Fragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class controlsConf extends Fragment {


    public controlsConf() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater _inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View _view =  _inflater.inflate(R.layout.fragment_controls_hall, container, false);

        LinearLayout controlsRow = _view.findViewById(R.id.controlsHall);
        LayoutInflater inflater = LayoutInflater.from(getActivity());
        View view;
        final Button btnBase, btnControl1, btnControl2, btnControl3;

        //Reading the States Before Rendering
        ((HomeActivity)getActivity()).readBackTrackStates();


        //3 Gang
        view = inflater.inflate(R.layout.button3g, controlsRow, false);
        btnControl1 = view.findViewById(R.id.btn3g_1);
        if(((HomeActivity)getActivity()).Hall_3G_A_1.compareTo("OF1")==0) {
            btnControl1.setBackground(ContextCompat.getDrawable(getActivity(), R.drawable.switchbutton_red));
        }
        else {
            btnControl1.setBackground(ContextCompat.getDrawable(getActivity(), R.drawable.switchbutton_blue));
        }
        btnControl1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(((HomeActivity)getActivity()).Hall_3G_A_1.compareTo("OF1")==0) {
                    ((HomeActivity) getActivity()).SwitchCore(((HomeActivity) getActivity()).Hall_3G_A, "ON1");
                    ((HomeActivity)getActivity()).Hall_3G_A_1="ON1";
                    btnControl1.setBackground(ContextCompat.getDrawable(getActivity(), R.drawable.switchbutton_blue));

                }
                else {
                    ((HomeActivity) getActivity()).SwitchCore(((HomeActivity) getActivity()).Hall_3G_A, "OF1");
                    ((HomeActivity) getActivity()).Hall_3G_A_1 = "OF1";
                    btnControl1.setBackground(ContextCompat.getDrawable(getActivity(), R.drawable.switchbutton_red));

                }
            }
        });
        btnControl2 = view.findViewById(R.id.btn3g_2);
        if(((HomeActivity)getActivity()).Hall_3G_A_2.compareTo("OF2")==0) {
            btnControl2.setBackground(ContextCompat.getDrawable(getActivity(), R.drawable.switchbutton_red));
        }
        else {
            btnControl2.setBackground(ContextCompat.getDrawable(getActivity(), R.drawable.switchbutton_blue));
        }
        btnControl2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(((HomeActivity)getActivity()).Hall_3G_A_2.compareTo("OF2")==0) {
                    ((HomeActivity) getActivity()).SwitchCore(((HomeActivity) getActivity()).Hall_3G_A, "ON2");
                    ((HomeActivity)getActivity()).Hall_3G_A_2="ON2";
                    btnControl2.setBackground(ContextCompat.getDrawable(getActivity(), R.drawable.switchbutton_blue));

                }
                else {
                    ((HomeActivity) getActivity()).SwitchCore(((HomeActivity) getActivity()).Hall_3G_A, "OF2");
                    ((HomeActivity)getActivity()).Hall_3G_A_2="OF2";
                    btnControl2.setBackground(ContextCompat.getDrawable(getActivity(), R.drawable.switchbutton_red));

                }
            }
        });
        btnControl3 = view.findViewById(R.id.btn3g_3);
        if(((HomeActivity)getActivity()).Hall_3G_A_3.compareTo("OF3")==0) {
            btnControl3.setBackground(ContextCompat.getDrawable(getActivity(), R.drawable.switchbutton_red));
        }
        else {
            btnControl3.setBackground(ContextCompat.getDrawable(getActivity(), R.drawable.switchbutton_blue));
        }
        btnControl3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(((HomeActivity)getActivity()).Hall_3G_A_3.compareTo("OF3")==0) {
                    ((HomeActivity) getActivity()).SwitchCore(((HomeActivity) getActivity()).Hall_3G_A, "ON3");
                    ((HomeActivity)getActivity()).Hall_3G_A_3="ON3";
                    btnControl3.setBackground(ContextCompat.getDrawable(getActivity(), R.drawable.switchbutton_blue));

                }
                else {
                    ((HomeActivity) getActivity()).SwitchCore(((HomeActivity) getActivity()).Hall_3G_A, "OF3");
                    ((HomeActivity)getActivity()).Hall_3G_A_3="OF3";
                    btnControl3.setBackground(ContextCompat.getDrawable(getActivity(), R.drawable.switchbutton_red));

                }
            }
        });
        controlsRow.addView(view);





        return _view;
    }

}
