package segundaevaluacion.intentoMVC.service;

import segundaevaluacion.intentoMVC.dao.PedidoDAO;
import segundaevaluacion.intentoMVC.models.Pedido;

import java.util.ArrayList;

public class PedidoService {
    private ArrayList<Pedido> pedidos;
    private PedidoDAO dao;

    public PedidoService() {
        pedidos = new ArrayList<>();
        dao = new PedidoDAO();
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

    public void addPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public void guardar() {
        dao.guardar(pedidos);
    }

    public void cargar() {
        pedidos = dao.cargar();
    }
}
