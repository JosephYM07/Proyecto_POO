public class Peliculas {//Atributos
    String director;
    String idioma;
    int anio;
    int tiempo_duracion;
    String premios;
    String protagonista;

    public Peliculas(String director, String idioma, int anio, int tiempo_duracion, String premios, String protagonista, String descripcion) {
        this.director = director;
        this.idioma = idioma;
        this.anio = anio;
        this.tiempo_duracion = tiempo_duracion;
        this.premios = premios;
        this.protagonista = protagonista;
        this.descripcion = descripcion;
    }

    String descripcion;
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getTiempo_duracion() {
        return tiempo_duracion;
    }

    public void setTiempo_duracion(int tiempo_duracion) {
        this.tiempo_duracion = tiempo_duracion;
    }

    public String getPremios() {
        return premios;
    }

    public void setPremios(String premios) {
        this.premios = premios;
    }

    public String getProtagonista() {
        return protagonista;
    }

    public void setProtagonista(String protagonista) {
        this.protagonista = protagonista;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}

