package com.interfac;
import com.modelo.entity.Matricula;
import java.util.List;

public interface MatriculaInterface {
    
    public List<Matricula> listMatricula();
    //select * from tabla
    public Matricula getMatricula(int id);
    //select * from tabla where id=x
    public void deleteMatricula(int id);
    //delete from tabla where id=x
    public void updateMatricula(int id);
    //update set campo=valor from tabla where id=x
}
