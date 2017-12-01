public class Threads extends Thread{

  public Threads (String mensaje){
    super(mensaje);
  }

  //metodo que se ejecuta al momento de iniciar nuestro proceso
  public void run(){
    //vamos a mostrar un mensaje mientras se cumpla el siguiente ciclo
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
