package com.example.m8_sprint3_amatbruno;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    //ATRIBUTES DECLARATION
    private ImageView imageView;
    private EditText editText1;
    private EditText editText2;
    private Button button;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //DATA BINDING IMAGEVIEW
        imageView = findViewById(R.id.imageView);
        imageView.setImageDrawable(getDrawable(R.drawable.bitmapstardew));

        //DATA BINDING EDITTEXT
        editText1 = findViewById(R.id.editTextNumber);
        editText2 = findViewById(R.id.editTextNumber2);

    }

    //WHEN WE CLICK THE BUTTON, THE SECTION TYPED BY ROWS AND COLS LOADS
    public void buttonImageBitmap(View view){
        visualizeSections();
    }


    //FUNCTION TO GET THE IMAGE BY SECTIONS
    public void visualizeSections() {

        int row, col;

        row= Integer.parseInt(editText1.getText().toString());
        col= Integer.parseInt(editText2.getText().toString());


        Bitmap stardew = BitmapFactory.decodeResource(getResources(),R.drawable.bitmapstardew);

        stardew = Bitmap.createBitmap(stardew,
                col*stardew.getWidth()/3,
                row*stardew.getHeight()/3,
                stardew.getWidth()/3,
                stardew.getHeight()/3);

        ImageView imageView = findViewById(R.id.imageView);
        imageView.setImageBitmap(stardew);
    }

}