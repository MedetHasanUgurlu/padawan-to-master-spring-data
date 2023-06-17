# MASTERING SPRING DATA

* **JPA**: facilitate orm to manage relational data in java application. ıt provıdes platform to work directly with an object instead of using SQL statements.\
  **_Jpa Implementation_**: _hibernate, eclipselink, toplınk, mybatis._
* Spring Data Jpa uses EntityManager and TypedQuery

Repository <---------->    EntityManager

flush()     ------>     flush()

save(S)     ------>     persist(), merge()

delete(T)   ------>     remove(), merge(), contains()

findOne(ID) ------>     find()

* Spring Data JPA ---> JPA ---> HIBERNATE(JDBC) ----> DB