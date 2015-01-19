package com.tangankanan.ibadahyuk;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
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
        AlertDialog.Builder saveConfirmationBuilder = new AlertDialog.Builder(this);
        saveConfirmationBuilder.setMessage("Are you sure you want to save?");
        saveConfirmationBuilder.setCancelable(true);
        saveConfirmationBuilder.setPositiveButton("Yes",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Intent i = new Intent(getBaseContext(), MainActivity.class);
                        startActivity(i);
                        //Remove activity
                        finish();
                    }
                });
        saveConfirmationBuilder.setNegativeButton("No",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });

        AlertDialog alert11 = saveConfirmationBuilder.create();
        alert11.show();
    }
}
