# Spring-Core-Annotations

@Configuration
@Component
@Bean
@Value

Application starts with:

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("Before getBean method");
		Person person = context.getBean("myPerson", Person.class);
		System.out.println(person.getName());
		System.out.println(person.getLastName());

		((AnnotationConfigApplicationContext) context).close();
	}

In order to get the configuration class, we should work with AnnotationConfigApplicationContext, and set up AppConfig.class as the file's name where the AppConfig class is located.

AppConfig class is the configuration class.
//It is like beans.xml where I can put all my beans. This is used as ApplicationContext container.
  @Configuration
  public class AppConfig {

    @Bean
    public Person myPerson() {
      return new Person();
    }

  }

  @Component // It is used to denote that it is a Bean.
  public class Person {

    @Value("Edgar") // Value by default
    private String name;
    @Value("Lizarraga") // Value by default
    private String lastName;

    public Person(){
      System.out.println("Person");
    }
    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public String getLastName() {
      return lastName;
    }

    public void setLastName(String lastName) {
      this.lastName = lastName;
    }
  }
