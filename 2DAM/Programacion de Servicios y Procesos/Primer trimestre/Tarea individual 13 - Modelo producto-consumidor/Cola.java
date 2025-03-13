package variosproductoresFIFO;

public class Cola {
    
    private int delante, atras, capacidad, ocupa;
    private int[] buffer;
    
    public Cola(int i) {
        this.capacidad = i;
        this.buffer = new int[i];
        this.delante = 0;
        this.atras = -1;
        this.ocupa = 0;
    }
    
    synchronized public int extraer() {
        while(this.ocupa == 0) {
            try {
                this.wait();
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        int elem = this.buffer[delante];
        delante = (delante + 1) % capacidad;
        ocupa--;
        
        this.notify();
        System.out.println("Extraido " + elem + " | tamaño: " + this.ocupa);
        return elem;
    }
    
    synchronized public void insertar(int elem) {
        while(this.ocupa == this.capacidad) {
            try {
                this.wait();
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        atras = (atras + 1) % capacidad;
        this.buffer[atras] = elem;
        ocupa++;
        
        System.out.println("Insertado " + elem + " | tamaño: " + this.ocupa);
        
        this.notifyAll();
    }
}
