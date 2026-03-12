package hello.core;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import static org.springframework.context.annotation.ComponentScan.*;

@Configuration // 설정파일 이다.
@ComponentScan( // @SpringBootApplication 에 들어있는 애노테이션이라 직접 사용하지 않았었음.
        excludeFilters = @Filter(type = FilterType.ANNOTATION, classes = Configuration.class))

public class AutoAppConfig {


}
