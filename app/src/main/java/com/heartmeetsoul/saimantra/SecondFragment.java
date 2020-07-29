package com.heartmeetsoul.saimantra;


import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment {
TextView textView1,textView2,textView3,textView4;

    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         View view=inflater.inflate(R.layout.fragment_second, container, false);

        textView1=(TextView)view.findViewById(R.id.mantra11);
        textView2=(TextView)view.findViewById(R.id.mantra21);
        textView3=(TextView)view.findViewById(R.id.mantra31);
        textView4=(TextView)view.findViewById(R.id.mantra41);

        MainActivity.text6=textView1;
        MainActivity.text7=textView2;
        MainActivity.text8=textView3;
        MainActivity.text4=textView4;

        textView4.setTextSize((int)MainActivity.height*0.009f);
        textView2.setTextSize((int)MainActivity.height*0.009f);
        textView3.setTextSize((int)MainActivity.height*0.009f);
        textView1.setTextSize((int)MainActivity.height*0.009f);

         return view;

    }

}
