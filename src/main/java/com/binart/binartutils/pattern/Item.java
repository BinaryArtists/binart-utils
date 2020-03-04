package com.binart.binartutils.pattern;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Item implements Itemable {
    private Integer code;
    private String msg;
}
