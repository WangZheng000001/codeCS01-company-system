package com.seisoul.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;

/**
 * 这个文件是封装Mission表格所有属性的实体类.
 * <p>该实体类的所有成员变量与数据库中的tb_mission的所有属性一一对应
 * 作用是传递数据</p>
 *
 * @author yoshigawashimizu
 * @version 1.0
 * @date 2023-08-31 19:19:49
 */
@Data
@Slf4j
@NoArgsConstructor
@AllArgsConstructor
public class MissionEntity {

    /**
     * {@code id} 待办事项编号
     */
    private Integer id;

    /**
     * {@code mis_name} 待办事项名称,字符串长度为10
     */
    private String mis_name;

    /**
     * {@code mis_desc} 待办事项详细描述,字符串长度为64
     */
    private String mis_desc;

    /**
     * {@code level} 优先级,0:低 1:中 2:高
     */
    private Integer level;

    /**
     * {@code deadline} 截止日期,格式为"yyyy-MM-dd HH:mm:SS"
     */
    private LocalDateTime deadline;

    /**
     * {@code status} 事项状态,0未开始 1已开始 2已完成
     */
    private String status;

    /**
     * {@code note} 额外备注信息,长度为32
     */
    private String note;

}
