package com.udayshakya.fragmenttransactionassignment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class FirstFragment extends Fragment
{

    EditText  edtName, edtMobile,edtCollege,edtDegree,edtPercentage,edtDOb,edtAdhar;
    Button btnSubmit;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment

        View view=inflater.inflate(R.layout.fragment_first, container, false);

        //Getting id Here
        edtName=view.findViewById(R.id.editTextName);
        edtMobile=view.findViewById(R.id.editText2Mobile);
        edtCollege=view.findViewById(R.id.editTextCollege);
        edtDegree=view.findViewById(R.id.editTextDegree);
        edtPercentage=view.findViewById(R.id.editTextPercentage);
        edtDOb=view.findViewById(R.id.editTextDOB);
        edtAdhar=view.findViewById(R.id.editText7);

       btnSubmit=view.findViewById(R.id.button);

       btnSubmit.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
               String name= edtName.getText().toString();
               String mobile=edtMobile.getText().toString();
               String college=edtCollege.getText().toString();
               String degree=edtDegree.getText().toString();
               String percentage=edtPercentage.getText().toString();
               String dob=edtDOb.getText().toString();
               String aadhar=edtAdhar.getText().toString();

                SecondFragment secondFragment=new SecondFragment();

                Bundle bundle=new Bundle();
                bundle.putString("nam",name);
                bundle.putString("mob",mobile);
                bundle.putString("clg",college);
                bundle.putString("deg",degree);
                bundle.putString("per",percentage);
                bundle.putString("db",dob);
                bundle.putString("adhar",edtAdhar.getText().toString());

                secondFragment.setArguments(bundle);


                /*getFragmentManager().beginTransaction().replace(R.id.main_page,secondFragment).addToBackStack("FirstFragment")
                        .commit();*/

               FragmentManager fm= getFragmentManager();
               FragmentTransaction ft=fm.beginTransaction();
               ft.replace(R.id.main_page,secondFragment);

               ft.addToBackStack("FirstFragment");
               ft.commit();

                }
        });




        return view;
    }

}
