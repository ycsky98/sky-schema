package org.schema.json;

import org.schema.json.base.Schema;

/**
 * @author yangcong
 *
 * 数组描述Schema
 */
public class ArraySchema extends Schema {

    private String desc;

    private Schema schema;
    /**
     * 最大长度
     */
    private Integer maxLength = null;

    /**
     * 最小长度
     */
    private Integer minLength = null;
    /**
     * 设置描述
     *
     * @param desc
     * @return
     */
    public ArraySchema desc(String desc){
        this.desc = desc;
        return this;
    }

    /**
     * 迭代描述(描述数组中的元素长什么样)
     *
     * @param schema
     * @return
     */
    public ArraySchema item(Schema schema){
        this.schema = schema;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public Schema getSchema() {
        return schema;
    }

    public Schema sizeBound(int size){
        return this.sizeBound(size,size);
    }

    //数组长度范围
public Schema sizeBound(int min,int max){
        this.maxLength=max;
        this.minLength=min;
        return  this;
}


    public Integer getMaxLength() {
        return maxLength;
    }

    public Integer getMinLength() {
        return minLength;
    }
}
