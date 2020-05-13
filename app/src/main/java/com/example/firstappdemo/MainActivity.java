package com.example.firstappdemo;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button count,reset;
    TextView zero;
    int number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        count=findViewById(R.id.buttonCount);
        reset=findViewById(R.id.reset);
        zero=findViewById(R.id.zero);
        count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              zero.setText(String.valueOf(++number));
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number=0;
                zero.setText(String.valueOf(number));
            }
        });
    }
}
