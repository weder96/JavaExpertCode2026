public class ManipulaArray<T> { // Contém o parâmetro <?>

    private T[] array; // atributo de tipo generic

    public ManipulaArray(T[] array) { // Construtor
        this.array = array;
    }

    public boolean existeElemento(T elementoABuscar) {
        for (T elemento : array) {
            if (elemento.equals(elementoABuscar)) {
                return true;
            }
        }
        return false;
    }

    // get e set de atributo genérico
    public T[] getArray() { return array; }
    public void setArray(T[] array) { this.array = array; }
}