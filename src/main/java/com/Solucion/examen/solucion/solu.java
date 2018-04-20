package com.Solucion.examen.solucion;
 
/**
 * clase solu que permite ejecutar operaciones con nodos.
 * @author Mario
 * @version 1.0
 *
 */

public class solu {
/**
 *Eta clase permite crear nodos y trabajar con ellos
 *
 */  
	class Node {
		  
	        String data;
	        Node next;
	        
	        /**
	         *Aqui asigna la informacion al nodo.
	         *
	         */ 
	        Node(String data) {
	            this.data = data;
	        }
	        
	        Node gus() {
	            if(next == null) return this;
	            Node otro = next;
	            next      = null;
	            Node tavo = otro.gus();
	            otro.next = this;
	            return tavo;
	        }
	      
	        /**
	         * Este metodo sirve para imprimir la lista de nodos que proceden del metodo build
	         * @param no recibe parametros de entrada. 
	         *         
	         */
	        public void prn() {
	        	System.out.print(build().toString());;
	        }
	        
	    /**
	     * Este metodo sirve para crear una lista de seis nodos a partir del primer nodo.
	     * @param no recibe parametros de entrada, solo regresa el resultado
	     * @return regresa la lista de nodos a partir de n1
	     */
	    public Node build() {
	        Node n1 = new Node("A");
	        Node n2 = new Node("B");
	        Node n3 = new Node("C");
	        Node n4 = new Node("D");
	        Node n5 = new Node("E");
	        Node n6 = new Node("F");
	        n1.next = n2;
	        n2.next = n3;
	        n3.next = n4;
	        n4.next = n5;
	        n5.next = n6;
	        return n1;
	    }

	    /**
	     *  Este metodo sirve para generar una lista de nodos 
	     *  @param no reqiere marametro de entrada
	     *  
	     */
	    public void ok() {
	        Node a = build();
	        a.prn();
	        a = a.gus();
	        a.prn();
	        a = a.gus();
	        a.prn();
	        
	        Node b = new Node("X");
	        b = b.gus();
	        b.prn();
	        
	        Node c = new Node("X");
	        Node d = new Node("Y");
	        c.next = d;
	        c = c.gus();
	        c.prn();   
	    }

	    public void main (String args[]) {
	        solu s1 = new solu();
	    }

	  }
}
