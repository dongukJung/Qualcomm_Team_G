package e.qi.basic_ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class EnterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter);
    }

    public void onClick(View view) {
        Toast.makeText(this, "Verification Success", Toast.LENGTH_SHORT).show();
        finish();
        Intent intent = new Intent(this, LoginSuccessActivity.class);
        startActivity(intent);
    }
}
