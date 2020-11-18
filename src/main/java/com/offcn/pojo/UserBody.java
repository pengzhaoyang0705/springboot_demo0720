package com.offcn.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;


/**
 * 实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
//加载属性文件配置
@ConfigurationProperties(prefix = "userbody")

public class UserBody {

   private String name;
   private String password;
   private String  birthday;
   private String  mobile;
   private String  address;
}
