package com.xujiading.vibrationreading;

import android.app.AlertDialog;
import android.os.SystemClock;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.app.Service;
import android.os.Vibrator;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Vibrator vibrator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);
        findViewById(R.id.button2).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                int time1=500;
                int time2=1000;
                int time3=2000;
                try {
                    Intent intent = getIntent();
                    Bundle bundle = intent.getExtras();
                    String data = bundle.getString("time1");
                    time1 = Integer.parseInt(data);
                    data = bundle.getString("time2");
                    time2 = Integer.parseInt(data);
                    data = bundle.getString("time3");
                    time3 = Integer.parseInt(data);
                }
                catch(Exception e)
                {}
                finally {
                    Intent intent2 = new Intent(MainActivity.this, SettingsActivity.class);
                    Bundle bundle2 = new Bundle();
                    String t1 = Integer.toString(time1);
                    String t2 = Integer.toString(time2);
                    String t3 = Integer.toString(time3);
                    bundle2.putCharSequence("t1", t1);
                    bundle2.putCharSequence("t2", t2);
                    bundle2.putCharSequence("t3", t3);
                    intent2.putExtras(bundle2);
                    startActivity(intent2);
                    finish();
                }
            }
        });
        findViewById(R.id.button).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                EditText editText1 = (EditText) findViewById(R.id.editText4);
                if ( editText1.getText().toString().trim().equals("") ) {
                    new AlertDialog.Builder(MainActivity.this)
                            .setTitle("警告").setMessage("输入不能为空，请重新输入！！！")
                            .setPositiveButton("确定", null).show();
                    return;
                }
                else {
                    Thread thread=new Thread(new Runnable()
                    {
                        @Override
                        public void run()
                        {
                            EditText editText2 = (EditText) findViewById(R.id.editText4);
                            String et2=editText2.getText().toString();
                            int time1=500;
                            int time2=1000;
                            int time3=2000;
                            try {
                                Intent intent = getIntent();
                                Bundle bundle = intent.getExtras();
                                String data = bundle.getString("time1");
                                time1 = Integer.parseInt(data);
                                data = bundle.getString("time2");
                                time2 = Integer.parseInt(data);
                                data = bundle.getString("time3");
                                time3 = Integer.parseInt(data);
                            }
                            catch(Exception e)
                            {}
                            finally {
                                for (int i = 0; i < et2.length(); i++) {
                                    char item = et2.charAt(i);
                                    if ( item == 'a' || item == 'A' ) {
                                        vibrator.vibrate(time1);
                                        SystemClock.sleep(1000);
                                        vibrator.vibrate(time2);
                                        SystemClock.sleep(time3);
                                    }
                                    else if ( item == 'b' || item == 'B' ) {
                                        vibrator.vibrate(time2);
                                        SystemClock.sleep(1500);
                                        vibrator.vibrate(time1);
                                        SystemClock.sleep(1000);
                                        vibrator.vibrate(time1);
                                        SystemClock.sleep(1000);
                                        vibrator.vibrate(time1);
                                        SystemClock.sleep(time3);
                                    }
                                    else if ( item == 'c' || item == 'C' ) {
                                        vibrator.vibrate(time2);
                                        SystemClock.sleep(1500);
                                        vibrator.vibrate(time1);
                                        SystemClock.sleep(1000);
                                        vibrator.vibrate(time2);
                                        SystemClock.sleep(1500);
                                        vibrator.vibrate(time1);
                                        SystemClock.sleep(time3);
                                    }
                                    else if ( item == 'd' || item == 'D' ) {
                                        vibrator.vibrate(time2);
                                        SystemClock.sleep(1500);
                                        vibrator.vibrate(time1);
                                        SystemClock.sleep(1000);
                                        vibrator.vibrate(time1);
                                        SystemClock.sleep(time3);
                                    }
                                    else if ( item == 'e' || item == 'E' ) {
                                        vibrator.vibrate(time1);
                                        SystemClock.sleep(time3);
                                    }
                                    else if ( item == 'f' || item == 'F' ) {
                                        vibrator.vibrate(time1);
                                        SystemClock.sleep(1000);
                                        vibrator.vibrate(time1);
                                        SystemClock.sleep(1000);
                                        vibrator.vibrate(time2);
                                        SystemClock.sleep(1500);
                                        vibrator.vibrate(time1);
                                        SystemClock.sleep(time3);
                                    }
                                    else if ( item == 'g' || item == 'G' ) {
                                        vibrator.vibrate(time2);
                                        SystemClock.sleep(1500);
                                        vibrator.vibrate(time2);
                                        SystemClock.sleep(1500);
                                        vibrator.vibrate(time1);
                                        SystemClock.sleep(time3);
                                    }
                                    else if ( item == 'h' || item == 'H' ) {
                                        vibrator.vibrate(time1);
                                        SystemClock.sleep(1000);
                                        vibrator.vibrate(time1);
                                        SystemClock.sleep(1000);
                                        vibrator.vibrate(time1);
                                        SystemClock.sleep(1000);
                                        vibrator.vibrate(time1);
                                        SystemClock.sleep(time3);
                                    }
                                    else if ( item == 'i' || item == 'I' ) {
                                        vibrator.vibrate(time1);
                                        SystemClock.sleep(1000);
                                        vibrator.vibrate(time1);
                                        SystemClock.sleep(time3);
                                    }
                                    else if ( item == 'j' || item == 'J' ) {
                                        vibrator.vibrate(time1);
                                        SystemClock.sleep(1000);
                                        vibrator.vibrate(time2);
                                        SystemClock.sleep(1500);
                                        vibrator.vibrate(time2);
                                        SystemClock.sleep(1500);
                                        vibrator.vibrate(time2);
                                        SystemClock.sleep(time3);
                                    }
                                    else if ( item == 'k' || item == 'K' ) {
                                        vibrator.vibrate(time2);
                                        SystemClock.sleep(1500);
                                        vibrator.vibrate(time1);
                                        SystemClock.sleep(1000);
                                        vibrator.vibrate(time2);
                                        SystemClock.sleep(time3);
                                    }
                                    else if ( item == 'l' || item == 'L' ) {
                                        vibrator.vibrate(time1);
                                        SystemClock.sleep(1000);
                                        vibrator.vibrate(time2);
                                        SystemClock.sleep(1500);
                                        vibrator.vibrate(time1);
                                        SystemClock.sleep(1000);
                                        vibrator.vibrate(time1);
                                        SystemClock.sleep(time3);
                                    }
                                    else if ( item == 'm' || item == 'M' ) {
                                        vibrator.vibrate(time2);
                                        SystemClock.sleep(1500);
                                        vibrator.vibrate(time2);
                                        SystemClock.sleep(time3);
                                    }
                                    else if ( item == 'n' || item == 'N' ) {
                                        vibrator.vibrate(time2);
                                        SystemClock.sleep(1500);
                                        vibrator.vibrate(time1);
                                        SystemClock.sleep(time3);
                                    }
                                    else if ( item == 'o' || item == 'O' ) {
                                        vibrator.vibrate(time2);
                                        SystemClock.sleep(1500);
                                        vibrator.vibrate(time2);
                                        SystemClock.sleep(1500);
                                        vibrator.vibrate(time2);
                                        SystemClock.sleep(time3);
                                    }
                                    else if ( item == 'p' || item == 'P' ) {
                                        vibrator.vibrate(time1);
                                        SystemClock.sleep(1000);
                                        vibrator.vibrate(time2);
                                        SystemClock.sleep(1500);
                                        vibrator.vibrate(time2);
                                        SystemClock.sleep(1500);
                                        vibrator.vibrate(time1);
                                        SystemClock.sleep(time3);
                                    }
                                    else if ( item == 'q' || item == 'Q' ) {
                                        vibrator.vibrate(time2);
                                        SystemClock.sleep(1500);
                                        vibrator.vibrate(time2);
                                        SystemClock.sleep(1500);
                                        vibrator.vibrate(time1);
                                        SystemClock.sleep(1000);
                                        vibrator.vibrate(time2);
                                        SystemClock.sleep(time3);
                                    }
                                    else if ( item == 'r' || item == 'R' ) {
                                        vibrator.vibrate(time1);
                                        SystemClock.sleep(1000);
                                        vibrator.vibrate(time2);
                                        SystemClock.sleep(1500);
                                        vibrator.vibrate(time1);
                                        SystemClock.sleep(time3);
                                    }
                                    else if ( item == 's' || item == 'S' ) {
                                        vibrator.vibrate(time1);
                                        SystemClock.sleep(1000);
                                        vibrator.vibrate(time1);
                                        SystemClock.sleep(1000);
                                        vibrator.vibrate(time1);
                                        SystemClock.sleep(time3);
                                    }
                                    else if ( item == 't' || item == 'T' ) {
                                        vibrator.vibrate(time2);
                                        SystemClock.sleep(time3);
                                    }
                                    else if ( item == 'u' || item == 'U' ) {
                                        vibrator.vibrate(time1);
                                        SystemClock.sleep(1000);
                                        vibrator.vibrate(time1);
                                        SystemClock.sleep(1000);
                                        vibrator.vibrate(time2);
                                        SystemClock.sleep(time3);
                                    }
                                    else if ( item == 'v' || item == 'V' ) {
                                        vibrator.vibrate(time1);
                                        SystemClock.sleep(1000);
                                        vibrator.vibrate(time1);
                                        SystemClock.sleep(1000);
                                        vibrator.vibrate(time1);
                                        SystemClock.sleep(1000);
                                        vibrator.vibrate(time2);
                                        SystemClock.sleep(time3);
                                    }
                                    else if ( item == 'w' || item == 'W' ) {
                                        vibrator.vibrate(time1);
                                        SystemClock.sleep(1000);
                                        vibrator.vibrate(time2);
                                        SystemClock.sleep(1500);
                                        vibrator.vibrate(time2);
                                        SystemClock.sleep(time3);
                                    }
                                    else if ( item == 'x' || item == 'X' ) {
                                        vibrator.vibrate(time2);
                                        SystemClock.sleep(1500);
                                        vibrator.vibrate(time1);
                                        SystemClock.sleep(1000);
                                        vibrator.vibrate(time1);
                                        SystemClock.sleep(1000);
                                        vibrator.vibrate(time2);
                                        SystemClock.sleep(time3);
                                    }
                                    else if ( item == 'y' || item == 'Y' ) {
                                        vibrator.vibrate(time2);
                                        SystemClock.sleep(1500);
                                        vibrator.vibrate(time1);
                                        SystemClock.sleep(1000);
                                        vibrator.vibrate(time2);
                                        SystemClock.sleep(1500);
                                        vibrator.vibrate(time2);
                                        SystemClock.sleep(time3);
                                    }
                                    else if ( item == 'z' || item == 'Z' ) {
                                        vibrator.vibrate(time2);
                                        SystemClock.sleep(1500);
                                        vibrator.vibrate(time2);
                                        SystemClock.sleep(1500);
                                        vibrator.vibrate(time1);
                                        SystemClock.sleep(1000);
                                        vibrator.vibrate(time1);
                                        SystemClock.sleep(time3);
                                    }
                                    else if ( item == '1'  ) {
                                        vibrator.vibrate(time1);
                                        SystemClock.sleep(1000);
                                        vibrator.vibrate(time2);
                                        SystemClock.sleep(1500);
                                        vibrator.vibrate(time2);
                                        SystemClock.sleep(1500);
                                        vibrator.vibrate(time2);
                                        SystemClock.sleep(1000);
                                        vibrator.vibrate(time2);
                                        SystemClock.sleep(time3);
                                    }
                                    else if ( item == '2'  ) {
                                        vibrator.vibrate(time1);
                                        SystemClock.sleep(1000);
                                        vibrator.vibrate(time1);
                                        SystemClock.sleep(1000);
                                        vibrator.vibrate(time2);
                                        SystemClock.sleep(1500);
                                        vibrator.vibrate(time2);
                                        SystemClock.sleep(1500);
                                        vibrator.vibrate(time2);
                                        SystemClock.sleep(time3);
                                    }
                                    else if ( item == '3'  ) {
                                        vibrator.vibrate(time1);
                                        SystemClock.sleep(1000);
                                        vibrator.vibrate(time1);
                                        SystemClock.sleep(1000);
                                        vibrator.vibrate(time1);
                                        SystemClock.sleep(1000);
                                        vibrator.vibrate(time2);
                                        SystemClock.sleep(1500);
                                        vibrator.vibrate(time2);
                                        SystemClock.sleep(time3);
                                    }
                                    else if ( item == '4'  ) {
                                        vibrator.vibrate(time1);
                                        SystemClock.sleep(1000);
                                        vibrator.vibrate(time1);
                                        SystemClock.sleep(1000);
                                        vibrator.vibrate(time1);
                                        SystemClock.sleep(1000);
                                        vibrator.vibrate(time1);
                                        SystemClock.sleep(1000);
                                        vibrator.vibrate(time2);
                                        SystemClock.sleep(time3);
                                    }
                                    else if ( item == '5'  ) {
                                        vibrator.vibrate(time1);
                                        SystemClock.sleep(1000);
                                        vibrator.vibrate(time1);
                                        SystemClock.sleep(1000);
                                        vibrator.vibrate(time1);
                                        SystemClock.sleep(1000);
                                        vibrator.vibrate(time1);
                                        SystemClock.sleep(1000);
                                        vibrator.vibrate(time1);
                                        SystemClock.sleep(time3);
                                    }
                                    else if ( item == '6'  ) {
                                        vibrator.vibrate(time2);
                                        SystemClock.sleep(1500);
                                        vibrator.vibrate(time1);
                                        SystemClock.sleep(1000);
                                        vibrator.vibrate(time1);
                                        SystemClock.sleep(1000);
                                        vibrator.vibrate(time1);
                                        SystemClock.sleep(1000);
                                        vibrator.vibrate(time1);
                                        SystemClock.sleep(time3);
                                    }
                                    else if ( item == '7'  ) {
                                        vibrator.vibrate(time2);
                                        SystemClock.sleep(1500);
                                        vibrator.vibrate(time2);
                                        SystemClock.sleep(1500);
                                        vibrator.vibrate(time1);
                                        SystemClock.sleep(1000);
                                        vibrator.vibrate(time1);
                                        SystemClock.sleep(1000);
                                        vibrator.vibrate(time1);
                                        SystemClock.sleep(time3);
                                    }
                                    else if ( item == '8'  ) {
                                        vibrator.vibrate(time2);
                                        SystemClock.sleep(1500);
                                        vibrator.vibrate(time2);
                                        SystemClock.sleep(1500);
                                        vibrator.vibrate(time2);
                                        SystemClock.sleep(1500);
                                        vibrator.vibrate(time1);
                                        SystemClock.sleep(1000);
                                        vibrator.vibrate(time1);
                                        SystemClock.sleep(time3);
                                    }
                                    else if ( item == '9'  ) {
                                        vibrator.vibrate(time2);
                                        SystemClock.sleep(1500);
                                        vibrator.vibrate(time2);
                                        SystemClock.sleep(1500);
                                        vibrator.vibrate(time2);
                                        SystemClock.sleep(1500);
                                        vibrator.vibrate(time2);
                                        SystemClock.sleep(1500);
                                        vibrator.vibrate(time1);
                                        SystemClock.sleep(time3);
                                    }
                                    else if ( item == '0'  ) {
                                        vibrator.vibrate(time2);
                                        SystemClock.sleep(1500);
                                        vibrator.vibrate(time2);
                                        SystemClock.sleep(1500);
                                        vibrator.vibrate(time2);
                                        SystemClock.sleep(1500);
                                        vibrator.vibrate(time2);
                                        SystemClock.sleep(1500);
                                        vibrator.vibrate(time2);
                                        SystemClock.sleep(time3);
                                    }
                                }
                            }
                        }
                    });
                    thread.start();
                }
            }
        });
    }

}
