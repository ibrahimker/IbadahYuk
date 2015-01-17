package com.tangankanan.ibadahyuk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;


public class UserSettingActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_setting);
        final Spinner spinner = (Spinner) findViewById(R.id.spinnerGender);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                String temp = spinner.getSelectedItem().toString();
                ImageView imageView = (ImageView) findViewById(R.id.gambarUser);
                if(temp.equals("Perempuan")){
                    imageView.setImageResource(R.drawable.char_cewe);
                }
                else{
                    imageView.setImageResource(R.drawable.char_cowo);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });
    }

    public void saveButton(View v){
        Intent i=new Intent(getBaseContext(),SplashScreenActivity.class);
        startActivity(i);
        //Remove activity
        finish();
    }
}
