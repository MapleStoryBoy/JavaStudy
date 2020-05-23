package com.maple.eduservice.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author mac
 * @create 2020/5/23
 */
@Configuration
@MapperScan("com.maple.eduservice.mapper")
public class EduConfig {
}
