## 通过 spring 开发项目
###springmvc 和 freemarker 整合
> 1.  freemarker整合由 spring 官方提供 [官方对这一部分描述较少，未注明][1]
> 2.  网络上大部分为spring 3.x 的整合，与 5.x 有较大差异
> 3. 官方配置如下
``` <mvc:view-resolvers>
    <mvc:content-negotiation>
        <mvc:default-views>
            <bean class="org.springframework.web.servlet.view.json.MappingJackson2JsonView"/>
        </mvc:default-views>
    </mvc:content-negotiation>
    <mvc:freemarker cache="false"/> <!-- 此为必须，自动整合，不需要配置bean --> 
</mvc:view-resolvers>

<mvc:freemarker-configurer> <!-- freemarker 配置 -->
    <mvc:template-loader-path location="/freemarker"/>
</mvc:freemarker-configurer>
```


  [1]: https://docs.spring.io/spring/docs/current/spring-framework-reference/web.html#mvc-config-view-resolvers