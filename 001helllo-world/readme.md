
- 运行spring-boot 主类 `com.heiliuer.HelloApp#main`

- idea 快捷键 `ctrl+shift+f9` 重新 build 当前类（ctrl+f9 所有），spring-boot 重新加载 class 重启容器

- 打包可执行jar或者war


    <build>
            <plugins>
                <plugin>
                    <groupId>org.springframework.boot</groupId>
                    <artifactId>spring-boot-maven-plugin</artifactId>
                    <configuration>
                        <executable>true</executable>
                    </configuration>
                </plugin>
            </plugins>
    </build>