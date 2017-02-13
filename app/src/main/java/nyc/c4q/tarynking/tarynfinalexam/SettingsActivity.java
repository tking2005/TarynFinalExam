package nyc.c4q.tarynking.tarynfinalexam;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

/**
 * Created by tarynking on 2/12/17.
 */

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_activity);


        RecyclerView recyclerView2 = (RecyclerView) findViewById(R.id.settings_recyclerview_id);
        SettingsAdapter settingsAdapter = new SettingsAdapter();
        recyclerView2.setAdapter(settingsAdapter);
        recyclerView2.setLayoutManager(new LinearLayoutManager(this));


    }
}
