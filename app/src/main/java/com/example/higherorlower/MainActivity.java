package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public void makeToast(String string){
        Toast.makeText(MainActivity.this, string, Toast.LENGTH_SHORT).show();
    }
    int randomNumber;
    public void guess(View view){
        EditText editText=findViewById(R.id.editTextNumber);
        int guessInt=Integer.parseInt(editText.getText().toString());
        if (guessInt>randomNumber) {

         makeToast("Higher");
        }
        else if (guessInt<randomNumber){
            makeToast("Lower");
        }
        else {
            makeToast("That's Right! Try Again!");
            Random random = new Random();
            randomNumber= random.nextInt(20)+1;
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random random = new Random();
        randomNumber= random.nextInt(20)+1;
    }
}