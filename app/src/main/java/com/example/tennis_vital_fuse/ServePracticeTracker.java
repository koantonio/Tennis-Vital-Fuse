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

public class ServePracticeTracker extends AppCompatActivity{

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
    int ds = 0;
    int as = 0;
    int ss = 0;
    int fs = 0;
    int ks = 0;
    double total = 0;
    double errorPercentDS = 0;
    double errorPercentAS = 0;
    double errorPercentSS = 0;
    double errorPercentFS = 0;
    double errorPercentKS = 0;

    protected void onCreate(Bundle savedInstanceState) {
        TextView DSNum;
        TextView ASNum;
        TextView SSNum;
        TextView FSNum;
        TextView KSNum;
        TextView DSNumPercent;
        TextView ASNumPercent;
        TextView SSNumPercent;
        TextView FSNumPercent;
        TextView KSNumPercent;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_practice_tracker);
        DSNum = (TextView)findViewById(R.id.dsNum);
        ASNum = (TextView)findViewById(R.id.asNum);
        SSNum = (TextView)findViewById(R.id.ssNum);
        FSNum = (TextView)findViewById(R.id.fsNum);
        KSNum = (TextView)findViewById(R.id.ksNum);
        DSNumPercent = (TextView)findViewById(R.id.dsNumPercent);
        ASNumPercent = (TextView)findViewById(R.id.asNumPercent);
        SSNumPercent = (TextView)findViewById(R.id.ssNumPercent);
        FSNumPercent = (TextView)findViewById(R.id.fsNumPercent);
        KSNumPercent = (TextView)findViewById(R.id.ksNumPercent);
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
        updateFNumUp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ds += 1;
                total += 1;
                errorPercentDS = (ds / total)*100;
                errorPercentAS = (as / total)*100;
                errorPercentSS = (ss / total)*100;
                errorPercentFS = (fs / total)*100;
                errorPercentKS = (ks / total)*100;
                BigDecimal DSE = new BigDecimal(errorPercentDS).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal ASE = new BigDecimal(errorPercentAS).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal SSE = new BigDecimal(errorPercentSS).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal FSE = new BigDecimal(errorPercentFS).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal KSE = new BigDecimal(errorPercentKS).setScale(2,RoundingMode.HALF_DOWN);
                DSNum.setText(""+ds);
                DSNumPercent.setText(""+DSE.doubleValue()+"%");
                ASNumPercent.setText(""+ASE.doubleValue()+"%");
                SSNumPercent.setText(""+SSE.doubleValue()+"%");
                FSNumPercent.setText(""+FSE.doubleValue()+"%");
                KSNumPercent.setText(""+KSE.doubleValue()+"%");
            }
        });
        updateFNumDown1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ds -= 1;
                total -= 1;
                errorPercentDS = (ds / total)*100;
                errorPercentAS = (as / total)*100;
                errorPercentSS = (ss / total)*100;
                errorPercentFS = (fs / total)*100;
                errorPercentKS = (ks / total)*100;
                BigDecimal DSE = new BigDecimal(errorPercentDS).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal ASE = new BigDecimal(errorPercentAS).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal SSE = new BigDecimal(errorPercentSS).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal FSE = new BigDecimal(errorPercentFS).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal KSE = new BigDecimal(errorPercentKS).setScale(2,RoundingMode.HALF_DOWN);
                DSNum.setText(""+ds);
                DSNumPercent.setText(""+DSE.doubleValue()+"%");
                ASNumPercent.setText(""+ASE.doubleValue()+"%");
                SSNumPercent.setText(""+SSE.doubleValue()+"%");
                FSNumPercent.setText(""+FSE.doubleValue()+"%");
                KSNumPercent.setText(""+KSE.doubleValue()+"%");
            }
        });
        updateFNumUp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                as += 1;
                total += 1;
                errorPercentDS = (ds / total)*100;
                errorPercentAS = (as / total)*100;
                errorPercentSS = (ss / total)*100;
                errorPercentFS = (fs / total)*100;
                errorPercentKS = (ks / total)*100;
                BigDecimal DSE = new BigDecimal(errorPercentDS).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal ASE = new BigDecimal(errorPercentAS).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal SSE = new BigDecimal(errorPercentSS).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal FSE = new BigDecimal(errorPercentFS).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal KSE = new BigDecimal(errorPercentKS).setScale(2,RoundingMode.HALF_DOWN);
                ASNum.setText(""+as);
                DSNumPercent.setText(""+DSE.doubleValue()+"%");
                ASNumPercent.setText(""+ASE.doubleValue()+"%");
                SSNumPercent.setText(""+SSE.doubleValue()+"%");
                FSNumPercent.setText(""+FSE.doubleValue()+"%");
                KSNumPercent.setText(""+KSE.doubleValue()+"%");
            }
        });
        updateFNumDown2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                as -= 1;
                total -= 1;
                errorPercentDS = (ds / total)*100;
                errorPercentAS = (as / total)*100;
                errorPercentSS = (ss / total)*100;
                errorPercentFS = (fs / total)*100;
                errorPercentKS = (ks / total)*100;
                BigDecimal DSE = new BigDecimal(errorPercentDS).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal ASE = new BigDecimal(errorPercentAS).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal SSE = new BigDecimal(errorPercentSS).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal FSE = new BigDecimal(errorPercentFS).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal KSE = new BigDecimal(errorPercentKS).setScale(2,RoundingMode.HALF_DOWN);
                ASNum.setText(""+as);
                DSNumPercent.setText(""+DSE.doubleValue()+"%");
                ASNumPercent.setText(""+ASE.doubleValue()+"%");
                SSNumPercent.setText(""+SSE.doubleValue()+"%");
                FSNumPercent.setText(""+FSE.doubleValue()+"%");
                KSNumPercent.setText(""+KSE.doubleValue()+"%");
            }
        });
        updateFNumUp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ss += 1;
                total += 1;
                errorPercentDS = (ds / total)*100;
                errorPercentAS = (as / total)*100;
                errorPercentSS = (ss / total)*100;
                errorPercentFS = (fs / total)*100;
                errorPercentKS = (ks / total)*100;
                BigDecimal DSE = new BigDecimal(errorPercentDS).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal ASE = new BigDecimal(errorPercentAS).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal SSE = new BigDecimal(errorPercentSS).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal FSE = new BigDecimal(errorPercentFS).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal KSE = new BigDecimal(errorPercentKS).setScale(2,RoundingMode.HALF_DOWN);
                SSNum.setText(""+ss);
                DSNumPercent.setText(""+DSE.doubleValue()+"%");
                ASNumPercent.setText(""+ASE.doubleValue()+"%");
                SSNumPercent.setText(""+SSE.doubleValue()+"%");
                FSNumPercent.setText(""+FSE.doubleValue()+"%");
                KSNumPercent.setText(""+KSE.doubleValue()+"%");
            }
        });
        updateFNumDown3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ss -= 1;
                total -= 1;
                errorPercentDS = (ds / total)*100;
                errorPercentAS = (as / total)*100;
                errorPercentSS = (ss / total)*100;
                errorPercentFS = (fs / total)*100;
                errorPercentKS = (ks / total)*100;
                BigDecimal DSE = new BigDecimal(errorPercentDS).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal ASE = new BigDecimal(errorPercentAS).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal SSE = new BigDecimal(errorPercentSS).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal FSE = new BigDecimal(errorPercentFS).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal KSE = new BigDecimal(errorPercentKS).setScale(2,RoundingMode.HALF_DOWN);
                SSNum.setText(""+ss);
                DSNumPercent.setText(""+DSE.doubleValue()+"%");
                ASNumPercent.setText(""+ASE.doubleValue()+"%");
                SSNumPercent.setText(""+SSE.doubleValue()+"%");
                FSNumPercent.setText(""+FSE.doubleValue()+"%");
                KSNumPercent.setText(""+KSE.doubleValue()+"%");
            }
        });
        updateFNumUp4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fs += 1;
                total += 1;
                errorPercentDS = (ds / total)*100;
                errorPercentAS = (as / total)*100;
                errorPercentSS = (ss / total)*100;
                errorPercentFS = (fs / total)*100;
                errorPercentKS = (ks / total)*100;
                BigDecimal DSE = new BigDecimal(errorPercentDS).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal ASE = new BigDecimal(errorPercentAS).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal SSE = new BigDecimal(errorPercentSS).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal FSE = new BigDecimal(errorPercentFS).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal KSE = new BigDecimal(errorPercentKS).setScale(2,RoundingMode.HALF_DOWN);
                FSNum.setText(""+fs);
                DSNumPercent.setText(""+DSE.doubleValue()+"%");
                ASNumPercent.setText(""+ASE.doubleValue()+"%");
                SSNumPercent.setText(""+SSE.doubleValue()+"%");
                FSNumPercent.setText(""+FSE.doubleValue()+"%");
                KSNumPercent.setText(""+KSE.doubleValue()+"%");
            }
        });
        updateFNumDown4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fs -= 1;
                total -= 1;
                errorPercentDS = (ds / total)*100;
                errorPercentAS = (as / total)*100;
                errorPercentSS = (ss / total)*100;
                errorPercentFS = (fs / total)*100;
                errorPercentKS = (ks / total)*100;
                BigDecimal DSE = new BigDecimal(errorPercentDS).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal ASE = new BigDecimal(errorPercentAS).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal SSE = new BigDecimal(errorPercentSS).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal FSE = new BigDecimal(errorPercentFS).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal KSE = new BigDecimal(errorPercentKS).setScale(2,RoundingMode.HALF_DOWN);
                FSNum.setText(""+fs);
                DSNumPercent.setText(""+DSE.doubleValue()+"%");
                ASNumPercent.setText(""+ASE.doubleValue()+"%");
                SSNumPercent.setText(""+SSE.doubleValue()+"%");
                FSNumPercent.setText(""+FSE.doubleValue()+"%");
                KSNumPercent.setText(""+KSE.doubleValue()+"%");
            }
        });
        updateFNumUp5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ks += 1;
                total += 1;
                errorPercentDS = (ds / total)*100;
                errorPercentAS = (as / total)*100;
                errorPercentSS = (ss / total)*100;
                errorPercentFS = (fs / total)*100;
                errorPercentKS = (ks / total)*100;
                BigDecimal DSE = new BigDecimal(errorPercentDS).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal ASE = new BigDecimal(errorPercentAS).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal SSE = new BigDecimal(errorPercentSS).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal FSE = new BigDecimal(errorPercentFS).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal KSE = new BigDecimal(errorPercentKS).setScale(2,RoundingMode.HALF_DOWN);
                KSNum.setText(""+ks);
                DSNumPercent.setText(""+DSE.doubleValue()+"%");
                ASNumPercent.setText(""+ASE.doubleValue()+"%");
                SSNumPercent.setText(""+SSE.doubleValue()+"%");
                FSNumPercent.setText(""+FSE.doubleValue()+"%");
                KSNumPercent.setText(""+KSE.doubleValue()+"%");
            }
        });
        updateFNumDown5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ks -= 1;
                total -= 1;
                errorPercentDS = (ds / total)*100;
                errorPercentAS = (as / total)*100;
                errorPercentSS = (ss / total)*100;
                errorPercentFS = (fs / total)*100;
                errorPercentKS = (ks / total)*100;
                BigDecimal DSE = new BigDecimal(errorPercentDS).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal ASE = new BigDecimal(errorPercentAS).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal SSE = new BigDecimal(errorPercentSS).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal FSE = new BigDecimal(errorPercentFS).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal KSE = new BigDecimal(errorPercentKS).setScale(2,RoundingMode.HALF_DOWN);
                KSNum.setText(""+ks);
                DSNumPercent.setText(""+DSE.doubleValue()+"%");
                ASNumPercent.setText(""+ASE.doubleValue()+"%");
                SSNumPercent.setText(""+SSE.doubleValue()+"%");
                FSNumPercent.setText(""+FSE.doubleValue()+"%");
                KSNumPercent.setText(""+KSE.doubleValue()+"%");
            }
        });
    }
}
