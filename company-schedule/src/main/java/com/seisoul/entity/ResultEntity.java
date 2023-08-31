package com.seisoul.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 这个文件是实体类_统一返回对象.
 * 用来返回给html页面的只能是该实体类
 *
 * @author yoshigawashimizu
 * @version 1.0
 * @date 2023-08-31 18:06:52
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultEntity {

    /**
     * {@code code} 响应码,0为失败,1为成功
     */
    private Integer code;

    /**
     * {@code message} 响应信息,描述本次响应
     */
    private String message;

    /**
     * {@code data} 响应数据,封装数据库返回的数据
     */
    private Object data;

    /**
     * 这是返回一个成功地响应结果,返回的响应信息为success,返回的数据为null.
     *
     * @return Result 返回响应码1 响应信息为success 封装的数据为null
     */
    public static ResultEntity success() {
        return new ResultEntity(1, "success", null);
    }

    /**
     * 这是返回一个成功的响应结果,返回的响应信息为success,返回的数据为data对象.
     *
     * @param data 响应数据,封装数据库返回的数据,页面展示该部分数据
     * @return Result 返回响应码1 响应信息为success 封装的数据为data对象
     */
    public static ResultEntity success(Object data) {
        return new ResultEntity(1, "success", data);
    }

    /**
     * 这是返回一个失败的响应结果,返回的响应信息为errorMessage对象,返回的数据为null.
     *
     * @param errorMessage 错误码,简述错误信息
     * @return Result 返回响应码0 响应信息为errorMessage对象 封装的数据为null
     */
    public static ResultEntity error(String errorMessage) {
        return new ResultEntity(0, errorMessage, null);
    }
}
