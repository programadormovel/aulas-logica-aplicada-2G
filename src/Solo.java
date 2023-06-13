public class Solo {
    // Atributos
    boolean fertil;
    String tipoSolo;
    String localDoSolo;
    String estado;
    // Método
    public Planta gerarPlanta(Semente s1){
        Planta p1 = new Planta(s1);
        return p1;
    }

}
