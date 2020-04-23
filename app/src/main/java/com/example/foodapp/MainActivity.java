package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

        button b_settings;

        RatingBar ratingBar;
        Button btsubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b_settings = (Button) findViewById(R.id.b_settings);
        b_settings.setOnClickListner)(new View.OnClickListner(){
            @Override
                    public void onClick(view v){

                    Intest intest = new Intest(getApplicationContext(), settingActivity.class);
                    startActivity(Lbtens);
            }
            ) } ;

        ratingBar = findViewById(R.id.rating_bar);
        btsubmit = findViewById(R.id.bt_submit);

        btsubmit.setOnClickListener(new View.onClickListener(){

            @Override
            public void onClick(View v){

                String a = String.valueOf(ratingBar.getRating());
                Toast.makeText(getApplicationContext(), text a+"Star",Toast.LENGTH_SHORT).show)();

            }

        });
    }
}
