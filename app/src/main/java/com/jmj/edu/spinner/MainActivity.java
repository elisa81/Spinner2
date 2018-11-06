package com.jmj.edu.spinner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spinner=(Spinner)findViewById(R.id.spinner);
        List<String> list = new ArrayList<String>();
        list.add("스피너를 선택해주세요");
        list.add("Apple");
        list.add("Mango");
        list.add("Banana");
        ArrayAdapter<String> dataAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view,
                               int position, long id) {
        if(position==1){
            Intent intent=null;
            intent = new Intent(this,AppleActivity.class);
            startActivity(intent);
        }
        if(position==2){
            Intent intent=null;
            intent = new Intent(this,MangoActivity.class);
            startActivity(intent);
        }
        if(position==3){
            Intent intent=null;
            intent = new Intent(this,BananaActivity.class);
            startActivity(intent);
        }
        // String seleted = ((TextView)view).getText().toString();

        //Toast.makeText(getApplicationContext(), seleted+"을(를) 선택했습니다.",1).show();


    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) { }
}
