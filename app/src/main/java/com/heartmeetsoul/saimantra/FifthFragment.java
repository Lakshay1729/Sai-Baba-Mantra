package com.heartmeetsoul.saimantra;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class FifthFragment extends Fragment {


        public FifthFragment() {
            // Required empty public constructor
        }
        TextView t1,t2,t3,t4;

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment


            View view = inflater.inflate(R.layout.fragment_fifth, container, false);
            t1 = (TextView) view.findViewById(R.id.t1);
            t2 = (TextView) view.findViewById(R.id.t2);
            t3 = (TextView) view.findViewById(R.id.t3);
            t4 = (TextView) view.findViewById(R.id.t4);

            t1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    MainActivity.text=Integer.parseInt(t1.getText().toString());
                    Toast.makeText(getActivity(), ""+MainActivity.text, Toast.LENGTH_SHORT).show();
                }
            });
            t2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    MainActivity.text=Integer.parseInt(t2.getText().toString());
                    Toast.makeText(getActivity(), ""+MainActivity.text, Toast.LENGTH_SHORT).show();
                }
            });
            t3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    MainActivity.text=Integer.parseInt(t3.getText().toString());
                    Toast.makeText(getActivity(), ""+MainActivity.text, Toast.LENGTH_SHORT).show();
                }
            });
            t4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    MainActivity.text=Integer.parseInt(t4.getText().toString());
                    Toast.makeText(getActivity(), ""+MainActivity.text, Toast.LENGTH_SHORT).show();
                }
            });

            return view;

        }


    }
