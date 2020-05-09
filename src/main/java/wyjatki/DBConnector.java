package wyjatki;

public class DBConnector implements AutoCloseable {

    private boolean czyJestPolaczenie;

    public DBConnector() {
        System.out.println("łączę z bazą");
        czyJestPolaczenie = true;
    }

    @Override
    public void close() throws Exception {
        System.out.println("kończę pracę z bazą");
        czyJestPolaczenie = false;
    }

    public boolean isCzyJestPolaczenie() {
        return czyJestPolaczenie;
    }
}
