package com.heartmeetsoul.saimantra;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;

import androidx.fragment.app.DialogFragment;

public class OptionsFragment extends DialogFragment {
    private Dialog mDialog;
     public OptionsFragment()
    {

    }
    @Override
    public Dialog onCreateDialog(Bundle onSavedInstance)
    { if(mDialog==null)
    {

        mDialog=new Dialog(getActivity(),R.style.MyCustomTheme);
        mDialog.setContentView(R.layout.layout_cart);
        mDialog.setCanceledOnTouchOutside(true);
        mDialog.getWindow().setGravity(Gravity.CENTER);

    }

        ((LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(R.layout.layout_cart,null).findViewById(R.id.rating).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(" :https://play.google.com/store/apps/details?id=com.heartmeetsoul.saimantra&hl=en_US.wSaTQd")));
            }
        });
        return mDialog;
    }
}
