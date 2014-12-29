/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.AreYouHealthy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 *
 * @author AYMEN
 */
public class EnregistrementEtat extends Activity implements View.OnClickListener {

    private Button declancher, annuler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); //To change body of generated methods, choose Tools | Templates.
        setContentView(R.layout.etat);
        declancher = (Button) findViewById(R.id.declancher);
        declancher.setOnClickListener(this);
        annuler = (Button) findViewById(R.id.annuler);
        annuler.setOnClickListener(this);

    }

    public void onClick(View v) {

        int i = v.getId();
        if (i == R.id.declancher) {
            Intent intent = new Intent(this, TestPoulse.class);
            intent.putExtra("TestPoulse", "bonjour aymoun");
            startActivity(intent);

        } else if (i == R.id.annuler) {

        }

    }

}
