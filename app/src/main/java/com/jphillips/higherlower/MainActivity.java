package com.jphillips.higherlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    //Create the random number
    Random rand = new Random();
    int number = rand.nextInt(20) + 1;
    public void getGuessNumber(View view) {
        Toast.makeText(MainActivity.this, String.valueOf(number), Toast.LENGTH_LONG).show();
    }

    int userNumber= 0;

    EditText guessEditText=(EditText) findViewById( R.id.guessText);

     if (userNumber < guessInt){

    }
         int guessInt= Integer.parseInt(guessEditText.getText().toString())

          Toast.makeText(MainActivity.this, "Lower", Toast.LENGTH_SHORT).show();
           Toast.makeText(MainActivity.this, "Higher", Toast.LENGTH_SHORT).show();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



}
}
