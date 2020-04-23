package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class settingActivity extends AppCompatActivity {

    SwitchCompat switch_1 , switch_2 , switch_3 , switch_4 ;
    boolean stateSwitch1 , stateSwitch2 , stateSwitch3 , stateSwitch4 ;

    @Override
    protected void onCreate(bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContestView(R.layout.activity_settings);

        final SharePreferences preferences = getSharedPrferences("PRESS",0);
        stateSwitch1 = preferences.getBoolean("switch1" , false);
        stateSwitch2 = preferences.getBoolean("switch2" , false);
        stateSwitch3 = preferences.getBoolean("switch3" , false);
        stateSwitch4 = preferences.getBoolean("switch4" , false);

        switch_1 = (SwitchCompat) findViewById(R.id.switch_1);
        switch_2 = (SwitchCompat) findViewById(R.id.switch_2);
        switch_3 = (SwitchCompat) findViewById(R.id.switch_3);
        switch_4 = (SwitchCompat) findViewById(R.id.switch_4);

        switch_1.setChecked(stateSwitch1);
        switch_2.setChecked(stateSwitch2);
        switch_3.setChecked(stateSwitch3);
        switch_4.setChecked(stateSwitch4);

        switch_1.setOnClicklistner(new View.onClickListner() {
            @Override
            public void onClick(View v)

                stateSwitch1 = !stateSwitch1 ;
                switch_1.setChecked(stateSwitch1);
                SharedPreferences.Editor editor = preferences.edit();
                editor.putBoolean("switch1", stateSwitch1);
                editor.apply();
            }
        });

        switch_2.setOnClicklistner(new View.onClickListner() {
            @Override
            public void onClick(View v)

            stateSwitch1 = !stateSwitch1 ;
            switch_2.setChecked(stateSwitch2);
            SharedPreferences.Editor editor = preferences.edit();
            editor.putBoolean("switch2", stateSwitch2);
            editor.apply();
        }
    });
        switch_3.setOnClicklistner(new View.onClickListner() {
                @Override
                public void onClick(View v)

                        stateSwitch3 = !stateSwitch3 ;
                        switch_3.setChecked(stateSwitch3);
                        SharedPreferences.Editor editor = preferences.edit();
                        editor.putBoolean("switch3", stateSwitch3);
                        editor.apply();
                        }
                });

        switch_4.setOnClicklistner(new View.onClickListner() {
                @Override
                public void onClick(View v)

                        stateSwitch4 = !stateSwitch4 ;
                        switch_4.setChecked(stateSwitch4);
                        SharedPreferences.Editor editor = preferences.edit();
                        editor.putBoolean("switch4", stateSwitch4);
                        editor.apply();
                        }
                });

    }

}