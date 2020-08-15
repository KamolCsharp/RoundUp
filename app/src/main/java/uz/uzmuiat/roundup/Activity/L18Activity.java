package uz.uzmuiat.roundup.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.Toast;

import uz.uzmuiat.roundup.R;

public class L18Activity extends AppCompatActivity {

    EditText tx2, tx3, tx4, tx5, tx6, tx7, tx8, tx9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_l18);
        tx2 = findViewById(R.id.lessonA18_2);
        tx3 = findViewById(R.id.lessonA18_3);
        tx4 = findViewById(R.id.lessonA18_4);
        tx5 = findViewById(R.id.lessonA18_5);
        tx6 = findViewById(R.id.lessonA18_6);
        tx7 = findViewById(R.id.lessonA18_7);
        tx8 = findViewById(R.id.lessonA18_8);
        tx9 = findViewById(R.id.lessonA18_9);

        tx2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (tx2.getText().toString().toLowerCase().equals("apple")) {
                    tx2.setTextColor(Color.GREEN);
                    tx2.setEnabled(false);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        tx3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (tx3.getText().toString().toLowerCase().equals("umbrella")) {
                    tx3.setTextColor(Color.GREEN);
                    tx3.setEnabled(false);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        tx4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (tx4.getText().toString().toLowerCase().equals("hat")) {
                    tx4.setEnabled(false);
                    tx4.setTextColor(Color.GREEN);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        tx5.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (tx5.getText().toString().toLowerCase().equals("man")) {
                    tx5.setTextColor(Color.GREEN);
                    tx5.setEnabled(false);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        tx6.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (tx6.getText().toString().toLowerCase().equals("jam")) {
                    tx6.setEnabled(false);
                    tx6.setTextColor(Color.GREEN);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        tx7.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (tx7.getText().toString().toLowerCase().equals("queen")) {
                    tx7.setTextColor(Color.GREEN);
                    tx7.setEnabled(false);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        tx8.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (tx8.getText().toString().toLowerCase().equals("lemon")) {
                    tx8.setTextColor(Color.GREEN);
                    tx8.setEnabled(false);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        tx9.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (tx9.getText().toString().toLowerCase().equals("watch")) {
                    tx9.setEnabled(false);
                    tx9.setTextColor(Color.GREEN);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}