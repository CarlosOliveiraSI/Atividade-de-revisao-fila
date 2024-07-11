/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c.atividadederevisao;

/**
 *
 * @author carlo
 */
public class DadosCaminhoneiro {
    String nome;
    String placa;
    String horarioChegada;
    
    
    public DadosCaminhoneiro(String nome, String placa, String horarioChegada){
        this.nome = nome;
        this.placa = placa;
        this.horarioChegada = horarioChegada;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getHorarioChegada() {
        return horarioChegada;
    }

    public void setHorarioChegada(String horarioChegada) {
        this.horarioChegada = horarioChegada;
    }
    
}
