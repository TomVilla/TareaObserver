
public aspect Log {
	pointcut callChange(): call(* cambiar*(..) ); 
    after() : callChange() {
		System.out.println("Nuevo Color: "+ Ventana.colorActual);
    } 
}
