package e.qi.basic_ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import e.qi.basic_ui.R;

public class FindActivity extends AppCompatActivity {

    private ArrayAdapter adapter;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find);

        spinner=(Spinner) findViewById(R.id.ageSpinner);
        adapter=ArrayAdapter.createFromResource(this, R.array.age, android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        TextView EnterButton = (TextView) findViewById(R.id.EnterButton);
        EnterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent findIntent=new Intent(FindActivity.this, e.qi.basic_ui.EnterActivity.class);
                FindActivity.this.startActivity(findIntent);
            }
        });
    }
}