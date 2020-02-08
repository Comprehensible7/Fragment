package com.tf.fragmenttest;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentB extends Fragment {

    MainActivity mainActivity;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return inflater.inflate(R.layout.fragment_a,null);
        ViewGroup viewGroup =
                (ViewGroup) inflater.inflate(R.layout.fragment_b,container,false);

        //세부 컨트롤 제어(참조값 얻기).....


        return viewGroup;

    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        //Attach된 Activity
        mainActivity = (MainActivity) getActivity();

        mainActivity.title = "화면B 입니다";
        mainActivity.setTitle(mainActivity.title);

    }

    @Override
    public void onDetach() {
        super.onDetach();
        mainActivity=null;
    }
}
