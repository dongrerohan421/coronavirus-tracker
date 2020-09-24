package com.covid.coronavirustracker.model.paging;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Search {
    private String value;
    private String regex;
}
