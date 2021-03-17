package fecha;

/**
 * @author Bernardo Díaz Larrauri Calleja
 *
 */
public class Fecha {

    /**
     * @return the dia
     */
    public int getDia() {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(int dia) {
        this.dia = dia;
    }

    /**
     * @return the mes
     */
    public int getMes() {
        return mes;
    }

    /**
     * @param mes the mes to set
     */
    public void setMes(int mes) {
        this.mes = mes;
    }

    /**
     * @return the anyo
     */
    public int getAnyo() {
        return anyo;
    }

    /**
     * @param anyo the anyo to set
     */
    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    private int dia;
    private int mes;
    private int anyo;
/**
 * Constructor de la clase fecha.
 * @param dia , representa el dia de la fecha.
 * @param mes , representa el mes de la fecha.
 * @param anyo, representa en año de la fecha
 */
    public Fecha(int dia, int mes, int anyo) {
        this.dia = dia;
        this.mes = mes;
        this.anyo = anyo;
    }
/**
 * Este método sirve para validar una fecha introduccida por parámetros dia, ms y año.
 * @return 
 */
    public boolean validaFecha() {

        if (getDia() < 1 || getDia() > 31) {
            return false;
        }
        if (getMes() < 1 || getMes() > 12) {
            return false;
        }

// Determinamos la cantidad de días del mes:
        int diasMes = 0;
        switch (getMes()) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                diasMes = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                diasMes = 30;
                break;
            case 2:
                diasMes = bisiesto();
                break;

        }

        return getDia() <= diasMes;

    }

    
    /**
     * Este método sirve para saber los días que tiene el mes de febrero
     * en función del año. Tiene en cuenta si es bisiesto
     * @return diasMes;
     */
    private int bisiesto() {
        int diasMes;
        // Verificamos si el año es bisiesto
        if ((getAnyo() % 400 == 0) || ((getAnyo() % 4 == 0) && (getAnyo() % 100 != 0))) {
            diasMes = 29;
        } else {
            diasMes = 28;
        }
        return diasMes;
    }

}