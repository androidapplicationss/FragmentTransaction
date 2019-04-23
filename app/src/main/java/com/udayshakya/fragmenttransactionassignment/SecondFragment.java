package com.udayshakya.fragmenttransactionassignment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class SecondFragment extends Fragment {


    TextView txtView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_second, container, false);

        txtView=view.findViewById(R.id.textView);



      Bundle bundle=  getArguments();
      String name=bundle.getString("nam");
     String mobile= bundle.getString("mob");
      String college=bundle.getString("clg");
     String degree= bundle.getString("deg");
      String percentage=bundle.getString("per");
      String dob=bundle.getString("db");
     String aadhar= bundle.getString("adhar");

     txtView.setText("Name:"+name+"\n"+"Mobile:"+mobile+"\n"+"College:"+college+"\n"+"Degree:"+degree
             +"\n"+"Percentage:"+percentage+"\n"+"DOB:"+dob+"\n"+"Addhar"+aadhar);



        return  view;
    }

}
