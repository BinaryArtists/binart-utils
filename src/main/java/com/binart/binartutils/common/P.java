package com.binart.binartutils.common;

import lombok.Data;

import java.util.List;

@Data
public class P<T> {
    private Integer pageNum;
    private Integer pageSize;
    private Integer totalPage;
    private Long total;
    private List<T> list;

    /**
     * 将PageHelper分页后的list转为分页信息
     */
    public static <T> P<T> restPage(List<T> list) {
        P<T> result = new P<T>();
//        PageInfo<T> pageInfo = new PageInfo<T>(list);
//        result.setTotalPage(pageInfo.getPages());
//        result.setPageNum(pageInfo.getPageNum());
//        result.setPageSize(pageInfo.getPageSize());
//        result.setTotal(pageInfo.getTotal());
//        result.setList(pageInfo.getList());
        return result;
    }

    /**
     * 将SpringData分页后的list转为分页信息
     */
//    public static <T> P<T> restPage(Page<T> pageInfo) {
//        CommonPage<T> result = new CommonPage<T>();
//        result.setTotalPage(pageInfo.getTotalPages());
//        result.setPageNum(pageInfo.getNumber());
//        result.setPageSize(pageInfo.getSize());
//        result.setTotal(pageInfo.getTotalElements());
//        result.setList(pageInfo.getContent());
//        return result;
//    }
}
