package com.example.rachit.myapplication01;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {




    private EditText ft;
    private EditText lt;
    private EditText add;
    private EditText city;
    private EditText zip;
    private EditText company;
    private EditText status;
    private EditText business;
    private EditText telephn;
    private Button sub;
    private Button sho;

    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m);




        mContext = MainActivity.this;
        ft = (EditText) findViewById(R.id.et_name);
        lt = (EditText) findViewById(R.id.et_lt);
        add = (EditText) findViewById(R.id.et_add);
        city = (EditText) findViewById(R.id.et_city);
        zip = (EditText) findViewById(R.id.et_zip);
        company = (EditText) findViewById(R.id.et_com);
        status = (EditText) findViewById(R.id.et_stat);
        business = (EditText) findViewById(R.id.et_busi);
        telephn=(EditText) findViewById(R.id.et_tele);






        sub.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {

                                       String frt = ft.getText().toString();
                                       String lrt = lt.getText().toString();
                                       String ad = add.getText().toString();
                                       String cit = city.getText().toString();
                                       String zi = zip.getText().toString();
                                       String com = company.getText().toString();
                                       String st = status.getText().toString();
                                       String bus = business.getText().toString();
                                       String tele = telephn.getText().toString();

                                       Dbhelper dbb = new Dbhelper(mContext);
                                       long result = dbb.saveAddress(frt, lrt, ad, cit, zi, com, st, bus, tele);
                                       System.out.println("save" + result);


                                   }
                               });







    }}







