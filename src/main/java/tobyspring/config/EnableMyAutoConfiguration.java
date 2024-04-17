package tobyspring.config;

import org.springframework.context.annotation.Import;
import tobyspring.config.autoconfig.DispatcherServletConfig;
import tobyspring.config.autoconfig.TomcatWebServerConfig;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE) // 클래스, 인터페이스, 이넘에 적용하고 싶으면 TYPE 을 사용하면 된다.
@Import(MyAutoConfigImportSelector.class)
public @interface EnableMyAutoConfiguration {
}
