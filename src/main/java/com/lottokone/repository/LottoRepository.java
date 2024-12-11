package com.lottokone.repository;

import com.lottokone.model.LottoTicket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LottoRepository extends JpaRepository<LottoTicket, Long> {
}