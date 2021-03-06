package com.example.asus.camerav2test;
/**
 * 接下来的任务：1、定义photoobj对象，实现可以通过对photoobj对象参数的设置来完成对系统功能的调整
 * 2、通过第三方sdk为相机添加人脸识别功能，能够智能识别人脸。能够判断摄像头范围内有无人头像
 * 3、对相机大小实现可调整化，能够实现相机拍完照之后照片大小的调整。
 * 4、对相机拍完照片之后的照片能够实现拖动剪切功能。
 */

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends MPermissionsActivity {
    TipsConfig tipsConfig = new TipsConfig("100", 1, 100, 300, 400, 100);
    PhotoObj photoObj = new PhotoObj(true, 300, 400, 50, true, true, "未发现人脸", true, true, tipsConfig, "0");
    Bitmap bitmap = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
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

    //photoObj对象作为参数传递对象传到SecondActivity中
    public void takePicture(PhotoObj photoObj) {
        Bitmap bitmap = null;
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        Bundle mBundle = new Bundle();
        mBundle.putSerializable("photoObj", photoObj);
        intent.putExtras(mBundle);
        startActivityForResult(intent, 11);
        Log.e("完成", "完成");
        //startActivity(intent);
        /*=1;
        //star
        int flagtActivityForResult(intent,0);
        while(flag==1){
            bitmap = getIntent().getParcelableExtra("bitmap");
            if(bitmap!=null){
                flag=0;
                Log.e("图片信息","定位位置");
                Log.e("bitmap",bitmap.toString());
            }
        }*/
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
//        bitmap = data.getParcelableExtra("bitmap");
        Log.e("MainActivity的bitmap", ">>>>>>>>>>>>>>>>");

//        if (requestCode == 11 && resultCode == 12) {
//            bitmap = data.getParcelableExtra("bitmap");
//            Log.e("MainActivity的bitmap", bitmap.toString());
//        }

    }


}
