package model;
import model.Ticket;

public class MES {
    private float recaudacion;
    private float saldo;
    private int topeTickets;
    private int contadorTickets;
    private float precioActual;
    private String contraseña;

    public MES(float recaudacion, float saldo, int topeTickets, int contadorTickets, float precioActual,String contraseña) {
        this.recaudacion = recaudacion;
        this.saldo = saldo;
        this.topeTickets = topeTickets;
        this.contadorTickets = contadorTickets;
        this.precioActual = precioActual;
        this.contraseña= contraseña;
    }

    public MES() {
    }

    public float getRecaudacion() {
        return recaudacion;
    }

    public float getSaldo() {
        return saldo;
    }

    public int getContadorTickets() {
        return contadorTickets;
    }

    public float getPrecioActual() {
        return precioActual;
    }

    public int getTopeTickets() {
        return topeTickets;
    }

    private void setPrecioActual(float precioActual){
        this.precioActual=precioActual;
    }

    private void setTopeTickets(int topeTickets) {
        this.topeTickets = topeTickets;
    }

    public boolean imprimirTicket(){
        if(this.saldo>precioActual) {
            if(contadorTickets+1=<topeTickets) {
                Ticket boleto = new Ticket();
                saldo = saldo - boleto.getPrecioEmitido();
                recaudacion= recaudacion+ boleto.getPrecioEmitido();
                contadorTickets++;
                return true;
            }
        }
        System.out.printf("error");
        return false;
    }

    public float ingresarDinero(float dinero){
        saldo=saldo+dinero;
        return saldo;
    }

    public float modificarPrecio(float nuevoPrecio){
        this.precioActual=nuevoPrecio;
        return nuevoPrecio;
    }
    public void verRecaudacion(){
        System.out.printf(""+getRecaudacion());
    }
    public int vaciarRecaudacion(){
        int recaudacionAnterior=this.recaudacion;
        recaudacion=0;
        contadorTickets=0;
        return recaudacionAnterior;
    }
    public void verTope(){
        System.out.printf(""+getTopeTickets());
    }
    public int cambiarTope(int nuevoTope){
        topeTickets=nuevoTope;
        return nuevoTope;
    }
}
