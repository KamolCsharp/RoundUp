package uz.uzmuiat.roundup.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

import uz.uzmuiat.roundup.R;

import static uz.uzmuiat.roundup.Database.Lesson.convertFormat;

public class L19Activity extends AppCompatActivity {
    TextView time1, time2;
    SeekBar seekBar;
    MaterialButton mbPlay, mbPause;
    MediaPlayer mediaPlayer;
    Handler handler = new Handler();
    Runnable runnable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_l19);

        time1 = findViewById(R.id.audioTime19_1);
        time2 = findViewById(R.id.audioTime19_2);
        seekBar = findViewById(R.id.seekbar19);
        mbPlay = findViewById(R.id.btnPlay19);
        mbPause = findViewById(R.id.btnPause19);
        mediaPlayer = MediaPlayer.create(this, R.raw.audio1_8);
        mbPause.setVisibility(View.GONE);
        runnable = new Runnable() {
            @Override
            public void run() {
                seekBar.setProgress(mediaPlayer.getCurrentPosition());
                handler.postDelayed(this, 1000);
            }
        };

        int vaqti = mediaPlayer.getDuration();
        String sTime2 = convertFormat(vaqti);
        time2.setText(sTime2);
        mbPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mbPlay.setVisibility(View.GONE);
                mbPause.setVisibility(View.VISIBLE);
                mediaPlayer.start();
                seekBar.setMax(mediaPlayer.getDuration());
                handler.postDelayed(runnable, 0);
            }
        });

        mbPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mbPause.setVisibility(View.GONE);
                mbPlay.setVisibility(View.VISIBLE);
                mediaPlayer.pause();
                handler.removeCallbacks(runnable);
            }
        });

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (fromUser) {
                    mediaPlayer.seekTo(progress);
                }
                time1.setText( convertFormat(mediaPlayer.getCurrentPosition()));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mbPause.setVisibility(View.GONE);
                mbPlay.setVisibility(View.VISIBLE);
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