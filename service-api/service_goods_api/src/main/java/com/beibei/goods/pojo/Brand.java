package com.beibei.goods.pojo;




import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class Brand implements Serializable {

    private Integer id;

    private String name;

    private String desc;

    private String picUrl;

    private Integer sortOrder;

    private BigDecimal floorPrice;

    private Date addTime;

    private Date updateTime;

    private Integer deleted;
}
