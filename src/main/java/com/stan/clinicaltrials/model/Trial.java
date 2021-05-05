package com.stan.clinicaltrials.model;

import lombok.*;

@Data
@AllArgsConstructor
public class Trial {
    private String id;
    private String title;
    private String description;
}
