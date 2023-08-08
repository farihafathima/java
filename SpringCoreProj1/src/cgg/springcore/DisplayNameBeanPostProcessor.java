package cgg.springcore;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DisplayNameBeanPostProcessor implements BeanPostProcessor {

	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("In after initialisation method,Bean name is "+beanName);
		return bean;
		
		
		
	}@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("In before inital"+beanName);
		return bean;
	}
}
//beanpost processor is an extention pointfor the spring framework and how we can configure the frame work for your soecific neds 
//using the BeanPostprocessor




//BeanFactory Post processor
//Is anothe extention point this isa feature orividede by spring when you want to execute code when the beanFactory itself being intialisied
//Then you can use bean factory post processor to write your own code.




