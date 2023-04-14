package ru.mirea.smirnov.favoritebook;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            TextView Bookview = findViewById(R.id.textView2);
            String university = extras.getString(MainActivity.KEY);
            Bookview.setText(String.format("Моя любимая книга: %s", university));
        }
    }
    public void click(View view){
        EditText EdText = (EditText) findViewById(R.id.editTextTextPersonName);

        Intent data = new Intent();
        data.putExtra(MainActivity.USER_MESSAGE, EdText.getText().toString());
        setResult(Activity.RESULT_OK, data);
        finish();
    }
}