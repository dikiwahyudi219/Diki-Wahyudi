package id.d3ifcool.belajarbahasa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class Sunda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_bahasa);

        ArrayList<Word> data = new ArrayList<>();
        data.add (new Word("Luti", "One"));
        data.add (new Word("Luti", "One"));
        data.add (new Word("Luti", "One"));
        data.add (new Word("Luti", "One"));
        data.add (new Word("Luti", "One"));
        data.add (new Word("Luti", "One"));
        data.add (new Word("Luti", "One"));



        RecyclerView recyclerView = findViewById(R.id.wordlist);
        LinearLayoutManager m = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(m);
        WordAdapter adapter = new WordAdapter(this,data);
        recyclerView.setAdapter(adapter);

    }

}
