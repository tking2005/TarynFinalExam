package nyc.c4q.tarynking.tarynfinalexam;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {


    Button SubmitButton;
    EditText UsernameEditText;
    EditText PasswordEditText;
    String sUsername;
    String sPasswordname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        SubmitButton = (Button) findViewById(R.id.submit_button_id);
        UsernameEditText = (EditText)findViewById(R.id.username_edit_text);
        PasswordEditText = (EditText)findViewById(R.id.password_edit_text);





        // Capture button clicks
        SubmitButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                sUsername = UsernameEditText.getText().toString();
                sPasswordname = PasswordEditText.getText().toString();

                if (sUsername.matches("")){
                    Toast.makeText(view.getContext(),"Enter a username",Toast.LENGTH_SHORT).show();
                    return;
                }else if (sPasswordname.matches("")){
                    Toast.makeText(view.getContext(),"Enter a password",Toast.LENGTH_SHORT).show();
                    return;
                }else {
                    Intent myIntent = new Intent(LoginActivity.this, ProfileActivity.class);
                    startActivity(myIntent);
                }
            }
        });


    }
}
