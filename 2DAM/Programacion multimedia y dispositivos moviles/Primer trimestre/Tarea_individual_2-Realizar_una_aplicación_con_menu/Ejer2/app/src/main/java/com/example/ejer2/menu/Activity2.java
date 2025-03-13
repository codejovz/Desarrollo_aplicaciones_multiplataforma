package com.example.ejer2.menu;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.ejer2.R;


public class Activity2 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        View root = findViewById(R.id.activity2);
        EditText editTextName=findViewById(R.id.editTextName);
        Button buttonSaveName=findViewById(R.id.buttonSaveName);
        TextView textViewName=findViewById(R.id.textViewName);

        SharedPreferences sharedPreferences = getSharedPreferences("MyPref",MODE_PRIVATE);
        String savedName = sharedPreferences.getString("name","No name saved");
        textViewName.setText(savedName);

        Button salir = findViewById(R.id.buttonExit2);

        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
            }
        });


        buttonSaveName.setOnClickListener(v ->{
            String newName = editTextName.getText().toString();
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString("name", newName);
            editor.apply();
            textViewName.setText(newName);
        }) ;


        // Assuming your root layout has this id
        ViewCompat.setOnApplyWindowInsetsListener(root, (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return
                    insets;
        });
    }
}
