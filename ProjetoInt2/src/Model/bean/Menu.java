
package Model.bean;

import java.util.Date;


public class Menu {
    private int idproduto;
    private String nomeproduto;
    private int quantidade;
    private String descricaoingredientes;
    private Date datafabricacao;

    public int getIdproduto() {
        return idproduto;
    }

    public void setIdproduto(int idproduto) {
        this.idproduto = idproduto;
    }

    public String getNomeproduto() {
        return nomeproduto;
    }

    public void setNomeproduto(String nomeproduto) {
        this.nomeproduto = nomeproduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getDescricaoingredientes() {
        return descricaoingredientes;
    }

    public void setDescricaoingredientes(String descricaoingredientes) {
        this.descricaoingredientes = descricaoingredientes;
    }

    public Date getDatafabricacao() {
        return datafabricacao;
    }

    public void setDatafabricacao(Date datafabricacao) {
        this.datafabricacao = datafabricacao;
    }
}










