/*Crear una aplicación que pueda insertar elementos XML desde el código Java.

Usa un EditText y un Button para elegir el número de elementos que vas a añadir. +
Usa un EditText y un Button para poder buscar los elementos que cumplan una condición sin usar el ID
Señala los elementos encontrados, para poder visualizarlos cambia el color o el texto o los dos a la vez.*/


package com.example.ejer3;
import com.example.ejer3.MainActivity;
import com.example.ejer3.R;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private EditText etNumberOfElements;
    private Button btnAddElements;
    private EditText etSearchText;
    private Button btnSearch;
    private LinearLayout containerLayout;
    private List<TextView> textViews = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNumberOfElements = findViewById(R.id.etNumberOfElements);
        btnAddElements = findViewById(R.id.btnAddElements);
        etSearchText = findViewById(R.id.etSearchText);
        btnSearch = findViewById(R.id.btnSearch);
        containerLayout = findViewById(R.id.containerLayout);

        btnAddElements.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addElements();
            }
        });

        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                searchElements();
            }
        });
    }

    private void addElements() {
        String numStr = etNumberOfElements.getText().toString();
        if (!numStr.isEmpty()) {
            int numElements = Integer.parseInt(numStr);
            containerLayout.removeAllViews();
            textViews.clear();

            for (int i = 0; i < numElements; i++) {
                TextView textView = new TextView(this);
                textView.setText("Elemento " + (i + 1));
                textView.setTextSize(18);
                textView.setPadding(16, 16, 16, 16);
                containerLayout.addView(textView);
                textViews.add(textView);
            }
        } else {
            Toast.makeText(this, "Por favor, ingrese un número", Toast.LENGTH_SHORT).show();
        }
    }

    private void searchElements() {
        String searchText = etSearchText.getText().toString().toLowerCase();
        boolean found = false;

        for (TextView tv : textViews) {
            if (tv.getText().toString().toLowerCase().contains(searchText)) {
                tv.setTextColor(Color.WHITE);
                tv.setBackgroundColor(Color.BLACK);
                found = true;
            } else {
                tv.setTextColor(Color.BLACK);
                tv.setBackgroundColor(Color.TRANSPARENT);
            }
        }

        if (!found) {
            Toast.makeText(this, "No se encontraron elementos", Toast.LENGTH_SHORT).show();
        }
    }
}