package com.khalisa.order.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.khalisa.order.entity.Orders;

public interface OrderRepository extends JpaRepository<Orders, Long> {
    List<Orders> findByPelangganId(Long pelangganId);
}