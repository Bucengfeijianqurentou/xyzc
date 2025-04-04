package com.entity.view;

import com.entity.ZhuanrangEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 资产转让
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("zhuanrang")
public class ZhuanrangView extends ZhuanrangEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    public ZhuanrangView() {
    }

    public ZhuanrangView(ZhuanrangEntity zhuanrangEntity) {
        try {
            BeanUtils.copyProperties(this, zhuanrangEntity);
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
} 