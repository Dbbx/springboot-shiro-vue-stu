package com.qxf.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.qxf.pojo.OperateRecord;

import java.util.List;

public interface OperateRecordMapper extends BaseMapper<OperateRecord> {

    /**
     * 查询操作记录
     */
    List<OperateRecord> findOperateRecordByPage(Pagination page, OperateRecord operateRecord);

    /**
     * 统计所有 请求
     */
    List<OperateRecord> findAllRequstCount();
}