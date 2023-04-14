package ru.mirea.smirnov.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String text = (String) getIntent().getSerializableExtra("time");

        TextView view = (TextView) findViewById(R.id.textView);
        TextView view2 = (TextView) findViewById(R.id.textView2);
        view.setText(String.format("Квадрат значения моего номера по списку является: %s", 25*25));
        view2.setText(String.format("Текущее время %s", text));

    }
}