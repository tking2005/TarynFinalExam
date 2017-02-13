package nyc.c4q.tarynking.tarynfinalexam;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * Created by tarynking on 2/12/17.
 */

public class ProfileActivity extends AppCompatActivity {

    ImageButton heartIcon;
    ImageButton emailIcon;
    ImageButton contactsIcon;
    ImageButton logoutIcon;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_drawer_layout);


        heartIcon = (ImageButton) findViewById(R.id.heart_icon);
        emailIcon = (ImageButton) findViewById(R.id.email_icon);
        contactsIcon = (ImageButton) findViewById(R.id.contacts_icon);
        logoutIcon = (ImageButton) findViewById(R.id.logout_icon);


        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview_id);
        NavigationAdapter navigationAdapter = new NavigationAdapter();
        recyclerView.setAdapter(navigationAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }

    public void setOnclickListener(int activity_navigation_drawer_layout) {
        heartIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onButtonPressed(R.id.heart_icon);
            }
        });

        emailIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onButtonPressed(R.id.email_icon);
            }
        });
        contactsIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onButtonPressed(R.id.contacts_icon);
            }
        });

        logoutIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onButtonPressed(R.id.logout_icon);
            }
        });
    }


    public void onButtonPressed(int num) {
        switch (num) {
            case R.id.heart_icon:
                Toast.makeText(this, "Selected Heart Activity", Toast.LENGTH_SHORT).show();
                break;
            case R.id.email_icon:
                Toast.makeText(this, "Selected Message Activity", Toast.LENGTH_SHORT).show();
                break;
            case R.id.contacts_icon:
                Intent intent = new Intent(getApplicationContext(), SettingsActivity.class);
                startActivity(intent);
                break;
            case R.id.logout_icon:
                Toast.makeText(this, "Selected Logout Activity", Toast.LENGTH_SHORT).show();
                finish();
                break;
        }
    }
}
