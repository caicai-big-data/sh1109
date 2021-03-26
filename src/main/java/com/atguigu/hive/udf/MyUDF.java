package com.atguigu.hive.udf;

import org.apache.hadoop.hive.ql.exec.UDFArgumentException;
import org.apache.hadoop.hive.ql.metadata.HiveException;
import org.apache.hadoop.hive.ql.udf.generic.GenericUDF;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector;

/**
 * @author xinma
 * @create 2021 - 03 - 26
 */
public class MyUDF extends GenericUDF {
    @Override
    /**
     * 判断传进来参数的类型，长度
     
     * 约定返回的数据类型
     */
    public ObjectInspector initialize(ObjectInspector[] arguments) throws UDFArgumentException {
        return null;
    }

    @Override
    /**
     * 解决具体的逻辑
     */
    public Object evaluate(DeferredObject[] arguments) throws HiveException {
        return null;
    }

    @Override
    /**
     * 获取解释的字符串
     */
    public String getDisplayString(String[] children) {
        return null;
    }
}
