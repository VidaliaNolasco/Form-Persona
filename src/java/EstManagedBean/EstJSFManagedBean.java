
package EstManagedBean;

import TratamientoEst.Estudiante;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/*@author Vidalia Nolasco*/
@Named(value = "estJSFManagedBean")
@Dependent
public class EstJSFManagedBean {

    @EJB
    private EstudianteFacadeLocal estudianteFacade;

    Estudiante est = new Estudiante();

    public Estudiante getEst() {
        return est;
    }

    public void setEst(Estudiante est) {
        this.est = est;
    }
    
    public void validar(){
        estudianteFacade.create(est);
    }
    
    public void modificar(){
        estudianteFacade.edit(est);
    }
    
    public void suprimir(){
        estudianteFacade.remove(est);
    }
    
    public EstJSFManagedBean() {
    }
    
}
