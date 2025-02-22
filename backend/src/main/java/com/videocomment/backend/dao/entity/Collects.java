package com.videocomment.backend.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @ClassName Collects
 * @Description TODO
 * @Author Colin
 * @Date 2023/10/31 12:23
 * @Version 1.0
 */
@TableName("collects")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Collects {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private int userId;
    private int videoId;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "Asia/Shanghai")
    private Date createTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "Asia/Shanghai")
    private Date updateTime;
}
