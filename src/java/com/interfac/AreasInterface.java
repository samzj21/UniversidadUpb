package com.interfac;
import com.modelo.entity.Areas;
import java.util.List;


public interface AreasInterface {
    
    public List<Areas> listAreas();
    public Areas getAreas(int id);
    public void deleteAreas(int id);
    public void updateAreas (int id);
    
}
