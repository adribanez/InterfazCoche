package InterfazCoche;

import java.util.List;

public interface cocheCRUD {

    void save(Coche coche);

    List<Coche> findAll();

    void delete(Coche coche);

}
