package pzn.spring.core.processor

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory
import org.springframework.beans.factory.support.BeanDefinitionRegistry
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor
import org.springframework.beans.factory.support.GenericBeanDefinition
import org.springframework.stereotype.Component
import pzn.spring.core.data.Foo

@Component
class FooBeanFactoryPostProcessor : BeanDefinitionRegistryPostProcessor {
    override fun postProcessBeanFactory(beanFactory: ConfigurableListableBeanFactory) {
        //nothing
    }

    override fun postProcessBeanDefinitionRegistry(registry: BeanDefinitionRegistry) {
        val definition = GenericBeanDefinition()
        definition.scope = "singleton"
        definition.setBeanClass(Foo::class.java)

        registry.registerBeanDefinition("foo", definition)
    }
}