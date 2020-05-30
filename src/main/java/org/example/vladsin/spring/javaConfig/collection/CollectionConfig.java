package org.example.vladsin.spring.javaConfig.collection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.*;

@Configuration
public class CollectionConfig {

    @Bean
    public Collection collectionProp() {

        final Properties itemProps = new Properties();
        itemProps.setProperty("1", "Vlad");

        final HashMap<String, String> itemMap = new HashMap<String, String>();
        itemMap.put("1", "Vlad");

        final List<String> itemList = Arrays.asList("Vlad");

        final Set<String> set = Collections.singleton("Vlad");

        return new Collection(
                itemList,
                set,
                itemMap,
                itemProps);
    }
}
