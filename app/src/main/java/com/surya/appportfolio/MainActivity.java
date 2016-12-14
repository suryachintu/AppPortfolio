package com.surya.appportfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button b1 = (Button)findViewById(R.id.button1);
        Button b2 = (Button)findViewById(R.id.button2);
        Button b3 = (Button)findViewById(R.id.button3);
        Button b4 = (Button)findViewById(R.id.button4);
        Button b5 = (Button)findViewById(R.id.button5);
        Button b6 = (Button)findViewById(R.id.button6);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.button1:
                Toast.makeText(MainActivity.this, "This button will launch my Popular Movies", Toast.LENGTH_SHORT).show();
                break;

            case R.id.button2:
                Toast.makeText(MainActivity.this, "This button will launch my Stock Hawk", Toast.LENGTH_SHORT).show();
                break;

            case R.id.button3:
                Toast.makeText(MainActivity.this, "This button will launch my Build It Bigger", Toast.LENGTH_SHORT).show();
                break;

            case R.id.button4:
                Toast.makeText(MainActivity.this, "This button will launch my Make Your App Material", Toast.LENGTH_SHORT).show();
                break;

            case R.id.button5:
                Toast.makeText(MainActivity.this, "This button will launch my Go Ubiquitous", Toast.LENGTH_SHORT).show();
                break;

            case R.id.button6:
                Toast.makeText(MainActivity.this, "This button will launch my Make Own App", Toast.LENGTH_SHORT).show();
                break;
        }

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
