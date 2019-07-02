package com.ufc.br.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ufc.br.model.Item;
import com.ufc.br.model.Pedido;


@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

    List<Item> findByPedido(Pedido pedido);

}
