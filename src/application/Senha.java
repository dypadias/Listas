
package application;

/**
 *
 * @author dypad
 */
public class Senha {
    private String tipo;
 private Integer numero;

    public Senha() {
    }
 
 

    public Senha(String tipo, Integer numero) {
        this.tipo = tipo;
        this.numero = numero;
    }
 
 

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return tipo +  numero;
    }

}
