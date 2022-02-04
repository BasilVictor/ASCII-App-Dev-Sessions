package com.ascii.asciiappdevsession;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    TextView level_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout_v_demo);

        level_1 = (TextView) findViewById(R.id.level_1);

        Snackbar snackbar = Snackbar.make(level_1, "Hello", Snackbar.LENGTH_INDEFINITE); // shows a snackbar indefinitely

        snackbar.setAction("DISMISS ME", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // defines what happens when action button in snackbar is clicked
                level_1.setText("Snackbar dismissed"); //changing the text of TextView on action click
                snackbar.dismiss();
            }
        });

        snackbar.show(); // finally show the snackbar
    }

    @Override
    public void onBackPressed() {
        AlertDialog dialog = new MaterialAlertDialogBuilder(MainActivity.this)
                .setTitle("EXIT?") //sets title of the dialog
                .setMessage("Are you sure you want to leave the app?") // sets message of the dialog
                .setCancelable(false) // this makes dialog non dismissible when clicked outside
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        // defines what happens when positive button clicked
                        MainActivity.super.onBackPressed(); // we are calling the onBackPressed method originally defined in AppCompatActivity
                        // by calling the super/parent method we are performing what normally would happen when back button was clicked
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        // defines what happens when negative button clicked
                        // cancel, dialog dismissed
                    }
                })
                .setNeutralButton("Show Toast", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        // defines what happens when neutral button clicked
                        Toast.makeText(MainActivity.this, "Neutral Button Clicked", Toast.LENGTH_SHORT).show();
                    }
                })
                .show();
    }
}