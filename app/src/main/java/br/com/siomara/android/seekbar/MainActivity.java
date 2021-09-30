package br.com.siomara.android.seekbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SeekBar seekBarHappiness = findViewById(R.id.seekBarHappiness);
        SeekBar seekBarUnhappiness = findViewById(R.id.seekBarUnhappiness);
        TextView happinessDisplay = findViewById(R.id.textViewHappinessDisplay);
        TextView unhappinessDisplay = findViewById(R.id.textViewUnhappinessDisplay);

        // Seek bar Happiness
        seekBarHappiness.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            // This method is called whenever the seek bar moves.
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                // TODO: Fix concatenation and use R.string instead.
                happinessDisplay.setText("Happiness progress changed: " + progress + "/" + seekBar.getMax());
            }

            @Override
            // This method is called when the seek bar is pressed.
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this, "HAPPINESS seek bar is pressed", Toast.LENGTH_SHORT ).show();
            }

            @Override
            // This method is called when the seek bar is NOT pressed.
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this, "HAPPINESS seek bar is not pressed", Toast.LENGTH_SHORT).show();
            }
        });

        // Seek bar Unhappiness
        seekBarUnhappiness.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            // This method is called whenever the seek bar moves.
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                // TODO: Fix concatenation and use R.string instead.
                unhappinessDisplay.setText("Unhappiness progress changed: " + progress + "/" + seekBar.getMax());
            }

            @Override
            // This method is called when the seek bar is pressed.
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this, "UNHAPPINESS seek bar is pressed", Toast.LENGTH_SHORT ).show();
            }

            @Override
            // This method is called when the seek bar is NOT pressed.
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this, "UNHAPPINESS seek bar is not pressed", Toast.LENGTH_SHORT ).show();
            }
        });
    }
}