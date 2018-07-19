package e.qi.basic_ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import e.qi.basic_ui.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView registerButton = (TextView) findViewById(R.id.registerButton);
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerIntent=new Intent(LoginActivity.this, e.qi.basic_ui.RegisterActivity.class);
                LoginActivity.this.startActivity(registerIntent);
            }
        });

        TextView FindButton = (TextView) findViewById(R.id.FindButton);
        FindButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent findIntent=new Intent(LoginActivity.this, e.qi.basic_ui.FindActivity.class);
                LoginActivity.this.startActivity(findIntent);
            }
        });
    }
}
