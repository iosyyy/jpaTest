package com.demo.mapper;

import com.demo.enter.ManyToEntirty;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author 靖鸿宣
 * @since 2021/8/6
 */
public interface ManyMap extends JpaRepository<ManyToEntirty,Long> {
  List<ManyToEntirty> findDistinctById(Long id);

  List<ManyToEntirty> getByOrderByIdAsc(Pageable pageable);
}
