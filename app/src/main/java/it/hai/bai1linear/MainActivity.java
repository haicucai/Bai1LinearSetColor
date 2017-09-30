package it.hai.bai1linear;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private RadioGroup group;
    private RadioButton rbtnred, rbtnwhite, rbtnblue;
    private Button setcolor, clear;
    private TextView tvlarge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inialize();

        setcolor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rbtnred.isChecked()==true){
                    tvlarge.setBackgroundColor(Color.RED);
                }
                if (rbtnwhite.isChecked() == true) {
                    tvlarge.setBackgroundColor(Color.GREEN);

                }
                if (rbtnblue.isChecked() == true) {
                    tvlarge.setBackgroundColor(Color.BLUE);

                }
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                group.clearCheck();
tvlarge.setBackgroundColor(Color.BLACK);
            }
        });

    }


    private void inialize() {
        tvlarge = (TextView) findViewById(R.id.tvlarge);
        group = (RadioGroup) findViewById(R.id.rdg1);
        rbtnred = (RadioButton) this.findViewById(R.id.rbtn1);
        rbtnwhite = (RadioButton) this.findViewById(R.id.rbtn2);
        rbtnblue = (RadioButton) this.findViewById(R.id.rbtn3);
        setcolor = (Button) findViewById(R.id.btn1);
        clear = (Button) findViewById(R.id.btn2);
    }
}