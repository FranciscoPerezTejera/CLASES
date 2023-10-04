
package EJERCICIO1_4_1;

import java.util.function.Function;

public interface ValidacionRegistroContacto extends Function<Contacto, ValidacionRegistroContacto.resultadoValidacion> {
    
    
    enum resultadoValidacion {
        SATISFACTORIO,
        NUMERO_DE_CONTACTO_NO_VALIDO,
        EMAIL_NO_VALIDO,
        NO_ES_ADULTO;
    }
}
