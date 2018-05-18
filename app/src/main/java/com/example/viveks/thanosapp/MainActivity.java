package com.example.viveks.thanosapp;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            }

    String[] names = { "Power", "Reality","Soul", "Mind", "Time", "Space" };
    public void randomStone(View view) {
        String name;
        name = names[(int) (Math.random() * names.length)];
        TextView tf1 = (TextView)findViewById(R.id.textView2);
        TextView tf2 = (TextView)findViewById(R.id.textView3);
        if(name != null || name != ""){
            tf1.setText("You have got the" + name + "Stone");
            tf2.append(" "+name);
            if (name.equals("Power")) {
                tf1.setBackgroundColor(Color.parseColor("#800080"));
                names[0] =  names[0].replace("Power", null);
            }
            if (name.equals("Space")) {
                tf1.setBackgroundColor(Color.parseColor("#0000FF"));
                names[0] =  names[0].replace("Space", null);
            }
            if (name.equals("Time")) {
                tf1.setBackgroundColor(Color.parseColor("#008000"));
                names[0] =  names[0].replace("Time", null);
            }
            if (name.equals("Reality")) {
                tf1.setBackgroundColor(Color.parseColor("#FF0000"));
                names[0] =  names[0].replace("Reality", null);
            }
            if (name.equals("Soul")) {
                tf1.setBackgroundColor(Color.parseColor("#FF8C00"));
                names[0] =  names[0].replace("Soul", null);
            }
            if (name.equals("Mind")) {
                tf1.setBackgroundColor(Color.parseColor("#FFFF00"));
                names[0] =  names[0].replace("Mind", null);
            }
        }
        int count=0;
        String res = (String)tf2.getText();
        for(int i=0; i<res.length(); i++){
            if(res.charAt(i) == ' '){
                count++;
            }
        }
        if(count == 6){
            System.out.print("ALL THE STONES HAVE BEEN COLLECTED");
        }

    }


    public void resetTf(View v) {
        TextView tf1 = (TextView) findViewById(R.id.textView2);
        TextView tf2 = (TextView) findViewById(R.id.textView3);
        tf1.setText("");
        tf2.setText("");
    }
}

