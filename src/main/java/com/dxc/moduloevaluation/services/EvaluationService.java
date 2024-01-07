package com.dxc.moduloevaluation.services;

import com.dxc.moduloevaluation.entity.Evaluation;
import com.dxc.moduloevaluation.repository.EvaluationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EvaluationService {

    private EvaluationRepository evaluationRepository;

    public Evaluation add(Evaluation evaluation) {
        return evaluationRepository.save(evaluation);
    }

    public List<Evaluation> findByProductId(Long productId) {
        return evaluationRepository.findByProductId(productId);
    }
}
