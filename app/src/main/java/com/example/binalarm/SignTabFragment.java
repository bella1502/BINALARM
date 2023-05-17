package com.example.binalarm;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.fragment.app.Fragment;


public class SignTabFragment extends Fragment {
    EditText email,add,pass;
    CheckBox term;
    Button sign;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        boolean attachToRoot;
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_sign_tab, container, false );

        email = root.findViewById(R.id.email);
        pass = root.findViewById(R.id.pass);
        add = root.findViewById(R.id.add);
        term = root.findViewById(R.id.checkBox);
        sign = root.findViewById(R.id.sign);


        email.setTranslationX(800);
        pass.setTranslationX(800);
        add.setTranslationX(800);
        term.setTranslationX(800);
        sign.setTranslationX(800);

        email.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
        pass.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
        add.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
        sign.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
        term.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(700).start();

        return root;
    }
}