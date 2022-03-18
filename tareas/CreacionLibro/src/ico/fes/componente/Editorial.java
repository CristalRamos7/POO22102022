/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.componente;

/**
 *
 * @author blanc
 */
public class Editorial {
     String nomed; //nombre de la editorial
     String paginas; //numer

    public Editorial() {
    }

    public Editorial(String nomed, String paginas) {
        this.nomed = nomed;
        this.paginas = paginas;
    }

    public String getNomed() {
        return nomed;
    }

    public void setNomed(String nomed) {
        this.nomed = nomed;
    }

    public String getPaginas() {
        return paginas;
    }

    public void setPaginas(String paginas) {
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "Editorial{" + "nomed=" + nomed + ", paginas=" + paginas + '}';
    }
     

   
    
}
