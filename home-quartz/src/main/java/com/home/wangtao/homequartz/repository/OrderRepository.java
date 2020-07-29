package com.home.wangtao.homequartz.repository;

import com.home.wangtao.homequartz.entity.taco.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
