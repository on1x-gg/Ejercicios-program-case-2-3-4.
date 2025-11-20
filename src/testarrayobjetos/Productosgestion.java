package testarrayobjetos;
import objetos.*;
public class Productosgestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto[] productos=new Producto[10];
		int opcion,opcionsalir=0;
		productos[0]=new Producto("Yogurt",11,0.75);
		productos[3]=new Producto("Naranja",3,4.0);
		productos[6]=new Producto("Cereales",9,3.0);
		System.out.println("1-Sumar precios de stock impar");
		opcion=Util.leerInt();
		switch (opcion) {
		case 1: 
			double total=0;
			for(int i=0;i<productos.length;i++) {
				if(productos[i]!=null&&productos[i].getStock()/2!=0) {
					total+=productos[i].getPrecio();
				}
			}
			System.out.println("el total es "+total);
			break;
		case 2 :
			Double max=0.0;
			for(int i=0;i<productos.length;i++) {
				if(productos[i]!=null) {
					if(productos[i].getStock()>=5) {
					if(productos[i].getPrecio()>max) {
						max=productos[i].getPrecio();
						}
					}
				}
			}
			for(int i=0;i<productos.length;i++) {
				if(productos[i]!=null) {
					if(max==productos[i].getPrecio())
					System.out.println("El producto con stock de mas de 5 y precio mas alto es "+productos[i].toString());
				}
			}
			break;
		case 3:
			Producto aux;
			for (int i = 0; i < productos.length; i++) {
				for (int x = i + 1; x < productos.length-1; x++) {
					if (productos[i]==null) {
						aux = productos[i];
						productos[i] = productos[x];
						productos[x] = aux;
					}
				}
			}
			for (int i = 0; i < productos.length; i++) {
				if (productos[i]!=null) {
					System.out.println(productos[i].toString());
				}
				else {
					System.out.println("-----------------------------------");
				}
			}
			break;
		case 4:
			Producto max1=new Producto(" ",0,0.0);
			Producto min=new Producto(" ",0,1000.0);
			int max2=0,min2=0;
			for(int i=0;i<productos.length;i++) {
				if(productos[i]!=null) {
					if(productos[i].getPrecio()>max1.getPrecio()) {
						max1=productos[i];
						max2=i;
						}
				}
			}
			for(int i=0;i<productos.length;i++) {
				if(productos[i]!=null) {
					if(productos[i].getPrecio()<min.getPrecio()) {
						min=productos[i];
						min2=i;
						}
				}
			}
			productos[max2]=min;
			productos[min2]=max1;
			for (int i = 0; i < productos.length; i++) {
				if (productos[i]!=null) {
					System.out.println(productos[i].toString());
				}
				else {
					System.out.println("-----------------------------------");
				}
			}
			break;
		default:
			System.out.println("Elige una opcion valida");
			break;
		}
	}
	
}
