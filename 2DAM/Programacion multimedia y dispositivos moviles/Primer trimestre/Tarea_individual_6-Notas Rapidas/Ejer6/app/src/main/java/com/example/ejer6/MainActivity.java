package com.example.ejer6;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnSaveNote, btnDelete;
    private LinearLayout linearLayout;
    private EditText etNoteTitle, etmlNoteContent;

    private boolean[] itemsSelected;
    private int numIds = 0;  //even for layouts and odd for checkbox

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        itemsSelected = new boolean[100];

        etNoteTitle = findViewById(R.id.etNoteTitle);
        etmlNoteContent = findViewById(R.id.etmlNoteContent);
        linearLayout = findViewById(R.id.linearLayout);

        btnSaveNote = findViewById(R.id.btnSaveNote);
        btnSaveNote.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v){

               String noteTitle = String.valueOf(etNoteTitle.getText());
               String noteContent = String.valueOf(etmlNoteContent.getText());

               LinearLayout ll = new LinearLayout(MainActivity.this);
               ll.setId(numIds); numIds ++;
               TextView tv = new TextView(MainActivity.this);
               tv.setPadding(100,8,8,8);
               tv.setTypeface(null, Typeface.BOLD);
               tv.setTextSize(24);
               TextView TextViewML = new TextView(MainActivity.this);
               TextViewML.setPadding(100,8,8,30);

               tv.setText(noteTitle);
               TextViewML.setText(noteContent);

               CheckBox ck = new CheckBox(MainActivity.this);
               ck.setId(numIds); numIds++;
               int checkboxId = ck.getId();
               ck.setPadding(150,0,0,0);
               ck.setOnCheckedChangeListener((buttonView, isChecked) -> {
                   int actualId = ck.getId();

                   if (isChecked) {
                    itemsSelected[actualId] = true;

                   } else {
                    itemsSelected[actualId] = false;
                   }
               });

               ll.addView(ck);
               ll.addView(tv);
               ll.addView(TextViewML);
               LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                       LinearLayout.LayoutParams.WRAP_CONTENT,
                       LinearLayout.LayoutParams.WRAP_CONTENT
               );
               ll.setLayoutParams(params);
               ll.setOrientation(LinearLayout.VERTICAL);
               linearLayout.addView(ll);
           }
        });

        btnDelete = findViewById(R.id.btnDelete);
        btnDelete.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v){

            for(int x = itemsSelected.length - 1 ; x>=0; x--){

                if(itemsSelected[x] == true){
                    linearLayout.removeView(findViewById(x-1));
                    itemsSelected[x] = false;
                }
            }
           }
        });
    }
}