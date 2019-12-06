package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemClickListener {

    private EditText tex;
    private Button button;
    private ListView its;
    private ArrayList<String> itemL;
    private ArrayAdapter<String>  adp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tex = findViewById(R.id.item);
        button = findViewById(R.id.button);
        its = findViewById(R.id.itemList);

        itemL = WithFile.fromFile(this);
        adp = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, itemL);
        its.setAdapter(adp);

        button.setOnClickListener(this);
        its.setOnItemClickListener(this);
    }

    @Override
    public void onClick(View v){
        if (v.getId()==R.id.button) {
            String temp = tex.getText().toString();
            itemL.add(temp);
            tex.setText("");
            WithFile.toFile(itemL,this);
            adp.notifyDataSetChanged();
            Toast.makeText(this, "Item added", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        itemL.remove(position);
        adp.notifyDataSetChanged();
        Toast.makeText(this, "Deleted", Toast.LENGTH_SHORT).show();
        WithFile.toFile(itemL,this);
    }
}
