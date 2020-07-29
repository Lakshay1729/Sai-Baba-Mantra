package com.heartmeetsoul.saimantra;


import android.graphics.Color;
import android.os.Bundle;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import static com.heartmeetsoul.saimantra.MainActivity.height;
import static com.heartmeetsoul.saimantra.MainActivity.textView89;


/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment {

TextView lt1;
    View view;
    public FirstFragment() {
        // Required empty public constructor
    }

TextView t1,t7,t8,t4,t6,t6a,t4a;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

         view= inflater.inflate(R.layout.fragment_first, container, false);

        //t1=(TextView)view.findViewById(R.id.ft1);
        //t1.setText(MainActivity.c+"");
        t6=(TextView)view.findViewById(R.id.mantra1);
        t7=(TextView)view.findViewById(R.id.mantra2);
        t8=(TextView)view.findViewById(R.id.mantra3);
     //  t6a=(TextView)view.findViewById(R.id.textView6a);
        t4=(TextView)view.findViewById(R.id.mantra4);



        // t4a=(TextView)view.findViewById(R.id.textView5a);
        MainActivity.textView6b=t4a;
        MainActivity.textView6=t6;
        MainActivity.textView7=t7;
        MainActivity.textView8=t8;
        MainActivity.textView4=t4;
        MainActivity.textView9=t6a;

        t6.setTextSize((int)height*0.009f);
        t7.setTextSize((int)height*0.009f);
        t8.setTextSize((int)height*0.009f);
        t4.setTextSize((int)height*0.009f);
//        lt1=(TextView)view.findViewById(R.id.lt1);
//        try {
//            File file=new File("");
//            file.setWritable(true);
//            MP3File mp3File=new MP3File(file);
//        Lyrics3v1 lyrics3v1= (Lyrics3v1) mp3File.getLyrics3Tag();
//       String lyrics=(lyrics3v1.getLyric());
//       lt1.setText("lyrics");
//
//        } catch (IOException e)
//        {
//            Toast.makeText(getActivity(), "Error"+e.toString(), Toast.LENGTH_SHORT).show();
//            e.printStackTrace();
//        }
//        catch (TagException e)
//        {
//            Toast.makeText(getActivity(), "Error"+e, Toast.LENGTH_SHORT).show();
//            e.printStackTrace();
//        }




         return view;
    }
//    public void setCount()
//    {
//        TextView t1=  (TextView)view.findViewById(R.id.ft1);
//        t1.setText(MainActivity.c);
//    }


}
