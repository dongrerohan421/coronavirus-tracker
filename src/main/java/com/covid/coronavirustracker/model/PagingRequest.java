package com.covid.coronavirustracker.model;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PagingRequest {
    private int start;
    private int end;
    private int draw;
    private List<Order> orders;
    private List<Column> columns;
    private Search sesrch;
}
