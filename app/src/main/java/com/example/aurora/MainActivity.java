package com.example.aurora;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * This class functions as the launching activity of the AURORA app.
 * It is only responsible for displaying the three themes and is responsible for starting the three other activities accordingly.
 */

public class MainActivity extends AppCompatActivity {

   //UI widgets
    private ImageView personalPeacePlayBtn;
    private ImageView forestThemePlayBtn;
    private ImageView oceanThemePlayBtn;
    private TextView theme1;
    private TextView theme2;
    private TextView theme3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializePlayButtons();
        initializeThemeTitles();
        startPersonalTheme();
        startOceanTheme();
        startForestTheme();
    }

    /**
     * The following sections of code contains helper methods to set up GUI elements
     */
    void initializePlayButtons() {
        personalPeacePlayBtn = findViewById(R.id.play_personal_theme_icon);
        forestThemePlayBtn = findViewById(R.id.play_forest_theme_icon2);
        oceanThemePlayBtn = findViewById(R.id.play_ocean_them_icon3);
    }

    void initializeThemeTitles(){
        theme1 = findViewById(R.id.theme1_title);
        theme2 = findViewById(R.id.theme2_title);
        theme3 = findViewById(R.id.theme3_title);
    }

    /**
     * The following sections of code contains helper methods to start the three different theme when UI widgets are being clicked on
     */

    void startPersonalTheme(){
        personalPeacePlayBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent personalThemeIntent = new Intent(MainActivity.this, PersonalThemeActivity.class );
                startActivity(personalThemeIntent);
            }

        });


        theme1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent theme1Intent = new Intent(MainActivity.this, PersonalThemeActivity.class);
                startActivity(theme1Intent);
            }

        });
    }

    void startOceanTheme(){
        oceanThemePlayBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent oceanThemeIntent = new Intent(MainActivity.this, OceanThemeActivity.class );
                startActivity(oceanThemeIntent);
            }

        });
        theme3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent oceanThemeIntent = new Intent(MainActivity.this, OceanThemeActivity.class);
                startActivity(oceanThemeIntent);
            }
        });
    }

    void startForestTheme(){
        forestThemePlayBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent forestThemeIntent = new Intent(MainActivity.this, ForestThemeActivity.class );
                startActivity(forestThemeIntent);
            }

        });

        theme2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent forestThemeIntent = new Intent(MainActivity.this, ForestThemeActivity.class);
                startActivity(forestThemeIntent);
            }
        });
    }

}
