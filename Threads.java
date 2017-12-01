//para usar hilos es importante poner extends Thread
public class Threads extends Thread{
  
  //creando constructor para pasar un mensaje 
  public Threads (String mensaje){
    super(mensaje);
  }

  //metodo que se ejecuta al momento de iniciar nuestro proceso ---> el nombre del método es propio de los hilos
  public void run(){
    //vamos a mostrar dos mensajes distintos mientras se cumpla el siguiente ciclo
    for (int i=0; i<100;i++ ) {
      System.out.println(this.getName());
    }
  }

  //metodo principal
  public static void main(String[] args){
    Threads hilo1 = new Threads("Primer Threads empezo ->");
    Threads hilo2 = new Threads("Segundo Threads....");

    //inicializamos
    hilo1.start();
    hilo2.start();
  }
}
