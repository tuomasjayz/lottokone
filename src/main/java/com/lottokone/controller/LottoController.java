package com.lottokone.controller;

import com.lottokone.model.LottoTicket;
import com.lottokone.service.LottoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class LottoController {

    @Autowired
    private LottoService lottoService;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/check")
    @ResponseBody
    public List<LottoTicket> checkNumbers(@RequestBody List<List<Integer>> allRows) {
        return lottoService.checkTickets(allRows);
    }
}