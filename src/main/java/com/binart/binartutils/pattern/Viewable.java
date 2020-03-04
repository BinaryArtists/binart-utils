package com.binart.binartutils.pattern;

import java.io.Serializable;

public interface Viewable <IN, OUT> extends Serializable {
    /// 实体 转化为 VO
    OUT from(IN entity);
}
