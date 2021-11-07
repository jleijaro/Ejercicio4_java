package com.agencia;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Cliente cl1 = new Cliente(123,"Juan","123456","hghgyhg@kjkj.com");
        Set<Cliente> BB = new HashSet<Cliente>();
        BB.add(cl1);
        System.out.println(cl1.getDni()+" "+cl1.getNombre()+" "+cl1.getTelefono()+" "+cl1.getMail());
        /*for (Cliente cliente : BB) {
            System.out.println(cliente.getDni()+" "+cliente.getNombre()+" "+cliente.getTelefono()+" "+cliente.getMail());
        }*/

        Pasaje pr1 = new Pasaje(123,"Vuelo",500, "01/02/2323","oraora","tangamandapio");
        Set<Pasaje> l = new HashSet<Pasaje>();
        l.add(pr1);
        System.out.println(pr1.getCodigo()+" "+pr1.getDescripcion()+" "+pr1.getPrecio()+" "+pr1.getFecha()+" "+pr1.getCompañia()+" "+pr1.getDestino());

        Alojamiento a = new Alojamiento(1, "Hotelito", 2, "La gran Verdura");
        Set<Alojamiento> alo = new HashSet<Alojamiento>();
        alo.add(a);
        System.out.println(a.getCodigo()+" "+a.getDescripcion()+" "+a.getPrecio()+" "+a.nombreAlojamiento);


    }
}
