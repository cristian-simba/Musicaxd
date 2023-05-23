public class Genero{
    String tipo, ritmo, pais, artista, festival;
    int anio;

    //Los Constuctores inicializa los valores de una clase
    public Genero(String tipo, String ritmo, String pais, String artista, String festival, int anio) {
        this.tipo = tipo;
        this.ritmo = ritmo;
        this.pais = pais;
        this.artista = artista;
        this.festival = festival;
        this.anio = anio;
    }

    // Puntero variable que se almacena en una dirección de memoria de un objeto y sirve para pasar datos de una dirección de memoria a otra.
    // this es un puntero (hacia si mismo) y nos ayuda a la optimización de memoria.
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRitmo() {
        return ritmo;
    }

    public void setRitmo(String ritmo) {
        this.ritmo = ritmo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getFestival() {
        return festival;
    }

    public void setFestival(String festival) {
        this.festival = festival;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    public void imprimirDatos(){
        System.out.println(this.tipo);
        System.out.println(this.ritmo);
        System.out.println(this.anio);
        System.out.println(this.pais);
        System.out.println(this.artista);
        System.out.println(this.festival);
    }
}
