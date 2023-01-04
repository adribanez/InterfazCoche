package InterfazCoche;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        cocheCRUD cochecrud = new cocheCRUD() {
            @Override
            public void save(Coche coche) {

            }

            @Override
            public List<Coche> findAll() {
                return null;
            }

            @Override
            public void delete(Coche coche) {

            }
        };

    }
}
