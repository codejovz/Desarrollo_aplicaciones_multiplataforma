package com.example.ejer4;
import com.example.ejer4.R;
import android.util.Log;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private View mainView;
    private Button btnReiniciar, btnDetener, btnIniciar;
    public TextView cronometro;

    private int dmins, mins, dsegs, segs, dmilis, milis;
    private boolean parado;
    private boolean primero = true;

    private Object monitor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        monitor = new Object();
        dmins = 0; mins = 0; dsegs = 0; segs = 0; dmilis =0; milis = 0;
        parado = true;
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        btnReiniciar = findViewById(R.id.btnReiniciar);
        btnDetener = findViewById(R.id.btnDetener);
        btnDetener.setEnabled(false);
        btnIniciar = findViewById(R.id.btnIniciar);

        cronometro = findViewById(R.id.cronometro);
        hiloCronometro hc = new hiloCronometro(parado,cronometro, monitor, dmins, mins, dsegs, segs, dmilis, milis);
        hc.start();

        btnIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                synchronized (monitor) {
                    hc.unsetParado();
                    monitor.notify(); // Notifica al hilo que está esperando
                }
                btnIniciar.setEnabled(false);
                btnDetener.setEnabled(true);
            }
        });

        btnDetener.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hc.setParado();
                btnDetener.setEnabled(false);
                btnIniciar.setEnabled(true);
            }
        });

        btnReiniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hc.reset();
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }




}