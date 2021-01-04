/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import java.io.File;
import java.util.LinkedHashMap;
import javax.swing.DefaultListModel;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import java.io.*;
import java.net.*;
import java.util.Map;

/**
 *
 * @author Familia
 */
public class Web {

    public static void main(String[] args) throws IOException {
        String url = "https://es.wikipedia.org/wiki/Anexo:Elementos_qu%C3%ADmicos";   
        File text = new File("Quimica.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(text));
        try {
            Document doc = Jsoup.connect(url).get();
            LinkedHashMap<String, ElementoC> nuevo = new LinkedHashMap<String, ElementoC>();
            DefaultListModel<String> listaEle = new DefaultListModel<>();
            int i = 1;
            int j = 1;
            int y = 1;
            int g = 1;
            for (Element row : doc.select("table.wikitable.sortable tr")) {
                String elemt;
                String nombre;
                String grupo;
                String periodo;
                String pesoAtómico;
                String densidad;
                String año;
                String descubridores;
                String origen;

                if (row.select("td:nth-of-type(2)").text().equals("")) {
                    continue;
                } else {
                    elemt = row.select("td:nth-of-type(2)").text();
                }
                if (row.select("td:nth-of-type(3)").text().equals("")) {
                    continue;
                } else {
                    nombre = row.select("td:nth-of-type(3)").text();
                }
                if (row.select("td:nth-of-type(4)").text().equals("")) {
                    continue;
                } else {
                    grupo = row.select("td:nth-of-type(4)").text();
                }
                if (row.select("td:nth-of-type(5)").text().equals("")) {
                    continue;
                } else {
                    periodo = row.select("td:nth-of-type(5)").text();
                }
                if (row.select("td:nth-of-type(6)").text().equals("")) {
                    continue;
                } else {
                    if (i < 44 || 69 < j) {
                        i++;
                        j++;
                        String[] dividir = row.select("td:nth-of-type(6)").text().split("!");
                        pesoAtómico = dividir[1];
                    } else {
                        pesoAtómico = row.select("td:nth-of-type(6)").text();
                    }
                }
                if (row.select("td:nth-of-type(7)").text().equals("")) {
                    continue;
                } else {
                    if (75 < y) {
                        String[] dividir = row.select("td:nth-of-type(7)").text().split("!");
                        densidad = dividir[0];

                    } else {
                        densidad = row.select("td:nth-of-type(7)").text();

                        y++;
                    }
                }
                if (row.select("td:nth-of-type(13)").text().equals("")) {
                    continue;
                } else {
                    año = row.select("td:nth-of-type(13)").text();
                }
                if (row.select("td:nth-of-type(14)").text().equals("")) {
                    continue;
                } else {
                    descubridores = row.select("td:nth-of-type(14)").text();
                }
                if (row.select("td:nth-of-type(15)").text().equals("")) {
                    continue;
                } else {
                    origen = row.select("td:nth-of-type(15)").text();
                }
                listaEle.addElement(nombre);
                ElementoC element = new ElementoC(elemt, grupo, periodo, pesoAtómico, densidad, año, descubridores, origen);
                nuevo.put(nombre, element);
            }
            for (Map.Entry<String, ElementoC> entrySet : nuevo.entrySet()) {                  //For each para mostra en pantalla el nombre y el vehiculo que ingreso
                String key = entrySet.getKey();
                ElementoC value = entrySet.getValue();
                bw.write( value.toString() +"\n");
            }
            ListaElementos l = new ListaElementos(nuevo);
            l.jList1.setModel(listaEle);
            l.setVisible(true);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
