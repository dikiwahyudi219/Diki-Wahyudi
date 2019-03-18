package id.d3ifcool.belajarbahasa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class KamusActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kamus_activity);

        TextView sunda = findViewById(R.id.sunda);
        sunda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(KamusActivity.this, Sunda.class);
                startActivity(i);
            }
        });

        TextView batak = findViewById(R.id.batak);
        batak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(KamusActivity.this, Batak.class);
                startActivity(i);
            }
        });

        TextView padang = findViewById(R.id.padang);
        padang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(KamusActivity.this, Padang.class);
                startActivity(i);
            }
        });

        TextView Jawa = findViewById(R.id.jawa);
        Jawa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(KamusActivity.this, Jawa.class);
                startActivity(i);
            }
        });
    }
}

