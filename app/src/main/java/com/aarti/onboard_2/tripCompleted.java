package com.aarti.onboard_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatRadioButton;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

public class tripCompleted extends AppCompatActivity {
    AppCompatRadioButton rbLeft,rbRight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trip_completed);

        rbLeft=findViewById(R.id.rbLeft);
        rbRight=findViewById(R.id.rbRight);


    }



    public void onRadioButtonClicked(View view) {
        boolean isSelected = ((AppCompatRadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.rbLeft:
                if (isSelected) {
                    rbLeft.setTextColor(Color.WHITE);
                    rbRight.setTextColor(getResources().getColor(R.color.colorPrimary));
                }
                break;

            case R.id.rbRight:

                if (isSelected) {
                    rbRight.setTextColor(Color.WHITE);
                    rbLeft.setTextColor(getResources().getColor(R.color.colorPrimary));

                }
                break;
        }

    }
}
