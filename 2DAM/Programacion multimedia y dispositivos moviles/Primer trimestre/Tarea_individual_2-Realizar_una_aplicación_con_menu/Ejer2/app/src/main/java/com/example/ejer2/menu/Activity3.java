package com.example.ejer2.menu;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.ejer2.R;
import com.example.ejer2.database.DatabaseHelper;

public class Activity3 extends AppCompatActivity {

    private DatabaseHelper dbHelper;
    private Button ButtonStudent;
    private TextView textViewStudents;
    private EditText EditTextPersonName;
    private EditText EditTextAge;

    private Button salir;

    private void loadStudent() {
        String students = dbHelper.getAllStudents_V2();
        textViewStudents.setText(students);
    }

    private void addStudent() {
        String name = EditTextPersonName.getText().toString();
        String age_string = EditTextAge.getText().toString();
        if (age_string.isEmpty() && name.isEmpty()) {
            Toast.makeText(this, "Error", Toast.LENGTH_LONG).show();
        } else {
            int age = Integer.parseInt(age_string);
            boolean inserted = dbHelper.insertStudent(name, age);
            if (inserted) {
                Toast.makeText(this, "El alumno " + name + " y con la edad " + age + " ha sido creado.", Toast.LENGTH_LONG).show();
                EditTextPersonName.setText("");
                EditTextAge.setText("");
                loadStudent();
            } else {
                Toast.makeText(this, "Error al insertar el estudiante", Toast.LENGTH_LONG).show();
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        salir = findViewById(R.id.buttonExit3);

        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
            }
        });

        dbHelper = new DatabaseHelper(this);
        ButtonStudent = findViewById(R.id.ButtonStudent);
        textViewStudents = findViewById(R.id.textViewStudents);
        EditTextPersonName = findViewById(R.id.EditTextPersonName);
        EditTextAge = findViewById(R.id.EditTextAge);

        loadStudent();

        ButtonStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addStudent();
            }
        });

        View root = findViewById(R.id.activity3);
        ViewCompat.setOnApplyWindowInsetsListener(root, (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}