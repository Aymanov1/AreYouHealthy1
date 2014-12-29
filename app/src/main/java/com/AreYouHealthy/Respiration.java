/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.AreYouHealthy;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author AYMEN
 */
public class Respiration extends Activity implements View.OnClickListener{

  
    Button stop, testPoulse,suivant;
    TextView compteur,question;
    EditText getpoulse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); //To change body of generated methods, choose Tools | Templates.
        setContentView(R.layout.test1);
        testPoulse = (Button) findViewById(R.id.testPoulse);
        stop = (Button) findViewById(R.id.stop);
        suivant = (Button) findViewById(R.id.suivant1);
        getpoulse = (EditText) findViewById(R.id.getpoulse);
        compteur = (TextView) findViewById(R.id.compteur);
        question = (TextView) findViewById(R.id.question);
        testPoulse.setOnClickListener(this);
        stop.setOnClickListener(this);
        suivant.setOnClickListener(this);
        compteur.setText("00:01:00");
        question.setText("Combien avez vous de RESPIRATION pendant une minute ??");
    }
final CounterClass timer= new CounterClass(60000,1000);
    public void onClick(View v) {

        int i = v.getId();
        if (i == R.id.testPoulse) {
            timer.start();

        } else if (i == R.id.stop) {
            timer.cancel();


        } else if (i == R.id.suivant1) {
            Intent intent = new Intent(this, OtherTests.class);
            intent.putExtra("OtherTests", "OtherTests");
            startActivity(intent);


        }
    }

    @TargetApi(Build.VERSION_CODES.GINGERBREAD)
    @SuppressLint("NewApi")
    public class CounterClass extends CountDownTimer {

        public CounterClass(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override
        public void onTick(long millisUntilFinished) {
            long millis=millisUntilFinished;
            String hms=String.format("%02d:%02d:%02d",TimeUnit.MILLISECONDS.toHours(millis),TimeUnit.MILLISECONDS.toMinutes(millis)-TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(millis)),TimeUnit.MILLISECONDS.toSeconds(millis)-TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millis)));
            compteur.setText(hms);
            
            
        }

        @Override
        public void onFinish() {
            compteur.setText("completed.");

        }
    }
}
