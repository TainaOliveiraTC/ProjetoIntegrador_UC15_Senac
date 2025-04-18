
package Model.bean;

import java.util.Date;


public class Despesas {
    private int iddespesa;
    private String item;
    private Double valor;
    private int quantidadedeitem;
    private Date dataatual;

    public int getIddespesa() {
        return iddespesa;
    }

    public void setIddespesa(int iddespesa) {
        this.iddespesa = iddespesa;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Date getDataatual() {
        return dataatual;
    }

    public void setDataatual(Date dataatual) {
        this.dataatual = dataatual;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public int getQuantidadedeitem() {
        return quantidadedeitem;
    }

    public void setQuantidadedeitem(int quantidadedeitem) {
        this.quantidadedeitem = quantidadedeitem;
    }
}
