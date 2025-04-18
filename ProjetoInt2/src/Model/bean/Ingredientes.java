package Model.bean;




import java.util.Date;


public class Ingredientes {
    private int idingrediente;
    private String nomeingrediente;
    private Date ValidadeIngrediente;
    private String fabricante;
    private Double valoringrediente;

    public int getIdingrediente() {
        return idingrediente;
    }

    public void setIdingrediente(int idingrediente) {
        this.idingrediente = idingrediente;
    }

    public String getNomeingrediente() {
        return nomeingrediente;
    }

    public void setNomeingrediente(String nomeingrediente) {
        this.nomeingrediente = nomeingrediente;
    }

    public Date getValidadeIngrediente() {
        return ValidadeIngrediente;
    }

    public void setValidadeIngrediente(Date ValidadeIngrediente) {
        this.ValidadeIngrediente = ValidadeIngrediente;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public Double getValoringrediente() {
        return valoringrediente;
    }

    public void setValoringrediente(Double valoringrediente) {
        this.valoringrediente = valoringrediente;
    }


}
