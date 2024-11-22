package com.example.helloworldandroid;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        this
            //.ViewDefault()
            //.View_Layout1_Main1()
            //.View_Layout2_Main2()
            .View_Layout3_Main3()
        ;
    }
    public MainActivity ViewDefault()
    {
        setContentView(R.layout.activity_main);
        //setContentView(R.layout.layout1);
        ViewCompat.setOnApplyWindowInsetsListener(
            findViewById(R.id.main),
            //findViewById(R.id.main1),
            (v, insets) -> {
                Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
                return insets;
            }
        );
        return this;
    }
    public MainActivity View_Layout1_Main1()
    {
        setContentView(R.layout.layout1);
        ViewCompat.setOnApplyWindowInsetsListener(
                findViewById(R.id.main1),
                (v, insets) -> {
                    Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
                    v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
                    return insets;
                }
        );
        return this;
    }
    public MainActivity View_Layout2_Main2()
    {
        setContentView(R.layout.layout2);
        ViewCompat.setOnApplyWindowInsetsListener(
                findViewById(R.id.main2),
                (v, insets) -> {
                    Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
                    v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
                    return insets;
                }
        );
        return this;
    }
    public MainActivity View_Layout3_Main3()
    {
        setContentView(R.layout.layout3);
        ViewCompat.setOnApplyWindowInsetsListener(
                findViewById(R.id.main3),
                (v, insets) -> {
                    Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
                    v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
                    return insets;
                }
        );
        return this;
    }
}