package ejercicio2_2ev.service;

import ejercicio2_2ev.models.Pedido;
import ejercicio2_2ev.persistence.PedidoDAO;

import java.util.ArrayList;

public class PedidoService {
    private ArrayList<Pedido> pedidos;
    private PedidoDAO dao;

    public PedidoService() {
        dao = new PedidoDAO();
        pedidos  = new ArrayList<>();
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public Pedido getPedido(String id) {
        for (Pedido pedido : pedidos) {
            if (pedido.getId().equals(id)) {
                return pedido;
            }
        }
        return null;
    }

    public void agregarPedido(Pedido pedido) {pedidos.add(pedido);}

    public void cargar(){pedidos = dao.cargar();}

    public void guardar(String ruta){dao.guardar(pedidos);}
}
