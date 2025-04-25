package ext;

import dao.IDao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component  //cree objet demmarage
@Qualifier("dao2")//injection pour plusieur objet
public class DaoImplV2 implements IDao {

    @Override
    public double getData() {
        System.out.println("Version web service");
        double temp = 77;
        return temp;
    }
}