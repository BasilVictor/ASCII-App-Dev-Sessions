package com.ascii.asciiappdevsession;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    TextView nameTxt;
    Button submitBtn;
    TextInputEditText nameTet;
    SwitchMaterial darkSwitch;
    FloatingActionButton listFab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        nameTxt = (TextView) findViewById(R.id.name_txt);
//        nameTet = (TextInputEditText) findViewById(R.id.name_tet);
//        submitBtn = (Button) findViewById(R.id.submit_btn);
//        darkSwitch = (SwitchMaterial) findViewById(R.id.dark_switch);
//        listFab = (FloatingActionButton) findViewById(R.id.list_fab);

//        submitBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                nameTxt.setText(nameTet.getText());
//                nameTet.setText(null);
//                nameTet.clearFocus();
//            }
//        });

//        darkSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
//                if(isChecked) {
//                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
//                }
//                else
//                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
//            }
//        });

//        listFab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "To be implemented", Toast.LENGTH_SHORT).show();
//            }
//        });

//        nameTxt.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "TextViews are also clickable", Toast.LENGTH_SHORT).show();
//            }
//        });

    }
}