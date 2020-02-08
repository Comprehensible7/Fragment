package com.tf.fragmenttest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    String title="Fragment연습";

    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;

    FragmentA fragmentA = new FragmentA();
    FragmentB fragmentB = new FragmentB();
    FragmentC fragmentC = new FragmentC();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle(title);

        //Manager구하기
        fragmentManager = getSupportFragmentManager();

        //Transaction구하기=> Fragment배치
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container,fragmentA,null)
                            .commit();


    }

    public void changeFragment(int id){

        fragmentTransaction = fragmentManager.beginTransaction();

        if(id==R.id.bt_1) {
            fragmentTransaction.replace(R.id.fragment_container, fragmentA, null)
                    .commit();
        }else if(id==R.id.bt_2) {
            fragmentTransaction.replace(R.id.fragment_container, fragmentB, null)
                    .commit();
        }else if(id==R.id.bt_3) {
            fragmentTransaction.replace(R.id.fragment_container, fragmentC, null)
                    .commit();
        }
    }

    public void onClick(View view){

        changeFragment(view.getId());
       /* switch (view.getId())
        {
            case R.id.bt_1: break;
            case R.id.bt_2: break;
            case R.id.bt_3: break;
        }*/

    }

}
