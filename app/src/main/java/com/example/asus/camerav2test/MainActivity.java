package com.example.asus.camerav2test;


import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends MPermissionsActivity{
    TipsConfig tipsConfig = new TipsConfig("100",1,100,300,400,100);
    PhotoObj photoObj = new PhotoObj(true,300,400,50,true,true,"未发现人脸",true,true,tipsConfig);
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        ImageButton imageButton = (ImageButton) findViewById(R.id.play);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                takePicture(photoObj);
            }
        });
    }


    public void takePicture(PhotoObj photoObj){
        Intent intent=new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent);
    }
}
