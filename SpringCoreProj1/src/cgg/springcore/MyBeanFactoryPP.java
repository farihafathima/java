package cgg.springcore;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
public class MyBeanFactoryPP  implements BeanFactoryPostProcessor{

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory arg0) throws BeansException {
		System.out.println("My Bean POstpRocessor is called");
		
	}

}
//This is the method that spring is going to run before the BeanFactory itselfs is being initialised and what argument we get is the BeanFactory itself
//What Spring going to do is call post processor BeanFactory of all the classes that declared in the spring .xml whih implenets beanfactorypostprocessor.
//when the bean factory is being initialised then this method of this class is being called



//when spring initialises bean factory the first thing it does is initialises all the singleton beans
//BeanFactory PostProceesor is first called then the beanFactory is initialised.

//and then all the singleton beans are initialised this is the order in which execution goes.
//this is the handy way in which we can plug in extra functionality if you want to override some of the default behaviour.
//when the BeanFactory is initialised.



//one examlple of BeanFactoryPostProcessor that comes out of the box is called propertyplaceholderconfigurer.
//if we want to have some kind of place holder for bean configuration.
//



//inorder to let spring knoe these values have to be substituted over here use out of the box BeanFactoryPostProcessor that sring provides which is called property placeholderConfigurer.


//in order to define any Bean my own factory postprocessor we need to do is write a simple Bean Tag
//if we were to write our own Bean Factory postprocessor we have to wirte the class and add it to spring.xml

//if you are using out of the box Bean Factory postProcessor dont even write the class spring is already proving that class
//just add class name in spring.xml



//PropertyPlaceHolderConfigurer this class is going to look at the properties fille and then going to look at spring .xml
//then whereever yu have the placeholder its going to lookup the properties and then substitute it.

//this gets executed before the beanfactory gets executed so the beanfactory will not see place holder will have the completely substituted XML file ready.

