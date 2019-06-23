package org.lexus.rpc.spring.schema;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.xml.BeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

/**
 * @author tukangzheng
 * @create 2019-06-23 下午2:49
 **/
public class LexusBeanDefinitionParser implements BeanDefinitionParser {


    private final Class<?> beanClass;

    public LexusBeanDefinitionParser(Class<?> beanClass){
        this.beanClass = beanClass;
    }

    @Override
    public BeanDefinition parse(Element element, ParserContext parserContext) {
        return null;
    }


    private BeanDefinition parse(Element element, ParserContext parserContext, Class<?> beanClass){
        return null;
    }
}
