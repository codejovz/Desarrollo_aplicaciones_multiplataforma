package com.example.ejer4;
import com.example.ejer4.R;
import android.util.Log;
import android.widget.TextView;

public class hiloCronometro extends Thread {
    public TextView cronometro;

    private int dmins, mins, dsegs, segs, dmilis, milis;
    private boolean parado;

    private final Object monitor;

    public hiloCronometro(boolean parado, TextView cronometro, Object monitor, int dmins, int mins, int dsegs, int segs, int dmilis, int milis)  {
        this.parado = parado;
        this.cronometro = cronometro;
        this.monitor = monitor;
        this.dmins = dmins;
        this.mins = mins;
        this.dsegs = dsegs;
        this.segs = segs;
        this.dmilis = dmilis;
        this.milis = milis;
    }

    public void setParado(){
        this.parado = true;
    }//5,4 sin test

    public synchronized void unsetParado() {
        this.parado = false;
        synchronized (monitor) {
            monitor.notify();
        }
    }

    public void reset(){
        this.dmins = 0; this.mins = 0; this.dsegs = 0; this.segs = 0;
        this.dmilis =0; this.milis = 0;
        cronometro.setText("0 0 : 0 0 , 00");
    }

    public void run() {

        synchronized (monitor){



        dmins = 0; mins = 0; dsegs = 0; segs = 0; dmilis =0; milis = 0;

            while (true) { // Cambiamos el bucle para que sea infinito
                while (this.parado) {
                    try {
                        monitor.wait(); // Espera en el monitor
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            try{
                Thread.sleep(10);
            }catch(InterruptedException e){
                e.printStackTrace();
            }

            milis = milis + 10;

            if(milis == 100) {
                milis = 0;
                dmilis = dmilis +1;
            }

            if(dmilis==10) {
                dmilis = 0;
                segs = segs +1;
            }

            if(segs == 10) {
                segs = 0;
                dsegs = dsegs +1;
            }

            if(dsegs == 6) {
                dsegs = 0;
                mins = mins + 1;
            }

            if(mins == 10 ) {
                mins = 0;
                dmins = dmins +1;
            }
            String todo = String.valueOf(dmins)+" "+ String.valueOf(mins)+ " : "+ String.valueOf(dsegs)+" "+String.valueOf(segs)+" , "+String.valueOf(dmilis)+""+String.valueOf(milis/10);
            cronometro.setText(todo);
            //R.id.cronometro.setText(todo);
            //System.out.println(dmins+" "+mins+" : "+dsegs+" "+segs+" , "+dmilis+""+milis/10);
            //Log.v("algo", String.valueOf(milis));
                if (this.parado) {
                    continue; // Vuelve al inicio del bucle si se ha pausado
                }
        }
        //this.notifyAll();
    }
}}
//}