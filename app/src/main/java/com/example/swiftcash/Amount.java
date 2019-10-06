package com.example.swiftcash;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
*/
public class Amount extends Fragment {


 public Amount() {
 // Required empty public constructor
 }


 @Override
 public View onCreateView(LayoutInflater inflater, ViewGroup container,
 Bundle savedInstanceState) {
  View view = inflater.inflate(R.layout.fragment_amount, container, false);

  Button b = view.findViewById(R.id.btnContinue);
  b.setOnClickListener(new View.OnClickListener() {
   @Override
   public void onClick(View v) {
    Fragment f = new searching();
    FragmentManager fragmentManager = getFragmentManager();
    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
    fragmentTransaction.replace(R.id.fragHolder,f);
    fragmentTransaction.commit();
   }
  });
 return view;
 }

}
