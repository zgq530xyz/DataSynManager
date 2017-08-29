package com.ycd.springboot.service.datasyn;

import com.ycd.springboot.vo.datasyn.DataSynSourceVO;
import com.ycd.springboot.vo.datasyn.DataSynTableVO;
import com.ycd.springboot.vo.datasyn.DataSynVO;

import java.util.Map;

/**
 * Created by yangchd on 2017/7/25.
 * 同步接口
 */
public interface IDataSynService {
    //测试连接
    Boolean conTest(DataSynSourceVO dvo) throws Exception;

    //保存数据源
    Map<String,Object> insertDataSourceByVO(DataSynSourceVO dvo) throws Exception;

    //获取数据源列表
    Map<String,Object> getDataSourceList(DataSynSourceVO dvo) throws Exception;

    //获取表名称列表
    Map<String,Object> getTableNameList(DataSynSourceVO dvo) throws Exception;

    //获取列名称列表
    Map<String,Object> getColumnNameList(DataSynSourceVO dvo, String tablename) throws Exception;

    //保存同步信息
    Map<String,Object> saveDataSyn(DataSynVO dsvo)  throws Exception;

    //保存同步表信息
    Map<String,Object> saveDataSynTable(DataSynVO dsvo,DataSynTableVO tvo) throws Exception;

    Map<String,Object> getAllDataSyn() throws Exception;
}