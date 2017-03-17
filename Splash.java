package com.example.anew.video_splash;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Environment;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.VideoView;

public class Splash extends Activity {

   // VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        try {
            VideoView videoView=new VideoView(this);
            setContentView(videoView);
            Uri path=Uri.parse("android resource://"+getPackageName()+"/"+R.raw.splashfinalw);
            videoView.setVideoURI(path);
            videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    jump();
                }
            });
            videoView.start();
        }catch (Exception e){
            jump();
        }
//        super.onCreate(savedInstanceState);
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

//        setContentView(R.layout.activity_main);
//       getSupportActionBar().hide();
//
//        videoView=(VideoView)findViewById(R.id.videoView);
//
//        Uri video= Uri.parse("android.resourse://com.example.anew.video_splash/"+R.raw.splashfinalw);
//
//        videoView.setVideoURI(video);
//
//        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//            @Override
//            public void onCompletion(MediaPlayer mp) {
//                if(isFinishing())
//                    return;
//
//startActivity(new Intent(Splash.this,HomeActivity.class));
//                finish();
//            }
//        });
//        videoView.start();



         }
    private void jump(){
if (isFinishing())
    return;
        startActivity(new Intent(this,HomeActivity.class));
        finish();
    }
}
