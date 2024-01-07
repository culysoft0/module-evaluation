package com.dxc.moduloevaluation.controller;

import com.dxc.moduloevaluation.entity.Evaluation;
import com.dxc.moduloevaluation.services.EvaluationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/evaluations")
@AllArgsConstructor
public class EvaluationController {

    private EvaluationService evaluationService;

    @PostMapping
    public Evaluation add(@RequestBody Evaluation evaluation) {
        return evaluationService.add(evaluation);
    }

    @GetMapping("/product/{productId}")
    public List<Evaluation> findByProductId(@PathVariable Long productId) {
        return evaluationService.findByProductId(productId);
    }
}
