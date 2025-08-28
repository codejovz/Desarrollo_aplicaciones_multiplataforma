package com.example.ejer2.menu;
//Terminado
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowInsets;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.example.ejer2.R;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//import android.content.Context.*;

public class Activity1 extends AppCompatActivity {

    private EditText EditTextContenidoArchivo, EditTextNombreArchivo;
    private Button buttonEscribir, buttonMostrar;
    private TextView textViewActivity1;
    private Button salir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        buttonEscribir = findViewById(R.id.buttonEscribir);
        buttonMostrar = findViewById(R.id.buttonMostrar);
        EditTextContenidoArchivo = findViewById(R.id.EditTextContenidoArchivo);
        EditTextNombreArchivo = findViewById(R.id.EditTextNombreArchivo);
        textViewActivity1 = findViewById(R.id.textViewArchivos);

        salir = findViewById(R.id.buttonExit1);

        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
            }
        });

        buttonMostrar.setOnClickListener(v ->{

            String nombre_archivo = EditTextNombreArchivo.getText().toString();
            String contenido = EditTextContenidoArchivo.getText().toString();

            if(nombre_archivo.isEmpty()){
                Toast.makeText(this, "Añade algo",Toast.LENGTH_SHORT);
            }else{
                mostrarContenido(nombre_archivo);

            }


        });

        buttonEscribir.setOnClickListener(v ->{

            String nombre_archivo = EditTextNombreArchivo.getText().toString();
            String contenido_archivo= EditTextContenidoArchivo.getText().toString();

            if(nombre_archivo.isEmpty() || contenido_archivo.isEmpty()){
                Toast.makeText(this, "Añade el nombre y el contenido",Toast.LENGTH_SHORT).show();
            }else{
                escribirArchivo(nombre_archivo, contenido_archivo);

            }


        });


        View root = findViewById(R.id.activity1);  // Assuming your root layout has this id
        ViewCompat.setOnApplyWindowInsetsListener(root, (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return
            insets;
        });
    }

    private void mostrarContenido(String nombre_archivo){

        String contenido_archivo= leerArchivo(nombre_archivo);

        if(nombre_archivo != null){
            textViewActivity1.setText(contenido_archivo);
        }else {
            Toast.makeText(this, "No hay ningun archivo en la memoria", Toast.LENGTH_SHORT).show();
        }
    }

    private String leerArchivo(String nombre_archivo){
        nombre_archivo=EditTextNombreArchivo.getText().toString();
        FileInputStream fis = null;
        try{

            fis = openFileInput(nombre_archivo);
            StringBuilder stringBuilder = new StringBuilder();
            int i;
            while((i = fis.read())!= -1){
                stringBuilder.append((char)i);
            }return stringBuilder.toString();


        }catch(IOException e){
            e.printStackTrace();
            return null;
        }finally {
            if(fis != null){
                try{
                    fis.close();
                }catch(IOException e){
                    e.printStackTrace();
                }


            }

        }
    }

    private void escribirArchivo(String nombre_archivo, String texto){

        FileOutputStream fos= null;
        texto = EditTextContenidoArchivo.getText().toString();
        try{

            fos = openFileOutput(nombre_archivo, Context.MODE_PRIVATE);
            fos.write(texto.getBytes());
            Toast.makeText(this, "Cargado con exito", Toast.LENGTH_SHORT);
        }catch(IOException e){
            e.printStackTrace();
        }finally {
            if(fos != null){
                try{
                    fos.close();
                }catch(IOException e){
                    e.printStackTrace();
                }


            }

        }


    }


}