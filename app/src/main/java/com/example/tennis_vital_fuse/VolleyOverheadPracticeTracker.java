package com.example.tennis_vital_fuse;

import androidx.appcompat.app.AppCompatActivity;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Button;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public class VolleyOverheadPracticeTracker extends AppCompatActivity{

    Button updateFNumUp1;
    Button updateFNumDown1;
    Button updateFNumUp2;
    Button updateFNumDown2;
    Button updateFNumUp3;
    Button updateFNumDown3;
    int sv = 0;
    int dv = 0;
    int oh = 0;
    double total = 0;
    double errorPercentSV = 0;
    double errorPercentDV = 0;
    double errorPercentOH = 0;

    protected void onCreate(Bundle savedInstanceState) {
        TextView svNum;
        TextView dvNum;
        TextView ohNum;
        TextView svNumPercent;
        TextView dvNumPercent;
        TextView ohNumPercent;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volley_overhead_practice_tracker);
        svNum = (TextView)findViewById(R.id.svNum);
        dvNum = (TextView)findViewById(R.id.dvNum);
        ohNum = (TextView)findViewById(R.id.ohNum);
        svNumPercent = (TextView)findViewById(R.id.svNumPercent);
        dvNumPercent = (TextView)findViewById(R.id.dvNumPercent);
        ohNumPercent = (TextView)findViewById(R.id.ohNumPercent);
        updateFNumUp1 = (Button)findViewById(R.id.plus1);
        updateFNumDown1 = (Button)findViewById(R.id.minus1);
        updateFNumUp2 = (Button)findViewById(R.id.plus2);
        updateFNumDown2 = (Button)findViewById(R.id.minus2);
        updateFNumUp3 = (Button)findViewById(R.id.plus3);
        updateFNumDown3 = (Button)findViewById(R.id.minus3);
        updateFNumUp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sv += 1;
                total += 1;
                errorPercentSV = (sv / total)*100;
                errorPercentDV = (dv / total)*100;
                errorPercentOH = (oh / total)*100;
                BigDecimal SVE = new BigDecimal(errorPercentSV).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal DVE = new BigDecimal(errorPercentDV).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal OHE = new BigDecimal(errorPercentOH).setScale(2,RoundingMode.HALF_DOWN);
                svNum.setText(""+sv);
                svNumPercent.setText(""+SVE.doubleValue()+"%");
                dvNumPercent.setText(""+DVE.doubleValue()+"%");
                ohNumPercent.setText(""+OHE.doubleValue()+"%");
            }
        });
        updateFNumDown1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sv -= 1;
                total -= 1;
                errorPercentSV = (sv / total)*100;
                errorPercentDV = (dv / total)*100;
                errorPercentOH = (oh / total)*100;
                BigDecimal SVE = new BigDecimal(errorPercentSV).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal DVE = new BigDecimal(errorPercentDV).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal OHE = new BigDecimal(errorPercentOH).setScale(2,RoundingMode.HALF_DOWN);
                svNum.setText(""+sv);
                svNumPercent.setText(""+SVE.doubleValue()+"%");
                dvNumPercent.setText(""+DVE.doubleValue()+"%");
                ohNumPercent.setText(""+OHE.doubleValue()+"%");
            }
        });
        updateFNumUp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dv += 1;
                total += 1;
                errorPercentSV = (sv / total)*100;
                errorPercentDV = (dv / total)*100;
                errorPercentOH = (oh / total)*100;
                BigDecimal SVE = new BigDecimal(errorPercentSV).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal DVE = new BigDecimal(errorPercentDV).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal OHE = new BigDecimal(errorPercentOH).setScale(2,RoundingMode.HALF_DOWN);
                dvNum.setText(""+dv);
                svNumPercent.setText(""+SVE.doubleValue()+"%");
                dvNumPercent.setText(""+DVE.doubleValue()+"%");
                ohNumPercent.setText(""+OHE.doubleValue()+"%");
            }
        });
        updateFNumDown2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dv -= 1;
                total -= 1;
                errorPercentSV = (sv / total)*100;
                errorPercentDV = (dv / total)*100;
                errorPercentOH = (oh / total)*100;
                BigDecimal SVE = new BigDecimal(errorPercentSV).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal DVE = new BigDecimal(errorPercentDV).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal OHE = new BigDecimal(errorPercentOH).setScale(2,RoundingMode.HALF_DOWN);
                dvNum.setText(""+dv);
                svNumPercent.setText(""+SVE.doubleValue()+"%");
                dvNumPercent.setText(""+DVE.doubleValue()+"%");
                ohNumPercent.setText(""+OHE.doubleValue()+"%");
            }
        });
        updateFNumUp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oh += 1;
                total += 1;
                errorPercentSV = (sv / total)*100;
                errorPercentDV = (dv / total)*100;
                errorPercentOH = (oh / total)*100;
                BigDecimal SVE = new BigDecimal(errorPercentSV).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal DVE = new BigDecimal(errorPercentDV).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal OHE = new BigDecimal(errorPercentOH).setScale(2,RoundingMode.HALF_DOWN);
                ohNum.setText(""+oh);
                svNumPercent.setText(""+SVE.doubleValue()+"%");
                dvNumPercent.setText(""+DVE.doubleValue()+"%");
                ohNumPercent.setText(""+OHE.doubleValue()+"%");
            }
        });
        updateFNumDown3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oh -= 1;
                total -= 1;
                errorPercentSV = (sv / total)*100;
                errorPercentDV = (dv / total)*100;
                errorPercentOH = (oh / total)*100;
                BigDecimal SVE = new BigDecimal(errorPercentSV).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal DVE = new BigDecimal(errorPercentDV).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal OHE = new BigDecimal(errorPercentOH).setScale(2,RoundingMode.HALF_DOWN);
                ohNum.setText(""+oh);
                svNumPercent.setText(""+SVE.doubleValue()+"%");
                dvNumPercent.setText(""+DVE.doubleValue()+"%");
                ohNumPercent.setText(""+OHE.doubleValue()+"%");
            }
        });
    }
}
