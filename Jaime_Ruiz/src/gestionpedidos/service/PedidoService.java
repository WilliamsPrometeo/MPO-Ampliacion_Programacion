package gestionpedidos.service;

import gestionpedidos.exception.PedidosException;
import gestionpedidos.models.Pedido;
import gestionpedidos.persistence.PedidoDao;

import java.util.ArrayList;

public class PedidoService {

        private ArrayList<Pedido> pedidos;
        private PedidoDao dao;

        public PedidoService() {
            pedidos = new ArrayList<>();
            dao = new PedidoDao();
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

        public void agregarPedido(Pedido pedido) throws PedidosException {
            if (pedido == null) {
                throw new PedidosException("El pedido no existe");
            }
                pedidos.add(pedido);
        }



        public void cargar() {
            pedidos = dao.cargar();
        }

        public void guardar() {
            dao.guardar(pedidos);
        }
}


