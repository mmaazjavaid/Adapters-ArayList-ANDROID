package com.example.adaptersandarraylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {
    ArrayList<String> taskList = new ArrayList<String> ();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b=findViewById(R.id.addtaskbutton);
        ListView listview=findViewById(R.id.listview);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, taskList);
        listview.setAdapter(arrayAdapter);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText=findViewById(R.id.inputField);
                if(taskList.contains(editText.getText().toString())){
                    return;
                }else{
                    taskList.add(editText.getText().toString());
                    arrayAdapter.notifyDataSetChanged();
                }

            }
        });




    }


}