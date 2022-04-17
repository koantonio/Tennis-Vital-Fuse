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

public class ForehandPracticeTracker extends AppCompatActivity{

    Button updateFNumUp1;
    Button updateFNumDown1;
    Button updateFNumUp2;
    Button updateFNumDown2;
    Button updateFNumUp3;
    Button updateFNumDown3;
    Button updateFNumUp4;
    Button updateFNumDown4;
    int cc = 0;
    int dl = 0;
    int io = 0;
    int ii = 0;
    double total = 0;
    double errorPercentCC = 0;
    double errorPercentDL = 0;
    double errorPercentIO = 0;
    double errorPercentII = 0;

    protected void onCreate(Bundle savedInstanceState) {
        TextView ccNum;
        TextView dlNum;
        TextView ioNum;
        TextView iiNum;
        TextView dlNumPercent;
        TextView ccNumPercent;
        TextView ioNumPercent;
        TextView iiNumPercent;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forehand_practice_tracker);
        ccNum = (TextView)findViewById(R.id.ccNum);
        dlNum = (TextView)findViewById(R.id.dlNum);
        ioNum = (TextView)findViewById(R.id.ioNum);
        iiNum = (TextView)findViewById(R.id.iiNum);
        ccNumPercent = (TextView)findViewById(R.id.ccNumPercent);
        dlNumPercent = (TextView)findViewById(R.id.dlNumPercent);
        ioNumPercent = (TextView)findViewById(R.id.ioNumPercent);
        iiNumPercent = (TextView)findViewById(R.id.iiNumPercent);
        updateFNumUp1 = (Button)findViewById(R.id.plus1);
        updateFNumDown1 = (Button)findViewById(R.id.minus1);
        updateFNumUp2 = (Button)findViewById(R.id.plus2);
        updateFNumDown2 = (Button)findViewById(R.id.minus2);
        updateFNumUp3 = (Button)findViewById(R.id.plus3);
        updateFNumDown3 = (Button)findViewById(R.id.minus3);
        updateFNumUp4 = (Button)findViewById(R.id.plus4);
        updateFNumDown4 = (Button)findViewById(R.id.minus4);
        updateFNumUp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cc += 1;
                total += 1;
                errorPercentDL = (dl / total)*100;
                errorPercentCC = (cc / total)*100;
                errorPercentIO = (io / total)*100;
                errorPercentII = (ii / total)*100;
                BigDecimal DLE = new BigDecimal(errorPercentDL).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal CCE = new BigDecimal(errorPercentCC).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal IOE = new BigDecimal(errorPercentIO).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal IIE = new BigDecimal(errorPercentII).setScale(2,RoundingMode.HALF_DOWN);
                ccNum.setText(""+cc);
                dlNumPercent.setText(""+DLE.doubleValue()+"%");
                ccNumPercent.setText(""+CCE.doubleValue()+"%");
                ioNumPercent.setText(""+IOE.doubleValue()+"%");
                iiNumPercent.setText(""+IIE.doubleValue()+"%");
            }
        });
        updateFNumDown1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cc -= 1;
                total -= 1;
                errorPercentDL = (dl / total)*100;
                errorPercentCC = (cc / total)*100;
                errorPercentIO = (io / total)*100;
                errorPercentII = (ii / total)*100;
                BigDecimal DLE = new BigDecimal(errorPercentDL).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal CCE = new BigDecimal(errorPercentCC).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal IOE = new BigDecimal(errorPercentIO).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal IIE = new BigDecimal(errorPercentII).setScale(2,RoundingMode.HALF_DOWN);
                ccNum.setText(""+cc);
                dlNumPercent.setText(""+DLE.doubleValue()+"%");
                ccNumPercent.setText(""+CCE.doubleValue()+"%");
                ioNumPercent.setText(""+IOE.doubleValue()+"%");
                iiNumPercent.setText(""+IIE.doubleValue()+"%");
            }
        });
        updateFNumUp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dl += 1;
                total += 1;
                errorPercentDL = (dl / total)*100;
                errorPercentCC = (cc / total)*100;
                errorPercentIO = (io / total)*100;
                errorPercentII = (ii / total)*100;
                BigDecimal DLE = new BigDecimal(errorPercentDL).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal CCE = new BigDecimal(errorPercentCC).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal IOE = new BigDecimal(errorPercentIO).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal IIE = new BigDecimal(errorPercentII).setScale(2,RoundingMode.HALF_DOWN);
                dlNum.setText(""+dl);
                dlNumPercent.setText(""+DLE.doubleValue()+"%");
                ccNumPercent.setText(""+CCE.doubleValue()+"%");
                ioNumPercent.setText(""+IOE.doubleValue()+"%");
                iiNumPercent.setText(""+IIE.doubleValue()+"%");
            }
        });
        updateFNumDown2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dl -= 1;
                total -= 1;
                errorPercentDL = (dl / total)*100;
                errorPercentCC = (cc / total)*100;
                errorPercentIO = (io / total)*100;
                errorPercentII = (ii / total)*100;
                BigDecimal DLE = new BigDecimal(errorPercentDL).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal CCE = new BigDecimal(errorPercentCC).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal IOE = new BigDecimal(errorPercentIO).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal IIE = new BigDecimal(errorPercentII).setScale(2,RoundingMode.HALF_DOWN);
                dlNum.setText(""+dl);
                dlNumPercent.setText(""+DLE.doubleValue()+"%");
                ccNumPercent.setText(""+CCE.doubleValue()+"%");
                ioNumPercent.setText(""+IOE.doubleValue()+"%");
                iiNumPercent.setText(""+IIE.doubleValue()+"%");
            }
        });
        updateFNumUp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                io += 1;
                total += 1;
                errorPercentDL = (dl / total)*100;
                errorPercentCC = (cc / total)*100;
                errorPercentIO = (io / total)*100;
                errorPercentII = (ii / total)*100;
                BigDecimal DLE = new BigDecimal(errorPercentDL).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal CCE = new BigDecimal(errorPercentCC).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal IOE = new BigDecimal(errorPercentIO).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal IIE = new BigDecimal(errorPercentII).setScale(2,RoundingMode.HALF_DOWN);
                ioNum.setText(""+io);
                dlNumPercent.setText(""+DLE.doubleValue()+"%");
                ccNumPercent.setText(""+CCE.doubleValue()+"%");
                ioNumPercent.setText(""+IOE.doubleValue()+"%");
                iiNumPercent.setText(""+IIE.doubleValue()+"%");
            }
        });
        updateFNumDown3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                io -= 1;
                total -= 1;
                errorPercentDL = (dl / total)*100;
                errorPercentCC = (cc / total)*100;
                errorPercentIO = (io / total)*100;
                errorPercentII = (ii / total)*100;
                BigDecimal DLE = new BigDecimal(errorPercentDL).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal CCE = new BigDecimal(errorPercentCC).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal IOE = new BigDecimal(errorPercentIO).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal IIE = new BigDecimal(errorPercentII).setScale(2,RoundingMode.HALF_DOWN);
                ioNum.setText(""+io);
                dlNumPercent.setText(""+DLE.doubleValue()+"%");
                ccNumPercent.setText(""+CCE.doubleValue()+"%");
                ioNumPercent.setText(""+IOE.doubleValue()+"%");
                iiNumPercent.setText(""+IIE.doubleValue()+"%");
            }
        });
        updateFNumUp4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ii += 1;
                total += 1;
                errorPercentDL = (dl / total)*100;
                errorPercentCC = (cc / total)*100;
                errorPercentIO = (io / total)*100;
                errorPercentII = (ii / total)*100;
                BigDecimal DLE = new BigDecimal(errorPercentDL).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal CCE = new BigDecimal(errorPercentCC).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal IOE = new BigDecimal(errorPercentIO).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal IIE = new BigDecimal(errorPercentII).setScale(2,RoundingMode.HALF_DOWN);
                iiNum.setText(""+ii);
                dlNumPercent.setText(""+DLE.doubleValue()+"%");
                ccNumPercent.setText(""+CCE.doubleValue()+"%");
                ioNumPercent.setText(""+IOE.doubleValue()+"%");
                iiNumPercent.setText(""+IIE.doubleValue()+"%");
            }
        });
        updateFNumDown4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ii -= 1;
                total -= 1;
                errorPercentDL = (dl / total)*100;
                errorPercentCC = (cc / total)*100;
                errorPercentIO = (io / total)*100;
                errorPercentII = (ii / total)*100;
                BigDecimal DLE = new BigDecimal(errorPercentDL).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal CCE = new BigDecimal(errorPercentCC).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal IOE = new BigDecimal(errorPercentIO).setScale(2,RoundingMode.HALF_DOWN);
                BigDecimal IIE = new BigDecimal(errorPercentII).setScale(2,RoundingMode.HALF_DOWN);
                iiNum.setText(""+ii);
                dlNumPercent.setText(""+DLE.doubleValue()+"%");
                ccNumPercent.setText(""+CCE.doubleValue()+"%");
                ioNumPercent.setText(""+IOE.doubleValue()+"%");
                iiNumPercent.setText(""+IIE.doubleValue()+"%");
            }
        });
    }
}
