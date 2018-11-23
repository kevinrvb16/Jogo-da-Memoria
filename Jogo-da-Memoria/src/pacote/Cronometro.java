package pacote;

public class Cronometro {  
  
    private long inicio = 0;  
  
    // Construtor - também ativa o cronometro.  
    public Cronometro() {  
         inicio = System.currentTimeMillis();  
    }  
  
    // retorna tempo em segundos   
    // não interrompe o cronometro, pode ser chamado várias vezes  
    public int getAtual() {  
        long mili = System.currentTimeMillis() - inicio;  
        return (int) Math.round(mili / 1000.0);  
    }  
}  