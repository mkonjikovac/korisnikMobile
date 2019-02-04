package com.example.mirjana.mobilekorisnik;

import android.content.*;
import android.os.Bundle;
import android.support.annotation.*;
import android.support.v4.app.*;
import android.view.*;
import android.widget.*;


public class IndexLoginFragment extends Fragment {

    private Button loginButton;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.index_login_fragment, container, false);
        loginButton = view.findViewById(R.id.login_button);
        loginButton.setOnClickListener(l ->{
            Intent intent = new Intent(getActivity(), HandymanActivity.class);
            startActivity(intent);
        });
        return view;
    }
}