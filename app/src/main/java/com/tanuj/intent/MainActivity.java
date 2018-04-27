package com.tanuj.intent;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText search;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        search = (EditText) findViewById(R.id.search);
        btn1 = (Button)findViewById(R.id.btn1);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (search.getText().toString().isEmpty() &&
                        search.getText().toString().length() == 0){
                    Toast.makeText(getApplicationContext(),R.string.error_text, Toast.LENGTH_LONG).show();
                    return;
                }


                Uri searchStringUri = Uri.parse("http://www.google.com/#q=" + search.getText().toString());


                Intent searchIntent = new Intent(Intent.ACTION_VIEW, searchStringUri);


                startActivity(searchIntent);
            }
        });


    }
}




