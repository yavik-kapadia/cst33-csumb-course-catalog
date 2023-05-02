package com.nimbuscloud.csumbcoursecatalog;

import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Window;
import android.widget.MediaController;
import android.widget.VideoView;
import androidx.appcompat.app.AppCompatActivity;

/**
 * An activity to show video file
 */
public class ShowVideoActivity extends AppCompatActivity
{
   VideoView videoView;

   @Override protected void onCreate(Bundle savedInstanceState)
   {

      super.onCreate(savedInstanceState);
      setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
      setContentView(R.layout.activity_show_video);

      if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
         getSupportActionBar().hide();
      }
      VideoView videoView = (VideoView) findViewById(R.id.VideoView);

      videoView.setVideoPath(
            "android.resource://" + getPackageName() + "/" +
                  R.raw.videoclip);
      videoView.start();
      MediaController mediaController = new MediaController(this);
      //link mediaController to videoView
      mediaController.setAnchorView(videoView);
      //allow mediaController to control our videoView
      videoView.setMediaController(mediaController);



   }
}