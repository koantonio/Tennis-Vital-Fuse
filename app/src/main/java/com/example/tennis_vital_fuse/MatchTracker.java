package com.example.tennis_vital_fuse;

import androidx.appcompat.app.AppCompatActivity;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public class MatchTracker extends AppCompatActivity {

    Button updateFNumUp1;
    Button updateFNumDown1;
    Button updateFNumUp2;
    Button updateFNumDown2;
    Button updateFNumUp3;
    Button updateFNumDown3;
    Button updateFNumUp4;
    Button updateFNumDown4;
    Button updateFNumUp5;
    Button updateFNumDown5;
    Button updateFNumUp6;
    Button updateFNumDown6;
    int fh = 0;
    int bh = 0;
    int as = 0;
    int vo = 0;
    int oh = 0;
    int se = 0;
    double total = 0;
    double errorPercentFH = 0;
    double errorPercentBH = 0;
    double errorPercentAS = 0;
    double errorPercentVO = 0;
    double errorPercentOH = 0;
    double errorPercentSE = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView FNum;
        TextView BNum;
        TextView ANum;
        TextView VNum;
        TextView ONum;
        TextView SNum;
        TextView FNumPercent;
        TextView BNumPercent;
        TextView ANumPercent;
        TextView VNumPercent;
        TextView ONumPercent;
        TextView SNumPercent;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match_tracker);
        FNum = (TextView)findViewById(R.id.fNum);
        BNum = (TextView)findViewById(R.id.bNum);
        ANum = (TextView)findViewById(R.id.aNum);
        VNum = (TextView)findViewById(R.id.vNum);
        ONum = (TextView)findViewById(R.id.oNum);
        SNum = (TextView)findViewById(R.id.sNum);
        FNumPercent = (TextView)findViewById(R.id.fNumPercent);
        BNumPercent = (TextView)findViewById(R.id.bNumPercent);
        ANumPercent = (TextView)findViewById(R.id.aNumPercent);
        VNumPercent = (TextView)findViewById(R.id.vNumPercent);
        ONumPercent = (TextView)findViewById(R.id.oNumPercent);
        SNumPercent = (TextView)findViewById(R.id.sNumPercent);
        updateFNumUp1 = (Button)findViewById(R.id.plus1);
        updateFNumDown1 = (Button)findViewById(R.id.minus1);
        updateFNumUp2 = (Button)findViewById(R.id.plus2);
        updateFNumDown2 = (Button)findViewById(R.id.minus2);
        updateFNumUp3 = (Button)findViewById(R.id.plus3);
        updateFNumDown3 = (Button)findViewById(R.id.minus3);
        updateFNumUp4 = (Button)findViewById(R.id.plus4);
        updateFNumDown4 = (Button)findViewById(R.id.minus4);
        updateFNumUp5 = (Button)findViewById(R.id.plus5);
        updateFNumDown5 = (Button)findViewById(R.id.minus5);
        updateFNumUp6 = (Button)findViewById(R.id.plus6);
        updateFNumDown6 = (Button)findViewById(R.id.minus6);
        updateFNumUp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fh += 1;
                total += 1;
                errorPercentFH = (fh / total)*100;
                errorPercentBH = (bh / total)*100;
                errorPercentAS = (as / total)*100;
                errorPercentVO = (vo / total)*100;
                errorPercentOH = (oh / total)*100;
                errorPercentSE = (se / total)*100;
                BigDecimal FHE = new BigDecimal(errorPercentFH).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal BHE = new BigDecimal(errorPercentBH).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal ASE = new BigDecimal(errorPercentAS).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal VOE = new BigDecimal(errorPercentVO).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal OHE = new BigDecimal(errorPercentOH).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal SEE = new BigDecimal(errorPercentSE).setScale(2,RoundingMode.HALF_DOWN);
                FNum.setText(""+fh);
                FNumPercent.setText(""+FHE.doubleValue()+"%");
                BNumPercent.setText(""+BHE.doubleValue()+"%");
                ANumPercent.setText(""+ASE.doubleValue()+"%");
                VNumPercent.setText(""+VOE.doubleValue()+"%");
                ONumPercent.setText(""+OHE.doubleValue()+"%");
                SNumPercent.setText(""+SEE.doubleValue()+"%");
            }
        });
        updateFNumDown1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fh -= 1;
                total -= 1;
                errorPercentFH = (fh / total)*100;
                errorPercentBH = (bh / total)*100;
                errorPercentAS = (as / total)*100;
                errorPercentVO = (vo / total)*100;
                errorPercentOH = (oh / total)*100;
                errorPercentSE = (se / total)*100;
                BigDecimal FHE = new BigDecimal(errorPercentFH).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal BHE = new BigDecimal(errorPercentBH).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal ASE = new BigDecimal(errorPercentAS).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal VOE = new BigDecimal(errorPercentVO).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal OHE = new BigDecimal(errorPercentOH).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal SEE = new BigDecimal(errorPercentSE).setScale(2,RoundingMode.HALF_DOWN);
                FNum.setText(""+fh);
                FNumPercent.setText(""+FHE.doubleValue()+"%");
                BNumPercent.setText(""+BHE.doubleValue()+"%");
                ANumPercent.setText(""+ASE.doubleValue()+"%");
                VNumPercent.setText(""+VOE.doubleValue()+"%");
                ONumPercent.setText(""+OHE.doubleValue()+"%");
                SNumPercent.setText(""+SEE.doubleValue()+"%");
            }
        });
        updateFNumUp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bh += 1;
                total += 1;
                errorPercentFH = (fh / total)*100;
                errorPercentBH = (bh / total)*100;
                errorPercentAS = (as / total)*100;
                errorPercentVO = (vo / total)*100;
                errorPercentOH = (oh / total)*100;
                errorPercentSE = (se / total)*100;
                BigDecimal FHE = new BigDecimal(errorPercentFH).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal BHE = new BigDecimal(errorPercentBH).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal ASE = new BigDecimal(errorPercentAS).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal VOE = new BigDecimal(errorPercentVO).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal OHE = new BigDecimal(errorPercentOH).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal SEE = new BigDecimal(errorPercentSE).setScale(2,RoundingMode.HALF_DOWN);
                BNum.setText(""+bh);
                FNumPercent.setText(""+FHE.doubleValue()+"%");
                BNumPercent.setText(""+BHE.doubleValue()+"%");
                ANumPercent.setText(""+ASE.doubleValue()+"%");
                VNumPercent.setText(""+VOE.doubleValue()+"%");
                ONumPercent.setText(""+OHE.doubleValue()+"%");
                SNumPercent.setText(""+SEE.doubleValue()+"%");
            }
        });
        updateFNumDown2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bh -= 1;
                total -= 1;
                errorPercentFH = (fh / total)*100;
                errorPercentBH = (bh / total)*100;
                errorPercentAS = (as / total)*100;
                errorPercentVO = (vo / total)*100;
                errorPercentOH = (oh / total)*100;
                errorPercentSE = (se / total)*100;
                BigDecimal FHE = new BigDecimal(errorPercentFH).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal BHE = new BigDecimal(errorPercentBH).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal ASE = new BigDecimal(errorPercentAS).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal VOE = new BigDecimal(errorPercentVO).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal OHE = new BigDecimal(errorPercentOH).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal SEE = new BigDecimal(errorPercentSE).setScale(2,RoundingMode.HALF_DOWN);
                BNum.setText(""+bh);
                FNumPercent.setText(""+FHE.doubleValue()+"%");
                BNumPercent.setText(""+BHE.doubleValue()+"%");
                ANumPercent.setText(""+ASE.doubleValue()+"%");
                VNumPercent.setText(""+VOE.doubleValue()+"%");
                ONumPercent.setText(""+OHE.doubleValue()+"%");
                SNumPercent.setText(""+SEE.doubleValue()+"%");
            }
        });
        updateFNumUp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                as += 1;
                total += 1;
                errorPercentFH = (fh / total)*100;
                errorPercentBH = (bh / total)*100;
                errorPercentAS = (as / total)*100;
                errorPercentVO = (vo / total)*100;
                errorPercentOH = (oh / total)*100;
                errorPercentSE = (se / total)*100;
                BigDecimal FHE = new BigDecimal(errorPercentFH).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal BHE = new BigDecimal(errorPercentBH).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal ASE = new BigDecimal(errorPercentAS).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal VOE = new BigDecimal(errorPercentVO).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal OHE = new BigDecimal(errorPercentOH).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal SEE = new BigDecimal(errorPercentSE).setScale(2,RoundingMode.HALF_DOWN);
                ANum.setText(""+as);
                FNumPercent.setText(""+FHE.doubleValue()+"%");
                BNumPercent.setText(""+BHE.doubleValue()+"%");
                ANumPercent.setText(""+ASE.doubleValue()+"%");
                VNumPercent.setText(""+VOE.doubleValue()+"%");
                ONumPercent.setText(""+OHE.doubleValue()+"%");
                SNumPercent.setText(""+SEE.doubleValue()+"%");
            }
        });
        updateFNumDown3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                as -= 1;
                total -= 1;
                errorPercentFH = (fh / total)*100;
                errorPercentBH = (bh / total)*100;
                errorPercentAS = (as / total)*100;
                errorPercentVO = (vo / total)*100;
                errorPercentOH = (oh / total)*100;
                errorPercentSE = (se / total)*100;
                BigDecimal FHE = new BigDecimal(errorPercentFH).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal BHE = new BigDecimal(errorPercentBH).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal ASE = new BigDecimal(errorPercentAS).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal VOE = new BigDecimal(errorPercentVO).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal OHE = new BigDecimal(errorPercentOH).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal SEE = new BigDecimal(errorPercentSE).setScale(2,RoundingMode.HALF_DOWN);
                ANum.setText(""+as);
                FNumPercent.setText(""+FHE.doubleValue()+"%");
                BNumPercent.setText(""+BHE.doubleValue()+"%");
                ANumPercent.setText(""+ASE.doubleValue()+"%");
                VNumPercent.setText(""+VOE.doubleValue()+"%");
                ONumPercent.setText(""+OHE.doubleValue()+"%");
                SNumPercent.setText(""+SEE.doubleValue()+"%");
            }
        });
        updateFNumUp4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vo += 1;
                total += 1;
                errorPercentFH = (fh / total)*100;
                errorPercentBH = (bh / total)*100;
                errorPercentAS = (as / total)*100;
                errorPercentVO = (vo / total)*100;
                errorPercentOH = (oh / total)*100;
                errorPercentSE = (se / total)*100;
                BigDecimal FHE = new BigDecimal(errorPercentFH).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal BHE = new BigDecimal(errorPercentBH).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal ASE = new BigDecimal(errorPercentAS).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal VOE = new BigDecimal(errorPercentVO).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal OHE = new BigDecimal(errorPercentOH).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal SEE = new BigDecimal(errorPercentSE).setScale(2,RoundingMode.HALF_DOWN);
                VNum.setText(""+vo);
                FNumPercent.setText(""+FHE.doubleValue()+"%");
                BNumPercent.setText(""+BHE.doubleValue()+"%");
                ANumPercent.setText(""+ASE.doubleValue()+"%");
                VNumPercent.setText(""+VOE.doubleValue()+"%");
                ONumPercent.setText(""+OHE.doubleValue()+"%");
                SNumPercent.setText(""+SEE.doubleValue()+"%");
            }
        });
        updateFNumDown4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vo -= 1;
                total -= 1;
                errorPercentFH = (fh / total)*100;
                errorPercentBH = (bh / total)*100;
                errorPercentAS = (as / total)*100;
                errorPercentVO = (vo / total)*100;
                errorPercentOH = (oh / total)*100;
                errorPercentSE = (se / total)*100;
                BigDecimal FHE = new BigDecimal(errorPercentFH).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal BHE = new BigDecimal(errorPercentBH).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal ASE = new BigDecimal(errorPercentAS).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal VOE = new BigDecimal(errorPercentVO).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal OHE = new BigDecimal(errorPercentOH).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal SEE = new BigDecimal(errorPercentSE).setScale(2,RoundingMode.HALF_DOWN);
                VNum.setText(""+vo);
                FNumPercent.setText(""+FHE.doubleValue()+"%");
                BNumPercent.setText(""+BHE.doubleValue()+"%");
                ANumPercent.setText(""+ASE.doubleValue()+"%");
                VNumPercent.setText(""+VOE.doubleValue()+"%");
                ONumPercent.setText(""+OHE.doubleValue()+"%");
                SNumPercent.setText(""+SEE.doubleValue()+"%");
            }
        });
        updateFNumUp5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oh += 1;
                total += 1;
                errorPercentFH = (fh / total)*100;
                errorPercentBH = (bh / total)*100;
                errorPercentAS = (as / total)*100;
                errorPercentVO = (vo / total)*100;
                errorPercentOH = (oh / total)*100;
                errorPercentSE = (se / total)*100;
                BigDecimal FHE = new BigDecimal(errorPercentFH).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal BHE = new BigDecimal(errorPercentBH).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal ASE = new BigDecimal(errorPercentAS).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal VOE = new BigDecimal(errorPercentVO).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal OHE = new BigDecimal(errorPercentOH).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal SEE = new BigDecimal(errorPercentSE).setScale(2,RoundingMode.HALF_DOWN);
                ONum.setText(""+oh);
                FNumPercent.setText(""+FHE.doubleValue()+"%");
                BNumPercent.setText(""+BHE.doubleValue()+"%");
                ANumPercent.setText(""+ASE.doubleValue()+"%");
                VNumPercent.setText(""+VOE.doubleValue()+"%");
                ONumPercent.setText(""+OHE.doubleValue()+"%");
                SNumPercent.setText(""+SEE.doubleValue()+"%");
            }
        });
        updateFNumDown5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oh -= 1;
                total -= 1;
                errorPercentFH = (fh / total)*100;
                errorPercentBH = (bh / total)*100;
                errorPercentAS = (as / total)*100;
                errorPercentVO = (vo / total)*100;
                errorPercentOH = (oh / total)*100;
                errorPercentSE = (se / total)*100;
                BigDecimal FHE = new BigDecimal(errorPercentFH).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal BHE = new BigDecimal(errorPercentBH).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal ASE = new BigDecimal(errorPercentAS).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal VOE = new BigDecimal(errorPercentVO).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal OHE = new BigDecimal(errorPercentOH).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal SEE = new BigDecimal(errorPercentSE).setScale(2,RoundingMode.HALF_DOWN);
                ONum.setText(""+oh);
                FNumPercent.setText(""+FHE.doubleValue()+"%");
                BNumPercent.setText(""+BHE.doubleValue()+"%");
                ANumPercent.setText(""+ASE.doubleValue()+"%");
                VNumPercent.setText(""+VOE.doubleValue()+"%");
                ONumPercent.setText(""+OHE.doubleValue()+"%");
                SNumPercent.setText(""+SEE.doubleValue()+"%");
            }
        });
        updateFNumUp6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                se += 1;
                total += 1;
                errorPercentFH = (fh / total)*100;
                errorPercentBH = (bh / total)*100;
                errorPercentAS = (as / total)*100;
                errorPercentVO = (vo / total)*100;
                errorPercentOH = (oh / total)*100;
                errorPercentSE = (se / total)*100;
                BigDecimal FHE = new BigDecimal(errorPercentFH).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal BHE = new BigDecimal(errorPercentBH).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal ASE = new BigDecimal(errorPercentAS).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal VOE = new BigDecimal(errorPercentVO).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal OHE = new BigDecimal(errorPercentOH).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal SEE = new BigDecimal(errorPercentSE).setScale(2,RoundingMode.HALF_DOWN);
                SNum.setText(""+se);
                FNumPercent.setText(""+FHE.doubleValue()+"%");
                BNumPercent.setText(""+BHE.doubleValue()+"%");
                ANumPercent.setText(""+ASE.doubleValue()+"%");
                VNumPercent.setText(""+VOE.doubleValue()+"%");
                ONumPercent.setText(""+OHE.doubleValue()+"%");
                SNumPercent.setText(""+SEE.doubleValue()+"%");
            }
        });
        updateFNumDown6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                se -= 1;
                total -= 1;
                errorPercentFH = (fh / total)*100;
                errorPercentBH = (bh / total)*100;
                errorPercentAS = (as / total)*100;
                errorPercentVO = (vo / total)*100;
                errorPercentOH = (oh / total)*100;
                errorPercentSE = (se / total)*100;
                BigDecimal FHE = new BigDecimal(errorPercentFH).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal BHE = new BigDecimal(errorPercentBH).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal ASE = new BigDecimal(errorPercentAS).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal VOE = new BigDecimal(errorPercentVO).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal OHE = new BigDecimal(errorPercentOH).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal SEE = new BigDecimal(errorPercentSE).setScale(2,RoundingMode.HALF_DOWN);
                SNum.setText(""+se);
                FNumPercent.setText(""+FHE.doubleValue()+"%");
                BNumPercent.setText(""+BHE.doubleValue()+"%");
                ANumPercent.setText(""+ASE.doubleValue()+"%");
                VNumPercent.setText(""+VOE.doubleValue()+"%");
                ONumPercent.setText(""+OHE.doubleValue()+"%");
                SNumPercent.setText(""+SEE.doubleValue()+"%");
            }
        });
    }
}