package cn.bingo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig {
    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.addAllowedOrigin("*"); // 允许所有来源访问
        config.addAllowedHeader("*"); // 允许所有请求头访问
        config.addAllowedMethod("*"); // 允许所有的请求方法（get、post等）访问。
        // 对接口配置跨域设置，将上述配置应用到所有路径
        source.registerCorsConfiguration("/**", config);
        return new CorsFilter(source);
    }
}
