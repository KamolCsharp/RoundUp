package uz.uzmuiat.roundup.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import uz.uzmuiat.roundup.R;

public class L11Activity extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    Handler handler = new Handler();
    Runnable runnable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_l11);
        mediaPlayer = MediaPlayer.create(this, R.raw.audio1_1);
        runnable = new Runnable() {
            @Override
            public void run() {
                handler.postDelayed(this, 500);
            }
        };
        mediaPlayer.start();
        handler.postDelayed(runnable, 0);

        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mediaPlayer.seekTo(0);
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mediaPlayer.pause();
        handler.removeCallbacks(runnable);
    }
}