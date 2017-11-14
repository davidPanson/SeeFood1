package com.github.seefood;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;




public class MainActivity extends Activity {

    Button settingsButton;
    Button galleryButton;
    Button cameraButton;
    Button resultsButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addListenerOnSettingsButton();
        addListenerOnCameraButton();
        addListenerOnResultsButton();
        addListenerOnGalleryButton();

    }

    public void addListenerOnSettingsButton() {

        settingsButton = (Button) findViewById(R.id.settingsButton);
        settingsButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent browserIntent =
                        new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
                startActivity(browserIntent);
            }
        }); //onClickListener
    }//end AddListenerOnButton

    public void addListenerOnCameraButton() {

        cameraButton = (Button) findViewById(R.id.cameraButton);
        cameraButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent browserIntent =
                        new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
                startActivity(browserIntent);
            }
        }); //onClickListener
    }//end AddListenerOnButton

    public void addListenerOnResultsButton() {

        resultsButton = (Button) findViewById(R.id.resultsButton);
        resultsButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent browserIntent =
                        new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
                startActivity(browserIntent);
            }
        }); //onClickListener
    }//end AddListenerOnButton

    public void addListenerOnGalleryButton() {

        galleryButton = (Button) findViewById(R.id.galleryButton);
        galleryButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent browserIntent =
                        new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
                startActivity(browserIntent);
            }
        }); //onClickListener
    }//end AddListenerOnButton

} //end MainActivity