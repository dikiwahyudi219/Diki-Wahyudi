package id.d3ifcool.belajarbahasa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView kuisTextView = findViewById(R.id.kuis);
        kuisTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, KuisActivity.class);
                startActivity(i);
            }
        });

        TextView kamusTextView = findViewById(R.id.kamus);
        kamusTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, KamusActivity.class);
                startActivity(i);
            }
        });
    }
}
