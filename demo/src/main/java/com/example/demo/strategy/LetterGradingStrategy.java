package com.example.demo.strategy;

public class LetterGradingStrategy implements GradingStrategy {

    @Override
    public Double calculateGrade(Double score) {
        if (score >= 90) {
            return 4.0;
        } else if (score >= 80) {
            return 3.0;
        } else if (score >= 70) {
            return 2.0;
        } else {
            return 1.0;
        }
    }
}
