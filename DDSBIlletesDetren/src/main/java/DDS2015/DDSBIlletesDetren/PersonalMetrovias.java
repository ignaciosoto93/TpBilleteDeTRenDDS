package DDS2015.DDSBIlletesDetren;

import java.util.Calendar;
import java.util.List;

public class PersonalMetrovias {
	private List<Cliente> clientes;
	private List<Estacion> estaciones;
	private TarjetaCreditoService serviceTarjeta;
	private EncargadoDeSeguridad encargadoDeSeguridad;
	private List<Billete> billetes;
	
	public List<Plaza> getPlazasDisp(int tipo, int clase, Calendar horario){
		return null;
	}
	
	public int getPrecioPlaza(Plaza plaza){
		return 0;
	}
	
	public void cargarPago(int tarjeta_numero, double precio){
		
	};
	
	public Billete generarBillete(Plaza plaza,Vagon vagon, Tren tren, double precio){
		return null;
	}
	
	public List<Tren> getTrenesActivos(Calendar horario){
		return null;
	}
	
	
	public boolean plazasDisponiblesAlcanzan(int cantidad){
		return false;
	}

}
