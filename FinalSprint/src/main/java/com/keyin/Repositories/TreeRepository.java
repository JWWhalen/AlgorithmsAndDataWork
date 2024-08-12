package com.keyin.Repositories;

import com.keyin.Entities.TreeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TreeRepository extends JpaRepository<TreeEntity, Long> {
}
