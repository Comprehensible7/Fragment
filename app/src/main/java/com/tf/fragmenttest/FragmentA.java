package com.tf.fragmenttest;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentA extends Fragment {

    MainActivity mainActivity;

    EditText et_title;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return inflater.inflate(R.layout.fragment_a,null);
        ViewGroup viewGroup =
                (ViewGroup) inflater.inflate(R.layout.fragment_a,container,false);

        //컨트롤 참조값 구하기
        et_title = viewGroup.findViewById(R.id.et_title);

        Button bt_title = viewGroup.findViewById(R.id.bt_title);

        //타이틀변경하기 버튼이 클릭되면...
        bt_title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title = et_title.getText().toString();
                mainActivity.title = title;
                mainActivity.setTitle(title);
            }
        });

        //세부 컨트롤 제어(참조값 얻기).....
        return viewGroup;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        //Attach된 Activity
        mainActivity = (MainActivity) getActivity();

        mainActivity.title = "화면A 입니다";
        mainActivity.setTitle(mainActivity.title);

    }

    @Override
    public void onDetach() {
        super.onDetach();
        mainActivity=null;
    }
}
