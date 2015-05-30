package com.example.fadheelahdaham.website;

import android.app.Activity;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.content.Intent;
import android.widget.Button;




public class MainActivity extends Activity {

    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button1 = (Button) findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent NameOfTheIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://limkokwing.net"));
                startActivity(NameOfTheIntent);

            }
        });

    }
}

//https://facebook.com/limkokwing/timeline
//http://instagram.com/limkokwing
//https://twitter.com/limkokwing_my