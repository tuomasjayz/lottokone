package com.lottokone.service;

import com.lottokone.model.LottoTicket;
import com.lottokone.repository.LottoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class LottoService {

    @Autowired
    private LottoRepository lottoRepository;

    public List<LottoTicket> checkTickets(List<List<Integer>> allRows) {
        List<Integer> drawnNumbers = drawNumbers();
        LocalDateTime drawTime = LocalDateTime.now();

        List<LottoTicket> results = new ArrayList<>();
        for (List<Integer> numbers : allRows) {
            LottoTicket ticket = new LottoTicket();
            ticket.setNumbers(numbers.toString());
            ticket.setDrawnNumbers(drawnNumbers.toString());
            ticket.setMatchingNumbers(countMatches(numbers, drawnNumbers));
            ticket.setDrawTime(drawTime);
            results.add(lottoRepository.save(ticket));
        }

        return results;
    }

    private List<Integer> drawNumbers() {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 40; i++) {
            numbers.add(i);
        }
        Collections.shuffle(numbers);
        return numbers.subList(0, 7);
    }

    private int countMatches(List<Integer> userNumbers, List<Integer> drawnNumbers) {
        return (int) userNumbers.stream()
                .filter(drawnNumbers::contains)
                .count();
    }
}