package com.xujiading.vibrationreading;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class SettingsActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        String t1="500",t3="2000",t2="1000";
        try {
            Intent intent = getIntent();
            Bundle bundle = intent.getExtras();
            String data1 = bundle.getString("t1");
            String data2 = bundle.getString("t2");
            String data3 = bundle.getString("t3");
            t1 = data1;
            t2 = data2;
            t3 = data3;
        }
        catch(Exception e)
        {}
        finally {
            EditText editText1 = (EditText) findViewById(R.id.editText);
            EditText editText2 = (EditText) findViewById(R.id.editText2);
            EditText editText3 = (EditText) findViewById(R.id.editText3);
            editText1.setText(t1);
            editText2.setText(t3);
            editText3.setText(t2);
        }
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                String time1;
                String time2;
                String time3;
                EditText editText1 =(EditText)findViewById(R.id.editText);
                EditText editText2 =(EditText)findViewById(R.id.editText2);
                EditText editText3 =(EditText)findViewById(R.id.editText3);
                time1=editText1.getText().toString();
                time2=editText2.getText().toString();
                time3=editText3.getText().toString();
                Intent intent = new Intent(SettingsActivity.this, MainActivity.class);
                Bundle bundle = new Bundle();
                bundle.putCharSequence("time1", time1);
                bundle.putCharSequence("time2", time3);
                bundle.putCharSequence("time3", time2);
                intent.putExtras(bundle);
                startActivity(intent);
                finish();
            }
        });
    }
}
