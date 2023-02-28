package com.example.backend.ShopingList;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopingListJPA extends  JpaRepository<ShopingListModel,Integer> {
}
