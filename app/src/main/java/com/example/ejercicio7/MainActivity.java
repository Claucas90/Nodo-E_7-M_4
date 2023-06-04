package com.example.ejercicio7;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private boolean isTheme1 = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = findViewById(R.id.imageView);
        TextView textView = findViewById(R.id.textView);
        Button button = findViewById(R.id.button);
        EditText editText = findViewById(R.id.editText);
        CheckBox checkBox = findViewById(R.id.checkBox);

        // Bienvenida
        Toast.makeText(this, "¡Bienvenido!", Toast.LENGTH_SHORT).show();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isTheme1 = !isTheme1;
                if (isTheme1) {
                    setTheme(R.style.Theme1);
                } else {
                    setTheme(R.style.Theme2);
                }
                recreate();
            }
        });

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {

                    Toast.makeText(MainActivity.this, "CheckBox marcado", Toast.LENGTH_SHORT).show();
                } else {

                    Toast.makeText(MainActivity.this, "CheckBox desmarcado", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
