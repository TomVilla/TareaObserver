
public aspect Log {
	pointcut callChange(): call(* cambiar*(..) ); 
    after() : callChange() {
		System.out.println("Nuevo Color: "+ Ventana.colorActual);
    } 
    pointcut cerrar():call(* cerrar*(..));
    before() : cerrar(){
    	System.out.println("Se ha cerrado la ventana exitosamente");
    }
}
