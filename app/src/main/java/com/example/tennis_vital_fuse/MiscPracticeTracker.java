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

public class MiscPracticeTracker extends AppCompatActivity{

    Button updateFNumUp1;
    Button updateFNumDown1;
    Button updateFNumUp2;
    Button updateFNumDown2;
    int ds = 0;
    int lo = 0;
    double total = 0;
    double errorPercentDS = 0;
    double errorPercentLO = 0;

    protected void onCreate(Bundle savedInstanceState) {
        TextView dsNum;
        TextView loNum;
        TextView dsNumPercent;
        TextView loNumPercent;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_misc_practice_tracker);
        dsNum = (TextView)findViewById(R.id.dsNum);
        loNum = (TextView)findViewById(R.id.loNum);
        dsNumPercent = (TextView)findViewById(R.id.dsNumPercent);
        loNumPercent = (TextView)findViewById(R.id.loNumPercent);
        updateFNumUp1 = (Button)findViewById(R.id.plus1);
        updateFNumDown1 = (Button)findViewById(R.id.minus1);
        updateFNumUp2 = (Button)findViewById(R.id.plus2);
        updateFNumDown2 = (Button)findViewById(R.id.minus2);
        updateFNumUp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ds += 1;
                total += 1;
                errorPercentDS = (ds / total)*100;
                errorPercentLO = (lo / total)*100;
                BigDecimal DSE = new BigDecimal(errorPercentDS).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal LOE = new BigDecimal(errorPercentLO).setScale(2,RoundingMode.HALF_DOWN);
                dsNum.setText(""+ds);
                dsNumPercent.setText(""+DSE.doubleValue()+"%");
                loNumPercent.setText(""+LOE.doubleValue()+"%");
            }
        });
        updateFNumDown1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ds -= 1;
                total -= 1;
                errorPercentDS = (ds / total)*100;
                errorPercentLO = (lo / total)*100;
                BigDecimal DSE = new BigDecimal(errorPercentDS).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal LOE = new BigDecimal(errorPercentLO).setScale(2,RoundingMode.HALF_DOWN);
                dsNum.setText(""+ds);
                dsNumPercent.setText(""+DSE.doubleValue()+"%");
                loNumPercent.setText(""+LOE.doubleValue()+"%");
            }
        });
        updateFNumUp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lo += 1;
                total += 1;
                errorPercentDS = (ds / total)*100;
                errorPercentLO = (lo / total)*100;
                BigDecimal DSE = new BigDecimal(errorPercentDS).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal LOE = new BigDecimal(errorPercentLO).setScale(2,RoundingMode.HALF_DOWN);
                loNum.setText(""+lo);
                dsNumPercent.setText(""+DSE.doubleValue()+"%");
                loNumPercent.setText(""+LOE.doubleValue()+"%");
            }
        });
        updateFNumDown2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lo -= 1;
                total -= 1;
                errorPercentDS = (ds / total)*100;
                errorPercentLO = (lo / total)*100;
                BigDecimal DSE = new BigDecimal(errorPercentDS).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal LOE = new BigDecimal(errorPercentLO).setScale(2,RoundingMode.HALF_DOWN);
                loNum.setText(""+lo);
                dsNumPercent.setText(""+DSE.doubleValue()+"%");
                loNumPercent.setText(""+LOE.doubleValue()+"%");
            }
        });
    }
}
