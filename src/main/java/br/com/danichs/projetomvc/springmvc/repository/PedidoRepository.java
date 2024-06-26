package br.com.danichs.projetomvc.springmvc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.danichs.projetomvc.springmvc.model.Pedido;
import br.com.danichs.projetomvc.springmvc.model.StatusPedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {

    List<Pedido> findByStatus(StatusPedido status);

}
