/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author 10361
 */
public class FtData {
    public String mesExt(int mes){
        String retorno="";
        switch(mes){
            case 1: retorno="Janeiro"; break;
            case 2: retorno="Fevereiro"; break;
            case 3: retorno="Março"; break;
            case 4: retorno="Abril"; break;
            case 5: retorno="Maio"; break;
            case 6: retorno="Junho"; break;
            case 7: retorno="Julho"; break;
            case 8: retorno="Agosto"; break;
            case 9: retorno="Setembro"; break;
            case 10: retorno="Outubro"; break;
            case 11: retorno="Novembro"; break;
            case 12: retorno="Dezembro"; break;
        }
        return retorno;
    }
}
