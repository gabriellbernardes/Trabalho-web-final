package com.ufc.br.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ufc.br.model.Cliente;
import com.ufc.br.model.Pedido;



public interface PedidoRepository extends JpaRepository<Pedido, Long> {

    List<Pedido> findByCliente(Cliente cliente);
}
