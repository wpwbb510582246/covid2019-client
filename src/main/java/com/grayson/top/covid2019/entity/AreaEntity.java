package com.grayson.top.covid2019.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author peng.wei
 * @date 2020/7/5 12:34
 * @description 分区疫情数据实体类
 */
@Data
@Document(collection = "area")
public class AreaEntity {

    @Id
    private Long id;
    private String continentName;   //  州名
    private String continentEnglishName;   //  州名(英文)
    private String countryName;   //  国家名称
    private String countryEnglishName;   //  国家名称(英文)
    private String provinceName;   //  省份名称
    private String provinceEnglishName;   //  省份名称(英文)
    private Integer province_zipCode;   //  省份邮政编码
    private Integer province_confirmedCount;   //  现有确诊人数
    private Integer province_curedCount;   //  累计治愈人数
    private Integer province_deadCount;   //  累计死亡人数
    private String updateTime;   //  数据更新时间
    private String cityName;   //  城市名称
    private String cityEnglishName;   //  城市名称(英文)
    private String city_zipCode;   //  城市邮政编码
    private String city_confirmedCount;   //  城市现有确诊人数
}
