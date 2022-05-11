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

public class BackhandPracticeTracker extends AppCompatActivity{

    Button updateFNumUp1;
    Button updateFNumDown1;
    Button updateFNumUp2;
    Button updateFNumDown2;
    Button updateFNumUp3;
    Button updateFNumDown3;
    int dl = 0;
    int cc = 0;
    int sb = 0;
    double total = 0;
    double errorPercentDL = 0;
    double errorPercentCC = 0;
    double errorPercentSB = 0;

    protected void onCreate(Bundle savedInstanceState) {
        TextView ccNum;
        TextView dlNum;
        TextView sbNum;
        TextView ccNumPercent;
        TextView dlNumPercent;
        TextView sbNumPercent;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_backhand_practice_tracker);
        ccNum = (TextView)findViewById(R.id.ccNum);
        dlNum = (TextView)findViewById(R.id.dlNum);
        sbNum = (TextView)findViewById(R.id.sbNum);
        ccNumPercent = (TextView)findViewById(R.id.ccNumPercent);
        dlNumPercent = (TextView)findViewById(R.id.dlNumPercent);
        sbNumPercent = (TextView)findViewById(R.id.sbNumPercent);
        updateFNumUp1 = (Button)findViewById(R.id.plus1);
        updateFNumDown1 = (Button)findViewById(R.id.minus1);
        updateFNumUp2 = (Button)findViewById(R.id.plus2);
        updateFNumDown2 = (Button)findViewById(R.id.minus2);
        updateFNumUp3 = (Button)findViewById(R.id.plus3);
        updateFNumDown3 = (Button)findViewById(R.id.minus3);
        updateFNumUp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cc += 1;
                total += 1;
                errorPercentDL = (dl / total)*100;
                errorPercentCC = (cc / total)*100;
                errorPercentSB = (sb / total)*100;
                BigDecimal DLE = new BigDecimal(errorPercentDL).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal CCE = new BigDecimal(errorPercentCC).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal SBE = new BigDecimal(errorPercentSB).setScale(2,RoundingMode.HALF_DOWN);
                ccNum.setText(""+cc);
                dlNumPercent.setText(""+DLE.doubleValue()+"%");
                ccNumPercent.setText(""+CCE.doubleValue()+"%");
                sbNumPercent.setText(""+SBE.doubleValue()+"%");
            }
        });
        updateFNumDown1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cc -= 1;
                total -= 1;
                errorPercentDL = (dl / total)*100;
                errorPercentCC = (cc / total)*100;
                errorPercentSB = (sb / total)*100;
                BigDecimal DLE = new BigDecimal(errorPercentDL).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal CCE = new BigDecimal(errorPercentCC).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal SBE = new BigDecimal(errorPercentSB).setScale(2,RoundingMode.HALF_DOWN);
                ccNum.setText(""+cc);
                dlNumPercent.setText(""+DLE.doubleValue()+"%");
                ccNumPercent.setText(""+CCE.doubleValue()+"%");
                sbNumPercent.setText(""+SBE.doubleValue()+"%");
            }
        });
        updateFNumUp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dl += 1;
                total += 1;
                errorPercentDL = (dl / total)*100;
                errorPercentCC = (cc / total)*100;
                errorPercentSB = (sb / total)*100;
                BigDecimal DLE = new BigDecimal(errorPercentDL).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal CCE = new BigDecimal(errorPercentCC).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal SBE = new BigDecimal(errorPercentSB).setScale(2,RoundingMode.HALF_DOWN);
                dlNum.setText(""+dl);
                dlNumPercent.setText(""+DLE.doubleValue()+"%");
                ccNumPercent.setText(""+CCE.doubleValue()+"%");
                sbNumPercent.setText(""+SBE.doubleValue()+"%");
            }
        });
        updateFNumDown2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dl -= 1;
                total -= 1;
                errorPercentDL = (dl / total)*100;
                errorPercentCC = (cc / total)*100;
                errorPercentSB = (sb / total)*100;
                BigDecimal DLE = new BigDecimal(errorPercentDL).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal CCE = new BigDecimal(errorPercentCC).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal SBE = new BigDecimal(errorPercentSB).setScale(2,RoundingMode.HALF_DOWN);
                dlNum.setText(""+dl);
                dlNumPercent.setText(""+DLE.doubleValue()+"%");
                ccNumPercent.setText(""+CCE.doubleValue()+"%");
                sbNumPercent.setText(""+SBE.doubleValue()+"%");
            }
        });
        updateFNumUp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sb += 1;
                total += 1;
                errorPercentDL = (dl / total)*100;
                errorPercentCC = (cc / total)*100;
                errorPercentSB = (sb / total)*100;
                BigDecimal DLE = new BigDecimal(errorPercentDL).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal CCE = new BigDecimal(errorPercentCC).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal SBE = new BigDecimal(errorPercentSB).setScale(2,RoundingMode.HALF_DOWN);
                sbNum.setText(""+sb);
                dlNumPercent.setText(""+DLE.doubleValue()+"%");
                ccNumPercent.setText(""+CCE.doubleValue()+"%");
                sbNumPercent.setText(""+SBE.doubleValue()+"%");
            }
        });
        updateFNumDown3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sb -= 1;
                total -= 1;
                errorPercentDL = (dl / total)*100;
                errorPercentCC = (cc / total)*100;
                errorPercentSB = (sb / total)*100;
                BigDecimal DLE = new BigDecimal(errorPercentDL).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal CCE = new BigDecimal(errorPercentCC).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal SBE = new BigDecimal(errorPercentSB).setScale(2,RoundingMode.HALF_DOWN);
                sbNum.setText(""+sb);
                dlNumPercent.setText(""+DLE.doubleValue()+"%");
                ccNumPercent.setText(""+CCE.doubleValue()+"%");
                sbNumPercent.setText(""+SBE.doubleValue()+"%");
            }
        });
    }
}
