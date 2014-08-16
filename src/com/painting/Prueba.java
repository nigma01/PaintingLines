/**
 * 
 */
package com.painting;

import java.awt.geom.Line2D;
import java.util.ArrayList;

/**
 * @author Administrador
 *
 */
public class Prueba {

	/**
	 * 
	 */
	public Prueba() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String report = "prueba_informe001b.rpt";
		String codigoInforme = report.substring(0,report.indexOf(".rpt"));
		System.out.println(codigoInforme);		
		java.util.List<Integer> listaResourcesRec =  new ArrayList<Integer>();
		for(int i = 0; i<10;i++)
			listaResourcesRec.add(i);
		for(int i =0; i<(listaResourcesRec.size()-1);i++){
			System.out.println(listaResourcesRec.get(i));			
		}
		System.out.println(listaResourcesRec.size());
		System.out.println(listaResourcesRec.get(listaResourcesRec.size()-1));
	}

}
