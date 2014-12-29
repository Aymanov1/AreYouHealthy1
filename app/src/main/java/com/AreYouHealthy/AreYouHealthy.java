package com.AreYouHealthy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

public class AreYouHealthy extends Activity implements View.OnClickListener {

    ImageButton homme, femme, enfant;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Log.i("panne xml1", "panne xml1");
        homme = (ImageButton) findViewById(R.id.homme);
        femme = (ImageButton) findViewById(R.id.femme);
        enfant = (ImageButton) findViewById(R.id.enfant);
        homme.setOnClickListener(this);
        femme.setOnClickListener(this);
        enfant.setOnClickListener(this);
        
    }

    public void onClick(View v) {
        Intent intent = new Intent(this, EnregistrementEtat.class);
        int i = v.getId();
        if (i == R.id.enfant) {
            intent.putExtra("EnregistrementEtat", "bonjour aymoun");
            startActivity(intent);

        } else if (i == R.id.femme) {
            intent.putExtra("EnregistrementEtat", "bonjour aymoun");
            startActivity(intent);

        } else if (i == R.id.homme) {
            intent.putExtra("EnregistrementEtat", "bonjour aymoun");
            startActivity(intent);

        }
    }
}
