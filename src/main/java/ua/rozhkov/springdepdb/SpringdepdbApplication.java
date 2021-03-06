package ua.rozhkov.springdepdb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import ua.rozhkov.springdepdb.service.CollegeService;
import ua.rozhkov.springdepdb.service.PeriodService;
import ua.rozhkov.springdepdb.service.SpecialtyService;

@SpringBootApplication
@EnableTransactionManagement
public class SpringdepdbApplication implements CommandLineRunner {
    @Autowired
    private SpecialtyService specialtyService;
    @Autowired
    private CollegeService collegeService;
    @Autowired
    private PeriodService periodService;

    public static void main(String[] args) {
        SpringApplication.run(SpringdepdbApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
       /* specialtyService.save(new Specialty("111", "111"));
        specialtyService.save(new Specialty("222", "222"));

        collegeService.save(new College("111","111","111","111", OwnerShip.COMMUN));
        collegeService.save(new College("222","222","222","222", OwnerShip.COMMUN));
        collegeService.save(new College("333","333","333","333", OwnerShip.GOVEM));

        periodService.save(new Period("111-111"));
        periodService.save(new Period("222-222"));*/
    }

    /* @Bean
    public DataSource dataSource() {
        final EmbeddedDatabaseBuilder embeddedDatabaseBuilder = new EmbeddedDatabaseBuilder();
        embeddedDatabaseBuilder.setType(EmbeddedDatabaseType.H2);
        return embeddedDatabaseBuilder.build();
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
        final HibernateJpaVendorAdapter jpaVendorAdapter = new HibernateJpaVendorAdapter();
        jpaVendorAdapter.setDatabase(Database.H2);
        jpaVendorAdapter.setGenerateDdl(true);

        final LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
        localContainerEntityManagerFactoryBean.setJpaVendorAdapter(jpaVendorAdapter);
        localContainerEntityManagerFactoryBean.setPackagesToScan(getClass().getPackage().getName());
        localContainerEntityManagerFactoryBean.setDataSource(dataSource());

        return localContainerEntityManagerFactoryBean;
    }*/
//--------------another config datasource H2--------------------
    /*
    @Bean
    public DataSource dataSource() {
        return new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.H2).build();
    }

    @Bean
    public JpaVendorAdapter jpaVendorAdapter() {
        HibernateJpaVendorAdapter bean = new HibernateJpaVendorAdapter();
        bean.setDatabase(Database.H2);
        bean.setGenerateDdl(true);
        bean.setShowSql(true);
        return bean;
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource,
                                                                       JpaVendorAdapter jpaVendorAdapter) {
        LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
        bean.setDataSource(dataSource);
        bean.setJpaVendorAdapter(jpaVendorAdapter);
        bean.setPackagesToScan("jcg.zheng.demo.jpademo");
        return bean;
    }

    @Bean
    public JpaTransactionManager transactionManager(EntityManagerFactory emf) {
        return new JpaTransactionManager(emf);
    }*/
}
