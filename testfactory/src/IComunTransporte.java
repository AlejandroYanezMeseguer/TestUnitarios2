
public interface IComunTransporte {

    /**
     * metodos que se implementaran a todas las clases que implementen la interfaz
     * @param cp el codigo postal
     * @return un dato de tipo float que será el coste en función del codigo postal introducido
     */
    float costeTotal(int cp);

    /**
     * metodos que deberán ser implementados por todas las clases que implementen la interfaz
     * @param x la dimension X del transporte
     * @param y la dimension Y del transporte
     * @param z la dimension Z del transporte
     * @param peso el peso del vehiculo
     * @return el topo de embalaje que dependerá del peso del vehiculo
     */
    int tipoEmbalaje(float x, float y, float z, float peso);




}
