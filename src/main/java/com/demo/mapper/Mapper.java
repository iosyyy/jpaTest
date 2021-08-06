package com.demo.mapper;

import com.demo.enter.Entirty;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author 靖鸿宣
 * @since 2021/8/5
 */
public interface Mapper extends JpaRepository<Entirty, Long> {
  List<Entirty> findDistinctByIdAndPassWord(Long id, String passWord, Pageable pageable);


}
